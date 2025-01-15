// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4488 extends Class4484
{
    private static String[] field19881;
    
    public Class4488(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40961, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4488(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40961, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 2, 0, false);
        this.method13475((Class4494)class4473, list, random, 0, 2, false);
        this.method13476((Class4494)class4473, list, random, 0, 2, false);
    }
    
    public static Class4488 method13481(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -2, 0, 0, 7, 9, 7, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4488(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 0, 0, 6, 1, 6, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 6, 7, 6, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 1, 6, 0, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 6, 1, 6, 6, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 2, 0, 6, 6, 0, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 2, 6, 6, 6, 6, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 6, 1, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 5, 0, 6, 6, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 2, 0, 6, 6, 1, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 2, 5, 6, 6, 6, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        final Class7096 class1855 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17466, true);
        final Class7096 class1856 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17467, true);
        this.method13444(class1851, class1853, 2, 6, 0, 4, 6, 0, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 2, 5, 0, 4, 5, 0, class1855, class1855, false);
        this.method13444(class1851, class1853, 2, 6, 6, 4, 6, 6, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 2, 5, 6, 4, 5, 6, class1855, class1855, false);
        this.method13444(class1851, class1853, 0, 6, 2, 0, 6, 4, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 5, 2, 0, 5, 4, class1856, class1856, false);
        this.method13444(class1851, class1853, 6, 6, 2, 6, 6, 4, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 5, 2, 6, 5, 4, class1856, class1856, false);
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.method13449(class1851, Class7521.field29394.method11878(), i, -1, j, class1853);
            }
        }
        return true;
    }
}
