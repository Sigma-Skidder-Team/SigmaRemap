// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5123 implements Class5113
{
    public final int field22073;
    
    public Class5123(final int field22073) {
        this.field22073 = field22073;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field22073))));
    }
    
    public static <T> Class5123 method16028(final Dynamic<T> dynamic) {
        return new Class5123(dynamic.get("count").asInt(0));
    }
}
