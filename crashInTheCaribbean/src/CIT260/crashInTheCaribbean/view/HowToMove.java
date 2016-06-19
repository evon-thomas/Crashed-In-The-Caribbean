/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.MoveControl;

/**
 *
 * @author josecovarrubias
 */
public class HowToMove extends View{

    
    private void jump(){
            MoveControl controlMove = new MoveControl();
            controlMove.display();
       
    } 
    private void left(){
    
    }
    private void right(){
    
    }
    private void boost(){
    
    }
    
    
    public HowToMove(){
                    super ("\n"
                        + "\n=================================================="
                        + "\n J - Jump."
                        + "\n R - Right."
                        + "\n L - Left." 
                        + "\n B - Boost."     
                        + "\n Q - Quit."
                        + "\n--------------------------------------------------");
    }

    @Override
    public boolean doAction(String selection) {
        
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
            case "B":
                this.boost();
                break;
            default:
                System.out.println("\n??? Select one of the letters. ???");
                break;
        }
        return false;
    }
    
}
