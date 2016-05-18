/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  
 */
package crashinthecaribbean;

import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Player;
import CIT260.crashInTheCaribbean.model.Resources;
import CIT260.crashInTheCaribbean.model.Scene;
import CIT260.crashInTheCaribbean.model.Ship;
import CIT260.crashInTheCaribbean.model.Tool;
import CIT260.crashInTheCaribbean.model.Weapons;

/**
 *
 * @author josecovarrubias 
 */
public class CrashInTheCaribbean {

    /**
     * @param args the command line arguments
     */
    public static void  main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Jason Born");
        playerOne.setBestTime(7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //location
        Location locationOne = new Location();
        locationOne.setRow(1);
        locationOne.setColumn(2);
        locationOne.setVisited(true);
        locationOne.setAmountRemaning(10);
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);  
        
        //map
        Map newMap = new Map();
        newMap.setRowCount(2);
        newMap.setColumnCount(3);
        String newMapInfo = newMap.toString();
        System.out.println(newMapInfo);
        
        //Reseurces
        Resources newResources = new Resources();
        newResources.setMakeResources(true);
        newResources.setUseResource(false);
        String ressInfo = newResources.toString();
        System.out.println(ressInfo);
        
        //Scene
        Scene newScene = new Scene();
        newScene.setDescription("select Location");
        newScene.setTravelTime(5.0);
        newScene.setBlockedLocation(true);
        newScene.setHealthLeft(15);
        String SceneInfo = newScene.toString();
        System.out.println(SceneInfo);
        
        //Ship
        Ship ship1 = new Ship();
        ship1.setDescription("Escape ship");
        ship1.setLength(12);
        ship1.setSqFtOfSail(84);
        ship1.setWidth(7);
        String shipInfo = ship1.toString();
        System.out.println(shipInfo);
        
        //Tool
        Tool newTool = new Tool();
        newTool.setMakeTool(true);
        newTool.setUseTool(true);
        String toolInfo = newTool.toString();
        System.out.println(toolInfo);
        
        //weapons
        Weapons weapon1 = new Weapons();
        weapon1.setBuildWeapon("Spear");
        weapon1.setUseWeapon("Attack");
        String weaponInfo = weapon1.toString();
        System.out.println(weaponInfo);
        
        //Inventory Type
        InventoryType newInvent = new InventoryType();
        newInvent.setAmountAvailable(12);
        newInvent.setInventoryType("Spear, tool, Ship, resources.");
        String invType = newInvent.toString();
        System.out.println(invType);
        
        //Game
        Game newGame= new Game();
        newGame.setStartGame(true);
        newGame.setTotalTime(10.5);
        String gameInfo = newGame.toString();
        System.out.println(gameInfo);
        
        //
        
    }
}
