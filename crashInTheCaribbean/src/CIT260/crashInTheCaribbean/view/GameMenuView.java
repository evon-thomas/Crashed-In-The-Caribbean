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
public class GameMenuView extends View{
    
//        public void displayMenu() {
//        System.out.println("\n*** game menu view from view layer called ***");
    private void ViewMap(){}
    private void ViewInventory(){}
    private void moveLocation(){}
    private void playerCharacters(){}
        
    public GameMenuView(){
    
//        this.menu = "\n"
             super( "\n"
                     + "\n------------------------------------------------------"
                    + "\n |                    Game menu                      |"
                    + "\n------------------------------------------------------"
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
}
    
        
       
