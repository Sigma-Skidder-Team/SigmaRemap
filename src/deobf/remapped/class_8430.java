package remapped;

public class class_8430 implements class_857 {
   private static String[] field_43141;

   public class_8430(class_6334 var1) {
      this.field_43142 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23242(class_8039.field_41157);
      var1.method_23246();
      var1.method_23253(8);
      var1.method_23236(class_8039.field_41137, new class_9371(-1, (short)-1, -1));
      var1.method_23236(class_8039.field_41175, (short)255);
      class_9530 var5 = class_6890.method_31576(var1.method_23255());
      if (class_3446.method_15884().method_25805()) {
         class_1189 var6 = var1.method_23255().<class_1189>method_6746(class_1189.class);
         if (var5 == null || !class_6890.method_31575(var5.method_43963())) {
            var6.method_5258(null);
            var6.method_5255(false);
         } else if (var4 == 0) {
            if (!var6.method_5260()) {
               var6.method_5255(true);
               class_9530 var7 = new class_9530(442, (byte)1, (short)0, null);
               var6.method_5258(var7);
            }

            var1.method_23245();
         }
      }

      var1.method_23236(class_8039.field_41149, var5);
      var1.method_23236(class_8039.field_41175, (short)0);
      var1.method_23236(class_8039.field_41175, (short)0);
      var1.method_23236(class_8039.field_41175, (short)0);
   }
}
