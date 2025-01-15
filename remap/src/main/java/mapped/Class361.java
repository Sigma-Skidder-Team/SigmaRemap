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

public class Class361 extends Class357
{
    private final Class3833 field2189;
    
    public Class361(final Class3833 field2189) {
        super(Class8804.field37004);
        this.field2189 = field2189;
    }
    
    public <T> Class361(final Dynamic<T> dynamic) {
        this(BlockState.method21764((com.mojang.datafixers.Dynamic<Object>)dynamic.get("state").orElseEmptyMap()).method21696());
    }
    
    @Override
    public BlockState method1164(final Random random, final BlockPos class354) {
        return ((Class7097<O, BlockState>)this.field2189.method11878()).method21773(Class4027.field18120, Axis.random(random));
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Class90.field218.method503(this.field2184).toString())).put(dynamicOps.createString("state"), BlockState.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field2189.method11878()).getValue());
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
}
