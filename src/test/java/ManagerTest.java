import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before

    public void before() {
        manager = new Manager("Scotty", 88012, 3020.00, "Coding");
    }

    @Test
    public void canGetName() {
        assertEquals("Scotty", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(88012, manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals( 3020.00, manager.getSalary(),1.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Coding", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary() {
        assertEquals(3100.00, manager.raiseSalary(80.00), 1.00);
    }

    @Test
    public void canGetBonusPay() {
        assertEquals(30.00, manager.payBonus(),1.00);
    }
}
