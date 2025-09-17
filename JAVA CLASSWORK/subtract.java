import java.util.Scanner;

class subtract
{
  public static void main(String args[])
  {
   int a, b, sub;
   System.out.println("Shubham Yadav, 24CSU309");
   System.out.println("Enter two numbers");
   Scanner scan = new Scanner(System.in);
   a = scan.nextInt();

   b = scan.nextInt();
   sub = a - b;
   System.out.println("subtract of a and b is " + sub + " Program End");
    scan.close();
   }
}