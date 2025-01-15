package net.minecraft.world.gen.placement;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class ChanceRangeConfig implements IPlacementConfig
{
    public final float chance;
    public final int bottomOffset;
    public final int topOffset;
    public final int top;

    public ChanceRangeConfig(float p_i802_1_, int p_i802_2_, int p_i802_3_, int p_i802_4_)
    {
        this.chance = p_i802_1_;
        this.bottomOffset = p_i802_2_;
        this.topOffset = p_i802_3_;
        this.top = p_i802_4_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("chance"), ops.createFloat(this.chance), ops.createString("bottom_offset"), ops.createInt(this.bottomOffset), ops.createString("top_offset"), ops.createInt(this.topOffset), ops.createString("top"), ops.createInt(this.top))));
    }

    public static ChanceRangeConfig deserialize(Dynamic<?> p_214732_0_)
    {
        float f = p_214732_0_.get("chance").asFloat(0.0F);
        int i = p_214732_0_.get("bottom_offset").asInt(0);
        int j = p_214732_0_.get("top_offset").asInt(0);
        int k = p_214732_0_.get("top").asInt(0);
        return new ChanceRangeConfig(f, i, j, k);
    }
}
