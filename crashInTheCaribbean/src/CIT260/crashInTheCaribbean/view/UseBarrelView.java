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


public class UseBarrelView extends View{

    
    private void fill(){
           BarrelControl controlBarrel = new BarrelControl();
            controlBarrel.display();
       
    } 
    private void empty(){
    
    }
    private void drink(){
    
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
                System.out.println("\n??? Select one of the letters please");
                break;
        }
        return false;
    }
    
}
