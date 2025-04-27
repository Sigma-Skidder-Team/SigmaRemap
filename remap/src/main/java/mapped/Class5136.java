// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5136 implements Class5113
{
    public final float field22115;
    
    public Class5136(final float field22115) {
        this.field22115 = field22115;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("probability"), dynamicOps.createFloat(this.field22115))));
    }
    
    public static <T> Class5136 method16049(final Dynamic<T> dynamic) {
        return new Class5136(dynamic.get("probability").asFloat(0.0f));
    }
}
