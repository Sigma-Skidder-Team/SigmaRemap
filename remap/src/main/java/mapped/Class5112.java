// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5112 implements Class5113
{
    public final Class357 field22058;
    
    public Class5112(final Class357 field22058) {
        this.field22058 = field22058;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("state_provider"), this.field22058.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps));
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }
    
    public static <T> Class5112 method16011(final Dynamic<T> dynamic) {
        return new Class5112(Registry.field218.getOrDefault(new ResourceLocation(dynamic.get("state_provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718((Dynamic<?>)dynamic.get("state_provider").orElseEmptyMap()));
    }
}
