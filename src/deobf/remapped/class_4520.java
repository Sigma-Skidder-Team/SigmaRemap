package remapped;

public class class_4520 extends class_518 {
   private static String[] field_22075;
   private final class_496 field_22076;

   public class_4520(class_496 var1, double var2) {
      super(var1, var2);
      this.field_22076 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_22076.method_37264()) {
         BlockPos var3 = this.method_2534(this.field_3169.world, this.field_3169, 5, 4);
         if (var3 == null) {
            return this.method_2535();
         } else {
            this.field_3166 = (double)var3.method_12173();
            this.field_3172 = (double)var3.method_12165();
            this.field_3170 = (double)var3.method_12185();
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      if (!this.field_22076.method_2449()) {
         return super.method_16799();
      } else {
         this.field_22076.method_26927().method_5620();
         return false;
      }
   }
}
