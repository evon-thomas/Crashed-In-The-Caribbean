/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.BuildControl;
import CIT260.crashInTheCaribbean.control.GameControl;
import CIT260.crashInTheCaribbean.control.SceneControl;
import CIT260.crashInTheCaribbean.exceptions.BuildShipException;

import CIT260.crashInTheCaribbean.model.Game;
import CIT260.crashInTheCaribbean.model.InventoryType;
import CIT260.crashInTheCaribbean.model.Location;
import CIT260.crashInTheCaribbean.model.Scene;
import CIT260.crashInTheCaribbean.model.SceneType;
import CIT260.crashInTheCaribbean.model.Weapons;
import crashinthecaribbean.CrashInTheCaribbean;
import enums.WeaponPower;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author thomas
 */
public class GameMenuView extends View{
    
//        public void displayMenu() {
//        System.out.println("\n*** game menu view from view layer called ***");
    
    
//     private int howLong;
//     private int howWide;
//     private int howTall;
     
        
    public GameMenuView(){
    
//        this.menu = "\n"
             super( "\n"
                    + "\n------------------------------------------------------"
                    + "\n |                    Game menu                      |"
                    + "\n------------------------------------------------------"
                    + "\n M - View map."
                    + "\n W - View weapons."
                    + "\n I - View inventory."
                    + "\n L - Move location."
                    + "\n C - View player characters."
                    + "\n T - View Scene Type"
                    + "\n S - Sort Scene Type"
                    + "\n B - build ship."
                    + "\n Q - Quit"
                    + "\n-----------------------------------------------------");
    }

    @Override
    public boolean doAction(String menuOption) {
               menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "M": //
               this.displayMap();
               break;
           case "W": //
               this.viewWeapons();
               break;
               
           case "I": //
               this.ViewInventory();
               break;
               
           case "L": // 
               this.moveLocation();
               break;
            
           case "C": //
               this.playerCharacters();
               break;
            
            case "T": //
               this.viewSceneType();
               break;
               
            case "S": //
               this.SceneTypeSort();
               break;
               
             case "B": //
               this.buildShip();
               break;
       
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
  }
 ///////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////  
 ////////////////////////////////////////////////////////////////////////////////  
        // ************INDIVIDUAL ASSIGNMENT LESSON 10. JOSE.***********************
    private void buildShip(){
        int buildNewShip = 0;
        System.out.println("How LONG do you want the ship to be? enter a number");
        Scanner longship = new Scanner(System.in);
        int longShip = longship.nextInt();
        
        System.out.println("How WIDE do you want the ship to be? enter a number");
        Scanner wideShip = new Scanner(System.in);
        int shipWide = wideShip.nextInt();
        
        System.out.println("How TALL do you want the ship to be? enter a number");
        Scanner tallShip = new Scanner(System.in);
        int shipTall = tallShip.nextInt();
        
        BuildControl newShip = new BuildControl();
        
        try{
        buildNewShip = (int) newShip.build(longShip, shipWide, shipTall);
        }catch(BuildShipException bse){
            System.out.println(bse.getMessage());
        }catch(Throwable bst){
            System.out.println(bst.getMessage());
            bst.printStackTrace();
        }
        
        System.out.println("YOUR BOAT IS >" + buildNewShip + "< CUBIC FEET.");
    }
 ///////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////  
 ////////////////////////////////////////////////////////////////////////////////  
        // ************INDIVIDUAL ASSIGNMENT LESSON 9. JOSE.***********************
    
        // private function to display the weapons
        public void viewWeapons(){
            WeaponPower[] weapons = WeaponPower.values();
//              System.out.println(GameMenuView.fixOrder(weapons));

            // trhis line calls the WeaponPower enum array, and stores the value
            // in the variable weaponAval. 
            WeaponPower[] weaponAval = WeaponPower.values();
            
            // this is a for-each loop to show all of the items, the 1st word is the
            // array, 2nd word can be anything you want, it becomes a new variable
            // the 3rd word is the array variable declared avobe. the \t adds a tab space. 
            System.out.println("WEAPON"+"\t       POWER");
            for(WeaponPower crazyNameHere : weaponAval){
                
            //this is to get the value of the items, see WeaponPower class
                System.out.println(crazyNameHere + ":      \t" + crazyNameHere.getWpower());
                
            }
           
        }
    public static int[] fixOrder(int[] weapons){ 
            for (int i=0; i <weapons.length; i++){
                int index = i;
                for (int j=i+1; j <weapons.length; j++)
                    if (weapons[j] < weapons[index])
                        index = j;
                    int smallerNum = weapons[index];
                    weapons[index] = weapons[i];
                    weapons[i] = smallerNum;
                System.out.println(i);
            }
            System.out.println(GameMenuView.fixOrder(weapons));
            return weapons;
        }
////////////////////////////////////////////////////////////////////////////////   
////////////////////////////////////////////////////////////////////////////////  
 //////////////////////////////////////////////////////////////////////////////// 
        
    // individual assigment lesson9 Karla
    public void viewSceneType(){
        
//        SceneType sceneType = new SceneType () {
//         
//        sceneType.display();
//    }
       // SceneType sceneType[] = SceneType.values();
                
  
        SceneType[] scenesAval = SceneType.values();
        
        System.out.println("Scene" );
        
        for(SceneType sceneName : scenesAval){
            
            System.out.println( sceneName + ":     \t" + sceneName.getDescription());
        }
       }
    
     private void SceneTypeSort() {
   //get sorted list of scenetype */*/*/THIS ONE IS WORKING/*/* or at least no error
        SceneType[] type = GameControl.getSortedSceneList();
        
    }

// */*/this display function was suppoed to call the sort function
    
//            SceneTypeSortControl quickSort = SceneTypeSortContro();
//            quickSort.display();

  
////////////////////////////////////////////////////////////////////////////////   
////////////////////////////////////////////////////////////////////////////////  
 ////////////////////////////////////////////////////////////////////////////////  
    public void displayMap(){
        this.ViewMap(CrashInTheCaribbean.getOutFile());
    }
    
    public void ViewMap(PrintWriter out){
        System.out.println("map func");

////////////////////////////////////////////////////////////////////////////////
//                 THIS WAS OUR ATTEMP TO GET THE MAP TO DISPLAY
//          you can umcomment it out to see the code color references
////////////////////////////////////////////////////////////////////////////////
//        int lineLength = 0;
//        
//        // get the map for the game
//        Location[][] locations = GameControl.getMapLocations();
//        int noColumns = locations[0].length; // get number columns in row
//        
//        this.printTitle(out, noColumns, "CRASH IN THE CARRIBEAN ");
//        this.printColumnHeaders(out, noColumns);
//        
//        for (int i = 0; i < locations.length; i++) {    
//            Location[] rowLocations = locations[i];
//            this.printRowDivider(out, noColumns);
//            out.println(); // move down one i
//            if (i < 9)
//                out.print(" " + (i+1));
//            else 
//                out.print(i+1);
//            
//            // for every column in the row
//            for (int column = 0; column < noColumns; column++) {
//                out.print("|"); // print column divider
//                Location location = rowLocations[column];
//                if (location != null && location.isVisited()) { // if location is visited 
//                    
//                    Scene scene = location.getScene();
//                    if (scene != null)
//                        out.print(scene.getMapSymbol());
//                    else
//                        out.print("    ");
//                }
//                else {
//                    out.print(" ?? ");
//                }      
//            }
//            
//            out.print("|"); // print column divider
//        }
//        
//        this.printRowDivider(out, noColumns);
    }
    
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    
        private void ViewInventory(){
//        System.out.println("inven func");
            StringBuilder line;
            
            Game game = CrashInTheCaribbean.getCurrentGame();
            InventoryType[] inventory = game.getInventory();
            
            System.out.println("\n=========== LIST OF INVENTORY ITEMS ========== ");
            line = new StringBuilder("                                         ");
            line.insert(0, "DESCRIPTION");
            line.insert(20, "REQUIRED");
            line.insert(30, "YOU HAVE");
            System.out.println(line.toString());
            
            
            for (InventoryType item : inventory){
                 line = new StringBuilder("                                   ");
                 line.insert(0, item.getDescription());
                 line.insert(23, item.getAmountAvailable());
                 line.insert(33, item.getInventoryType());
                 
                 System.out.println(line.toString());
                 
            }
            
    }
    private void moveLocation(){
        System.out.println("locat func");
    }
    private void playerCharacters(){
        System.out.println("charc func");
    }
//    private void createNewGame(){
//        GameControl.createNewGame(CrashInTheCaribbean.getPlayer());
//    }
    
    private void printColumnHeaders(PrintWriter out, int columnCount) {
        for (int i = 1; i < columnCount+1; i++) {
            if (i < 10) {
                out.print("   " + i + " ");
            }
            else {
                out.print("  " + i + " ");
            }
        }
    }

    private void printRowDivider(PrintWriter out, int noColumns) {
        out.println();
        out.print("  ");
        for (int i = 0; i < noColumns; i++) { // print row divider
                out.print("-----");
        }
        out.print("-");
    }

    private void printTitle(PrintWriter out, int columnCount, String title) {
        
        int titleLength = title.length();
        int lineLength = columnCount * 5 + 3;
        int startPosition = (lineLength / 2) - (titleLength / 2);
        out.println("\n");
        for (int i = 0; i < startPosition; i++) {
            out.print(" ");  
        }
        out.print(title);
        out.println("\n");
        
    }
    
    
    
     public void printReport() {
        // get the filepath and name of the file
//        this.console.println("\nEnter the file path where the report is to be saved");
        
        String filePath = this.getInput();
        if (filePath == null) {
            return;
        }
        
        // Create a new printwriter
        try (PrintWriter reportFile = new PrintWriter(filePath)) {
            
            
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dateTime = formatter.format(currentTime);
            
            reportFile.println("Report printed: " + dateTime);
            
            this.viewMap(reportFile);
            
            reportFile.println();
            this.viewInventory(reportFile);

            reportFile.println();
            this.viewCharacter(reportFile); 
            
            CrashInTheCaribbean.getOutFile().println(
                    "\n*** Report printed to file: " + filePath + " ***");
            
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", "Error writing to game report file. "
                    + "\n\t" + ex.getMessage());
        }

    }

    private void viewCharacter(PrintWriter reportFile) {
        this.viewCharacter(reportFile);
    }

    private void viewMap(PrintWriter reportFile) {
        this.ViewMap(reportFile);
    }

    private void viewInventory(PrintWriter reportFile) {
       this.viewInventory(reportFile);
    }

   
    private static class ErrorView {

        private static void display(String gameMenuView, String string) {
            
        }

        public ErrorView() {
        }
    }
}
    
        
       
