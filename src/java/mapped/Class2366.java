package mapped;

import java.io.Serializable;

public class Class2366 extends Class2364 implements Serializable {
   private static String[] field16207;
   public static final long field16208 = 8572646365302599857L;

   public Class2366(double var1, double var3) {
      super(var1, var3);
   }

   public Class2366(double[] var1) {
      super(var1);
   }

   public Class2366(Class2366 var1) {
      super(var1);
   }

   public Class2366(Class2400 var1) {
      super(var1);
   }

   public Class2366(Class2364 var1) {
      super(var1);
   }

   public Class2366(Class2399 var1) {
      super(var1);
   }

   public Class2366() {
   }

   public final double method9484(Class2366 var1) {
      return this.field16203 * var1.field16203 + this.field16204 * var1.field16204;
   }

   public final double method9485() {
      return Math.sqrt(this.field16203 * this.field16203 + this.field16204 * this.field16204);
   }

   public final double method9486() {
      return this.field16203 * this.field16203 + this.field16204 * this.field16204;
   }

   public final void method9487(Class2366 var1) {
      double var4 = 1.0 / Math.sqrt(var1.field16203 * var1.field16203 + var1.field16204 * var1.field16204);
      this.field16203 = var1.field16203 * var4;
      this.field16204 = var1.field16204 * var4;
   }

   public final void method9488() {
      double var3 = 1.0 / Math.sqrt(this.field16203 * this.field16203 + this.field16204 * this.field16204);
      this.field16203 *= var3;
      this.field16204 *= var3;
   }

   public final double method9489(Class2366 var1) {
      double var4 = this.method9484(var1) / (this.method9485() * var1.method9485());
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return Math.acos(var4);
   }
}
