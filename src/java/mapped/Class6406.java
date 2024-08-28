package mapped;

public class Class6406 {
   private static String[] field28027;
   private static int[] field28028 = new int[65536];

   public static void method19508(int[] var0) {
      field28028 = var0;
   }

   public static int method19509(double var0, double var2) {
      var2 *= var0;
      int var6 = (int)((1.0 - var0) * 255.0);
      int var7 = (int)((1.0 - var2) * 255.0);
      int var8 = var7 << 8 | var6;
      return var8 <= field28028.length ? field28028[var8] : -65281;
   }
}
