// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.Direction;

import java.util.Map;

public class Class3945 extends Class3944
{
    private static String[] field17838;
    public static final Class7115 field17839;
    private static final Map<Direction, Class7702> field17840;
    
    public Class3945(final Class181 class181, final Class9288 class182) {
        super(class181, class182);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3945.field17839, Direction.NORTH));
    }
    
    @Override
    public String method11856() {
        return this.method11704().method11717();
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return class7097.method6701(class7098.method1149(class7096.method21772((Class7111<Direction>)Class3945.field17839).getOpposite())).method21697().method26439();
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 == class7096.method21772((Class7111<Direction>)Class3945.field17839).getOpposite() && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3945.field17840.get(class7096.method21772((Class7111<Object>)Class3945.field17839));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        Class7096 method11878 = this.method11878();
        final Class1847 method11879 = class7074.method21654();
        final BlockPos method11880 = class7074.method21639();
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis().isHorizontal()) {
                method11878 = ((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3945.field17839, class7075.getOpposite());
                if (method11878.method21752(method11879, method11880)) {
                    return method11878;
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3945.field17839, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3945.field17839)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3945.field17839)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3945.field17839);
    }
    
    static {
        field17839 = Class3892.field17564;
        field17840 = Maps.newEnumMap((Map)ImmutableMap.of((Object) Direction.NORTH, (Object)Class3833.method11778(0.0, 0.0, 14.0, 16.0, 12.5, 16.0), (Object) Direction.SOUTH, (Object)Class3833.method11778(0.0, 0.0, 0.0, 16.0, 12.5, 2.0), (Object) Direction.WEST, (Object)Class3833.method11778(14.0, 0.0, 0.0, 16.0, 12.5, 16.0), (Object) Direction.EAST, (Object)Class3833.method11778(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)));
    }
}
