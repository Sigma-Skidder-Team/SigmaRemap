// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;

public class Class361 extends Class357
{
    private final Block field2189;
    
    public Class361(final Block field2189) {
        super(Class8804.field37004);
        this.field2189 = field2189;
    }
    
    public <T> Class361(final Dynamic<T> dynamic) {
        this(BlockState.deserialize((com.mojang.datafixers.Dynamic<Object>)dynamic.get("state").orElseEmptyMap()).getBlock());
    }
    
    @Override
    public BlockState method1164(final Random random, final BlockPos class354) {
        return ((StateHolder<O, BlockState>)this.field2189.getDefaultState()).with(Class4027.field18120, Direction.Axis.random(random));
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Registry.field218.getKey(this.field2184).toString())).put(dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field2189.getDefaultState()).getValue());
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
}
