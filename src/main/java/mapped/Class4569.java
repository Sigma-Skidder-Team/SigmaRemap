// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4569 extends Class4535<Class5112>
{
    public Class4569(final Function<Dynamic<?>, ? extends Class5112> function) {
        super(function);
    }
    
    public boolean method13577(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5112 class1854) {
        if (class1853.method1075() >= 5) {
            final int n = 2 + random.nextInt(2);
            final int n2 = 2 + random.nextInt(2);
            for (final Class354 class1855 : Class354.method1154(class1853.method1134(-n, 0, -n2), class1853.method1134(n, 1, n2))) {
                final int n3 = class1853.method1074() - class1855.method1074();
                final int n4 = class1853.method1076() - class1855.method1076();
                if (n3 * n3 + n4 * n4 > random.nextFloat() * 10.0f - random.nextFloat() * 6.0f) {
                    if (random.nextFloat() >= 0.031) {
                        continue;
                    }
                    this.method13579(class1851, class1855, random, class1854);
                }
                else {
                    this.method13579(class1851, class1855, random, class1854);
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method13578(final Class1851 class1851, final Class354 class1852, final Random random) {
        final Class354 method1139 = class1852.method1139();
        final Class7096 method1140 = class1851.method6701(method1139);
        return (method1140.method21696() != Class7521.field29637) ? method1140.method21761(class1851, method1139, Class179.field512) : random.nextBoolean();
    }
    
    private void method13579(final Class1851 class1851, final Class354 class1852, final Random random, final Class5112 class1853) {
        if (class1851.method6961(class1852)) {
            if (this.method13578(class1851, class1852, random)) {
                class1851.method6688(class1852, class1853.field22058.method1164(random, class1852), 4);
            }
        }
    }
}
