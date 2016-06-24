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
public enum Tool implements Serializable{
    
    // our enum array
    SawZaw("Use this automatic wood cutter to cut the wood"),
    Hammer("Use this tool to hammer nails"),
    NailsGlue("Use nails and glue to seam the boat");
    
    
    private final String description;
    private final InventoryType useTool;

 
    
    Tool(String description) {
        this.description = description;
        useTool = new InventoryType();
    }
    
    

    public String getDescription() {
        return description;
    }

//    public void setMakeTool(boolean makeTool) {
//        this.makeTool = makeTool;
    }

//    public InventoryType getUseTool() {
//        return useTool;
//    }

//    public void setUseTool(boolean useTool) {
//        this.useTool = useTool;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 89 * hash + (this.makeTool ? 1 : 0);
//        hash = 89 * hash + (this.useTool ? 1 : 0);
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Tool{" + "makeTool=" + makeTool + ", useTool=" + useTool + '}';
//    }
    
    

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
//        final Tool other = (Tool) obj;
//        if (this.makeTool != other.makeTool) {
//            return false;
//        }
//        if (this.useTool != other.useTool) {
//            return false;
//        }
//        return true;
//    }
//    
//    
//

