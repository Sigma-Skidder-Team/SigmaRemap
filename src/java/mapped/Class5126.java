// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5126 implements Class5113
{
    public final Class7096 field22077;
    public final Class7096 field22078;
    
    public Class5126(final Class7096 field22077, final Class7096 field22078) {
        this.field22077 = field22077;
        this.field22078 = field22078;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("target"), Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22077).getValue(), dynamicOps.createString("state"), Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22078).getValue())));
    }
    
    public static <T> Class5126 method16031(final Dynamic<T> dynamic) {
        return new Class5126(dynamic.get("target").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()), dynamic.get("state").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()));
    }
}
