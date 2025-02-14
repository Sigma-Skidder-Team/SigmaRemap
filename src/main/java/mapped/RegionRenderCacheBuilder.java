package mapped;

import java.util.Map;
import java.util.stream.Collectors;

public class RegionRenderCacheBuilder {
   private static String[] field33612;
   private final Map<RenderType, BufferBuilder> field33613 = RenderType.method14349()
      .stream()
      .collect(Collectors.toMap(var0 -> (RenderType)var0, var0 -> new BufferBuilder(var0.method14350())));

   public BufferBuilder getBuilder(RenderType var1) {
      return this.field33613.get(var1);
   }

   public void method26204() {
      this.field33613.values().forEach(BufferBuilder::reset);
   }

   public void method26205() {
      this.field33613.values().forEach(BufferBuilder::method17072);
   }
}
