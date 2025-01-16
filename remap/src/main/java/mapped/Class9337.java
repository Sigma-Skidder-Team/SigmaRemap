// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class9337<FC extends Class5113>
{
    public final Class8530<FC, ?> field40094;
    public final float field40095;
    
    public Class9337(final Class8530<FC, ?> field40094, final float field40095) {
        this.field40094 = field40094;
        this.field40095 = field40095;
    }
    
    public <T> Dynamic<T> method34604(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("name"), dynamicOps.createString(Registry.field215.getKey((Class4535<?>)this.field40094.field35804).toString()), dynamicOps.createString("config"), this.field40094.field35805.method16010((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue(), dynamicOps.createString("chance"), dynamicOps.createFloat(this.field40095))));
    }
    
    public boolean method34605(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853) {
        return this.field40094.method28613(class1851, class1852, random, class1853);
    }
    
    public static <T> Class9337<?> method34606(final Dynamic<T> dynamic) {
        return Class8530.method28614((com.mojang.datafixers.Dynamic<Object>)dynamic).method28611(dynamic.get("chance").asFloat(0.0f));
    }
}
