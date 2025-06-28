package inheritance_and_polymorphism.HW4;

/*
 *зарплата менеджеров по продажи складывается из 5 процентов от заработанных им компанией денег
 * у топ менеджеров
 *
 */

public class Manager extends EmployeeBase {

    public Manager(Company company, double earnedMoneyAmoutn) {
        this.employeeType = "Manager";
        this.setMonthSalary(Salary.Manager.gitFixedSalary() + (earnedMoneyAmoutn * 0.05));
    }
}
