/*

 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.exceptions.DamageControlException;

/**
 *
 * @author josecovarrubias
 */

public class DamageControl {
    public int damage(double beastInt,double beastPow)
                            throws DamageControlException {
        
        if (beastInt <0 || beastInt >5){//Int too high
        return -1;
        }
        if (beastPow <0 || beastPow >5){//Pow too high
        return -1;
        }
         double totalDam = Math.pow(beastInt, beastPow);
         throw new DamageControlException("whatever text you want");
    
    } 
 
}
