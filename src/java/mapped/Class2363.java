package mapped;

import java.io.Serializable;

public class Class2363 implements Serializable, Cloneable {
   public static final long field16184 = 6837536777072402710L;
   public double field16185;
   public double field16186;
   public double field16187;
   public double field16188;
   public double field16189;
   public double field16190;
   public double field16191;
   public double field16192;
   public double field16193;
   private static final double field16194 = 1.110223024E-16;
   private static final double field16195 = 1.0E-8;
   private static double field16196;
   private static double field16197;
   private static double field16198;
   private static double field16199;
   private static double field16200;
   private static double field16201;

   public Class2363(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      this.field16185 = var1;
      this.field16186 = var3;
      this.field16187 = var5;
      this.field16188 = var7;
      this.field16189 = var9;
      this.field16190 = var11;
      this.field16191 = var13;
      this.field16192 = var15;
      this.field16193 = var17;
   }

   public Class2363(double[] var1) {
      this.field16185 = var1[0];
      this.field16186 = var1[1];
      this.field16187 = var1[2];
      this.field16188 = var1[3];
      this.field16189 = var1[4];
      this.field16190 = var1[5];
      this.field16191 = var1[6];
      this.field16192 = var1[7];
      this.field16193 = var1[8];
   }

   public Class2363(Class2363 var1) {
      this.field16185 = var1.field16185;
      this.field16186 = var1.field16186;
      this.field16187 = var1.field16187;
      this.field16188 = var1.field16188;
      this.field16189 = var1.field16189;
      this.field16190 = var1.field16190;
      this.field16191 = var1.field16191;
      this.field16192 = var1.field16192;
      this.field16193 = var1.field16193;
   }

   public Class2363(Class2372 var1) {
      this.field16185 = (double)var1.field16222;
      this.field16186 = (double)var1.field16223;
      this.field16187 = (double)var1.field16224;
      this.field16188 = (double)var1.field16225;
      this.field16189 = (double)var1.field16226;
      this.field16190 = (double)var1.field16227;
      this.field16191 = (double)var1.field16228;
      this.field16192 = (double)var1.field16229;
      this.field16193 = (double)var1.field16230;
   }

   public Class2363() {
      this.field16185 = 0.0;
      this.field16186 = 0.0;
      this.field16187 = 0.0;
      this.field16188 = 0.0;
      this.field16189 = 0.0;
      this.field16190 = 0.0;
      this.field16191 = 0.0;
      this.field16192 = 0.0;
      this.field16193 = 0.0;
   }

   @Override
   public String toString() {
      return this.field16185
         + ", "
         + this.field16186
         + ", "
         + this.field16187
         + "\n"
         + this.field16188
         + ", "
         + this.field16189
         + ", "
         + this.field16190
         + "\n"
         + this.field16191
         + ", "
         + this.field16192
         + ", "
         + this.field16193
         + "\n";
   }

   public final void method9357() {
      this.field16185 = 1.0;
      this.field16186 = 0.0;
      this.field16187 = 0.0;
      this.field16188 = 0.0;
      this.field16189 = 1.0;
      this.field16190 = 0.0;
      this.field16191 = 0.0;
      this.field16192 = 0.0;
      this.field16193 = 1.0;
   }

   public final void method9358(double var1) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method9416(var6, var5);
      this.field16185 = var5[0] * var1;
      this.field16186 = var5[1] * var1;
      this.field16187 = var5[2] * var1;
      this.field16188 = var5[3] * var1;
      this.field16189 = var5[4] * var1;
      this.field16190 = var5[5] * var1;
      this.field16191 = var5[6] * var1;
      this.field16192 = var5[7] * var1;
      this.field16193 = var5[8] * var1;
   }

   public final void method9359(int var1, int var2, double var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field16185 = var3;
                  return;
               case 1:
                  this.field16186 = var3;
                  return;
               case 2:
                  this.field16187 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field16188 = var3;
                  return;
               case 1:
                  this.field16189 = var3;
                  return;
               case 2:
                  this.field16190 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field16191 = var3;
                  return;
               case 1:
                  this.field16192 = var3;
                  return;
               case 2:
                  this.field16193 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d0"));
      }
   }

   public final double method9360(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field16185;
               case 1:
                  return this.field16186;
               case 2:
                  return this.field16187;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d1"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field16188;
               case 1:
                  return this.field16189;
               case 2:
                  return this.field16190;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d1"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field16191;
               case 1:
                  return this.field16192;
               case 2:
                  return this.field16193;
            }
      }

      throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d1"));
   }

   public final void method9361(int var1, Class2368 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d2"));
            }

            var2.field16210 = this.field16191;
            var2.field16211 = this.field16192;
            var2.field16212 = this.field16193;
         } else {
            var2.field16210 = this.field16188;
            var2.field16211 = this.field16189;
            var2.field16212 = this.field16190;
         }
      } else {
         var2.field16210 = this.field16185;
         var2.field16211 = this.field16186;
         var2.field16212 = this.field16187;
      }
   }

   public final void method9362(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d2"));
            }

            var2[0] = this.field16191;
            var2[1] = this.field16192;
            var2[2] = this.field16193;
         } else {
            var2[0] = this.field16188;
            var2[1] = this.field16189;
            var2[2] = this.field16190;
         }
      } else {
         var2[0] = this.field16185;
         var2[1] = this.field16186;
         var2[2] = this.field16187;
      }
   }

   public final void method9363(int var1, Class2368 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d4"));
            }

            var2.field16210 = this.field16187;
            var2.field16211 = this.field16190;
            var2.field16212 = this.field16193;
         } else {
            var2.field16210 = this.field16186;
            var2.field16211 = this.field16189;
            var2.field16212 = this.field16192;
         }
      } else {
         var2.field16210 = this.field16185;
         var2.field16211 = this.field16188;
         var2.field16212 = this.field16191;
      }
   }

   public final void method9364(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d4"));
            }

            var2[0] = this.field16187;
            var2[1] = this.field16190;
            var2[2] = this.field16193;
         } else {
            var2[0] = this.field16186;
            var2[1] = this.field16189;
            var2[2] = this.field16192;
         }
      } else {
         var2[0] = this.field16185;
         var2[1] = this.field16188;
         var2[2] = this.field16191;
      }
   }

   public final void method9365(int var1, double var2, double var4, double var6) {
      switch (var1) {
         case 0:
            this.field16185 = var2;
            this.field16186 = var4;
            this.field16187 = var6;
            break;
         case 1:
            this.field16188 = var2;
            this.field16189 = var4;
            this.field16190 = var6;
            break;
         case 2:
            this.field16191 = var2;
            this.field16192 = var4;
            this.field16193 = var6;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d6"));
      }
   }

   public final void method9366(int var1, Class2368 var2) {
      switch (var1) {
         case 0:
            this.field16185 = var2.field16210;
            this.field16186 = var2.field16211;
            this.field16187 = var2.field16212;
            break;
         case 1:
            this.field16188 = var2.field16210;
            this.field16189 = var2.field16211;
            this.field16190 = var2.field16212;
            break;
         case 2:
            this.field16191 = var2.field16210;
            this.field16192 = var2.field16211;
            this.field16193 = var2.field16212;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d6"));
      }
   }

   public final void method9367(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field16185 = var2[0];
            this.field16186 = var2[1];
            this.field16187 = var2[2];
            break;
         case 1:
            this.field16188 = var2[0];
            this.field16189 = var2[1];
            this.field16190 = var2[2];
            break;
         case 2:
            this.field16191 = var2[0];
            this.field16192 = var2[1];
            this.field16193 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d6"));
      }
   }

   public final void method9368(int var1, double var2, double var4, double var6) {
      switch (var1) {
         case 0:
            this.field16185 = var2;
            this.field16188 = var4;
            this.field16191 = var6;
            break;
         case 1:
            this.field16186 = var2;
            this.field16189 = var4;
            this.field16192 = var6;
            break;
         case 2:
            this.field16187 = var2;
            this.field16190 = var4;
            this.field16193 = var6;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d9"));
      }
   }

   public final void method9369(int var1, Class2368 var2) {
      switch (var1) {
         case 0:
            this.field16185 = var2.field16210;
            this.field16188 = var2.field16211;
            this.field16191 = var2.field16212;
            break;
         case 1:
            this.field16186 = var2.field16210;
            this.field16189 = var2.field16211;
            this.field16192 = var2.field16212;
            break;
         case 2:
            this.field16187 = var2.field16210;
            this.field16190 = var2.field16211;
            this.field16193 = var2.field16212;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d9"));
      }
   }

   public final void method9370(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field16185 = var2[0];
            this.field16188 = var2[1];
            this.field16191 = var2[2];
            break;
         case 1:
            this.field16186 = var2[0];
            this.field16189 = var2[1];
            this.field16192 = var2[2];
            break;
         case 2:
            this.field16187 = var2[0];
            this.field16190 = var2[1];
            this.field16193 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3d9"));
      }
   }

   public final double method9371() {
      double[] var3 = new double[3];
      double[] var4 = new double[9];
      this.method9416(var3, var4);
      return method9430(var3);
   }

   public final void method9372(double var1) {
      this.field16185 += var1;
      this.field16186 += var1;
      this.field16187 += var1;
      this.field16188 += var1;
      this.field16189 += var1;
      this.field16190 += var1;
      this.field16191 += var1;
      this.field16192 += var1;
      this.field16193 += var1;
   }

   public final void method9373(double var1, Class2363 var3) {
      this.field16185 = var3.field16185 + var1;
      this.field16186 = var3.field16186 + var1;
      this.field16187 = var3.field16187 + var1;
      this.field16188 = var3.field16188 + var1;
      this.field16189 = var3.field16189 + var1;
      this.field16190 = var3.field16190 + var1;
      this.field16191 = var3.field16191 + var1;
      this.field16192 = var3.field16192 + var1;
      this.field16193 = var3.field16193 + var1;
   }

   public final void method9374(Class2363 var1, Class2363 var2) {
      this.field16185 = var1.field16185 + var2.field16185;
      this.field16186 = var1.field16186 + var2.field16186;
      this.field16187 = var1.field16187 + var2.field16187;
      this.field16188 = var1.field16188 + var2.field16188;
      this.field16189 = var1.field16189 + var2.field16189;
      this.field16190 = var1.field16190 + var2.field16190;
      this.field16191 = var1.field16191 + var2.field16191;
      this.field16192 = var1.field16192 + var2.field16192;
      this.field16193 = var1.field16193 + var2.field16193;
   }

   public final void method9375(Class2363 var1) {
      this.field16185 = this.field16185 + var1.field16185;
      this.field16186 = this.field16186 + var1.field16186;
      this.field16187 = this.field16187 + var1.field16187;
      this.field16188 = this.field16188 + var1.field16188;
      this.field16189 = this.field16189 + var1.field16189;
      this.field16190 = this.field16190 + var1.field16190;
      this.field16191 = this.field16191 + var1.field16191;
      this.field16192 = this.field16192 + var1.field16192;
      this.field16193 = this.field16193 + var1.field16193;
   }

   public final void method9376(Class2363 var1, Class2363 var2) {
      this.field16185 = var1.field16185 - var2.field16185;
      this.field16186 = var1.field16186 - var2.field16186;
      this.field16187 = var1.field16187 - var2.field16187;
      this.field16188 = var1.field16188 - var2.field16188;
      this.field16189 = var1.field16189 - var2.field16189;
      this.field16190 = var1.field16190 - var2.field16190;
      this.field16191 = var1.field16191 - var2.field16191;
      this.field16192 = var1.field16192 - var2.field16192;
      this.field16193 = var1.field16193 - var2.field16193;
   }

   public final void method9377(Class2363 var1) {
      this.field16185 = this.field16185 - var1.field16185;
      this.field16186 = this.field16186 - var1.field16186;
      this.field16187 = this.field16187 - var1.field16187;
      this.field16188 = this.field16188 - var1.field16188;
      this.field16189 = this.field16189 - var1.field16189;
      this.field16190 = this.field16190 - var1.field16190;
      this.field16191 = this.field16191 - var1.field16191;
      this.field16192 = this.field16192 - var1.field16192;
      this.field16193 = this.field16193 - var1.field16193;
   }

   public final void method9378() {
      double var3 = this.field16188;
      this.field16188 = this.field16186;
      this.field16186 = var3;
      var3 = this.field16191;
      this.field16191 = this.field16187;
      this.field16187 = var3;
      var3 = this.field16192;
      this.field16192 = this.field16190;
      this.field16190 = var3;
   }

   public final void method9379(Class2363 var1) {
      if (this == var1) {
         this.method9378();
      } else {
         this.field16185 = var1.field16185;
         this.field16186 = var1.field16188;
         this.field16187 = var1.field16191;
         this.field16188 = var1.field16186;
         this.field16189 = var1.field16189;
         this.field16190 = var1.field16192;
         this.field16191 = var1.field16187;
         this.field16192 = var1.field16190;
         this.field16193 = var1.field16193;
      }
   }

   public final void method9380(Class2389 var1) {
      this.field16185 = 1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276;
      this.field16188 = 2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276);
      this.field16191 = 2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275);
      this.field16186 = 2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276);
      this.field16189 = 1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276;
      this.field16192 = 2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274);
      this.field16187 = 2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275);
      this.field16190 = 2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274);
      this.field16193 = 1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275;
   }

   public final void method9381(Class2410 var1) {
      double var4 = Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385);
      if (!(var4 < 1.110223024E-16)) {
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
         this.field16185 = var16 * var6 * var6 + var14;
         this.field16186 = var16 * var20 - var12 * var10;
         this.field16187 = var16 * var18 + var12 * var8;
         this.field16188 = var16 * var20 + var12 * var10;
         this.field16189 = var16 * var8 * var8 + var14;
         this.field16190 = var16 * var22 - var12 * var6;
         this.field16191 = var16 * var18 - var12 * var8;
         this.field16192 = var16 * var22 + var12 * var6;
         this.field16193 = var16 * var10 * var10 + var14;
      } else {
         this.field16185 = 1.0;
         this.field16186 = 0.0;
         this.field16187 = 0.0;
         this.field16188 = 0.0;
         this.field16189 = 1.0;
         this.field16190 = 0.0;
         this.field16191 = 0.0;
         this.field16192 = 0.0;
         this.field16193 = 1.0;
      }
   }

   public final void method9382(Class2415 var1) {
      this.field16185 = 1.0 - 2.0 * (double)var1.field16390 * (double)var1.field16390 - 2.0 * (double)var1.field16391 * (double)var1.field16391;
      this.field16188 = 2.0 * (double)(var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16191 = 2.0 * (double)(var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16186 = 2.0 * (double)(var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16189 = 1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16391 * (double)var1.field16391;
      this.field16192 = 2.0 * (double)(var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16187 = 2.0 * (double)(var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16190 = 2.0 * (double)(var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16193 = 1.0 - 2.0 * (double)var1.field16389 * (double)var1.field16389 - 2.0 * (double)var1.field16390 * (double)var1.field16390;
   }

   public final void method9383(Class2396 var1) {
      double var4 = Math.sqrt((double)(var1.field16320 * var1.field16320 + var1.field16321 * var1.field16321 + var1.field16322 * var1.field16322));
      if (!(var4 < 1.110223024E-16)) {
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
         this.field16185 = var16 * var6 * var6 + var14;
         this.field16186 = var16 * var20 - var12 * var10;
         this.field16187 = var16 * var18 + var12 * var8;
         this.field16188 = var16 * var20 + var12 * var10;
         this.field16189 = var16 * var8 * var8 + var14;
         this.field16190 = var16 * var22 - var12 * var6;
         this.field16191 = var16 * var18 - var12 * var8;
         this.field16192 = var16 * var22 + var12 * var6;
         this.field16193 = var16 * var10 * var10 + var14;
      } else {
         this.field16185 = 1.0;
         this.field16186 = 0.0;
         this.field16187 = 0.0;
         this.field16188 = 0.0;
         this.field16189 = 1.0;
         this.field16190 = 0.0;
         this.field16191 = 0.0;
         this.field16192 = 0.0;
         this.field16193 = 1.0;
      }
   }

   public final void method9384(Class2372 var1) {
      this.field16185 = (double)var1.field16222;
      this.field16186 = (double)var1.field16223;
      this.field16187 = (double)var1.field16224;
      this.field16188 = (double)var1.field16225;
      this.field16189 = (double)var1.field16226;
      this.field16190 = (double)var1.field16227;
      this.field16191 = (double)var1.field16228;
      this.field16192 = (double)var1.field16229;
      this.field16193 = (double)var1.field16230;
   }

   public final void method9385(Class2363 var1) {
      this.field16185 = var1.field16185;
      this.field16186 = var1.field16186;
      this.field16187 = var1.field16187;
      this.field16188 = var1.field16188;
      this.field16189 = var1.field16189;
      this.field16190 = var1.field16190;
      this.field16191 = var1.field16191;
      this.field16192 = var1.field16192;
      this.field16193 = var1.field16193;
   }

   public final void method9386(double[] var1) {
      this.field16185 = var1[0];
      this.field16186 = var1[1];
      this.field16187 = var1[2];
      this.field16188 = var1[3];
      this.field16189 = var1[4];
      this.field16190 = var1[5];
      this.field16191 = var1[6];
      this.field16192 = var1[7];
      this.field16193 = var1[8];
   }

   public final void method9387(Class2363 var1) {
      this.method9389(var1);
   }

   public final void method9388() {
      this.method9389(this);
   }

   private final void method9389(Class2363 var1) {
      double[] var4 = new double[9];
      int[] var5 = new int[3];
      double[] var6 = new double[]{
         var1.field16185,
         var1.field16186,
         var1.field16187,
         var1.field16188,
         var1.field16189,
         var1.field16190,
         var1.field16191,
         var1.field16192,
         var1.field16193
      };
      if (!method9390(var6, var5)) {
         throw new Class2500(Class8148.method28252("Matrix3d12"));
      } else {
         for (int var7 = 0; var7 < 9; var7++) {
            var4[var7] = 0.0;
         }

         var4[0] = 1.0;
         var4[4] = 1.0;
         var4[8] = 1.0;
         method9391(var6, var5, var4);
         this.field16185 = var4[0];
         this.field16186 = var4[1];
         this.field16187 = var4[2];
         this.field16188 = var4[3];
         this.field16189 = var4[4];
         this.field16190 = var4[5];
         this.field16191 = var4[6];
         this.field16192 = var4[7];
         this.field16193 = var4[8];
      }
   }

   public static boolean method9390(double[] var0, int[] var1) {
      double[] var4 = new double[3];
      int var5 = 0;
      int var6 = 0;
      int var7 = 3;

      while (var7-- != 0) {
         double var9 = 0.0;
         int var8 = 3;

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

      int var28 = 0;

      for (int var27 = 0; var27 < 3; var27++) {
         for (int var23 = 0; var23 < var27; var23++) {
            int var15 = var28 + 3 * var23 + var27;
            double var16 = var0[var15];
            int var18 = var23;
            int var19 = var28 + 3 * var23;

            for (int var20 = var28 + var27; var18-- != 0; var20 += 3) {
               var16 -= var0[var19] * var0[var20];
               var19++;
            }

            var0[var15] = var16;
         }

         double var13 = 0.0;
         var6 = -1;

         for (int var24 = var27; var24 < 3; var24++) {
            int var30 = var28 + 3 * var24 + var27;
            double var32 = var0[var30];
            int var33 = var27;
            int var35 = var28 + 3 * var24;

            for (int var37 = var28 + var27; var33-- != 0; var37 += 3) {
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
            throw new RuntimeException(Class8148.method28252("Matrix3d13"));
         }

         if (var27 != var6) {
            int var34 = 3;
            int var36 = var28 + 3 * var6;
            int var38 = var28 + 3 * var27;

            while (var34-- != 0) {
               double var39 = var0[var36];
               var0[var36++] = var0[var38];
               var0[var38++] = var39;
            }

            var4[var6] = var4[var27];
         }

         var1[var27] = var6;
         if (var0[var28 + 3 * var27 + var27] == 0.0) {
            return false;
         }

         if (var27 != 2) {
            double var40 = 1.0 / var0[var28 + 3 * var27 + var27];
            int var31 = var28 + 3 * (var27 + 1) + var27;

            for (int var25 = 2 - var27; var25-- != 0; var31 += 3) {
               var0[var31] *= var40;
            }
         }
      }

      return true;
   }

   public static void method9391(double[] var0, int[] var1, double[] var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < 3; var6++) {
         int var7 = var6;
         int var8 = -1;

         for (int var9 = 0; var9 < 3; var9++) {
            int var11 = var1[var5 + var9];
            double var12 = var2[var7 + 3 * var11];
            var2[var7 + 3 * var11] = var2[var7 + 3 * var9];
            if (var8 < 0) {
               if (var12 != 0.0) {
                  var8 = var9;
               }
            } else {
               int var10 = var9 * 3;

               for (int var14 = var8; var14 <= var9 - 1; var14++) {
                  var12 -= var0[var10 + var14] * var2[var7 + 3 * var14];
               }
            }

            var2[var7 + 3 * var9] = var12;
         }

         int var15 = 6;
         var2[var7 + 6] = var2[var7 + 6] / var0[var15 + 2];
         var15 -= 3;
         var2[var7 + 3] = (var2[var7 + 3] - var0[var15 + 2] * var2[var7 + 6]) / var0[var15 + 1];
         var15 -= 3;
         var2[var7 + 0] = (var2[var7 + 0] - var0[var15 + 1] * var2[var7 + 3] - var0[var15 + 2] * var2[var7 + 6]) / var0[var15 + 0];
      }
   }

   public final double method9392() {
      return this.field16185 * (this.field16189 * this.field16193 - this.field16190 * this.field16192)
         + this.field16186 * (this.field16190 * this.field16191 - this.field16188 * this.field16193)
         + this.field16187 * (this.field16188 * this.field16192 - this.field16189 * this.field16191);
   }

   public final void method9393(double var1) {
      this.field16185 = var1;
      this.field16186 = 0.0;
      this.field16187 = 0.0;
      this.field16188 = 0.0;
      this.field16189 = var1;
      this.field16190 = 0.0;
      this.field16191 = 0.0;
      this.field16192 = 0.0;
      this.field16193 = var1;
   }

   public final void method9394(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field16185 = 1.0;
      this.field16186 = 0.0;
      this.field16187 = 0.0;
      this.field16188 = 0.0;
      this.field16189 = var7;
      this.field16190 = -var5;
      this.field16191 = 0.0;
      this.field16192 = var5;
      this.field16193 = var7;
   }

   public final void method9395(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field16185 = var7;
      this.field16186 = 0.0;
      this.field16187 = var5;
      this.field16188 = 0.0;
      this.field16189 = 1.0;
      this.field16190 = 0.0;
      this.field16191 = -var5;
      this.field16192 = 0.0;
      this.field16193 = var7;
   }

   public final void method9396(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field16185 = var7;
      this.field16186 = -var5;
      this.field16187 = 0.0;
      this.field16188 = var5;
      this.field16189 = var7;
      this.field16190 = 0.0;
      this.field16191 = 0.0;
      this.field16192 = 0.0;
      this.field16193 = 1.0;
   }

   public final void method9397(double var1) {
      this.field16185 *= var1;
      this.field16186 *= var1;
      this.field16187 *= var1;
      this.field16188 *= var1;
      this.field16189 *= var1;
      this.field16190 *= var1;
      this.field16191 *= var1;
      this.field16192 *= var1;
      this.field16193 *= var1;
   }

   public final void method9398(double var1, Class2363 var3) {
      this.field16185 = var1 * var3.field16185;
      this.field16186 = var1 * var3.field16186;
      this.field16187 = var1 * var3.field16187;
      this.field16188 = var1 * var3.field16188;
      this.field16189 = var1 * var3.field16189;
      this.field16190 = var1 * var3.field16190;
      this.field16191 = var1 * var3.field16191;
      this.field16192 = var1 * var3.field16192;
      this.field16193 = var1 * var3.field16193;
   }

   public final void method9399(Class2363 var1) {
      double var4 = this.field16185 * var1.field16185 + this.field16186 * var1.field16188 + this.field16187 * var1.field16191;
      double var6 = this.field16185 * var1.field16186 + this.field16186 * var1.field16189 + this.field16187 * var1.field16192;
      double var8 = this.field16185 * var1.field16187 + this.field16186 * var1.field16190 + this.field16187 * var1.field16193;
      double var10 = this.field16188 * var1.field16185 + this.field16189 * var1.field16188 + this.field16190 * var1.field16191;
      double var12 = this.field16188 * var1.field16186 + this.field16189 * var1.field16189 + this.field16190 * var1.field16192;
      double var14 = this.field16188 * var1.field16187 + this.field16189 * var1.field16190 + this.field16190 * var1.field16193;
      double var16 = this.field16191 * var1.field16185 + this.field16192 * var1.field16188 + this.field16193 * var1.field16191;
      double var18 = this.field16191 * var1.field16186 + this.field16192 * var1.field16189 + this.field16193 * var1.field16192;
      double var20 = this.field16191 * var1.field16187 + this.field16192 * var1.field16190 + this.field16193 * var1.field16193;
      this.field16185 = var4;
      this.field16186 = var6;
      this.field16187 = var8;
      this.field16188 = var10;
      this.field16189 = var12;
      this.field16190 = var14;
      this.field16191 = var16;
      this.field16192 = var18;
      this.field16193 = var20;
   }

   public final void method9400(Class2363 var1, Class2363 var2) {
      if (this != var1 && this != var2) {
         this.field16185 = var1.field16185 * var2.field16185 + var1.field16186 * var2.field16188 + var1.field16187 * var2.field16191;
         this.field16186 = var1.field16185 * var2.field16186 + var1.field16186 * var2.field16189 + var1.field16187 * var2.field16192;
         this.field16187 = var1.field16185 * var2.field16187 + var1.field16186 * var2.field16190 + var1.field16187 * var2.field16193;
         this.field16188 = var1.field16188 * var2.field16185 + var1.field16189 * var2.field16188 + var1.field16190 * var2.field16191;
         this.field16189 = var1.field16188 * var2.field16186 + var1.field16189 * var2.field16189 + var1.field16190 * var2.field16192;
         this.field16190 = var1.field16188 * var2.field16187 + var1.field16189 * var2.field16190 + var1.field16190 * var2.field16193;
         this.field16191 = var1.field16191 * var2.field16185 + var1.field16192 * var2.field16188 + var1.field16193 * var2.field16191;
         this.field16192 = var1.field16191 * var2.field16186 + var1.field16192 * var2.field16189 + var1.field16193 * var2.field16192;
         this.field16193 = var1.field16191 * var2.field16187 + var1.field16192 * var2.field16190 + var1.field16193 * var2.field16193;
      } else {
         double var5 = var1.field16185 * var2.field16185 + var1.field16186 * var2.field16188 + var1.field16187 * var2.field16191;
         double var7 = var1.field16185 * var2.field16186 + var1.field16186 * var2.field16189 + var1.field16187 * var2.field16192;
         double var9 = var1.field16185 * var2.field16187 + var1.field16186 * var2.field16190 + var1.field16187 * var2.field16193;
         double var11 = var1.field16188 * var2.field16185 + var1.field16189 * var2.field16188 + var1.field16190 * var2.field16191;
         double var13 = var1.field16188 * var2.field16186 + var1.field16189 * var2.field16189 + var1.field16190 * var2.field16192;
         double var15 = var1.field16188 * var2.field16187 + var1.field16189 * var2.field16190 + var1.field16190 * var2.field16193;
         double var17 = var1.field16191 * var2.field16185 + var1.field16192 * var2.field16188 + var1.field16193 * var2.field16191;
         double var19 = var1.field16191 * var2.field16186 + var1.field16192 * var2.field16189 + var1.field16193 * var2.field16192;
         double var21 = var1.field16191 * var2.field16187 + var1.field16192 * var2.field16190 + var1.field16193 * var2.field16193;
         this.field16185 = var5;
         this.field16186 = var7;
         this.field16187 = var9;
         this.field16188 = var11;
         this.field16189 = var13;
         this.field16190 = var15;
         this.field16191 = var17;
         this.field16192 = var19;
         this.field16193 = var21;
      }
   }

   public final void method9401(Class2363 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = this.field16185 * var1.field16185 + this.field16186 * var1.field16188 + this.field16187 * var1.field16191;
      var4[1] = this.field16185 * var1.field16186 + this.field16186 * var1.field16189 + this.field16187 * var1.field16192;
      var4[2] = this.field16185 * var1.field16187 + this.field16186 * var1.field16190 + this.field16187 * var1.field16193;
      var4[3] = this.field16188 * var1.field16185 + this.field16189 * var1.field16188 + this.field16190 * var1.field16191;
      var4[4] = this.field16188 * var1.field16186 + this.field16189 * var1.field16189 + this.field16190 * var1.field16192;
      var4[5] = this.field16188 * var1.field16187 + this.field16189 * var1.field16190 + this.field16190 * var1.field16193;
      var4[6] = this.field16191 * var1.field16185 + this.field16192 * var1.field16188 + this.field16193 * var1.field16191;
      var4[7] = this.field16191 * var1.field16186 + this.field16192 * var1.field16189 + this.field16193 * var1.field16192;
      var4[8] = this.field16191 * var1.field16187 + this.field16192 * var1.field16190 + this.field16193 * var1.field16193;
      method9417(var4, var6, var5);
      this.field16185 = var5[0];
      this.field16186 = var5[1];
      this.field16187 = var5[2];
      this.field16188 = var5[3];
      this.field16189 = var5[4];
      this.field16190 = var5[5];
      this.field16191 = var5[6];
      this.field16192 = var5[7];
      this.field16193 = var5[8];
   }

   public final void method9402(Class2363 var1, Class2363 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[9];
      double[] var7 = new double[3];
      var5[0] = var1.field16185 * var2.field16185 + var1.field16186 * var2.field16188 + var1.field16187 * var2.field16191;
      var5[1] = var1.field16185 * var2.field16186 + var1.field16186 * var2.field16189 + var1.field16187 * var2.field16192;
      var5[2] = var1.field16185 * var2.field16187 + var1.field16186 * var2.field16190 + var1.field16187 * var2.field16193;
      var5[3] = var1.field16188 * var2.field16185 + var1.field16189 * var2.field16188 + var1.field16190 * var2.field16191;
      var5[4] = var1.field16188 * var2.field16186 + var1.field16189 * var2.field16189 + var1.field16190 * var2.field16192;
      var5[5] = var1.field16188 * var2.field16187 + var1.field16189 * var2.field16190 + var1.field16190 * var2.field16193;
      var5[6] = var1.field16191 * var2.field16185 + var1.field16192 * var2.field16188 + var1.field16193 * var2.field16191;
      var5[7] = var1.field16191 * var2.field16186 + var1.field16192 * var2.field16189 + var1.field16193 * var2.field16192;
      var5[8] = var1.field16191 * var2.field16187 + var1.field16192 * var2.field16190 + var1.field16193 * var2.field16193;
      method9417(var5, var7, var6);
      this.field16185 = var6[0];
      this.field16186 = var6[1];
      this.field16187 = var6[2];
      this.field16188 = var6[3];
      this.field16189 = var6[4];
      this.field16190 = var6[5];
      this.field16191 = var6[6];
      this.field16192 = var6[7];
      this.field16193 = var6[8];
   }

   public final void method9403(Class2363 var1, Class2363 var2) {
      if (this != var1 && this != var2) {
         this.field16185 = var1.field16185 * var2.field16185 + var1.field16188 * var2.field16186 + var1.field16191 * var2.field16187;
         this.field16186 = var1.field16185 * var2.field16188 + var1.field16188 * var2.field16189 + var1.field16191 * var2.field16190;
         this.field16187 = var1.field16185 * var2.field16191 + var1.field16188 * var2.field16192 + var1.field16191 * var2.field16193;
         this.field16188 = var1.field16186 * var2.field16185 + var1.field16189 * var2.field16186 + var1.field16192 * var2.field16187;
         this.field16189 = var1.field16186 * var2.field16188 + var1.field16189 * var2.field16189 + var1.field16192 * var2.field16190;
         this.field16190 = var1.field16186 * var2.field16191 + var1.field16189 * var2.field16192 + var1.field16192 * var2.field16193;
         this.field16191 = var1.field16187 * var2.field16185 + var1.field16190 * var2.field16186 + var1.field16193 * var2.field16187;
         this.field16192 = var1.field16187 * var2.field16188 + var1.field16190 * var2.field16189 + var1.field16193 * var2.field16190;
         this.field16193 = var1.field16187 * var2.field16191 + var1.field16190 * var2.field16192 + var1.field16193 * var2.field16193;
      } else {
         double var5 = var1.field16185 * var2.field16185 + var1.field16188 * var2.field16186 + var1.field16191 * var2.field16187;
         double var7 = var1.field16185 * var2.field16188 + var1.field16188 * var2.field16189 + var1.field16191 * var2.field16190;
         double var9 = var1.field16185 * var2.field16191 + var1.field16188 * var2.field16192 + var1.field16191 * var2.field16193;
         double var11 = var1.field16186 * var2.field16185 + var1.field16189 * var2.field16186 + var1.field16192 * var2.field16187;
         double var13 = var1.field16186 * var2.field16188 + var1.field16189 * var2.field16189 + var1.field16192 * var2.field16190;
         double var15 = var1.field16186 * var2.field16191 + var1.field16189 * var2.field16192 + var1.field16192 * var2.field16193;
         double var17 = var1.field16187 * var2.field16185 + var1.field16190 * var2.field16186 + var1.field16193 * var2.field16187;
         double var19 = var1.field16187 * var2.field16188 + var1.field16190 * var2.field16189 + var1.field16193 * var2.field16190;
         double var21 = var1.field16187 * var2.field16191 + var1.field16190 * var2.field16192 + var1.field16193 * var2.field16193;
         this.field16185 = var5;
         this.field16186 = var7;
         this.field16187 = var9;
         this.field16188 = var11;
         this.field16189 = var13;
         this.field16190 = var15;
         this.field16191 = var17;
         this.field16192 = var19;
         this.field16193 = var21;
      }
   }

   public final void method9404(Class2363 var1, Class2363 var2) {
      if (this != var1 && this != var2) {
         this.field16185 = var1.field16185 * var2.field16185 + var1.field16186 * var2.field16186 + var1.field16187 * var2.field16187;
         this.field16186 = var1.field16185 * var2.field16188 + var1.field16186 * var2.field16189 + var1.field16187 * var2.field16190;
         this.field16187 = var1.field16185 * var2.field16191 + var1.field16186 * var2.field16192 + var1.field16187 * var2.field16193;
         this.field16188 = var1.field16188 * var2.field16185 + var1.field16189 * var2.field16186 + var1.field16190 * var2.field16187;
         this.field16189 = var1.field16188 * var2.field16188 + var1.field16189 * var2.field16189 + var1.field16190 * var2.field16190;
         this.field16190 = var1.field16188 * var2.field16191 + var1.field16189 * var2.field16192 + var1.field16190 * var2.field16193;
         this.field16191 = var1.field16191 * var2.field16185 + var1.field16192 * var2.field16186 + var1.field16193 * var2.field16187;
         this.field16192 = var1.field16191 * var2.field16188 + var1.field16192 * var2.field16189 + var1.field16193 * var2.field16190;
         this.field16193 = var1.field16191 * var2.field16191 + var1.field16192 * var2.field16192 + var1.field16193 * var2.field16193;
      } else {
         double var5 = var1.field16185 * var2.field16185 + var1.field16186 * var2.field16186 + var1.field16187 * var2.field16187;
         double var7 = var1.field16185 * var2.field16188 + var1.field16186 * var2.field16189 + var1.field16187 * var2.field16190;
         double var9 = var1.field16185 * var2.field16191 + var1.field16186 * var2.field16192 + var1.field16187 * var2.field16193;
         double var11 = var1.field16188 * var2.field16185 + var1.field16189 * var2.field16186 + var1.field16190 * var2.field16187;
         double var13 = var1.field16188 * var2.field16188 + var1.field16189 * var2.field16189 + var1.field16190 * var2.field16190;
         double var15 = var1.field16188 * var2.field16191 + var1.field16189 * var2.field16192 + var1.field16190 * var2.field16193;
         double var17 = var1.field16191 * var2.field16185 + var1.field16192 * var2.field16186 + var1.field16193 * var2.field16187;
         double var19 = var1.field16191 * var2.field16188 + var1.field16192 * var2.field16189 + var1.field16193 * var2.field16190;
         double var21 = var1.field16191 * var2.field16191 + var1.field16192 * var2.field16192 + var1.field16193 * var2.field16193;
         this.field16185 = var5;
         this.field16186 = var7;
         this.field16187 = var9;
         this.field16188 = var11;
         this.field16189 = var13;
         this.field16190 = var15;
         this.field16191 = var17;
         this.field16192 = var19;
         this.field16193 = var21;
      }
   }

   public final void method9405(Class2363 var1, Class2363 var2) {
      if (this != var1 && this != var2) {
         this.field16185 = var1.field16185 * var2.field16185 + var1.field16188 * var2.field16188 + var1.field16191 * var2.field16191;
         this.field16186 = var1.field16185 * var2.field16186 + var1.field16188 * var2.field16189 + var1.field16191 * var2.field16192;
         this.field16187 = var1.field16185 * var2.field16187 + var1.field16188 * var2.field16190 + var1.field16191 * var2.field16193;
         this.field16188 = var1.field16186 * var2.field16185 + var1.field16189 * var2.field16188 + var1.field16192 * var2.field16191;
         this.field16189 = var1.field16186 * var2.field16186 + var1.field16189 * var2.field16189 + var1.field16192 * var2.field16192;
         this.field16190 = var1.field16186 * var2.field16187 + var1.field16189 * var2.field16190 + var1.field16192 * var2.field16193;
         this.field16191 = var1.field16187 * var2.field16185 + var1.field16190 * var2.field16188 + var1.field16193 * var2.field16191;
         this.field16192 = var1.field16187 * var2.field16186 + var1.field16190 * var2.field16189 + var1.field16193 * var2.field16192;
         this.field16193 = var1.field16187 * var2.field16187 + var1.field16190 * var2.field16190 + var1.field16193 * var2.field16193;
      } else {
         double var5 = var1.field16185 * var2.field16185 + var1.field16188 * var2.field16188 + var1.field16191 * var2.field16191;
         double var7 = var1.field16185 * var2.field16186 + var1.field16188 * var2.field16189 + var1.field16191 * var2.field16192;
         double var9 = var1.field16185 * var2.field16187 + var1.field16188 * var2.field16190 + var1.field16191 * var2.field16193;
         double var11 = var1.field16186 * var2.field16185 + var1.field16189 * var2.field16188 + var1.field16192 * var2.field16191;
         double var13 = var1.field16186 * var2.field16186 + var1.field16189 * var2.field16189 + var1.field16192 * var2.field16192;
         double var15 = var1.field16186 * var2.field16187 + var1.field16189 * var2.field16190 + var1.field16192 * var2.field16193;
         double var17 = var1.field16187 * var2.field16185 + var1.field16190 * var2.field16188 + var1.field16193 * var2.field16191;
         double var19 = var1.field16187 * var2.field16186 + var1.field16190 * var2.field16189 + var1.field16193 * var2.field16192;
         double var21 = var1.field16187 * var2.field16187 + var1.field16190 * var2.field16190 + var1.field16193 * var2.field16193;
         this.field16185 = var5;
         this.field16186 = var7;
         this.field16187 = var9;
         this.field16188 = var11;
         this.field16189 = var13;
         this.field16190 = var15;
         this.field16191 = var17;
         this.field16192 = var19;
         this.field16193 = var21;
      }
   }

   public final void method9406() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method9416(var4, var3);
      this.field16185 = var3[0];
      this.field16186 = var3[1];
      this.field16187 = var3[2];
      this.field16188 = var3[3];
      this.field16189 = var3[4];
      this.field16190 = var3[5];
      this.field16191 = var3[6];
      this.field16192 = var3[7];
      this.field16193 = var3[8];
   }

   public final void method9407(Class2363 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = var1.field16185;
      var4[1] = var1.field16186;
      var4[2] = var1.field16187;
      var4[3] = var1.field16188;
      var4[4] = var1.field16189;
      var4[5] = var1.field16190;
      var4[6] = var1.field16191;
      var4[7] = var1.field16192;
      var4[8] = var1.field16193;
      method9417(var4, var6, var5);
      this.field16185 = var5[0];
      this.field16186 = var5[1];
      this.field16187 = var5[2];
      this.field16188 = var5[3];
      this.field16189 = var5[4];
      this.field16190 = var5[5];
      this.field16191 = var5[6];
      this.field16192 = var5[7];
      this.field16193 = var5[8];
   }

   public final void method9408() {
      double var3 = 1.0 / Math.sqrt(this.field16185 * this.field16185 + this.field16188 * this.field16188 + this.field16191 * this.field16191);
      this.field16185 *= var3;
      this.field16188 *= var3;
      this.field16191 *= var3;
      var3 = 1.0 / Math.sqrt(this.field16186 * this.field16186 + this.field16189 * this.field16189 + this.field16192 * this.field16192);
      this.field16186 *= var3;
      this.field16189 *= var3;
      this.field16192 *= var3;
      this.field16187 = this.field16188 * this.field16192 - this.field16189 * this.field16191;
      this.field16190 = this.field16186 * this.field16191 - this.field16185 * this.field16192;
      this.field16193 = this.field16185 * this.field16189 - this.field16186 * this.field16188;
   }

   public final void method9409(Class2363 var1) {
      double var4 = 1.0 / Math.sqrt(var1.field16185 * var1.field16185 + var1.field16188 * var1.field16188 + var1.field16191 * var1.field16191);
      this.field16185 = var1.field16185 * var4;
      this.field16188 = var1.field16188 * var4;
      this.field16191 = var1.field16191 * var4;
      var4 = 1.0 / Math.sqrt(var1.field16186 * var1.field16186 + var1.field16189 * var1.field16189 + var1.field16192 * var1.field16192);
      this.field16186 = var1.field16186 * var4;
      this.field16189 = var1.field16189 * var4;
      this.field16192 = var1.field16192 * var4;
      this.field16187 = this.field16188 * this.field16192 - this.field16189 * this.field16191;
      this.field16190 = this.field16186 * this.field16191 - this.field16185 * this.field16192;
      this.field16193 = this.field16185 * this.field16189 - this.field16186 * this.field16188;
   }

   public boolean equals(Class2363 var1) {
      try {
         return this.field16185 == var1.field16185
            && this.field16186 == var1.field16186
            && this.field16187 == var1.field16187
            && this.field16188 == var1.field16188
            && this.field16189 == var1.field16189
            && this.field16190 == var1.field16190
            && this.field16191 == var1.field16191
            && this.field16192 == var1.field16192
            && this.field16193 == var1.field16193;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2363 var4 = (Class2363)var1;
         return this.field16185 == var4.field16185
            && this.field16186 == var4.field16186
            && this.field16187 == var4.field16187
            && this.field16188 == var4.field16188
            && this.field16189 == var4.field16189
            && this.field16190 == var4.field16190
            && this.field16191 == var4.field16191
            && this.field16192 == var4.field16192
            && this.field16193 == var4.field16193;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method9410(Class2363 var1, double var2) {
      double var6 = this.field16185 - var1.field16185;
      if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
         var6 = this.field16186 - var1.field16186;
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field16187 - var1.field16187;
            if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
               var6 = this.field16188 - var1.field16188;
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field16189 - var1.field16189;
                  if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                     var6 = this.field16190 - var1.field16190;
                     if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                        var6 = this.field16191 - var1.field16191;
                        if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                           var6 = this.field16192 - var1.field16192;
                           if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                              var6 = this.field16193 - var1.field16193;
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
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + Class9832.method38797(this.field16185);
      var3 = 31L * var3 + Class9832.method38797(this.field16186);
      var3 = 31L * var3 + Class9832.method38797(this.field16187);
      var3 = 31L * var3 + Class9832.method38797(this.field16188);
      var3 = 31L * var3 + Class9832.method38797(this.field16189);
      var3 = 31L * var3 + Class9832.method38797(this.field16190);
      var3 = 31L * var3 + Class9832.method38797(this.field16191);
      var3 = 31L * var3 + Class9832.method38797(this.field16192);
      var3 = 31L * var3 + Class9832.method38797(this.field16193);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method9411() {
      this.field16185 = 0.0;
      this.field16186 = 0.0;
      this.field16187 = 0.0;
      this.field16188 = 0.0;
      this.field16189 = 0.0;
      this.field16190 = 0.0;
      this.field16191 = 0.0;
      this.field16192 = 0.0;
      this.field16193 = 0.0;
   }

   public final void method9412() {
      this.field16185 = -this.field16185;
      this.field16186 = -this.field16186;
      this.field16187 = -this.field16187;
      this.field16188 = -this.field16188;
      this.field16189 = -this.field16189;
      this.field16190 = -this.field16190;
      this.field16191 = -this.field16191;
      this.field16192 = -this.field16192;
      this.field16193 = -this.field16193;
   }

   public final void method9413(Class2363 var1) {
      this.field16185 = -var1.field16185;
      this.field16186 = -var1.field16186;
      this.field16187 = -var1.field16187;
      this.field16188 = -var1.field16188;
      this.field16189 = -var1.field16189;
      this.field16190 = -var1.field16190;
      this.field16191 = -var1.field16191;
      this.field16192 = -var1.field16192;
      this.field16193 = -var1.field16193;
   }

   public final void method9414(Class2367 var1) {
      double var4 = this.field16185 * var1.field16210 + this.field16186 * var1.field16211 + this.field16187 * var1.field16212;
      double var6 = this.field16188 * var1.field16210 + this.field16189 * var1.field16211 + this.field16190 * var1.field16212;
      double var8 = this.field16191 * var1.field16210 + this.field16192 * var1.field16211 + this.field16193 * var1.field16212;
      var1.method9490(var4, var6, var8);
   }

   public final void method9415(Class2367 var1, Class2367 var2) {
      double var5 = this.field16185 * var1.field16210 + this.field16186 * var1.field16211 + this.field16187 * var1.field16212;
      double var7 = this.field16188 * var1.field16210 + this.field16189 * var1.field16211 + this.field16190 * var1.field16212;
      var2.field16212 = this.field16191 * var1.field16210 + this.field16192 * var1.field16211 + this.field16193 * var1.field16212;
      var2.field16210 = var5;
      var2.field16211 = var7;
   }

   public final void method9416(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         this.field16185,
         this.field16186,
         this.field16187,
         this.field16188,
         this.field16189,
         this.field16190,
         this.field16191,
         this.field16192,
         this.field16193
      };
      method9417(var5, var1, var2);
   }

   public static void method9417(double[] var0, double[] var1, double[] var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[9];
      double[] var7 = new double[9];
      double[] var8 = new double[9];
      double[] var11 = new double[9];
      double[] var12 = new double[3];
      double[] var13 = new double[3];
      int var14 = 0;

      for (int var15 = 0; var15 < 9; var15++) {
         var11[var15] = var0[var15];
      }

      if (!(var0[3] * var0[3] < 1.110223024E-16)) {
         if (!(var0[0] * var0[0] < 1.110223024E-16)) {
            double var16 = 1.0 / Math.sqrt(var0[0] * var0[0] + var0[3] * var0[3]);
            double var18 = var0[0] * var16;
            double var20 = var0[3] * var16;
            var7[0] = var18 * var0[0] + var20 * var0[3];
            var7[1] = var18 * var0[1] + var20 * var0[4];
            var7[2] = var18 * var0[2] + var20 * var0[5];
            var0[3] = -var20 * var0[0] + var18 * var0[3];
            var0[4] = -var20 * var0[1] + var18 * var0[4];
            var0[5] = -var20 * var0[2] + var18 * var0[5];
            var0[0] = var7[0];
            var0[1] = var7[1];
            var0[2] = var7[2];
            var5[0] = var18;
            var5[1] = var20;
            var5[2] = 0.0;
            var5[3] = -var20;
            var5[4] = var18;
            var5[5] = 0.0;
            var5[6] = 0.0;
            var5[7] = 0.0;
            var5[8] = 1.0;
         } else {
            var7[0] = var0[0];
            var7[1] = var0[1];
            var7[2] = var0[2];
            var0[0] = var0[3];
            var0[1] = var0[4];
            var0[2] = var0[5];
            var0[3] = -var7[0];
            var0[4] = -var7[1];
            var0[5] = -var7[2];
            var5[0] = 0.0;
            var5[1] = 1.0;
            var5[2] = 0.0;
            var5[3] = -1.0;
            var5[4] = 0.0;
            var5[5] = 0.0;
            var5[6] = 0.0;
            var5[7] = 0.0;
            var5[8] = 1.0;
         }
      } else {
         var5[0] = 1.0;
         var5[1] = 0.0;
         var5[2] = 0.0;
         var5[3] = 0.0;
         var5[4] = 1.0;
         var5[5] = 0.0;
         var5[6] = 0.0;
         var5[7] = 0.0;
         var5[8] = 1.0;
      }

      if (!(var0[6] * var0[6] < 1.110223024E-16)) {
         if (!(var0[0] * var0[0] < 1.110223024E-16)) {
            double var36 = 1.0 / Math.sqrt(var0[0] * var0[0] + var0[6] * var0[6]);
            double var22 = var0[0] * var36;
            double var24 = var0[6] * var36;
            var7[0] = var22 * var0[0] + var24 * var0[6];
            var7[1] = var22 * var0[1] + var24 * var0[7];
            var7[2] = var22 * var0[2] + var24 * var0[8];
            var0[6] = -var24 * var0[0] + var22 * var0[6];
            var0[7] = -var24 * var0[1] + var22 * var0[7];
            var0[8] = -var24 * var0[2] + var22 * var0[8];
            var0[0] = var7[0];
            var0[1] = var7[1];
            var0[2] = var7[2];
            var7[0] = var22 * var5[0];
            var7[1] = var22 * var5[1];
            var5[2] = var24;
            var7[6] = -var5[0] * var24;
            var7[7] = -var5[1] * var24;
            var5[8] = var22;
            var5[0] = var7[0];
            var5[1] = var7[1];
            var5[6] = var7[6];
            var5[7] = var7[7];
         } else {
            var7[0] = var0[0];
            var7[1] = var0[1];
            var7[2] = var0[2];
            var0[0] = var0[6];
            var0[1] = var0[7];
            var0[2] = var0[8];
            var0[6] = -var7[0];
            var0[7] = -var7[1];
            var0[8] = -var7[2];
            var7[0] = var5[0];
            var7[1] = var5[1];
            var7[2] = var5[2];
            var5[0] = var5[6];
            var5[1] = var5[7];
            var5[2] = var5[8];
            var5[6] = -var7[0];
            var5[7] = -var7[1];
            var5[8] = -var7[2];
         }
      }

      if (!(var0[2] * var0[2] < 1.110223024E-16)) {
         if (!(var0[1] * var0[1] < 1.110223024E-16)) {
            double var37 = 1.0 / Math.sqrt(var0[1] * var0[1] + var0[2] * var0[2]);
            double var26 = var0[1] * var37;
            double var28 = var0[2] * var37;
            var7[1] = var26 * var0[1] + var28 * var0[2];
            var0[2] = -var28 * var0[1] + var26 * var0[2];
            var0[1] = var7[1];
            var7[4] = var26 * var0[4] + var28 * var0[5];
            var0[5] = -var28 * var0[4] + var26 * var0[5];
            var0[4] = var7[4];
            var7[7] = var26 * var0[7] + var28 * var0[8];
            var0[8] = -var28 * var0[7] + var26 * var0[8];
            var0[7] = var7[7];
            var6[0] = 1.0;
            var6[1] = 0.0;
            var6[2] = 0.0;
            var6[3] = 0.0;
            var6[4] = var26;
            var6[5] = -var28;
            var6[6] = 0.0;
            var6[7] = var28;
            var6[8] = var26;
         } else {
            var7[2] = var0[2];
            var7[5] = var0[5];
            var7[8] = var0[8];
            var0[2] = -var0[1];
            var0[5] = -var0[4];
            var0[8] = -var0[7];
            var0[1] = var7[2];
            var0[4] = var7[5];
            var0[7] = var7[8];
            var6[0] = 1.0;
            var6[1] = 0.0;
            var6[2] = 0.0;
            var6[3] = 0.0;
            var6[4] = 0.0;
            var6[5] = -1.0;
            var6[6] = 0.0;
            var6[7] = 1.0;
            var6[8] = 0.0;
         }
      } else {
         var6[0] = 1.0;
         var6[1] = 0.0;
         var6[2] = 0.0;
         var6[3] = 0.0;
         var6[4] = 1.0;
         var6[5] = 0.0;
         var6[6] = 0.0;
         var6[7] = 0.0;
         var6[8] = 1.0;
      }

      if (!(var0[7] * var0[7] < 1.110223024E-16)) {
         if (!(var0[4] * var0[4] < 1.110223024E-16)) {
            double var38 = 1.0 / Math.sqrt(var0[4] * var0[4] + var0[7] * var0[7]);
            double var30 = var0[4] * var38;
            double var32 = var0[7] * var38;
            var7[3] = var30 * var0[3] + var32 * var0[6];
            var0[6] = -var32 * var0[3] + var30 * var0[6];
            var0[3] = var7[3];
            var7[4] = var30 * var0[4] + var32 * var0[7];
            var0[7] = -var32 * var0[4] + var30 * var0[7];
            var0[4] = var7[4];
            var7[5] = var30 * var0[5] + var32 * var0[8];
            var0[8] = -var32 * var0[5] + var30 * var0[8];
            var0[5] = var7[5];
            var7[3] = var30 * var5[3] + var32 * var5[6];
            var5[6] = -var32 * var5[3] + var30 * var5[6];
            var5[3] = var7[3];
            var7[4] = var30 * var5[4] + var32 * var5[7];
            var5[7] = -var32 * var5[4] + var30 * var5[7];
            var5[4] = var7[4];
            var7[5] = var30 * var5[5] + var32 * var5[8];
            var5[8] = -var32 * var5[5] + var30 * var5[8];
            var5[5] = var7[5];
         } else {
            var7[3] = var0[3];
            var7[4] = var0[4];
            var7[5] = var0[5];
            var0[3] = var0[6];
            var0[4] = var0[7];
            var0[5] = var0[8];
            var0[6] = -var7[3];
            var0[7] = -var7[4];
            var0[8] = -var7[5];
            var7[3] = var5[3];
            var7[4] = var5[4];
            var7[5] = var5[5];
            var5[3] = var5[6];
            var5[4] = var5[7];
            var5[5] = var5[8];
            var5[6] = -var7[3];
            var5[7] = -var7[4];
            var5[8] = -var7[5];
         }
      }

      var8[0] = var0[0];
      var8[1] = var0[4];
      var8[2] = var0[8];
      var12[0] = var0[1];
      var12[1] = var0[5];
      if (!(var12[0] * var12[0] < 1.110223024E-16) || !(var12[1] * var12[1] < 1.110223024E-16)) {
         method9419(var8, var12, var5, var6);
      }

      var13[0] = var8[0];
      var13[1] = var8[1];
      var13[2] = var8[2];
      if (method9431(Math.abs(var13[0]), 1.0) && method9431(Math.abs(var13[1]), 1.0) && method9431(Math.abs(var13[2]), 1.0)) {
         for (int var34 = 0; var34 < 3; var34++) {
            if (var13[var34] < 0.0) {
               var14++;
            }
         }

         if (var14 == 0 || var14 == 2) {
            var1[0] = var1[1] = var1[2] = 1.0;

            for (int var35 = 0; var35 < 9; var35++) {
               var2[var35] = var11[var35];
            }

            return;
         }
      }

      method9429(var5, var7);
      method9429(var6, var8);
      method9418(var0, var7, var8, var13, var2, var1);
   }

   public static void method9418(double[] var0, double[] var1, double[] var2, double[] var3, double[] var4, double[] var5) {
      int[] var8 = new int[3];
      int[] var9 = new int[3];
      double[] var10 = new double[3];
      double[] var11 = new double[9];
      if (var3[0] < 0.0) {
         var3[0] = -var3[0];
         var2[0] = -var2[0];
         var2[1] = -var2[1];
         var2[2] = -var2[2];
      }

      if (var3[1] < 0.0) {
         var3[1] = -var3[1];
         var2[3] = -var2[3];
         var2[4] = -var2[4];
         var2[5] = -var2[5];
      }

      if (var3[2] < 0.0) {
         var3[2] = -var3[2];
         var2[6] = -var2[6];
         var2[7] = -var2[7];
         var2[8] = -var2[8];
      }

      method9428(var1, var2, var11);
      if (method9431(Math.abs(var3[0]), Math.abs(var3[1])) && method9431(Math.abs(var3[1]), Math.abs(var3[2]))) {
         for (int var12 = 0; var12 < 9; var12++) {
            var4[var12] = var11[var12];
         }

         for (int var17 = 0; var17 < 3; var17++) {
            var5[var17] = var3[var17];
         }
      } else {
         if (!(var3[0] > var3[1])) {
            if (!(var3[1] > var3[2])) {
               var8[0] = 2;
               var8[1] = 1;
               var8[2] = 0;
            } else if (!(var3[2] > var3[0])) {
               var8[0] = 1;
               var8[1] = 0;
               var8[2] = 2;
            } else {
               var8[0] = 1;
               var8[1] = 2;
               var8[2] = 0;
            }
         } else if (!(var3[0] > var3[2])) {
            var8[0] = 2;
            var8[1] = 0;
            var8[2] = 1;
         } else if (!(var3[2] > var3[1])) {
            var8[0] = 0;
            var8[1] = 1;
            var8[2] = 2;
         } else {
            var8[0] = 0;
            var8[1] = 2;
            var8[2] = 1;
         }

         var10[0] = var0[0] * var0[0] + var0[1] * var0[1] + var0[2] * var0[2];
         var10[1] = var0[3] * var0[3] + var0[4] * var0[4] + var0[5] * var0[5];
         var10[2] = var0[6] * var0[6] + var0[7] * var0[7] + var0[8] * var0[8];
         byte var13;
         byte var14;
         byte var15;
         if (!(var10[0] > var10[1])) {
            if (!(var10[1] > var10[2])) {
               var13 = 0;
               var14 = 1;
               var15 = 2;
            } else if (!(var10[2] > var10[0])) {
               var14 = 0;
               var15 = 1;
               var13 = 2;
            } else {
               var14 = 0;
               var13 = 1;
               var15 = 2;
            }
         } else if (!(var10[0] > var10[2])) {
            var13 = 0;
            var15 = 1;
            var14 = 2;
         } else if (!(var10[2] > var10[1])) {
            var15 = 0;
            var14 = 1;
            var13 = 2;
         } else {
            var15 = 0;
            var13 = 1;
            var14 = 2;
         }

         int var16 = var8[var15];
         var5[0] = var3[var16];
         var16 = var8[var14];
         var5[1] = var3[var16];
         var16 = var8[var13];
         var5[2] = var3[var16];
         var16 = var8[var15];
         var4[0] = var11[var16];
         var16 = var8[var15] + 3;
         var4[3] = var11[var16];
         var16 = var8[var15] + 6;
         var4[6] = var11[var16];
         var16 = var8[var14];
         var4[1] = var11[var16];
         var16 = var8[var14] + 3;
         var4[4] = var11[var16];
         var16 = var8[var14] + 6;
         var4[7] = var11[var16];
         var16 = var8[var13];
         var4[2] = var11[var16];
         var16 = var8[var13] + 3;
         var4[5] = var11[var16];
         var16 = var8[var13] + 6;
         var4[8] = var11[var16];
      }
   }

   public static int method9419(double[] var0, double[] var1, double[] var2, double[] var3) {
      double[] var6 = new double[2];
      double[] var7 = new double[2];
      double[] var8 = new double[2];
      double[] var9 = new double[2];
      double[] var10 = new double[9];
      double var11 = 1.0;
      double var13 = -1.0;
      boolean var15 = false;
      byte var16 = 1;
      if (Math.abs(var1[1]) < 4.89E-15 || Math.abs(var1[0]) < 4.89E-15) {
         var15 = true;
      }

      for (int var17 = 0; var17 < 10 && !var15; var17++) {
         double var22 = method9423(var0[1], var1[1], var0[2]);
         double var24 = (Math.abs(var0[0]) - var22) * (method9422(var11, var0[0]) + var22 / var0[0]);
         double var26 = var1[0];
         double var28 = method9425(var24, var26, var9, var7, 0, var16);
         var24 = var7[0] * var0[0] + var9[0] * var1[0];
         var1[0] = var7[0] * var1[0] - var9[0] * var0[0];
         var26 = var9[0] * var0[1];
         var0[1] = var7[0] * var0[1];
         var28 = method9425(var24, var26, var8, var6, 0, var16);
         var16 = 0;
         var0[0] = var28;
         var24 = var6[0] * var1[0] + var8[0] * var0[1];
         var0[1] = var6[0] * var0[1] - var8[0] * var1[0];
         var26 = var8[0] * var1[1];
         var1[1] = var6[0] * var1[1];
         var28 = method9425(var24, var26, var9, var7, 1, var16);
         var1[0] = var28;
         var24 = var7[1] * var0[1] + var9[1] * var1[1];
         var1[1] = var7[1] * var1[1] - var9[1] * var0[1];
         var26 = var9[1] * var0[2];
         var0[2] = var7[1] * var0[2];
         var28 = method9425(var24, var26, var8, var6, 1, var16);
         var0[1] = var28;
         var24 = var6[1] * var1[1] + var8[1] * var0[2];
         var0[2] = var6[1] * var0[2] - var8[1] * var1[1];
         var1[1] = var24;
         double var18 = var2[0];
         var2[0] = var6[0] * var18 + var8[0] * var2[3];
         var2[3] = -var8[0] * var18 + var6[0] * var2[3];
         var18 = var2[1];
         var2[1] = var6[0] * var18 + var8[0] * var2[4];
         var2[4] = -var8[0] * var18 + var6[0] * var2[4];
         var18 = var2[2];
         var2[2] = var6[0] * var18 + var8[0] * var2[5];
         var2[5] = -var8[0] * var18 + var6[0] * var2[5];
         var18 = var2[3];
         var2[3] = var6[1] * var18 + var8[1] * var2[6];
         var2[6] = -var8[1] * var18 + var6[1] * var2[6];
         var18 = var2[4];
         var2[4] = var6[1] * var18 + var8[1] * var2[7];
         var2[7] = -var8[1] * var18 + var6[1] * var2[7];
         var18 = var2[5];
         var2[5] = var6[1] * var18 + var8[1] * var2[8];
         var2[8] = -var8[1] * var18 + var6[1] * var2[8];
         double var20 = var3[0];
         var3[0] = var7[0] * var20 + var9[0] * var3[1];
         var3[1] = -var9[0] * var20 + var7[0] * var3[1];
         var20 = var3[3];
         var3[3] = var7[0] * var20 + var9[0] * var3[4];
         var3[4] = -var9[0] * var20 + var7[0] * var3[4];
         var20 = var3[6];
         var3[6] = var7[0] * var20 + var9[0] * var3[7];
         var3[7] = -var9[0] * var20 + var7[0] * var3[7];
         var20 = var3[1];
         var3[1] = var7[1] * var20 + var9[1] * var3[2];
         var3[2] = -var9[1] * var20 + var7[1] * var3[2];
         var20 = var3[4];
         var3[4] = var7[1] * var20 + var9[1] * var3[5];
         var3[5] = -var9[1] * var20 + var7[1] * var3[5];
         var20 = var3[7];
         var3[7] = var7[1] * var20 + var9[1] * var3[8];
         var3[8] = -var9[1] * var20 + var7[1] * var3[8];
         var10[0] = var0[0];
         var10[1] = var1[0];
         var10[2] = 0.0;
         var10[3] = 0.0;
         var10[4] = var0[1];
         var10[5] = var1[1];
         var10[6] = 0.0;
         var10[7] = 0.0;
         var10[8] = var0[2];
         if (Math.abs(var1[1]) < 4.89E-15 || Math.abs(var1[0]) < 4.89E-15) {
            var15 = true;
         }
      }

      if (!(Math.abs(var1[1]) < 4.89E-15)) {
         method9424(var0[1], var1[1], var0[2], var0, var8, var6, var9, var7, 1);
         double var35 = var2[3];
         var2[3] = var6[0] * var35 + var8[0] * var2[6];
         var2[6] = -var8[0] * var35 + var6[0] * var2[6];
         var35 = var2[4];
         var2[4] = var6[0] * var35 + var8[0] * var2[7];
         var2[7] = -var8[0] * var35 + var6[0] * var2[7];
         var35 = var2[5];
         var2[5] = var6[0] * var35 + var8[0] * var2[8];
         var2[8] = -var8[0] * var35 + var6[0] * var2[8];
         double var46 = var3[1];
         var3[1] = var7[0] * var46 + var9[0] * var3[2];
         var3[2] = -var9[0] * var46 + var7[0] * var3[2];
         var46 = var3[4];
         var3[4] = var7[0] * var46 + var9[0] * var3[5];
         var3[5] = -var9[0] * var46 + var7[0] * var3[5];
         var46 = var3[7];
         var3[7] = var7[0] * var46 + var9[0] * var3[8];
         var3[8] = -var9[0] * var46 + var7[0] * var3[8];
      } else {
         method9424(var0[0], var1[0], var0[1], var0, var8, var6, var9, var7, 0);
         double var38 = var2[0];
         var2[0] = var6[0] * var38 + var8[0] * var2[3];
         var2[3] = -var8[0] * var38 + var6[0] * var2[3];
         var38 = var2[1];
         var2[1] = var6[0] * var38 + var8[0] * var2[4];
         var2[4] = -var8[0] * var38 + var6[0] * var2[4];
         var38 = var2[2];
         var2[2] = var6[0] * var38 + var8[0] * var2[5];
         var2[5] = -var8[0] * var38 + var6[0] * var2[5];
         double var49 = var3[0];
         var3[0] = var7[0] * var49 + var9[0] * var3[1];
         var3[1] = -var9[0] * var49 + var7[0] * var3[1];
         var49 = var3[3];
         var3[3] = var7[0] * var49 + var9[0] * var3[4];
         var3[4] = -var9[0] * var49 + var7[0] * var3[4];
         var49 = var3[6];
         var3[6] = var7[0] * var49 + var9[0] * var3[7];
         var3[7] = -var9[0] * var49 + var7[0] * var3[7];
      }

      return 0;
   }

   public static double method9420(double var0, double var2) {
      return !(var0 > var2) ? var2 : var0;
   }

   public static double method9421(double var0, double var2) {
      return !(var0 < var2) ? var2 : var0;
   }

   public static double method9422(double var0, double var2) {
      double var6 = !(var0 >= 0.0) ? -var0 : var0;
      return !(var2 >= 0.0) ? -var6 : var6;
   }

   public static double method9423(double var0, double var2, double var4) {
      double var8 = Math.abs(var0);
      double var10 = Math.abs(var2);
      double var12 = Math.abs(var4);
      double var14 = method9421(var8, var12);
      double var16 = method9420(var8, var12);
      double var38;
      if (var14 != 0.0) {
         if (!(var10 < var16)) {
            double var18 = var16 / var10;
            if (var18 != 0.0) {
               double var20 = var14 / var16 + 1.0;
               double var22 = (var16 - var14) / var16;
               double var24 = var20 * var18;
               double var26 = var22 * var18;
               double var28 = 1.0 / (Math.sqrt(var24 * var24 + 1.0) + Math.sqrt(var26 * var26 + 1.0));
               var38 = var14 * var28 * var18;
               var38 += var38;
            } else {
               var38 = var14 * var16 / var10;
            }
         } else {
            double var33 = var14 / var16 + 1.0;
            double var34 = (var16 - var14) / var16;
            double var35 = var10 / var16;
            double var32 = var35 * var35;
            double var37 = 2.0 / (Math.sqrt(var33 * var33 + var32) + Math.sqrt(var34 * var34 + var32));
            var38 = var14 * var37;
         }
      } else {
         var38 = 0.0;
         if (var16 != 0.0) {
            double var36 = method9421(var16, var10) / method9420(var16, var10);
         }
      }

      return var38;
   }

   public static int method9424(double var0, double var2, double var4, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
      double var14 = 2.0;
      double var16 = 1.0;
      double var18 = var6[0];
      double var20 = var6[1];
      double var22 = 0.0;
      double var24 = 0.0;
      double var26 = 0.0;
      double var28 = 0.0;
      double var30 = 0.0;
      double var32 = var0;
      double var34 = Math.abs(var0);
      double var36 = var4;
      double var38 = Math.abs(var4);
      byte var40 = 1;
      boolean var41;
      if (!(var38 > var34)) {
         var41 = false;
      } else {
         var41 = true;
      }

      if (var41) {
         var40 = 3;
         var32 = var4;
         var36 = var0;
         double var47 = var34;
         var34 = var38;
         var38 = var47;
      }

      double var44 = Math.abs(var2);
      if (var44 != 0.0) {
         boolean var46 = true;
         if (var44 > var34) {
            var40 = 2;
            if (var34 / var44 < 1.110223024E-16) {
               var46 = false;
               var18 = var44;
               if (!(var38 > 1.0)) {
                  var20 = var34 / var44 * var38;
               } else {
                  var20 = var34 / (var44 / var38);
               }

               var22 = 1.0;
               var26 = var36 / var2;
               var28 = 1.0;
               var24 = var32 / var2;
            }
         }

         if (var46) {
            double var49 = var34 - var38;
            double var51;
            if (var49 != var34) {
               var51 = var49 / var34;
            } else {
               var51 = 1.0;
            }

            double var53 = var2 / var32;
            double var55 = 2.0 - var51;
            double var57 = var53 * var53;
            double var59 = var55 * var55;
            double var61 = Math.sqrt(var59 + var57);
            double var63;
            if (var51 != 0.0) {
               var63 = Math.sqrt(var51 * var51 + var57);
            } else {
               var63 = Math.abs(var53);
            }

            double var65 = (var61 + var63) * 0.5;
            if (var44 > var34) {
               var40 = 2;
               if (var34 / var44 < 1.110223024E-16) {
                  var46 = false;
                  var18 = var44;
                  if (!(var38 > 1.0)) {
                     var20 = var34 / var44 * var38;
                  } else {
                     var20 = var34 / (var44 / var38);
                  }

                  var22 = 1.0;
                  var26 = var36 / var2;
                  var28 = 1.0;
                  var24 = var32 / var2;
               }
            }

            if (var46) {
               var49 = var34 - var38;
               if (var49 != var34) {
                  var51 = var49 / var34;
               } else {
                  var51 = 1.0;
               }

               var53 = var2 / var32;
               var55 = 2.0 - var51;
               var57 = var53 * var53;
               var59 = var55 * var55;
               var61 = Math.sqrt(var59 + var57);
               if (var51 != 0.0) {
                  var63 = Math.sqrt(var51 * var51 + var57);
               } else {
                  var63 = Math.abs(var53);
               }

               var65 = (var61 + var63) * 0.5;
               var20 = var38 / var65;
               var18 = var34 * var65;
               if (var57 != 0.0) {
                  var55 = (var53 / (var61 + var55) + var53 / (var63 + var51)) * (var65 + 1.0);
               } else if (var51 != 0.0) {
                  var55 = var2 / method9422(var49, var32) + var53 / var55;
               } else {
                  var55 = method9422(var14, var32) * method9422(var16, var2);
               }

               var51 = Math.sqrt(var55 * var55 + 4.0);
               var24 = 2.0 / var51;
               var28 = var55 / var51;
               var22 = (var24 + var28 * var53) / var65;
               var26 = var36 / var32 * var28 / var65;
            }
         }

         if (!var41) {
            var8[0] = var22;
            var7[0] = var26;
            var10[0] = var24;
            var9[0] = var28;
         } else {
            var8[0] = var28;
            var7[0] = var24;
            var10[0] = var26;
            var9[0] = var22;
         }

         if (var40 == 1) {
            var30 = method9422(var16, var10[0]) * method9422(var16, var8[0]) * method9422(var16, var0);
         }

         if (var40 == 2) {
            var30 = method9422(var16, var9[0]) * method9422(var16, var8[0]) * method9422(var16, var2);
         }

         if (var40 == 3) {
            var30 = method9422(var16, var9[0]) * method9422(var16, var7[0]) * method9422(var16, var4);
         }

         var6[var11] = method9422(var18, var30);
         double var67 = var30 * method9422(var16, var0) * method9422(var16, var4);
         var6[var11 + 1] = method9422(var20, var67);
      } else {
         var6[1] = var38;
         var6[0] = var34;
         var22 = 1.0;
         var24 = 1.0;
         var26 = 0.0;
         var28 = 0.0;
      }

      return 0;
   }

   public static double method9425(double var0, double var2, double[] var4, double[] var5, int var6, int var7) {
      double var16;
      double var18;
      double var20;
      if (var2 != 0.0) {
         if (var0 != 0.0) {
            double var10 = var0;
            double var12 = var2;
            double var14 = method9420(Math.abs(var0), Math.abs(var2));
            if (!(var14 >= 4.994797680505588E145)) {
               if (!(var14 <= 2.002083095183101E-146)) {
                  var16 = Math.sqrt(var0 * var0 + var2 * var2);
                  var18 = var0 / var16;
                  var20 = var2 / var16;
               } else {
                  int var25;
                  for (var25 = 0; var14 <= 2.002083095183101E-146; var14 = method9420(Math.abs(var10), Math.abs(var12))) {
                     var25++;
                     var10 *= 4.994797680505588E145;
                     var12 *= 4.994797680505588E145;
                  }

                  var16 = Math.sqrt(var10 * var10 + var12 * var12);
                  var18 = var10 / var16;
                  var20 = var12 / var16;

                  for (int var26 = 1; var26 <= var25; var26++) {
                     var16 *= 2.002083095183101E-146;
                  }
               }
            } else {
               int var22;
               for (var22 = 0; var14 >= 4.994797680505588E145; var14 = method9420(Math.abs(var10), Math.abs(var12))) {
                  var22++;
                  var10 *= 2.002083095183101E-146;
                  var12 *= 2.002083095183101E-146;
               }

               var16 = Math.sqrt(var10 * var10 + var12 * var12);
               var18 = var10 / var16;
               var20 = var12 / var16;

               for (int var24 = 1; var24 <= var22; var24++) {
                  var16 *= 4.994797680505588E145;
               }
            }

            if (Math.abs(var0) > Math.abs(var2) && var18 < 0.0) {
               var18 = -var18;
               var20 = -var20;
               var16 = -var16;
            }
         } else {
            var18 = 0.0;
            var20 = 1.0;
            var16 = var2;
         }
      } else {
         var18 = 1.0;
         var20 = 0.0;
         var16 = var0;
      }

      var4[var6] = var20;
      var5[var6] = var18;
      return var16;
   }

   public static void method9426(double[] var0) {
      for (int var3 = 0; var3 < 3; var3++) {
         System.out.println(var0[var3 * 3 + 0] + " " + var0[var3 * 3 + 1] + " " + var0[var3 * 3 + 2] + "\n");
      }
   }

   public static void method9427(double[] var0) {
      double var3 = var0[0] * var0[4] * var0[8]
         + var0[1] * var0[5] * var0[6]
         + var0[2] * var0[3] * var0[7]
         - var0[2] * var0[4] * var0[6]
         - var0[0] * var0[5] * var0[7]
         - var0[1] * var0[3] * var0[8];
      System.out.println("det= " + var3);
   }

   public static void method9428(double[] var0, double[] var1, double[] var2) {
      double[] var5 = new double[]{
         var0[0] * var1[0] + var0[1] * var1[3] + var0[2] * var1[6],
         var0[0] * var1[1] + var0[1] * var1[4] + var0[2] * var1[7],
         var0[0] * var1[2] + var0[1] * var1[5] + var0[2] * var1[8],
         var0[3] * var1[0] + var0[4] * var1[3] + var0[5] * var1[6],
         var0[3] * var1[1] + var0[4] * var1[4] + var0[5] * var1[7],
         var0[3] * var1[2] + var0[4] * var1[5] + var0[5] * var1[8],
         var0[6] * var1[0] + var0[7] * var1[3] + var0[8] * var1[6],
         var0[6] * var1[1] + var0[7] * var1[4] + var0[8] * var1[7],
         var0[6] * var1[2] + var0[7] * var1[5] + var0[8] * var1[8]
      };

      for (int var6 = 0; var6 < 9; var6++) {
         var2[var6] = var5[var6];
      }
   }

   public static void method9429(double[] var0, double[] var1) {
      var1[0] = var0[0];
      var1[1] = var0[3];
      var1[2] = var0[6];
      var1[3] = var0[1];
      var1[4] = var0[4];
      var1[5] = var0[7];
      var1[6] = var0[2];
      var1[7] = var0[5];
      var1[8] = var0[8];
   }

   public static double method9430(double[] var0) {
      if (!(var0[0] > var0[1])) {
         return !(var0[1] > var0[2]) ? var0[2] : var0[1];
      } else {
         return !(var0[0] > var0[2]) ? var0[2] : var0[0];
      }
   }

   private static final boolean method9431(double var0, double var2) {
      if (var0 != var2) {
         double var6 = Math.abs(var0 - var2);
         double var8 = Math.abs(var0);
         double var10 = Math.abs(var2);
         double var12 = !(var8 >= var10) ? var10 : var8;
         return !(var6 < 1.0E-6) ? var6 / var12 < 1.0E-4 : true;
      } else {
         return true;
      }
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (Class2363)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final double method9432() {
      return this.field16185;
   }

   public final void method9433(double var1) {
      this.field16185 = var1;
   }

   public final double method9434() {
      return this.field16186;
   }

   public final void method9435(double var1) {
      this.field16186 = var1;
   }

   public final double method9436() {
      return this.field16187;
   }

   public final void method9437(double var1) {
      this.field16187 = var1;
   }

   public final double method9438() {
      return this.field16188;
   }

   public final void method9439(double var1) {
      this.field16188 = var1;
   }

   public final double method9440() {
      return this.field16189;
   }

   public final void method9441(double var1) {
      this.field16189 = var1;
   }

   public final double method9442() {
      return this.field16190;
   }

   public final void method9443(double var1) {
      this.field16190 = var1;
   }

   public final double method9444() {
      return this.field16191;
   }

   public final void method9445(double var1) {
      this.field16191 = var1;
   }

   public final double method9446() {
      return this.field16192;
   }

   public final void method9447(double var1) {
      this.field16192 = var1;
   }

   public final double method9448() {
      return this.field16193;
   }

   public final void method9449(double var1) {
      this.field16193 = var1;
   }
}
