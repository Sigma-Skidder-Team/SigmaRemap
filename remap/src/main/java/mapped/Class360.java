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
    private final Class7096 field2188;
    
    public Class360(final Class7096 field2188) {
        super(Class8804.field37004);
        this.field2188 = field2188;
    }
    
    public <T> Class360(final Dynamic<T> dynamic) {
        this(Class7096.method21764((com.mojang.datafixers.Dynamic<Object>)dynamic.get("state").orElseEmptyMap()));
    }
    
    @Override
    public Class7096 method1164(final Random random, final BlockPos class354) {
        return this.field2188;
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Class90.field218.method503(this.field2184).toString())).put(dynamicOps.createString("state"), Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field2188).getValue());
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
}
