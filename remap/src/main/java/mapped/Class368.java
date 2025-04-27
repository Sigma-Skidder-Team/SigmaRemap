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

public class Class368 extends Class367
{
    private final Class357 field2210;
    
    public Class368(final Class357 field2210) {
        super(Class7742.field31651);
        this.field2210 = field2210;
    }
    
    public <T> Class368(final Dynamic<T> dynamic) {
        this(Registry.field218.getOrDefault(new ResourceLocation(dynamic.get("provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718(dynamic.get("provider").orElseEmptyMap()));
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random, final List<BlockPos> list3, final List<BlockPos> list2, final Set<BlockPos> set, final MutableBoundingBox class1852) {
        list3.stream().filter(class1853 -> {
            list3.get(0).getY();
            return class1853.getY() == n;
        }).forEach(class1855 -> {
            this.method1244(class1854, random2, class1855.method1145().method1141());
            this.method1244(class1854, random2, class1855.method1148(2).method1141());
            this.method1244(class1854, random2, class1855.method1145().method1144(2));
            this.method1244(class1854, random2, class1855.method1148(2).method1144(2));
            int i = 0;
            while (i < 5) {
                random2.nextInt(64);
                Label_0146_2: {
                    final int n2;
                    final int n3;
                    if (n2 != 0) {
                        if (n2 != 7) {
                            if (n3 != 0) {
                                if (n3 != 7) {
                                    break Label_0146_2;
                                }
                            }
                        }
                    }
                    this.method1244(class1854, random2, class1855.add(-3 + n2, 0, -3 + n3));
                }
                ++i;
            }
        });
    }
    
    private void method1244(final Class1875 class1875, final Random random, final BlockPos class1876) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) != 2 || Math.abs(j) != 2) {
                    this.method1245(class1875, random, class1876.add(i, 0, j));
                }
            }
        }
    }
    
    private void method1245(final Class1875 class1875, final Random random, final BlockPos class1876) {
        for (int i = 2; i >= -3; --i) {
            final BlockPos method1138 = class1876.method1138(i);
            if (Class4592.method13614(class1875, method1138)) {
                class1875.setBlockState(method1138, this.field2210.method1164(random, class1876), 19);
                break;
            }
            if (!Class4592.method13609(class1875, method1138) && i < 0) {
                break;
            }
        }
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field221.getKey(this.field2209).toString()), dynamicOps.createString("provider"), this.field2210.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)))).getValue();
    }
}
