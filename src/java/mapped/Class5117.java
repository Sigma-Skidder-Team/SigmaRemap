// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5117 implements Class5118, Class5113
{
    public final float field22066;
    
    public Class5117(final float field22066) {
        this.field22066 = field22066;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("probability"), dynamicOps.createFloat(this.field22066))));
    }
    
    public static <T> Class5117 method16023(final Dynamic<T> dynamic) {
        return new Class5117(dynamic.get("probability").asFloat(0.0f));
    }
}
