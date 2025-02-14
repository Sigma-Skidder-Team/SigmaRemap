package mapped;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;

import java.util.*;
import java.util.stream.Collectors;

public enum Class186 {
   field691(
      0,
      "red",
      Biomes.TAIGA,
      Biomes.TAIGA_HILLS,
      Biomes.TAIGA_MOUNTAINS,
      Biomes.GIANT_TREE_TAIGA,
      Biomes.GIANT_SPRUCE_TAIGA,
      Biomes.GIANT_TREE_TAIGA_HILLS,
      Biomes.GIANT_SPRUCE_TAIGA_HILLS
   ),
   field692(1, "snow", Biomes.SNOWY_TAIGA, Biomes.SNOWY_TAIGA_HILLS, Biomes.SNOWY_TAIGA_MOUNTAINS);

   private static final Class186[] field693 = Arrays.<Class186>stream(values())
      .sorted(Comparator.comparingInt(Class186::method568))
      .<Class186>toArray(Class186[]::new);
   private static final Map<String, Class186> field694 = Arrays.<Class186>stream(values())
      .collect(Collectors.toMap(Class186::method567, var0 -> (Class186)var0));
   private final int field695;
   private final String field696;
   private final List<RegistryKey<Biome>> field697;
   private static final Class186[] field698 = new Class186[]{field691, field692};

   private Class186(int var3, String var4, RegistryKey<Biome>... var5) {
      this.field695 = var3;
      this.field696 = var4;
      this.field697 = Arrays.<RegistryKey<Biome>>asList(var5);
   }

   public String method567() {
      return this.field696;
   }

   public int method568() {
      return this.field695;
   }

   public static Class186 method569(String var0) {
      return field694.getOrDefault(var0, field691);
   }

   public static Class186 method570(int var0) {
      if (var0 < 0 || var0 > field693.length) {
         var0 = 0;
      }

      return field693[var0];
   }

   public static Class186 method571(Optional<RegistryKey<Biome>> var0) {
      return var0.isPresent() && field692.field697.contains(var0.get()) ? field692 : field691;
   }
}
