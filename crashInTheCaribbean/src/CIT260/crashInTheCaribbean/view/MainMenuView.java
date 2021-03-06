/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;



import CIT260.crashInTheCaribbean.control.GameControl;
import CIT260.crashInTheCaribbean.exceptions.DamageControlException;
import CIT260.crashInTheCaribbean.view.GameMenuView;
import crashinthecaribbean.CrashInTheCaribbean;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josecovarrubias
 */
public class MainMenuView extends View {
    
    private String menu;
    
    private void StartNewGame(){
        GameControl.createNewGame(CrashInTheCaribbean.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void startExistingGame(){
       this.console.println("\n\n Enter the file path for file where the game"
                                + "is to be saved");
       
       String filePath = this.getInput();
       try{
           GameControl.getSavedGame(filePath);
       }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
       }
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    } 
    
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////    
    private void displayDamageControlView() {
        
       
        //this function calls the class where the power of attack is calculated. Jose.
        DamageControlView damageView = new DamageControlView();
       
        try {
            damageView.displayDamageControlView();
        } catch (DamageControlException de) {
            System.out.println(de.getMessage());
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
    }
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    
    private void saveGame(){
        this.console.println("\n\n Enter the file path for file where the game"
                                + "is to be saved");
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(CrashInTheCaribbean.getCurrentGame(), filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
    private void displayHelpMenu(){
        // System.out.println("*** displayHelpMenu fun. called ***");
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();

    }
    
    private void displayDesignBarrelsView(){
         
        DesignBarrelsView designBarrelsView = new DesignBarrelsView();
        designBarrelsView.display();
    }
    
    
    public MainMenuView(){
    
//        this.menu = "\n"
             super( "\n"
                     + "\n------------------------------------------------------"
                    + "\n |                    Main menu                      |"
                    + "\n------------------------------------------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nP - Practice your attacks"
                    + "\nH - Help, how to play game"                    
                    + "\nS - Save game"
                    + "\nB - Bucket, use bucket for trap"
                    + "\nQ - quit"
                    + "\n-----------------------------------------------------");
    }
    
               
//    public void displayMainMenuView(){
//        /* this was done earlier to test the function */
//        // System.out.println("\n*** displayMainMenu() function called ***");
//           boolean done = false;  //set flag to not done
//           do {
//               // prompt for and get players name
//        //   System.out.println(menu);
//              String menuOption = this.getMenuOption();
//              if (menuOption.toUpperCase().equals("Q")) // user wants to quit
//               return; /// exit the game
//              
//              // do the requested action and display the next view
//              done = this.doAction(menuOption);               
//           } while (!done);
//    }
//
//    private String getMenuOption() {
//        //  System.out.println("\n*** getMenuOption() called ***");
//        //  return "N";
//
//       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//       String value = ""; //value to be return
//       boolean valid = false; //initialize to not valid
//       
//       while (!valid){ //loop while an invalid value is enter
//           System.out.println("\n" + this.menu);
//           
//           value = this.keyboard.nextLine(); //get next line typed on keyboard
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
    public boolean doAction(String value) {
//        //  System.out.println("\n*** doAction() called ***");
//        //  return true;
  
    value = value.toUpperCase(); // convert chice to upper case
    
    switch (value){
        case "N":
            this.StartNewGame();
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
         case "B":
            this.displayDesignBarrelsView();
            break;    
        default:
         ErrorView.display("MainMenuView",
                 "Hey bro, not that letter! Try one more time");
         break;
    }
    return false; 
    }

}


