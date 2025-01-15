// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5125 implements Class5113
{
    public final boolean field22076;
    
    public Class5125(final boolean field22076) {
        this.field22076 = field22076;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("is_beached"), dynamicOps.createBoolean(this.field22076))));
    }
    
    public static <T> Class5125 method16030(final Dynamic<T> dynamic) {
        return new Class5125(dynamic.get("is_beached").asBoolean(false));
    }
}
