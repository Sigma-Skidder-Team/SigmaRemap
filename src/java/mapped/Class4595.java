// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4595 extends Class4593<Class5128>
{
    public Class4595(final Function<Dynamic<?>, ? extends Class5128> function) {
        super(function);
    }
    
    public boolean method13641(final Class1875 class1875, final Random random, final Class354 class1876, final Set<Class354> set, final Set<Class354> set2, final Class6997 class1877, final Class5128 class1878) {
        final int method13634 = this.method13634(random, class1878);
        if (this.method13637(class1875, class1876, method13634)) {
            this.method13643(class1875, random, class1876.method1138(method13634), 2, set2, class1877, class1878);
            for (int i = class1876.method1075() + method13634 - 2 - random.nextInt(4); i > class1876.method1075() + method13634 / 2; i -= 2 + random.nextInt(4)) {
                final float n = random.nextFloat() * 6.2831855f;
                int n2 = class1876.method1074() + (int)(0.5f + Class9546.method35639(n) * 4.0f);
                int n3 = class1876.method1076() + (int)(0.5f + Class9546.method35638(n) * 4.0f);
                for (int j = 0; j < 5; ++j) {
                    n2 = class1876.method1074() + (int)(1.5f + Class9546.method35639(n) * j);
                    n3 = class1876.method1076() + (int)(1.5f + Class9546.method35638(n) * j);
                    this.method13618(class1875, random, new Class354(n2, i - 3 + j / 2, n3), set, class1877, class1878);
                }
                final int n4 = 1 + random.nextInt(2);
                for (int n5 = i, k = i - n4; k <= n5; ++k) {
                    this.method13639(class1875, random, new Class354(n2, k, n3), 1 - (k - n5), set2, class1877, class1878);
                }
            }
            this.method13640(class1875, random, class1876, method13634, set, class1877, class1878);
            return true;
        }
        return false;
    }
    
    private void method13643(final Class1875 class1875, final Random random, final Class354 class1876, final int n, final Set<Class354> set, final Class6997 class1877, final Class5127 class1878) {
        for (int i = -2; i <= 0; ++i) {
            this.method13638(class1875, random, class1876.method1138(i), n + 1 - i, set, class1877, class1878);
        }
    }
}
