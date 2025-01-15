// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4600 extends Class4598<Class5129>
{
    public Class4600(final Function<Dynamic<?>, ? extends Class5129> function) {
        super(function);
    }
    
    public boolean method13647(final Class1875 class1875, final Random random, final BlockPos class1876, final Set<BlockPos> set, final Set<BlockPos> set2, final MutableBoundingBox class1877, final Class5129 class1878) {
        final int n = class1878.field22082 + random.nextInt(class1878.field22087 + 1) + random.nextInt(class1878.field22088 + 1);
        final int n2 = (class1878.field22089 < 0) ? (n - (class1878.field22093 + random.nextInt(class1878.field22094 + 1))) : (class1878.field22089 + random.nextInt(class1878.field22090 + 1));
        final int method1262 = class1878.field22086.method1262(random, n2, n, class1878);
        final Optional<BlockPos> method1263 = this.method13646(class1875, n, n2, method1262, class1876, class1878);
        if (method1263.isPresent()) {
            final BlockPos class1879 = method1263.get();
            this.method13617(class1875, class1879.method1139());
            class1878.field22086.method1261(class1875, random, class1878, n, n2, method1262, class1879, set2);
            this.method13645(class1875, random, n, class1879, class1878.field22091 + random.nextInt(class1878.field22092 + 1), set, class1877, class1878);
            return true;
        }
        return false;
    }
}
