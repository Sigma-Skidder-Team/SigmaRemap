package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;

public class MultipleRandomFeatureConfig implements IFeatureConfig
{
    public final List < ConfiguredRandomFeatureList<? >> features;
    public final ConfiguredFeature <? , ? > defaultFeature;

    public MultipleRandomFeatureConfig(List < ConfiguredRandomFeatureList<? >> p_i779_1_, ConfiguredFeature <? , ? > p_i779_2_)
    {
        this.features = p_i779_1_;
        this.defaultFeature = p_i779_2_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        T t = ops.createList(this.features.stream().map((p_227288_1_) ->
        {
            return p_227288_1_.serialize(ops).getValue();
        }));
        T t1 = this.defaultFeature.serialize(ops).getValue();
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("features"), t, ops.createString("default"), t1)));
    }

    public static <T> MultipleRandomFeatureConfig deserialize(Dynamic<T> p_214648_0_)
    {
        List < ConfiguredRandomFeatureList<? >> list = p_214648_0_.get("features").asList(ConfiguredRandomFeatureList::func_214840_a);
        ConfiguredFeature <? , ? > configuredfeature = ConfiguredFeature.deserialize(p_214648_0_.get("default").orElseEmptyMap());
        return new MultipleRandomFeatureConfig(list, configuredfeature);
    }
}
