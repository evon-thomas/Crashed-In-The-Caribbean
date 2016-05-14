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
public class AvoidTraps implements Serializable{
    
    private String left;
    private String right;
    private String under;
    private String above;
    private String dodge;

    public AvoidTraps() {
    }
    
    

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getUnder() {
        return under;
    }

    public void setUnder(String under) {
        this.under = under;
    }

    public String getAbove() {
        return above;
    }

    public void setAbove(String above) {
        this.above = above;
    }

    public String getDodge() {
        return dodge;
    }

    public void setDodge(String dodge) {
        this.dodge = dodge;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.left);
        hash = 53 * hash + Objects.hashCode(this.right);
        hash = 53 * hash + Objects.hashCode(this.under);
        hash = 53 * hash + Objects.hashCode(this.above);
        hash = 53 * hash + Objects.hashCode(this.dodge);
        return hash;
    }

    @Override
    public String toString() {
        return "AvoidTraps{" + "left=" + left + ", right=" + right + ", under=" + under + ", above=" + above + ", dodge=" + dodge + '}';
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
        final AvoidTraps other = (AvoidTraps) obj;
        if (!Objects.equals(this.left, other.left)) {
            return false;
        }
        if (!Objects.equals(this.right, other.right)) {
            return false;
        }
        if (!Objects.equals(this.under, other.under)) {
            return false;
        }
        if (!Objects.equals(this.above, other.above)) {
            return false;
        }
        if (!Objects.equals(this.dodge, other.dodge)) {
            return false;
        }
        return true;
    }
    
    
    
}
