package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public interface ITag<T> {
   static <T> Codec<ITag<T>> getTagCodec(Supplier<ITagCollection<T>> collectionSupplier) {
      return ResourceLocation.CODEC
         .flatXmap(
            tagId -> Optional.ofNullable(collectionSupplier.get().get(tagId))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + tagId)),
            tag -> Optional.ofNullable(collectionSupplier.get().method27133(tag))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown tag: " + tag))
         );
   }

   boolean contains(T var1);

   List<T> getAllElements();

   default T getRandomElement(Random random) {
      List elements = this.getAllElements();
      return (T)elements.get(random.nextInt(elements.size()));
   }

   static <T> ITag<T> getTagOf(Set<T> elements) {
      return Tag.<T>getTagFromContents(elements);
   }
}
