package remapped;

public class class_3506 {
   private static String[] field_17183;
   private static long field_17184 = 0L;

   private class_3506() {
   }

   public static long method_16125() {
      return field_17184;
   }

   public static void method_16126(long var0) {
      field_17184 += var0;
   }

   public static void method_16124(long var0) {
      field_17184 -= var0;
      if (field_17184 < 0L) {
         field_17184 = 0L;
      }
   }
}
