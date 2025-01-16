// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3559 extends Class3555<PlayerEntity>
{
    private static String[] field16633;
    
    public Class3559(final Class798 class798) {
        super(class798, PlayerEntity.class, true);
    }
    
    @Override
    public boolean method11013() {
        return this.method11106() && super.method11013();
    }
    
    @Override
    public boolean method11017() {
        if (this.method11106() && this.field16602.method4152() != null) {
            return super.method11017();
        }
        this.field16608 = null;
        return false;
    }
    
    private boolean method11106() {
        final Class798 class798 = (Class798)this.field16602;
        return class798.method4519() && !class798.method4531();
    }
}
