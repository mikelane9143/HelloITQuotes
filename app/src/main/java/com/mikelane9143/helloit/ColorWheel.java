package com.mikelane9143.helloit;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Michael on 4/04/2015.
 */
public class ColorWheel {

    // Member variables
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
            };

    // Methods
    public int getColor() {

        // the button was clicked to update the layout with a new color
        String color = "";
        // randomly choose a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
