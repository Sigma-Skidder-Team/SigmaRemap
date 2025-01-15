// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4509 extends Class4500
{
    public final int field19907;
    
    public Class4509(final int n, final Random random, final Class6997 field19849, final Direction class179) {
        super(Class9520.field40972, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
        this.field19907 = random.nextInt(5);
    }
    
    public Class4509(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40972, class1796);
        this.field19907 = class1796.method319("Type");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method298("Type", this.field19907);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        this.method13494((Class4507)class4473, list, random, 4, 1);
        this.method13495((Class4507)class4473, list, random, 1, 4);
        this.method13496((Class4507)class4473, list, random, 1, 4);
    }
    
    public static Class4509 method13504(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final Class6997 method21408 = Class6997.method21408(n, n2, n3, -4, -1, 0, 11, 7, 11, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4509(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 10, 6, 10, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 4, 1, 0);
        this.method13444(class1851, class1853, 4, 1, 10, 6, 3, 10, Class4509.field19848, Class4509.field19848, false);
        this.method13444(class1851, class1853, 0, 1, 4, 0, 3, 6, Class4509.field19848, Class4509.field19848, false);
        this.method13444(class1851, class1853, 10, 1, 4, 10, 3, 6, Class4509.field19848, Class4509.field19848, false);
        switch (this.field19907) {
            case 0: {
                this.method13440(class1851, Class7521.field29368.method11878(), 5, 1, 5, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 5, 2, 5, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 5, 3, 5, class1853);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Direction.WEST), 4, 3, 5, class1853);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Direction.EAST), 6, 3, 5, class1853);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Direction.SOUTH), 5, 3, 4, class1853);
                this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Direction.NORTH), 5, 3, 6, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 4, 1, 4, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 4, 1, 5, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 4, 1, 6, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 6, 1, 4, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 6, 1, 5, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 6, 1, 6, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 5, 1, 4, class1853);
                this.method13440(class1851, Class7521.field29598.method11878(), 5, 1, 6, class1853);
                break;
            }
            case 1: {
                for (int i = 0; i < 5; ++i) {
                    this.method13440(class1851, Class7521.field29368.method11878(), 3, 1, 3 + i, class1853);
                    this.method13440(class1851, Class7521.field29368.method11878(), 7, 1, 3 + i, class1853);
                    this.method13440(class1851, Class7521.field29368.method11878(), 3 + i, 1, 3, class1853);
                    this.method13440(class1851, Class7521.field29368.method11878(), 3 + i, 1, 7, class1853);
                }
                this.method13440(class1851, Class7521.field29368.method11878(), 5, 1, 5, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 5, 2, 5, class1853);
                this.method13440(class1851, Class7521.field29368.method11878(), 5, 3, 5, class1853);
                this.method13440(class1851, Class7521.field29173.method11878(), 5, 4, 5, class1853);
                break;
            }
            case 2: {
                for (int j = 1; j <= 9; ++j) {
                    this.method13440(class1851, Class7521.field29159.method11878(), 1, 3, j, class1853);
                    this.method13440(class1851, Class7521.field29159.method11878(), 9, 3, j, class1853);
                }
                for (int k = 1; k <= 9; ++k) {
                    this.method13440(class1851, Class7521.field29159.method11878(), k, 3, 1, class1853);
                    this.method13440(class1851, Class7521.field29159.method11878(), k, 3, 9, class1853);
                }
                this.method13440(class1851, Class7521.field29159.method11878(), 5, 1, 4, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 5, 1, 6, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 5, 3, 4, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 5, 3, 6, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 4, 1, 5, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 6, 1, 5, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 4, 3, 5, class1853);
                this.method13440(class1851, Class7521.field29159.method11878(), 6, 3, 5, class1853);
                for (int l = 1; l <= 3; ++l) {
                    this.method13440(class1851, Class7521.field29159.method11878(), 4, l, 4, class1853);
                    this.method13440(class1851, Class7521.field29159.method11878(), 6, l, 4, class1853);
                    this.method13440(class1851, Class7521.field29159.method11878(), 4, l, 6, class1853);
                    this.method13440(class1851, Class7521.field29159.method11878(), 6, l, 6, class1853);
                }
                this.method13440(class1851, Class7521.field29287.method11878(), 5, 3, 5, class1853);
                for (int n = 2; n <= 8; ++n) {
                    this.method13440(class1851, Class7521.field29160.method11878(), 2, 3, n, class1853);
                    this.method13440(class1851, Class7521.field29160.method11878(), 3, 3, n, class1853);
                    if (n <= 3 || n >= 7) {
                        this.method13440(class1851, Class7521.field29160.method11878(), 4, 3, n, class1853);
                        this.method13440(class1851, Class7521.field29160.method11878(), 5, 3, n, class1853);
                        this.method13440(class1851, Class7521.field29160.method11878(), 6, 3, n, class1853);
                    }
                    this.method13440(class1851, Class7521.field29160.method11878(), 7, 3, n, class1853);
                    this.method13440(class1851, Class7521.field29160.method11878(), 8, 3, n, class1853);
                }
                final Class7096 class1855 = ((Class7097<O, Class7096>)Class7521.field29307.method11878()).method21773((Class7111<Comparable>)Class3917.field17752, Direction.WEST);
                this.method13440(class1851, class1855, 9, 1, 3, class1853);
                this.method13440(class1851, class1855, 9, 2, 3, class1853);
                this.method13440(class1851, class1855, 9, 3, 3, class1853);
                this.method13450(class1851, class1853, random, 3, 4, 8, Class9020.field38086);
                break;
            }
        }
        return true;
    }
}
