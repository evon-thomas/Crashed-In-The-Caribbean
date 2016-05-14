/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import java.io.Serializable;

/**
 *
 * @author josecovarrubias
 */
public class Location implements Serializable{
    
    // class instnace variables
    private double row;
    private double column;
    private bolean visited;
    private double amountRemaning;

    public Location() {
    }
    
    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public bolean getVisited() {
        return visited;
    }

    public void setVisited(bolean visited) {
        this.visited = visited;
    }

    public double getAmountRemaning() {
        return amountRemaning;
    }

    public void setAmountRemaning(double amountRemaning) {
        this.amountRemaning = amountRemaning;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaning=" + amountRemaning + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        return true;
    }

    private static class bolean {

        public bolean() {
        }
    }
 
}
