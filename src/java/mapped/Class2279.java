// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2279 extends Class2275 implements Serializable
{
    private static String[] field13875;
    public static final long field13876 = 4643134103185764459L;
    
    public Class2279(final float n, final float n2, final float n3, final float n4) {
        super(n, n2, n3, n4);
    }
    
    public Class2279(final float[] array) {
        super(array);
    }
    
    public Class2279(final Class2279 class2279) {
        super(class2279);
    }
    
    public Class2279(final Class10 class10) {
        super(class10);
    }
    
    public Class2279(final Class2275 class2275) {
        super(class2275);
    }
    
    public Class2279(final Class7 class7) {
        super(class7);
    }
    
    public Class2279(final Class2285 class2285) {
        super(class2285.field13909, class2285.field13910, class2285.field13911, 1.0f);
    }
    
    public Class2279() {
    }
    
    public final void method8691(final Class2285 class2285) {
        this.field13863 = class2285.field13909;
        this.field13864 = class2285.field13910;
        this.field13865 = class2285.field13911;
        this.field13866 = 1.0f;
    }
    
    public final float method8716(final Class2279 class2279) {
        final float n = this.field13863 - class2279.field13863;
        final float n2 = this.field13864 - class2279.field13864;
        final float n3 = this.field13865 - class2279.field13865;
        final float n4 = this.field13866 - class2279.field13866;
        return n * n + n2 * n2 + n3 * n3 + n4 * n4;
    }
    
    public final float method8717(final Class2279 class2279) {
        final float n = this.field13863 - class2279.field13863;
        final float n2 = this.field13864 - class2279.field13864;
        final float n3 = this.field13865 - class2279.field13865;
        final float n4 = this.field13866 - class2279.field13866;
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4);
    }
    
    public final float method8718(final Class2279 class2279) {
        return Math.abs(this.field13863 - class2279.field13863) + Math.abs(this.field13864 - class2279.field13864) + Math.abs(this.field13865 - class2279.field13865) + Math.abs(this.field13866 - class2279.field13866);
    }
    
    public final float method8719(final Class2279 class2279) {
        return Math.max(Math.max(Math.abs(this.field13863 - class2279.field13863), Math.abs(this.field13864 - class2279.field13864)), Math.max(Math.abs(this.field13865 - class2279.field13865), Math.abs(this.field13866 - class2279.field13866)));
    }
    
    public final void method8720(final Class2279 class2279) {
        final float n = 1.0f / class2279.field13866;
        this.field13863 = class2279.field13863 * n;
        this.field13864 = class2279.field13864 * n;
        this.field13865 = class2279.field13865 * n;
        this.field13866 = 1.0f;
    }
}
