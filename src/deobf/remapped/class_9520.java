package remapped;

import com.google.common.collect.ImmutableMap;

public class class_9520 extends class_5920<class_5834> {
   private static String[] field_48462;

   public class_9520() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      return var1.field_33033.nextInt(20) == 0;
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      class_2452 var8 = var1.method_28984(var2.method_37075());
      if (var8 != null) {
         if (var8.method_11291() && !var8.method_11266()) {
            var7.method_5130(class_6275.field_32067);
            var7.method_5113(class_6275.field_32067);
         } else {
            var7.method_5130(class_6275.field_32077);
            var7.method_5113(class_6275.field_32077);
         }
      }
   }
}
