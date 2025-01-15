// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class4195 implements Class4178, Class4191
{
    private static String[] field18768;
    
    private Class4195() {
    }
    
    public static void method12600(final Class4188 class4188, final float[] array, final float[] array2) {
        final Class4192 method12575 = class4188.method12575();
        final Class4182 method12576 = method12575.method12588();
        final int[] method12577 = method12576.method12551();
        final int method12578 = method12576.method12554();
        final int method12579 = method12576.method12549();
        final int[] method12580 = method12575.method12590();
        final int[] method12581 = class4188.method12576().method12590();
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < method12578; ++i) {
            for (int j = 0; j < method12579; ++j, ++n2) {
                if (class4188.method12578(n2)) {
                    if (method12580[n2] < 13) {
                        if (method12581[n2] < 13) {
                            for (int k = 0; k < method12576.method12555(i); ++k) {
                                final int n3 = n + k * 128 + method12577[j];
                                for (int l = 0; l < method12577[j + 1] - method12577[j]; ++l) {
                                    final float n4 = array[n3 + l] - array2[n3 + l];
                                    final int n5 = n3 + l;
                                    array[n5] += array2[n3 + l];
                                    array2[n3 + l] = n4;
                                }
                            }
                        }
                    }
                }
            }
            n += method12576.method12555(i) * 128;
        }
    }
}
