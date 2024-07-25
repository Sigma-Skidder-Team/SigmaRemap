package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Random;

public class class_1149<E extends class_5886> extends class_5920<E> {
   private static String[] field_6536;
   private final int field_6535;
   private final float field_6537;

   public class_1149(int var1, float var2) {
      super(
         ImmutableMap.of(
            class_6044.field_30895,
            class_561.field_3320,
            class_6044.field_30884,
            class_561.field_3318,
            class_6044.field_30889,
            class_561.field_3318,
            class_6044.field_30874,
            class_561.field_3319
         )
      );
      this.field_6535 = var1;
      this.field_6537 = var2;
   }

   public void method_5094(class_6331 var1, class_5886 var2, long var3) {
      class_1331 var7 = method_5092(var2);
      boolean var8 = var7.method_12171(var2.method_37075(), (double)this.field_6535);
      if (!var8) {
         class_1225.method_5446(var2, method_5091(var2, var7), this.field_6537, this.field_6535);
      }
   }

   private static class_1331 method_5091(class_5886 var0, class_1331 var1) {
      Random var4 = var0.field_41768.field_33033;
      return var1.method_6104(method_5093(var4), 0, method_5093(var4));
   }

   private static int method_5093(Random var0) {
      return var0.nextInt(3) - 1;
   }

   private static class_1331 method_5092(class_5886 var0) {
      return var0.method_26525().<class_1331>method_5138(class_6044.field_30895).get();
   }
}
