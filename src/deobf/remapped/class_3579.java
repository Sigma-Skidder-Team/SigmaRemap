package remapped;

public class class_3579 implements class_857 {
   public class_3579(class_8466 var1) {
      this.field_17513 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      byte var4 = var1.<Byte>method_23248(class_8039.field_41133, 0);
      if (var4 == 0 || var4 == 2) {
         String var5 = var1.<String>method_23242(class_8039.field_41171);
         var1.method_23236(class_8039.field_41143, class_68.method_70(var5));
         String var6 = var1.<String>method_23242(class_8039.field_41171);
         var1.method_23236(class_8039.field_41157, !var6.equals("integer") ? 1 : 0);
      }
   }
}
