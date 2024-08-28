package mapped;

import java.nio.charset.StandardCharsets;

public class Class8414 {
   public static final char[] field36073 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

   public static String method29542(byte[] var0, int var1, int var2) {
      int var5 = var2 - 1;
      int var6 = var1 <= var5 ? var1 : var5;

      while (0 != var0[var6] && var6 < var5) {
         var6++;
      }

      return new String(var0, var1, var6 - var1, StandardCharsets.UTF_8);
   }

   public static int method29543(byte[] var0, int var1) {
      return method29544(var0, var1, var0.length);
   }

   public static int method29544(byte[] var0, int var1, int var2) {
      return 0 <= var2 - var1 - 4 ? var0[var1 + 3] << 24 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1] & 0xFF : 0;
   }

   public static int method29545(byte[] var0, int var1, int var2) {
      return 0 <= var2 - var1 - 4 ? var0[var1] << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF : 0;
   }

   public static String method29546(byte var0) {
      return "" + field36073[(var0 & 240) >>> 4] + field36073[var0 & 15];
   }
}
