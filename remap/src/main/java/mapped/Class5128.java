// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;

public class Class5128 extends Class5127
{
    public final int field22084;
    public final int field22085;
    
    public Class5128(final Class357 class357, final Class357 class358, final List<Class367> list, final int n, final int field22084, final int field22085) {
        super(class357, class358, list, n);
        this.field22084 = field22084;
        this.field22085 = field22085;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("height_interval"), dynamicOps.createInt(this.field22084), dynamicOps.createString("crown_height"), dynamicOps.createInt(this.field22085)))).merge(super.method16010((DynamicOps<Object>)dynamicOps));
    }
    
    public static <T> Class5128 method16036(final Dynamic<T> dynamic) {
        final Class5127 method16033 = Class5127.method16033((com.mojang.datafixers.Dynamic<Object>)dynamic);
        return new Class5128(method16033.field22079, method16033.field22080, method16033.field22081, method16033.field22082, dynamic.get("height_interval").asInt(0), dynamic.get("crown_height").asInt(0));
    }
}
