package net.minecraft.world.gen.placement;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class AtSurfaceWithExtraConfig implements IPlacementConfig
{
    public final int count;
    public final float extraChance;
    public final int extraCount;

    public AtSurfaceWithExtraConfig(int p_i568_1_, float p_i568_2_, int p_i568_3_)
    {
        this.count = p_i568_1_;
        this.extraChance = p_i568_2_;
        this.extraCount = p_i568_3_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("count"), ops.createInt(this.count), ops.createString("extra_chance"), ops.createFloat(this.extraChance), ops.createString("extra_count"), ops.createInt(this.extraCount))));
    }

    public static AtSurfaceWithExtraConfig deserialize(Dynamic<?> p_214723_0_)
    {
        int i = p_214723_0_.get("count").asInt(0);
        float f = p_214723_0_.get("extra_chance").asFloat(0.0F);
        int j = p_214723_0_.get("extra_count").asInt(0);
        return new AtSurfaceWithExtraConfig(i, f, j);
    }
}
