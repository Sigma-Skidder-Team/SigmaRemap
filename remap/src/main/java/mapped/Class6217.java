// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class6217 extends Class6213
{
    private final Class3833 field25067;
    
    public Class6217(final Class3833 field25067) {
        this.field25067 = field25067;
    }
    
    public <T> Class6217(final Dynamic<T> dynamic) {
        this(Class90.field208.method505(new Class1932(dynamic.get("block").asString(""))));
    }
    
    @Override
    public boolean method18485(final Class7096 class7096, final Random random) {
        return class7096.method21696() == this.field25067;
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31699;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("block"), dynamicOps.createString(Class90.field208.method503(this.field25067).toString()))));
    }
}
