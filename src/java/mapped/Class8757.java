package mapped;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

public class Class8757 {
   private static String[] field39437;
   private static final byte[] field39438 = new byte[]{
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      62,
      -1,
      -1,
      -1,
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
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
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
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
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
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      0
   };

   public static byte[] method31592(byte[] var0) {
      ByteArrayInputStream var3 = new ByteArrayInputStream(var0);
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      PushbackInputStream var5 = new PushbackInputStream(var3);

      try {
         while (true) {
            byte var6;
            for (var6 = 0; var6 + 4 < 72; var6 += 4) {
               method31593(var5, var4, 4);
            }

            if (var6 + 4 == 72) {
               method31593(var5, var4, 4);
            } else {
               method31593(var5, var4, 72 - var6);
            }
         }
      } catch (IOException var8) {
         return var4.toByteArray();
      }
   }

   private static void method31593(InputStream var0, OutputStream var1, int var2) throws IOException {
      if (var2 < 2) {
         throw new IOException();
      } else {
         int var5;
         do {
            var5 = var0.read();
            if (var5 == -1) {
               throw new IOException();
            }
         } while (var5 == 10 || var5 == 13);

         byte[] var6 = new byte[4];
         var6[0] = (byte)var5;
         var5 = method31594(var0, var6, 1, var2 - 1);
         if (var5 == -1) {
            throw new IOException();
         } else {
            if (var2 > 3 && var6[3] == 61) {
               var2 = 3;
            }

            if (var2 > 2 && var6[2] == 61) {
               var2 = 2;
            }

            byte var7 = -1;
            byte var8 = -1;
            byte var9 = -1;
            byte var10 = -1;
            switch (var2) {
               case 4:
                  var10 = field39438[var6[3] & 255];
               case 3:
                  var9 = field39438[var6[2] & 255];
               case 2:
                  var8 = field39438[var6[1] & 255];
                  var7 = field39438[var6[0] & 255];
               default:
                  switch (var2) {
                     case 2:
                        var1.write((byte)(var7 << 2 & 252 | var8 >>> 4 & 3));
                        break;
                     case 3:
                        var1.write((byte)(var7 << 2 & 252 | var8 >>> 4 & 3));
                        var1.write((byte)(var8 << 4 & 240 | var9 >>> 2 & 15));
                        break;
                     case 4:
                        var1.write((byte)(var7 << 2 & 252 | var8 >>> 4 & 3));
                        var1.write((byte)(var8 << 4 & 240 | var9 >>> 2 & 15));
                        var1.write((byte)(var9 << 6 & 192 | var10 & 63));
                  }
            }
         }
      }
   }

   private static int method31594(InputStream var0, byte[] var1, int var2, int var3) throws IOException {
      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var0.read();
         if (var7 == -1) {
            return var6 != 0 ? var6 : -1;
         }

         var1[var6 + var2] = (byte)var7;
      }

      return var3;
   }
}
