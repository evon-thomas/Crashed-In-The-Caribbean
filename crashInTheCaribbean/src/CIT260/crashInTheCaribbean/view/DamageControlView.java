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
public class DamageControlView {

    private String message;

    public DamageControlView(){
        this.message ="If you reach or pass 1,024 on the power level"
                + "you will defeat the beast attacking you, but you"
                + "can only enter numbers from 1 through 5 in different"
                + "combinations to reach the beast resistanse number. ";
    }
    public void displayDamageControlView() {
           System.out.println("the display funtion");
    }
    public void getDamageValues(){
//           System.out.println("get values function");
           Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       double value = 0; //value to be return
       boolean valid = false; //initialize to not valid
       
       while (!valid){ //loop while an invalid value is enter
           System.out.println("\n" + this.message);
           
           double value = keyboard.nextLine(); //get next line typed on keyboard
           
           if (value <1 || >5){// value is blank
               System.out.println("\nStay within the range of 1-5");
               continue;
           }
       
       }
       return ; // return the value entered
    }
    public void doAction(){
            System.out.println("do action function");
    }
}
