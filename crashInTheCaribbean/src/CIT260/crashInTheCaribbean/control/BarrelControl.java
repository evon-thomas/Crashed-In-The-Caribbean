/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Barrel;
import CIT260.crashInTheCaribbean.exceptions.DesignBarrelException;

/**
 *
 * @author thomas
 */
public class BarrelControl {
    


    public double barrel(double radiusAmt,double heightAmt, double pi) throws DesignBarrelException {
        
        if (radiusAmt <0 || radiusAmt >5){//Int too high
            throw new DesignBarrelException("The radius is too high");
        }
        if (heightAmt <0 || heightAmt >12.75){//Pow too high
            throw new DesignBarrelException("The height is too high");
        }
        if (pi <0 || heightAmt >3.15){//Pow too high
            throw new DesignBarrelException("The power is too high");
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
