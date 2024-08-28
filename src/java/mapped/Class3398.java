package mapped;

public class Class3398 extends Class3397 {
   private static String[] field19036;

   public Class3398(AbstractBlock var1) {
      super(var1, 2.0F);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !this.method11492(var1, var4, var5) ? Blocks.AIR.method11579() : this.method11579();
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return method12014(var2.method6738(var3.method8313()).method23383());
   }

   public static boolean method12014(Block var0) {
      return var0.method11540(Class7645.field32807);
   }

   @Override
   public boolean method12010(Class7380 var1) {
      return true;
   }
}
