/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josecovarrubias
 */
public class Location implements Serializable{
    
    
//    startingPoint(),
//    buildShipShore(),
//    trapArea();
//    
    
    
    
    
    // class instnace variables
    // private final double coordinates;
     private LocationType type;
      private double row;
      private double column;
      private boolean visited;
      private Scene scene;
      private ArrayList<Character> character;
      private double amountRemaning;
//
      Location() { 
      }  
        
      public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }
    
     public double getRow() {
        return row;
      }

    public void setRow(double row) {
        this.row = row;
    }

     public double getColumn() {
       return column;
        }

    public void setColumn(double column) {
        this.column = column;
    }

   public boolean isVisited() {
        return visited;
       }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getAmountRemaning() {
       return amountRemaning;
     }

    public void setAmountRemaning(double amountRemaning) {
        this.amountRemaning = amountRemaning;
    }
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }
  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 67 * hash + (this.visited ? 1 : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amountRemaning) ^ (Double.doubleToLongBits(this.amountRemaning) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaning=" + amountRemaning + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaning) != Double.doubleToLongBits(other.amountRemaning)) {
            return false;
        }
        return true;


     }
}
 
