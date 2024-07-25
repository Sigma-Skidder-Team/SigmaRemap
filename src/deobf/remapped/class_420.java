package remapped;

public final class class_420 {
   private static String[] field_1777;
   public static final long field_1776 = 65536L;
   public static class_7332 field_1778;
   public static long field_1779;

   private class_420() {
   }

   public static class_7332 method_2091() {
      synchronized (class_420.class) {
         if (field_1778 != null) {
            class_7332 var3 = field_1778;
            field_1778 = var3.field_37475;
            var3.field_37475 = null;
            field_1779 -= 8192L;
            return var3;
         }
      }

      return new class_7332();
   }

   public static void method_2090(class_7332 var0) {
      if (var0.field_37475 != null || var0.field_37480 != null) {
         throw new IllegalArgumentException();
      } else if (!var0.field_37476) {
         synchronized (class_420.class) {
            if (field_1779 + 8192L <= 65536L) {
               field_1779 += 8192L;
               var0.field_37475 = field_1778;
               var0.field_37477 = var0.field_37484 = 0;
               field_1778 = var0;
            }
         }
      }
   }
}
