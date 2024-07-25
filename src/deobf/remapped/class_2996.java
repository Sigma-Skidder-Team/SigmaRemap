package remapped;

public final class class_2996 extends class_8085 {
   private static String[] field_14727;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      class_6331 var5 = var1.method_40140();
      class_1331 var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      class_4888 var7 = (class_4888)class_4783.field_23281;
      if (var5.method_22548(var6) && var7.method_22420(var5, var6)) {
         if (!var5.field_33055) {
            var5.method_7513(var6, var7.method_29260(), 3);
         }

         var2.method_27970(1);
         this.method_36717(true);
      } else {
         this.method_36717(class_8228.method_37666(var1, var2));
      }

      return var2;
   }
}
