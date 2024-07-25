package remapped;

public class class_2504 extends class_2451 {
   private static String[] field_12441;

   public class_2504(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      var1.method_29528(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.method_37309(),
         var2.getPosZ(),
         SoundEvents.field_2847,
         class_562.field_3335,
         0.5F,
         0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
      );
      if (!var1.field_33055) {
         class_1890 var7 = new class_1890(var1, var2);
         var7.method_15852(var6);
         var7.method_26158(var2, var2.rotationPitch, var2.rotationYaw, 0.0F, 1.5F, 1.0F);
         var1.method_7509(var7);
      }

      var2.method_3211(class_6234.field_31907.method_43790(this));
      if (!var2.playerAbilities.isCreativeMode) {
         var6.method_27970(1);
      }

      return class_954.<ItemStack>method_4208(var6, var1.method_22567());
   }
}
