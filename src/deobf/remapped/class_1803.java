package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_1803 {
   field_9182(0, "options.chat.visibility.full"),
   field_9181(1, "options.chat.visibility.system"),
   field_9186(2, "options.chat.visibility.hidden");

   private static final class_1803[] field_9184 = Arrays.<class_1803>stream(values())
      .sorted(Comparator.comparingInt(class_1803::method_8014))
      .<class_1803>toArray(class_1803[]::new);
   private final int field_9188;
   private final String field_9187;

   private class_1803(int var3, String var4) {
      this.field_9188 = var3;
      this.field_9187 = var4;
   }

   public int method_8014() {
      return this.field_9188;
   }

   public String method_8017() {
      return this.field_9187;
   }

   public static class_1803 method_8015(int var0) {
      return field_9184[MathHelper.normalizeAngle(var0, field_9184.length)];
   }
}
