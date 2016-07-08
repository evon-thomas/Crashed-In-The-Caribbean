/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.MoveControl;
import CIT260.crashInTheCaribbean.exceptions.DamageControlException;
import CIT260.crashInTheCaribbean.exceptions.HowToMoveException;
import java.util.Scanner;

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
    
    public int letsMove(){
       this.console.println("\n Enter the spaces you want to move");
        Scanner moveSpaces =   new Scanner(System.in);
        int spaceMoved = moveSpaces.nextInt();
        this.console.println(spaceMoved);
        return spaceMoved;
    }
    
    private void jump(){// throws HowToMoveException{ 
 
            MoveControl controlMove = new MoveControl();
            try {
                int movPlayer = controlMove.controlMove(J, boost);
            }
            catch(HowToMoveException jmp) {
                System.out.println(jmp.getMessage());
                    //System.out.println("You just jumped"); 
            }
    } 
    private void left(){//throws HowToMoveException{
        
                 MoveControl controlMove = new MoveControl();
          try{
            int movPlayer = controlMove.controlMove(L, boost);
          }
          catch(HowToMoveException mov){
            System.out.println(mov.getMessage());
          }
    }
    private void right(){//throws HowToMoveException {
                MoveControl controlMove = new MoveControl();
                try {
            int movPlayer = controlMove.controlMove(R, boost);
                }
                catch(HowToMoveException rite){
         // System.out.println("You moved to the right " + movPlayer + " places");
         System.out.println(rite.getMessage());
                }
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
        
                   
//        System.out.println("\n Enter the spaces you want to move");
//        Scanner moveSpaces =   new Scanner(System.in);
//        int spaceMoved = moveSpaces.nextInt();
//        System.out.println(spaceMoved);
//        
        
        
    }

   @Override
    public boolean doAction(String selection){// throws HowToMoveException {
        
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
               ErrorView.display("HowToMove","again, not that letter bro!");
                break;
               
        }
        return false;
    }
    
}
