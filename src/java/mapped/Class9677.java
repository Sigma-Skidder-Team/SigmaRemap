package mapped;

public final class Class9677 {
   public static void method37751(byte[] var0, long var1, byte[] var3, long var4) {
      int var8 = var3.length;
      int var9 = 0;

      while ((long)var9 < var1) {
         int var10 = (int)(var4 % (long)var8);
         var0[var9] ^= var3[var10];
         var9++;
         var4++;
      }
   }

   public static String method37752(int var0) {
      if (var0 >= 1000 && var0 < 5000) {
         return var0 >= 1004 && var0 <= 1006 || var0 >= 1012 && var0 <= 2999 ? "Code " + var0 + " is reserved and may not be used." : null;
      } else {
         return "Code must be in range [1000,5000): " + var0;
      }
   }

   public static void method37753(int var0) {
      String var3 = method37752(var0);
      if (var3 != null) {
         throw new IllegalArgumentException(var3);
      }
   }

   public static String method37754(String var0) {
      return Class2003.method8433(var0 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").method8439().method8437();
   }

   private Class9677() {
      throw new AssertionError("No instances.");
   }
}
