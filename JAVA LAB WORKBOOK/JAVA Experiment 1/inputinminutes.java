import java.util.Scanner;

public class inputinminutes{
    public static void main(String args[])
    {
        System.out.println("Shubham Yadav, 24CSU309");
        int min,days, years, months;
        int left_days;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time in minutes");
        min=scan.nextInt();
        days=min/1440;
        years=days/365;
        left_days=days%365;
        months=left_days/30;
        System.out.println("Years: "+years);
        System.out.println("Months: "+months);
        System.out.println("Days: "+days);
        scan.close();
    }
}