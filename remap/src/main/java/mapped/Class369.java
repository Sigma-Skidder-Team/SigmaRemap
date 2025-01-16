// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util2.Direction;

public class Class369 extends Class367
{
    private final float field2211;
    
    public Class369(final float field2211) {
        super(Class7742.field31649);
        this.field2211 = field2211;
    }
    
    public <T> Class369(final Dynamic<T> dynamic) {
        this(dynamic.get("probability").asFloat(0.0f));
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random, final List<BlockPos> list3, final List<BlockPos> list2, final Set<BlockPos> set, final MutableBoundingBox class1852) {
        if (random.nextFloat() < this.field2211) {
            list3.stream().filter(class1853 -> {
                list3.get(0).getY();
                return class1853.getY() - n <= 2;
            }).forEach(class1856 -> {
                Plane.HORIZONTAL.iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final Direction class1857 = iterator.next();
                    if (random2.nextFloat() > 0.25f) {
                        continue;
                    }
                    else {
                        class1857.getOpposite();
                        final Direction class1858;
                        class1856.add(class1858.getXOffset(), 0, class1858.getZOffset());
                        final BlockPos class1859;
                        if (!Class4592.method13609(class1854, class1859)) {
                            continue;
                        }
                        else {
                            this.method1243(class1854, class1859, (Class7096)((StateHolder<Object, Object>)((StateHolder<O, Class7096>)Class7521.field29406.getDefaultState()).with((IProperty<Comparable>)Class3891.field17559, random2.nextInt(3))).with((IProperty<Comparable>)Class3891.field17564, class1857), set2, class1855);
                        }
                    }
                }
            });
        }
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field221.getKey(this.field2209).toString()), dynamicOps.createString("probability"), dynamicOps.createFloat(this.field2211)))).getValue();
    }
}
