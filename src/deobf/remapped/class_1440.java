package remapped;

import java.io.Serializable;

public class class_1440 implements Serializable {
   private static final long field_7764 = 1339934L;
   public float field_7766;
   public float field_7765;

   public strictfp class_1440() {
   }

   public strictfp class_1440(float[] var1) {
      this.field_7766 = var1[0];
      this.field_7765 = var1[1];
   }

   public strictfp class_1440(double var1) {
      this.field_7766 = 1.0F;
      this.field_7765 = 0.0F;
      this.method_6590(var1);
   }

   public strictfp void method_6590(double var1) {
      if (var1 < -360.0 || var1 > 360.0) {
         var1 %= 360.0;
      }

      if (var1 < 0.0) {
         var1 += 360.0;
      }

      double var5 = this.method_6589();
      if (var1 < -360.0 || var1 > 360.0) {
         var5 %= 360.0;
      }

      if (var1 < 0.0) {
         var5 = 360.0 + var5;
      }

      float var7 = this.method_6597();
      this.field_7766 = var7 * (float)class_215.method_933(StrictMath.toRadians(var1));
      this.field_7765 = var7 * (float)class_215.method_932(StrictMath.toRadians(var1));
   }

   public strictfp class_1440 method_6611(double var1) {
      this.method_6590(this.method_6589() + var1);
      return this;
   }

   public strictfp class_1440 method_6604(double var1) {
      this.method_6590(this.method_6589() - var1);
      return this;
   }

   public strictfp double method_6589() {
      double var3 = StrictMath.toDegrees(StrictMath.atan2((double)this.field_7765, (double)this.field_7766));
      if (var3 < -360.0 || var3 > 360.0) {
         var3 %= 360.0;
      }

      if (var3 < 0.0) {
         var3 += 360.0;
      }

      return var3;
   }

   public strictfp float method_6610() {
      return this.field_7766;
   }

   public strictfp float method_6613() {
      return this.field_7765;
   }

   public strictfp class_1440(class_1440 var1) {
      this(var1.method_6610(), var1.method_6613());
   }

   public strictfp class_1440(float var1, float var2) {
      this.field_7766 = var1;
      this.field_7765 = var2;
   }

   public strictfp void method_6592(class_1440 var1) {
      this.method_6591(var1.method_6610(), var1.method_6613());
   }

   public strictfp float method_6606(class_1440 var1) {
      return this.field_7766 * var1.method_6610() + this.field_7765 * var1.method_6613();
   }

   public strictfp class_1440 method_6591(float var1, float var2) {
      this.field_7766 = var1;
      this.field_7765 = var2;
      return this;
   }

   public strictfp class_1440 method_6602() {
      return new class_1440(-this.field_7765, this.field_7766);
   }

   public strictfp class_1440 method_6593(float[] var1) {
      return this.method_6591(var1[0], var1[1]);
   }

   public strictfp class_1440 method_6603() {
      return new class_1440(-this.field_7766, -this.field_7765);
   }

   public strictfp class_1440 method_6599() {
      this.field_7766 = -this.field_7766;
      this.field_7765 = -this.field_7765;
      return this;
   }

   public strictfp class_1440 method_6612(class_1440 var1) {
      this.field_7766 = this.field_7766 + var1.method_6610();
      this.field_7765 = this.field_7765 + var1.method_6613();
      return this;
   }

   public strictfp class_1440 method_6605(class_1440 var1) {
      this.field_7766 = this.field_7766 - var1.method_6610();
      this.field_7765 = this.field_7765 - var1.method_6613();
      return this;
   }

   public strictfp class_1440 method_6595(float var1) {
      this.field_7766 *= var1;
      this.field_7765 *= var1;
      return this;
   }

   public strictfp class_1440 method_6608() {
      float var3 = this.method_6597();
      if (var3 != 0.0F) {
         this.field_7766 /= var3;
         this.field_7765 /= var3;
         return this;
      } else {
         return this;
      }
   }

   public strictfp class_1440 method_6594() {
      class_1440 var3 = this.method_6600();
      var3.method_6608();
      return var3;
   }

   public strictfp float method_6601() {
      return this.field_7766 * this.field_7766 + this.field_7765 * this.field_7765;
   }

   public strictfp float method_6597() {
      return (float)Math.sqrt((double)this.method_6601());
   }

   public strictfp void method_6609(class_1440 var1, class_1440 var2) {
      float var5 = var1.method_6606(this);
      var2.field_7766 = var5 * var1.method_6610();
      var2.field_7765 = var5 * var1.method_6613();
   }

   public strictfp class_1440 method_6600() {
      return new class_1440(this.field_7766, this.field_7765);
   }

   @Override
   public strictfp String toString() {
      return "[Vector2f " + this.field_7766 + "," + this.field_7765 + " (" + this.method_6597() + ")]";
   }

   public strictfp float method_6598(class_1440 var1) {
      return (float)Math.sqrt((double)this.method_6607(var1));
   }

   public strictfp float method_6607(class_1440 var1) {
      float var4 = var1.method_6610() - this.method_6610();
      float var5 = var1.method_6613() - this.method_6613();
      return var4 * var4 + var5 * var5;
   }

   @Override
   public strictfp int hashCode() {
      return 997 * (int)this.field_7766 ^ 991 * (int)this.field_7765;
   }

   @Override
   public strictfp boolean equals(Object var1) {
      if (!(var1 instanceof class_1440)) {
         return false;
      } else {
         class_1440 var4 = (class_1440)var1;
         return var4.field_7766 == this.field_7766 && var4.field_7765 == this.field_7765;
      }
   }
}
