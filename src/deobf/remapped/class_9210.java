package remapped;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface class_9210 {
   class_9210 field_47106 = new class_6495();

   static class_9210 method_42530(World var0, BlockPos var1) {
      return new class_5883(var0, var1);
   }

   <T> Optional<T> method_42531(BiFunction<World, BlockPos, T> var1);

   default <T> T method_42532(BiFunction<World, BlockPos, T> var1, T var2) {
      return this.<T>method_42531(var1).orElse((T)var2);
   }

   default void method_42533(BiConsumer<World, BlockPos> var1) {
      this.<Optional>method_42531((var1x, var2) -> {
         var1.accept(var1x, var2);
         return Optional.empty();
      });
   }
}
