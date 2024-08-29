package mapped;

public enum ColumnFuzzedBiomeMagnifier implements IBiomeMagnifier {
   INSTANCE;

   private static final ColumnFuzzedBiomeMagnifier[] field12769 = new ColumnFuzzedBiomeMagnifier[]{INSTANCE};

   @Override
   public Biome method8225(long var1, int var3, int var4, int var5, Class1683 var6) {
      return FuzzedBiomeMagnifier.INSTANCE.method8225(var1, var3, 0, var5, var6);
   }
}
