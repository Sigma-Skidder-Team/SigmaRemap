// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2277 extends Class2275 implements Serializable
{
    private static String[] field13869;
    public static final long field13862 = 8749319902347760659L;
    
    public Class2277(final float n, final float n2, final float n3, final float n4) {
        super(n, n2, n3, n4);
    }
    
    public Class2277(final float[] array) {
        super(array);
    }
    
    public Class2277(final Class2277 class2277) {
        super(class2277);
    }
    
    public Class2277(final Class9 class9) {
        super(class9);
    }
    
    public Class2277(final Class2275 class2275) {
        super(class2275);
    }
    
    public Class2277(final Class7 class7) {
        super(class7);
    }
    
    public Class2277(final Class2285 class2285) {
        super(class2285.field13909, class2285.field13910, class2285.field13911, 0.0f);
    }
    
    public Class2277() {
    }
    
    public final void method8691(final Class2285 class2285) {
        this.field13863 = class2285.field13909;
        this.field13864 = class2285.field13910;
        this.field13865 = class2285.field13911;
        this.field13866 = 0.0f;
    }
    
    public final float method8692() {
        return (float)Math.sqrt(this.field13863 * this.field13863 + this.field13864 * this.field13864 + this.field13865 * this.field13865 + this.field13866 * this.field13866);
    }
    
    public final float method8693() {
        return this.field13863 * this.field13863 + this.field13864 * this.field13864 + this.field13865 * this.field13865 + this.field13866 * this.field13866;
    }
    
    public final float method8694(final Class2277 class2277) {
        return this.field13863 * class2277.field13863 + this.field13864 * class2277.field13864 + this.field13865 * class2277.field13865 + this.field13866 * class2277.field13866;
    }
    
    public final void method8695(final Class2277 class2277) {
        final float n = (float)(1.0 / Math.sqrt(class2277.field13863 * class2277.field13863 + class2277.field13864 * class2277.field13864 + class2277.field13865 * class2277.field13865 + class2277.field13866 * class2277.field13866));
        this.field13863 = class2277.field13863 * n;
        this.field13864 = class2277.field13864 * n;
        this.field13865 = class2277.field13865 * n;
        this.field13866 = class2277.field13866 * n;
    }
    
    public final void method8696() {
        final float n = (float)(1.0 / Math.sqrt(this.field13863 * this.field13863 + this.field13864 * this.field13864 + this.field13865 * this.field13865 + this.field13866 * this.field13866));
        this.field13863 *= n;
        this.field13864 *= n;
        this.field13865 *= n;
        this.field13866 *= n;
    }
    
    public final float method8697(final Class2277 class2277) {
        double a = this.method8694(class2277) / (this.method8692() * class2277.method8692());
        if (a < -1.0) {
            a = -1.0;
        }
        if (a > 1.0) {
            a = 1.0;
        }
        return (float)Math.acos(a);
    }
}
