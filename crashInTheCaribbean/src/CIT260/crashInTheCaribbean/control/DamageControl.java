/*

 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.exceptions.DamageControlException;

/**
 *
 * @author josecovarrubias
 */

public class DamageControl {
    
    public double damage(double beastInt,double beastPow) throws DamageControlException {
        
        if (beastInt <0 || beastInt >5){//Int too high
        throw new DamageControlException("Enter a number between 1 and 5");
        
        }
        if (beastPow <0 || beastPow >5){//Pow too high
        throw new DamageControlException("only numbers between 1 and 5 are allowed");
        
        }
          double totalDam = Math.pow(beastInt, beastPow);
         return  totalDam;
    
    } 



}
