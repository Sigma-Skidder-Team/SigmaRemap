package remapped;

import java.util.Arrays;

public class class_9363 extends class_5024 {
   private static String[] field_47821;

   public class_9363(class_5024 var1, class_5155 var2) {
      super(
         method_43304(var1.method_23155(), var1.method_23148(), var2),
         var1.method_23160(),
         class_7265.method_33195(var1.method_23155()),
         var2,
         var1.method_23168()
      );
   }

   private static int[] method_43304(int[] var0, class_5155 var1, class_5155 var2) {
      int[] var5 = Arrays.copyOf(var0, var0.length);

      for (int var6 = 0; var6 < 4; var6++) {
         class_2868 var7 = class_7985.field_40918;
         int var8 = var7.method_13180() * var6;
         int var9 = var7.method_13176(2) / 4;
         var5[var8 + var9] = Float.floatToRawIntBits(var2.method_23602((double)var1.method_23620(Float.intBitsToFloat(var0[var8 + var9]))));
         var5[var8 + var9 + 1] = Float.floatToRawIntBits(var2.method_23639((double)var1.method_23597(Float.intBitsToFloat(var0[var8 + var9 + 1]))));
      }

      return var5;
   }
}
