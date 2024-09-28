package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.List;
import java.util.function.Supplier;

public class Class1689 extends BiomeProvider {
   public static final Codec<Class1689> field9184 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field9187),
               Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", false, Lifecycle.stable()).forGetter(var0x -> var0x.field9188),
               Codec.BOOL.fieldOf("large_biomes").orElse(false).stable().forGetter(var0x -> var0x.field9189),
               Class8611.<Biome>method30859(Registry.BIOME_KEY).forGetter(var0x -> var0x.field9190)
            )
            .apply(var0, var0.stable(Class1689::new))
   );
   private final Class7345 field9185;
   private static final List<RegistryKey<Biome>> field9186 = ImmutableList.of(
      Biomes.OCEAN,
      Biomes.PLAINS,
      Biomes.DESERT,
      Biomes.MOUNTAINS,
      Biomes.FOREST,
      Biomes.TAIGA,
      Biomes.SWAMP,
      Biomes.RIVER,
      Biomes.FROZEN_OCEAN,
      Biomes.FROZEN_RIVER,
      Biomes.SNOWY_TUNDRA,
      Biomes.SNOWY_MOUNTAINS,
      new RegistryKey[]{
         Biomes.MUSHROOM_FIELDS,
         Biomes.MUSHROOM_FIELD_SHORE,
         Biomes.BEACH,
         Biomes.DESERT_HILLS,
         Biomes.WOODED_HILLS,
         Biomes.TAIGA_HILLS,
         Biomes.MOUNTAIN_EDGE,
         Biomes.JUNGLE,
         Biomes.JUNGLE_HILLS,
         Biomes.JUNGLE_EDGE,
         Biomes.DEEP_OCEAN,
         Biomes.STONE_SHORE,
         Biomes.SNOWY_BEACH,
         Biomes.BIRCH_FOREST,
         Biomes.BIRCH_FOREST_HILLS,
         Biomes.DARK_FOREST,
         Biomes.SNOWY_TAIGA,
         Biomes.SNOWY_TAIGA_HILLS,
         Biomes.GIANT_TREE_TAIGA,
         Biomes.GIANT_TREE_TAIGA_HILLS,
         Biomes.WOODED_MOUNTAINS,
         Biomes.SAVANNA,
         Biomes.SAVANNA_PLATEAU,
         Biomes.BADLANDS,
         Biomes.WOODED_BADLANDS_PLATEAU,
         Biomes.BADLANDS_PLATEAU,
         Biomes.field44165,
         Biomes.field44166,
         Biomes.field44167,
         Biomes.field44168,
         Biomes.field44169,
         Biomes.field44170,
         Biomes.field44171,
         Biomes.field44173,
         Biomes.field44174,
         Biomes.field44175,
         Biomes.field44176,
         Biomes.TAIGA_MOUNTAINS,
         Biomes.SWAMP_HILLS,
         Biomes.ICE_SPIKES,
         Biomes.field44180,
         Biomes.field44181,
         Biomes.field44182,
         Biomes.field44183,
         Biomes.field44184,
         Biomes.field44185,
         Biomes.field44186,
         Biomes.field44187,
         Biomes.field44188,
         Biomes.field44189,
         Biomes.field44190,
         Biomes.field44191,
         Biomes.field44192,
         Biomes.field44193
      }
   );
   private final long field9187;
   private final boolean field9188;
   private final boolean field9189;
   private final Registry<Biome> field9190;

   public Class1689(long var1, boolean var3, boolean var4, Registry<Biome> var5) {
      super(field9186.stream().<Supplier<Biome>>map(var1x -> () -> var5.getOrThrow((RegistryKey<Biome>)var1x)));
      this.field9187 = var1;
      this.field9188 = var3;
      this.field9189 = var4;
      this.field9190 = var5;
      this.field9185 = Class9320.method35215(var1, var3, !var4 ? 4 : 6, 4);
   }

   @Override
   public Codec<? extends BiomeProvider> method7199() {
      return field9184;
   }

   @Override
   public BiomeProvider method7200(long var1) {
      return new Class1689(var1, this.field9188, this.field9189, this.field9190);
   }

   @Override
   public Biome getNoiseBiome(int var1, int var2, int var3) {
      return this.field9185.method23287(this.field9190, var1, var3);
   }
}
