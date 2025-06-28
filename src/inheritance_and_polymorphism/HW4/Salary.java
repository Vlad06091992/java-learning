package inheritance_and_polymorphism.HW4;

public enum Salary {
    Operator(30000),
    Manager(60000),
    TopManager(120000);

    private final int fixedSalary;

    Salary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int gitFixedSalary() {
        return this.fixedSalary;
    }

}
