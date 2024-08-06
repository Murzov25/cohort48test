package employee_company.dao;

import employee_company.model.Employee;

public class CompanyImpl implements Company {

    private Employee[] employees; // array for objects
    private int size; // current size of array

    //constructor
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // this. - не обязательно
        // this.size = 0;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if(employee == null){
            return false;
        }
        if(employees.length == size){
            return false;
        }
        if(findEmployee(employee.getId()) != null){
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee revoveEmployee(int id) {
        return null;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println( employees[i] );
        }
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }
}

