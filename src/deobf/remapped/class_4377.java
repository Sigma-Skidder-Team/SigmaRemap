package remapped;

public class class_4377 extends class_3893 {
   private static String[] field_21481;

   public class_4377(class_267 var1) {
      this.field_21480 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41157);
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
         int var5 = this.field_21480.field_954.method_14784(var4);
         if (var5 != -1) {
            if (var4 != var5) {
               var1.method_23257(class_8039.field_41157, 0, var5);
            }
         } else {
            var1.method_23245();
         }
      });
   }
}
