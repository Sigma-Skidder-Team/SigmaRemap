// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class3868 extends Class3869 implements Class3867
{
    private static String[] field17507;
    public static final Class7114<Class182> field17508;
    public static final Class7702 field17509;
    
    public Class3868(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3868.field17509;
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21761(class7097, class7098, Direction.UP) && class7096.method21696() != Class7521.field29642;
    }
    
    @Override
    public ItemStack method11862(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857) {
        return new ItemStack(Class7521.field29244);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method11846 = super.method11846(class7074);
        if (method11846 != null) {
            final Class7099 method11847 = class7074.method21654().method6702(class7074.method21639().method1137());
            if (method11847.method21793(Class7324.field28319)) {
                if (method11847.method21784() == 8) {
                    return method11846;
                }
            }
        }
        return null;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        if (class7096.method21772(Class3868.field17508) != Class182.field564) {
            final Class7099 method6702 = class7097.method6702(class7098);
            if (super.method11843(class7096, class7097, class7098)) {
                if (method6702.method21793(Class7324.field28319)) {
                    if (method6702.method21784() == 8) {
                        return true;
                    }
                }
            }
            return false;
        }
        final Class7096 method6703 = class7097.method6701(class7098.method1139());
        return method6703.method21696() == this && method6703.method21772(Class3868.field17508) == Class182.field565;
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return Class7558.field29976.method22177(false);
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
        field17508 = Class3869.field17511;
        field17509 = Class3833.method11778(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}
