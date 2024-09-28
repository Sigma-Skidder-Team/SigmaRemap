package net.minecraft.world.biome;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import mapped.Class9109;
import mapped.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;

public abstract class BiomeRegistry {
   private static final Int2ObjectMap<RegistryKey<Biome>> field40280 = new Int2ObjectArrayMap();
   public static final Biome PLAINS = method32442(1, Biomes.PLAINS, BiomeMaker.makePlainsBiome(false));
   public static final Biome field40282 = method32442(127, Biomes.field44172, BiomeMaker.method36110());

   private static Biome method32442(int var0, RegistryKey<Biome> var1, Biome var2) {
      field40280.put(var0, var1);
      return WorldGenRegistries.<Biome, Biome>method20498(WorldGenRegistries.BIOME, var0, var1, var2);
   }

   public static RegistryKey<Biome> method32443(int var0) {
      return (RegistryKey<Biome>)field40280.get(var0);
   }

   static {
      method32442(0, Biomes.OCEAN, BiomeMaker.method36095(false));
      method32442(2, Biomes.DESERT, BiomeMaker.method36075(0.125F, 0.05F, true, true, true));
      method32442(3, Biomes.MOUNTAINS, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41853, false));
      method32442(4, Biomes.FOREST, BiomeMaker.method36102(0.1F, 0.2F));
      method32442(5, Biomes.TAIGA, BiomeMaker.method36104(0.2F, 0.2F, false, false, true, false));
      method32442(6, Biomes.SWAMP, BiomeMaker.makeGenericSwampBiome(-0.2F, 0.1F, false));
      method32442(7, Biomes.RIVER, BiomeMaker.method36108(-0.5F, 0.0F, 0.5F, 4159204, false));
      method32442(8, Biomes.NETHER_WASTES, BiomeMaker.method36111());
      method32442(9, Biomes.THE_END, BiomeMaker.method36079());
      method32442(10, Biomes.FROZEN_OCEAN, BiomeMaker.method36099(false));
      method32442(11, Biomes.FROZEN_RIVER, BiomeMaker.method36108(-0.5F, 0.0F, 0.0F, 3750089, true));
      method32442(12, Biomes.SNOWY_TUNDRA, BiomeMaker.method36107(0.125F, 0.05F, false, false));
      method32442(13, Biomes.SNOWY_MOUNTAINS, BiomeMaker.method36107(0.45F, 0.3F, false, true));
      method32442(14, Biomes.MUSHROOM_FIELDS, BiomeMaker.method36083(0.2F, 0.3F));
      method32442(15, Biomes.MUSHROOM_FIELD_SHORE, BiomeMaker.method36083(0.0F, 0.025F));
      method32442(16, Biomes.BEACH, BiomeMaker.method36109(0.0F, 0.025F, 0.8F, 0.4F, 4159204, false, false));
      method32442(17, Biomes.DESERT_HILLS, BiomeMaker.method36075(0.45F, 0.3F, false, true, false));
      method32442(18, Biomes.WOODED_HILLS, BiomeMaker.method36102(0.45F, 0.3F));
      method32442(19, Biomes.TAIGA_HILLS, BiomeMaker.method36104(0.45F, 0.3F, false, false, false, false));
      method32442(20, Biomes.MOUNTAIN_EDGE, BiomeMaker.method36074(0.8F, 0.3F, Class9109.field41850, true));
      method32442(21, Biomes.JUNGLE, BiomeMaker.method36064());
      method32442(22, Biomes.JUNGLE_HILLS, BiomeMaker.method36068());
      method32442(23, Biomes.JUNGLE_EDGE, BiomeMaker.method36065());
      method32442(24, Biomes.DEEP_OCEAN, BiomeMaker.method36095(true));
      method32442(25, Biomes.STONE_SHORE, BiomeMaker.method36109(0.1F, 0.8F, 0.2F, 0.3F, 4159204, false, true));
      method32442(26, Biomes.SNOWY_BEACH, BiomeMaker.method36109(0.0F, 0.025F, 0.05F, 0.3F, 4020182, true, false));
      method32442(27, Biomes.BIRCH_FOREST, BiomeMaker.method36063(0.1F, 0.2F, false));
      method32442(28, Biomes.BIRCH_FOREST_HILLS, BiomeMaker.method36063(0.45F, 0.3F, false));
      method32442(29, Biomes.DARK_FOREST, BiomeMaker.method36105(0.1F, 0.2F, false));
      method32442(30, Biomes.SNOWY_TAIGA, BiomeMaker.method36104(0.2F, 0.2F, true, false, false, true));
      method32442(31, Biomes.SNOWY_TAIGA_HILLS, BiomeMaker.method36104(0.45F, 0.3F, true, false, false, false));
      method32442(32, Biomes.GIANT_TREE_TAIGA, BiomeMaker.makeGiantTaigaBiome(0.2F, 0.2F, 0.3F, false));
      method32442(33, Biomes.GIANT_TREE_TAIGA_HILLS, BiomeMaker.makeGiantTaigaBiome(0.45F, 0.3F, 0.3F, false));
      method32442(34, Biomes.WOODED_MOUNTAINS, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41850, true));
      method32442(35, Biomes.SAVANNA, BiomeMaker.method36085(0.125F, 0.05F, 1.2F, false, false));
      method32442(36, Biomes.SAVANNA_PLATEAU, BiomeMaker.method36087());
      method32442(37, Biomes.BADLANDS, BiomeMaker.method36089(0.1F, 0.2F, false));
      method32442(38, Biomes.WOODED_BADLANDS_PLATEAU, BiomeMaker.method36090(1.5F, 0.025F));
      method32442(39, Biomes.BADLANDS_PLATEAU, BiomeMaker.method36089(1.5F, 0.025F, true));
      method32442(40, Biomes.field44161, BiomeMaker.method36082());
      method32442(41, Biomes.field44162, BiomeMaker.method36080());
      method32442(42, Biomes.field44163, BiomeMaker.method36081());
      method32442(43, Biomes.field44164, BiomeMaker.method36078());
      method32442(44, Biomes.field44165, BiomeMaker.method36097());
      method32442(45, Biomes.field44166, BiomeMaker.method36096(false));
      method32442(46, Biomes.field44167, BiomeMaker.method36094(false));
      method32442(47, Biomes.field44168, BiomeMaker.method36098());
      method32442(48, Biomes.field44169, BiomeMaker.method36096(true));
      method32442(49, Biomes.field44170, BiomeMaker.method36094(true));
      method32442(50, Biomes.field44171, BiomeMaker.method36099(true));
      method32442(129, Biomes.field44173, BiomeMaker.makePlainsBiome(true));
      method32442(130, Biomes.field44174, BiomeMaker.method36075(0.225F, 0.25F, false, false, false));
      method32442(131, Biomes.field44175, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41851, false));
      method32442(132, Biomes.field44176, BiomeMaker.method36103());
      method32442(133, Biomes.TAIGA_MOUNTAINS, BiomeMaker.method36104(0.3F, 0.4F, false, true, false, false));
      method32442(134, Biomes.SWAMP_HILLS, BiomeMaker.makeGenericSwampBiome(-0.1F, 0.3F, true));
      method32442(140, Biomes.ICE_SPIKES, BiomeMaker.method36107(0.425F, 0.45000002F, true, false));
      method32442(149, Biomes.field44180, BiomeMaker.method36067());
      method32442(151, Biomes.field44181, BiomeMaker.method36066());
      method32442(155, Biomes.field44182, BiomeMaker.method36063(0.2F, 0.4F, true));
      method32442(156, Biomes.field44183, BiomeMaker.method36063(0.55F, 0.5F, true));
      method32442(157, Biomes.field44184, BiomeMaker.method36105(0.2F, 0.4F, true));
      method32442(158, Biomes.field44185, BiomeMaker.method36104(0.3F, 0.4F, true, true, false, false));
      method32442(160, Biomes.field44186, BiomeMaker.makeGiantTaigaBiome(0.2F, 0.2F, 0.25F, true));
      method32442(161, Biomes.field44187, BiomeMaker.makeGiantTaigaBiome(0.2F, 0.2F, 0.25F, true));
      method32442(162, Biomes.field44188, BiomeMaker.method36074(1.0F, 0.5F, Class9109.field41851, false));
      method32442(163, Biomes.field44189, BiomeMaker.method36085(0.3625F, 1.225F, 1.1F, true, true));
      method32442(164, Biomes.field44190, BiomeMaker.method36085(1.05F, 1.2125001F, 1.0F, true, true));
      method32442(165, Biomes.field44191, BiomeMaker.method36091());
      method32442(166, Biomes.field44192, BiomeMaker.method36090(0.45F, 0.3F));
      method32442(167, Biomes.field44193, BiomeMaker.method36089(0.45F, 0.3F, true));
      method32442(168, Biomes.field44194, BiomeMaker.method36069());
      method32442(169, Biomes.field44195, BiomeMaker.method36070());
      method32442(170, Biomes.field44196, BiomeMaker.method36112());
      method32442(171, Biomes.field44197, BiomeMaker.method36114());
      method32442(172, Biomes.field44198, BiomeMaker.method36115());
      method32442(173, Biomes.field44199, BiomeMaker.method36113());
   }
}
