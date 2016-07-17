/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import enums.Characters;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josecovarrubias
 */
public class Location implements Serializable{
    
     private LocationType type;
      private int row;
      private int column;
      private boolean visited;
      private Scene scene;
      private ArrayList<Characters> characters;
      private double amountRemaning;
//
      public Location(int row, int column, Scene scene, ArrayList<Characters> character) { 
          this.row = row;
          this.column = column;
          this.visited = false;
          this.scene = scene;
          this.characters = character;
      }  
      public Location(){
          this.characters = new ArrayList<Characters>();
      }
      
      public Location(int row, int column){
          this.row = row;
          this.column = column;
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

    public void setRow(int row) {
        this.row = row;
    }

     public double getColumn() {
       return column;
        }

    public void setColumn(int column) {
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

    public ArrayList<Characters> getCharacter() {
        return characters;
    }

    public void setCharacter(ArrayList<Characters> character) {
        this.characters = character;
    }
    public void removeCharacter(Characters character){
        if (character == null){
            return;
        }
        this.characters.remove(character);
    }
    public void addCharacter(Characters character){
        if(character == null || this.characters.contains(character)){
            return;
    }
     this.characters.add(character);
    }
  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.row;
        hash = 67 * hash + this.column;
     
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + '}';
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
 
