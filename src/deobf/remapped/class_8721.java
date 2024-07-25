package remapped;

public class class_8721 implements class_857 {
   private static String[] field_44707;

   public class_8721(class_8812 var1) {
      this.field_44708 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      class_1099 var5 = class_1099.method_4872(var4);
      int var6 = 0;
      String var7 = var4;
      if (var5 != null) {
         var6 = var5.method_4874().method_7234();
         var7 = var5.method_4875();
      }

      var1.method_23257(class_8039.field_41171, 0, var7);
      var1.method_23236(class_8039.field_41157, var6);
      if (var5 != null && var5.method_4876()) {
         class_1189 var8 = var1.method_23255().<class_1189>method_6746(class_1189.class);
         int var9 = var1.<Integer>method_23261(class_8039.field_41179);
         int var10 = var1.<Integer>method_23261(class_8039.field_41179);
         int var11 = var1.<Integer>method_23261(class_8039.field_41179);
         if (var8.method_5273((int)Math.floor((double)var9 / 8.0), (int)Math.floor((double)var10 / 8.0), (int)Math.floor((double)var11 / 8.0))) {
            var1.method_23245();
         }
      }
   }
}
