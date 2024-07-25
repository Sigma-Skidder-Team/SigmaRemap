package remapped;

import java.io.Serializable;

public class class_3367 implements Serializable, Cloneable {
   public static final long field_16603 = 329697160112089834L;
   public float field_16607;
   public float field_16596;
   public float field_16597;
   public float field_16606;
   public float field_16602;
   public float field_16599;
   public float field_16604;
   public float field_16605;
   public float field_16600;
   private static final double field_16601 = 1.0E-8;

   public class_3367(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.field_16607 = var1;
      this.field_16596 = var2;
      this.field_16597 = var3;
      this.field_16606 = var4;
      this.field_16602 = var5;
      this.field_16599 = var6;
      this.field_16604 = var7;
      this.field_16605 = var8;
      this.field_16600 = var9;
   }

   public class_3367(float[] var1) {
      this.field_16607 = var1[0];
      this.field_16596 = var1[1];
      this.field_16597 = var1[2];
      this.field_16606 = var1[3];
      this.field_16602 = var1[4];
      this.field_16599 = var1[5];
      this.field_16604 = var1[6];
      this.field_16605 = var1[7];
      this.field_16600 = var1[8];
   }

   public class_3367(class_4173 var1) {
      this.field_16607 = (float)var1.field_20304;
      this.field_16596 = (float)var1.field_20313;
      this.field_16597 = (float)var1.field_20311;
      this.field_16606 = (float)var1.field_20312;
      this.field_16602 = (float)var1.field_20305;
      this.field_16599 = (float)var1.field_20319;
      this.field_16604 = (float)var1.field_20314;
      this.field_16605 = (float)var1.field_20322;
      this.field_16600 = (float)var1.field_20307;
   }

   public class_3367(class_3367 var1) {
      this.field_16607 = var1.field_16607;
      this.field_16596 = var1.field_16596;
      this.field_16597 = var1.field_16597;
      this.field_16606 = var1.field_16606;
      this.field_16602 = var1.field_16602;
      this.field_16599 = var1.field_16599;
      this.field_16604 = var1.field_16604;
      this.field_16605 = var1.field_16605;
      this.field_16600 = var1.field_16600;
   }

   public class_3367() {
      this.field_16607 = 0.0F;
      this.field_16596 = 0.0F;
      this.field_16597 = 0.0F;
      this.field_16606 = 0.0F;
      this.field_16602 = 0.0F;
      this.field_16599 = 0.0F;
      this.field_16604 = 0.0F;
      this.field_16605 = 0.0F;
      this.field_16600 = 0.0F;
   }

   @Override
   public String toString() {
      return this.field_16607
         + ", "
         + this.field_16596
         + ", "
         + this.field_16597
         + "\n"
         + this.field_16606
         + ", "
         + this.field_16602
         + ", "
         + this.field_16599
         + "\n"
         + this.field_16604
         + ", "
         + this.field_16605
         + ", "
         + this.field_16600
         + "\n";
   }

   public final void method_15496() {
      this.field_16607 = 1.0F;
      this.field_16596 = 0.0F;
      this.field_16597 = 0.0F;
      this.field_16606 = 0.0F;
      this.field_16602 = 1.0F;
      this.field_16599 = 0.0F;
      this.field_16604 = 0.0F;
      this.field_16605 = 0.0F;
      this.field_16600 = 1.0F;
   }

   public final void method_15451(float var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_15440(var5, var4);
      this.field_16607 = (float)(var4[0] * (double)var1);
      this.field_16596 = (float)(var4[1] * (double)var1);
      this.field_16597 = (float)(var4[2] * (double)var1);
      this.field_16606 = (float)(var4[3] * (double)var1);
      this.field_16602 = (float)(var4[4] * (double)var1);
      this.field_16599 = (float)(var4[5] * (double)var1);
      this.field_16604 = (float)(var4[6] * (double)var1);
      this.field_16605 = (float)(var4[7] * (double)var1);
      this.field_16600 = (float)(var4[8] * (double)var1);
   }

   public final void method_15463(int var1, int var2, float var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field_16607 = var3;
                  return;
               case 1:
                  this.field_16596 = var3;
                  return;
               case 2:
                  this.field_16597 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field_16606 = var3;
                  return;
               case 1:
                  this.field_16602 = var3;
                  return;
               case 2:
                  this.field_16599 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field_16604 = var3;
                  return;
               case 1:
                  this.field_16605 = var3;
                  return;
               case 2:
                  this.field_16600 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f0"));
      }
   }

   public final void method_15510(int var1, class_6181 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f1"));
            }

            var2.field_4390 = this.field_16604;
            var2.field_4391 = this.field_16605;
            var2.field_4393 = this.field_16600;
         } else {
            var2.field_4390 = this.field_16606;
            var2.field_4391 = this.field_16602;
            var2.field_4393 = this.field_16599;
         }
      } else {
         var2.field_4390 = this.field_16607;
         var2.field_4391 = this.field_16596;
         var2.field_4393 = this.field_16597;
      }
   }

   public final void method_15511(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f1"));
            }

            var2[0] = this.field_16604;
            var2[1] = this.field_16605;
            var2[2] = this.field_16600;
         } else {
            var2[0] = this.field_16606;
            var2[1] = this.field_16602;
            var2[2] = this.field_16599;
         }
      } else {
         var2[0] = this.field_16607;
         var2[1] = this.field_16596;
         var2[2] = this.field_16597;
      }
   }

   public final void method_15445(int var1, class_6181 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f3"));
            }

            var2.field_4390 = this.field_16597;
            var2.field_4391 = this.field_16599;
            var2.field_4393 = this.field_16600;
         } else {
            var2.field_4390 = this.field_16596;
            var2.field_4391 = this.field_16602;
            var2.field_4393 = this.field_16605;
         }
      } else {
         var2.field_4390 = this.field_16607;
         var2.field_4391 = this.field_16606;
         var2.field_4393 = this.field_16604;
      }
   }

   public final void method_15446(int var1, float[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f3"));
            }

            var2[0] = this.field_16597;
            var2[1] = this.field_16599;
            var2[2] = this.field_16600;
         } else {
            var2[0] = this.field_16596;
            var2[1] = this.field_16602;
            var2[2] = this.field_16605;
         }
      } else {
         var2[0] = this.field_16607;
         var2[1] = this.field_16606;
         var2[2] = this.field_16604;
      }
   }

   public final float method_15469(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field_16607;
               case 1:
                  return this.field_16596;
               case 2:
                  return this.field_16597;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f5"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field_16606;
               case 1:
                  return this.field_16602;
               case 2:
                  return this.field_16599;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f5"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field_16604;
               case 1:
                  return this.field_16605;
               case 2:
                  return this.field_16600;
            }
      }

      throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f5"));
   }

   public final void method_15471(int var1, float var2, float var3, float var4) {
      switch (var1) {
         case 0:
            this.field_16607 = var2;
            this.field_16596 = var3;
            this.field_16597 = var4;
            break;
         case 1:
            this.field_16606 = var2;
            this.field_16602 = var3;
            this.field_16599 = var4;
            break;
         case 2:
            this.field_16604 = var2;
            this.field_16605 = var3;
            this.field_16600 = var4;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f6"));
      }
   }

   public final void method_15472(int var1, class_6181 var2) {
      switch (var1) {
         case 0:
            this.field_16607 = var2.field_4390;
            this.field_16596 = var2.field_4391;
            this.field_16597 = var2.field_4393;
            break;
         case 1:
            this.field_16606 = var2.field_4390;
            this.field_16602 = var2.field_4391;
            this.field_16599 = var2.field_4393;
            break;
         case 2:
            this.field_16604 = var2.field_4390;
            this.field_16605 = var2.field_4391;
            this.field_16600 = var2.field_4393;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f6"));
      }
   }

   public final void method_15473(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field_16607 = var2[0];
            this.field_16596 = var2[1];
            this.field_16597 = var2[2];
            break;
         case 1:
            this.field_16606 = var2[0];
            this.field_16602 = var2[1];
            this.field_16599 = var2[2];
            break;
         case 2:
            this.field_16604 = var2[0];
            this.field_16605 = var2[1];
            this.field_16600 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f6"));
      }
   }

   public final void method_15502(int var1, float var2, float var3, float var4) {
      switch (var1) {
         case 0:
            this.field_16607 = var2;
            this.field_16606 = var3;
            this.field_16604 = var4;
            break;
         case 1:
            this.field_16596 = var2;
            this.field_16602 = var3;
            this.field_16605 = var4;
            break;
         case 2:
            this.field_16597 = var2;
            this.field_16599 = var3;
            this.field_16600 = var4;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f9"));
      }
   }

   public final void method_15503(int var1, class_6181 var2) {
      switch (var1) {
         case 0:
            this.field_16607 = var2.field_4390;
            this.field_16606 = var2.field_4391;
            this.field_16604 = var2.field_4393;
            break;
         case 1:
            this.field_16596 = var2.field_4390;
            this.field_16602 = var2.field_4391;
            this.field_16605 = var2.field_4393;
            break;
         case 2:
            this.field_16597 = var2.field_4390;
            this.field_16599 = var2.field_4391;
            this.field_16600 = var2.field_4393;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f9"));
      }
   }

   public final void method_15504(int var1, float[] var2) {
      switch (var1) {
         case 0:
            this.field_16607 = var2[0];
            this.field_16606 = var2[1];
            this.field_16604 = var2[2];
            break;
         case 1:
            this.field_16596 = var2[0];
            this.field_16602 = var2[1];
            this.field_16605 = var2[2];
            break;
         case 2:
            this.field_16597 = var2[0];
            this.field_16599 = var2[1];
            this.field_16600 = var2[2];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix3f9"));
      }
   }

   public final float method_15497() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method_15440(var4, var3);
      return (float)class_4173.method_19359(var4);
   }

   public final void method_15476(float var1) {
      this.field_16607 += var1;
      this.field_16596 += var1;
      this.field_16597 += var1;
      this.field_16606 += var1;
      this.field_16602 += var1;
      this.field_16599 += var1;
      this.field_16604 += var1;
      this.field_16605 += var1;
      this.field_16600 += var1;
   }

   public final void method_15477(float var1, class_3367 var2) {
      this.field_16607 = var2.field_16607 + var1;
      this.field_16596 = var2.field_16596 + var1;
      this.field_16597 = var2.field_16597 + var1;
      this.field_16606 = var2.field_16606 + var1;
      this.field_16602 = var2.field_16602 + var1;
      this.field_16599 = var2.field_16599 + var1;
      this.field_16604 = var2.field_16604 + var1;
      this.field_16605 = var2.field_16605 + var1;
      this.field_16600 = var2.field_16600 + var1;
   }

   public final void method_15479(class_3367 var1, class_3367 var2) {
      this.field_16607 = var1.field_16607 + var2.field_16607;
      this.field_16596 = var1.field_16596 + var2.field_16596;
      this.field_16597 = var1.field_16597 + var2.field_16597;
      this.field_16606 = var1.field_16606 + var2.field_16606;
      this.field_16602 = var1.field_16602 + var2.field_16602;
      this.field_16599 = var1.field_16599 + var2.field_16599;
      this.field_16604 = var1.field_16604 + var2.field_16604;
      this.field_16605 = var1.field_16605 + var2.field_16605;
      this.field_16600 = var1.field_16600 + var2.field_16600;
   }

   public final void method_15478(class_3367 var1) {
      this.field_16607 = this.field_16607 + var1.field_16607;
      this.field_16596 = this.field_16596 + var1.field_16596;
      this.field_16597 = this.field_16597 + var1.field_16597;
      this.field_16606 = this.field_16606 + var1.field_16606;
      this.field_16602 = this.field_16602 + var1.field_16602;
      this.field_16599 = this.field_16599 + var1.field_16599;
      this.field_16604 = this.field_16604 + var1.field_16604;
      this.field_16605 = this.field_16605 + var1.field_16605;
      this.field_16600 = this.field_16600 + var1.field_16600;
   }

   public final void method_15450(class_3367 var1, class_3367 var2) {
      this.field_16607 = var1.field_16607 - var2.field_16607;
      this.field_16596 = var1.field_16596 - var2.field_16596;
      this.field_16597 = var1.field_16597 - var2.field_16597;
      this.field_16606 = var1.field_16606 - var2.field_16606;
      this.field_16602 = var1.field_16602 - var2.field_16602;
      this.field_16599 = var1.field_16599 - var2.field_16599;
      this.field_16604 = var1.field_16604 - var2.field_16604;
      this.field_16605 = var1.field_16605 - var2.field_16605;
      this.field_16600 = var1.field_16600 - var2.field_16600;
   }

   public final void method_15449(class_3367 var1) {
      this.field_16607 = this.field_16607 - var1.field_16607;
      this.field_16596 = this.field_16596 - var1.field_16596;
      this.field_16597 = this.field_16597 - var1.field_16597;
      this.field_16606 = this.field_16606 - var1.field_16606;
      this.field_16602 = this.field_16602 - var1.field_16602;
      this.field_16599 = this.field_16599 - var1.field_16599;
      this.field_16604 = this.field_16604 - var1.field_16604;
      this.field_16605 = this.field_16605 - var1.field_16605;
      this.field_16600 = this.field_16600 - var1.field_16600;
   }

   public final void method_15474() {
      float var3 = this.field_16606;
      this.field_16606 = this.field_16596;
      this.field_16596 = var3;
      var3 = this.field_16604;
      this.field_16604 = this.field_16597;
      this.field_16597 = var3;
      var3 = this.field_16605;
      this.field_16605 = this.field_16599;
      this.field_16599 = var3;
   }

   public final void method_15475(class_3367 var1) {
      if (this == var1) {
         this.method_15474();
      } else {
         this.field_16607 = var1.field_16607;
         this.field_16596 = var1.field_16606;
         this.field_16597 = var1.field_16604;
         this.field_16606 = var1.field_16596;
         this.field_16602 = var1.field_16602;
         this.field_16599 = var1.field_16605;
         this.field_16604 = var1.field_16597;
         this.field_16605 = var1.field_16599;
         this.field_16600 = var1.field_16600;
      }
   }

   public final void method_15487(class_8778 var1) {
      this.field_16607 = 1.0F - 2.0F * var1.field_9016 * var1.field_9016 - 2.0F * var1.field_9013 * var1.field_9013;
      this.field_16606 = 2.0F * (var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_16604 = 2.0F * (var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_16596 = 2.0F * (var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_16602 = 1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9013 * var1.field_9013;
      this.field_16605 = 2.0F * (var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_16597 = 2.0F * (var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_16599 = 2.0F * (var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_16600 = 1.0F - 2.0F * var1.field_9014 * var1.field_9014 - 2.0F * var1.field_9016 * var1.field_9016;
   }

   public final void method_15486(class_7441 var1) {
      float var4 = (float)Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!((double)var4 < 1.0E-8)) {
         var4 = 1.0F / var4;
         float var5 = var1.field_37928 * var4;
         float var6 = var1.field_37931 * var4;
         float var7 = var1.field_37927 * var4;
         float var8 = (float)Math.sin((double)var1.field_37925);
         float var9 = (float)Math.cos((double)var1.field_37925);
         float var10 = 1.0F - var9;
         float var11 = var5 * var7;
         float var12 = var5 * var6;
         float var13 = var6 * var7;
         this.field_16607 = var10 * var5 * var5 + var9;
         this.field_16596 = var10 * var12 - var8 * var7;
         this.field_16597 = var10 * var11 + var8 * var6;
         this.field_16606 = var10 * var12 + var8 * var7;
         this.field_16602 = var10 * var6 * var6 + var9;
         this.field_16599 = var10 * var13 - var8 * var5;
         this.field_16604 = var10 * var11 - var8 * var6;
         this.field_16605 = var10 * var13 + var8 * var5;
         this.field_16600 = var10 * var7 * var7 + var9;
      } else {
         this.field_16607 = 1.0F;
         this.field_16596 = 0.0F;
         this.field_16597 = 0.0F;
         this.field_16606 = 0.0F;
         this.field_16602 = 1.0F;
         this.field_16599 = 0.0F;
         this.field_16604 = 0.0F;
         this.field_16605 = 0.0F;
         this.field_16600 = 1.0F;
      }
   }

   public final void method_15488(class_9179 var1) {
      double var4 = Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965);
      if (!(var4 < 1.0E-8)) {
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
         this.field_16607 = (float)(var16 * var6 * var6 + var14);
         this.field_16596 = (float)(var16 * var20 - var12 * var10);
         this.field_16597 = (float)(var16 * var18 + var12 * var8);
         this.field_16606 = (float)(var16 * var20 + var12 * var10);
         this.field_16602 = (float)(var16 * var8 * var8 + var14);
         this.field_16599 = (float)(var16 * var22 - var12 * var6);
         this.field_16604 = (float)(var16 * var18 - var12 * var8);
         this.field_16605 = (float)(var16 * var22 + var12 * var6);
         this.field_16600 = (float)(var16 * var10 * var10 + var14);
      } else {
         this.field_16607 = 1.0F;
         this.field_16596 = 0.0F;
         this.field_16597 = 0.0F;
         this.field_16606 = 0.0F;
         this.field_16602 = 1.0F;
         this.field_16599 = 0.0F;
         this.field_16604 = 0.0F;
         this.field_16605 = 0.0F;
         this.field_16600 = 1.0F;
      }
   }

   public final void method_15489(class_9400 var1) {
      this.field_16607 = (float)(1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_16606 = (float)(2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828));
      this.field_16604 = (float)(2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830));
      this.field_16596 = (float)(2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828));
      this.field_16602 = (float)(1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_16605 = (float)(2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829));
      this.field_16597 = (float)(2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830));
      this.field_16599 = (float)(2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829));
      this.field_16600 = (float)(1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830);
   }

   public final void method_15490(float[] var1) {
      this.field_16607 = var1[0];
      this.field_16596 = var1[1];
      this.field_16597 = var1[2];
      this.field_16606 = var1[3];
      this.field_16602 = var1[4];
      this.field_16599 = var1[5];
      this.field_16604 = var1[6];
      this.field_16605 = var1[7];
      this.field_16600 = var1[8];
   }

   public final void method_15484(class_3367 var1) {
      this.field_16607 = var1.field_16607;
      this.field_16596 = var1.field_16596;
      this.field_16597 = var1.field_16597;
      this.field_16606 = var1.field_16606;
      this.field_16602 = var1.field_16602;
      this.field_16599 = var1.field_16599;
      this.field_16604 = var1.field_16604;
      this.field_16605 = var1.field_16605;
      this.field_16600 = var1.field_16600;
   }

   public final void method_15485(class_4173 var1) {
      this.field_16607 = (float)var1.field_20304;
      this.field_16596 = (float)var1.field_20313;
      this.field_16597 = (float)var1.field_20311;
      this.field_16606 = (float)var1.field_20312;
      this.field_16602 = (float)var1.field_20305;
      this.field_16599 = (float)var1.field_20319;
      this.field_16604 = (float)var1.field_20314;
      this.field_16605 = (float)var1.field_20322;
      this.field_16600 = (float)var1.field_20307;
   }

   public final void method_15453(class_3367 var1) {
      this.method_15441(var1);
   }

   public final void method_15452() {
      this.method_15441(this);
   }

   private final void method_15441(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      int[] var6 = new int[3];
      var4[0] = (double)var1.field_16607;
      var4[1] = (double)var1.field_16596;
      var4[2] = (double)var1.field_16597;
      var4[3] = (double)var1.field_16606;
      var4[4] = (double)var1.field_16602;
      var4[5] = (double)var1.field_16599;
      var4[6] = (double)var1.field_16604;
      var4[7] = (double)var1.field_16605;
      var4[8] = (double)var1.field_16600;
      if (!method_15482(var4, var6)) {
         throw new class_5059(class_3730.method_17283("Matrix3f12"));
      } else {
         for (int var7 = 0; var7 < 9; var7++) {
            var5[var7] = 0.0;
         }

         var5[0] = 1.0;
         var5[4] = 1.0;
         var5[8] = 1.0;
         method_15481(var4, var6, var5);
         this.field_16607 = (float)var5[0];
         this.field_16596 = (float)var5[1];
         this.field_16597 = (float)var5[2];
         this.field_16606 = (float)var5[3];
         this.field_16602 = (float)var5[4];
         this.field_16599 = (float)var5[5];
         this.field_16604 = (float)var5[6];
         this.field_16605 = (float)var5[7];
         this.field_16600 = (float)var5[8];
      }
   }

   public static boolean method_15482(double[] var0, int[] var1) {
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
            throw new RuntimeException(class_3730.method_17283("Matrix3f13"));
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

   public static void method_15481(double[] var0, int[] var1, double[] var2) {
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

   public final float method_15442() {
      return this.field_16607 * (this.field_16602 * this.field_16600 - this.field_16599 * this.field_16605)
         + this.field_16596 * (this.field_16599 * this.field_16604 - this.field_16606 * this.field_16600)
         + this.field_16597 * (this.field_16606 * this.field_16605 - this.field_16602 * this.field_16604);
   }

   public final void method_15483(float var1) {
      this.field_16607 = var1;
      this.field_16596 = 0.0F;
      this.field_16597 = 0.0F;
      this.field_16606 = 0.0F;
      this.field_16602 = var1;
      this.field_16599 = 0.0F;
      this.field_16604 = 0.0F;
      this.field_16605 = 0.0F;
      this.field_16600 = var1;
   }

   public final void method_15512(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field_16607 = 1.0F;
      this.field_16596 = 0.0F;
      this.field_16597 = 0.0F;
      this.field_16606 = 0.0F;
      this.field_16602 = var5;
      this.field_16599 = -var4;
      this.field_16604 = 0.0F;
      this.field_16605 = var4;
      this.field_16600 = var5;
   }

   public final void method_15434(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field_16607 = var5;
      this.field_16596 = 0.0F;
      this.field_16597 = var4;
      this.field_16606 = 0.0F;
      this.field_16602 = 1.0F;
      this.field_16599 = 0.0F;
      this.field_16604 = -var4;
      this.field_16605 = 0.0F;
      this.field_16600 = var5;
   }

   public final void method_15458(float var1) {
      float var4 = (float)Math.sin((double)var1);
      float var5 = (float)Math.cos((double)var1);
      this.field_16607 = var5;
      this.field_16596 = -var4;
      this.field_16597 = 0.0F;
      this.field_16606 = var4;
      this.field_16602 = var5;
      this.field_16599 = 0.0F;
      this.field_16604 = 0.0F;
      this.field_16605 = 0.0F;
      this.field_16600 = 1.0F;
   }

   public final void method_15465(float var1) {
      this.field_16607 *= var1;
      this.field_16596 *= var1;
      this.field_16597 *= var1;
      this.field_16606 *= var1;
      this.field_16602 *= var1;
      this.field_16599 *= var1;
      this.field_16604 *= var1;
      this.field_16605 *= var1;
      this.field_16600 *= var1;
   }

   public final void method_15466(float var1, class_3367 var2) {
      this.field_16607 = var1 * var2.field_16607;
      this.field_16596 = var1 * var2.field_16596;
      this.field_16597 = var1 * var2.field_16597;
      this.field_16606 = var1 * var2.field_16606;
      this.field_16602 = var1 * var2.field_16602;
      this.field_16599 = var1 * var2.field_16599;
      this.field_16604 = var1 * var2.field_16604;
      this.field_16605 = var1 * var2.field_16605;
      this.field_16600 = var1 * var2.field_16600;
   }

   public final void method_15467(class_3367 var1) {
      float var4 = this.field_16607 * var1.field_16607 + this.field_16596 * var1.field_16606 + this.field_16597 * var1.field_16604;
      float var5 = this.field_16607 * var1.field_16596 + this.field_16596 * var1.field_16602 + this.field_16597 * var1.field_16605;
      float var6 = this.field_16607 * var1.field_16597 + this.field_16596 * var1.field_16599 + this.field_16597 * var1.field_16600;
      float var7 = this.field_16606 * var1.field_16607 + this.field_16602 * var1.field_16606 + this.field_16599 * var1.field_16604;
      float var8 = this.field_16606 * var1.field_16596 + this.field_16602 * var1.field_16602 + this.field_16599 * var1.field_16605;
      float var9 = this.field_16606 * var1.field_16597 + this.field_16602 * var1.field_16599 + this.field_16599 * var1.field_16600;
      float var10 = this.field_16604 * var1.field_16607 + this.field_16605 * var1.field_16606 + this.field_16600 * var1.field_16604;
      float var11 = this.field_16604 * var1.field_16596 + this.field_16605 * var1.field_16602 + this.field_16600 * var1.field_16605;
      float var12 = this.field_16604 * var1.field_16597 + this.field_16605 * var1.field_16599 + this.field_16600 * var1.field_16600;
      this.field_16607 = var4;
      this.field_16596 = var5;
      this.field_16597 = var6;
      this.field_16606 = var7;
      this.field_16602 = var8;
      this.field_16599 = var9;
      this.field_16604 = var10;
      this.field_16605 = var11;
      this.field_16600 = var12;
   }

   public final void method_15468(class_3367 var1, class_3367 var2) {
      if (this != var1 && this != var2) {
         this.field_16607 = var1.field_16607 * var2.field_16607 + var1.field_16596 * var2.field_16606 + var1.field_16597 * var2.field_16604;
         this.field_16596 = var1.field_16607 * var2.field_16596 + var1.field_16596 * var2.field_16602 + var1.field_16597 * var2.field_16605;
         this.field_16597 = var1.field_16607 * var2.field_16597 + var1.field_16596 * var2.field_16599 + var1.field_16597 * var2.field_16600;
         this.field_16606 = var1.field_16606 * var2.field_16607 + var1.field_16602 * var2.field_16606 + var1.field_16599 * var2.field_16604;
         this.field_16602 = var1.field_16606 * var2.field_16596 + var1.field_16602 * var2.field_16602 + var1.field_16599 * var2.field_16605;
         this.field_16599 = var1.field_16606 * var2.field_16597 + var1.field_16602 * var2.field_16599 + var1.field_16599 * var2.field_16600;
         this.field_16604 = var1.field_16604 * var2.field_16607 + var1.field_16605 * var2.field_16606 + var1.field_16600 * var2.field_16604;
         this.field_16605 = var1.field_16604 * var2.field_16596 + var1.field_16605 * var2.field_16602 + var1.field_16600 * var2.field_16605;
         this.field_16600 = var1.field_16604 * var2.field_16597 + var1.field_16605 * var2.field_16599 + var1.field_16600 * var2.field_16600;
      } else {
         float var5 = var1.field_16607 * var2.field_16607 + var1.field_16596 * var2.field_16606 + var1.field_16597 * var2.field_16604;
         float var6 = var1.field_16607 * var2.field_16596 + var1.field_16596 * var2.field_16602 + var1.field_16597 * var2.field_16605;
         float var7 = var1.field_16607 * var2.field_16597 + var1.field_16596 * var2.field_16599 + var1.field_16597 * var2.field_16600;
         float var8 = var1.field_16606 * var2.field_16607 + var1.field_16602 * var2.field_16606 + var1.field_16599 * var2.field_16604;
         float var9 = var1.field_16606 * var2.field_16596 + var1.field_16602 * var2.field_16602 + var1.field_16599 * var2.field_16605;
         float var10 = var1.field_16606 * var2.field_16597 + var1.field_16602 * var2.field_16599 + var1.field_16599 * var2.field_16600;
         float var11 = var1.field_16604 * var2.field_16607 + var1.field_16605 * var2.field_16606 + var1.field_16600 * var2.field_16604;
         float var12 = var1.field_16604 * var2.field_16596 + var1.field_16605 * var2.field_16602 + var1.field_16600 * var2.field_16605;
         float var13 = var1.field_16604 * var2.field_16597 + var1.field_16605 * var2.field_16599 + var1.field_16600 * var2.field_16600;
         this.field_16607 = var5;
         this.field_16596 = var6;
         this.field_16597 = var7;
         this.field_16606 = var8;
         this.field_16602 = var9;
         this.field_16599 = var10;
         this.field_16604 = var11;
         this.field_16605 = var12;
         this.field_16600 = var13;
      }
   }

   public final void method_15491(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = (double)(this.field_16607 * var1.field_16607 + this.field_16596 * var1.field_16606 + this.field_16597 * var1.field_16604);
      var4[1] = (double)(this.field_16607 * var1.field_16596 + this.field_16596 * var1.field_16602 + this.field_16597 * var1.field_16605);
      var4[2] = (double)(this.field_16607 * var1.field_16597 + this.field_16596 * var1.field_16599 + this.field_16597 * var1.field_16600);
      var4[3] = (double)(this.field_16606 * var1.field_16607 + this.field_16602 * var1.field_16606 + this.field_16599 * var1.field_16604);
      var4[4] = (double)(this.field_16606 * var1.field_16596 + this.field_16602 * var1.field_16602 + this.field_16599 * var1.field_16605);
      var4[5] = (double)(this.field_16606 * var1.field_16597 + this.field_16602 * var1.field_16599 + this.field_16599 * var1.field_16600);
      var4[6] = (double)(this.field_16604 * var1.field_16607 + this.field_16605 * var1.field_16606 + this.field_16600 * var1.field_16604);
      var4[7] = (double)(this.field_16604 * var1.field_16596 + this.field_16605 * var1.field_16602 + this.field_16600 * var1.field_16605);
      var4[8] = (double)(this.field_16604 * var1.field_16597 + this.field_16605 * var1.field_16599 + this.field_16600 * var1.field_16600);
      class_4173.method_19400(var4, var6, var5);
      this.field_16607 = (float)var5[0];
      this.field_16596 = (float)var5[1];
      this.field_16597 = (float)var5[2];
      this.field_16606 = (float)var5[3];
      this.field_16602 = (float)var5[4];
      this.field_16599 = (float)var5[5];
      this.field_16604 = (float)var5[6];
      this.field_16605 = (float)var5[7];
      this.field_16600 = (float)var5[8];
   }

   public final void method_15492(class_3367 var1, class_3367 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[9];
      double[] var7 = new double[3];
      var5[0] = (double)(var1.field_16607 * var2.field_16607 + var1.field_16596 * var2.field_16606 + var1.field_16597 * var2.field_16604);
      var5[1] = (double)(var1.field_16607 * var2.field_16596 + var1.field_16596 * var2.field_16602 + var1.field_16597 * var2.field_16605);
      var5[2] = (double)(var1.field_16607 * var2.field_16597 + var1.field_16596 * var2.field_16599 + var1.field_16597 * var2.field_16600);
      var5[3] = (double)(var1.field_16606 * var2.field_16607 + var1.field_16602 * var2.field_16606 + var1.field_16599 * var2.field_16604);
      var5[4] = (double)(var1.field_16606 * var2.field_16596 + var1.field_16602 * var2.field_16602 + var1.field_16599 * var2.field_16605);
      var5[5] = (double)(var1.field_16606 * var2.field_16597 + var1.field_16602 * var2.field_16599 + var1.field_16599 * var2.field_16600);
      var5[6] = (double)(var1.field_16604 * var2.field_16607 + var1.field_16605 * var2.field_16606 + var1.field_16600 * var2.field_16604);
      var5[7] = (double)(var1.field_16604 * var2.field_16596 + var1.field_16605 * var2.field_16602 + var1.field_16600 * var2.field_16605);
      var5[8] = (double)(var1.field_16604 * var2.field_16597 + var1.field_16605 * var2.field_16599 + var1.field_16600 * var2.field_16600);
      class_4173.method_19400(var5, var7, var6);
      this.field_16607 = (float)var6[0];
      this.field_16596 = (float)var6[1];
      this.field_16597 = (float)var6[2];
      this.field_16606 = (float)var6[3];
      this.field_16602 = (float)var6[4];
      this.field_16599 = (float)var6[5];
      this.field_16604 = (float)var6[6];
      this.field_16605 = (float)var6[7];
      this.field_16600 = (float)var6[8];
   }

   public final void method_15507(class_3367 var1, class_3367 var2) {
      if (this != var1 && this != var2) {
         this.field_16607 = var1.field_16607 * var2.field_16607 + var1.field_16606 * var2.field_16596 + var1.field_16604 * var2.field_16597;
         this.field_16596 = var1.field_16607 * var2.field_16606 + var1.field_16606 * var2.field_16602 + var1.field_16604 * var2.field_16599;
         this.field_16597 = var1.field_16607 * var2.field_16604 + var1.field_16606 * var2.field_16605 + var1.field_16604 * var2.field_16600;
         this.field_16606 = var1.field_16596 * var2.field_16607 + var1.field_16602 * var2.field_16596 + var1.field_16605 * var2.field_16597;
         this.field_16602 = var1.field_16596 * var2.field_16606 + var1.field_16602 * var2.field_16602 + var1.field_16605 * var2.field_16599;
         this.field_16599 = var1.field_16596 * var2.field_16604 + var1.field_16602 * var2.field_16605 + var1.field_16605 * var2.field_16600;
         this.field_16604 = var1.field_16597 * var2.field_16607 + var1.field_16599 * var2.field_16596 + var1.field_16600 * var2.field_16597;
         this.field_16605 = var1.field_16597 * var2.field_16606 + var1.field_16599 * var2.field_16602 + var1.field_16600 * var2.field_16599;
         this.field_16600 = var1.field_16597 * var2.field_16604 + var1.field_16599 * var2.field_16605 + var1.field_16600 * var2.field_16600;
      } else {
         float var5 = var1.field_16607 * var2.field_16607 + var1.field_16606 * var2.field_16596 + var1.field_16604 * var2.field_16597;
         float var6 = var1.field_16607 * var2.field_16606 + var1.field_16606 * var2.field_16602 + var1.field_16604 * var2.field_16599;
         float var7 = var1.field_16607 * var2.field_16604 + var1.field_16606 * var2.field_16605 + var1.field_16604 * var2.field_16600;
         float var8 = var1.field_16596 * var2.field_16607 + var1.field_16602 * var2.field_16596 + var1.field_16605 * var2.field_16597;
         float var9 = var1.field_16596 * var2.field_16606 + var1.field_16602 * var2.field_16602 + var1.field_16605 * var2.field_16599;
         float var10 = var1.field_16596 * var2.field_16604 + var1.field_16602 * var2.field_16605 + var1.field_16605 * var2.field_16600;
         float var11 = var1.field_16597 * var2.field_16607 + var1.field_16599 * var2.field_16596 + var1.field_16600 * var2.field_16597;
         float var12 = var1.field_16597 * var2.field_16606 + var1.field_16599 * var2.field_16602 + var1.field_16600 * var2.field_16599;
         float var13 = var1.field_16597 * var2.field_16604 + var1.field_16599 * var2.field_16605 + var1.field_16600 * var2.field_16600;
         this.field_16607 = var5;
         this.field_16596 = var6;
         this.field_16597 = var7;
         this.field_16606 = var8;
         this.field_16602 = var9;
         this.field_16599 = var10;
         this.field_16604 = var11;
         this.field_16605 = var12;
         this.field_16600 = var13;
      }
   }

   public final void method_15493(class_3367 var1, class_3367 var2) {
      if (this != var1 && this != var2) {
         this.field_16607 = var1.field_16607 * var2.field_16607 + var1.field_16596 * var2.field_16596 + var1.field_16597 * var2.field_16597;
         this.field_16596 = var1.field_16607 * var2.field_16606 + var1.field_16596 * var2.field_16602 + var1.field_16597 * var2.field_16599;
         this.field_16597 = var1.field_16607 * var2.field_16604 + var1.field_16596 * var2.field_16605 + var1.field_16597 * var2.field_16600;
         this.field_16606 = var1.field_16606 * var2.field_16607 + var1.field_16602 * var2.field_16596 + var1.field_16599 * var2.field_16597;
         this.field_16602 = var1.field_16606 * var2.field_16606 + var1.field_16602 * var2.field_16602 + var1.field_16599 * var2.field_16599;
         this.field_16599 = var1.field_16606 * var2.field_16604 + var1.field_16602 * var2.field_16605 + var1.field_16599 * var2.field_16600;
         this.field_16604 = var1.field_16604 * var2.field_16607 + var1.field_16605 * var2.field_16596 + var1.field_16600 * var2.field_16597;
         this.field_16605 = var1.field_16604 * var2.field_16606 + var1.field_16605 * var2.field_16602 + var1.field_16600 * var2.field_16599;
         this.field_16600 = var1.field_16604 * var2.field_16604 + var1.field_16605 * var2.field_16605 + var1.field_16600 * var2.field_16600;
      } else {
         float var5 = var1.field_16607 * var2.field_16607 + var1.field_16596 * var2.field_16596 + var1.field_16597 * var2.field_16597;
         float var6 = var1.field_16607 * var2.field_16606 + var1.field_16596 * var2.field_16602 + var1.field_16597 * var2.field_16599;
         float var7 = var1.field_16607 * var2.field_16604 + var1.field_16596 * var2.field_16605 + var1.field_16597 * var2.field_16600;
         float var8 = var1.field_16606 * var2.field_16607 + var1.field_16602 * var2.field_16596 + var1.field_16599 * var2.field_16597;
         float var9 = var1.field_16606 * var2.field_16606 + var1.field_16602 * var2.field_16602 + var1.field_16599 * var2.field_16599;
         float var10 = var1.field_16606 * var2.field_16604 + var1.field_16602 * var2.field_16605 + var1.field_16599 * var2.field_16600;
         float var11 = var1.field_16604 * var2.field_16607 + var1.field_16605 * var2.field_16596 + var1.field_16600 * var2.field_16597;
         float var12 = var1.field_16604 * var2.field_16606 + var1.field_16605 * var2.field_16602 + var1.field_16600 * var2.field_16599;
         float var13 = var1.field_16604 * var2.field_16604 + var1.field_16605 * var2.field_16605 + var1.field_16600 * var2.field_16600;
         this.field_16607 = var5;
         this.field_16596 = var6;
         this.field_16597 = var7;
         this.field_16606 = var8;
         this.field_16602 = var9;
         this.field_16599 = var10;
         this.field_16604 = var11;
         this.field_16605 = var12;
         this.field_16600 = var13;
      }
   }

   public final void method_15436(class_3367 var1, class_3367 var2) {
      if (this != var1 && this != var2) {
         this.field_16607 = var1.field_16607 * var2.field_16607 + var1.field_16606 * var2.field_16606 + var1.field_16604 * var2.field_16604;
         this.field_16596 = var1.field_16607 * var2.field_16596 + var1.field_16606 * var2.field_16602 + var1.field_16604 * var2.field_16605;
         this.field_16597 = var1.field_16607 * var2.field_16597 + var1.field_16606 * var2.field_16599 + var1.field_16604 * var2.field_16600;
         this.field_16606 = var1.field_16596 * var2.field_16607 + var1.field_16602 * var2.field_16606 + var1.field_16605 * var2.field_16604;
         this.field_16602 = var1.field_16596 * var2.field_16596 + var1.field_16602 * var2.field_16602 + var1.field_16605 * var2.field_16605;
         this.field_16599 = var1.field_16596 * var2.field_16597 + var1.field_16602 * var2.field_16599 + var1.field_16605 * var2.field_16600;
         this.field_16604 = var1.field_16597 * var2.field_16607 + var1.field_16599 * var2.field_16606 + var1.field_16600 * var2.field_16604;
         this.field_16605 = var1.field_16597 * var2.field_16596 + var1.field_16599 * var2.field_16602 + var1.field_16600 * var2.field_16605;
         this.field_16600 = var1.field_16597 * var2.field_16597 + var1.field_16599 * var2.field_16599 + var1.field_16600 * var2.field_16600;
      } else {
         float var5 = var1.field_16607 * var2.field_16607 + var1.field_16606 * var2.field_16606 + var1.field_16604 * var2.field_16604;
         float var6 = var1.field_16607 * var2.field_16596 + var1.field_16606 * var2.field_16602 + var1.field_16604 * var2.field_16605;
         float var7 = var1.field_16607 * var2.field_16597 + var1.field_16606 * var2.field_16599 + var1.field_16604 * var2.field_16600;
         float var8 = var1.field_16596 * var2.field_16607 + var1.field_16602 * var2.field_16606 + var1.field_16605 * var2.field_16604;
         float var9 = var1.field_16596 * var2.field_16596 + var1.field_16602 * var2.field_16602 + var1.field_16605 * var2.field_16605;
         float var10 = var1.field_16596 * var2.field_16597 + var1.field_16602 * var2.field_16599 + var1.field_16605 * var2.field_16600;
         float var11 = var1.field_16597 * var2.field_16607 + var1.field_16599 * var2.field_16606 + var1.field_16600 * var2.field_16604;
         float var12 = var1.field_16597 * var2.field_16596 + var1.field_16599 * var2.field_16602 + var1.field_16600 * var2.field_16605;
         float var13 = var1.field_16597 * var2.field_16597 + var1.field_16599 * var2.field_16599 + var1.field_16600 * var2.field_16600;
         this.field_16607 = var5;
         this.field_16596 = var6;
         this.field_16597 = var7;
         this.field_16606 = var8;
         this.field_16602 = var9;
         this.field_16599 = var10;
         this.field_16604 = var11;
         this.field_16605 = var12;
         this.field_16600 = var13;
      }
   }

   public final void method_15437() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method_15440(var4, var3);
      this.field_16607 = (float)var3[0];
      this.field_16596 = (float)var3[1];
      this.field_16597 = (float)var3[2];
      this.field_16606 = (float)var3[3];
      this.field_16602 = (float)var3[4];
      this.field_16599 = (float)var3[5];
      this.field_16604 = (float)var3[6];
      this.field_16605 = (float)var3[7];
      this.field_16600 = (float)var3[8];
   }

   public final void method_15438(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      var4[0] = (double)var1.field_16607;
      var4[1] = (double)var1.field_16596;
      var4[2] = (double)var1.field_16597;
      var4[3] = (double)var1.field_16606;
      var4[4] = (double)var1.field_16602;
      var4[5] = (double)var1.field_16599;
      var4[6] = (double)var1.field_16604;
      var4[7] = (double)var1.field_16605;
      var4[8] = (double)var1.field_16600;
      class_4173.method_19400(var4, var6, var5);
      this.field_16607 = (float)var5[0];
      this.field_16596 = (float)var5[1];
      this.field_16597 = (float)var5[2];
      this.field_16606 = (float)var5[3];
      this.field_16602 = (float)var5[4];
      this.field_16599 = (float)var5[5];
      this.field_16604 = (float)var5[6];
      this.field_16605 = (float)var5[7];
      this.field_16600 = (float)var5[8];
   }

   public final void method_15460() {
      float var3 = 1.0F
         / (float)Math.sqrt((double)(this.field_16607 * this.field_16607 + this.field_16606 * this.field_16606 + this.field_16604 * this.field_16604));
      this.field_16607 *= var3;
      this.field_16606 *= var3;
      this.field_16604 *= var3;
      var3 = 1.0F / (float)Math.sqrt((double)(this.field_16596 * this.field_16596 + this.field_16602 * this.field_16602 + this.field_16605 * this.field_16605));
      this.field_16596 *= var3;
      this.field_16602 *= var3;
      this.field_16605 *= var3;
      this.field_16597 = this.field_16606 * this.field_16605 - this.field_16602 * this.field_16604;
      this.field_16599 = this.field_16596 * this.field_16604 - this.field_16607 * this.field_16605;
      this.field_16600 = this.field_16607 * this.field_16602 - this.field_16596 * this.field_16606;
   }

   public final void method_15461(class_3367 var1) {
      float var4 = 1.0F
         / (float)Math.sqrt((double)(var1.field_16607 * var1.field_16607 + var1.field_16606 * var1.field_16606 + var1.field_16604 * var1.field_16604));
      this.field_16607 = var1.field_16607 * var4;
      this.field_16606 = var1.field_16606 * var4;
      this.field_16604 = var1.field_16604 * var4;
      var4 = 1.0F / (float)Math.sqrt((double)(var1.field_16596 * var1.field_16596 + var1.field_16602 * var1.field_16602 + var1.field_16605 * var1.field_16605));
      this.field_16596 = var1.field_16596 * var4;
      this.field_16602 = var1.field_16602 * var4;
      this.field_16605 = var1.field_16605 * var4;
      this.field_16597 = this.field_16606 * this.field_16605 - this.field_16602 * this.field_16604;
      this.field_16599 = this.field_16596 * this.field_16604 - this.field_16607 * this.field_16605;
      this.field_16600 = this.field_16607 * this.field_16602 - this.field_16596 * this.field_16606;
   }

   public boolean equals(class_3367 var1) {
      try {
         return this.field_16607 == var1.field_16607
            && this.field_16596 == var1.field_16596
            && this.field_16597 == var1.field_16597
            && this.field_16606 == var1.field_16606
            && this.field_16602 == var1.field_16602
            && this.field_16599 == var1.field_16599
            && this.field_16604 == var1.field_16604
            && this.field_16605 == var1.field_16605
            && this.field_16600 == var1.field_16600;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_3367 var4 = (class_3367)var1;
         return this.field_16607 == var4.field_16607
            && this.field_16596 == var4.field_16596
            && this.field_16597 == var4.field_16597
            && this.field_16606 == var4.field_16606
            && this.field_16602 == var4.field_16602
            && this.field_16599 == var4.field_16599
            && this.field_16604 == var4.field_16604
            && this.field_16605 == var4.field_16605
            && this.field_16600 == var4.field_16600;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   public boolean method_15509(class_3367 var1, float var2) {
      boolean var5 = true;
      if (Math.abs(this.field_16607 - var1.field_16607) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16596 - var1.field_16596) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16597 - var1.field_16597) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16606 - var1.field_16606) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16602 - var1.field_16602) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16599 - var1.field_16599) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16604 - var1.field_16604) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16605 - var1.field_16605) > var2) {
         var5 = false;
      }

      if (Math.abs(this.field_16600 - var1.field_16600) > var2) {
         var5 = false;
      }

      return var5;
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16607);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16596);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16597);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16606);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16602);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16599);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16604);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16605);
      var3 = 31L * var3 + (long)class_9845.method_45351(this.field_16600);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_15459() {
      this.field_16607 = 0.0F;
      this.field_16596 = 0.0F;
      this.field_16597 = 0.0F;
      this.field_16606 = 0.0F;
      this.field_16602 = 0.0F;
      this.field_16599 = 0.0F;
      this.field_16604 = 0.0F;
      this.field_16605 = 0.0F;
      this.field_16600 = 0.0F;
   }

   public final void method_15447() {
      this.field_16607 = -this.field_16607;
      this.field_16596 = -this.field_16596;
      this.field_16597 = -this.field_16597;
      this.field_16606 = -this.field_16606;
      this.field_16602 = -this.field_16602;
      this.field_16599 = -this.field_16599;
      this.field_16604 = -this.field_16604;
      this.field_16605 = -this.field_16605;
      this.field_16600 = -this.field_16600;
   }

   public final void method_15448(class_3367 var1) {
      this.field_16607 = -var1.field_16607;
      this.field_16596 = -var1.field_16596;
      this.field_16597 = -var1.field_16597;
      this.field_16606 = -var1.field_16606;
      this.field_16602 = -var1.field_16602;
      this.field_16599 = -var1.field_16599;
      this.field_16604 = -var1.field_16604;
      this.field_16605 = -var1.field_16605;
      this.field_16600 = -var1.field_16600;
   }

   public final void method_15505(class_835 var1) {
      float var4 = this.field_16607 * var1.field_4390 + this.field_16596 * var1.field_4391 + this.field_16597 * var1.field_4393;
      float var5 = this.field_16606 * var1.field_4390 + this.field_16602 * var1.field_4391 + this.field_16599 * var1.field_4393;
      float var6 = this.field_16604 * var1.field_4390 + this.field_16605 * var1.field_4391 + this.field_16600 * var1.field_4393;
      var1.method_3637(var4, var5, var6);
   }

   public final void method_15506(class_835 var1, class_835 var2) {
      float var5 = this.field_16607 * var1.field_4390 + this.field_16596 * var1.field_4391 + this.field_16597 * var1.field_4393;
      float var6 = this.field_16606 * var1.field_4390 + this.field_16602 * var1.field_4391 + this.field_16599 * var1.field_4393;
      var2.field_4393 = this.field_16604 * var1.field_4390 + this.field_16605 * var1.field_4391 + this.field_16600 * var1.field_4393;
      var2.field_4390 = var5;
      var2.field_4391 = var6;
   }

   public void method_15440(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         (double)this.field_16607,
         (double)this.field_16596,
         (double)this.field_16597,
         (double)this.field_16606,
         (double)this.field_16602,
         (double)this.field_16599,
         (double)this.field_16604,
         (double)this.field_16605,
         (double)this.field_16600
      };
      class_4173.method_19400(var5, var1, var2);
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (class_3367)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final float method_15498() {
      return this.field_16607;
   }

   public final void method_15455(float var1) {
      this.field_16607 = var1;
   }

   public final float method_15508() {
      return this.field_16596;
   }

   public final void method_15495(float var1) {
      this.field_16596 = var1;
   }

   public final float method_15499() {
      return this.field_16597;
   }

   public final void method_15454(float var1) {
      this.field_16597 = var1;
   }

   public final float method_15443() {
      return this.field_16606;
   }

   public final void method_15494(float var1) {
      this.field_16606 = var1;
   }

   public final float method_15500() {
      return this.field_16602;
   }

   public final void method_15470(float var1) {
      this.field_16602 = var1;
   }

   public final float method_15456() {
      return this.field_16599;
   }

   public final void method_15457(float var1) {
      this.field_16599 = var1;
   }

   public final float method_15464() {
      return this.field_16604;
   }

   public final void method_15501(float var1) {
      this.field_16604 = var1;
   }

   public final float method_15444() {
      return this.field_16605;
   }

   public final void method_15435(float var1) {
      this.field_16605 = var1;
   }

   public final float method_15480() {
      return this.field_16600;
   }

   public final void method_15439(float var1) {
      this.field_16600 = var1;
   }
}
