/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.exceptions.AvoidTnBException;
import CIT260.crashInTheCaribbean.exceptions.HowToMoveException;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class HelpMenuView extends View {
    
    private String helpMenu;
    
     private void goalOfGame(){
        System.out.println("*** goalOfGmae fun. called ***");
    }
    private void howToMove() {
//        System.out.println("*** howToMove fun. called ***");

          HowToMove move = new HowToMove();
          try{
          move.display();
          }
          catch(HowToMoveException mve){
              System.out.println(mve.getMessage());
          }
          catch (Throwable how){
            System.out.println(how.getMessage());  
          }
    }
    private void toolsAvailable(){
        System.out.println("*** toolsAvailable fun. called ***");
    }
    private void avoidTnB() throws AvoidTnBException{
//        System.out.println("*** avoidTnB fun. called ***");

        AvoidTnBMenuView avoidTnBMenu = new AvoidTnBMenuView();
        avoidTnBMenu.display(); 
        throw new AvoidTnBException("dude enter something");
    }
    
    
    public HelpMenuView(){
//        this.menu = "\n"
             super ("\n"
                    + "\n------------------------------------------------------"
                    + "\n |                    Help Menu                      |"
                    + "\n------------------------------------------------------"
                    + "\n G - Goal of the game"
                    + "\n M - How to move"
                    + "\n T - Tools available to construct"
                    + "\n A - Avoiding traps and beasts. Press A for more details."
                    + "\n Q - quit"
                    + "\n---------------------------------------------------------");
    }
//    public void displayHelpMenuView(){
//
//        /* this was done earlier to test the function */
////    System.out.println("\n*** displayHelpMenuView() function called ***");
//           boolean done = false;  //set flag to not done
//           do {
//               // prompt for and get players name
////              System.out.println(menu);
//              String helpMenuOption = this.getHelpMenuOption();
//              if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
//               return; /// exit the game
//              
//              // do the requested action and display the next view
//              done = this.doAction(helpMenuOption);               
//           } while (!done);
//    }
//
//    private String getHelpMenuOption() {
////       System.out.println("\n*** getMenuOption() called ***");
////       return "N";
//
//       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//       String value = ""; //value to be return
//       boolean valid = false; //initialize to not valid
//       
//       while (!valid){ //loop while an invalid value is enter
//           System.out.println("\n" + this.helpMenu);
//           
//           value = keyboard.nextLine(); //get next line typed on keyboard
//           value = value.trim(); //trim off leading and trailing blanks
//           
//           if (value.length() <1){// value is blank
//               System.out.println("\nYou must select a letter");
//               continue;
//           }
//           break; //end the loop
//       }
//       return value; // return the value entered
//    }
    @Override
    public boolean doAction(String choice) {
//        System.out.println("\n*** doAction() called ***");
//        return true;
  
    choice = choice.toUpperCase(); // convert chice to upper case
    
    switch (choice){
        case "M":
            this.howToMove();
            break;
        case "G":
            this.goalOfGame();
            break;
        case "T":
            this.toolsAvailable();
            break;
        case "A":
            this.avoidTnB("you should enter something");
            break;
        default:
          System.out.println("\n*** Hey bro, not that letter! Try one more time");
          break;
    
    }
    return false; 
    }

    private void avoidTnB(String you_should_enter_something) {
      }

}
