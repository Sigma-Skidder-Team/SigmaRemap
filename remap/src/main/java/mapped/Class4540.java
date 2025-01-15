// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4540 extends Class4535<Class5116>
{
    public Class4540(final Function<Dynamic<?>, ? extends Class5116> function) {
        super(function);
    }
    
    public boolean method13538(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5116 class1854) {
        for (final Class354 class1855 : Class354.method1154(class1853.method1134(-1, -2, -1), class1853.method1134(1, 2, 1))) {
            final boolean b = class1855.method1074() == class1853.method1074();
            final boolean b2 = class1855.method1075() == class1853.method1075();
            final boolean b3 = class1855.method1076() == class1853.method1076();
            final boolean b4 = Math.abs(class1855.method1075() - class1853.method1075()) == 2;
            if (b) {
                if (b2) {
                    if (b3) {
                        this.method13529(class1851, class1855.method1153(), Class7521.field29638.method11878());
                        class1854.method16016().ifPresent(class1859 -> {
                            class1856.method6727(class1857);
                            final Class488 class1860;
                            if (!(!(class1860 instanceof Class488))) {
                                class1860.method2446(class1859, class1858.method16017());
                                class1860.method2161();
                            }
                            return;
                        });
                        continue;
                    }
                }
            }
            if (!b2) {
                if (b4) {
                    if (b) {
                        if (b3) {
                            this.method13529(class1851, class1855, Class7521.field29172.method11878());
                            continue;
                        }
                    }
                }
                if (b || b3) {
                    if (!b4) {
                        this.method13529(class1851, class1855, Class7521.field29172.method11878());
                        continue;
                    }
                }
                this.method13529(class1851, class1855, Class7521.field29147.method11878());
            }
            else {
                this.method13529(class1851, class1855, Class7521.field29147.method11878());
            }
        }
        return true;
    }
}
