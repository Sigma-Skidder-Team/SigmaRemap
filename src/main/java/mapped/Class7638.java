// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7638
{
    private static String[] field30274;
    private static final Class6068<?>[] field30275;
    
    public static Class6068<?> method24059(final int n) {
        return (n >= 0 && n < Class7638.field30275.length) ? Class7638.field30275[n] : Class6068.method18124(n);
    }
    
    static {
        field30275 = new Class6068[] { Class42.field102, Class47.field113, Class48.field117, Class45.field108, Class49.field119, Class46.field111, Class44.field105, Class40.field96, Class50.field121, Class52.field128, Class51.field126, Class53.field132, Class39.field94 };
    }
}
