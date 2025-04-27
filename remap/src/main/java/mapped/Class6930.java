// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6930 implements Class6926
{
    public final double field27151;
    public final int field27152;
    public final int field27153;
    
    public Class6930(final double field27151, final int field27152, final int field27153) {
        this.field27151 = field27151;
        this.field27152 = field27152;
        this.field27153 = field27153;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("noise_level"), dynamicOps.createDouble(this.field27151), dynamicOps.createString("below_noise"), dynamicOps.createInt(this.field27152), dynamicOps.createString("above_noise"), dynamicOps.createInt(this.field27153))));
    }
    
    public static Class6930 method21304(final Dynamic<?> dynamic) {
        return new Class6930(dynamic.get("noise_level").asDouble(0.0), dynamic.get("below_noise").asInt(0), dynamic.get("above_noise").asInt(0));
    }
}
