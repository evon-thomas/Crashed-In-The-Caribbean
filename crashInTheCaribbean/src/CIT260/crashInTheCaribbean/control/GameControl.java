/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Player;
import CIT260.crashInTheCaribbean.model.Ship;
import CIT260.crashInTheCaribbean.view.StartNewGameView;
import crashinthecaribbean.CrashInTheCaribbean;

/**
 *
 * @author josecovarrubias
 */
public class GameControl {
    
//public static void createNewGame(Player player) {
//        
//        StartNewGameView startNewGameView = new StartNewGameView();
//        startNewGameView.displayStartNewGameView();
//}

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

//    public void display() {
//        StartNewGameView startNewGameView = new StartNewGameView();
//        startNewGameView.display();
//    }

   public static void createNewGame(Player player){
       Game game = new Game();
       CrashInTheCaribbean.setCurrentGame(game);
       
       game.setPlayer(player);
       
       InventoryType[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Ship ship = new Ship();
       game.setShip(ship);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveCharacterToStatingLocation(map);
   }

    private static InventoryType[] createInventoryList() {
//        System.out.println(" we are getting close");

        InventoryType[] inventory = new InventoryType[17];
        
        InventoryType axe = new InventoryType();
        axe.setInventoryType("Axe");
        axe.setAmountAvailable(0);
        inventory[0] = axe;
        
        InventoryType axe = new InventoryType();
        axe.setInventoryType("Axe");
        axe.setAmountAvailable(0);
        inventory[0] = axe;
        
        InventoryType axe = new InventoryType();
        axe.setInventoryType("Axe");
        axe.setAmountAvailable(0);
        inventory[0] = axe;
        
        InventoryType bow = new InventoryType();
        bow.setInventoryType("Bow and Arrow");
        bow.setAmountAvailable(0);
        inventory[0] = bow;
        
        InventoryType bazooka = new InventoryType();
        bazooka.setInventoryType("bazooka");
        bazooka.setAmountAvailable(0);
        inventory[0] = bazooka;
        
        InventoryType SawZaw = new InventoryType();
        SawZaw.setInventoryType("SawZaw");
        SawZaw.setAmountAvailable(0);
        inventory[0] = SawZaw;
        
        InventoryType Hammer = new InventoryType();
        Hammer.setInventoryType("Hammer");
        Hammer.setAmountAvailable(0);
        inventory[0] = Hammer;
        
        InventoryType NailsGlue = new InventoryType();
        NailsGlue.setInventoryType("NailsGlue");
        NailsGlue.setAmountAvailable(0);
        inventory[0] = NailsGlue;
        
        InventoryType overLook = new InventoryType();
        overLook.setInventoryType("overLook");
        overLook.setAmountAvailable(0);
        inventory[0] = overLook;
        
        InventoryType facetrap = new InventoryType();
        facetrap.setInventoryType("facetrap");
        facetrap.setAmountAvailable(0);
        inventory[0] = facetrap;
        
        InventoryType facebeast = new InventoryType();
        facebeast.setInventoryType("facebeast");
        facebeast.setAmountAvailable(0);
        inventory[0] = facebeast;
        
        InventoryType findweapon = new InventoryType();
        findweapon.setInventoryType("findweapon");
        findweapon.setAmountAvailable(0);
        inventory[0] = findweapon;
        
        InventoryType findtool = new InventoryType();
        findtool.setInventoryType("findtool");
        findtool.setAmountAvailable(0);
        inventory[0] = findtool;
        
        InventoryType Rambo = new InventoryType();
        Rambo.setInventoryType("Rambo");
        Rambo.setAmountAvailable(0);
        inventory[0] = Rambo;
        
        InventoryType Neo = new InventoryType();
        Neo.setInventoryType("Neo");
        Neo.setAmountAvailable(0);
        inventory[0] = Neo;
        
        InventoryType KungFuPanda = new InventoryType();
        KungFuPanda.setInventoryType("KungFuPanda");
        KungFuPanda.setAmountAvailable(0);
        inventory[0] = KungFuPanda;
        
        InventoryType axe = new InventoryType();
        axe.setInventoryType("Axe");
        axe.setAmountAvailable(0);
        inventory[0] = axe;
        
        
       return null;
    }
    
}
