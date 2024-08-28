package mapped;

public class Class9059 {
   private static String[] field41467;
   private final BlockPos field41468;
   private final double field41469;

   public Class9059(BlockPos var1, double var2) {
      this.field41468 = var1;
      this.field41469 = var2;
   }

   public double method33719(BlockPos var1) {
      double var4 = this.field41468.method8318(var1);
      return var4 != 0.0 ? this.field41469 / Math.sqrt(var4) : Double.POSITIVE_INFINITY;
   }
}
