package remapped;

import java.util.List;

public class class_4223 extends class_3893 {
   private static String[] field_20493;

   public class_4223(class_3839 var1) {
      this.field_20492 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var0 -> {
         int var3 = var0.<Integer>method_23261(class_8039.field_41157);
         var0.<String>method_23261(class_8039.field_41171);
         var0.<Integer>method_23261(class_8039.field_41138);
         int var4 = var0.<Integer>method_23261(class_8039.field_41157);
         class_3790 var5 = var0.method_23255().method_6744();
         var5.method_17603(var3);
         if (class_3446.method_15883().method_33743().<class_2070>method_24490(class_2070.class) == null) {
            var0.method_23255().method_6718(false);
         } else {
            int var6 = class_3446.method_15883().method_33743().<class_2070>method_24490(class_2070.class).method_9669(var0.method_23255());
            var5.method_17601(var6);
            List var7 = null;
            if (var5.method_17604() >= var6 || class_3446.method_15886().method_34629()) {
               var7 = class_6710.method_30789(var5.method_17604(), var6);
            }

            class_9200 var8 = var0.method_23255().method_6744().method_17596();
            if (var7 != null) {
               for (class_7794 var10 : var7) {
                  var8.method_42444((class_4106)var10.method_35352());
                  class_6710.method_30783((Class<? extends class_4106>)((class_4106)var10.method_35352()).getClass());
               }

               class_412 var11 = class_412.method_2051(var6);
               var0.method_23257(class_8039.field_41157, 0, var11.method_2047());
            }

            var8.method_42444(class_6710.method_30781(var6));
            if (var4 == 1) {
               var5.method_17599(class_1730.field_8919);
            }

            if (var4 == 2) {
               var5.method_17599(class_1730.field_8922);
            }
         }
      });
   }
}
