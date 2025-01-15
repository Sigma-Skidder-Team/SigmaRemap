// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class6931 implements Class6926
{
    public final int field27154;
    public final double field27155;
    public final double field27156;
    public final Class2020 field27157;
    
    public Class6931(final int field27154, final double field27155, final double field27156, final Class2020 field27157) {
        this.field27154 = field27154;
        this.field27155 = field27155;
        this.field27156 = field27156;
        this.field27157 = field27157;
    }
    
    @Override
    public <T> Dynamic<T> method21299(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("noise_to_count_ratio"), dynamicOps.createInt(this.field27154), dynamicOps.createString("noise_factor"), dynamicOps.createDouble(this.field27155), dynamicOps.createString("noise_offset"), dynamicOps.createDouble(this.field27156), dynamicOps.createString("heightmap"), dynamicOps.createString(this.field27157.method8060()))));
    }
    
    public static Class6931 method21305(final Dynamic<?> dynamic) {
        return new Class6931(dynamic.get("noise_to_count_ratio").asInt(10), dynamic.get("noise_factor").asDouble(80.0), dynamic.get("noise_offset").asDouble(0.0), Class2020.method8063(dynamic.get("heightmap").asString("OCEAN_FLOOR_WG")));
    }
}
