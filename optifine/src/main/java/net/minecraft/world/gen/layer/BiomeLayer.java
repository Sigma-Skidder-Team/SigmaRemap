package net.minecraft.world.gen.layer;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IC0Transformer;

public class BiomeLayer implements IC0Transformer
{
    private static final int BIRCH_FOREST = Registry.BIOME.getId(Biomes.BIRCH_FOREST);
    private static final int DESERT = Registry.BIOME.getId(Biomes.DESERT);
    private static final int MOUNTAINS = Registry.BIOME.getId(Biomes.MOUNTAINS);
    private static final int FOREST = Registry.BIOME.getId(Biomes.FOREST);
    private static final int SNOWY_TUNDRA = Registry.BIOME.getId(Biomes.SNOWY_TUNDRA);
    private static final int JUNGLE = Registry.BIOME.getId(Biomes.JUNGLE);
    private static final int BADLANDS_PLATEAU = Registry.BIOME.getId(Biomes.BADLANDS_PLATEAU);
    private static final int WOODED_BADLANDS_PLATEAU = Registry.BIOME.getId(Biomes.WOODED_BADLANDS_PLATEAU);
    private static final int MUSHROOM_FIELDS = Registry.BIOME.getId(Biomes.MUSHROOM_FIELDS);
    private static final int PLAINS = Registry.BIOME.getId(Biomes.PLAINS);
    private static final int GIANT_TREE_TAIGA = Registry.BIOME.getId(Biomes.GIANT_TREE_TAIGA);
    private static final int DARK_FOREST = Registry.BIOME.getId(Biomes.DARK_FOREST);
    private static final int SAVANNA = Registry.BIOME.getId(Biomes.SAVANNA);
    private static final int SWAMP = Registry.BIOME.getId(Biomes.SWAMP);
    private static final int TAIGA = Registry.BIOME.getId(Biomes.TAIGA);
    private static final int SNOWY_TAIGA = Registry.BIOME.getId(Biomes.SNOWY_TAIGA);
    private static final int[] field_202743_q = new int[] {DESERT, FOREST, MOUNTAINS, SWAMP, PLAINS, TAIGA};
    private static final int[] field_202744_r = new int[] {DESERT, DESERT, DESERT, SAVANNA, SAVANNA, PLAINS};
    private static final int[] field_202745_s = new int[] {FOREST, DARK_FOREST, MOUNTAINS, PLAINS, BIRCH_FOREST, SWAMP};
    private static final int[] field_202746_t = new int[] {FOREST, MOUNTAINS, TAIGA, PLAINS};
    private static final int[] field_202747_u = new int[] {SNOWY_TUNDRA, SNOWY_TUNDRA, SNOWY_TUNDRA, SNOWY_TAIGA};
    private final int field_227472_v_;
    private int[] warmBiomes = field_202744_r;

    public BiomeLayer(WorldType p_i3131_1_, int p_i3131_2_)
    {
        if (p_i3131_1_ == WorldType.DEFAULT_1_1)
        {
            this.warmBiomes = field_202743_q;
            this.field_227472_v_ = -1;
        }
        else
        {
            this.field_227472_v_ = p_i3131_2_;
        }
    }

    public int apply(INoiseRandom context, int value)
    {
        if (this.field_227472_v_ >= 0)
        {
            return this.field_227472_v_;
        }
        else
        {
            int i = (value & 3840) >> 8;
            value = value & -3841;

            if (!LayerUtil.isOcean(value) && value != MUSHROOM_FIELDS)
            {
                switch (value)
                {
                    case 1:
                        if (i > 0)
                        {
                            return context.random(3) == 0 ? BADLANDS_PLATEAU : WOODED_BADLANDS_PLATEAU;
                        }

                        return this.warmBiomes[context.random(this.warmBiomes.length)];

                    case 2:
                        if (i > 0)
                        {
                            return JUNGLE;
                        }

                        return field_202745_s[context.random(field_202745_s.length)];

                    case 3:
                        if (i > 0)
                        {
                            return GIANT_TREE_TAIGA;
                        }

                        return field_202746_t[context.random(field_202746_t.length)];

                    case 4:
                        return field_202747_u[context.random(field_202747_u.length)];

                    default:
                        return MUSHROOM_FIELDS;
                }
            }
            else
            {
                return value;
            }
        }
    }
}
