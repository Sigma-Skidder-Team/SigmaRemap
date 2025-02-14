package mapped;

import java.nio.ByteBuffer;

public class Class7500 {
   private static String[] field32221;

   private Class7500() {
   }

   public static byte[] method24456(byte[][] var0) {
      int var3 = 0;

      for (byte[] var7 : var0) {
         var3 += var7.length;
      }

      return method24457(var0, var3);
   }

   public static byte[] method24457(byte[][] var0, int var1) {
      if (var0.length == 0) {
         return new byte[0];
      } else if (var0.length == 1) {
         return var0[0];
      } else {
         ByteBuffer var4 = ByteBuffer.allocate(var1);

         for (byte[] var8 : var0) {
            var4.put(var8);
         }

         return var4.array();
      }
   }
}
