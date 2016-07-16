/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;
import CIT260.crashInTheCaribbean.control.BarrelControl;
import CIT260.crashInTheCaribbean.control.MoveControl;
/**
 *
 * @author thomas
 */


public class UseBarrelView {

    private String message;
    
    private FillBucket(){
        this.message ="\nBy entering two numbers, you fill the bucket."
                +"\nYou need to enter numbers between 1 -  12.74 for the height"
                +"\n of the bucket. The radius must be between 1 - 5. Pi is "
                +"\n 3.14. You need to fill the bucket all the way up to fill the hole.";
    }
    public void dislpayUseBarrelView() throws DesignBarrelException {
        System.out.println(message);
        System.out.println("\nEnter a value for the height of the bucket");
        Scanner inFile = new Scanner(System.in);
        int input1 = inFile.nextInt();
        System.out.println("\n Now enter a number for the radius");
        int input2 = inFile.nextInt();
        
           BarrelControl controlBarrel = new BarrelControl();
            double bucketAmount = controlBarrel.controlBarrel(input1, input2);
       
            if (bucketAmount < 1000)
                throw new DesignBarrelException("\nYou need to fill it up again,"
                                        +"\n Your amount of water was " + bucketAmount + " cubic feet. "
                                        +"\n The hole isn't filled yet.");
            
            else if (bucketAmount > 1000)
                throw new DesignBarrelException("\nYou Filled the hole!!!!!")
    } 
    
    
    private void fill(){
        this.console.println("*** fill the bucket function called***");
    }
    private void empty(){
    this.console.println("*** empty the bucket function called***");
    }
    private void drink(){
    this.console.println("***drink the bucket function called***");
    }

    
    
    public UseBarrelView(){
                    super ("\n"
                        + "\n=================================================="
                        + "\n F - Fill hole with bucket."
                        + "\n E - Empty bucket on accident."
                        + "\n D - Drink bucket."      
                        + "\n Q - Quit."
                        + "\n--------------------------------------------------");
    }

    @Override
    public boolean doAction(String selection) {
        
        selection = selection.toUpperCase(); 
        
        switch (selection){
            case "F":
                this.fill();
                break;
            case "E":
                this.empty();
                break;
            case "D":
                this.drink();
                break;
            default:
                 ErrorView.display("UseBarrel","\n??? Select one of the letters please");
                break;
        }
        return false;
    }

    void display() {
    }
   
    
}
