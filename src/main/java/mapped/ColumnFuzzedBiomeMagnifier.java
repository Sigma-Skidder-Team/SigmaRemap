package mapped;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.IBiomeMagnifier;

public enum ColumnFuzzedBiomeMagnifier implements IBiomeMagnifier {
   INSTANCE;

   private static final ColumnFuzzedBiomeMagnifier[] field12769 = new ColumnFuzzedBiomeMagnifier[]{INSTANCE};

   @Override
   public Biome getBiome(long var1, int var3, int var4, int var5, BiomeManager.IBiomeReader var6) {
      return FuzzedBiomeMagnifier.INSTANCE.getBiome(var1, var3, 0, var5, var6);
   }
}
