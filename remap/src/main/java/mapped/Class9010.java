// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9010
{
    private static String[] field38039;
    private static int[] field38040;
    
    public static void method32260(final int[] field38040) {
        Class9010.field38040 = field38040;
    }
    
    public static int method32261(final double n, double n2) {
        n2 *= n;
        final int n3 = (int)((1.0 - n2) * 255.0) << 8 | (int)((1.0 - n) * 255.0);
        return (n3 <= Class9010.field38040.length) ? Class9010.field38040[n3] : -65281;
    }
    
    static {
        Class9010.field38040 = new int[65536];
    }
}
