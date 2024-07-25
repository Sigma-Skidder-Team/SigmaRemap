package remapped;

import java.util.Arrays;
import java.util.Comparator;

public enum class_3917 {
   field_19023(0, "small_ball"),
   field_19031(1, "large_ball"),
   field_19029(2, "star"),
   field_19025(3, "creeper"),
   field_19027(4, "burst");

   private static final class_3917[] field_19030 = Arrays.<class_3917>stream(values())
      .sorted(Comparator.comparingInt(var0 -> var0.field_19024))
      .<class_3917>toArray(class_3917[]::new);
   private final int field_19024;
   private final String field_19026;

   private class_3917(int var3, String var4) {
      this.field_19024 = var3;
      this.field_19026 = var4;
   }

   public int method_18131() {
      return this.field_19024;
   }

   public String method_18130() {
      return this.field_19026;
   }

   public static class_3917 method_18129(int var0) {
      return var0 >= 0 && var0 < field_19030.length ? field_19030[var0] : field_19023;
   }
}
