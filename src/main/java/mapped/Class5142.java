// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5142 implements Class5113
{
    public final Class8530<?, ?> field22128;
    public final Class8530<?, ?> field22129;
    
    public Class5142(final Class8530<?, ?> field22128, final Class8530<?, ?> field22129) {
        this.field22128 = field22128;
        this.field22129 = field22129;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("feature_true"), this.field22128.method28612((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("feature_false"), this.field22129.method28612((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue())));
    }
    
    public static <T> Class5142 method16056(final Dynamic<T> dynamic) {
        return new Class5142(Class8530.method28614((com.mojang.datafixers.Dynamic<Object>)dynamic.get("feature_true").orElseEmptyMap()), Class8530.method28614((com.mojang.datafixers.Dynamic<Object>)dynamic.get("feature_false").orElseEmptyMap()));
    }
}
