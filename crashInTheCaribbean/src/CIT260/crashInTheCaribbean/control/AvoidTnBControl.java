/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.exceptions.AvoidTnBException;

/**
 *
 * @author thomas
 */
public class AvoidTnBControl {
    public double build(double radius, double height, double pi) throws AvoidTnBException{
        if (radius < 0 || radius > 5) {
            // return -1;
            throw new AvoidTnBException("****Enter a value between 0 and 5****");
                    }
        if (height < 0 || height > 12) {
            //return -1;
            throw new AvoidTnBException("****Enter a value between 0 and 12****");
                    }
        if (pi < 3.13 || pi > 3.15) {
            // return -1;
            throw new AvoidTnBException("****Enter a value between 3.14 and 3.14... aka enter 3.14.. pi!****");
                    }
        double trapVolume = pi * (radius * radius) * height;
        return trapVolume;
        
        
        
        
        
     
}

}
