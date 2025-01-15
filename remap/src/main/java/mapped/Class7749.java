// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class7749 extends Class7747
{
    private static String[] field31677;
    private BlockPos field31680;
    
    public Class7749(final Class759 class759, final Class1847 class760) {
        super(class759, class760);
    }
    
    @Override
    public Class9468 method24721(final BlockPos field31680, final int n) {
        this.field31680 = field31680;
        return super.method24721(field31680, n);
    }
    
    @Override
    public Class9468 method24722(final Entity class399, final int n) {
        this.field31680 = new BlockPos(class399);
        return super.method24722(class399, n);
    }
    
    @Override
    public boolean method24725(final Entity class399, final double field31660) {
        final Class9468 method24722 = this.method24722(class399, 0);
        if (method24722 == null) {
            this.field31680 = new BlockPos(class399);
            this.field31660 = field31660;
            return true;
        }
        return this.method24726(method24722, field31660);
    }
    
    @Override
    public void method24728() {
        if (this.method24731()) {
            if (this.field31680 != null) {
                if (!this.field31680.method1082(this.field31657.method1934(), this.field31657.method1930()) && (this.field31657.method1941() <= this.field31680.getY() || !new BlockPos(this.field31680.getX(), this.field31657.method1941(), this.field31680.getZ()).method1082(this.field31657.method1934(), this.field31657.method1930()))) {
                    this.field31657.method4148().method19907(this.field31680.getX(), this.field31680.getY(), this.field31680.getZ(), this.field31660);
                }
                else {
                    this.field31680 = null;
                }
            }
        }
        else {
            super.method24728();
        }
    }
}
