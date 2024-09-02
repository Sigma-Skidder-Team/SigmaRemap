package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;

public class Class7769 {
   private static String[] field33344;

   public static AxisAlignedBB method25747(AxisAlignedBB var0, Direction var1, double var2) {
      double var6 = var2 * (double)var1.method535().method8150();
      double var8 = Math.min(var6, 0.0);
      double var10 = Math.max(var6, 0.0);
      switch (Class8712.field39323[var1.ordinal()]) {
         case 1:
            return new AxisAlignedBB(var0.field28449 + var8, var0.field28450, var0.field28451, var0.field28449 + var10, var0.field28453, var0.field28454);
         case 2:
            return new AxisAlignedBB(var0.field28452 + var8, var0.field28450, var0.field28451, var0.field28452 + var10, var0.field28453, var0.field28454);
         case 3:
            return new AxisAlignedBB(var0.field28449, var0.field28450 + var8, var0.field28451, var0.field28452, var0.field28450 + var10, var0.field28454);
         case 4:
         default:
            return new AxisAlignedBB(var0.field28449, var0.field28453 + var8, var0.field28451, var0.field28452, var0.field28453 + var10, var0.field28454);
         case 5:
            return new AxisAlignedBB(var0.field28449, var0.field28450, var0.field28451 + var8, var0.field28452, var0.field28453, var0.field28451 + var10);
         case 6:
            return new AxisAlignedBB(var0.field28449, var0.field28450, var0.field28454 + var8, var0.field28452, var0.field28453, var0.field28454 + var10);
      }
   }
}
