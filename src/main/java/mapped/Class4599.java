// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4599 extends Class4598<Class5129>
{
    public Class4599(final Function<Dynamic<?>, ? extends Class5129> function) {
        super(function);
    }
    
    public boolean method13647(final Class1875 class1875, final Random random, final Class354 class1876, final Set<Class354> set, final Set<Class354> set2, final Class6997 class1877, final Class5129 class1878) {
        final int n = class1878.field22082 + random.nextInt(class1878.field22087 + 1) + random.nextInt(class1878.field22088 + 1);
        final int n2 = (class1878.field22089 < 0) ? (n - (class1878.field22093 + random.nextInt(class1878.field22094 + 1))) : (class1878.field22089 + random.nextInt(class1878.field22090 + 1));
        final int method1262 = class1878.field22086.method1262(random, n2, n, class1878);
        final Optional<Class354> method1263 = this.method13646(class1875, n, n2, method1262, class1876, class1878);
        if (method1263.isPresent()) {
            final Class354 class1879 = method1263.get();
            this.method13617(class1875, class1879.method1139());
            final Class179 method1264 = Class98.field268.method576(random);
            final int n3 = n - random.nextInt(4) - 1;
            int n4 = 3 - random.nextInt(3);
            final Class385 class1880 = new Class385();
            int method1265 = class1879.method1074();
            int method1266 = class1879.method1076();
            int n5 = 0;
            for (int i = 0; i < n; ++i) {
                final int n6 = class1879.method1075() + i;
                if (i >= n3) {
                    if (n4 > 0) {
                        method1265 += method1264.method785();
                        method1266 += method1264.method787();
                        --n4;
                    }
                }
                if (this.method13618(class1875, random, class1880.method1284(method1265, n6, method1266), set, class1877, class1878)) {
                    n5 = n6;
                }
            }
            class1878.field22086.method1261(class1875, random, class1878, n, n2, method1262 + 1, new Class354(method1265, n5, method1266), set2);
            int method1267 = class1879.method1074();
            int method1268 = class1879.method1076();
            final Class179 method1269 = Class98.field268.method576(random);
            if (method1269 != method1264) {
                final int n7 = n3 - random.nextInt(2) - 1;
                int n8 = 1 + random.nextInt(3);
                int n9 = 0;
                for (int n10 = n7; n10 < n && n8 > 0; ++n10, --n8) {
                    if (n10 >= 1) {
                        final int n11 = class1879.method1075() + n10;
                        method1267 += method1269.method785();
                        method1268 += method1269.method787();
                        if (this.method13618(class1875, random, class1880.method1284(method1267, n11, method1268), set, class1877, class1878)) {
                            n9 = n11;
                        }
                    }
                }
                if (n9 > 0) {
                    class1878.field22086.method1261(class1875, random, class1878, n, n2, method1262, new Class354(method1267, n9, method1268), set2);
                }
            }
            return true;
        }
        return false;
    }
}
