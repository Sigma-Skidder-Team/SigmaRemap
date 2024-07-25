package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class class_8962<E extends class_5886> extends class_5920<E> {
   private static String[] field_45912;
   private final Predicate<E> field_45913;
   private final Function<E, Optional<? extends class_5834>> field_45911;

   public class_8962(Predicate<E> var1, Function<E, Optional<? extends class_5834>> var2) {
      super(ImmutableMap.of(class_6044.field_30884, class_561.field_3318, class_6044.field_30909, class_561.field_3319));
      this.field_45913 = var1;
      this.field_45911 = var2;
   }

   public class_8962(Function<E, Optional<? extends class_5834>> var1) {
      this(var0 -> true, var1);
   }

   public boolean method_41120(class_6331 var1, E var2) {
      if (!this.field_45913.test((E)var2)) {
         return false;
      } else {
         Optional var5 = this.field_45911.apply((E)var2);
         return var5.isPresent() && ((class_5834)var5.get()).method_37330();
      }
   }

   public void method_41119(class_6331 var1, E var2, long var3) {
      this.field_45911.apply((E)var2).ifPresent(var2x -> this.method_41121((E)var2, var2x));
   }

   private void method_41121(E var1, class_5834 var2) {
      var1.method_26525().method_5105(class_6044.field_30884, var2);
      var1.method_26525().method_5127(class_6044.field_30909);
   }
}
