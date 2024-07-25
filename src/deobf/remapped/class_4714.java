package remapped;

public class class_4714 {
   public double field_22878;
   public double field_22880;
   public double field_22879;

   public class_4714(double var1, double var3, double var5) {
      this.field_22878 = var1;
      this.field_22880 = var3;
      this.field_22879 = var5;
   }

   public class_4714(BlockPos var1) {
      this.field_22878 = (double)var1.getX();
      this.field_22880 = (double)var1.getY();
      this.field_22879 = (double)var1.getZ();
   }

   public double method_21803() {
      return this.field_22878;
   }

   public double method_21801() {
      return this.field_22880;
   }

   public double method_21799() {
      return this.field_22879;
   }

   public class_4714 method_21797(double var1, double var3, double var5) {
      return new class_4714(this.field_22878 + var1, this.field_22880 + var3, this.field_22879 + var5);
   }

   public class_4714 method_21798() {
      return new class_4714(Math.floor(this.field_22878), Math.floor(this.field_22880), Math.floor(this.field_22879));
   }

   public double method_21795(class_4714 var1) {
      return Math.pow(var1.field_22878 - this.field_22878, 2.0)
         + Math.pow(var1.field_22880 - this.field_22880, 2.0)
         + Math.pow(var1.field_22879 - this.field_22879, 2.0);
   }

   public class_4714 method_21802(class_4714 var1) {
      return this.method_21797(var1.method_21803(), var1.method_21801(), var1.method_21799());
   }

   public Vector3i method_21800() {
      return new Vector3i(this.field_22878, this.field_22880, this.field_22879);
   }

   @Override
   public String toString() {
      return "[" + this.field_22878 + ";" + this.field_22880 + ";" + this.field_22879 + "]";
   }

   public class_4714 method_21806(class_4714 var1) {
      return this.method_21797(-var1.method_21803(), -var1.method_21801(), -var1.method_21799());
   }

   public class_4714 method_21804(class_4714 var1) {
      return new class_4714(
         this.field_22880 * var1.field_22879 - this.field_22879 * var1.field_22880,
         this.field_22879 * var1.field_22878 - this.field_22878 * var1.field_22879,
         this.field_22878 * var1.field_22880 - this.field_22880 * var1.field_22878
      );
   }

   public class_4714 method_21796() {
      double var3 = Math.sqrt(this.field_22878 * this.field_22878 + this.field_22880 * this.field_22880 + this.field_22879 * this.field_22879);
      return !(var3 < 1.0E-4) ? new class_4714(this.field_22878 / var3, this.field_22880 / var3, this.field_22879 / var3) : new class_4714(0.0, 0.0, 0.0);
   }
}
