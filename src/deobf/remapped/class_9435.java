package remapped;

public class class_9435 implements class_857 {
   private static String[] field_48176;

   public class_9435(class_9826 var1) {
      this.field_48177 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      byte var5 = var1.<Byte>method_23248(class_8039.field_41133, 0);
      class_4630 var6 = class_5764.method_26066(var5, true);
      if (var6 != null) {
         if (var6.method_3420(class_4630.field_22605)) {
            int var7 = var1.<Integer>method_23248(class_8039.field_41179, 0);
            int var8 = (var7 & 4095) << 4 | var7 >> 12 & 15;
            var1.method_23257(class_8039.field_41179, 0, class_2750.method_12391(var8));
         }

         if (var6.method_3420(class_4630.field_22552)) {
            int var9 = var1.<Integer>method_23248(class_8039.field_41179, 0);
            switch (var9) {
               case 0:
                  var9 = 3;
                  break;
               case 1:
                  var9 = 4;
               case 2:
               default:
                  break;
               case 3:
                  var9 = 5;
            }

            var1.method_23257(class_8039.field_41179, 0, var9);
            var1.method_23255().<class_7053>method_6746(class_7053.class).method_14878(var4, var6);
         }
      }
   }
}
