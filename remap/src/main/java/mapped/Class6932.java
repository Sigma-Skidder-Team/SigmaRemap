// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6932 implements Class6926
{
    public final int field27158;
    public final int field27159;
    
    public Class6932(final int field27158, final int field27159) {
        this.field27158 = field27158;
        this.field27159 = field27159;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("min"), dynamicOps.createInt(this.field27158), dynamicOps.createString("max"), dynamicOps.createInt(this.field27159))));
    }
    
    public static Class6932 method21306(final Dynamic<?> dynamic) {
        return new Class6932(dynamic.get("min").asInt(0), dynamic.get("max").asInt(0));
    }
}
