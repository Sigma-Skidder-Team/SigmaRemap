package remapped;

public class class_5849 {
   private static String[] field_29720;
   private static long field_29722 = System.currentTimeMillis();
   private static long field_29719 = method_26669();
   private static long field_29717 = field_29722;
   private static long field_29723 = field_29719;
   private static boolean field_29718 = false;
   private static int field_29721 = 0;
   private static long field_29716 = 1048576L;

   public static void method_26667() {
      long var2 = System.currentTimeMillis();
      long var4 = method_26669();
      field_29718 = var4 < field_29723;
      if (field_29718) {
         long var6 = field_29717 - field_29722;
         long var8 = field_29723 - field_29719;
         double var10 = (double)var6 / 1000.0;
         int var12 = (int)((double)var8 / var10);
         if (var12 > 0) {
            field_29721 = var12;
         }

         field_29722 = var2;
         field_29719 = var4;
      }

      field_29717 = var2;
      field_29723 = var4;
   }

   private static long method_26669() {
      Runtime var2 = Runtime.getRuntime();
      return var2.totalMemory() - var2.freeMemory();
   }

   public static long method_26668() {
      return field_29722;
   }

   public static long method_26672() {
      return field_29719 / field_29716;
   }

   public static boolean method_26671() {
      return field_29718;
   }

   public static long method_26673() {
      return (long)field_29721 / field_29716;
   }
}
