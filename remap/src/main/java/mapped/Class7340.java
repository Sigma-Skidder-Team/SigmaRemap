// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Class7340
{
    private static BufferedImage field28352;
    
    public static BufferedImage method22543() {
        final Graphics2D graphics2D = (Graphics2D)Class7340.field28352.getGraphics();
        graphics2D.setComposite(AlphaComposite.Clear);
        graphics2D.fillRect(0, 0, 256, 256);
        graphics2D.setComposite(AlphaComposite.SrcOver);
        graphics2D.setColor(Color.white);
        return Class7340.field28352;
    }
    
    public static Class5484 method22544(final String s, final Color color) {
        return new Class5478(s, toString(color));
    }
    
    public static Class5484 method22545(final String s, final int i, final String s2) {
        return new Class5481(s, String.valueOf(i), i, s2);
    }
    
    public static Class5484 method22546(final String s, final float f, final float n, final float n2, final String s2) {
        return new Class5482(s, String.valueOf(f), f, n, n2, s2);
    }
    
    public static Class5484 method22547(final String s, final boolean b, final String s2) {
        return new Class5480(s, String.valueOf(b), b, s2);
    }
    
    public static Class5484 method22548(final String s, final String s2, final String[][] array, final String s3) {
        return new Class5483(s, s2, array, s2, s3);
    }
    
    public static String toString(final Color color) {
        if (color != null) {
            String s = Integer.toHexString(color.getRed());
            if (s.length() == 1) {
                s = "0" + s;
            }
            String s2 = Integer.toHexString(color.getGreen());
            if (s2.length() == 1) {
                s2 = "0" + s2;
            }
            String s3 = Integer.toHexString(color.getBlue());
            if (s3.length() == 1) {
                s3 = "0" + s3;
            }
            return s + s2 + s3;
        }
        throw new IllegalArgumentException("color cannot be null.");
    }
    
    public static Color method22549(final String s) {
        if (s != null && s.length() == 6) {
            return new Color(Integer.parseInt(s.substring(0, 2), 16), Integer.parseInt(s.substring(2, 4), 16), Integer.parseInt(s.substring(4, 6), 16));
        }
        return Color.white;
    }
    
    static {
        Class7340.field28352 = new BufferedImage(256, 256, 2);
    }
}
