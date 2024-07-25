package remapped;

public class class_4953 implements class_857 {
   private static String[] field_25637;

   public class_4953(class_6132 var1) {
      this.field_25636 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23242(class_8039.field_41157);
      int var5 = var1.<Integer>method_23242(class_8039.field_41157);
      var1.method_23245();
      if (var4 != 383) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = this.field_25636.field_31476.method_39635().method_28215().get(var4 << 4 | var6);
            if (var7 == -1) {
               break;
            }

            class_5051 var8 = var1.method_23259(24);
            var8.method_23236(class_8039.field_41157, var7);
            var8.method_23236(class_8039.field_41157, var5);
            var8.method_23233(class_8633.class);
         }
      } else {
         for (int var9 = 0; var9 < 44; var9++) {
            Integer var10 = this.field_25636.field_31476.method_39635().method_28215().get(var4 << 16 | var9);
            if (var10 == null) {
               break;
            }

            class_5051 var11 = var1.method_23259(24);
            var11.method_23236(class_8039.field_41157, var10);
            var11.method_23236(class_8039.field_41157, var5);
            var11.method_23233(class_8633.class);
         }
      }
   }
}
