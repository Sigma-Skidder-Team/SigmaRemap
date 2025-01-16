// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;

public class Class5131 implements Class5113
{
    public final Class7099 field22100;
    public final boolean field22101;
    public final int field22102;
    public final int field22103;
    public final Set<Block> field22104;
    
    public Class5131(final Class7099 field22100, final boolean field22101, final int field22102, final int field22103, final Set<Block> field22104) {
        this.field22100 = field22100;
        this.field22101 = field22101;
        this.field22102 = field22102;
        this.field22103 = field22103;
        this.field22104 = field22104;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("state"), Class7099.method21796((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps, this.field22100).getValue(), dynamicOps.createString("requires_block_below"), dynamicOps.createBoolean(this.field22101), dynamicOps.createString("rock_count"), dynamicOps.createInt(this.field22102), dynamicOps.createString("hole_count"), dynamicOps.createInt(this.field22103), dynamicOps.createString("valid_blocks"), dynamicOps.createList((Stream)this.field22104.stream().map((Function<? super Object, ?>) Registry.BLOCK::getKey).map((Function<? super Object, ?>) ResourceLocation::toString).map((Function<? super Object, ?>)dynamicOps::createString)))));
    }
    
    public static <T> Class5131 method16039(final Dynamic<T> dynamic) {
        return new Class5131(dynamic.get("state").map((Function)Class7099::method21797).orElse(Class7558.field29974.method22148()), dynamic.get("requires_block_below").asBoolean(true), dynamic.get("rock_count").asInt(4), dynamic.get("hole_count").asInt(1), (Set<Block>)ImmutableSet.copyOf((Collection)dynamic.get("valid_blocks").asList(dynamic2 -> Registry.BLOCK.getOrDefault(new ResourceLocation(dynamic2.asString("minecraft:air"))))));
    }
}
