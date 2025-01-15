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

public class Class5121 implements Class5113
{
    public final List<Class8530<?, ?>> field22070;
    public final int field22071;
    
    public Class5121(final List<Class8530<?, ?>> field22070, final int field22071) {
        this.field22070 = field22070;
        this.field22071 = field22071;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("features"), dynamicOps.createList((Stream)this.field22070.stream().map(class8530 -> class8530.method28612(dynamicOps2).getValue())), dynamicOps.createString("count"), dynamicOps.createInt(this.field22071))));
    }
    
    public static <T> Class5121 method16025(final Dynamic<T> dynamic) {
        return new Class5121(dynamic.get("features").asList((Function)Class8530::method28614), dynamic.get("count").asInt(0));
    }
}
