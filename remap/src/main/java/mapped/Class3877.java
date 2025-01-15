// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3877 extends Class3874 implements Class3872, Class3867
{
    private static String[] field17519;
    public static final Class7702 field17528;
    
    public Class3877(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3877.field17528;
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21761(class7097, class7098, Direction.UP) && class7096.method21696() != Class7521.field29642;
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7099 method6702 = class7074.method21654().method6702(class7074.method21639());
        return (method6702.method21793(Class7324.field28319) && method6702.method21784() == 8) ? super.method11846(class7074) : null;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        final Class7096 method11789 = super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
        if (!method11789.method21706()) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return method11789;
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final World class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return Class7558.field29976.method22177(false);
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        final Class7096 method11878 = Class7521.field29245.method11878();
        final Class7096 class1852 = ((Class7097<O, Class7096>)method11878).method21773(Class3868.field17508, Class182.field564);
        final BlockPos method11879 = class1850.method1137();
        if (class1849.method6701(method11879).method21696() == Class7521.field29173) {
            class1849.method6688(class1850, method11878, 2);
            class1849.method6688(method11879, class1852, 2);
        }
    }
    
    @Override
    public boolean method11920(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final Class7255 class1858) {
        return false;
    }
    
    @Override
    public boolean method11921(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853, final Class7099 class1854) {
        return false;
    }
    
    static {
        field17528 = Class3833.method11778(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
    }
}
