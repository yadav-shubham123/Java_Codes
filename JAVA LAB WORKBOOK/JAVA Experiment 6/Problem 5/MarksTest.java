public class MarksTest {
    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("--- Problem 5 Demonstration ---");

        Marks studentA = new A(90, 85, 92);

        Marks studentB = new B(88, 95, 78, 90);

        System.out.printf("Percentage for Student A: %.2f%%\n", studentA.getPercentage());
        System.out.printf("Percentage for Student B: %.2f%%\n", studentB.getPercentage());
        System.out.println("---------------------------------");
    }
}
