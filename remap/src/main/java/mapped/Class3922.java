// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class3922 extends Class3833 implements Class3856
{
    private static String[] field17781;
    public static final Class7113 field17782;
    private static final Class7702 field17783;
    
    public Class3922(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3922.field17782, true));
    }
    
    public void method12037(final Class7096 class7096, final Class1851 class7097, final BlockPos class7098) {
        if (!method12038(class7096, class7097, class7098)) {
            class7097.method6833().method21345(class7098, this, 60 + class7097.method6790().nextInt(40));
        }
    }
    
    public static boolean method12038(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        if (!class7096.method21772((Class7111<Boolean>)Class3922.field17782)) {
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                if (class7097.method6702(class7098.method1149(values[i])).method21793(Class7324.field28319)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7099 method6702 = class7074.method21654().method6702(class7074.method21639());
        return (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3922.field17782, method6702.method21793(Class7324.field28319) && method6702.method21784() == 8);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3922.field17783;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3922.field17782)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return (class7097 == Direction.DOWN && !this.method11843(class7096, class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        return class7097.method6701(method1139).method21761(class7097, method1139, Direction.UP);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3922.field17782);
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3922.field17782) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    static {
        field17782 = Class8970.field37747;
        field17783 = Class3833.method11778(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
    }
}
