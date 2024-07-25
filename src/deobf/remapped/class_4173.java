package remapped;

import java.io.Serializable;

public class class_4173 implements Serializable, Cloneable {
   public static final long field_20320 = 6837536777072402710L;
   public double field_20304;
   public double field_20313;
   public double field_20311;
   public double field_20312;
   public double field_20305;
   public double field_20319;
   public double field_20314;
   public double field_20322;
   public double field_20307;
   private static final double field_20316 = 1.110223024E-16;
   private static final double field_20309 = 1.0E-8;
   private static double field_20306;
   private static double field_20317;
   private static double field_20318;
   private static double field_20308;
   private static double field_20315;
   private static double field_20310;

   public class_4173(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      this.field_20304 = var1;
      this.field_20313 = var3;
      this.field_20311 = var5;
      this.field_20312 = var7;
      this.field_20305 = var9;
      this.field_20319 = var11;
      this.field_20314 = var13;
      this.field_20322 = var15;
      this.field_20307 = var17;
   }

   public class_4173(double[] var1) {
      this.field_20304 = var1[0];
      this.field_20313 = var1[1];
      this.field_20311 = var1[2];
      this.field_20312 = var1[3];
      this.field_20305 = var1[4];
      this.field_20319 = var1[5];
      this.field_20314 = var1[6];
      this.field_20322 = var1[7];
      this.field_20307 = var1[8];
   }

   public class_4173(class_4173 var1) {
      this.field_20304 = var1.field_20304;
      this.field_20313 = var1.field_20313;
      this.field_20311 = var1.field_20311;
      this.field_20312 = var1.field_20312;
      this.field_20305 = var1.field_20305;
      this.field_20319 = var1.field_20319;
      this.field_20314 = var1.field_20314;
      this.field_20322 = var1.field_20322;
      this.field_20307 = var1.field_20307;
   }

   public class_4173(class_3367 var1) {
      this.field_20304 = (double)var1.field_16607;
      this.field_20313 = (double)var1.field_16596;
      this.field_20311 = (double)var1.field_16597;
      this.field_20312 = (double)var1.field_16606;
      this.field_20305 = (double)var1.field_16602;
      this.field_20319 = (double)var1.field_16599;
      this.field_20314 = (double)var1.field_16604;
      this.field_20322 = (double)var1.field_16605;
      this.field_20307 = (double)var1.field_16600;
   }

   public class_4173() {
      this.field_20304 = 0.0;
      this.field_20313 = 0.0;
      this.field_20311 = 0.0;
      this.field_20312 = 0.0;
      this.field_20305 = 0.0;
      this.field_20319 = 0.0;
      this.field_20314 = 0.0;
      this.field_20322 = 0.0;
      this.field_20307 = 0.0;
   }

   @Override
   public String toString() {
      return this.field_20304
         + ", "
         + this.field_20313
         + ", "
         + this.field_20311
         + "\n"
         + this.field_20312
         + ", "
         + this.field_20305
         + ", "
         + this.field_20319
         + "\n"
         + this.field_20314
         + ", "
         + this.field_20322
         + ", "
         + this.field_20307
         + "\n";
   }

   public final void method_19383() {
      this.field_20304 = 1.0;
      this.field_20313 = 0.0;
      this.field_20311 = 0.0;
      this.field_20312 = 0.0;
      this.field_20305 = 1.0;
      this.field_20319 = 0.0;
      this.field_20314 = 0.0;
      this.field_20322 = 0.0;
      this.field_20307 = 1.0;
   }

   public final void method_19386(double var1) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method_19434(var6, var5);
      this.field_20304 = var5[0] * var1;
      this.field_20313 = var5[1] * var1;
      this.field_20311 = var5[2] * var1;
      this.field_20312 = var5[3] * var1;
      this.field_20305 = var5[4] * var1;
      this.field_20319 = var5[5] * var1;
      this.field_20314 = var5[6] * var1;
      this.field_20322 = var5[7] * var1;
      this.field_20307 = var5[8] * var1;
   }

   public final void method_19379(int var1, int var2, double var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field_20304 = var3;
                  return;
               case 1:
                  this.field_20313 = var3;
                  return;
               case 2:
                  this.field_20311 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field_20312 = var3;
                  return;
               case 1:
                  this.field_20305 = var3;
                  return;
               case 2:
                  this.field_20319 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field_20314 = var3;
                  return;
               case 1:
                  this.field_20322 = var3;
                  return;
               case 2:
                  this.field_20307 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d0"));
      }
   }

   public final double method_19404(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field_20304;
               case 1:
                  return this.field_20313;
               case 2:
                  return this.field_20311;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d1"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field_20312;
               case 1:
                  return this.field_20305;
               case 2:
                  return this.field_20319;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d1"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field_20314;
               case 1:
                  return this.field_20322;
               case 2:
                  return this.field_20307;
            }
      }

      throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d1"));
   }

   public final void method_19380(int var1, class_2627 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d2"));
            }

            var2.field_17244 = this.field_20314;
            var2.field_17242 = this.field_20322;
            var2.field_17241 = this.field_20307;
         } else {
            var2.field_17244 = this.field_20312;
            var2.field_17242 = this.field_20305;
            var2.field_17241 = this.field_20319;
         }
      } else {
         var2.field_17244 = this.field_20304;
         var2.field_17242 = this.field_20313;
         var2.field_17241 = this.field_20311;
      }
   }

   public final void method_19381(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d2"));
            }

            var2[0] = this.field_20314;
            var2[1] = this.field_20322;
            var2[2] = this.field_20307;
         } else {
            var2[0] = this.field_20312;
            var2[1] = this.field_20305;
            var2[2] = this.field_20319;
         }
      } else {
         var2[0] = this.field_20304;
         var2[1] = this.field_20313;
         var2[2] = this.field_20311;
      }
   }

   public final void method_19424(int var1, class_2627 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d4"));
            }

            var2.field_17244 = this.field_20311;
            var2.field_17242 = this.field_20319;
            var2.field_17241 = this.field_20307;
         } else {
            var2.field_17244 = this.field_20313;
            var2.field_17242 = this.field_20305;
            var2.field_17241 = this.field_20322;
         }
      } else {
         var2.field_17244 = this.field_20304;
         var2.field_17242 = this.field_20312;
         var2.field_17241 = this.field_20314;
      }
   }

   public final void method_19425(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d4"));
            }

            var2[0] = this.field_20311;
            var2[1] = this.field_20319;
            var2[2] = this.field_20307;
         } else {
            var2[0] = this.field_20313;
            var2[1] = this.field_20305;
            var2[2] = this.field_20322;
         }
      } else {
         var2[0] = this.field_20304;
         var2[1] = this.field_20312;
         var2[2] = this.field_20314;
      }
   }

   public final void method_19438(int var1, double var2, double var4, double var6) {
      switch (var1) {
         case 0:
            this.field_20304 = var2;
            this.field_20313 = var4;
            this.field_20311 = var6;
            break;
         case 1:
            this.field_20312 = var2;
            this.field_20305 = var4;
            this.field_20319 = var6;
            break;
         case 2:
            this.field_20314 = var2;
            this.field_20322 = var4;
            this.field_20307 = var6;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d6"));
      }
   }

   public final void method_19439(int var1, class_2627 var2) {
      switch (var1) {
         case 0:
            this.field_20304 = var2.field_17244;
            this.field_20313 = var2.field_17242;
            this.field_20311 = var2.field_17241;
            break;
         case 1:
            this.field_20312 = var2.field_17244;
            this.field_20305 = var2.field_17242;
            this.field_20319 = var2.field_17241;
            break;
         case 2:
            this.field_20314 = var2.field_17244;
            this.field_20322 = var2.field_17242;
            this.field_20307 = var2.field_17241;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d6"));
      }
   }

   public final void method_19440(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field_20304 = var2[0];
            this.field_20313 = var2[1];
            this.field_20311 = var2[2];
            break;
         case 1:
            this.field_20312 = var2[0];
            this.field_20305 = var2[1];
            this.field_20319 = var2[2];
            break;
         case 2:
            this.field_20314 = var2[0];
            this.field_20322 = var2[1];
            this.field_20307 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d6"));
      }
   }

   public final void method_19352(int var1, double var2, double var4, double var6) {
      switch (var1) {
         case 0:
            this.field_20304 = var2;
            this.field_20312 = var4;
            this.field_20314 = var6;
            break;
         case 1:
            this.field_20313 = var2;
            this.field_20305 = var4;
            this.field_20322 = var6;
            break;
         case 2:
            this.field_20311 = var2;
            this.field_20319 = var4;
            this.field_20307 = var6;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d9"));
      }
   }

   public final void method_19353(int var1, class_2627 var2) {
      switch (var1) {
         case 0:
            this.field_20304 = var2.field_17244;
            this.field_20312 = var2.field_17242;
            this.field_20314 = var2.field_17241;
            break;
         case 1:
            this.field_20313 = var2.field_17244;
            this.field_20305 = var2.field_17242;
            this.field_20322 = var2.field_17241;
            break;
         case 2:
            this.field_20311 = var2.field_17244;
            this.field_20319 = var2.field_17242;
            this.field_20307 = var2.field_17241;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d9"));
      }
   }

   public final void method_19354(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field_20304 = var2[0];
            this.field_20312 = var2[1];
            this.field_20314 = var2[2];
            break;
         case 1:
            this.field_20313 = var2[0];
            this.field_20305 = var2[1];
            this.field_20322 = var2[2];
            break;
         case 2:
            this.field_20311 = var2[0];
            this.field_20319 = var2[1];
            this.field_20307 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3d9"));
      }
   }

   public final double method_19360() {
      double[] var3 = new double[3];
      double[] var4 = new double[9];
      this.method_19434(var3, var4);
      return method_19359(var3);
   }

   public final void method_19396(double var1) {
      this.field_20304 += var1;
      this.field_20313 += var1;
      this.field_20311 += var1;
      this.field_20312 += var1;
      this.field_20305 += var1;
      this.field_20319 += var1;
      this.field_20314 += var1;
      this.field_20322 += var1;
      this.field_20307 += var1;
   }

   public final void method_19397(double var1, class_4173 var3) {
      this.field_20304 = var3.field_20304 + var1;
      this.field_20313 = var3.field_20313 + var1;
      this.field_20311 = var3.field_20311 + var1;
      this.field_20312 = var3.field_20312 + var1;
      this.field_20305 = var3.field_20305 + var1;
      this.field_20319 = var3.field_20319 + var1;
      this.field_20314 = var3.field_20314 + var1;
      this.field_20322 = var3.field_20322 + var1;
      this.field_20307 = var3.field_20307 + var1;
   }

   public final void method_19399(class_4173 var1, class_4173 var2) {
      this.field_20304 = var1.field_20304 + var2.field_20304;
      this.field_20313 = var1.field_20313 + var2.field_20313;
      this.field_20311 = var1.field_20311 + var2.field_20311;
      this.field_20312 = var1.field_20312 + var2.field_20312;
      this.field_20305 = var1.field_20305 + var2.field_20305;
      this.field_20319 = var1.field_20319 + var2.field_20319;
      this.field_20314 = var1.field_20314 + var2.field_20314;
      this.field_20322 = var1.field_20322 + var2.field_20322;
      this.field_20307 = var1.field_20307 + var2.field_20307;
   }

   public final void method_19398(class_4173 var1) {
      this.field_20304 = this.field_20304 + var1.field_20304;
      this.field_20313 = this.field_20313 + var1.field_20313;
      this.field_20311 = this.field_20311 + var1.field_20311;
      this.field_20312 = this.field_20312 + var1.field_20312;
      this.field_20305 = this.field_20305 + var1.field_20305;
      this.field_20319 = this.field_20319 + var1.field_20319;
      this.field_20314 = this.field_20314 + var1.field_20314;
      this.field_20322 = this.field_20322 + var1.field_20322;
      this.field_20307 = this.field_20307 + var1.field_20307;
   }

   public final void method_19371(class_4173 var1, class_4173 var2) {
      this.field_20304 = var1.field_20304 - var2.field_20304;
      this.field_20313 = var1.field_20313 - var2.field_20313;
      this.field_20311 = var1.field_20311 - var2.field_20311;
      this.field_20312 = var1.field_20312 - var2.field_20312;
      this.field_20305 = var1.field_20305 - var2.field_20305;
      this.field_20319 = var1.field_20319 - var2.field_20319;
      this.field_20314 = var1.field_20314 - var2.field_20314;
      this.field_20322 = var1.field_20322 - var2.field_20322;
      this.field_20307 = var1.field_20307 - var2.field_20307;
   }

   public final void method_19370(class_4173 var1) {
      this.field_20304 = this.field_20304 - var1.field_20304;
      this.field_20313 = this.field_20313 - var1.field_20313;
      this.field_20311 = this.field_20311 - var1.field_20311;
      this.field_20312 = this.field_20312 - var1.field_20312;
      this.field_20305 = this.field_20305 - var1.field_20305;
      this.field_20319 = this.field_20319 - var1.field_20319;
      this.field_20314 = this.field_20314 - var1.field_20314;
      this.field_20322 = this.field_20322 - var1.field_20322;
      this.field_20307 = this.field_20307 - var1.field_20307;
   }

   public final void method_19436() {
      double var3 = this.field_20312;
      this.field_20312 = this.field_20313;
      this.field_20313 = var3;
      var3 = this.field_20314;
      this.field_20314 = this.field_20311;
      this.field_20311 = var3;
      var3 = this.field_20322;
      this.field_20322 = this.field_20319;
      this.field_20319 = var3;
   }

   public final void method_19437(class_4173 var1) {
      if (this == var1) {
         this.method_19436();
      } else {
         this.field_20304 = var1.field_20304;
         this.field_20313 = var1.field_20312;
         this.field_20311 = var1.field_20314;
         this.field_20312 = var1.field_20313;
         this.field_20305 = var1.field_20305;
         this.field_20319 = var1.field_20322;
         this.field_20314 = var1.field_20311;
         this.field_20322 = var1.field_20319;
         this.field_20307 = var1.field_20307;
      }
   }

   public final void method_19412(class_9400 var1) {
      this.field_20304 = 1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828;
      this.field_20312 = 2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828);
      this.field_20314 = 2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830);
      this.field_20313 = 2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828);
      this.field_20305 = 1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828;
      this.field_20322 = 2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829);
      this.field_20311 = 2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830);
      this.field_20319 = 2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829);
      this.field_20307 = 1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830;
   }

   public final void method_19411(class_9179 var1) {
      double var4 = Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965);
      if (!(var4 < 1.110223024E-16)) {
         var4 = 1.0 / var4;
         double var6 = var1.field_46964 * var4;
         double var8 = var1.field_46963 * var4;
         double var10 = var1.field_46965 * var4;
         double var12 = Math.sin(var1.field_46968);
         double var14 = Math.cos(var1.field_46968);
         double var16 = 1.0 - var14;
         double var18 = var6 * var10;
         double var20 = var6 * var8;
         double var22 = var8 * var10;
         this.field_20304 = var16 * var6 * var6 + var14;
         this.field_20313 = var16 * var20 - var12 * var10;
         this.field_20311 = var16 * var18 + var12 * var8;
         this.field_20312 = var16 * var20 + var12 * var10;
         this.field_20305 = var16 * var8 * var8 + var14;
         this.field_20319 = var16 * var22 - var12 * var6;
         this.field_20314 = var16 * var18 - var12 * var8;
         this.field_20322 = var16 * var22 + var12 * var6;
         this.field_20307 = var16 * var10 * var10 + var14;
      } else {
         this.field_20304 = 1.0;
         this.field_20313 = 0.0;
         this.field_20311 = 0.0;
         this.field_20312 = 0.0;
         this.field_20305 = 1.0;
         this.field_20319 = 0.0;
         this.field_20314 = 0.0;
         this.field_20322 = 0.0;
         this.field_20307 = 1.0;
      }
   }

   public final void method_19410(class_8778 var1) {
      this.field_20304 = 1.0 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013;
      this.field_20312 = 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_20314 = 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_20313 = 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_20305 = 1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013;
      this.field_20322 = 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_20311 = 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_20319 = 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_20307 = 1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016;
   }

   public final void method_19409(class_7441 var1) {
      double var4 = Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!(var4 < 1.110223024E-16)) {
         var4 = 1.0 / var4;
         double var6 = (double)var1.field_37928 * var4;
         double var8 = (double)var1.field_37931 * var4;
         double var10 = (double)var1.field_37927 * var4;
         double var12 = Math.sin((double)var1.field_37925);
         double var14 = Math.cos((double)var1.field_37925);
         double var16 = 1.0 - var14;
         double var18 = var6 * var10;
         double var20 = var6 * var8;
         double var22 = var8 * var10;
         this.field_20304 = var16 * var6 * var6 + var14;
         this.field_20313 = var16 * var20 - var12 * var10;
         this.field_20311 = var16 * var18 + var12 * var8;
         this.field_20312 = var16 * var20 + var12 * var10;
         this.field_20305 = var16 * var8 * var8 + var14;
         this.field_20319 = var16 * var22 - var12 * var6;
         this.field_20314 = var16 * var18 - var12 * var8;
         this.field_20322 = var16 * var22 + var12 * var6;
         this.field_20307 = var16 * var10 * var10 + var14;
      } else {
         this.field_20304 = 1.0;
         this.field_20313 = 0.0;
         this.field_20311 = 0.0;
         this.field_20312 = 0.0;
         this.field_20305 = 1.0;
         this.field_20319 = 0.0;
         this.field_20314 = 0.0;
         this.field_20322 = 0.0;
         this.field_20307 = 1.0;
      }
   }

   public final void method_19407(class_3367 var1) {
      this.field_20304 = (double)var1.field_16607;
      this.field_20313 = (double)var1.field_16596;
      this.field_20311 = (double)var1.field_16597;
      this.field_20312 = (double)var1.field_16606;
      this.field_20305 = (double)var1.field_16602;
      this.field_20319 = (double)var1.field_16599;
      this.field_20314 = (double)var1.field_16604;
      this.field_20322 = (double)var1.field_16605;
      this.field_20307 = (double)var1.field_16600;
   }

   public final void method_19408(class_4173 var1) {
      this.field_20304 = var1.field_20304;
      this.field_20313 = var1.field_20313;
      this.field_20311 = var1.field_20311;
      this.field_20312 = var1.field_20312;
      this.field_20305 = var1.field_20305;
      this.field_20319 = var1.field_20319;
      this.field_20314 = var1.field_20314;
      this.field_20322 = var1.field_20322;
      this.field_20307 = var1.field_20307;
   }

   public final void method_19413(double[] var1) {
      this.field_20304 = var1[0];
      this.field_20313 = var1[1];
      this.field_20311 = var1[2];
      this.field_20312 = var1[3];
      this.field_20305 = var1[4];
      this.field_20319 = var1[5];
      this.field_20314 = var1[6];
      this.field_20322 = var1[7];
      this.field_20307 = var1[8];
   }

   public final void method_19366(class_4173 var1) {
      this.method_19433(var1);
   }

   public final void method_19365() {
      this.method_19433(this);
   }

   private final void method_19433(class_4173 var1) {
      double[] var4 = new double[9];
      int[] var5 = new int[3];
      double[] var6 = new double[]{
         var1.field_20304,
         var1.field_20313,
         var1.field_20311,
         var1.field_20312,
         var1.field_20305,
         var1.field_20319,
         var1.field_20314,
         var1.field_20322,
         var1.field_20307
      };
      if (!method_19377(var6, var5)) {
         throw new class_5059(class_3730.method_17283("Matrix3d12"));
      } else {
         for (int var7 = 0; var7 < 9; var7++) {
            var4[var7] = 0.0;
         }

         var4[0] = 1.0;
         var4[4] = 1.0;
         var4[8] = 1.0;
         method_19356(var6, var5, var4);
         this.field_20304 = var4[0];
         this.field_20313 = var4[1];
         this.field_20311 = var4[2];
         this.field_20312 = var4[3];
         this.field_20305 = var4[4];
         this.field_20319 = var4[5];
         this.field_20314 = var4[6];
         this.field_20322 = var4[7];
         this.field_20307 = var4[8];
      }
   }

   public static boolean method_19377(double[] var0, int[] var1) {
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
            throw new RuntimeException(class_3730.method_17283("Matrix3d13"));
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

   public static void method_19356(double[] var0, int[] var1, double[] var2) {
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

   public final double method_19405() {
      return this.field_20304 * (this.field_20305 * this.field_20307 - this.field_20319 * this.field_20322)
         + this.field_20313 * (this.field_20319 * this.field_20314 - this.field_20312 * this.field_20307)
         + this.field_20311 * (this.field_20312 * this.field_20322 - this.field_20305 * this.field_20314);
   }

   public final void method_19406(double var1) {
      this.field_20304 = var1;
      this.field_20313 = 0.0;
      this.field_20311 = 0.0;
      this.field_20312 = 0.0;
      this.field_20305 = var1;
      this.field_20319 = 0.0;
      this.field_20314 = 0.0;
      this.field_20322 = 0.0;
      this.field_20307 = var1;
   }

   public final void method_19355(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field_20304 = 1.0;
      this.field_20313 = 0.0;
      this.field_20311 = 0.0;
      this.field_20312 = 0.0;
      this.field_20305 = var7;
      this.field_20319 = -var5;
      this.field_20314 = 0.0;
      this.field_20322 = var5;
      this.field_20307 = var7;
   }

   public final void method_19382(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field_20304 = var7;
      this.field_20313 = 0.0;
      this.field_20311 = var5;
      this.field_20312 = 0.0;
      this.field_20305 = 1.0;
      this.field_20319 = 0.0;
      this.field_20314 = -var5;
      this.field_20322 = 0.0;
      this.field_20307 = var7;
   }

   public final void method_19395(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field_20304 = var7;
      this.field_20313 = -var5;
      this.field_20311 = 0.0;
      this.field_20312 = var5;
      this.field_20305 = var7;
      this.field_20319 = 0.0;
      this.field_20314 = 0.0;
      this.field_20322 = 0.0;
      this.field_20307 = 1.0;
   }

   public final void method_19390(double var1) {
      this.field_20304 *= var1;
      this.field_20313 *= var1;
      this.field_20311 *= var1;
      this.field_20312 *= var1;
      this.field_20305 *= var1;
      this.field_20319 *= var1;
      this.field_20314 *= var1;
      this.field_20322 *= var1;
      this.field_20307 *= var1;
   }

   public final void method_19391(double var1, class_4173 var3) {
      this.field_20304 = var1 * var3.field_20304;
      this.field_20313 = var1 * var3.field_20313;
      this.field_20311 = var1 * var3.field_20311;
      this.field_20312 = var1 * var3.field_20312;
      this.field_20305 = var1 * var3.field_20305;
      this.field_20319 = var1 * var3.field_20319;
      this.field_20314 = var1 * var3.field_20314;
      this.field_20322 = var1 * var3.field_20322;
      this.field_20307 = var1 * var3.field_20307;
   }

   public final void method_19392(class_4173 var1) {
      double var4 = this.field_20304 * var1.field_20304 + this.field_20313 * var1.field_20312 + this.field_20311 * var1.field_20314;
      double var6 = this.field_20304 * var1.field_20313 + this.field_20313 * var1.field_20305 + this.field_20311 * var1.field_20322;
      double var8 = this.field_20304 * var1.field_20311 + this.field_20313 * var1.field_20319 + this.field_20311 * var1.field_20307;
      double var10 = this.field_20312 * var1.field_20304 + this.field_20305 * var1.field_20312 + this.field_20319 * var1.field_20314;
      double var12 = this.field_20312 * var1.field_20313 + this.field_20305 * var1.field_20305 + this.field_20319 * var1.field_20322;
      double var14 = this.field_20312 * var1.field_20311 + this.field_20305 * var1.field_20319 + this.field_20319 * var1.field_20307;
      double var16 = this.field_20314 * var1.field_20304 + this.field_20322 * var1.field_20312 + this.field_20307 * var1.field_20314;
      double var18 = this.field_20314 * var1.field_20313 + this.field_20322 * var1.field_20305 + this.field_20307 * var1.field_20322;
      double var20 = this.field_20314 * var1.field_20311 + this.field_20322 * var1.field_20319 + this.field_20307 * var1.field_20307;
      this.field_20304 = var4;
      this.field_20313 = var6;
      this.field_20311 = var8;
      this.field_20312 = var10;
      this.field_20305 = var12;
      this.field_20319 = var14;
      this.field_20314 = var16;
      this.field_20322 = var18;
      this.field_20307 = var20;
   }

   public final void method_19393(class_4173 var1, class_4173 var2) {
      if (this != var1 && this != var2) {
         this.field_20304 = var1.field_20304 * var2.field_20304 + var1.field_20313 * var2.field_20312 + var1.field_20311 * var2.field_20314;
         this.field_20313 = var1.field_20304 * var2.field_20313 + var1.field_20313 * var2.field_20305 + var1.field_20311 * var2.field_20322;
         this.field_20311 = var1.field_20304 * var2.field_20311 + var1.field_20313 * var2.field_20319 + var1.field_20311 * var2.field_20307;
         this.field_20312 = var1.field_20312 * var2.field_20304 + var1.field_20305 * var2.field_20312 + var1.field_20319 * var2.field_20314;
         this.field_20305 = var1.field_20312 * var2.field_20313 + var1.field_20305 * var2.field_20305 + var1.field_20319 * var2.field_20322;
         this.field_20319 = var1.field_20312 * var2.field_20311 + var1.field_20305 * var2.field_20319 + var1.field_20319 * var2.field_20307;
         this.field_20314 = var1.field_20314 * var2.field_20304 + var1.field_20322 * var2.field_20312 + var1.field_20307 * var2.field_20314;
         this.field_20322 = var1.field_20314 * var2.field_20313 + var1.field_20322 * var2.field_20305 + var1.field_20307 * var2.field_20322;
         this.field_20307 = var1.field_20314 * var2.field_20311 + var1.field_20322 * var2.field_20319 + var1.field_20307 * var2.field_20307;
      } else {
         double var5 = var1.field_20304 * var2.field_20304 + var1.field_20313 * var2.field_20312 + var1.field_20311 * var2.field_20314;
         double var7 = var1.field_20304 * var2.field_20313 + var1.field_20313 * var2.field_20305 + var1.field_20311 * var2.field_20322;
         double var9 = var1.field_20304 * var2.field_20311 + var1.field_20313 * var2.field_20319 + var1.field_20311 * var2.field_20307;
         double var11 = var1.field_20312 * var2.field_20304 + var1.field_20305 * var2.field_20312 + var1.field_20319 * var2.field_20314;
         double var13 = var1.field_20312 * var2.field_20313 + var1.field_20305 * var2.field_20305 + var1.field_20319 * var2.field_20322;
         double var15 = var1.field_20312 * var2.field_20311 + var1.field_20305 * var2.field_20319 + var1.field_20319 * var2.field_20307;
         double var17 = var1.field_20314 * var2.field_20304 + var1.field_20322 * var2.field_20312 + var1.field_20307 * var2.field_20314;
         double var19 = var1.field_20314 * var2.field_20313 + var1.field_20322 * var2.field_20305 + var1.field_20307 * var2.field_20322;
         double var21 = var1.field_20314 * var2.field_20311 + var1.field_20322 * var2.field_20319 + var1.field_20307 * var2.field_20307;
         this.field_20304 = var5;
         this.field_20313 = var7;
         this.field_20311 = var9;
         this.field_20312 = var11;
         this.field_20305 = var13;
         this.field_20319 = var15;
         this.field_20314 = var17;
         this.field_20322 = var19;
         this.field_20307 = var21;
      }
   }

   public final void method_19373(class_4173 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = this.field_20304 * var1.field_20304 + this.field_20313 * var1.field_20312 + this.field_20311 * var1.field_20314;
      var4[1] = this.field_20304 * var1.field_20313 + this.field_20313 * var1.field_20305 + this.field_20311 * var1.field_20322;
      var4[2] = this.field_20304 * var1.field_20311 + this.field_20313 * var1.field_20319 + this.field_20311 * var1.field_20307;
      var4[3] = this.field_20312 * var1.field_20304 + this.field_20305 * var1.field_20312 + this.field_20319 * var1.field_20314;
      var4[4] = this.field_20312 * var1.field_20313 + this.field_20305 * var1.field_20305 + this.field_20319 * var1.field_20322;
      var4[5] = this.field_20312 * var1.field_20311 + this.field_20305 * var1.field_20319 + this.field_20319 * var1.field_20307;
      var4[6] = this.field_20314 * var1.field_20304 + this.field_20322 * var1.field_20312 + this.field_20307 * var1.field_20314;
      var4[7] = this.field_20314 * var1.field_20313 + this.field_20322 * var1.field_20305 + this.field_20307 * var1.field_20322;
      var4[8] = this.field_20314 * var1.field_20311 + this.field_20322 * var1.field_20319 + this.field_20307 * var1.field_20307;
      method_19400(var4, var6, var5);
      this.field_20304 = var5[0];
      this.field_20313 = var5[1];
      this.field_20311 = var5[2];
      this.field_20312 = var5[3];
      this.field_20305 = var5[4];
      this.field_20319 = var5[5];
      this.field_20314 = var5[6];
      this.field_20322 = var5[7];
      this.field_20307 = var5[8];
   }

   public final void method_19374(class_4173 var1, class_4173 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[9];
      double[] var7 = new double[3];
      var5[0] = var1.field_20304 * var2.field_20304 + var1.field_20313 * var2.field_20312 + var1.field_20311 * var2.field_20314;
      var5[1] = var1.field_20304 * var2.field_20313 + var1.field_20313 * var2.field_20305 + var1.field_20311 * var2.field_20322;
      var5[2] = var1.field_20304 * var2.field_20311 + var1.field_20313 * var2.field_20319 + var1.field_20311 * var2.field_20307;
      var5[3] = var1.field_20312 * var2.field_20304 + var1.field_20305 * var2.field_20312 + var1.field_20319 * var2.field_20314;
      var5[4] = var1.field_20312 * var2.field_20313 + var1.field_20305 * var2.field_20305 + var1.field_20319 * var2.field_20322;
      var5[5] = var1.field_20312 * var2.field_20311 + var1.field_20305 * var2.field_20319 + var1.field_20319 * var2.field_20307;
      var5[6] = var1.field_20314 * var2.field_20304 + var1.field_20322 * var2.field_20312 + var1.field_20307 * var2.field_20314;
      var5[7] = var1.field_20314 * var2.field_20313 + var1.field_20322 * var2.field_20305 + var1.field_20307 * var2.field_20322;
      var5[8] = var1.field_20314 * var2.field_20311 + var1.field_20322 * var2.field_20319 + var1.field_20307 * var2.field_20307;
      method_19400(var5, var7, var6);
      this.field_20304 = var6[0];
      this.field_20313 = var6[1];
      this.field_20311 = var6[2];
      this.field_20312 = var6[3];
      this.field_20305 = var6[4];
      this.field_20319 = var6[5];
      this.field_20314 = var6[6];
      this.field_20322 = var6[7];
      this.field_20307 = var6[8];
   }

   public final void method_19364(class_4173 var1, class_4173 var2) {
      if (this != var1 && this != var2) {
         this.field_20304 = var1.field_20304 * var2.field_20304 + var1.field_20312 * var2.field_20313 + var1.field_20314 * var2.field_20311;
         this.field_20313 = var1.field_20304 * var2.field_20312 + var1.field_20312 * var2.field_20305 + var1.field_20314 * var2.field_20319;
         this.field_20311 = var1.field_20304 * var2.field_20314 + var1.field_20312 * var2.field_20322 + var1.field_20314 * var2.field_20307;
         this.field_20312 = var1.field_20313 * var2.field_20304 + var1.field_20305 * var2.field_20313 + var1.field_20322 * var2.field_20311;
         this.field_20305 = var1.field_20313 * var2.field_20312 + var1.field_20305 * var2.field_20305 + var1.field_20322 * var2.field_20319;
         this.field_20319 = var1.field_20313 * var2.field_20314 + var1.field_20305 * var2.field_20322 + var1.field_20322 * var2.field_20307;
         this.field_20314 = var1.field_20311 * var2.field_20304 + var1.field_20319 * var2.field_20313 + var1.field_20307 * var2.field_20311;
         this.field_20322 = var1.field_20311 * var2.field_20312 + var1.field_20319 * var2.field_20305 + var1.field_20307 * var2.field_20319;
         this.field_20307 = var1.field_20311 * var2.field_20314 + var1.field_20319 * var2.field_20322 + var1.field_20307 * var2.field_20307;
      } else {
         double var5 = var1.field_20304 * var2.field_20304 + var1.field_20312 * var2.field_20313 + var1.field_20314 * var2.field_20311;
         double var7 = var1.field_20304 * var2.field_20312 + var1.field_20312 * var2.field_20305 + var1.field_20314 * var2.field_20319;
         double var9 = var1.field_20304 * var2.field_20314 + var1.field_20312 * var2.field_20322 + var1.field_20314 * var2.field_20307;
         double var11 = var1.field_20313 * var2.field_20304 + var1.field_20305 * var2.field_20313 + var1.field_20322 * var2.field_20311;
         double var13 = var1.field_20313 * var2.field_20312 + var1.field_20305 * var2.field_20305 + var1.field_20322 * var2.field_20319;
         double var15 = var1.field_20313 * var2.field_20314 + var1.field_20305 * var2.field_20322 + var1.field_20322 * var2.field_20307;
         double var17 = var1.field_20311 * var2.field_20304 + var1.field_20319 * var2.field_20313 + var1.field_20307 * var2.field_20311;
         double var19 = var1.field_20311 * var2.field_20312 + var1.field_20319 * var2.field_20305 + var1.field_20307 * var2.field_20319;
         double var21 = var1.field_20311 * var2.field_20314 + var1.field_20319 * var2.field_20322 + var1.field_20307 * var2.field_20307;
         this.field_20304 = var5;
         this.field_20313 = var7;
         this.field_20311 = var9;
         this.field_20312 = var11;
         this.field_20305 = var13;
         this.field_20319 = var15;
         this.field_20314 = var17;
         this.field_20322 = var19;
         this.field_20307 = var21;
      }
   }

   public final void method_19427(class_4173 var1, class_4173 var2) {
      if (this != var1 && this != var2) {
         this.field_20304 = var1.field_20304 * var2.field_20304 + var1.field_20313 * var2.field_20313 + var1.field_20311 * var2.field_20311;
         this.field_20313 = var1.field_20304 * var2.field_20312 + var1.field_20313 * var2.field_20305 + var1.field_20311 * var2.field_20319;
         this.field_20311 = var1.field_20304 * var2.field_20314 + var1.field_20313 * var2.field_20322 + var1.field_20311 * var2.field_20307;
         this.field_20312 = var1.field_20312 * var2.field_20304 + var1.field_20305 * var2.field_20313 + var1.field_20319 * var2.field_20311;
         this.field_20305 = var1.field_20312 * var2.field_20312 + var1.field_20305 * var2.field_20305 + var1.field_20319 * var2.field_20319;
         this.field_20319 = var1.field_20312 * var2.field_20314 + var1.field_20305 * var2.field_20322 + var1.field_20319 * var2.field_20307;
         this.field_20314 = var1.field_20314 * var2.field_20304 + var1.field_20322 * var2.field_20313 + var1.field_20307 * var2.field_20311;
         this.field_20322 = var1.field_20314 * var2.field_20312 + var1.field_20322 * var2.field_20305 + var1.field_20307 * var2.field_20319;
         this.field_20307 = var1.field_20314 * var2.field_20314 + var1.field_20322 * var2.field_20322 + var1.field_20307 * var2.field_20307;
      } else {
         double var5 = var1.field_20304 * var2.field_20304 + var1.field_20313 * var2.field_20313 + var1.field_20311 * var2.field_20311;
         double var7 = var1.field_20304 * var2.field_20312 + var1.field_20313 * var2.field_20305 + var1.field_20311 * var2.field_20319;
         double var9 = var1.field_20304 * var2.field_20314 + var1.field_20313 * var2.field_20322 + var1.field_20311 * var2.field_20307;
         double var11 = var1.field_20312 * var2.field_20304 + var1.field_20305 * var2.field_20313 + var1.field_20319 * var2.field_20311;
         double var13 = var1.field_20312 * var2.field_20312 + var1.field_20305 * var2.field_20305 + var1.field_20319 * var2.field_20319;
         double var15 = var1.field_20312 * var2.field_20314 + var1.field_20305 * var2.field_20322 + var1.field_20319 * var2.field_20307;
         double var17 = var1.field_20314 * var2.field_20304 + var1.field_20322 * var2.field_20313 + var1.field_20307 * var2.field_20311;
         double var19 = var1.field_20314 * var2.field_20312 + var1.field_20322 * var2.field_20305 + var1.field_20307 * var2.field_20319;
         double var21 = var1.field_20314 * var2.field_20314 + var1.field_20322 * var2.field_20322 + var1.field_20307 * var2.field_20307;
         this.field_20304 = var5;
         this.field_20313 = var7;
         this.field_20311 = var9;
         this.field_20312 = var11;
         this.field_20305 = var13;
         this.field_20319 = var15;
         this.field_20314 = var17;
         this.field_20322 = var19;
         this.field_20307 = var21;
      }
   }

   public final void method_19417(class_4173 var1, class_4173 var2) {
      if (this != var1 && this != var2) {
         this.field_20304 = var1.field_20304 * var2.field_20304 + var1.field_20312 * var2.field_20312 + var1.field_20314 * var2.field_20314;
         this.field_20313 = var1.field_20304 * var2.field_20313 + var1.field_20312 * var2.field_20305 + var1.field_20314 * var2.field_20322;
         this.field_20311 = var1.field_20304 * var2.field_20311 + var1.field_20312 * var2.field_20319 + var1.field_20314 * var2.field_20307;
         this.field_20312 = var1.field_20313 * var2.field_20304 + var1.field_20305 * var2.field_20312 + var1.field_20322 * var2.field_20314;
         this.field_20305 = var1.field_20313 * var2.field_20313 + var1.field_20305 * var2.field_20305 + var1.field_20322 * var2.field_20322;
         this.field_20319 = var1.field_20313 * var2.field_20311 + var1.field_20305 * var2.field_20319 + var1.field_20322 * var2.field_20307;
         this.field_20314 = var1.field_20311 * var2.field_20304 + var1.field_20319 * var2.field_20312 + var1.field_20307 * var2.field_20314;
         this.field_20322 = var1.field_20311 * var2.field_20313 + var1.field_20319 * var2.field_20305 + var1.field_20307 * var2.field_20322;
         this.field_20307 = var1.field_20311 * var2.field_20311 + var1.field_20319 * var2.field_20319 + var1.field_20307 * var2.field_20307;
      } else {
         double var5 = var1.field_20304 * var2.field_20304 + var1.field_20312 * var2.field_20312 + var1.field_20314 * var2.field_20314;
         double var7 = var1.field_20304 * var2.field_20313 + var1.field_20312 * var2.field_20305 + var1.field_20314 * var2.field_20322;
         double var9 = var1.field_20304 * var2.field_20311 + var1.field_20312 * var2.field_20319 + var1.field_20314 * var2.field_20307;
         double var11 = var1.field_20313 * var2.field_20304 + var1.field_20305 * var2.field_20312 + var1.field_20322 * var2.field_20314;
         double var13 = var1.field_20313 * var2.field_20313 + var1.field_20305 * var2.field_20305 + var1.field_20322 * var2.field_20322;
         double var15 = var1.field_20313 * var2.field_20311 + var1.field_20305 * var2.field_20319 + var1.field_20322 * var2.field_20307;
         double var17 = var1.field_20311 * var2.field_20304 + var1.field_20319 * var2.field_20312 + var1.field_20307 * var2.field_20314;
         double var19 = var1.field_20311 * var2.field_20313 + var1.field_20319 * var2.field_20305 + var1.field_20307 * var2.field_20322;
         double var21 = var1.field_20311 * var2.field_20311 + var1.field_20319 * var2.field_20319 + var1.field_20307 * var2.field_20307;
         this.field_20304 = var5;
         this.field_20313 = var7;
         this.field_20311 = var9;
         this.field_20312 = var11;
         this.field_20305 = var13;
         this.field_20319 = var15;
         this.field_20314 = var17;
         this.field_20322 = var19;
         this.field_20307 = var21;
      }
   }

   public final void method_19421() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method_19434(var4, var3);
      this.field_20304 = var3[0];
      this.field_20313 = var3[1];
      this.field_20311 = var3[2];
      this.field_20312 = var3[3];
      this.field_20305 = var3[4];
      this.field_20319 = var3[5];
      this.field_20314 = var3[6];
      this.field_20322 = var3[7];
      this.field_20307 = var3[8];
   }

   public final void method_19422(class_4173 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = var1.field_20304;
      var4[1] = var1.field_20313;
      var4[2] = var1.field_20311;
      var4[3] = var1.field_20312;
      var4[4] = var1.field_20305;
      var4[5] = var1.field_20319;
      var4[6] = var1.field_20314;
      var4[7] = var1.field_20322;
      var4[8] = var1.field_20307;
      method_19400(var4, var6, var5);
      this.field_20304 = var5[0];
      this.field_20313 = var5[1];
      this.field_20311 = var5[2];
      this.field_20312 = var5[3];
      this.field_20305 = var5[4];
      this.field_20319 = var5[5];
      this.field_20314 = var5[6];
      this.field_20322 = var5[7];
      this.field_20307 = var5[8];
   }

   public final void method_19375() {
      double var3 = 1.0 / Math.sqrt(this.field_20304 * this.field_20304 + this.field_20312 * this.field_20312 + this.field_20314 * this.field_20314);
      this.field_20304 *= var3;
      this.field_20312 *= var3;
      this.field_20314 *= var3;
      var3 = 1.0 / Math.sqrt(this.field_20313 * this.field_20313 + this.field_20305 * this.field_20305 + this.field_20322 * this.field_20322);
      this.field_20313 *= var3;
      this.field_20305 *= var3;
      this.field_20322 *= var3;
      this.field_20311 = this.field_20312 * this.field_20322 - this.field_20305 * this.field_20314;
      this.field_20319 = this.field_20313 * this.field_20314 - this.field_20304 * this.field_20322;
      this.field_20307 = this.field_20304 * this.field_20305 - this.field_20313 * this.field_20312;
   }

   public final void method_19376(class_4173 var1) {
      double var4 = 1.0 / Math.sqrt(var1.field_20304 * var1.field_20304 + var1.field_20312 * var1.field_20312 + var1.field_20314 * var1.field_20314);
      this.field_20304 = var1.field_20304 * var4;
      this.field_20312 = var1.field_20312 * var4;
      this.field_20314 = var1.field_20314 * var4;
      var4 = 1.0 / Math.sqrt(var1.field_20313 * var1.field_20313 + var1.field_20305 * var1.field_20305 + var1.field_20322 * var1.field_20322);
      this.field_20313 = var1.field_20313 * var4;
      this.field_20305 = var1.field_20305 * var4;
      this.field_20322 = var1.field_20322 * var4;
      this.field_20311 = this.field_20312 * this.field_20322 - this.field_20305 * this.field_20314;
      this.field_20319 = this.field_20313 * this.field_20314 - this.field_20304 * this.field_20322;
      this.field_20307 = this.field_20304 * this.field_20305 - this.field_20313 * this.field_20312;
   }

   public boolean equals(class_4173 var1) {
      try {
         return this.field_20304 == var1.field_20304
            && this.field_20313 == var1.field_20313
            && this.field_20311 == var1.field_20311
            && this.field_20312 == var1.field_20312
            && this.field_20305 == var1.field_20305
            && this.field_20319 == var1.field_20319
            && this.field_20314 == var1.field_20314
            && this.field_20322 == var1.field_20322
            && this.field_20307 == var1.field_20307;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_4173 var4 = (class_4173)var1;
         return this.field_20304 == var4.field_20304
            && this.field_20313 == var4.field_20313
            && this.field_20311 == var4.field_20311
            && this.field_20312 == var4.field_20312
            && this.field_20305 == var4.field_20305
            && this.field_20319 == var4.field_20319
            && this.field_20314 == var4.field_20314
            && this.field_20322 == var4.field_20322
            && this.field_20307 == var4.field_20307;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method_19403(class_4173 var1, double var2) {
      double var6 = this.field_20304 - var1.field_20304;
      if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
         var6 = this.field_20313 - var1.field_20313;
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field_20311 - var1.field_20311;
            if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
               var6 = this.field_20312 - var1.field_20312;
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field_20305 - var1.field_20305;
                  if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                     var6 = this.field_20319 - var1.field_20319;
                     if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                        var6 = this.field_20314 - var1.field_20314;
                        if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                           var6 = this.field_20322 - var1.field_20322;
                           if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                              var6 = this.field_20307 - var1.field_20307;
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
      var3 = 31L * var3 + class_9845.method_45350(this.field_20304);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20313);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20311);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20312);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20305);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20319);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20314);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20322);
      var3 = 31L * var3 + class_9845.method_45350(this.field_20307);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_19358() {
      this.field_20304 = 0.0;
      this.field_20313 = 0.0;
      this.field_20311 = 0.0;
      this.field_20312 = 0.0;
      this.field_20305 = 0.0;
      this.field_20319 = 0.0;
      this.field_20314 = 0.0;
      this.field_20322 = 0.0;
      this.field_20307 = 0.0;
   }

   public final void method_19430() {
      this.field_20304 = -this.field_20304;
      this.field_20313 = -this.field_20313;
      this.field_20311 = -this.field_20311;
      this.field_20312 = -this.field_20312;
      this.field_20305 = -this.field_20305;
      this.field_20319 = -this.field_20319;
      this.field_20314 = -this.field_20314;
      this.field_20322 = -this.field_20322;
      this.field_20307 = -this.field_20307;
   }

   public final void method_19431(class_4173 var1) {
      this.field_20304 = -var1.field_20304;
      this.field_20313 = -var1.field_20313;
      this.field_20311 = -var1.field_20311;
      this.field_20312 = -var1.field_20312;
      this.field_20305 = -var1.field_20305;
      this.field_20319 = -var1.field_20319;
      this.field_20314 = -var1.field_20314;
      this.field_20322 = -var1.field_20322;
      this.field_20307 = -var1.field_20307;
   }

   public final void method_19367(class_3519 var1) {
      double var4 = this.field_20304 * var1.field_17244 + this.field_20313 * var1.field_17242 + this.field_20311 * var1.field_17241;
      double var6 = this.field_20312 * var1.field_17244 + this.field_20305 * var1.field_17242 + this.field_20319 * var1.field_17241;
      double var8 = this.field_20314 * var1.field_17244 + this.field_20322 * var1.field_17242 + this.field_20307 * var1.field_17241;
      var1.method_16230(var4, var6, var8);
   }

   public final void method_19368(class_3519 var1, class_3519 var2) {
      double var5 = this.field_20304 * var1.field_17244 + this.field_20313 * var1.field_17242 + this.field_20311 * var1.field_17241;
      double var7 = this.field_20312 * var1.field_17244 + this.field_20305 * var1.field_17242 + this.field_20319 * var1.field_17241;
      var2.field_17241 = this.field_20314 * var1.field_17244 + this.field_20322 * var1.field_17242 + this.field_20307 * var1.field_17241;
      var2.field_17244 = var5;
      var2.field_17242 = var7;
   }

   public final void method_19434(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         this.field_20304,
         this.field_20313,
         this.field_20311,
         this.field_20312,
         this.field_20305,
         this.field_20319,
         this.field_20314,
         this.field_20322,
         this.field_20307
      };
      method_19400(var5, var1, var2);
   }

   public static void method_19400(double[] var0, double[] var1, double[] var2) {
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
         method_19423(var8, var12, var5, var6);
      }

      var13[0] = var8[0];
      var13[1] = var8[1];
      var13[2] = var8[2];
      if (method_19402(Math.abs(var13[0]), 1.0) && method_19402(Math.abs(var13[1]), 1.0) && method_19402(Math.abs(var13[2]), 1.0)) {
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

      method_19442(var5, var7);
      method_19442(var6, var8);
      method_19420(var0, var7, var8, var13, var2, var1);
   }

   public static void method_19420(double[] var0, double[] var1, double[] var2, double[] var3, double[] var4, double[] var5) {
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

      method_19435(var1, var2, var11);
      if (method_19402(Math.abs(var3[0]), Math.abs(var3[1])) && method_19402(Math.abs(var3[1]), Math.abs(var3[2]))) {
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

   public static int method_19423(double[] var0, double[] var1, double[] var2, double[] var3) {
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
         double var22 = method_19362(var0[1], var1[1], var0[2]);
         double var24 = (Math.abs(var0[0]) - var22) * (method_19419(var11, var0[0]) + var22 / var0[0]);
         double var26 = var1[0];
         double var28 = method_19416(var24, var26, var9, var7, 0, var16);
         var24 = var7[0] * var0[0] + var9[0] * var1[0];
         var1[0] = var7[0] * var1[0] - var9[0] * var0[0];
         var26 = var9[0] * var0[1];
         var0[1] = var7[0] * var0[1];
         var28 = method_19416(var24, var26, var8, var6, 0, var16);
         var16 = 0;
         var0[0] = var28;
         var24 = var6[0] * var1[0] + var8[0] * var0[1];
         var0[1] = var6[0] * var0[1] - var8[0] * var1[0];
         var26 = var8[0] * var1[1];
         var1[1] = var6[0] * var1[1];
         var28 = method_19416(var24, var26, var9, var7, 1, var16);
         var1[0] = var28;
         var24 = var7[1] * var0[1] + var9[1] * var1[1];
         var1[1] = var7[1] * var1[1] - var9[1] * var0[1];
         var26 = var9[1] * var0[2];
         var0[2] = var7[1] * var0[2];
         var28 = method_19416(var24, var26, var8, var6, 1, var16);
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
         method_19414(var0[1], var1[1], var0[2], var0, var8, var6, var9, var7, 1);
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
         method_19414(var0[0], var1[0], var0[1], var0, var8, var6, var9, var7, 0);
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

   public static double method_19394(double var0, double var2) {
      return !(var0 > var2) ? var2 : var0;
   }

   public static double method_19372(double var0, double var2) {
      return !(var0 < var2) ? var2 : var0;
   }

   public static double method_19419(double var0, double var2) {
      double var6 = !(var0 >= 0.0) ? -var0 : var0;
      return !(var2 >= 0.0) ? -var6 : var6;
   }

   public static double method_19362(double var0, double var2, double var4) {
      double var8 = Math.abs(var0);
      double var10 = Math.abs(var2);
      double var12 = Math.abs(var4);
      double var14 = method_19372(var8, var12);
      double var16 = method_19394(var8, var12);
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
            double var36 = method_19372(var16, var10) / method_19394(var16, var10);
         }
      }

      return var38;
   }

   public static int method_19414(double var0, double var2, double var4, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
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
                  var55 = var2 / method_19419(var49, var32) + var53 / var55;
               } else {
                  var55 = method_19419(var14, var32) * method_19419(var16, var2);
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
            var30 = method_19419(var16, var10[0]) * method_19419(var16, var8[0]) * method_19419(var16, var0);
         }

         if (var40 == 2) {
            var30 = method_19419(var16, var9[0]) * method_19419(var16, var8[0]) * method_19419(var16, var2);
         }

         if (var40 == 3) {
            var30 = method_19419(var16, var9[0]) * method_19419(var16, var7[0]) * method_19419(var16, var4);
         }

         var6[var11] = method_19419(var18, var30);
         double var67 = var30 * method_19419(var16, var0) * method_19419(var16, var4);
         var6[var11 + 1] = method_19419(var20, var67);
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

   public static double method_19416(double var0, double var2, double[] var4, double[] var5, int var6, int var7) {
      double var16;
      double var18;
      double var20;
      if (var2 != 0.0) {
         if (var0 != 0.0) {
            double var10 = var0;
            double var12 = var2;
            double var14 = method_19394(Math.abs(var0), Math.abs(var2));
            if (!(var14 >= 4.994797680505588E145)) {
               if (!(var14 <= 2.002083095183101E-146)) {
                  var16 = Math.sqrt(var0 * var0 + var2 * var2);
                  var18 = var0 / var16;
                  var20 = var2 / var16;
               } else {
                  int var25;
                  for (var25 = 0; var14 <= 2.002083095183101E-146; var14 = method_19394(Math.abs(var10), Math.abs(var12))) {
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
               for (var22 = 0; var14 >= 4.994797680505588E145; var14 = method_19394(Math.abs(var10), Math.abs(var12))) {
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

   public static void method_19357(double[] var0) {
      for (int var3 = 0; var3 < 3; var3++) {
         System.out.println(var0[var3 * 3 + 0] + " " + var0[var3 * 3 + 1] + " " + var0[var3 * 3 + 2] + "\n");
      }
   }

   public static void method_19363(double[] var0) {
      double var3 = var0[0] * var0[4] * var0[8]
         + var0[1] * var0[5] * var0[6]
         + var0[2] * var0[3] * var0[7]
         - var0[2] * var0[4] * var0[6]
         - var0[0] * var0[5] * var0[7]
         - var0[1] * var0[3] * var0[8];
      System.out.println("det= " + var3);
   }

   public static void method_19435(double[] var0, double[] var1, double[] var2) {
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

   public static void method_19442(double[] var0, double[] var1) {
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

   public static double method_19359(double[] var0) {
      if (!(var0[0] > var0[1])) {
         return !(var0[1] > var0[2]) ? var0[2] : var0[1];
      } else {
         return !(var0[0] > var0[2]) ? var0[2] : var0[0];
      }
   }

   private static final boolean method_19402(double var0, double var2) {
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
         return (class_4173)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final double method_19432() {
      return this.field_20304;
   }

   public final void method_19418(double var1) {
      this.field_20304 = var1;
   }

   public final double method_19426() {
      return this.field_20313;
   }

   public final void method_19378(double var1) {
      this.field_20313 = var1;
   }

   public final double method_19415() {
      return this.field_20311;
   }

   public final void method_19387(double var1) {
      this.field_20311 = var1;
   }

   public final double method_19441() {
      return this.field_20312;
   }

   public final void method_19388(double var1) {
      this.field_20312 = var1;
   }

   public final double method_19361() {
      return this.field_20305;
   }

   public final void method_19428(double var1) {
      this.field_20305 = var1;
   }

   public final double method_19429() {
      return this.field_20319;
   }

   public final void method_19385(double var1) {
      this.field_20319 = var1;
   }

   public final double method_19401() {
      return this.field_20314;
   }

   public final void method_19443(double var1) {
      this.field_20314 = var1;
   }

   public final double method_19350() {
      return this.field_20322;
   }

   public final void method_19369(double var1) {
      this.field_20322 = var1;
   }

   public final double method_19384() {
      return this.field_20307;
   }

   public final void method_19389(double var1) {
      this.field_20307 = var1;
   }
}
