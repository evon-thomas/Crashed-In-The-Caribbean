/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import java.util.Scanner;

/**
 *
 * @author josecovarrubias 
 */
public class AvoidTnBMenuView extends View {
    
        private String avoidMenu;
        private void dodge(){
        this.console.println(" When facing a trap that sends projectiles you can Press"
                         + "\n the lettler D to dodge the spears or arrows coming at you.");
        }
        private void cover(){
        this.console.println(" If you are attacked you can press the letter C to cover"
                         + "\n from any beast attack, as long as you already have "
                         + "\n earned the shield.");
        }
        private void attack(){
        this.console.println(" You will have the option to attack when you encounter"
                         + "\n a beast by pressing the letter A.");
        }

    public AvoidTnBMenuView(){
//            this.menu = "\n"
                   super ("\n"
                        + "\n=================================================="
                        + "\n|||    How to avoid traps and beasts options   |||"
                        + "\n=================================================="
                        + "\n A - Attack: press A for more detail."
                        + "\n C - Cover: press C for more detail."
                        + "\n D - Dodge: press D for more detail."  
                        + "\n Q - Quit." 
                        + "\n--------------------------------------------------");
    }
    
//    public void displayAvoidTnBMenu() {
////     System.out.println("\n   ***testing the avoidtnb menu");
//         boolean done = false;  //set flag to not done
//         do {
////          System.out.println(menu);
//            String avoidMenuOption = this.getAvoidMenuOption();
//            if (avoidMenuOption.toUpperCase().equals("Q")) // user wants to quit
//            return; /// exit this menu
//              
//           // do the requested action and display the next view
//            done = this.doAction(avoidMenuOption);               
//        } while (!done);
//    }
//    
//    private String getAvoidMenuOption() {
////       System.out.println("\n*** getMenuOption() called ***");
////       return "N";
//
//       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//       String value = ""; //value to be return
//       boolean valid = false; //initialize to not valid
//       
//       while (!valid){ //loop while an invalid value is enter
//           System.out.println("\n" + this.avoidmenu);
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
    public boolean doAction(String choice) {
//        System.out.println("\n*** doAction() called ***");
//        return true;
  
    choice = choice.toUpperCase(); // convert chice to upper case
    
    switch (choice){
        case "A":
            this.attack();
            break;
        case "C":
            this.cover();
            break;
        case "D":
            this.dodge();
            break;
        default:
           ErrorView.display("AvoidTnB","\n*** Not that letter! Try one more time");
          break;
    
    }
    return false; 
    }
    
}
