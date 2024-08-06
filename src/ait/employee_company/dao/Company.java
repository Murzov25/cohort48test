package employee_company.dao;

import classwork_24.employee_company.model.Employee;
import employee_company.model.Employee;

public interface Company {

    //only abstract methods for Employee and children
    //===================================

/*
    C - create
    R - read
    U - update
    D - delete
*/

    // нанимать - create
    boolean addEmployee(Employee employee); // boolean - отвечает за то, что удалось добавить или нет

    // искать в списке
    Employee findEmployee(int id);

    // обновлять данные
    Employee updateEmployee(Employee employee);

    //уволить (удалить)
    Employee revoveEmployee(int id);

    //напечатать
    void printEmployee();

    // кол-во сотрудников
    int quantity();

    // считать зарплату, оборот
    double totalSalary();
    // оборот, продажи
    double totalSales();

}

