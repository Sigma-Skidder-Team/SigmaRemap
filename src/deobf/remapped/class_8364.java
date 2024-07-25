package remapped;

import com.google.common.collect.ImmutableMap;

public class class_8364 extends class_5920<class_5834> {
   private static String[] field_42835;

   public class_8364() {
      super(ImmutableMap.of(class_6044.field_30871, class_561.field_3320));
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      return var1.field_33033.nextFloat() > 0.95F;
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      class_1331 var8 = var7.<class_8150>method_5138(class_6044.field_30871).get().method_37409();
      if (var8.method_12171(var2.method_37075(), 3.0)) {
         class_2522 var9 = var1.method_28262(var8);
         if (var9.method_8350(class_4783.field_23870)) {
            class_6722 var10 = (class_6722)var9.method_8360();
            var10.method_30850(var1, var8, (class_240)null);
         }
      }
   }
}
