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

public class Class5134 implements Class5113
{
    public final List<Class8530<?, ?>> field22110;
    
    public Class5134(final List<Class8530<?, ?>> field22110) {
        this.field22110 = field22110;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("features"), dynamicOps.createList((Stream)this.field22110.stream().map(class8530 -> class8530.method28612(dynamicOps2).getValue())))));
    }
    
    public static <T> Class5134 method16043(final Dynamic<T> dynamic) {
        return new Class5134(dynamic.get("features").asList((Function)Class8530::method28614));
    }
}
