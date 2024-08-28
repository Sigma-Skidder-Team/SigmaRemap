package mapped;

import java.io.Serializable;

public class Class2532 implements Serializable {
   private static final long field16736 = 1339934L;
   public float field16737;
   public float field16738;

   public Class2532() {
   }

   public Class2532(float[] var1) {
      this.field16737 = var1[0];
      this.field16738 = var1[1];
   }

   public Class2532(double var1) {
      this.field16737 = 1.0F;
      this.field16738 = 0.0F;
      this.method10679(var1);
   }

   public strictfp void method10679(double var1) {
      if (var1 < -360.0 || var1 > 360.0) {
         var1 %= 360.0;
      }

      if (var1 < 0.0) {
         var1 += 360.0;
      }

      double var5 = this.method10682();
      if (var1 < -360.0 || var1 > 360.0) {
         var5 %= 360.0;
      }

      if (var1 < 0.0) {
         var5 = 360.0 + var5;
      }

      float var7 = this.method10698();
      this.field16737 = var7 * (float)Class4835.method14957(StrictMath.toRadians(var1));
      this.field16738 = var7 * (float)Class4835.method14956(StrictMath.toRadians(var1));
   }

   public strictfp Class2532 method10680(double var1) {
      this.method10679(this.method10682() + var1);
      return this;
   }

   public strictfp Class2532 method10681(double var1) {
      this.method10679(this.method10682() - var1);
      return this;
   }

   public strictfp double method10682() {
      double var3 = StrictMath.toDegrees(StrictMath.atan2((double)this.field16738, (double)this.field16737));
      if (var3 < -360.0 || var3 > 360.0) {
         var3 %= 360.0;
      }

      if (var3 < 0.0) {
         var3 += 360.0;
      }

      return var3;
   }

   public strictfp float method10683() {
      return this.field16737;
   }

   public strictfp float method10684() {
      return this.field16738;
   }

   public Class2532(Class2532 var1) {
      this(var1.method10683(), var1.method10684());
   }

   public Class2532(float var1, float var2) {
      this.field16737 = var1;
      this.field16738 = var2;
   }

   public strictfp void method10685(Class2532 var1) {
      this.method10687(var1.method10683(), var1.method10684());
   }

   public strictfp float method10686(Class2532 var1) {
      return this.field16737 * var1.method10683() + this.field16738 * var1.method10684();
   }

   public strictfp Class2532 method10687(float var1, float var2) {
      this.field16737 = var1;
      this.field16738 = var2;
      return this;
   }

   public strictfp Class2532 method10688() {
      return new Class2532(-this.field16738, this.field16737);
   }

   public strictfp Class2532 method10689(float[] var1) {
      return this.method10687(var1[0], var1[1]);
   }

   public strictfp Class2532 method10690() {
      return new Class2532(-this.field16737, -this.field16738);
   }

   public strictfp Class2532 method10691() {
      this.field16737 = -this.field16737;
      this.field16738 = -this.field16738;
      return this;
   }

   public strictfp Class2532 method10692(Class2532 var1) {
      this.field16737 = this.field16737 + var1.method10683();
      this.field16738 = this.field16738 + var1.method10684();
      return this;
   }

   public strictfp Class2532 method10693(Class2532 var1) {
      this.field16737 = this.field16737 - var1.method10683();
      this.field16738 = this.field16738 - var1.method10684();
      return this;
   }

   public strictfp Class2532 method10694(float var1) {
      this.field16737 *= var1;
      this.field16738 *= var1;
      return this;
   }

   public strictfp Class2532 method10695() {
      float var3 = this.method10698();
      if (var3 != 0.0F) {
         this.field16737 /= var3;
         this.field16738 /= var3;
         return this;
      } else {
         return this;
      }
   }

   public strictfp Class2532 method10696() {
      Class2532 var3 = this.method10700();
      var3.method10695();
      return var3;
   }

   public strictfp float method10697() {
      return this.field16737 * this.field16737 + this.field16738 * this.field16738;
   }

   public strictfp float method10698() {
      return (float)Math.sqrt((double)this.method10697());
   }

   public strictfp void method10699(Class2532 var1, Class2532 var2) {
      float var5 = var1.method10686(this);
      var2.field16737 = var5 * var1.method10683();
      var2.field16738 = var5 * var1.method10684();
   }

   public strictfp Class2532 method10700() {
      return new Class2532(this.field16737, this.field16738);
   }

   @Override
   public strictfp String toString() {
      return "[Vector2f " + this.field16737 + "," + this.field16738 + " (" + this.method10698() + ")]";
   }

   public strictfp float method10701(Class2532 var1) {
      return (float)Math.sqrt((double)this.method10702(var1));
   }

   public strictfp float method10702(Class2532 var1) {
      float var4 = var1.method10683() - this.method10683();
      float var5 = var1.method10684() - this.method10684();
      return var4 * var4 + var5 * var5;
   }

   @Override
   public strictfp int hashCode() {
      return 997 * (int)this.field16737 ^ 991 * (int)this.field16738;
   }

   @Override
   public strictfp boolean equals(Object var1) {
      if (!(var1 instanceof Class2532)) {
         return false;
      } else {
         Class2532 var4 = (Class2532)var1;
         return var4.field16737 == this.field16737 && var4.field16738 == this.field16738;
      }
   }
}
