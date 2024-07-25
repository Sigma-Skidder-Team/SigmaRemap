package remapped;

import com.google.gson.JsonElement;

public class class_8828 implements class_857 {
   private static String[] field_45152;

   public class_8828(class_3563 var1) {
      this.field_45151 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      if (var4 == 0) {
         var1.<JsonElement>method_23261(class_8039.field_41143);
         var1.<Float>method_23261(class_8039.field_41146);
         var1.<Integer>method_23261(class_8039.field_41157);
         var1.<Integer>method_23261(class_8039.field_41157);
         short var5 = (short)var1.<Byte>method_23242(class_8039.field_41133).byteValue();
         var1.method_23236(class_8039.field_41175, var5);
      }
   }
}
