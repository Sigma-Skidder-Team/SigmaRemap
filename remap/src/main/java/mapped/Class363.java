// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Objects;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;

public final class Class363 implements IDynamicSerializable
{
    private final Class383 field2191;
    private final BlockPos field2192;
    
    private Class363(final Class383 field2191, final BlockPos field2192) {
        this.field2191 = field2191;
        this.field2192 = field2192;
    }
    
    public static Class363 method1167(final Class383 class383, final BlockPos class384) {
        return new Class363(class383, class384);
    }
    
    public static Class363 method1168(final Dynamic<?> dynamic) {
        return dynamic.get("dimension").map((Function)Class383::method1268).flatMap(p1 -> dynamic2.get("pos").map((Function) BlockPos::method1122).map(class384 -> new Class363(class383, class384))).orElseThrow(() -> new IllegalArgumentException("Could not parse GlobalPos"));
    }
    
    public Class383 method1169() {
        return this.field2191;
    }
    
    public BlockPos method1170() {
        return this.field2192;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class363 class363 = (Class363)o;
            return Objects.equals(this.field2191, class363.field2191) && Objects.equals(this.field2192, class363.field2192);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field2191, this.field2192);
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("dimension"), this.field2191.method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps), dynamicOps.createString("pos"), this.field2192.method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)));
    }
    
    @Override
    public String toString() {
        return this.field2191.toString() + " " + this.field2192;
    }
}
