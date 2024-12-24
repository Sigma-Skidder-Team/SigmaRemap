package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public interface ITag<T> {
   static <T> Codec<ITag<T>> method24916(Supplier<ITagCollection<T>> var0) {
      return ResourceLocation.CODEC
         .flatXmap(
            var1 -> Optional.ofNullable(var0.get().get(var1))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1)),
            var1 -> Optional.ofNullable(var0.get().method27133(var1))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + var1))
         );
   }

   boolean method24917(T var1);

   List<T> getAllElements();

   default T method24919(Random var1) {
      List var4 = this.getAllElements();
      return (T)var4.get(var1.nextInt(var4.size()));
   }

   static <T> ITag<T> method24920(Set<T> var0) {
      return Tag.<T>method24926(var0);
   }
}
