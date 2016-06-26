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
 * @author josecovarrubias
 */
public enum Character implements Serializable{
        
    // our enum array 
    Rambo("This player is the most tough of all the players, but has one weakness, he moves slow."),
    Neo("This player can visualize dimentional enviroments, but is soley imaginable."),
    KungFuPanda("the most fun player to play with");
    
    
    
    
    
    
    // class instance variable
//    private String name;
    private final String description;
    private final Location coordinates;
//    private final Location row;
//    private final Location column;
    
    Character(String description) {
        this.description = description;
      coordinates = new Location();
//      this.row =  row;
//      this.column = column;
    }

    
    
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Location getCoordinates() {
        return coordinates;
    }

//    public void setCoordinates(double coordinates) {
//        this.coordinates = coordinates;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 37 * hash + Objects.hashCode(this.name);
//        hash = 37 * hash + Objects.hashCode(this.description);
//        hash = 37 * hash + (int) (Double.doubleToLongBits(this.coordinates) ^ (Double.doubleToLongBits(this.coordinates) >>> 32));
//        return hash;
//    }

//    @Override
//    public String toString() {
//        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
//    }

} 
    





































//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Character other = (Character) obj;
//        if (Double.doubleToLongBits(this.coordinates) != Double.doubleToLongBits(other.coordinates)) {
//            return false;
//        }
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }
    
    
    

