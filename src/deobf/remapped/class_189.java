package remapped;

import java.nio.charset.Charset;

public final class class_189 {
   public static final Charset field_630 = Charset.forName("UTF-8");

   private class_189() {
   }

   public static void method_830(long var0, long var2, long var4) {
      if ((var2 | var4) < 0L || var2 > var0 || var0 - var2 < var4) {
         throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", var0, var2, var4));
      }
   }

   public static short method_829(short var0) {
      byte var3;
      int var4 = (var3 & '\uff00') >>> 8 | (var3 & 255) << 8;
      return (short)var4;
   }

   public static int method_827(int var0) {
      return (var0 & 0xFF000000) >>> 24 | (var0 & 0xFF0000) >>> 8 | (var0 & 0xFF00) << 8 | (var0 & 0xFF) << 24;
   }

   public static long method_832(long var0) {
      return (var0 & -72057594037927936L) >>> 56
         | (var0 & 71776119061217280L) >>> 40
         | (var0 & 280375465082880L) >>> 24
         | (var0 & 1095216660480L) >>> 8
         | (var0 & 4278190080L) << 8
         | (var0 & 16711680L) << 24
         | (var0 & 65280L) << 40
         | (var0 & 255L) << 56;
   }

   public static void method_826(Throwable var0) {
      method_833(var0);
   }

   private static <T extends Throwable> void method_833(Throwable var0) throws T {
      throw var0;
   }

   public static boolean method_831(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      for (int var7 = 0; var7 < var4; var7++) {
         if (var0[var7 + var1] != var2[var7 + var3]) {
            return false;
         }
      }

      return true;
   }
}
