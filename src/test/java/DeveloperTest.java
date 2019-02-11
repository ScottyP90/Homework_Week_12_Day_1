import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Employee employee;

    @Before

    public void before() {
        employee = new Developer("Mack", 798010,2075.00);
    }

    @Test
    public void getEmployeeName() {
        assertEquals("Mack", employee.getName());
    }

    @Test
    public void getEmployeeNINumber() {
        assertEquals(798010, employee.getNINumber());
    }

    @Test
    public void getEmployeeSalary() {
        assertEquals(2075.00, employee.getSalary(), 1.00);
    }
}
