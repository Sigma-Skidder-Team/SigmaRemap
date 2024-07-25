package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_8846 {
   field_45245(0, "options.off"),
   field_45243(1, "options.attack.crosshair"),
   field_45241(2, "options.attack.hotbar");

   private static final class_8846[] field_45240 = Arrays.<class_8846>stream(values())
      .sorted(Comparator.comparingInt(class_8846::method_40705))
      .<class_8846>toArray(class_8846[]::new);
   private final int field_45244;
   private final String field_45246;

   private class_8846(int var3, String var4) {
      this.field_45244 = var3;
      this.field_45246 = var4;
   }

   public int method_40705() {
      return this.field_45244;
   }

   public String method_40707() {
      return this.field_45246;
   }

   public static class_8846 method_40706(int var0) {
      return field_45240[MathHelper.normalizeAngle(var0, field_45240.length)];
   }
}
