package remapped;

public class class_8411 extends class_2451 implements class_1538 {
   private static String[] field_43018;

   public class_8411(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      if (var2.field_3841 == null) {
         var1.method_29528(
            (PlayerEntity)null,
            var2.getPosX(),
            var2.method_37309(),
            var2.getPosZ(),
            SoundEvents.field_2140,
            class_562.field_3328,
            0.5F,
            0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
         );
         if (!var1.field_33055) {
            int var7 = class_2931.method_13401(var6);
            int var8 = class_2931.method_13400(var6);
            var1.method_7509(new class_3942(var2, var1, var8, var7));
         }

         var2.method_3211(class_6234.field_31907.method_43790(this));
      } else {
         if (!var1.field_33055) {
            int var9 = var2.field_3841.method_18216(var6);
            var6.method_28003(var9, var2, var1x -> var1x.method_26447(var3));
         }

         var1.method_29528(
            (PlayerEntity)null,
            var2.getPosX(),
            var2.method_37309(),
            var2.getPosZ(),
            SoundEvents.field_2388,
            class_562.field_3328,
            1.0F,
            0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
         );
      }

      return class_954.<ItemStack>method_4208(var6, var1.method_22567());
   }

   @Override
   public int method_11213() {
      return 1;
   }
}
