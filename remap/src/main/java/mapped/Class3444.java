// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3444
{
    private static String[] field16266;
    
    public static float method11011(final float n, final float n2, final float n3) {
        if (n >= n2) {
            return (n <= n3) ? n : n3;
        }
        return n2;
    }
    
    public static int method11012(final int n, final int n2) {
        int n3 = n % n2;
        if (n3 < 0) {
            n3 += n2;
        }
        return n3;
    }
}
