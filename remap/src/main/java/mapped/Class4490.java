// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4490 extends Class4484
{
    private static String[] field19883;
    
    public Class4490(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40952, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4490(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40952, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 1, 0, true);
    }
    
    public static Class4490 method13483(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -7, 0, 5, 14, 10, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4490(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        final Class7096 class1855 = ((Class7097<O, Class7096>)Class7521.field29396.method11878()).method21773((Class7111<Comparable>)Class3916.field17732, Direction.SOUTH);
        final Class7096 class1856 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17467, true);
        for (int i = 0; i <= 9; ++i) {
            final int max = Math.max(1, 7 - i);
            final int min = Math.min(Math.max(max + 5, 14 - i), 13);
            final int n = i;
            this.method13444(class1851, class1853, 0, 0, i, 4, max, i, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
            this.method13444(class1851, class1853, 1, max + 1, i, 3, min - 1, i, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
            if (i <= 6) {
                this.method13440(class1851, class1855, 1, max + 1, i, class1853);
                this.method13440(class1851, class1855, 2, max + 1, i, class1853);
                this.method13440(class1851, class1855, 3, max + 1, i, class1853);
            }
            this.method13444(class1851, class1853, 0, min, i, 4, min, i, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
            this.method13444(class1851, class1853, 0, max + 1, i, 0, min - 1, i, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
            this.method13444(class1851, class1853, 4, max + 1, i, 4, min - 1, i, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
            if ((i & 0x1) == 0x0) {
                this.method13444(class1851, class1853, 0, max + 2, i, 0, max + 3, i, class1856, class1856, false);
                this.method13444(class1851, class1853, 4, max + 2, i, 4, max + 3, i, class1856, class1856, false);
            }
            for (int j = 0; j <= 4; ++j) {
                this.method13449(class1851, Class7521.field29394.method11878(), j, -1, n, class1853);
            }
        }
        return true;
    }
}
