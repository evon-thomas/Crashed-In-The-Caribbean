/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Scene;
import CIT260.crashInTheCaribbean.model.SceneType;
import static CIT260.crashInTheCaribbean.model.SceneType.overLook;

/**
 *
 * @author josecovarrubias
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(20, 20);
        Scene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        System.out.print(" create scene function, find me on the MapControl");
//
//
//        Scene[] scenes = new Scene[SceneType.values().length];
////        Scene overLook = new Scene();
//        overLook.setDescription("This is where the scene list shold appear. ");
        return null;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.overLook.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.findTool.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.findWeapon.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.faceBeast.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.faceTrap.ordinal()]);
        
    }

    static void moveCharacterToStatingLocation(Map map) {
      System.out.println("one more step, find me on teh mapControl");
    }
    
}
