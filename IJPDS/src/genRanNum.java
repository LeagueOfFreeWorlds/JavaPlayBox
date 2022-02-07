import java.lang.Math;
import java.util.Scanner;
public class genRanNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        // if number1 < number2, swap number1 with number2.
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();
        if(number1 - number2 == answer){
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, your answer is wrong.");
            System.out.println("The answer should've been " + (number1 - number2));
        }
    }
}
