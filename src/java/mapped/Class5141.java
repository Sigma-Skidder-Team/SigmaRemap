// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5141 implements Class5113
{
    public final Class7096 field22127;
    
    public Class5141(final Class7096 field22127) {
        this.field22127 = field22127;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("state"), Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22127).getValue())));
    }
    
    public static <T> Class5141 method16055(final Dynamic<T> dynamic) {
        return new Class5141(dynamic.get("state").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()));
    }
}
