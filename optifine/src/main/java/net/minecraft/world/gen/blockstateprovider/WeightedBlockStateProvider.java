package net.minecraft.world.gen.blockstateprovider;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import net.minecraft.block.BlockState;
import net.minecraft.util.WeightedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

public class WeightedBlockStateProvider extends BlockStateProvider
{
    private final WeightedList<BlockState> field_227406_b_;

    private WeightedBlockStateProvider(WeightedList<BlockState> p_i4068_1_)
    {
        super(BlockStateProviderType.WEIGHTED_STATE_PROVIDER);
        this.field_227406_b_ = p_i4068_1_;
    }

    public WeightedBlockStateProvider()
    {
        this(new WeightedList<>());
    }

    public <T> WeightedBlockStateProvider(Dynamic<T> p_i4069_1_)
    {
        this(new WeightedList<>(p_i4069_1_.get("entries").orElseEmptyList(), BlockState::deserialize));
    }

    public WeightedBlockStateProvider func_227407_a_(BlockState p_227407_1_, int p_227407_2_)
    {
        this.field_227406_b_.func_226313_a_(p_227407_1_, p_227407_2_);
        return this;
    }

    public BlockState getBlockState(Random p_225574_1_, BlockPos p_225574_2_)
    {
        return this.field_227406_b_.func_226318_b_(p_225574_1_);
    }

    public <T> T serialize(DynamicOps<T> p_218175_1_)
    {
        Builder<T, T> builder = ImmutableMap.builder();
        builder.put(p_218175_1_.createString("type"), p_218175_1_.createString(Registry.BLOCK_STATE_PROVIDER_TYPE.getKey(this.blockStateProvider).toString())).put(p_218175_1_.createString("entries"), this.field_227406_b_.func_226310_a_(p_218175_1_, (p_227408_1_) ->
        {
            return BlockState.serialize(p_218175_1_, p_227408_1_);
        }));
        return (new Dynamic<>(p_218175_1_, p_218175_1_.createMap(builder.build()))).getValue();
    }
}
