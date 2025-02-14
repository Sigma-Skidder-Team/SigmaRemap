package mapped;

import java.io.Serializable;

public class Class2396 implements Serializable, Cloneable {
   public static final long field16319 = -163246355858070601L;
   public float field16320;
   public float field16321;
   public float field16322;
   public float field16323;
   public static final double field16324 = 1.0E-6;

   public Class2396(float var1, float var2, float var3, float var4) {
      this.field16320 = var1;
      this.field16321 = var2;
      this.field16322 = var3;
      this.field16323 = var4;
   }

   public Class2396(float[] var1) {
      this.field16320 = var1[0];
      this.field16321 = var1[1];
      this.field16322 = var1[2];
      this.field16323 = var1[3];
   }

   public Class2396(Class2396 var1) {
      this.field16320 = var1.field16320;
      this.field16321 = var1.field16321;
      this.field16322 = var1.field16322;
      this.field16323 = var1.field16323;
   }

   public Class2396(Class2410 var1) {
      this.field16320 = (float)var1.field16383;
      this.field16321 = (float)var1.field16384;
      this.field16322 = (float)var1.field16385;
      this.field16323 = (float)var1.field16386;
   }

   public Class2396(Class6 var1, float var2) {
      this.field16320 = var1.field8;
      this.field16321 = var1.field9;
      this.field16322 = var1.field10;
      this.field16323 = var2;
   }

   public Class2396() {
      this.field16320 = 0.0F;
      this.field16321 = 0.0F;
      this.field16322 = 1.0F;
      this.field16323 = 0.0F;
   }

   public final void method9862(float var1, float var2, float var3, float var4) {
      this.field16320 = var1;
      this.field16321 = var2;
      this.field16322 = var3;
      this.field16323 = var4;
   }

   public final void method9863(float[] var1) {
      this.field16320 = var1[0];
      this.field16321 = var1[1];
      this.field16322 = var1[2];
      this.field16323 = var1[3];
   }

   public final void method9864(Class2396 var1) {
      this.field16320 = var1.field16320;
      this.field16321 = var1.field16321;
      this.field16322 = var1.field16322;
      this.field16323 = var1.field16323;
   }

   public final void method9865(Class2410 var1) {
      this.field16320 = (float)var1.field16383;
      this.field16321 = (float)var1.field16384;
      this.field16322 = (float)var1.field16385;
      this.field16323 = (float)var1.field16386;
   }

   public final void method9866(Class6 var1, float var2) {
      this.field16320 = var1.field8;
      this.field16321 = var1.field9;
      this.field16322 = var1.field10;
      this.field16323 = var2;
   }

   public final void method9867(float[] var1) {
      var1[0] = this.field16320;
      var1[1] = this.field16321;
      var1[2] = this.field16322;
      var1[3] = this.field16323;
   }

   public final void method9868(Class2415 var1) {
      double var4 = (double)(var1.field16389 * var1.field16389 + var1.field16390 * var1.field16390 + var1.field16391 * var1.field16391);
      if (!(var4 > 1.0E-6)) {
         this.field16320 = 0.0F;
         this.field16321 = 1.0F;
         this.field16322 = 0.0F;
         this.field16323 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field16320 = (float)((double)var1.field16389 * var6);
         this.field16321 = (float)((double)var1.field16390 * var6);
         this.field16322 = (float)((double)var1.field16391 * var6);
         this.field16323 = (float)(2.0 * Math.atan2(var4, (double)var1.field16392));
      }
   }

   public final void method9869(Class2389 var1) {
      double var4 = var1.field16274 * var1.field16274 + var1.field16275 * var1.field16275 + var1.field16276 * var1.field16276;
      if (!(var4 > 1.0E-6)) {
         this.field16320 = 0.0F;
         this.field16321 = 1.0F;
         this.field16322 = 0.0F;
         this.field16323 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 1.0 / var4;
         this.field16320 = (float)(var1.field16274 * var6);
         this.field16321 = (float)(var1.field16275 * var6);
         this.field16322 = (float)(var1.field16276 * var6);
         this.field16323 = (float)(2.0 * Math.atan2(var4, var1.field16277));
      }
   }

   public final void method9870(Class2404 var1) {
      Class2372 var4 = new Class2372();
      var1.method9971(var4);
      this.field16320 = var4.field16229 - var4.field16227;
      this.field16321 = var4.field16224 - var4.field16228;
      this.field16322 = var4.field16225 - var4.field16223;
      double var5 = (double)(this.field16320 * this.field16320 + this.field16321 * this.field16321 + this.field16322 * this.field16322);
      if (!(var5 > 1.0E-6)) {
         this.field16320 = 0.0F;
         this.field16321 = 1.0F;
         this.field16322 = 0.0F;
         this.field16323 = 0.0F;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * ((double)(var4.field16222 + var4.field16226 + var4.field16230) - 1.0);
         this.field16323 = (float)Math.atan2(var7, var9);
         double var11 = 1.0 / var5;
         this.field16320 = (float)((double)this.field16320 * var11);
         this.field16321 = (float)((double)this.field16321 * var11);
         this.field16322 = (float)((double)this.field16322 * var11);
      }
   }

   public final void method9871(Class2417 var1) {
      Class2363 var4 = new Class2363();
      var1.method10247(var4);
      this.field16320 = (float)(var4.field16192 - var4.field16190);
      this.field16321 = (float)(var4.field16187 - var4.field16191);
      this.field16322 = (float)(var4.field16188 - var4.field16186);
      double var5 = (double)(this.field16320 * this.field16320 + this.field16321 * this.field16321 + this.field16322 * this.field16322);
      if (!(var5 > 1.0E-6)) {
         this.field16320 = 0.0F;
         this.field16321 = 1.0F;
         this.field16322 = 0.0F;
         this.field16323 = 0.0F;
      } else {
         var5 = Math.sqrt(var5);
         double var7 = 0.5 * var5;
         double var9 = 0.5 * (var4.field16185 + var4.field16189 + var4.field16193 - 1.0);
         this.field16323 = (float)Math.atan2(var7, var9);
         double var11 = 1.0 / var5;
         this.field16320 = (float)((double)this.field16320 * var11);
         this.field16321 = (float)((double)this.field16321 * var11);
         this.field16322 = (float)((double)this.field16322 * var11);
      }
   }

   public final void method9872(Class2372 var1) {
      this.field16320 = var1.field16229 - var1.field16227;
      this.field16321 = var1.field16224 - var1.field16228;
      this.field16322 = var1.field16225 - var1.field16223;
      double var4 = (double)(this.field16320 * this.field16320 + this.field16321 * this.field16321 + this.field16322 * this.field16322);
      if (!(var4 > 1.0E-6)) {
         this.field16320 = 0.0F;
         this.field16321 = 1.0F;
         this.field16322 = 0.0F;
         this.field16323 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * ((double)(var1.field16222 + var1.field16226 + var1.field16230) - 1.0);
         this.field16323 = (float)Math.atan2(var6, var8);
         double var10 = 1.0 / var4;
         this.field16320 = (float)((double)this.field16320 * var10);
         this.field16321 = (float)((double)this.field16321 * var10);
         this.field16322 = (float)((double)this.field16322 * var10);
      }
   }

   public final void method9873(Class2363 var1) {
      this.field16320 = (float)(var1.field16192 - var1.field16190);
      this.field16321 = (float)(var1.field16187 - var1.field16191);
      this.field16322 = (float)(var1.field16188 - var1.field16186);
      double var4 = (double)(this.field16320 * this.field16320 + this.field16321 * this.field16321 + this.field16322 * this.field16322);
      if (!(var4 > 1.0E-6)) {
         this.field16320 = 0.0F;
         this.field16321 = 1.0F;
         this.field16322 = 0.0F;
         this.field16323 = 0.0F;
      } else {
         var4 = Math.sqrt(var4);
         double var6 = 0.5 * var4;
         double var8 = 0.5 * (var1.field16185 + var1.field16189 + var1.field16193 - 1.0);
         this.field16323 = (float)Math.atan2(var6, var8);
         double var10 = 1.0 / var4;
         this.field16320 = (float)((double)this.field16320 * var10);
         this.field16321 = (float)((double)this.field16321 * var10);
         this.field16322 = (float)((double)this.field16322 * var10);
      }
   }

   @Override
   public String toString() {
      return "(" + this.field16320 + ", " + this.field16321 + ", " + this.field16322 + ", " + this.field16323 + ")";
   }

   public boolean equals(Class2396 var1) {
      try {
         return this.field16320 == var1.field16320
            && this.field16321 == var1.field16321
            && this.field16322 == var1.field16322
            && this.field16323 == var1.field16323;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2396 var4 = (Class2396)var1;
         return this.field16320 == var4.field16320
            && this.field16321 == var4.field16321
            && this.field16322 == var4.field16322
            && this.field16323 == var4.field16323;
      } catch (NullPointerException var5) {
         return false;
      } catch (ClassCastException var6) {
         return false;
      }
   }

   public boolean method9874(Class2396 var1, float var2) {
      float var5 = this.field16320 - var1.field16320;
      if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
         var5 = this.field16321 - var1.field16321;
         if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
            var5 = this.field16322 - var1.field16322;
            if (!((!(var5 < 0.0F) ? var5 : -var5) > var2)) {
               var5 = this.field16323 - var1.field16323;
               return !((!(var5 < 0.0F) ? var5 : -var5) > var2);
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
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16320);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16321);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16322);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16323);
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

   public final float method9875() {
      return this.field16323;
   }

   public final void method9876(float var1) {
      this.field16323 = var1;
   }

   public final float method9877() {
      return this.field16320;
   }

   public final void method9878(float var1) {
      this.field16320 = var1;
   }

   public final float method9879() {
      return this.field16321;
   }

   public final void method9880(float var1) {
      this.field16321 = var1;
   }

   public final float method9881() {
      return this.field16322;
   }

   public final void method9882(float var1) {
      this.field16322 = var1;
   }
}
