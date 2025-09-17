import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        System.out.println("SHUBHAM YADAV, 24CSU309");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        sc.close();
    }
}