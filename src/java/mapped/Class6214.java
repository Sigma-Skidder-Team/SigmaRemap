// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class6214 extends Class6213
{
    private final Class7096 field25062;
    
    public Class6214(final Class7096 field25062) {
        this.field25062 = field25062;
    }
    
    public <T> Class6214(final Dynamic<T> dynamic) {
        this(Class7096.method21764((com.mojang.datafixers.Dynamic<Object>)dynamic.get("blockstate").orElseEmptyMap()));
    }
    
    @Override
    public boolean method18485(final Class7096 class7096, final Random random) {
        return class7096 == this.field25062;
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31700;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("blockstate"), Class7096.method21763((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field25062).getValue())));
    }
}
