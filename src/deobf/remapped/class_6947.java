package remapped;

public class class_6947 extends class_4041 {
   private static String[] field_35720;

   public class_6947(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      var1.method_29528(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.method_37309(),
         var2.getPosZ(),
         SoundEvents.field_2806,
         class_562.field_3335,
         0.5F,
         0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
      );
      return super.method_11231(var1, var2, var3);
   }
}
