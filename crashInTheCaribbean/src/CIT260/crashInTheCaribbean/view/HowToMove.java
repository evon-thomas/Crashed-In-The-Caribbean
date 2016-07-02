/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.MoveControl;
import CIT260.crashInTheCaribbean.exceptions.DamageControlException;
import CIT260.crashInTheCaribbean.exceptions.HowToMoveException;

/**
 *
 * @author josecovarrubias
 */
public class HowToMove extends View{
  
    
    /*
    ==========================================================================
    this ithe part where I wanted to add the option to the user to enter
    either 1 or 2 values, so that way he can call for the boost, but 
    I didn't know how to so it. 
    I thought about it with the array, but this is as far as i went, 
    ===========================================================================
    */
    int moves[] = {2, 2};
    int boost=moves[1];
    int L=moves[0];
    int R=moves[0];
    int J=moves[0];
    private void jump() throws HowToMoveException {
 
            MoveControl controlMove = new MoveControl();
            int movPlayer = controlMove.controlMove(J, boost);
      throw new HowToMoveException("You just jumped");
    } 
    private void left()throws HowToMoveException{
                MoveControl controlMove = new MoveControl();
            int movPlayer = controlMove.controlMove(L, boost);
            throw new HowToMoveException ("You moved to the left " + movPlayer + " places");
    }
    private void right() throws HowToMoveException {
                MoveControl controlMove = new MoveControl();
            int movPlayer = controlMove.controlMove(R, boost);
          throw new HowToMoveException ("You moved to the right " + movPlayer + " places");
    }

    
    
    public HowToMove(){
                   super ("\n"
                        + "\n=================================================="
                        + "\n J - Jump."
                        + "\n R - Right."
                        + "\n L - Left." 
//                        + "\n B - Boost."     
                        + "\n Q - Quit."
                        + "\n--------------------------------------------------");
    }

    @Override
    public boolean doAction(String selection) throws HowToMoveException {
        
        selection = selection.toUpperCase(); 
        
        switch (selection){
            case "J":
                this.jump();
                break;
            case "R":
                this.right();
                break;
            case "L":
                this.left();
                break;
//            case "B":
//                this.boost();
//                break;
            default:
                System.out.println("enter a valid value");
                break;
               
        }
        return false;
    }
    
}
