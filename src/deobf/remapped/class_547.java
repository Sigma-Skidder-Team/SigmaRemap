package remapped;

public class class_547 extends class_3893 {
   public class_547(class_2133 var1) {
      this.field_3281 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41179);
      this.method_18028(class_8039.field_41137);
      this.method_18028(class_8039.field_41179);
      this.method_18028(class_8039.field_41161);
      this.method_18025(var0 -> {
         int var3 = var0.<Integer>method_23248(class_8039.field_41179, 0);
         if (var3 == 2002) {
            int var4 = var0.<Integer>method_23248(class_8039.field_41179, 1);
            boolean var5 = false;
            class_7794 var6 = class_286.method_1269(var4);
            if (var6 != null) {
               var4 = (Integer)var6.method_35355();
               var5 = (Boolean)var6.method_35352();
            } else {
               class_3446.method_15886().method_34617().warning("Received unknown 1.11 -> 1.10.2 potion data (" + var4 + ")");
               var4 = 0;
            }

            if (var5) {
               var0.method_23257(class_8039.field_41179, 0, 2007);
            }

            var0.method_23257(class_8039.field_41179, 1, var4);
         }
      });
   }
}
