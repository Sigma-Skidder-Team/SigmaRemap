package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Class9209 {
   private static String[] field42396;

   private Class9209() {
   }

   public static int method34508(ByteBuffer var0, ByteBuffer var1) {
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

   public static ByteBuffer method34509() {
      return ByteBuffer.allocate(0);
   }
}
