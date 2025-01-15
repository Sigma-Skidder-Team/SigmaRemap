// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6928 implements Class6926
{
    public final int field27147;
    
    public Class6928(final int field27147) {
        this.field27147 = field27147;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("chance"), dynamicOps.createInt(this.field27147))));
    }
    
    public static Class6928 method21302(final Dynamic<?> dynamic) {
        return new Class6928(dynamic.get("chance").asInt(0));
    }
}
