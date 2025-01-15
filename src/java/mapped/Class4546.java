// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4546 extends Class4535<Class5138>
{
    public Class4546(final Function<Dynamic<?>, ? extends Class5138> function) {
        super(function);
    }
    
    public boolean method13557(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5138 class1854) {
        if (class1851.method6702(class1853).method21793(Class7324.field28319)) {
            int n = 0;
            for (int n2 = random.nextInt(class1854.field22120 - 2) + 2, i = class1853.method1074() - n2; i <= class1853.method1074() + n2; ++i) {
                for (int j = class1853.method1076() - n2; j <= class1853.method1076() + n2; ++j) {
                    final int n3 = i - class1853.method1074();
                    final int n4 = j - class1853.method1076();
                    if (n3 * n3 + n4 * n4 <= n2 * n2) {
                        for (int k = class1853.method1075() - class1854.field22121; k <= class1853.method1075() + class1854.field22121; ++k) {
                            final Class354 class1855 = new Class354(i, k, j);
                            final Class7096 method6701 = class1851.method6701(class1855);
                            final Iterator<Class7096> iterator = class1854.field22122.iterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().method21696() != method6701.method21696()) {
                                    continue;
                                }
                                class1851.method6688(class1855, class1854.field22119, 2);
                                ++n;
                                break;
                            }
                        }
                    }
                }
            }
            return n > 0;
        }
        return false;
    }
}
