package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class class_5576<E extends LivingEntity> extends class_5920<E> {
   private static String[] field_28330;
   private final Predicate<E> field_28329;
   private final int field_28328;
   private final float field_28327;

   public class_5576(float var1, boolean var2, int var3) {
      this(var0 -> true, var1, var2, var3);
   }

   public class_5576(Predicate<E> var1, float var2, boolean var3, int var4) {
      super(
         ImmutableMap.of(
            class_6044.field_30874,
            class_561.field_3319,
            class_6044.field_30889,
            !var3 ? class_561.field_3318 : class_561.field_3319,
            class_6044.field_30869,
            class_561.field_3320
         )
      );
      this.field_28329 = var1;
      this.field_28328 = var4;
      this.field_28327 = var2;
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      return this.field_28329.test((E)var2) && this.method_25342((E)var2).method_37124(var2, (double)this.field_28328);
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      class_1225.method_5445(var2, this.method_25342((E)var2), this.field_28327, 0);
   }

   private class_91 method_25342(E var1) {
      return var1.method_26525().<class_91>method_5138(class_6044.field_30869).get();
   }
}
