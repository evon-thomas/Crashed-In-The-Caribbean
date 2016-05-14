/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import java.util.Objects;

/**
 *
 * @author thomas
 */
public class ConstructWeapon {
    
    
    private String startBuilding;
    private boolean armed;
    private double damage;

    public ConstructWeapon() {
    }
    
    

    public String getStartBuilding() {
        return startBuilding;
    }

    public void setStartBuilding(String startBuilding) {
        this.startBuilding = startBuilding;
    }

    public boolean isArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.startBuilding);
        hash = 41 * hash + (this.armed ? 1 : 0);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ConstructWeapon{" + "startBuilding=" + startBuilding + ", armed=" + armed + ", damage=" + damage + '}';
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
        final ConstructWeapon other = (ConstructWeapon) obj;
        if (this.armed != other.armed) {
            return false;
        }
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        if (!Objects.equals(this.startBuilding, other.startBuilding)) {
            return false;
        }
        return true;
    }
    
    
    
}
