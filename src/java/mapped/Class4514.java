// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public class Class4514 extends Class4500
{
    private final int field19916;
    
    public Class4514(final int n, final Class6997 field19849, final Class179 class179) {
        super(Class9520.field40965, n);
        this.method13456(class179);
        this.field19849 = field19849;
        this.field19916 = ((class179 != Class179.field513 && class179 != Class179.field514) ? field19849.method21417() : field19849.method21419());
    }
    
    public Class4514(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40965, class1796);
        this.field19916 = class1796.method319("Steps");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method298("Steps", this.field19916);
    }
    
    public static Class6997 method13509(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Class179 class179) {
        final Class6997 method21408 = Class6997.method21408(n, n2, n3, -1, -1, 0, 5, 5, 4, class179);
        final Class4473 method21409 = Class4473.method13435(list, method21408);
        if (method21409 != null) {
            if (method21409.method13432().field27294 == method21408.field27294) {
                for (int i = 3; i >= 1; --i) {
                    if (!method21409.method13432().method21410(Class6997.method21408(n, n2, n3, -1, -1, 0, 5, 5, i - 1, class179))) {
                        return Class6997.method21408(n, n2, n3, -1, -1, 0, 5, 5, i, class179);
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        for (int i = 0; i < this.field19916; ++i) {
            this.method13440(class1851, Class7521.field29368.method11878(), 0, 0, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 1, 0, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 2, 0, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 3, 0, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 4, 0, i, class1853);
            for (int j = 1; j <= 3; ++j) {
                this.method13440(class1851, Class7521.field29368.method11878(), 0, j, i, class1853);
                this.method13440(class1851, Class7521.field29764.method11878(), 1, j, i, class1853);
                this.method13440(class1851, Class7521.field29764.method11878(), 2, j, i, class1853);
                this.method13440(class1851, Class7521.field29764.method11878(), 3, j, i, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 4, j, i, class1853);
            }
            this.method13440(class1851, Class7521.field29368.method11878(), 0, 4, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 1, 4, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 2, 4, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 3, 4, i, class1853);
            this.method13440(class1851, Class7521.field29368.method11878(), 4, 4, i, class1853);
        }
        return true;
    }
}
