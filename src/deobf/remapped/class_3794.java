package remapped;

import java.util.Random;

public class class_3794 extends class_3793 {
   private static String[] field_18524;

   public class_3794(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5717();
   }

   @Override
   public void method_17625(World var1, BlockPos var2, PlayerEntity var3) {
      class_3757 var6 = var1.method_28260(var2);
      if (var6 instanceof class_5717) {
         var3.method_3152((class_4259)var6);
         var3.method_3209(class_6234.field_31830);
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method_10313(field_18522)) {
         double var7 = (double)var3.method_12173() + 0.5;
         double var9 = (double)var3.method_12165();
         double var11 = (double)var3.method_12185() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.method_29527(var7, var9, var11, class_463.field_2178, class_562.field_3322, 1.0F, 1.0F, false);
         }

         var2.method_43361(class_3090.field_15376, var7, var9 + 1.1, var11, 0.0, 0.0, 0.0);
      }
   }
}
