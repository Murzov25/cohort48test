package employee_company.test;


import employee_company.dao.Company;
import employee_company.dao.CompanyImpl;
import employee_company.model.Employee;
import employee_company.model.Manager;
import employee_company.model.SalesManager;
import employee_company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company; // object
    Employee[] firma;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);

        firma = new Employee[5]; // create array of objects type Employee

        firma[0] = new Manager(1000, "Bill", "Smith", 160, 5000, 5);
        firma[1] = new Worker(2000, "Anne", "Muller", 160, 15);
        firma[2] = new SalesManager(3000, "Peter", "Jackson", 160, 19000, 0.1);
        firma[3] = new SalesManager(4000, "Robin", "Good", 80, 20000, 0.1);

        //TODO не забыть добавить объекты после написания метода addEmployee
        for (int i = 0; i < firma.length; i++) {
            company.addEmployee(firma[i]);
        }

    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null)); // add null
        assertFalse(company.addEmployee(firma[0])); //try to add duplicate
        Employee employee = new SalesManager(5000, "Mikhael", "Shumaher", 160, 20000, 0.1);
        assertTrue(company.addEmployee(employee)); // add one more
        assertEquals(5, company.quantity()); // check
        employee = new SalesManager(6000, "Nik", "Shumaher", 160, 20000, 0.1);
        assertFalse(company.addEmployee(employee)); // oversize company
    }

    @Test
    void findEmployee() {
        // find
        assertEquals(firma[1], company.findEmployee(2000));
        // find absent
        assertNull(company.findEmployee(5000));

    }

    @Test
    void updateEmployee() {

    }

    @Test
    void revoveEmployee() {
        Employee employeeVictim = company.revoveEmployee(3000);
        assertEquals(firma[2], employeeVictim);
        assertEquals(3, company.quantity());
        assertNull(company.revoveEmployee(3000));
    }

    @Test
    void printEmployee() {
        company.printEmployee();
    }

    @Test
    void quantity() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalary() {
    }

    @Test
    void totalSales() {
    }
}

