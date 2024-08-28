package mapped;

public class Class8777 {
   private static String[] field39479;
   private static long field39480 = System.currentTimeMillis();
   private static long field39481 = method31651();
   private static long field39482 = field39480;
   private static long field39483 = field39481;
   private static boolean field39484 = false;
   private static int field39485 = 0;
   private static long field39486 = 1048576L;

   public static void method31650() {
      long var2 = System.currentTimeMillis();
      long var4 = method31651();
      field39484 = var4 < field39483;
      if (field39484) {
         long var6 = field39482 - field39480;
         long var8 = field39483 - field39481;
         double var10 = (double)var6 / 1000.0;
         int var12 = (int)((double)var8 / var10);
         if (var12 > 0) {
            field39485 = var12;
         }

         field39480 = var2;
         field39481 = var4;
      }

      field39482 = var2;
      field39483 = var4;
   }

   private static long method31651() {
      Runtime var2 = Runtime.getRuntime();
      return var2.totalMemory() - var2.freeMemory();
   }

   public static long method31652() {
      return field39480;
   }

   public static long method31653() {
      return field39481 / field39486;
   }

   public static boolean method31654() {
      return field39484;
   }

   public static long method31655() {
      return (long)field39485 / field39486;
   }
}
