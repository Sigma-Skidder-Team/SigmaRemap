package remapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class class_3017 {
   private static String[] field_14808;
   private final class_2848 field_14813 = new class_2848();
   public final SortedMap<RenderLayer, class_9633> field_14810 = Util.<SortedMap<RenderLayer, class_9633>>make(
      new Object2ObjectLinkedOpenHashMap(), var1 -> {
         var1.put(class_5276.method_24074(), this.field_14813.method_12956(RenderLayer.method_16751()));
         var1.put(class_5276.method_24083(), this.field_14813.method_12956(RenderLayer.method_16771()));
         var1.put(class_5276.method_24081(), this.field_14813.method_12956(RenderLayer.method_16756()));
         var1.put(class_5276.method_24072(), this.field_14813.method_12956(RenderLayer.method_16762()));
         method_13794(var1, class_5276.method_24084());
         method_13794(var1, class_5276.method_24070());
         method_13794(var1, class_5276.method_24071());
         method_13794(var1, class_5276.method_24080());
         method_13794(var1, class_5276.method_24082());
         method_13794(var1, RenderLayer.method_16767());
         method_13794(var1, RenderLayer.method_16707());
         method_13794(var1, RenderLayer.method_16711());
         method_13794(var1, RenderLayer.method_16716());
         method_13794(var1, RenderLayer.method_16715());
         method_13794(var1, RenderLayer.method_16739());
         method_13794(var1, RenderLayer.method_16757());
         method_13794(var1, RenderLayer.method_16763());
         method_13794(var1, RenderLayer.method_16728());
         class_6560.field_33452.forEach(var1x -> method_13794(var1, var1x));
      }
   );
   private final class_3758 field_14811 = class_2565.method_11647(this.field_14810, new class_9633(256));
   private final class_3758 field_14809 = class_2565.method_11648(new class_9633(256));
   private final class_3643 field_14812 = new class_3643(this.field_14811);

   private static void method_13794(Object2ObjectLinkedOpenHashMap<RenderLayer, class_9633> var0, RenderLayer var1) {
      var0.put(var1, new class_9633(var1.method_16742()));
   }

   public class_2848 method_13792() {
      return this.field_14813;
   }

   public class_3758 method_13796() {
      return this.field_14811;
   }

   public class_3758 method_13793() {
      return this.field_14809;
   }

   public class_3643 method_13791() {
      return this.field_14812;
   }
}
