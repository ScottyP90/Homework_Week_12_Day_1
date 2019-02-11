import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    Employee employee;

    @Before

    public void before() {
        employee = new DatabaseAdmin("Mike", 189021,2050.00);
    }

    @Test
    public void getEmployeeName() {
        assertEquals("Mike", employee.getName());
    }

    @Test
    public void getEmployeeNINumber() {
        assertEquals(189021, employee.getNINumber());
    }

    @Test
    public void getEmployeeSalary() {
        assertEquals(2050.00, employee.getSalary(), 1.00);
    }


}
