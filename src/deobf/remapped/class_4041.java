package remapped;

public class class_4041 extends class_5518 {
   private static String[] field_19612;

   public class_4041(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      ItemStack var6 = var2.method_26617(var3);
      if (!var1.field_33055) {
         class_8011 var7 = new class_8011(var1, var2);
         var7.method_15852(var6);
         var7.method_26158(var2, var2.field_41755, var2.field_41701, -20.0F, 0.5F, 1.0F);
         var1.method_7509(var7);
      }

      var2.method_3211(class_6234.field_31907.method_43790(this));
      if (!var2.field_3876.field_4944) {
         var6.method_27970(1);
      }

      return class_954.<ItemStack>method_4208(var6, var1.method_22567());
   }
}
