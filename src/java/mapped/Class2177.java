// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2177 implements Class2178
{
    field12908;
    
    public ThreadLocal<double[]> field12909;
    
    private Class2177() {
        this.field12909 = ThreadLocal.withInitial(() -> new double[8]);
    }
    
    @Override
    public Class3090 method8338(final long n, final int n2, final int n3, final int n4, final Class1867 class1867) {
        final int n5 = n2 - 2;
        final int n6 = n3 - 2;
        final int n7 = n4 - 2;
        final int n8 = n5 >> 2;
        final int n9 = n6 >> 2;
        final int n10 = n7 >> 2;
        final double n11 = (n5 & 0x3) / 4.0;
        final double n12 = (n6 & 0x3) / 4.0;
        final double n13 = (n7 & 0x3) / 4.0;
        final double[] array = this.field12909.get();
        for (int i = 0; i < 8; ++i) {
            final boolean b = (i & 0x4) == 0x0;
            final boolean b2 = (i & 0x2) == 0x0;
            final boolean b3 = (i & 0x1) == 0x0;
            array[i] = method8339(n, b ? n8 : (n8 + 1), b2 ? n9 : (n9 + 1), b3 ? n10 : (n10 + 1), b ? n11 : (n11 - 1.0), b2 ? n12 : (n12 - 1.0), b3 ? n13 : (n13 - 1.0));
        }
        int n14 = 0;
        double n15 = array[0];
        for (int j = 1; j < 8; ++j) {
            if (n15 > array[j]) {
                n14 = j;
                n15 = array[j];
            }
        }
        return class1867.method6960(((n14 & 0x4) != 0x0) ? (n8 + 1) : n8, ((n14 & 0x2) != 0x0) ? (n9 + 1) : n9, ((n14 & 0x1) != 0x0) ? (n10 + 1) : n10);
    }
    
    private static double method8339(final long n, final int n2, final int n3, final int n4, final double n5, final double n6, final double n7) {
        final long method34927 = Class9398.method34927(Class9398.method34927(Class9398.method34927(Class9398.method34927(Class9398.method34927(Class9398.method34927(n, n2), n3), n4), n2), n3), n4);
        final double method34928 = method8340(method34927);
        final long method34929 = Class9398.method34927(method34927, n);
        return method8341(n7 + method8340(Class9398.method34927(method34929, n))) + method8341(n6 + method8340(method34929)) + method8341(n5 + method34928);
    }
    
    private static double method8340(final long n) {
        return ((int)Math.floorMod(n >> 24, 1024L) / 1024.0 - 0.5) * 0.9;
    }
    
    private static double method8341(final double n) {
        return n * n;
    }
}
