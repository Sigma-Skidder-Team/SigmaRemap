package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.ChunkSection;

public class Class9333 {
   private static String[] field43312;

   public static int method35299(Class8066 var0) {
      ChunkSection[] var3 = var0.method27740().getSections();
      if (var3 != null) {
         int var4 = var0.method27718().getY() >> 4;
         ChunkSection var5 = var3[var4];
         return var5 != null ? var5.method21870() : 0;
      } else {
         return 0;
      }
   }

   public static double method35300(Class8066 var0) {
      int var3 = method35299(var0);
      return method35301(var3);
   }

   public static double method35301(int var0) {
      double var3 = (double)var0 / 4096.0;
      var3 *= 0.995;
      double var5 = var3 * 2.0 - 1.0;
      var5 = MathHelper.clamp(var5, -1.0, 1.0);
      return (double) MathHelper.sqrt(1.0 - var5 * var5);
   }
}
