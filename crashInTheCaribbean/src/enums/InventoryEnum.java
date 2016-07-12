/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author thomas
 */
public enum InventoryEnum {
    Nuts("Gather nuts for the trip"),
    Bolts("These bolts hold the ship together"),
    Wrench("These bolts hold the ship together"),
    Plow("These bolts hold the ship together"),
    Hoe("These bolts hold the ship together"),
    Hammer("These bolts hold the ship together"),
    Water("These bolts hold the ship together"),
    String("These bolts hold the ship together");
    


private final String details;

    
    InventoryEnum(String description) {
        this.details = description;
    }

    public String getDescription() {
        return this.details;
    }   
//    
//    InventoryEnum(String getlist) {
//        this.details = list;
//    }
//    
//    InventoryEnum (String getAmountAvailable) {
//        this.details = amountAvailable;
//    }


    
}