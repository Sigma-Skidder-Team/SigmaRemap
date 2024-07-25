package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_180 {
   field_595(0),
   field_599(1),
   field_597(2),
   field_598(3),
   field_594(4);

   private static final class_180[] field_601 = Arrays.<class_180>stream(values())
      .sorted(Comparator.comparingInt(class_180::method_810))
      .<class_180>toArray(class_180[]::new);
   private final int field_596;

   private class_180(int var3) {
      this.field_596 = var3;
   }

   public int method_810() {
      return this.field_596;
   }

   public static class_180 method_811(int var0) {
      return field_601[var0 % field_601.length];
   }
}
