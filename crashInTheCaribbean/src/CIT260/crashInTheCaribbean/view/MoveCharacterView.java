/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import CIT260.crashInTheCaribbean.control.MapControl;
import CIT260.crashInTheCaribbean.exceptions.MapControlException;
import CIT260.crashInTheCaribbean.exceptions.ViewException;
import CIT260.crashInTheCaribbean.model.Game;
import crashinthecaribbean.CrashInTheCaribbean;
import enums.Characters;
import enums.WhereTo;
import java.awt.Point;

/**
 *
 * @author josecovarrubias
 */
public class MoveCharacterView extends View{
    
    public MoveCharacterView(){
            super("\n"
                + "\n======================================================="
                + "\n|  SELECT THE CHARACTER TO MOVE                       |"
                + "\n======================================================="
                + "\n R - Rambo"
                + "\n N - Neo"
                + "\n K - Kung Fu Panda"
                + "\n Q - Quit"
                + "\n=======================================================");
    }

    @Override
    public boolean doAction(String obj) {
       Characters character;
       Game game = CrashInTheCaribbean.getCurrentGame();
       
       String option = (String) obj;
       option = option.trim().toUpperCase();
       
       switch (option){
           case "R":
               character = Characters.Rambo;
               break;
           case "N":
               character = Characters.Neo;
               break;
           case "K":
               character = Characters.KungFuPanda;
               break;
           case "Q":
               return true;
           default:
               ErrorView.display("MoveCharacterView", "Make sure to type a letter");
               return false;
       }
       
       boolean done = false;
       do{
           this.console.println("\n***** You can move up (U), down (D), left (L), or right (R)******");
           try{
               this.console.println("\n This works with the following command example: U 2"
                       + "\n that moves the character u to 2 places."
                       + "\n if you want to go left, you enter L 3, or any number you want.");
               Move move = this.getCoordinates();
               if (move == null)
                   break;
               
                  Point blockedLocation = MapControl.moveCharacter(character, 
                                                   move.direction, 
                                                   move.distance);
                  
               Point coordinates = game.getCharactersLocation()[character.ordinal()];
               Point newPosition = new Point(coordinates.x + 1, coordinates.y + 1);
               String locationDetail;
               String message = "";
               
               if (blockedLocation != null){
                      locationDetail = MapControl.getLocation(blockedLocation).getScene().getDescription();
                       message = "The path was blocked at position " 
                                    +   blockedLocation.x + ", " + blockedLocation.y + ".\n"
                                    +   this.getBlockedMessage(locationDetail)
                                    +   "\n\n" + character + " is currently in position " 
                                    +   newPosition.x + ", " + newPosition.y;  
                    this.console.println(message); 
                   
               }
           
           else{
                locationDetail = MapControl.getLocation(newPosition).getScene().getDescription();
                   message = character + " was moved to location"
                           + newPosition.x + ", "+ newPosition.y + ".\n"
                           + this.getBlockedMessage(locationDetail);
                   this.console.println(message);
               }
           done = true;
           }catch(ViewException | MapControlException ex){
                   ErrorView.display("MoveCharacterView", ex.getMessage());
           }
       }
           while(!done);
       return false;
        }
    
    /**
     *
     * @return
     * @throws ViewException
     */
    public Move getCoordinates() throws ViewException{
        Move move = null;
        
        String value = this.getInput();
        value = value.trim().toUpperCase();
        if (value.equals("Q"))
            return null;
        String[] values = value.split(" ");
        
        if(values.length <2){
            ErrorView.display(this.getClass().getName(),
                               "\n Example (D 4) or (L 2)." 
                              +"\n Please use the example above to enter command.");
            return null;
        }
        WhereTo direction;
        switch (value.charAt(0)){
            case 'D' : direction = WhereTo.D;
                break;
            case 'U' : direction = WhereTo.U;
                break;
            case 'L' : direction = WhereTo.L;
                break;
            case 'R' : direction = WhereTo.R;
                break;
            default: ErrorView.display(this.getClass().getName(), "Use only the letters on menu.");
            return null;
        }
        try{
            int distance = Integer.parseInt(values[1]);
            if(distance < 1){
            ErrorView.display(this.getClass().getName(), "distance has to be more than zero");
            return null;
            }
            move = new Move(direction, distance);
        }
        catch(NumberFormatException nfe){
            ErrorView.display(this.getClass().getName(), "direction is not a number");
        }
      return move;   
    }
private class Move{
        WhereTo direction;
        int distance; 
    
    public Move(WhereTo direction, int distance){
        this.direction = direction;
        this.distance = distance;
        }
    }

    public String getBlockedMessage(String message) {
        String newMessage = "";
        int noOfLines = (message.length() / 81) + 1;
        String[] words = message.split(" ");
        String line = "";
        
        for (String word : words) {
            
            if (line.length() + word.length() < 80) {
                line += word.trim() + " ";
            }
            else {
                newMessage += line + "\n";
                line = word.trim() + " ";
            }
        }
        newMessage += line;
        
        return newMessage; 
    }
}
    
