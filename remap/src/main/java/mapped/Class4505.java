// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.List;
import java.util.Random;

public class Class4505 extends Class4503
{
    private static String[] field19900;
    
    public Class4505(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40971, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
    }
    
    public Class4505(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40971, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final Direction method13455 = this.method13455();
        if (method13455 != Direction.NORTH && method13455 != Direction.EAST) {
            this.method13495((Class4507)class4473, list, random, 1, 1);
        }
        else {
            this.method13496((Class4507)class4473, list, random, 1, 1);
        }
    }
    
    public static Class4505 method13501(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -1, 0, 5, 5, 5, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4505(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 4, 4, 4, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 1, 1, 0);
        final Direction method13455 = this.method13455();
        if (method13455 != Direction.NORTH && method13455 != Direction.EAST) {
            this.method13444(class1851, class1853, 0, 1, 1, 0, 3, 3, Class4505.field19848, Class4505.field19848, false);
        }
        else {
            this.method13444(class1851, class1853, 4, 1, 1, 4, 3, 3, Class4505.field19848, Class4505.field19848, false);
        }
        return true;
    }
}
