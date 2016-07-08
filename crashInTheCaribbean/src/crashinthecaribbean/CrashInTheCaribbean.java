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
import CIT260.crashInTheCaribbean.model.AvoidBeasts;
import CIT260.crashInTheCaribbean.model.Character;
import CIT260.crashInTheCaribbean.model.AvoidTraps;
import CIT260.crashInTheCaribbean.view.StartProgramView;

import java.io.IOException;
import java.io.InputStreamReader;

////////////////////////////////////////////////////////////////////////////////
// lesson 11.1
import java.io.PrintWriter;
import java.io.BufferedReader;
////////////////////////////////////////////////////////////////////////////////

/**
 *
 * @author josecovarrubias 
 */
public class CrashInTheCaribbean {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static PrintWriter logFile = null;
    private static BufferedReader inFile= null;

        /**
         * @param args the command line arguments
         */
    public static void  main(String[] args) {
        
        // create StartProgramViewOrig and display the start prgm view
//        StartProgramView startProgramView = new StartProgramView();
//        startProgramView.displayStartProgramView();
        
        
         try {
            
            // open charcter stream files for end user input and output
            CrashInTheCaribbean.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            CrashInTheCaribbean.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "LogFile.txt";
            CrashInTheCaribbean.logFile = new PrintWriter(filePath);


//            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return; 

        } catch (Throwable e) {
              
                System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();;
        }

        finally {
            try {
                if (CrashInTheCaribbean.inFile != null)
                    CrashInTheCaribbean.inFile.close();
                
                if (CrashInTheCaribbean.outFile != null)
                    CrashInTheCaribbean.outFile.close();
                
                if (CrashInTheCaribbean.logFile != null)
                    CrashInTheCaribbean.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }   
        }

    }

        public static Game getCurrentGame() {
            return currentGame;
        }

        public static void setCurrentGame(Game currentGame) {
            CrashInTheCaribbean.currentGame = currentGame;
        }

        public static Player getPlayer() {
            return player;
        }

        public static void setPlayer(Player player) {
            CrashInTheCaribbean.player = player;
        }
////////////////////////////////////////////////////////////////////////////////
        // Lesson 11.2
////////////////////////////////////////////////////////////////////////////////
    public static PrintWriter getOutFile() {
        return outFile;
    }
    public static void setOutFile(PrintWriter outFile){
    CrashInTheCaribbean.outFile = outFile;
    }
    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CrashInTheCaribbean.inFile = inFile;
    }
//////////////////////////////////////////////////////////////////////////////// 
////////////////////////////////////////////////////////////////////////////////
        public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CrashInTheCaribbean.logFile = logFile;
    }
     /*Player playerOne = new Player();
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

    //Resources
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
    Game newGame = new Game();
    newGame.setStartGame(true);
    newGame.setTotalTime(10.5);
    String gameInfo = newGame.toString();
    System.out.println(gameInfo);

    //Avoid Beasts
    AvoidBeasts beast1 = new AvoidBeasts();
    beast1.setAttack(true);
    beast1.setShield(true);
    String beastInfo = beast1.toString();
    System.out.println(beastInfo);

    // Avoid Traps
    AvoidTraps trap1 = new AvoidTraps();
    trap1.setLeft("left");
    trap1.setRight("right");
    trap1.setUnder("under");
    trap1.setAbove("above");
    trap1.setDodge("dodge");
    String trapInfo = trap1.toString();
    System.out.println(trapInfo);

    // Character
    Character character1 = new Character();
    character1.setName("Jason Born");
    character1.setCoordinates(23);
    character1.setDescription("You woke up not knowing where you are. You ought to find clues and get out of theisland.");
    String characterInfo = character1.toString();
    System.out.println(characterInfo);      
*/ 
   
}
