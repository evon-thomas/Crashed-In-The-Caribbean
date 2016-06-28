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
public enum WeaponPower {
    bazooka(5),
    Bow(3),
    Axe(2);
    
    private final int Wpower;
    
    WeaponPower(int Wpower){
        this.Wpower = Wpower;
    }
    public int getWpower(){
        return this.Wpower;
    }  
}
