/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import enums.Characters;
import enums.SceneEnum;
import java.awt.Point;
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
    private Player player;
    private Map map;
    private Point[] charactersLocation = new Point[Characters.values().length];
    private SceneEnum[] Scene;
    private Character characters;
    
    
    public Game() {
        this.totalTime = 0;
    }

    public Character getCharacters() {
        return characters;
    }

    public void setCharacters(Character characters) {
        this.characters = characters;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
     public Point[] getCharactersLocation() {
        return charactersLocation;
    }
    public void setCharactersLocation(Point[] charactersLocation) {
        this.charactersLocation = charactersLocation;
    }

    public SceneEnum[] getScene() {
        return Scene;
    }

    public void setScene(SceneEnum[] Scene) {
        this.Scene = Scene;
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