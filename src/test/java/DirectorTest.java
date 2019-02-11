import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before

    public void before() {
        director = new Director("John", 990120, 3500.00, "IT", 5000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("John", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(990120, director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals( 3500.00, director.getSalary(),1.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void name() {
        assertEquals(5000.00, director.getBudget(),1.00);
    }

    @Test
    public void canIncreaseSalary() {
        assertEquals(3600.00, director.raiseSalary(100.00), 1.00);
    }

    @Test
    public void canGetBonusPay() {
        assertEquals(70.00, director.payBonus(),1.00);
    }

    @Test
    public void canChangeDirectorsName() {
        director.changeName("Jake");
        assertEquals("Jake", director.getName());
    }

    @Test
    public void canNotChangeDirectorsName() {
        director.changeName(null);
        assertEquals("John", director.getName());
    }
}
