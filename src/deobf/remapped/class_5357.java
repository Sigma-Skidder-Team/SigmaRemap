package remapped;

public class class_5357 extends class_6201 {
   private static String[] field_27349;

   public class_5357(class_6414 var1, class_317 var2) {
      super(var1, var2);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      return class_6910.field_35521;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, class_2584 var3) {
      class_9529 var6 = method_11238(var1, var2, class_9583.field_48749);
      class_9529 var7 = var6.method_43957(var6.method_43955().method_6081());
      class_6910 var8 = super.method_11237(new class_4734(var2, var3, var7));
      return new class_954<ItemStack>(var8, var2.method_26617(var3));
   }
}
