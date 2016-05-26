/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josecovarrubias
 */
public class DamageControlTest {
    
    public DamageControlTest() {
    }

    /**
     * Test of damage method, of class DamageControl.
     */
    @Test
    public void testDamage() {
        System.out.println("damage");
        
        /**********************************
        *   Test case #1, the valid result
        **********************************/
        System.out.println("\tTest case #1 the valid result.");
        
        double beastInt = 4.0;
        double beastPow = 5.0;
        double expResult = 1024.0;
        DamageControl instance = new DamageControl();
        double result = instance.damage(beastInt, beastPow);
        assertEquals(expResult, result, 0.0);
       
        fail("The test case is a prototype.");
    }
    
}
