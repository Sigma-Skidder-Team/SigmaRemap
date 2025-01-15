// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8861
{
    private static String[] field37249;
    private static int[] field37250;
    
    public static void method31024(final int[] field37250) {
        Class8861.field37250 = field37250;
    }
    
    public static int method31025(final double n, double n2) {
        n2 *= n;
        return Class8861.field37250[(int)((1.0 - n2) * 255.0) << 8 | (int)((1.0 - n) * 255.0)];
    }
    
    public static int method31026() {
        return 6396257;
    }
    
    public static int method31027() {
        return 8431445;
    }
    
    public static int method31028() {
        return 4764952;
    }
    
    static {
        Class8861.field37250 = new int[65536];
    }
}
