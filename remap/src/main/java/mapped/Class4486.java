// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4486 extends Class4484
{
    private static String[] field19879;
    
    public Class4486(final int n, final Random random, final Class6997 field19849, final Direction class179) {
        super(Class9520.field40954, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4486(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40954, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 5, 3, true);
    }
    
    public static Class4486 method13479(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final Class6997 method21408 = Class6997.method21408(n, n2, n3, -5, -3, 0, 13, 14, 13, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4486(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 3, 0, 12, 4, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 12, 13, 12, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 1, 12, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 11, 5, 0, 12, 12, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 2, 5, 11, 4, 12, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 8, 5, 11, 10, 12, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 9, 11, 7, 12, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 2, 5, 0, 4, 12, 1, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 8, 5, 0, 10, 12, 1, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 9, 0, 7, 12, 1, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 2, 11, 2, 10, 12, 10, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 8, 0, 7, 8, 0, Class7521.field29395.method11878(), Class7521.field29395.method11878(), false);
        final Class7096 class1855 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17466, true);
        final Class7096 class1856 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17467, true);
        for (int i = 1; i <= 11; i += 2) {
            this.method13444(class1851, class1853, i, 10, 0, i, 11, 0, class1855, class1855, false);
            this.method13444(class1851, class1853, i, 10, 12, i, 11, 12, class1855, class1855, false);
            this.method13444(class1851, class1853, 0, 10, i, 0, 11, i, class1856, class1856, false);
            this.method13444(class1851, class1853, 12, 10, i, 12, 11, i, class1856, class1856, false);
            this.method13440(class1851, Class7521.field29394.method11878(), i, 13, 0, class1853);
            this.method13440(class1851, Class7521.field29394.method11878(), i, 13, 12, class1853);
            this.method13440(class1851, Class7521.field29394.method11878(), 0, 13, i, class1853);
            this.method13440(class1851, Class7521.field29394.method11878(), 12, 13, i, class1853);
            if (i != 11) {
                this.method13440(class1851, class1855, i + 1, 13, 0, class1853);
                this.method13440(class1851, class1855, i + 1, 13, 12, class1853);
                this.method13440(class1851, class1856, 0, 13, i + 1, class1853);
                this.method13440(class1851, class1856, 12, 13, i + 1, class1853);
            }
        }
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17466, true), 0, 13, 0, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17467, true)).method21773((Class7111<Comparable>)Class3929.field17466, true), 0, 13, 12, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17467, true)).method21773((Class7111<Comparable>)Class3929.field17468, true), 12, 13, 12, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17468, true), 12, 13, 0, class1853);
        for (int j = 3; j <= 9; j += 2) {
            this.method13444(class1851, class1853, 1, 7, j, 1, 8, j, ((Class7097<Object, Class7096>)class1856).method21773((Class7111<Comparable>)Class3929.field17468, true), ((Class7097<Object, Class7096>)class1856).method21773((Class7111<Comparable>)Class3929.field17468, true), false);
            this.method13444(class1851, class1853, 11, 7, j, 11, 8, j, ((Class7097<Object, Class7096>)class1856).method21773((Class7111<Comparable>)Class3929.field17466, true), ((Class7097<Object, Class7096>)class1856).method21773((Class7111<Comparable>)Class3929.field17466, true), false);
        }
        this.method13444(class1851, class1853, 4, 2, 0, 8, 2, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 2, 4, 12, 2, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 4, 0, 0, 8, 1, 3, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 4, 0, 9, 8, 1, 12, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 0, 4, 3, 1, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 9, 0, 4, 12, 1, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        for (int k = 4; k <= 8; ++k) {
            for (int l = 0; l <= 2; ++l) {
                this.method13449(class1851, Class7521.field29394.method11878(), k, -1, l, class1853);
                this.method13449(class1851, Class7521.field29394.method11878(), k, -1, 12 - l, class1853);
            }
        }
        for (int n = 0; n <= 2; ++n) {
            for (int n2 = 4; n2 <= 8; ++n2) {
                this.method13449(class1851, Class7521.field29394.method11878(), n, -1, n2, class1853);
                this.method13449(class1851, Class7521.field29394.method11878(), 12 - n, -1, n2, class1853);
            }
        }
        this.method13444(class1851, class1853, 5, 5, 5, 7, 5, 7, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 1, 6, 6, 4, 6, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13440(class1851, Class7521.field29394.method11878(), 6, 0, 6, class1853);
        this.method13440(class1851, Class7521.field29174.method11878(), 6, 5, 6, class1853);
        final BlockPos class1857 = new BlockPos(this.method13437(6, 6), this.method13438(5), this.method13439(6, 6));
        if (class1853.method21415(class1857)) {
            class1851.method6834().method21345(class1857, Class7558.field29978, 0);
        }
        return true;
    }
}
