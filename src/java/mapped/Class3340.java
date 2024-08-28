package mapped;

import java.util.List;

public class Class3340 extends Class3257 {
   private static String[] field18846;

   public Class3340(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Class7380 var6 = var4.method6738(var5);
      if (!var6.method23448(Blocks.field36527) && !var6.method23448(Blocks.BEDROCK)) {
         return Class2274.field14821;
      } else {
         BlockPos var7 = var5.method8311();
         if (var4.method7007(var7)) {
            double var8 = (double)var7.method8304();
            double var10 = (double)var7.getY();
            double var12 = (double)var7.method8306();
            List var14 = var4.method7181((Entity)null, new Class6488(var8, var10, var12, var8 + 1.0, var10 + 2.0, var12 + 1.0));
            if (var14.isEmpty()) {
               if (var4 instanceof ServerWorld) {
                  Class1001 var15 = new Class1001(var4, var8 + 0.5, var10, var12 + 0.5);
                  var15.method4144(false);
                  var4.method6916(var15);
                  Class7819 var16 = ((ServerWorld)var4).method6968();
                  if (var16 != null) {
                     var16.method26128();
                  }
               }

               var1.method18357().method32182(1);
               return Class2274.method9002(var4.field9020);
            } else {
               return Class2274.field14821;
            }
         } else {
            return Class2274.field14821;
         }
      }
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }
}
