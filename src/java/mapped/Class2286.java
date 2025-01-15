// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2286 extends Class2285 implements Serializable
{
    private static String[] field13912;
    public static final long field13913 = -8689337816398030143L;
    
    public Class2286(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public Class2286(final float[] array) {
        super(array);
    }
    
    public Class2286(final Class2286 class2286) {
        super(class2286);
    }
    
    public Class2286(final Class2272 class2272) {
        super(class2272);
    }
    
    public Class2286(final Class2285 class2285) {
        super(class2285);
    }
    
    public Class2286(final Class2271 class2271) {
        super(class2271);
    }
    
    public Class2286() {
    }
    
    public final float method8977(final Class2286 class2286) {
        final float n = this.field13909 - class2286.field13909;
        final float n2 = this.field13910 - class2286.field13910;
        final float n3 = this.field13911 - class2286.field13911;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public final float method8978(final Class2286 class2286) {
        final float n = this.field13909 - class2286.field13909;
        final float n2 = this.field13910 - class2286.field13910;
        final float n3 = this.field13911 - class2286.field13911;
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public final float method8979(final Class2286 class2286) {
        return Math.abs(this.field13909 - class2286.field13909) + Math.abs(this.field13910 - class2286.field13910) + Math.abs(this.field13911 - class2286.field13911);
    }
    
    public final float method8980(final Class2286 class2286) {
        return Math.max(Math.max(Math.abs(this.field13909 - class2286.field13909), Math.abs(this.field13910 - class2286.field13910)), Math.abs(this.field13911 - class2286.field13911));
    }
    
    public final void method8981(final Class2279 class2279) {
        final float n = 1.0f / class2279.field13866;
        this.field13909 = class2279.field13863 * n;
        this.field13910 = class2279.field13864 * n;
        this.field13911 = class2279.field13865 * n;
    }
}
