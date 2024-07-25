package remapped;

import java.util.EnumSet;

public class class_1343 implements class_66 {
   public static final class_1343 field_7335 = new class_1343(0.0, 0.0, 0.0);
   public double field_7336;
   public double field_7333;
   public double field_7334;

   public static class_1343 method_6220(int var0) {
      double var3 = (double)(var0 >> 16 & 0xFF) / 255.0;
      double var5 = (double)(var0 >> 8 & 0xFF) / 255.0;
      double var7 = (double)(var0 & 0xFF) / 255.0;
      return new class_1343(var3, var5, var7);
   }

   public static class_1343 method_6216(Vector3i var0) {
      return new class_1343((double)var0.getX() + 0.5, (double)var0.method_12165() + 0.5, (double)var0.method_12185() + 0.5);
   }

   public static class_1343 method_6205(Vector3i var0) {
      return new class_1343((double)var0.getX(), (double)var0.method_12165(), (double)var0.method_12185());
   }

   public static class_1343 method_6200(Vector3i var0) {
      return new class_1343((double)var0.getX() + 0.5, (double)var0.method_12165(), (double)var0.method_12185() + 0.5);
   }

   public static class_1343 method_6219(Vector3i var0, double var1) {
      return new class_1343((double)var0.getX() + 0.5, (double)var0.method_12165() + var1, (double)var0.method_12185() + 0.5);
   }

   public class_1343(double var1, double var3, double var5) {
      this.field_7336 = var1;
      this.field_7333 = var3;
      this.field_7334 = var5;
   }

   public class_1343(class_2426 var1) {
      this((double)var1.method_11057(), (double)var1.method_11061(), (double)var1.method_11055());
   }

   public class_1343 method_6202(class_1343 var1) {
      return new class_1343(var1.field_7336 - this.field_7336, var1.field_7333 - this.field_7333, var1.field_7334 - this.field_7334);
   }

   public class_1343 method_6213() {
      double var3 = (double) MathHelper.sqrt(this.field_7336 * this.field_7336 + this.field_7333 * this.field_7333 + this.field_7334 * this.field_7334);
      return !(var3 < 1.0E-4) ? new class_1343(this.field_7336 / var3, this.field_7333 / var3, this.field_7334 / var3) : field_7335;
   }

   public double method_6206(class_1343 var1) {
      return this.field_7336 * var1.field_7336 + this.field_7333 * var1.field_7333 + this.field_7334 * var1.field_7334;
   }

   public class_1343 method_6196(class_1343 var1) {
      return new class_1343(
         this.field_7333 * var1.field_7334 - this.field_7334 * var1.field_7333,
         this.field_7334 * var1.field_7336 - this.field_7336 * var1.field_7334,
         this.field_7336 * var1.field_7333 - this.field_7333 * var1.field_7336
      );
   }

   public class_1343 method_6194(class_1343 var1) {
      return this.method_6193(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public class_1343 method_6193(double var1, double var3, double var5) {
      return this.method_6214(-var1, -var3, -var5);
   }

   public class_1343 method_6215(class_1343 var1) {
      return this.method_6214(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public class_1343 method_6214(double var1, double var3, double var5) {
      return new class_1343(this.field_7336 + var1, this.field_7333 + var3, this.field_7334 + var5);
   }

   public boolean method_6222(class_66 var1, double var2) {
      return this.method_6203(var1.method_61(), var1.method_60(), var1.method_62()) < var2 * var2;
   }

   public double method_6195(class_1343 var1) {
      double var4 = var1.field_7336 - this.field_7336;
      double var6 = var1.field_7333 - this.field_7333;
      double var8 = var1.field_7334 - this.field_7334;
      return (double) MathHelper.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public double method_6204(class_1343 var1) {
      double var4 = var1.field_7336 - this.field_7336;
      double var6 = var1.field_7333 - this.field_7333;
      double var8 = var1.field_7334 - this.field_7334;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public double method_6203(double var1, double var3, double var5) {
      double var9 = var1 - this.field_7336;
      double var11 = var3 - this.field_7333;
      double var13 = var5 - this.field_7334;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   public class_1343 method_6209(double var1) {
      return this.method_6210(var1, var1, var1);
   }

   public class_1343 method_6207() {
      return this.method_6209(-1.0);
   }

   public class_1343 method_6211(class_1343 var1) {
      return this.method_6210(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public class_1343 method_6210(double var1, double var3, double var5) {
      return new class_1343(this.field_7336 * var1, this.field_7333 * var3, this.field_7334 * var5);
   }

   public double method_6217() {
      return (double) MathHelper.sqrt(this.field_7336 * this.field_7336 + this.field_7333 * this.field_7333 + this.field_7334 * this.field_7334);
   }

   public double method_6221() {
      return this.field_7336 * this.field_7336 + this.field_7333 * this.field_7333 + this.field_7334 * this.field_7334;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_1343) {
            class_1343 var4 = (class_1343)var1;
            if (Double.compare(var4.field_7336, this.field_7336) == 0) {
               return Double.compare(var4.field_7333, this.field_7333) == 0 ? Double.compare(var4.field_7334, this.field_7334) == 0 : false;
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
      long var3 = Double.doubleToLongBits(this.field_7336);
      int var5 = (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_7333);
      var5 = 31 * var5 + (int)(var3 ^ var3 >>> 32);
      var3 = Double.doubleToLongBits(this.field_7334);
      return 31 * var5 + (int)(var3 ^ var3 >>> 32);
   }

   @Override
   public String toString() {
      return "(" + this.field_7336 + ", " + this.field_7333 + ", " + this.field_7334 + ")";
   }

   public class_1343 method_6212(float var1) {
      float var4 = MathHelper.cos(var1);
      float var5 = MathHelper.sin(var1);
      double var6 = this.field_7336;
      double var8 = this.field_7333 * (double)var4 + this.field_7334 * (double)var5;
      double var10 = this.field_7334 * (double)var4 - this.field_7333 * (double)var5;
      return new class_1343(var6, var8, var10);
   }

   public class_1343 method_6192(float var1) {
      float var4 = MathHelper.cos(var1);
      float var5 = MathHelper.sin(var1);
      double var6 = this.field_7336 * (double)var4 + this.field_7334 * (double)var5;
      double var8 = this.field_7333;
      double var10 = this.field_7334 * (double)var4 - this.field_7336 * (double)var5;
      return new class_1343(var6, var8, var10);
   }

   public class_1343 method_6218(float var1) {
      float var4 = MathHelper.cos(var1);
      float var5 = MathHelper.sin(var1);
      double var6 = this.field_7336 * (double)var4 + this.field_7333 * (double)var5;
      double var8 = this.field_7333 * (double)var4 - this.field_7336 * (double)var5;
      double var10 = this.field_7334;
      return new class_1343(var6, var8, var10);
   }

   public static class_1343 method_6199(class_4895 var0) {
      return method_6198(var0.field_24326, var0.field_24329);
   }

   public static class_1343 method_6198(float var0, float var1) {
      float var4 = MathHelper.cos(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var5 = MathHelper.sin(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var6 = -MathHelper.cos(-var0 * (float) (Math.PI / 180.0));
      float var7 = MathHelper.sin(-var0 * (float) (Math.PI / 180.0));
      return new class_1343((double)(var5 * var6), (double)var7, (double)(var4 * var6));
   }

   public class_1343 method_6201(EnumSet<class_9249> var1) {
      double var4 = !var1.contains(class_9249.field_47215) ? this.field_7336 : (double) MathHelper.floor(this.field_7336);
      double var6 = !var1.contains(class_9249.field_47216) ? this.field_7333 : (double) MathHelper.floor(this.field_7333);
      double var8 = !var1.contains(class_9249.field_47219) ? this.field_7334 : (double) MathHelper.floor(this.field_7334);
      return new class_1343(var4, var6, var8);
   }

   public double method_6197(class_9249 var1) {
      return var1.method_42630(this.field_7336, this.field_7333, this.field_7334);
   }

   @Override
   public final double method_61() {
      return this.field_7336;
   }

   @Override
   public final double method_60() {
      return this.field_7333;
   }

   @Override
   public final double method_62() {
      return this.field_7334;
   }
}
