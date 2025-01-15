package net.minecraft.world.gen.placement;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.world.gen.Heightmap;

public class TopSolidWithNoiseConfig implements IPlacementConfig
{
    public final int noiseToCountRatio;
    public final double noiseFactor;
    public final double noiseOffset;
    public final Heightmap.Type heightmap;

    public TopSolidWithNoiseConfig(int p_i1954_1_, double p_i1954_2_, double p_i1954_4_, Heightmap.Type p_i1954_6_)
    {
        this.noiseToCountRatio = p_i1954_1_;
        this.noiseFactor = p_i1954_2_;
        this.noiseOffset = p_i1954_4_;
        this.heightmap = p_i1954_6_;
    }

    public <T> Dynamic<T> serialize(DynamicOps<T> ops)
    {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("noise_to_count_ratio"), ops.createInt(this.noiseToCountRatio), ops.createString("noise_factor"), ops.createDouble(this.noiseFactor), ops.createString("noise_offset"), ops.createDouble(this.noiseOffset), ops.createString("heightmap"), ops.createString(this.heightmap.getId()))));
    }

    public static TopSolidWithNoiseConfig deserialize(Dynamic<?> p_214726_0_)
    {
        int i = p_214726_0_.get("noise_to_count_ratio").asInt(10);
        double d0 = p_214726_0_.get("noise_factor").asDouble(80.0D);
        double d1 = p_214726_0_.get("noise_offset").asDouble(0.0D);
        Heightmap.Type heightmap$type = Heightmap.Type.getTypeFromId(p_214726_0_.get("heightmap").asString("OCEAN_FLOOR_WG"));
        return new TopSolidWithNoiseConfig(i, d0, d1, heightmap$type);
    }
}
