/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.crashInTheCaribbean.control;

// author thomas evon

volumeOfTrap(bucketRadius, bucketHeight, PI): double
BEGIN


IF (bucketRadius <0 || bucketRadius >5) THEN
RETURN -1;

IF (height <0 || height > 12) THEN
RETURN -1;

totalVolume = PI * (bucketRadius * bucketRadius) * bucketHeight
