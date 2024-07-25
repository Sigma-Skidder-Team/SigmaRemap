package remapped;

import javax.annotation.Nullable;

public class class_2889 extends class_8285 {
   private static String[] field_14137;
   public final float field_14136;

   public class_2889(class_4612 var1, double var2) {
      this(var1, var2, 0.001F);
   }

   public class_2889(class_4612 var1, double var2, float var4) {
      super(var1, var2);
      this.field_14136 = var4;
   }

   @Nullable
   @Override
   public class_1343 method_38233() {
      if (!this.field_42465.method_37134()) {
         return !(this.field_42465.method_26594().nextFloat() >= this.field_14136) ? super.method_38233() : class_3425.method_15834(this.field_42465, 10, 7);
      } else {
         class_1343 var3 = class_3425.method_15834(this.field_42465, 15, 7);
         return var3 != null ? var3 : super.method_38233();
      }
   }
}
