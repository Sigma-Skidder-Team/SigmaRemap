// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class9 extends Class7 implements Serializable
{
    private static String[] field26;
    public static final long field17 = 3938123424117448700L;
    
    public Class9(final double n, final double n2, final double n3, final double n4) {
        super(n, n2, n3, n4);
    }
    
    public Class9(final double[] array) {
        super(array);
    }
    
    public Class9(final Class9 class9) {
        super(class9);
    }
    
    public Class9(final Class2277 class2277) {
        super(class2277);
    }
    
    public Class9(final Class2275 class2275) {
        super(class2275);
    }
    
    public Class9(final Class7 class7) {
        super(class7);
    }
    
    public Class9(final Class2271 class2271) {
        super(class2271.field13839, class2271.field13840, class2271.field13841, 0.0);
    }
    
    public Class9() {
    }
    
    public final void method105(final Class2271 class2271) {
        this.field18 = class2271.field13839;
        this.field19 = class2271.field13840;
        this.field20 = class2271.field13841;
        this.field21 = 0.0;
    }
    
    public final double method106() {
        return Math.sqrt(this.field18 * this.field18 + this.field19 * this.field19 + this.field20 * this.field20 + this.field21 * this.field21);
    }
    
    public final double method107() {
        return this.field18 * this.field18 + this.field19 * this.field19 + this.field20 * this.field20 + this.field21 * this.field21;
    }
    
    public final double method108(final Class9 class9) {
        return this.field18 * class9.field18 + this.field19 * class9.field19 + this.field20 * class9.field20 + this.field21 * class9.field21;
    }
    
    public final void method109(final Class9 class9) {
        final double n = 1.0 / Math.sqrt(class9.field18 * class9.field18 + class9.field19 * class9.field19 + class9.field20 * class9.field20 + class9.field21 * class9.field21);
        this.field18 = class9.field18 * n;
        this.field19 = class9.field19 * n;
        this.field20 = class9.field20 * n;
        this.field21 = class9.field21 * n;
    }
    
    public final void method110() {
        final double n = 1.0 / Math.sqrt(this.field18 * this.field18 + this.field19 * this.field19 + this.field20 * this.field20 + this.field21 * this.field21);
        this.field18 *= n;
        this.field19 *= n;
        this.field20 *= n;
        this.field21 *= n;
    }
    
    public final double method111(final Class9 class9) {
        double a = this.method108(class9) / (this.method106() * class9.method106());
        if (a < -1.0) {
            a = -1.0;
        }
        if (a > 1.0) {
            a = 1.0;
        }
        return Math.acos(a);
    }
}
