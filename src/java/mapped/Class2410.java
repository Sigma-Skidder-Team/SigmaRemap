package mapped;

import java.io.Serializable;

public class Class2410 implements Serializable, Cloneable {
   public static final long field16382 = 3644296204459140589L;
   public double field16383;
   public double field16384;
   public double field16385;
   public double field16386;
   public static final double field16387 = 1.0E-6;

   public Class2410(double var1, double var3, double var5, double var7) {
      this.field16383 = var1;
      this.field16384 = var3;
      this.field16385 = var5;
      this.field16386 = var7;
   }

   public Class2410(double[] var1) {
      this.field16383 = var1[0];
      this.field16384 = var1[1];
      this.field16385 = var1[2];
      this.field16386 = var1[3];
   }

   public Class2410(Class2410 var1) {
      this.field16383 = var1.field16383;
      this.field16384 = var1.field16384;
      this.field16385 = var1.field16385;
      this.field16386 = var1.field16386;
   }

   public Class2410(Class2396 var1) {
      this.field16383 = (double)var1.field16320;
      this.field16384 = (double)var1.field16321;
      this.field16385 = (double)var1.field16322;
      this.field16386 = (double)var1.field16323;
   }

   public Class2410(Class2368 var1, double var2) {
      this.field16383 = var1.field16210;
      this.field16384 = var1.field16211;
      this.field16385 = var1.field16212;
      this.field16386 = var2;
   }

   public Class2410() {
      this.field16383 = 0.0;
      this.field16384 = 0.0;
      this.field16385 = 1.0;
      this.field16386 = 0.0;
   }

   public final void method10152(double var1, double var3, double var5, double var7) {
      this.field16383 = var1;
      this.field16384 = var3;
      this.field16385 = var5;
      this.field16386 = var7;
   }

   public final void method10153(double[] var1) {
      this.field16383 = var1[0];
      this.field16384 = var1[1];
      this.field16385 = var1[2];
      this.field16386 = var1[3];
   }

   public final void method10154(Class2410 var1) {
      this.field16383 = var1.field16383;
      this.field16384 = var1.field16384;
      this.field16385 = var1.field16385;
      this.field16386 = var1.field16386;
   }

   public final void method10155(Class2396 var1) {
      this.field16383 = (double)var1.field16320;
      this.field16384 = (double)var1.field16321;
      this.field16385 = (double)var1.field16322;
      this.field16386 = (double)var1.field16323;
   }

   public final void method10156(Class2368 var1, double var2) {
      this.field16383 = var1.field16210;
      this.field16384 = var1.field16211;
      this.field16385 = var1.field16212;
      this.field16386 = var2;
   }

   public final void method10157(double[] var1) {
      var1[0] = this.field16383;
      var1[1] = this.field16384;
      var1[2] = this.field16385;
      var1[3] = this.field16386;
   }

   public final void method10158(Class2404 var1) {
      Class2363 var4 = new Class2363();
      var1.method9970(var4);
      this.field16383 = (double)((float)(var4.field16192 - var4.field16190));
      this.field16384 = (double)((float)(var4.field16187 - var4.field16191));
      this.field16385 = (double)((float)(var4.field16188 - var4.field16186));
      double var5 = this.field16383 * this.field16383 + this.field16384 * this.field16384 + this.field16385 * this.field16385;
      if (!(var5 > 1.0E-6)) {
         this.field16383 = 0.0;
         this.field16384 = 1.0;
         this.field16385 = 0.0;
         this.field16386 = 0.0;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * (var4.field16185 + var4.field16189 + var4.field16193 - 1.0);
         this.field16386 = (double)((float)Math.atan2(var7, var9));
         double var11 = 1.0 / var5;
         this.field16383 *= var11;
         this.field16384 *= var11;
         this.field16385 *= var11;
      }
   }

   public final void method10159(Class2417 var1) {
      Class2363 var4 = new Class2363();
      var1.method10247(var4);
      this.field16383 = (double)((float)(var4.field16192 - var4.field16190));
      this.field16384 = (double)((float)(var4.field16187 - var4.field16191));
      this.field16385 = (double)((float)(var4.field16188 - var4.field16186));
      double var5 = this.field16383 * this.field16383 + this.field16384 * this.field16384 + this.field16385 * this.field16385;
      if (!(var5 > 1.0E-6)) {
         this.field16383 = 0.0;
         this.field16384 = 1.0;
         this.field16385 = 0.0;
         this.field16386 = 0.0;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * (var4.field16185 + var4.field16189 + var4.field16193 - 1.0);
         this.field16386 = (double)((float)Math.atan2(var7, var9));
         double var11 = 1.0 / var5;
         this.field16383 *= var11;
         this.field16384 *= var11;
         this.field16385 *= var11;
      }
   }

   public final void method10160(Class2372 var1) {
      this.field16383 = (double)(var1.field16229 - var1.field16227);
      this.field16384 = (double)(var1.field16224 - var1.field16228);
      this.field16385 = (double)(var1.field16225 - var1.field16223);
      double var4 = this.field16383 * this.field16383 + this.field16384 * this.field16384 + this.field16385 * this.field16385;
      if (!(var4 > 1.0E-6)) {
         this.field16383 = 0.0;
         this.field16384 = 1.0;
         this.field16385 = 0.0;
         this.field16386 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * ((double)(var1.field16222 + var1.field16226 + var1.field16230) - 1.0);
         this.field16386 = (double)((float)Math.atan2(var6, var8));
         double var10 = 1.0 / var4;
         this.field16383 *= var10;
         this.field16384 *= var10;
         this.field16385 *= var10;
      }
   }

   public final void method10161(Class2363 var1) {
      this.field16383 = (double)((float)(var1.field16192 - var1.field16190));
      this.field16384 = (double)((float)(var1.field16187 - var1.field16191));
      this.field16385 = (double)((float)(var1.field16188 - var1.field16186));
      double var4 = this.field16383 * this.field16383 + this.field16384 * this.field16384 + this.field16385 * this.field16385;
      if (!(var4 > 1.0E-6)) {
         this.field16383 = 0.0;
         this.field16384 = 1.0;
         this.field16385 = 0.0;
         this.field16386 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * (var1.field16185 + var1.field16189 + var1.field16193 - 1.0);
         this.field16386 = (double)((float)Math.atan2(var6, var8));
         double var10 = 1.0 / var4;
         this.field16383 *= var10;
         this.field16384 *= var10;
         this.field16385 *= var10;
      }
   }

   public final void method10162(Class2415 var1) {
      double var4 = (double)(var1.field16389 * var1.field16389 + var1.field16390 * var1.field16390 + var1.field16391 * var1.field16391);
      if (!(var4 > 1.0E-6)) {
         this.field16383 = 0.0;
         this.field16384 = 1.0;
         this.field16385 = 0.0;
         this.field16386 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field16383 = (double)var1.field16389 * var6;
         this.field16384 = (double)var1.field16390 * var6;
         this.field16385 = (double)var1.field16391 * var6;
         this.field16386 = 2.0 * Math.atan2(var4, (double)var1.field16392);
      }
   }

   public final void method10163(Class2389 var1) {
      double var4 = var1.field16274 * var1.field16274 + var1.field16275 * var1.field16275 + var1.field16276 * var1.field16276;
      if (!(var4 > 1.0E-6)) {
         this.field16383 = 0.0;
         this.field16384 = 1.0;
         this.field16385 = 0.0;
         this.field16386 = 0.0;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field16383 = var1.field16274 * var6;
         this.field16384 = var1.field16275 * var6;
         this.field16385 = var1.field16276 * var6;
         this.field16386 = 2.0 * Math.atan2(var4, var1.field16277);
      }
   }

   @Override
   public String toString() {
      return "(" + this.field16383 + ", " + this.field16384 + ", " + this.field16385 + ", " + this.field16386 + ")";
   }

   public boolean equals(Class2410 var1) {
      try {
         return this.field16383 == var1.field16383
            && this.field16384 == var1.field16384
            && this.field16385 == var1.field16385
            && this.field16386 == var1.field16386;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2410 var4 = (Class2410)var1;
         return this.field16383 == var4.field16383
            && this.field16384 == var4.field16384
            && this.field16385 == var4.field16385
            && this.field16386 == var4.field16386;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method10164(Class2410 var1, double var2) {
      double var6 = this.field16383 - var1.field16383;
      if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
         var6 = this.field16384 - var1.field16384;
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field16385 - var1.field16385;
            if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
               var6 = this.field16386 - var1.field16386;
               return !((!(var6 < 0.0) ? var6 : -var6) > var2);
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + Class9832.method38797(this.field16383);
      var3 = 31L * var3 + Class9832.method38797(this.field16384);
      var3 = 31L * var3 + Class9832.method38797(this.field16385);
      var3 = 31L * var3 + Class9832.method38797(this.field16386);
      return (int)(var3 ^ var3 >> 32);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }
   }

   public final double method10165() {
      return this.field16386;
   }

   public final void method10166(double var1) {
      this.field16386 = var1;
   }

   public double method10167() {
      return this.field16383;
   }

   public final void method10168(double var1) {
      this.field16383 = var1;
   }

   public final double method10169() {
      return this.field16384;
   }

   public final void method10170(double var1) {
      this.field16384 = var1;
   }

   public double method10171() {
      return this.field16385;
   }

   public final void method10172(double var1) {
      this.field16385 = var1;
   }
}
