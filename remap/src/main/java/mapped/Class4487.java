// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4487 extends Class4484
{
    private boolean field19880;
    
    public Class4487(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40956, n);
        this.method13456(class179);
        this.field19849 = field19849;
        this.field19880 = (random.nextInt(3) == 0);
    }
    
    public Class4487(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40956, class1796);
        this.field19880 = class1796.method329("Chest");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Chest", this.field19880);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13475((Class4494)class4473, list, random, 0, 1, true);
    }
    
    public static Class4487 method13480(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, 0, 0, 5, 7, 5, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4487(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 0, 0, 4, 1, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 4, 5, 4, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        final BlockState class1855 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17468, true)).with((IProperty<Comparable>)Class3929.field17466, true);
        final BlockState class1856 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)Class7521.field29395.getDefaultState()).with((IProperty<Comparable>)Class3929.field17465, true)).with((IProperty<Comparable>)Class3929.field17467, true);
        this.method13444(class1851, class1853, 4, 2, 0, 4, 5, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 3, 1, 4, 4, 1, class1856, class1856, false);
        this.method13444(class1851, class1853, 4, 3, 3, 4, 4, 3, class1856, class1856, false);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 5, 0, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 4, 3, 5, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 1, 3, 4, 1, 4, 4, class1855, class1855, false);
        this.method13444(class1851, class1853, 3, 3, 4, 3, 4, 4, class1855, class1855, false);
        if (this.field19880) {
            if (class1853.isVecInside(new BlockPos(this.method13437(3, 3), this.method13438(2), this.method13439(3, 3)))) {
                this.field19880 = false;
                this.method13450(class1851, class1853, random, 3, 2, 3, Class9020.field38084);
            }
        }
        this.method13444(class1851, class1853, 0, 6, 0, 4, 6, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), i, -1, j, class1853);
            }
        }
        return true;
    }
}