// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4502 extends Class4500
{
    private static String[] field19898;
    
    public Class4502(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40970, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
    }
    
    public Class4502(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40970, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13494((Class4507)class4473, list, random, 1, 1);
    }
    
    public static Class4502 method13499(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -1, 0, 9, 5, 11, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4502(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 8, 4, 10, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 1, 1, 0);
        this.method13444(class1851, class1853, 1, 1, 10, 3, 3, 10, Class4502.field19848, Class4502.field19848, false);
        this.method13445(class1851, class1853, 4, 1, 1, 4, 3, 1, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 4, 1, 3, 4, 3, 3, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 4, 1, 7, 4, 3, 7, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 4, 1, 9, 4, 3, 9, false, random, Class6924.method21296());
        for (int i = 1; i <= 3; ++i) {
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17465, true)).with((IProperty<Comparable>)Class3853.field17467, true), 4, i, 4, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17465, true)).with((IProperty<Comparable>)Class3853.field17467, true)).with((IProperty<Comparable>)Class3853.field17466, true), 4, i, 5, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17465, true)).with((IProperty<Comparable>)Class3853.field17467, true), 4, i, 6, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17468, true)).with((IProperty<Comparable>)Class3853.field17466, true), 5, i, 5, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17468, true)).with((IProperty<Comparable>)Class3853.field17466, true), 6, i, 5, class1853);
            this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17468, true)).with((IProperty<Comparable>)Class3853.field17466, true), 7, i, 5, class1853);
        }
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17465, true)).with((IProperty<Comparable>)Class3853.field17467, true), 4, 3, 2, class1853);
        this.method13440(class1851, ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29381.getDefaultState()).with((IProperty<Comparable>)Class3853.field17465, true)).with((IProperty<Comparable>)Class3853.field17467, true), 4, 3, 8, class1853);
        final BlockState class1855 = ((StateHolder<O, BlockState>) Blocks.field29318.getDefaultState()).with((IProperty<Comparable>)Class3969.field17931, Direction.WEST);
        final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29318.getDefaultState()).with((IProperty<Comparable>)Class3969.field17931, Direction.WEST)).with(Class3969.field17935, Class182.field564);
        this.method13440(class1851, class1855, 4, 1, 2, class1853);
        this.method13440(class1851, class1856, 4, 2, 2, class1853);
        this.method13440(class1851, class1855, 4, 1, 8, class1853);
        this.method13440(class1851, class1856, 4, 2, 8, class1853);
        return true;
    }
}
