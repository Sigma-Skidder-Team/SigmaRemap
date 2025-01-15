// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4552 extends Class4535<Class5122>
{
    private static final Class354 field20033;
    private static final Class7859 field20034;
    
    public Class4552(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    private static int method13563(final int n, final int n2, final int n3, final int n4) {
        return Math.max(Math.abs(n - n3), Math.abs(n2 - n4));
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5122 class1854) {
        final Class7859 class1855 = new Class7859(class1853);
        if (method13563(class1855.field32290, class1855.field32291, Class4552.field20034.field32290, Class4552.field20034.field32291) <= 1) {
            final Class385 class1856 = new Class385();
            for (int i = class1855.method25427(); i <= class1855.method25429(); ++i) {
                for (int j = class1855.method25426(); j <= class1855.method25428(); ++j) {
                    if (method13563(Class4552.field20033.method1074(), Class4552.field20033.method1076(), j, i) <= 16) {
                        class1856.method1284(j, Class4552.field20033.method1075(), i);
                        if (!class1856.equals(Class4552.field20033)) {
                            class1851.method6688(class1856, Class7521.field29148.method11878(), 2);
                        }
                        else {
                            class1851.method6688(class1856, Class7521.field29159.method11878(), 2);
                        }
                    }
                }
            }
            return true;
        }
        return true;
    }
    
    static {
        field20033 = new Class354(8, 3, 8);
        field20034 = new Class7859(Class4552.field20033);
    }
}
