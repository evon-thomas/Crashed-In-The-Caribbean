/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.DamageControl;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public class DamageControlView {

    private String message;

    public DamageControlView(){
        this.message ="\nBy entering 2 numbers you get the power level"
                + "\nyou needd to defeat the beast attacking you, but you"
                + "\ncan only enter numbers from 1 through 5 in different"
                + "\ncombinations to reach the beast resistanse number. ";
    }
    public void displayDamageControlView() {
           System.out.println(message);
           System.out.println("\nEnter a value for the level of attack power");
           Scanner inFile = new Scanner(System.in);
           int input1 = inFile.nextInt();
           System.out.println("\nNow enter a number to rais the first"
                            + "\nvalue to that power");
           int input2 = inFile.nextInt();
           
           DamageControl damage = new DamageControl();
           double damageLevel = damage.damage(input1, input2);
//           System.out.println("Your attack was "+ damageLevel +" strength.");
//        boolean done = false;
//           
//       while(!valid){
//           System.out.println("You need to attack again, beast is not dead yet.");
//           if(damageLevel <1500){
//           System.out.println("Keep fighting");
//           }
//       }

//         do {
          
            if (damageLevel <1500) // user wants to quit
//             this.displayDamageControlView(); /// exit this menu
            System.out.println("You need to attack again,"
                    + "\nYour attack was " + damageLevel + " strength."
                    + " Beast is not dead yet.");
            
            else if(damageLevel >1500){
            System.out.println("!!!!!! You have defeated the beast !!!!!!");
            }
            return;  
           // do the requested action and display the next view
                         
//        } while (!done);
         
           
    }
//    public void getDamageValues(){
////           System.out.println("get values function");
//           Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//       double value = 0; //value to be return
//       boolean valid = false; //initialize to not valid
//       
//       while (!valid){ //loop while an invalid value is enter
//           System.out.println("\n" + this.message);
//           
//           double value = keyboard.nextLine(); //get next line typed on keyboard
//           
//           if (value <1 || >5){// value is blank
//               System.out.println("\nStay within the range of 1-5");
//               continue;
//           }
//       
//       }
//       return ; // return the value entered
//    }
//    public void doAction(){
//            System.out.println("do action function");
//    }
}
