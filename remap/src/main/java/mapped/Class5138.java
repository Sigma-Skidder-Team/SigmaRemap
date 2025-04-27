// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;

public class Class5138 implements Class5113
{
    public final BlockState field22119;
    public final int field22120;
    public final int field22121;
    public final List<BlockState> field22122;
    
    public Class5138(final BlockState field22119, final int field22120, final int field22121, final List<BlockState> field22122) {
        this.field22119 = field22119;
        this.field22120 = field22120;
        this.field22121 = field22121;
        this.field22122 = field22122;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("state"), BlockState.serialize((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22119).getValue(), dynamicOps.createString("radius"), dynamicOps.createInt(this.field22120), dynamicOps.createString("y_size"), dynamicOps.createInt(this.field22121), dynamicOps.createString("targets"), dynamicOps.createList((Stream)this.field22122.stream().map(class7096 -> BlockState.serialize(dynamicOps2, class7096).getValue())))));
    }
    
    public static <T> Class5138 method16051(final Dynamic<T> dynamic) {
        return new Class5138(dynamic.get("state").map((Function) BlockState::deserialize).orElse(Blocks.AIR.getDefaultState()), dynamic.get("radius").asInt(0), dynamic.get("y_size").asInt(0), dynamic.get("targets").asList((Function) BlockState::deserialize));
    }
}
