import java.util.Scanner;

class integer {
    public static void main(String args[]) {

        int num;
        int reverse = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("Enter the Integer: ");

        num = scan.nextInt();

        int temp = num;

        while (num != 0) {
            int digit = num % 10;

            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        while (temp != 0) {

            int value = temp % 10;
            sum = sum + value;
            temp = temp / 10;
        }
        System.out.println("Reverse of the Integer is: " + reverse);
        System.out.println("Sum of the digits of the Integer is: " + sum);
        scan.close();
    }
}