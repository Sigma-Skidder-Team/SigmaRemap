// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class6216 extends Class6213
{
    private final BlockState field25065;
    private final float field25066;
    
    public Class6216(final BlockState field25065, final float field25066) {
        this.field25065 = field25065;
        this.field25066 = field25066;
    }
    
    public <T> Class6216(final Dynamic<T> dynamic) {
        this(BlockState.deserialize((com.mojang.datafixers.Dynamic<Object>)dynamic.get("blockstate").orElseEmptyMap()), dynamic.get("probability").asFloat(1.0f));
    }
    
    @Override
    public boolean method18485(final BlockState class7096, final Random random) {
        return class7096 == this.field25065 && random.nextFloat() < this.field25066;
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31703;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("blockstate"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field25065).getValue(), dynamicOps.createString("probability"), dynamicOps.createFloat(this.field25066))));
    }
}
