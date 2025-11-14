public class ExceptionHierarchy {

    public static void main(String[] args) {

        System.out.println("SHUBHAM YADAV, 24CSU309");
        A a = new C();

        System.out.println("Calling method() on an 'A' reference that points to a 'C' object...");

        try {
            a.method();

        } catch (Level3Exception e) {
            System.out.println("Caught Level 3 Exception (most specific): " + e.getMessage());
        } catch (Level2Exception e) {
            System.out.println("Caught Level 2 Exception: " + e.getMessage());
        } catch (Level1Exception e) {

            System.out.println("Caught Level 1 Exception (base): " + e.getMessage());
        }
    }
}
