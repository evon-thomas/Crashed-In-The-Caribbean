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
public class Tool implements Serializable{
    
    private boolean makeTool;
    private boolean useTool;

    public Tool() {
    }
    
    

    public boolean isMakeTool() {
        return makeTool;
    }

    public void setMakeTool(boolean makeTool) {
        this.makeTool = makeTool;
    }

    public boolean isUseTool() {
        return useTool;
    }

    public void setUseTool(boolean useTool) {
        this.useTool = useTool;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.makeTool ? 1 : 0);
        hash = 89 * hash + (this.useTool ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Tool{" + "makeTool=" + makeTool + ", useTool=" + useTool + '}';
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
        final Tool other = (Tool) obj;
        if (this.makeTool != other.makeTool) {
            return false;
        }
        if (this.useTool != other.useTool) {
            return false;
        }
        return true;
    }
    
    
}
