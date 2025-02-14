package mapped;

import com.mentalfrostbyte.jello.module.impl.movement.TargetStrafe;

public class Class8124 {
   private static String[] field34938;
   public double field34939;
   public double field34940;
   public double field34941;
   public double field34942;

   public Class8124(double var1, double var3, double var5, double var7) {
      this.field34939 = var1;
      this.field34940 = var3;
      this.field34941 = var5;
      this.field34942 = var7;
   }

   public double[] method28144() {
      double var3 = TargetStrafe.method16156().player.getPositionVec().x - this.field34939;
      double var5 = TargetStrafe.method16157().player.getPositionVec().z - this.field34941;
      double var7 = this.field34939 + this.field34942 * var3 / Math.sqrt(var3 * var3 + var5 * var5);
      double var9 = this.field34941 + this.field34942 * var5 / Math.sqrt(var3 * var3 + var5 * var5);
      return new double[]{var7, this.field34940, var9};
   }
}
