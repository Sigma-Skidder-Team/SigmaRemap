// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6935 implements Class6926
{
    public final int field27165;
    public final float field27166;
    
    public Class6935(final int field27165, final float field27166) {
        this.field27165 = field27165;
        this.field27166 = field27166;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field27165), dynamicOps.createString("chance"), dynamicOps.createFloat(this.field27166))));
    }
    
    public static Class6935 method21309(final Dynamic<?> dynamic) {
        return new Class6935(dynamic.get("count").asInt(0), dynamic.get("chance").asFloat(0.0f));
    }
}
