// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;

import java.util.stream.Collectors;
import java.util.function.Function;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import java.util.stream.Stream;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;

public class Class5144 implements Class5113
{
    public final Class357 field22133;
    public final Class373 field22134;
    public final Set<Block> field22135;
    public final Set<BlockState> field22136;
    public final int field22137;
    public final int field22138;
    public final int field22139;
    public final int field22140;
    public final boolean field22141;
    public final boolean field22142;
    public final boolean field22143;
    
    private Class5144(final Class357 field22133, final Class373 field22134, final Set<Block> field22135, final Set<BlockState> field22136, final int field22137, final int field22138, final int field22139, final int field22140, final boolean field22141, final boolean field22142, final boolean field22143) {
        this.field22133 = field22133;
        this.field22134 = field22134;
        this.field22135 = field22135;
        this.field22136 = field22136;
        this.field22137 = field22137;
        this.field22138 = field22138;
        this.field22139 = field22139;
        this.field22140 = field22140;
        this.field22141 = field22141;
        this.field22142 = field22142;
        this.field22143 = field22143;
    }
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("state_provider"), this.field22133.serialize(dynamicOps)).put(dynamicOps.createString("block_placer"), this.field22134.serialize(dynamicOps)).put(dynamicOps.createString("whitelist"), dynamicOps.createList((Stream)this.field22135.stream().map(class3833 -> BlockState.serialize(dynamicOps2, class3833.getDefaultState()).getValue()))).put(dynamicOps.createString("blacklist"), dynamicOps.createList((Stream)this.field22136.stream().map(class3834 -> BlockState.serialize(dynamicOps3, class3834).getValue()))).put(dynamicOps.createString("tries"), dynamicOps.createInt(this.field22137)).put(dynamicOps.createString("xspread"), dynamicOps.createInt(this.field22138)).put(dynamicOps.createString("yspread"), dynamicOps.createInt(this.field22139)).put(dynamicOps.createString("zspread"), dynamicOps.createInt(this.field22140)).put(dynamicOps.createString("can_replace"), dynamicOps.createBoolean(this.field22141)).put(dynamicOps.createString("project"), dynamicOps.createBoolean(this.field22142)).put(dynamicOps.createString("need_water"), dynamicOps.createBoolean(this.field22143));
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder.build()));
    }
    
    public static <T> Class5144 method16063(final Dynamic<T> dynamic) {
        return new Class5144(Registry.field218.getOrDefault(new ResourceLocation(dynamic.get("state_provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718(dynamic.get("state_provider").orElseEmptyMap()), Registry.field219.getOrDefault(new ResourceLocation(dynamic.get("block_placer").get("type").asString().orElseThrow(RuntimeException::new))).method27915(dynamic.get("block_placer").orElseEmptyMap()), (Set<Block>)dynamic.get("whitelist").asList((Function) BlockState::deserialize).stream().map(BlockState::getBlock).collect(Collectors.toSet()), Sets.newHashSet(dynamic.get("blacklist").asList((Function) BlockState::deserialize)), dynamic.get("tries").asInt(128), dynamic.get("xspread").asInt(7), dynamic.get("yspread").asInt(3), dynamic.get("zspread").asInt(7), dynamic.get("can_replace").asBoolean(false), dynamic.get("project").asBoolean(true), dynamic.get("need_water").asBoolean(false));
    }
}
