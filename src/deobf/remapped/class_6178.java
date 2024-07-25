package remapped;

import java.util.Random;

public class class_6178 extends class_4314 {
   private static String[] field_31589;

   public class_6178(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5555();
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      class_3757 var7 = var2.method_28260(var3);
      if (var7 instanceof class_5555) {
         int var8 = ((class_5555)var7).method_25240();

         for (int var9 = 0; var9 < var8; var9++) {
            double var10 = (double)var3.method_12173() + var4.nextDouble();
            double var12 = (double)var3.method_12165() + var4.nextDouble();
            double var14 = (double)var3.method_12185() + var4.nextDouble();
            double var16 = (var4.nextDouble() - 0.5) * 0.5;
            double var18 = (var4.nextDouble() - 0.5) * 0.5;
            double var20 = (var4.nextDouble() - 0.5) * 0.5;
            int var22 = var4.nextInt(2) * 2 - 1;
            if (!var4.nextBoolean()) {
               var10 = (double)var3.method_12173() + 0.5 + 0.25 * (double)var22;
               var16 = (double)(var4.nextFloat() * 2.0F * (float)var22);
            } else {
               var14 = (double)var3.method_12185() + 0.5 + 0.25 * (double)var22;
               var20 = (double)(var4.nextFloat() * 2.0F * (float)var22);
            }

            var2.method_43361(class_3090.field_15356, var10, var12, var14, var16, var18, var20);
         }
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public boolean method_10782(class_2522 var1, class_2340 var2) {
      return false;
   }
}
