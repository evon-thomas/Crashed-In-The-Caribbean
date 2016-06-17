/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;
// last commit

/**
 *
 * @author thomas
 */
public class BarrelControl {
    


    public double barrel(double radiusAmt,double heightAmt){
        
        if (radiusAmt <0 || radiusAmt >5){//Int too high
        return -1;
        }
        if (heightAmt <0 || heightAmt >12.75){//Pow too high
        return -1;
        }
         double totalDam = Math.pow(radiusAmt, 2) * heightAmt * Math.PI;
         return totalDam;
    
    } 

    public double calVolumeOfBarrel(double height, double radius, double pi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calcMaxWeight(double volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
