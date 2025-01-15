package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class LiquidsConfig implements IFeatureConfig
{
    public final IFluidState state;
    public final boolean field_227363_b_;
    public final int field_227364_c_;
    public final int field_227365_d_;
    public final Set<Block> field_227366_f_;

    public LiquidsConfig(IFluidState p_i2262_1_, boolean p_i2262_2_, int p_i2262_3_, int p_i2262_4_, Set<Block> p_i2262_5_)
    {
        this.state = p_i2262_1_;
        this.field_227363_b_ = p_i2262_2_;
        this.field_227364_c_ = p_i2262_3_;
        this.field_227365_d_ = p_i2262_4_;
        this.field_227366_f_ = p_i2262_5_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("state"), IFluidState.serialize(ops, this.state).getValue(), ops.createString("requires_block_below"), ops.createBoolean(this.field_227363_b_), ops.createString("rock_count"), ops.createInt(this.field_227364_c_), ops.createString("hole_count"), ops.createInt(this.field_227365_d_), ops.createString("valid_blocks"), ops.createList(this.field_227366_f_.stream().map(Registry.BLOCK::getKey).map(ResourceLocation::toString).map(ops::createString)))));
    }

    public static <T> LiquidsConfig deserialize(Dynamic<T> p_214677_0_)
    {
        return new LiquidsConfig(p_214677_0_.get("state").map(IFluidState::deserialize).orElse(Fluids.EMPTY.getDefaultState()), p_214677_0_.get("requires_block_below").asBoolean(true), p_214677_0_.get("rock_count").asInt(4), p_214677_0_.get("hole_count").asInt(1), ImmutableSet.copyOf(p_214677_0_.get("valid_blocks").asList((p_227367_0_) ->
        {
            return Registry.BLOCK.getOrDefault(new ResourceLocation(p_227367_0_.asString("minecraft:air")));
        })));
    }
}
