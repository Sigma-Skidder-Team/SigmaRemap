// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

public class Class381 extends Class378
{
    public Class381(final int n, final int n2) {
        super(n, n2, Class7944.field32621);
    }
    
    public <T> Class381(final Dynamic<T> dynamic) {
        this(dynamic.get("radius").asInt(0), dynamic.get("radius_random").asInt(0));
    }
    
    @Override
    public void method1261(final Class1875 class1875, final Random random, final Class5129 class1876, final int n, final int n2, final int n3, final BlockPos class1877, final Set<BlockPos> set) {
        int n4 = 0;
        for (int i = n; i >= n2; --i) {
            this.method1265(class1875, random, class1876, n, class1877, i, n4, set);
            if (n4 >= 1 && i == n2 + 1) {
                --n4;
            }
            else if (n4 < n3) {
                ++n4;
            }
        }
    }
    
    @Override
    public int method1262(final Random random, final int n, final int n2, final Class5129 class5129) {
        return this.field2220 + random.nextInt(this.field2221 + 1) + random.nextInt(n2 - n + 1);
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
        return (n4 > 1) ? 2 : 0;
    }
}
