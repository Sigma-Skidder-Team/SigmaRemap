// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6925 implements Class6926
{
    public final float field27141;
    public final int field27142;
    public final int field27143;
    public final int field27144;
    
    public Class6925(final float field27141, final int field27142, final int field27143, final int field27144) {
        this.field27141 = field27141;
        this.field27142 = field27142;
        this.field27143 = field27143;
        this.field27144 = field27144;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("chance"), dynamicOps.createFloat(this.field27141), dynamicOps.createString("bottom_offset"), dynamicOps.createInt(this.field27142), dynamicOps.createString("top_offset"), dynamicOps.createInt(this.field27143), dynamicOps.createString("top"), dynamicOps.createInt(this.field27144))));
    }
    
    public static Class6925 method21300(final Dynamic<?> dynamic) {
        return new Class6925(dynamic.get("chance").asFloat(0.0f), dynamic.get("bottom_offset").asInt(0), dynamic.get("top_offset").asInt(0), dynamic.get("top").asInt(0));
    }
}
