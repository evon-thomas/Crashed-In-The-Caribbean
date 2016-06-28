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
    Axe(2),
    Bow(3),
    bazooka(5);
    
    private final int Wpower;
    
    WeaponPower(int Wpower){
        this.Wpower = Wpower;
    }
    public int getWpower(){
        return this.Wpower;
    }  
}
