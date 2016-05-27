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
    }
    
    {
        /**********************************
        *   Test case #2
        **********************************/
        System.out.println("\tTest case #2");
        
        double beastInt = 3.0;
        double beastPow = 3.0;
        double expResult = 27.0;
        DamageControl instance = new DamageControl();
        double result = instance.damage(beastInt, beastPow);
        assertEquals(expResult, result, 0.0);  
    }
    
    {
        /**********************************
        *   Test case #3
        **********************************/
        System.out.println("\tTest case #3");
        
        double beastInt = 4.0;
        double beastPow = 2.0;
        double expResult = 16.0;
        DamageControl instance = new DamageControl();
        double result = instance.damage(beastInt, beastPow);
        assertEquals(expResult, result, 0.0);
    }
    {
        /**********************************
        *   Test case #4
        **********************************/
        System.out.println("\tTest case #4");
        
        double beastInt = 3.0;
        double beastPow = 5.0;
        double expResult = 243.0;
        DamageControl instance = new DamageControl();
        double result = instance.damage(beastInt, beastPow);
        assertEquals(expResult, result, 0.0);
    }
        {
        /**********************************
        *   Test case #5
        **********************************/
        System.out.println("\tTest case #5");
        
        double beastInt = 4.0;
        double beastPow = 1.0;
        double expResult = 4.0;
        DamageControl instance = new DamageControl();
        double result = instance.damage(beastInt, beastPow);
        assertEquals(expResult, result, 0.00);
    }
}
