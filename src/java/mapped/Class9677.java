package mapped;

public final class Class9677 {
   public static final String field45178 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
   public static final int field45179 = 128;
   public static final int field45180 = 64;
   public static final int field45181 = 32;
   public static final int field45182 = 16;
   public static final int field45183 = 15;
   public static final int field45184 = 8;
   public static final int field45185 = 128;
   public static final int field45186 = 127;
   public static final int field45187 = 0;
   public static final int field45188 = 1;
   public static final int field45189 = 2;
   public static final int field45190 = 8;
   public static final int field45191 = 9;
   public static final int field45192 = 10;
   public static final long field45193 = 125L;
   public static final long field45194 = 123L;
   public static final int field45195 = 126;
   public static final long field45196 = 65535L;
   public static final int field45197 = 127;
   public static final int field45198 = 1001;
   public static final int field45199 = 1002;
   public static final int field45200 = 1005;
   public static final int field45201 = 1006;

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
