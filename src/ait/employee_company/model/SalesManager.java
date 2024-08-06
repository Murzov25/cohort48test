package employee_company.model;

import employee_company.model.Employee;

public class SalesManager extends Employee {

    private double salesValue;
    private double percent;

    public SalesManager(int id, String firstName, String lastName, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double salary() {
        double salary = percent * salesValue;
        return ensureSalary(salary);
    }
}

