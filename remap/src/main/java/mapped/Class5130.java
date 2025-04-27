// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5130 implements Class5113
{
    public final Class1957 field22097;
    public final float field22098;
    public final float field22099;
    
    public Class5130(final Class1957 field22097, final float field22098, final float field22099) {
        this.field22097 = field22097;
        this.field22098 = field22098;
        this.field22099 = field22099;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("biome_temp"), dynamicOps.createString(this.field22097.method7943()), dynamicOps.createString("large_probability"), dynamicOps.createFloat(this.field22098), dynamicOps.createString("cluster_probability"), dynamicOps.createFloat(this.field22099))));
    }
    
    public static <T> Class5130 method16038(final Dynamic<T> dynamic) {
        return new Class5130(Class1957.method7944(dynamic.get("biome_temp").asString("")), dynamic.get("large_probability").asFloat(0.0f), dynamic.get("cluster_probability").asFloat(0.0f));
    }
}
