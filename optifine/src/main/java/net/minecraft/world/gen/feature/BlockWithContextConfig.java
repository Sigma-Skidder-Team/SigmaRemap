package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class BlockWithContextConfig implements IFeatureConfig
{
    public final BlockState toPlace;
    public final List<BlockState> placeOn;
    public final List<BlockState> placeIn;
    public final List<BlockState> placeUnder;

    public BlockWithContextConfig(BlockState p_i1285_1_, List<BlockState> p_i1285_2_, List<BlockState> p_i1285_3_, List<BlockState> p_i1285_4_)
    {
        this.toPlace = p_i1285_1_;
        this.placeOn = p_i1285_2_;
        this.placeIn = p_i1285_3_;
        this.placeUnder = p_i1285_4_;
    }

    public BlockWithContextConfig(BlockState p_i1286_1_, BlockState[] p_i1286_2_, BlockState[] p_i1286_3_, BlockState[] p_i1286_4_)
    {
        this(p_i1286_1_, Lists.newArrayList(p_i1286_2_), Lists.newArrayList(p_i1286_3_), Lists.newArrayList(p_i1286_4_));
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        T t = BlockState.serialize(ops, this.toPlace).getValue();
        T t1 = ops.createList(this.placeOn.stream().map((p_214662_1_) ->
        {
            return BlockState.serialize(ops, p_214662_1_).getValue();
        }));
        T t2 = ops.createList(this.placeIn.stream().map((p_214661_1_) ->
        {
            return BlockState.serialize(ops, p_214661_1_).getValue();
        }));
        T t3 = ops.createList(this.placeUnder.stream().map((p_214660_1_) ->
        {
            return BlockState.serialize(ops, p_214660_1_).getValue();
        }));
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("to_place"), t, ops.createString("place_on"), t1, ops.createString("place_in"), t2, ops.createString("place_under"), t3)));
    }

    public static <T> BlockWithContextConfig deserialize(Dynamic<T> p_214663_0_)
    {
        BlockState blockstate = p_214663_0_.get("to_place").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
        List<BlockState> list = p_214663_0_.get("place_on").asList(BlockState::deserialize);
        List<BlockState> list1 = p_214663_0_.get("place_in").asList(BlockState::deserialize);
        List<BlockState> list2 = p_214663_0_.get("place_under").asList(BlockState::deserialize);
        return new BlockWithContextConfig(blockstate, list, list1, list2);
    }
}
