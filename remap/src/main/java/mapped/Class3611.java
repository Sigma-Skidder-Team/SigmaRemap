// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3611 extends Class3607
{
    private static String[] field16793;
    private final Class791 field16801;
    
    public Class3611(final Class791 field16801, final double n) {
        super(field16801, n);
        this.field16801 = field16801;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16801.method1804()) {
            return false;
        }
        final BlockPos method11136 = this.method11136(this.field16794.field2391, this.field16794, 5, 4);
        if (method11136 == null) {
            return this.method11135();
        }
        this.field16796 = method11136.getX();
        this.field16797 = method11136.getY();
        this.field16798 = method11136.getZ();
        return true;
    }
    
    @Override
    public boolean method11017() {
        if (!this.field16801.method4374()) {
            return super.method11017();
        }
        this.field16801.method4150().method24733();
        return false;
    }
}
