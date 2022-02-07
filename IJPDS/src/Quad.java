import java.lang.Math;
import java.util.Scanner;
public class Quad {
    public static void main(String[] args) {
        Quad quad = new Quad();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quadratic values a, b, and c, for your quadratic equation.");
        System.out.println("ax^2 + bx + c:\t");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println(quad.quadratic(a, b, c));
    }
    public double quadratic(double a, double b, double c){
        double squaredValue = Math.pow((Math.pow(b, 2) - (4 * a * c)), 0.5);
        double quadFunc = (-b * squaredValue) / 2 * a;
        return quadFunc;
    }
}
