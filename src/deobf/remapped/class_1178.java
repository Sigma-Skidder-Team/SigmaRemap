package remapped;

import java.util.UUID;

public final class class_1178 extends class_3893 {
   public class_1178(class_757 var1) {
      this.field_6640 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         var1.<Integer>method_23261(class_8039.field_41157);
         int var4 = var1.<Integer>method_23261(class_8039.field_41179);
         int var5 = var4;

         for (int var6 = 0; var6 < var4; var6++) {
            String var7 = var1.<String>method_23242(class_8039.field_41171);
            String var8 = (String)var0.method_3424().method_8667().get(var7);
            if (var8 == null) {
               var8 = "minecraft:" + var7;
               if (!class_9333.method_43099(var8)) {
                  if (!class_3446.method_15884().method_25845()) {
                     class_3446.method_15886().method_34617().warning("Invalid attribute: " + var7);
                  }

                  var5--;
                  var1.<Double>method_23242(class_8039.field_41147);
                  int var11 = var1.<Integer>method_23242(class_8039.field_41157);

                  for (int var12 = 0; var12 < var11; var12++) {
                     var1.<UUID>method_23242(class_8039.field_41150);
                     var1.<Double>method_23242(class_8039.field_41147);
                     var1.<Byte>method_23242(class_8039.field_41133);
                  }
                  continue;
               }
            }

            var1.method_23236(class_8039.field_41171, var8);
            var1.<Double>method_23261(class_8039.field_41147);
            int var9 = var1.<Integer>method_23261(class_8039.field_41157);

            for (int var10 = 0; var10 < var9; var10++) {
               var1.<UUID>method_23261(class_8039.field_41150);
               var1.<Double>method_23261(class_8039.field_41147);
               var1.<Byte>method_23261(class_8039.field_41133);
            }
         }

         if (var4 != var5) {
            var1.method_23257(class_8039.field_41179, 0, var5);
         }
      });
   }
}
