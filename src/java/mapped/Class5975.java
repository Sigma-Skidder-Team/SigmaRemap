package mapped;

public final class Class5975 extends Class5970 {
   public Class5975(String var1) {
      super(var1, null);
   }

   @Override
   public DimensionGeneratorSettings method18506(Class8905 var1, long var2, boolean var4, boolean var5) {
      Class2349<Biome> var8 = var1.method32453(Registry.BIOME_KEY);
      Class2349<Class9535> var9 = var1.method32453(Registry.field16066);
      Class2349<Class9309> var10 = var1.method32453(Registry.field16099);
      return new DimensionGeneratorSettings(
         var2,
         var4,
         var5,
         DimensionGeneratorSettings.method26263(Class9535.method36871(var9, var8, var10, var2), () -> var9.method9189(Class9535.field44377), this.method18500(var8, var10, var2))
      );
   }

   @Override
   public Class5646 method18500(Registry<Biome> var1, Registry<Class9309> var2, long var3) {
      return new Class5645(new Class1688(var1.method9189(Class9495.field44122)), var3, () -> var2.method9189(Class9309.field43234));
   }
}
