// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4497 extends Class4484
{
    private boolean field19893;
    
    public Class4497(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40960, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4497(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40960, class1796);
        this.field19893 = class1796.method329("Mob");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Mob", this.field19893);
    }
    
    public static Class4497 method13489(final List<Class4473> list, final int n, final int n2, final int n3, final int n4, final Direction class179) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -2, 0, 0, 7, 8, 9, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4497(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13444(class1851, class1853, 0, 2, 0, 6, 7, 7, Class7521.field29147.method11878(), Class7521.field29147.method11878(), false);
        this.method13444(class1851, class1853, 1, 0, 0, 5, 1, 7, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 2, 1, 5, 2, 7, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 3, 2, 5, 3, 7, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 4, 3, 5, 4, 7, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 2, 0, 1, 4, 2, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 2, 0, 5, 4, 2, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 5, 2, 1, 5, 3, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 5, 5, 2, 5, 5, 3, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 0, 5, 3, 0, 5, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 6, 5, 3, 6, 5, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        this.method13444(class1851, class1853, 1, 5, 8, 5, 5, 8, Class7521.field29394.method11878(), Class7521.field29394.method11878(), false);
        final Class7096 class1855 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17466, true);
        final Class7096 class1856 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17465, true)).method21773((Class7111<Comparable>)Class3929.field17467, true);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true), 1, 6, 3, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17466, true), 5, 6, 3, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17466, true)).method21773((Class7111<Comparable>)Class3929.field17465, true), 0, 6, 3, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17465, true), 6, 6, 3, class1853);
        this.method13444(class1851, class1853, 0, 6, 4, 0, 6, 7, class1856, class1856, false);
        this.method13444(class1851, class1853, 6, 6, 4, 6, 6, 7, class1856, class1856, false);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17466, true)).method21773((Class7111<Comparable>)Class3929.field17467, true), 0, 6, 8, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true)).method21773((Class7111<Comparable>)Class3929.field17467, true), 6, 6, 8, class1853);
        this.method13444(class1851, class1853, 1, 6, 8, 5, 6, 8, class1855, class1855, false);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17466, true), 1, 7, 8, class1853);
        this.method13444(class1851, class1853, 2, 7, 8, 4, 7, 8, class1855, class1855, false);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true), 5, 7, 8, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17466, true), 2, 8, 8, class1853);
        this.method13440(class1851, class1855, 3, 8, 8, class1853);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29395.method11878()).method21773((Class7111<Comparable>)Class3929.field17468, true), 4, 8, 8, class1853);
        if (!this.field19893) {
            final BlockPos class1857 = new BlockPos(this.method13437(3, 5), this.method13438(5), this.method13439(3, 5));
            if (class1853.isVecInside(class1857)) {
                this.field19893 = true;
                class1851.method6688(class1857, Class7521.field29290.method11878(), 2);
                final Class436 method6727 = class1851.method6727(class1857);
                if (method6727 instanceof Class494) {
                    ((Class494)method6727).method2509().method13884(EntityType.field28962);
                }
            }
        }
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.method13449(class1851, Class7521.field29394.method11878(), i, -1, j, class1853);
            }
        }
        return true;
    }
}
