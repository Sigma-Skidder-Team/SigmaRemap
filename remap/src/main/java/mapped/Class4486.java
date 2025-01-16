// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4486 extends Class4484
{
    private static String[] field19879;
    
    public Class4486(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40954, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4486(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40954, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 5, 3, true);
    }
    
    public static Class4486 method13479(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -5, -3, 0, 13, 14, 13, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4486(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13444(class1851, class1853, 0, 3, 0, 12, 4, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 12, 13, 12, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 0, 1, 12, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 11, 5, 0, 12, 12, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 11, 4, 12, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 5, 11, 10, 12, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 9, 11, 7, 12, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 0, 4, 12, 1, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 5, 0, 10, 12, 1, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 9, 0, 7, 12, 1, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 11, 2, 10, 12, 10, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 8, 0, 7, 8, 0, Blocks.field29395.getDefaultState(), Blocks.field29395.getDefaultState(), false);
        final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17468, true)).with((IProperty<Comparable>)Class3929.field17466, true);
        final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17467, true);
        for (int i = 1; i <= 11; i += 2) {
            this.method13444(class1851, class1853, i, 10, 0, i, 11, 0, class1855, class1855, false);
            this.method13444(class1851, class1853, i, 10, 12, i, 11, 12, class1855, class1855, false);
            this.method13444(class1851, class1853, 0, 10, i, 0, 11, i, class1856, class1856, false);
            this.method13444(class1851, class1853, 12, 10, i, 12, 11, i, class1856, class1856, false);
            this.method13440(class1851, Blocks.field29394.getDefaultState(), i, 13, 0, class1853);
            this.method13440(class1851, Blocks.field29394.getDefaultState(), i, 13, 12, class1853);
            this.method13440(class1851, Blocks.field29394.getDefaultState(), 0, 13, i, class1853);
            this.method13440(class1851, Blocks.field29394.getDefaultState(), 12, 13, i, class1853);
            if (i != 11) {
                this.method13440(class1851, class1855, i + 1, 13, 0, class1853);
                this.method13440(class1851, class1855, i + 1, 13, 12, class1853);
                this.method13440(class1851, class1856, 0, 13, i + 1, class1853);
                this.method13440(class1851, class1856, 12, 13, i + 1, class1853);
            }
        }
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17466, true), 0, 13, 0, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17467, true)).with((IProperty<Comparable>)Class3929.field17466, true), 0, 13, 12, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17467, true)).with((IProperty<Comparable>)Class3929.field17468, true), 12, 13, 12, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17468, true), 12, 13, 0, class1853);
        for (int j = 3; j <= 9; j += 2) {
            this.method13444(class1851, class1853, 1, 7, j, 1, 8, j, ((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17468, true), ((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17468, true), false);
            this.method13444(class1851, class1853, 11, 7, j, 11, 8, j, ((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17466, true), ((StateHolder<Object, BlockState>)class1856).with((IProperty<Comparable>)Class3929.field17466, true), false);
        }
        this.method13444(class1851, class1853, 4, 2, 0, 8, 2, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 4, 12, 2, 8, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 0, 0, 8, 1, 3, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 0, 9, 8, 1, 12, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 0, 4, 3, 1, 8, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 9, 0, 4, 12, 1, 8, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        for (int k = 4; k <= 8; ++k) {
            for (int l = 0; l <= 2; ++l) {
                this.method13449(class1851, Blocks.field29394.getDefaultState(), k, -1, l, class1853);
                this.method13449(class1851, Blocks.field29394.getDefaultState(), k, -1, 12 - l, class1853);
            }
        }
        for (int n = 0; n <= 2; ++n) {
            for (int n2 = 4; n2 <= 8; ++n2) {
                this.method13449(class1851, Blocks.field29394.getDefaultState(), n, -1, n2, class1853);
                this.method13449(class1851, Blocks.field29394.getDefaultState(), 12 - n, -1, n2, class1853);
            }
        }
        this.method13444(class1851, class1853, 5, 5, 5, 7, 5, 7, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 6, 1, 6, 6, 4, 6, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.method13440(class1851, Blocks.field29394.getDefaultState(), 6, 0, 6, class1853);
        this.method13440(class1851, Blocks.field29174.getDefaultState(), 6, 5, 6, class1853);
        final BlockPos class1857 = new BlockPos(this.method13437(6, 6), this.method13438(5), this.method13439(6, 6));
        if (class1853.isVecInside(class1857)) {
            class1851.method6834().method21345(class1857, Class7558.field29978, 0);
        }
        return true;
    }
}
