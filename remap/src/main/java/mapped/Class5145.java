// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;

public class Class5145 implements Class5113
{
    public final List<Class9337<?>> field22144;
    public final Class8530<?, ?> field22145;
    
    public Class5145(final List<Class9337<?>> field22144, final Class8530<?, ?> field22145) {
        this.field22144 = field22144;
        this.field22145 = field22145;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("features"), dynamicOps.createList((Stream)this.field22144.stream().map(class9337 -> class9337.method34604(dynamicOps2).getValue())), dynamicOps.createString("default"), this.field22145.method28612((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue())));
    }
    
    public static <T> Class5145 method16066(final Dynamic<T> dynamic) {
        return new Class5145(dynamic.get("features").asList((Function)Class9337::method34606), Class8530.method28614((com.mojang.datafixers.Dynamic<Object>)dynamic.get("default").orElseEmptyMap()));
    }
}
