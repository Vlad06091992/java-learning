package inheritance_and_polymorphism.HW4;

import java.util.ArrayList;

public class Company {
    protected double revenue;
    protected double managerSalary;
    protected double topManagerSalary;
    protected double operatorSalary;

    Company(double revenue,double managerSalary, double topManagerSalary, double operatorSalary){
        this.managerSalary =  managerSalary;
        this.revenue =  revenue;
        this.topManagerSalary =  topManagerSalary;
        this.operatorSalary =  operatorSalary;

    }
}
