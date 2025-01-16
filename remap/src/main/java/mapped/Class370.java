// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

public class Class370 extends Class367
{
    public Class370() {
        super(Class7742.field31648);
    }
    
    public <T> Class370(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random, final List<BlockPos> list, final List<BlockPos> list2, final Set<BlockPos> set, final MutableBoundingBox class1852) {
        list2.forEach(class1855 -> {
            if (random2.nextInt(4) == 0) {
                class1855.method1145();
                final BlockPos class1856;
                if (!(!Class4592.method13609(class1853, class1856))) {
                    this.method1250(class1853, class1856, Class4006.field18057, set2, class1854);
                }
            }
            if (random2.nextInt(4) == 0) {
                class1855.method1147();
                final BlockPos class1857;
                if (!(!Class4592.method13609(class1853, class1857))) {
                    this.method1250(class1853, class1857, Class4006.field18059, set2, class1854);
                }
            }
            if (random2.nextInt(4) == 0) {
                class1855.method1141();
                final BlockPos class1858;
                if (!(!Class4592.method13609(class1853, class1858))) {
                    this.method1250(class1853, class1858, Class4006.field18058, set2, class1854);
                }
            }
            if (random2.nextInt(4) == 0) {
                class1855.method1143();
                final BlockPos class1859;
                if (!(!Class4592.method13609(class1853, class1859))) {
                    this.method1250(class1853, class1859, Class4006.field18056, set2, class1854);
                }
            }
        });
    }
    
    private void method1250(final Class1875 class1875, final BlockPos class1876, final Class7113 class1877, final Set<BlockPos> set, final MutableBoundingBox class1878) {
        this.method1242(class1875, class1876, class1877, set, class1878);
        int n = 4;
        for (BlockPos class1879 = class1876.method1139(); Class4592.method13609(class1875, class1879) && n > 0; class1879 = class1879.method1139(), --n) {
            this.method1242(class1875, class1879, class1877, set, class1878);
        }
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field221.getKey(this.field2209).toString())))).getValue();
    }
}
