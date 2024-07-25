package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class class_345<E extends class_5834> extends class_5920<E> {
   private static String[] field_1356;
   private final Predicate<E> field_1357;
   private final class_6044<?> field_1355;

   public class_345(Predicate<E> var1, class_6044<?> var2) {
      super(ImmutableMap.of(var2, class_561.field_3320));
      this.field_1357 = var1;
      this.field_1355 = var2;
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      return this.field_1357.test((E)var2);
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      var2.method_26525().method_5127(this.field_1355);
   }
}
