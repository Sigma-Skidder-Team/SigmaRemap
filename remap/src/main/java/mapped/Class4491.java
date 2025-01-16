// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4491 extends Class4484
{
    private static String[] field19884;
    
    public Class4491(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40951, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4491(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40951, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 1, 3, false);
    }
    
    public static Class4491 method13484(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -3, 0, 5, 10, 19, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4491(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 3, 0, 4, 4, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 5, 0, 3, 7, 18, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 0, 5, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 5, 0, 4, 5, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 4, 2, 5, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 13, 4, 2, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 0, 0, 4, 1, 3, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 0, 15, 4, 1, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 2; ++j) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), i, -1, j, class1853);
                this.method13449(class1851, Class7521.field29394.getDefaultState(), i, -1, 18 - j, class1853);
            }
        }
        final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17467, true);
        final BlockState class1856 = ((StateHolder<Object, BlockState>)class1855).with((IProperty<Comparable>)Class3929.field17466, true);
        final BlockState class1857 = ((StateHolder<Object, BlockState>)class1855).with((IProperty<Comparable>)Class3929.field17468, true);
        this.method13444(class1851, class1853, 0, 1, 1, 0, 4, 1, class1856, class1856, false);
        this.method13444(class1851, class1853, 0, 3, 4, 0, 4, 4, class1856, class1856, false);
        this.method13444(class1851, class1853, 0, 3, 14, 0, 4, 14, class1856, class1856, false);
        this.method13444(class1851, class1853, 0, 1, 17, 0, 4, 17, class1856, class1856, false);
        this.method13444(class1851, class1853, 4, 1, 1, 4, 4, 1, class1857, class1857, false);
        this.method13444(class1851, class1853, 4, 3, 4, 4, 4, 4, class1857, class1857, false);
        this.method13444(class1851, class1853, 4, 3, 14, 4, 4, 14, class1857, class1857, false);
        this.method13444(class1851, class1853, 4, 1, 17, 4, 4, 17, class1857, class1857, false);
        return true;
    }
}
