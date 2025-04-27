// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5140 implements Class5113
{
    public final int field22125;
    public final BlockState field22126;
    
    public Class5140(final int field22125, final BlockState field22126) {
        this.field22125 = field22125;
        this.field22126 = field22126;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("height"), dynamicOps.createInt(this.field22125), dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22126).getValue())));
    }
    
    public static <T> Class5140 method16054(final Dynamic<T> dynamic) {
        return new Class5140(dynamic.get("height").asInt(0), dynamic.get("state").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()));
    }
}
