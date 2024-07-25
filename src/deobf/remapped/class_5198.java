package remapped;

import java.util.Random;

public class class_5198 extends class_4314 {
   private static String[] field_26732;
   public static final class_4190 field_26731 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public class_5198(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_9795();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_26731;
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (var2 instanceof class_6331
         && !var4.isPassenger()
         && !var4.method_37151()
         && var4.method_37148()
         && class_3370.method_15537(
            class_3370.method_15523(
               var4.getBoundingBox().method_18918((double)(-var3.getX()), (double)(-var3.getY()), (double)(-var3.getZ()))
            ),
            var1.method_8334(var2, var3),
            class_8529.field_43655
         )) {
         class_5621 var7 = var2.method_29545() != World.field_33038 ? World.field_33038 : World.field_33048;
         class_6331 var8 = ((class_6331)var2).method_29522().method_1697(var7);
         if (var8 == null) {
            return;
         }

         var4.method_37326(var8);
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + var4.nextDouble();
      double var9 = (double)var3.getY() + 0.8;
      double var11 = (double)var3.getZ() + var4.nextDouble();
      var2.method_43361(class_3090.field_15376, var7, var9, var11, 0.0, 0.0, 0.0);
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
