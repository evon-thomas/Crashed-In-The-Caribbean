/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

/**
 *
 * @author josecovarrubias
 */
public class BuildControl {
  public double build(double length, double width, double height){
      
      if (length <0 || length >15){
      return -1;
      }
      if (width <0 || width >15){
      return -1;
      }
      if(height <0 ||height >5){
      return -1;
      }
      double volumeOfBoat = length * width * height;
      return volumeOfBoat;
  }
 /* //thi is an attempt to create another function that can be used in this class. Jose.
  
  public double trap(double radius, double height){
      
      if (radius <1){
      return -1;
      }
      if (height <1 || height > 20){
      return -1;
      }
      double radiusSQRT = Math.sqrt(radius);
      double radiusNheight = height * radiusSQRT;
   
      double trapVol =Math.PI;
      return trapVol;
    }*/

    double volume(double bucketRadius, double bucketHeight, double PI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
