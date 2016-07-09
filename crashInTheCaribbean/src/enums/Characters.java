/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;


/**
 *
 * @author josecovarrubias
 */
public enum Characters {
    Rambo("        This player is the most tough of all the players, but has one weakness, he moves slow."),
    Neo("        This player can visualize dimentional enviroments, but is soley imaginable."),
    KungFuPanda("The most fun player to play with.");
    
     private final String details;
    
    Characters(String description) {
        this.details = description;
    }

    public String getDescription() {
        return this.details;
    }   
}
