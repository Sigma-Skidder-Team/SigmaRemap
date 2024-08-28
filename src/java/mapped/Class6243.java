package mapped;

public final class Class6243 extends Class6218 {
   private static String[] field27718;
   private final Class6218 field27733 = new Class6218();

   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>method23463(Class3357.field18899));
      Class7380 var7 = var5.method6738(var6);
      Block var8 = var7.method23383();
      if (!(var8 instanceof Class3405)) {
         return super.method19192(var1, var2);
      } else {
         Class7631 var9 = ((Class3405)var8).method11533(var5, var6, var7);
         if (var9 instanceof Class7633) {
            Class3257 var10 = var9.method25050();
            var2.method32182(1);
            if (!var2.method32105()) {
               if (var1.<Class971>method11325().method4023(new ItemStack(var10)) < 0) {
                  this.field27733.method19196(var1, new ItemStack(var10));
               }

               return var2;
            } else {
               return new ItemStack(var10);
            }
         } else {
            return super.method19192(var1, var2);
         }
      }
   }
}
