/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import.org.junit.Test
import static org.junit.Assert.*;
/**
 *
 * @author josecovarrubias
 */
public class InventoryControl {
    
}

/**
 *
 * @author thomas evon
 */
public class VolumeOfTrapTest {
    
    public VolumeOfTrap(){   
   }
    /**
     * Test of volume method, of class DamageControl.
     */
    @Test
    public void testVolume() {
        System.out.println("volume");
        
        /**********************************
        *   Test case #1, the valid result
        **********************************/
        System.out.println("\tTest case #1 the valid result.");
    
        double bucketRadius = 5.0;
        double bucketHeight = 12.74;
        double PI = 3.14;
        double cubicFeet = 1000;
        double gallonsOfWater = 7480.52;
        VolumeControl instance = new VolumeControl();
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
      
}

    {
        /**********************************
        *   Test case #2  invalid
        **********************************/
        System.out.println("\tTest case #2  radius is negative");
        
        double bucketRadius = -3;
        double bucketHeight = 11;
        double PI = 3.14;
        double cubicFeet = 0;
        double gallonsOfWater = 0;
        VolumeControl instance = new VolumeControl();
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
    }
    
    {
        /**********************************
        *   Test case #3  invalid 
        **********************************/
        System.out.println("\tTest case #3 height is negative");
        
        double bucketRadius = 15;
        double bucketHeight = -2;
        double PI = 3.14;
        double cubicFeet = 0;
        double gallonsOfWater = 0;
        VolumeControl instance = new VolumeControl();
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
    }
    
    {
        /**********************************
        *   Test case #4
        **********************************/
        System.out.println("\tTest case #4 radius is too high");
        
        double bucketRadius = 15;
        double bucketHeight = 3;
        double PI = 3.14;
        double cubicFeet = 2120.58;
        double gallonsOfWater = 15863.04;
        VolumeControl instance = new VolumeControl();
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
    }
   {
            
        System.out.println("\tTest Case #5 Trap Test");
        double bucketRadius = 10.0;
        double PI = 3.14;
        double bucketHeight = 0.0;
        VolumeControl instance = new VolumeControl();
        double expResult = 0.0;
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
    }
   {
            
        System.out.println("\tTest Case #6 Trap Test");
        double bucketRadius = 0;
        double PI = 3.14;
        double bucketHeight = 32;
        VolumeControl instance = new VolumeControl();
        double expResult = 0.0;
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
    }
   
   {
            
        System.out.println("\tTest Case #7 Trap Test");
        double bucketRadius = 7;
        double PI = 3.14;
        double bucketHeight = 9;
        VolumeControl instance = new VolumeControl();
        double expResult = 0.0;
        double result = instance.volume(bucketRadius, bucketHeight, PI);
        assertEquals(expResult, result, 0.0); 
    }