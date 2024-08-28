package mapped;

public final class Class6244 extends Class6218 {
   private static String[] field27734;
   private final Class6218 field27735 = new Class6218();

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>method23463(Class3357.field18899);
      ServerWorld var6 = var1.method11326();
      double var7 = var1.method11320() + (double)var5.method539() * 1.125;
      double var9 = Math.floor(var1.method11321()) + (double)var5.method540();
      double var11 = var1.method11322() + (double)var5.method541() * 1.125;
      BlockPos var13 = var1.method11323().method8349(var5);
      Class7380 var14 = var6.method6738(var13);
      Class96 var15 = !(var14.method23383() instanceof Class3429)
         ? Class96.field247
         : var14.<Class96>method23463(((Class3429)var14.method23383()).method12093());
      double var16;
      if (!var14.method23446(Class7645.field32766)) {
         if (!var14.method23393() || !var6.method6738(var13.method8313()).method23446(Class7645.field32766)) {
            return this.field27735.method19196(var1, var2);
         }

         Class7380 var18 = var6.method6738(var13.method8313());
         Class96 var19 = !(var18.method23383() instanceof Class3429)
            ? Class96.field247
            : var18.<Class96>method23463(((Class3429)var18.method23383()).method12093());
         if (var5 != Direction.field672 && var19.method275()) {
            var16 = -0.4;
         } else {
            var16 = -0.9;
         }
      } else if (!var15.method275()) {
         var16 = 0.1;
      } else {
         var16 = 0.6;
      }

      Class916 var20 = Class916.method3585(var6, var7, var9 + var16, var11, Class3282.method11811((Class3282)var2.method32107()));
      if (var2.method32152()) {
         var20.method3379(var2.method32149());
      }

      var6.method6916(var20);
      var2.method32182(1);
      return var2;
   }

   @Override
   public void method19193(Class2956 var1) {
      var1.method11326().method6999(1000, var1.method11323(), 0);
   }
}
