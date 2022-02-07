// ISBN Consists of 10 digits. The last digit is a checksum, which is calculated from the other
// 9 digits from the formula below:
// (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11 = d10
import java.util.Scanner;
public class ISBNCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of your ISBN:\t");
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();
        int d3 = scan.nextInt();
        int d4 = scan.nextInt();
        int d5 = scan.nextInt();
        int d6 = scan.nextInt();
        int d7 = scan.nextInt();
        int d8 = scan.nextInt();
        int d9 = scan.nextInt();
        int isbnten = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11;
        System.out.println("The ISBN-10 Number is:\t" + isbnten);
    }
}
