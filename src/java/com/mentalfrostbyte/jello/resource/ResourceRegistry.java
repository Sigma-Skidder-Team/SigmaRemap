package com.mentalfrostbyte.jello.resource;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import mapped.Class7430;

import java.awt.*;
import java.io.InputStream;

public class ResourceRegistry {
    public static final ClientResource field38851 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0F);
    public static final ClientResource field38852 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
    public static final ClientResource field38853 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
    public static final ClientResource field38854 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0F);
    public static final ClientResource field38855 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0F);
    public static final ClientResource field38856 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0F);
    public static final ClientResource field38857 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0F);
    public static final ClientResource field38858 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0F);
    public static final ClientResource field38859 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0F);
    public static final ClientResource field38860 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0F);
    public static final ClientResource field38861 = method31023("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0F);
    public static final ClientResource field38862 = method31023("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0F);
    public static final ClientResource field38863 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 14.0F);
    public static final ClientResource field38864 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
    public static final ClientResource field38865 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);
    public static final ClientResource field38866 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0F);
    public static final ClientResource field38867 = method31023("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0F);
    public static final Class7430 field38868 = new Class7430(2);
    public static final ClientResource field38869 = method31022("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0F);
    public static final ClientResource field38870 = method31022("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0F);
    public static final ClientResource field38871 = method31022("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0F);
    public static final ClientResource field38872 = method31022("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0F);
    private static final String field38848 = "com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf";
    private static final String field38849 = "com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf";
    private static final String field38850 = "com/mentalfrostbyte/gui/resources/font/regular.ttf";

    public static ClientResource method31022(String var0, int var1, float var2) {
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

    public static ClientResource method31023(String var0, int var1, float var2) {
        try {
            InputStream var5 = ResourcesDecrypter.readInputStream(var0);
            Font var6 = Font.createFont(0, var5);
            var6 = var6.deriveFont(var1, var2);
            return new ClientResource(var6, true);
        } catch (Exception var7) {
            var7.printStackTrace();
            return new ClientResource(new Font("Arial", 0, (int) var2), Client.getInstance().method19954() != ClientMode.CLASSIC);
        }
    }
}
