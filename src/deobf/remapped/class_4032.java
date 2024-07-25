package remapped;

import java.util.Random;

public class class_4032 extends class_6414 {
   private static String[] field_19584;

   public class_4032(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(5) == 0) {
         Direction var7 = Direction.method_1039(var4);
         if (var7 != Direction.field_817) {
            BlockPos var8 = var3.method_6098(var7);
            class_2522 var9 = var2.method_28262(var8);
            if (!var1.method_8302() || !var9.method_8308(var2, var8, var7.method_1046())) {
               double var10 = var7.method_1041() != 0 ? 0.5 + (double)var7.method_1041() * 0.6 : var4.nextDouble();
               double var12 = var7.method_1054() != 0 ? 0.5 + (double)var7.method_1054() * 0.6 : var4.nextDouble();
               double var14 = var7.method_1034() != 0 ? 0.5 + (double)var7.method_1034() * 0.6 : var4.nextDouble();
               var2.method_43361(
                  class_3090.field_15369,
                  (double)var3.getX() + var10,
                  (double)var3.method_12165() + var12,
                  (double)var3.method_12185() + var14,
                  0.0,
                  0.0,
                  0.0
               );
            }
         }
      }
   }
}
