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
import enums.Characters;
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
                    + "\n R - Build report."
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
               
            case "R": // to build the report
               this.printReport();
               break;
       
           default:
               ErrorView.display("GameMenuView","Invalid selection *** Try again");
               break;     
       }
       return false;
  }
 ///////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////  
 ////////////////////////////////////////////////////////////////////////////////  
        // ************INDIVIDUAL ASSIGNMENT LESSON 10. JOSE.***********************
    private void buildShip(){
//            BuildShipView newBoat = new BuildShipView();
//            newBoat.display();
//            newBoat.doAction(displayMessage);
        
        int buildNewShip = 0;
        while(buildNewShip ==0){
        this.console.println("How LONG do you want the ship to be? enter a number");
        Scanner longship = new Scanner(System.in);
        int longShip = longship.nextInt();
        
        this.console.println("How WIDE do you want the ship to be? enter a number");
        Scanner wideShip = new Scanner(System.in);
        int shipWide = wideShip.nextInt();
        
        this.console.println("How TALL do you want the ship to be? enter a number");
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
        
        }
        
        this.console.println("YOUR BOAT IS >" + buildNewShip + "< CUBIC FEET.");
    }
 ///////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////  
 ////////////////////////////////////////////////////////////////////////////////  
        // ************INDIVIDUAL ASSIGNMENT LESSON 9. JOSE.***********************
    
        // private function to display the weapons
        public void viewWeapons(){
//            WeaponPower[] weapons = WeaponPower.values();
//              System.out.println(GameMenuView.fixOrder(weapons));

            // trhis line calls the WeaponPower enum array, and stores the value
            // in the variable weaponAval. 
            WeaponPower[] weaponAval = WeaponPower.values();
            
            // this is a for-each loop to show all of the items, the 1st word is the
            // array, 2nd word can be anything you want, it becomes a new variable
            // the 3rd word is the array variable declared avobe. the \t adds a tab space. 
            this.console.println("WEAPON"+"\t       POWER");
            for(WeaponPower crazyNameHere : weaponAval){
                
            //this is to get the value of the items, see WeaponPower class
                this.console.println(crazyNameHere + ":      \t" + crazyNameHere.getWpower());
                
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
            
            this.console.println( sceneName + ":     \t" + sceneName.getDescription());
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
//        this.console.println("map func");

////////////////////////////////////////////////////////////////////////////////
//                 THIS WAS OUR ATTEMP TO GET THE MAP TO DISPLAY
//          you can umcomment it out to see the code color references
////////////////////////////////////////////////////////////////////////////////
        int lineLength = 0;
        
        // get the map for the game
        Location[][] locations = GameControl.getMapLocations();
        int noColumns = locations[0].length; // get number columns in row
        
        this.printTitle(out, noColumns, "CRASH IN THE CARIBBEAN ");
        this.printColumnHeaders(out, noColumns);
        
        for (int i = 0; i < locations.length; i++) {    
            Location[] rowLocations = locations[i];
            this.printRowDivider(out, noColumns);
            out.println(); // move down one i
            if (i < 9)
                out.print(" " + (i+1));
            else 
                out.print(i+1);
            
            // for every column in the row
            for (int column = 0; column < noColumns; column++) {
                out.print("|"); // print column divider
                Location location = rowLocations[column];
                if (location != null && location.isVisited()) { // if location is visited 
                    
                    Scene scene = location.getScene();
                    if (scene != null)
                        out.print(scene.getMapSymbol());
                    else
                        out.print("    ");
                }
                else {
                    out.print(" ?? ");
                }      
            }
            
            out.print("|"); // print column divider
        }
        
        this.printRowDivider(out, noColumns);
    }
    
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    
        private void ViewInventory(){
//        System.out.println("inven func");
            StringBuilder line;
            
            Game game = CrashInTheCaribbean.getCurrentGame();
            InventoryType[] inventory = game.getInventory();
            
            this.console.println("\n=========== LIST OF INVENTORY ITEMS ========== ");
            line = new StringBuilder("                                         ");
            line.insert(0, "DESCRIPTION");
            line.insert(20, "REQUIRED");
            line.insert(30, "YOU HAVE");
            this.console.println(line.toString());
            
            
            for (InventoryType item : inventory){
                 line = new StringBuilder("                                   ");
                 line.insert(0, item.getDescription());
                 line.insert(23, item.getAmountAvailable());
                 line.insert(33, item.getYouHave());
                 
                this.console.println(line.toString());
                 
            }
            
    }
        public void viewInventoryReport (PrintWriter out) {
            out.println("/ List Of Inventory");
            StringBuilder line = new StringBuilder("              ");
            line.insert(0, "Item");
            line.insert(20, "Description");
            line.insert(30, "You have");
            out.println(line.toString());
            InventoryType[] invL = InventoryType.values();
            
            for(InventoryType invN : invL){
                line = new StringBuilder("                       ");
            line.insert(0, invN.list());
            line.insert(20, invN.getDescription());
            line.insert(30, invN.getAmountAvailable());
            out.println(line.toString());
        }
        }
        
    private void moveLocation(){
        this.console.println("locat func");
    }
    
//##############################################################################
//#########LESSON 11 INDIVIDUAL ASSIGNMENT...JOSE###############################
    private void playerCharacters(){
                Characters[] character = Characters.values();
                this.console.println("CHARACTER'S NAME"+"\t    DETAILS");
                this.console.println("----------------"+"\t   ------------------");
                for (Characters chaNM : character){
                this.console.println(chaNM + ":-------- \t" + chaNM.getDescription());
                }
//        this.viewCharacter(CrashInTheCaribbean.getOutFile());
    }
//##############################################################################
//##############################################################################    
//    private void createNewGame(){
//        GameControl.createNewGame(CrashInTheCaribbean.getPlayer());
//    }
   
//##############################################################################
//###THE 3 FUNCTIONS BELOW ARE FOR THE MAP TO BUILD THE ROW AND COLUMN DIVIDER##
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
//##############################################################################
//############################################################################## 
     public void printReport() {
        // get the filepath and name of the file
        this.console.println("\nEnter the file path where the report is to be saved");        
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
            
            reportFile.println();
            this.weaponReport(reportFile);
            
            CrashInTheCaribbean.getOutFile().println(
                    "\n*** Report printed to file: " + filePath + " ***");           
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", "Error writing to game report file. "
                    + "\n\t" + ex.getMessage());
        }
    }
//##############################################################################
//#########LESSON 11 INDIVIDUAL ASSIGNMENT...JOSE###############################
    public void viewCharacter(PrintWriter out) {
            
            Game game = CrashInTheCaribbean.getCurrentGame();
            out.println("\n   NAME OF CHARACTERS");
            StringBuilder line = new StringBuilder("                         ");
            line.insert(0, "NAME");
            line.insert(20, "DESCRIPTION");
            out.println(line.toString());
            Characters[] chaNM = Characters.values();
            
            for(Characters plyrNM : chaNM){
                line = new StringBuilder("                         ");
                line.insert(0, plyrNM.name());
                line.insert(20, plyrNM.getDescription());
                out.println(line.toString());           
            }          
    }
    
    private void reportCharacter(PrintWriter reportFile){
//            this.viewCharacter(reportFile);
    }
//##############################################################################
//##############################################################################
    private void viewMap(PrintWriter reportFile) {
        this.ViewMap(reportFile);
        
    }

    private void viewInventory(PrintWriter reportFile) {
       //***************NEEDS TO BE DEVELOPED*****************************
    }
   
    
    private void weaponReport(PrintWriter out){
         Game game = CrashInTheCaribbean.getCurrentGame();
            out.println("\n   WEAPONS");
            StringBuilder line = new StringBuilder("                         ");
            line.insert(0, "NAME");
            line.insert(20, "WEAPON POWER");
            out.println(line.toString());
            WeaponPower[] chaNM = WeaponPower.values();
            
            for(WeaponPower plyrNM : chaNM){
                line = new StringBuilder("                         ");
                line.insert(0, plyrNM.name());
                line.insert(20, plyrNM.getWpower());
                out.println(line.toString());          
        }
    
    }
}
