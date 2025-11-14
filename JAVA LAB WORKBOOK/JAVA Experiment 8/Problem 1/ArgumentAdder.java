public class ArgumentAdder {

    public static void main(String[] args) {

        try {
            if (args.length < 5) {
                System.out.println("Shubham Yadav, 24CSU309");
                throw new CheckArgumentException("Error: You must provide at least five integer arguments.");
            }

            int sum = 0;
            System.out.println("Processing the first five arguments...");

            for (int i = 0; i < 5; i++) {
                int num = Integer.parseInt(args[i]);
                System.out.println("Adding: " + num);

                sum += num;
            }

            System.out.println("The total sum of the first five numbers is: " + sum);

        } catch (CheckArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println("Usage: java ArgumentAdder <num1> <num2> <num3> <num4> <num5>");
        } catch (NumberFormatException e) {
            System.err.println("Error: An argument was not a valid integer.");
            System.err.println("Details: " + e.getMessage());
        }
    }
}
