package remapped;

import java.util.Random;

public class class_1573 {
   private static String[] field_8267;
   private static final Random field_8268 = new Random();

   public static void method_7104(World var0, BlockPos var1, class_6867 var2) {
      method_7103(var0, (double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185(), var2);
   }

   public static void method_7105(World var0, Entity var1, class_6867 var2) {
      method_7103(var0, var1.getPosX(), var1.method_37309(), var1.getPosZ(), var2);
   }

   private static void method_7103(World var0, double var1, double var3, double var5, class_6867 var7) {
      for (int var10 = 0; var10 < var7.method_31505(); var10++) {
         method_7100(var0, var1, var3, var5, var7.method_31498(var10));
      }
   }

   public static void method_7101(World var0, BlockPos var1, class_2831<ItemStack> var2) {
      var2.forEach(var2x -> method_7100(var0, (double)var1.method_12173(), (double)var1.method_12165(), (double)var1.method_12185(), var2x));
   }

   public static void method_7100(World var0, double var1, double var3, double var5, ItemStack var7) {
      double var10 = (double)class_6629.field_34208.method_30459();
      double var12 = 1.0 - var10;
      double var14 = var10 / 2.0;
      double var16 = Math.floor(var1) + field_8268.nextDouble() * var12 + var14;
      double var18 = Math.floor(var3) + field_8268.nextDouble() * var12;
      double var20 = Math.floor(var5) + field_8268.nextDouble() * var12 + var14;

      while (!var7.method_28022()) {
         class_91 var22 = new class_91(var0, var16, var18, var20, var7.method_27953(field_8268.nextInt(21) + 10));
         float var23 = 0.05F;
         var22.method_37214(field_8268.nextGaussian() * 0.05F, field_8268.nextGaussian() * 0.05F + 0.2F, field_8268.nextGaussian() * 0.05F);
         var0.method_7509(var22);
      }
   }
}
