package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public interface Class7733 {
   static Class7735 method25595(BufferBuilder var0) {
      return method25596(ImmutableMap.of(), var0);
   }

   static Class7735 method25596(Map<RenderType, BufferBuilder> var0, BufferBuilder var1) {
      return new Class7735(var1, var0);
   }

   Class5422 method25597(RenderType var1);

   default void method25598() {
   }
}
