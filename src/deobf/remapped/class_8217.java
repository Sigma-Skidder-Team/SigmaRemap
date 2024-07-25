package remapped;

public class class_8217 extends class_3893 {
   private static String[] field_42051;

   public class_8217(class_8710 var1) {
      this.field_42050 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8710.method_40035(this.field_42050));
      this.method_18028(class_8039.field_41175);
      this.method_18028(class_8039.field_41175);
      this.method_18028(class_8039.field_41157);
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
         int var5 = class_8710.method_40043(this.field_42050).method_19008().method_28207(var4);
         if (var5 != -1) {
            var1.method_23257(class_8039.field_41157, 0, var5);
         } else {
            var1.method_23245();
         }
      });
   }
}
