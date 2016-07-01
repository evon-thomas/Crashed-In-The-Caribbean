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
public class DamageControlException extends Exception {

    public DamageControlException() {
    }

    public DamageControlException(String string) {
        super(string);
    }

    public DamageControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DamageControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DamageControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }



}
