// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3618 extends Class3617
{
    private static String[] field16815;
    public final /* synthetic */ Class798 field16814;
    
    private Class3618(final Class798 field16814) {
        this.field16814 = field16814;
        super(field16814, null);
    }
    
    @Override
    public boolean method11137() {
        return Class798.method4568(this.field16814) < 10 && Class798.method4569(this.field16814).nextFloat() >= 0.3f && this.field16814.method4529() && Class798.method4570(this.field16814);
    }
    
    @Override
    public boolean method11138() {
        return this.method11137();
    }
    
    @Override
    public void method11016() {
        if (Class798.method4571(this.field16814).nextInt(30) == 0) {
            for (int i = 1; i <= 2; ++i) {
                final BlockPos method1140 = new BlockPos(this.field16814).method1140(i);
                final BlockState method1141 = this.field16814.world.getBlockState(method1140);
                final Block method1142 = method1141.getBlock();
                int n = 0;
                Object o = null;
                if (method1142.method11785(Class7188.field27933)) {
                    if (!(method1142 instanceof Class3878)) {
                        if (!(method1142 instanceof Class3873)) {
                            if (method1142 == Blocks.SWEET_BERRY_BUSH) {
                                if (method1141.get(Class3884.field17541) < 3) {
                                    n = 1;
                                    o = Class3884.field17541;
                                }
                            }
                        }
                        else if (method1141.get(Class3873.field17516) < 7) {
                            n = 1;
                            o = Class3873.field17516;
                        }
                    }
                    else {
                        final Class3878 class3878 = (Class3878)method1142;
                        if (!class3878.method11956(method1141)) {
                            n = 1;
                            o = class3878.method11952();
                        }
                    }
                    if (n != 0) {
                        this.field16814.world.method6955(2005, method1140, 0);
                        this.field16814.world.method6692(method1140, ((StateHolder<Object, BlockState>)method1141).with((IProperty<Comparable>)o, method1141.get((IProperty<Integer>)o) + 1));
                        Class798.method4572(this.field16814);
                    }
                }
            }
        }
    }
}
