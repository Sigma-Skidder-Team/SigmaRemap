package remapped;

public class class_8571 {
   public double field_43941;
   public double field_43940;
   public double field_43942;

   public class_8571(double var1, double var3, double var5) {
      this.field_43941 = var1;
      this.field_43940 = var3;
      this.field_43942 = var5;
   }

   public class_8571(BlockPos var1) {
      this.field_43941 = (double)var1.getX();
      this.field_43940 = (double)var1.getY();
      this.field_43942 = (double)var1.getZ();
   }

   public double method_39427() {
      return this.field_43941;
   }

   public double method_39425() {
      return this.field_43940;
   }

   public double method_39423() {
      return this.field_43942;
   }

   public class_8571 method_39422(double var1, double var3, double var5) {
      return new class_8571(this.field_43941 + var1, this.field_43940 + var3, this.field_43942 + var5);
   }

   public class_8571 method_39419() {
      return new class_8571(Math.floor(this.field_43941), Math.floor(this.field_43940), Math.floor(this.field_43942));
   }

   public BlockPos method_39428() {
      return new BlockPos(Math.floor(this.field_43941), Math.floor(this.field_43940), Math.floor(this.field_43942));
   }

   public double method_39418(class_8571 var1) {
      return Math.pow(var1.field_43941 - this.field_43941, 2.0)
         + Math.pow(var1.field_43940 - this.field_43940, 2.0)
         + Math.pow(var1.field_43942 - this.field_43942, 2.0);
   }

   public class_8571 method_39421(class_8571 var1) {
      return this.method_39422(var1.method_39427(), var1.method_39425(), var1.method_39423());
   }

   public Vector3i method_39420() {
      return new Vector3i(this.field_43941, this.field_43940, this.field_43942);
   }

   @Override
   public String toString() {
      return "[" + this.field_43941 + ";" + this.field_43940 + ";" + this.field_43942 + "]";
   }

   public class_8571 method_39424(class_8571 var1) {
      return this.method_39422(-var1.method_39427(), -var1.method_39425(), -var1.method_39423());
   }

   public class_8571 method_39416(class_8571 var1) {
      return new class_8571(
         this.field_43940 * var1.field_43942 - this.field_43942 * var1.field_43940,
         this.field_43942 * var1.field_43941 - this.field_43941 * var1.field_43942,
         this.field_43941 * var1.field_43940 - this.field_43940 * var1.field_43941
      );
   }

   public class_8571 method_39417() {
      double var3 = Math.sqrt(this.field_43941 * this.field_43941 + this.field_43940 * this.field_43940 + this.field_43942 * this.field_43942);
      return !(var3 < 1.0E-4) ? new class_8571(this.field_43941 / var3, this.field_43940 / var3, this.field_43942 / var3) : new class_8571(0.0, 0.0, 0.0);
   }
}
