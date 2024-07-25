package remapped;

public class class_6852 {
   private static String[] field_35330;
   private final BlockPos field_35331;
   private final double field_35332;

   public class_6852(BlockPos var1, double var2) {
      this.field_35331 = var1;
      this.field_35332 = var2;
   }

   public double method_31441(BlockPos var1) {
      double var4 = this.field_35331.method_12180(var1);
      return var4 != 0.0 ? this.field_35332 / Math.sqrt(var4) : Double.POSITIVE_INFINITY;
   }
}
