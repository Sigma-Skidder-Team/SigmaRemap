package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class class_7476 {
   private static String[] field_38159;

   private class_7476() {
   }

   public static int method_33997(ByteBuffer var0, ByteBuffer var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.remaining();
         int var5 = var1.remaining();
         if (var4 <= var5) {
            var1.put(var0);
            return var4;
         } else {
            int var6 = Math.min(var4, var5);
            ((Buffer)var0).limit(var6);
            var1.put(var0);
            return var6;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static ByteBuffer method_33998() {
      return ByteBuffer.allocate(0);
   }
}
