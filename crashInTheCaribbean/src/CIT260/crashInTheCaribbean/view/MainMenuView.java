/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;



import CIT260.crashInTheCaribbean.view.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class MainMenuView {
    
    private String menu;
    
    private void startNewGame(){
        // System.out.println("*** startNewGame fun. called ***");
        
        //this starts a new game

        
        //this displays game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void startExistingGame(){
        System.out.println("*** existingGame fun. called ***");
    }      
    private void displayDamageControlView(){
        //this function calls the class where teh power of attack is calculated. Jose.
        DamageControlView damageView = new DamageControlView();
        damageView.displayDamageControlView();
    }
    private void saveGame(){
        System.out.println("*** saveGame fun. called ***");
    }
    private void displayHelpMenu(){
        // System.out.println("*** displayHelpMenu fun. called ***");
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();

    }
    
    
    public MainMenuView(){
    
        this.menu = "\n"
                    + "\n------------------------------------------------------"
                    + "\n |                    Main menu                      |"
                    + "\n------------------------------------------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nP - Practice your attacks"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save game"
                    + "\nQ - quit"
                    + "\n-----------------------------------------------------";
    }
    
               
    public void displayMainMenuView(){
        /* this was done earlier to test the function */
        // System.out.println("\n*** displayMainMenu() function called ***");
           boolean done = false;  //set flag to not done
           do {
               // prompt for and get players name
        //   System.out.println(menu);
              String menuOption = this.getMenuOption();
              if (menuOption.toUpperCase().equals("Q")) // user wants to quit
               return; /// exit the game
              
              // do the requested action and display the next view
              done = this.doAction(menuOption);               
           } while (!done);
    }

    private String getMenuOption() {
        //  System.out.println("\n*** getMenuOption() called ***");
        //  return "N";

       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; //value to be return
       boolean valid = false; //initialize to not valid
       
       while (!valid){ //loop while an invalid value is enter
           System.out.println("\n" + this.menu);
           
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
        //  System.out.println("\n*** doAction() called ***");
        //  return true;
  
    choice = choice.toUpperCase(); // convert chice to upper case
    
    switch (choice){
        case "N":
            this.startNewGame();
            break;
        case "G":
            this.startExistingGame();
            break;
        case "H":
            this.displayHelpMenu();
            break;
        case "S":
            this.saveGame();
            break;
        case "P":
            this.displayDamageControlView();
            break;
        default:
          System.out.println("\n*** Hey bro, not that letter! Try one more time");
          break;
    
    }
    return false; 
    }

}
