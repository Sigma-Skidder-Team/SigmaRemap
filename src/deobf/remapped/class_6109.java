package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.function.Predicate;

public class class_6109 extends class_5920<class_5834> {
   private static String[] field_31246;
   private final Predicate<class_5834> field_31248;
   private final float field_31247;

   public class_6109(class_4565 var1, float var2) {
      this(var1x -> var1.equals(var1x.method_37387().method_30476()), var2);
   }

   public class_6109(class_6629<?> var1, float var2) {
      this(var1x -> var1.equals(var1x.method_37387()), var2);
   }

   public class_6109(float var1) {
      this(var0 -> true, var1);
   }

   public class_6109(Predicate<class_5834> var1, float var2) {
      super(ImmutableMap.of(class_6044.field_30874, class_561.field_3318, class_6044.field_30901, class_561.field_3320));
      this.field_31248 = var1;
      this.field_31247 = var2 * var2;
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      return var2.method_26525().<List<class_5834>>method_5138(class_6044.field_30901).get().stream().anyMatch(this.field_31248);
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.<List<class_5834>>method_5138(class_6044.field_30901)
         .ifPresent(
            var3x -> var3x.stream()
                  .filter(this.field_31248)
                  .filter(var2xx -> var2xx.method_37275(var2) <= (double)this.field_31247)
                  .findFirst()
                  .ifPresent(var1xx -> var7.method_5105(class_6044.field_30874, new class_4843(var1xx, true)))
         );
   }
}
