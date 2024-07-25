package remapped;

import java.util.Locale;

public enum class_8922 {
   field_45745(0, 0),
   field_45748(0, 1),
   field_45749(0, 2),
   field_45750(0, 3),
   field_45739(0, 4),
   field_45743(0, 5),
   field_45740(1, 0),
   field_45754(1, 1),
   field_45741(1, 2),
   field_45747(1, 3),
   field_45738(1, 4),
   field_45746(1, 5);

   private final int field_45751;
   private final int field_45752;
   private static final class_8922[] field_45742 = values();

   private class_8922(int var3, int var4) {
      this.field_45751 = var3;
      this.field_45752 = var4;
   }

   public int method_41025() {
      return this.field_45751;
   }

   public int method_41028() {
      return this.field_45752;
   }

   public static String method_41024(int var0, int var1) {
      return field_45742[var1 + 6 * var0].method_41026();
   }

   public String method_41026() {
      return this.name().toLowerCase(Locale.ROOT);
   }
}
