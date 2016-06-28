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
public enum Weapons implements Serializable{
    
        // our enum array
    Axe("Use this weapon also for chopping wood."),
    Bow("These two will help you avoid beasts and fight back."),
    bazooka("This weapon will fry your dinner.");
    
    private final String description;
//    private final Boolean useWeapon;

     Weapons(String description) {
        this.description = description;
//        useWeapon = false;
    }
    
    

    public String getdescription() {
        return description;
    }

//    public void setBuildWeapon(String buildWeapon) {
//        this.buildWeapon = buildWeapon;
//    }

//    public Boolean getUseWeapon() {
//        return useWeapon;
//    }

//    public void setUseWeapon(String useWeapon) {
//        this.useWeapon = useWeapon;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 59 * hash + Objects.hashCode(this.buildWeapon);
//        hash = 59 * hash + Objects.hashCode(this.useWeapon);
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Weapons{" + "buildWeapon=" + buildWeapon + ", useWeapon=" + useWeapon + '}';
//    }
    
    
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
//        final Weapons other = (Weapons) obj;
//        if (!Objects.equals(this.buildWeapon, other.buildWeapon)) {
//            return false;
//        }
//        if (!Objects.equals(this.useWeapon, other.useWeapon)) {
//            return false;
//        }
//        return true;
//    }
//    
    
    
    
    
}
