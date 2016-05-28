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
public class BuildControlTest {
    
    public BuildControlTest() {
    }

    /**
     * Test of build method, of class BuildControl.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        
        System.out.println("\tTest 1");
        double length = 10.0;
        double width = 10.0;
        double height = 3.0;
        BuildControl instance = new BuildControl();
        double expResult = 300.0;
        double result = instance.build(length, width, height);
        assertEquals(expResult, result, 0.0); 
    }
    {
    
        
        System.out.println("\tTest 2");
        double length = 10.0;
        double width = 10.0;
        double height = 5.0;
        BuildControl instance = new BuildControl();
        double expResult = 500.0;
        double result = instance.build(length, width, height);
        assertEquals(expResult, result, 0.0); 
    }
    {
    
        
        System.out.println("\tTest 3");
        double length = 12.0;
        double width = 8.0;
        double height = 2.0;
        BuildControl instance = new BuildControl();
        double expResult = 192.0;
        double result = instance.build(length, width, height);
        assertEquals(expResult, result, 0.0); 
    }
    {
            
        System.out.println("\tTest 4");
        double length = 8.0;
        double width = 6.0;
        double height = 1.0;
        BuildControl instance = new BuildControl();
        double expResult = 48.0;
        double result = instance.build(length, width, height);
        assertEquals(expResult, result, 0.0); 
    }
    
    
//    // this was an attempt to create another function that belongs to the buildControl Class.
//    public void testTrap(){
//        System.out.println("\tTest 1 for trap");
//        double radius = 10.0;
//        double height = 10.0;
//        BuildControl instance = new BuildControl();
//        double expResult = 3141.59;
//        double result = instance.build(radius, height);
//        assertEquals(expResult, result, 0.0);
//    
//    }
}
