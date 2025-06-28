package inheritance_and_polymorphism.HW4;

public class Operator extends EmployeeBase {
    Operator(Company company) {
        this.employeeType = "Operator";
        this.setMonthSalary(company.operatorSalary);
    }
}