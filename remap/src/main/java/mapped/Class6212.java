// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class6212 extends Class6213
{
    private final Block field25060;
    private final float field25061;
    
    public Class6212(final Block field25060, final float field25061) {
        this.field25060 = field25060;
        this.field25061 = field25061;
    }
    
    public <T> Class6212(final Dynamic<T> dynamic) {
        this(Registry.BLOCK.getOrDefault(new ResourceLocation(dynamic.get("block").asString(""))), dynamic.get("probability").asFloat(1.0f));
    }
    
    @Override
    public boolean method18485(final BlockState class7096, final Random random) {
        return class7096.getBlock() == this.field25060 && random.nextFloat() < this.field25061;
    }
    
    @Override
    public Class7757 method18486() {
        return Class7757.field31702;
    }
    
    @Override
    public <T> Dynamic<T> method18487(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("block"), dynamicOps.createString(Registry.BLOCK.getKey(this.field25060).toString()), dynamicOps.createString("probability"), dynamicOps.createFloat(this.field25061))));
    }
}
