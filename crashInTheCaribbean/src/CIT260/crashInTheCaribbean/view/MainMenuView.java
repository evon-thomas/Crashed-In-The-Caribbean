/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

/**
 *
 * @author josecovarrubias
 */
public class MainMenuView {
    
    private String menu;
    
    private void startNewGame(){
        System.out.println("*** start fun. called ***");
    }
    private void startExistingGame(){
        System.out.println("*** existing fun. called ***");
    }
    private void saveGame(){
        System.out.println("*** save fun. called ***");
    }
    private void displayHelpMenu(){
        System.out.println("*** display fun. called ***");
    }
    
    public MainMenuView(){
    
        this.menu = "\n"
                    + "\n------------------------------------------------------"
                    + "\n | Main menu                                         |"
                    + "\n------------------------------------------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nH Get help on how to play the game"
                    + "\nS - Save game"
                    + "\nQ - quit"
                    + "\n-----------------------------------------------------";
    }
    
            /* this was done earlier to test the function */   
    public void displayMainMenuView(){
//    System.out.println("\n*** displayMainMenu() function called ***");
           boolean done = false;  //set flag to not done
           do{
               // prompt for and get players name
              System.out.println(menu);
              String menuOption = this.getMenuOption();
              if (menuOption.toUpperCase().equals("Q")) // user wants to quit
               return; /// exit the game
              
              // do the requested action and display the next view
              done = this.doAction(menuOption);               
           } while (!done);
    }

    private String getMenuOption() {
       System.out.println("\n*** getMenuOption() called ***");
       return "N";
    }

    private boolean doAction(String choice) {
//        System.out.println("\n*** doAction() called ***");
//        return true;
  
    choice = choice.toUpperCase(); // convert chice to upper case
    
    switch (choice){
        case "N":
            this.startNewGame();
            break;
        case "G":
            this.startNewGame();
            break;
        case "H":
            this.startNewGame();
            break;
        case "S":
            this.startNewGame();
            break;
        default:
            System.out.println("\n*** Hey bro, not that letter! Try one more time");
            break;
    
    }
    return false; 
    }

}
