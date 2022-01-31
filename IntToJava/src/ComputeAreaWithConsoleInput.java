import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args){
        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Prompting to enter Radius.
        System.out.println("Enter a number for the radius.");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display Results:
        System.out.println("The area of the circle is: " + area);
    }


}
