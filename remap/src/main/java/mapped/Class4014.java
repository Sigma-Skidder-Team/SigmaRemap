// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class4014 extends Class3833
{
    private static String[] field18085;
    public static final Class7113 field18086;
    public static final Class7702 field18087;
    public static final Class7702 field18088;
    
    public Class4014(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4014.field18086, false));
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis() == Axis.Y) {
                final Class7096 class7076 = ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class4014.field18086, class7075 == Direction.UP);
                if (class7076.method21752(class7074.method21654(), class7074.method21639())) {
                    return class7076;
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return class7096.method21772((Class7111<Boolean>)Class4014.field18086) ? Class4014.field18088 : Class4014.field18087;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4014.field18086);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Direction method782 = method12196(class7096).getOpposite();
        return Class3833.method11813(class7097, class7098.method1149(method782), method782.getOpposite());
    }
    
    public static Direction method12196(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class4014.field18086) ? Direction.DOWN : Direction.UP;
    }
    
    @Override
    public Class2117 method11858(final Class7096 class7096) {
        return Class2117.field12341;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (method12196(class7096).getOpposite() == class7097 && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field18086 = Class8970.field37728;
        field18087 = Class7698.method24492(Class3833.method11778(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), Class3833.method11778(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
        field18088 = Class7698.method24492(Class3833.method11778(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), Class3833.method11778(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));
    }
}
