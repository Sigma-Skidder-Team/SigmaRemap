package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class class_9273 extends class_5920<class_5834> {
   private static String[] field_47307;
   private final int field_47306;
   private final BiPredicate<class_5834, class_5834> field_47305;

   public class_9273(int var1, BiPredicate<class_5834, class_5834> var2) {
      super(
         ImmutableMap.of(
            class_6044.field_30884,
            class_561.field_3320,
            class_6044.field_30866,
            class_561.field_3319,
            class_6044.field_30895,
            class_561.field_3318,
            class_6044.field_30862,
            class_561.field_3319
         )
      );
      this.field_47306 = var1;
      this.field_47305 = var2;
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      return this.method_42725(var2).method_26450();
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_5834 var7 = this.method_42725(var2);
      if (this.field_47305.test(var2, var7)) {
         var2.method_26525().method_5107(class_6044.field_30862, true, (long)this.field_47306);
      }

      var2.method_26525().method_5107(class_6044.field_30895, var7.method_37075(), (long)this.field_47306);
      if (var7.getType() != EntityType.field_34300 || var1.method_29537().method_1285(class_291.field_1042)) {
         var2.method_26525().method_5127(class_6044.field_30884);
         var2.method_26525().method_5127(class_6044.field_30866);
      }
   }

   private class_5834 method_42725(class_5834 var1) {
      return var1.method_26525().<class_5834>method_5138(class_6044.field_30884).get();
   }
}
