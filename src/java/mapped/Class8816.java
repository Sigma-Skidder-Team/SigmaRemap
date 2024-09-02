package mapped;

import net.minecraft.util.math.vector.Vector3d;

public class Class8816 {
   private static String[] field39661;
   private Vector3d field39662 = null;
   private long field39663 = System.currentTimeMillis();

   public Vector3d method31835(double var1, double var3, double var5) {
      if (this.field39662 != null) {
         long var9 = System.currentTimeMillis();
         long var11 = var9 - this.field39663;
         if (var11 != 0L) {
            this.field39663 = var9;
            if (Math.abs(var1 - this.field39662.x) < 0.004
               && Math.abs(var3 - this.field39662.y) < 0.004
               && Math.abs(var5 - this.field39662.z) < 0.004) {
               return this.field39662;
            } else {
               double var13 = (double)var11 * 0.001;
               var13 = Class7944.method26833(var13, 0.0, 1.0);
               double var15 = var1 - this.field39662.x;
               double var17 = var3 - this.field39662.y;
               double var19 = var5 - this.field39662.z;
               double var21 = this.field39662.x + var15 * var13;
               double var23 = this.field39662.y + var17 * var13;
               double var25 = this.field39662.z + var19 * var13;
               this.field39662 = new Vector3d(var21, var23, var25);
               return this.field39662;
            }
         } else {
            return this.field39662;
         }
      } else {
         this.field39662 = new Vector3d(var1, var3, var5);
         return this.field39662;
      }
   }
}
