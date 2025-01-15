// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3874 extends Class3833
{
    private static String[] field17519;
    
    public Class3874(final Class9288 class9288) {
        super(class9288);
    }
    
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        final Class3833 method21696 = class7096.method21696();
        if (method21696 != Class7521.field29155) {
            if (method21696 != Class7521.field29156) {
                if (method21696 != Class7521.field29157) {
                    if (method21696 != Class7521.field29158) {
                        if (method21696 != Class7521.field29298) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return class7096.method21752(class7099, class7100) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : Class7521.field29147.method11878();
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        return this.method11943(class7097.method6701(method1139), class7097, method1139);
    }
    
    @Override
    public boolean method11818(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return (class7099 == Class2084.field12053 && !this.field17408) || super.method11796(class7096, class7097, class7098, class7099);
    }
}
