package remapped;

public class class_2564 implements class_5226 {
   public class_2564(class_2450 var1) {
      this.field_12686 = var1;
   }

   @Override
   public void method_23914(class_5051 var1) throws Exception {
      var1.method_23236(class_8039.field_41157, var1.method_23255().<class_3312>method_6746(class_3312.class).method_15185());
      String var4 = var1.method_23255().<class_3312>method_6746(class_3312.class).method_15190();
      int var5;
      int var6;
      if (!var4.endsWith(" ") && !var4.isEmpty()) {
         int var7 = var4.lastIndexOf(32) + 1;
         var5 = var7;
         var6 = var4.length() - var7;
      } else {
         var5 = var4.length();
         var6 = 0;
      }

      var1.method_23236(class_8039.field_41157, var5);
      var1.method_23236(class_8039.field_41157, var6);
      int var10 = var1.<Integer>method_23261(class_8039.field_41157);

      for (int var8 = 0; var8 < var10; var8++) {
         String var9 = var1.<String>method_23242(class_8039.field_41171);
         if (var9.startsWith("/") && var5 == 0) {
            var9 = var9.substring(1);
         }

         var1.method_23236(class_8039.field_41171, var9);
         var1.method_23236(class_8039.field_41161, false);
      }
   }
}
