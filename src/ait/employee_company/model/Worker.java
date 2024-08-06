package employee_company.model;

import employee_company.model.Employee;

public class Worker extends Employee {

    private double wage;

    public Worker(int id, String firstName, String lastName, double hours, double wage) {
        super(id, firstName, lastName, hours);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double salary() {
        double salary = wage * hours; // calculate salary
        // salary = ensureSalary(salary);
        return ensureSalary(salary); // check salary
    }
}

