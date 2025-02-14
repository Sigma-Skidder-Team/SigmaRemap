package mapped;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.IBiomeMagnifier;

public enum Class1962 implements IBiomeMagnifier {
   field12770;

   private static final Class1962[] field12771 = new Class1962[]{field12770};

   @Override
   public Biome getBiome(long var1, int var3, int var4, int var5, BiomeManager.IBiomeReader var6) {
      return var6.getNoiseBiome(var3 >> 2, var4 >> 2, var5 >> 2);
   }
}
