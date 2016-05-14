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
public class Weapons {
    
    private String buildWeapon;
    private String useWeapon;

    public Weapons() {
    }
    
    

    public String getBuildWeapon() {
        return buildWeapon;
    }

    public void setBuildWeapon(String buildWeapon) {
        this.buildWeapon = buildWeapon;
    }

    public String getUseWeapon() {
        return useWeapon;
    }

    public void setUseWeapon(String useWeapon) {
        this.useWeapon = useWeapon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.buildWeapon);
        hash = 59 * hash + Objects.hashCode(this.useWeapon);
        return hash;
    }

    @Override
    public String toString() {
        return "Weapons{" + "buildWeapon=" + buildWeapon + ", useWeapon=" + useWeapon + '}';
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
        final Weapons other = (Weapons) obj;
        if (!Objects.equals(this.buildWeapon, other.buildWeapon)) {
            return false;
        }
        if (!Objects.equals(this.useWeapon, other.useWeapon)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
