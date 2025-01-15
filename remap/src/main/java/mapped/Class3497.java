// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3497 extends Class3496
{
    private static String[] field16444;
    private int field16451;
    public final /* synthetic */ Class803 field16452;
    
    public Class3497(final Class803 field16452, final double n) {
        this.field16452 = field16452;
        super(field16452, n);
        this.field16451 = 100;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16452.method2783() || this.field16445.method4152() != null) {
            return false;
        }
        if (this.field16452.world.method6770()) {
            return true;
        }
        if (this.field16451 <= 0) {
            this.field16451 = 100;
            final BlockPos class354 = new BlockPos(this.field16445);
            if (this.field16452.world.method6703()) {
                if (this.field16452.world.method6994(class354)) {
                    if (!((Class1849)this.field16452.world).method6922(class354)) {
                        if (this.method11059()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        --this.field16451;
        return false;
    }
    
    @Override
    public void method11015() {
        Class803.method4691(this.field16452);
        super.method11015();
    }
}
