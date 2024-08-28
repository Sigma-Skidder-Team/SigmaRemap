package mapped;

import java.util.Random;

public class Class3353 extends Class3350 {
   private static String[] field18879;

   public Class3353(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class986();
   }

   @Override
   public void method11918(Class1655 var1, BlockPos var2, PlayerEntity var3) {
      Class944 var6 = var1.method6759(var2);
      if (var6 instanceof Class986) {
         var3.method2766((Class949)var6);
         var3.method2911(Class8876.field40159);
      }
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18876)) {
         double var7 = (double)var3.method8304() + 0.5;
         double var9 = (double)var3.getY();
         double var11 = (double)var3.method8306() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.method6745(var7, var9, var11, Class6067.field26604, Class2266.field14732, 1.0F, 1.0F, false);
         }

         Direction var13 = var1.<Direction>method23463(field18875);
         Class113 var14 = var13.method544();
         double var15 = 0.52;
         double var17 = var4.nextDouble() * 0.6 - 0.3;
         double var19 = var14 != Class113.field413 ? var17 : (double)var13.method539() * 0.52;
         double var21 = var4.nextDouble() * 6.0 / 16.0;
         double var23 = var14 != Class113.field415 ? var17 : (double)var13.method541() * 0.52;
         var2.method6746(Class7940.field34092, var7 + var19, var9 + var21, var11 + var23, 0.0, 0.0, 0.0);
         var2.method6746(Class7940.field34074, var7 + var19, var9 + var21, var11 + var23, 0.0, 0.0, 0.0);
      }
   }
}
