public class MainTester {
    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("--- Problem 2 Demonstration ---");

        Circle circle = new Circle(5.0);
        System.out.println("Circle (radius=5.0):");
        System.out.printf("  Perimeter: %.2f\n", circle.getPerimeter());
        System.out.printf("  Area: %.2f\n", circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println("\nResizableCircle (radius=10.0):");
        System.out.printf("  Perimeter: %.2f\n", resizableCircle.getPerimeter());
        System.out.printf("  Area: %.2f\n", resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("\nAfter resizing to 50% (new radius=5.0):");
        System.out.printf("  Perimeter: %.2f\n", resizableCircle.getPerimeter());
        System.out.printf("  Area: %.2f\n", resizableCircle.getArea());
        System.out.println("---------------------------------");
    }
}
