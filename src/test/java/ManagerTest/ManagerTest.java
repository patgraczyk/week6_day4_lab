package ManagerTest;

import Manager.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

Manager manager;

@Before
public void before(){
    manager = new Manager("accounts", "Dave", 20202, 500);
}

@Test
public void hasName(){
   assertEquals("Dave", manager.getName());
}

@Test
public void hasNin(){
    assertEquals(20202, manager.getNin());
    }

@Test
public void hasSalary(){
    assertEquals( 500, manager.getSalary(), 0);
}


@Test
    public void getRaise(){
    assertEquals(599.99, manager.raiseSalary(99.99),0);
}

@Test
    public void getBonus(){
    assertEquals(505.0, manager.payBonus(),0);
}
}
