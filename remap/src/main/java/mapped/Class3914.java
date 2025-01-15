// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class3914 extends Class3833 implements Class3867
{
    private static String[] field17726;
    private final Class3915 field17727;
    
    public Class3914(final Class3915 field17727, final Class9288 class9288) {
        super(class9288);
        this.field17727 = field17727;
    }
    
    @Override
    public Class7099 method11864(final BlockState class7096) {
        return Class7558.field29976.method22177(false);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!class7096.method21752(class7097, class7098)) {
            class7097.method7149(class7098, true);
        }
        super.method11822(class7096, class7097, class7098, random);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.DOWN) {
            if (!class7096.method21752(class7099, class7100)) {
                class7099.method6833().method21345(class7100, this, 1);
            }
        }
        if (class7097 == Direction.UP) {
            final Class3833 method21696 = class7098.method21696();
            if (method21696 != this) {
                if (method21696 != this.field17727) {
                    return this.field17727.method12020(class7099);
                }
            }
        }
        class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final BlockState class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        final BlockState method1140 = class7097.method6701(method1139);
        final Class3833 method1141 = method1140.method21696();
        return method1141 != Class7521.field29642 && (method1141 == this || method1140.method21761(class7097, method1139, Direction.UP));
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final BlockState class1857) {
        return new ItemStack(Class7521.field29713);
    }
    
    @Override
    public boolean method11920(final Class1855 class1855, final BlockPos class1856, final BlockState class1857, final Class7255 class1858) {
        return false;
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Class7099 class1854) {
        return false;
    }
}
