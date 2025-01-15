// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5124 implements Class5113
{
    public final int field22074;
    public final double field22075;
    
    public Class5124(final int field22074, final double field22075) {
        this.field22074 = field22074;
        this.field22075 = field22075;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field22074), dynamicOps.createString("tall_seagrass_probability"), dynamicOps.createDouble(this.field22075))));
    }
    
    public static <T> Class5124 method16029(final Dynamic<T> dynamic) {
        return new Class5124(dynamic.get("count").asInt(0), dynamic.get("tall_seagrass_probability").asDouble(0.0));
    }
}
