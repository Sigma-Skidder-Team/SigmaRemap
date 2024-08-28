package mapped;

public class Class3282 extends Class3257 {
   private static String[] field18790;
   private static final Class6226 field18791 = new Class6244();
   private final Class2177 field18792;

   public Class3282(Class2177 var1, Class5643 var2) {
      super(var2);
      this.field18792 = var1;
      Class3357.method11931(this, field18791);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      if (var6.method23446(Class7645.field32766)) {
         Class8848 var7 = var1.method18357();
         if (!var4.field9020) {
            Class96 var8 = !(var6.method23383() instanceof Class3429)
               ? Class96.field247
               : var6.<Class96>method23463(((Class3429)var6.method23383()).method12093());
            double var9 = 0.0;
            if (var8.method275()) {
               var9 = 0.5;
            }

            Class916 var11 = Class916.method3585(
               var4, (double)var5.method8304() + 0.5, (double)var5.getY() + 0.0625 + var9, (double)var5.method8306() + 0.5, this.field18792
            );
            if (var7.method32152()) {
               var11.method3379(var7.method32149());
            }

            var4.method6916(var11);
         }

         var7.method32182(1);
         return Class2274.method9002(var4.field9020);
      } else {
         return Class2274.field14821;
      }
   }

   // $VF: synthetic method
   public static Class2177 method11811(Class3282 var0) {
      return var0.field18792;
   }
}
