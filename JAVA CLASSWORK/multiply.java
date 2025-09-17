import java.util.Scanner;

class multiply
{
  public static void main(String args[])
  {
   int a, b, product;
   System.out.println("Shubham Yadav, 24CSU309");
   System.out.println("Enter two numbers");
   Scanner scan = new Scanner(System.in);
   a = scan.nextInt();

   b = scan.nextInt();
   product = a * b;
   System.out.println("product of a and b is " + product + " Program End");
    scan.close();
   }
}
  