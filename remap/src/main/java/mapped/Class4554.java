// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4554 extends Class4535<Class5122>
{
    private static final Class179[] field20035;
    
    public Class4554(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5122 class1854) {
        final Class385 class1855 = new Class385(class1853);
        for (int i = class1853.method1075(); i < 256; ++i) {
            class1855.method1287(class1853);
            class1855.method1292(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            class1855.method1294(i);
            if (class1851.method6961(class1855)) {
                for (final Class179 class1856 : Class4554.field20035) {
                    if (class1856 != Class179.field511 && Class4006.method12176(class1851, class1855, class1856)) {
                        class1851.method6688(class1855, (Class7096)((Class7097<Object, Object>)Class7521.field29388.method11878()).method21773((Class7111<Comparable>)Class4006.method12181(class1856), true), 2);
                        break;
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field20035 = Class179.values();
    }
}
