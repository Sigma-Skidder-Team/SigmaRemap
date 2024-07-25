package remapped;

import java.nio.charset.StandardCharsets;

public class class_4517 {
   public static final char[] field_22060 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

   public static String method_20988(byte[] var0, int var1, int var2) {
      int var5 = var2 - 1;
      int var6 = var1 <= var5 ? var1 : var5;

      while (0 != var0[var6] && var6 < var5) {
         var6++;
      }

      return new String(var0, var1, var6 - var1, StandardCharsets.UTF_8);
   }

   public static int method_20987(byte[] var0, int var1) {
      return method_20986(var0, var1, var0.length);
   }

   public static int method_20986(byte[] var0, int var1, int var2) {
      return 0 <= var2 - var1 - 4 ? var0[var1 + 3] << 24 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1] & 0xFF : 0;
   }

   public static int method_20984(byte[] var0, int var1, int var2) {
      return 0 <= var2 - var1 - 4 ? var0[var1] << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF : 0;
   }

   public static String method_20983(byte var0) {
      return "" + field_22060[(var0 & 240) >>> 4] + field_22060[var0 & 15];
   }
}
