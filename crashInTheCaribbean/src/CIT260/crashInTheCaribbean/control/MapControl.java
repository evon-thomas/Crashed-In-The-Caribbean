/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Scene;

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
        System.out.print("the create scene function");
        Scene[] createScenes = null;
        return createScenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        
    }

    static void moveCharacterToStatingLocation(Map map) {
      System.out.println("one more step");
    }
    
}
