/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.exceptions.HowToMoveException;

/**
 *
 * @author josecovarrubias
 */
public class MoveControl {
 
     
    public int controlMove(int letter, int Boost)throws HowToMoveException{

    double calMove = Math.pow(letter, Boost);
        if (calMove > 6 ){  
  throw new HowToMoveException("You can't move more 6 spaces");
    }  
        return (int) calMove;
}
}
