package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class RenderTypeBuffers {
   private static String[] field33888;
   private final Class7828 field33889 = new Class7828();
   public final SortedMap<RenderType, BufferBuilder> field33890 = Util.method38508(
      new Object2ObjectLinkedOpenHashMap<>(), var1 -> {
         var1.put(Class8624.method30906(), this.field33889.method26203(RenderType.method14300()));
         var1.put(Class8624.method30907(), this.field33889.method26203(RenderType.method14302()));
         var1.put(Class8624.method30900(), this.field33889.method26203(RenderType.method14301()));
         var1.put(Class8624.method30909(), this.field33889.method26203(RenderType.method14304()));
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
         Class8968.field40518.forEach(var1x -> method26534(var1, var1x));
      }
   );
   private final Class7735 field33891 = Class7733.method25596(this.field33890, new BufferBuilder(256));
   private final Class7735 field33892 = Class7733.method25595(new BufferBuilder(256));
   private final Class7734 field33893 = new Class7734(this.field33891);

   private static void method26534(Object2ObjectLinkedOpenHashMap<RenderType, BufferBuilder> var0, RenderType var1) {
      var0.put(var1, new BufferBuilder(var1.method14350()));
   }

   public Class7828 method26535() {
      return this.field33889;
   }

   public Class7735 method26536() {
      return this.field33891;
   }

   public Class7735 method26537() {
      return this.field33892;
   }

   public Class7734 method26538() {
      return this.field33893;
   }
}
