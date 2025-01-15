// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5120 implements Class5113
{
    public final int field22069;
    
    public Class5120(final int field22069) {
        this.field22069 = field22069;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("radius"), dynamicOps.createInt(this.field22069))));
    }
    
    public static <T> Class5120 method16024(final Dynamic<T> dynamic) {
        return new Class5120(dynamic.get("radius").asInt(0));
    }
}
