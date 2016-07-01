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
        throw new DamageControlException("PRACTICE AGAIN, YOUR 1ST VALUE MUST BE BETWEEN 1-5");
        
        }
        if (beastPow <0 || beastPow >5){//Pow too high
        throw new DamageControlException("YOUR 2ND VALUE MUST BE BETWEEN 1-5");
        
        }
          double totalDam = Math.pow(beastInt, beastPow);
         return  totalDam;
    
    } 



}
