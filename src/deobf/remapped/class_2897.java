package remapped;

public class class_2897 extends class_518 {
   private static String[] field_14158;

   public class_2897(class_3845 var1, double var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_16795() {
      if (this.field_3169.method_26531() == null && !this.field_3169.method_37264()) {
         return false;
      } else {
         BlockPos var3 = this.method_2534(this.field_3169.world, this.field_3169, 7, 4);
         if (var3 == null) {
            return this.method_2535();
         } else {
            this.field_3166 = (double)var3.getX();
            this.field_3172 = (double)var3.getY();
            this.field_3170 = (double)var3.getZ();
            return true;
         }
      }
   }
}
