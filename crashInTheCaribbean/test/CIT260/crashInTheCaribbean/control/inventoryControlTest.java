/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class inventoryControlTest {
    
    public inventoryControlTest() {
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
     * Test of volumeOfTrap method, of class inventoryControl.
     */
    @Test
    public void testVolumeOfTrap() {
        System.out.println("volumeOfTrap");
        double bucketRadius = 0.0;
        double bucketHeight = 0.0;
        double PI = 0.0;
        inventoryControl instance = new inventoryControl();
        double expResult = 0.0;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
