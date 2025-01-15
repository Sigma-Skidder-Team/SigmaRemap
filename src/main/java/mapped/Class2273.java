// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2273 extends Class2271 implements Serializable
{
    private static String[] field13843;
    public static final long field13838 = 3761969948420550442L;
    
    public Class2273(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public Class2273(final double[] array) {
        super(array);
    }
    
    public Class2273(final Class2273 class2273) {
        super(class2273);
    }
    
    public Class2273(final Class2288 class2288) {
        super(class2288);
    }
    
    public Class2273(final Class2285 class2285) {
        super(class2285);
    }
    
    public Class2273(final Class2271 class2271) {
        super(class2271);
    }
    
    public Class2273() {
    }
    
    public final void method8556(final Class2273 class2273, final Class2273 class2274) {
        final double field13839 = class2273.field13840 * class2274.field13841 - class2273.field13841 * class2274.field13840;
        final double field13840 = class2274.field13839 * class2273.field13841 - class2274.field13841 * class2273.field13839;
        this.field13841 = class2273.field13839 * class2274.field13840 - class2273.field13840 * class2274.field13839;
        this.field13839 = field13839;
        this.field13840 = field13840;
    }
    
    public final void method8557(final Class2273 class2273) {
        final double n = 1.0 / Math.sqrt(class2273.field13839 * class2273.field13839 + class2273.field13840 * class2273.field13840 + class2273.field13841 * class2273.field13841);
        this.field13839 = class2273.field13839 * n;
        this.field13840 = class2273.field13840 * n;
        this.field13841 = class2273.field13841 * n;
    }
    
    public final void method8558() {
        final double n = 1.0 / Math.sqrt(this.field13839 * this.field13839 + this.field13840 * this.field13840 + this.field13841 * this.field13841);
        this.field13839 *= n;
        this.field13840 *= n;
        this.field13841 *= n;
    }
    
    public final double method8559(final Class2273 class2273) {
        return this.field13839 * class2273.field13839 + this.field13840 * class2273.field13840 + this.field13841 * class2273.field13841;
    }
    
    public final double method8560() {
        return this.field13839 * this.field13839 + this.field13840 * this.field13840 + this.field13841 * this.field13841;
    }
    
    public final double method8561() {
        return Math.sqrt(this.field13839 * this.field13839 + this.field13840 * this.field13840 + this.field13841 * this.field13841);
    }
    
    public final double method8562(final Class2273 class2273) {
        double a = this.method8559(class2273) / (this.method8561() * class2273.method8561());
        if (a < -1.0) {
            a = -1.0;
        }
        if (a > 1.0) {
            a = 1.0;
        }
        return Math.acos(a);
    }
}
