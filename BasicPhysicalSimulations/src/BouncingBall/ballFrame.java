package BouncingBall;
import java.awt.*;
public class ballFrame extends JFrame {
    ballFrame(){
        this.add(new bouncingPanel());
        this.setTitle("Physical Simulator");
        this.setResizable(false);

    }
}
