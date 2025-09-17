import java.util.Scanner;

public class forloop{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter a number");
   Scanner scan = new Scanner(System.in);
   a = scan.nextInt();

   for(int i=0;i<=10;i++)
   {
    System.out.println(a + " X " + i + " = " + (a*i));
     scan.close();
   }
    }
}

