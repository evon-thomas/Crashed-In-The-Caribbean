/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

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
//        displayView(): void
//BEGIN
// do
// Prompt for and get the players name
// if (playersName == “Q”) then
// exit
//
// do the action and display the next view
// while the action is not successful
//END
    }
    
    
}
