package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public interface class_2307<T> {
   static <T> Codec<class_2307<T>> method_10610(Supplier<class_9349<T>> var0) {
      return class_4639.field_22655
         .flatXmap(
            var1 -> Optional.<class_2307>ofNullable(((class_9349)var0.get()).method_43140(var1))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1)),
            var1 -> Optional.<class_4639>ofNullable(((class_9349)var0.get()).method_43144(var1))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1))
         );
   }

   boolean method_10609(T var1);

   List<T> method_10608();

   default T method_10606(Random var1) {
      List var4 = this.method_10608();
      return (T)var4.get(var1.nextInt(var4.size()));
   }

   static <T> class_2307<T> method_10607(Set<T> var0) {
      return class_7520.<T>method_34262(var0);
   }
}
