// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2292 extends Class2290 implements Serializable
{
    private static String[] field13924;
    public static final long field13919 = -2168194326883512320L;
    
    public Class2292(final float n, final float n2) {
        super(n, n2);
    }
    
    public Class2292(final float[] array) {
        super(array);
    }
    
    public Class2292(final Class2292 class2292) {
        super(class2292);
    }
    
    public Class2292(final Class2298 class2298) {
        super(class2298);
    }
    
    public Class2292(final Class2290 class2290) {
        super(class2290);
    }
    
    public Class2292(final Class2297 class2297) {
        super(class2297);
    }
    
    public Class2292() {
    }
    
    public final float method9021(final Class2292 class2292) {
        return this.field13920 * class2292.field13920 + this.field13921 * class2292.field13921;
    }
    
    public final float method9022() {
        return (float)Math.sqrt(this.field13920 * this.field13920 + this.field13921 * this.field13921);
    }
    
    public final float method9023() {
        return this.field13920 * this.field13920 + this.field13921 * this.field13921;
    }
    
    public final void method9024(final Class2292 class2292) {
        final float n = (float)(1.0 / Math.sqrt(class2292.field13920 * class2292.field13920 + class2292.field13921 * class2292.field13921));
        this.field13920 = class2292.field13920 * n;
        this.field13921 = class2292.field13921 * n;
    }
    
    public final void method9025() {
        final float n = (float)(1.0 / Math.sqrt(this.field13920 * this.field13920 + this.field13921 * this.field13921));
        this.field13920 *= n;
        this.field13921 *= n;
    }
    
    public final float method9026(final Class2292 class2292) {
        double a = this.method9021(class2292) / (this.method9022() * class2292.method9022());
        if (a < -1.0) {
            a = -1.0;
        }
        if (a > 1.0) {
            a = 1.0;
        }
        return (float)Math.acos(a);
    }
}
