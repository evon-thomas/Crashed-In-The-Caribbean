/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.exceptions.MapControlException;
import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Scene;
//import CIT260.crashInTheCaribbean.model.SceneType;
//import static CIT260.crashInTheCaribbean.model.SceneType.overLook;
import crashinthecaribbean.CrashInTheCaribbean;
import enums.Characters;
import enums.SceneEnum;
import enums.WhereTo;
import java.awt.Point;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author josecovarrubias
 */
public class MapControl {

    public static Map createMap()  {
        Map map = new Map(20, 20);
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    private static Scene[] createScenes() {
//        System.out.print(" create scene function, find me on the MapControl");

        Game game = CrashInTheCaribbean.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneEnum.values().length];
        
        
        Scene overLook = new Scene();
        overLook.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        overLook.setMapSymbol("OL");
        overLook.setTravelTime(20);
        overLook.setBlocked(false);
        scenes[SceneEnum.overLook.ordinal()] = overLook;
        
        Scene findTool = new Scene();
        findTool.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        findTool.setMapSymbol("FT");
        findTool.setTravelTime(10);
        findTool.setBlocked(false);
        scenes[SceneEnum.findTool.ordinal()] = findTool;
        
         Scene findWeapon = new Scene();
        findWeapon.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        findWeapon.setMapSymbol("FW");
        findWeapon.setTravelTime(20);
        findWeapon.setBlocked(true);
        scenes[SceneEnum.findWeapon.ordinal()] = findWeapon;
        
         Scene faceBeast = new Scene();
        faceBeast.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        faceBeast.setMapSymbol("FB");
        faceBeast.setTravelTime(20);
        faceBeast.setBlocked(false);
        scenes[SceneEnum.faceBeast.ordinal()] = faceBeast;
        
         Scene faceTrap = new Scene();
        faceTrap.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        faceTrap.setMapSymbol("FTP");
        faceTrap.setTravelTime(10);
        faceTrap.setBlocked(false);
        scenes[SceneEnum.faceTrap.ordinal()] = faceTrap;
        
        return scenes;
    }

    private static int assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneEnum.overLook.ordinal()]);
        locations[0][1].setScene(scenes[SceneEnum.findTool.ordinal()]);
        locations[0][2].setScene(scenes[SceneEnum.findWeapon.ordinal()]);
        locations[0][3].setScene(scenes[SceneEnum.faceBeast.ordinal()]);
        locations[0][4].setScene(scenes[SceneEnum.faceTrap.ordinal()]);
        
        HashMap<String, ArrayList<Point>> sceneLocations =  
               new HashMap<String, ArrayList<Point>>();
//
//
//       // create list of scenes to be assigned to locations
       ArrayList<Point> overLookCoordinates = new ArrayList<Point>();
       overLookCoordinates.add(new Point(1,8));
       overLookCoordinates.add(new Point(2,8));
       overLookCoordinates.add(new Point(1,9));
      
       sceneLocations.put("overLook", overLookCoordinates);


       ArrayList<Point> findToolCoordinates = new ArrayList<Point>();
       for (int row = 0; row < 20; row++) {
           findToolCoordinates.add(new Point(row,0));
       }
       for (int row = 0; row < 4; row++) {
           findToolCoordinates.add(new Point(row,1));
       }
       for (int row = 17; row < 20; row++) {
           findToolCoordinates.add(new Point(row,1));
       }
       
        ArrayList<Point> findWeaponCoordinates = new ArrayList<Point>();
       for (int col = 3; col < 11; col++) {
           findWeaponCoordinates.add(new Point(0,col));
       }
       for (int col = 13; col < 20; col++) {
          findWeaponCoordinates.add(new Point(0,col));
       }
       for (int col = 13; col < 20; col++) {
           findWeaponCoordinates.add(new Point(1,col));
       }
       
       findWeaponCoordinates.add(new Point(7,19));
     findWeaponCoordinates.add(new Point(10,19));
       for (int col = 18; col < 20; col++) {
           findWeaponCoordinates.add(new Point(11,col));
       }
       for (int col = 18; col < 20; col++) {
           findWeaponCoordinates.add(new Point(12,col));
       }
       findWeaponCoordinates.add(new Point(13,19));
       for (Point point : findWeaponCoordinates) {
           locations[point.x][point.y].setScene(scenes[Constants.startingPoint]);   
       }
        locations[1][8].setScene(scenes[SceneEnum.overLook.ordinal()]);
        locations[1][9].setScene(scenes[SceneEnum.overLook.ordinal()]);
        locations[2][8].setScene(scenes[SceneEnum.overLook.ordinal()]);
        return 0;
   }

    public static void moveCharacterToStatingLocation(Map map, Characters[] characters) throws MapControlException{
//      System.out.println("one more step, find me on the mapControl");
        Game game = CrashInTheCaribbean.getCurrentGame();
        for (Characters character : characters){
            Point position = new Point(0, 2);
            game.getCharactersLocation()[character.ordinal()] = new Point();
            MapControl.moveCharacterToLocation(game, character, position);
        }

    }
      
    public static Point moveCharacter(Characters character, WhereTo direction, int distance) 
                            throws MapControlException {
        
        Point blockedLocation = null;
        
        if (character == null  || direction == null  || distance < 1) {
            throw new InvalidParameterException("Character, direction or distance is invalid");
        }
        
        Game game = CrashInTheCaribbean.getCurrentGame();    
        Map map = CrashInTheCaribbean.getCurrentGame().getMap();
        Point currentPosition = game.getCharactersLocation()[character.ordinal()];
        Point newPosition = null;
        
        if (currentPosition == null) {
            throw new MapControlException("Character is currently is not assigned "
                                          + "to a location");
        }
        
        int currentRow = currentPosition.x;
        int currentColumn = currentPosition.y;

        if (currentRow < 0  || currentRow >= map.getRowCount() ||
            currentColumn < 0  || currentColumn >= map.getColumnCount()) {
            throw new MapControlException("Character is currently in an invalid "
                                          + "location");
        }
        
        // get new position
        int newRow = currentPosition.x + (direction.getxIncrement() * distance);
        int newColumn = currentPosition.y + (direction.getyIncrement() * distance);
        
                   
        if (newRow < 0  || newRow >= map.getRowCount() ||
            newColumn < 0  || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Trying to move Character to a location "
                                          + "outside bounds of the map");
        }  
        
        
        // Check to see if the path is blocked
        boolean blocked = false;
        Location[][] locations = map.getLocations();
        
        int noOfRows = (newRow - currentRow) * direction.getxIncrement();
        int row = currentRow + direction.getxIncrement();      
        for (int i = 0; i < noOfRows; i++ ) {
            locations[row][currentColumn].setVisited(true);
            
            if (locations[row][currentColumn].getScene().isBlocked()){   
                blocked = true;
                newRow = row - direction.getxIncrement();
                blockedLocation = new Point(row+1, currentColumn+1);
                break;
            }
            
            row += direction.getxIncrement();
        }
        
        
        int noOfColumns = (newColumn - currentColumn) * direction.getyIncrement();
        int column = currentColumn + direction.getyIncrement();       
        for (int i = 0; i < noOfColumns; i++ ) {
            locations[currentRow][column].setVisited(true);

            if (locations[currentRow][column].getScene().isBlocked()){ 
                blocked = true;
                newColumn = column - direction.getyIncrement();
                blockedLocation = new Point(currentRow+1, column+1);
                break;
            }  
            column += direction.getyIncrement();
        } 
        
        
        if (currentRow != newRow || currentColumn != newColumn) {
            Location currentLocation = map.getLocations()[currentRow][currentColumn];
            currentLocation.removeCharacter(character); // remove actor from old location

            // set actor to new location
            newPosition = new Point(newRow, newColumn);
            MapControl.moveCharacterToLocation(game, character, newPosition);
        }

        
        return blockedLocation;
    }
        public static void moveCharacterToLocation(Game game, Characters character, Point position) 
            throws MapControlException {
//        System.out.println("move character to location funct");
        Map map = game.getMap();
        
        Location location = game.getMap().getLocations()[position.x][position.y];
        
        if(position.x < 0 || position.x >= map.getRowCount() ||
                position.y < 0 || position.y >= map.getColumnCount()){
                throw new MapControlException("Your command is trying to move you"
                                             + "outside the map limits");
        }
        location.addCharacter(character);
        
        game.getCharactersLocation()[character.ordinal()].setLocation(position);
        location.setVisited(true);
    }
    public static Location getLocation(Point coordinates){
        return CrashInTheCaribbean.getCurrentGame().getMap().getLocations()[coordinates.x-1][coordinates.y-1];
    }  
}
