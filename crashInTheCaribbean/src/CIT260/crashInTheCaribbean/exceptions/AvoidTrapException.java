/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.exceptions;

/**
 *
 * @author thomas
 */
public class AvoidTrapException extends Exception{

    public AvoidTrapException() {
    }

    public AvoidTrapException(String string) {
        super(string);
    }

    public AvoidTrapException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public AvoidTrapException(Throwable thrwbl) {
        super(thrwbl);
    }

    public AvoidTrapException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }


    
}
