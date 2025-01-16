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

public class Class360 extends Class357
{
    private final BlockState field2188;
    
    public Class360(final BlockState field2188) {
        super(Class8804.field37004);
        this.field2188 = field2188;
    }
    
    public <T> Class360(final Dynamic<T> dynamic) {
        this(BlockState.deserialize((com.mojang.datafixers.Dynamic<Object>)dynamic.get("state").orElseEmptyMap()));
    }
    
    @Override
    public BlockState method1164(final Random random, final BlockPos class354) {
        return this.field2188;
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Registry.field218.getKey(this.field2184).toString())).put(dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field2188).getValue());
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
}
