/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eng_a
 */
public class PeopleCounterTest {
    
    public PeopleCounterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of incrementCount method, of class PeopleCounter.
     */
    @Test
    public void testIncrementCount() {
        System.out.println("incrementCount");
        PeopleCounter instance = new PeopleCounter();
        instance.incrementCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetCount method, of class PeopleCounter.
     */
    @Test
    public void testResetCount() {
        System.out.println("resetCount");
        PeopleCounter instance = new PeopleCounter();
        instance.resetCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCount method, of class PeopleCounter.
     */
    @Test
    public void testPrintCount() {
        System.out.println("printCount");
        PeopleCounter instance = new PeopleCounter();
        instance.printCount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class PeopleCounter.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        PeopleCounter instance = new PeopleCounter();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
