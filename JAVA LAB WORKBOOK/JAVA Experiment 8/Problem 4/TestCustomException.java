public class TestCustomException {

    public static void checkInput(String input) throws CustomException {

        if (input.equalsIgnoreCase("danger")) {
            throw new CustomException("Danger was detected!");
        }
        System.out.println("Input '" + input + "' is safe.");
    }

    public static void main(String[] args) {

        try {
            System.out.println("Shubham Yadav, 24CSU309");
            System.out.println("Test 1: Safe input ");
            checkInput("safe");

            System.out.println("\nTest 2: Danger input ");
            checkInput("danger");

            System.out.println("This will not print.");

        } catch (CustomException e) {
            System.err.println("An error occurred!");

            e.printStoredString();

            System.err.println("Standard getMessage() -> " + e.getMessage());
        }
    }
}
