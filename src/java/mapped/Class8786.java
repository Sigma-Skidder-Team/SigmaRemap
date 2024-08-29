package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface Class8786 {
   Class8786 field39521 = new Class8787();

   static Class8786 method31714(World var0, BlockPos var1) {
      return new Class8785(var0, var1);
   }

   <T> Optional<T> method31713(BiFunction<World, BlockPos, T> var1);

   default <T> T method31715(BiFunction<World, BlockPos, T> var1, T var2) {
      return this.<T>method31713(var1).orElse((T)var2);
   }

   default void method31716(BiConsumer<World, BlockPos> var1) {
      this.<Optional>method31713((var1x, var2) -> {
         var1.accept(var1x, var2);
         return Optional.empty();
      });
   }
}
