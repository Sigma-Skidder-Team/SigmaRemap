package mapped;

import java.io.UnsupportedEncodingException;

public final class Class9106 {
   private static final byte[] field41829 = new byte[]{
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      43,
      47
   };
   private static final byte[] field41830 = new byte[]{
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      45,
      95
   };

   private Class9106() {
   }

   public static byte[] method33955(String var0) {
      int var3;
      for (var3 = var0.length(); var3 > 0; var3--) {
         char var4 = var0.charAt(var3 - 1);
         if (var4 != '=' && var4 != '\n' && var4 != '\r' && var4 != ' ' && var4 != '\t') {
            break;
         }
      }

      byte[] var11 = new byte[(int)((long)var3 * 6L / 8L)];
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var3; var8++) {
         char var9 = var0.charAt(var8);
         int var10;
         if (var9 >= 'A' && var9 <= 'Z') {
            var10 = var9 - 'A';
         } else if (var9 >= 'a' && var9 <= 'z') {
            var10 = var9 - 'G';
         } else if (var9 >= '0' && var9 <= '9') {
            var10 = var9 + 4;
         } else if (var9 != '+' && var9 != '-') {
            if (var9 != '/' && var9 != '_') {
               if (var9 != '\n' && var9 != '\r' && var9 != ' ' && var9 != '\t') {
                  return null;
               }
               continue;
            }

            var10 = 63;
         } else {
            var10 = 62;
         }

         var7 = var7 << 6 | (byte)var10;
         if (++var6 % 4 == 0) {
            var11[var5++] = (byte)(var7 >> 16);
            var11[var5++] = (byte)(var7 >> 8);
            var11[var5++] = (byte)var7;
         }
      }

      int var17 = var6 % 4;
      if (var17 != 1) {
         if (var17 != 2) {
            if (var17 == 3) {
               var7 <<= 6;
               var11[var5++] = (byte)(var7 >> 16);
               var11[var5++] = (byte)(var7 >> 8);
            }
         } else {
            var7 <<= 12;
            var11[var5++] = (byte)(var7 >> 16);
         }

         if (var5 != var11.length) {
            byte[] var18 = new byte[var5];
            System.arraycopy(var11, 0, var18, 0, var5);
            return var18;
         } else {
            return var11;
         }
      } else {
         return null;
      }
   }

   public static String method33956(byte[] var0) {
      return method33958(var0, field41829);
   }

   public static String method33957(byte[] var0) {
      return method33958(var0, field41830);
   }

   private static String method33958(byte[] var0, byte[] var1) {
      int var4 = (var0.length + 2) / 3 * 4;
      byte[] var5 = new byte[var4];
      int var6 = 0;
      int var7 = var0.length - var0.length % 3;

      for (int var8 = 0; var8 < var7; var8 += 3) {
         var5[var6++] = var1[(var0[var8] & 255) >> 2];
         var5[var6++] = var1[(var0[var8] & 3) << 4 | (var0[var8 + 1] & 255) >> 4];
         var5[var6++] = var1[(var0[var8 + 1] & 15) << 2 | (var0[var8 + 2] & 255) >> 6];
         var5[var6++] = var1[var0[var8 + 2] & 63];
      }

      switch (var0.length % 3) {
         case 1:
            var5[var6++] = var1[(var0[var7] & 255) >> 2];
            var5[var6++] = var1[(var0[var7] & 3) << 4];
            var5[var6++] = 61;
            var5[var6++] = 61;
            break;
         case 2:
            var5[var6++] = var1[(var0[var7] & 255) >> 2];
            var5[var6++] = var1[(var0[var7] & 3) << 4 | (var0[var7 + 1] & 255) >> 4];
            var5[var6++] = var1[(var0[var7 + 1] & 15) << 2];
            var5[var6++] = 61;
      }

      try {
         return new String(var5, "US-ASCII");
      } catch (UnsupportedEncodingException var9) {
         throw new AssertionError(var9);
      }
   }
}
