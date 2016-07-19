/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.model.Game;
import crashinthecaribbean.CrashInTheCaribbean;
import enums.CaribbeanItem;

/**
 *
 * @author Karla
 */
public class InventoryControl {
    
    private InventoryType[] inventory;
    private Game game;
    
    public void InventoryControl () {
        
    }
 
    


    public void addItemToInventory(String  description, int amountAvailable, int youHave) {
        
            game = CrashInTheCaribbean.getCurrentGame();
    
            inventory = game.getInventory();
            InventoryType item = new InventoryType();
            
            item.setDescription(description);
            item.setAmountAvailable(amountAvailable);
            item.setYouHave(youHave);
     
            
            inventory[CaribbeanItem.Sword.ordinal() -1] = item;
           
    }

    
}
