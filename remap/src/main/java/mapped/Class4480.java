// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4480 extends Class4479
{
    private static String[] field19870;
    
    public Class4480(final int n, final Class6997 field19849, final Direction class179, final Class1964 class180) {
        super(Class9520.field40946, n, class180);
        this.method13456(class179);
        this.field19849 = field19849;
    }
    
    public Class4480(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40946, class1796);
    }
    
    public static Class6997 method13465(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179) {
        final Class6997 class180 = new Class6997(n, n2 - 5, n3, n, n2 + 3 - 1, n3);
        switch (Class8427.field34587[class179.ordinal()]) {
            default: {
                class180.field27296 = n + 3 - 1;
                class180.field27295 = n3 - 8;
                break;
            }
            case 2: {
                class180.field27296 = n + 3 - 1;
                class180.field27298 = n3 + 8;
                break;
            }
            case 3: {
                class180.field27293 = n - 8;
                class180.field27298 = n3 + 3 - 1;
                break;
            }
            case 4: {
                class180.field27296 = n + 8;
                class180.field27298 = n3 + 3 - 1;
                break;
            }
        }
        return (Class4473.method13435(list, class180) != null) ? null : class180;
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final int method13433 = this.method13433();
        final Direction method13434 = this.method13455();
        if (method13434 != null) {
            switch (Class8427.field34587[method13434.ordinal()]) {
                default: {
                    Class9191.method33629(class4473, list, random, this.field19849.field27293, this.field19849.field27294, this.field19849.field27295 - 1, Direction.NORTH, method13433);
                    break;
                }
                case 2: {
                    Class9191.method33629(class4473, list, random, this.field19849.field27293, this.field19849.field27294, this.field19849.field27298 + 1, Direction.SOUTH, method13433);
                    break;
                }
                case 3: {
                    Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294, this.field19849.field27295, Direction.WEST, method13433);
                    break;
                }
                case 4: {
                    Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294, this.field19849.field27295, Direction.EAST, method13433);
                    break;
                }
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (!this.method13436(class1851, class1853)) {
            this.method13444(class1851, class1853, 0, 5, 0, 2, 7, 1, Class4480.field19848, Class4480.field19848, false);
            this.method13444(class1851, class1853, 0, 0, 7, 2, 2, 8, Class4480.field19848, Class4480.field19848, false);
            for (int i = 0; i < 5; ++i) {
                this.method13444(class1851, class1853, 0, 5 - i - ((i < 4) ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, Class4480.field19848, Class4480.field19848, false);
            }
            return true;
        }
        return false;
    }
}
