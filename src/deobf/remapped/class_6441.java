package remapped;

import com.google.common.collect.ImmutableMap;

public class class_6441 extends class_5920<class_7666> {
   private static String[] field_32877;
   private final float field_32878;
   private final int field_32879;

   public class_6441(float var1, int var2) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318));
      this.field_32878 = var1;
      this.field_32879 = var2;
   }

   public boolean method_29401(class_6331 var1, class_7666 var2) {
      return !var1.method_28994(var2.method_37075());
   }

   public void method_29400(class_6331 var1, class_7666 var2, long var3) {
      class_1489 var7 = var1.method_28969();
      int var8 = var7.method_6871(class_6979.method_31921(var2.method_37075()));
      class_1343 var9 = null;

      for (int var10 = 0; var10 < 5; var10++) {
         class_1343 var11 = class_3425.method_15846(var2, 15, 7, var1x -> (double)(-var1.method_28956(class_6979.method_31921(var1x))));
         if (var11 != null) {
            int var12 = var7.method_6871(class_6979.method_31921(new class_1331(var11)));
            if (var12 < var8) {
               var9 = var11;
               break;
            }

            if (var12 == var8) {
               var9 = var11;
            }
         }
      }

      if (var9 != null) {
         var2.method_26525().method_5105(class_6044.field_30889, new class_6651(var9, this.field_32878, this.field_32879));
      }
   }
}
