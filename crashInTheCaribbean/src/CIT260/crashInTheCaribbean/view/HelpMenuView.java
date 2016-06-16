/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class HelpMenuView {
    
    private String helpMenu;
    
     private void goalOfGame(){
        System.out.println("*** goalOfGmae fun. called ***");
    }
    private void howToMove(){
        System.out.println("*** howToMove fun. called ***");
    }
    private void toolsAvailable(){
        System.out.println("*** toolsAvailable fun. called ***");
    }
    private void avoidTnB(){
//        System.out.println("*** avoidTnB fun. called ***");

        AvoidTnBMenuView avoidTnBMenu = new AvoidTnBMenuView();
        avoidTnBMenu.displayAvoidTnBMenu(); 
    }
    
    
    public HelpMenuView(){
    
        this.helpMenu = "\n"
                    + "\n------------------------------------------------------"
                    + "\n |                    Help Menu                      |"
                    + "\n------------------------------------------------------"
                    + "\n G - Goal of the game"
                    + "\n M - How to move"
                    + "\n T - Tools available to construct"
                    + "\n A - Avoiding traps and beasts. Press A for more details."
                    + "\n Q - quit"
                    + "\n---------------------------------------------------------";
    }
    public void displayHelpMenuView(){

        /* this was done earlier to test the function */
//    System.out.println("\n*** displayHelpMenuView() function called ***");
           boolean done = false;  //set flag to not done
           do {
               // prompt for and get players name
//              System.out.println(menu);
              String helpMenuOption = this.getHelpMenuOption();
              if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
               return; /// exit the game
              
              // do the requested action and display the next view
              done = this.doAction(helpMenuOption);               
           } while (!done);
    }

    private String getHelpMenuOption() {
//       System.out.println("\n*** getMenuOption() called ***");
//       return "N";

       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; //value to be return
       boolean valid = false; //initialize to not valid
       
       while (!valid){ //loop while an invalid value is enter
           System.out.println("\n" + this.helpMenu);
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() <1){// value is blank
               System.out.println("\nYou must select a letter");
               continue;
           }
           break; //end the loop
       }
       return value; // return the value entered
    }

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
            this.avoidTnB();
            break;
        default:
          System.out.println("\n*** Hey bro, not that letter! Try one more time");
          break;
    
    }
    return false; 
    }

}