// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4594 extends Class4593<Class5128>
{
    public Class4594(final Function<Dynamic<?>, ? extends Class5128> function) {
        super(function);
    }
    
    public boolean method13641(final Class1875 class1875, final Random random, final Class354 class1876, final Set<Class354> set, final Set<Class354> set2, final Class6997 class1877, final Class5128 class1878) {
        final int method13634 = this.method13634(random, class1878);
        if (this.method13637(class1875, class1876, method13634)) {
            this.method13642(class1875, random, class1876.method1074(), class1876.method1076(), class1876.method1075() + method13634, 0, set2, class1877, class1878);
            this.method13640(class1875, random, class1876, method13634, set, class1877, class1878);
            return true;
        }
        return false;
    }
    
    private void method13642(final Class1875 class1875, final Random random, final int n, final int n2, final int n3, final int n4, final Set<Class354> set, final Class6997 class1876, final Class5128 class1877) {
        final int n5 = random.nextInt(5) + class1877.field22085;
        int n6 = 0;
        for (int i = n3 - n5; i <= n3; ++i) {
            final int n7 = n3 - i;
            final int n8 = n4 + Class9546.method35642(n7 / (float)n5 * 3.5f);
            final Class354 class1878 = new Class354(n, i, n2);
            final int n9 = n8;
            int n10 = 0;
            Label_0107: {
                if (n7 > 0) {
                    if (n8 == n6) {
                        if ((i & 0x1) == 0x0) {
                            n10 = 1;
                            break Label_0107;
                        }
                    }
                }
                n10 = 0;
            }
            this.method13638(class1875, random, class1878, n9 + n10, set, class1876, class1877);
            n6 = n8;
        }
    }
}
