// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2272 extends Class2271 implements Serializable
{
    private static String[] field13842;
    public static final long field13838 = 5718062286069042927L;
    
    public Class2272(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public Class2272(final double[] array) {
        super(array);
    }
    
    public Class2272(final Class2272 class2272) {
        super(class2272);
    }
    
    public Class2272(final Class2286 class2286) {
        super(class2286);
    }
    
    public Class2272(final Class2285 class2285) {
        super(class2285);
    }
    
    public Class2272(final Class2271 class2271) {
        super(class2271);
    }
    
    public Class2272() {
    }
    
    public final double method8551(final Class2272 class2272) {
        final double n = this.field13839 - class2272.field13839;
        final double n2 = this.field13840 - class2272.field13840;
        final double n3 = this.field13841 - class2272.field13841;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public final double method8552(final Class2272 class2272) {
        final double n = this.field13839 - class2272.field13839;
        final double n2 = this.field13840 - class2272.field13840;
        final double n3 = this.field13841 - class2272.field13841;
        return Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public final double method8553(final Class2272 class2272) {
        return Math.abs(this.field13839 - class2272.field13839) + Math.abs(this.field13840 - class2272.field13840) + Math.abs(this.field13841 - class2272.field13841);
    }
    
    public final double method8554(final Class2272 class2272) {
        return Math.max(Math.max(Math.abs(this.field13839 - class2272.field13839), Math.abs(this.field13840 - class2272.field13840)), Math.abs(this.field13841 - class2272.field13841));
    }
    
    public final void method8555(final Class10 class10) {
        final double n = 1.0 / class10.field21;
        this.field13839 = class10.field18 * n;
        this.field13840 = class10.field19 * n;
        this.field13841 = class10.field20 * n;
    }
}
