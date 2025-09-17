import java.util.Scanner;

class Students {
    String name;
    int roll_no;

    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        Scanner sc = new Scanner(System.in);

        Students s = new Students();
        System.out.print("Enter name: ");
        s.name = sc.nextLine();
        System.out.print("Enter roll number: ");
        s.roll_no = sc.nextInt();

        System.out.println("Name: " + s.name + ", Roll No: " + s.roll_no);
        sc.close();
    }
}
