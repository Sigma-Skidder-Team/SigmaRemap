// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class9330
{
    private final int field40048;
    private final int field40049;
    private final int field40050;
    private final int field40051;
    private final Class261 field40052;
    
    public Class9330(final int field40048, final int field40049, final int field40050, final int field40051, final Class261 field40052) {
        this.field40048 = field40048;
        this.field40049 = field40049;
        this.field40050 = field40050;
        this.field40051 = field40051;
        this.field40052 = field40052;
    }
    
    public int method34564() {
        return this.field40048;
    }
    
    public int method34565() {
        return this.field40049;
    }
    
    public int method34566() {
        return this.field40050;
    }
    
    public <T> Dynamic<T> method34567(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("source_x"), dynamicOps.createInt(this.field40048)).put(dynamicOps.createString("source_ground_y"), dynamicOps.createInt(this.field40049)).put(dynamicOps.createString("source_z"), dynamicOps.createInt(this.field40050)).put(dynamicOps.createString("delta_y"), dynamicOps.createInt(this.field40051)).put(dynamicOps.createString("dest_proj"), dynamicOps.createString(this.field40052.method898()));
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }
    
    public static <T> Class9330 method34568(final Dynamic<T> dynamic) {
        return new Class9330(dynamic.get("source_x").asInt(0), dynamic.get("source_ground_y").asInt(0), dynamic.get("source_z").asInt(0), dynamic.get("delta_y").asInt(0), Class261.method899(dynamic.get("dest_proj").asString("")));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class9330 class9330 = (Class9330)o;
            return this.field40048 == class9330.field40048 && this.field40050 == class9330.field40050 && this.field40051 == class9330.field40051 && this.field40052 == class9330.field40052;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * this.field40048 + this.field40049) + this.field40050) + this.field40051) + this.field40052.hashCode();
    }
    
    @Override
    public String toString() {
        return "JigsawJunction{sourceX=" + this.field40048 + ", sourceGroundY=" + this.field40049 + ", sourceZ=" + this.field40050 + ", deltaY=" + this.field40051 + ", destProjection=" + this.field40052 + '}';
    }
}
