// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import com.mojang.datafixers.Dynamic;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;
import java.util.Random;

public abstract class Class378 implements IDynamicSerializable
{
    public final int field2220;
    public final int field2221;
    public final Class7944<?> field2222;
    
    public Class378(final int field2220, final int field2221, final Class7944<?> field2222) {
        this.field2220 = field2220;
        this.field2221 = field2221;
        this.field2222 = field2222;
    }
    
    public abstract void method1261(final Class1875 p0, final Random p1, final Class5129 p2, final int p3, final int p4, final int p5, final BlockPos p6, final Set<BlockPos> p7);
    
    public abstract int method1262(final Random p0, final int p1, final int p2, final Class5129 p3);
    
    public abstract boolean method1263(final Random p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public abstract int method1264(final int p0, final int p1, final int p2, final int p3);
    
    public void method1265(final Class1875 class1875, final Random random, final Class5129 class1876, final int n, final BlockPos class1877, final int n2, final int n3, final Set<BlockPos> set) {
        final Mutable class1878 = new Mutable();
        for (int i = -n3; i <= n3; ++i) {
            for (int j = -n3; j <= n3; ++j) {
                if (!this.method1263(random, n, i, n2, j, n3)) {
                    class1878.setPos(i + class1877.getX(), n2 + class1877.getY(), j + class1877.getZ());
                    this.method1266(class1875, random, class1878, class1876, set);
                }
            }
        }
    }
    
    public void method1266(final Class1875 class1875, final Random random, final BlockPos class1876, final Class5129 class1877, final Set<BlockPos> set) {
        if (!Class4592.method13613(class1875, class1876)) {
            if (!Class4592.method13616(class1875, class1876)) {
                if (!Class4592.method13612(class1875, class1876)) {
                    return;
                }
            }
        }
        class1875.method6688(class1876, class1877.field22080.method1164(random, class1876), 19);
        set.add(class1876.toImmutable());
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Class90.field220.method503(this.field2222).toString())).put(dynamicOps.createString("radius"), dynamicOps.createInt(this.field2220)).put(dynamicOps.createString("radius_random"), dynamicOps.createInt(this.field2221));
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
}
