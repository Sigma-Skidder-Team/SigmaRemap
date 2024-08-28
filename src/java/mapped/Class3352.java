package mapped;

import java.util.Random;

public class Class3352 extends Class3350 {
   private static String[] field18878;

   public Class3352(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class985();
   }

   @Override
   public void method11918(Class1655 var1, BlockPos var2, PlayerEntity var3) {
      Class944 var6 = var1.method6759(var2);
      if (var6 instanceof Class985) {
         var3.method2766((Class949)var6);
         var3.method2911(Class8876.field40166);
      }
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field18876)) {
         double var7 = (double)var3.method8304() + 0.5;
         double var9 = (double)var3.getY();
         double var11 = (double)var3.method8306() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.method6745(var7, var9, var11, Class6067.field27107, Class2266.field14732, 1.0F, 1.0F, false);
         }

         var2.method6746(Class7940.field34092, var7, var9 + 1.1, var11, 0.0, 0.0, 0.0);
      }
   }
}
