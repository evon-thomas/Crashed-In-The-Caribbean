/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.exceptions;

/**
 *
 * @author josecovarrubias
 */
public class BuildShipException extends Exception{

    public BuildShipException() {
    }

    public BuildShipException(String message) {
        super(message);
    }

    public BuildShipException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuildShipException(Throwable cause) {
        super(cause);
    }

    public BuildShipException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
