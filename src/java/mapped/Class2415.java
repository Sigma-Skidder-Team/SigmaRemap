package mapped;

import java.io.Serializable;

public class Class2415 extends Class2411 implements Serializable {
   private static String[] field16396;
   public static final long field16388 = 2675933778405442383L;
   public static final double field16397 = 1.0E-6;
   public static final double field16398 = 1.0E-30;
   public static final double field16399 = 1.57079632679;

   public Class2415(float var1, float var2, float var3, float var4) {
      float var7 = (float)(1.0 / Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3 + var4 * var4)));
      this.field16389 = var1 * var7;
      this.field16390 = var2 * var7;
      this.field16391 = var3 * var7;
      this.field16392 = var4 * var7;
   }

   public Class2415(float[] var1) {
      float var4 = (float)(1.0 / Math.sqrt((double)(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3])));
      this.field16389 = var1[0] * var4;
      this.field16390 = var1[1] * var4;
      this.field16391 = var1[2] * var4;
      this.field16392 = var1[3] * var4;
   }

   public Class2415(Class2415 var1) {
      super(var1);
   }

   public Class2415(Class2389 var1) {
      super(var1);
   }

   public Class2415(Class2411 var1) {
      float var4 = (float)(
         1.0
            / Math.sqrt(
               (double)(
                  var1.field16389 * var1.field16389 + var1.field16390 * var1.field16390 + var1.field16391 * var1.field16391 + var1.field16392 * var1.field16392
               )
            )
      );
      this.field16389 = var1.field16389 * var4;
      this.field16390 = var1.field16390 * var4;
      this.field16391 = var1.field16391 * var4;
      this.field16392 = var1.field16392 * var4;
   }

   public Class2415(Class2387 var1) {
      double var4 = 1.0
         / Math.sqrt(
            var1.field16274 * var1.field16274 + var1.field16275 * var1.field16275 + var1.field16276 * var1.field16276 + var1.field16277 * var1.field16277
         );
      this.field16389 = (float)(var1.field16274 * var4);
      this.field16390 = (float)(var1.field16275 * var4);
      this.field16391 = (float)(var1.field16276 * var4);
      this.field16392 = (float)(var1.field16277 * var4);
   }

   public Class2415() {
   }

   public final void method10220(Class2415 var1) {
      this.field16389 = -var1.field16389;
      this.field16390 = -var1.field16390;
      this.field16391 = -var1.field16391;
      this.field16392 = var1.field16392;
   }

   public final void method10221() {
      this.field16389 = -this.field16389;
      this.field16390 = -this.field16390;
      this.field16391 = -this.field16391;
   }

   public final void method10222(Class2415 var1, Class2415 var2) {
      if (this != var1 && this != var2) {
         this.field16392 = var1.field16392 * var2.field16392
            - var1.field16389 * var2.field16389
            - var1.field16390 * var2.field16390
            - var1.field16391 * var2.field16391;
         this.field16389 = var1.field16392 * var2.field16389
            + var2.field16392 * var1.field16389
            + var1.field16390 * var2.field16391
            - var1.field16391 * var2.field16390;
         this.field16390 = var1.field16392 * var2.field16390
            + var2.field16392 * var1.field16390
            - var1.field16389 * var2.field16391
            + var1.field16391 * var2.field16389;
         this.field16391 = var1.field16392 * var2.field16391
            + var2.field16392 * var1.field16391
            + var1.field16389 * var2.field16390
            - var1.field16390 * var2.field16389;
      } else {
         float var5 = var1.field16392 * var2.field16392
            - var1.field16389 * var2.field16389
            - var1.field16390 * var2.field16390
            - var1.field16391 * var2.field16391;
         float var6 = var1.field16392 * var2.field16389
            + var2.field16392 * var1.field16389
            + var1.field16390 * var2.field16391
            - var1.field16391 * var2.field16390;
         float var7 = var1.field16392 * var2.field16390
            + var2.field16392 * var1.field16390
            - var1.field16389 * var2.field16391
            + var1.field16391 * var2.field16389;
         this.field16391 = var1.field16392 * var2.field16391
            + var2.field16392 * var1.field16391
            + var1.field16389 * var2.field16390
            - var1.field16390 * var2.field16389;
         this.field16392 = var5;
         this.field16389 = var6;
         this.field16390 = var7;
      }
   }

   public final void method10223(Class2415 var1) {
      float var4 = this.field16392 * var1.field16392
         - this.field16389 * var1.field16389
         - this.field16390 * var1.field16390
         - this.field16391 * var1.field16391;
      float var5 = this.field16392 * var1.field16389
         + var1.field16392 * this.field16389
         + this.field16390 * var1.field16391
         - this.field16391 * var1.field16390;
      float var6 = this.field16392 * var1.field16390
         + var1.field16392 * this.field16390
         - this.field16389 * var1.field16391
         + this.field16391 * var1.field16389;
      this.field16391 = this.field16392 * var1.field16391
         + var1.field16392 * this.field16391
         + this.field16389 * var1.field16390
         - this.field16390 * var1.field16389;
      this.field16392 = var4;
      this.field16389 = var5;
      this.field16390 = var6;
   }

   public final void method10224(Class2415 var1, Class2415 var2) {
      Class2415 var5 = new Class2415(var2);
      var5.method10227();
      this.method10222(var1, var5);
   }

   public final void method10225(Class2415 var1) {
      Class2415 var4 = new Class2415(var1);
      var4.method10227();
      this.method10223(var4);
   }

   public final void method10226(Class2415 var1) {
      float var4 = 1.0F
         / (var1.field16392 * var1.field16392 + var1.field16389 * var1.field16389 + var1.field16390 * var1.field16390 + var1.field16391 * var1.field16391);
      this.field16392 = var4 * var1.field16392;
      this.field16389 = -var4 * var1.field16389;
      this.field16390 = -var4 * var1.field16390;
      this.field16391 = -var4 * var1.field16391;
   }

   public final void method10227() {
      float var3 = 1.0F
         / (this.field16392 * this.field16392 + this.field16389 * this.field16389 + this.field16390 * this.field16390 + this.field16391 * this.field16391);
      this.field16392 *= var3;
      this.field16389 *= -var3;
      this.field16390 *= -var3;
      this.field16391 *= -var3;
   }

   public final void method10228(Class2415 var1) {
      float var4 = var1.field16389 * var1.field16389
         + var1.field16390 * var1.field16390
         + var1.field16391 * var1.field16391
         + var1.field16392 * var1.field16392;
      if (!(var4 > 0.0F)) {
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 0.0F;
         this.field16392 = 0.0F;
      } else {
         var4 = 1.0F / (float)Math.sqrt((double)var4);
         this.field16389 = var4 * var1.field16389;
         this.field16390 = var4 * var1.field16390;
         this.field16391 = var4 * var1.field16391;
         this.field16392 = var4 * var1.field16392;
      }
   }

   public final void method10229() {
      float var3 = this.field16389 * this.field16389
         + this.field16390 * this.field16390
         + this.field16391 * this.field16391
         + this.field16392 * this.field16392;
      if (!(var3 > 0.0F)) {
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 0.0F;
         this.field16392 = 0.0F;
      } else {
         var3 = 1.0F / (float)Math.sqrt((double)var3);
         this.field16389 *= var3;
         this.field16390 *= var3;
         this.field16391 *= var3;
         this.field16392 *= var3;
      }
   }

   public final void method10230(Class2404 var1) {
      float var4 = 0.25F * (var1.field16350 + var1.field16355 + var1.field16360 + var1.field16365);
      if (!(var4 >= 0.0F)) {
         this.field16392 = 0.0F;
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 1.0F;
      } else if (!((double)var4 >= 1.0E-30)) {
         this.field16392 = 0.0F;
         var4 = -0.5F * (var1.field16355 + var1.field16360);
         if (!(var4 >= 0.0F)) {
            this.field16389 = 0.0F;
            this.field16390 = 0.0F;
            this.field16391 = 1.0F;
         } else if (!((double)var4 >= 1.0E-30)) {
            this.field16389 = 0.0F;
            var4 = 0.5F * (1.0F - var1.field16360);
            if (!((double)var4 >= 1.0E-30)) {
               this.field16390 = 0.0F;
               this.field16391 = 1.0F;
            } else {
               this.field16390 = (float)Math.sqrt((double)var4);
               this.field16391 = var1.field16359 / (2.0F * this.field16390);
            }
         } else {
            this.field16389 = (float)Math.sqrt((double)var4);
            var4 = 1.0F / (2.0F * this.field16389);
            this.field16390 = var1.field16354 * var4;
            this.field16391 = var1.field16358 * var4;
         }
      } else {
         this.field16392 = (float)Math.sqrt((double)var4);
         var4 = 0.25F / this.field16392;
         this.field16389 = (var1.field16359 - var1.field16356) * var4;
         this.field16390 = (var1.field16352 - var1.field16358) * var4;
         this.field16391 = (var1.field16354 - var1.field16351) * var4;
      }
   }

   public final void method10231(Class2417 var1) {
      double var4 = 0.25 * (var1.field16402 + var1.field16407 + var1.field16412 + var1.field16417);
      if (!(var4 >= 0.0)) {
         this.field16392 = 0.0F;
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 1.0F;
      } else if (!(var4 >= 1.0E-30)) {
         this.field16392 = 0.0F;
         var4 = -0.5 * (var1.field16407 + var1.field16412);
         if (!(var4 >= 0.0)) {
            this.field16389 = 0.0F;
            this.field16390 = 0.0F;
            this.field16391 = 1.0F;
         } else if (!(var4 >= 1.0E-30)) {
            this.field16389 = 0.0F;
            var4 = 0.5 * (1.0 - var1.field16412);
            if (!(var4 >= 1.0E-30)) {
               this.field16390 = 0.0F;
               this.field16391 = 1.0F;
            } else {
               this.field16390 = (float)Math.sqrt(var4);
               this.field16391 = (float)(var1.field16411 / (2.0 * (double)this.field16390));
            }
         } else {
            this.field16389 = (float)Math.sqrt(var4);
            var4 = 0.5 / (double)this.field16389;
            this.field16390 = (float)(var1.field16406 * var4);
            this.field16391 = (float)(var1.field16410 * var4);
         }
      } else {
         this.field16392 = (float)Math.sqrt(var4);
         var4 = 0.25 / (double)this.field16392;
         this.field16389 = (float)((var1.field16411 - var1.field16408) * var4);
         this.field16390 = (float)((var1.field16404 - var1.field16410) * var4);
         this.field16391 = (float)((var1.field16406 - var1.field16403) * var4);
      }
   }

   public final void method10232(Class2372 var1) {
      float var4 = 0.25F * (var1.field16222 + var1.field16226 + var1.field16230 + 1.0F);
      if (!(var4 >= 0.0F)) {
         this.field16392 = 0.0F;
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 1.0F;
      } else if (!((double)var4 >= 1.0E-30)) {
         this.field16392 = 0.0F;
         var4 = -0.5F * (var1.field16226 + var1.field16230);
         if (!(var4 >= 0.0F)) {
            this.field16389 = 0.0F;
            this.field16390 = 0.0F;
            this.field16391 = 1.0F;
         } else if (!((double)var4 >= 1.0E-30)) {
            this.field16389 = 0.0F;
            var4 = 0.5F * (1.0F - var1.field16230);
            if (!((double)var4 >= 1.0E-30)) {
               this.field16390 = 0.0F;
               this.field16391 = 1.0F;
            } else {
               this.field16390 = (float)Math.sqrt((double)var4);
               this.field16391 = var1.field16229 / (2.0F * this.field16390);
            }
         } else {
            this.field16389 = (float)Math.sqrt((double)var4);
            var4 = 0.5F / this.field16389;
            this.field16390 = var1.field16225 * var4;
            this.field16391 = var1.field16228 * var4;
         }
      } else {
         this.field16392 = (float)Math.sqrt((double)var4);
         var4 = 0.25F / this.field16392;
         this.field16389 = (var1.field16229 - var1.field16227) * var4;
         this.field16390 = (var1.field16224 - var1.field16228) * var4;
         this.field16391 = (var1.field16225 - var1.field16223) * var4;
      }
   }

   public final void method10233(Class2363 var1) {
      double var4 = 0.25 * (var1.field16185 + var1.field16189 + var1.field16193 + 1.0);
      if (!(var4 >= 0.0)) {
         this.field16392 = 0.0F;
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 1.0F;
      } else if (!(var4 >= 1.0E-30)) {
         this.field16392 = 0.0F;
         var4 = -0.5 * (var1.field16189 + var1.field16193);
         if (!(var4 >= 0.0)) {
            this.field16389 = 0.0F;
            this.field16390 = 0.0F;
            this.field16391 = 1.0F;
         } else if (!(var4 >= 1.0E-30)) {
            this.field16389 = 0.0F;
            var4 = 0.5 * (1.0 - var1.field16193);
            if (!(var4 >= 1.0E-30)) {
               this.field16390 = 0.0F;
               this.field16391 = 1.0F;
            } else {
               this.field16390 = (float)Math.sqrt(var4);
               this.field16391 = (float)(var1.field16192 / (2.0 * (double)this.field16390));
            }
         } else {
            this.field16389 = (float)Math.sqrt(var4);
            var4 = 0.5 / (double)this.field16389;
            this.field16390 = (float)(var1.field16188 * var4);
            this.field16391 = (float)(var1.field16191 * var4);
         }
      } else {
         this.field16392 = (float)Math.sqrt(var4);
         var4 = 0.25 / (double)this.field16392;
         this.field16389 = (float)((var1.field16192 - var1.field16190) * var4);
         this.field16390 = (float)((var1.field16187 - var1.field16191) * var4);
         this.field16391 = (float)((var1.field16188 - var1.field16186) * var4);
      }
   }

   public final void method10234(Class2396 var1) {
      float var4 = (float)Math.sqrt((double)(var1.field16320 * var1.field16320 + var1.field16321 * var1.field16321 + var1.field16322 * var1.field16322));
      if (!((double)var4 < 1.0E-6)) {
         var4 = 1.0F / var4;
         float var5 = (float)Math.sin((double)var1.field16323 / 2.0);
         this.field16392 = (float)Math.cos((double)var1.field16323 / 2.0);
         this.field16389 = var1.field16320 * var4 * var5;
         this.field16390 = var1.field16321 * var4 * var5;
         this.field16391 = var1.field16322 * var4 * var5;
      } else {
         this.field16392 = 0.0F;
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 0.0F;
      }
   }

   public final void method10235(Class2410 var1) {
      float var4 = (float)(1.0 / Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385));
      if (!((double)var4 < 1.0E-6)) {
         var4 = 1.0F / var4;
         float var5 = (float)Math.sin(var1.field16386 / 2.0);
         this.field16392 = (float)Math.cos(var1.field16386 / 2.0);
         this.field16389 = (float)var1.field16383 * var4 * var5;
         this.field16390 = (float)var1.field16384 * var4 * var5;
         this.field16391 = (float)var1.field16385 * var4 * var5;
      } else {
         this.field16392 = 0.0F;
         this.field16389 = 0.0F;
         this.field16390 = 0.0F;
         this.field16391 = 0.0F;
      }
   }

   public final void method10236(Class2415 var1, float var2) {
      double var5 = (double)(
         this.field16389 * var1.field16389 + this.field16390 * var1.field16390 + this.field16391 * var1.field16391 + this.field16392 * var1.field16392
      );
      if (var5 < 0.0) {
         var1.field16389 = -var1.field16389;
         var1.field16390 = -var1.field16390;
         var1.field16391 = -var1.field16391;
         var1.field16392 = -var1.field16392;
         var5 = -var5;
      }

      double var7;
      double var9;
      if (!(1.0 - var5 > 1.0E-6)) {
         var7 = 1.0 - (double)var2;
         var9 = (double)var2;
      } else {
         double var11 = Math.acos(var5);
         double var13 = Math.sin(var11);
         var7 = Math.sin((1.0 - (double)var2) * var11) / var13;
         var9 = Math.sin((double)var2 * var11) / var13;
      }

      this.field16392 = (float)(var7 * (double)this.field16392 + var9 * (double)var1.field16392);
      this.field16389 = (float)(var7 * (double)this.field16389 + var9 * (double)var1.field16389);
      this.field16390 = (float)(var7 * (double)this.field16390 + var9 * (double)var1.field16390);
      this.field16391 = (float)(var7 * (double)this.field16391 + var9 * (double)var1.field16391);
   }

   public final void method10237(Class2415 var1, Class2415 var2, float var3) {
      double var6 = (double)(
         var2.field16389 * var1.field16389 + var2.field16390 * var1.field16390 + var2.field16391 * var1.field16391 + var2.field16392 * var1.field16392
      );
      if (var6 < 0.0) {
         var1.field16389 = -var1.field16389;
         var1.field16390 = -var1.field16390;
         var1.field16391 = -var1.field16391;
         var1.field16392 = -var1.field16392;
         var6 = -var6;
      }

      double var8;
      double var10;
      if (!(1.0 - var6 > 1.0E-6)) {
         var8 = 1.0 - (double)var3;
         var10 = (double)var3;
      } else {
         double var12 = Math.acos(var6);
         double var14 = Math.sin(var12);
         var8 = Math.sin((1.0 - (double)var3) * var12) / var14;
         var10 = Math.sin((double)var3 * var12) / var14;
      }

      this.field16392 = (float)(var8 * (double)var1.field16392 + var10 * (double)var2.field16392);
      this.field16389 = (float)(var8 * (double)var1.field16389 + var10 * (double)var2.field16389);
      this.field16390 = (float)(var8 * (double)var1.field16390 + var10 * (double)var2.field16390);
      this.field16391 = (float)(var8 * (double)var1.field16391 + var10 * (double)var2.field16391);
   }
}
