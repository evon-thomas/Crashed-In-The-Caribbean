/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import java.io.Serializable;

/**
 *
 * @author thomas
 */

public class Barrel implements Serializable{

    private boolean makeBarrel;
    private boolean useBarrel;

    public Barrel() {
    }
    
    

    public boolean isMakeBarrel() {
        return makeBarrel;
    }

    public void setMakeBarrel(boolean makeBarrel) {
        this.makeBarrel = makeBarrel;
    }

    public boolean isUseBarrel() {
        return useBarrel;
    }

    public void setUseBarrel(boolean useBarrel) {
        this.useBarrel = useBarrel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.makeBarrel ? 1 : 0);
        hash = 89 * hash + (this.useBarrel ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Barrel{" + "makeBarrel=" + makeBarrel + ", useBarrel=" + useBarrel + '}';
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
        final Barrel other = (Barrel) obj;
        if (this.makeBarrel != other.makeBarrel) {
            return false;
        }
        if (this.useBarrel != other.useBarrel) {
            return false;
        }
        return true;
    }
    
    
}
