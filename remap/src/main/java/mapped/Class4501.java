// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4501 extends Class4500
{
    private final boolean field19897;
    
    public Class4501(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40968, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
        this.field19897 = (field19849.getYSize() > 6);
    }
    
    public Class4501(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40968, class1796);
        this.field19897 = class1796.method329("Tall");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Tall", this.field19897);
    }
    
    public static Class4501 method13498(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        MutableBoundingBox class180 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -4, -1, 0, 14, 11, 15, class179);
        if (!Class4500.method13497(class180) || Class4473.method13435(list, class180) != null) {
            class180 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -4, -1, 0, 14, 6, 15, class179);
            if (!Class4500.method13497(class180) || Class4473.method13435(list, class180) != null) {
                return null;
            }
        }
        return new Class4501(n4, random, class180, class179);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        int n = 11;
        if (!this.field19897) {
            n = 6;
        }
        this.method13445(class1851, class1853, 0, 0, 0, 13, n - 1, 14, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 4, 1, 0);
        this.method13446(class1851, class1853, random, 0.07f, 2, 1, 1, 11, 4, 13, Class7521.field29240.getDefaultState(), Class7521.field29240.getDefaultState(), false, false);
        for (int i = 1; i <= 13; ++i) {
            if ((i - 1) % 4 != 0) {
                this.method13444(class1851, class1853, 1, 1, i, 1, 4, i, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
                this.method13444(class1851, class1853, 12, 1, i, 12, 4, i, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
                if (this.field19897) {
                    this.method13444(class1851, class1853, 1, 6, i, 1, 9, i, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
                    this.method13444(class1851, class1853, 12, 6, i, 12, 9, i, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
                }
            }
            else {
                this.method13444(class1851, class1853, 1, 1, i, 1, 4, i, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
                this.method13444(class1851, class1853, 12, 1, i, 12, 4, i, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
                this.method13440(class1851, ((StateHolder<O, BlockState>)Class7521.field29288.getDefaultState()).with((IProperty<Comparable>)Class4023.field18110, Direction.EAST), 2, 3, i, class1853);
                this.method13440(class1851, ((StateHolder<O, BlockState>)Class7521.field29288.getDefaultState()).with((IProperty<Comparable>)Class4023.field18110, Direction.WEST), 11, 3, i, class1853);
                if (this.field19897) {
                    this.method13444(class1851, class1853, 1, 6, i, 1, 9, i, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
                    this.method13444(class1851, class1853, 12, 6, i, 12, 9, i, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
                }
            }
        }
        for (int j = 3; j < 12; j += 2) {
            this.method13444(class1851, class1853, 3, 1, j, 4, 3, j, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
            this.method13444(class1851, class1853, 6, 1, j, 7, 3, j, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
            this.method13444(class1851, class1853, 9, 1, j, 10, 3, j, Class7521.field29284.getDefaultState(), Class7521.field29284.getDefaultState(), false);
        }
        if (this.field19897) {
            this.method13444(class1851, class1853, 1, 5, 1, 3, 5, 13, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
            this.method13444(class1851, class1853, 10, 5, 1, 12, 5, 13, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
            this.method13444(class1851, class1853, 4, 5, 1, 9, 5, 2, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
            this.method13444(class1851, class1853, 4, 5, 12, 9, 5, 13, Class7521.field29160.getDefaultState(), Class7521.field29160.getDefaultState(), false);
            this.method13440(class1851, Class7521.field29160.getDefaultState(), 9, 5, 11, class1853);
            this.method13440(class1851, Class7521.field29160.getDefaultState(), 8, 5, 11, class1853);
            this.method13440(class1851, Class7521.field29160.getDefaultState(), 9, 5, 10, class1853);
            final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17468, true)).with((IProperty<Comparable>)Class3929.field17466, true);
            final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17467, true);
            this.method13444(class1851, class1853, 3, 6, 3, 3, 6, 11, class1856, class1856, false);
            this.method13444(class1851, class1853, 10, 6, 3, 10, 6, 9, class1856, class1856, false);
            this.method13444(class1851, class1853, 4, 6, 2, 9, 6, 2, class1855, class1855, false);
            this.method13444(class1851, class1853, 4, 6, 12, 7, 6, 12, class1855, class1855, false);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17466, true), 3, 6, 2, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17467, true)).with((IProperty<Comparable>)Class3929.field17466, true), 3, 6, 12, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17468, true), 10, 6, 2, class1853);
            for (int k = 0; k <= 2; ++k) {
                this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17467, true)).with((IProperty<Comparable>)Class3929.field17468, true), 8 + k, 6, 12 - k, class1853);
                if (k != 2) {
                    this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17466, true), 8 + k, 6, 11 - k, class1853);
                }
            }
            final BlockState class1857 = ((StateHolder<O, BlockState>)Class7521.field29307.getDefaultState()).with((IProperty<Comparable>)Class3917.field17752, Direction.SOUTH);
            this.method13440(class1851, class1857, 10, 1, 13, class1853);
            this.method13440(class1851, class1857, 10, 2, 13, class1853);
            this.method13440(class1851, class1857, 10, 3, 13, class1853);
            this.method13440(class1851, class1857, 10, 4, 13, class1853);
            this.method13440(class1851, class1857, 10, 5, 13, class1853);
            this.method13440(class1851, class1857, 10, 6, 13, class1853);
            this.method13440(class1851, class1857, 10, 7, 13, class1853);
            final BlockState class1858 = ((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17466, true);
            this.method13440(class1851, class1858, 6, 9, 7, class1853);
            final BlockState class1859 = ((StateHolder<O, BlockState>)Class7521.field29336.getDefaultState()).with((IProperty<Comparable>)Class3929.field17468, true);
            this.method13440(class1851, class1859, 7, 9, 7, class1853);
            this.method13440(class1851, class1858, 6, 8, 7, class1853);
            this.method13440(class1851, class1859, 7, 8, 7, class1853);
            final BlockState class1860 = ((StateHolder<O, BlockState>)((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17468, true)).with((IProperty<Comparable>)Class3929.field17466, true);
            this.method13440(class1851, class1860, 6, 7, 7, class1853);
            this.method13440(class1851, class1860, 7, 7, 7, class1853);
            this.method13440(class1851, class1858, 5, 7, 7, class1853);
            this.method13440(class1851, class1859, 8, 7, 7, class1853);
            this.method13440(class1851, ((StateHolder<Object, BlockState>)class1858).with((IProperty<Comparable>)Class3929.field17465, true), 6, 7, 6, class1853);
            this.method13440(class1851, ((StateHolder<Object, BlockState>)class1858).with((IProperty<Comparable>)Class3929.field17467, true), 6, 7, 8, class1853);
            this.method13440(class1851, ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3929.field17465, true), 7, 7, 6, class1853);
            this.method13440(class1851, ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3929.field17467, true), 7, 7, 8, class1853);
            final BlockState method11878 = Class7521.field29287.getDefaultState();
            this.method13440(class1851, method11878, 5, 8, 7, class1853);
            this.method13440(class1851, method11878, 8, 8, 7, class1853);
            this.method13440(class1851, method11878, 6, 8, 6, class1853);
            this.method13440(class1851, method11878, 6, 8, 8, class1853);
            this.method13440(class1851, method11878, 7, 8, 6, class1853);
            this.method13440(class1851, method11878, 7, 8, 8, class1853);
        }
        this.method13450(class1851, class1853, random, 3, 3, 5, Class9020.field38085);
        if (this.field19897) {
            this.method13440(class1851, Class4501.field19848, 12, 9, 1, class1853);
            this.method13450(class1851, class1853, random, 12, 8, 1, Class9020.field38085);
        }
        return true;
    }
}
