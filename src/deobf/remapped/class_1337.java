package remapped;

import com.google.common.primitives.Ints;

public class class_1337 implements class_857 {
   private static String[] field_7325;

   public class_1337(class_8156 var1) {
      this.field_7326 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      if (var4 == 0) {
         String var5 = var1.<String>method_23242(class_8039.field_41171);
         Integer var6;
         if (var5.length() < 19 || (var6 = Ints.tryParse(var5.substring(18))) == null) {
            var1.method_23245();
            return;
         }

         var1.method_23236(class_8039.field_41179, var6);
      }

      if (var4 == 1) {
         var1.<Boolean>method_23261(class_8039.field_41161);
         var1.<Boolean>method_23261(class_8039.field_41161);
         var1.<Boolean>method_23242(class_8039.field_41161);
         var1.<Boolean>method_23242(class_8039.field_41161);
      }
   }
}
