package remapped;

public class class_3607 extends class_5661 {
   private static String[] field_17627;

   public class_3607(class_2811 var1, class_4612 var2, double var3, int var5) {
      super(class_4783.field_23741, var2, var3, var5);
      this.field_17626 = var1;
   }

   @Override
   public void method_25623(class_9379 var1, BlockPos var2) {
      var1.method_43359(
         (class_704)null, var2, class_463.field_2219, class_562.field_3332, 0.5F, 0.9F + class_2811.method_12804(this.field_17626).nextFloat() * 0.2F
      );
   }

   @Override
   public void method_25622(World var1, BlockPos var2) {
      var1.method_43359((class_704)null, var2, class_463.field_2455, class_562.field_3322, 0.7F, 0.9F + var1.field_33033.nextFloat() * 0.2F);
   }

   @Override
   public double method_31857() {
      return 1.14;
   }
}
