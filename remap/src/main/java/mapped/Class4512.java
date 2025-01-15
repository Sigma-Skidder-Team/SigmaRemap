// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4512 extends Class4500
{
    private static String[] field19913;
    
    public Class4512(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40976, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
    }
    
    public Class4512(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40976, class1796);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13494((Class4507)class4473, list, random, 1, 1);
    }
    
    public static Class4512 method13507(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -7, 0, 5, 11, 8, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4512(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 4, 10, 7, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 1, 7, 0);
        this.method13492(class1851, random, class1853, Class1982.field10976, 1, 1, 7);
        final Class7096 class1855 = ((Class7097<O, Class7096>)Class7521.field29309.method11878()).method21773((Class7111<Comparable>)Class3916.field17732, Direction.SOUTH);
        for (int i = 0; i < 6; ++i) {
            this.method13440(class1851, class1855, 1, 6 - i, 1 + i, class1853);
            this.method13440(class1851, class1855, 2, 6 - i, 1 + i, class1853);
            this.method13440(class1851, class1855, 3, 6 - i, 1 + i, class1853);
            if (i < 5) {
                this.method13440(class1851, Class7521.field29368.method11878(), 1, 5 - i, 1 + i, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 2, 5 - i, 1 + i, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 3, 5 - i, 1 + i, class1853);
            }
        }
        return true;
    }
}
