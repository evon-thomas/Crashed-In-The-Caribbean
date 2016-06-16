/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @Spencer Jackson
 */
public class DesignBarrelsView  {
   
    private String message;
    public DesignBarrelsView() {
        this.message = ("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Design Your Barrel"
            + "\n---------------------------------------------------------------");
    }

    public boolean doAction(double height, double diameter) {
        
        //prompt for the dimensions for the barrel

        InventoryControl inventoryControl = new InventoryControl();

        double volume = inventoryControl.calVolumeOfBarrel(height, diameter);
        if (volume == -1) {
           System.out.println("\nThe height must be between 0 and 24 and the diameter " +
                             "must be between 0 and 36. Please try again."); 
        }
        else {
            double barrelWeight = inventoryControl.calcMaxWeight(volume);
            if (barrelWeight > 20) {
                System.out.println("\nThe barrel is too heavy! The weight must be less than 20." +
                                   "\nPlease try again.");
            }
            else {
                System.out.println("\nBarrel created successfully!" +
                                   "\nThe volume of your barrel is " + volume);
                Barrel designedBarrel = new Barrel();
                designedBarrel.setHeight(height);
                designedBarrel.setDiameter(diameter);
                designedBarrel.setVolume(volume);                

                inventoryControl.saveBarrelDesign(designedBarrel);
                return true;     
            }
        }
        return false;  
    }

     public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        // while a valid name has not been retrieved
        while (!valid) {

            // get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) { // blank value entered
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            
            break;
        }

        return selection; // return the name        
    }
     
      public void display() {
        String value;
        boolean done = false;
        
        do { 
            System.out.println(this.message); // display the prompt message
            
            double height = 0.0;
            double diameter = 0.0;
            
            System.out.println("\nPlease enter the height of the barrel");
            height = Double.parseDouble(getInput());                                                                     

            System.out.println("\nPlease enter the diameter of the barrel");
            diameter = Double.parseDouble(getInput());    
           
            done = this.doAction(height, diameter); // do action based on selection        
        } while (!done);
    }
}
