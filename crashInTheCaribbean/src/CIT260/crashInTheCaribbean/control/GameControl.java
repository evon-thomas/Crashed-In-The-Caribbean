/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Player;
import crashinthecaribbean.CrashInTheCaribbean;

/**
 *
 * @author josecovarrubias
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static Player createPlayer(String name) {
//      System.out.println("\n*** createPlayer() function called ***");
//      return new Player();

        if(name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        CrashInTheCaribbean.setPlayer(player); // save the player
        
        return player;
        
    }
    
}
