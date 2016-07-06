




package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.control.BarrelControl;
import CIT260.crashInTheCaribbean.model.Barrel;
import java.util.Scanner;

/**
 *
 * @Thomas Evon. 
 */
public class DesignBarrelsView  {
   
    private String message;
    public DesignBarrelsView() {
        this.message = ("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Design Your Barrel"
            + "\n---------------------------------------------------------------");
    }

    public double doAction(double height, double radius, double pi) {
        
        //prompt for the dimensions for the barrel

        BarrelControl barrelControl = new BarrelControl();

        double volume = barrelControl.calVolumeOfBarrel(height, radius, pi);
        if (volume == -1) {
           System.out.println("\nThe height must be between 0 and 24 and the diameter " +
                             "must be between 0 and 36. Please try again."); 
        }
        else {
            double barrelWeight = barrelControl.calcMaxWeight(volume);
            if (barrelWeight > 20) {
                System.out.println("\nThe barrel is too heavy! The weight must be less than 20." +
                                   "\nPlease try again.");
            }
            else {
                System.out.println("\nBarrel created successfully!" +
                                   "\nThe volume of your barrel is " + volume);
                Barrel designedBarrel = new Barrel();
                designedBarrel.setHeight(height);
                designedBarrel.setDiameter(radius);
                designedBarrel.setVolume(pi);                

                barrelControl.saveBarrelDesign(designedBarrel);
    /////////////////  /////////////////  /////////////////  /////////////////  ///////////////// 
    /////////I added these to make the class free of erros            
            }
            return -1;
        }
        return -1;
    }
}
 //////////////////////////////////    /////////////////  /////////////////  ///////////////// 
// and commented this out

 /////////////////  /////////////////  /////////////////  /////////////////  ///////////////// 
//     public getInput() {
          //System.out.println("get values function");
//          Scanner keyboard = new Scanner(System.in);
//        double value = 0.0;
//        
//        boolean valid = false;
//        
//        while (!valid) { 
//            System.out.println("\n" + this.message);
//             
//            value = Double.parseDouble(this.keyboard.nextLine());
//            
//            if (value < 1 || value > 13) {
//                System.out.println("\n Choose a number between 1-13");
//                continue;
//            }
//            return value;
//        }
    
//}
     
//      public void display() {
//        double value;
//        boolean done = false;
//        
//        do { 
//            System.out.println(this.message); // display the prompt message
//            
//            double height = 0.0;
//            double diameter = 0.0;
//            
//            System.out.println("\nPlease enter the height of the barrel");
//             double height = Double.parseDouble(getInput());                                                                     
//
//            System.out.println("\nPlease enter the diameter of the barrel");
//             double radius = Double.parseDouble(getInput());  
//            
//            System.out.println("\nPlease enter the value of pi ( hint 3.14)");
//             double pi = Double.parseDouble(getInput());
//            done = this.doAction(height, radius, pi);       
//        } while (!done);
//        }
// 
//}