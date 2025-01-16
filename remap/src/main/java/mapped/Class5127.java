// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import java.util.stream.Stream;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;

public class Class5127 implements Class5113
{
    public final Class357 field22079;
    public final Class357 field22080;
    public final List<Class367> field22081;
    public final int field22082;
    public transient boolean field22083;
    
    public Class5127(final Class357 field22079, final Class357 field22080, final List<Class367> field22081, final int field22082) {
        this.field22079 = field22079;
        this.field22080 = field22080;
        this.field22081 = field22081;
        this.field22082 = field22082;
    }
    
    public void method16032() {
        this.field22083 = true;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("trunk_provider"), this.field22079.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)).put(dynamicOps.createString("leaves_provider"), this.field22080.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)).put(dynamicOps.createString("decorators"), dynamicOps.createList((Stream)this.field22081.stream().map(class367 -> class367.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2)))).put(dynamicOps.createString("base_height"), dynamicOps.createInt(this.field22082));
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }
    
    public static <T> Class5127 method16033(final Dynamic<T> dynamic) {
        return new Class5127(Registry.field218.getOrDefault(new ResourceLocation(dynamic.get("trunk_provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718((Dynamic<?>)dynamic.get("trunk_provider").orElseEmptyMap()), Registry.field218.getOrDefault(new ResourceLocation(dynamic.get("leaves_provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718((Dynamic<?>)dynamic.get("leaves_provider").orElseEmptyMap()), dynamic.get("decorators").asList(dynamic2 -> Registry.field221.getOrDefault(new ResourceLocation(dynamic2.get("type").asString().orElseThrow(RuntimeException::new))).method24707((Dynamic<?>)dynamic2)), dynamic.get("base_height").asInt(0));
    }
}
