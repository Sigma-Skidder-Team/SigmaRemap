package mapped;

public class Class3490 extends Class3194 {
   private static String[] field19356;
   public static final Class6408 field19357 = Block.method11539(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final Class7144 field19358;
   private final int field19359;

   public Class3490(Class7144 var1, int var2, AbstractBlock var3) {
      super(var3);
      this.field19358 = var1;
      if (!var1.method22292()) {
         this.field19359 = var2 * 20;
      } else {
         this.field19359 = var2;
      }
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Vector3d var7 = var1.method23421(var2, var3);
      return field19357.method19517(var7.field18048, var7.field18049, var7.field18050);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   public Class7144 method12186() {
      return this.field19358;
   }

   public int method12187() {
      return this.field19359;
   }
}
