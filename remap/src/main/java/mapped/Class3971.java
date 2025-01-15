// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class3971 extends Class3833
{
    private static String[] field17942;
    public static final Class7702 field17943;
    
    public Class3971(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return this.method11878().method21752(class7074.method21654(), class7074.method21639()) ? super.method11846(class7074) : Class3833.method11777(this.method11878(), Class7521.field29156.method11878(), class7074.method21654(), class7074.method21639());
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 == Direction.UP) {
            if (!class7096.method21752(class7099, class7100)) {
                class7099.method6833().method21345(class7100, this, 1);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        Class4021.method12212(class7096, class7097, class7098);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Class7096 method6701 = class7097.method6701(class7098.method1137());
        return !method6701.method21697().method26439() || method6701.method21696() instanceof Class3898;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3971.field17943;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public boolean method11795(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return true;
    }
    
    static {
        field17943 = Class4021.field18106;
    }
}
