package net.minecraft.world.biome;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import mapped.Class9109;
import mapped.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;

public abstract class BiomeRegistry {
   private static final Int2ObjectMap<RegistryKey<Biome>> field40280 = new Int2ObjectArrayMap();
   public static final Biome PLAINS = register(1, Biomes.PLAINS, BiomeMaker.makePlainsBiome(false));
   public static final Biome field40282 = register(127, Biomes.THE_VOID, BiomeMaker.method36110());

   private static Biome register(int var0, RegistryKey<Biome> var1, Biome var2) {
      field40280.put(var0, var1);
      return WorldGenRegistries.<Biome, Biome>method20498(WorldGenRegistries.BIOME, var0, var1, var2);
   }

   public static RegistryKey<Biome> method32443(int var0) {
      return field40280.get(var0);
   }

   static {
      register(0, Biomes.OCEAN, BiomeMaker.method36095(false));
      register(2, Biomes.DESERT, BiomeMaker.method36075(0.125F, 0.05F, true, true, true));
      register(3, Biomes.MOUNTAINS, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41853, false));
      register(4, Biomes.FOREST, BiomeMaker.method36102(0.1F, 0.2F));
      register(5, Biomes.TAIGA, BiomeMaker.method36104(0.2F, 0.2F, false, false, true, false));
      register(6, Biomes.SWAMP, BiomeMaker.makeGenericSwampBiome(-0.2F, 0.1F, false));
      register(7, Biomes.RIVER, BiomeMaker.method36108(-0.5F, 0.0F, 0.5F, 4159204, false));
      register(8, Biomes.NETHER_WASTES, BiomeMaker.method36111());
      register(9, Biomes.THE_END, BiomeMaker.method36079());
      register(10, Biomes.FROZEN_OCEAN, BiomeMaker.method36099(false));
      register(11, Biomes.FROZEN_RIVER, BiomeMaker.method36108(-0.5F, 0.0F, 0.0F, 3750089, true));
      register(12, Biomes.SNOWY_TUNDRA, BiomeMaker.method36107(0.125F, 0.05F, false, false));
      register(13, Biomes.SNOWY_MOUNTAINS, BiomeMaker.method36107(0.45F, 0.3F, false, true));
      register(14, Biomes.MUSHROOM_FIELDS, BiomeMaker.method36083(0.2F, 0.3F));
      register(15, Biomes.MUSHROOM_FIELD_SHORE, BiomeMaker.method36083(0.0F, 0.025F));
      register(16, Biomes.BEACH, BiomeMaker.method36109(0.0F, 0.025F, 0.8F, 0.4F, 4159204, false, false));
      register(17, Biomes.DESERT_HILLS, BiomeMaker.method36075(0.45F, 0.3F, false, true, false));
      register(18, Biomes.WOODED_HILLS, BiomeMaker.method36102(0.45F, 0.3F));
      register(19, Biomes.TAIGA_HILLS, BiomeMaker.method36104(0.45F, 0.3F, false, false, false, false));
      register(20, Biomes.MOUNTAIN_EDGE, BiomeMaker.method36074(0.8F, 0.3F, Class9109.field41850, true));
      register(21, Biomes.JUNGLE, BiomeMaker.method36064());
      register(22, Biomes.JUNGLE_HILLS, BiomeMaker.method36068());
      register(23, Biomes.JUNGLE_EDGE, BiomeMaker.method36065());
      register(24, Biomes.DEEP_OCEAN, BiomeMaker.method36095(true));
      register(25, Biomes.STONE_SHORE, BiomeMaker.method36109(0.1F, 0.8F, 0.2F, 0.3F, 4159204, false, true));
      register(26, Biomes.SNOWY_BEACH, BiomeMaker.method36109(0.0F, 0.025F, 0.05F, 0.3F, 4020182, true, false));
      register(27, Biomes.BIRCH_FOREST, BiomeMaker.method36063(0.1F, 0.2F, false));
      register(28, Biomes.BIRCH_FOREST_HILLS, BiomeMaker.method36063(0.45F, 0.3F, false));
      register(29, Biomes.DARK_FOREST, BiomeMaker.method36105(0.1F, 0.2F, false));
      register(30, Biomes.SNOWY_TAIGA, BiomeMaker.method36104(0.2F, 0.2F, true, false, false, true));
      register(31, Biomes.SNOWY_TAIGA_HILLS, BiomeMaker.method36104(0.45F, 0.3F, true, false, false, false));
      register(32, Biomes.GIANT_TREE_TAIGA, BiomeMaker.makeGiantTaigaBiome(0.2F, 0.2F, 0.3F, false));
      register(33, Biomes.GIANT_TREE_TAIGA_HILLS, BiomeMaker.makeGiantTaigaBiome(0.45F, 0.3F, 0.3F, false));
      register(34, Biomes.WOODED_MOUNTAINS, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41850, true));
      register(35, Biomes.SAVANNA, BiomeMaker.method36085(0.125F, 0.05F, 1.2F, false, false));
      register(36, Biomes.SAVANNA_PLATEAU, BiomeMaker.method36087());
      register(37, Biomes.BADLANDS, BiomeMaker.method36089(0.1F, 0.2F, false));
      register(38, Biomes.WOODED_BADLANDS_PLATEAU, BiomeMaker.method36090(1.5F, 0.025F));
      register(39, Biomes.BADLANDS_PLATEAU, BiomeMaker.method36089(1.5F, 0.025F, true));
      register(40, Biomes.SMALL_END_ISLANDS, BiomeMaker.method36082());
      register(41, Biomes.END_MIDLANDS, BiomeMaker.method36080());
      register(42, Biomes.END_HIGHLANDS, BiomeMaker.method36081());
      register(43, Biomes.END_BARRENS, BiomeMaker.method36078());
      register(44, Biomes.WARM_OCEAN, BiomeMaker.method36097());
      register(45, Biomes.LUKEWARM_OCEAN, BiomeMaker.method36096(false));
      register(46, Biomes.COLD_OCEAN, BiomeMaker.method36094(false));
      register(47, Biomes.DEEP_WARM_OCEAN, BiomeMaker.method36098());
      register(48, Biomes.DEEP_LUKEWARM_OCEAN, BiomeMaker.method36096(true));
      register(49, Biomes.DEEP_COLD_OCEAN, BiomeMaker.method36094(true));
      register(50, Biomes.DEEP_FROZEN_OCEAN, BiomeMaker.method36099(true));
      register(129, Biomes.SUNFLOWER_PLAINS, BiomeMaker.makePlainsBiome(true));
      register(130, Biomes.DESERT_LAKES, BiomeMaker.method36075(0.225F, 0.25F, false, false, false));
      register(131, Biomes.GRAVELLY_MOUNTAINS, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41851, false));
      register(132, Biomes.FLOWER_FOREST, BiomeMaker.method36103());
      register(133, Biomes.TAIGA_MOUNTAINS, BiomeMaker.method36104(0.3F, 0.4F, false, true, false, false));
      register(134, Biomes.SWAMP_HILLS, BiomeMaker.makeGenericSwampBiome(-0.1F, 0.3F, true));
      register(140, Biomes.ICE_SPIKES, BiomeMaker.method36107(0.425F, 0.45000002F, true, false));
      register(149, Biomes.MODIFIED_JUNGLE, BiomeMaker.method36067());
      register(151, Biomes.MODIFIED_JUNGLE_EDGE, BiomeMaker.method36066());
      register(155, Biomes.TALL_BIRCH_FOREST, BiomeMaker.method36063(0.2F, 0.4F, true));
      register(156, Biomes.TALL_BIRCH_HILLS, BiomeMaker.method36063(0.55F, 0.5F, true));
      register(157, Biomes.DARK_FOREST_HILLS, BiomeMaker.method36105(0.2F, 0.4F, true));
      register(158, Biomes.SNOWY_TAIGA_MOUNTAINS, BiomeMaker.method36104(0.3F, 0.4F, true, true, false, false));
      register(160, Biomes.GIANT_SPRUCE_TAIGA, BiomeMaker.makeGiantTaigaBiome(0.2F, 0.2F, 0.25F, true));
      register(161, Biomes.GIANT_SPRUCE_TAIGA_HILLS, BiomeMaker.makeGiantTaigaBiome(0.2F, 0.2F, 0.25F, true));
      register(162, Biomes.MODIFIED_GRAVELLY_MOUNTAINS, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41851, false));
      register(163, Biomes.SHATTERED_SAVANNA, BiomeMaker.method36085(0.3625F, 1.225F, 1.1F, true, true));
      register(164, Biomes.SHATTERED_SAVANNA_PLATEAU, BiomeMaker.method36085(1.05F, 1.2125001F, 1.0F, true, true));
      register(165, Biomes.ERODED_BADLANDS, BiomeMaker.method36091());
      register(166, Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU, BiomeMaker.method36090(0.45F, 0.3F));
      register(167, Biomes.MODIFIED_BADLANDS_PLATEAU, BiomeMaker.method36089(0.45F, 0.3F, true));
      register(168, Biomes.BAMBOO_JUNGLE, BiomeMaker.method36069());
      register(169, Biomes.BAMBOO_JUNGLE_HILLS, BiomeMaker.method36070());
      register(170, Biomes.SOUL_SAND_VALLEY, BiomeMaker.method36112());
      register(171, Biomes.CRIMSON_FOREST, BiomeMaker.method36114());
      register(172, Biomes.WARPED_FOREST, BiomeMaker.method36115());
      register(173, Biomes.BASALT_DELTAS, BiomeMaker.method36113());
   }
}
