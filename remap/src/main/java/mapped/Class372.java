// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;

import java.util.stream.Collectors;
import java.util.Set;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;

public class Class372 extends Class367
{
    private final float field2212;
    
    public Class372(final float field2212) {
        super(Class7742.field31650);
        this.field2212 = field2212;
    }
    
    public <T> Class372(final Dynamic<T> dynamic) {
        this(dynamic.get("probability").asFloat(0.0f));
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random2, final List<BlockPos> list4, final List<BlockPos> list2, final Set<BlockPos> set, final MutableBoundingBox class1852) {
        if (random2.nextFloat() < this.field2212) {
            final Direction class1853 = Class3961.field17900[random2.nextInt(Class3961.field17900.length)];
            final List<? super Object> list3 = (List<? super Object>)list4.stream().filter(class1855 -> {
                final Object o = list5.isEmpty() ? Math.min(list4.get(0).getY() + 1 + random2.nextInt(3), list4.get(list4.size() - 1).getY()) : Math.max(list5.get(0).method1075() - 1, list4.get(0).getY());
                return class1855.getY() == n2;
            }).collect(Collectors.toList());
            if (!list3.isEmpty()) {
                final BlockPos method1149 = list3.get(random2.nextInt(list3.size())).method1149(class1853);
                if (Class4592.method13609(class1851, method1149)) {
                    if (Class4592.method13609(class1851, method1149.method1149(Direction.SOUTH))) {
                        this.method1243(class1851, method1149, ((StateHolder<O, BlockState>)Class7521.field29823.getDefaultState()).with((IProperty<Comparable>)Class3961.field17901, Direction.SOUTH), set, class1852);
                        final TileEntity method1150 = class1851.getTileEntity(method1149);
                        if (method1150 instanceof Class438) {
                            final Class438 class1854 = (Class438)method1150;
                            for (int n = 2 + random2.nextInt(2), i = 0; i < n; ++i) {
                                class1854.method2225(new Class798(EntityType.field28961, class1851.method6744()), false, random2.nextInt(599));
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field221.getKey(this.field2209).toString()), dynamicOps.createString("probability"), dynamicOps.createFloat(this.field2212)))).getValue();
    }
}
