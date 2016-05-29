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
        double bucketRadius = 5.0;
        double bucketHeight = 12.0;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 942.00;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
    }
    {
        
        System.out.println("volumeOfTrap test 2 ");
        double bucketRadius = 8.0;
        double bucketHeight = 15.0;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 3014.4;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
    }
    {
        System.out.println("volumeOfTrap test 3 ");
        double bucketRadius = 2.0;
        double bucketHeight = 2.0;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 25.13;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
    }
    {
        System.out.println("volumeOfTrap test 4 ");
        double bucketRadius = 3;
        double bucketHeight = 3;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 84.82;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
}
{

        System.out.println("volumeOfTrap test 5 ");
        double bucketRadius = 4;
        double bucketHeight = 4;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 201.06;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
}

{
            System.out.println("volumeOfTrap test 6 ");
        double bucketRadius = 5;
        double bucketHeight = 5;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 392.7;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);

}

{

        System.out.println("volumeOfTrap test 7 ");
        double bucketRadius = 6;
        double bucketHeight = 6;
        double PI = 3.14;
        inventoryControl instance = new inventoryControl();
        double expResult = 678.58;
        double result = instance.volumeOfTrap(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0);
}
}

