// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.Direction;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.Map;

public class Class4023 extends Class4022
{
    private static String[] field18109;
    public static final Class7115 field18110;
    private static final Map<Direction, Class7702> field18111;
    
    public Class4023(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4023.field18110, Direction.NORTH));
    }
    
    @Override
    public String method11856() {
        return this.method11704().method11717();
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return method12215(class7096);
    }
    
    public static Class7702 method12215(final Class7096 class7096) {
        return Class4023.field18111.get(class7096.method21772((Class7111<Object>)Class4023.field18110));
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final Direction class7099 = class7096.method21772((Class7111<Direction>)Class4023.field18110);
        final BlockPos method1149 = class7098.method1149(class7099.getOpposite());
        return class7097.method6701(method1149).method21761(class7097, method1149, class7099);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        Class7096 method11878 = this.method11878();
        final Class1847 method11879 = class7074.method21654();
        final BlockPos method11880 = class7074.method21639();
        for (final Direction class7075 : class7074.method21643()) {
            if (class7075.getAxis().isHorizontal()) {
                method11878 = ((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class4023.field18110, class7075.getOpposite());
                if (method11878.method21752(method11879, method11880)) {
                    return method11878;
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097.getOpposite() == class7096.method21772((Class7111<Direction>)Class4023.field18110) && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : class7096;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Random random) {
        final Direction class7099 = class7096.method21772((Class7111<Direction>)Class4023.field18110);
        final double n = class7098.getX() + 0.5;
        final double n2 = class7098.getY() + 0.7;
        final double n3 = class7098.getZ() + 0.5;
        final Direction method782 = class7099.getOpposite();
        class7097.method6709(Class8432.field34639, n + 0.27 * method782.getXOffset(), n2 + 0.22, n3 + 0.27 * method782.getZOffset(), 0.0, 0.0, 0.0);
        class7097.method6709(Class8432.field34623, n + 0.27 * method782.getXOffset(), n2 + 0.22, n3 + 0.27 * method782.getZOffset(), 0.0, 0.0, 0.0);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4023.field18110, class7097.method8142(class7096.method21772((Class7111<Direction>)Class4023.field18110)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class4023.field18110)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4023.field18110);
    }
    
    static {
        field18110 = Class3892.field17564;
        field18111 = Maps.newEnumMap((Map)ImmutableMap.of((Object) Direction.NORTH, (Object)Class3833.method11778(5.5, 3.0, 11.0, 10.5, 13.0, 16.0), (Object) Direction.SOUTH, (Object)Class3833.method11778(5.5, 3.0, 0.0, 10.5, 13.0, 5.0), (Object) Direction.WEST, (Object)Class3833.method11778(11.0, 3.0, 5.5, 16.0, 13.0, 10.5), (Object) Direction.EAST, (Object)Class3833.method11778(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)));
    }
}
