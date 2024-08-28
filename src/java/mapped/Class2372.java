package mapped;

import java.io.Serializable;

public class Class2372 implements Serializable, Cloneable {
   public static final long field16221 = 329697160112089834L;
   public float field16222;
   public float field16223;
   public float field16224;
   public float field16225;
   public float field16226;
   public float field16227;
   public float field16228;
   public float field16229;
   public float field16230;
   private static final double field16231 = 1.0E-8;

   public Class2372(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.field16222 = var1;
      this.field16223 = var2;
      this.field16224 = var3;
      this.field16225 = var4;
      this.field16226 = var5;
      this.field16227 = var6;
      this.field16228 = var7;
      this.field16229 = var8;
      this.field16230 = var9;
   }

   public Class2372(float[] var1) {
      this.field16222 = var1[0];
      this.field16223 = var1[1];
      this.field16224 = var1[2];
      this.field16225 = var1[3];
      this.field16226 = var1[4];
      this.field16227 = var1[5];
      this.field16228 = var1[6];
      this.field16229 = var1[7];
      this.field16230 = var1[8];
   }

   public Class2372(Class2363 var1) {
      this.field16222 = (float)var1.field16185;
      this.field16223 = (float)var1.field16186;
      this.field16224 = (float)var1.field16187;
      this.field16225 = (float)var1.field16188;
      this.field16226 = (float)var1.field16189;
      this.field16227 = (float)var1.field16190;
      this.field16228 = (float)var1.field16191;
      this.field16229 = (float)var1.field16192;
      this.field16230 = (float)var1.field16193;
   }

   public Class2372(Class2372 var1) {
      this.field16222 = var1.field16222;
      this.field16223 = var1.field16223;
      this.field16224 = var1.field16224;
      this.field16225 = var1.field16225;
      this.field16226 = var1.field16226;
      this.field16227 = var1.field16227;
      this.field16228 = var1.field16228;
      this.field16229 = var1.field16229;
      this.field16230 = var1.field16230;
   }

   public Class2372() {
      this.field16222 = 0.0F;
      this.field16223 = 0.0F;
      this.field16224 = 0.0F;
      this.field16225 = 0.0F;
      this.field16226 = 0.0F;
      this.field16227 = 0.0F;
      this.field16228 = 0.0F;
      this.field16229 = 0.0F;
      this.field16230 = 0.0F;
   }

   @Override
   public String toString() {
      return this.field16222
         + ", "
         + this.field16223
         + ", "
         + this.field16224
         + "\n"
         + this.field16225
         + ", "
         + this.field16226
         + ", "
         + this.field16227
         + "\n"
         + this.field16228
         + ", "
         + this.field16229
         + ", "
         + this.field16230
         + "\n";
   }

   public final void method9555() {
      this.field16222 = 1.0F;
      this.field16223 = 0.0F;
      this.field16224 = 0.0F;
      this.field16225 = 0.0F;
      this.field16226 = 1.0F;
      this.field16227 = 0.0F;
      this.field16228 = 0.0F;
      this.field16229 = 0.0F;
      this.field16230 = 1.0F;
   }

   public final void method9556(float var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method9614(var5, var4);
      this.field16222 = (float)(var4[0] * (double)var1);
      this.field16223 = (float)(var4[1] * (double)var1);
      this.field16224 = (float)(var4[2] * (double)var1);
      this.field16225 = (float)(var4[3] * (double)var1);
      this.field16226 = (float)(var4[4] * (double)var1);
      this.field16227 = (float)(var4[5] * (double)var1);
      this.field16228 = (float)(var4[6] * (double)var1);
      this.field16229 = (float)(var4[7] * (double)var1);
      this.field16230 = (float)(var4[8] * (double)var1);
   }

   public final void method9557(int var1, int var2, float var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field16222 = var3;
                  return;
               case 1:
                  this.field16223 = var3;
                  return;
               case 2:
                  this.field16224 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field16225 = var3;
                  return;
               case 1:
                  this.field16226 = var3;
                  return;
               case 2:
                  this.field16227 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field16228 = var3;
                  return;
               case 1:
                  this.field16229 = var3;
                  return;
               case 2:
                  this.field16230 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f0"));
      }
   }

   public final void method9558(int var1, Class6 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f1"));
            }

            var2.field8 = this.field16228;
            var2.field9 = this.field16229;
            var2.field10 = this.field16230;
         } else {
            var2.field8 = this.field16225;
            var2.field9 = this.field16226;
            var2.field10 = this.field16227;
         }
      } else {
         var2.field8 = this.field16222;
         var2.field9 = this.field16223;
         var2.field10 = this.field16224;
      }
   }

   public final void method9559(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f1"));
            }

            var2[0] = this.field16228;
            var2[1] = this.field16229;
            var2[2] = this.field16230;
         } else {
            var2[0] = this.field16225;
            var2[1] = this.field16226;
            var2[2] = this.field16227;
         }
      } else {
         var2[0] = this.field16222;
         var2[1] = this.field16223;
         var2[2] = this.field16224;
      }
   }

   public final void method9560(int var1, Class6 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f3"));
            }

            var2.field8 = this.field16224;
            var2.field9 = this.field16227;
            var2.field10 = this.field16230;
         } else {
            var2.field8 = this.field16223;
            var2.field9 = this.field16226;
            var2.field10 = this.field16229;
         }
      } else {
         var2.field8 = this.field16222;
         var2.field9 = this.field16225;
         var2.field10 = this.field16228;
      }
   }

   public final void method9561(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f3"));
            }

            var2[0] = this.field16224;
            var2[1] = this.field16227;
            var2[2] = this.field16230;
         } else {
            var2[0] = this.field16223;
            var2[1] = this.field16226;
            var2[2] = this.field16229;
         }
      } else {
         var2[0] = this.field16222;
         var2[1] = this.field16225;
         var2[2] = this.field16228;
      }
   }

   public final float method9562(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field16222;
               case 1:
                  return this.field16223;
               case 2:
                  return this.field16224;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f5"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field16225;
               case 1:
                  return this.field16226;
               case 2:
                  return this.field16227;
               default:
                  throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f5"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field16228;
               case 1:
                  return this.field16229;
               case 2:
                  return this.field16230;
            }
      }

      throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f5"));
   }

   public final void method9563(int var1, float var2, float var3, float var4) {
      switch (var1) {
         case 0:
            this.field16222 = var2;
            this.field16223 = var3;
            this.field16224 = var4;
            break;
         case 1:
            this.field16225 = var2;
            this.field16226 = var3;
            this.field16227 = var4;
            break;
         case 2:
            this.field16228 = var2;
            this.field16229 = var3;
            this.field16230 = var4;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f6"));
      }
   }

   public final void method9564(int var1, Class6 var2) {
      switch (var1) {
         case 0:
            this.field16222 = var2.field8;
            this.field16223 = var2.field9;
            this.field16224 = var2.field10;
            break;
         case 1:
            this.field16225 = var2.field8;
            this.field16226 = var2.field9;
            this.field16227 = var2.field10;
            break;
         case 2:
            this.field16228 = var2.field8;
            this.field16229 = var2.field9;
            this.field16230 = var2.field10;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f6"));
      }
   }

   public final void method9565(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field16222 = var2[0];
            this.field16223 = var2[1];
            this.field16224 = var2[2];
            break;
         case 1:
            this.field16225 = var2[0];
            this.field16226 = var2[1];
            this.field16227 = var2[2];
            break;
         case 2:
            this.field16228 = var2[0];
            this.field16229 = var2[1];
            this.field16230 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f6"));
      }
   }

   public final void method9566(int var1, float var2, float var3, float var4) {
      switch (var1) {
         case 0:
            this.field16222 = var2;
            this.field16225 = var3;
            this.field16228 = var4;
            break;
         case 1:
            this.field16223 = var2;
            this.field16226 = var3;
            this.field16229 = var4;
            break;
         case 2:
            this.field16224 = var2;
            this.field16227 = var3;
            this.field16230 = var4;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f9"));
      }
   }

   public final void method9567(int var1, Class6 var2) {
      switch (var1) {
         case 0:
            this.field16222 = var2.field8;
            this.field16225 = var2.field9;
            this.field16228 = var2.field10;
            break;
         case 1:
            this.field16223 = var2.field8;
            this.field16226 = var2.field9;
            this.field16229 = var2.field10;
            break;
         case 2:
            this.field16224 = var2.field8;
            this.field16227 = var2.field9;
            this.field16230 = var2.field10;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f9"));
      }
   }

   public final void method9568(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field16222 = var2[0];
            this.field16225 = var2[1];
            this.field16228 = var2[2];
            break;
         case 1:
            this.field16223 = var2[0];
            this.field16226 = var2[1];
            this.field16229 = var2[2];
            break;
         case 2:
            this.field16224 = var2[0];
            this.field16227 = var2[1];
            this.field16230 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(Class8148.method28252("Matrix3f9"));
      }
   }

   public final float method9569() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method9614(var4, var3);
      return (float)Class2363.method9430(var4);
   }

   public final void method9570(float var1) {
      this.field16222 += var1;
      this.field16223 += var1;
      this.field16224 += var1;
      this.field16225 += var1;
      this.field16226 += var1;
      this.field16227 += var1;
      this.field16228 += var1;
      this.field16229 += var1;
      this.field16230 += var1;
   }

   public final void method9571(float var1, Class2372 var2) {
      this.field16222 = var2.field16222 + var1;
      this.field16223 = var2.field16223 + var1;
      this.field16224 = var2.field16224 + var1;
      this.field16225 = var2.field16225 + var1;
      this.field16226 = var2.field16226 + var1;
      this.field16227 = var2.field16227 + var1;
      this.field16228 = var2.field16228 + var1;
      this.field16229 = var2.field16229 + var1;
      this.field16230 = var2.field16230 + var1;
   }

   public final void method9572(Class2372 var1, Class2372 var2) {
      this.field16222 = var1.field16222 + var2.field16222;
      this.field16223 = var1.field16223 + var2.field16223;
      this.field16224 = var1.field16224 + var2.field16224;
      this.field16225 = var1.field16225 + var2.field16225;
      this.field16226 = var1.field16226 + var2.field16226;
      this.field16227 = var1.field16227 + var2.field16227;
      this.field16228 = var1.field16228 + var2.field16228;
      this.field16229 = var1.field16229 + var2.field16229;
      this.field16230 = var1.field16230 + var2.field16230;
   }

   public final void method9573(Class2372 var1) {
      this.field16222 = this.field16222 + var1.field16222;
      this.field16223 = this.field16223 + var1.field16223;
      this.field16224 = this.field16224 + var1.field16224;
      this.field16225 = this.field16225 + var1.field16225;
      this.field16226 = this.field16226 + var1.field16226;
      this.field16227 = this.field16227 + var1.field16227;
      this.field16228 = this.field16228 + var1.field16228;
      this.field16229 = this.field16229 + var1.field16229;
      this.field16230 = this.field16230 + var1.field16230;
   }

   public final void method9574(Class2372 var1, Class2372 var2) {
      this.field16222 = var1.field16222 - var2.field16222;
      this.field16223 = var1.field16223 - var2.field16223;
      this.field16224 = var1.field16224 - var2.field16224;
      this.field16225 = var1.field16225 - var2.field16225;
      this.field16226 = var1.field16226 - var2.field16226;
      this.field16227 = var1.field16227 - var2.field16227;
      this.field16228 = var1.field16228 - var2.field16228;
      this.field16229 = var1.field16229 - var2.field16229;
      this.field16230 = var1.field16230 - var2.field16230;
   }

   public final void method9575(Class2372 var1) {
      this.field16222 = this.field16222 - var1.field16222;
      this.field16223 = this.field16223 - var1.field16223;
      this.field16224 = this.field16224 - var1.field16224;
      this.field16225 = this.field16225 - var1.field16225;
      this.field16226 = this.field16226 - var1.field16226;
      this.field16227 = this.field16227 - var1.field16227;
      this.field16228 = this.field16228 - var1.field16228;
      this.field16229 = this.field16229 - var1.field16229;
      this.field16230 = this.field16230 - var1.field16230;
   }

   public final void method9576() {
      float var3 = this.field16225;
      this.field16225 = this.field16223;
      this.field16223 = var3;
      var3 = this.field16228;
      this.field16228 = this.field16224;
      this.field16224 = var3;
      var3 = this.field16229;
      this.field16229 = this.field16227;
      this.field16227 = var3;
   }

   public final void method9577(Class2372 var1) {
      if (this == var1) {
         this.method9576();
      } else {
         this.field16222 = var1.field16222;
         this.field16223 = var1.field16225;
         this.field16224 = var1.field16228;
         this.field16225 = var1.field16223;
         this.field16226 = var1.field16226;
         this.field16227 = var1.field16229;
         this.field16228 = var1.field16224;
         this.field16229 = var1.field16227;
         this.field16230 = var1.field16230;
      }
   }

   public final void method9578(Class2415 var1) {
      this.field16222 = 1.0F - 2.0F * var1.field16390 * var1.field16390 - 2.0F * var1.field16391 * var1.field16391;
      this.field16225 = 2.0F * (var1.field16389 * var1.field16390 + var1.field16392 * var1.field16391);
      this.field16228 = 2.0F * (var1.field16389 * var1.field16391 - var1.field16392 * var1.field16390);
      this.field16223 = 2.0F * (var1.field16389 * var1.field16390 - var1.field16392 * var1.field16391);
      this.field16226 = 1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16391 * var1.field16391;
      this.field16229 = 2.0F * (var1.field16390 * var1.field16391 + var1.field16392 * var1.field16389);
      this.field16224 = 2.0F * (var1.field16389 * var1.field16391 + var1.field16392 * var1.field16390);
      this.field16227 = 2.0F * (var1.field16390 * var1.field16391 - var1.field16392 * var1.field16389);
      this.field16230 = 1.0F - 2.0F * var1.field16389 * var1.field16389 - 2.0F * var1.field16390 * var1.field16390;
   }

   public final void method9579(Class2396 var1) {
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
         this.field16222 = var10 * var5 * var5 + var9;
         this.field16223 = var10 * var12 - var8 * var7;
         this.field16224 = var10 * var11 + var8 * var6;
         this.field16225 = var10 * var12 + var8 * var7;
         this.field16226 = var10 * var6 * var6 + var9;
         this.field16227 = var10 * var13 - var8 * var5;
         this.field16228 = var10 * var11 - var8 * var6;
         this.field16229 = var10 * var13 + var8 * var5;
         this.field16230 = var10 * var7 * var7 + var9;
      } else {
         this.field16222 = 1.0F;
         this.field16223 = 0.0F;
         this.field16224 = 0.0F;
         this.field16225 = 0.0F;
         this.field16226 = 1.0F;
         this.field16227 = 0.0F;
         this.field16228 = 0.0F;
         this.field16229 = 0.0F;
         this.field16230 = 1.0F;
      }
   }

   public final void method9580(Class2410 var1) {
      double var4 = Math.sqrt(var1.field16383 * var1.field16383 + var1.field16384 * var1.field16384 + var1.field16385 * var1.field16385);
      if (!(var4 < 1.0E-8)) {
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
         this.field16222 = (float)(var16 * var6 * var6 + var14);
         this.field16223 = (float)(var16 * var20 - var12 * var10);
         this.field16224 = (float)(var16 * var18 + var12 * var8);
         this.field16225 = (float)(var16 * var20 + var12 * var10);
         this.field16226 = (float)(var16 * var8 * var8 + var14);
         this.field16227 = (float)(var16 * var22 - var12 * var6);
         this.field16228 = (float)(var16 * var18 - var12 * var8);
         this.field16229 = (float)(var16 * var22 + var12 * var6);
         this.field16230 = (float)(var16 * var10 * var10 + var14);
      } else {
         this.field16222 = 1.0F;
         this.field16223 = 0.0F;
         this.field16224 = 0.0F;
         this.field16225 = 0.0F;
         this.field16226 = 1.0F;
         this.field16227 = 0.0F;
         this.field16228 = 0.0F;
         this.field16229 = 0.0F;
         this.field16230 = 1.0F;
      }
   }

   public final void method9581(Class2389 var1) {
      this.field16222 = (float)(1.0 - 2.0 * var1.field16275 * var1.field16275 - 2.0 * var1.field16276 * var1.field16276);
      this.field16225 = (float)(2.0 * (var1.field16274 * var1.field16275 + var1.field16277 * var1.field16276));
      this.field16228 = (float)(2.0 * (var1.field16274 * var1.field16276 - var1.field16277 * var1.field16275));
      this.field16223 = (float)(2.0 * (var1.field16274 * var1.field16275 - var1.field16277 * var1.field16276));
      this.field16226 = (float)(1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16276 * var1.field16276);
      this.field16229 = (float)(2.0 * (var1.field16275 * var1.field16276 + var1.field16277 * var1.field16274));
      this.field16224 = (float)(2.0 * (var1.field16274 * var1.field16276 + var1.field16277 * var1.field16275));
      this.field16227 = (float)(2.0 * (var1.field16275 * var1.field16276 - var1.field16277 * var1.field16274));
      this.field16230 = (float)(1.0 - 2.0 * var1.field16274 * var1.field16274 - 2.0 * var1.field16275 * var1.field16275);
   }

   public final void method9582(float[] var1) {
      this.field16222 = var1[0];
      this.field16223 = var1[1];
      this.field16224 = var1[2];
      this.field16225 = var1[3];
      this.field16226 = var1[4];
      this.field16227 = var1[5];
      this.field16228 = var1[6];
      this.field16229 = var1[7];
      this.field16230 = var1[8];
   }

   public final void method9583(Class2372 var1) {
      this.field16222 = var1.field16222;
      this.field16223 = var1.field16223;
      this.field16224 = var1.field16224;
      this.field16225 = var1.field16225;
      this.field16226 = var1.field16226;
      this.field16227 = var1.field16227;
      this.field16228 = var1.field16228;
      this.field16229 = var1.field16229;
      this.field16230 = var1.field16230;
   }

   public final void method9584(Class2363 var1) {
      this.field16222 = (float)var1.field16185;
      this.field16223 = (float)var1.field16186;
      this.field16224 = (float)var1.field16187;
      this.field16225 = (float)var1.field16188;
      this.field16226 = (float)var1.field16189;
      this.field16227 = (float)var1.field16190;
      this.field16228 = (float)var1.field16191;
      this.field16229 = (float)var1.field16192;
      this.field16230 = (float)var1.field16193;
   }

   public final void method9585(Class2372 var1) {
      this.method9587(var1);
   }

   public final void method9586() {
      this.method9587(this);
   }

   private final void method9587(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      int[] var6 = new int[3];
      var4[0] = (double)var1.field16222;
      var4[1] = (double)var1.field16223;
      var4[2] = (double)var1.field16224;
      var4[3] = (double)var1.field16225;
      var4[4] = (double)var1.field16226;
      var4[5] = (double)var1.field16227;
      var4[6] = (double)var1.field16228;
      var4[7] = (double)var1.field16229;
      var4[8] = (double)var1.field16230;
      if (!method9588(var4, var6)) {
         throw new Class2500(Class8148.method28252("Matrix3f12"));
      } else {
         for (int var7 = 0; var7 < 9; var7++) {
            var5[var7] = 0.0;
         }

         var5[0] = 1.0;
         var5[4] = 1.0;
         var5[8] = 1.0;
         method9589(var4, var6, var5);
         this.field16222 = (float)var5[0];
         this.field16223 = (float)var5[1];
         this.field16224 = (float)var5[2];
         this.field16225 = (float)var5[3];
         this.field16226 = (float)var5[4];
         this.field16227 = (float)var5[5];
         this.field16228 = (float)var5[6];
         this.field16229 = (float)var5[7];
         this.field16230 = (float)var5[8];
      }
   }

   public static boolean method9588(double[] var0, int[] var1) {
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

      byte var28 = 0;

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
            throw new RuntimeException(Class8148.method28252("Matrix3f13"));
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

   public static void method9589(double[] var0, int[] var1, double[] var2) {
      byte var5 = 0;

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

   public final float method9590() {
      return this.field16222 * (this.field16226 * this.field16230 - this.field16227 * this.field16229)
         + this.field16223 * (this.field16227 * this.field16228 - this.field16225 * this.field16230)
         + this.field16224 * (this.field16225 * this.field16229 - this.field16226 * this.field16228);
   }

   public final void method9591(float var1) {
      this.field16222 = var1;
      this.field16223 = 0.0F;
      this.field16224 = 0.0F;
      this.field16225 = 0.0F;
      this.field16226 = var1;
      this.field16227 = 0.0F;
      this.field16228 = 0.0F;
      this.field16229 = 0.0F;
      this.field16230 = var1;
   }

   public final void method9592(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field16222 = 1.0F;
      this.field16223 = 0.0F;
      this.field16224 = 0.0F;
      this.field16225 = 0.0F;
      this.field16226 = var5;
      this.field16227 = -var4;
      this.field16228 = 0.0F;
      this.field16229 = var4;
      this.field16230 = var5;
   }

   public final void method9593(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field16222 = var5;
      this.field16223 = 0.0F;
      this.field16224 = var4;
      this.field16225 = 0.0F;
      this.field16226 = 1.0F;
      this.field16227 = 0.0F;
      this.field16228 = -var4;
      this.field16229 = 0.0F;
      this.field16230 = var5;
   }

   public final void method9594(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field16222 = var5;
      this.field16223 = -var4;
      this.field16224 = 0.0F;
      this.field16225 = var4;
      this.field16226 = var5;
      this.field16227 = 0.0F;
      this.field16228 = 0.0F;
      this.field16229 = 0.0F;
      this.field16230 = 1.0F;
   }

   public final void method9595(float var1) {
      this.field16222 *= var1;
      this.field16223 *= var1;
      this.field16224 *= var1;
      this.field16225 *= var1;
      this.field16226 *= var1;
      this.field16227 *= var1;
      this.field16228 *= var1;
      this.field16229 *= var1;
      this.field16230 *= var1;
   }

   public final void method9596(float var1, Class2372 var2) {
      this.field16222 = var1 * var2.field16222;
      this.field16223 = var1 * var2.field16223;
      this.field16224 = var1 * var2.field16224;
      this.field16225 = var1 * var2.field16225;
      this.field16226 = var1 * var2.field16226;
      this.field16227 = var1 * var2.field16227;
      this.field16228 = var1 * var2.field16228;
      this.field16229 = var1 * var2.field16229;
      this.field16230 = var1 * var2.field16230;
   }

   public final void method9597(Class2372 var1) {
      float var4 = this.field16222 * var1.field16222 + this.field16223 * var1.field16225 + this.field16224 * var1.field16228;
      float var5 = this.field16222 * var1.field16223 + this.field16223 * var1.field16226 + this.field16224 * var1.field16229;
      float var6 = this.field16222 * var1.field16224 + this.field16223 * var1.field16227 + this.field16224 * var1.field16230;
      float var7 = this.field16225 * var1.field16222 + this.field16226 * var1.field16225 + this.field16227 * var1.field16228;
      float var8 = this.field16225 * var1.field16223 + this.field16226 * var1.field16226 + this.field16227 * var1.field16229;
      float var9 = this.field16225 * var1.field16224 + this.field16226 * var1.field16227 + this.field16227 * var1.field16230;
      float var10 = this.field16228 * var1.field16222 + this.field16229 * var1.field16225 + this.field16230 * var1.field16228;
      float var11 = this.field16228 * var1.field16223 + this.field16229 * var1.field16226 + this.field16230 * var1.field16229;
      float var12 = this.field16228 * var1.field16224 + this.field16229 * var1.field16227 + this.field16230 * var1.field16230;
      this.field16222 = var4;
      this.field16223 = var5;
      this.field16224 = var6;
      this.field16225 = var7;
      this.field16226 = var8;
      this.field16227 = var9;
      this.field16228 = var10;
      this.field16229 = var11;
      this.field16230 = var12;
   }

   public final void method9598(Class2372 var1, Class2372 var2) {
      if (this != var1 && this != var2) {
         this.field16222 = var1.field16222 * var2.field16222 + var1.field16223 * var2.field16225 + var1.field16224 * var2.field16228;
         this.field16223 = var1.field16222 * var2.field16223 + var1.field16223 * var2.field16226 + var1.field16224 * var2.field16229;
         this.field16224 = var1.field16222 * var2.field16224 + var1.field16223 * var2.field16227 + var1.field16224 * var2.field16230;
         this.field16225 = var1.field16225 * var2.field16222 + var1.field16226 * var2.field16225 + var1.field16227 * var2.field16228;
         this.field16226 = var1.field16225 * var2.field16223 + var1.field16226 * var2.field16226 + var1.field16227 * var2.field16229;
         this.field16227 = var1.field16225 * var2.field16224 + var1.field16226 * var2.field16227 + var1.field16227 * var2.field16230;
         this.field16228 = var1.field16228 * var2.field16222 + var1.field16229 * var2.field16225 + var1.field16230 * var2.field16228;
         this.field16229 = var1.field16228 * var2.field16223 + var1.field16229 * var2.field16226 + var1.field16230 * var2.field16229;
         this.field16230 = var1.field16228 * var2.field16224 + var1.field16229 * var2.field16227 + var1.field16230 * var2.field16230;
      } else {
         float var5 = var1.field16222 * var2.field16222 + var1.field16223 * var2.field16225 + var1.field16224 * var2.field16228;
         float var6 = var1.field16222 * var2.field16223 + var1.field16223 * var2.field16226 + var1.field16224 * var2.field16229;
         float var7 = var1.field16222 * var2.field16224 + var1.field16223 * var2.field16227 + var1.field16224 * var2.field16230;
         float var8 = var1.field16225 * var2.field16222 + var1.field16226 * var2.field16225 + var1.field16227 * var2.field16228;
         float var9 = var1.field16225 * var2.field16223 + var1.field16226 * var2.field16226 + var1.field16227 * var2.field16229;
         float var10 = var1.field16225 * var2.field16224 + var1.field16226 * var2.field16227 + var1.field16227 * var2.field16230;
         float var11 = var1.field16228 * var2.field16222 + var1.field16229 * var2.field16225 + var1.field16230 * var2.field16228;
         float var12 = var1.field16228 * var2.field16223 + var1.field16229 * var2.field16226 + var1.field16230 * var2.field16229;
         float var13 = var1.field16228 * var2.field16224 + var1.field16229 * var2.field16227 + var1.field16230 * var2.field16230;
         this.field16222 = var5;
         this.field16223 = var6;
         this.field16224 = var7;
         this.field16225 = var8;
         this.field16226 = var9;
         this.field16227 = var10;
         this.field16228 = var11;
         this.field16229 = var12;
         this.field16230 = var13;
      }
   }

   public final void method9599(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = (double)(this.field16222 * var1.field16222 + this.field16223 * var1.field16225 + this.field16224 * var1.field16228);
      var4[1] = (double)(this.field16222 * var1.field16223 + this.field16223 * var1.field16226 + this.field16224 * var1.field16229);
      var4[2] = (double)(this.field16222 * var1.field16224 + this.field16223 * var1.field16227 + this.field16224 * var1.field16230);
      var4[3] = (double)(this.field16225 * var1.field16222 + this.field16226 * var1.field16225 + this.field16227 * var1.field16228);
      var4[4] = (double)(this.field16225 * var1.field16223 + this.field16226 * var1.field16226 + this.field16227 * var1.field16229);
      var4[5] = (double)(this.field16225 * var1.field16224 + this.field16226 * var1.field16227 + this.field16227 * var1.field16230);
      var4[6] = (double)(this.field16228 * var1.field16222 + this.field16229 * var1.field16225 + this.field16230 * var1.field16228);
      var4[7] = (double)(this.field16228 * var1.field16223 + this.field16229 * var1.field16226 + this.field16230 * var1.field16229);
      var4[8] = (double)(this.field16228 * var1.field16224 + this.field16229 * var1.field16227 + this.field16230 * var1.field16230);
      Class2363.method9417(var4, var6, var5);
      this.field16222 = (float)var5[0];
      this.field16223 = (float)var5[1];
      this.field16224 = (float)var5[2];
      this.field16225 = (float)var5[3];
      this.field16226 = (float)var5[4];
      this.field16227 = (float)var5[5];
      this.field16228 = (float)var5[6];
      this.field16229 = (float)var5[7];
      this.field16230 = (float)var5[8];
   }

   public final void method9600(Class2372 var1, Class2372 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[9];
      double[] var7 = new double[3];
      var5[0] = (double)(var1.field16222 * var2.field16222 + var1.field16223 * var2.field16225 + var1.field16224 * var2.field16228);
      var5[1] = (double)(var1.field16222 * var2.field16223 + var1.field16223 * var2.field16226 + var1.field16224 * var2.field16229);
      var5[2] = (double)(var1.field16222 * var2.field16224 + var1.field16223 * var2.field16227 + var1.field16224 * var2.field16230);
      var5[3] = (double)(var1.field16225 * var2.field16222 + var1.field16226 * var2.field16225 + var1.field16227 * var2.field16228);
      var5[4] = (double)(var1.field16225 * var2.field16223 + var1.field16226 * var2.field16226 + var1.field16227 * var2.field16229);
      var5[5] = (double)(var1.field16225 * var2.field16224 + var1.field16226 * var2.field16227 + var1.field16227 * var2.field16230);
      var5[6] = (double)(var1.field16228 * var2.field16222 + var1.field16229 * var2.field16225 + var1.field16230 * var2.field16228);
      var5[7] = (double)(var1.field16228 * var2.field16223 + var1.field16229 * var2.field16226 + var1.field16230 * var2.field16229);
      var5[8] = (double)(var1.field16228 * var2.field16224 + var1.field16229 * var2.field16227 + var1.field16230 * var2.field16230);
      Class2363.method9417(var5, var7, var6);
      this.field16222 = (float)var6[0];
      this.field16223 = (float)var6[1];
      this.field16224 = (float)var6[2];
      this.field16225 = (float)var6[3];
      this.field16226 = (float)var6[4];
      this.field16227 = (float)var6[5];
      this.field16228 = (float)var6[6];
      this.field16229 = (float)var6[7];
      this.field16230 = (float)var6[8];
   }

   public final void method9601(Class2372 var1, Class2372 var2) {
      if (this != var1 && this != var2) {
         this.field16222 = var1.field16222 * var2.field16222 + var1.field16225 * var2.field16223 + var1.field16228 * var2.field16224;
         this.field16223 = var1.field16222 * var2.field16225 + var1.field16225 * var2.field16226 + var1.field16228 * var2.field16227;
         this.field16224 = var1.field16222 * var2.field16228 + var1.field16225 * var2.field16229 + var1.field16228 * var2.field16230;
         this.field16225 = var1.field16223 * var2.field16222 + var1.field16226 * var2.field16223 + var1.field16229 * var2.field16224;
         this.field16226 = var1.field16223 * var2.field16225 + var1.field16226 * var2.field16226 + var1.field16229 * var2.field16227;
         this.field16227 = var1.field16223 * var2.field16228 + var1.field16226 * var2.field16229 + var1.field16229 * var2.field16230;
         this.field16228 = var1.field16224 * var2.field16222 + var1.field16227 * var2.field16223 + var1.field16230 * var2.field16224;
         this.field16229 = var1.field16224 * var2.field16225 + var1.field16227 * var2.field16226 + var1.field16230 * var2.field16227;
         this.field16230 = var1.field16224 * var2.field16228 + var1.field16227 * var2.field16229 + var1.field16230 * var2.field16230;
      } else {
         float var5 = var1.field16222 * var2.field16222 + var1.field16225 * var2.field16223 + var1.field16228 * var2.field16224;
         float var6 = var1.field16222 * var2.field16225 + var1.field16225 * var2.field16226 + var1.field16228 * var2.field16227;
         float var7 = var1.field16222 * var2.field16228 + var1.field16225 * var2.field16229 + var1.field16228 * var2.field16230;
         float var8 = var1.field16223 * var2.field16222 + var1.field16226 * var2.field16223 + var1.field16229 * var2.field16224;
         float var9 = var1.field16223 * var2.field16225 + var1.field16226 * var2.field16226 + var1.field16229 * var2.field16227;
         float var10 = var1.field16223 * var2.field16228 + var1.field16226 * var2.field16229 + var1.field16229 * var2.field16230;
         float var11 = var1.field16224 * var2.field16222 + var1.field16227 * var2.field16223 + var1.field16230 * var2.field16224;
         float var12 = var1.field16224 * var2.field16225 + var1.field16227 * var2.field16226 + var1.field16230 * var2.field16227;
         float var13 = var1.field16224 * var2.field16228 + var1.field16227 * var2.field16229 + var1.field16230 * var2.field16230;
         this.field16222 = var5;
         this.field16223 = var6;
         this.field16224 = var7;
         this.field16225 = var8;
         this.field16226 = var9;
         this.field16227 = var10;
         this.field16228 = var11;
         this.field16229 = var12;
         this.field16230 = var13;
      }
   }

   public final void method9602(Class2372 var1, Class2372 var2) {
      if (this != var1 && this != var2) {
         this.field16222 = var1.field16222 * var2.field16222 + var1.field16223 * var2.field16223 + var1.field16224 * var2.field16224;
         this.field16223 = var1.field16222 * var2.field16225 + var1.field16223 * var2.field16226 + var1.field16224 * var2.field16227;
         this.field16224 = var1.field16222 * var2.field16228 + var1.field16223 * var2.field16229 + var1.field16224 * var2.field16230;
         this.field16225 = var1.field16225 * var2.field16222 + var1.field16226 * var2.field16223 + var1.field16227 * var2.field16224;
         this.field16226 = var1.field16225 * var2.field16225 + var1.field16226 * var2.field16226 + var1.field16227 * var2.field16227;
         this.field16227 = var1.field16225 * var2.field16228 + var1.field16226 * var2.field16229 + var1.field16227 * var2.field16230;
         this.field16228 = var1.field16228 * var2.field16222 + var1.field16229 * var2.field16223 + var1.field16230 * var2.field16224;
         this.field16229 = var1.field16228 * var2.field16225 + var1.field16229 * var2.field16226 + var1.field16230 * var2.field16227;
         this.field16230 = var1.field16228 * var2.field16228 + var1.field16229 * var2.field16229 + var1.field16230 * var2.field16230;
      } else {
         float var5 = var1.field16222 * var2.field16222 + var1.field16223 * var2.field16223 + var1.field16224 * var2.field16224;
         float var6 = var1.field16222 * var2.field16225 + var1.field16223 * var2.field16226 + var1.field16224 * var2.field16227;
         float var7 = var1.field16222 * var2.field16228 + var1.field16223 * var2.field16229 + var1.field16224 * var2.field16230;
         float var8 = var1.field16225 * var2.field16222 + var1.field16226 * var2.field16223 + var1.field16227 * var2.field16224;
         float var9 = var1.field16225 * var2.field16225 + var1.field16226 * var2.field16226 + var1.field16227 * var2.field16227;
         float var10 = var1.field16225 * var2.field16228 + var1.field16226 * var2.field16229 + var1.field16227 * var2.field16230;
         float var11 = var1.field16228 * var2.field16222 + var1.field16229 * var2.field16223 + var1.field16230 * var2.field16224;
         float var12 = var1.field16228 * var2.field16225 + var1.field16229 * var2.field16226 + var1.field16230 * var2.field16227;
         float var13 = var1.field16228 * var2.field16228 + var1.field16229 * var2.field16229 + var1.field16230 * var2.field16230;
         this.field16222 = var5;
         this.field16223 = var6;
         this.field16224 = var7;
         this.field16225 = var8;
         this.field16226 = var9;
         this.field16227 = var10;
         this.field16228 = var11;
         this.field16229 = var12;
         this.field16230 = var13;
      }
   }

   public final void method9603(Class2372 var1, Class2372 var2) {
      if (this != var1 && this != var2) {
         this.field16222 = var1.field16222 * var2.field16222 + var1.field16225 * var2.field16225 + var1.field16228 * var2.field16228;
         this.field16223 = var1.field16222 * var2.field16223 + var1.field16225 * var2.field16226 + var1.field16228 * var2.field16229;
         this.field16224 = var1.field16222 * var2.field16224 + var1.field16225 * var2.field16227 + var1.field16228 * var2.field16230;
         this.field16225 = var1.field16223 * var2.field16222 + var1.field16226 * var2.field16225 + var1.field16229 * var2.field16228;
         this.field16226 = var1.field16223 * var2.field16223 + var1.field16226 * var2.field16226 + var1.field16229 * var2.field16229;
         this.field16227 = var1.field16223 * var2.field16224 + var1.field16226 * var2.field16227 + var1.field16229 * var2.field16230;
         this.field16228 = var1.field16224 * var2.field16222 + var1.field16227 * var2.field16225 + var1.field16230 * var2.field16228;
         this.field16229 = var1.field16224 * var2.field16223 + var1.field16227 * var2.field16226 + var1.field16230 * var2.field16229;
         this.field16230 = var1.field16224 * var2.field16224 + var1.field16227 * var2.field16227 + var1.field16230 * var2.field16230;
      } else {
         float var5 = var1.field16222 * var2.field16222 + var1.field16225 * var2.field16225 + var1.field16228 * var2.field16228;
         float var6 = var1.field16222 * var2.field16223 + var1.field16225 * var2.field16226 + var1.field16228 * var2.field16229;
         float var7 = var1.field16222 * var2.field16224 + var1.field16225 * var2.field16227 + var1.field16228 * var2.field16230;
         float var8 = var1.field16223 * var2.field16222 + var1.field16226 * var2.field16225 + var1.field16229 * var2.field16228;
         float var9 = var1.field16223 * var2.field16223 + var1.field16226 * var2.field16226 + var1.field16229 * var2.field16229;
         float var10 = var1.field16223 * var2.field16224 + var1.field16226 * var2.field16227 + var1.field16229 * var2.field16230;
         float var11 = var1.field16224 * var2.field16222 + var1.field16227 * var2.field16225 + var1.field16230 * var2.field16228;
         float var12 = var1.field16224 * var2.field16223 + var1.field16227 * var2.field16226 + var1.field16230 * var2.field16229;
         float var13 = var1.field16224 * var2.field16224 + var1.field16227 * var2.field16227 + var1.field16230 * var2.field16230;
         this.field16222 = var5;
         this.field16223 = var6;
         this.field16224 = var7;
         this.field16225 = var8;
         this.field16226 = var9;
         this.field16227 = var10;
         this.field16228 = var11;
         this.field16229 = var12;
         this.field16230 = var13;
      }
   }

   public final void method9604() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method9614(var4, var3);
      this.field16222 = (float)var3[0];
      this.field16223 = (float)var3[1];
      this.field16224 = (float)var3[2];
      this.field16225 = (float)var3[3];
      this.field16226 = (float)var3[4];
      this.field16227 = (float)var3[5];
      this.field16228 = (float)var3[6];
      this.field16229 = (float)var3[7];
      this.field16230 = (float)var3[8];
   }

   public final void method9605(Class2372 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = (double)var1.field16222;
      var4[1] = (double)var1.field16223;
      var4[2] = (double)var1.field16224;
      var4[3] = (double)var1.field16225;
      var4[4] = (double)var1.field16226;
      var4[5] = (double)var1.field16227;
      var4[6] = (double)var1.field16228;
      var4[7] = (double)var1.field16229;
      var4[8] = (double)var1.field16230;
      Class2363.method9417(var4, var6, var5);
      this.field16222 = (float)var5[0];
      this.field16223 = (float)var5[1];
      this.field16224 = (float)var5[2];
      this.field16225 = (float)var5[3];
      this.field16226 = (float)var5[4];
      this.field16227 = (float)var5[5];
      this.field16228 = (float)var5[6];
      this.field16229 = (float)var5[7];
      this.field16230 = (float)var5[8];
   }

   public final void method9606() {
      float var3 = 1.0F / (float)Math.sqrt((double)(this.field16222 * this.field16222 + this.field16225 * this.field16225 + this.field16228 * this.field16228));
      this.field16222 *= var3;
      this.field16225 *= var3;
      this.field16228 *= var3;
      var3 = 1.0F / (float)Math.sqrt((double)(this.field16223 * this.field16223 + this.field16226 * this.field16226 + this.field16229 * this.field16229));
      this.field16223 *= var3;
      this.field16226 *= var3;
      this.field16229 *= var3;
      this.field16224 = this.field16225 * this.field16229 - this.field16226 * this.field16228;
      this.field16227 = this.field16223 * this.field16228 - this.field16222 * this.field16229;
      this.field16230 = this.field16222 * this.field16226 - this.field16223 * this.field16225;
   }

   public final void method9607(Class2372 var1) {
      float var4 = 1.0F / (float)Math.sqrt((double)(var1.field16222 * var1.field16222 + var1.field16225 * var1.field16225 + var1.field16228 * var1.field16228));
      this.field16222 = var1.field16222 * var4;
      this.field16225 = var1.field16225 * var4;
      this.field16228 = var1.field16228 * var4;
      var4 = 1.0F / (float)Math.sqrt((double)(var1.field16223 * var1.field16223 + var1.field16226 * var1.field16226 + var1.field16229 * var1.field16229));
      this.field16223 = var1.field16223 * var4;
      this.field16226 = var1.field16226 * var4;
      this.field16229 = var1.field16229 * var4;
      this.field16224 = this.field16225 * this.field16229 - this.field16226 * this.field16228;
      this.field16227 = this.field16223 * this.field16228 - this.field16222 * this.field16229;
      this.field16230 = this.field16222 * this.field16226 - this.field16223 * this.field16225;
   }

   public boolean equals(Class2372 var1) {
      try {
         return this.field16222 == var1.field16222
            && this.field16223 == var1.field16223
            && this.field16224 == var1.field16224
            && this.field16225 == var1.field16225
            && this.field16226 == var1.field16226
            && this.field16227 == var1.field16227
            && this.field16228 == var1.field16228
            && this.field16229 == var1.field16229
            && this.field16230 == var1.field16230;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2372 var4 = (Class2372)var1;
         return this.field16222 == var4.field16222
            && this.field16223 == var4.field16223
            && this.field16224 == var4.field16224
            && this.field16225 == var4.field16225
            && this.field16226 == var4.field16226
            && this.field16227 == var4.field16227
            && this.field16228 == var4.field16228
            && this.field16229 == var4.field16229
            && this.field16230 == var4.field16230;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method9608(Class2372 var1, float var2) {
      boolean var5 = true;
      if (Math.abs(this.field16222 - var1.field16222) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16223 - var1.field16223) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16224 - var1.field16224) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16225 - var1.field16225) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16226 - var1.field16226) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16227 - var1.field16227) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16228 - var1.field16228) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16229 - var1.field16229) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field16230 - var1.field16230) > var2) {
         var5 = false;
      }

      return var5;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16222);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16223);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16224);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16225);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16226);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16227);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16228);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16229);
      var3 = 31L * var3 + (long)Class9832.method38796(this.field16230);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method9609() {
      this.field16222 = 0.0F;
      this.field16223 = 0.0F;
      this.field16224 = 0.0F;
      this.field16225 = 0.0F;
      this.field16226 = 0.0F;
      this.field16227 = 0.0F;
      this.field16228 = 0.0F;
      this.field16229 = 0.0F;
      this.field16230 = 0.0F;
   }

   public final void method9610() {
      this.field16222 = -this.field16222;
      this.field16223 = -this.field16223;
      this.field16224 = -this.field16224;
      this.field16225 = -this.field16225;
      this.field16226 = -this.field16226;
      this.field16227 = -this.field16227;
      this.field16228 = -this.field16228;
      this.field16229 = -this.field16229;
      this.field16230 = -this.field16230;
   }

   public final void method9611(Class2372 var1) {
      this.field16222 = -var1.field16222;
      this.field16223 = -var1.field16223;
      this.field16224 = -var1.field16224;
      this.field16225 = -var1.field16225;
      this.field16226 = -var1.field16226;
      this.field16227 = -var1.field16227;
      this.field16228 = -var1.field16228;
      this.field16229 = -var1.field16229;
      this.field16230 = -var1.field16230;
   }

   public final void method9612(Class5 var1) {
      float var4 = this.field16222 * var1.field8 + this.field16223 * var1.field9 + this.field16224 * var1.field10;
      float var5 = this.field16225 * var1.field8 + this.field16226 * var1.field9 + this.field16227 * var1.field10;
      float var6 = this.field16228 * var1.field8 + this.field16229 * var1.field9 + this.field16230 * var1.field10;
      var1.method4(var4, var5, var6);
   }

   public final void method9613(Class5 var1, Class5 var2) {
      float var5 = this.field16222 * var1.field8 + this.field16223 * var1.field9 + this.field16224 * var1.field10;
      float var6 = this.field16225 * var1.field8 + this.field16226 * var1.field9 + this.field16227 * var1.field10;
      var2.field10 = this.field16228 * var1.field8 + this.field16229 * var1.field9 + this.field16230 * var1.field10;
      var2.field8 = var5;
      var2.field9 = var6;
   }

   public void method9614(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         (double)this.field16222,
         (double)this.field16223,
         (double)this.field16224,
         (double)this.field16225,
         (double)this.field16226,
         (double)this.field16227,
         (double)this.field16228,
         (double)this.field16229,
         (double)this.field16230
      };
      Class2363.method9417(var5, var1, var2);
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (Class2372)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final float method9615() {
      return this.field16222;
   }

   public final void method9616(float var1) {
      this.field16222 = var1;
   }

   public final float method9617() {
      return this.field16223;
   }

   public final void method9618(float var1) {
      this.field16223 = var1;
   }

   public final float method9619() {
      return this.field16224;
   }

   public final void method9620(float var1) {
      this.field16224 = var1;
   }

   public final float method9621() {
      return this.field16225;
   }

   public final void method9622(float var1) {
      this.field16225 = var1;
   }

   public final float method9623() {
      return this.field16226;
   }

   public final void method9624(float var1) {
      this.field16226 = var1;
   }

   public final float method9625() {
      return this.field16227;
   }

   public final void method9626(float var1) {
      this.field16227 = var1;
   }

   public final float method9627() {
      return this.field16228;
   }

   public final void method9628(float var1) {
      this.field16228 = var1;
   }

   public final float method9629() {
      return this.field16229;
   }

   public final void method9630(float var1) {
      this.field16229 = var1;
   }

   public final float method9631() {
      return this.field16230;
   }

   public final void method9632(float var1) {
      this.field16230 = var1;
   }
}
