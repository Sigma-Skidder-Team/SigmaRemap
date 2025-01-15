// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9134
{
    private static String[] field38710;
    private static final Class869 field38711;
    
    public static double[] method33307(final Class511 class511) {
        if (class511 != null) {
            return new double[] { class511.field2395 + (class511.field2395 - class511.field2417) * 2.0, class511.field2396 + 0.0, class511.field2397 + (class511.field2397 - class511.field2419) * 2.0 };
        }
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    public static double[] method33308(final Class511 class511) {
        if (class511 != null) {
            return new double[] { class511.field2395 + (class511.field2395 - class511.field2417) * Class6430.method19135() / 50.0, class511.field2396 + 0.0 * Class6430.method19135() / 50.0, class511.field2397 + (class511.field2397 - class511.field2419) * Class6430.method19135() / 50.0 };
        }
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    static {
        field38711 = Class869.method5277();
    }
}
