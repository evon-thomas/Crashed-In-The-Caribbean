/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Scene;
import CIT260.crashInTheCaribbean.model.SceneType;
import static CIT260.crashInTheCaribbean.model.SceneType.overLook;
import crashinthecaribbean.CrashInTheCaribbean;
import java.awt.Point;
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
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        
        Scene overLook = new Scene();
        overLook.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        overLook.setMapSymbol("OL");
        overLook.setTravelTime(20);
        overLook.setBlocked(false);
        scenes[SceneType.overLook.ordinal()] = overLook;
        
         Scene findTool = new Scene();
        findTool.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        findTool.setMapSymbol("FT");
        findTool.setTravelTime(10);
        findTool.setBlocked(false);
        scenes[SceneType.findTool.ordinal()] = findTool;
        
         Scene findWeapon = new Scene();
        findWeapon.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        findWeapon.setMapSymbol("FW");
        findWeapon.setTravelTime(20);
        findWeapon.setBlocked(true);
        scenes[SceneType.findWeapon.ordinal()] = findWeapon;
        
         Scene faceBeast = new Scene();
        faceBeast.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        faceBeast.setMapSymbol("FB");
        faceBeast.setTravelTime(20);
        faceBeast.setBlocked(false);
        scenes[SceneType.faceBeast.ordinal()] = faceBeast;
        
         Scene faceTrap = new Scene();
        faceTrap.setDescription("Pause for a moment and think on teh ourney you are about to start.");
        faceTrap.setMapSymbol("FTP");
        faceTrap.setTravelTime(10);
        faceTrap.setBlocked(false);
        scenes[SceneType.faceTrap.ordinal()] = faceTrap;
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.overLook.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.findTool.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.findWeapon.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.faceBeast.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.faceTrap.ordinal()]);
        
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
        locations[1][8].setScene(scenes[SceneType.overLook.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.overLook.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.overLook.ordinal()]);
   }

    public static void moveCharacterToStatingLocation(Map map, Character[] characters) {
      System.out.println("one more step, find me on the mapControl");
//        Game game = CrashInTheCaribbean.getCurrentGame();
//        for (Character character : characters){
//            Point position = new Point(0, 2);
//            game.getCharactersLocation()[character.ordinal()]= new Point();
//            MapControl.moveCharacterToLocation(game, character, position);
        }

//    }

//    static void moveCharacterToStatingLocation(Map map) {
//        System.out.println("Hoping to make this game work, find me on MapControl");
//    }
//    
}
