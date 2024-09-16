package mapped;

import net.minecraft.util.math.MathHelper;

public class Class7605 {
   private static String[] field32646;
   private double field32647;
   private double field32648;
   private double field32649;

   public double method24911(double var1, double var3) {
      this.field32647 += var1;
      double var7 = this.field32647 - this.field32648;
      double var9 = MathHelper.lerp(0.5, this.field32649, var7);
      double var11 = Math.signum(var7);
      if (var11 * var7 > var11 * this.field32649) {
         var7 = var9;
      }

      this.field32649 = var9;
      this.field32648 += var7 * var3;
      return var7 * var3;
   }

   public void method24912() {
      this.field32647 = 0.0;
      this.field32648 = 0.0;
      this.field32649 = 0.0;
   }
}
