package mapped;

import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;

public final class Class5969 extends BiomeGeneratorTypeScreens {
   public Class5969(String var1) {
      super(var1, null);
   }

   @Override
   public ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3) {
      return new NoiseChunkGenerator(new SingleBiomeProvider(var1.getOrThrow(Biomes.PLAINS)), var3, () -> var2.getOrThrow(DimensionSettings.field43230));
   }
}
