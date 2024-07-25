package remapped;

public class class_2299 {
   private static String[] field_11482;
   private double field_11483;
   private double field_11484;
   private double field_11481;

   public double method_10573(double var1, double var3) {
      this.field_11483 += var1;
      double var7 = this.field_11483 - this.field_11484;
      double var9 = class_9299.method_42794(0.5, this.field_11481, var7);
      double var11 = Math.signum(var7);
      if (var11 * var7 > var11 * this.field_11481) {
         var7 = var9;
      }

      this.field_11481 = var9;
      this.field_11484 += var7 * var3;
      return var7 * var3;
   }

   public void method_10572() {
      this.field_11483 = 0.0;
      this.field_11484 = 0.0;
      this.field_11481 = 0.0;
   }
}
