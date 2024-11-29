package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;

public class Vector3d {
   public double x;
   public double y;
   public double z;

   public Vector3d(double var1, double var3, double var5) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
   }

   public Vector3d(BlockPos var1) {
      this.x = (double)var1.getX();
      this.y = (double)var1.getY();
      this.z = (double)var1.getZ();
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getZ() {
      return this.z;
   }

   public Vector3d method29879(double var1, double var3, double var5) {
      return new Vector3d(this.x + var1, this.y + var3, this.z + var5);
   }

   public Vector3d method29880() {
      return new Vector3d(Math.floor(this.x), Math.floor(this.y), Math.floor(this.z));
   }

   public double method29881(Vector3d var1) {
      return Math.pow(var1.x - this.x, 2.0)
         + Math.pow(var1.y - this.y, 2.0)
         + Math.pow(var1.z - this.z, 2.0);
   }

   public Vector3d method29882(Vector3d var1) {
      return this.method29879(var1.getX(), var1.getY(), var1.getZ());
   }

   public Vector3i method29883() {
      return new Vector3i(this.x, this.y, this.z);
   }

   @Override
   public String toString() {
      return "[" + this.x + ";" + this.y + ";" + this.z + "]";
   }

   public Vector3d method29884(Vector3d var1) {
      return this.method29879(-var1.getX(), -var1.getY(), -var1.getZ());
   }

   public Vector3d method29885(Vector3d var1) {
      return new Vector3d(
         this.y * var1.z - this.z * var1.y,
         this.z * var1.x - this.x * var1.z,
         this.x * var1.y - this.y * var1.x
      );
   }

   public Vector3d normalize() {
      double var3 = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
      return !(var3 < 1.0E-4) ? new Vector3d(this.x / var3, this.y / var3, this.z / var3) : new Vector3d(0.0, 0.0, 0.0);
   }
}
