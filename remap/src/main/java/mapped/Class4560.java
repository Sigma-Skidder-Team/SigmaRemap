// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4560 extends Class4535<Class5117>
{
    private static final Class7096 field20036;
    private static final Class7096 field20037;
    private static final Class7096 field20038;
    private static final Class7096 field20039;
    
    public Class4560(final Function<Dynamic<?>, ? extends Class5117> function) {
        super(function);
    }
    
    public boolean method13572(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5117 class1854) {
        int n = 0;
        final Class385 class1855 = new Class385(class1853);
        final Class385 class1856 = new Class385(class1853);
        if (class1851.method6961(class1855)) {
            if (Class7521.field29761.method11878().method21752(class1851, class1855)) {
                final int n2 = random.nextInt(12) + 5;
                if (random.nextFloat() < class1854.field22066) {
                    for (int n3 = random.nextInt(4) + 1, i = class1853.getX() - n3; i <= class1853.getX() + n3; ++i) {
                        for (int j = class1853.getZ() - n3; j <= class1853.getZ() + n3; ++j) {
                            final int n4 = i - class1853.getX();
                            final int n5 = j - class1853.getZ();
                            if (n4 * n4 + n5 * n5 <= n3 * n3) {
                                class1856.method1284(i, class1851.method6699(Class2020.field11522, i, j) - 1, j);
                                if (Class4535.method13533(class1851.method6701(class1856).method21696())) {
                                    class1851.method6688(class1856, Class7521.field29158.method11878(), 2);
                                }
                            }
                        }
                    }
                }
                for (int n6 = 0; n6 < n2 && class1851.method6961(class1855); ++n6) {
                    class1851.method6688(class1855, Class4560.field20036, 2);
                    class1855.method1291(Direction.UP, 1);
                }
                if (class1855.getY() - class1853.getY() >= 3) {
                    class1851.method6688(class1855, Class4560.field20037, 2);
                    class1851.method6688(class1855.method1291(Direction.DOWN, 1), Class4560.field20038, 2);
                    class1851.method6688(class1855.method1291(Direction.DOWN, 1), Class4560.field20039, 2);
                }
            }
            ++n;
        }
        return n > 0;
    }
    
    static {
        field20036 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class7521.field29761.method11878()).method21773((Class7111<Comparable>)Class3913.field17723, 1)).method21773(Class3913.field17724, Class184.field574)).method21773((Class7111<Comparable>)Class3913.field17725, 0);
        field20037 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)Class4560.field20036).method21773(Class3913.field17724, Class184.field576)).method21773((Class7111<Comparable>)Class3913.field17725, 1);
        field20038 = ((Class7097<O, Class7096>)Class4560.field20036).method21773(Class3913.field17724, Class184.field576);
        field20039 = ((Class7097<O, Class7096>)Class4560.field20036).method21773(Class3913.field17724, Class184.field575);
    }
}
