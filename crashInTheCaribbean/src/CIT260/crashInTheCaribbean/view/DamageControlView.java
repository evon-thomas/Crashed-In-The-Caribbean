/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.DamageControl;
import CIT260.crashInTheCaribbean.exceptions.DamageControlException;
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
    public void displayDamageControlView() throws DamageControlException {
           System.out.println(message);
           System.out.println("\nEnter a value for the level of attack power");
           Scanner inFile = new Scanner(System.in);
           int input1 = inFile.nextInt();
           System.out.println("\nNow enter a number to rais the first"
                            + "\nvalue to that power");
           int input2 = inFile.nextInt();
           
           DamageControl damage = new DamageControl();
           double damageLevel = damage.damage(input1, input2);

          
            if (damageLevel <1500)

           throw new DamageControlException("You need to attack again,"
                                            + "\nYour attack was " + damageLevel + " strength."
                                            + " Beast is not dead yet.");
            
            else if(damageLevel >1500){
            System.out.println("!!!!!! You have defeated the beast !!!!!!");
            }       
    }

}
