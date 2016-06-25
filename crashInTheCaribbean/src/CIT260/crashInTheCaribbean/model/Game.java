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
public class Game implements Serializable{
    
    // class instance variables
    private boolean startGame;
    private double totalTime;
    private Ship ship;

    private InventoryType[] inventory;
    public Game() {
    }

    
    public boolean isStartGame() {
        return startGame;
    }

    public void setStartGame(boolean startGame) {
        this.startGame = startGame;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public InventoryType[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryType[] inventory) {
        this.inventory = inventory;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.startGame ? 1 : 0);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "startGame=" + startGame + ", totalTime=" + totalTime + '}';
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
        final Game other = (Game) obj;
        if (this.startGame != other.startGame) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }
    
    
    
}