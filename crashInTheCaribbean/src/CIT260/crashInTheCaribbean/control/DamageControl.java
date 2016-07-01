/*

 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.exceptions.DamageControlException;

/**
 *
 * @author josecovarrubias
 */

public class DamageControl {
    public double damage(double beastInt,double beastPow)
                            throws DamageControlException {
        
        if (beastInt <0 || beastInt >5){//Int too high
        throws new DamageControlException();
        
        }
        if (beastPow <0 || beastPow >5){//Pow too high
        throws new DamageControlException();
        
        }
          double totalDam = Math.pow(beastInt, beastPow);
         return  totalDam;
    
    } 



}
