package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;

public class Class7769 {
   private static String[] field33344;

   public static AxisAlignedBB method25747(AxisAlignedBB var0, Direction var1, double var2) {
      double var6 = var2 * (double)var1.getAxisDirection().getOffset();
      double var8 = Math.min(var6, 0.0);
      double var10 = Math.max(var6, 0.0);
      switch (Class8712.field39323[var1.ordinal()]) {
         case 1:
            return new AxisAlignedBB(var0.minX + var8, var0.minY, var0.minZ, var0.minX + var10, var0.maxY, var0.maxZ);
         case 2:
            return new AxisAlignedBB(var0.maxX + var8, var0.minY, var0.minZ, var0.maxX + var10, var0.maxY, var0.maxZ);
         case 3:
            return new AxisAlignedBB(var0.minX, var0.minY + var8, var0.minZ, var0.maxX, var0.minY + var10, var0.maxZ);
         case 4:
         default:
            return new AxisAlignedBB(var0.minX, var0.maxY + var8, var0.minZ, var0.maxX, var0.maxY + var10, var0.maxZ);
         case 5:
            return new AxisAlignedBB(var0.minX, var0.minY, var0.minZ + var8, var0.maxX, var0.maxY, var0.minZ + var10);
         case 6:
            return new AxisAlignedBB(var0.minX, var0.minY, var0.maxZ + var8, var0.maxX, var0.maxY, var0.maxZ + var10);
      }
   }
}
