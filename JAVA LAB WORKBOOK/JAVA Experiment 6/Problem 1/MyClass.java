class MyClass extends SuperClass implements InterfaceB, InterfaceC {

    @Override
    public void methodA() {
        System.out.println("Implemented methodA from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Implemented methodB from InterfaceB");
    }

    @Override
    public void methodC() {
        System.out.println("Implemented methodC from InterfaceC");
    }

    public void displayMyClass() {
        System.out.println("This is MyClass.");
    }
}