// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7707
{
    private static String[] field30633;
    
    public static float method24582(float n, final float n2, final float n3, final float n4) {
        final float n5 = 1.70158f;
        return n3 * (n /= n4) * n * ((n5 + 1.0f) * n - n5) + n2;
    }
    
    public static float method24583(float n, final float n2, final float n3, final float n4, final float n5) {
        return n3 * (n /= n4) * n * ((n5 + 1.0f) * n - n5) + n2;
    }
    
    public static float method24584(float n, final float n2, final float n3, final float n4) {
        final float n5 = 1.70158f;
        return n3 * ((n = n / n4 - 1.0f) * n * ((n5 + 1.0f) * n + n5) + 1.0f) + n2;
    }
    
    public static float method24585(float n, final float n2, final float n3, final float n4, final float n5) {
        return n3 * ((n = n / n4 - 1.0f) * n * ((n5 + 1.0f) * n + n5) + 1.0f) + n2;
    }
    
    public static float method24586(float n, final float n2, final float n3, final float n4) {
        final float n5 = 1.70158f;
        if ((n /= n4 / 2.0f) >= 1.0f) {
            final float n6 = n3 / 2.0f;
            final float n7 = (n -= 2.0f) * n;
            final float n8 = n5 * 1.525f;
            return n6 * (n7 * ((n8 + 1.0f) * n + n8) + 2.0f) + n2;
        }
        final float n9 = n3 / 2.0f;
        final float n10 = n * n;
        final float n11 = n5 * 1.525f;
        return n9 * (n10 * ((n11 + 1.0f) * n - n11)) + n2;
    }
    
    public static float method24587(float n, final float n2, final float n3, final float n4, float n5) {
        if ((n /= n4 / 2.0f) >= 1.0f) {
            return n3 / 2.0f * ((n -= 2.0f) * n * (((n5 *= 1.525f) + 1.0f) * n + n5) + 2.0f) + n2;
        }
        return n3 / 2.0f * (n * n * (((n5 *= 1.525f) + 1.0f) * n - n5)) + n2;
    }
}
