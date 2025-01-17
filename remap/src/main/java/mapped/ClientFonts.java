// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import slick2d.TrueTypeFont;

import java.awt.Font;

public class ClientFonts
{
    public static final TrueTypeFont JelloLight12;
    public static final TrueTypeFont JelloLight14;
    public static final TrueTypeFont JelloLight18;
    public static final TrueTypeFont JelloLight20;
    public static final TrueTypeFont JelloLight25;
    public static final TrueTypeFont JelloLight40;
    public static final TrueTypeFont JelloLight50;
    public static final TrueTypeFont JelloLight28;
    public static final TrueTypeFont JelloLight24;
    public static final TrueTypeFont JelloLight36;
    public static final TrueTypeFont Regular20;
    public static final TrueTypeFont Regular40;
    public static final TrueTypeFont JelloMedium14;
    public static final TrueTypeFont JelloMedium20;
    public static final TrueTypeFont JelloMedium25;
    public static final TrueTypeFont JelloMedium40;
    public static final TrueTypeFont JelloMedium50;
    public static final DefaultFont Default;
    public static final TrueTypeFont JelloLight18_AA;
    public static final TrueTypeFont JelloMedium20_AA;
    
    public static TrueTypeFont getAntiAliasedFont(final String s, final int style, final float size) {
        try {
            return new TrueTypeFont(Font.createFont(0, ClientAssets.method25394(s)).deriveFont(style, size), (int)size);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return new TrueTypeFont(new Font("Arial", 0, (int)size), true);
        }
    }
    
    public static TrueTypeFont getAutomaticFont(final String s, final int style, final float size) {
        try {
            return new TrueTypeFont(Font.createFont(0, ClientAssets.method25394(s)).deriveFont(style, size), true);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return new TrueTypeFont(new Font("Arial", 0, (int)size), Client.method35173().method35209() != Class2209.field13465);
        }
    }
    
    static {
        JelloLight12 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 12.0f);
        JelloLight14 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 14.0f);
        JelloLight18 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0f);
        JelloLight20 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 20.0f);
        JelloLight25 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 25.0f);
        JelloLight40 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 40.0f);
        JelloLight50 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 50.0f);
        JelloLight28 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 28.0f);
        JelloLight24 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 24.0f);
        JelloLight36 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 36.0f);
        Regular20 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 20.0f);
        Regular40 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/regular.ttf", 0, 40.0f);
        JelloMedium14 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 14.0f);
        JelloMedium20 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0f);
        JelloMedium25 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 25.0f);
        JelloMedium40 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 40.0f);
        JelloMedium50 = getAutomaticFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 50.0f);
        Default = new DefaultFont(2);
        JelloLight18_AA = getAntiAliasedFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue-light.ttf", 0, 18.0f);
        JelloMedium20_AA = getAntiAliasedFont("com/mentalfrostbyte/gui/resources/font/helvetica-neue medium.ttf", 0, 20.0f);
    }
}
