// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4492 extends Class4484
{
    private static String[] field19885;
    
    public Class4492(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40955, n);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4492(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40955, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13474((Class4494)class4473, list, random, 1, 0, true);
        this.method13475((Class4494)class4473, list, random, 0, 1, true);
        this.method13476((Class4494)class4473, list, random, 0, 1, true);
    }
    
    public static Class4492 method13485(final List<Class4473> list, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, 0, 0, 5, 7, 5, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4492(n4, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13444(class1851, class1853, 0, 0, 0, 4, 1, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 4, 5, 4, Class7521.field29147.getDefaultState(), Class7521.field29147.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 5, 0, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 2, 0, 4, 5, 0, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 2, 4, 0, 5, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 2, 4, 4, 5, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 0, 6, 0, 4, 6, 4, Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.method13449(class1851, Class7521.field29394.getDefaultState(), i, -1, j, class1853);
            }
        }
        return true;
    }
}
