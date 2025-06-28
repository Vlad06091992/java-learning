package inheritance_and_polymorphism.HW4;

public class TopManager extends EmployeeBase {
    TopManager(Company company) {
        this.employeeType = "TopManager";
        this.setMonthSalary(company.topManagerSalary + (company.revenue > 100000.0 ? company.topManagerSalary * 1.5 : 0));
    }
}
