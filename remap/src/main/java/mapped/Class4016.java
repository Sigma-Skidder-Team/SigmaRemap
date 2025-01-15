// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class4016 extends Class3833
{
    private static String[] field18090;
    public static final Class7702 field18091;
    private final Class181 field18092;
    
    public Class4016(final Class181 field18092, final Class9288 class9288) {
        super(class9288);
        this.field18092 = field18092;
    }
    
    public Class181 method12199() {
        return this.field18092;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class4016.field18091;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return class7096.method21752(class7099, class7100) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : Class7521.field29147.method11878();
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return !class7097.method6961(class7098.method1139());
    }
    
    static {
        field18091 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    }
}
