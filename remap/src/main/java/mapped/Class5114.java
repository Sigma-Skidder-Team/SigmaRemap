// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5114 implements Class5113
{
    public final Class8530<?, ?> field22060;
    public final Class9166<?> field22061;
    
    public Class5114(final Class8530<?, ?> field22060, final Class9166<?> field22061) {
        this.field22060 = field22060;
        this.field22061 = field22061;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("feature"), this.field22060.method28612((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("decorator"), this.field22061.method33462((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue())));
    }
    
    @Override
    public String toString() {
        return String.format("< %s [%s | %s] >", this.getClass().getSimpleName(), Registry.field215.getKey(this.field22060.field35804), Registry.field216.getKey(this.field22061.field38832));
    }
    
    public static <T> Class5114 method16012(final Dynamic<T> dynamic) {
        return new Class5114(Class8530.method28614((com.mojang.datafixers.Dynamic<Object>)dynamic.get("feature").orElseEmptyMap()), Class9166.method33463((com.mojang.datafixers.Dynamic<Object>)dynamic.get("decorator").orElseEmptyMap()));
    }
}
