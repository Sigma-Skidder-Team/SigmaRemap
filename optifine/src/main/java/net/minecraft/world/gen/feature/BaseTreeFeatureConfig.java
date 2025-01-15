package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

public class BaseTreeFeatureConfig implements IFeatureConfig
{
    public final BlockStateProvider trunkProvider;
    public final BlockStateProvider leavesProvider;
    public final List<TreeDecorator> decorators;
    public final int baseHeight;
    public transient boolean forcePlacement;

    protected BaseTreeFeatureConfig(BlockStateProvider p_i1872_1_, BlockStateProvider p_i1872_2_, List<TreeDecorator> p_i1872_3_, int p_i1872_4_)
    {
        this.trunkProvider = p_i1872_1_;
        this.leavesProvider = p_i1872_2_;
        this.decorators = p_i1872_3_;
        this.baseHeight = p_i1872_4_;
    }

    public void forcePlacement()
    {
        this.forcePlacement = true;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        ImmutableMap.Builder<T, T> builder = ImmutableMap.builder();
        builder.put(ops.createString("trunk_provider"), this.trunkProvider.serialize(ops)).put(ops.createString("leaves_provider"), this.leavesProvider.serialize(ops)).put(ops.createString("decorators"), ops.createList(this.decorators.stream().map((p_227375_1_) ->
        {
            return p_227375_1_.serialize(ops);
        }))).put(ops.createString("base_height"), ops.createInt(this.baseHeight));
        return new Dynamic<>(ops, ops.createMap(builder.build()));
    }

    public static <T> BaseTreeFeatureConfig deserialize(Dynamic<T> p_227376_0_)
    {
        BlockStateProviderType<?> blockstateprovidertype = Registry.BLOCK_STATE_PROVIDER_TYPE.getOrDefault(new ResourceLocation(p_227376_0_.get("trunk_provider").get("type").asString().orElseThrow(RuntimeException::new)));
        BlockStateProviderType<?> blockstateprovidertype1 = Registry.BLOCK_STATE_PROVIDER_TYPE.getOrDefault(new ResourceLocation(p_227376_0_.get("leaves_provider").get("type").asString().orElseThrow(RuntimeException::new)));
        return new BaseTreeFeatureConfig(blockstateprovidertype.func_227399_a_(p_227376_0_.get("trunk_provider").orElseEmptyMap()), blockstateprovidertype1.func_227399_a_(p_227376_0_.get("leaves_provider").orElseEmptyMap()), p_227376_0_.get("decorators").asList((p_227374_0_) ->
        {
            return Registry.TREE_DECORATOR_TYPE.getOrDefault(new ResourceLocation(p_227374_0_.get("type").asString().orElseThrow(RuntimeException::new))).func_227431_a_(p_227374_0_);
        }), p_227376_0_.get("base_height").asInt(0));
    }

    public static class Builder
    {
        public final BlockStateProvider trunkProvider;
        public final BlockStateProvider leavesProvider;
        private List<TreeDecorator> decorators = Lists.newArrayList();
        private int baseHeight = 0;

        public Builder(BlockStateProvider p_i1201_1_, BlockStateProvider p_i1201_2_)
        {
            this.trunkProvider = p_i1201_1_;
            this.leavesProvider = p_i1201_2_;
        }

        public BaseTreeFeatureConfig.Builder baseHeight(int baseHeightIn)
        {
            this.baseHeight = baseHeightIn;
            return this;
        }

        public BaseTreeFeatureConfig build()
        {
            return new BaseTreeFeatureConfig(this.trunkProvider, this.leavesProvider, this.decorators, this.baseHeight);
        }
    }
}
