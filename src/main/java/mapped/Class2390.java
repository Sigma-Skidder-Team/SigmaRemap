package mapped;

import java.io.Serializable;

public class Class2390 extends Class2387 implements Serializable {
   private static String[] field16283;
   public static final long field16273 = 3938123424117448700L;

   public Class2390(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public Class2390(double[] var1) {
      super(var1);
   }

   public Class2390(Class2390 var1) {
      super(var1);
   }

   public Class2390(Class2413 var1) {
      super(var1);
   }

   public Class2390(Class2411 var1) {
      super(var1);
   }

   public Class2390(Class2387 var1) {
      super(var1);
   }

   public Class2390(Class2367 var1) {
      super(var1.field16210, var1.field16211, var1.field16212, 0.0);
   }

   public Class2390() {
   }

   public final void method9770(Class2367 var1) {
      this.field16274 = var1.field16210;
      this.field16275 = var1.field16211;
      this.field16276 = var1.field16212;
      this.field16277 = 0.0;
   }

   public final double method9794() {
      return Math.sqrt(
         this.field16274 * this.field16274 + this.field16275 * this.field16275 + this.field16276 * this.field16276 + this.field16277 * this.field16277
      );
   }

   public final double method9795() {
      return this.field16274 * this.field16274 + this.field16275 * this.field16275 + this.field16276 * this.field16276 + this.field16277 * this.field16277;
   }

   public final double method9796(Class2390 var1) {
      return this.field16274 * var1.field16274 + this.field16275 * var1.field16275 + this.field16276 * var1.field16276 + this.field16277 * var1.field16277;
   }

   public final void method9797(Class2390 var1) {
      double var4 = 1.0
         / Math.sqrt(
            var1.field16274 * var1.field16274 + var1.field16275 * var1.field16275 + var1.field16276 * var1.field16276 + var1.field16277 * var1.field16277
         );
      this.field16274 = var1.field16274 * var4;
      this.field16275 = var1.field16275 * var4;
      this.field16276 = var1.field16276 * var4;
      this.field16277 = var1.field16277 * var4;
   }

   public final void method9798() {
      double var3 = 1.0
         / Math.sqrt(
            this.field16274 * this.field16274 + this.field16275 * this.field16275 + this.field16276 * this.field16276 + this.field16277 * this.field16277
         );
      this.field16274 *= var3;
      this.field16275 *= var3;
      this.field16276 *= var3;
      this.field16277 *= var3;
   }

   public final double method9799(Class2390 var1) {
      double var4 = this.method9796(var1) / (this.method9794() * var1.method9794());
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return Math.acos(var4);
   }
}
