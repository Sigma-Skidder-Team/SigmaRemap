package mapped;

import net.minecraft.util.math.BlockPos;

public class Class8472 {
   public double field36296;
   public double field36297;
   public double field36298;

   public Class8472(double var1, double var3, double var5) {
      this.field36296 = var1;
      this.field36297 = var3;
      this.field36298 = var5;
   }

   public Class8472(BlockPos var1) {
      this.field36296 = (double)var1.getX();
      this.field36297 = (double)var1.getY();
      this.field36298 = (double)var1.getZ();
   }

   public double method29876() {
      return this.field36296;
   }

   public double method29877() {
      return this.field36297;
   }

   public double method29878() {
      return this.field36298;
   }

   public Class8472 method29879(double var1, double var3, double var5) {
      return new Class8472(this.field36296 + var1, this.field36297 + var3, this.field36298 + var5);
   }

   public Class8472 method29880() {
      return new Class8472(Math.floor(this.field36296), Math.floor(this.field36297), Math.floor(this.field36298));
   }

   public double method29881(Class8472 var1) {
      return Math.pow(var1.field36296 - this.field36296, 2.0)
         + Math.pow(var1.field36297 - this.field36297, 2.0)
         + Math.pow(var1.field36298 - this.field36298, 2.0);
   }

   public Class8472 method29882(Class8472 var1) {
      return this.method29879(var1.method29876(), var1.method29877(), var1.method29878());
   }

   public Class1998 method29883() {
      return new Class1998(this.field36296, this.field36297, this.field36298);
   }

   @Override
   public String toString() {
      return "[" + this.field36296 + ";" + this.field36297 + ";" + this.field36298 + "]";
   }

   public Class8472 method29884(Class8472 var1) {
      return this.method29879(-var1.method29876(), -var1.method29877(), -var1.method29878());
   }

   public Class8472 method29885(Class8472 var1) {
      return new Class8472(
         this.field36297 * var1.field36298 - this.field36298 * var1.field36297,
         this.field36298 * var1.field36296 - this.field36296 * var1.field36298,
         this.field36296 * var1.field36297 - this.field36297 * var1.field36296
      );
   }

   public Class8472 method29886() {
      double var3 = Math.sqrt(this.field36296 * this.field36296 + this.field36297 * this.field36297 + this.field36298 * this.field36298);
      return !(var3 < 1.0E-4) ? new Class8472(this.field36296 / var3, this.field36297 / var3, this.field36298 / var3) : new Class8472(0.0, 0.0, 0.0);
   }
}
