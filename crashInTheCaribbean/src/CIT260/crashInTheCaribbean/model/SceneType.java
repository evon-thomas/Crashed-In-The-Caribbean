/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import java.io.Serializable;

/**
 *
 * @author Karla
 */
 public enum SceneType implements Serializable {
    
    overLook ("This is the starting scene for any location."),
    facetrap ("This scene shows the trap to the user."),
    facebeast ("This scene shows the beast to the user."),
    findtool ("This scene is used when a new tool is found."),
    findweapon ("This scene is used when a new weapon is found."); 
}
