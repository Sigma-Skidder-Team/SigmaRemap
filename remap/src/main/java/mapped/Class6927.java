// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6927 implements Class6926
{
    public final int field27146;
    
    public Class6927(final int field27146) {
        this.field27146 = field27146;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field27146))));
    }
    
    public static Class6927 method21301(final Dynamic<?> dynamic) {
        return new Class6927(dynamic.get("count").asInt(0));
    }
}
