package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;

public class Class9485 {
   public double field44096;
   public double field44097;
   public double field44098;

   public Class9485(double var1, double var3, double var5) {
      this.field44096 = var1;
      this.field44097 = var3;
      this.field44098 = var5;
   }

   public Class9485(BlockPos var1) {
      this.field44096 = (double)var1.getX();
      this.field44097 = (double)var1.getY();
      this.field44098 = (double)var1.getZ();
   }

   public double method36620() {
      return this.field44096;
   }

   public double method36621() {
      return this.field44097;
   }

   public double method36622() {
      return this.field44098;
   }

   public Class9485 method36623(double var1, double var3, double var5) {
      return new Class9485(this.field44096 + var1, this.field44097 + var3, this.field44098 + var5);
   }

   public Class9485 method36624() {
      return new Class9485(Math.floor(this.field44096), Math.floor(this.field44097), Math.floor(this.field44098));
   }

   public BlockPos method36625() {
      return new BlockPos(Math.floor(this.field44096), Math.floor(this.field44097), Math.floor(this.field44098));
   }

   public double method36626(Class9485 var1) {
      return Math.pow(var1.field44096 - this.field44096, 2.0)
         + Math.pow(var1.field44097 - this.field44097, 2.0)
         + Math.pow(var1.field44098 - this.field44098, 2.0);
   }

   public Class9485 method36627(Class9485 var1) {
      return this.method36623(var1.method36620(), var1.method36621(), var1.method36622());
   }

   public Vector3i method36628() {
      return new Vector3i(this.field44096, this.field44097, this.field44098);
   }

   @Override
   public String toString() {
      return "[" + this.field44096 + ";" + this.field44097 + ";" + this.field44098 + "]";
   }

   public Class9485 method36629(Class9485 var1) {
      return this.method36623(-var1.method36620(), -var1.method36621(), -var1.method36622());
   }

   public Class9485 method36630(Class9485 var1) {
      return new Class9485(
         this.field44097 * var1.field44098 - this.field44098 * var1.field44097,
         this.field44098 * var1.field44096 - this.field44096 * var1.field44098,
         this.field44096 * var1.field44097 - this.field44097 * var1.field44096
      );
   }

   public Class9485 method36631() {
      double var3 = Math.sqrt(this.field44096 * this.field44096 + this.field44097 * this.field44097 + this.field44098 * this.field44098);
      return !(var3 < 1.0E-4) ? new Class9485(this.field44096 / var3, this.field44097 / var3, this.field44098 / var3) : new Class9485(0.0, 0.0, 0.0);
   }
}
