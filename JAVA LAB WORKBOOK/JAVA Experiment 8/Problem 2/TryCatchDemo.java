public class TryCatchDemo {

    public static void main(String[] args) {

        System.out.println("SHUBHAM YADAV, 24CSU309");

        try {
            System.out.println("Inside try block. Attempting to throw an exception...");

            throw new Exception("This is the custom message from the exception.");

        } catch (Exception e) {
            System.out.println("Inside catch block.");
            System.out.println("Caught message: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block. This message always appears.");
        }

    }
}
