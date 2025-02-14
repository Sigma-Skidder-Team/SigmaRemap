package mapped;

public final class Class5996 {
   private static String[] field26172;
   public static final long field26173 = 65536L;
   public static Class9174 field26174;
   public static long field26175;

   private Class5996() {
   }

   public static Class9174 method18607() {
      synchronized (Class5996.class) {
         if (field26174 != null) {
            Class9174 var3 = field26174;
            field26174 = var3.field42126;
            var3.field42126 = null;
            field26175 -= 8192L;
            return var3;
         }
      }

      return new Class9174();
   }

   public static void method18608(Class9174 var0) {
      if (var0.field42126 != null || var0.field42127 != null) {
         throw new IllegalArgumentException();
      } else if (!var0.field42124) {
         synchronized (Class5996.class) {
            if (field26175 + 8192L <= 65536L) {
               field26175 += 8192L;
               var0.field42126 = field26174;
               var0.field42122 = var0.field42123 = 0;
               field26174 = var0;
            }
         }
      }
   }
}
