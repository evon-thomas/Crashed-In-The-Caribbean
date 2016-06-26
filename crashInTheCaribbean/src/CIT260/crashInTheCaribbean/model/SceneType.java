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
    
    overLook, //("This is the starting scene for any location."),
    faceTrap, // ("This scene shows the trap to the user."),
    faceBeast, //("This scene shows the beast to the user."),
    findTool, // ("This scene is used when a new tool is found."),
    findWeapon; // ("This scene is used when a new weapon is found."); 
}
