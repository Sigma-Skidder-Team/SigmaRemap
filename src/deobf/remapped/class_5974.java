package remapped;

public class class_5974 implements class_857 {
   private static String[] field_30428;

   public class_5974(class_7843 var1) {
      this.field_30427 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.length() > 100) {
         var1.method_23257(class_8039.field_41171, 0, var4.substring(0, 100));
      }
   }
}
