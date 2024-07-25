package remapped;

import com.google.common.collect.ImmutableMap;

public class class_4824 extends class_5920<LivingEntity> {
   private static String[] field_24095;

   public class_4824() {
      super(ImmutableMap.of());
   }

   @Override
   public boolean method_27088(class_6331 var1, LivingEntity var2) {
      return var1.field_33033.nextInt(20) == 0;
   }

   @Override
   public void method_27080(class_6331 var1, LivingEntity var2, long var3) {
      class_1150 var7 = var2.method_26525();
      class_2452 var8 = var1.method_28984(var2.method_37075());
      if (var8 == null || var8.method_11277() || var8.method_11295()) {
         var7.method_5130(class_6275.field_32075);
         var7.method_5132(var1.method_29584(), var1.method_29546());
      }
   }
}
