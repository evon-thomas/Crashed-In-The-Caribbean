




package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.control.BarrelControl;
import CIT260.crashInTheCaribbean.model.Barrel;
import CIT260.crashInTheCaribbean.view.ErrorView;
import CIT260.crashInTheCaribbean.exceptions.DesignBarrelException;
import CIT260.crashInTheCaribbean.exceptions.ViewException;
import java.util.Scanner;

/**
 *
 * @Thomas Evon. 
 */
public class DesignBarrelsView extends View {
   
    private String message;
    public DesignBarrelsView() {
        super("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Design Your Barrel"
            + "\n---------------------------------------------------------------"
            + "\n Please provide the height of your barrel");
    }
    @Override
    public boolean doAction(String height){
        
        double pi =  3.14;
        double volume = 0.0;
        this.setMessage("Please provide the radius of the barrel");
        String radius = this.getInput();
           
        //prompt for the dimensions for the barrel
        BarrelControl barrelControl = new BarrelControl();

        try{
            volume = barrelControl.barrel(Double.parseDouble(radius), Double.parseDouble(height), pi);
        } catch (DesignBarrelException | NumberFormatException e) {
            ErrorView.display("DesignBarrelsView", e.getMessage());
            
        }
        
        return true;
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