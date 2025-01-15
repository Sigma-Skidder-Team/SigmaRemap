// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5137 implements Class5113
{
    public final Class357 field22116;
    public final Class357 field22117;
    public final int field22118;
    
    public Class5137(final Class357 field22116, final Class357 field22117, final int field22118) {
        this.field22116 = field22116;
        this.field22117 = field22117;
        this.field22118 = field22118;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("cap_provider"), this.field22116.method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)).put(dynamicOps.createString("stem_provider"), this.field22117.method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)).put(dynamicOps.createString("foliage_radius"), dynamicOps.createInt(this.field22118));
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }
    
    public static <T> Class5137 method16050(final Dynamic<T> dynamic) {
        return new Class5137(Class90.field218.method505(new Class1932(dynamic.get("cap_provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718((Dynamic<?>)dynamic.get("cap_provider").orElseEmptyMap()), Class90.field218.method505(new Class1932(dynamic.get("stem_provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718((Dynamic<?>)dynamic.get("stem_provider").orElseEmptyMap()), dynamic.get("foliage_radius").asInt(2));
    }
}
