package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;

public class class_8148<E extends class_5886> extends class_5920<E> {
   private static String[] field_41777;
   private final int field_41776;
   private final float field_41778;

   public class_8148(int var1, float var2) {
      super(
         ImmutableMap.of(
            class_6044.field_30889,
            class_561.field_3318,
            class_6044.field_30874,
            class_561.field_3319,
            class_6044.field_30884,
            class_561.field_3320,
            class_6044.field_30901,
            class_561.field_3320
         )
      );
      this.field_41776 = var1;
      this.field_41778 = var2;
   }

   public boolean method_37405(class_6331 var1, E var2) {
      return this.method_37403((E)var2) && this.method_37402((E)var2);
   }

   public void method_37401(class_6331 var1, E var2, long var3) {
      var2.method_26525().method_5105(class_6044.field_30874, new class_4843(this.method_37404((E)var2), true));
      var2.method_26905().method_12884(-this.field_41778, 0.0F);
      var2.field_41701 = class_9299.method_42789(var2.field_41701, var2.field_29618, 0.0F);
   }

   private boolean method_37403(E var1) {
      return var1.method_26525().<List<class_5834>>method_5138(class_6044.field_30901).get().contains(this.method_37404((E)var1));
   }

   private boolean method_37402(E var1) {
      return this.method_37404((E)var1).method_37124(var1, (double)this.field_41776);
   }

   private class_5834 method_37404(E var1) {
      return var1.method_26525().<class_5834>method_5138(class_6044.field_30884).get();
   }
}
