// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8468
{
    private static String[] field34751;
    
    public static float method28269(float n, final float n2, final float n3, final float n4) {
        n /= n4;
        return n3 * n * n * n + n2;
    }
    
    public static float method28270(float n, final float n2, final float n3, final float n4) {
        n /= n4;
        --n;
        return n3 * (n * n * n + 1.0f) + n2;
    }
    
    public static float method28271(float n, final float n2, final float n3, final float n4) {
        n /= n4 / 2.0f;
        if (n >= 1.0f) {
            n -= 2.0f;
            return n3 / 2.0f * (n * n * n + 2.0f) + n2;
        }
        return n3 / 2.0f * n * n * n + n2;
    }
}
