// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4606 extends Class4535<Class5122>
{
    public Class4606(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5122 class1854) {
        float n = (float)(random.nextInt(3) + 4);
        for (int n2 = 0; n > 0.5f; n -= (float)(random.nextInt(2) + 0.5), --n2) {
            for (int i = Class9546.method35642(-n); i <= Class9546.method35649(n); ++i) {
                for (int j = Class9546.method35642(-n); j <= Class9546.method35649(n); ++j) {
                    if (i * i + j * j <= (n + 1.0f) * (n + 1.0f)) {
                        this.method13529(class1851, class1853.method1134(i, n2, j), Class7521.field29403.method11878());
                    }
                }
            }
        }
        return true;
    }
}
