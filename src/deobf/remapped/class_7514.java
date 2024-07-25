package remapped;

import com.google.gson.JsonElement;

public class class_7514 extends class_3893 {
   private static String[] field_38375;

   public class_7514(class_9078 var1) {
      this.field_38374 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41150);
      this.method_18028(class_8039.field_41157);
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
         if (var4 == 0 || var4 == 3) {
            this.field_38374.method_41802(var1.<JsonElement>method_23261(class_8039.field_41143));
         }
      });
   }
}
