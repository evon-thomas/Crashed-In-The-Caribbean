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
 * @author thomas
 */
public class ShipConstructionTimeTest {
    
   public ShipConstructionTest() {
}

    /**
     * Test of construction time, of class ShipControl.
     */
    @Test
    public void ShipConstruction() {
        System.out.println("Cubic Feet");
        
        /**********************************
        *   Test case #1, the valid result
        **********************************/
        System.out.println("\tTest case #1 the valid result.");
        
        double shipLength = 10;
        double shipWidth = 10;
        double shipHeight = 3;
        double cubicFeet = 300;
        ShipControl instance = new ShipControl();
        double result = instance.ship(shipLength, shipWidth, shipHeight);
        assertEquals(expResult, result, 0.0); 
    }
    
    {
        /**********************************
        *   Test case #2
        **********************************/
        System.out.println("\tTest case #2 height is too big");
        
        double shipLength = 10;
        double shipWidth = 10;
        double shipHeight = 5;
        double cubicFeet = 500;
        ShipControl instance = new ShipControl();
        double result = instance.ship(shipLength, shipWidth, shipHeight);
        assertEquals(expResult, result, 0.0); 
    }
    
    {
        /**********************************
        *   Test case #3
        **********************************/
        System.out.println("\tTest case #3 width is too small");
        
        double shipLength = 12;
        double shipWidth = 8;
        double shipHeight = 2;
        double cubicFeet = 192;
        ShipControl instance = new ShipControl();
        double result = instance.ship(shipLength, shipWidth, shipHeight);
        assertEquals(expResult, result, 0.0); 
    }
    
    {
        /**********************************
        *   Test case #4
        **********************************/
        System.out.println("\tTest case #4 width is negative");
        
        double shipLength = 24;
        double shipWidth = -6;
        double shipHeight = 3;
        double cubicFeet = -432;
        ShipControl instance = new ShipControl();
        double result = instance.ship(shipLength, shipWidth, shipHeight);
        assertEquals(expResult, result, 0.0); 
    }