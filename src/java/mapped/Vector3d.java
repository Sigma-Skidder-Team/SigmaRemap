package mapped;

import java.util.EnumSet;

public class Vector3d implements Class2955 {
   public static final Vector3d ZERO = new Vector3d(0.0, 0.0, 0.0);
   public double field18048;
   public double field18049;
   public double field18050;

   public static Vector3d method11327(int var0) {
      double var3 = (double)(var0 >> 16 & 0xFF) / 255.0;
      double var5 = (double)(var0 >> 8 & 0xFF) / 255.0;
      double var7 = (double)(var0 & 0xFF) / 255.0;
      return new Vector3d(var3, var5, var7);
   }

   public static Vector3d method11328(Class1998 var0) {
      return new Vector3d((double)var0.getX() + 0.5, (double)var0.getY() + 0.5, (double)var0.getZ() + 0.5);
   }

   public static Vector3d method11329(Class1998 var0) {
      return new Vector3d((double)var0.getX(), (double)var0.getY(), (double)var0.getZ());
   }

   public static Vector3d method11330(Class1998 var0) {
      return new Vector3d((double)var0.getX() + 0.5, (double)var0.getY(), (double)var0.getZ() + 0.5);
   }

   public static Vector3d method11331(Class1998 var0, double var1) {
      return new Vector3d((double)var0.getX() + 0.5, (double)var0.getY() + var1, (double)var0.getZ() + 0.5);
   }

   public Vector3d(double var1, double var3, double var5) {
      this.field18048 = var1;
      this.field18049 = var3;
      this.field18050 = var5;
   }

   public Vector3d(Class7680 var1) {
      this((double)var1.method25269(), (double)var1.method25270(), (double)var1.method25271());
   }

   public Vector3d method11332(Vector3d var1) {
      return new Vector3d(var1.field18048 - this.field18048, var1.field18049 - this.field18049, var1.field18050 - this.field18050);
   }

   public Vector3d method11333() {
      double var3 = (double) MathHelper.method37766(this.field18048 * this.field18048 + this.field18049 * this.field18049 + this.field18050 * this.field18050);
      return !(var3 < 1.0E-4) ? new Vector3d(this.field18048 / var3, this.field18049 / var3, this.field18050 / var3) : ZERO;
   }

   public double method11334(Vector3d var1) {
      return this.field18048 * var1.field18048 + this.field18049 * var1.field18049 + this.field18050 * var1.field18050;
   }

   public Vector3d method11335(Vector3d var1) {
      return new Vector3d(
         this.field18049 * var1.field18050 - this.field18050 * var1.field18049,
         this.field18050 * var1.field18048 - this.field18048 * var1.field18050,
         this.field18048 * var1.field18049 - this.field18049 * var1.field18048
      );
   }

   public Vector3d method11336(Vector3d var1) {
      return this.method11337(var1.field18048, var1.field18049, var1.field18050);
   }

   public Vector3d method11337(double var1, double var3, double var5) {
      return this.method11339(-var1, -var3, -var5);
   }

   public Vector3d method11338(Vector3d var1) {
      return this.method11339(var1.field18048, var1.field18049, var1.field18050);
   }

   public Vector3d method11339(double var1, double var3, double var5) {
      return new Vector3d(this.field18048 + var1, this.field18049 + var3, this.field18050 + var5);
   }

   public boolean method11340(Class2955 var1, double var2) {
      return this.method11343(var1.method11320(), var1.method11321(), var1.method11322()) < var2 * var2;
   }

   public double method11341(Vector3d var1) {
      double var4 = var1.field18048 - this.field18048;
      double var6 = var1.field18049 - this.field18049;
      double var8 = var1.field18050 - this.field18050;
      return (double) MathHelper.method37766(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public double method11342(Vector3d var1) {
      double var4 = var1.field18048 - this.field18048;
      double var6 = var1.field18049 - this.field18049;
      double var8 = var1.field18050 - this.field18050;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public double method11343(double var1, double var3, double var5) {
      double var9 = var1 - this.field18048;
      double var11 = var3 - this.field18049;
      double var13 = var5 - this.field18050;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   public Vector3d method11344(double var1) {
      return this.method11347(var1, var1, var1);
   }

   public Vector3d method11345() {
      return this.method11344(-1.0);
   }

   public Vector3d method11346(Vector3d var1) {
      return this.method11347(var1.field18048, var1.field18049, var1.field18050);
   }

   public Vector3d method11347(double var1, double var3, double var5) {
      return new Vector3d(this.field18048 * var1, this.field18049 * var3, this.field18050 * var5);
   }

   public double method11348() {
      return (double) MathHelper.method37766(this.field18048 * this.field18048 + this.field18049 * this.field18049 + this.field18050 * this.field18050);
   }

   public double method11349() {
      return this.field18048 * this.field18048 + this.field18049 * this.field18049 + this.field18050 * this.field18050;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Vector3d) {
            Vector3d var4 = (Vector3d)var1;
            if (Double.compare(var4.field18048, this.field18048) == 0) {
               return Double.compare(var4.field18049, this.field18049) == 0 ? Double.compare(var4.field18050, this.field18050) == 0 : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      long var3 = Double.doubleToLongBits(this.field18048);
      int var5 = (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field18049);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field18050);
      return 31 * var5 + (int)(var3 ^ var3 >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.field18048 + ", " + this.field18049 + ", " + this.field18050 + ")";
   }

   public Vector3d method11350(float var1) {
      float var4 = MathHelper.cos(var1);
      float var5 = MathHelper.sin(var1);
      double var6 = this.field18048;
      double var8 = this.field18049 * (double)var4 + this.field18050 * (double)var5;
      double var10 = this.field18050 * (double)var4 - this.field18049 * (double)var5;
      return new Vector3d(var6, var8, var10);
   }

   public Vector3d method11351(float var1) {
      float var4 = MathHelper.cos(var1);
      float var5 = MathHelper.sin(var1);
      double var6 = this.field18048 * (double)var4 + this.field18050 * (double)var5;
      double var8 = this.field18049;
      double var10 = this.field18050 * (double)var4 - this.field18048 * (double)var5;
      return new Vector3d(var6, var8, var10);
   }

   public Vector3d method11352(float var1) {
      float var4 = MathHelper.cos(var1);
      float var5 = MathHelper.sin(var1);
      double var6 = this.field18048 * (double)var4 + this.field18049 * (double)var5;
      double var8 = this.field18049 * (double)var4 - this.field18048 * (double)var5;
      double var10 = this.field18050;
      return new Vector3d(var6, var8, var10);
   }

   public static Vector3d method11353(Class8513 var0) {
      return method11354(var0.field37220, var0.field37221);
   }

   public static Vector3d method11354(float var0, float var1) {
      float var4 = MathHelper.cos(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var5 = MathHelper.sin(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var6 = -MathHelper.cos(-var0 * (float) (Math.PI / 180.0));
      float var7 = MathHelper.sin(-var0 * (float) (Math.PI / 180.0));
      return new Vector3d((double)(var5 * var6), (double)var7, (double)(var4 * var6));
   }

   public Vector3d method11355(EnumSet<Class113> var1) {
      double var4 = !var1.contains(Class113.field413) ? this.field18048 : (double) MathHelper.floor(this.field18048);
      double var6 = !var1.contains(Class113.field414) ? this.field18049 : (double) MathHelper.floor(this.field18049);
      double var8 = !var1.contains(Class113.field415) ? this.field18050 : (double) MathHelper.floor(this.field18050);
      return new Vector3d(var4, var6, var8);
   }

   public double method11356(Class113 var1) {
      return var1.method328(this.field18048, this.field18049, this.field18050);
   }

   @Override
   public final double method11320() {
      return this.field18048;
   }

   @Override
   public final double method11321() {
      return this.field18049;
   }

   @Override
   public final double method11322() {
      return this.field18050;
   }
}
