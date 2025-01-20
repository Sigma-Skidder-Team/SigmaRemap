package com.mentalfrostbyte.jello.resource;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.ClientMode;
import com.mentalfrostbyte.jello.unmapped.ResourceList;

import java.awt.*;
import java.io.InputStream;

public class ResourceRegistry {
    public static final TrueTypeFont JelloLightFont12 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0F);
    public static final TrueTypeFont JelloLightFont14 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
    public static final TrueTypeFont JelloLightFont18 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
    public static final TrueTypeFont JelloLightFont20 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0F);
    public static final TrueTypeFont JelloLightFont25 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0F);
    public static final TrueTypeFont JelloLightFont40 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0F);
    public static final TrueTypeFont JelloLightFont50 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0F);
    public static final TrueTypeFont JelloLightFont28 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0F);
    public static final TrueTypeFont JelloLightFont24 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0F);
    public static final TrueTypeFont JelloLightFont36 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0F);
    public static final TrueTypeFont RegularFont20 = getFont("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0F);
    public static final TrueTypeFont RegularFont40 = getFont("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0F);
    public static final TrueTypeFont JelloMediumFont20 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
    public static final TrueTypeFont JelloMediumFont25 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);
    public static final TrueTypeFont JelloMediumFont40 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0F);
    public static final TrueTypeFont JelloMediumFont50 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0F);
    public static final DefaultClientFont DefaultClientFont = new DefaultClientFont(2);
    public static final TrueTypeFont JelloLightFont18_1 = getFont2("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
    public static final TrueTypeFont JelloMediumFont20_1 = getFont2("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);

    public static TrueTypeFont getFont2(String fontPath, int style, float size) {
        try {
            InputStream fontFile = ResourceList.readInputStream(fontPath);
            Font font = Font.createFont(0, fontFile);
            font = font.deriveFont(style, size);
            return new TrueTypeFont(font, (int) size);
        } catch (Exception ex) {
            return new TrueTypeFont(new Font("Arial", Font.PLAIN, (int) size), true);
        }
    }

    public static TrueTypeFont getFont(String fontPath, int style, float size) {
        try {
            InputStream fontFile = ResourceList.readInputStream(fontPath);
            Font font = Font.createFont(0, fontFile);
            font = font.deriveFont(style, size);
            return new TrueTypeFont(font, true);
        } catch (Exception ex) {
            return new TrueTypeFont(new Font("Arial", Font.PLAIN, (int) size), Client.getInstance().getClientMode() != ClientMode.CLASSIC);
        }
    }
}
