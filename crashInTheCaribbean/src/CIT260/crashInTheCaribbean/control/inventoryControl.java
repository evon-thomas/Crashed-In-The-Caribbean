/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

// author thomas evon




public class inventoryControl {
  
public double volumeOfTrap (double bucketRadius, double bucketHeight, double PI) {


if (bucketRadius <0 || bucketRadius >5)  {
return -1; 
}

if (bucketHeight <0 || bucketHeight > 12) {
return -1;
}

double totalVolume = PI * (bucketRadius * bucketRadius) * bucketHeight;
return double totalVolume;
}