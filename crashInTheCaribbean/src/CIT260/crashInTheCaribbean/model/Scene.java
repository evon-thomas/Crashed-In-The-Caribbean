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
public enum Scene implements Serializable{
    
    overLook_of_Location("This is the starting scene for any location."),
    face_trap("This scene shows the trap to the user."),
    face_beast("This scene shows the beast to the user."),
    find_tool("This scene is used when a new tool is found."),
    find_weapon("This scene is used when a new weapon is found.");
    
    
    private final String description;
    private final double travelTime;
    private final boolean blockedLocation;
    private final double healthLeft;
    
    private Location location;

    Scene(String description) {
        this.description = description;
        useWeapon = new AvoidBeasts()
    }
    
    

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public double getTravelTime() {
        return travelTime;
    }

//    public void setTravelTime(double travelTime) {
//        this.travelTime = travelTime;
//    }

//    public boolean isBlockedLocation() {
//        return blockedLocation;
//    }
//
//    public void setBlockedLocation(boolean blockedLocation) {
//        this.blockedLocation = blockedLocation;
//    }

    public double getHealthLeft() {
        return healthLeft;
    }
//
//    public void setHealthLeft(double healthLeft) {
//        this.healthLeft = healthLeft;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 59 * hash + Objects.hashCode(this.description);
//        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
//        hash = 59 * hash + (this.blockedLocation ? 1 : 0);
//        hash = 59 * hash + (int) (Double.doubleToLongBits(this.healthLeft) ^ (Double.doubleToLongBits(this.healthLeft) >>> 32));
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", healthLeft=" + healthLeft + '}';
//    }
//    
//    
//
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
//        final Scene other = (Scene) obj;
//        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
//            return false;
//        }
//        if (this.blockedLocation != other.blockedLocation) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.healthLeft) != Double.doubleToLongBits(other.healthLeft)) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }
//    
    
    

}