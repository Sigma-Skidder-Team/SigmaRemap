package remapped;

public enum class_9342 {
   field_47679(0),
   field_47678(1),
   field_47677(2);

   private static final class_9342[] field_47674 = new class_9342[]{field_47679, field_47678, field_47677};
   private final int field_47675;

   private class_9342(int var3) {
      this.field_47675 = var3;
   }

   public int method_43115() {
      return this.field_47675;
   }

   public static class_9342 method_43116(int var0) {
      if (var0 >= 0 && var0 < field_47674.length) {
         return field_47674[var0];
      } else {
         throw new IllegalArgumentException("No operation with value " + var0);
      }
   }
}
