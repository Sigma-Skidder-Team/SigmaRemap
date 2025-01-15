// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3610 extends Class3607
{
    private static String[] field16793;
    
    public Class3610(final Class793 class793, final double n) {
        super(class793, n);
    }
    
    @Override
    public boolean method11013() {
        if (this.field16794.method2634() == null && !this.field16794.method1804()) {
            return false;
        }
        final BlockPos method11136 = this.method11136(this.field16794.world, this.field16794, 7, 4);
        if (method11136 == null) {
            return this.method11135();
        }
        this.field16796 = method11136.getX();
        this.field16797 = method11136.getY();
        this.field16798 = method11136.getZ();
        return true;
    }
}
