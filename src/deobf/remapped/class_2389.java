package remapped;

import com.google.gson.JsonElement;

public class class_2389 extends class_3893 {
   private static String[] field_11916;

   public class_2389(class_9078 var1) {
      this.field_11915 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23261(class_8039.field_41157);
         if (var4 >= 0 && var4 <= 2) {
            this.field_11915.method_41802(var1.<JsonElement>method_23261(class_8039.field_41143));
         }
      });
   }
}
