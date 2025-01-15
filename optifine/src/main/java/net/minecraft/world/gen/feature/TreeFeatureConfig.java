package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

public class TreeFeatureConfig extends BaseTreeFeatureConfig
{
    public final FoliagePlacer foliagePlacer;
    public final int heightRandA;
    public final int heightRandB;
    public final int trunkHeight;
    public final int trunkHeightRandom;
    public final int trunkTopOffset;
    public final int trunkTopOffsetRandom;
    public final int foliageHeight;
    public final int foliageHeightRandom;
    public final int maxWaterDepth;
    public final boolean ignoreVines;

    protected TreeFeatureConfig(BlockStateProvider p_i1433_1_, BlockStateProvider p_i1433_2_, FoliagePlacer p_i1433_3_, List<TreeDecorator> p_i1433_4_, int p_i1433_5_, int p_i1433_6_, int p_i1433_7_, int p_i1433_8_, int p_i1433_9_, int p_i1433_10_, int p_i1433_11_, int p_i1433_12_, int p_i1433_13_, int p_i1433_14_, boolean p_i1433_15_)
    {
        super(p_i1433_1_, p_i1433_2_, p_i1433_4_, p_i1433_5_);
        this.foliagePlacer = p_i1433_3_;
        this.heightRandA = p_i1433_6_;
        this.heightRandB = p_i1433_7_;
        this.trunkHeight = p_i1433_8_;
        this.trunkHeightRandom = p_i1433_9_;
        this.trunkTopOffset = p_i1433_10_;
        this.trunkTopOffsetRandom = p_i1433_11_;
        this.foliageHeight = p_i1433_12_;
        this.foliageHeightRandom = p_i1433_13_;
        this.maxWaterDepth = p_i1433_14_;
        this.ignoreVines = p_i1433_15_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        ImmutableMap.Builder<T, T> builder = ImmutableMap.builder();
        builder.put(ops.createString("foliage_placer"), this.foliagePlacer.serialize(ops)).put(ops.createString("height_rand_a"), ops.createInt(this.heightRandA)).put(ops.createString("height_rand_b"), ops.createInt(this.heightRandB)).put(ops.createString("trunk_height"), ops.createInt(this.trunkHeight)).put(ops.createString("trunk_height_random"), ops.createInt(this.trunkHeightRandom)).put(ops.createString("trunk_top_offset"), ops.createInt(this.trunkTopOffset)).put(ops.createString("trunk_top_offset_random"), ops.createInt(this.trunkTopOffsetRandom)).put(ops.createString("foliage_height"), ops.createInt(this.foliageHeight)).put(ops.createString("foliage_height_random"), ops.createInt(this.foliageHeightRandom)).put(ops.createString("max_water_depth"), ops.createInt(this.maxWaterDepth)).put(ops.createString("ignore_vines"), ops.createBoolean(this.ignoreVines));
        Dynamic<T> dynamic = new Dynamic<>(ops, ops.createMap(builder.build()));
        return dynamic.merge(super.serialize(ops));
    }

    public static <T> TreeFeatureConfig func_227338_a_(Dynamic<T> dynamic)
    {
        BaseTreeFeatureConfig basetreefeatureconfig = BaseTreeFeatureConfig.deserialize(dynamic);
        FoliagePlacerType<?> foliageplacertype = Registry.FOLIAGE_PLACER_TYPE.getOrDefault(new ResourceLocation(dynamic.get("foliage_placer").get("type").asString().orElseThrow(RuntimeException::new)));
        return new TreeFeatureConfig(basetreefeatureconfig.trunkProvider, basetreefeatureconfig.leavesProvider, foliageplacertype.func_227391_a_(dynamic.get("foliage_placer").orElseEmptyMap()), basetreefeatureconfig.decorators, basetreefeatureconfig.baseHeight, dynamic.get("height_rand_a").asInt(0), dynamic.get("height_rand_b").asInt(0), dynamic.get("trunk_height").asInt(-1), dynamic.get("trunk_height_random").asInt(0), dynamic.get("trunk_top_offset").asInt(0), dynamic.get("trunk_top_offset_random").asInt(0), dynamic.get("foliage_height").asInt(-1), dynamic.get("foliage_height_random").asInt(0), dynamic.get("max_water_depth").asInt(0), dynamic.get("ignore_vines").asBoolean(false));
    }

    public static class Builder extends BaseTreeFeatureConfig.Builder
    {
        private final FoliagePlacer foliagePlacer;
        private List<TreeDecorator> decorators = ImmutableList.of();
        private int baseHeight;
        private int heightRandA;
        private int heightRandB;
        private int trunkHeight = -1;
        private int trunkHeightRandom;
        private int trunkTopOffset;
        private int trunkTopOffsetRandom;
        private int foliageHeight = -1;
        private int foliageHeightRandom;
        private int maxWaterDepth;
        private boolean ignoreVines;

        public Builder(BlockStateProvider p_i1346_1_, BlockStateProvider p_i1346_2_, FoliagePlacer p_i1346_3_)
        {
            super(p_i1346_1_, p_i1346_2_);
            this.foliagePlacer = p_i1346_3_;
        }

        public TreeFeatureConfig.Builder decorators(List<TreeDecorator> decoratorsIn)
        {
            this.decorators = decoratorsIn;
            return this;
        }

        public TreeFeatureConfig.Builder baseHeight(int baseHeightIn)
        {
            this.baseHeight = baseHeightIn;
            return this;
        }

        public TreeFeatureConfig.Builder heightRandA(int heightRandAIn)
        {
            this.heightRandA = heightRandAIn;
            return this;
        }

        public TreeFeatureConfig.Builder heightRandB(int heightRandBIn)
        {
            this.heightRandB = heightRandBIn;
            return this;
        }

        public TreeFeatureConfig.Builder trunkHeight(int trunkHeightIn)
        {
            this.trunkHeight = trunkHeightIn;
            return this;
        }

        public TreeFeatureConfig.Builder trunkHeightRandom(int trunkHeightRandomIn)
        {
            this.trunkHeightRandom = trunkHeightRandomIn;
            return this;
        }

        public TreeFeatureConfig.Builder trunkTopOffset(int trunkTopOffsetIn)
        {
            this.trunkTopOffset = trunkTopOffsetIn;
            return this;
        }

        public TreeFeatureConfig.Builder trunkTopOffsetRandom(int trunkTopOffsetRandomIn)
        {
            this.trunkTopOffsetRandom = trunkTopOffsetRandomIn;
            return this;
        }

        public TreeFeatureConfig.Builder foliageHeight(int foliageHeightIn)
        {
            this.foliageHeight = foliageHeightIn;
            return this;
        }

        public TreeFeatureConfig.Builder foliageHeightRandom(int foliageHeightRandomIn)
        {
            this.foliageHeightRandom = foliageHeightRandomIn;
            return this;
        }

        public TreeFeatureConfig.Builder maxWaterDepth(int maxWaterDepthIn)
        {
            this.maxWaterDepth = maxWaterDepthIn;
            return this;
        }

        public TreeFeatureConfig.Builder ignoreVines()
        {
            this.ignoreVines = true;
            return this;
        }

        public TreeFeatureConfig build()
        {
            return new TreeFeatureConfig(this.trunkProvider, this.leavesProvider, this.foliagePlacer, this.decorators, this.baseHeight, this.heightRandA, this.heightRandB, this.trunkHeight, this.trunkHeightRandom, this.trunkTopOffset, this.trunkTopOffsetRandom, this.foliageHeight, this.foliageHeightRandom, this.maxWaterDepth, this.ignoreVines);
        }
    }
}
