package remapped;

public class class_6008 {
   private static String[] field_30594;
   private Vector3d field_30593 = null;
   private long field_30595 = System.currentTimeMillis();

   public Vector3d method_27427(double var1, double var3, double var5) {
      if (this.field_30593 != null) {
         long var9 = System.currentTimeMillis();
         long var11 = var9 - this.field_30595;
         if (var11 != 0L) {
            this.field_30595 = var9;
            if (Math.abs(var1 - this.field_30593.field_7336) < 0.004
               && Math.abs(var3 - this.field_30593.field_7333) < 0.004
               && Math.abs(var5 - this.field_30593.field_7334) < 0.004) {
               return this.field_30593;
            } else {
               double var13 = (double)var11 * 0.001;
               var13 = Config.method_14261(var13, 0.0, 1.0);
               double var15 = var1 - this.field_30593.field_7336;
               double var17 = var3 - this.field_30593.field_7333;
               double var19 = var5 - this.field_30593.field_7334;
               double var21 = this.field_30593.field_7336 + var15 * var13;
               double var23 = this.field_30593.field_7333 + var17 * var13;
               double var25 = this.field_30593.field_7334 + var19 * var13;
               this.field_30593 = new Vector3d(var21, var23, var25);
               return this.field_30593;
            }
         } else {
            return this.field_30593;
         }
      } else {
         this.field_30593 = new Vector3d(var1, var3, var5);
         return this.field_30593;
      }
   }
}
