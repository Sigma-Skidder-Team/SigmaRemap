// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4022 extends Class3833
{
    private static String[] field18107;
    public static final Class7702 field18108;
    
    public Class4022(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class4022.field18108;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return (class7097 == Class179.field511 && !this.method11843(class7096, class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        return Class3833.method11813(class7097, class7098.method1139(), Class179.field512);
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        final double n = class7098.method1074() + 0.5;
        final double n2 = class7098.method1075() + 0.7;
        final double n3 = class7098.method1076() + 0.5;
        class7097.method6709(Class8432.field34639, n, n2, n3, 0.0, 0.0, 0.0);
        class7097.method6709(Class8432.field34623, n, n2, n3, 0.0, 0.0, 0.0);
    }
    
    static {
        field18108 = Class3833.method11778(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
    }
}
