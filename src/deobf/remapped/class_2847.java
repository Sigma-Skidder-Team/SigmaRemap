package remapped;

import java.util.UUID;

public class class_2847 implements class_857 {
   private static String[] field_13961;

   public class_2847(class_4866 var1) {
      this.field_13960 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 1);

      for (int var6 = 0; var6 < var5; var6++) {
         var1.<UUID>method_23261(class_8039.field_41150);
         if (var4 != 0) {
            if (var4 == 1 || var4 == 2) {
               var1.<Integer>method_23261(class_8039.field_41157);
            } else if (var4 != 3) {
               if (var4 != 4) {
               }
            } else {
               boolean var10 = var1.<Boolean>method_23261(class_8039.field_41161);
               if (var10) {
                  class_6890.field_35446.method_6684(var1, var1.<String>method_23242(class_8039.field_41171));
               }
            }
         } else {
            var1.<String>method_23261(class_8039.field_41171);
            int var7 = var1.<Integer>method_23261(class_8039.field_41157);

            for (int var8 = 0; var8 < var7; var8++) {
               var1.<String>method_23261(class_8039.field_41171);
               var1.<String>method_23261(class_8039.field_41171);
               boolean var9 = var1.<Boolean>method_23261(class_8039.field_41161);
               if (var9) {
                  var1.<String>method_23261(class_8039.field_41171);
               }
            }

            var1.<Integer>method_23261(class_8039.field_41157);
            var1.<Integer>method_23261(class_8039.field_41157);
            boolean var11 = var1.<Boolean>method_23261(class_8039.field_41161);
            if (var11) {
               class_6890.field_35446.method_6684(var1, var1.<String>method_23242(class_8039.field_41171));
            }
         }
      }
   }
}
