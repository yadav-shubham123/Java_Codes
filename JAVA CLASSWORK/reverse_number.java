import java.util.Scanner;

public class reverse_number {

    public static void main(String args[]) {
        int n, reverse = 0;
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("Enter a number to reverse: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + reverse);
        scan.close();
    }
}