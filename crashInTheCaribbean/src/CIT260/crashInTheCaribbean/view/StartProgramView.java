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
public class StartProgramView extends View{
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
                // displays this banner when create
                this.displayBanner();
    }

    private void displayBanner() {
       
       this.console.println(
                "\n********************************************"
               + "\n Welcome to the jungle. We've got fun and games. *"     
               + "\n We'eve got everything you want, the only thing  *"         
               + "\n your know is your name. To get out and reach    *"         
               + "\n the hall of fame, you must pass the secret traps*"          
               + "\n and the beasts you must tame. Eventually you    *"         
               + "\n will come accross and giant Noah's ark.         *"         
               + "\n Complete the game and build this boat,          *"         
               + "\n for a land you'll travel afar.                  *"        
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
//       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; //value to be return
       boolean valid = false; //initialize to not valid
       try{
       while (!valid){ //loop while an invalid value is enter
           this.console.println("\n" + this.promptMessage);
           
           value = this.keyboard.readLine(); //get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() <1){// value is blank
               ErrorView.display("\nYour name can not be nothing");
               continue;
           }
           break; //end the loop
       }
       }catch (Exception e){
           ErrorView.display("Error reading input:" + e.getMessage());
       }
       return value; // return the value entered
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() <2){
            ErrorView.display("\nAre you sure bro?"
                    + " Come on, is that your name?");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if (player == null){ //if unsuccessful
        ErrorView.display("\nError creating the player");
        return false;
        }
        
        this.displayNextView(player);
        
        return true;
   }

    private void displayNextView(Player player) {
        
        // customized message
        this.console.println("\n======================================================="
               + "\n Welcome to the Jungle " + player.getName()
               + "\n We hope that you can survive, if not, "
               + "\n well, we told you it was going to be rough."
               + "\n=======================================================");
        
        // create MainMenuview object
        MainMenuView mainMenuView = new MainMenuView();
        
        // display the main menu view
        mainMenuView.display();
          
    }
    
    
}
