/*

 */
package CIT260.crashInTheCaribbean.control;

/**
 *
 * @author josecovarrubias
 */

public class DamageControl {
    public double damage(double beastInt,double beastPow){
        
        if (beastInt !=4){//Int too high
        return 0;
        }
        if (beastPow !=5){//Pow too high
        return 0;
        }
         double totalDam = Math.pow(beastInt, beastPow);
         return totalDam;
    
    } 
}
