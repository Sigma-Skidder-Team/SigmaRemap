package remapped;

public class class_5229 extends class_2451 {
   private static String[] field_26825;

   public class_5229(class_317 var1) {
      super(var1);
   }

   @Override
   public boolean method_11252(ItemStack var1) {
      return true;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      var1.method_29528(
         (class_704)null,
         var2.getPosX(),
         var2.method_37309(),
         var2.getPosZ(),
         class_463.field_2319,
         class_562.field_3328,
         0.5F,
         0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
      );
      if (!var1.field_33055) {
         class_6093 var7 = new class_6093(var1, var2);
         var7.method_15852(var6);
         var7.method_26158(var2, var2.rotationPitch, var2.rotationYaw, -20.0F, 0.7F, 1.0F);
         var1.method_7509(var7);
      }

      var2.method_3211(class_6234.field_31907.method_43790(this));
      if (!var2.playerAbilities.isCreativeMode) {
         var6.method_27970(1);
      }

      return class_954.<ItemStack>method_4208(var6, var1.method_22567());
   }
}
