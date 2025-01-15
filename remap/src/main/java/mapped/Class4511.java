// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.List;
import java.util.Random;

public class Class4511 extends Class4500
{
    private final boolean field19909;
    private final boolean field19910;
    private final boolean field19911;
    private final boolean field19912;
    
    public Class4511(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40966, n);
        this.method13456(class179);
        this.field19896 = this.method13493(random);
        this.field19849 = field19849;
        this.field19909 = random.nextBoolean();
        this.field19910 = random.nextBoolean();
        this.field19911 = random.nextBoolean();
        this.field19912 = (random.nextInt(3) > 0);
    }
    
    public Class4511(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40966, class1796);
        this.field19909 = class1796.method329("leftLow");
        this.field19910 = class1796.method329("leftHigh");
        this.field19911 = class1796.method329("rightLow");
        this.field19912 = class1796.method329("rightHigh");
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("leftLow", this.field19909);
        class51.method312("leftHigh", this.field19910);
        class51.method312("rightLow", this.field19911);
        class51.method312("rightHigh", this.field19912);
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        int n = 3;
        int n2 = 5;
        final Direction method13455 = this.method13455();
        if (method13455 == Direction.WEST || method13455 == Direction.NORTH) {
            n = 8 - n;
            n2 = 8 - n2;
        }
        this.method13494((Class4507)class4473, list, random, 5, 1);
        if (this.field19909) {
            this.method13495((Class4507)class4473, list, random, n, 1);
        }
        if (this.field19910) {
            this.method13495((Class4507)class4473, list, random, n2, 7);
        }
        if (this.field19911) {
            this.method13496((Class4507)class4473, list, random, n, 1);
        }
        if (this.field19912) {
            this.method13496((Class4507)class4473, list, random, n2, 7);
        }
    }
    
    public static Class4511 method13506(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -4, -3, 0, 10, 9, 11, class179);
        return (Class4500.method13497(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4511(n4, random, method21408, class179) : null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.method13445(class1851, class1853, 0, 0, 0, 9, 8, 10, true, random, Class6924.method21296());
        this.method13492(class1851, random, class1853, this.field19896, 4, 3, 0);
        if (this.field19909) {
            this.method13444(class1851, class1853, 0, 3, 1, 0, 5, 3, Class4511.field19848, Class4511.field19848, false);
        }
        if (this.field19911) {
            this.method13444(class1851, class1853, 9, 3, 1, 9, 5, 3, Class4511.field19848, Class4511.field19848, false);
        }
        if (this.field19910) {
            this.method13444(class1851, class1853, 0, 5, 7, 0, 7, 9, Class4511.field19848, Class4511.field19848, false);
        }
        if (this.field19912) {
            this.method13444(class1851, class1853, 9, 5, 7, 9, 7, 9, Class4511.field19848, Class4511.field19848, false);
        }
        this.method13444(class1851, class1853, 5, 1, 10, 7, 3, 10, Class4511.field19848, Class4511.field19848, false);
        this.method13445(class1851, class1853, 1, 2, 1, 8, 2, 6, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 4, 1, 5, 4, 4, 9, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 8, 1, 5, 8, 4, 9, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 1, 4, 7, 3, 4, 9, false, random, Class6924.method21296());
        this.method13445(class1851, class1853, 1, 3, 5, 3, 3, 6, false, random, Class6924.method21296());
        this.method13444(class1851, class1853, 1, 3, 4, 3, 3, 4, Class7521.field29598.method11878(), Class7521.field29598.method11878(), false);
        this.method13444(class1851, class1853, 1, 4, 6, 3, 4, 6, Class7521.field29598.method11878(), Class7521.field29598.method11878(), false);
        this.method13445(class1851, class1853, 5, 1, 7, 7, 1, 8, false, random, Class6924.method21296());
        this.method13444(class1851, class1853, 5, 1, 9, 7, 1, 9, Class7521.field29598.method11878(), Class7521.field29598.method11878(), false);
        this.method13444(class1851, class1853, 5, 2, 7, 7, 2, 7, Class7521.field29598.method11878(), Class7521.field29598.method11878(), false);
        this.method13444(class1851, class1853, 4, 5, 7, 4, 5, 9, Class7521.field29598.method11878(), Class7521.field29598.method11878(), false);
        this.method13444(class1851, class1853, 8, 5, 7, 8, 5, 9, Class7521.field29598.method11878(), Class7521.field29598.method11878(), false);
        this.method13444(class1851, class1853, 5, 5, 7, 7, 5, 9, ((Class7097<O, Class7096>)Class7521.field29598.method11878()).method21773(Class3921.field17777, Class186.field600), ((Class7097<O, Class7096>)Class7521.field29598.method11878()).method21773(Class3921.field17777, Class186.field600), false);
        this.method13440(class1851, ((Class7097<O, Class7096>)Class7521.field29288.method11878()).method21773((Class7111<Comparable>)Class4023.field18110, Direction.SOUTH), 6, 5, 6, class1853);
        return true;
    }
}
