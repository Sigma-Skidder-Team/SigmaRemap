package mapped;

public class Class9388 {
   private static String[] field43568;
   public final double field43569;
   public final double field43570;
   public final double field43571;
   public final double field43572;
   public final double field43573;
   public final double field43574;

   public Class9388(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field43569 = var1;
      this.field43570 = var3;
      this.field43571 = var5;
      this.field43572 = var7;
      this.field43573 = var9;
      this.field43574 = var11;
   }

   public Class9388(AxisAlignedBB var1) {
      this.field43569 = var1.field28449;
      this.field43570 = var1.field28450;
      this.field43571 = var1.field28451;
      this.field43572 = var1.field28452;
      this.field43573 = var1.field28453;
      this.field43574 = var1.field28454;
   }

   public Class9388 method35648(double var1) {
      return new Class9388(
         this.field43569 - var1,
         this.field43570 - var1,
         this.field43571 - var1,
         this.field43572 + var1 * 2.0,
         this.field43573 + var1 * 2.0,
         this.field43574 + var1 * 2.0
      );
   }
}
