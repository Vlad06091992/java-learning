package inheritance_and_polymorphism.HW4;

abstract public class EmployeeBase implements Comparable<Employee>, Employee {

    private double monthSalary;
    protected String employeeType;

    @Override
    public int compareTo(Employee o) {

        double thisGetMonthSalary = this.getMonthSalary();
        double otherGetMonthSalary = o.getMonthSalary();

        return Double.compare(thisGetMonthSalary, otherGetMonthSalary);
    }

    @Override
    public double getMonthSalary() {
        return this.monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public String getEmployeeTypy(){
        return this.employeeType;
    };

}
