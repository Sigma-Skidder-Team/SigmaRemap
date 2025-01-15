// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4189 implements Class4178, Class4190, Class4191
{
    private static String[] field18735;
    
    private Class4189() {
    }
    
    public static void method12581(final Class4188 class4188, final float[] array, final float[] array2) {
        final Class4192 method12576 = class4188.method12576();
        final Class4182 method12577 = method12576.method12588();
        final int[] method12578 = method12577.method12551();
        final int method12579 = method12577.method12554();
        final int method12580 = method12577.method12549();
        final int[] method12581 = method12576.method12590();
        final int[] method12582 = method12576.method12589();
        final float[] method12583 = method12576.method12591();
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < method12579; ++i) {
            int n3 = 0;
            for (int j = 0; j < method12580; j = n3) {
                if (method12581[n] != 15 && method12581[n] != 14) {
                    n3 = method12582[n];
                    n += n3 - j;
                }
                else {
                    while (j < method12582[n]) {
                        int n4 = (method12581[n] != 15) ? -1 : 1;
                        if (class4188.method12579()) {
                            n4 *= (class4188.method12578(n) ? -1 : 1);
                        }
                        final float n5 = n4 * method12583[n];
                        for (int k = 0; k < method12577.method12555(i); ++k) {
                            final int n6 = n2 + k * 128 + method12578[j];
                            for (int l = 0; l < method12578[j + 1] - method12578[j]; ++l) {
                                array2[n6 + l] = array[n6 + l] * n5;
                            }
                        }
                        ++j;
                        ++n;
                    }
                }
            }
            n2 += method12577.method12555(i) * 128;
        }
    }
}
