// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class6218 extends Class6213
{
    private final Class7909<Class3833> field25068;
    
    public Class6218(final Class7909<Class3833> field25068) {
        this.field25068 = field25068;
    }
    
    public <T> Class6218(final Dynamic<T> dynamic) {
        this(Class7188.method22057().method18460(new Class1932(dynamic.get("tag").asString(""))));
    }
    
    @Override
    public boolean method18485(final BlockState class7096, final Random random) {
        return class7096.method21755(this.field25068);
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31701;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("tag"), dynamicOps.createString(this.field25068.method25621().toString()))));
    }
}
