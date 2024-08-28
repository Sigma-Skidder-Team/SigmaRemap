package mapped;

public class Class9084 {
   private static boolean field41584 = false;
   private static long field41585 = -1L;
   private static int field41586 = 0;
   private static int field41587 = 0;
   private static boolean field41588 = false;
   private static boolean field41589 = false;
   private static final long field41590 = 3000L;
   private static final int field41591 = 10;

   public static void method33876() {
      field41584 = true;
      if (field41585 < 0L) {
         field41585 = System.currentTimeMillis();
      }

      if (System.currentTimeMillis() > field41585 + 3000L) {
         if (field41587 > 0) {
            Class7944.method26813("Suppressed " + field41586 + " OpenGL errors");
         }

         field41588 = field41586 > 10;
         field41585 = System.currentTimeMillis();
         field41586 = 0;
         field41587 = 0;
         field41589 = true;
      }
   }

   public static boolean method33877(int var0) {
      if (field41584) {
         field41586++;
         if (!field41589) {
            if (field41588) {
               field41587++;
            }

            return !field41588;
         } else {
            field41589 = false;
            return true;
         }
      } else {
         return true;
      }
   }
}
