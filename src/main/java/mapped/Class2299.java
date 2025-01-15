// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2299 extends Class2297 implements Serializable
{
    private static String[] field13949;
    public static final long field13945 = 1133748791492571954L;
    
    public Class2299(final double n, final double n2) {
        super(n, n2);
    }
    
    public Class2299(final double[] array) {
        super(array);
    }
    
    public Class2299(final Class2299 class2299) {
        super(class2299);
    }
    
    public Class2299(final Class2293 class2293) {
        super(class2293);
    }
    
    public Class2299(final Class2297 class2297) {
        super(class2297);
    }
    
    public Class2299(final Class2290 class2290) {
        super(class2290);
    }
    
    public Class2299() {
    }
    
    public final double method9176(final Class2299 class2299) {
        final double n = this.field13946 - class2299.field13946;
        final double n2 = this.field13947 - class2299.field13947;
        return n * n + n2 * n2;
    }
    
    public final double method9177(final Class2299 class2299) {
        final double n = this.field13946 - class2299.field13946;
        final double n2 = this.field13947 - class2299.field13947;
        return Math.sqrt(n * n + n2 * n2);
    }
    
    public final double method9178(final Class2299 class2299) {
        return Math.abs(this.field13946 - class2299.field13946) + Math.abs(this.field13947 - class2299.field13947);
    }
    
    public final double method9179(final Class2299 class2299) {
        return Math.max(Math.abs(this.field13946 - class2299.field13946), Math.abs(this.field13947 - class2299.field13947));
    }
}
