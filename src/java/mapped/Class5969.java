package mapped;

import net.minecraft.util.registry.Registry;

public final class Class5969 extends Class5970 {
   public Class5969(String var1) {
      super(var1, null);
   }

   @Override
   public ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3) {
      return new NoiseChunkGenerator(new Class1688(var1.getOrThrow(Class9495.field44122)), var3, () -> var2.getOrThrow(DimensionSettings.field43230));
   }
}
