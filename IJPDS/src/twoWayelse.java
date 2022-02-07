// This is going to be an example of the nature of running if statements efficiently.
// Omitting else (tab) if, enables you to save on real estate, and make your code more readable.
public class twoWayelse {
    public static void main(String[] args) {
        twoWayelse testing = new twoWayelse();
        testing.ifwithTabs(78);
        testing.ifEfficient(78);
        testing.upsideDown(94);
    }

    public void ifwithTabs(int score) {
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }

    // As you know, if else avoids a lot of unnecessary indentations, as well as line breaks.
    // This results in a program that is much more compact, yet also easier to read.
    public void ifEfficient(int score) {
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }

    // This will run perfectly, but fail to produce the desired result, as a result of the else statements
    // never being invoked.
    public void upsideDown(int score) {
        if (score >= 60)
            System.out.println("D");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 80)
            System.out.println("B");
        else
            System.out.println("A");
    }
}
