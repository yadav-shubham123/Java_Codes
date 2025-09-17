public class callstackexample {
    public static void D() {
        float d = 40.5f;
        System.out.println("In method D");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In method C");

    }

    public static void B() {
        int b = 20;
        System.out.println("In method B");
        C();
    }

    public static void A() {
        short a = 10;
        System.out.println("In method A");
        B();
    }

    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        A();
        D();
        System.out.println("Program End");

    }
}
