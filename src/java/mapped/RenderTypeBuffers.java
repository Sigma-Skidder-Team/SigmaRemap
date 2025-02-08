package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import net.minecraft.util.Util;

import java.util.SortedMap;

public class RenderTypeBuffers {
   private final RegionRenderCacheBuilder fixedBuilder = new RegionRenderCacheBuilder();
   public final SortedMap<RenderType, BufferBuilder> fixedBuffers = Util.make(
      new Object2ObjectLinkedOpenHashMap<>(), var1 -> {
         var1.put(Class8624.method30906(), this.fixedBuilder.getBuilder(RenderType.method14300()));
         var1.put(Class8624.method30907(), this.fixedBuilder.getBuilder(RenderType.method14302()));
         var1.put(Class8624.method30900(), this.fixedBuilder.getBuilder(RenderType.method14301()));
         var1.put(Class8624.method30909(), this.fixedBuilder.getBuilder(RenderType.method14304()));
         method26534(var1, Class8624.method30901());
         method26534(var1, Class8624.method30902());
         method26534(var1, Class8624.method30903());
         method26534(var1, Class8624.method30904());
         method26534(var1, Class8624.method30905());
         method26534(var1, RenderType.method14307());
         method26534(var1, RenderType.method14331());
         method26534(var1, RenderType.method14332());
         method26534(var1, RenderType.method14334());
         method26534(var1, RenderType.method14335());
         method26534(var1, RenderType.method14333());
         method26534(var1, RenderType.method14336());
         method26534(var1, RenderType.method14337());
         method26534(var1, RenderType.method14328());
         ModelBakery.field40518.forEach(var1x -> method26534(var1, var1x));
      }
   );
   private final IRenderTypeBuffer.Impl field33891 = IRenderTypeBuffer.getImpl(this.fixedBuffers, new BufferBuilder(256));
   private final IRenderTypeBuffer.Impl field33892 = IRenderTypeBuffer.getImpl(new BufferBuilder(256));
   private final Class7734 field33893 = new Class7734(this.field33891);

   private static void method26534(Object2ObjectLinkedOpenHashMap<RenderType, BufferBuilder> var0, RenderType var1) {
      var0.put(var1, new BufferBuilder(var1.method14350()));
   }

   public RegionRenderCacheBuilder method26535() {
      return this.fixedBuilder;
   }

   public IRenderTypeBuffer.Impl getBufferSource() {
      return this.field33891;
   }

   public IRenderTypeBuffer.Impl method26537() {
      return this.field33892;
   }

   public Class7734 method26538() {
      return this.field33893;
   }
}
