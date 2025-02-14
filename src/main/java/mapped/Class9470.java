package mapped;

public class Class9470 {
   private static String[] field44005;

   public static int method36516(int var0) {
      return var0 >>> 24;
   }

   public static int method36517(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method36518(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method36519(int var0) {
      return var0 & 0xFF;
   }

   public static int method36520(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   public static int method36521(int var0, int var1) {
      return method36520(
         method36516(var0) * method36516(var1) / 255,
         method36517(var0) * method36517(var1) / 255,
         method36518(var0) * method36518(var1) / 255,
         method36519(var0) * method36519(var1) / 255
      );
   }
}
