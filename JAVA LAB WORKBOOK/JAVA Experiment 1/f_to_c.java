import java.util.Scanner;

public class f_to_c {
    public static void main(String args[]) {
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("Enter the value in fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("temp in celsius is: " + c);
        scan.close();
    }
}