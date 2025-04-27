// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

public class Class380 extends Class378
{
    public Class380(final int n, final int n2) {
        super(n, n2, Class7944.field32622);
    }
    
    public <T> Class380(final Dynamic<T> dynamic) {
        this(dynamic.get("radius").asInt(0), dynamic.get("radius_random").asInt(0));
    }
    
    @Override
    public void method1261(final Class1875 class1875, final Random random, final Class5129 class1876, final int n, final int n2, final int n3, final BlockPos class1877, final Set<BlockPos> set) {
        class1876.field22086.method1265(class1875, random, class1876, n, class1877, 0, n3, set);
        class1876.field22086.method1265(class1875, random, class1876, n, class1877, 1, 1, set);
        final BlockPos method1137 = class1877.method1137();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                this.method1266(class1875, random, method1137.add(i, 0, j), class1876, set);
            }
        }
        for (int k = 2; k <= n3 - 1; ++k) {
            this.method1266(class1875, random, method1137.method1148(k), class1876, set);
            this.method1266(class1875, random, method1137.method1146(k), class1876, set);
            this.method1266(class1875, random, method1137.method1144(k), class1876, set);
            this.method1266(class1875, random, method1137.method1142(k), class1876, set);
        }
    }
    
    @Override
    public int method1262(final Random random, final int n, final int n2, final Class5129 class5129) {
        return this.field2220 + random.nextInt(this.field2221 + 1);
    }
    
    @Override
    public boolean method1263(final Random random, final int n, final int a, final int n2, final int a2, final int n3) {
        if (Math.abs(a) == n3) {
            if (Math.abs(a2) == n3) {
                return n3 > 0;
            }
        }
        return false;
    }
    
    @Override
    public int method1264(final int n, final int n2, final int n3, final int n4) {
        return (n4 != 0) ? 2 : 0;
    }
}
