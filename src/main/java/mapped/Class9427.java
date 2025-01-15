// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9427
{
    private static String[] field40435;
    
    public static int method35030(final float value) {
        if (value != 0.0f) {
            return Float.floatToIntBits(value);
        }
        return 0;
    }
    
    public static long method35031(final double value) {
        if (value != 0.0) {
            return Double.doubleToLongBits(value);
        }
        return 0L;
    }
    
    private Class9427() {
    }
}
