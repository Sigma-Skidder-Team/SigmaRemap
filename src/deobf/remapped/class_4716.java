package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_4716 extends class_5920<class_4612> {
   private static String[] field_22882;
   private final float field_22884;
   private final int field_22885;
   private final int field_22883;

   public class_4716(float var1) {
      this(var1, 10, 7);
   }

   public class_4716(float var1, int var2, int var3) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318));
      this.field_22884 = var1;
      this.field_22885 = var2;
      this.field_22883 = var3;
   }

   public void method_21809(class_6331 var1, class_4612 var2, long var3) {
      class_1331 var7 = var2.method_37075();
      if (!var1.method_28994(var7)) {
         class_6979 var8 = class_6979.method_31921(var7);
         class_6979 var9 = class_1225.method_5456(var1, var8, 2);
         if (var9 == var8) {
            this.method_21811(var2);
         } else {
            this.method_21810(var2, var9);
         }
      } else {
         this.method_21811(var2);
      }
   }

   private void method_21810(class_4612 var1, class_6979 var2) {
      Optional var5 = Optional.<class_1343>ofNullable(
         class_3425.method_15837(var1, this.field_22885, this.field_22883, class_1343.method_6200(var2.method_31892()))
      );
      var1.method_26525().method_5106(class_6044.field_30889, var5.map(var1x -> new class_6651(var1x, this.field_22884, 0)));
   }

   private void method_21811(class_4612 var1) {
      Optional var4 = Optional.<class_1343>ofNullable(class_3425.method_15834(var1, this.field_22885, this.field_22883));
      var1.method_26525().method_5106(class_6044.field_30889, var4.map(var1x -> new class_6651(var1x, this.field_22884, 0)));
   }
}
