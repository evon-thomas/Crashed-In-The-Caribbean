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
public class AvoidBeasts implements Serializable{
    
    private boolean attack;
    private boolean shield;

    public AvoidBeasts() {
    }
    
    

    public boolean isAttack() {
        return attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.attack ? 1 : 0);
        hash = 29 * hash + (this.shield ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AvoidBeasts{" + "attack=" + attack + ", shield=" + shield + '}';
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
        final AvoidBeasts other = (AvoidBeasts) obj;
        if (this.attack != other.attack) {
            return false;
        }
        if (this.shield != other.shield) {
            return false;
        }
        return true;
    }
    
    
}
