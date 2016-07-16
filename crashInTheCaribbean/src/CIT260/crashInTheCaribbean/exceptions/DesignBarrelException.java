/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.exceptions;

/**
 *
 * @author Karla
 */
public class DesignBarrelException extends Exception  {

    public DesignBarrelException() {
    }

    public DesignBarrelException(String string) {
        super(string);
    }

    public DesignBarrelException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DesignBarrelException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DesignBarrelException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
