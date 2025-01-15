// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Random;

public class Class4510 extends Class4500
{
    private boolean field19908;
    
    public Class4510(final int n, final Random random, final Class6997 field19849, final Class179 class179) {
        super(Class9520.field40964, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
    }
    
    public Class4510(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40964, class1796);
        this.field19908 = class1796.method329("Chest");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("Chest", this.field19908);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13494((Class4507)class4473, list, random, 1, 1);
    }
    
    public static Class4510 method13505(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Class179 class179, final int n4) {
        final Class6997 method21408 = Class6997.method21408(n, n2, n3, -1, -1, 0, 5, 5, 7, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4510(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 4, 4, 6, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 1, 1, 0);
        this.method13492(class1851, random, class1853, Class1982.field10976, 1, 1, 6);
        this.method13444(class1851, class1853, 3, 1, 2, 3, 1, 4, Class7521.field29368.method11878(), Class7521.field29368.method11878(), false);
        this.method13440(class1851, Class7521.field29604.method11878(), 3, 1, 1, class1853);
        this.method13440(class1851, Class7521.field29604.method11878(), 3, 1, 5, class1853);
        this.method13440(class1851, Class7521.field29604.method11878(), 3, 2, 2, class1853);
        this.method13440(class1851, Class7521.field29604.method11878(), 3, 2, 4, class1853);
        for (int i = 2; i <= 4; ++i) {
            this.method13440(class1851, Class7521.field29604.method11878(), 2, 1, i, class1853);
        }
        if (!this.field19908) {
            if (class1853.method21415(new Class354(this.method13437(3, 3), this.method13438(2), this.method13439(3, 3)))) {
                this.field19908 = true;
                this.method13450(class1851, class1853, random, 3, 2, 3, Class9020.field38087);
            }
        }
        return true;
    }
}
