import java.util.Scanner;

public class Pointapp {
    public static void main(String[] args) {
        System.out.println("Java PointApp \nShubham Yadav, 24CSU309");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 coordinate: ");
        float x1 = sc.nextFloat();
        System.out.print("Enter y1 coordinate: ");
        float y1 = sc.nextFloat();
        System.out.print("Enter x2 coordinate: ");
        float x2 = sc.nextFloat();
        System.out.print("Enter y2 coordinate: ");
        float y2 = sc.nextFloat();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        System.out.println("Point 1: ");
        p1.display();
        System.out.println("Point 2: ");
        p2.display();
        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between two points = %7.2f\n", dist);
        sc.close();
    }
}
