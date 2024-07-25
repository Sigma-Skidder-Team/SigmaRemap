package remapped;

public class class_8164 implements class_5226 {
   private static String[] field_41823;

   public class_8164(class_3258 var1) {
      this.field_41822 = var1;
   }

   @Override
   public void method_23914(class_5051 var1) throws Exception {
      var1.method_23236(class_8039.field_41161, false);
      var1.method_23236(class_8039.field_41140, null);
      if (!var1.method_23243() && class_3446.method_15884().method_25851() > 0) {
         class_3312 var4 = var1.method_23255().<class_3312>method_6746(class_3312.class);
         var1.method_23245();
         var4.method_15193(System.currentTimeMillis() + (long)class_3446.method_15884().method_25851() * 50L);
         var4.method_15192(var1.<String>method_23248(class_8039.field_41171, 0));
      }
   }
}
