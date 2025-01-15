// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class3617 extends Class3446
{
    public final /* synthetic */ Class798 field16814;
    
    private Class3617(final Class798 field16814) {
        this.field16814 = field16814;
    }
    
    public abstract boolean method11137();
    
    public abstract boolean method11138();
    
    @Override
    public boolean method11013() {
        return this.method11137() && !this.field16814.method4519();
    }
    
    @Override
    public boolean method11017() {
        return this.method11138() && !this.field16814.method4519();
    }
}
