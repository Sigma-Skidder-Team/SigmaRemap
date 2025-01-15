// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class358 extends Class357
{
    private final Class8841<Class7096> field2185;
    
    private Class358(final Class8841<Class7096> field2185) {
        super(Class8804.field37005);
        this.field2185 = field2185;
    }
    
    public Class358() {
        this(new Class8841<Class7096>());
    }
    
    public <T> Class358(final Dynamic<T> dynamic) {
        this(new Class8841<Class7096>((Dynamic<T>)dynamic.get("entries").orElseEmptyList(), Class7096::method21764));
    }
    
    public Class358 method1165(final Class7096 class7096, final int n) {
        this.field2185.method30872(class7096, n);
        return this;
    }
    
    @Override
    public Class7096 method1164(final Random random, final BlockPos class354) {
        return this.field2185.method30877(random);
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Class90.field218.method503(this.field2184).toString())).put(dynamicOps.createString("entries"), this.field2185.method30871((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, class7097 -> Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2, class7097)));
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
}
