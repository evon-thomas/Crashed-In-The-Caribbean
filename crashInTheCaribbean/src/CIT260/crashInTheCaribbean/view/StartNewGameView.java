/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.GameControl;

/**
 *
 * @author Karla
 */
public class StartNewGameView extends View{
    
//    GameControl.createNewGame(CrashInTheCaribbean.);
    
    
     private String menu;
    
    private void confused(){
        this.console.println("*** confused fun. called ***");
    }
    private void angry(){
        this.console.println("*** angry fun. called ***");
    }
    private void worried(){
       this.console.println("*** worried fun. called ***"); 
    }
    private void happy(){
         this.console.println("*** happy fun. called ***");  
    }
    
    
    public StartNewGameView(){
//        this.menu = "\n"
          super ("\nQ - Quit"
                + "\n"
                + "\n----------------------------------"
                + "\n How are you feeling?"
                + "\n ---------------------------------"
                + "\nC - Confused"
                + "\nA - Angry"
                + "\nW - Worried"
                + "\nH - Happy"
                + "\nQ - Quit"
                + "\n----------------------------------");
    
}
    @Override
     public boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "C": //confused
               this.confused();
               break;
               
           case "A": //angry
               this.angry();
               break;
               
           case "W": // worried
               this.worried();
               break;
            
           case "H": //happy
               this.happy();
               break;
              
           default:
               ErrorView.display("StartNewGame","\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

   
    
}