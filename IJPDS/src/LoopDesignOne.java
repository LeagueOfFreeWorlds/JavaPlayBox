import java.util.Scanner;
public class LoopDesignOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 101);
        int guess = -1;
        while(guess != number){
            System.out.println("Guess a magic number between 0 and 100!");
            guess = input.nextInt();
            if(guess == number){
                System.out.println("Congratulations! " + number + " is correct!");
            } else if (guess > number)
                System.out.println("Your guess is too high.");
              else
                System.out.println("Your guess is too low.");
        }
    }
}
