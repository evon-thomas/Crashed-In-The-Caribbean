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
public enum WhereTo {
    L("left", 0, -1),
    R("right", 0, 1),
    U("up", -1, 0),
    D("down", 1, 0);
    
    private final String value;
    private final int xIncrement;
    private final int yIncrement;

    private WhereTo(String value, int xIncrement, int yIncrement) {
        this.value = value;
        this.xIncrement = xIncrement;
        this.yIncrement = yIncrement;
    }

    public String getValue() {
        return value;
    }

    public int getxIncrement() {
        return xIncrement;
    }

    public int getyIncrement() {
        return yIncrement;
    }
    
}
