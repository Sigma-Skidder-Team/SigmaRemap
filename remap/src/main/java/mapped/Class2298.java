// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2298 extends Class2297 implements Serializable
{
    private static String[] field13948;
    public static final long field13945 = 8572646365302599857L;
    
    public Class2298(final double n, final double n2) {
        super(n, n2);
    }
    
    public Class2298(final double[] array) {
        super(array);
    }
    
    public Class2298(final Class2298 class2298) {
        super(class2298);
    }
    
    public Class2298(final Class2292 class2292) {
        super(class2292);
    }
    
    public Class2298(final Class2297 class2297) {
        super(class2297);
    }
    
    public Class2298(final Class2290 class2290) {
        super(class2290);
    }
    
    public Class2298() {
    }
    
    public final double method9170(final Class2298 class2298) {
        return this.field13946 * class2298.field13946 + this.field13947 * class2298.field13947;
    }
    
    public final double method9171() {
        return Math.sqrt(this.field13946 * this.field13946 + this.field13947 * this.field13947);
    }
    
    public final double method9172() {
        return this.field13946 * this.field13946 + this.field13947 * this.field13947;
    }
    
    public final void method9173(final Class2298 class2298) {
        final double n = 1.0 / Math.sqrt(class2298.field13946 * class2298.field13946 + class2298.field13947 * class2298.field13947);
        this.field13946 = class2298.field13946 * n;
        this.field13947 = class2298.field13947 * n;
    }
    
    public final void method9174() {
        final double n = 1.0 / Math.sqrt(this.field13946 * this.field13946 + this.field13947 * this.field13947);
        this.field13946 *= n;
        this.field13947 *= n;
    }
    
    public final double method9175(final Class2298 class2298) {
        double a = this.method9170(class2298) / (this.method9171() * class2298.method9171());
        if (a < -1.0) {
            a = -1.0;
        }
        if (a > 1.0) {
            a = 1.0;
        }
        return Math.acos(a);
    }
}
