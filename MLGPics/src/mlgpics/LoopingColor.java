/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlgpics;

import java.awt.Color;

/**
 * Created class to make a looping color effect for after 'reactionAmount' has
 *    been reached.
 * 
 * @author Jack
 */
public class LoopingColor {
    
    private float hue;
    private float hueIncrease;
    
    public LoopingColor(float startingHue, float hueIncrease){
        hue = startingHue;
        this.hueIncrease = hueIncrease;
    }
    
    // Loops through hues in the color pallete creating
    //    a rainbow looping effect
    public Color nextColor(){
        if(hue == 1){
            hue = 0;
        }else hue += hueIncrease;
        return Color.getHSBColor(hue, .9F, .9F);
    }
    
}
