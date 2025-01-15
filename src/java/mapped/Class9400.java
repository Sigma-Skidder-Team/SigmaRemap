// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Font;

public class Class9400
{
    private static final String field40307 = "com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf";
    private static final String field40308 = "com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf";
    private static final String field40309 = "com/mentalfrostbyte/gui/resources/font/regular.ttf";
    public static final Class7524 field40310;
    public static final Class7524 field40311;
    public static final Class7524 field40312;
    public static final Class7524 field40313;
    public static final Class7524 field40314;
    public static final Class7524 field40315;
    public static final Class7524 field40316;
    public static final Class7524 field40317;
    public static final Class7524 field40318;
    public static final Class7524 field40319;
    public static final Class7524 field40320;
    public static final Class7524 field40321;
    public static final Class7524 field40322;
    public static final Class7524 field40323;
    public static final Class7524 field40324;
    public static final Class7524 field40325;
    public static final Class7524 field40326;
    public static final Class7525 field40327;
    public static final Class7524 field40328;
    public static final Class7524 field40329;
    
    public static Class7524 method34932(final String s, final int style, final float size) {
        try {
            return new Class7524(Font.createFont(0, Class7853.method25394(s)).deriveFont(style, size), (int)size);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return new Class7524(new Font("Arial", 0, (int)size), true);
        }
    }
    
    public static Class7524 method34933(final String s, final int style, final float size) {
        try {
            return new Class7524(Font.createFont(0, Class7853.method25394(s)).deriveFont(style, size), true);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return new Class7524(new Font("Arial", 0, (int)size), Class9463.method35173().method35209() != Class2209.field13465);
        }
    }
    
    static {
        field40310 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0f);
        field40311 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0f);
        field40312 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0f);
        field40313 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0f);
        field40314 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0f);
        field40315 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0f);
        field40316 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0f);
        field40317 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0f);
        field40318 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0f);
        field40319 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0f);
        field40320 = method34933("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0f);
        field40321 = method34933("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0f);
        field40322 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 14.0f);
        field40323 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0f);
        field40324 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0f);
        field40325 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0f);
        field40326 = method34933("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0f);
        field40327 = new Class7525(2);
        field40328 = method34932("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0f);
        field40329 = method34932("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0f);
    }
}
