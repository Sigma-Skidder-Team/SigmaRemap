// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util2.Direction;

import java.util.Random;
import java.util.List;

public class Class4508 extends Class4500
{
    private boolean field19906;
    
    public Class4508(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40969, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4508(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40969, class1796);
        this.field19906 = class1796.method329("Mob");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Mob", this.field19906);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        if (class4473 != null) {
            ((Class4507)class4473).field19904 = this;
        }
    }
    
    public static Class4508 method13503(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -4, -1, 0, 11, 8, 16, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4508(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 10, 7, 15, false, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, Class1982.field10978, 4, 1, 0);
        final int n = 6;
        this.method13445(class1851, class1853, 1, n, 1, 1, n, 14, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 9, n, 1, 9, n, 14, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 2, n, 1, 8, n, 2, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 2, n, 14, 8, n, 14, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 1, 1, 1, 2, 1, 4, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 8, 1, 1, 9, 1, 4, false, random, Class6924.method21296());
        this.method13444(class1851, class1853, 1, 1, 1, 1, 1, 3, Class7521.field29174.getDefaultState(), Class7521.field29174.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 1, 1, 9, 1, 3, Class7521.field29174.getDefaultState(), Class7521.field29174.getDefaultState(), false);
        this.method13445(class1851, class1853, 3, 1, 8, 7, 1, 12, false, random, Class6924.method21296());
        this.method13444(class1851, class1853, 4, 1, 9, 6, 1, 11, Class7521.field29174.getDefaultState(), Class7521.field29174.getDefaultState(), false);
        final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17465, true)).with((IProperty<Comparable>)Class3853.field17467, true);
        final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17468, true)).with((IProperty<Comparable>)Class3853.field17466, true);
        for (int i = 3; i < 14; i += 2) {
            this.method13444(class1851, class1853, 0, 3, i, 0, 4, i, class1855, class1855, false);
            this.method13444(class1851, class1853, 10, 3, i, 10, 4, i, class1855, class1855, false);
        }
        for (int j = 2; j < 9; j += 2) {
            this.method13444(class1851, class1853, j, 3, 15, j, 4, 15, class1856, class1856, false);
        }
        final BlockState class1857 = ((StateHolder<O, BlockState>)Class7521.field29391.getDefaultState()).with((IProperty<Comparable>)Class3916.field17732, Direction.NORTH);
        this.method13445(class1851, class1853, 4, 1, 5, 6, 1, 7, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 4, 2, 6, 6, 2, 7, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 4, 3, 7, 6, 3, 7, false, random, Class6924.method21296());
        for (int k = 4; k <= 6; ++k) {
            this.method13440(class1851, class1857, k, 1, 4, class1853);
            this.method13440(class1851, class1857, k, 2, 5, class1853);
            this.method13440(class1851, class1857, k, 3, 6, class1853);
        }
        final BlockState class1858 = ((StateHolder<O, BlockState>)Class7521.field29402.getDefaultState()).with((IProperty<Comparable>)Class3964.field17908, Direction.NORTH);
        final BlockState class1859 = ((StateHolder<O, BlockState>)Class7521.field29402.getDefaultState()).with((IProperty<Comparable>)Class3964.field17908, Direction.SOUTH);
        final BlockState class1860 = ((StateHolder<O, BlockState>)Class7521.field29402.getDefaultState()).with((IProperty<Comparable>)Class3964.field17908, Direction.EAST);
        final BlockState class1861 = ((StateHolder<O, BlockState>)Class7521.field29402.getDefaultState()).with((IProperty<Comparable>)Class3964.field17908, Direction.WEST);
        boolean b = true;
        final boolean[] array = new boolean[12];
        for (int l = 0; l < array.length; ++l) {
            array[l] = (random.nextFloat() > 0.9f);
            b &= array[l];
        }
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1858).with((IProperty<Comparable>)Class3964.field17909, array[0]), 4, 3, 8, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1858).with((IProperty<Comparable>)Class3964.field17909, array[1]), 5, 3, 8, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1858).with((IProperty<Comparable>)Class3964.field17909, array[2]), 6, 3, 8, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3964.field17909, array[3]), 4, 3, 12, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3964.field17909, array[4]), 5, 3, 12, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1859).with((IProperty<Comparable>)Class3964.field17909, array[5]), 6, 3, 12, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1860).with((IProperty<Comparable>)Class3964.field17909, array[6]), 3, 3, 9, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1860).with((IProperty<Comparable>)Class3964.field17909, array[7]), 3, 3, 10, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1860).with((IProperty<Comparable>)Class3964.field17909, array[8]), 3, 3, 11, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1861).with((IProperty<Comparable>)Class3964.field17909, array[9]), 7, 3, 9, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1861).with((IProperty<Comparable>)Class3964.field17909, array[10]), 7, 3, 10, class1853);
        this.method13440(class1851, ((StateHolder<Object, BlockState>)class1861).with((IProperty<Comparable>)Class3964.field17909, array[11]), 7, 3, 11, class1853);
        if (b) {
            final BlockState method11878 = Class7521.field29401.getDefaultState();
            this.method13440(class1851, method11878, 4, 3, 9, class1853);
            this.method13440(class1851, method11878, 5, 3, 9, class1853);
            this.method13440(class1851, method11878, 6, 3, 9, class1853);
            this.method13440(class1851, method11878, 4, 3, 10, class1853);
            this.method13440(class1851, method11878, 5, 3, 10, class1853);
            this.method13440(class1851, method11878, 6, 3, 10, class1853);
            this.method13440(class1851, method11878, 4, 3, 11, class1853);
            this.method13440(class1851, method11878, 5, 3, 11, class1853);
            this.method13440(class1851, method11878, 6, 3, 11, class1853);
        }
        if (!this.field19906) {
            final BlockPos class1862 = new BlockPos(this.method13437(5, 6), this.method13438(3), this.method13439(5, 6));
            if (class1853.isVecInside(class1862)) {
                this.field19906 = true;
                class1851.setBlockState(class1862, Class7521.field29290.getDefaultState(), 2);
                final TileEntity method11879 = class1851.getTileEntity(class1862);
                if (method11879 instanceof Class494) {
                    ((Class494)method11879).method2509().method13884(EntityType.field29022);
                }
            }
        }
        return true;
    }
}
