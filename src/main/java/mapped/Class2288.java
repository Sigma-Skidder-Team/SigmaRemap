// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2288 extends Class2285 implements Serializable
{
    private static String[] field13915;
    public static final long field13916 = -7031930069184524614L;
    
    public Class2288(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public Class2288(final float[] array) {
        super(array);
    }
    
    public Class2288(final Class2288 class2288) {
        super(class2288);
    }
    
    public Class2288(final Class2273 class2273) {
        super(class2273);
    }
    
    public Class2288(final Class2285 class2285) {
        super(class2285);
    }
    
    public Class2288(final Class2271 class2271) {
        super(class2271);
    }
    
    public Class2288() {
    }
    
    public final float method8982() {
        return this.field13909 * this.field13909 + this.field13910 * this.field13910 + this.field13911 * this.field13911;
    }
    
    public final float method8983() {
        return (float)Math.sqrt(this.field13909 * this.field13909 + this.field13910 * this.field13910 + this.field13911 * this.field13911);
    }
    
    public final void method8984(final Class2288 class2288, final Class2288 class2289) {
        final float field13909 = class2288.field13910 * class2289.field13911 - class2288.field13911 * class2289.field13910;
        final float field13910 = class2289.field13909 * class2288.field13911 - class2289.field13911 * class2288.field13909;
        this.field13911 = class2288.field13909 * class2289.field13910 - class2288.field13910 * class2289.field13909;
        this.field13909 = field13909;
        this.field13910 = field13910;
    }
    
    public final float method8985(final Class2288 class2288) {
        return this.field13909 * class2288.field13909 + this.field13910 * class2288.field13910 + this.field13911 * class2288.field13911;
    }
    
    public final void method8986(final Class2288 class2288) {
        final float n = (float)(1.0 / Math.sqrt(class2288.field13909 * class2288.field13909 + class2288.field13910 * class2288.field13910 + class2288.field13911 * class2288.field13911));
        this.field13909 = class2288.field13909 * n;
        this.field13910 = class2288.field13910 * n;
        this.field13911 = class2288.field13911 * n;
    }
    
    public final void method8987() {
        final float n = (float)(1.0 / Math.sqrt(this.field13909 * this.field13909 + this.field13910 * this.field13910 + this.field13911 * this.field13911));
        this.field13909 *= n;
        this.field13910 *= n;
        this.field13911 *= n;
    }
    
    public final float method8988(final Class2288 class2288) {
        double a = this.method8985(class2288) / (this.method8983() * class2288.method8983());
        if (a < -1.0) {
            a = -1.0;
        }
        if (a > 1.0) {
            a = 1.0;
        }
        return (float)Math.acos(a);
    }
}
