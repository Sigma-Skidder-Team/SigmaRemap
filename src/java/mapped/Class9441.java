package mapped;

public class Class9441 {
   private static String[] field43867;
   private static int[] field43868 = new int[65536];

   public static void method36291(int[] var0) {
      field43868 = var0;
   }

   public static int method36292(double var0, double var2) {
      var2 *= var0;
      int var6 = (int)((1.0 - var0) * 255.0);
      int var7 = (int)((1.0 - var2) * 255.0);
      return field43868[var7 << 8 | var6];
   }

   public static int method36293() {
      return 6396257;
   }

   public static int method36294() {
      return 8431445;
   }

   public static int method36295() {
      return 4764952;
   }
}
