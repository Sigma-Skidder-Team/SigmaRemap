package remapped;

import java.util.Random;

public class class_6962 extends class_3793 {
   private static String[] field_35774;

   public class_6962(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5626();
   }

   @Override
   public void method_17625(World var1, BlockPos var2, PlayerEntity var3) {
      class_3757 var6 = var1.method_28260(var2);
      if (var6 instanceof class_5626) {
         var3.method_3152((class_4259)var6);
         var3.method_3209(class_6234.field_31838);
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method_10313(field_18522)) {
         double var7 = (double)var3.getX() + 0.5;
         double var9 = (double)var3.getY();
         double var11 = (double)var3.getZ() + 0.5;
         if (var4.nextDouble() < 0.1) {
            var2.method_29527(var7, var9, var11, SoundEvents.field_2406, class_562.field_3322, 1.0F, 1.0F, false);
         }

         Direction var13 = var1.<Direction>method_10313(field_18523);
         class_9249 var14 = var13.method_1029();
         double var15 = 0.52;
         double var17 = var4.nextDouble() * 0.6 - 0.3;
         double var19 = var14 != class_9249.field_47215 ? var17 : (double)var13.method_1041() * 0.52;
         double var21 = var4.nextDouble() * 9.0 / 16.0;
         double var23 = var14 != class_9249.field_47219 ? var17 : (double)var13.method_1034() * 0.52;
         var2.method_43361(class_3090.field_15376, var7 + var19, var9 + var21, var11 + var23, 0.0, 0.0, 0.0);
      }
   }
}
