package mapped;

import com.google.common.collect.BiMap;
import java.util.Map;
import javax.annotation.Nullable;

public final class Class7983<T> implements Class7984<T> {
   private static String[] field34308;
   private final ITag<T> field34309;
   public final BiMap field34310;

   public Class7983(BiMap var1) {
      this.field34310 = var1;
      this.field34309 = Class7609.method24925();
   }

   @Override
   public ITag<T> method27132(ResourceLocation var1) {
      return (ITag<T>)this.field34310.getOrDefault(var1, this.field34309);
   }

   @Nullable
   @Override
   public ResourceLocation method27133(ITag<T> var1) {
      return !(var1 instanceof Class7610) ? (ResourceLocation)this.field34310.inverse().get(var1) : ((Class7610)var1).method24929();
   }

   @Override
   public Map<ResourceLocation, ITag<T>> method27134() {
      return this.field34310;
   }
}
