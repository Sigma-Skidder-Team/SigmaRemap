// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6934 implements Class6926
{
    public final int field27162;
    public final float field27163;
    public final int field27164;
    
    public Class6934(final int field27162, final float field27163, final int field27164) {
        this.field27162 = field27162;
        this.field27163 = field27163;
        this.field27164 = field27164;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("count"), dynamicOps.createInt(this.field27162), dynamicOps.createString("extra_chance"), dynamicOps.createFloat(this.field27163), dynamicOps.createString("extra_count"), dynamicOps.createInt(this.field27164))));
    }
    
    public static Class6934 method21308(final Dynamic<?> dynamic) {
        return new Class6934(dynamic.get("count").asInt(0), dynamic.get("extra_chance").asFloat(0.0f), dynamic.get("extra_count").asInt(0));
    }
}
