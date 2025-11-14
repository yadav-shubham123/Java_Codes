interface InterfaceA {
    void methodA();
}

interface InterfaceB extends InterfaceA {
    void methodB();
}

interface InterfaceC {
    void methodC();
}

interface MultiExtendedInterface extends InterfaceB, InterfaceC {
    void methodD();
}

class SuperClass {
    public void displaySuper() {
        System.out.println("This is the SuperClass.");
    }
}
