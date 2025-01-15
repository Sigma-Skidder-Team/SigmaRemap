// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4506 extends Class4500
{
    private final boolean field19901;
    
    public Class4506(final Class9520 class9520, final int n, final Random random, final int n2, final int n3) {
        super(class9520, n);
        this.field19901 = true;
        this.method13456(Plane.HORIZONTAL.method576(random));
        this.field19896 = Class1982.field10976;
        if (this.method13455().getAxis() != Axis.Z) {
            this.field19849 = new Class6997(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
        }
        else {
            this.field19849 = new Class6997(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
        }
    }
    
    public Class4506(final int n, final Random random, final Class6997 field19849, final Direction class179) {
        super(Class9520.field40973, n);
        this.field19901 = false;
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
    }
    
    public Class4506(final Class9520 class9520, final Class51 class9521) {
        super(class9520, class9521);
        this.field19901 = class9521.method329("Source");
    }
    
    public Class4506(final Class1795 class1795, final Class51 class1796) {
        this(Class9520.field40973, class1796);
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Source", this.field19901);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        if (this.field19901) {
            Class6924.method21297(Class4511.class);
        }
        this.method13494((Class4507)class4473, list, random, 1, 1);
    }
    
    public static Class4506 method13502(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final Class6997 method21408 = Class6997.method21408(n, n2, n3, -1, -7, 0, 5, 11, 5, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4506(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 4, 10, 4, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 1, 7, 0);
        this.method13492(class1851, random, class1853, Class1982.field10976, 1, 1, 4);
        this.method13440(class1851, Class7521.field29368.method11878(), 2, 6, 1, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 1, 5, 1, class1853);
        this.method13440(class1851, Class7521.field29598.method11878(), 1, 6, 1, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 1, 5, 2, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 1, 4, 3, class1853);
        this.method13440(class1851, Class7521.field29598.method11878(), 1, 5, 3, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 2, 4, 3, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 3, 3, 3, class1853);
        this.method13440(class1851, Class7521.field29598.method11878(), 3, 4, 3, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 3, 3, 2, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 3, 2, 1, class1853);
        this.method13440(class1851, Class7521.field29598.method11878(), 3, 3, 1, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 2, 2, 1, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 1, 1, 1, class1853);
        this.method13440(class1851, Class7521.field29598.method11878(), 1, 2, 1, class1853);
        this.method13440(class1851, Class7521.field29368.method11878(), 1, 1, 2, class1853);
        this.method13440(class1851, Class7521.field29598.method11878(), 1, 1, 3, class1853);
        return true;
    }
}
