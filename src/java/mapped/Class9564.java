package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.Map;
import java.util.Optional;

public final class Class9564 {
   public static final Class9564 field44540 = method37067("desert");
   public static final Class9564 field44541 = method37067("jungle");
   public static final Class9564 field44542 = method37067("plains");
   public static final Class9564 field44543 = method37067("savanna");
   public static final Class9564 field44544 = method37067("snow");
   public static final Class9564 field44545 = method37067("swamp");
   public static final Class9564 field44546 = method37067("taiga");
   private final String field44547;
   private static final Map<RegistryKey<Biome>, Class9564> field44548 = Util.<Map<RegistryKey<Biome>, Class9564>>make(
      Maps.newHashMap(), var0 -> {
         var0.put(Biomes.BADLANDS, field44540);
         var0.put(Biomes.BADLANDS_PLATEAU, field44540);
         var0.put(Biomes.DESERT, field44540);
         var0.put(Biomes.DESERT_HILLS, field44540);
         var0.put(Biomes.DESERT_LAKES, field44540);
         var0.put(Biomes.ERODED_BADLANDS, field44540);
         var0.put(Biomes.MODIFIED_BADLANDS_PLATEAU, field44540);
         var0.put(Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU, field44540);
         var0.put(Biomes.WOODED_BADLANDS_PLATEAU, field44540);
         var0.put(Biomes.BAMBOO_JUNGLE, field44541);
         var0.put(Biomes.BAMBOO_JUNGLE_HILLS, field44541);
         var0.put(Biomes.JUNGLE, field44541);
         var0.put(Biomes.JUNGLE_EDGE, field44541);
         var0.put(Biomes.JUNGLE_HILLS, field44541);
         var0.put(Biomes.MODIFIED_JUNGLE, field44541);
         var0.put(Biomes.MODIFIED_JUNGLE_EDGE, field44541);
         var0.put(Biomes.SAVANNA_PLATEAU, field44543);
         var0.put(Biomes.SAVANNA, field44543);
         var0.put(Biomes.SHATTERED_SAVANNA, field44543);
         var0.put(Biomes.SHATTERED_SAVANNA_PLATEAU, field44543);
         var0.put(Biomes.DEEP_FROZEN_OCEAN, field44544);
         var0.put(Biomes.FROZEN_OCEAN, field44544);
         var0.put(Biomes.FROZEN_RIVER, field44544);
         var0.put(Biomes.ICE_SPIKES, field44544);
         var0.put(Biomes.SNOWY_BEACH, field44544);
         var0.put(Biomes.SNOWY_MOUNTAINS, field44544);
         var0.put(Biomes.SNOWY_TAIGA, field44544);
         var0.put(Biomes.SNOWY_TAIGA_HILLS, field44544);
         var0.put(Biomes.SNOWY_TAIGA_MOUNTAINS, field44544);
         var0.put(Biomes.SNOWY_TUNDRA, field44544);
         var0.put(Biomes.SWAMP, field44545);
         var0.put(Biomes.SWAMP_HILLS, field44545);
         var0.put(Biomes.GIANT_SPRUCE_TAIGA, field44546);
         var0.put(Biomes.GIANT_SPRUCE_TAIGA_HILLS, field44546);
         var0.put(Biomes.GIANT_TREE_TAIGA, field44546);
         var0.put(Biomes.GIANT_TREE_TAIGA_HILLS, field44546);
         var0.put(Biomes.GRAVELLY_MOUNTAINS, field44546);
         var0.put(Biomes.MODIFIED_GRAVELLY_MOUNTAINS, field44546);
         var0.put(Biomes.MOUNTAIN_EDGE, field44546);
         var0.put(Biomes.MOUNTAINS, field44546);
         var0.put(Biomes.TAIGA, field44546);
         var0.put(Biomes.TAIGA_HILLS, field44546);
         var0.put(Biomes.TAIGA_MOUNTAINS, field44546);
         var0.put(Biomes.WOODED_MOUNTAINS, field44546);
      }
   );

   private Class9564(String var1) {
      this.field44547 = var1;
   }

   @Override
   public String toString() {
      return this.field44547;
   }

   private static Class9564 method37067(String var0) {
      return Registry.<Class9564, Class9564>register(Registry.field16089, new ResourceLocation(var0), new Class9564(var0));
   }

   public static Class9564 method37068(Optional<RegistryKey<Biome>> var0) {
      return var0.<Class9564>flatMap(var0x -> Optional.ofNullable(field44548.get(var0x))).orElse(field44542);
   }
}
