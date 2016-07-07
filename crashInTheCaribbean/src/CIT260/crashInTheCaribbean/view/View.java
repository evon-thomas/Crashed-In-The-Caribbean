/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

import crashinthecaribbean.CrashInTheCaribbean;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author josecovarrubias
 */
public abstract class View implements ViewInterface {
    private String displayMessage;
 //////////////////////////////////////////////////////////////////////////////// 
///////////////////////////Lesson 11////////////////////////////////////   
    protected final BufferedReader keyboard = CrashInTheCaribbean.getInFile();
    protected final PrintWriter console = CrashInTheCaribbean.getOutFile();
 //////////////////////////////////////////////////////////////////////////////// 
////////////////////////////////////////////////////////////////////////////////   
    public View(){
    }
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override  
        public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                    return;  //exit game
                    
            // do the requested action and display the next view
            done = this.doAction(value);
        } while(!done);
}      
        @Override
        public String getInput() {

//          Scanner keyboard = new Scanner(System.in); // get infile for keyboard
          boolean valid = false;
          String value = null;
       try{
       while (!valid){ //loop while an invalid value is enter
           this.console.println("\n" + this.displayMessage);
           
           value = this.keyboard.readLine(); //get next line typed on keyboard
           value = value.trim(); //trim off leading and trailing blanks
           
           if (value.length() <1){// value is blank
               ErrorView.display(this.getClass().getName(),"\n*** You must enter a value ***");
               continue;
           }
           break; //end the loop
       }
       } catch (Exception e){
            ErrorView.display(this.getClass().getName(),"Error reading input:" + e.getMessage());
       }
       return value; // return the value entered
    }
           
}
