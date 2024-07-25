package remapped;

public class class_5176 implements class_857 {
   private static String[] field_26639;

   public class_5176(class_6692 var1) {
      this.field_26640 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23242(class_8039.field_41157);
      if (class_3446.method_15884().method_25847() && var4 == 0) {
         var1.method_23257(class_8039.field_41175, 0, (short)(var1.<Short>method_23248(class_8039.field_41175, 0).intValue() | 128));
      }

      var1.method_23265(class_6890.class, true, true);
      var1.method_23245();
      class_3446.method_15883().method_33743().<class_4160>method_24490(class_4160.class).method_19299(var1.method_23255(), var4);
   }
}
