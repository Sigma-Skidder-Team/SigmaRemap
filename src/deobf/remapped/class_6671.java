package remapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class class_6671 implements class_3606<class_7099, Float2FloatFunction> {
   private static String[] field_34486;

   public class_6671(class_3848 var1) {
      this.field_34485 = var1;
   }

   public Float2FloatFunction method_30616(class_7099 var1, class_7099 var2) {
      return var2x -> Math.max(var1.method_17874(var2x), var2.method_17874(var2x));
   }

   public Float2FloatFunction method_30615(class_7099 var1) {
      return var1::method_17874;
   }

   public Float2FloatFunction method_30617() {
      return this.field_34485::method_17874;
   }
}
