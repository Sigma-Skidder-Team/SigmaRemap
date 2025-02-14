package mapped;

import java.io.Serializable;

public class Class2404 implements Serializable, Cloneable {
   public static final long field16349 = -8405036035410109353L;
   public float field16350;
   public float field16351;
   public float field16352;
   public float field16353;
   public float field16354;
   public float field16355;
   public float field16356;
   public float field16357;
   public float field16358;
   public float field16359;
   public float field16360;
   public float field16361;
   public float field16362;
   public float field16363;
   public float field16364;
   public float field16365;
   private static final double field16366 = 1.0E-8;

   public Class2404(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.field16350 = var1;
      this.field16351 = var2;
      this.field16352 = var3;
      this.field16353 = var4;
      this.field16354 = var5;
      this.field16355 = var6;
      this.field16356 = var7;
      this.field16357 = var8;
      this.field16358 = var9;
      this.field16359 = var10;
      this.field16360 = var11;
      this.field16361 = var12;
      this.field16362 = var13;
      this.field16363 = var14;
      this.field16364 = var15;
      this.field16365 = var16;
   }

   public Class2404(float[] var1) {
      this.field16350 = var1[0];
      this.field16351 = var1[1];
      this.field16352 = var1[2];
      this.field16353 = var1[3];
      this.field16354 = var1[4];
      this.field16355 = var1[5];
      this.field16356 = var1[6];
      this.field16357 = var1[7];
      this.field16358 = var1[8];
      this.field16359 = var1[9];
      this.field16360 = var1[10];
      this.field16361 = var1[11];
      this.field16362 = var1[12];
      this.field16363 = var1[13];
      this.field16364 = var1[14];
      this.field16365 = var1[15];
   }

   public Class2404(Class2415 var1, Class6 var2, float var3) {
      this.field16350 = (float)(
         (double)var3 * (1.0 - 2.0 * (double)var1.field16390 * (double)var1.field16390 - 2.0 * (double)var1.field16391 * (double)var1.field16391)
      );
      this.field16354 = (float)((double)var3 * 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391));
      this.field16358 = (float)((double)var3 * 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390));
      this.field16351 = (float)((double)var3 * 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391));
      this.field16355 = (float)(
         (double)var3 * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16391 * (double)var1.field16391)
      );
      this.field16359 = (float)((double)var3 * 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389));
      this.field16352 = (float)((double)var3 * 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390));
      this.field16356 = (float)((double)var3 * 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389));
      this.field16360 = (float)(
         (double)var3 * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16390 * (double)var1.field16390)
      );
      this.field16353 = var2.field8;
      this.field16357 = var2.field9;
      this.field16361 = var2.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public Class2404(Class2417 var1) {
      this.field16350 = (float)var1.field16402;
      this.field16351 = (float)var1.field16403;
      this.field16352 = (float)var1.field16404;
      this.field16353 = (float)var1.field16405;
      this.field16354 = (float)var1.field16406;
      this.field16355 = (float)var1.field16407;
      this.field16356 = (float)var1.field16408;
      this.field16357 = (float)var1.field16409;
      this.field16358 = (float)var1.field16410;
      this.field16359 = (float)var1.field16411;
      this.field16360 = (float)var1.field16412;
      this.field16361 = (float)var1.field16413;
      this.field16362 = (float)var1.field16414;
      this.field16363 = (float)var1.field16415;
      this.field16364 = (float)var1.field16416;
      this.field16365 = (float)var1.field16417;
   }

   public Class2404(Class2404 var1) {
      this.field16350 = var1.field16350;
      this.field16351 = var1.field16351;
      this.field16352 = var1.field16352;
      this.field16353 = var1.field16353;
      this.field16354 = var1.field16354;
      this.field16355 = var1.field16355;
      this.field16356 = var1.field16356;
      this.field16357 = var1.field16357;
      this.field16358 = var1.field16358;
      this.field16359 = var1.field16359;
      this.field16360 = var1.field16360;
      this.field16361 = var1.field16361;
      this.field16362 = var1.field16362;
      this.field16363 = var1.field16363;
      this.field16364 = var1.field16364;
      this.field16365 = var1.field16365;
   }

   public Class2404(Class2372 var1, Class6 var2, float var3) {
      this.field16350 = var1.field16222 * var3;
      this.field16351 = var1.field16223 * var3;
      this.field16352 = var1.field16224 * var3;
      this.field16353 = var2.field8;
      this.field16354 = var1.field16225 * var3;
      this.field16355 = var1.field16226 * var3;
      this.field16356 = var1.field16227 * var3;
      this.field16357 = var2.field9;
      this.field16358 = var1.field16228 * var3;
      this.field16359 = var1.field16229 * var3;
      this.field16360 = var1.field16230 * var3;
      this.field16361 = var2.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public Class2404() {
      this.field16350 = 0.0F;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = 0.0F;
      this.field16354 = 0.0F;
      this.field16355 = 0.0F;
      this.field16356 = 0.0F;
      this.field16357 = 0.0F;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = 0.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 0.0F;
   }

   @Override
   public String toString() {
      return this.field16350
         + ", "
         + this.field16351
         + ", "
         + this.field16352
         + ", "
         + this.field16353
         + "\n"
         + this.field16354
         + ", "
         + this.field16355
         + ", "
         + this.field16356
         + ", "
         + this.field16357
         + "\n"
         + this.field16358
         + ", "
         + this.field16359
         + ", "
         + this.field16360
         + ", "
         + this.field16361
         + "\n"
         + this.field16362
         + ", "
         + this.field16363
         + ", "
         + this.field16364
         + ", "
         + this.field16365
         + "\n";
   }

   public final void method9962() {
      this.field16350 = 1.0F;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = 0.0F;
      this.field16354 = 0.0F;
      this.field16355 = 1.0F;
      this.field16356 = 0.0F;
      this.field16357 = 0.0F;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = 1.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9963(int var1, int var2, float var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field16350 = var3;
                  return;
               case 1:
                  this.field16351 = var3;
                  return;
               case 2:
                  this.field16352 = var3;
                  return;
               case 3:
                  this.field16353 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field16354 = var3;
                  return;
               case 1:
                  this.field16355 = var3;
                  return;
               case 2:
                  this.field16356 = var3;
                  return;
               case 3:
                  this.field16357 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field16358 = var3;
                  return;
               case 1:
                  this.field16359 = var3;
                  return;
               case 2:
                  this.field16360 = var3;
                  return;
               case 3:
                  this.field16361 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f0"));
            }
         case 3:
            switch (var2) {
               case 0:
                  this.field16362 = var3;
                  return;
               case 1:
                  this.field16363 = var3;
                  return;
               case 2:
                  this.field16364 = var3;
                  return;
               case 3:
                  this.field16365 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f0"));
      }
   }

   public final float method9964(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field16350;
               case 1:
                  return this.field16351;
               case 2:
                  return this.field16352;
               case 3:
                  return this.field16353;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f1"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field16354;
               case 1:
                  return this.field16355;
               case 2:
                  return this.field16356;
               case 3:
                  return this.field16357;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f1"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field16358;
               case 1:
                  return this.field16359;
               case 2:
                  return this.field16360;
               case 3:
                  return this.field16361;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f1"));
            }
         case 3:
            switch (var2) {
               case 0:
                  return this.field16362;
               case 1:
                  return this.field16363;
               case 2:
                  return this.field16364;
               case 3:
                  return this.field16365;
            }
      }

      throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f1"));
   }

   public final void method9965(int var1, Class2413 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f2"));
               }

               var2.field16389 = this.field16362;
               var2.field16390 = this.field16363;
               var2.field16391 = this.field16364;
               var2.field16392 = this.field16365;
            } else {
               var2.field16389 = this.field16358;
               var2.field16390 = this.field16359;
               var2.field16391 = this.field16360;
               var2.field16392 = this.field16361;
            }
         } else {
            var2.field16389 = this.field16354;
            var2.field16390 = this.field16355;
            var2.field16391 = this.field16356;
            var2.field16392 = this.field16357;
         }
      } else {
         var2.field16389 = this.field16350;
         var2.field16390 = this.field16351;
         var2.field16391 = this.field16352;
         var2.field16392 = this.field16353;
      }
   }

   public final void method9966(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f2"));
               }

               var2[0] = this.field16362;
               var2[1] = this.field16363;
               var2[2] = this.field16364;
               var2[3] = this.field16365;
            } else {
               var2[0] = this.field16358;
               var2[1] = this.field16359;
               var2[2] = this.field16360;
               var2[3] = this.field16361;
            }
         } else {
            var2[0] = this.field16354;
            var2[1] = this.field16355;
            var2[2] = this.field16356;
            var2[3] = this.field16357;
         }
      } else {
         var2[0] = this.field16350;
         var2[1] = this.field16351;
         var2[2] = this.field16352;
         var2[3] = this.field16353;
      }
   }

   public final void method9967(int var1, Class2413 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f4"));
               }

               var2.field16389 = this.field16353;
               var2.field16390 = this.field16357;
               var2.field16391 = this.field16361;
               var2.field16392 = this.field16365;
            } else {
               var2.field16389 = this.field16352;
               var2.field16390 = this.field16356;
               var2.field16391 = this.field16360;
               var2.field16392 = this.field16364;
            }
         } else {
            var2.field16389 = this.field16351;
            var2.field16390 = this.field16355;
            var2.field16391 = this.field16359;
            var2.field16392 = this.field16363;
         }
      } else {
         var2.field16389 = this.field16350;
         var2.field16390 = this.field16354;
         var2.field16391 = this.field16358;
         var2.field16392 = this.field16362;
      }
   }

   public final void method9968(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f4"));
               }

               var2[0] = this.field16353;
               var2[1] = this.field16357;
               var2[2] = this.field16361;
               var2[3] = this.field16365;
            } else {
               var2[0] = this.field16352;
               var2[1] = this.field16356;
               var2[2] = this.field16360;
               var2[3] = this.field16364;
            }
         } else {
            var2[0] = this.field16351;
            var2[1] = this.field16355;
            var2[2] = this.field16359;
            var2[3] = this.field16363;
         }
      } else {
         var2[0] = this.field16350;
         var2[1] = this.field16354;
         var2[2] = this.field16358;
         var2[3] = this.field16362;
      }
   }

   public final void method9969(float var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      this.field16350 = (float)(var4[0] * (double)var1);
      this.field16351 = (float)(var4[1] * (double)var1);
      this.field16352 = (float)(var4[2] * (double)var1);
      this.field16354 = (float)(var4[3] * (double)var1);
      this.field16355 = (float)(var4[4] * (double)var1);
      this.field16356 = (float)(var4[5] * (double)var1);
      this.field16358 = (float)(var4[6] * (double)var1);
      this.field16359 = (float)(var4[7] * (double)var1);
      this.field16360 = (float)(var4[8] * (double)var1);
   }

   public final void method9970(Class2363 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      var1.field16185 = var4[0];
      var1.field16186 = var4[1];
      var1.field16187 = var4[2];
      var1.field16188 = var4[3];
      var1.field16189 = var4[4];
      var1.field16190 = var4[5];
      var1.field16191 = var4[6];
      var1.field16192 = var4[7];
      var1.field16193 = var4[8];
   }

   public final void method9971(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      var1.field16222 = (float)var4[0];
      var1.field16223 = (float)var4[1];
      var1.field16224 = (float)var4[2];
      var1.field16225 = (float)var4[3];
      var1.field16226 = (float)var4[4];
      var1.field16227 = (float)var4[5];
      var1.field16228 = (float)var4[6];
      var1.field16229 = (float)var4[7];
      var1.field16230 = (float)var4[8];
   }

   public final float method9972(Class2372 var1, Class6 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method10041(var6, var5);
      var1.field16222 = (float)var5[0];
      var1.field16223 = (float)var5[1];
      var1.field16224 = (float)var5[2];
      var1.field16225 = (float)var5[3];
      var1.field16226 = (float)var5[4];
      var1.field16227 = (float)var5[5];
      var1.field16228 = (float)var5[6];
      var1.field16229 = (float)var5[7];
      var1.field16230 = (float)var5[8];
      var2.field8 = this.field16353;
      var2.field9 = this.field16357;
      var2.field10 = this.field16361;
      return (float)Class2363.method9430(var6);
   }

   public final void method9973(Class2415 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      double var6 = 0.25 * (1.0 + var4[0] + var4[4] + var4[8]);
      if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
         var1.field16392 = 0.0F;
         var6 = -0.5 * (var4[4] + var4[8]);
         if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
            var1.field16389 = 0.0F;
            var6 = 0.5 * (1.0 - var4[8]);
            if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
               var1.field16390 = 0.0F;
               var1.field16391 = 1.0F;
            } else {
               var1.field16390 = (float)Math.sqrt(var6);
               var1.field16391 = (float)(var4[7] / (2.0 * (double)var1.field16390));
            }
         } else {
            var1.field16389 = (float)Math.sqrt(var6);
            var6 = 0.5 / (double)var1.field16389;
            var1.field16390 = (float)(var4[3] * var6);
            var1.field16391 = (float)(var4[6] * var6);
         }
      } else {
         var1.field16392 = (float)Math.sqrt(var6);
         var6 = 0.25 / (double)var1.field16392;
         var1.field16389 = (float)((var4[7] - var4[5]) * var6);
         var1.field16390 = (float)((var4[2] - var4[6]) * var6);
         var1.field16391 = (float)((var4[3] - var4[1]) * var6);
      }
   }

   public final void method9974(Class6 var1) {
      var1.field8 = this.field16353;
      var1.field9 = this.field16357;
      var1.field10 = this.field16361;
   }

   public final void method9975(Class2372 var1) {
      var1.field16222 = this.field16350;
      var1.field16223 = this.field16351;
      var1.field16224 = this.field16352;
      var1.field16225 = this.field16354;
      var1.field16226 = this.field16355;
      var1.field16227 = this.field16356;
      var1.field16228 = this.field16358;
      var1.field16229 = this.field16359;
      var1.field16230 = this.field16360;
   }

   public final float method9976() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method10041(var4, var3);
      return (float)Class2363.method9430(var4);
   }

   public final void method9977(Class2372 var1) {
      this.field16350 = var1.field16222;
      this.field16351 = var1.field16223;
      this.field16352 = var1.field16224;
      this.field16354 = var1.field16225;
      this.field16355 = var1.field16226;
      this.field16356 = var1.field16227;
      this.field16358 = var1.field16228;
      this.field16359 = var1.field16229;
      this.field16360 = var1.field16230;
   }

   public final void method9978(int var1, float var2, float var3, float var4, float var5) {
      switch (var1) {
         case 0:
            this.field16350 = var2;
            this.field16351 = var3;
            this.field16352 = var4;
            this.field16353 = var5;
            break;
         case 1:
            this.field16354 = var2;
            this.field16355 = var3;
            this.field16356 = var4;
            this.field16357 = var5;
            break;
         case 2:
            this.field16358 = var2;
            this.field16359 = var3;
            this.field16360 = var4;
            this.field16361 = var5;
            break;
         case 3:
            this.field16362 = var2;
            this.field16363 = var3;
            this.field16364 = var4;
            this.field16365 = var5;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f6"));
      }
   }

   public final void method9979(int var1, Class2413 var2) {
      switch (var1) {
         case 0:
            this.field16350 = var2.field16389;
            this.field16351 = var2.field16390;
            this.field16352 = var2.field16391;
            this.field16353 = var2.field16392;
            break;
         case 1:
            this.field16354 = var2.field16389;
            this.field16355 = var2.field16390;
            this.field16356 = var2.field16391;
            this.field16357 = var2.field16392;
            break;
         case 2:
            this.field16358 = var2.field16389;
            this.field16359 = var2.field16390;
            this.field16360 = var2.field16391;
            this.field16361 = var2.field16392;
            break;
         case 3:
            this.field16362 = var2.field16389;
            this.field16363 = var2.field16390;
            this.field16364 = var2.field16391;
            this.field16365 = var2.field16392;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f6"));
      }
   }

   public final void method9980(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field16350 = var2[0];
            this.field16351 = var2[1];
            this.field16352 = var2[2];
            this.field16353 = var2[3];
            break;
         case 1:
            this.field16354 = var2[0];
            this.field16355 = var2[1];
            this.field16356 = var2[2];
            this.field16357 = var2[3];
            break;
         case 2:
            this.field16358 = var2[0];
            this.field16359 = var2[1];
            this.field16360 = var2[2];
            this.field16361 = var2[3];
            break;
         case 3:
            this.field16362 = var2[0];
            this.field16363 = var2[1];
            this.field16364 = var2[2];
            this.field16365 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f6"));
      }
   }

   public final void method9981(int var1, float var2, float var3, float var4, float var5) {
      switch (var1) {
         case 0:
            this.field16350 = var2;
            this.field16354 = var3;
            this.field16358 = var4;
            this.field16362 = var5;
            break;
         case 1:
            this.field16351 = var2;
            this.field16355 = var3;
            this.field16359 = var4;
            this.field16363 = var5;
            break;
         case 2:
            this.field16352 = var2;
            this.field16356 = var3;
            this.field16360 = var4;
            this.field16364 = var5;
            break;
         case 3:
            this.field16353 = var2;
            this.field16357 = var3;
            this.field16361 = var4;
            this.field16365 = var5;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f9"));
      }
   }

   public final void method9982(int var1, Class2413 var2) {
      switch (var1) {
         case 0:
            this.field16350 = var2.field16389;
            this.field16354 = var2.field16390;
            this.field16358 = var2.field16391;
            this.field16362 = var2.field16392;
            break;
         case 1:
            this.field16351 = var2.field16389;
            this.field16355 = var2.field16390;
            this.field16359 = var2.field16391;
            this.field16363 = var2.field16392;
            break;
         case 2:
            this.field16352 = var2.field16389;
            this.field16356 = var2.field16390;
            this.field16360 = var2.field16391;
            this.field16364 = var2.field16392;
            break;
         case 3:
            this.field16353 = var2.field16389;
            this.field16357 = var2.field16390;
            this.field16361 = var2.field16391;
            this.field16365 = var2.field16392;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f9"));
      }
   }

   public final void method9983(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field16350 = var2[0];
            this.field16354 = var2[1];
            this.field16358 = var2[2];
            this.field16362 = var2[3];
            break;
         case 1:
            this.field16351 = var2[0];
            this.field16355 = var2[1];
            this.field16359 = var2[2];
            this.field16363 = var2[3];
            break;
         case 2:
            this.field16352 = var2[0];
            this.field16356 = var2[1];
            this.field16360 = var2[2];
            this.field16364 = var2[3];
            break;
         case 3:
            this.field16353 = var2[0];
            this.field16357 = var2[1];
            this.field16361 = var2[2];
            this.field16365 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4f9"));
      }
   }

   public final void method9984(float var1) {
      this.field16350 += var1;
      this.field16351 += var1;
      this.field16352 += var1;
      this.field16353 += var1;
      this.field16354 += var1;
      this.field16355 += var1;
      this.field16356 += var1;
      this.field16357 += var1;
      this.field16358 += var1;
      this.field16359 += var1;
      this.field16360 += var1;
      this.field16361 += var1;
      this.field16362 += var1;
      this.field16363 += var1;
      this.field16364 += var1;
      this.field16365 += var1;
   }

   public final void method9985(float var1, Class2404 var2) {
      this.field16350 = var2.field16350 + var1;
      this.field16351 = var2.field16351 + var1;
      this.field16352 = var2.field16352 + var1;
      this.field16353 = var2.field16353 + var1;
      this.field16354 = var2.field16354 + var1;
      this.field16355 = var2.field16355 + var1;
      this.field16356 = var2.field16356 + var1;
      this.field16357 = var2.field16357 + var1;
      this.field16358 = var2.field16358 + var1;
      this.field16359 = var2.field16359 + var1;
      this.field16360 = var2.field16360 + var1;
      this.field16361 = var2.field16361 + var1;
      this.field16362 = var2.field16362 + var1;
      this.field16363 = var2.field16363 + var1;
      this.field16364 = var2.field16364 + var1;
      this.field16365 = var2.field16365 + var1;
   }

   public final void method9986(Class2404 var1, Class2404 var2) {
      this.field16350 = var1.field16350 + var2.field16350;
      this.field16351 = var1.field16351 + var2.field16351;
      this.field16352 = var1.field16352 + var2.field16352;
      this.field16353 = var1.field16353 + var2.field16353;
      this.field16354 = var1.field16354 + var2.field16354;
      this.field16355 = var1.field16355 + var2.field16355;
      this.field16356 = var1.field16356 + var2.field16356;
      this.field16357 = var1.field16357 + var2.field16357;
      this.field16358 = var1.field16358 + var2.field16358;
      this.field16359 = var1.field16359 + var2.field16359;
      this.field16360 = var1.field16360 + var2.field16360;
      this.field16361 = var1.field16361 + var2.field16361;
      this.field16362 = var1.field16362 + var2.field16362;
      this.field16363 = var1.field16363 + var2.field16363;
      this.field16364 = var1.field16364 + var2.field16364;
      this.field16365 = var1.field16365 + var2.field16365;
   }

   public final void method9987(Class2404 var1) {
      this.field16350 = this.field16350 + var1.field16350;
      this.field16351 = this.field16351 + var1.field16351;
      this.field16352 = this.field16352 + var1.field16352;
      this.field16353 = this.field16353 + var1.field16353;
      this.field16354 = this.field16354 + var1.field16354;
      this.field16355 = this.field16355 + var1.field16355;
      this.field16356 = this.field16356 + var1.field16356;
      this.field16357 = this.field16357 + var1.field16357;
      this.field16358 = this.field16358 + var1.field16358;
      this.field16359 = this.field16359 + var1.field16359;
      this.field16360 = this.field16360 + var1.field16360;
      this.field16361 = this.field16361 + var1.field16361;
      this.field16362 = this.field16362 + var1.field16362;
      this.field16363 = this.field16363 + var1.field16363;
      this.field16364 = this.field16364 + var1.field16364;
      this.field16365 = this.field16365 + var1.field16365;
   }

   public final void method9988(Class2404 var1, Class2404 var2) {
      this.field16350 = var1.field16350 - var2.field16350;
      this.field16351 = var1.field16351 - var2.field16351;
      this.field16352 = var1.field16352 - var2.field16352;
      this.field16353 = var1.field16353 - var2.field16353;
      this.field16354 = var1.field16354 - var2.field16354;
      this.field16355 = var1.field16355 - var2.field16355;
      this.field16356 = var1.field16356 - var2.field16356;
      this.field16357 = var1.field16357 - var2.field16357;
      this.field16358 = var1.field16358 - var2.field16358;
      this.field16359 = var1.field16359 - var2.field16359;
      this.field16360 = var1.field16360 - var2.field16360;
      this.field16361 = var1.field16361 - var2.field16361;
      this.field16362 = var1.field16362 - var2.field16362;
      this.field16363 = var1.field16363 - var2.field16363;
      this.field16364 = var1.field16364 - var2.field16364;
      this.field16365 = var1.field16365 - var2.field16365;
   }

   public final void method9989(Class2404 var1) {
      this.field16350 = this.field16350 - var1.field16350;
      this.field16351 = this.field16351 - var1.field16351;
      this.field16352 = this.field16352 - var1.field16352;
      this.field16353 = this.field16353 - var1.field16353;
      this.field16354 = this.field16354 - var1.field16354;
      this.field16355 = this.field16355 - var1.field16355;
      this.field16356 = this.field16356 - var1.field16356;
      this.field16357 = this.field16357 - var1.field16357;
      this.field16358 = this.field16358 - var1.field16358;
      this.field16359 = this.field16359 - var1.field16359;
      this.field16360 = this.field16360 - var1.field16360;
      this.field16361 = this.field16361 - var1.field16361;
      this.field16362 = this.field16362 - var1.field16362;
      this.field16363 = this.field16363 - var1.field16363;
      this.field16364 = this.field16364 - var1.field16364;
      this.field16365 = this.field16365 - var1.field16365;
   }

   public final void method9990() {
      float var3 = this.field16354;
      this.field16354 = this.field16351;
      this.field16351 = var3;
      var3 = this.field16358;
      this.field16358 = this.field16352;
      this.field16352 = var3;
      var3 = this.field16362;
      this.field16362 = this.field16353;
      this.field16353 = var3;
      var3 = this.field16359;
      this.field16359 = this.field16356;
      this.field16356 = var3;
      var3 = this.field16363;
      this.field16363 = this.field16357;
      this.field16357 = var3;
      var3 = this.field16364;
      this.field16364 = this.field16361;
      this.field16361 = var3;
   }

   public final void method9991(Class2404 var1) {
      if (this == var1) {
         this.method9990();
      } else {
         this.field16350 = var1.field16350;
         this.field16351 = var1.field16354;
         this.field16352 = var1.field16358;
         this.field16353 = var1.field16362;
         this.field16354 = var1.field16351;
         this.field16355 = var1.field16355;
         this.field16356 = var1.field16359;
         this.field16357 = var1.field16363;
         this.field16358 = var1.field16352;
         this.field16359 = var1.field16356;
         this.field16360 = var1.field16360;
         this.field16361 = var1.field16364;
         this.field16362 = var1.field16353;
         this.field16363 = var1.field16357;
         this.field16364 = var1.field16361;
         this.field16365 = var1.field16365;
      }
   }

   public final void method9992(Class2415 var1) {
      this.field16350 = 1.0F - 2.0F * var1.field16390 * var1.field16390 - 2.0F * var1.field16391 * var1.field16391;
      this.field16354 = 2.0F * (var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16358 = 2.0F * (var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16351 = 2.0F * (var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16355 = 1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16391 * var1.field16391;
      this.field16359 = 2.0F * (var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16352 = 2.0F * (var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16356 = 2.0F * (var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16360 = 1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16390 * var1.field16390;
      this.field16353 = 0.0F;
      this.field16357 = 0.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9993(Class2396 var1) {
      float var4 = (float)Math.sqrt((double)(var1.field16320 * var1.field16320 + var1.field16321 * var1.field16321 + var1.field16322 * var1.field16322));
      if (!((double)var4 < 1.0E-8)) {
         var4 = 1.0F / var4;
         float var5 = var1.field16320 * var4;
         float var6 = var1.field16321 * var4;
         float var7 = var1.field16322 * var4;
         float var8 = (float)Math.sin((double)var1.field16323);
         float var9 = (float)Math.cos((double)var1.field16323);
         float var10 = 1.0F - var9;
         float var11 = var5 * var7;
         float var12 = var5 * var6;
         float var13 = var6 * var7;
         this.field16350 = var10 * var5 * var5 + var9;
         this.field16351 = var10 * var12 - var8 * var7;
         this.field16352 = var10 * var11 + var8 * var6;
         this.field16354 = var10 * var12 + var8 * var7;
         this.field16355 = var10 * var6 * var6 + var9;
         this.field16356 = var10 * var13 - var8 * var5;
         this.field16358 = var10 * var11 - var8 * var6;
         this.field16359 = var10 * var13 + var8 * var5;
         this.field16360 = var10 * var7 * var7 + var9;
      } else {
         this.field16350 = 1.0F;
         this.field16351 = 0.0F;
         this.field16352 = 0.0F;
         this.field16354 = 0.0F;
         this.field16355 = 1.0F;
         this.field16356 = 0.0F;
         this.field16358 = 0.0F;
         this.field16359 = 0.0F;
         this.field16360 = 1.0F;
      }

      this.field16353 = 0.0F;
      this.field16357 = 0.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9994(Class2389 var1) {
      this.field16350 = (float)(1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276);
      this.field16354 = (float)(2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276));
      this.field16358 = (float)(2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275));
      this.field16351 = (float)(2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276));
      this.field16355 = (float)(1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276);
      this.field16359 = (float)(2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274));
      this.field16352 = (float)(2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275));
      this.field16356 = (float)(2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274));
      this.field16360 = (float)(1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275);
      this.field16353 = 0.0F;
      this.field16357 = 0.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9995(Class2410 var1) {
      double var4 = Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385);
      if (!(var4 < 1.0E-8)) {
         var4 = 1.0 / var4;
         double var6 = var1.field16383 * var4;
         double var8 = var1.field16384 * var4;
         double var10 = var1.field16385 * var4;
         float var12 = (float)Math.sin(var1.field16386);
         float var13 = (float)Math.cos(var1.field16386);
         float var14 = 1.0F - var13;
         float var15 = (float)(var6 * var10);
         float var16 = (float)(var6 * var8);
         float var17 = (float)(var8 * var10);
         this.field16350 = var14 * (float)(var6 * var6) + var13;
         this.field16351 = var14 * var16 - var12 * (float)var10;
         this.field16352 = var14 * var15 + var12 * (float)var8;
         this.field16354 = var14 * var16 + var12 * (float)var10;
         this.field16355 = var14 * (float)(var8 * var8) + var13;
         this.field16356 = var14 * var17 - var12 * (float)var6;
         this.field16358 = var14 * var15 - var12 * (float)var8;
         this.field16359 = var14 * var17 + var12 * (float)var6;
         this.field16360 = var14 * (float)(var10 * var10) + var13;
      } else {
         this.field16350 = 1.0F;
         this.field16351 = 0.0F;
         this.field16352 = 0.0F;
         this.field16354 = 0.0F;
         this.field16355 = 1.0F;
         this.field16356 = 0.0F;
         this.field16358 = 0.0F;
         this.field16359 = 0.0F;
         this.field16360 = 1.0F;
      }

      this.field16353 = 0.0F;
      this.field16357 = 0.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9996(Class2389 var1, Class2368 var2, double var3) {
      this.field16350 = (float)(var3 * (1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276));
      this.field16354 = (float)(var3 * 2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276));
      this.field16358 = (float)(var3 * 2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275));
      this.field16351 = (float)(var3 * 2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276));
      this.field16355 = (float)(var3 * (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276));
      this.field16359 = (float)(var3 * 2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274));
      this.field16352 = (float)(var3 * 2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275));
      this.field16356 = (float)(var3 * 2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274));
      this.field16360 = (float)(var3 * (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275));
      this.field16353 = (float)var2.field16210;
      this.field16357 = (float)var2.field16211;
      this.field16361 = (float)var2.field16212;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9997(Class2415 var1, Class6 var2, float var3) {
      this.field16350 = var3 * (1.0F - 2.0F * var1.field16390 * var1.field16390 - 2.0F * var1.field16391 * var1.field16391);
      this.field16354 = var3 * 2.0F * (var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16358 = var3 * 2.0F * (var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16351 = var3 * 2.0F * (var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16355 = var3 * (1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16391 * var1.field16391);
      this.field16359 = var3 * 2.0F * (var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16352 = var3 * 2.0F * (var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16356 = var3 * 2.0F * (var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16360 = var3 * (1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16390 * var1.field16390);
      this.field16353 = var2.field8;
      this.field16357 = var2.field9;
      this.field16361 = var2.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method9998(Class2417 var1) {
      this.field16350 = (float)var1.field16402;
      this.field16351 = (float)var1.field16403;
      this.field16352 = (float)var1.field16404;
      this.field16353 = (float)var1.field16405;
      this.field16354 = (float)var1.field16406;
      this.field16355 = (float)var1.field16407;
      this.field16356 = (float)var1.field16408;
      this.field16357 = (float)var1.field16409;
      this.field16358 = (float)var1.field16410;
      this.field16359 = (float)var1.field16411;
      this.field16360 = (float)var1.field16412;
      this.field16361 = (float)var1.field16413;
      this.field16362 = (float)var1.field16414;
      this.field16363 = (float)var1.field16415;
      this.field16364 = (float)var1.field16416;
      this.field16365 = (float)var1.field16417;
   }

   public final void method9999(Class2404 var1) {
      this.field16350 = var1.field16350;
      this.field16351 = var1.field16351;
      this.field16352 = var1.field16352;
      this.field16353 = var1.field16353;
      this.field16354 = var1.field16354;
      this.field16355 = var1.field16355;
      this.field16356 = var1.field16356;
      this.field16357 = var1.field16357;
      this.field16358 = var1.field16358;
      this.field16359 = var1.field16359;
      this.field16360 = var1.field16360;
      this.field16361 = var1.field16361;
      this.field16362 = var1.field16362;
      this.field16363 = var1.field16363;
      this.field16364 = var1.field16364;
      this.field16365 = var1.field16365;
   }

   public final void method10000(Class2404 var1) {
      this.method10002(var1);
   }

   public final void method10001() {
      this.method10002(this);
   }

   public final void method10002(Class2404 var1) {
      double[] var4 = new double[16];
      double[] var5 = new double[16];
      int[] var6 = new int[4];
      var4[0] = (double)var1.field16350;
      var4[1] = (double)var1.field16351;
      var4[2] = (double)var1.field16352;
      var4[3] = (double)var1.field16353;
      var4[4] = (double)var1.field16354;
      var4[5] = (double)var1.field16355;
      var4[6] = (double)var1.field16356;
      var4[7] = (double)var1.field16357;
      var4[8] = (double)var1.field16358;
      var4[9] = (double)var1.field16359;
      var4[10] = (double)var1.field16360;
      var4[11] = (double)var1.field16361;
      var4[12] = (double)var1.field16362;
      var4[13] = (double)var1.field16363;
      var4[14] = (double)var1.field16364;
      var4[15] = (double)var1.field16365;
      if (!method10003(var4, var6)) {
         throw new Class2500(Class8148.method28252("Matrix4f12"));
      } else {
         for (int var7 = 0; var7 < 16; var7++) {
            var5[var7] = 0.0;
         }

         var5[0] = 1.0;
         var5[5] = 1.0;
         var5[10] = 1.0;
         var5[15] = 1.0;
         method10004(var4, var6, var5);
         this.field16350 = (float)var5[0];
         this.field16351 = (float)var5[1];
         this.field16352 = (float)var5[2];
         this.field16353 = (float)var5[3];
         this.field16354 = (float)var5[4];
         this.field16355 = (float)var5[5];
         this.field16356 = (float)var5[6];
         this.field16357 = (float)var5[7];
         this.field16358 = (float)var5[8];
         this.field16359 = (float)var5[9];
         this.field16360 = (float)var5[10];
         this.field16361 = (float)var5[11];
         this.field16362 = (float)var5[12];
         this.field16363 = (float)var5[13];
         this.field16364 = (float)var5[14];
         this.field16365 = (float)var5[15];
      }
   }

   public static boolean method10003(double[] var0, int[] var1) {
      double[] var4 = new double[4];
      int var5 = 0;
      int var6 = 0;
      int var7 = 4;

      while (var7-- != 0) {
         double var9 = 0.0;
         int var8 = 4;

         while (var8-- != 0) {
            double var11 = var0[var5++];
            var11 = Math.abs(var11);
            if (var11 > var9) {
               var9 = var11;
            }
         }

         if (var9 == 0.0) {
            return false;
         }

         var4[var6++] = 1.0 / var9;
      }

      byte var28 = 0;

      for (int var27 = 0; var27 < 4; var27++) {
         for (int var23 = 0; var23 < var27; var23++) {
            int var15 = var28 + 4 * var23 + var27;
            double var16 = var0[var15];
            int var18 = var23;
            int var19 = var28 + 4 * var23;

            for (int var20 = var28 + var27; var18-- != 0; var20 += 4) {
               var16 -= var0[var19] * var0[var20];
               var19++;
            }

            var0[var15] = var16;
         }

         double var13 = 0.0;
         var6 = -1;

         for (int var24 = var27; var24 < 4; var24++) {
            int var30 = var28 + 4 * var24 + var27;
            double var32 = var0[var30];
            int var33 = var27;
            int var35 = var28 + 4 * var24;

            for (int var37 = var28 + var27; var33-- != 0; var37 += 4) {
               var32 -= var0[var35] * var0[var37];
               var35++;
            }

            var0[var30] = var32;
            double var21;
            if ((var21 = var4[var24] * Math.abs(var32)) >= var13) {
               var13 = var21;
               var6 = var24;
            }
         }

         if (var6 < 0) {
            throw new RuntimeException(Class8148.method28252("Matrix4f13"));
         }

         if (var27 != var6) {
            int var34 = 4;
            int var36 = var28 + 4 * var6;
            int var38 = var28 + 4 * var27;

            while (var34-- != 0) {
               double var39 = var0[var36];
               var0[var36++] = var0[var38];
               var0[var38++] = var39;
            }

            var4[var6] = var4[var27];
         }

         var1[var27] = var6;
         if (var0[var28 + 4 * var27 + var27] == 0.0) {
            return false;
         }

         if (var27 != 3) {
            double var40 = 1.0 / var0[var28 + 4 * var27 + var27];
            int var31 = var28 + 4 * (var27 + 1) + var27;

            for (int var25 = 3 - var27; var25-- != 0; var31 += 4) {
               var0[var31] *= var40;
            }
         }
      }

      return true;
   }

   public static void method10004(double[] var0, int[] var1, double[] var2) {
      byte var5 = 0;

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var6;
         int var8 = -1;

         for (int var9 = 0; var9 < 4; var9++) {
            int var11 = var1[var5 + var9];
            double var12 = var2[var7 + 4 * var11];
            var2[var7 + 4 * var11] = var2[var7 + 4 * var9];
            if (var8 < 0) {
               if (var12 != 0.0) {
                  var8 = var9;
               }
            } else {
               int var10 = var9 * 4;

               for (int var14 = var8; var14 <= var9 - 1; var14++) {
                  var12 -= var0[var10 + var14] * var2[var7 + 4 * var14];
               }
            }

            var2[var7 + 4 * var9] = var12;
         }

         int var15 = 12;
         var2[var7 + 12] = var2[var7 + 12] / var0[var15 + 3];
         var15 -= 4;
         var2[var7 + 8] = (var2[var7 + 8] - var0[var15 + 3] * var2[var7 + 12]) / var0[var15 + 2];
         var15 -= 4;
         var2[var7 + 4] = (var2[var7 + 4] - var0[var15 + 2] * var2[var7 + 8] - var0[var15 + 3] * var2[var7 + 12]) / var0[var15 + 1];
         var15 -= 4;
         var2[var7 + 0] = (var2[var7 + 0] - var0[var15 + 1] * var2[var7 + 4] - var0[var15 + 2] * var2[var7 + 8] - var0[var15 + 3] * var2[var7 + 12])
            / var0[var15 + 0];
      }
   }

   public final float method10005() {
      float var3 = this.field16350
         * (
            this.field16355 * this.field16360 * this.field16365
               + this.field16356 * this.field16361 * this.field16363
               + this.field16357 * this.field16359 * this.field16364
               - this.field16357 * this.field16360 * this.field16363
               - this.field16355 * this.field16361 * this.field16364
               - this.field16356 * this.field16359 * this.field16365
         );
      var3 -= this.field16351
         * (
            this.field16354 * this.field16360 * this.field16365
               + this.field16356 * this.field16361 * this.field16362
               + this.field16357 * this.field16358 * this.field16364
               - this.field16357 * this.field16360 * this.field16362
               - this.field16354 * this.field16361 * this.field16364
               - this.field16356 * this.field16358 * this.field16365
         );
      var3 += this.field16352
         * (
            this.field16354 * this.field16359 * this.field16365
               + this.field16355 * this.field16361 * this.field16362
               + this.field16357 * this.field16358 * this.field16363
               - this.field16357 * this.field16359 * this.field16362
               - this.field16354 * this.field16361 * this.field16363
               - this.field16355 * this.field16358 * this.field16365
         );
      return var3
         - this.field16353
            * (
               this.field16354 * this.field16359 * this.field16364
                  + this.field16355 * this.field16360 * this.field16362
                  + this.field16356 * this.field16358 * this.field16363
                  - this.field16356 * this.field16359 * this.field16362
                  - this.field16354 * this.field16360 * this.field16363
                  - this.field16355 * this.field16358 * this.field16364
            );
   }

   public final void method10006(Class2372 var1) {
      this.field16350 = var1.field16222;
      this.field16351 = var1.field16223;
      this.field16352 = var1.field16224;
      this.field16353 = 0.0F;
      this.field16354 = var1.field16225;
      this.field16355 = var1.field16226;
      this.field16356 = var1.field16227;
      this.field16357 = 0.0F;
      this.field16358 = var1.field16228;
      this.field16359 = var1.field16229;
      this.field16360 = var1.field16230;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10007(Class2363 var1) {
      this.field16350 = (float)var1.field16185;
      this.field16351 = (float)var1.field16186;
      this.field16352 = (float)var1.field16187;
      this.field16353 = 0.0F;
      this.field16354 = (float)var1.field16188;
      this.field16355 = (float)var1.field16189;
      this.field16356 = (float)var1.field16190;
      this.field16357 = 0.0F;
      this.field16358 = (float)var1.field16191;
      this.field16359 = (float)var1.field16192;
      this.field16360 = (float)var1.field16193;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10008(float var1) {
      this.field16350 = var1;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = 0.0F;
      this.field16354 = 0.0F;
      this.field16355 = var1;
      this.field16356 = 0.0F;
      this.field16357 = 0.0F;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = var1;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10009(float[] var1) {
      this.field16350 = var1[0];
      this.field16351 = var1[1];
      this.field16352 = var1[2];
      this.field16353 = var1[3];
      this.field16354 = var1[4];
      this.field16355 = var1[5];
      this.field16356 = var1[6];
      this.field16357 = var1[7];
      this.field16358 = var1[8];
      this.field16359 = var1[9];
      this.field16360 = var1[10];
      this.field16361 = var1[11];
      this.field16362 = var1[12];
      this.field16363 = var1[13];
      this.field16364 = var1[14];
      this.field16365 = var1[15];
   }

   public final void method10010(Class6 var1) {
      this.field16350 = 1.0F;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = var1.field8;
      this.field16354 = 0.0F;
      this.field16355 = 1.0F;
      this.field16356 = 0.0F;
      this.field16357 = var1.field9;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = 1.0F;
      this.field16361 = var1.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10011(float var1, Class6 var2) {
      this.field16350 = var1;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = var2.field8;
      this.field16354 = 0.0F;
      this.field16355 = var1;
      this.field16356 = 0.0F;
      this.field16357 = var2.field9;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = var1;
      this.field16361 = var2.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10012(Class6 var1, float var2) {
      this.field16350 = var2;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = var2 * var1.field8;
      this.field16354 = 0.0F;
      this.field16355 = var2;
      this.field16356 = 0.0F;
      this.field16357 = var2 * var1.field9;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = var2;
      this.field16361 = var2 * var1.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10013(Class2372 var1, Class6 var2, float var3) {
      this.field16350 = var1.field16222 * var3;
      this.field16351 = var1.field16223 * var3;
      this.field16352 = var1.field16224 * var3;
      this.field16353 = var2.field8;
      this.field16354 = var1.field16225 * var3;
      this.field16355 = var1.field16226 * var3;
      this.field16356 = var1.field16227 * var3;
      this.field16357 = var2.field9;
      this.field16358 = var1.field16228 * var3;
      this.field16359 = var1.field16229 * var3;
      this.field16360 = var1.field16230 * var3;
      this.field16361 = var2.field10;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10014(Class2363 var1, Class2368 var2, double var3) {
      this.field16350 = (float)(var1.field16185 * var3);
      this.field16351 = (float)(var1.field16186 * var3);
      this.field16352 = (float)(var1.field16187 * var3);
      this.field16353 = (float)var2.field16210;
      this.field16354 = (float)(var1.field16188 * var3);
      this.field16355 = (float)(var1.field16189 * var3);
      this.field16356 = (float)(var1.field16190 * var3);
      this.field16357 = (float)var2.field16211;
      this.field16358 = (float)(var1.field16191 * var3);
      this.field16359 = (float)(var1.field16192 * var3);
      this.field16360 = (float)(var1.field16193 * var3);
      this.field16361 = (float)var2.field16212;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10015(Class6 var1) {
      this.field16353 = var1.field8;
      this.field16357 = var1.field9;
      this.field16361 = var1.field10;
   }

   public final void method10016(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field16350 = 1.0F;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = 0.0F;
      this.field16354 = 0.0F;
      this.field16355 = var5;
      this.field16356 = -var4;
      this.field16357 = 0.0F;
      this.field16358 = 0.0F;
      this.field16359 = var4;
      this.field16360 = var5;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10017(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field16350 = var5;
      this.field16351 = 0.0F;
      this.field16352 = var4;
      this.field16353 = 0.0F;
      this.field16354 = 0.0F;
      this.field16355 = 1.0F;
      this.field16356 = 0.0F;
      this.field16357 = 0.0F;
      this.field16358 = -var4;
      this.field16359 = 0.0F;
      this.field16360 = var5;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10018(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field16350 = var5;
      this.field16351 = -var4;
      this.field16352 = 0.0F;
      this.field16353 = 0.0F;
      this.field16354 = var4;
      this.field16355 = var5;
      this.field16356 = 0.0F;
      this.field16357 = 0.0F;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = 1.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 1.0F;
   }

   public final void method10019(float var1) {
      this.field16350 *= var1;
      this.field16351 *= var1;
      this.field16352 *= var1;
      this.field16353 *= var1;
      this.field16354 *= var1;
      this.field16355 *= var1;
      this.field16356 *= var1;
      this.field16357 *= var1;
      this.field16358 *= var1;
      this.field16359 *= var1;
      this.field16360 *= var1;
      this.field16361 *= var1;
      this.field16362 *= var1;
      this.field16363 *= var1;
      this.field16364 *= var1;
      this.field16365 *= var1;
   }

   public final void method10020(float var1, Class2404 var2) {
      this.field16350 = var2.field16350 * var1;
      this.field16351 = var2.field16351 * var1;
      this.field16352 = var2.field16352 * var1;
      this.field16353 = var2.field16353 * var1;
      this.field16354 = var2.field16354 * var1;
      this.field16355 = var2.field16355 * var1;
      this.field16356 = var2.field16356 * var1;
      this.field16357 = var2.field16357 * var1;
      this.field16358 = var2.field16358 * var1;
      this.field16359 = var2.field16359 * var1;
      this.field16360 = var2.field16360 * var1;
      this.field16361 = var2.field16361 * var1;
      this.field16362 = var2.field16362 * var1;
      this.field16363 = var2.field16363 * var1;
      this.field16364 = var2.field16364 * var1;
      this.field16365 = var2.field16365 * var1;
   }

   public final void method10021(Class2404 var1) {
      float var4 = this.field16350 * var1.field16350
         + this.field16351 * var1.field16354
         + this.field16352 * var1.field16358
         + this.field16353 * var1.field16362;
      float var5 = this.field16350 * var1.field16351
         + this.field16351 * var1.field16355
         + this.field16352 * var1.field16359
         + this.field16353 * var1.field16363;
      float var6 = this.field16350 * var1.field16352
         + this.field16351 * var1.field16356
         + this.field16352 * var1.field16360
         + this.field16353 * var1.field16364;
      float var7 = this.field16350 * var1.field16353
         + this.field16351 * var1.field16357
         + this.field16352 * var1.field16361
         + this.field16353 * var1.field16365;
      float var8 = this.field16354 * var1.field16350
         + this.field16355 * var1.field16354
         + this.field16356 * var1.field16358
         + this.field16357 * var1.field16362;
      float var9 = this.field16354 * var1.field16351
         + this.field16355 * var1.field16355
         + this.field16356 * var1.field16359
         + this.field16357 * var1.field16363;
      float var10 = this.field16354 * var1.field16352
         + this.field16355 * var1.field16356
         + this.field16356 * var1.field16360
         + this.field16357 * var1.field16364;
      float var11 = this.field16354 * var1.field16353
         + this.field16355 * var1.field16357
         + this.field16356 * var1.field16361
         + this.field16357 * var1.field16365;
      float var12 = this.field16358 * var1.field16350
         + this.field16359 * var1.field16354
         + this.field16360 * var1.field16358
         + this.field16361 * var1.field16362;
      float var13 = this.field16358 * var1.field16351
         + this.field16359 * var1.field16355
         + this.field16360 * var1.field16359
         + this.field16361 * var1.field16363;
      float var14 = this.field16358 * var1.field16352
         + this.field16359 * var1.field16356
         + this.field16360 * var1.field16360
         + this.field16361 * var1.field16364;
      float var15 = this.field16358 * var1.field16353
         + this.field16359 * var1.field16357
         + this.field16360 * var1.field16361
         + this.field16361 * var1.field16365;
      float var16 = this.field16362 * var1.field16350
         + this.field16363 * var1.field16354
         + this.field16364 * var1.field16358
         + this.field16365 * var1.field16362;
      float var17 = this.field16362 * var1.field16351
         + this.field16363 * var1.field16355
         + this.field16364 * var1.field16359
         + this.field16365 * var1.field16363;
      float var18 = this.field16362 * var1.field16352
         + this.field16363 * var1.field16356
         + this.field16364 * var1.field16360
         + this.field16365 * var1.field16364;
      float var19 = this.field16362 * var1.field16353
         + this.field16363 * var1.field16357
         + this.field16364 * var1.field16361
         + this.field16365 * var1.field16365;
      this.field16350 = var4;
      this.field16351 = var5;
      this.field16352 = var6;
      this.field16353 = var7;
      this.field16354 = var8;
      this.field16355 = var9;
      this.field16356 = var10;
      this.field16357 = var11;
      this.field16358 = var12;
      this.field16359 = var13;
      this.field16360 = var14;
      this.field16361 = var15;
      this.field16362 = var16;
      this.field16363 = var17;
      this.field16364 = var18;
      this.field16365 = var19;
   }

   public final void method10022(Class2404 var1, Class2404 var2) {
      if (this != var1 && this != var2) {
         this.field16350 = var1.field16350 * var2.field16350
            + var1.field16351 * var2.field16354
            + var1.field16352 * var2.field16358
            + var1.field16353 * var2.field16362;
         this.field16351 = var1.field16350 * var2.field16351
            + var1.field16351 * var2.field16355
            + var1.field16352 * var2.field16359
            + var1.field16353 * var2.field16363;
         this.field16352 = var1.field16350 * var2.field16352
            + var1.field16351 * var2.field16356
            + var1.field16352 * var2.field16360
            + var1.field16353 * var2.field16364;
         this.field16353 = var1.field16350 * var2.field16353
            + var1.field16351 * var2.field16357
            + var1.field16352 * var2.field16361
            + var1.field16353 * var2.field16365;
         this.field16354 = var1.field16354 * var2.field16350
            + var1.field16355 * var2.field16354
            + var1.field16356 * var2.field16358
            + var1.field16357 * var2.field16362;
         this.field16355 = var1.field16354 * var2.field16351
            + var1.field16355 * var2.field16355
            + var1.field16356 * var2.field16359
            + var1.field16357 * var2.field16363;
         this.field16356 = var1.field16354 * var2.field16352
            + var1.field16355 * var2.field16356
            + var1.field16356 * var2.field16360
            + var1.field16357 * var2.field16364;
         this.field16357 = var1.field16354 * var2.field16353
            + var1.field16355 * var2.field16357
            + var1.field16356 * var2.field16361
            + var1.field16357 * var2.field16365;
         this.field16358 = var1.field16358 * var2.field16350
            + var1.field16359 * var2.field16354
            + var1.field16360 * var2.field16358
            + var1.field16361 * var2.field16362;
         this.field16359 = var1.field16358 * var2.field16351
            + var1.field16359 * var2.field16355
            + var1.field16360 * var2.field16359
            + var1.field16361 * var2.field16363;
         this.field16360 = var1.field16358 * var2.field16352
            + var1.field16359 * var2.field16356
            + var1.field16360 * var2.field16360
            + var1.field16361 * var2.field16364;
         this.field16361 = var1.field16358 * var2.field16353
            + var1.field16359 * var2.field16357
            + var1.field16360 * var2.field16361
            + var1.field16361 * var2.field16365;
         this.field16362 = var1.field16362 * var2.field16350
            + var1.field16363 * var2.field16354
            + var1.field16364 * var2.field16358
            + var1.field16365 * var2.field16362;
         this.field16363 = var1.field16362 * var2.field16351
            + var1.field16363 * var2.field16355
            + var1.field16364 * var2.field16359
            + var1.field16365 * var2.field16363;
         this.field16364 = var1.field16362 * var2.field16352
            + var1.field16363 * var2.field16356
            + var1.field16364 * var2.field16360
            + var1.field16365 * var2.field16364;
         this.field16365 = var1.field16362 * var2.field16353
            + var1.field16363 * var2.field16357
            + var1.field16364 * var2.field16361
            + var1.field16365 * var2.field16365;
      } else {
         float var5 = var1.field16350 * var2.field16350
            + var1.field16351 * var2.field16354
            + var1.field16352 * var2.field16358
            + var1.field16353 * var2.field16362;
         float var6 = var1.field16350 * var2.field16351
            + var1.field16351 * var2.field16355
            + var1.field16352 * var2.field16359
            + var1.field16353 * var2.field16363;
         float var7 = var1.field16350 * var2.field16352
            + var1.field16351 * var2.field16356
            + var1.field16352 * var2.field16360
            + var1.field16353 * var2.field16364;
         float var8 = var1.field16350 * var2.field16353
            + var1.field16351 * var2.field16357
            + var1.field16352 * var2.field16361
            + var1.field16353 * var2.field16365;
         float var9 = var1.field16354 * var2.field16350
            + var1.field16355 * var2.field16354
            + var1.field16356 * var2.field16358
            + var1.field16357 * var2.field16362;
         float var10 = var1.field16354 * var2.field16351
            + var1.field16355 * var2.field16355
            + var1.field16356 * var2.field16359
            + var1.field16357 * var2.field16363;
         float var11 = var1.field16354 * var2.field16352
            + var1.field16355 * var2.field16356
            + var1.field16356 * var2.field16360
            + var1.field16357 * var2.field16364;
         float var12 = var1.field16354 * var2.field16353
            + var1.field16355 * var2.field16357
            + var1.field16356 * var2.field16361
            + var1.field16357 * var2.field16365;
         float var13 = var1.field16358 * var2.field16350
            + var1.field16359 * var2.field16354
            + var1.field16360 * var2.field16358
            + var1.field16361 * var2.field16362;
         float var14 = var1.field16358 * var2.field16351
            + var1.field16359 * var2.field16355
            + var1.field16360 * var2.field16359
            + var1.field16361 * var2.field16363;
         float var15 = var1.field16358 * var2.field16352
            + var1.field16359 * var2.field16356
            + var1.field16360 * var2.field16360
            + var1.field16361 * var2.field16364;
         float var16 = var1.field16358 * var2.field16353
            + var1.field16359 * var2.field16357
            + var1.field16360 * var2.field16361
            + var1.field16361 * var2.field16365;
         float var17 = var1.field16362 * var2.field16350
            + var1.field16363 * var2.field16354
            + var1.field16364 * var2.field16358
            + var1.field16365 * var2.field16362;
         float var18 = var1.field16362 * var2.field16351
            + var1.field16363 * var2.field16355
            + var1.field16364 * var2.field16359
            + var1.field16365 * var2.field16363;
         float var19 = var1.field16362 * var2.field16352
            + var1.field16363 * var2.field16356
            + var1.field16364 * var2.field16360
            + var1.field16365 * var2.field16364;
         float var20 = var1.field16362 * var2.field16353
            + var1.field16363 * var2.field16357
            + var1.field16364 * var2.field16361
            + var1.field16365 * var2.field16365;
         this.field16350 = var5;
         this.field16351 = var6;
         this.field16352 = var7;
         this.field16353 = var8;
         this.field16354 = var9;
         this.field16355 = var10;
         this.field16356 = var11;
         this.field16357 = var12;
         this.field16358 = var13;
         this.field16359 = var14;
         this.field16360 = var15;
         this.field16361 = var16;
         this.field16362 = var17;
         this.field16363 = var18;
         this.field16364 = var19;
         this.field16365 = var20;
      }
   }

   public final void method10023(Class2404 var1, Class2404 var2) {
      if (this != var1 && this != var2) {
         this.field16350 = var1.field16350 * var2.field16350
            + var1.field16354 * var2.field16351
            + var1.field16358 * var2.field16352
            + var1.field16362 * var2.field16353;
         this.field16351 = var1.field16350 * var2.field16354
            + var1.field16354 * var2.field16355
            + var1.field16358 * var2.field16356
            + var1.field16362 * var2.field16357;
         this.field16352 = var1.field16350 * var2.field16358
            + var1.field16354 * var2.field16359
            + var1.field16358 * var2.field16360
            + var1.field16362 * var2.field16361;
         this.field16353 = var1.field16350 * var2.field16362
            + var1.field16354 * var2.field16363
            + var1.field16358 * var2.field16364
            + var1.field16362 * var2.field16365;
         this.field16354 = var1.field16351 * var2.field16350
            + var1.field16355 * var2.field16351
            + var1.field16359 * var2.field16352
            + var1.field16363 * var2.field16353;
         this.field16355 = var1.field16351 * var2.field16354
            + var1.field16355 * var2.field16355
            + var1.field16359 * var2.field16356
            + var1.field16363 * var2.field16357;
         this.field16356 = var1.field16351 * var2.field16358
            + var1.field16355 * var2.field16359
            + var1.field16359 * var2.field16360
            + var1.field16363 * var2.field16361;
         this.field16357 = var1.field16351 * var2.field16362
            + var1.field16355 * var2.field16363
            + var1.field16359 * var2.field16364
            + var1.field16363 * var2.field16365;
         this.field16358 = var1.field16352 * var2.field16350
            + var1.field16356 * var2.field16351
            + var1.field16360 * var2.field16352
            + var1.field16364 * var2.field16353;
         this.field16359 = var1.field16352 * var2.field16354
            + var1.field16356 * var2.field16355
            + var1.field16360 * var2.field16356
            + var1.field16364 * var2.field16357;
         this.field16360 = var1.field16352 * var2.field16358
            + var1.field16356 * var2.field16359
            + var1.field16360 * var2.field16360
            + var1.field16364 * var2.field16361;
         this.field16361 = var1.field16352 * var2.field16362
            + var1.field16356 * var2.field16363
            + var1.field16360 * var2.field16364
            + var1.field16364 * var2.field16365;
         this.field16362 = var1.field16353 * var2.field16350
            + var1.field16357 * var2.field16351
            + var1.field16361 * var2.field16352
            + var1.field16365 * var2.field16353;
         this.field16363 = var1.field16353 * var2.field16354
            + var1.field16357 * var2.field16355
            + var1.field16361 * var2.field16356
            + var1.field16365 * var2.field16357;
         this.field16364 = var1.field16353 * var2.field16358
            + var1.field16357 * var2.field16359
            + var1.field16361 * var2.field16360
            + var1.field16365 * var2.field16361;
         this.field16365 = var1.field16353 * var2.field16362
            + var1.field16357 * var2.field16363
            + var1.field16361 * var2.field16364
            + var1.field16365 * var2.field16365;
      } else {
         float var5 = var1.field16350 * var2.field16350
            + var1.field16354 * var2.field16351
            + var1.field16358 * var2.field16352
            + var1.field16362 * var2.field16353;
         float var6 = var1.field16350 * var2.field16354
            + var1.field16354 * var2.field16355
            + var1.field16358 * var2.field16356
            + var1.field16362 * var2.field16357;
         float var7 = var1.field16350 * var2.field16358
            + var1.field16354 * var2.field16359
            + var1.field16358 * var2.field16360
            + var1.field16362 * var2.field16361;
         float var8 = var1.field16350 * var2.field16362
            + var1.field16354 * var2.field16363
            + var1.field16358 * var2.field16364
            + var1.field16362 * var2.field16365;
         float var9 = var1.field16351 * var2.field16350
            + var1.field16355 * var2.field16351
            + var1.field16359 * var2.field16352
            + var1.field16363 * var2.field16353;
         float var10 = var1.field16351 * var2.field16354
            + var1.field16355 * var2.field16355
            + var1.field16359 * var2.field16356
            + var1.field16363 * var2.field16357;
         float var11 = var1.field16351 * var2.field16358
            + var1.field16355 * var2.field16359
            + var1.field16359 * var2.field16360
            + var1.field16363 * var2.field16361;
         float var12 = var1.field16351 * var2.field16362
            + var1.field16355 * var2.field16363
            + var1.field16359 * var2.field16364
            + var1.field16363 * var2.field16365;
         float var13 = var1.field16352 * var2.field16350
            + var1.field16356 * var2.field16351
            + var1.field16360 * var2.field16352
            + var1.field16364 * var2.field16353;
         float var14 = var1.field16352 * var2.field16354
            + var1.field16356 * var2.field16355
            + var1.field16360 * var2.field16356
            + var1.field16364 * var2.field16357;
         float var15 = var1.field16352 * var2.field16358
            + var1.field16356 * var2.field16359
            + var1.field16360 * var2.field16360
            + var1.field16364 * var2.field16361;
         float var16 = var1.field16352 * var2.field16362
            + var1.field16356 * var2.field16363
            + var1.field16360 * var2.field16364
            + var1.field16364 * var2.field16365;
         float var17 = var1.field16353 * var2.field16350
            + var1.field16357 * var2.field16351
            + var1.field16361 * var2.field16352
            + var1.field16365 * var2.field16353;
         float var18 = var1.field16353 * var2.field16354
            + var1.field16357 * var2.field16355
            + var1.field16361 * var2.field16356
            + var1.field16365 * var2.field16357;
         float var19 = var1.field16353 * var2.field16358
            + var1.field16357 * var2.field16359
            + var1.field16361 * var2.field16360
            + var1.field16365 * var2.field16361;
         float var20 = var1.field16353 * var2.field16362
            + var1.field16357 * var2.field16363
            + var1.field16361 * var2.field16364
            + var1.field16365 * var2.field16365;
         this.field16350 = var5;
         this.field16351 = var6;
         this.field16352 = var7;
         this.field16353 = var8;
         this.field16354 = var9;
         this.field16355 = var10;
         this.field16356 = var11;
         this.field16357 = var12;
         this.field16358 = var13;
         this.field16359 = var14;
         this.field16360 = var15;
         this.field16361 = var16;
         this.field16362 = var17;
         this.field16363 = var18;
         this.field16364 = var19;
         this.field16365 = var20;
      }
   }

   public final void method10024(Class2404 var1, Class2404 var2) {
      if (this != var1 && this != var2) {
         this.field16350 = var1.field16350 * var2.field16350
            + var1.field16351 * var2.field16351
            + var1.field16352 * var2.field16352
            + var1.field16353 * var2.field16353;
         this.field16351 = var1.field16350 * var2.field16354
            + var1.field16351 * var2.field16355
            + var1.field16352 * var2.field16356
            + var1.field16353 * var2.field16357;
         this.field16352 = var1.field16350 * var2.field16358
            + var1.field16351 * var2.field16359
            + var1.field16352 * var2.field16360
            + var1.field16353 * var2.field16361;
         this.field16353 = var1.field16350 * var2.field16362
            + var1.field16351 * var2.field16363
            + var1.field16352 * var2.field16364
            + var1.field16353 * var2.field16365;
         this.field16354 = var1.field16354 * var2.field16350
            + var1.field16355 * var2.field16351
            + var1.field16356 * var2.field16352
            + var1.field16357 * var2.field16353;
         this.field16355 = var1.field16354 * var2.field16354
            + var1.field16355 * var2.field16355
            + var1.field16356 * var2.field16356
            + var1.field16357 * var2.field16357;
         this.field16356 = var1.field16354 * var2.field16358
            + var1.field16355 * var2.field16359
            + var1.field16356 * var2.field16360
            + var1.field16357 * var2.field16361;
         this.field16357 = var1.field16354 * var2.field16362
            + var1.field16355 * var2.field16363
            + var1.field16356 * var2.field16364
            + var1.field16357 * var2.field16365;
         this.field16358 = var1.field16358 * var2.field16350
            + var1.field16359 * var2.field16351
            + var1.field16360 * var2.field16352
            + var1.field16361 * var2.field16353;
         this.field16359 = var1.field16358 * var2.field16354
            + var1.field16359 * var2.field16355
            + var1.field16360 * var2.field16356
            + var1.field16361 * var2.field16357;
         this.field16360 = var1.field16358 * var2.field16358
            + var1.field16359 * var2.field16359
            + var1.field16360 * var2.field16360
            + var1.field16361 * var2.field16361;
         this.field16361 = var1.field16358 * var2.field16362
            + var1.field16359 * var2.field16363
            + var1.field16360 * var2.field16364
            + var1.field16361 * var2.field16365;
         this.field16362 = var1.field16362 * var2.field16350
            + var1.field16363 * var2.field16351
            + var1.field16364 * var2.field16352
            + var1.field16365 * var2.field16353;
         this.field16363 = var1.field16362 * var2.field16354
            + var1.field16363 * var2.field16355
            + var1.field16364 * var2.field16356
            + var1.field16365 * var2.field16357;
         this.field16364 = var1.field16362 * var2.field16358
            + var1.field16363 * var2.field16359
            + var1.field16364 * var2.field16360
            + var1.field16365 * var2.field16361;
         this.field16365 = var1.field16362 * var2.field16362
            + var1.field16363 * var2.field16363
            + var1.field16364 * var2.field16364
            + var1.field16365 * var2.field16365;
      } else {
         float var5 = var1.field16350 * var2.field16350
            + var1.field16351 * var2.field16351
            + var1.field16352 * var2.field16352
            + var1.field16353 * var2.field16353;
         float var6 = var1.field16350 * var2.field16354
            + var1.field16351 * var2.field16355
            + var1.field16352 * var2.field16356
            + var1.field16353 * var2.field16357;
         float var7 = var1.field16350 * var2.field16358
            + var1.field16351 * var2.field16359
            + var1.field16352 * var2.field16360
            + var1.field16353 * var2.field16361;
         float var8 = var1.field16350 * var2.field16362
            + var1.field16351 * var2.field16363
            + var1.field16352 * var2.field16364
            + var1.field16353 * var2.field16365;
         float var9 = var1.field16354 * var2.field16350
            + var1.field16355 * var2.field16351
            + var1.field16356 * var2.field16352
            + var1.field16357 * var2.field16353;
         float var10 = var1.field16354 * var2.field16354
            + var1.field16355 * var2.field16355
            + var1.field16356 * var2.field16356
            + var1.field16357 * var2.field16357;
         float var11 = var1.field16354 * var2.field16358
            + var1.field16355 * var2.field16359
            + var1.field16356 * var2.field16360
            + var1.field16357 * var2.field16361;
         float var12 = var1.field16354 * var2.field16362
            + var1.field16355 * var2.field16363
            + var1.field16356 * var2.field16364
            + var1.field16357 * var2.field16365;
         float var13 = var1.field16358 * var2.field16350
            + var1.field16359 * var2.field16351
            + var1.field16360 * var2.field16352
            + var1.field16361 * var2.field16353;
         float var14 = var1.field16358 * var2.field16354
            + var1.field16359 * var2.field16355
            + var1.field16360 * var2.field16356
            + var1.field16361 * var2.field16357;
         float var15 = var1.field16358 * var2.field16358
            + var1.field16359 * var2.field16359
            + var1.field16360 * var2.field16360
            + var1.field16361 * var2.field16361;
         float var16 = var1.field16358 * var2.field16362
            + var1.field16359 * var2.field16363
            + var1.field16360 * var2.field16364
            + var1.field16361 * var2.field16365;
         float var17 = var1.field16362 * var2.field16350
            + var1.field16363 * var2.field16351
            + var1.field16364 * var2.field16352
            + var1.field16365 * var2.field16353;
         float var18 = var1.field16362 * var2.field16354
            + var1.field16363 * var2.field16355
            + var1.field16364 * var2.field16356
            + var1.field16365 * var2.field16357;
         float var19 = var1.field16362 * var2.field16358
            + var1.field16363 * var2.field16359
            + var1.field16364 * var2.field16360
            + var1.field16365 * var2.field16361;
         float var20 = var1.field16362 * var2.field16362
            + var1.field16363 * var2.field16363
            + var1.field16364 * var2.field16364
            + var1.field16365 * var2.field16365;
         this.field16350 = var5;
         this.field16351 = var6;
         this.field16352 = var7;
         this.field16353 = var8;
         this.field16354 = var9;
         this.field16355 = var10;
         this.field16356 = var11;
         this.field16357 = var12;
         this.field16358 = var13;
         this.field16359 = var14;
         this.field16360 = var15;
         this.field16361 = var16;
         this.field16362 = var17;
         this.field16363 = var18;
         this.field16364 = var19;
         this.field16365 = var20;
      }
   }

   public final void method10025(Class2404 var1, Class2404 var2) {
      if (this != var1 && this != var2) {
         this.field16350 = var1.field16350 * var2.field16350
            + var1.field16354 * var2.field16354
            + var1.field16358 * var2.field16358
            + var1.field16362 * var2.field16362;
         this.field16351 = var1.field16350 * var2.field16351
            + var1.field16354 * var2.field16355
            + var1.field16358 * var2.field16359
            + var1.field16362 * var2.field16363;
         this.field16352 = var1.field16350 * var2.field16352
            + var1.field16354 * var2.field16356
            + var1.field16358 * var2.field16360
            + var1.field16362 * var2.field16364;
         this.field16353 = var1.field16350 * var2.field16353
            + var1.field16354 * var2.field16357
            + var1.field16358 * var2.field16361
            + var1.field16362 * var2.field16365;
         this.field16354 = var1.field16351 * var2.field16350
            + var1.field16355 * var2.field16354
            + var1.field16359 * var2.field16358
            + var1.field16363 * var2.field16362;
         this.field16355 = var1.field16351 * var2.field16351
            + var1.field16355 * var2.field16355
            + var1.field16359 * var2.field16359
            + var1.field16363 * var2.field16363;
         this.field16356 = var1.field16351 * var2.field16352
            + var1.field16355 * var2.field16356
            + var1.field16359 * var2.field16360
            + var1.field16363 * var2.field16364;
         this.field16357 = var1.field16351 * var2.field16353
            + var1.field16355 * var2.field16357
            + var1.field16359 * var2.field16361
            + var1.field16363 * var2.field16365;
         this.field16358 = var1.field16352 * var2.field16350
            + var1.field16356 * var2.field16354
            + var1.field16360 * var2.field16358
            + var1.field16364 * var2.field16362;
         this.field16359 = var1.field16352 * var2.field16351
            + var1.field16356 * var2.field16355
            + var1.field16360 * var2.field16359
            + var1.field16364 * var2.field16363;
         this.field16360 = var1.field16352 * var2.field16352
            + var1.field16356 * var2.field16356
            + var1.field16360 * var2.field16360
            + var1.field16364 * var2.field16364;
         this.field16361 = var1.field16352 * var2.field16353
            + var1.field16356 * var2.field16357
            + var1.field16360 * var2.field16361
            + var1.field16364 * var2.field16365;
         this.field16362 = var1.field16353 * var2.field16350
            + var1.field16357 * var2.field16354
            + var1.field16361 * var2.field16358
            + var1.field16365 * var2.field16362;
         this.field16363 = var1.field16353 * var2.field16351
            + var1.field16357 * var2.field16355
            + var1.field16361 * var2.field16359
            + var1.field16365 * var2.field16363;
         this.field16364 = var1.field16353 * var2.field16352
            + var1.field16357 * var2.field16356
            + var1.field16361 * var2.field16360
            + var1.field16365 * var2.field16364;
         this.field16365 = var1.field16353 * var2.field16353
            + var1.field16357 * var2.field16357
            + var1.field16361 * var2.field16361
            + var1.field16365 * var2.field16365;
      } else {
         float var5 = var1.field16350 * var2.field16350
            + var1.field16354 * var2.field16354
            + var1.field16358 * var2.field16358
            + var1.field16362 * var2.field16362;
         float var6 = var1.field16350 * var2.field16351
            + var1.field16354 * var2.field16355
            + var1.field16358 * var2.field16359
            + var1.field16362 * var2.field16363;
         float var7 = var1.field16350 * var2.field16352
            + var1.field16354 * var2.field16356
            + var1.field16358 * var2.field16360
            + var1.field16362 * var2.field16364;
         float var8 = var1.field16350 * var2.field16353
            + var1.field16354 * var2.field16357
            + var1.field16358 * var2.field16361
            + var1.field16362 * var2.field16365;
         float var9 = var1.field16351 * var2.field16350
            + var1.field16355 * var2.field16354
            + var1.field16359 * var2.field16358
            + var1.field16363 * var2.field16362;
         float var10 = var1.field16351 * var2.field16351
            + var1.field16355 * var2.field16355
            + var1.field16359 * var2.field16359
            + var1.field16363 * var2.field16363;
         float var11 = var1.field16351 * var2.field16352
            + var1.field16355 * var2.field16356
            + var1.field16359 * var2.field16360
            + var1.field16363 * var2.field16364;
         float var12 = var1.field16351 * var2.field16353
            + var1.field16355 * var2.field16357
            + var1.field16359 * var2.field16361
            + var1.field16363 * var2.field16365;
         float var13 = var1.field16352 * var2.field16350
            + var1.field16356 * var2.field16354
            + var1.field16360 * var2.field16358
            + var1.field16364 * var2.field16362;
         float var14 = var1.field16352 * var2.field16351
            + var1.field16356 * var2.field16355
            + var1.field16360 * var2.field16359
            + var1.field16364 * var2.field16363;
         float var15 = var1.field16352 * var2.field16352
            + var1.field16356 * var2.field16356
            + var1.field16360 * var2.field16360
            + var1.field16364 * var2.field16364;
         float var16 = var1.field16352 * var2.field16353
            + var1.field16356 * var2.field16357
            + var1.field16360 * var2.field16361
            + var1.field16364 * var2.field16365;
         float var17 = var1.field16353 * var2.field16350
            + var1.field16357 * var2.field16354
            + var1.field16361 * var2.field16358
            + var1.field16365 * var2.field16362;
         float var18 = var1.field16353 * var2.field16351
            + var1.field16357 * var2.field16355
            + var1.field16361 * var2.field16359
            + var1.field16365 * var2.field16363;
         float var19 = var1.field16353 * var2.field16352
            + var1.field16357 * var2.field16356
            + var1.field16361 * var2.field16360
            + var1.field16365 * var2.field16364;
         float var20 = var1.field16353 * var2.field16353
            + var1.field16357 * var2.field16357
            + var1.field16361 * var2.field16361
            + var1.field16365 * var2.field16365;
         this.field16350 = var5;
         this.field16351 = var6;
         this.field16352 = var7;
         this.field16353 = var8;
         this.field16354 = var9;
         this.field16355 = var10;
         this.field16356 = var11;
         this.field16357 = var12;
         this.field16358 = var13;
         this.field16359 = var14;
         this.field16360 = var15;
         this.field16361 = var16;
         this.field16362 = var17;
         this.field16363 = var18;
         this.field16364 = var19;
         this.field16365 = var20;
      }
   }

   public boolean equals(Class2404 var1) {
      try {
         return this.field16350 == var1.field16350
            && this.field16351 == var1.field16351
            && this.field16352 == var1.field16352
            && this.field16353 == var1.field16353
            && this.field16354 == var1.field16354
            && this.field16355 == var1.field16355
            && this.field16356 == var1.field16356
            && this.field16357 == var1.field16357
            && this.field16358 == var1.field16358
            && this.field16359 == var1.field16359
            && this.field16360 == var1.field16360
            && this.field16361 == var1.field16361
            && this.field16362 == var1.field16362
            && this.field16363 == var1.field16363
            && this.field16364 == var1.field16364
            && this.field16365 == var1.field16365;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2404 var4 = (Class2404)var1;
         return this.field16350 == var4.field16350
            && this.field16351 == var4.field16351
            && this.field16352 == var4.field16352
            && this.field16353 == var4.field16353
            && this.field16354 == var4.field16354
            && this.field16355 == var4.field16355
            && this.field16356 == var4.field16356
            && this.field16357 == var4.field16357
            && this.field16358 == var4.field16358
            && this.field16359 == var4.field16359
            && this.field16360 == var4.field16360
            && this.field16361 == var4.field16361
            && this.field16362 == var4.field16362
            && this.field16363 == var4.field16363
            && this.field16364 == var4.field16364
            && this.field16365 == var4.field16365;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method10026(Class2404 var1, float var2) {
      boolean var5 = true;
      if (Math.abs(this.field16350 - var1.field16350) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16351 - var1.field16351) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16352 - var1.field16352) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16353 - var1.field16353) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16354 - var1.field16354) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16355 - var1.field16355) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16356 - var1.field16356) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16357 - var1.field16357) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16358 - var1.field16358) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16359 - var1.field16359) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16360 - var1.field16360) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16361 - var1.field16361) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16362 - var1.field16362) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16363 - var1.field16363) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16364 - var1.field16364) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16365 - var1.field16365) > var2) {
         var5 = false;
      }

      return var5;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16350);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16351);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16352);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16353);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16354);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16355);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16356);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16357);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16358);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16359);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16360);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16361);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16362);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16363);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16364);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16365);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method10027(Class2411 var1, Class2411 var2) {
      float var5 = this.field16350 * var1.field16389
         + this.field16351 * var1.field16390
         + this.field16352 * var1.field16391
         + this.field16353 * var1.field16392;
      float var6 = this.field16354 * var1.field16389
         + this.field16355 * var1.field16390
         + this.field16356 * var1.field16391
         + this.field16357 * var1.field16392;
      float var7 = this.field16358 * var1.field16389
         + this.field16359 * var1.field16390
         + this.field16360 * var1.field16391
         + this.field16361 * var1.field16392;
      var2.field16392 = this.field16362 * var1.field16389
         + this.field16363 * var1.field16390
         + this.field16364 * var1.field16391
         + this.field16365 * var1.field16392;
      var2.field16389 = var5;
      var2.field16390 = var6;
      var2.field16391 = var7;
   }

   public final void method10028(Class2411 var1) {
      float var4 = this.field16350 * var1.field16389
         + this.field16351 * var1.field16390
         + this.field16352 * var1.field16391
         + this.field16353 * var1.field16392;
      float var5 = this.field16354 * var1.field16389
         + this.field16355 * var1.field16390
         + this.field16356 * var1.field16391
         + this.field16357 * var1.field16392;
      float var6 = this.field16358 * var1.field16389
         + this.field16359 * var1.field16390
         + this.field16360 * var1.field16391
         + this.field16361 * var1.field16392;
      var1.field16392 = this.field16362 * var1.field16389
         + this.field16363 * var1.field16390
         + this.field16364 * var1.field16391
         + this.field16365 * var1.field16392;
      var1.field16389 = var4;
      var1.field16390 = var5;
      var1.field16391 = var6;
   }

   public final void method10029(Class2418 var1, Class2418 var2) {
      float var5 = this.field16350 * var1.field8 + this.field16351 * var1.field9 + this.field16352 * var1.field10 + this.field16353;
      float var6 = this.field16354 * var1.field8 + this.field16355 * var1.field9 + this.field16356 * var1.field10 + this.field16357;
      var2.field10 = this.field16358 * var1.field8 + this.field16359 * var1.field9 + this.field16360 * var1.field10 + this.field16361;
      var2.field8 = var5;
      var2.field9 = var6;
   }

   public final void method10030(Class2418 var1) {
      float var4 = this.field16350 * var1.field8 + this.field16351 * var1.field9 + this.field16352 * var1.field10 + this.field16353;
      float var5 = this.field16354 * var1.field8 + this.field16355 * var1.field9 + this.field16356 * var1.field10 + this.field16357;
      var1.field10 = this.field16358 * var1.field8 + this.field16359 * var1.field9 + this.field16360 * var1.field10 + this.field16361;
      var1.field8 = var4;
      var1.field9 = var5;
   }

   public final void method10031(Class6 var1, Class6 var2) {
      float var5 = this.field16350 * var1.field8 + this.field16351 * var1.field9 + this.field16352 * var1.field10;
      float var6 = this.field16354 * var1.field8 + this.field16355 * var1.field9 + this.field16356 * var1.field10;
      var2.field10 = this.field16358 * var1.field8 + this.field16359 * var1.field9 + this.field16360 * var1.field10;
      var2.field8 = var5;
      var2.field9 = var6;
   }

   public final void method10032(Class6 var1) {
      float var4 = this.field16350 * var1.field8 + this.field16351 * var1.field9 + this.field16352 * var1.field10;
      float var5 = this.field16354 * var1.field8 + this.field16355 * var1.field9 + this.field16356 * var1.field10;
      var1.field10 = this.field16358 * var1.field8 + this.field16359 * var1.field9 + this.field16360 * var1.field10;
      var1.field8 = var4;
      var1.field9 = var5;
   }

   public final void method10033(Class2363 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      this.field16350 = (float)(var1.field16185 * var5[0]);
      this.field16351 = (float)(var1.field16186 * var5[1]);
      this.field16352 = (float)(var1.field16187 * var5[2]);
      this.field16354 = (float)(var1.field16188 * var5[0]);
      this.field16355 = (float)(var1.field16189 * var5[1]);
      this.field16356 = (float)(var1.field16190 * var5[2]);
      this.field16358 = (float)(var1.field16191 * var5[0]);
      this.field16359 = (float)(var1.field16192 * var5[1]);
      this.field16360 = (float)(var1.field16193 * var5[2]);
   }

   public final void method10034(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      this.field16350 = (float)((double)var1.field16222 * var5[0]);
      this.field16351 = (float)((double)var1.field16223 * var5[1]);
      this.field16352 = (float)((double)var1.field16224 * var5[2]);
      this.field16354 = (float)((double)var1.field16225 * var5[0]);
      this.field16355 = (float)((double)var1.field16226 * var5[1]);
      this.field16356 = (float)((double)var1.field16227 * var5[2]);
      this.field16358 = (float)((double)var1.field16228 * var5[0]);
      this.field16359 = (float)((double)var1.field16229 * var5[1]);
      this.field16360 = (float)((double)var1.field16230 * var5[2]);
   }

   public final void method10035(Class2415 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      this.field16350 = (float)((double)(1.0F - 2.0F * var1.field16390 * var1.field16390 - 2.0F * var1.field16391 * var1.field16391) * var5[0]);
      this.field16354 = (float)((double)(2.0F * (var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391)) * var5[0]);
      this.field16358 = (float)((double)(2.0F * (var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390)) * var5[0]);
      this.field16351 = (float)((double)(2.0F * (var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391)) * var5[1]);
      this.field16355 = (float)((double)(1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16391 * var1.field16391) * var5[1]);
      this.field16359 = (float)((double)(2.0F * (var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389)) * var5[1]);
      this.field16352 = (float)((double)(2.0F * (var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390)) * var5[2]);
      this.field16356 = (float)((double)(2.0F * (var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389)) * var5[2]);
      this.field16360 = (float)((double)(1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16390 * var1.field16390) * var5[2]);
   }

   public final void method10036(Class2389 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      this.field16350 = (float)((1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276) * var5[0]);
      this.field16354 = (float)(2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276) * var5[0]);
      this.field16358 = (float)(2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275) * var5[0]);
      this.field16351 = (float)(2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276) * var5[1]);
      this.field16355 = (float)((1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276) * var5[1]);
      this.field16359 = (float)(2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274) * var5[1]);
      this.field16352 = (float)(2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275) * var5[2]);
      this.field16356 = (float)(2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274) * var5[2]);
      this.field16360 = (float)((1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275) * var5[2]);
   }

   public final void method10037(Class2396 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10041(var5, var4);
      double var6 = Math.sqrt((double)(var1.field16320 * var1.field16320 + var1.field16321 * var1.field16321 + var1.field16322 * var1.field16322));
      if (!(var6 < 1.0E-8)) {
         var6 = 1.0 / var6;
         double var8 = (double)var1.field16320 * var6;
         double var10 = (double)var1.field16321 * var6;
         double var12 = (double)var1.field16322 * var6;
         double var14 = Math.sin((double)var1.field16323);
         double var16 = Math.cos((double)var1.field16323);
         double var18 = 1.0 - var16;
         double var20 = (double)(var1.field16320 * var1.field16322);
         double var22 = (double)(var1.field16320 * var1.field16321);
         double var24 = (double)(var1.field16321 * var1.field16322);
         this.field16350 = (float)((var18 * var8 * var8 + var16) * var5[0]);
         this.field16351 = (float)((var18 * var22 - var14 * var12) * var5[1]);
         this.field16352 = (float)((var18 * var20 + var14 * var10) * var5[2]);
         this.field16354 = (float)((var18 * var22 + var14 * var12) * var5[0]);
         this.field16355 = (float)((var18 * var10 * var10 + var16) * var5[1]);
         this.field16356 = (float)((var18 * var24 - var14 * var8) * var5[2]);
         this.field16358 = (float)((var18 * var20 - var14 * var10) * var5[0]);
         this.field16359 = (float)((var18 * var24 + var14 * var8) * var5[1]);
         this.field16360 = (float)((var18 * var12 * var12 + var16) * var5[2]);
      } else {
         this.field16350 = 1.0F;
         this.field16351 = 0.0F;
         this.field16352 = 0.0F;
         this.field16354 = 0.0F;
         this.field16355 = 1.0F;
         this.field16356 = 0.0F;
         this.field16358 = 0.0F;
         this.field16359 = 0.0F;
         this.field16360 = 1.0F;
      }
   }

   public final void method10038() {
      this.field16350 = 0.0F;
      this.field16351 = 0.0F;
      this.field16352 = 0.0F;
      this.field16353 = 0.0F;
      this.field16354 = 0.0F;
      this.field16355 = 0.0F;
      this.field16356 = 0.0F;
      this.field16357 = 0.0F;
      this.field16358 = 0.0F;
      this.field16359 = 0.0F;
      this.field16360 = 0.0F;
      this.field16361 = 0.0F;
      this.field16362 = 0.0F;
      this.field16363 = 0.0F;
      this.field16364 = 0.0F;
      this.field16365 = 0.0F;
   }

   public final void method10039() {
      this.field16350 = -this.field16350;
      this.field16351 = -this.field16351;
      this.field16352 = -this.field16352;
      this.field16353 = -this.field16353;
      this.field16354 = -this.field16354;
      this.field16355 = -this.field16355;
      this.field16356 = -this.field16356;
      this.field16357 = -this.field16357;
      this.field16358 = -this.field16358;
      this.field16359 = -this.field16359;
      this.field16360 = -this.field16360;
      this.field16361 = -this.field16361;
      this.field16362 = -this.field16362;
      this.field16363 = -this.field16363;
      this.field16364 = -this.field16364;
      this.field16365 = -this.field16365;
   }

   public final void method10040(Class2404 var1) {
      this.field16350 = -var1.field16350;
      this.field16351 = -var1.field16351;
      this.field16352 = -var1.field16352;
      this.field16353 = -var1.field16353;
      this.field16354 = -var1.field16354;
      this.field16355 = -var1.field16355;
      this.field16356 = -var1.field16356;
      this.field16357 = -var1.field16357;
      this.field16358 = -var1.field16358;
      this.field16359 = -var1.field16359;
      this.field16360 = -var1.field16360;
      this.field16361 = -var1.field16361;
      this.field16362 = -var1.field16362;
      this.field16363 = -var1.field16363;
      this.field16364 = -var1.field16364;
      this.field16365 = -var1.field16365;
   }

   private final void method10041(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         (double)this.field16350,
         (double)this.field16351,
         (double)this.field16352,
         (double)this.field16354,
         (double)this.field16355,
         (double)this.field16356,
         (double)this.field16358,
         (double)this.field16359,
         (double)this.field16360
      };
      Class2363.method9417(var5, var1, var2);
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (Class2404)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final float method10042() {
      return this.field16350;
   }

   public final void method10043(float var1) {
      this.field16350 = var1;
   }

   public final float method10044() {
      return this.field16351;
   }

   public final void method10045(float var1) {
      this.field16351 = var1;
   }

   public final float method10046() {
      return this.field16352;
   }

   public final void method10047(float var1) {
      this.field16352 = var1;
   }

   public final float method10048() {
      return this.field16354;
   }

   public final void method10049(float var1) {
      this.field16354 = var1;
   }

   public final float method10050() {
      return this.field16355;
   }

   public final void method10051(float var1) {
      this.field16355 = var1;
   }

   public final float method10052() {
      return this.field16356;
   }

   public final void method10053(float var1) {
      this.field16356 = var1;
   }

   public final float method10054() {
      return this.field16358;
   }

   public final void method10055(float var1) {
      this.field16358 = var1;
   }

   public final float method10056() {
      return this.field16359;
   }

   public final void method10057(float var1) {
      this.field16359 = var1;
   }

   public final float method10058() {
      return this.field16360;
   }

   public final void method10059(float var1) {
      this.field16360 = var1;
   }

   public final float method10060() {
      return this.field16353;
   }

   public final void method10061(float var1) {
      this.field16353 = var1;
   }

   public final float method10062() {
      return this.field16357;
   }

   public final void method10063(float var1) {
      this.field16357 = var1;
   }

   public final float method10064() {
      return this.field16361;
   }

   public final void method10065(float var1) {
      this.field16361 = var1;
   }

   public final float method10066() {
      return this.field16362;
   }

   public final void method10067(float var1) {
      this.field16362 = var1;
   }

   public final float method10068() {
      return this.field16363;
   }

   public final void method10069(float var1) {
      this.field16363 = var1;
   }

   public final float method10070() {
      return this.field16364;
   }

   public final void method10071(float var1) {
      this.field16364 = var1;
   }

   public final float method10072() {
      return this.field16365;
   }

   public final void method10073(float var1) {
      this.field16365 = var1;
   }
}
