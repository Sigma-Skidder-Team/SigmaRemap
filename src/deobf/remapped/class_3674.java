package remapped;

public class class_3674 {
   private static String[] field_17917;
   public double field_17916;
   public double field_17919;
   public double field_17918;
   public double field_17915;

   public class_3674(double var1, double var3, double var5, double var7) {
      this.field_17916 = var1;
      this.field_17919 = var3;
      this.field_17918 = var5;
      this.field_17915 = var7;
   }

   public double[] method_17048() {
      double var3 = class_9824.method_45283().field_9632.method_37245().field_7336 - this.field_17916;
      double var5 = class_9824.method_45281().field_9632.method_37245().field_7334 - this.field_17918;
      double var7 = this.field_17916 + this.field_17915 * var3 / Math.sqrt(var3 * var3 + var5 * var5);
      double var9 = this.field_17918 + this.field_17915 * var5 / Math.sqrt(var3 * var3 + var5 * var5);
      return new double[]{var7, this.field_17919, var9};
   }
}
