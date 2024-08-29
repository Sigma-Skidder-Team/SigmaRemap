package mapped;

public final class Class5974 extends Class5970 {
   public Class5974(String var1) {
      super(var1, null);
   }

   @Override
   public ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3) {
      return new NoiseChunkGenerator(new Class1689(var3, false, false, var1), var3, () -> var2.getOrThrow(DimensionSettings.field43230));
   }
}
