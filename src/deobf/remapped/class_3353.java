package remapped;

public class class_3353 implements class_857 {
   private static String[] field_16537;

   public class_3353(class_8005 var1) {
      this.field_16538 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      byte var5 = var1.<Byte>method_23248(class_8039.field_41133, 0);
      class_4630 var6 = class_5764.method_26066(var5, true);
      if (var6 != null) {
         if (var6.method_3420(class_4630.field_22605)) {
            int var7 = var1.<Integer>method_23248(class_8039.field_41179, 0);
            var1.method_23257(class_8039.field_41179, 0, this.field_16538.field_41019.method_19008().method_28217(var7));
         }

         var1.method_23255().<class_7053>method_6746(class_7053.class).method_14878(var4, var6);
      }
   }
}
