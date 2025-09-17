import java.util.Scanner;

public class SumOfDigits {

    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);

        sc.close();
    }
}
