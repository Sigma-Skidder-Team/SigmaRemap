// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4555 extends Class4535<Class5122>
{
    public Class4555(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5122 class1854) {
        final Class385 class1855 = new Class385();
        final Class385 class1856 = new Class385();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n = class1853.method1074() + i;
                final int n2 = class1853.method1076() + j;
                class1855.method1284(n, class1851.method6699(Class2020.field11525, n, n2), n2);
                class1856.method1287(class1855).method1291(Class179.field511, 1);
                final Class3090 method6959 = class1851.method6959(class1855);
                if (method6959.method9847(class1851, class1856, false)) {
                    class1851.method6688(class1856, Class7521.field29330.method11878(), 2);
                }
                if (method6959.method9848(class1851, class1855)) {
                    class1851.method6688(class1855, Class7521.field29329.method11878(), 2);
                    final Class7096 method6960 = class1851.method6701(class1856);
                    if (((Class7097<Object, Object>)method6960).method21771((Class7111<Comparable>)Class3911.field17717)) {
                        class1851.method6688(class1856, ((Class7097<Object, Class7096>)method6960).method21773((Class7111<Comparable>)Class3911.field17717, true), 2);
                    }
                }
            }
        }
        return true;
    }
}
