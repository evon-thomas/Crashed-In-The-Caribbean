/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.GameControl;
import CIT260.crashInTheCaribbean.model.Player;
import java.util.Scanner;

/**
 *
 * @author thomas
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
                // displays this banner when creat
                this.displayBanner();
    }

    private void displayBanner() {
       
        System.out.println(
                "\n********************************************"
               + "\n                                            "
               + "\n Welcome to the jungle. We've got fun and games. *"
               + "\n                                                  "     
               + "\n We'eve got everything you want, the only thing  *"
               + "\n                                                  "          
               + "\n your know is your name. To get out and reach    *"
               + "\n                                                  "          
               + "\n the hall of fame, you must pass the secret traps*"
               + "\n                                                  "          
               + "\n and the beasts you must tame. Eventually you    *"
               + "\n                                                  "          
               + "\n will come accross and giant Noah's ark.         *"
               + "\n                                                  "          
               + "\n Complete the game and build this boat,          *"
               + "\n                                                  "          
               + "\n for a land you'll travel afar.                  *"
               + "\n                                                  "          
               + "\n********************************************");
           


                
                }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                    return;  //exit game
                    
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while(!done);
        
  
//        displayView(): void
//BEGIN
// do
// Prompt for and get the players name
// if (playersName == “Q”) then
// exit
//
// do the action and display the next view
// while the action is not successful
//END}

    }

    private String getPlayersName() {
        /*
          WHILE valid value has not entered
            DISPLAY promptMessage
            GET the value entered from keyboard
            Trim front and trailing blanks off of the game
        
        IF the length of the value is blank THEN
            DISPLAY "invalid value: The value can not be blank"
            CONTINUE
            ENDIF
        
            BREAK
        
            ENDWHILE
            RETURN name
        */
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; //value to be return
       boolean valid = false; //initialize to not valid
       
       while (!valid){ //loop while an invalid value is enter
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() <1){// value is blank
               System.out.println("\nYour name can not be nothing");
               continue;
           }
           break; //end the loop
       }
       return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        if (playersName.length() <2){
            System.out.println("\nAre you sure bro?"
                    + " Come on, is that your name?");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if (player == null){ //if unsuccessful
        System.out.println("\nError creating the player");
        return false;
        }
        
        this.displayNextView(player);
        
        return true;
   }

    private void displayNextView(Player player) {
        
        // customized message
        System.out.println("\n================================================="
                            + "\n Welcome to the Jungle " + player.getName()
               + "\n We hope that you can survive, if not, "
                + "well, we told you it was going to be rough."
                + "\n =======================================================");
        
        // create MainMenuview object
        MainMenuView mainMenuView = new MainMenuView();
        
        // display the main menu view
        mainMenuView.displayMainMenuView();
          
    }
    
    
}