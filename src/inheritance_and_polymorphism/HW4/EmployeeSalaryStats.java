package inheritance_and_polymorphism.HW4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class EmployeeSalaryStats {

    Company[] companies = new Company[1001];

    ArrayList<EmployeeBase> employees = new ArrayList<>();
    ArrayList<EmployeeBase> employeesReversed = new ArrayList<>();

    public int createRandomInteger(int from, int to) {
        int spread = to - from + 1;
        return from + (int)(Math.random() * spread);
    }


    public void createCompanies() {
        for (int i = 0; i < companies.length; i++) {
            companies[i] = new Company(
                    createRandomInteger(500000, 1500000),
                    createRandomInteger(30000, 100000),
                    createRandomInteger(100000, 250000),
                    createRandomInteger(20000, 100000)
            );
        }
    }

    public void createOperators() {
        for (int i = 0; i < 180; i++) {

            Operator operator = new Operator(companies[(int) createRandomInteger(0, 1000)]);

            employees.add(operator);
            employeesReversed.add(operator);
        }
    }


    public void createManagers() {
        for (int i = 0; i < 80; i++) {
            Manager manager = new Manager(companies[(int) createRandomInteger(0, 1000)], createRandomInteger(1000000, 2000000));
            employees.add(manager);
            employeesReversed.add(manager);
        }
    }

    public void createTopManagers() {
        for (int i = 0; i < 80; i++) {

            TopManager topManager = new TopManager(companies[(int) createRandomInteger(0, 1000)]);
            employees.add(topManager);
            employeesReversed.add(topManager);
        }
    }

    public void addAllEmployees() {
        createCompanies();
        createManagers();
        createTopManagers();
        createOperators();
        Collections.sort(employees);
    }

    public void getTopSalaryStaff(int count) {

        for (int i = employees.size() - 1; i >= employees.size() - count; i--) {

            EmployeeBase currEmployee = employees.get(i);

            System.out.println("Тип сотрудника " + currEmployee.employeeType + " "  +"Зарплата: " + currEmployee.getMonthSalary());
        }
    }

    public void getLowestSalaryStaff(int count) {

        for (int i = 0; i <= count; i++) {
            EmployeeBase currEmployee = employees.get(i);
            System.out.println("Тип сотрудника " + currEmployee.employeeType + " " + "Зарплата: " + currEmployee.getMonthSalary());
        }
    }

}
