package remapped;

import java.util.Map;
import java.util.stream.Collectors;

public class class_2848 {
   private static String[] field_13963;
   private final Map<RenderLayer, class_9633> field_13962 = RenderLayer.method_16770()
      .stream()
      .collect(Collectors.toMap(var0 -> (RenderLayer)var0, var0 -> new class_9633(var0.method_16742())));

   public class_9633 method_12956(RenderLayer var1) {
      return this.field_13962.get(var1);
   }

   public void method_12958() {
      this.field_13962.values().forEach(class_9633::method_44463);
   }

   public void method_12957() {
      this.field_13962.values().forEach(class_9633::method_44460);
   }
}
