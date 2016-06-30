/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.model;

import CIT260.crashInTheCaribbean.view.View;
import java.io.Serializable;

/**
 *
 * @author Karla
 */

// public  class SceneType extends View {
 public enum SceneType implements Serializable {

      
//     String [] sceneType = new String [5];
//     
//     String overLook = sceneType[0];
//     String faceTrap = sceneType[1];
//     String faceBeast = sceneType[2];
//     String findTool = sceneType[3];
//     String findWeapon = sceneType[4];
// 
    overLook , //("This is the starting scene for any location."),
    faceTrap , // ("This scene shows the trap to the user."),
    faceBeast , //("This scene shows the beast to the user."),
    findTool , // ("This scene is used when a new tool is found."),
    findWeapon ; // ("This scene is used when a new weapon is found."); 


//    @Override
//    public boolean doAction(String value) {
//       System.out.println("scene type do action function called");
//    }
// 

//    public Object getDescription() {
//        System.out.println("get description."); 
//    }
 }