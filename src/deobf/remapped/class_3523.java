package remapped;

public class class_3523 extends class_2451 {
   private static String[] field_17266;

   public class_3523(class_317 var1) {
      super(var1);
   }

   @Override
   public ItemStack method_11242(ItemStack var1, World var2, LivingEntity var3) {
      ItemStack var6 = super.method_11242(var1, var2, var3);
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).playerAbilities.isCreativeMode ? var6 : new ItemStack(class_4897.field_24454);
   }
}
