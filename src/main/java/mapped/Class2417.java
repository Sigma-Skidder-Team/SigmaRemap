package mapped;

import java.io.Serializable;

public class Class2417 implements Serializable, Cloneable {
   public static final long field16401 = 8223903484171633710L;
   public double field16402;
   public double field16403;
   public double field16404;
   public double field16405;
   public double field16406;
   public double field16407;
   public double field16408;
   public double field16409;
   public double field16410;
   public double field16411;
   public double field16412;
   public double field16413;
   public double field16414;
   public double field16415;
   public double field16416;
   public double field16417;
   private static final double field16418 = 1.0E-10;

   public Class2417(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      double var29,
      double var31
   ) {
      this.field16402 = var1;
      this.field16403 = var3;
      this.field16404 = var5;
      this.field16405 = var7;
      this.field16406 = var9;
      this.field16407 = var11;
      this.field16408 = var13;
      this.field16409 = var15;
      this.field16410 = var17;
      this.field16411 = var19;
      this.field16412 = var21;
      this.field16413 = var23;
      this.field16414 = var25;
      this.field16415 = var27;
      this.field16416 = var29;
      this.field16417 = var31;
   }

   public Class2417(double[] var1) {
      this.field16402 = var1[0];
      this.field16403 = var1[1];
      this.field16404 = var1[2];
      this.field16405 = var1[3];
      this.field16406 = var1[4];
      this.field16407 = var1[5];
      this.field16408 = var1[6];
      this.field16409 = var1[7];
      this.field16410 = var1[8];
      this.field16411 = var1[9];
      this.field16412 = var1[10];
      this.field16413 = var1[11];
      this.field16414 = var1[12];
      this.field16415 = var1[13];
      this.field16416 = var1[14];
      this.field16417 = var1[15];
   }

   public Class2417(Class2389 var1, Class2368 var2, double var3) {
      this.field16402 = var3 * (1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276);
      this.field16406 = var3 * 2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276);
      this.field16410 = var3 * 2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275);
      this.field16403 = var3 * 2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276);
      this.field16407 = var3 * (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276);
      this.field16411 = var3 * 2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274);
      this.field16404 = var3 * 2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275);
      this.field16408 = var3 * 2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274);
      this.field16412 = var3 * (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275);
      this.field16405 = var2.field16210;
      this.field16409 = var2.field16211;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public Class2417(Class2415 var1, Class2368 var2, double var3) {
      this.field16402 = var3 * (1.0 - 2.0 * (double)var1.field16390 * (double)var1.field16390 - 2.0 * (double)var1.field16391 * (double)var1.field16391);
      this.field16406 = var3 * 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16410 = var3 * 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16403 = var3 * 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16407 = var3 * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16391 * (double)var1.field16391);
      this.field16411 = var3 * 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16404 = var3 * 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16408 = var3 * 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16412 = var3 * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16390 * (double)var1.field16390);
      this.field16405 = var2.field16210;
      this.field16409 = var2.field16211;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public Class2417(Class2417 var1) {
      this.field16402 = var1.field16402;
      this.field16403 = var1.field16403;
      this.field16404 = var1.field16404;
      this.field16405 = var1.field16405;
      this.field16406 = var1.field16406;
      this.field16407 = var1.field16407;
      this.field16408 = var1.field16408;
      this.field16409 = var1.field16409;
      this.field16410 = var1.field16410;
      this.field16411 = var1.field16411;
      this.field16412 = var1.field16412;
      this.field16413 = var1.field16413;
      this.field16414 = var1.field16414;
      this.field16415 = var1.field16415;
      this.field16416 = var1.field16416;
      this.field16417 = var1.field16417;
   }

   public Class2417(Class2404 var1) {
      this.field16402 = (double)var1.field16350;
      this.field16403 = (double)var1.field16351;
      this.field16404 = (double)var1.field16352;
      this.field16405 = (double)var1.field16353;
      this.field16406 = (double)var1.field16354;
      this.field16407 = (double)var1.field16355;
      this.field16408 = (double)var1.field16356;
      this.field16409 = (double)var1.field16357;
      this.field16410 = (double)var1.field16358;
      this.field16411 = (double)var1.field16359;
      this.field16412 = (double)var1.field16360;
      this.field16413 = (double)var1.field16361;
      this.field16414 = (double)var1.field16362;
      this.field16415 = (double)var1.field16363;
      this.field16416 = (double)var1.field16364;
      this.field16417 = (double)var1.field16365;
   }

   public Class2417(Class2372 var1, Class2368 var2, double var3) {
      this.field16402 = (double)var1.field16222 * var3;
      this.field16403 = (double)var1.field16223 * var3;
      this.field16404 = (double)var1.field16224 * var3;
      this.field16405 = var2.field16210;
      this.field16406 = (double)var1.field16225 * var3;
      this.field16407 = (double)var1.field16226 * var3;
      this.field16408 = (double)var1.field16227 * var3;
      this.field16409 = var2.field16211;
      this.field16410 = (double)var1.field16228 * var3;
      this.field16411 = (double)var1.field16229 * var3;
      this.field16412 = (double)var1.field16230 * var3;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public Class2417(Class2363 var1, Class2368 var2, double var3) {
      this.field16402 = var1.field16185 * var3;
      this.field16403 = var1.field16186 * var3;
      this.field16404 = var1.field16187 * var3;
      this.field16405 = var2.field16210;
      this.field16406 = var1.field16188 * var3;
      this.field16407 = var1.field16189 * var3;
      this.field16408 = var1.field16190 * var3;
      this.field16409 = var2.field16211;
      this.field16410 = var1.field16191 * var3;
      this.field16411 = var1.field16192 * var3;
      this.field16412 = var1.field16193 * var3;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public Class2417() {
      this.field16402 = 0.0;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = 0.0;
      this.field16406 = 0.0;
      this.field16407 = 0.0;
      this.field16408 = 0.0;
      this.field16409 = 0.0;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = 0.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 0.0;
   }

   @Override
   public String toString() {
      return this.field16402
         + ", "
         + this.field16403
         + ", "
         + this.field16404
         + ", "
         + this.field16405
         + "\n"
         + this.field16406
         + ", "
         + this.field16407
         + ", "
         + this.field16408
         + ", "
         + this.field16409
         + "\n"
         + this.field16410
         + ", "
         + this.field16411
         + ", "
         + this.field16412
         + ", "
         + this.field16413
         + "\n"
         + this.field16414
         + ", "
         + this.field16415
         + ", "
         + this.field16416
         + ", "
         + this.field16417
         + "\n";
   }

   public final void method10240() {
      this.field16402 = 1.0;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = 0.0;
      this.field16406 = 0.0;
      this.field16407 = 1.0;
      this.field16408 = 0.0;
      this.field16409 = 0.0;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = 1.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10241(int var1, int var2, double var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field16402 = var3;
                  return;
               case 1:
                  this.field16403 = var3;
                  return;
               case 2:
                  this.field16404 = var3;
                  return;
               case 3:
                  this.field16405 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field16406 = var3;
                  return;
               case 1:
                  this.field16407 = var3;
                  return;
               case 2:
                  this.field16408 = var3;
                  return;
               case 3:
                  this.field16409 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field16410 = var3;
                  return;
               case 1:
                  this.field16411 = var3;
                  return;
               case 2:
                  this.field16412 = var3;
                  return;
               case 3:
                  this.field16413 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d0"));
            }
         case 3:
            switch (var2) {
               case 0:
                  this.field16414 = var3;
                  return;
               case 1:
                  this.field16415 = var3;
                  return;
               case 2:
                  this.field16416 = var3;
                  return;
               case 3:
                  this.field16417 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d0"));
      }
   }

   public final double method10242(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field16402;
               case 1:
                  return this.field16403;
               case 2:
                  return this.field16404;
               case 3:
                  return this.field16405;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d1"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field16406;
               case 1:
                  return this.field16407;
               case 2:
                  return this.field16408;
               case 3:
                  return this.field16409;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d1"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field16410;
               case 1:
                  return this.field16411;
               case 2:
                  return this.field16412;
               case 3:
                  return this.field16413;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d1"));
            }
         case 3:
            switch (var2) {
               case 0:
                  return this.field16414;
               case 1:
                  return this.field16415;
               case 2:
                  return this.field16416;
               case 3:
                  return this.field16417;
            }
      }

      throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d1"));
   }

   public final void method10243(int var1, Class2390 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d2"));
               }

               var2.field16274 = this.field16414;
               var2.field16275 = this.field16415;
               var2.field16276 = this.field16416;
               var2.field16277 = this.field16417;
            } else {
               var2.field16274 = this.field16410;
               var2.field16275 = this.field16411;
               var2.field16276 = this.field16412;
               var2.field16277 = this.field16413;
            }
         } else {
            var2.field16274 = this.field16406;
            var2.field16275 = this.field16407;
            var2.field16276 = this.field16408;
            var2.field16277 = this.field16409;
         }
      } else {
         var2.field16274 = this.field16402;
         var2.field16275 = this.field16403;
         var2.field16276 = this.field16404;
         var2.field16277 = this.field16405;
      }
   }

   public final void method10244(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d2"));
               }

               var2[0] = this.field16414;
               var2[1] = this.field16415;
               var2[2] = this.field16416;
               var2[3] = this.field16417;
            } else {
               var2[0] = this.field16410;
               var2[1] = this.field16411;
               var2[2] = this.field16412;
               var2[3] = this.field16413;
            }
         } else {
            var2[0] = this.field16406;
            var2[1] = this.field16407;
            var2[2] = this.field16408;
            var2[3] = this.field16409;
         }
      } else {
         var2[0] = this.field16402;
         var2[1] = this.field16403;
         var2[2] = this.field16404;
         var2[3] = this.field16405;
      }
   }

   public final void method10245(int var1, Class2390 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d3"));
               }

               var2.field16274 = this.field16405;
               var2.field16275 = this.field16409;
               var2.field16276 = this.field16413;
               var2.field16277 = this.field16417;
            } else {
               var2.field16274 = this.field16404;
               var2.field16275 = this.field16408;
               var2.field16276 = this.field16412;
               var2.field16277 = this.field16416;
            }
         } else {
            var2.field16274 = this.field16403;
            var2.field16275 = this.field16407;
            var2.field16276 = this.field16411;
            var2.field16277 = this.field16415;
         }
      } else {
         var2.field16274 = this.field16402;
         var2.field16275 = this.field16406;
         var2.field16276 = this.field16410;
         var2.field16277 = this.field16414;
      }
   }

   public final void method10246(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d3"));
               }

               var2[0] = this.field16405;
               var2[1] = this.field16409;
               var2[2] = this.field16413;
               var2[3] = this.field16417;
            } else {
               var2[0] = this.field16404;
               var2[1] = this.field16408;
               var2[2] = this.field16412;
               var2[3] = this.field16416;
            }
         } else {
            var2[0] = this.field16403;
            var2[1] = this.field16407;
            var2[2] = this.field16411;
            var2[3] = this.field16415;
         }
      } else {
         var2[0] = this.field16402;
         var2[1] = this.field16406;
         var2[2] = this.field16410;
         var2[3] = this.field16414;
      }
   }

   public final void method10247(Class2363 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
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

   public final void method10248(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
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

   public final double method10249(Class2363 var1, Class2368 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method10331(var6, var5);
      var1.field16185 = var5[0];
      var1.field16186 = var5[1];
      var1.field16187 = var5[2];
      var1.field16188 = var5[3];
      var1.field16189 = var5[4];
      var1.field16190 = var5[5];
      var1.field16191 = var5[6];
      var1.field16192 = var5[7];
      var1.field16193 = var5[8];
      var2.field16210 = this.field16405;
      var2.field16211 = this.field16409;
      var2.field16212 = this.field16413;
      return Class2363.method9430(var6);
   }

   public final double method10250(Class2372 var1, Class2368 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method10331(var6, var5);
      var1.field16222 = (float)var5[0];
      var1.field16223 = (float)var5[1];
      var1.field16224 = (float)var5[2];
      var1.field16225 = (float)var5[3];
      var1.field16226 = (float)var5[4];
      var1.field16227 = (float)var5[5];
      var1.field16228 = (float)var5[6];
      var1.field16229 = (float)var5[7];
      var1.field16230 = (float)var5[8];
      var2.field16210 = this.field16405;
      var2.field16211 = this.field16409;
      var2.field16212 = this.field16413;
      return Class2363.method9430(var6);
   }

   public final void method10251(Class2415 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
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

   public final void method10252(Class2389 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
      double var6 = 0.25 * (1.0 + var4[0] + var4[4] + var4[8]);
      if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
         var1.field16277 = 0.0;
         var6 = -0.5 * (var4[4] + var4[8]);
         if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
            var1.field16274 = 0.0;
            var6 = 0.5 * (1.0 - var4[8]);
            if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
               var1.field16275 = 0.0;
               var1.field16276 = 1.0;
            } else {
               var1.field16275 = Math.sqrt(var6);
               var1.field16276 = var4[7] / (2.0 * var1.field16275);
            }
         } else {
            var1.field16274 = Math.sqrt(var6);
            var6 = 0.5 / var1.field16274;
            var1.field16275 = var4[3] * var6;
            var1.field16276 = var4[6] * var6;
         }
      } else {
         var1.field16277 = Math.sqrt(var6);
         var6 = 0.25 / var1.field16277;
         var1.field16274 = (var4[7] - var4[5]) * var6;
         var1.field16275 = (var4[2] - var4[6]) * var6;
         var1.field16276 = (var4[3] - var4[1]) * var6;
      }
   }

   public final void method10253(Class2368 var1) {
      var1.field16210 = this.field16405;
      var1.field16211 = this.field16409;
      var1.field16212 = this.field16413;
   }

   public final void method10254(Class2372 var1) {
      var1.field16222 = (float)this.field16402;
      var1.field16223 = (float)this.field16403;
      var1.field16224 = (float)this.field16404;
      var1.field16225 = (float)this.field16406;
      var1.field16226 = (float)this.field16407;
      var1.field16227 = (float)this.field16408;
      var1.field16228 = (float)this.field16410;
      var1.field16229 = (float)this.field16411;
      var1.field16230 = (float)this.field16412;
   }

   public final void method10255(Class2363 var1) {
      var1.field16185 = this.field16402;
      var1.field16186 = this.field16403;
      var1.field16187 = this.field16404;
      var1.field16188 = this.field16406;
      var1.field16189 = this.field16407;
      var1.field16190 = this.field16408;
      var1.field16191 = this.field16410;
      var1.field16192 = this.field16411;
      var1.field16193 = this.field16412;
   }

   public final double method10256() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method10331(var4, var3);
      return Class2363.method9430(var4);
   }

   public final void method10257(Class2363 var1) {
      this.field16402 = var1.field16185;
      this.field16403 = var1.field16186;
      this.field16404 = var1.field16187;
      this.field16406 = var1.field16188;
      this.field16407 = var1.field16189;
      this.field16408 = var1.field16190;
      this.field16410 = var1.field16191;
      this.field16411 = var1.field16192;
      this.field16412 = var1.field16193;
   }

   public final void method10258(Class2372 var1) {
      this.field16402 = (double)var1.field16222;
      this.field16403 = (double)var1.field16223;
      this.field16404 = (double)var1.field16224;
      this.field16406 = (double)var1.field16225;
      this.field16407 = (double)var1.field16226;
      this.field16408 = (double)var1.field16227;
      this.field16410 = (double)var1.field16228;
      this.field16411 = (double)var1.field16229;
      this.field16412 = (double)var1.field16230;
   }

   public final void method10259(double var1) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method10331(var6, var5);
      this.field16402 = var5[0] * var1;
      this.field16403 = var5[1] * var1;
      this.field16404 = var5[2] * var1;
      this.field16406 = var5[3] * var1;
      this.field16407 = var5[4] * var1;
      this.field16408 = var5[5] * var1;
      this.field16410 = var5[6] * var1;
      this.field16411 = var5[7] * var1;
      this.field16412 = var5[8] * var1;
   }

   public final void method10260(int var1, double var2, double var4, double var6, double var8) {
      switch (var1) {
         case 0:
            this.field16402 = var2;
            this.field16403 = var4;
            this.field16404 = var6;
            this.field16405 = var8;
            break;
         case 1:
            this.field16406 = var2;
            this.field16407 = var4;
            this.field16408 = var6;
            this.field16409 = var8;
            break;
         case 2:
            this.field16410 = var2;
            this.field16411 = var4;
            this.field16412 = var6;
            this.field16413 = var8;
            break;
         case 3:
            this.field16414 = var2;
            this.field16415 = var4;
            this.field16416 = var6;
            this.field16417 = var8;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d4"));
      }
   }

   public final void method10261(int var1, Class2390 var2) {
      switch (var1) {
         case 0:
            this.field16402 = var2.field16274;
            this.field16403 = var2.field16275;
            this.field16404 = var2.field16276;
            this.field16405 = var2.field16277;
            break;
         case 1:
            this.field16406 = var2.field16274;
            this.field16407 = var2.field16275;
            this.field16408 = var2.field16276;
            this.field16409 = var2.field16277;
            break;
         case 2:
            this.field16410 = var2.field16274;
            this.field16411 = var2.field16275;
            this.field16412 = var2.field16276;
            this.field16413 = var2.field16277;
            break;
         case 3:
            this.field16414 = var2.field16274;
            this.field16415 = var2.field16275;
            this.field16416 = var2.field16276;
            this.field16417 = var2.field16277;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d4"));
      }
   }

   public final void method10262(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field16402 = var2[0];
            this.field16403 = var2[1];
            this.field16404 = var2[2];
            this.field16405 = var2[3];
            break;
         case 1:
            this.field16406 = var2[0];
            this.field16407 = var2[1];
            this.field16408 = var2[2];
            this.field16409 = var2[3];
            break;
         case 2:
            this.field16410 = var2[0];
            this.field16411 = var2[1];
            this.field16412 = var2[2];
            this.field16413 = var2[3];
            break;
         case 3:
            this.field16414 = var2[0];
            this.field16415 = var2[1];
            this.field16416 = var2[2];
            this.field16417 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d4"));
      }
   }

   public final void method10263(int var1, double var2, double var4, double var6, double var8) {
      switch (var1) {
         case 0:
            this.field16402 = var2;
            this.field16406 = var4;
            this.field16410 = var6;
            this.field16414 = var8;
            break;
         case 1:
            this.field16403 = var2;
            this.field16407 = var4;
            this.field16411 = var6;
            this.field16415 = var8;
            break;
         case 2:
            this.field16404 = var2;
            this.field16408 = var4;
            this.field16412 = var6;
            this.field16416 = var8;
            break;
         case 3:
            this.field16405 = var2;
            this.field16409 = var4;
            this.field16413 = var6;
            this.field16417 = var8;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d7"));
      }
   }

   public final void method10264(int var1, Class2390 var2) {
      switch (var1) {
         case 0:
            this.field16402 = var2.field16274;
            this.field16406 = var2.field16275;
            this.field16410 = var2.field16276;
            this.field16414 = var2.field16277;
            break;
         case 1:
            this.field16403 = var2.field16274;
            this.field16407 = var2.field16275;
            this.field16411 = var2.field16276;
            this.field16415 = var2.field16277;
            break;
         case 2:
            this.field16404 = var2.field16274;
            this.field16408 = var2.field16275;
            this.field16412 = var2.field16276;
            this.field16416 = var2.field16277;
            break;
         case 3:
            this.field16405 = var2.field16274;
            this.field16409 = var2.field16275;
            this.field16413 = var2.field16276;
            this.field16417 = var2.field16277;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d7"));
      }
   }

   public final void method10265(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field16402 = var2[0];
            this.field16406 = var2[1];
            this.field16410 = var2[2];
            this.field16414 = var2[3];
            break;
         case 1:
            this.field16403 = var2[0];
            this.field16407 = var2[1];
            this.field16411 = var2[2];
            this.field16415 = var2[3];
            break;
         case 2:
            this.field16404 = var2[0];
            this.field16408 = var2[1];
            this.field16412 = var2[2];
            this.field16416 = var2[3];
            break;
         case 3:
            this.field16405 = var2[0];
            this.field16409 = var2[1];
            this.field16413 = var2[2];
            this.field16417 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix4d7"));
      }
   }

   public final void method10266(double var1) {
      this.field16402 += var1;
      this.field16403 += var1;
      this.field16404 += var1;
      this.field16405 += var1;
      this.field16406 += var1;
      this.field16407 += var1;
      this.field16408 += var1;
      this.field16409 += var1;
      this.field16410 += var1;
      this.field16411 += var1;
      this.field16412 += var1;
      this.field16413 += var1;
      this.field16414 += var1;
      this.field16415 += var1;
      this.field16416 += var1;
      this.field16417 += var1;
   }

   public final void method10267(double var1, Class2417 var3) {
      this.field16402 = var3.field16402 + var1;
      this.field16403 = var3.field16403 + var1;
      this.field16404 = var3.field16404 + var1;
      this.field16405 = var3.field16405 + var1;
      this.field16406 = var3.field16406 + var1;
      this.field16407 = var3.field16407 + var1;
      this.field16408 = var3.field16408 + var1;
      this.field16409 = var3.field16409 + var1;
      this.field16410 = var3.field16410 + var1;
      this.field16411 = var3.field16411 + var1;
      this.field16412 = var3.field16412 + var1;
      this.field16413 = var3.field16413 + var1;
      this.field16414 = var3.field16414 + var1;
      this.field16415 = var3.field16415 + var1;
      this.field16416 = var3.field16416 + var1;
      this.field16417 = var3.field16417 + var1;
   }

   public final void method10268(Class2417 var1, Class2417 var2) {
      this.field16402 = var1.field16402 + var2.field16402;
      this.field16403 = var1.field16403 + var2.field16403;
      this.field16404 = var1.field16404 + var2.field16404;
      this.field16405 = var1.field16405 + var2.field16405;
      this.field16406 = var1.field16406 + var2.field16406;
      this.field16407 = var1.field16407 + var2.field16407;
      this.field16408 = var1.field16408 + var2.field16408;
      this.field16409 = var1.field16409 + var2.field16409;
      this.field16410 = var1.field16410 + var2.field16410;
      this.field16411 = var1.field16411 + var2.field16411;
      this.field16412 = var1.field16412 + var2.field16412;
      this.field16413 = var1.field16413 + var2.field16413;
      this.field16414 = var1.field16414 + var2.field16414;
      this.field16415 = var1.field16415 + var2.field16415;
      this.field16416 = var1.field16416 + var2.field16416;
      this.field16417 = var1.field16417 + var2.field16417;
   }

   public final void method10269(Class2417 var1) {
      this.field16402 = this.field16402 + var1.field16402;
      this.field16403 = this.field16403 + var1.field16403;
      this.field16404 = this.field16404 + var1.field16404;
      this.field16405 = this.field16405 + var1.field16405;
      this.field16406 = this.field16406 + var1.field16406;
      this.field16407 = this.field16407 + var1.field16407;
      this.field16408 = this.field16408 + var1.field16408;
      this.field16409 = this.field16409 + var1.field16409;
      this.field16410 = this.field16410 + var1.field16410;
      this.field16411 = this.field16411 + var1.field16411;
      this.field16412 = this.field16412 + var1.field16412;
      this.field16413 = this.field16413 + var1.field16413;
      this.field16414 = this.field16414 + var1.field16414;
      this.field16415 = this.field16415 + var1.field16415;
      this.field16416 = this.field16416 + var1.field16416;
      this.field16417 = this.field16417 + var1.field16417;
   }

   public final void method10270(Class2417 var1, Class2417 var2) {
      this.field16402 = var1.field16402 - var2.field16402;
      this.field16403 = var1.field16403 - var2.field16403;
      this.field16404 = var1.field16404 - var2.field16404;
      this.field16405 = var1.field16405 - var2.field16405;
      this.field16406 = var1.field16406 - var2.field16406;
      this.field16407 = var1.field16407 - var2.field16407;
      this.field16408 = var1.field16408 - var2.field16408;
      this.field16409 = var1.field16409 - var2.field16409;
      this.field16410 = var1.field16410 - var2.field16410;
      this.field16411 = var1.field16411 - var2.field16411;
      this.field16412 = var1.field16412 - var2.field16412;
      this.field16413 = var1.field16413 - var2.field16413;
      this.field16414 = var1.field16414 - var2.field16414;
      this.field16415 = var1.field16415 - var2.field16415;
      this.field16416 = var1.field16416 - var2.field16416;
      this.field16417 = var1.field16417 - var2.field16417;
   }

   public final void method10271(Class2417 var1) {
      this.field16402 = this.field16402 - var1.field16402;
      this.field16403 = this.field16403 - var1.field16403;
      this.field16404 = this.field16404 - var1.field16404;
      this.field16405 = this.field16405 - var1.field16405;
      this.field16406 = this.field16406 - var1.field16406;
      this.field16407 = this.field16407 - var1.field16407;
      this.field16408 = this.field16408 - var1.field16408;
      this.field16409 = this.field16409 - var1.field16409;
      this.field16410 = this.field16410 - var1.field16410;
      this.field16411 = this.field16411 - var1.field16411;
      this.field16412 = this.field16412 - var1.field16412;
      this.field16413 = this.field16413 - var1.field16413;
      this.field16414 = this.field16414 - var1.field16414;
      this.field16415 = this.field16415 - var1.field16415;
      this.field16416 = this.field16416 - var1.field16416;
      this.field16417 = this.field16417 - var1.field16417;
   }

   public final void method10272() {
      double var3 = this.field16406;
      this.field16406 = this.field16403;
      this.field16403 = var3;
      var3 = this.field16410;
      this.field16410 = this.field16404;
      this.field16404 = var3;
      var3 = this.field16414;
      this.field16414 = this.field16405;
      this.field16405 = var3;
      var3 = this.field16411;
      this.field16411 = this.field16408;
      this.field16408 = var3;
      var3 = this.field16415;
      this.field16415 = this.field16409;
      this.field16409 = var3;
      var3 = this.field16416;
      this.field16416 = this.field16413;
      this.field16413 = var3;
   }

   public final void method10273(Class2417 var1) {
      if (this == var1) {
         this.method10272();
      } else {
         this.field16402 = var1.field16402;
         this.field16403 = var1.field16406;
         this.field16404 = var1.field16410;
         this.field16405 = var1.field16414;
         this.field16406 = var1.field16403;
         this.field16407 = var1.field16407;
         this.field16408 = var1.field16411;
         this.field16409 = var1.field16415;
         this.field16410 = var1.field16404;
         this.field16411 = var1.field16408;
         this.field16412 = var1.field16412;
         this.field16413 = var1.field16416;
         this.field16414 = var1.field16405;
         this.field16415 = var1.field16409;
         this.field16416 = var1.field16413;
         this.field16417 = var1.field16417;
      }
   }

   public final void method10274(double[] var1) {
      this.field16402 = var1[0];
      this.field16403 = var1[1];
      this.field16404 = var1[2];
      this.field16405 = var1[3];
      this.field16406 = var1[4];
      this.field16407 = var1[5];
      this.field16408 = var1[6];
      this.field16409 = var1[7];
      this.field16410 = var1[8];
      this.field16411 = var1[9];
      this.field16412 = var1[10];
      this.field16413 = var1[11];
      this.field16414 = var1[12];
      this.field16415 = var1[13];
      this.field16416 = var1[14];
      this.field16417 = var1[15];
   }

   public final void method10275(Class2372 var1) {
      this.field16402 = (double)var1.field16222;
      this.field16403 = (double)var1.field16223;
      this.field16404 = (double)var1.field16224;
      this.field16405 = 0.0;
      this.field16406 = (double)var1.field16225;
      this.field16407 = (double)var1.field16226;
      this.field16408 = (double)var1.field16227;
      this.field16409 = 0.0;
      this.field16410 = (double)var1.field16228;
      this.field16411 = (double)var1.field16229;
      this.field16412 = (double)var1.field16230;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10276(Class2363 var1) {
      this.field16402 = var1.field16185;
      this.field16403 = var1.field16186;
      this.field16404 = var1.field16187;
      this.field16405 = 0.0;
      this.field16406 = var1.field16188;
      this.field16407 = var1.field16189;
      this.field16408 = var1.field16190;
      this.field16409 = 0.0;
      this.field16410 = var1.field16191;
      this.field16411 = var1.field16192;
      this.field16412 = var1.field16193;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10277(Class2389 var1) {
      this.field16402 = 1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276;
      this.field16406 = 2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276);
      this.field16410 = 2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275);
      this.field16403 = 2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276);
      this.field16407 = 1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276;
      this.field16411 = 2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274);
      this.field16404 = 2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275);
      this.field16408 = 2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274);
      this.field16412 = 1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275;
      this.field16405 = 0.0;
      this.field16409 = 0.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10278(Class2410 var1) {
      double var4 = Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385);
      if (!(var4 < 1.0E-10)) {
         var4 = 1.0 / var4;
         double var6 = var1.field16383 * var4;
         double var8 = var1.field16384 * var4;
         double var10 = var1.field16385 * var4;
         double var12 = Math.sin(var1.field16386);
         double var14 = Math.cos(var1.field16386);
         double var16 = 1.0 - var14;
         double var18 = var6 * var10;
         double var20 = var6 * var8;
         double var22 = var8 * var10;
         this.field16402 = var16 * var6 * var6 + var14;
         this.field16403 = var16 * var20 - var12 * var10;
         this.field16404 = var16 * var18 + var12 * var8;
         this.field16406 = var16 * var20 + var12 * var10;
         this.field16407 = var16 * var8 * var8 + var14;
         this.field16408 = var16 * var22 - var12 * var6;
         this.field16410 = var16 * var18 - var12 * var8;
         this.field16411 = var16 * var22 + var12 * var6;
         this.field16412 = var16 * var10 * var10 + var14;
      } else {
         this.field16402 = 1.0;
         this.field16403 = 0.0;
         this.field16404 = 0.0;
         this.field16406 = 0.0;
         this.field16407 = 1.0;
         this.field16408 = 0.0;
         this.field16410 = 0.0;
         this.field16411 = 0.0;
         this.field16412 = 1.0;
      }

      this.field16405 = 0.0;
      this.field16409 = 0.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10279(Class2415 var1) {
      this.field16402 = 1.0 - 2.0 * (double)var1.field16390 * (double)var1.field16390 - 2.0 * (double)var1.field16391 * (double)var1.field16391;
      this.field16406 = 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16410 = 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16403 = 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16407 = 1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16391 * (double)var1.field16391;
      this.field16411 = 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16404 = 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16408 = 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16412 = 1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16390 * (double)var1.field16390;
      this.field16405 = 0.0;
      this.field16409 = 0.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10280(Class2396 var1) {
      double var4 = Math.sqrt((double)(var1.field16320 * var1.field16320 + var1.field16321 * var1.field16321 + var1.field16322 * var1.field16322));
      if (!(var4 < 1.0E-10)) {
         var4 = 1.0 / var4;
         double var6 = (double)var1.field16320 * var4;
         double var8 = (double)var1.field16321 * var4;
         double var10 = (double)var1.field16322 * var4;
         double var12 = Math.sin((double)var1.field16323);
         double var14 = Math.cos((double)var1.field16323);
         double var16 = 1.0 - var14;
         double var18 = var6 * var10;
         double var20 = var6 * var8;
         double var22 = var8 * var10;
         this.field16402 = var16 * var6 * var6 + var14;
         this.field16403 = var16 * var20 - var12 * var10;
         this.field16404 = var16 * var18 + var12 * var8;
         this.field16406 = var16 * var20 + var12 * var10;
         this.field16407 = var16 * var8 * var8 + var14;
         this.field16408 = var16 * var22 - var12 * var6;
         this.field16410 = var16 * var18 - var12 * var8;
         this.field16411 = var16 * var22 + var12 * var6;
         this.field16412 = var16 * var10 * var10 + var14;
      } else {
         this.field16402 = 1.0;
         this.field16403 = 0.0;
         this.field16404 = 0.0;
         this.field16406 = 0.0;
         this.field16407 = 1.0;
         this.field16408 = 0.0;
         this.field16410 = 0.0;
         this.field16411 = 0.0;
         this.field16412 = 1.0;
      }

      this.field16405 = 0.0;
      this.field16409 = 0.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10281(Class2389 var1, Class2368 var2, double var3) {
      this.field16402 = var3 * (1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276);
      this.field16406 = var3 * 2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276);
      this.field16410 = var3 * 2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275);
      this.field16403 = var3 * 2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276);
      this.field16407 = var3 * (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276);
      this.field16411 = var3 * 2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274);
      this.field16404 = var3 * 2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275);
      this.field16408 = var3 * 2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274);
      this.field16412 = var3 * (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275);
      this.field16405 = var2.field16210;
      this.field16409 = var2.field16211;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10282(Class2415 var1, Class2368 var2, double var3) {
      this.field16402 = var3 * (1.0 - 2.0 * (double)var1.field16390 * (double)var1.field16390 - 2.0 * (double)var1.field16391 * (double)var1.field16391);
      this.field16406 = var3 * 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16410 = var3 * 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16403 = var3 * 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16407 = var3 * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16391 * (double)var1.field16391);
      this.field16411 = var3 * 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16404 = var3 * 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16408 = var3 * 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16412 = var3 * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16390 * (double)var1.field16390);
      this.field16405 = var2.field16210;
      this.field16409 = var2.field16211;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10283(Class2415 var1, Class6 var2, float var3) {
      this.field16402 = (double)var3
         * (1.0 - 2.0 * (double)var1.field16390 * (double)var1.field16390 - 2.0 * (double)var1.field16391 * (double)var1.field16391);
      this.field16406 = (double)var3 * 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16410 = (double)var3 * 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16403 = (double)var3 * 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16407 = (double)var3
         * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16391 * (double)var1.field16391);
      this.field16411 = (double)var3 * 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16404 = (double)var3 * 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16408 = (double)var3 * 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16412 = (double)var3
         * (1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16390 * (double)var1.field16390);
      this.field16405 = (double)var2.field8;
      this.field16409 = (double)var2.field9;
      this.field16413 = (double)var2.field10;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10284(Class2404 var1) {
      this.field16402 = (double)var1.field16350;
      this.field16403 = (double)var1.field16351;
      this.field16404 = (double)var1.field16352;
      this.field16405 = (double)var1.field16353;
      this.field16406 = (double)var1.field16354;
      this.field16407 = (double)var1.field16355;
      this.field16408 = (double)var1.field16356;
      this.field16409 = (double)var1.field16357;
      this.field16410 = (double)var1.field16358;
      this.field16411 = (double)var1.field16359;
      this.field16412 = (double)var1.field16360;
      this.field16413 = (double)var1.field16361;
      this.field16414 = (double)var1.field16362;
      this.field16415 = (double)var1.field16363;
      this.field16416 = (double)var1.field16364;
      this.field16417 = (double)var1.field16365;
   }

   public final void method10285(Class2417 var1) {
      this.field16402 = var1.field16402;
      this.field16403 = var1.field16403;
      this.field16404 = var1.field16404;
      this.field16405 = var1.field16405;
      this.field16406 = var1.field16406;
      this.field16407 = var1.field16407;
      this.field16408 = var1.field16408;
      this.field16409 = var1.field16409;
      this.field16410 = var1.field16410;
      this.field16411 = var1.field16411;
      this.field16412 = var1.field16412;
      this.field16413 = var1.field16413;
      this.field16414 = var1.field16414;
      this.field16415 = var1.field16415;
      this.field16416 = var1.field16416;
      this.field16417 = var1.field16417;
   }

   public final void method10286(Class2417 var1) {
      this.method10288(var1);
   }

   public final void method10287() {
      this.method10288(this);
   }

   public final void method10288(Class2417 var1) {
      double[] var4 = new double[16];
      int[] var5 = new int[4];
      double[] var6 = new double[]{
         var1.field16402,
         var1.field16403,
         var1.field16404,
         var1.field16405,
         var1.field16406,
         var1.field16407,
         var1.field16408,
         var1.field16409,
         var1.field16410,
         var1.field16411,
         var1.field16412,
         var1.field16413,
         var1.field16414,
         var1.field16415,
         var1.field16416,
         var1.field16417
      };
      if (!method10289(var6, var5)) {
         throw new Class2500(Class8148.method28252("Matrix4d10"));
      } else {
         for (int var7 = 0; var7 < 16; var7++) {
            var4[var7] = 0.0;
         }

         var4[0] = 1.0;
         var4[5] = 1.0;
         var4[10] = 1.0;
         var4[15] = 1.0;
         method10290(var6, var5, var4);
         this.field16402 = var4[0];
         this.field16403 = var4[1];
         this.field16404 = var4[2];
         this.field16405 = var4[3];
         this.field16406 = var4[4];
         this.field16407 = var4[5];
         this.field16408 = var4[6];
         this.field16409 = var4[7];
         this.field16410 = var4[8];
         this.field16411 = var4[9];
         this.field16412 = var4[10];
         this.field16413 = var4[11];
         this.field16414 = var4[12];
         this.field16415 = var4[13];
         this.field16416 = var4[14];
         this.field16417 = var4[15];
      }
   }

   public static boolean method10289(double[] var0, int[] var1) {
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
            throw new RuntimeException(Class8148.method28252("Matrix4d11"));
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

   public static void method10290(double[] var0, int[] var1, double[] var2) {
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

   public final double method10291() {
      double var3 = this.field16402
         * (
            this.field16407 * this.field16412 * this.field16417
               + this.field16408 * this.field16413 * this.field16415
               + this.field16409 * this.field16411 * this.field16416
               - this.field16409 * this.field16412 * this.field16415
               - this.field16407 * this.field16413 * this.field16416
               - this.field16408 * this.field16411 * this.field16417
         );
      var3 -= this.field16403
         * (
            this.field16406 * this.field16412 * this.field16417
               + this.field16408 * this.field16413 * this.field16414
               + this.field16409 * this.field16410 * this.field16416
               - this.field16409 * this.field16412 * this.field16414
               - this.field16406 * this.field16413 * this.field16416
               - this.field16408 * this.field16410 * this.field16417
         );
      var3 += this.field16404
         * (
            this.field16406 * this.field16411 * this.field16417
               + this.field16407 * this.field16413 * this.field16414
               + this.field16409 * this.field16410 * this.field16415
               - this.field16409 * this.field16411 * this.field16414
               - this.field16406 * this.field16413 * this.field16415
               - this.field16407 * this.field16410 * this.field16417
         );
      return var3
         - this.field16405
            * (
               this.field16406 * this.field16411 * this.field16416
                  + this.field16407 * this.field16412 * this.field16414
                  + this.field16408 * this.field16410 * this.field16415
                  - this.field16408 * this.field16411 * this.field16414
                  - this.field16406 * this.field16412 * this.field16415
                  - this.field16407 * this.field16410 * this.field16416
            );
   }

   public final void method10292(double var1) {
      this.field16402 = var1;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = 0.0;
      this.field16406 = 0.0;
      this.field16407 = var1;
      this.field16408 = 0.0;
      this.field16409 = 0.0;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = var1;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10293(Class2368 var1) {
      this.field16402 = 1.0;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = var1.field16210;
      this.field16406 = 0.0;
      this.field16407 = 1.0;
      this.field16408 = 0.0;
      this.field16409 = var1.field16211;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = 1.0;
      this.field16413 = var1.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10294(double var1, Class2368 var3) {
      this.field16402 = var1;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = var3.field16210;
      this.field16406 = 0.0;
      this.field16407 = var1;
      this.field16408 = 0.0;
      this.field16409 = var3.field16211;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = var1;
      this.field16413 = var3.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10295(Class2368 var1, double var2) {
      this.field16402 = var2;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = var2 * var1.field16210;
      this.field16406 = 0.0;
      this.field16407 = var2;
      this.field16408 = 0.0;
      this.field16409 = var2 * var1.field16211;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = var2;
      this.field16413 = var2 * var1.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10296(Class2372 var1, Class6 var2, float var3) {
      this.field16402 = (double)(var1.field16222 * var3);
      this.field16403 = (double)(var1.field16223 * var3);
      this.field16404 = (double)(var1.field16224 * var3);
      this.field16405 = (double)var2.field8;
      this.field16406 = (double)(var1.field16225 * var3);
      this.field16407 = (double)(var1.field16226 * var3);
      this.field16408 = (double)(var1.field16227 * var3);
      this.field16409 = (double)var2.field9;
      this.field16410 = (double)(var1.field16228 * var3);
      this.field16411 = (double)(var1.field16229 * var3);
      this.field16412 = (double)(var1.field16230 * var3);
      this.field16413 = (double)var2.field10;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10297(Class2363 var1, Class2368 var2, double var3) {
      this.field16402 = var1.field16185 * var3;
      this.field16403 = var1.field16186 * var3;
      this.field16404 = var1.field16187 * var3;
      this.field16405 = var2.field16210;
      this.field16406 = var1.field16188 * var3;
      this.field16407 = var1.field16189 * var3;
      this.field16408 = var1.field16190 * var3;
      this.field16409 = var2.field16211;
      this.field16410 = var1.field16191 * var3;
      this.field16411 = var1.field16192 * var3;
      this.field16412 = var1.field16193 * var3;
      this.field16413 = var2.field16212;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10298(Class2368 var1) {
      this.field16405 = var1.field16210;
      this.field16409 = var1.field16211;
      this.field16413 = var1.field16212;
   }

   public final void method10299(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field16402 = 1.0;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = 0.0;
      this.field16406 = 0.0;
      this.field16407 = var7;
      this.field16408 = -var5;
      this.field16409 = 0.0;
      this.field16410 = 0.0;
      this.field16411 = var5;
      this.field16412 = var7;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10300(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field16402 = var7;
      this.field16403 = 0.0;
      this.field16404 = var5;
      this.field16405 = 0.0;
      this.field16406 = 0.0;
      this.field16407 = 1.0;
      this.field16408 = 0.0;
      this.field16409 = 0.0;
      this.field16410 = -var5;
      this.field16411 = 0.0;
      this.field16412 = var7;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10301(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field16402 = var7;
      this.field16403 = -var5;
      this.field16404 = 0.0;
      this.field16405 = 0.0;
      this.field16406 = var5;
      this.field16407 = var7;
      this.field16408 = 0.0;
      this.field16409 = 0.0;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = 1.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 1.0;
   }

   public final void method10302(double var1) {
      this.field16402 *= var1;
      this.field16403 *= var1;
      this.field16404 *= var1;
      this.field16405 *= var1;
      this.field16406 *= var1;
      this.field16407 *= var1;
      this.field16408 *= var1;
      this.field16409 *= var1;
      this.field16410 *= var1;
      this.field16411 *= var1;
      this.field16412 *= var1;
      this.field16413 *= var1;
      this.field16414 *= var1;
      this.field16415 *= var1;
      this.field16416 *= var1;
      this.field16417 *= var1;
   }

   public final void method10303(double var1, Class2417 var3) {
      this.field16402 = var3.field16402 * var1;
      this.field16403 = var3.field16403 * var1;
      this.field16404 = var3.field16404 * var1;
      this.field16405 = var3.field16405 * var1;
      this.field16406 = var3.field16406 * var1;
      this.field16407 = var3.field16407 * var1;
      this.field16408 = var3.field16408 * var1;
      this.field16409 = var3.field16409 * var1;
      this.field16410 = var3.field16410 * var1;
      this.field16411 = var3.field16411 * var1;
      this.field16412 = var3.field16412 * var1;
      this.field16413 = var3.field16413 * var1;
      this.field16414 = var3.field16414 * var1;
      this.field16415 = var3.field16415 * var1;
      this.field16416 = var3.field16416 * var1;
      this.field16417 = var3.field16417 * var1;
   }

   public final void method10304(Class2417 var1) {
      double var4 = this.field16402 * var1.field16402
         + this.field16403 * var1.field16406
         + this.field16404 * var1.field16410
         + this.field16405 * var1.field16414;
      double var6 = this.field16402 * var1.field16403
         + this.field16403 * var1.field16407
         + this.field16404 * var1.field16411
         + this.field16405 * var1.field16415;
      double var8 = this.field16402 * var1.field16404
         + this.field16403 * var1.field16408
         + this.field16404 * var1.field16412
         + this.field16405 * var1.field16416;
      double var10 = this.field16402 * var1.field16405
         + this.field16403 * var1.field16409
         + this.field16404 * var1.field16413
         + this.field16405 * var1.field16417;
      double var12 = this.field16406 * var1.field16402
         + this.field16407 * var1.field16406
         + this.field16408 * var1.field16410
         + this.field16409 * var1.field16414;
      double var14 = this.field16406 * var1.field16403
         + this.field16407 * var1.field16407
         + this.field16408 * var1.field16411
         + this.field16409 * var1.field16415;
      double var16 = this.field16406 * var1.field16404
         + this.field16407 * var1.field16408
         + this.field16408 * var1.field16412
         + this.field16409 * var1.field16416;
      double var18 = this.field16406 * var1.field16405
         + this.field16407 * var1.field16409
         + this.field16408 * var1.field16413
         + this.field16409 * var1.field16417;
      double var20 = this.field16410 * var1.field16402
         + this.field16411 * var1.field16406
         + this.field16412 * var1.field16410
         + this.field16413 * var1.field16414;
      double var22 = this.field16410 * var1.field16403
         + this.field16411 * var1.field16407
         + this.field16412 * var1.field16411
         + this.field16413 * var1.field16415;
      double var24 = this.field16410 * var1.field16404
         + this.field16411 * var1.field16408
         + this.field16412 * var1.field16412
         + this.field16413 * var1.field16416;
      double var26 = this.field16410 * var1.field16405
         + this.field16411 * var1.field16409
         + this.field16412 * var1.field16413
         + this.field16413 * var1.field16417;
      double var28 = this.field16414 * var1.field16402
         + this.field16415 * var1.field16406
         + this.field16416 * var1.field16410
         + this.field16417 * var1.field16414;
      double var30 = this.field16414 * var1.field16403
         + this.field16415 * var1.field16407
         + this.field16416 * var1.field16411
         + this.field16417 * var1.field16415;
      double var32 = this.field16414 * var1.field16404
         + this.field16415 * var1.field16408
         + this.field16416 * var1.field16412
         + this.field16417 * var1.field16416;
      double var34 = this.field16414 * var1.field16405
         + this.field16415 * var1.field16409
         + this.field16416 * var1.field16413
         + this.field16417 * var1.field16417;
      this.field16402 = var4;
      this.field16403 = var6;
      this.field16404 = var8;
      this.field16405 = var10;
      this.field16406 = var12;
      this.field16407 = var14;
      this.field16408 = var16;
      this.field16409 = var18;
      this.field16410 = var20;
      this.field16411 = var22;
      this.field16412 = var24;
      this.field16413 = var26;
      this.field16414 = var28;
      this.field16415 = var30;
      this.field16416 = var32;
      this.field16417 = var34;
   }

   public final void method10305(Class2417 var1, Class2417 var2) {
      if (this != var1 && this != var2) {
         this.field16402 = var1.field16402 * var2.field16402
            + var1.field16403 * var2.field16406
            + var1.field16404 * var2.field16410
            + var1.field16405 * var2.field16414;
         this.field16403 = var1.field16402 * var2.field16403
            + var1.field16403 * var2.field16407
            + var1.field16404 * var2.field16411
            + var1.field16405 * var2.field16415;
         this.field16404 = var1.field16402 * var2.field16404
            + var1.field16403 * var2.field16408
            + var1.field16404 * var2.field16412
            + var1.field16405 * var2.field16416;
         this.field16405 = var1.field16402 * var2.field16405
            + var1.field16403 * var2.field16409
            + var1.field16404 * var2.field16413
            + var1.field16405 * var2.field16417;
         this.field16406 = var1.field16406 * var2.field16402
            + var1.field16407 * var2.field16406
            + var1.field16408 * var2.field16410
            + var1.field16409 * var2.field16414;
         this.field16407 = var1.field16406 * var2.field16403
            + var1.field16407 * var2.field16407
            + var1.field16408 * var2.field16411
            + var1.field16409 * var2.field16415;
         this.field16408 = var1.field16406 * var2.field16404
            + var1.field16407 * var2.field16408
            + var1.field16408 * var2.field16412
            + var1.field16409 * var2.field16416;
         this.field16409 = var1.field16406 * var2.field16405
            + var1.field16407 * var2.field16409
            + var1.field16408 * var2.field16413
            + var1.field16409 * var2.field16417;
         this.field16410 = var1.field16410 * var2.field16402
            + var1.field16411 * var2.field16406
            + var1.field16412 * var2.field16410
            + var1.field16413 * var2.field16414;
         this.field16411 = var1.field16410 * var2.field16403
            + var1.field16411 * var2.field16407
            + var1.field16412 * var2.field16411
            + var1.field16413 * var2.field16415;
         this.field16412 = var1.field16410 * var2.field16404
            + var1.field16411 * var2.field16408
            + var1.field16412 * var2.field16412
            + var1.field16413 * var2.field16416;
         this.field16413 = var1.field16410 * var2.field16405
            + var1.field16411 * var2.field16409
            + var1.field16412 * var2.field16413
            + var1.field16413 * var2.field16417;
         this.field16414 = var1.field16414 * var2.field16402
            + var1.field16415 * var2.field16406
            + var1.field16416 * var2.field16410
            + var1.field16417 * var2.field16414;
         this.field16415 = var1.field16414 * var2.field16403
            + var1.field16415 * var2.field16407
            + var1.field16416 * var2.field16411
            + var1.field16417 * var2.field16415;
         this.field16416 = var1.field16414 * var2.field16404
            + var1.field16415 * var2.field16408
            + var1.field16416 * var2.field16412
            + var1.field16417 * var2.field16416;
         this.field16417 = var1.field16414 * var2.field16405
            + var1.field16415 * var2.field16409
            + var1.field16416 * var2.field16413
            + var1.field16417 * var2.field16417;
      } else {
         double var5 = var1.field16402 * var2.field16402
            + var1.field16403 * var2.field16406
            + var1.field16404 * var2.field16410
            + var1.field16405 * var2.field16414;
         double var7 = var1.field16402 * var2.field16403
            + var1.field16403 * var2.field16407
            + var1.field16404 * var2.field16411
            + var1.field16405 * var2.field16415;
         double var9 = var1.field16402 * var2.field16404
            + var1.field16403 * var2.field16408
            + var1.field16404 * var2.field16412
            + var1.field16405 * var2.field16416;
         double var11 = var1.field16402 * var2.field16405
            + var1.field16403 * var2.field16409
            + var1.field16404 * var2.field16413
            + var1.field16405 * var2.field16417;
         double var13 = var1.field16406 * var2.field16402
            + var1.field16407 * var2.field16406
            + var1.field16408 * var2.field16410
            + var1.field16409 * var2.field16414;
         double var15 = var1.field16406 * var2.field16403
            + var1.field16407 * var2.field16407
            + var1.field16408 * var2.field16411
            + var1.field16409 * var2.field16415;
         double var17 = var1.field16406 * var2.field16404
            + var1.field16407 * var2.field16408
            + var1.field16408 * var2.field16412
            + var1.field16409 * var2.field16416;
         double var19 = var1.field16406 * var2.field16405
            + var1.field16407 * var2.field16409
            + var1.field16408 * var2.field16413
            + var1.field16409 * var2.field16417;
         double var21 = var1.field16410 * var2.field16402
            + var1.field16411 * var2.field16406
            + var1.field16412 * var2.field16410
            + var1.field16413 * var2.field16414;
         double var23 = var1.field16410 * var2.field16403
            + var1.field16411 * var2.field16407
            + var1.field16412 * var2.field16411
            + var1.field16413 * var2.field16415;
         double var25 = var1.field16410 * var2.field16404
            + var1.field16411 * var2.field16408
            + var1.field16412 * var2.field16412
            + var1.field16413 * var2.field16416;
         double var27 = var1.field16410 * var2.field16405
            + var1.field16411 * var2.field16409
            + var1.field16412 * var2.field16413
            + var1.field16413 * var2.field16417;
         double var29 = var1.field16414 * var2.field16402
            + var1.field16415 * var2.field16406
            + var1.field16416 * var2.field16410
            + var1.field16417 * var2.field16414;
         double var31 = var1.field16414 * var2.field16403
            + var1.field16415 * var2.field16407
            + var1.field16416 * var2.field16411
            + var1.field16417 * var2.field16415;
         double var33 = var1.field16414 * var2.field16404
            + var1.field16415 * var2.field16408
            + var1.field16416 * var2.field16412
            + var1.field16417 * var2.field16416;
         double var35 = var1.field16414 * var2.field16405
            + var1.field16415 * var2.field16409
            + var1.field16416 * var2.field16413
            + var1.field16417 * var2.field16417;
         this.field16402 = var5;
         this.field16403 = var7;
         this.field16404 = var9;
         this.field16405 = var11;
         this.field16406 = var13;
         this.field16407 = var15;
         this.field16408 = var17;
         this.field16409 = var19;
         this.field16410 = var21;
         this.field16411 = var23;
         this.field16412 = var25;
         this.field16413 = var27;
         this.field16414 = var29;
         this.field16415 = var31;
         this.field16416 = var33;
         this.field16417 = var35;
      }
   }

   public final void method10306(Class2417 var1, Class2417 var2) {
      if (this != var1 && this != var2) {
         this.field16402 = var1.field16402 * var2.field16402
            + var1.field16406 * var2.field16403
            + var1.field16410 * var2.field16404
            + var1.field16414 * var2.field16405;
         this.field16403 = var1.field16402 * var2.field16406
            + var1.field16406 * var2.field16407
            + var1.field16410 * var2.field16408
            + var1.field16414 * var2.field16409;
         this.field16404 = var1.field16402 * var2.field16410
            + var1.field16406 * var2.field16411
            + var1.field16410 * var2.field16412
            + var1.field16414 * var2.field16413;
         this.field16405 = var1.field16402 * var2.field16414
            + var1.field16406 * var2.field16415
            + var1.field16410 * var2.field16416
            + var1.field16414 * var2.field16417;
         this.field16406 = var1.field16403 * var2.field16402
            + var1.field16407 * var2.field16403
            + var1.field16411 * var2.field16404
            + var1.field16415 * var2.field16405;
         this.field16407 = var1.field16403 * var2.field16406
            + var1.field16407 * var2.field16407
            + var1.field16411 * var2.field16408
            + var1.field16415 * var2.field16409;
         this.field16408 = var1.field16403 * var2.field16410
            + var1.field16407 * var2.field16411
            + var1.field16411 * var2.field16412
            + var1.field16415 * var2.field16413;
         this.field16409 = var1.field16403 * var2.field16414
            + var1.field16407 * var2.field16415
            + var1.field16411 * var2.field16416
            + var1.field16415 * var2.field16417;
         this.field16410 = var1.field16404 * var2.field16402
            + var1.field16408 * var2.field16403
            + var1.field16412 * var2.field16404
            + var1.field16416 * var2.field16405;
         this.field16411 = var1.field16404 * var2.field16406
            + var1.field16408 * var2.field16407
            + var1.field16412 * var2.field16408
            + var1.field16416 * var2.field16409;
         this.field16412 = var1.field16404 * var2.field16410
            + var1.field16408 * var2.field16411
            + var1.field16412 * var2.field16412
            + var1.field16416 * var2.field16413;
         this.field16413 = var1.field16404 * var2.field16414
            + var1.field16408 * var2.field16415
            + var1.field16412 * var2.field16416
            + var1.field16416 * var2.field16417;
         this.field16414 = var1.field16405 * var2.field16402
            + var1.field16409 * var2.field16403
            + var1.field16413 * var2.field16404
            + var1.field16417 * var2.field16405;
         this.field16415 = var1.field16405 * var2.field16406
            + var1.field16409 * var2.field16407
            + var1.field16413 * var2.field16408
            + var1.field16417 * var2.field16409;
         this.field16416 = var1.field16405 * var2.field16410
            + var1.field16409 * var2.field16411
            + var1.field16413 * var2.field16412
            + var1.field16417 * var2.field16413;
         this.field16417 = var1.field16405 * var2.field16414
            + var1.field16409 * var2.field16415
            + var1.field16413 * var2.field16416
            + var1.field16417 * var2.field16417;
      } else {
         double var5 = var1.field16402 * var2.field16402
            + var1.field16406 * var2.field16403
            + var1.field16410 * var2.field16404
            + var1.field16414 * var2.field16405;
         double var7 = var1.field16402 * var2.field16406
            + var1.field16406 * var2.field16407
            + var1.field16410 * var2.field16408
            + var1.field16414 * var2.field16409;
         double var9 = var1.field16402 * var2.field16410
            + var1.field16406 * var2.field16411
            + var1.field16410 * var2.field16412
            + var1.field16414 * var2.field16413;
         double var11 = var1.field16402 * var2.field16414
            + var1.field16406 * var2.field16415
            + var1.field16410 * var2.field16416
            + var1.field16414 * var2.field16417;
         double var13 = var1.field16403 * var2.field16402
            + var1.field16407 * var2.field16403
            + var1.field16411 * var2.field16404
            + var1.field16415 * var2.field16405;
         double var15 = var1.field16403 * var2.field16406
            + var1.field16407 * var2.field16407
            + var1.field16411 * var2.field16408
            + var1.field16415 * var2.field16409;
         double var17 = var1.field16403 * var2.field16410
            + var1.field16407 * var2.field16411
            + var1.field16411 * var2.field16412
            + var1.field16415 * var2.field16413;
         double var19 = var1.field16403 * var2.field16414
            + var1.field16407 * var2.field16415
            + var1.field16411 * var2.field16416
            + var1.field16415 * var2.field16417;
         double var21 = var1.field16404 * var2.field16402
            + var1.field16408 * var2.field16403
            + var1.field16412 * var2.field16404
            + var1.field16416 * var2.field16405;
         double var23 = var1.field16404 * var2.field16406
            + var1.field16408 * var2.field16407
            + var1.field16412 * var2.field16408
            + var1.field16416 * var2.field16409;
         double var25 = var1.field16404 * var2.field16410
            + var1.field16408 * var2.field16411
            + var1.field16412 * var2.field16412
            + var1.field16416 * var2.field16413;
         double var27 = var1.field16404 * var2.field16414
            + var1.field16408 * var2.field16415
            + var1.field16412 * var2.field16416
            + var1.field16416 * var2.field16417;
         double var29 = var1.field16405 * var2.field16402
            + var1.field16409 * var2.field16403
            + var1.field16413 * var2.field16404
            + var1.field16417 * var2.field16405;
         double var31 = var1.field16405 * var2.field16406
            + var1.field16409 * var2.field16407
            + var1.field16413 * var2.field16408
            + var1.field16417 * var2.field16409;
         double var33 = var1.field16405 * var2.field16410
            + var1.field16409 * var2.field16411
            + var1.field16413 * var2.field16412
            + var1.field16417 * var2.field16413;
         double var35 = var1.field16405 * var2.field16414
            + var1.field16409 * var2.field16415
            + var1.field16413 * var2.field16416
            + var1.field16417 * var2.field16417;
         this.field16402 = var5;
         this.field16403 = var7;
         this.field16404 = var9;
         this.field16405 = var11;
         this.field16406 = var13;
         this.field16407 = var15;
         this.field16408 = var17;
         this.field16409 = var19;
         this.field16410 = var21;
         this.field16411 = var23;
         this.field16412 = var25;
         this.field16413 = var27;
         this.field16414 = var29;
         this.field16415 = var31;
         this.field16416 = var33;
         this.field16417 = var35;
      }
   }

   public final void method10307(Class2417 var1, Class2417 var2) {
      if (this != var1 && this != var2) {
         this.field16402 = var1.field16402 * var2.field16402
            + var1.field16403 * var2.field16403
            + var1.field16404 * var2.field16404
            + var1.field16405 * var2.field16405;
         this.field16403 = var1.field16402 * var2.field16406
            + var1.field16403 * var2.field16407
            + var1.field16404 * var2.field16408
            + var1.field16405 * var2.field16409;
         this.field16404 = var1.field16402 * var2.field16410
            + var1.field16403 * var2.field16411
            + var1.field16404 * var2.field16412
            + var1.field16405 * var2.field16413;
         this.field16405 = var1.field16402 * var2.field16414
            + var1.field16403 * var2.field16415
            + var1.field16404 * var2.field16416
            + var1.field16405 * var2.field16417;
         this.field16406 = var1.field16406 * var2.field16402
            + var1.field16407 * var2.field16403
            + var1.field16408 * var2.field16404
            + var1.field16409 * var2.field16405;
         this.field16407 = var1.field16406 * var2.field16406
            + var1.field16407 * var2.field16407
            + var1.field16408 * var2.field16408
            + var1.field16409 * var2.field16409;
         this.field16408 = var1.field16406 * var2.field16410
            + var1.field16407 * var2.field16411
            + var1.field16408 * var2.field16412
            + var1.field16409 * var2.field16413;
         this.field16409 = var1.field16406 * var2.field16414
            + var1.field16407 * var2.field16415
            + var1.field16408 * var2.field16416
            + var1.field16409 * var2.field16417;
         this.field16410 = var1.field16410 * var2.field16402
            + var1.field16411 * var2.field16403
            + var1.field16412 * var2.field16404
            + var1.field16413 * var2.field16405;
         this.field16411 = var1.field16410 * var2.field16406
            + var1.field16411 * var2.field16407
            + var1.field16412 * var2.field16408
            + var1.field16413 * var2.field16409;
         this.field16412 = var1.field16410 * var2.field16410
            + var1.field16411 * var2.field16411
            + var1.field16412 * var2.field16412
            + var1.field16413 * var2.field16413;
         this.field16413 = var1.field16410 * var2.field16414
            + var1.field16411 * var2.field16415
            + var1.field16412 * var2.field16416
            + var1.field16413 * var2.field16417;
         this.field16414 = var1.field16414 * var2.field16402
            + var1.field16415 * var2.field16403
            + var1.field16416 * var2.field16404
            + var1.field16417 * var2.field16405;
         this.field16415 = var1.field16414 * var2.field16406
            + var1.field16415 * var2.field16407
            + var1.field16416 * var2.field16408
            + var1.field16417 * var2.field16409;
         this.field16416 = var1.field16414 * var2.field16410
            + var1.field16415 * var2.field16411
            + var1.field16416 * var2.field16412
            + var1.field16417 * var2.field16413;
         this.field16417 = var1.field16414 * var2.field16414
            + var1.field16415 * var2.field16415
            + var1.field16416 * var2.field16416
            + var1.field16417 * var2.field16417;
      } else {
         double var5 = var1.field16402 * var2.field16402
            + var1.field16403 * var2.field16403
            + var1.field16404 * var2.field16404
            + var1.field16405 * var2.field16405;
         double var7 = var1.field16402 * var2.field16406
            + var1.field16403 * var2.field16407
            + var1.field16404 * var2.field16408
            + var1.field16405 * var2.field16409;
         double var9 = var1.field16402 * var2.field16410
            + var1.field16403 * var2.field16411
            + var1.field16404 * var2.field16412
            + var1.field16405 * var2.field16413;
         double var11 = var1.field16402 * var2.field16414
            + var1.field16403 * var2.field16415
            + var1.field16404 * var2.field16416
            + var1.field16405 * var2.field16417;
         double var13 = var1.field16406 * var2.field16402
            + var1.field16407 * var2.field16403
            + var1.field16408 * var2.field16404
            + var1.field16409 * var2.field16405;
         double var15 = var1.field16406 * var2.field16406
            + var1.field16407 * var2.field16407
            + var1.field16408 * var2.field16408
            + var1.field16409 * var2.field16409;
         double var17 = var1.field16406 * var2.field16410
            + var1.field16407 * var2.field16411
            + var1.field16408 * var2.field16412
            + var1.field16409 * var2.field16413;
         double var19 = var1.field16406 * var2.field16414
            + var1.field16407 * var2.field16415
            + var1.field16408 * var2.field16416
            + var1.field16409 * var2.field16417;
         double var21 = var1.field16410 * var2.field16402
            + var1.field16411 * var2.field16403
            + var1.field16412 * var2.field16404
            + var1.field16413 * var2.field16405;
         double var23 = var1.field16410 * var2.field16406
            + var1.field16411 * var2.field16407
            + var1.field16412 * var2.field16408
            + var1.field16413 * var2.field16409;
         double var25 = var1.field16410 * var2.field16410
            + var1.field16411 * var2.field16411
            + var1.field16412 * var2.field16412
            + var1.field16413 * var2.field16413;
         double var27 = var1.field16410 * var2.field16414
            + var1.field16411 * var2.field16415
            + var1.field16412 * var2.field16416
            + var1.field16413 * var2.field16417;
         double var29 = var1.field16414 * var2.field16402
            + var1.field16415 * var2.field16403
            + var1.field16416 * var2.field16404
            + var1.field16417 * var2.field16405;
         double var31 = var1.field16414 * var2.field16406
            + var1.field16415 * var2.field16407
            + var1.field16416 * var2.field16408
            + var1.field16417 * var2.field16409;
         double var33 = var1.field16414 * var2.field16410
            + var1.field16415 * var2.field16411
            + var1.field16416 * var2.field16412
            + var1.field16417 * var2.field16413;
         double var35 = var1.field16414 * var2.field16414
            + var1.field16415 * var2.field16415
            + var1.field16416 * var2.field16416
            + var1.field16417 * var2.field16417;
         this.field16402 = var5;
         this.field16403 = var7;
         this.field16404 = var9;
         this.field16405 = var11;
         this.field16406 = var13;
         this.field16407 = var15;
         this.field16408 = var17;
         this.field16409 = var19;
         this.field16410 = var21;
         this.field16411 = var23;
         this.field16412 = var25;
         this.field16413 = var27;
         this.field16414 = var29;
         this.field16415 = var31;
         this.field16416 = var33;
         this.field16417 = var35;
      }
   }

   public final void method10308(Class2417 var1, Class2417 var2) {
      if (this != var1 && this != var2) {
         this.field16402 = var1.field16402 * var2.field16402
            + var1.field16406 * var2.field16406
            + var1.field16410 * var2.field16410
            + var1.field16414 * var2.field16414;
         this.field16403 = var1.field16402 * var2.field16403
            + var1.field16406 * var2.field16407
            + var1.field16410 * var2.field16411
            + var1.field16414 * var2.field16415;
         this.field16404 = var1.field16402 * var2.field16404
            + var1.field16406 * var2.field16408
            + var1.field16410 * var2.field16412
            + var1.field16414 * var2.field16416;
         this.field16405 = var1.field16402 * var2.field16405
            + var1.field16406 * var2.field16409
            + var1.field16410 * var2.field16413
            + var1.field16414 * var2.field16417;
         this.field16406 = var1.field16403 * var2.field16402
            + var1.field16407 * var2.field16406
            + var1.field16411 * var2.field16410
            + var1.field16415 * var2.field16414;
         this.field16407 = var1.field16403 * var2.field16403
            + var1.field16407 * var2.field16407
            + var1.field16411 * var2.field16411
            + var1.field16415 * var2.field16415;
         this.field16408 = var1.field16403 * var2.field16404
            + var1.field16407 * var2.field16408
            + var1.field16411 * var2.field16412
            + var1.field16415 * var2.field16416;
         this.field16409 = var1.field16403 * var2.field16405
            + var1.field16407 * var2.field16409
            + var1.field16411 * var2.field16413
            + var1.field16415 * var2.field16417;
         this.field16410 = var1.field16404 * var2.field16402
            + var1.field16408 * var2.field16406
            + var1.field16412 * var2.field16410
            + var1.field16416 * var2.field16414;
         this.field16411 = var1.field16404 * var2.field16403
            + var1.field16408 * var2.field16407
            + var1.field16412 * var2.field16411
            + var1.field16416 * var2.field16415;
         this.field16412 = var1.field16404 * var2.field16404
            + var1.field16408 * var2.field16408
            + var1.field16412 * var2.field16412
            + var1.field16416 * var2.field16416;
         this.field16413 = var1.field16404 * var2.field16405
            + var1.field16408 * var2.field16409
            + var1.field16412 * var2.field16413
            + var1.field16416 * var2.field16417;
         this.field16414 = var1.field16405 * var2.field16402
            + var1.field16409 * var2.field16406
            + var1.field16413 * var2.field16410
            + var1.field16417 * var2.field16414;
         this.field16415 = var1.field16405 * var2.field16403
            + var1.field16409 * var2.field16407
            + var1.field16413 * var2.field16411
            + var1.field16417 * var2.field16415;
         this.field16416 = var1.field16405 * var2.field16404
            + var1.field16409 * var2.field16408
            + var1.field16413 * var2.field16412
            + var1.field16417 * var2.field16416;
         this.field16417 = var1.field16405 * var2.field16405
            + var1.field16409 * var2.field16409
            + var1.field16413 * var2.field16413
            + var1.field16417 * var2.field16417;
      } else {
         double var5 = var1.field16402 * var2.field16402
            + var1.field16406 * var2.field16406
            + var1.field16410 * var2.field16410
            + var1.field16414 * var2.field16414;
         double var7 = var1.field16402 * var2.field16403
            + var1.field16406 * var2.field16407
            + var1.field16410 * var2.field16411
            + var1.field16414 * var2.field16415;
         double var9 = var1.field16402 * var2.field16404
            + var1.field16406 * var2.field16408
            + var1.field16410 * var2.field16412
            + var1.field16414 * var2.field16416;
         double var11 = var1.field16402 * var2.field16405
            + var1.field16406 * var2.field16409
            + var1.field16410 * var2.field16413
            + var1.field16414 * var2.field16417;
         double var13 = var1.field16403 * var2.field16402
            + var1.field16407 * var2.field16406
            + var1.field16411 * var2.field16410
            + var1.field16415 * var2.field16414;
         double var15 = var1.field16403 * var2.field16403
            + var1.field16407 * var2.field16407
            + var1.field16411 * var2.field16411
            + var1.field16415 * var2.field16415;
         double var17 = var1.field16403 * var2.field16404
            + var1.field16407 * var2.field16408
            + var1.field16411 * var2.field16412
            + var1.field16415 * var2.field16416;
         double var19 = var1.field16403 * var2.field16405
            + var1.field16407 * var2.field16409
            + var1.field16411 * var2.field16413
            + var1.field16415 * var2.field16417;
         double var21 = var1.field16404 * var2.field16402
            + var1.field16408 * var2.field16406
            + var1.field16412 * var2.field16410
            + var1.field16416 * var2.field16414;
         double var23 = var1.field16404 * var2.field16403
            + var1.field16408 * var2.field16407
            + var1.field16412 * var2.field16411
            + var1.field16416 * var2.field16415;
         double var25 = var1.field16404 * var2.field16404
            + var1.field16408 * var2.field16408
            + var1.field16412 * var2.field16412
            + var1.field16416 * var2.field16416;
         double var27 = var1.field16404 * var2.field16405
            + var1.field16408 * var2.field16409
            + var1.field16412 * var2.field16413
            + var1.field16416 * var2.field16417;
         double var29 = var1.field16405 * var2.field16402
            + var1.field16409 * var2.field16406
            + var1.field16413 * var2.field16410
            + var1.field16417 * var2.field16414;
         double var31 = var1.field16405 * var2.field16403
            + var1.field16409 * var2.field16407
            + var1.field16413 * var2.field16411
            + var1.field16417 * var2.field16415;
         double var33 = var1.field16405 * var2.field16404
            + var1.field16409 * var2.field16408
            + var1.field16413 * var2.field16412
            + var1.field16417 * var2.field16416;
         double var35 = var1.field16405 * var2.field16405
            + var1.field16409 * var2.field16409
            + var1.field16413 * var2.field16413
            + var1.field16417 * var2.field16417;
         this.field16402 = var5;
         this.field16403 = var7;
         this.field16404 = var9;
         this.field16405 = var11;
         this.field16406 = var13;
         this.field16407 = var15;
         this.field16408 = var17;
         this.field16409 = var19;
         this.field16410 = var21;
         this.field16411 = var23;
         this.field16412 = var25;
         this.field16413 = var27;
         this.field16414 = var29;
         this.field16415 = var31;
         this.field16416 = var33;
         this.field16417 = var35;
      }
   }

   public boolean equals(Class2417 var1) {
      try {
         return this.field16402 == var1.field16402
            && this.field16403 == var1.field16403
            && this.field16404 == var1.field16404
            && this.field16405 == var1.field16405
            && this.field16406 == var1.field16406
            && this.field16407 == var1.field16407
            && this.field16408 == var1.field16408
            && this.field16409 == var1.field16409
            && this.field16410 == var1.field16410
            && this.field16411 == var1.field16411
            && this.field16412 == var1.field16412
            && this.field16413 == var1.field16413
            && this.field16414 == var1.field16414
            && this.field16415 == var1.field16415
            && this.field16416 == var1.field16416
            && this.field16417 == var1.field16417;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2417 var4 = (Class2417)var1;
         return this.field16402 == var4.field16402
            && this.field16403 == var4.field16403
            && this.field16404 == var4.field16404
            && this.field16405 == var4.field16405
            && this.field16406 == var4.field16406
            && this.field16407 == var4.field16407
            && this.field16408 == var4.field16408
            && this.field16409 == var4.field16409
            && this.field16410 == var4.field16410
            && this.field16411 == var4.field16411
            && this.field16412 == var4.field16412
            && this.field16413 == var4.field16413
            && this.field16414 == var4.field16414
            && this.field16415 == var4.field16415
            && this.field16416 == var4.field16416
            && this.field16417 == var4.field16417;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   /** @deprecated */
   public boolean method10309(Class2417 var1, float var2) {
      return this.method10310(var1, (double)var2);
   }

   public boolean method10310(Class2417 var1, double var2) {
      double var6 = this.field16402 - var1.field16402;
      if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
         var6 = this.field16403 - var1.field16403;
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field16404 - var1.field16404;
            if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
               var6 = this.field16405 - var1.field16405;
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field16406 - var1.field16406;
                  if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                     var6 = this.field16407 - var1.field16407;
                     if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                        var6 = this.field16408 - var1.field16408;
                        if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                           var6 = this.field16409 - var1.field16409;
                           if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                              var6 = this.field16410 - var1.field16410;
                              if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                 var6 = this.field16411 - var1.field16411;
                                 if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                    var6 = this.field16412 - var1.field16412;
                                    if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                       var6 = this.field16413 - var1.field16413;
                                       if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                          var6 = this.field16414 - var1.field16414;
                                          if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                             var6 = this.field16415 - var1.field16415;
                                             if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                                var6 = this.field16416 - var1.field16416;
                                                if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                                   var6 = this.field16417 - var1.field16417;
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
                                       } else {
                                          return false;
                                       }
                                    } else {
                                       return false;
                                    }
                                 } else {
                                    return false;
                                 }
                              } else {
                                 return false;
                              }
                           } else {
                              return false;
                           }
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
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
      var3 = 31L * var3 + Class9832.method38797(this.field16402);
      var3 = 31L * var3 + Class9832.method38797(this.field16403);
      var3 = 31L * var3 + Class9832.method38797(this.field16404);
      var3 = 31L * var3 + Class9832.method38797(this.field16405);
      var3 = 31L * var3 + Class9832.method38797(this.field16406);
      var3 = 31L * var3 + Class9832.method38797(this.field16407);
      var3 = 31L * var3 + Class9832.method38797(this.field16408);
      var3 = 31L * var3 + Class9832.method38797(this.field16409);
      var3 = 31L * var3 + Class9832.method38797(this.field16410);
      var3 = 31L * var3 + Class9832.method38797(this.field16411);
      var3 = 31L * var3 + Class9832.method38797(this.field16412);
      var3 = 31L * var3 + Class9832.method38797(this.field16413);
      var3 = 31L * var3 + Class9832.method38797(this.field16414);
      var3 = 31L * var3 + Class9832.method38797(this.field16415);
      var3 = 31L * var3 + Class9832.method38797(this.field16416);
      var3 = 31L * var3 + Class9832.method38797(this.field16417);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method10311(Class2387 var1, Class2387 var2) {
      double var5 = this.field16402 * var1.field16274
         + this.field16403 * var1.field16275
         + this.field16404 * var1.field16276
         + this.field16405 * var1.field16277;
      double var7 = this.field16406 * var1.field16274
         + this.field16407 * var1.field16275
         + this.field16408 * var1.field16276
         + this.field16409 * var1.field16277;
      double var9 = this.field16410 * var1.field16274
         + this.field16411 * var1.field16275
         + this.field16412 * var1.field16276
         + this.field16413 * var1.field16277;
      var2.field16277 = this.field16414 * var1.field16274
         + this.field16415 * var1.field16275
         + this.field16416 * var1.field16276
         + this.field16417 * var1.field16277;
      var2.field16274 = var5;
      var2.field16275 = var7;
      var2.field16276 = var9;
   }

   public final void method10312(Class2387 var1) {
      double var4 = this.field16402 * var1.field16274
         + this.field16403 * var1.field16275
         + this.field16404 * var1.field16276
         + this.field16405 * var1.field16277;
      double var6 = this.field16406 * var1.field16274
         + this.field16407 * var1.field16275
         + this.field16408 * var1.field16276
         + this.field16409 * var1.field16277;
      double var8 = this.field16410 * var1.field16274
         + this.field16411 * var1.field16275
         + this.field16412 * var1.field16276
         + this.field16413 * var1.field16277;
      var1.field16277 = this.field16414 * var1.field16274
         + this.field16415 * var1.field16275
         + this.field16416 * var1.field16276
         + this.field16417 * var1.field16277;
      var1.field16274 = var4;
      var1.field16275 = var6;
      var1.field16276 = var8;
   }

   public final void method10313(Class2411 var1, Class2411 var2) {
      float var5 = (float)(
         this.field16402 * (double)var1.field16389
            + this.field16403 * (double)var1.field16390
            + this.field16404 * (double)var1.field16391
            + this.field16405 * (double)var1.field16392
      );
      float var6 = (float)(
         this.field16406 * (double)var1.field16389
            + this.field16407 * (double)var1.field16390
            + this.field16408 * (double)var1.field16391
            + this.field16409 * (double)var1.field16392
      );
      float var7 = (float)(
         this.field16410 * (double)var1.field16389
            + this.field16411 * (double)var1.field16390
            + this.field16412 * (double)var1.field16391
            + this.field16413 * (double)var1.field16392
      );
      var2.field16392 = (float)(
         this.field16414 * (double)var1.field16389
            + this.field16415 * (double)var1.field16390
            + this.field16416 * (double)var1.field16391
            + this.field16417 * (double)var1.field16392
      );
      var2.field16389 = var5;
      var2.field16390 = var6;
      var2.field16391 = var7;
   }

   public final void method10314(Class2411 var1) {
      float var4 = (float)(
         this.field16402 * (double)var1.field16389
            + this.field16403 * (double)var1.field16390
            + this.field16404 * (double)var1.field16391
            + this.field16405 * (double)var1.field16392
      );
      float var5 = (float)(
         this.field16406 * (double)var1.field16389
            + this.field16407 * (double)var1.field16390
            + this.field16408 * (double)var1.field16391
            + this.field16409 * (double)var1.field16392
      );
      float var6 = (float)(
         this.field16410 * (double)var1.field16389
            + this.field16411 * (double)var1.field16390
            + this.field16412 * (double)var1.field16391
            + this.field16413 * (double)var1.field16392
      );
      var1.field16392 = (float)(
         this.field16414 * (double)var1.field16389
            + this.field16415 * (double)var1.field16390
            + this.field16416 * (double)var1.field16391
            + this.field16417 * (double)var1.field16392
      );
      var1.field16389 = var4;
      var1.field16390 = var5;
      var1.field16391 = var6;
   }

   public final void method10315(Class2369 var1, Class2369 var2) {
      double var5 = this.field16402 * var1.field16210 + this.field16403 * var1.field16211 + this.field16404 * var1.field16212 + this.field16405;
      double var7 = this.field16406 * var1.field16210 + this.field16407 * var1.field16211 + this.field16408 * var1.field16212 + this.field16409;
      var2.field16212 = this.field16410 * var1.field16210 + this.field16411 * var1.field16211 + this.field16412 * var1.field16212 + this.field16413;
      var2.field16210 = var5;
      var2.field16211 = var7;
   }

   public final void method10316(Class2369 var1) {
      double var4 = this.field16402 * var1.field16210 + this.field16403 * var1.field16211 + this.field16404 * var1.field16212 + this.field16405;
      double var6 = this.field16406 * var1.field16210 + this.field16407 * var1.field16211 + this.field16408 * var1.field16212 + this.field16409;
      var1.field16212 = this.field16410 * var1.field16210 + this.field16411 * var1.field16211 + this.field16412 * var1.field16212 + this.field16413;
      var1.field16210 = var4;
      var1.field16211 = var6;
   }

   public final void method10317(Class2418 var1, Class2418 var2) {
      float var5 = (float)(
         this.field16402 * (double)var1.field8 + this.field16403 * (double)var1.field9 + this.field16404 * (double)var1.field10 + this.field16405
      );
      float var6 = (float)(
         this.field16406 * (double)var1.field8 + this.field16407 * (double)var1.field9 + this.field16408 * (double)var1.field10 + this.field16409
      );
      var2.field10 = (float)(
         this.field16410 * (double)var1.field8 + this.field16411 * (double)var1.field9 + this.field16412 * (double)var1.field10 + this.field16413
      );
      var2.field8 = var5;
      var2.field9 = var6;
   }

   public final void method10318(Class2418 var1) {
      float var4 = (float)(
         this.field16402 * (double)var1.field8 + this.field16403 * (double)var1.field9 + this.field16404 * (double)var1.field10 + this.field16405
      );
      float var5 = (float)(
         this.field16406 * (double)var1.field8 + this.field16407 * (double)var1.field9 + this.field16408 * (double)var1.field10 + this.field16409
      );
      var1.field10 = (float)(
         this.field16410 * (double)var1.field8 + this.field16411 * (double)var1.field9 + this.field16412 * (double)var1.field10 + this.field16413
      );
      var1.field8 = var4;
      var1.field9 = var5;
   }

   public final void method10319(Class2368 var1, Class2368 var2) {
      double var5 = this.field16402 * var1.field16210 + this.field16403 * var1.field16211 + this.field16404 * var1.field16212;
      double var7 = this.field16406 * var1.field16210 + this.field16407 * var1.field16211 + this.field16408 * var1.field16212;
      var2.field16212 = this.field16410 * var1.field16210 + this.field16411 * var1.field16211 + this.field16412 * var1.field16212;
      var2.field16210 = var5;
      var2.field16211 = var7;
   }

   public final void method10320(Class2368 var1) {
      double var4 = this.field16402 * var1.field16210 + this.field16403 * var1.field16211 + this.field16404 * var1.field16212;
      double var6 = this.field16406 * var1.field16210 + this.field16407 * var1.field16211 + this.field16408 * var1.field16212;
      var1.field16212 = this.field16410 * var1.field16210 + this.field16411 * var1.field16211 + this.field16412 * var1.field16212;
      var1.field16210 = var4;
      var1.field16211 = var6;
   }

   public final void method10321(Class6 var1, Class6 var2) {
      float var5 = (float)(this.field16402 * (double)var1.field8 + this.field16403 * (double)var1.field9 + this.field16404 * (double)var1.field10);
      float var6 = (float)(this.field16406 * (double)var1.field8 + this.field16407 * (double)var1.field9 + this.field16408 * (double)var1.field10);
      var2.field10 = (float)(this.field16410 * (double)var1.field8 + this.field16411 * (double)var1.field9 + this.field16412 * (double)var1.field10);
      var2.field8 = var5;
      var2.field9 = var6;
   }

   public final void method10322(Class6 var1) {
      float var4 = (float)(this.field16402 * (double)var1.field8 + this.field16403 * (double)var1.field9 + this.field16404 * (double)var1.field10);
      float var5 = (float)(this.field16406 * (double)var1.field8 + this.field16407 * (double)var1.field9 + this.field16408 * (double)var1.field10);
      var1.field10 = (float)(this.field16410 * (double)var1.field8 + this.field16411 * (double)var1.field9 + this.field16412 * (double)var1.field10);
      var1.field8 = var4;
      var1.field9 = var5;
   }

   public final void method10323(Class2363 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
      this.field16402 = var1.field16185 * var5[0];
      this.field16403 = var1.field16186 * var5[1];
      this.field16404 = var1.field16187 * var5[2];
      this.field16406 = var1.field16188 * var5[0];
      this.field16407 = var1.field16189 * var5[1];
      this.field16408 = var1.field16190 * var5[2];
      this.field16410 = var1.field16191 * var5[0];
      this.field16411 = var1.field16192 * var5[1];
      this.field16412 = var1.field16193 * var5[2];
   }

   public final void method10324(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
      this.field16402 = (double)var1.field16222 * var5[0];
      this.field16403 = (double)var1.field16223 * var5[1];
      this.field16404 = (double)var1.field16224 * var5[2];
      this.field16406 = (double)var1.field16225 * var5[0];
      this.field16407 = (double)var1.field16226 * var5[1];
      this.field16408 = (double)var1.field16227 * var5[2];
      this.field16410 = (double)var1.field16228 * var5[0];
      this.field16411 = (double)var1.field16229 * var5[1];
      this.field16412 = (double)var1.field16230 * var5[2];
   }

   public final void method10325(Class2415 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
      this.field16402 = (1.0 - (double)(2.0F * var1.field16390 * var1.field16390) - (double)(2.0F * var1.field16391 * var1.field16391)) * var5[0];
      this.field16406 = 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391) * var5[0];
      this.field16410 = 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390) * var5[0];
      this.field16403 = 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391) * var5[1];
      this.field16407 = (1.0 - (double)(2.0F * var1.field16389 * var1.field16389) - (double)(2.0F * var1.field16391 * var1.field16391)) * var5[1];
      this.field16411 = 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389) * var5[1];
      this.field16404 = 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390) * var5[2];
      this.field16408 = 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389) * var5[2];
      this.field16412 = (1.0 - (double)(2.0F * var1.field16389 * var1.field16389) - (double)(2.0F * var1.field16390 * var1.field16390)) * var5[2];
   }

   public final void method10326(Class2389 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
      this.field16402 = (1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276) * var5[0];
      this.field16406 = 2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276) * var5[0];
      this.field16410 = 2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275) * var5[0];
      this.field16403 = 2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276) * var5[1];
      this.field16407 = (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276) * var5[1];
      this.field16411 = 2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274) * var5[1];
      this.field16404 = 2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275) * var5[2];
      this.field16408 = 2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274) * var5[2];
      this.field16412 = (1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275) * var5[2];
   }

   public final void method10327(Class2410 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method10331(var5, var4);
      double var6 = 1.0 / Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385);
      double var8 = var1.field16383 * var6;
      double var10 = var1.field16384 * var6;
      double var12 = var1.field16385 * var6;
      double var14 = Math.sin(var1.field16386);
      double var16 = Math.cos(var1.field16386);
      double var18 = 1.0 - var16;
      double var20 = var1.field16383 * var1.field16385;
      double var22 = var1.field16383 * var1.field16384;
      double var24 = var1.field16384 * var1.field16385;
      this.field16402 = (var18 * var8 * var8 + var16) * var5[0];
      this.field16403 = (var18 * var22 - var14 * var12) * var5[1];
      this.field16404 = (var18 * var20 + var14 * var10) * var5[2];
      this.field16406 = (var18 * var22 + var14 * var12) * var5[0];
      this.field16407 = (var18 * var10 * var10 + var16) * var5[1];
      this.field16408 = (var18 * var24 - var14 * var8) * var5[2];
      this.field16410 = (var18 * var20 - var14 * var10) * var5[0];
      this.field16411 = (var18 * var24 + var14 * var8) * var5[1];
      this.field16412 = (var18 * var12 * var12 + var16) * var5[2];
   }

   public final void method10328() {
      this.field16402 = 0.0;
      this.field16403 = 0.0;
      this.field16404 = 0.0;
      this.field16405 = 0.0;
      this.field16406 = 0.0;
      this.field16407 = 0.0;
      this.field16408 = 0.0;
      this.field16409 = 0.0;
      this.field16410 = 0.0;
      this.field16411 = 0.0;
      this.field16412 = 0.0;
      this.field16413 = 0.0;
      this.field16414 = 0.0;
      this.field16415 = 0.0;
      this.field16416 = 0.0;
      this.field16417 = 0.0;
   }

   public final void method10329() {
      this.field16402 = -this.field16402;
      this.field16403 = -this.field16403;
      this.field16404 = -this.field16404;
      this.field16405 = -this.field16405;
      this.field16406 = -this.field16406;
      this.field16407 = -this.field16407;
      this.field16408 = -this.field16408;
      this.field16409 = -this.field16409;
      this.field16410 = -this.field16410;
      this.field16411 = -this.field16411;
      this.field16412 = -this.field16412;
      this.field16413 = -this.field16413;
      this.field16414 = -this.field16414;
      this.field16415 = -this.field16415;
      this.field16416 = -this.field16416;
      this.field16417 = -this.field16417;
   }

   public final void method10330(Class2417 var1) {
      this.field16402 = -var1.field16402;
      this.field16403 = -var1.field16403;
      this.field16404 = -var1.field16404;
      this.field16405 = -var1.field16405;
      this.field16406 = -var1.field16406;
      this.field16407 = -var1.field16407;
      this.field16408 = -var1.field16408;
      this.field16409 = -var1.field16409;
      this.field16410 = -var1.field16410;
      this.field16411 = -var1.field16411;
      this.field16412 = -var1.field16412;
      this.field16413 = -var1.field16413;
      this.field16414 = -var1.field16414;
      this.field16415 = -var1.field16415;
      this.field16416 = -var1.field16416;
      this.field16417 = -var1.field16417;
   }

   private final void method10331(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         this.field16402,
         this.field16403,
         this.field16404,
         this.field16406,
         this.field16407,
         this.field16408,
         this.field16410,
         this.field16411,
         this.field16412
      };
      Class2363.method9417(var5, var1, var2);
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (Class2417)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final double method10332() {
      return this.field16402;
   }

   public final void method10333(double var1) {
      this.field16402 = var1;
   }

   public final double method10334() {
      return this.field16403;
   }

   public final void method10335(double var1) {
      this.field16403 = var1;
   }

   public final double method10336() {
      return this.field16404;
   }

   public final void method10337(double var1) {
      this.field16404 = var1;
   }

   public final double method10338() {
      return this.field16406;
   }

   public final void method10339(double var1) {
      this.field16406 = var1;
   }

   public final double method10340() {
      return this.field16407;
   }

   public final void method10341(double var1) {
      this.field16407 = var1;
   }

   public final double method10342() {
      return this.field16408;
   }

   public final void method10343(double var1) {
      this.field16408 = var1;
   }

   public final double method10344() {
      return this.field16410;
   }

   public final void method10345(double var1) {
      this.field16410 = var1;
   }

   public final double method10346() {
      return this.field16411;
   }

   public final void method10347(double var1) {
      this.field16411 = var1;
   }

   public final double method10348() {
      return this.field16412;
   }

   public final void method10349(double var1) {
      this.field16412 = var1;
   }

   public final double method10350() {
      return this.field16405;
   }

   public final void method10351(double var1) {
      this.field16405 = var1;
   }

   public final double method10352() {
      return this.field16409;
   }

   public final void method10353(double var1) {
      this.field16409 = var1;
   }

   public final double method10354() {
      return this.field16413;
   }

   public final void method10355(double var1) {
      this.field16413 = var1;
   }

   public final double method10356() {
      return this.field16414;
   }

   public final void method10357(double var1) {
      this.field16414 = var1;
   }

   public final double method10358() {
      return this.field16415;
   }

   public final void method10359(double var1) {
      this.field16415 = var1;
   }

   public final double method10360() {
      return this.field16416;
   }

   public final void method10361(double var1) {
      this.field16416 = var1;
   }

   public final double method10362() {
      return this.field16417;
   }

   public final void method10363(double var1) {
      this.field16417 = var1;
   }
}
