// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class4477 extends Class4475
{
    private boolean field19863;
    private boolean field19864;
    private boolean field19865;
    private boolean field19866;
    private static final Class6864 field19867;
    
    public Class4477(final Random random, final int n, final int n2) {
        super(Class9520.field40977, random, n, 64, n2, 12, 10, 15);
    }
    
    public Class4477(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40977, class1796);
        this.field19863 = class1796.method329("placedMainChest");
        this.field19864 = class1796.method329("placedHiddenChest");
        this.field19865 = class1796.method329("placedTrap1");
        this.field19866 = class1796.method329("placedTrap2");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("placedMainChest", this.field19863);
        class51.method312("placedHiddenChest", this.field19864);
        class51.method312("placedTrap1", this.field19865);
        class51.method312("placedTrap2", this.field19866);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (this.method13460(class1851, class1853, 0)) {
            this.method13445(class1851, class1853, 0, -4, 0, this.field19857 - 1, 0, this.field19859 - 1, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 2, 1, 2, 9, 2, 2, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 2, 1, 12, 9, 2, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 2, 1, 3, 2, 2, 11, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 9, 1, 3, 9, 2, 11, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 1, 3, 1, 10, 6, 1, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 1, 3, 13, 10, 6, 13, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 1, 3, 2, 1, 6, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 10, 3, 2, 10, 6, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 2, 3, 2, 9, 3, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 2, 6, 2, 9, 6, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 3, 7, 3, 8, 7, 11, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 4, 8, 4, 7, 8, 10, false, random, Class4477.field19867);
            this.method13443(class1851, class1853, 3, 1, 3, 8, 2, 11);
            this.method13443(class1851, class1853, 4, 3, 6, 7, 3, 9);
            this.method13443(class1851, class1853, 2, 4, 2, 9, 5, 12);
            this.method13443(class1851, class1853, 4, 6, 5, 7, 6, 9);
            this.method13443(class1851, class1853, 5, 7, 6, 6, 7, 8);
            this.method13443(class1851, class1853, 5, 1, 2, 6, 2, 2);
            this.method13443(class1851, class1853, 5, 2, 12, 6, 2, 12);
            this.method13443(class1851, class1853, 5, 5, 1, 6, 5, 1);
            this.method13443(class1851, class1853, 5, 5, 13, 6, 5, 13);
            this.method13440(class1851, Class7521.field29147.method11878(), 1, 5, 5, class1853);
            this.method13440(class1851, Class7521.field29147.method11878(), 10, 5, 5, class1853);
            this.method13440(class1851, Class7521.field29147.method11878(), 1, 5, 9, class1853);
            this.method13440(class1851, Class7521.field29147.method11878(), 10, 5, 9, class1853);
            for (int i = 0; i <= 14; i += 14) {
                this.method13445(class1851, class1853, 2, 4, i, 2, 5, i, false, random, Class4477.field19867);
                this.method13445(class1851, class1853, 4, 4, i, 4, 5, i, false, random, Class4477.field19867);
                this.method13445(class1851, class1853, 7, 4, i, 7, 5, i, false, random, Class4477.field19867);
                this.method13445(class1851, class1853, 9, 4, i, 9, 5, i, false, random, Class4477.field19867);
            }
            this.method13445(class1851, class1853, 5, 6, 0, 6, 6, 0, false, random, Class4477.field19867);
            for (int j = 0; j <= 11; j += 11) {
                for (int k = 2; k <= 12; k += 2) {
                    this.method13445(class1851, class1853, j, 4, k, j, 5, k, false, random, Class4477.field19867);
                }
                this.method13445(class1851, class1853, j, 6, 5, j, 6, 5, false, random, Class4477.field19867);
                this.method13445(class1851, class1853, j, 6, 9, j, 6, 9, false, random, Class4477.field19867);
            }
            this.method13445(class1851, class1853, 2, 7, 2, 2, 9, 2, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 9, 7, 2, 9, 9, 2, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 2, 7, 12, 2, 9, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 9, 7, 12, 9, 9, 12, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 4, 9, 4, 4, 9, 4, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 7, 9, 4, 7, 9, 4, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 4, 9, 10, 4, 9, 10, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 7, 9, 10, 7, 9, 10, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 5, 9, 7, 6, 9, 7, false, random, Class4477.field19867);
            final Class7096 class1855 = ((Class7097<O, Class7096>)Class7521.field29309.method11878()).method21773((Class7111<Comparable>)Class3916.field17732, Direction.EAST);
            final Class7096 class1856 = ((Class7097<O, Class7096>)Class7521.field29309.method11878()).method21773((Class7111<Comparable>)Class3916.field17732, Direction.WEST);
            final Class7096 class1857 = ((Class7097<O, Class7096>)Class7521.field29309.method11878()).method21773((Class7111<Comparable>)Class3916.field17732, Direction.SOUTH);
            final Class7096 class1858 = ((Class7097<O, Class7096>)Class7521.field29309.method11878()).method21773((Class7111<Comparable>)Class3916.field17732, Direction.NORTH);
            this.method13440(class1851, class1858, 5, 9, 6, class1853);
            this.method13440(class1851, class1858, 6, 9, 6, class1853);
            this.method13440(class1851, class1857, 5, 9, 8, class1853);
            this.method13440(class1851, class1857, 6, 9, 8, class1853);
            this.method13440(class1851, class1858, 4, 0, 0, class1853);
            this.method13440(class1851, class1858, 5, 0, 0, class1853);
            this.method13440(class1851, class1858, 6, 0, 0, class1853);
            this.method13440(class1851, class1858, 7, 0, 0, class1853);
            this.method13440(class1851, class1858, 4, 1, 8, class1853);
            this.method13440(class1851, class1858, 4, 2, 9, class1853);
            this.method13440(class1851, class1858, 4, 3, 10, class1853);
            this.method13440(class1851, class1858, 7, 1, 8, class1853);
            this.method13440(class1851, class1858, 7, 2, 9, class1853);
            this.method13440(class1851, class1858, 7, 3, 10, class1853);
            this.method13445(class1851, class1853, 4, 1, 9, 4, 1, 9, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 7, 1, 9, 7, 1, 9, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 4, 1, 10, 7, 2, 10, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 5, 4, 5, 6, 4, 5, false, random, Class4477.field19867);
            this.method13440(class1851, class1855, 4, 4, 5, class1853);
            this.method13440(class1851, class1856, 7, 4, 5, class1853);
            for (int l = 0; l < 4; ++l) {
                this.method13440(class1851, class1857, 5, 0 - l, 6 + l, class1853);
                this.method13440(class1851, class1857, 6, 0 - l, 6 + l, class1853);
                this.method13443(class1851, class1853, 5, 0 - l, 7 + l, 6, 0 - l, 9 + l);
            }
            this.method13443(class1851, class1853, 1, -3, 12, 10, -1, 13);
            this.method13443(class1851, class1853, 1, -3, 1, 3, -1, 13);
            this.method13443(class1851, class1853, 1, -3, 1, 9, -1, 5);
            for (int n = 1; n <= 13; n += 2) {
                this.method13445(class1851, class1853, 1, -3, n, 1, -2, n, false, random, Class4477.field19867);
            }
            for (int n2 = 2; n2 <= 12; n2 += 2) {
                this.method13445(class1851, class1853, 1, -1, n2, 3, -1, n2, false, random, Class4477.field19867);
            }
            this.method13445(class1851, class1853, 2, -2, 1, 5, -2, 1, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 7, -2, 1, 9, -2, 1, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 6, -3, 1, 6, -3, 1, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 6, -1, 1, 6, -1, 1, false, random, Class4477.field19867);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29410.method11878()).method21773((Class7111<Comparable>)Class3983.field17983, Direction.EAST)).method21773((Class7111<Comparable>)Class3983.field17985, true), 1, -3, 8, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29410.method11878()).method21773((Class7111<Comparable>)Class3983.field17983, Direction.WEST)).method21773((Class7111<Comparable>)Class3983.field17985, true), 4, -3, 8, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29411.method11878()).method21773((Class7111<Comparable>)Class3975.field17957, true)).method21773((Class7111<Comparable>)Class3975.field17959, true)).method21773((Class7111<Comparable>)Class3975.field17954, true), 2, -3, 8, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29411.method11878()).method21773((Class7111<Comparable>)Class3975.field17957, true)).method21773((Class7111<Comparable>)Class3975.field17959, true)).method21773((Class7111<Comparable>)Class3975.field17954, true), 3, -3, 8, class1853);
            final Class7096 class1859 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18022, Class106.field328)).method21773(Class3999.field18024, Class106.field328);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18024, Class106.field328), 5, -3, 7, class1853);
            this.method13440(class1851, class1859, 5, -3, 6, class1853);
            this.method13440(class1851, class1859, 5, -3, 5, class1853);
            this.method13440(class1851, class1859, 5, -3, 4, class1853);
            this.method13440(class1851, class1859, 5, -3, 3, class1853);
            this.method13440(class1851, class1859, 5, -3, 2, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18022, Class106.field328)).method21773(Class3999.field18025, Class106.field328), 5, -3, 1, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18023, Class106.field328), 4, -3, 1, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 3, -3, 1, class1853);
            if (!this.field19865) {
                this.field19865 = this.method13453(class1851, class1853, random, 3, -2, 1, Direction.NORTH, Class9020.field38090);
            }
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29388.method11878()).method21773((Class7111<Comparable>)Class4006.field18058, true), 3, -2, 2, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29410.method11878()).method21773((Class7111<Comparable>)Class3983.field17983, Direction.NORTH)).method21773((Class7111<Comparable>)Class3983.field17985, true), 7, -3, 1, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29410.method11878()).method21773((Class7111<Comparable>)Class3983.field17983, Direction.SOUTH)).method21773((Class7111<Comparable>)Class3983.field17985, true), 7, -3, 5, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29411.method11878()).method21773((Class7111<Comparable>)Class3975.field17956, true)).method21773((Class7111<Comparable>)Class3975.field17958, true)).method21773((Class7111<Comparable>)Class3975.field17954, true), 7, -3, 2, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29411.method11878()).method21773((Class7111<Comparable>)Class3975.field17956, true)).method21773((Class7111<Comparable>)Class3975.field17958, true)).method21773((Class7111<Comparable>)Class3975.field17954, true), 7, -3, 3, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29411.method11878()).method21773((Class7111<Comparable>)Class3975.field17956, true)).method21773((Class7111<Comparable>)Class3975.field17958, true)).method21773((Class7111<Comparable>)Class3975.field17954, true), 7, -3, 4, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18023, Class106.field328), 8, -3, 6, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18025, Class106.field328)).method21773(Class3999.field18024, Class106.field328), 9, -3, 6, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18022, Class106.field328)).method21773(Class3999.field18024, Class106.field327), 9, -3, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 9, -3, 4, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18022, Class106.field328), 9, -2, 4, class1853);
            if (!this.field19866) {
                this.field19866 = this.method13453(class1851, class1853, random, 9, -2, 3, Direction.WEST, Class9020.field38090);
            }
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29388.method11878()).method21773((Class7111<Comparable>)Class4006.field18057, true), 8, -1, 3, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29388.method11878()).method21773((Class7111<Comparable>)Class4006.field18057, true), 8, -2, 3, class1853);
            if (!this.field19863) {
                this.field19863 = this.method13450(class1851, class1853, random, 8, -3, 3, Class9020.field38089);
            }
            this.method13440(class1851, Class7521.field29285.method11878(), 9, -3, 2, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 8, -3, 1, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 4, -3, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 5, -2, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 5, -1, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 6, -3, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 7, -2, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 7, -1, 5, class1853);
            this.method13440(class1851, Class7521.field29285.method11878(), 8, -3, 5, class1853);
            this.method13445(class1851, class1853, 9, -1, 1, 9, -1, 5, false, random, Class4477.field19867);
            this.method13443(class1851, class1853, 8, -3, 8, 10, -1, 10);
            this.method13440(class1851, Class7521.field29371.method11878(), 8, -2, 11, class1853);
            this.method13440(class1851, Class7521.field29371.method11878(), 9, -2, 11, class1853);
            this.method13440(class1851, Class7521.field29371.method11878(), 10, -2, 11, class1853);
            final Class7096 class1860 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29316.method11878()).method21773((Class7111<Comparable>)Class3904.field17564, Direction.NORTH)).method21773(Class3904.field17618, Class107.field333);
            this.method13440(class1851, class1860, 8, -2, 12, class1853);
            this.method13440(class1851, class1860, 9, -2, 12, class1853);
            this.method13440(class1851, class1860, 10, -2, 12, class1853);
            this.method13445(class1851, class1853, 8, -3, 8, 8, -3, 10, false, random, Class4477.field19867);
            this.method13445(class1851, class1853, 10, -3, 8, 10, -3, 10, false, random, Class4477.field19867);
            this.method13440(class1851, Class7521.field29285.method11878(), 10, -2, 9, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18022, Class106.field328), 8, -2, 9, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29293.method11878()).method21773(Class3999.field18024, Class106.field328), 8, -2, 10, class1853);
            this.method13440(class1851, Class7521.field29293.method11878(), 10, -1, 9, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29239.method11878()).method21773((Class7111<Comparable>)Class3836.field17415, Direction.UP), 9, -2, 8, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29239.method11878()).method21773((Class7111<Comparable>)Class3836.field17415, Direction.WEST), 10, -2, 8, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29239.method11878()).method21773((Class7111<Comparable>)Class3836.field17415, Direction.WEST), 10, -1, 8, class1853);
            this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29345.method11878()).method21773((Class7111<Comparable>)Class3897.field17564, Direction.NORTH), 10, -2, 10, class1853);
            if (!this.field19864) {
                this.field19864 = this.method13450(class1851, class1853, random, 9, -3, 10, Class9020.field38089);
            }
            return true;
        }
        return false;
    }
    
    static {
        field19867 = new Class6864(null);
    }
}
