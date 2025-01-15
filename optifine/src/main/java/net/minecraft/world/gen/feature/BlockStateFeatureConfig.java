package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class BlockStateFeatureConfig implements IFeatureConfig
{
    public final BlockState field_227270_a_;

    public BlockStateFeatureConfig(BlockState p_i1978_1_)
    {
        this.field_227270_a_ = p_i1978_1_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("state"), BlockState.serialize(ops, this.field_227270_a_).getValue())));
    }

    public static <T> BlockStateFeatureConfig func_227271_a_(Dynamic<T> p_227271_0_)
    {
        BlockState blockstate = p_227271_0_.get("state").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
        return new BlockStateFeatureConfig(blockstate);
    }
}
