// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4498 extends Class4484
{
    private static String[] field19894;
    
    public Class4498(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40962, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4498(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40962, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13476((Class4494)class4473, list, random, 6, 2, false);
    }
    
    public static Class4498 method13490(final List<Class4473> list, final int n, final int n2, final int n3, final int n4, final Direction class179) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -2, 0, 0, 7, 11, 7, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4498(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13444(class1851, class1853, 0, 0, 0, 6, 1, 6, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 6, 10, 6, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 1, 8, 0, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 5, 2, 0, 6, 8, 0, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 1, 0, 8, 6, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 6, 2, 1, 6, 8, 6, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 2, 6, 5, 8, 6, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17468, true)).with((IProperty<Comparable>)Class3929.field17466, true);
        final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17467, true);
        this.method13444(class1851, class1853, 0, 3, 2, 0, 5, 4, class1856, class1856, false);
        this.method13444(class1851, class1853, 6, 3, 2, 6, 5, 2, class1856, class1856, false);
        this.method13444(class1851, class1853, 6, 3, 4, 6, 5, 4, class1856, class1856, false);
        this.method13440(class1851, Blocks.field29394.getDefaultState(), 5, 2, 5, class1853);
        this.method13444(class1851, class1853, 4, 2, 5, 4, 3, 5, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 3, 2, 5, 3, 4, 5, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 2, 5, 2, 5, 5, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 2, 5, 1, 6, 5, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 7, 1, 5, 7, 4, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 6, 8, 2, 6, 8, 4, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 6, 0, 4, 8, 0, Blocks.field29394.getDefaultState(), Blocks.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 2, 5, 0, 4, 5, 0, class1855, class1855, false);
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.method13449(class1851, Blocks.field29394.getDefaultState(), i, -1, j, class1853);
            }
        }
        return true;
    }
}
