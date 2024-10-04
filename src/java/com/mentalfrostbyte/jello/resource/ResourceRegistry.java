package com.mentalfrostbyte.jello.resource;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

import java.awt.*;
import java.io.InputStream;

public class ResourceRegistry {
    public static final ClientResource JelloLightFont12 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0F);
    public static final ClientResource JelloLightFont14 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
    public static final ClientResource JelloLightFont18 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
    public static final ClientResource JelloLightFont20 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0F);
    public static final ClientResource JelloLightFont25 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0F);
    public static final ClientResource JelloLightFont40 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0F);
    public static final ClientResource JelloLightFont50 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0F);
    public static final ClientResource JelloLightFont28 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0F);
    public static final ClientResource JelloLightFont24 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0F);
    public static final ClientResource JelloLightFont36 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0F);
    public static final ClientResource RegularFont20 = getFont("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0F);
    public static final ClientResource RegularFont40 = getFont("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0F);
    public static final ClientResource JelloMediumFont20 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
    public static final ClientResource JelloMediumFont25 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);
    public static final ClientResource JelloMediumFont40 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0F);
    public static final ClientResource JelloMediumFont50 = getFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0F);
    public static final DefaultClientFont field38868 = new DefaultClientFont(2);
    public static final ClientResource JelloLightFont18_1 = getFont2("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
    public static final ClientResource JelloMediumFont20_1 = getFont2("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);

    public static ClientResource getFont2(String var0, int var1, float var2) {
        try {
            InputStream var5 = ResourcesDecrypter.readInputStream(var0);
            Font var6 = Font.createFont(0, var5);
            var6 = var6.deriveFont(var1, var2);
            return new ClientResource(var6, (int) var2);
        } catch (Exception var7) {
            var7.printStackTrace();
            return new ClientResource(new Font("Arial", 0, (int) var2), true);
        }
    }

    public static ClientResource getFont(String var0, int var1, float var2) {
        try {
            InputStream var5 = ResourcesDecrypter.readInputStream(var0);
            Font var6 = Font.createFont(0, var5);
            var6 = var6.deriveFont(var1, var2);
            return new ClientResource(var6, true);
        } catch (Exception var7) {
            var7.printStackTrace();
            return new ClientResource(new Font("Arial", 0, (int) var2), Client.getInstance().getClientMode() != ClientMode.CLASSIC);
        }
    }
}
