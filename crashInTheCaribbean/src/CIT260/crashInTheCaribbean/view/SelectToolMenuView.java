/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import java.util.Scanner;

/**
 *
 * @author thomas
 */




public class SelectToolMenuView {
    
     private String selectToolMenuView;
   
    public  SelectToolMenuView() {
        
       
        this.selectToolMenuView = "\n"
                    + "\n------------------------------------------------------"
                    + "\n|                    Tool Menu                       |"
                    + "\n------------------------------------------------------"
                    + "\n
                    + "\nP - Punch"
                    + "\nS - Sword"
                    + "\nA - Axe"
                    + "\nQ - quit"
                    + "\                                                       "
                    + "\n-----------------------------------------------------";
    }
        
        
        public void displaySelectToolMenuView(){
        
        

        boolean done = false
        do {
            String toolChoice = this.getToolChoice();
            if (toolChoice.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(toolChoice);
        }  while(!done);
    }
        
        private String getToolChoice() {
//       System.out.println("\n*** getMenuOption() called ***");
//       return "N";

       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; //value to be return
       boolean valid = false; //initialize to not valid
       
       while (!valid){ //loop while an invalid value is enter
           System.out.println("\n" + this.selectToolMenuView);
           
           value = keyboard.nextLine(); //get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() <1){// value is blank
               System.out.println("\nYou must type P, S, A, or Q");
               continue;
           }
           break; //end the loop
       }
        }


    private boolean doAction(String toolChoice) {
    
        toolChoice = toolChoice.toUpperCase(); // convert chice to upper case
    
    switch (toolChoice){
        case "P":
            this.usePunch();
            break;
        case "A":
            this.useAxe();
            break;
        case "S":
            this.useSword();
            break;
        default:
          System.out.println("\n*** Hey bro, not that letter! Try P, A, or S");
          break;
    
    }
    return false; 
    }

    private void usePunch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void useAxe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void useSword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


