//
//
//
//
//package CIT260.crashInTheCaribbean.view;
//
//import CIT260.crashInTheCaribbean.model.InventoryType;
//import CIT260.crashInTheCaribbean.control.BarrelControl;
//import java.util.Scanner;
//
///**
// *
// * thomas evon
// */
//public class DesignBarrelsView  {
//   
//    private String message;
//    public DesignBarrelsView() {
//        this.message = ("\n"
//            + "\n---------------------------------------------------------------"
//            + "\n| Design Your Barrel"
//            + "\n---------------------------------------------------------------");
//    }
//
//    public boolean doAction(double height, double radius, double pi) {
//        
//        //prompt for the dimensions for the barrel
//
//        BarrelControl barrelControl = new BarrelControl();
//
//        double volume = barrelControl.calVolumeOfBarrel(height, radius, pi);
//        if (volume == -1) {
//           System.out.println("\nThe height must be between 0 and 24 and the diameter " +
//                             "must be between 0 and 36. Please try again."); 
//        }
//        else {
//            double barrelWeight = barrelControl.calcMaxWeight(volume);
//            if (barrelWeight > 20) {
//                System.out.println("\nThe barrel is too heavy! The weight must be less than 20." +
//                                   "\nPlease try again.");
//            }
//            else {
//                System.out.println("\nBarrel created successfully!" +
//                                   "\nThe volume of your barrel is " + volume);
//                Barrel designedBarrel = new Barrel();
//                designedBarrel.setHeight(height);
//                designedBarrel.setDiameter(radius);
//                designedBarrel.setVolume(pi);                
//
//                barrelControl.saveBarrelDesign(designedBarrel);
//                return true;     
//            }
//        }
//        return false;  
//    }
//
//     public String getInput() {
//
//        Scanner keyboard = new Scanner(System.in);
//        boolean valid = false;
//        String selection = null;
//
//        // while a valid name has not been retrieved
//        while (!valid) {
//
//            // get the value entered from the keyboard
//            selection = keyboard.nextLine();
//            selection = selection.trim();
//
//            if (selection.length() < 1) { // blank value entered
//                System.out.println("\n*** Invalid selection *** Try again");
//                continue;
//            }
//            
//            break;
//        }
//
//        return selection; // return the name        
//    }
//     
//      public void display() {
//        String value;
//        boolean done = false;
//        
//        do { 
//            System.out.println(this.message); // display the prompt message
//            
//            double height = 0.0;
//            double diameter = 0.0;
//            
//            System.out.println("\nPlease enter the height of the barrel");
//            height = Double.parseDouble(getInput());                                                                     
//
//            System.out.println("\nPlease enter the diameter of the barrel");
//            radius = Double.parseDouble(getInput());  
//            
//            System.out.println("\nPlease enter the value of pi ( hint 3.14)");
//            pi = Double.parseDouble(getInput());
//           
//            done = this.doAction(height, diameter); // do action based on selection        
//        } while (!done);
//    }
//}
