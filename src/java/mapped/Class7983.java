package mapped;

import com.google.common.collect.BiMap;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import javax.annotation.Nullable;

public final class Class7983<T> implements ITagCollection<T> {
   private static String[] field34308;
   private final ITag<T> field34309;
   public final BiMap field34310;

   public Class7983(BiMap var1) {
      this.field34310 = var1;
      this.field34309 = Tag.getEmptyTag();
   }

   @Override
   public ITag<T> method27132(ResourceLocation var1) {
      return (ITag<T>)this.field34310.getOrDefault(var1, this.field34309);
   }

   @Nullable
   @Override
   public ResourceLocation method27133(ITag<T> var1) {
      return !(var1 instanceof ITag$NamedTag) ? (ResourceLocation)this.field34310.inverse().get(var1) : ((ITag$NamedTag)var1).getName();
   }

   @Override
   public Map<ResourceLocation, ITag<T>> method27134() {
      return this.field34310;
   }
}
