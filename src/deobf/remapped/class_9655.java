package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_9655 {
   field_49168(0, "options.off"),
   field_49170(1, "options.clouds.fast"),
   field_49167(2, "options.clouds.fancy");

   private static final class_9655[] field_49172 = Arrays.<class_9655>stream(values())
      .sorted(Comparator.comparingInt(class_9655::method_44549))
      .<class_9655>toArray(class_9655[]::new);
   private final int field_49166;
   private final String field_49171;

   private class_9655(int var3, String var4) {
      this.field_49166 = var3;
      this.field_49171 = var4;
   }

   public int method_44549() {
      return this.field_49166;
   }

   public String method_44550() {
      return this.field_49171;
   }

   public static class_9655 method_44551(int var0) {
      return field_49172[MathHelper.normalizeAngle(var0, field_49172.length)];
   }
}
