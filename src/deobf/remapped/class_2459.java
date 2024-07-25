package remapped;

public class class_2459 implements class_857 {
   private static String[] field_12310;

   public class_2459(class_4273 var1) {
      this.field_12309 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_9371 var4 = var1.<class_9371>method_23248(class_8039.field_41137, 0);
      int var5 = class_2750.method_12391(var1.<Integer>method_23248(class_8039.field_41157, 0));
      class_1455 var6 = var1.method_23255();
      if (class_3446.method_15884().method_25803()) {
         class_7943.method_35960(var6, var4.method_43340(), var4.method_43342(), var4.method_43343(), var5);
         var5 = class_7943.method_35968(var6, var4, var5);
      }

      var1.method_23257(class_8039.field_41157, 0, class_2750.method_12393(var1.method_23255(), var4, var5));
      if (class_3446.method_15884().method_25803()) {
         var1.method_23235(class_8633.class, true, true);
         var1.method_23245();
         class_7943.method_35972(var6, var4);
      }
   }
}
