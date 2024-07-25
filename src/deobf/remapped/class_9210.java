package remapped;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface class_9210 {
   class_9210 field_47106 = new class_6495();

   static class_9210 method_42530(class_6486 var0, class_1331 var1) {
      return new class_5883(var0, var1);
   }

   <T> Optional<T> method_42531(BiFunction<class_6486, class_1331, T> var1);

   default <T> T method_42532(BiFunction<class_6486, class_1331, T> var1, T var2) {
      return this.<T>method_42531(var1).orElse((T)var2);
   }

   default void method_42533(BiConsumer<class_6486, class_1331> var1) {
      this.<Optional>method_42531((var1x, var2) -> {
         var1.accept(var1x, var2);
         return Optional.empty();
      });
   }
}
