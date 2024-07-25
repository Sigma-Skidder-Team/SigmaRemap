package remapped;

public class class_2884 implements class_857 {
   private static String[] field_14122;

   public class_2884(class_8382 var1) {
      this.field_14123 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_9530 var4 = var1.<class_9530>method_23248(class_8039.field_41149, 0);
      if (!class_3446.method_15884().method_25839()) {
         class_4524.method_21022(var4);
      } else {
         byte var5 = var1.<Byte>method_23248(class_8039.field_41133, 0);
         int var6 = var1.<Integer>method_23248(class_8039.field_41157, 0);
         if (var6 == 1 && var5 == 0 && var4 == null) {
            short var7 = var1.<Short>method_23248(class_8039.field_41175, 0);
            short var8 = var1.<Short>method_23248(class_8039.field_41166, 0);
            short var9 = var1.<Short>method_23248(class_8039.field_41166, 1);
            class_9480 var10 = class_3446.method_15883().method_33743().<class_9480>method_24490(class_9480.class);
            boolean var11 = var10.method_43799(var7, var8, var9, var1.method_23255());
            if (var11) {
               var1.method_23245();
            }
         } else {
            class_4524.method_21022(var4);
         }
      }
   }
}
