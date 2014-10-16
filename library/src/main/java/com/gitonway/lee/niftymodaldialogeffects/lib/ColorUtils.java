package com.gitonway.lee.niftymodaldialogeffects.lib;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;

// http://stackoverflow.com/a/11171509/317862
public class ColorUtils {

    public static ColorFilter getColorFilter(int color) {
        ColorMatrixColorFilter colorFilter;
        int red = (color & 0xFF0000) / 0xFFFF;
        int green = (color & 0xFF00) / 0xFF;
        int blue = color & 0xFF;

        float[] matrix = { 0, 0, 0, 0, red
                , 0, 0, 0, 0, green
                , 0, 0, 0, 0, blue
                , 0, 0, 0, 1, 0 };

        colorFilter = new ColorMatrixColorFilter(matrix);

        return colorFilter;
    }
}
