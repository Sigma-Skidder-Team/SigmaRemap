package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.function.Function;

public interface Class4872 {
   default boolean method15041(IResourceManager var1, ResourceLocation var2) {
      return false;
   }

   default boolean method15042(IResourceManager var1, ResourceLocation var2, Function<ResourceLocation, TextureAtlasSprite> var3) {
      return true;
   }

   default Collection<ResourceLocation> method15043() {
      return ImmutableList.of();
   }
}
