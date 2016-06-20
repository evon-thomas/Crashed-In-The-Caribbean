/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Barrel;

/**
 *
 * @author thomas
 */
public class BarrelControl {
    


    public double barrel(double radiusAmt,double heightAmt, double pi){
        
        if (radiusAmt <0 || radiusAmt >5){//Int too high
        return -1;
        }
        if (heightAmt <0 || heightAmt >12.75){//Pow too high
        return -1;
        }
        if (pi <0 || heightAmt >3.15){//Pow too high
        return -1;
        }
         double volume = Math.pow(radiusAmt, 2) * heightAmt * pi;
         return volume;
    
    } 

    public double calVolumeOfBarrel(double height, double radius, double pi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calcMaxWeight(double volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void saveBarrelDesign(Barrel designedBarrel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
