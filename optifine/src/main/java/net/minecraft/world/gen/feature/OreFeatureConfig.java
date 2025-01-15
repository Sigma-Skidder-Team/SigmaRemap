package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;

public class OreFeatureConfig implements IFeatureConfig
{
    public final OreFeatureConfig.FillerBlockType target;
    public final int size;
    public final BlockState state;

    public OreFeatureConfig(OreFeatureConfig.FillerBlockType p_i3030_1_, BlockState p_i3030_2_, int p_i3030_3_)
    {
        this.size = p_i3030_3_;
        this.state = p_i3030_2_;
        this.target = p_i3030_1_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("size"), ops.createInt(this.size), ops.createString("target"), ops.createString(this.target.func_214737_a()), ops.createString("state"), BlockState.serialize(ops, this.state).getValue())));
    }

    public static OreFeatureConfig deserialize(Dynamic<?> p_214641_0_)
    {
        int i = p_214641_0_.get("size").asInt(0);
        OreFeatureConfig.FillerBlockType orefeatureconfig$fillerblocktype = OreFeatureConfig.FillerBlockType.func_214736_a(p_214641_0_.get("target").asString(""));
        BlockState blockstate = p_214641_0_.get("state").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
        return new OreFeatureConfig(orefeatureconfig$fillerblocktype, blockstate, i);
    }

    public static enum FillerBlockType
    {
        NATURAL_STONE("natural_stone", (p_214739_0_) -> {
            if (p_214739_0_ == null)
            {
                return false;
            }
            else {
                Block block = p_214739_0_.getBlock();
                return block == Blocks.STONE || block == Blocks.GRANITE || block == Blocks.DIORITE || block == Blocks.ANDESITE;
            }
        }),
        NETHERRACK("netherrack", new BlockMatcher(Blocks.NETHERRACK));

        private static final Map<String, OreFeatureConfig.FillerBlockType> field_214741_c = Arrays.stream(values()).collect(Collectors.toMap(OreFeatureConfig.FillerBlockType::func_214737_a, (p_214740_0_) -> {
            return p_214740_0_;
        }));
        private final String field_214742_d;
        private final Predicate<BlockState> field_214743_e;

        private FillerBlockType(String p_i3187_3_, Predicate<BlockState> p_i3187_4_)
        {
            this.field_214742_d = p_i3187_3_;
            this.field_214743_e = p_i3187_4_;
        }

        public String func_214737_a()
        {
            return this.field_214742_d;
        }

        public static OreFeatureConfig.FillerBlockType func_214736_a(String p_214736_0_)
        {
            return field_214741_c.get(p_214736_0_);
        }

        public Predicate<BlockState> func_214738_b()
        {
            return this.field_214743_e;
        }
    }
}
