class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id); // call parent constructor
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}