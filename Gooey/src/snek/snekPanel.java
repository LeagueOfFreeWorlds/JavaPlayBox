package snek;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
/*
 * Good reminder:
 * The super keyword refers to the superclass (parent) of the object. In paintComponent() for instance, it's referring to the parent class of the object, which is...
 * snekPanel. So paintComponent is referring to our java panel!
 * The super class is very similar to the 'this' function, in that 'this' tells java that we're referring to a component in the parent class. 
 * */
public class snekPanel extends JPanel implements ActionListener{
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25; // essentially how large do you want the components in the game to be?
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE; // we calculate how many objects we can put on the display.
	static final int DELAY = 100; // how fast do we want to run our game (in milliseconds delay)? 
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6;
	int applesEaten = 0;
	int appleX;
	int appleY;
	boolean running = false;
	char direction = 'R';
	Timer timer;
	Random random; 
	snekPanel(){ // constructor.
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	public void startGame() { // function intended for executing the game.
		newApple();
		running = true;
		timer = new Timer(DELAY, this); // Timer constructor - passing timer delay + the actionListener of the class (this). 
		timer.start(); // starting the timer
	}
	public void paintComponent(Graphics g) { // creates a paint frame for the panel that will display our game.
		super.paintComponent(g); // overriding the method to pass the paint panel directly to the frame. See comment above for more info.
		draw(g);
	}
	public void draw(Graphics g) {
		/*
		 * 	Remember that drawLine wants two starting x and y coordinates, and two ending x and y coordinates.
		 * So essentially, for longitudinal, we're starting with the top of the screen, and getting to the bottom of the screen, with every increment being
		 * the ratio of screen_height/unit_size. So a new longitudinal line is being drawn every 25 pixels, where UNIT_SIZE = 25;
		 * The same is being done for latitudinal lines. where starting x is 0, and ending x is the length of the screen's width in pixels.
		 * There should be 24 lines in total, since screen_height/unit_size = 24. 
		 */
		if(running) {
			for(int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) { // we want to draw a matrix grid for our panel.
				g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
			}
		/*
		 * We now tell the graphics panel to add our apple to the screen. Everytime the screen reloads, the apple will be in a new random spot. 
		 */
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
		
			for(int i = 0; i < bodyParts; i++) {
				if(i == 0) {
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				} 
				else {
					g.setColor(new Color(45, 180, 0));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			}
			g.setColor(Color.red);
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score:" + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score:" + applesEaten))/2, g.getFont().getSize());
		} 
		else {
			gameOver(g);
		}
		
	}
	
	public void newApple() {
		/*
		 * We multiply by UNIT_SIZE because we want the apple to fit within the boundaries of the gridlines, which are 25 pixels by 25 pixels.
		 */
		appleX = random.nextInt((int)(SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
	}
	public void move() {
		for(int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1]; // we subtract 1 from i because we are basically shifting everything in the array over by 1 (the snake body, that is).
			y[i] = y[i - 1]; 
		}
		/*
		 * To make this clear, whenever the 'UP' arrow is pressed, the snake will move by 1 unit size, which is 25 pixels.
		 */
		switch(direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
		
	}
	public void checkApple() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			newApple();
			bodyParts++;
			applesEaten++;
		}
	}
	public void checkCollisions() {
		// Checks if head collides with body.
		for(int i = bodyParts; i > 0; i--) {
			if((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
			// checks if head touches left border:
			if(x[0] < 0) {
				running = false;
			}
			// checks if head touches right border:
			if(x[0] > SCREEN_WIDTH) {
				running = false;
			}
			// checks if head touches top brdr
			if(y[0] < 0) {
				running = false;
			}
			// checks if head touches btm brdr
			if(y[0] > SCREEN_HEIGHT) {
				running = false;
			}
			if(!running) {
				timer.stop();
			}
			
				
		}
	}
	public void gameOver(Graphics g) {
		// Game over screen
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 75));
		FontMetrics metrics = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
		/// Score metrics: ///
		g.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metricScore = getFontMetrics(g.getFont());
		g.drawString("Score:" + applesEaten, (SCREEN_WIDTH - metricScore.stringWidth("Score:" + applesEaten))/2, g.getFont().getSize());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
			
		}
		repaint();
	}
	public class MyKeyAdapter extends KeyAdapter{
		@Override // overriding method
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}
}
