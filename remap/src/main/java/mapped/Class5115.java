// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5115 implements Class5113
{
    public final ResourceLocation field22062;
    public final int field22063;
    
    public Class5115(final String s, final int field22063) {
        this.field22062 = new ResourceLocation(s);
        this.field22063 = field22063;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("start_pool"), dynamicOps.createString(this.field22062.toString()), dynamicOps.createString("size"), dynamicOps.createInt(this.field22063))));
    }
    
    public static <T> Class5115 method16013(final Dynamic<T> dynamic) {
        return new Class5115(dynamic.get("start_pool").asString(""), dynamic.get("size").asInt(6));
    }
}
