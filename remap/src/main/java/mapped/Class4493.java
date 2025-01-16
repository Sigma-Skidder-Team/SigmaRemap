// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util2.Direction;

import java.util.List;
import java.util.Random;

public class Class4493 extends Class4484
{
    private static String[] field19886;
    
    public Class4493(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40949, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4493(final Random random, final int n, final int n2) {
        super(Class9520.field40949, 0);
        this.method13456(Plane.HORIZONTAL.method576(random));
        if (this.method13455().getAxis() != Direction.Axis.Z) {
            this.field19849 = new MutableBoundingBox(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
        }
        else {
            this.field19849 = new MutableBoundingBox(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
        }
    }
    
    public Class4493(final Class9520 class9520, final CompoundNBT class9521) {
        super(class9520, class9521);
    }
    
    public Class4493(final Class1795 class1795, final CompoundNBT class1796) {
        this(Class9520.field40949, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 8, 3, false);
        this.method13475((Class4494)class4473, list, random, 3, 8, false);
        this.method13476((Class4494)class4473, list, random, 3, 8, false);
    }
    
    public static Class4493 method13486(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -8, -3, 0, 19, 10, 19, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4493(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13444(class1851, class1853, 7, 3, 0, 11, 4, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 3, 7, 18, 4, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 8, 5, 0, 10, 7, 18, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 8, 18, 7, 10, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 7, 5, 0, 7, 5, 7, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 7, 5, 11, 7, 5, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 11, 5, 0, 11, 5, 7, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 11, 5, 11, 11, 5, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 7, 7, 5, 7, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 11, 5, 7, 18, 5, 7, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 5, 11, 7, 5, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 11, 5, 11, 18, 5, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 7, 2, 0, 11, 2, 5, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 7, 2, 13, 11, 2, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 7, 0, 0, 11, 1, 3, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 7, 0, 15, 11, 1, 18, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int i = 7; i <= 11; ++i) {
            for (int j = 0; j <= 2; ++j) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), i, -1, j, class1853);
                this.method13449(class1851, Class7521.field29394.getDefaultState(), i, -1, 18 - j, class1853);
            }
        }
        this.method13444(class1851, class1853, 0, 2, 7, 5, 2, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 13, 2, 7, 18, 2, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 0, 7, 3, 1, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 15, 0, 7, 18, 1, 11, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int k = 0; k <= 2; ++k) {
            for (int l = 7; l <= 11; ++l) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), k, -1, l, class1853);
                this.method13449(class1851, Class7521.field29394.getDefaultState(), 18 - k, -1, l, class1853);
            }
        }
        return true;
    }
}
