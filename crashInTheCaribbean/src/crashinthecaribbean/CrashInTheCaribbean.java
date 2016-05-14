/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  
 */
package crashinthecaribbean;

import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Player;

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
        
        Location scene = new Location();
        
        scene.setRow(1);
        scene.setColumn(1);
        scene.setVisited(scene);
        scene.setAmountRemaning(10);
        
        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);
    }
    
    
}
