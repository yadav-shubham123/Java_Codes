import java.util.Scanner;

public class sum_of_all_elements_of_array {
    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements in the array is: " + sum);
        System.out.println("Program End");
        sc.close();
    }
}
