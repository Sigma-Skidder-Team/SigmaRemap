package mapped;

public class Class3329 extends Class3257 {
   private static String[] field18837;

   public Class3329(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Block var6 = var4.method6738(var5).method23383();
      if (!var6.method11540(Class7645.field32771)) {
         return ActionResultType.field14820;
      } else {
         PlayerEntity var7 = var1.method18358();
         if (!var4.field9020 && var7 != null) {
            method11880(var7, var4, var5);
         }

         return ActionResultType.method9002(var4.field9020);
      }
   }

   public static ActionResultType method11880(PlayerEntity var0, World var1, BlockPos var2) {
      Class996 var5 = null;
      boolean var6 = false;
      double var7 = 7.0;
      int var9 = var2.method8304();
      int var10 = var2.getY();
      int var11 = var2.method8306();

      for (Class1006 var13 : var1.<Class1006>method7182(
         Class1006.class,
         new Class6488((double)var9 - 7.0, (double)var10 - 7.0, (double)var11 - 7.0, (double)var9 + 7.0, (double)var10 + 7.0, (double)var11 + 7.0)
      )) {
         if (var13.method4297() == var0) {
            if (var5 == null) {
               var5 = Class996.method4087(var1, var2);
            }

            var13.method4298(var5, true);
            var6 = true;
         }
      }

      return !var6 ? ActionResultType.field14820 : ActionResultType.field14818;
   }
}
