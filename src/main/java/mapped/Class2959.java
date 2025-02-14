package mapped;

public class Class2959 implements IPosition {
   private static String[] field18051;
   public final double field18052;
   public final double field18053;
   public final double field18054;

   public Class2959(double var1, double var3, double var5) {
      this.field18052 = var1;
      this.field18053 = var3;
      this.field18054 = var5;
   }

   @Override
   public double getX() {
      return this.field18052;
   }

   @Override
   public double getY() {
      return this.field18053;
   }

   @Override
   public double getZ() {
      return this.field18054;
   }
}
