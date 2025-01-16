// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5139 implements Class5113
{
    public final BlockState field22123;
    public final int field22124;
    
    public Class5139(final BlockState field22123, final int field22124) {
        this.field22123 = field22123;
        this.field22124 = field22124;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22123).getValue(), dynamicOps.createString("start_radius"), dynamicOps.createInt(this.field22124))));
    }
    
    public static <T> Class5139 method16053(final Dynamic<T> dynamic) {
        return new Class5139(dynamic.get("state").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()), dynamic.get("start_radius").asInt(0));
    }
}
