package remapped;

public class class_3199 implements class_857 {
   public class_3199(class_256 var1) {
      this.field_15983 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.equals("minecraft:brewing_stand")) {
         var1.method_23257(class_8039.field_41175, 1, (short)(var1.<Short>method_23248(class_8039.field_41175, 1) + 1));
      }
   }
}
