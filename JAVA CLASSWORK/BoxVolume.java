import java.util.Scanner;

public class BoxVolume {
    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the box: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the box: ");
        double width = sc.nextDouble();

        System.out.print("Enter height of the box: ");
        double height = sc.nextDouble();

        double volume = length * width * height;
        System.out.println("Volume of the box with length " + length + ", width " + width + ", and height " + height
                + " is: " + volume);
        sc.close();
    }
}
