// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class10 extends Class7 implements Serializable
{
    private static String[] field27;
    public static final long field17 = 1733471895962736949L;
    
    public Class10(final double n, final double n2, final double n3, final double n4) {
        super(n, n2, n3, n4);
    }
    
    public Class10(final double[] array) {
        super(array);
    }
    
    public Class10(final Class10 class10) {
        super(class10);
    }
    
    public Class10(final Class2279 class2279) {
        super(class2279);
    }
    
    public Class10(final Class2275 class2275) {
        super(class2275);
    }
    
    public Class10(final Class7 class7) {
        super(class7);
    }
    
    public Class10(final Class2271 class2271) {
        super(class2271.field13839, class2271.field13840, class2271.field13841, 1.0);
    }
    
    public Class10() {
    }
    
    public final void method105(final Class2271 class2271) {
        this.field18 = class2271.field13839;
        this.field19 = class2271.field13840;
        this.field20 = class2271.field13841;
        this.field21 = 1.0;
    }
    
    public final double method112(final Class10 class10) {
        final double n = this.field18 - class10.field18;
        final double n2 = this.field19 - class10.field19;
        final double n3 = this.field20 - class10.field20;
        final double n4 = this.field21 - class10.field21;
        return n * n + n2 * n2 + n3 * n3 + n4 * n4;
    }
    
    public final double method113(final Class10 class10) {
        final double n = this.field18 - class10.field18;
        final double n2 = this.field19 - class10.field19;
        final double n3 = this.field20 - class10.field20;
        final double n4 = this.field21 - class10.field21;
        return Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4);
    }
    
    public final double method114(final Class10 class10) {
        return Math.abs(this.field18 - class10.field18) + Math.abs(this.field19 - class10.field19) + Math.abs(this.field20 - class10.field20) + Math.abs(this.field21 - class10.field21);
    }
    
    public final double method115(final Class10 class10) {
        return Math.max(Math.max(Math.abs(this.field18 - class10.field18), Math.abs(this.field19 - class10.field19)), Math.max(Math.abs(this.field20 - class10.field20), Math.abs(this.field21 - class10.field21)));
    }
    
    public final void method116(final Class10 class10) {
        final double n = 1.0 / class10.field21;
        this.field18 = class10.field18 * n;
        this.field19 = class10.field19 * n;
        this.field20 = class10.field20 * n;
        this.field21 = 1.0;
    }
}
