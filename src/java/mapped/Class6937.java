// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6937 implements Class6926
{
    public final int field27168;
    public final int field27169;
    public final int field27170;
    public final int field27171;
    
    public Class6937(final int field27168, final int field27169, final int field27170, final int field27171) {
        this.field27168 = field27168;
        this.field27169 = field27169;
        this.field27170 = field27170;
        this.field27171 = field27171;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field27168), dynamicOps.createString("bottom_offset"), dynamicOps.createInt(this.field27169), dynamicOps.createString("top_offset"), dynamicOps.createInt(this.field27170), dynamicOps.createString("maximum"), dynamicOps.createInt(this.field27171))));
    }
    
    public static Class6937 method21311(final Dynamic<?> dynamic) {
        return new Class6937(dynamic.get("count").asInt(0), dynamic.get("bottom_offset").asInt(0), dynamic.get("top_offset").asInt(0), dynamic.get("maximum").asInt(0));
    }
}
