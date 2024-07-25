package remapped;

public final class class_9294 {
   public static final String field_47411 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
   public static final int field_47413 = 128;
   public static final int field_47421 = 64;
   public static final int field_47412 = 32;
   public static final int field_47408 = 16;
   public static final int field_47419 = 15;
   public static final int field_47405 = 8;
   public static final int field_47422 = 128;
   public static final int field_47404 = 127;
   public static final int field_47420 = 0;
   public static final int field_47416 = 1;
   public static final int field_47425 = 2;
   public static final int field_47417 = 8;
   public static final int field_47426 = 9;
   public static final int field_47402 = 10;
   public static final long field_47423 = 125L;
   public static final long field_47410 = 123L;
   public static final int field_47403 = 126;
   public static final long field_47414 = 65535L;
   public static final int field_47406 = 127;
   public static final int field_47424 = 1001;
   public static final int field_47407 = 1002;
   public static final int field_47415 = 1005;
   public static final int field_47418 = 1006;

   public static void method_42771(byte[] var0, long var1, byte[] var3, long var4) {
      int var8 = var3.length;
      int var9 = 0;

      while ((long)var9 < var1) {
         int var10 = (int)(var4 % (long)var8);
         var0[var9] ^= var3[var10];
         var9++;
         var4++;
      }
   }

   public static String method_42767(int var0) {
      if (var0 >= 1000 && var0 < 5000) {
         return var0 >= 1004 && var0 <= 1006 || var0 >= 1012 && var0 <= 2999 ? "Code " + var0 + " is reserved and may not be used." : null;
      } else {
         return "Code must be in range [1000,5000): " + var0;
      }
   }

   public static void method_42768(int var0) {
      String var3 = method_42767(var0);
      if (var3 != null) {
         throw new IllegalArgumentException(var3);
      }
   }

   public static String method_42769(String var0) {
      return class_9091.method_41889(var0 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").method_41896().method_41880();
   }

   private class_9294() {
      throw new AssertionError("No instances.");
   }
}
