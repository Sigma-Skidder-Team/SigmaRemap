package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;
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
         var0.put(Biomes.field44174, field44540);
         var0.put(Biomes.field44191, field44540);
         var0.put(Biomes.field44193, field44540);
         var0.put(Biomes.field44192, field44540);
         var0.put(Biomes.WOODED_BADLANDS_PLATEAU, field44540);
         var0.put(Biomes.field44194, field44541);
         var0.put(Biomes.field44195, field44541);
         var0.put(Biomes.JUNGLE, field44541);
         var0.put(Biomes.JUNGLE_EDGE, field44541);
         var0.put(Biomes.JUNGLE_HILLS, field44541);
         var0.put(Biomes.field44180, field44541);
         var0.put(Biomes.field44181, field44541);
         var0.put(Biomes.SAVANNA_PLATEAU, field44543);
         var0.put(Biomes.SAVANNA, field44543);
         var0.put(Biomes.field44189, field44543);
         var0.put(Biomes.field44190, field44543);
         var0.put(Biomes.field44171, field44544);
         var0.put(Biomes.FROZEN_OCEAN, field44544);
         var0.put(Biomes.FROZEN_RIVER, field44544);
         var0.put(Biomes.ICE_SPIKES, field44544);
         var0.put(Biomes.SNOWY_BEACH, field44544);
         var0.put(Biomes.SNOWY_MOUNTAINS, field44544);
         var0.put(Biomes.SNOWY_TAIGA, field44544);
         var0.put(Biomes.SNOWY_TAIGA_HILLS, field44544);
         var0.put(Biomes.field44185, field44544);
         var0.put(Biomes.SNOWY_TUNDRA, field44544);
         var0.put(Biomes.SWAMP, field44545);
         var0.put(Biomes.SWAMP_HILLS, field44545);
         var0.put(Biomes.field44186, field44546);
         var0.put(Biomes.field44187, field44546);
         var0.put(Biomes.GIANT_TREE_TAIGA, field44546);
         var0.put(Biomes.GIANT_TREE_TAIGA_HILLS, field44546);
         var0.put(Biomes.field44175, field44546);
         var0.put(Biomes.field44188, field44546);
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
