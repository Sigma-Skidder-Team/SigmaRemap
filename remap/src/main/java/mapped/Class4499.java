// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;
import java.util.List;

public class Class4499 extends Class4484
{
    private static String[] field19895;
    
    public Class4499(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40959, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4499(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40959, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 5, 3, true);
        this.method13474((Class4494)class4473, list, random, 5, 11, true);
    }
    
    public static Class4499 method13491(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -5, -3, 0, 13, 14, 13, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4499(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 3, 0, 12, 4, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 12, 13, 12, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 1, 12, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 11, 5, 0, 12, 12, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 11, 4, 12, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 5, 11, 10, 12, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 9, 11, 7, 12, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 0, 4, 12, 1, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 5, 0, 10, 12, 1, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 9, 0, 7, 12, 1, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 11, 2, 10, 12, 10, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17468, true)).with((IProperty<Comparable>)Class3929.field17466, true);
        final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17467, true);
        final BlockState class1857 = ((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17468, true);
        final BlockState class1858 = ((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17466, true);
        for (int i = 1; i <= 11; i += 2) {
            this.method13444(class1851, class1853, i, 10, 0, i, 11, 0, class1855, class1855, false);
            this.method13444(class1851, class1853, i, 10, 12, i, 11, 12, class1855, class1855, false);
            this.method13444(class1851, class1853, 0, 10, i, 0, 11, i, class1856, class1856, false);
            this.method13444(class1851, class1853, 12, 10, i, 12, 11, i, class1856, class1856, false);
            this.method13440(class1851, Class7521.field29394.getDefaultState(), i, 13, 0, class1853);
            this.method13440(class1851, Class7521.field29394.getDefaultState(), i, 13, 12, class1853);
            this.method13440(class1851, Class7521.field29394.getDefaultState(), 0, 13, i, class1853);
            this.method13440(class1851, Class7521.field29394.getDefaultState(), 12, 13, i, class1853);
            if (i != 11) {
                this.method13440(class1851, class1855, i + 1, 13, 0, class1853);
                this.method13440(class1851, class1855, i + 1, 13, 12, class1853);
                this.method13440(class1851, class1856, 0, 13, i + 1, class1853);
                this.method13440(class1851, class1856, 12, 13, i + 1, class1853);
            }
        }
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17466, true), 0, 13, 0, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17467, true)).with((IProperty<Comparable>)Class3929.field17466, true), 0, 13, 12, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17467, true)).with((IProperty<Comparable>)Class3929.field17468, true), 12, 13, 12, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17468, true), 12, 13, 0, class1853);
        for (int j = 3; j <= 9; j += 2) {
            this.method13444(class1851, class1853, 1, 7, j, 1, 8, j, class1857, class1857, false);
            this.method13444(class1851, class1853, 11, 7, j, 11, 8, j, class1858, class1858, false);
        }
        final BlockState class1859 = ((StateHolder<O, BlockState>)Class7521.field29396.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.NORTH);
        for (int k = 0; k <= 6; ++k) {
            final int n = k + 4;
            for (int l = 5; l <= 7; ++l) {
                this.method13440(class1851, class1859, l, 5 + k, n, class1853);
            }
            if (n >= 5 && n <= 8) {
                this.method13444(class1851, class1853, 5, 5, n, 7, k + 4, n, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
            }
            else if (n >= 9) {
                if (n <= 10) {
                    this.method13444(class1851, class1853, 5, 8, n, 7, k + 4, n, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
                }
            }
            if (k >= 1) {
                this.method13444(class1851, class1853, 5, 6 + k, n, 7, 9 + k, n, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
            }
        }
        for (int n2 = 5; n2 <= 7; ++n2) {
            this.method13440(class1851, class1859, n2, 12, 11, class1853);
        }
        this.method13444(class1851, class1853, 5, 6, 7, 5, 7, 7, class1858, class1858, false);
        this.method13444(class1851, class1853, 7, 6, 7, 7, 7, 7, class1857, class1857, false);
        this.method13444(class1851, class1853, 5, 13, 12, 7, 13, 12, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 2, 3, 5, 3, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 9, 3, 5, 10, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 4, 2, 5, 8, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 5, 2, 10, 5, 3, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 5, 9, 10, 5, 10, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 10, 5, 4, 10, 5, 8, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        final BlockState class1860 = ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3916.field17732, Direction.EAST);
        final BlockState class1861 = ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3916.field17732, Direction.WEST);
        this.method13440(class1851, class1861, 4, 5, 2, class1853);
        this.method13440(class1851, class1861, 4, 5, 3, class1853);
        this.method13440(class1851, class1861, 4, 5, 9, class1853);
        this.method13440(class1851, class1861, 4, 5, 10, class1853);
        this.method13440(class1851, class1860, 8, 5, 2, class1853);
        this.method13440(class1851, class1860, 8, 5, 3, class1853);
        this.method13440(class1851, class1860, 8, 5, 9, class1853);
        this.method13440(class1851, class1860, 8, 5, 10, class1853);
        this.method13444(class1851, class1853, 3, 4, 4, 4, 4, 8, Class7521.field29339.getDefaultState(), Class7521.field29339.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 4, 4, 9, 4, 8, Class7521.field29339.getDefaultState(), Class7521.field29339.getDefaultState(), false);
        this.method13444(class1851, class1853, 3, 5, 4, 4, 5, 8, Class7521.field29397.getDefaultState(), Class7521.field29397.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 5, 4, 9, 5, 8, Class7521.field29397.getDefaultState(), Class7521.field29397.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 2, 0, 8, 2, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 4, 12, 2, 8, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 0, 0, 8, 1, 3, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 0, 9, 8, 1, 12, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 0, 4, 3, 1, 8, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 0, 4, 12, 1, 8, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int n3 = 4; n3 <= 8; ++n3) {
            for (int n4 = 0; n4 <= 2; ++n4) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), n3, -1, n4, class1853);
                this.method13449(class1851, Class7521.field29394.getDefaultState(), n3, -1, 12 - n4, class1853);
            }
        }
        for (int n5 = 0; n5 <= 2; ++n5) {
            for (int n6 = 4; n6 <= 8; ++n6) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), n5, -1, n6, class1853);
                this.method13449(class1851, Class7521.field29394.getDefaultState(), 12 - n5, -1, n6, class1853);
            }
        }
        return true;
    }
}
