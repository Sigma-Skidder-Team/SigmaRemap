// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3487 extends Class3479
{
    private static String[] field16419;
    private final Class800 field16420;
    
    public Class3487(final Class800 field16420, final double n) {
        super(field16420, n, 8);
        this.field16420 = field16420;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16420.method4480()) {
            if (!this.field16420.method4483()) {
                return super.method11013();
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16420.method4490().method11058(false);
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16420.method4484(false);
    }
    
    @Override
    public void method11016() {
        super.method11016();
        this.field16420.method4490().method11058(false);
        if (this.method11048()) {
            if (!this.field16420.method4483()) {
                this.field16420.method4484(true);
            }
        }
        else {
            this.field16420.method4484(false);
        }
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        if (!class1852.method6961(class1853.method1137())) {
            return false;
        }
        final BlockState method6701 = class1852.getBlockState(class1853);
        final Block method6702 = method6701.getBlock();
        if (method6702 != Blocks.CHEST) {
            return (method6702 == Blocks.field29299 && method6701.get(Class3951.field17847)) || (method6702.method11785(Class7188.field27910) && method6701.get(Class3900.field17599) != Class105.field323);
        }
        return Class475.method2424(class1852, class1853) < 1;
    }
}
