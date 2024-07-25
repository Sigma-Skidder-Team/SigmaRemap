package remapped;

import javax.annotation.Nullable;

public interface class_3832 extends class_2354 {
   void method_17810(boolean var1);

   void method_17812(LivingEntity var1, ItemStack var2, class_5783 var3, float var4);

   @Nullable
   LivingEntity method_17809();

   void method_17814();

   default void method_17815(LivingEntity var1, float var2) {
      Hand var5 = class_8462.method_38934(var1, class_4897.field_25030);
      ItemStack var6 = var1.method_26617(var5);
      if (var1.method_26443(class_4897.field_25030)) {
         class_4380.method_20402(var1.world, var1, var5, var6, var2, (float)(14 - var1.world.method_43370().method_2097() * 4));
      }

      this.method_17814();
   }

   default void method_17811(LivingEntity var1, LivingEntity var2, class_5783 var3, float var4, float var5) {
      double var8 = var2.getPosX() - var1.getPosX();
      double var10 = var2.getPosZ() - var1.getPosZ();
      double var12 = (double) MathHelper.sqrt(var8 * var8 + var10 * var10);
      double var14 = var2.method_37080(0.3333333333333333) - var3.method_37309() + var12 * 0.2F;
      class_2426 var16 = this.method_17813(var1, new class_1343(var8, var14, var10), var4);
      var3.method_26161(
         (double)var16.method_11057(),
         (double)var16.method_11061(),
         (double)var16.method_11055(),
         var5,
         (float)(14 - var1.world.method_43370().method_2097() * 4)
      );
      var1.method_37155(SoundEvents.field_2025, 1.0F, 1.0F / (var1.method_26594().nextFloat() * 0.4F + 0.8F));
   }

   default class_2426 method_17813(LivingEntity var1, class_1343 var2, float var3) {
      class_1343 var6 = var2.method_6213();
      class_1343 var7 = var6.method_6196(new class_1343(0.0, 1.0, 0.0));
      if (var7.method_6221() <= 1.0E-7) {
         var7 = var6.method_6196(var1.method_37371(1.0F));
      }

      Quaternion var8 = new Quaternion(new class_2426(var7), 90.0F, true);
      class_2426 var9 = new class_2426(var6);
      var9.method_11058(var8);
      Quaternion var10 = new Quaternion(var9, var3, true);
      class_2426 var11 = new class_2426(var6);
      var11.method_11058(var10);
      return var11;
   }
}
