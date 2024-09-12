package mapped;

import net.minecraft.client.gui.screen.BiomeGeneratorTypeScreens;
import net.minecraft.util.registry.Registry;

public final class Class5975 extends BiomeGeneratorTypeScreens {
   public Class5975(String var1) {
      super(var1, null);
   }

   @Override
   public DimensionGeneratorSettings method18506(DynamicRegistriesImpl var1, long var2, boolean var4, boolean var5) {
      MutableRegistry<Biome> var8 = var1.getRegistry(Registry.BIOME_KEY);
      MutableRegistry<DimensionType> var9 = var1.getRegistry(Registry.DIMENSION_TYPE_KEY);
      MutableRegistry<DimensionSettings> var10 = var1.getRegistry(Registry.NOISE_SETTINGS_KEY);
      return new DimensionGeneratorSettings(
         var2,
         var4,
         var5,
         DimensionGeneratorSettings.method26263(DimensionType.getDefaultSimpleRegistry(var9, var8, var10, var2), () -> var9.getOrThrow(DimensionType.OVERWORLD_CAVES), this.method18500(var8, var10, var2))
      );
   }

   @Override
   public ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3) {
      return new NoiseChunkGenerator(new Class1688(var1.getOrThrow(Class9495.field44122)), var3, () -> var2.getOrThrow(DimensionSettings.field43234));
   }
}
