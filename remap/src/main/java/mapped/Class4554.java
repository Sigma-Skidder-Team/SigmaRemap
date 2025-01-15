// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4554 extends Class4535<Class5122>
{
    private static final Direction[] field20035;
    
    public Class4554(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        final Mutable class1855 = new Mutable(class1853);
        for (int i = class1853.getY(); i < 256; ++i) {
            class1855.method1287(class1853);
            class1855.method1292(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            class1855.method1294(i);
            if (class1851.method6961(class1855)) {
                for (final Direction class1856 : Class4554.field20035) {
                    if (class1856 != Direction.DOWN && Class4006.method12176(class1851, class1855, class1856)) {
                        class1851.method6688(class1855, (Class7096)((Class7097<Object, Object>)Class7521.field29388.method11878()).method21773((Class7111<Comparable>)Class4006.method12181(class1856), true), 2);
                        break;
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field20035 = Direction.values();
    }
}
