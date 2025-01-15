// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class8101
{
    private static String[] field33362;
    
    public static int method26622(final Color color) {
        return method26626(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }
    
    public static int method26623(final int n) {
        return method26626(n, n, n, 255);
    }
    
    public static int method26624(final int n, final int n2) {
        return method26626(n, n, n, n2);
    }
    
    public static int method26625(final int n, final int n2, final int n3) {
        return method26626(n, n2, n3, 255);
    }
    
    public static int method26626(final int n, final int n2, final int n3, final int n4) {
        return 0x0 | n4 << 24 | n << 16 | n2 << 8 | n3;
    }
}
