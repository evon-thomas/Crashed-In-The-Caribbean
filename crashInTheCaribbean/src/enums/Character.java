/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.io.Serializable;

/**
 *
 * @author josecovarrubias
 */
public enum Character implements Serializable{
    Rambo("This player is the most tough of all the players, but has one weakness, he moves slow."),
    Neo("This player can visualize dimentional enviroments, but is soley imaginable."),
    KungFuPanda("the most fun player to play with");
    
     private final String description;
    
    Character(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }   
}
