package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

public class HugeTreeFeatureConfig extends BaseTreeFeatureConfig
{
    public final int field_227275_a_;
    public final int field_227276_b_;

    protected HugeTreeFeatureConfig(BlockStateProvider p_i1970_1_, BlockStateProvider p_i1970_2_, List<TreeDecorator> p_i1970_3_, int p_i1970_4_, int p_i1970_5_, int p_i1970_6_)
    {
        super(p_i1970_1_, p_i1970_2_, p_i1970_3_, p_i1970_4_);
        this.field_227275_a_ = p_i1970_5_;
        this.field_227276_b_ = p_i1970_6_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        Dynamic<T> dynamic = new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("height_interval"), ops.createInt(this.field_227275_a_), ops.createString("crown_height"), ops.createInt(this.field_227276_b_))));
        return dynamic.merge(super.serialize(ops));
    }

    public static <T> HugeTreeFeatureConfig func_227277_a_(Dynamic<T> p_227277_0_)
    {
        BaseTreeFeatureConfig basetreefeatureconfig = BaseTreeFeatureConfig.deserialize(p_227277_0_);
        return new HugeTreeFeatureConfig(basetreefeatureconfig.trunkProvider, basetreefeatureconfig.leavesProvider, basetreefeatureconfig.decorators, basetreefeatureconfig.baseHeight, p_227277_0_.get("height_interval").asInt(0), p_227277_0_.get("crown_height").asInt(0));
    }

    public static class Builder extends BaseTreeFeatureConfig.Builder
    {
        private List<TreeDecorator> field_227278_c_ = ImmutableList.of();
        private int field_227279_d_;
        private int field_227280_e_;
        private int field_227281_f_;

        public Builder(BlockStateProvider p_i1509_1_, BlockStateProvider p_i1509_2_)
        {
            super(p_i1509_1_, p_i1509_2_);
        }

        public HugeTreeFeatureConfig.Builder func_227282_a_(List<TreeDecorator> p_227282_1_)
        {
            this.field_227278_c_ = p_227282_1_;
            return this;
        }

        public HugeTreeFeatureConfig.Builder baseHeight(int baseHeightIn)
        {
            this.field_227279_d_ = baseHeightIn;
            return this;
        }

        public HugeTreeFeatureConfig.Builder func_227283_b_(int p_227283_1_)
        {
            this.field_227280_e_ = p_227283_1_;
            return this;
        }

        public HugeTreeFeatureConfig.Builder func_227284_c_(int p_227284_1_)
        {
            this.field_227281_f_ = p_227284_1_;
            return this;
        }

        public HugeTreeFeatureConfig build()
        {
            return new HugeTreeFeatureConfig(this.trunkProvider, this.leavesProvider, this.field_227278_c_, this.field_227279_d_, this.field_227280_e_, this.field_227281_f_);
        }
    }
}
