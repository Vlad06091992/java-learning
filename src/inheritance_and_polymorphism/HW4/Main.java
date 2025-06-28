package inheritance_and_polymorphism.HW4;

public class Main {
    public static void main(String[] args) {
        EmployeeSalaryStats example = new EmployeeSalaryStats();
        example.addAllEmployees();
        System.out.println("Топовые зарплаты ----------------------------------------------");
        example.getTopSalaryStaff(10);
        System.out.println("Малые зарплаты ----------------------------------------------");
        example.getLowestSalaryStaff(10);
    }
}
