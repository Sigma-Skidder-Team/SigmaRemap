// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8295
{
    public final float field34097;
    public final float field34098;
    public final boolean field34099;
    
    public Class8295(final float field34097, final float field34098, final boolean field34099) {
        this.field34097 = field34097;
        this.field34098 = field34098;
        this.field34099 = field34099;
    }
    
    public Class8295 method27561(final float n) {
        return this.method27562(n, n);
    }
    
    public Class8295 method27562(final float n, final float n2) {
        return (!this.field34099 && (n != 1.0f || n2 != 1.0f)) ? method27563(this.field34097 * n, this.field34098 * n2) : this;
    }
    
    public static Class8295 method27563(final float n, final float n2) {
        return new Class8295(n, n2, false);
    }
    
    public static Class8295 method27564(final float n, final float n2) {
        return new Class8295(n, n2, true);
    }
    
    @Override
    public String toString() {
        return "EntityDimensions w=" + this.field34097 + ", h=" + this.field34098 + ", fixed=" + this.field34099;
    }
}
