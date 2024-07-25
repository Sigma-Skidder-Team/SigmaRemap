package remapped;

public class class_5055 {
   private static final String field_26130 = System.getProperty("line.separator");
   private static char[] field_26128 = new char[64];
   private static byte[] field_26129;

   public static String method_23305(String var0) {
      return new String(method_23302(var0.getBytes()));
   }

   public static String method_23300(byte[] var0) {
      return method_23301(var0, 0, var0.length, 76, field_26130);
   }

   public static String method_23301(byte[] var0, int var1, int var2, int var3, String var4) {
      int var7 = var3 * 3 / 4;
      if (var7 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var8 = (var2 + var7 - 1) / var7;
         int var9 = (var2 + 2) / 3 * 4 + var8 * var4.length();
         StringBuilder var10 = new StringBuilder(var9);
         int var11 = 0;

         while (var11 < var2) {
            int var12 = Math.min(var2 - var11, var7);
            var10.append(method_23304(var0, var1 + var11, var12));
            var10.append(var4);
            var11 += var12;
         }

         return var10.toString();
      }
   }

   public static char[] method_23302(byte[] var0) {
      return method_23304(var0, 0, var0.length);
   }

   public static char[] method_23303(byte[] var0, int var1) {
      return method_23304(var0, 0, var1);
   }

   public static char[] method_23304(byte[] var0, int var1, int var2) {
      int var5 = (var2 * 4 + 2) / 3;
      int var6 = (var2 + 2) / 3 * 4;
      char[] var7 = new char[var6];
      int var8 = var1;
      int var9 = var1 + var2;

      for (int var10 = 0; var8 < var9; var10++) {
         int var11 = var0[var8++] & 255;
         int var12 = var8 >= var9 ? 0 : var0[var8++] & 255;
         int var13 = var8 >= var9 ? 0 : var0[var8++] & 255;
         int var14 = var11 >>> 2;
         int var15 = (var11 & 3) << 4 | var12 >>> 4;
         int var16 = (var12 & 15) << 2 | var13 >>> 6;
         int var17 = var13 & 63;
         var7[var10++] = field_26128[var14];
         var7[var10++] = field_26128[var15];
         var7[var10] = var10 >= var5 ? 61 : field_26128[var16];
         var7[var10] = var10 >= var5 ? 61 : field_26128[var17];
         var10++;
      }

      return var7;
   }

   public static String method_23298(String var0) {
      return new String(method_23295(var0));
   }

   public static byte[] method_23299(String var0) {
      char[] var3 = new char[var0.length()];
      int var4 = 0;

      for (int var5 = 0; var5 < var0.length(); var5++) {
         char var6 = var0.charAt(var5);
         if (var6 != ' ' && var6 != '\r' && var6 != '\n' && var6 != '\t') {
            var3[var4++] = var6;
         }
      }

      return method_23297(var3, 0, var4);
   }

   public static byte[] method_23295(String var0) {
      return method_23296(var0.toCharArray());
   }

   public static byte[] method_23296(char[] var0) {
      return method_23297(var0, 0, var0.length);
   }

   public static byte[] method_23297(char[] var0, int var1, int var2) {
      if (var2 % 4 != 0) {
         throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
      } else {
         while (var2 > 0 && var0[var1 + var2 - 1] == '=') {
            var2--;
         }

         int var5 = var2 * 3 / 4;
         byte[] var6 = new byte[var5];
         int var7 = var1;
         int var8 = var1 + var2;
         int var9 = 0;

         while (var7 < var8) {
            char var10 = var0[var7++];
            char var11 = var0[var7++];
            char var12 = var7 >= var8 ? 65 : var0[var7++];
            char var13 = var7 >= var8 ? 65 : var0[var7++];
            if (var10 <= 127 && var11 <= 127 && var12 <= 127 && var13 <= 127) {
               byte var14 = field_26129[var10];
               byte var15 = field_26129[var11];
               byte var16 = field_26129[var12];
               byte var17 = field_26129[var13];
               if (var14 >= 0 && var15 >= 0 && var16 >= 0 && var17 >= 0) {
                  int var18 = var14 << 2 | var15 >>> 4;
                  int var19 = (var15 & 15) << 4 | var16 >>> 2;
                  int var20 = (var16 & 3) << 6 | var17;
                  var6[var9++] = (byte)var18;
                  if (var9 < var5) {
                     var6[var9++] = (byte)var19;
                  }

                  if (var9 < var5) {
                     var6[var9++] = (byte)var20;
                  }
                  continue;
               }

               throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }

            throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
         }

         return var6;
      }
   }

   private class_5055() {
   }

   static {
      int var4 = 0;
      char var5 = 'A';

      while (var5 <= 'Z') {
         field_26128[var4++] = var5++;
      }

      var5 = 'a';

      while (var5 <= 'z') {
         field_26128[var4++] = var5++;
      }

      var5 = '0';

      while (var5 <= '9') {
         field_26128[var4++] = var5++;
      }

      field_26128[var4++] = '+';
      field_26128[var4++] = '/';
      field_26129 = new byte[128];

      for (int var10 = 0; var10 < field_26129.length; var10++) {
         field_26129[var10] = -1;
      }

      for (int var11 = 0; var11 < 64; var11++) {
         field_26129[field_26128[var11]] = (byte)var11;
      }
   }
}
