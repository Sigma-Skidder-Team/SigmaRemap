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
    private final Block field25067;
    
    public Class6217(final Block field25067) {
        this.field25067 = field25067;
    }
    
    public <T> Class6217(final Dynamic<T> dynamic) {
        this(Registry.BLOCK.getOrDefault(new ResourceLocation(dynamic.get("block").asString(""))));
    }
    
    @Override
    public boolean method18485(final BlockState class7096, final Random random) {
        return class7096.getBlock() == this.field25067;
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31699;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("block"), dynamicOps.createString(Registry.BLOCK.getKey(this.field25067).toString()))));
    }
}
