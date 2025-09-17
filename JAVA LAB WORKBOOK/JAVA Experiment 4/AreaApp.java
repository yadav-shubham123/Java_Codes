import java.util.Scanner;

public class AreaApp {
    public static void main(String[] args) {
        System.out.println("Java AreaApp \nShubham Yadav, 24CSU309");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        Area rect = new Area(l, b);
        System.out.println("Area: " + rect.returnArea());
        sc.close();
    }
}
