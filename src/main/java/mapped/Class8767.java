// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8767
{
    private static String[] field36855;
    private static final float[] field36856;
    
    public static Class1846[] method30398(final Class1846 class1846, final int n) {
        final Class1846[] array = new Class1846[n + 1];
        array[0] = class1846;
        if (n > 0) {
            final boolean b = false;
            for (int i = 1; i <= n; ++i) {
                final Class1846 class1847 = array[i - 1];
                final Class1846 class1848 = new Class1846(class1847.method6644() >> 1, class1847.method6645() >> 1, false);
                final int method6644 = class1848.method6644();
                final int method6645 = class1848.method6645();
                for (int j = 0; j < method6644; ++j) {
                    for (int k = 0; k < method6645; ++k) {
                        class1848.method6648(j, k, method30399(class1847.method6647(j * 2 + 0, k * 2 + 0), class1847.method6647(j * 2 + 1, k * 2 + 0), class1847.method6647(j * 2 + 0, k * 2 + 1), class1847.method6647(j * 2 + 1, k * 2 + 1), b));
                    }
                }
                array[i] = class1848;
            }
        }
        return array;
    }
    
    private static int method30399(final int n, final int n2, final int n3, final int n4, final boolean b) {
        return Class8409.method28067(n, n2, n3, n4);
    }
    
    private static int method30400(final int n, final int n2, final int n3, final int n4, final int n5) {
        return (int)((float)Math.pow((method30401(n >> n5) + method30401(n2 >> n5) + method30401(n3 >> n5) + method30401(n4 >> n5)) * 0.25, 0.45454545454545453) * 255.0);
    }
    
    private static float method30401(final int n) {
        return Class8767.field36856[n & 0xFF];
    }
    
    static {
        field36856 = Class8349.method27851(new float[256], array -> {
            int i = 0;
            while (i < array.length) {
                array[i] = (float)Math.pow(i / 255.0f, 2.2);
                ++i;
            }
        });
    }
}
