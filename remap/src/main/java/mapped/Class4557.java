// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4557 extends Class4556
{
    public Class4557(final Function<Dynamic<?>, ? extends Class5137> function) {
        super(function);
    }
    
    @Override
    public void method13570(final Class1851 class1851, final Random random, final BlockPos class1852, final int n, final Class385 class1853, final Class5137 class1854) {
        for (int i = n - 3; i <= n; ++i) {
            final int n2 = (i >= n) ? (class1854.field22118 - 1) : class1854.field22118;
            final int n3 = class1854.field22118 - 2;
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    final boolean b = j == -n2;
                    final boolean b2 = j == n2;
                    final boolean b3 = k == -n2;
                    final boolean b4 = k == n2;
                    final boolean b5 = b || b2;
                    final boolean b6 = b3 || b4;
                    if (i >= n || b5 != b6) {
                        class1853.method1287(class1852).method1292(j, i, k);
                        if (!class1851.method6701(class1853).method21722(class1851, class1853)) {
                            this.method13529(class1851, class1853, (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class1854.field22116.method1164(random, class1852)).method21773((Class7111<Comparable>)Class4003.field18045, i >= n - 1)).method21773((Class7111<Comparable>)Class4003.field18044, j < -n3)).method21773((Class7111<Comparable>)Class4003.field18042, j > n3)).method21773((Class7111<Comparable>)Class4003.field18041, k < -n3)).method21773((Class7111<Comparable>)Class4003.field18043, k > n3));
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public int method13569(final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        if (n4 < n2 && n4 >= n2 - 3) {
            n5 = n3;
        }
        else if (n4 == n2) {
            n5 = n3;
        }
        return n5;
    }
}
