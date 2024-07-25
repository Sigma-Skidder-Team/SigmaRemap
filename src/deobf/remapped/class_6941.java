package remapped;

public class class_6941 {
   private static boolean field_35686 = false;
   private static long field_35680 = -1L;
   private static int field_35682 = 0;
   private static int field_35684 = 0;
   private static boolean field_35685 = false;
   private static boolean field_35681 = false;
   private static final long field_35679 = 3000L;
   private static final int field_35683 = 10;

   public static void method_31755() {
      field_35686 = true;
      if (field_35680 < 0L) {
         field_35680 = System.currentTimeMillis();
      }

      if (System.currentTimeMillis() > field_35680 + 3000L) {
         if (field_35684 > 0) {
            Config.method_14348("Suppressed " + field_35682 + " OpenGL errors");
         }

         field_35685 = field_35682 > 10;
         field_35680 = System.currentTimeMillis();
         field_35682 = 0;
         field_35684 = 0;
         field_35681 = true;
      }
   }

   public static boolean method_31754(int var0) {
      if (field_35686) {
         field_35682++;
         if (!field_35681) {
            if (field_35685) {
               field_35684++;
            }

            return !field_35685;
         } else {
            field_35681 = false;
            return true;
         }
      } else {
         return true;
      }
   }
}
