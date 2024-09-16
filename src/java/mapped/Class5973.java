package mapped;

import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public final class Class5973 extends BiomeGeneratorTypeScreens {
   public Class5973(String var1) {
      super(var1, null);
   }

   @Override
   public ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3) {
      return new NoiseChunkGenerator(new Class1689(var3, false, true, var1), var3, () -> var2.getOrThrow(DimensionSettings.field43230));
   }
}
