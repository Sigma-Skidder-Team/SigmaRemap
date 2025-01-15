package net.minecraft.world.gen.placement;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class CountConfig implements IFeatureConfig
{
    public final int count;

    public CountConfig(int p_i3787_1_)
    {
        this.count = p_i3787_1_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("count"), ops.createInt(this.count))));
    }

    public static <T> CountConfig deserialize(Dynamic<T> p_214687_0_)
    {
        int i = p_214687_0_.get("count").asInt(0);
        return new CountConfig(i);
    }
}
