package remapped;

public final class class_6379 extends class_3893 {
   private static String[] field_32587;

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41157);
      this.method_18028(class_8039.field_41157);
      this.method_18028(class_8039.field_41143);
      this.method_18025(var0 -> {
         class_6992 var3 = var0.method_23255().<class_6992>method_6746(class_6992.class);
         int var4 = var0.<Integer>method_23248(class_8039.field_41157, 0);
         int var5 = var0.<Integer>method_23248(class_8039.field_41157, 1);
         if (var5 >= 20) {
            var0.method_23257(class_8039.field_41157, 1, ++var5);
         }

         var3.method_31984((short)var4);
      });
   }
}
