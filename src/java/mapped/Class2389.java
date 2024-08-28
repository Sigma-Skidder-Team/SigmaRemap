package mapped;

import java.io.Serializable;

public class Class2389 extends Class2387 implements Serializable {
   private static String[] field16279;
   public static final long field16273 = 7577479888820201099L;
   public static final double field16280 = 1.0E-6;
   public static final double field16281 = 1.0E-30;
   public static final double field16282 = 1.57079632679;

   public Class2389(double var1, double var3, double var5, double var7) {
      double var11 = 1.0 / Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5 + var7 * var7);
      this.field16274 = var1 * var11;
      this.field16275 = var3 * var11;
      this.field16276 = var5 * var11;
      this.field16277 = var7 * var11;
   }

   public Class2389(double[] var1) {
      double var4 = 1.0 / Math.sqrt(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3]);
      this.field16274 = var1[0] * var4;
      this.field16275 = var1[1] * var4;
      this.field16276 = var1[2] * var4;
      this.field16277 = var1[3] * var4;
   }

   public Class2389(Class2389 var1) {
      super(var1);
   }

   public Class2389(Class2415 var1) {
      super(var1);
   }

   public Class2389(Class2411 var1) {
      double var4 = 1.0
         / Math.sqrt(
            (double)(
               var1.field16389 * var1.field16389 + var1.field16390 * var1.field16390 + var1.field16391 * var1.field16391 + var1.field16392 * var1.field16392
            )
         );
      this.field16274 = (double)var1.field16389 * var4;
      this.field16275 = (double)var1.field16390 * var4;
      this.field16276 = (double)var1.field16391 * var4;
      this.field16277 = (double)var1.field16392 * var4;
   }

   public Class2389(Class2387 var1) {
      double var4 = 1.0
         / Math.sqrt(
            var1.field16274 * var1.field16274 + var1.field16275 * var1.field16275 + var1.field16276 * var1.field16276 + var1.field16277 * var1.field16277
         );
      this.field16274 = var1.field16274 * var4;
      this.field16275 = var1.field16275 * var4;
      this.field16276 = var1.field16276 * var4;
      this.field16277 = var1.field16277 * var4;
   }

   public Class2389() {
   }

   public final void method9776(Class2389 var1) {
      this.field16274 = -var1.field16274;
      this.field16275 = -var1.field16275;
      this.field16276 = -var1.field16276;
      this.field16277 = var1.field16277;
   }

   public final void method9777() {
      this.field16274 = -this.field16274;
      this.field16275 = -this.field16275;
      this.field16276 = -this.field16276;
   }

   public final void method9778(Class2389 var1, Class2389 var2) {
      if (this != var1 && this != var2) {
         this.field16277 = var1.field16277 * var2.field16277
            - var1.field16274 * var2.field16274
            - var1.field16275 * var2.field16275
            - var1.field16276 * var2.field16276;
         this.field16274 = var1.field16277 * var2.field16274
            + var2.field16277 * var1.field16274
            + var1.field16275 * var2.field16276
            - var1.field16276 * var2.field16275;
         this.field16275 = var1.field16277 * var2.field16275
            + var2.field16277 * var1.field16275
            - var1.field16274 * var2.field16276
            + var1.field16276 * var2.field16274;
         this.field16276 = var1.field16277 * var2.field16276
            + var2.field16277 * var1.field16276
            + var1.field16274 * var2.field16275
            - var1.field16275 * var2.field16274;
      } else {
         double var5 = var1.field16277 * var2.field16277
            - var1.field16274 * var2.field16274
            - var1.field16275 * var2.field16275
            - var1.field16276 * var2.field16276;
         double var7 = var1.field16277 * var2.field16274
            + var2.field16277 * var1.field16274
            + var1.field16275 * var2.field16276
            - var1.field16276 * var2.field16275;
         double var9 = var1.field16277 * var2.field16275
            + var2.field16277 * var1.field16275
            - var1.field16274 * var2.field16276
            + var1.field16276 * var2.field16274;
         this.field16276 = var1.field16277 * var2.field16276
            + var2.field16277 * var1.field16276
            + var1.field16274 * var2.field16275
            - var1.field16275 * var2.field16274;
         this.field16277 = var5;
         this.field16274 = var7;
         this.field16275 = var9;
      }
   }

   public final void method9779(Class2389 var1) {
      double var4 = this.field16277 * var1.field16277
         - this.field16274 * var1.field16274
         - this.field16275 * var1.field16275
         - this.field16276 * var1.field16276;
      double var6 = this.field16277 * var1.field16274
         + var1.field16277 * this.field16274
         + this.field16275 * var1.field16276
         - this.field16276 * var1.field16275;
      double var8 = this.field16277 * var1.field16275
         + var1.field16277 * this.field16275
         - this.field16274 * var1.field16276
         + this.field16276 * var1.field16274;
      this.field16276 = this.field16277 * var1.field16276
         + var1.field16277 * this.field16276
         + this.field16274 * var1.field16275
         - this.field16275 * var1.field16274;
      this.field16277 = var4;
      this.field16274 = var6;
      this.field16275 = var8;
   }

   public final void method9780(Class2389 var1, Class2389 var2) {
      Class2389 var5 = new Class2389(var2);
      var5.method9783();
      this.method9778(var1, var5);
   }

   public final void method9781(Class2389 var1) {
      Class2389 var4 = new Class2389(var1);
      var4.method9783();
      this.method9779(var4);
   }

   public final void method9782(Class2389 var1) {
      double var4 = 1.0
         / (var1.field16277 * var1.field16277 + var1.field16274 * var1.field16274 + var1.field16275 * var1.field16275 + var1.field16276 * var1.field16276);
      this.field16277 = var4 * var1.field16277;
      this.field16274 = -var4 * var1.field16274;
      this.field16275 = -var4 * var1.field16275;
      this.field16276 = -var4 * var1.field16276;
   }

   public final void method9783() {
      double var3 = 1.0
         / (this.field16277 * this.field16277 + this.field16274 * this.field16274 + this.field16275 * this.field16275 + this.field16276 * this.field16276);
      this.field16277 *= var3;
      this.field16274 *= -var3;
      this.field16275 *= -var3;
      this.field16276 *= -var3;
   }

   public final void method9784(Class2389 var1) {
      double var4 = var1.field16274 * var1.field16274
         + var1.field16275 * var1.field16275
         + var1.field16276 * var1.field16276
         + var1.field16277 * var1.field16277;
      if (!(var4 > 0.0)) {
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 0.0;
         this.field16277 = 0.0;
      } else {
         var4 = 1.0 / Math.sqrt(var4);
         this.field16274 = var4 * var1.field16274;
         this.field16275 = var4 * var1.field16275;
         this.field16276 = var4 * var1.field16276;
         this.field16277 = var4 * var1.field16277;
      }
   }

   public final void method9785() {
      double var3 = this.field16274 * this.field16274
         + this.field16275 * this.field16275
         + this.field16276 * this.field16276
         + this.field16277 * this.field16277;
      if (!(var3 > 0.0)) {
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 0.0;
         this.field16277 = 0.0;
      } else {
         var3 = 1.0 / Math.sqrt(var3);
         this.field16274 *= var3;
         this.field16275 *= var3;
         this.field16276 *= var3;
         this.field16277 *= var3;
      }
   }

   public final void method9786(Class2404 var1) {
      double var4 = 0.25 * (double)(var1.field16350 + var1.field16355 + var1.field16360 + var1.field16365);
      if (!(var4 >= 0.0)) {
         this.field16277 = 0.0;
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field16277 = 0.0;
         var4 = -0.5 * (double)(var1.field16355 + var1.field16360);
         if (!(var4 >= 0.0)) {
            this.field16274 = 0.0;
            this.field16275 = 0.0;
            this.field16276 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field16274 = 0.0;
            var4 = 0.5 * (1.0 - (double)var1.field16360);
            if (!(var4 >= 1.0E-30)) {
               this.field16275 = 0.0;
               this.field16276 = 1.0;
            } else {
               this.field16275 = Math.sqrt(var4);
               this.field16276 = (double)var1.field16359 / (2.0 * this.field16275);
            }
         } else {
            this.field16274 = Math.sqrt(var4);
            var4 = 1.0 / (2.0 * this.field16274);
            this.field16275 = (double)var1.field16354 * var4;
            this.field16276 = (double)var1.field16358 * var4;
         }
      } else {
         this.field16277 = Math.sqrt(var4);
         var4 = 0.25 / this.field16277;
         this.field16274 = (double)(var1.field16359 - var1.field16356) * var4;
         this.field16275 = (double)(var1.field16352 - var1.field16358) * var4;
         this.field16276 = (double)(var1.field16354 - var1.field16351) * var4;
      }
   }

   public final void method9787(Class2417 var1) {
      double var4 = 0.25 * (var1.field16402 + var1.field16407 + var1.field16412 + var1.field16417);
      if (!(var4 >= 0.0)) {
         this.field16277 = 0.0;
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field16277 = 0.0;
         var4 = -0.5 * (var1.field16407 + var1.field16412);
         if (!(var4 >= 0.0)) {
            this.field16274 = 0.0;
            this.field16275 = 0.0;
            this.field16276 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field16274 = 0.0;
            var4 = 0.5 * (1.0 - var1.field16412);
            if (!(var4 >= 1.0E-30)) {
               this.field16275 = 0.0;
               this.field16276 = 1.0;
            } else {
               this.field16275 = Math.sqrt(var4);
               this.field16276 = var1.field16411 / (2.0 * this.field16275);
            }
         } else {
            this.field16274 = Math.sqrt(var4);
            var4 = 0.5 / this.field16274;
            this.field16275 = var1.field16406 * var4;
            this.field16276 = var1.field16410 * var4;
         }
      } else {
         this.field16277 = Math.sqrt(var4);
         var4 = 0.25 / this.field16277;
         this.field16274 = (var1.field16411 - var1.field16408) * var4;
         this.field16275 = (var1.field16404 - var1.field16410) * var4;
         this.field16276 = (var1.field16406 - var1.field16403) * var4;
      }
   }

   public final void method9788(Class2372 var1) {
      double var4 = 0.25 * ((double)(var1.field16222 + var1.field16226 + var1.field16230) + 1.0);
      if (!(var4 >= 0.0)) {
         this.field16277 = 0.0;
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field16277 = 0.0;
         var4 = -0.5 * (double)(var1.field16226 + var1.field16230);
         if (!(var4 >= 0.0)) {
            this.field16274 = 0.0;
            this.field16275 = 0.0;
            this.field16276 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field16274 = 0.0;
            var4 = 0.5 * (1.0 - (double)var1.field16230);
            if (var4 >= 1.0E-30) {
               this.field16275 = Math.sqrt(var4);
               this.field16276 = (double)var1.field16229 / (2.0 * this.field16275);
            }

            this.field16275 = 0.0;
            this.field16276 = 1.0;
         } else {
            this.field16274 = Math.sqrt(var4);
            var4 = 0.5 / this.field16274;
            this.field16275 = (double)var1.field16225 * var4;
            this.field16276 = (double)var1.field16228 * var4;
         }
      } else {
         this.field16277 = Math.sqrt(var4);
         var4 = 0.25 / this.field16277;
         this.field16274 = (double)(var1.field16229 - var1.field16227) * var4;
         this.field16275 = (double)(var1.field16224 - var1.field16228) * var4;
         this.field16276 = (double)(var1.field16225 - var1.field16223) * var4;
      }
   }

   public final void method9789(Class2363 var1) {
      double var4 = 0.25 * (var1.field16185 + var1.field16189 + var1.field16193 + 1.0);
      if (!(var4 >= 0.0)) {
         this.field16277 = 0.0;
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 1.0;
      } else if (!(var4 >= 1.0E-30)) {
         this.field16277 = 0.0;
         var4 = -0.5 * (var1.field16189 + var1.field16193);
         if (!(var4 >= 0.0)) {
            this.field16274 = 0.0;
            this.field16275 = 0.0;
            this.field16276 = 1.0;
         } else if (!(var4 >= 1.0E-30)) {
            this.field16274 = 0.0;
            var4 = 0.5 * (1.0 - var1.field16193);
            if (!(var4 >= 1.0E-30)) {
               this.field16275 = 0.0;
               this.field16276 = 1.0;
            } else {
               this.field16275 = Math.sqrt(var4);
               this.field16276 = var1.field16192 / (2.0 * this.field16275);
            }
         } else {
            this.field16274 = Math.sqrt(var4);
            var4 = 0.5 / this.field16274;
            this.field16275 = var1.field16188 * var4;
            this.field16276 = var1.field16191 * var4;
         }
      } else {
         this.field16277 = Math.sqrt(var4);
         var4 = 0.25 / this.field16277;
         this.field16274 = (var1.field16192 - var1.field16190) * var4;
         this.field16275 = (var1.field16187 - var1.field16191) * var4;
         this.field16276 = (var1.field16188 - var1.field16186) * var4;
      }
   }

   public final void method9790(Class2396 var1) {
      double var4 = Math.sqrt((double)(var1.field16320 * var1.field16320 + var1.field16321 * var1.field16321 + var1.field16322 * var1.field16322));
      if (!(var4 < 1.0E-6)) {
         double var6 = Math.sin((double)var1.field16323 / 2.0);
         var4 = 1.0 / var4;
         this.field16277 = Math.cos((double)var1.field16323 / 2.0);
         this.field16274 = (double)var1.field16320 * var4 * var6;
         this.field16275 = (double)var1.field16321 * var4 * var6;
         this.field16276 = (double)var1.field16322 * var4 * var6;
      } else {
         this.field16277 = 0.0;
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 0.0;
      }
   }

   public final void method9791(Class2410 var1) {
      double var4 = Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385);
      if (!(var4 < 1.0E-6)) {
         var4 = 1.0 / var4;
         double var6 = Math.sin(var1.field16386 / 2.0);
         this.field16277 = Math.cos(var1.field16386 / 2.0);
         this.field16274 = var1.field16383 * var4 * var6;
         this.field16275 = var1.field16384 * var4 * var6;
         this.field16276 = var1.field16385 * var4 * var6;
      } else {
         this.field16277 = 0.0;
         this.field16274 = 0.0;
         this.field16275 = 0.0;
         this.field16276 = 0.0;
      }
   }

   public final void method9792(Class2389 var1, double var2) {
      double var6 = this.field16274 * var1.field16274
         + this.field16275 * var1.field16275
         + this.field16276 * var1.field16276
         + this.field16277 * var1.field16277;
      if (var6 < 0.0) {
         var1.field16274 = -var1.field16274;
         var1.field16275 = -var1.field16275;
         var1.field16276 = -var1.field16276;
         var1.field16277 = -var1.field16277;
         var6 = -var6;
      }

      double var8;
      double var10;
      if (!(1.0 - var6 > 1.0E-6)) {
         var8 = 1.0 - var2;
         var10 = var2;
      } else {
         double var12 = Math.acos(var6);
         double var14 = Math.sin(var12);
         var8 = Math.sin((1.0 - var2) * var12) / var14;
         var10 = Math.sin(var2 * var12) / var14;
      }

      this.field16277 = var8 * this.field16277 + var10 * var1.field16277;
      this.field16274 = var8 * this.field16274 + var10 * var1.field16274;
      this.field16275 = var8 * this.field16275 + var10 * var1.field16275;
      this.field16276 = var8 * this.field16276 + var10 * var1.field16276;
   }

   public final void method9793(Class2389 var1, Class2389 var2, double var3) {
      double var7 = var2.field16274 * var1.field16274
         + var2.field16275 * var1.field16275
         + var2.field16276 * var1.field16276
         + var2.field16277 * var1.field16277;
      if (var7 < 0.0) {
         var1.field16274 = -var1.field16274;
         var1.field16275 = -var1.field16275;
         var1.field16276 = -var1.field16276;
         var1.field16277 = -var1.field16277;
         var7 = -var7;
      }

      double var9;
      double var11;
      if (!(1.0 - var7 > 1.0E-6)) {
         var9 = 1.0 - var3;
         var11 = var3;
      } else {
         double var13 = Math.acos(var7);
         double var15 = Math.sin(var13);
         var9 = Math.sin((1.0 - var3) * var13) / var15;
         var11 = Math.sin(var3 * var13) / var15;
      }

      this.field16277 = var9 * var1.field16277 + var11 * var2.field16277;
      this.field16274 = var9 * var1.field16274 + var11 * var2.field16274;
      this.field16275 = var9 * var1.field16275 + var11 * var2.field16275;
      this.field16276 = var9 * var1.field16276 + var11 * var2.field16276;
   }
}
