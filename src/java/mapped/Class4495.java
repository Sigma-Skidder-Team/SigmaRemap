// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public class Class4495 extends Class4484
{
    private static String[] field19891;
    
    public Class4495(final int n, final Class6997 field19849, final Class179 class179) {
        super(Class9520.field40957, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4495(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40957, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 1, 0, true);
    }
    
    public static Class4495 method13487(final List<Class4473> list, final int n, final int n2, final int n3, final Class179 class179, final int n4) {
        final Class6997 method21408 = Class6997.method21408(n, n2, n3, -1, 0, 0, 5, 7, 5, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4495(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 0, 0, 4, 1, 4, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 4, 5, 4, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        final Class7096 class1855 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17467, true);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 5, 4, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 4, 2, 0, 4, 5, 4, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 3, 1, 0, 4, 1, class1855, class1855, false);
        this.method13444(class1851, class1853, 0, 3, 3, 0, 4, 3, class1855, class1855, false);
        this.method13444(class1851, class1853, 4, 3, 1, 4, 4, 1, class1855, class1855, false);
        this.method13444(class1851, class1853, 4, 3, 3, 4, 4, 3, class1855, class1855, false);
        this.method13444(class1851, class1853, 0, 6, 0, 4, 6, 4, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.method13449(class1851, Class7521.field29394.method11878(), i, -1, j, class1853);
            }
        }
        return true;
    }
}
