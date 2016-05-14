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
public class Scene implements Serializable{
    
    private String description;
    private double travelTime;
    private boolean blockedLocation;
    private double healthLeft;

    public Scene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(boolean blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public double getHealthLeft() {
        return healthLeft;
    }

    public void setHealthLeft(double healthLeft) {
        this.healthLeft = healthLeft;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 59 * hash + (this.blockedLocation ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.healthLeft) ^ (Double.doubleToLongBits(this.healthLeft) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", healthLeft=" + healthLeft + '}';
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (this.blockedLocation != other.blockedLocation) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthLeft) != Double.doubleToLongBits(other.healthLeft)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    

}