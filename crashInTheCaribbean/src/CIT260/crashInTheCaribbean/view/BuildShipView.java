/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.view;

/**
 *
 * @author thomas
 */
public class BuildShipView {
    
    
    private String message;
    
     public BuildShipView(){
        this.message ="You must reach 300 cubic feet in order to build your "
                + "ship successfully. Don't make this too hard. Just try to"
                + "imagine how to calculate the volume of a prism. You have "
                + "to multiply a few numbers together. The numbers must be "
                + "between 0 and 10";
}

public void displayBuildShipView() {
           System.out.println("the display funtion");
    }
public void getShipMeasurements(){
           System.out.println("get values function");
    }
public void doAction(){
            System.out.println("do action function");
    }

}