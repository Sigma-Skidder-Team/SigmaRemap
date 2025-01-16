// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

public class Class376 extends Class373
{
    private final int field2214;
    private final int field2215;
    
    public Class376(final int field2214, final int field2215) {
        super(Class8372.field34333);
        this.field2214 = field2214;
        this.field2215 = field2215;
    }
    
    public <T> Class376(final Dynamic<T> dynamic) {
        this(dynamic.get("min_size").asInt(1), dynamic.get("extra_size").asInt(2));
    }
    
    @Override
    public void method1254(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Random random) {
        final Mutable class1854 = new Mutable(class1852);
        for (int n = this.field2214 + random.nextInt(random.nextInt(this.field2215 + 1) + 1), i = 0; i < n; ++i) {
            class1851.setBlockState(class1854, class1853, 2);
            class1854.method1290(Direction.UP);
        }
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field219.getKey(this.field2213).toString()), dynamicOps.createString("min_size"), dynamicOps.createInt(this.field2214), dynamicOps.createString("extra_size"), dynamicOps.createInt(this.field2215)))).getValue();
    }
}
