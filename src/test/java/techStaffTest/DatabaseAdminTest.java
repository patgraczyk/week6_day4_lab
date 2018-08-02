package techStaffTest;

import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    Developer developer;
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        developer = new Developer("Devito", 456, 5678);
        databaseAdmin = new DatabaseAdmin("Philip", 123, 3434);
    }

    @Test
    public void hasName(){
        assertEquals("Devito", developer.getName());
        assertEquals("Philip", databaseAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(5678, developer.getSalary(), 0);
        assertEquals(3434, databaseAdmin.getSalary(), 0);
    }
    @Test
    public void hasNin(){
        assertEquals(456, developer.getNin());
        assertEquals(123, databaseAdmin.getNin());
    }
}
