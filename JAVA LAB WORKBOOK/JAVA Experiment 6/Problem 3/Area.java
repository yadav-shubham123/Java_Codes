public class Area extends Shape {

    @Override
    public void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f\n", area);
    }

    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("--- Problem 3 Demonstration ---");

        Area shapeCalculator = new Area();

        shapeCalculator.RectangleArea(10, 5);
        shapeCalculator.SquareArea(7);
        shapeCalculator.CircleArea(4.5);
        System.out.println("---------------------------------");
    }
}
