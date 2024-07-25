package remapped;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

public class class_7827 {
   public static final int field_39703 = 0;
   public static final int field_39707 = 1;
   public static final int field_39710 = 2;
   public static final int field_39697 = 8;
   public static final int field_39701 = 16;
   public static final int field_39695 = 32;
   private static final int field_39709 = 76;
   private static final byte field_39704 = 61;
   private static final byte field_39696 = 10;
   private static final String field_39692 = "US-ASCII";
   private static final byte field_39699 = -5;
   private static final byte[] field_39708 = new byte[]{
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
   private static final byte[] field_39694 = new byte[]{
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -5,
      -5,
      -9,
      -9,
      -5,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -5,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      62,
      -9,
      -9,
      -9,
      63,
      52,
      53,
      54,
      55,
      56,
      57,
      58,
      59,
      60,
      61,
      -9,
      -9,
      -9,
      -1,
      -9,
      -9,
      -9,
      0,
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      11,
      12,
      13,
      14,
      15,
      16,
      17,
      18,
      19,
      20,
      21,
      22,
      23,
      24,
      25,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      26,
      27,
      28,
      29,
      30,
      31,
      32,
      33,
      34,
      35,
      36,
      37,
      38,
      39,
      40,
      41,
      42,
      43,
      44,
      45,
      46,
      47,
      48,
      49,
      50,
      51,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9
   };
   private static final byte[] field_39705 = new byte[]{
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
   private static final byte[] field_39693 = new byte[]{
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -5,
      -5,
      -9,
      -9,
      -5,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -5,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      62,
      -9,
      -9,
      52,
      53,
      54,
      55,
      56,
      57,
      58,
      59,
      60,
      61,
      -9,
      -9,
      -9,
      -1,
      -9,
      -9,
      -9,
      0,
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      11,
      12,
      13,
      14,
      15,
      16,
      17,
      18,
      19,
      20,
      21,
      22,
      23,
      24,
      25,
      -9,
      -9,
      -9,
      -9,
      63,
      -9,
      26,
      27,
      28,
      29,
      30,
      31,
      32,
      33,
      34,
      35,
      36,
      37,
      38,
      39,
      40,
      41,
      42,
      43,
      44,
      45,
      46,
      47,
      48,
      49,
      50,
      51,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9
   };
   private static final byte[] field_39698 = new byte[]{
      45,
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
      95,
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
      122
   };
   private static final byte[] field_39702 = new byte[]{
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -5,
      -5,
      -9,
      -9,
      -5,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -5,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      0,
      -9,
      -9,
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      -9,
      -9,
      -9,
      -1,
      -9,
      -9,
      -9,
      11,
      12,
      13,
      14,
      15,
      16,
      17,
      18,
      19,
      20,
      21,
      22,
      23,
      24,
      25,
      26,
      27,
      28,
      29,
      30,
      31,
      32,
      33,
      34,
      35,
      36,
      -9,
      -9,
      -9,
      -9,
      37,
      -9,
      38,
      39,
      40,
      41,
      42,
      43,
      44,
      45,
      46,
      47,
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
      58,
      59,
      60,
      61,
      62,
      63,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9,
      -9
   };

   private static final byte[] method_35447(int var0) {
      if ((var0 & 16) != 16) {
         return (var0 & 32) != 32 ? field_39708 : field_39698;
      } else {
         return field_39705;
      }
   }

   private static final byte[] method_35446(int var0) {
      if ((var0 & 16) != 16) {
         return (var0 & 32) != 32 ? field_39694 : field_39702;
      } else {
         return field_39693;
      }
   }

   private class_7827() {
   }

   private static byte[] method_35440(byte[] var0, byte[] var1, int var2, int var3) {
      method_35439(var1, 0, var2, var0, 0, var3);
      return var0;
   }

   private static byte[] method_35439(byte[] var0, int var1, int var2, byte[] var3, int var4, int var5) {
      byte[] var8 = method_35447(var5);
      int var9 = (var2 > 0 ? var0[var1] << 24 >>> 8 : 0) | (var2 > 1 ? var0[var1 + 1] << 24 >>> 16 : 0) | (var2 > 2 ? var0[var1 + 2] << 24 >>> 24 : 0);
      switch (var2) {
         case 1:
            var3[var4] = var8[var9 >>> 18];
            var3[var4 + 1] = var8[var9 >>> 12 & 63];
            var3[var4 + 2] = 61;
            var3[var4 + 3] = 61;
            return var3;
         case 2:
            var3[var4] = var8[var9 >>> 18];
            var3[var4 + 1] = var8[var9 >>> 12 & 63];
            var3[var4 + 2] = var8[var9 >>> 6 & 63];
            var3[var4 + 3] = 61;
            return var3;
         case 3:
            var3[var4] = var8[var9 >>> 18];
            var3[var4 + 1] = var8[var9 >>> 12 & 63];
            var3[var4 + 2] = var8[var9 >>> 6 & 63];
            var3[var4 + 3] = var8[var9 & 63];
            return var3;
         default:
            return var3;
      }
   }

   public static String method_35442(byte[] var0) {
      String var3 = null;

      try {
         var3 = method_35443(var0, 0, var0.length, 0);
      } catch (IOException var5) {
         assert false : var5.getMessage();
      }

      assert var3 != null;

      return var3;
   }

   public static String method_35443(byte[] var0, int var1, int var2, int var3) throws IOException {
      byte[] var6 = method_35441(var0, var1, var2, var3);

      try {
         return new String(var6, "US-ASCII");
      } catch (UnsupportedEncodingException var8) {
         return new String(var6);
      }
   }

   public static byte[] method_35441(byte[] var0, int var1, int var2, int var3) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("Cannot serialize a null array.");
      } else if (var1 < 0) {
         throw new IllegalArgumentException("Cannot have negative offset: " + var1);
      } else if (var2 < 0) {
         throw new IllegalArgumentException("Cannot have length offset: " + var2);
      } else if (var1 + var2 > var0.length) {
         throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", var1, var2, var0.length));
      } else if ((var3 & 2) != 0) {
         ByteArrayOutputStream var27 = null;
         GZIPOutputStream var28 = null;
         class_9178 var29 = null;

         try {
            var27 = new ByteArrayOutputStream();
            var29 = new class_9178(var27, 1 | var3);
            var28 = new GZIPOutputStream(var29);
            var28.write(var0, var1, var2);
            var28.close();
         } catch (IOException var25) {
            throw var25;
         } finally {
            try {
               if (var28 != null) {
                  var28.close();
               }
            } catch (Exception var24) {
            }

            try {
               if (var29 != null) {
                  var29.close();
               }
            } catch (Exception var23) {
            }

            try {
               if (var27 != null) {
                  var27.close();
               }
            } catch (Exception var22) {
            }
         }

         return var27.toByteArray();
      } else {
         boolean var6 = (var3 & 8) != 0;
         int var7 = var2 / 3 * 4 + (var2 % 3 > 0 ? 4 : 0);
         if (var6) {
            var7 += var7 / 76;
         }

         byte[] var8 = new byte[var7];
         byte var9 = 0;
         int var10 = 0;
         int var11 = var2 - 2;

         for (byte var12 = 0; var9 < var11; var10 += 4) {
            method_35439(var0, var9 + var1, 3, var8, var10, var3);
            var12 += 4;
            if (var6 && var12 >= 76) {
               var8[var10 + 4] = 10;
               var10++;
               var12 = 0;
            }

            var9 += 3;
         }

         if (var9 < var2) {
            method_35439(var0, var9 + var1, var2 - var9, var8, var10, var3);
            var10 += 4;
         }

         if (var10 <= var8.length - 1) {
            byte[] var13 = new byte[var10];
            System.arraycopy(var8, 0, var13, 0, var10);
            return var13;
         } else {
            return var8;
         }
      }
   }

   private static int method_35438(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 != null) {
         if (var2 != null) {
            if (var1 < 0 || var1 + 3 >= var0.length) {
               throw new IllegalArgumentException(
                  String.format("Source array with length %d cannot have offset of %d and still process four bytes.", var0.length, var1)
               );
            } else if (var3 >= 0 && var3 + 2 < var2.length) {
               byte[] var7 = method_35446(var4);
               if (var0[var1 + 2] == 61) {
                  int var10 = (var7[var0[var1]] & 255) << 18 | (var7[var0[var1 + 1]] & 255) << 12;
                  var2[var3] = (byte)(var10 >>> 16);
                  return 1;
               } else if (var0[var1 + 3] != 61) {
                  int var9 = (var7[var0[var1]] & 255) << 18
                     | (var7[var0[var1 + 1]] & 255) << 12
                     | (var7[var0[var1 + 2]] & 255) << 6
                     | var7[var0[var1 + 3]] & 255;
                  var2[var3] = (byte)(var9 >> 16);
                  var2[var3 + 1] = (byte)(var9 >> 8);
                  var2[var3 + 2] = (byte)var9;
                  return 3;
               } else {
                  int var8 = (var7[var0[var1]] & 255) << 18 | (var7[var0[var1 + 1]] & 255) << 12 | (var7[var0[var1 + 2]] & 255) << 6;
                  var2[var3] = (byte)(var8 >>> 16);
                  var2[var3 + 1] = (byte)(var8 >>> 8);
                  return 2;
               }
            } else {
               throw new IllegalArgumentException(
                  String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", var2.length, var3)
               );
            }
         } else {
            throw new IllegalArgumentException("Destination array was null.");
         }
      } else {
         throw new IllegalArgumentException("Source array was null.");
      }
   }
}
