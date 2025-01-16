// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3488 extends Class3479
{
    private static String[] field16421;
    private final Class793 field16422;
    
    private Class3488(final Class793 field16422, final double n) {
        super(field16422, field16422.method2625() ? 2.0 : n, 24);
        this.field16422 = field16422;
        this.field16399 = -1;
    }
    
    @Override
    public boolean method11017() {
        if (!this.field16422.method1706()) {
            if (this.field16393 <= 1200) {
                if (this.method11050(this.field16422.world, this.field16395)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16422.method2625() && !this.field16422.method1706()) {
            return super.method11013();
        }
        if (!Class793.method4468(this.field16422)) {
            if (!this.field16422.method1706()) {
                if (!this.field16422.method4456()) {
                    return super.method11013();
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11047() {
        return this.field16393 % 160 == 0;
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        return class1852.getBlockState(class1853).getBlock() == Class7521.field29173;
    }
}
