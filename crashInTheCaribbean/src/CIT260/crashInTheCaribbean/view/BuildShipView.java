/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.BuildControl;
import CIT260.crashInTheCaribbean.exceptions.BuildShipException;
import CIT260.crashInTheCaribbean.exceptions.HowToMoveException;
import CIT260.crashInTheCaribbean.model.Ship;
import java.util.Scanner;

/**
 *
 * @author thomas
 */
public class BuildShipView extends View{
    
    
    private String message;
    
     public BuildShipView(){
            super("\n You must reach 300 cubic feet in order to build your "
                + "\n ship successfully. Don't make this too hard. Just try to"
                + "\n imagine how to calculate the volume of a prism. You have "
                + "\n to multiply a few numbers together. The numbers must be "
                + "\n between 0 and 10"
                + "\n PRESS ENTER TO BEGIN BUILDING YOUR SHIP");
}
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    @Override
    public boolean doAction(String value) {
////        boolean getMyShip = false;
//        int buildNewShip = 0;
//        System.out.println("How LONG do you want the ship to be? enter a number");
//        Scanner longship = new Scanner(System.in);
//        int longShip = longship.nextInt();
//        
//        System.out.println("How WIDE do you want the ship to be? enter a number");
//        Scanner wideShip = new Scanner(System.in);
//        int shipWide = wideShip.nextInt();
//        
//        System.out.println("How TALL do you want the ship to be? enter a number");
//        Scanner tallShip = new Scanner(System.in);
//        int shipTall = tallShip.nextInt();
//        
//        BuildControl newShip = new BuildControl();
//        
//        try{
//        buildNewShip = (int) newShip.build(longShip, shipWide, shipTall);
//        }catch(BuildShipException bse){
//            System.out.println(bse.getMessage());
//        }catch(Throwable bst){
//            System.out.println(bst.getMessage());
//            bst.printStackTrace();
//          
//        }
//        
//        System.out.println("YOUR BOAT IS >" + buildNewShip + "< CUBIC FEET.");
        return true;
    }  
}
////////////////////////////////////////////////////////////////////////////////
/////////////////I COMMENTED ALL FROM HERE DOWN...JOSE//////////////////////////
////////////////////////////////////////////////////////////////////////////////
//public void displayBuildShipView() {
//           System.out.println("the display funtion");
//    }

//public void getShipMeasurements(){
//          //System.out.println("get values function");
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
//            if (value < 1 || value > 11) {
//                System.out.println("\n Choose a number between 1-10");
//                continue;
//            }
//            return;
//        }
//    
//}

//public boolean doAction(double length, double height, double width){
//            System.out.println("DOACTION FUNCTION ON THE BUILDSHIPVIEW");

//        BuildControl buildControl = new BuildControl();
//
//        double cubicfeet = buildControl.calVolumeOfPrism(length, height, width);
//        if (cubicfeet == -1) {
//           System.out.println("\nThe length and height must be between 0 and 10, " +
//                             "the width must be between 0 and 5"); 
//        }
//        else {
//            double shipConstruction = buildControl.calcMaxSize(cubicfeet);
//            if (shipConstruction > 300) {
//                System.out.println("\nThe ship is too big! This isn't the titanic" +
//                                   "\nPlease try again under 300 cubic feet.");
//            }
//            else {
//                System.out.println("\nYour boat is build pirate!" +
//                                   "\nThe cubic feet of your boat is " + shipConstruction);
//                Ship designedShip = new Ship();
//                designedShip.setLength(length);
//                designedShip.setHeight(height);
//                designedShip.setWidth(width);                
//
//                buildControl.saveShipDesign(designedShip);
//                return true;     
//            }
//        }
//        return false;  
//    }

//     public String getInput() {
//
//        Scanner keyboard = new Scanner(System.in);
//        boolean valid = false;
//        String selection = null;
//
//        
//        while (!valid) {
//
//            // get the value entered from the keyboard
//            selection = this.keyboard.nextLine();
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
     
//      public void display() {
//        String value;
//        boolean done = false;
//        
//        do { 
//            System.out.println(this.message); // display the prompt message
//            
//            double length = 0.0;
//            double height = 0.0;
//            double width  = 0.0;
//            
//            System.out.println("\nPlease enter the length of the Ship");
//            length = Double.parseDouble(getInput());                                                                     
//
//            System.out.println("\nPlease enter the height of the Ship");
//            height = Double.parseDouble(getInput());    
//            
//            System.out.println("\nPlease enter the width of the Ship");
//            width = Double.parseDouble(getInput());    
//           
//            done = this.doAction(length, height, width); // do action based on decision        
//        } while (!done);
//    }
//}
