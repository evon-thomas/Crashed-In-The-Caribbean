/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Map;
import CIT260.crashInTheCaribbean.model.Player;
import CIT260.crashInTheCaribbean.model.Scene;
import CIT260.crashInTheCaribbean.model.Ship;
import CIT260.crashInTheCaribbean.view.StartNewGameView;
import crashinthecaribbean.CrashInTheCaribbean;
import enums.CaribbeanItem;

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
        
        InventoryType traparea = new InventoryType();
        traparea.setDescription("traparea");
        traparea.setAmountAvailable(0);
        traparea.setYouHave(0);
        inventory[CaribbeanItem.traparea.ordinal()] = traparea;
        
        InventoryType buildShipShore = new InventoryType();
        buildShipShore.setDescription("BuildShipShore");
        buildShipShore.setAmountAvailable(0);
        buildShipShore.setYouHave(0);
        inventory[CaribbeanItem.buildShipShore.ordinal()] = buildShipShore;
        
        InventoryType startingPoint = new InventoryType();
        startingPoint.setDescription("StartingPoint");
        startingPoint.setAmountAvailable(0);
        startingPoint.setYouHave(0);
        inventory[CaribbeanItem.startingPoint.ordinal()] = startingPoint;
        
        InventoryType bow = new InventoryType();
        bow.setDescription("Bow and Arrow");
        bow.setAmountAvailable(2);
        bow.setYouHave(0);
        inventory[CaribbeanItem.bow.ordinal()] = bow;
        
        InventoryType bazooka = new InventoryType();
        bazooka.setDescription("bazooka");
        bazooka.setAmountAvailable(2);
        bazooka.setYouHave(0);
        inventory[CaribbeanItem.bazooka.ordinal()] = bazooka;
        
        InventoryType SawZaw = new InventoryType();
        SawZaw.setDescription("SawZaw");
        SawZaw.setAmountAvailable(1);
        SawZaw.setYouHave(0);
        inventory[CaribbeanItem.SawZaw.ordinal()] = SawZaw;
        
        InventoryType Hammer = new InventoryType();
        Hammer.setDescription("Hammer");
        Hammer.setAmountAvailable(1);
        Hammer.setYouHave(0);
        inventory[CaribbeanItem.Hammer.ordinal()] = Hammer;
        
        InventoryType NailsGlue = new InventoryType();
        NailsGlue.setDescription("NailsGlue");
        NailsGlue.setAmountAvailable(1);
        NailsGlue.setYouHave(0);
        inventory[CaribbeanItem.NailsGlue.ordinal()] = NailsGlue;
        
        InventoryType overLook = new InventoryType();
        overLook.setDescription("overLook");
        overLook.setAmountAvailable(0);
        overLook.setYouHave(0);
        inventory[CaribbeanItem.overLook.ordinal()] = overLook;
        
        InventoryType facetrap = new InventoryType();
        facetrap.setDescription("facetrap");
        facetrap.setAmountAvailable(0);
        facetrap.setYouHave(0);
        inventory[CaribbeanItem.facetrap.ordinal()] = facetrap;
        
        InventoryType facebeast = new InventoryType();
        facebeast.setDescription("facebeast");
        facebeast.setAmountAvailable(0);
        facebeast.setYouHave(0);
        inventory[CaribbeanItem.facebeast.ordinal()] = facebeast;
        
        InventoryType findweapon = new InventoryType();
        findweapon.setDescription("findweapon");
        findweapon.setAmountAvailable(0);
        findweapon.setYouHave(0);
        inventory[CaribbeanItem.findweapon.ordinal()] = findweapon;
        
        InventoryType findtool = new InventoryType();
        findtool.setDescription("findtool");
        findtool.setAmountAvailable(0);
        findtool.setYouHave(0);
        inventory[CaribbeanItem.findtool.ordinal()] = findtool;
        
        InventoryType Rambo = new InventoryType();
        Rambo.setDescription("Rambo");
        Rambo.setAmountAvailable(0);
        Rambo.setYouHave(0);
        inventory[CaribbeanItem.Rambo.ordinal()] = Rambo;
        
        InventoryType Neo = new InventoryType();
        Neo.setDescription("Neo");
        Neo.setAmountAvailable(0);
        Neo.setYouHave(0);
        inventory[CaribbeanItem.Neo.ordinal()] = Neo;
        
        InventoryType KungFuPanda = new InventoryType();
        KungFuPanda.setDescription("KungFuPanda");
        KungFuPanda.setAmountAvailable(0);
        KungFuPanda.setYouHave(0);
        inventory[CaribbeanItem.KungFuPanda.ordinal()] = KungFuPanda;
        
        InventoryType axe = new InventoryType();
        axe.setDescription("Axe");
        axe.setAmountAvailable(1);
        axe.setYouHave(0);
        inventory[CaribbeanItem.axe.ordinal()] = axe;
        
//        InventoryItem lumber = new InventoryItem();
//        lumber.setDescription("Lumber");
//        lumber.setQuantityInStock(0);
//        lumber.setRequiredAmount(0);
//        inventory[Item.lumber.ordinal()] = lumber;
//        
        
       return inventory;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
            System.out.println("\n print the map or location, find me on GameControl.");
    }
    
        public static InventoryType[] getSortedInventoryList() {
        
        // get inventory list for the current game
        InventoryType[] originalInventoryList = 
                CrashInTheCaribbean.getCurrentGame().getInventory();
        
        // clone (make a copy) orignalList
        InventoryType[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        InventoryType tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }
    
        public static Location[][] getMapLocations(){
            return CrashInTheCaribbean.getCurrentGame().getMap().getLocations();
        }
}
