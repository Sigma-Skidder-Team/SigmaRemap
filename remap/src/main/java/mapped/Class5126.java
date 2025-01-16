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
    public final BlockState field22077;
    public final BlockState field22078;
    
    public Class5126(final BlockState field22077, final BlockState field22078) {
        this.field22077 = field22077;
        this.field22078 = field22078;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("target"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22077).getValue(), dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22078).getValue())));
    }
    
    public static <T> Class5126 method16031(final Dynamic<T> dynamic) {
        return new Class5126(dynamic.get("target").map((Function) BlockState::deserialize).orElse(Class7521.field29147.getDefaultState()), dynamic.get("state").map((Function) BlockState::deserialize).orElse(Class7521.field29147.getDefaultState()));
    }
}
