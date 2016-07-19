/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.InventoryControl;
import static enums.InventoryEnum.String;

/**
 *
 * @author Karla
 */
public class UseSwordView extends View{
    
    
    private void FightBeast() {
        this.console.println("***Figh function called***");
    }

    private void CutTrees() {
       this.console.println("***cut trees function called***");
    }

    private void saveToInventory() {
         //this.console.println("***addItemToInventory function called***");
        // */*/*/*NEED TO CALL FUNCTION FROM INVENTORY CONTROL 
        InventoryControl inventoryControl = new InventoryControl();
        
        inventoryControl.addItemToInventory("Sword", 1, 1);
    }
    
     public UseSwordView(){
              super ("\n"
                    + "\n=================================================="
                    + "\n F - Fight with beast."
                    + "\n C - Cut trees." 
                    + "\n S - Save to inventory"
                    + "\n Q - Quit."
                    + "\n--------------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); 
        
        switch (value){
            case "F":
                this.FightBeast();
                break;
            case "C":
                this.CutTrees();
                break;
                
            case "S":
                this.saveToInventory();
                break;
           
            default:
                 ErrorView.display("UseSwordView","\n??? Select one of the letters please");
                break;
        }
        return false;
    }

 
}
