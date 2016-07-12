/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author thomas
 */
public class InventoryType implements Serializable{



//    public static InventoryType[] values() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    // class instance variables
    private double amountAvailable;
    private String inventoryType;
    private String description;
    private double youHave;

    public InventoryType(){
    
    }
    public InventoryType(String description, double amountAvailable, double youHave){
            this.description = description;
            this.amountAvailable = amountAvailable;
            this.youHave = youHave;
    }
    
    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getYouHave() {
        return youHave;
    }

    public void setYouHave(double youHave) {
        this.youHave = youHave;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.inventoryType);
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryType{" + "amountAvailable=" + amountAvailable + ", inventoryType=" + inventoryType + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryType other = (InventoryType) obj;
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    }
    
    
    
    
    
    
    
