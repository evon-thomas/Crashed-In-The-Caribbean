/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.exceptions.HowToMoveException;

/**
 *
 * @author josecovarrubias
 */

// testing to see if I was attached to the main git master

public interface ViewInterface {
    
    public void display();
    public String getInput();
    public boolean doAction(String value);
}
