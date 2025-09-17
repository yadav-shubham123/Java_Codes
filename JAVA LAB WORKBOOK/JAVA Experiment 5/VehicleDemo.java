import java.util.Scanner;

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SHUBHAM YADAV, 24CSU309");
        System.out.println("Enter number of tyres: ");
        int N = sc.nextInt();
        Vehicle v;
        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }
        v.display();
        sc.close();
    }
}