public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Shubham Yadav, 24CSU309");
        System.out.println("--- Problem 1 Demonstration ---");

        MyClass obj = new MyClass();

        System.out.println("\nTesting Part 1a:");
        obj.displaySuper();
        obj.displayMyClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();

        System.out.println("\nTesting Part 1b & 1c:");
        class DemoImpl implements MultiExtendedInterface {
            @Override
            public void methodA() {
            }

            @Override
            public void methodB() {
            }

            @Override
            public void methodC() {
            }

            @Override
            public void methodD() {
                System.out.println("Implemented methodD from MultiExtendedInterface");
            }
        }

        DemoImpl demoObj = new DemoImpl();
        demoObj.methodD();
        System.out.println("Interfaces InterfaceB and MultiExtendedInterface exist, proving 1b and 1c.");
        System.out.println("---------------------------------");
    }
}
