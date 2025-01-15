// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4496 extends Class4484
{
    private static String[] field19892;
    
    public Class4496(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40953, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4496(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40953, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        int n = 1;
        final Direction method13455 = this.method13455();
        if (method13455 == Direction.WEST || method13455 == Direction.NORTH) {
            n = 5;
        }
        this.method13475((Class4494)class4473, list, random, 0, n, random.nextInt(8) > 0);
        this.method13476((Class4494)class4473, list, random, 0, n, random.nextInt(8) > 0);
    }
    
    public static Class4496 method13488(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -3, 0, 0, 9, 7, 9, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4496(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        final Class7096 class1855 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17467, true);
        final Class7096 class1856 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17466, true);
        this.method13444(class1851, class1853, 0, 0, 0, 8, 1, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 8, 5, 8, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13444(class1851, class1853, 0, 6, 0, 8, 6, 5, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 2, 5, 0, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 2, 0, 8, 5, 0, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 3, 0, 1, 4, 0, class1856, class1856, false);
        this.method13444(class1851, class1853, 7, 3, 0, 7, 4, 0, class1856, class1856, false);
        this.method13444(class1851, class1853, 0, 2, 4, 8, 2, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 1, 4, 2, 2, 4, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13444(class1851, class1853, 6, 1, 4, 7, 2, 4, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13444(class1851, class1853, 1, 3, 8, 7, 3, 8, class1856, class1856, false);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17466, true)).method21773((Class7111<Comparable>)Class3929.field17467, true), 0, 3, 8, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17467, true), 8, 3, 8, class1853);
        this.method13444(class1851, class1853, 0, 3, 6, 0, 3, 7, class1855, class1855, false);
        this.method13444(class1851, class1853, 8, 3, 6, 8, 3, 7, class1855, class1855, false);
        this.method13444(class1851, class1853, 0, 3, 4, 0, 5, 5, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 8, 3, 4, 8, 5, 5, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 3, 5, 2, 5, 5, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 3, 5, 7, 5, 5, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 4, 5, 1, 5, 5, class1856, class1856, false);
        this.method13444(class1851, class1853, 7, 4, 5, 7, 5, 5, class1856, class1856, false);
        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j <= 8; ++j) {
                this.method13449(class1851, Class7521.field29394.method11878(), j, -1, i, class1853);
            }
        }
        return true;
    }
}
