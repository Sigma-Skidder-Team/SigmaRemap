package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_2185 {
   field_10876(0),
   field_10868(1),
   field_10867(2),
   field_10873(3),
   field_10877(4),
   field_10871(5),
   field_10870(6);

   private static final class_2185[] field_10872 = Arrays.<class_2185>stream(values())
      .sorted(Comparator.comparingInt(class_2185::method_10146))
      .<class_2185>toArray(class_2185[]::new);
   private final int field_10869;

   private class_2185(int var3) {
      this.field_10869 = var3;
   }

   public int method_10146() {
      return this.field_10869;
   }

   public static class_2185 method_10145(int var0) {
      return field_10872[var0 % field_10872.length];
   }
}
