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
public class HowToMoveException extends Exception {

    public HowToMoveException() {
    }

    public HowToMoveException(String string) {
        super(string);
    }

    public HowToMoveException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public HowToMoveException(Throwable thrwbl) {
        super(thrwbl);
    }

    public HowToMoveException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
