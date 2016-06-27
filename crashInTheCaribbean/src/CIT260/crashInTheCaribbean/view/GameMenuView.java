/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.GameControl;
import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.InventoryType;
import crashinthecaribbean.CrashInTheCaribbean;

/**
 *
 * @author thomas
 */
public class GameMenuView extends View{
    
//        public void displayMenu() {
//        System.out.println("\n*** game menu view from view layer called ***");
        
    public GameMenuView(){
    
//        this.menu = "\n"
             super( "\n"
                     + "\n------------------------------------------------------"
                    + "\n |                    Game menu                      |"
                    + "\n------------------------------------------------------"
                    + "\n N - Create new game."
                    + "\n M - View map."
                    + "\n I - View inventory."
                    + "\n L - Move location."
                    + "\n C - View player characters."
                    + "\n Q - Quit"
                    + "\n-----------------------------------------------------");
    }

    @Override
    public boolean doAction(String menuOption) {
               menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "N":// create new game
               this.createNewGame();
               break;
           
           case "M": //
               this.ViewMap();
               break;
               
           case "I": //
               this.ViewInventory();
               break;
               
           case "L": // 
               this.moveLocation();
               break;
            
           case "C": //
               this.playerCharacters();
               break;
       
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
  }
    
    private void ViewMap(){
        System.out.println("map func");
    }
    
        private void ViewInventory(){
//        System.out.println("inven func");
            StringBuilder line;
            
            Game game = CrashInTheCaribbean.getCurrentGame();
            InventoryType[] inventory = game.getInventory();
            
            System.out.println("\n=========== LIST OF INVENTORY ITEMS ========== ");
            line = new StringBuilder("                                         ");
            line.insert(0, "DESCRIPTION");
            line.insert(20, "REQUIRED");
            line.insert(30, "YOU HAVE");
            System.out.println(line.toString());
            
            
            for (InventoryType item : inventory){
                 line = new StringBuilder("                                   ");
                 line.insert(0, item.getDescription());
                 line.insert(23, item.getAmountAvailable());
                 line.insert(33, item.getInventoryType());
                 
                 System.out.println(line.toString());
                 
            }
            
    }
    private void moveLocation(){
        System.out.println("locat func");
    }
    private void playerCharacters(){
        System.out.println("charc func");
    }
    private void createNewGame(){
        GameControl.createNewGame(CrashInTheCaribbean.getPlayer());
    }
}
    
        
       
