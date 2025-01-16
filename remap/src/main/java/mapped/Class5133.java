// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5133 implements Class5113
{
    public final Class2066 field22107;
    public final int field22108;
    public final BlockState field22109;
    
    public Class5133(final Class2066 field22107, final BlockState field22108, final int field22109) {
        this.field22108 = field22109;
        this.field22109 = field22108;
        this.field22107 = field22107;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("size"), dynamicOps.createInt(this.field22108), dynamicOps.createString("target"), dynamicOps.createString(this.field22107.method8156()), dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22109).getValue())));
    }
    
    public static Class5133 method16042(final Dynamic<?> dynamic) {
        return new Class5133(Class2066.method8157(dynamic.get("target").asString("")), dynamic.get("state").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()), dynamic.get("size").asInt(0));
    }
}
