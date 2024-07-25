package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_6168 {
   field_31559(0, "options.ao.off"),
   field_31560(1, "options.ao.min"),
   field_31562(2, "options.ao.max");

   private static final class_6168[] field_31555 = Arrays.<class_6168>stream(values())
      .sorted(Comparator.comparingInt(class_6168::method_28277))
      .<class_6168>toArray(class_6168[]::new);
   private final int field_31558;
   private final String field_31556;

   private class_6168(int var3, String var4) {
      this.field_31558 = var3;
      this.field_31556 = var4;
   }

   public int method_28277() {
      return this.field_31558;
   }

   public String method_28278() {
      return this.field_31556;
   }

   public static class_6168 method_28279(int var0) {
      return field_31555[MathHelper.normalizeAngle(var0, field_31555.length)];
   }
}
