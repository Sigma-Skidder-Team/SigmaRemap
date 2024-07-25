package remapped;

public class class_5156 implements class_857 {
   private static String[] field_26565;

   public class_5156(class_5528 var1) {
      this.field_26566 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      if (class_3446.method_15884().method_25844()) {
         class_9709 var5 = var1.method_23255().<class_9709>method_6746(class_9709.class);
         if (var5.method_44848(var4)) {
            Double var6 = var1.<Double>method_23248(class_8039.field_41147, 1);
            var6 = var6 - class_3446.method_15884().method_25806();
            var1.method_23257(class_8039.field_41147, 1, var6);
         }
      }
   }
}
