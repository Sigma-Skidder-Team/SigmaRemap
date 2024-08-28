package mapped;

import java.util.Random;

public class Class3243 extends Class3241 {
   private static String[] field18695;

   public Class3243(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class957();
   }

   @Override
   public void method11512(Class7380 var1, World var2, BlockPos var3, Random var4) {
      Class944 var7 = var2.method6759(var3);
      if (var7 instanceof Class957) {
         int var8 = ((Class957)var7).method3884();

         for (int var9 = 0; var9 < var8; var9++) {
            double var10 = (double)var3.method8304() + var4.nextDouble();
            double var12 = (double)var3.getY() + var4.nextDouble();
            double var14 = (double)var3.method8306() + var4.nextDouble();
            double var16 = (var4.nextDouble() - 0.5) * 0.5;
            double var18 = (var4.nextDouble() - 0.5) * 0.5;
            double var20 = (var4.nextDouble() - 0.5) * 0.5;
            int var22 = var4.nextInt(2) * 2 - 1;
            if (!var4.nextBoolean()) {
               var10 = (double)var3.method8304() + 0.5 + 0.25 * (double)var22;
               var16 = (double)(var4.nextFloat() * 2.0F * (float)var22);
            } else {
               var14 = (double)var3.method8306() + 0.5 + 0.25 * (double)var22;
               var20 = (double)(var4.nextFloat() * 2.0F * (float)var22);
            }

            var2.method6746(Class7940.field34090, var10, var12, var14, var16, var18, var20);
         }
      }
   }

   @Override
   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public boolean method11650(Class7380 var1, Class7631 var2) {
      return false;
   }
}
