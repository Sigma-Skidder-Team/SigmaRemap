package remapped;

public class class_70 implements class_857 {
   private static String[] field_95;

   public class_70(class_5240 var1) {
      this.field_94 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      for (int var4 = 0; var4 < 3; var4++) {
         float var5 = var1.<Float>method_23248(class_8039.field_41146, var4);
         if (var5 < 0.0F) {
            var5 = (float)((int)var5);
            var1.method_23257(class_8039.field_41146, var4, var5);
         }
      }
   }
}
