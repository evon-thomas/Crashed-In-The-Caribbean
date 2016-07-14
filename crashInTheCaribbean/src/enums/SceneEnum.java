/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Karla
 */
public enum SceneEnum{
    
    overLook (" This is the starting scene for any location."),
    faceTrap (" This scene shows the trap to the user."),
    faceBeast (" This scene shows the beast to the user."),
    findTool  (" This scene is used when a new tool is found."),
    findWeapon (" This scene is used when a new weapon is found."); 

private String details;
    
    SceneEnum(String description){
        this.details = description;
    }
    public String getDescription(){
        return this.details;
    }  
}
