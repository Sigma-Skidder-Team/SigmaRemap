package mapped;

import java.io.Serializable;

public class Class2400 extends Class2399 implements Serializable {
   private static String[] field16332;
   public static final long field16333 = -2168194326883512320L;

   public Class2400(float var1, float var2) {
      super(var1, var2);
   }

   public Class2400(float[] var1) {
      super(var1);
   }

   public Class2400(Class2400 var1) {
      super(var1);
   }

   public Class2400(Class2366 var1) {
      super(var1);
   }

   public Class2400(Class2399 var1) {
      super(var1);
   }

   public Class2400(Class2364 var1) {
      super(var1);
   }

   public Class2400() {
   }

   public final float method9940(Class2400 var1) {
      return this.field16330 * var1.field16330 + this.field16331 * var1.field16331;
   }

   public final float method9941() {
      return (float)Math.sqrt((double)(this.field16330 * this.field16330 + this.field16331 * this.field16331));
   }

   public final float method9942() {
      return this.field16330 * this.field16330 + this.field16331 * this.field16331;
   }

   public final void method9943(Class2400 var1) {
      float var4 = (float)(1.0 / Math.sqrt((double)(var1.field16330 * var1.field16330 + var1.field16331 * var1.field16331)));
      this.field16330 = var1.field16330 * var4;
      this.field16331 = var1.field16331 * var4;
   }

   public final void method9944() {
      float var3 = (float)(1.0 / Math.sqrt((double)(this.field16330 * this.field16330 + this.field16331 * this.field16331)));
      this.field16330 *= var3;
      this.field16331 *= var3;
   }

   public final float method9945(Class2400 var1) {
      double var4 = (double)(this.method9940(var1) / (this.method9941() * var1.method9941()));
      if (var4 < -1.0) {
         var4 = -1.0;
      }

      if (var4 > 1.0) {
         var4 = 1.0;
      }

      return (float)Math.acos(var4);
   }
}
