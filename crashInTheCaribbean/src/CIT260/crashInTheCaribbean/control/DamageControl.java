/*

 */
package CIT260.crashInTheCaribbean.control;

/**
 *
 * @author josecovarrubias
 */

public class DamageControl {
    public double damage(double beastInt,double beastPow){
        
        if (beastInt <0 || beastInt >5){//Int too high
        return -1;
        }
        if (beastPow <0 || beastPow >5){//Pow too high
        return -1;
        }
         double totalDam = Math.pow(beastInt, beastPow);
         return totalDam;
    
    } 
}
