package remapped;

public class class_1448 implements class_857 {
   private static String[] field_7811;

   public class_1448(class_2501 var1) {
      this.field_7812 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      if (class_3446.method_15884().method_25844()) {
         class_1189 var5 = var1.method_23255().<class_1189>method_6746(class_1189.class);
         if (var5.method_5264().contains(var4)) {
            Double var6 = var1.<Double>method_23248(class_8039.field_41147, 1);
            var6 = var6 + class_3446.method_15884().method_25806();
            var1.method_23257(class_8039.field_41147, 1, var6);
         }
      }
   }
}
