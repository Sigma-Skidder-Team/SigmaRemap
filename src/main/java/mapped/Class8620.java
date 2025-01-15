// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8620
{
    private static String[] field36181;
    private final int field36182;
    private final double field36183;
    private final double field36184;
    
    public Class8620(final double n) {
        int field36182 = (int)(n * 0.6366197723675814);
        double field36183;
        double field36184;
        while (true) {
            final double n2 = -field36182 * 1.570796251296997;
            final double n3 = n + n2;
            final double n4 = -(n3 - n - n2);
            final double n5 = -field36182 * 7.549789948768648E-8;
            final double n6 = n3;
            final double n7 = n5 + n6;
            final double n8 = n4 + -(n7 - n6 - n5);
            final double n9 = -field36182 * 6.123233995736766E-17;
            final double n10 = n7;
            field36183 = n9 + n10;
            field36184 = n8 + -(field36183 - n10 - n9);
            if (field36183 > 0.0) {
                break;
            }
            --field36182;
        }
        this.field36182 = field36182;
        this.field36183 = field36183;
        this.field36184 = field36184;
    }
    
    public int method29256() {
        return this.field36182;
    }
    
    public double method29257() {
        return this.field36183;
    }
    
    public double method29258() {
        return this.field36184;
    }
}
