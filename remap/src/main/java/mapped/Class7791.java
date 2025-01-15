// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7791
{
    private static String[] field31886;
    
    public static float method25029(float n, final float n2, final float n3, final float n4) {
        return n3 * (n /= n4) * n + n2;
    }
    
    public static float method25030(float n, final float n2, final float n3, final float n4) {
        return -n3 * (n /= n4) * (n - 2.0f) + n2;
    }
    
    public static float method25031(float n, final float n2, final float n3, final float n4) {
        if ((n /= n4 / 2.0f) >= 1.0f) {
            return -n3 / 2.0f * (--n * (n - 2.0f) - 1.0f) + n2;
        }
        return n3 / 2.0f * n * n + n2;
    }
}
