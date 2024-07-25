package remapped;

import java.io.Serializable;

public class class_9076 implements Serializable, Cloneable {
   public static final long field_46462 = 8223903484171633710L;
   public double field_46473;
   public double field_46466;
   public double field_46474;
   public double field_46460;
   public double field_46458;
   public double field_46467;
   public double field_46464;
   public double field_46461;
   public double field_46470;
   public double field_46469;
   public double field_46468;
   public double field_46475;
   public double field_46472;
   public double field_46471;
   public double field_46463;
   public double field_46457;
   private static final double field_46459 = 1.0E-10;

   public class_9076(
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
      this.field_46473 = var1;
      this.field_46466 = var3;
      this.field_46474 = var5;
      this.field_46460 = var7;
      this.field_46458 = var9;
      this.field_46467 = var11;
      this.field_46464 = var13;
      this.field_46461 = var15;
      this.field_46470 = var17;
      this.field_46469 = var19;
      this.field_46468 = var21;
      this.field_46475 = var23;
      this.field_46472 = var25;
      this.field_46471 = var27;
      this.field_46463 = var29;
      this.field_46457 = var31;
   }

   public class_9076(double[] var1) {
      this.field_46473 = var1[0];
      this.field_46466 = var1[1];
      this.field_46474 = var1[2];
      this.field_46460 = var1[3];
      this.field_46458 = var1[4];
      this.field_46467 = var1[5];
      this.field_46464 = var1[6];
      this.field_46461 = var1[7];
      this.field_46470 = var1[8];
      this.field_46469 = var1[9];
      this.field_46468 = var1[10];
      this.field_46475 = var1[11];
      this.field_46472 = var1[12];
      this.field_46471 = var1[13];
      this.field_46463 = var1[14];
      this.field_46457 = var1[15];
   }

   public class_9076(class_9400 var1, class_2627 var2, double var3) {
      this.field_46473 = var3 * (1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_46458 = var3 * 2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828);
      this.field_46470 = var3 * 2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830);
      this.field_46466 = var3 * 2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828);
      this.field_46467 = var3 * (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_46469 = var3 * 2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829);
      this.field_46474 = var3 * 2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830);
      this.field_46464 = var3 * 2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829);
      this.field_46468 = var3 * (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830);
      this.field_46460 = var2.field_17244;
      this.field_46461 = var2.field_17242;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public class_9076(class_8778 var1, class_2627 var2, double var3) {
      this.field_46473 = var3 * (1.0 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013);
      this.field_46458 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_46470 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_46466 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_46467 = var3 * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013);
      this.field_46469 = var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_46474 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_46464 = var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_46468 = var3 * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016);
      this.field_46460 = var2.field_17244;
      this.field_46461 = var2.field_17242;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public class_9076(class_9076 var1) {
      this.field_46473 = var1.field_46473;
      this.field_46466 = var1.field_46466;
      this.field_46474 = var1.field_46474;
      this.field_46460 = var1.field_46460;
      this.field_46458 = var1.field_46458;
      this.field_46467 = var1.field_46467;
      this.field_46464 = var1.field_46464;
      this.field_46461 = var1.field_46461;
      this.field_46470 = var1.field_46470;
      this.field_46469 = var1.field_46469;
      this.field_46468 = var1.field_46468;
      this.field_46475 = var1.field_46475;
      this.field_46472 = var1.field_46472;
      this.field_46471 = var1.field_46471;
      this.field_46463 = var1.field_46463;
      this.field_46457 = var1.field_46457;
   }

   public class_9076(class_2856 var1) {
      this.field_46473 = (double)var1.field_13977;
      this.field_46466 = (double)var1.field_13991;
      this.field_46474 = (double)var1.field_13976;
      this.field_46460 = (double)var1.field_13984;
      this.field_46458 = (double)var1.field_13993;
      this.field_46467 = (double)var1.field_13979;
      this.field_46464 = (double)var1.field_13989;
      this.field_46461 = (double)var1.field_13982;
      this.field_46470 = (double)var1.field_13983;
      this.field_46469 = (double)var1.field_13992;
      this.field_46468 = (double)var1.field_13978;
      this.field_46475 = (double)var1.field_13990;
      this.field_46472 = (double)var1.field_13975;
      this.field_46471 = (double)var1.field_13985;
      this.field_46463 = (double)var1.field_13986;
      this.field_46457 = (double)var1.field_13988;
   }

   public class_9076(class_3367 var1, class_2627 var2, double var3) {
      this.field_46473 = (double)var1.field_16607 * var3;
      this.field_46466 = (double)var1.field_16596 * var3;
      this.field_46474 = (double)var1.field_16597 * var3;
      this.field_46460 = var2.field_17244;
      this.field_46458 = (double)var1.field_16606 * var3;
      this.field_46467 = (double)var1.field_16602 * var3;
      this.field_46464 = (double)var1.field_16599 * var3;
      this.field_46461 = var2.field_17242;
      this.field_46470 = (double)var1.field_16604 * var3;
      this.field_46469 = (double)var1.field_16605 * var3;
      this.field_46468 = (double)var1.field_16600 * var3;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public class_9076(class_4173 var1, class_2627 var2, double var3) {
      this.field_46473 = var1.field_20304 * var3;
      this.field_46466 = var1.field_20313 * var3;
      this.field_46474 = var1.field_20311 * var3;
      this.field_46460 = var2.field_17244;
      this.field_46458 = var1.field_20312 * var3;
      this.field_46467 = var1.field_20305 * var3;
      this.field_46464 = var1.field_20319 * var3;
      this.field_46461 = var2.field_17242;
      this.field_46470 = var1.field_20314 * var3;
      this.field_46469 = var1.field_20322 * var3;
      this.field_46468 = var1.field_20307 * var3;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public class_9076() {
      this.field_46473 = 0.0;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = 0.0;
      this.field_46458 = 0.0;
      this.field_46467 = 0.0;
      this.field_46464 = 0.0;
      this.field_46461 = 0.0;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = 0.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 0.0;
   }

   @Override
   public String toString() {
      return this.field_46473
         + ", "
         + this.field_46466
         + ", "
         + this.field_46474
         + ", "
         + this.field_46460
         + "\n"
         + this.field_46458
         + ", "
         + this.field_46467
         + ", "
         + this.field_46464
         + ", "
         + this.field_46461
         + "\n"
         + this.field_46470
         + ", "
         + this.field_46469
         + ", "
         + this.field_46468
         + ", "
         + this.field_46475
         + "\n"
         + this.field_46472
         + ", "
         + this.field_46471
         + ", "
         + this.field_46463
         + ", "
         + this.field_46457
         + "\n";
   }

   public final void method_41661() {
      this.field_46473 = 1.0;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = 0.0;
      this.field_46458 = 0.0;
      this.field_46467 = 1.0;
      this.field_46464 = 0.0;
      this.field_46461 = 0.0;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = 1.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41747(int var1, int var2, double var3) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  this.field_46473 = var3;
                  return;
               case 1:
                  this.field_46466 = var3;
                  return;
               case 2:
                  this.field_46474 = var3;
                  return;
               case 3:
                  this.field_46460 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d0"));
            }
         case 1:
            switch (var2) {
               case 0:
                  this.field_46458 = var3;
                  return;
               case 1:
                  this.field_46467 = var3;
                  return;
               case 2:
                  this.field_46464 = var3;
                  return;
               case 3:
                  this.field_46461 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d0"));
            }
         case 2:
            switch (var2) {
               case 0:
                  this.field_46470 = var3;
                  return;
               case 1:
                  this.field_46469 = var3;
                  return;
               case 2:
                  this.field_46468 = var3;
                  return;
               case 3:
                  this.field_46475 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d0"));
            }
         case 3:
            switch (var2) {
               case 0:
                  this.field_46472 = var3;
                  return;
               case 1:
                  this.field_46471 = var3;
                  return;
               case 2:
                  this.field_46463 = var3;
                  return;
               case 3:
                  this.field_46457 = var3;
                  return;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d0"));
            }
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d0"));
      }
   }

   public final double method_41674(int var1, int var2) {
      switch (var1) {
         case 0:
            switch (var2) {
               case 0:
                  return this.field_46473;
               case 1:
                  return this.field_46466;
               case 2:
                  return this.field_46474;
               case 3:
                  return this.field_46460;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d1"));
            }
         case 1:
            switch (var2) {
               case 0:
                  return this.field_46458;
               case 1:
                  return this.field_46467;
               case 2:
                  return this.field_46464;
               case 3:
                  return this.field_46461;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d1"));
            }
         case 2:
            switch (var2) {
               case 0:
                  return this.field_46470;
               case 1:
                  return this.field_46469;
               case 2:
                  return this.field_46468;
               case 3:
                  return this.field_46475;
               default:
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d1"));
            }
         case 3:
            switch (var2) {
               case 0:
                  return this.field_46472;
               case 1:
                  return this.field_46471;
               case 2:
                  return this.field_46463;
               case 3:
                  return this.field_46457;
            }
      }

      throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d1"));
   }

   public final void method_41748(int var1, class_1784 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d2"));
               }

               var2.field_26829 = this.field_46472;
               var2.field_26830 = this.field_46471;
               var2.field_26828 = this.field_46463;
               var2.field_26827 = this.field_46457;
            } else {
               var2.field_26829 = this.field_46470;
               var2.field_26830 = this.field_46469;
               var2.field_26828 = this.field_46468;
               var2.field_26827 = this.field_46475;
            }
         } else {
            var2.field_26829 = this.field_46458;
            var2.field_26830 = this.field_46467;
            var2.field_26828 = this.field_46464;
            var2.field_26827 = this.field_46461;
         }
      } else {
         var2.field_26829 = this.field_46473;
         var2.field_26830 = this.field_46466;
         var2.field_26828 = this.field_46474;
         var2.field_26827 = this.field_46460;
      }
   }

   public final void method_41749(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d2"));
               }

               var2[0] = this.field_46472;
               var2[1] = this.field_46471;
               var2[2] = this.field_46463;
               var2[3] = this.field_46457;
            } else {
               var2[0] = this.field_46470;
               var2[1] = this.field_46469;
               var2[2] = this.field_46468;
               var2[3] = this.field_46475;
            }
         } else {
            var2[0] = this.field_46458;
            var2[1] = this.field_46467;
            var2[2] = this.field_46464;
            var2[3] = this.field_46461;
         }
      } else {
         var2[0] = this.field_46473;
         var2[1] = this.field_46466;
         var2[2] = this.field_46474;
         var2[3] = this.field_46460;
      }
   }

   public final void method_41682(int var1, class_1784 var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d3"));
               }

               var2.field_26829 = this.field_46460;
               var2.field_26830 = this.field_46461;
               var2.field_26828 = this.field_46475;
               var2.field_26827 = this.field_46457;
            } else {
               var2.field_26829 = this.field_46474;
               var2.field_26830 = this.field_46464;
               var2.field_26828 = this.field_46468;
               var2.field_26827 = this.field_46463;
            }
         } else {
            var2.field_26829 = this.field_46466;
            var2.field_26830 = this.field_46467;
            var2.field_26828 = this.field_46469;
            var2.field_26827 = this.field_46471;
         }
      } else {
         var2.field_26829 = this.field_46473;
         var2.field_26830 = this.field_46458;
         var2.field_26828 = this.field_46470;
         var2.field_26827 = this.field_46472;
      }
   }

   public final void method_41683(int var1, double[] var2) {
      if (var1 != 0) {
         if (var1 != 1) {
            if (var1 != 2) {
               if (var1 != 3) {
                  throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d3"));
               }

               var2[0] = this.field_46460;
               var2[1] = this.field_46461;
               var2[2] = this.field_46475;
               var2[3] = this.field_46457;
            } else {
               var2[0] = this.field_46474;
               var2[1] = this.field_46464;
               var2[2] = this.field_46468;
               var2[3] = this.field_46463;
            }
         } else {
            var2[0] = this.field_46466;
            var2[1] = this.field_46467;
            var2[2] = this.field_46469;
            var2[3] = this.field_46471;
         }
      } else {
         var2[0] = this.field_46473;
         var2[1] = this.field_46458;
         var2[2] = this.field_46470;
         var2[3] = this.field_46472;
      }
   }

   public final void method_41714(class_4173 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      var1.field_20304 = var4[0];
      var1.field_20313 = var4[1];
      var1.field_20311 = var4[2];
      var1.field_20312 = var4[3];
      var1.field_20305 = var4[4];
      var1.field_20319 = var4[5];
      var1.field_20314 = var4[6];
      var1.field_20322 = var4[7];
      var1.field_20307 = var4[8];
   }

   public final void method_41712(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      var1.field_16607 = (float)var4[0];
      var1.field_16596 = (float)var4[1];
      var1.field_16597 = (float)var4[2];
      var1.field_16606 = (float)var4[3];
      var1.field_16602 = (float)var4[4];
      var1.field_16599 = (float)var4[5];
      var1.field_16604 = (float)var4[6];
      var1.field_16605 = (float)var4[7];
      var1.field_16600 = (float)var4[8];
   }

   public final double method_41715(class_4173 var1, class_2627 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method_41672(var6, var5);
      var1.field_20304 = var5[0];
      var1.field_20313 = var5[1];
      var1.field_20311 = var5[2];
      var1.field_20312 = var5[3];
      var1.field_20305 = var5[4];
      var1.field_20319 = var5[5];
      var1.field_20314 = var5[6];
      var1.field_20322 = var5[7];
      var1.field_20307 = var5[8];
      var2.field_17244 = this.field_46460;
      var2.field_17242 = this.field_46461;
      var2.field_17241 = this.field_46475;
      return class_4173.method_19359(var6);
   }

   public final double method_41713(class_3367 var1, class_2627 var2) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method_41672(var6, var5);
      var1.field_16607 = (float)var5[0];
      var1.field_16596 = (float)var5[1];
      var1.field_16597 = (float)var5[2];
      var1.field_16606 = (float)var5[3];
      var1.field_16602 = (float)var5[4];
      var1.field_16599 = (float)var5[5];
      var1.field_16604 = (float)var5[6];
      var1.field_16605 = (float)var5[7];
      var1.field_16600 = (float)var5[8];
      var2.field_17244 = this.field_46460;
      var2.field_17242 = this.field_46461;
      var2.field_17241 = this.field_46475;
      return class_4173.method_19359(var6);
   }

   public final void method_41716(class_8778 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      double var6 = 0.25 * (1.0 + var4[0] + var4[4] + var4[8]);
      if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
         var1.field_9012 = 0.0F;
         var6 = -0.5 * (var4[4] + var4[8]);
         if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
            var1.field_9014 = 0.0F;
            var6 = 0.5 * (1.0 - var4[8]);
            if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
               var1.field_9016 = 0.0F;
               var1.field_9013 = 1.0F;
            } else {
               var1.field_9016 = (float)Math.sqrt(var6);
               var1.field_9013 = (float)(var4[7] / (2.0 * (double)var1.field_9016));
            }
         } else {
            var1.field_9014 = (float)Math.sqrt(var6);
            var6 = 0.5 / (double)var1.field_9014;
            var1.field_9016 = (float)(var4[3] * var6);
            var1.field_9013 = (float)(var4[6] * var6);
         }
      } else {
         var1.field_9012 = (float)Math.sqrt(var6);
         var6 = 0.25 / (double)var1.field_9012;
         var1.field_9014 = (float)((var4[7] - var4[5]) * var6);
         var1.field_9016 = (float)((var4[2] - var4[6]) * var6);
         var1.field_9013 = (float)((var4[3] - var4[1]) * var6);
      }
   }

   public final void method_41717(class_9400 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      double var6 = 0.25 * (1.0 + var4[0] + var4[4] + var4[8]);
      if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
         var1.field_26827 = 0.0;
         var6 = -0.5 * (var4[4] + var4[8]);
         if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
            var1.field_26829 = 0.0;
            var6 = 0.5 * (1.0 - var4[8]);
            if ((!(var6 < 0.0) ? var6 : -var6) < 1.0E-30) {
               var1.field_26830 = 0.0;
               var1.field_26828 = 1.0;
            } else {
               var1.field_26830 = Math.sqrt(var6);
               var1.field_26828 = var4[7] / (2.0 * var1.field_26830);
            }
         } else {
            var1.field_26829 = Math.sqrt(var6);
            var6 = 0.5 / var1.field_26829;
            var1.field_26830 = var4[3] * var6;
            var1.field_26828 = var4[6] * var6;
         }
      } else {
         var1.field_26827 = Math.sqrt(var6);
         var6 = 0.25 / var1.field_26827;
         var1.field_26829 = (var4[7] - var4[5]) * var6;
         var1.field_26830 = (var4[2] - var4[6]) * var6;
         var1.field_26828 = (var4[3] - var4[1]) * var6;
      }
   }

   public final void method_41711(class_2627 var1) {
      var1.field_17244 = this.field_46460;
      var1.field_17242 = this.field_46461;
      var1.field_17241 = this.field_46475;
   }

   public final void method_41694(class_3367 var1) {
      var1.field_16607 = (float)this.field_46473;
      var1.field_16596 = (float)this.field_46466;
      var1.field_16597 = (float)this.field_46474;
      var1.field_16606 = (float)this.field_46458;
      var1.field_16602 = (float)this.field_46467;
      var1.field_16599 = (float)this.field_46464;
      var1.field_16604 = (float)this.field_46470;
      var1.field_16605 = (float)this.field_46469;
      var1.field_16600 = (float)this.field_46468;
   }

   public final void method_41695(class_4173 var1) {
      var1.field_20304 = this.field_46473;
      var1.field_20313 = this.field_46466;
      var1.field_20311 = this.field_46474;
      var1.field_20312 = this.field_46458;
      var1.field_20305 = this.field_46467;
      var1.field_20319 = this.field_46464;
      var1.field_20314 = this.field_46470;
      var1.field_20322 = this.field_46469;
      var1.field_20307 = this.field_46468;
   }

   public final double method_41660() {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.method_41672(var4, var3);
      return class_4173.method_19359(var4);
   }

   public final void method_41709(class_4173 var1) {
      this.field_46473 = var1.field_20304;
      this.field_46466 = var1.field_20313;
      this.field_46474 = var1.field_20311;
      this.field_46458 = var1.field_20312;
      this.field_46467 = var1.field_20305;
      this.field_46464 = var1.field_20319;
      this.field_46470 = var1.field_20314;
      this.field_46469 = var1.field_20322;
      this.field_46468 = var1.field_20307;
   }

   public final void method_41708(class_3367 var1) {
      this.field_46473 = (double)var1.field_16607;
      this.field_46466 = (double)var1.field_16596;
      this.field_46474 = (double)var1.field_16597;
      this.field_46458 = (double)var1.field_16606;
      this.field_46467 = (double)var1.field_16602;
      this.field_46464 = (double)var1.field_16599;
      this.field_46470 = (double)var1.field_16604;
      this.field_46469 = (double)var1.field_16605;
      this.field_46468 = (double)var1.field_16600;
   }

   public final void method_41668(double var1) {
      double[] var5 = new double[9];
      double[] var6 = new double[3];
      this.method_41672(var6, var5);
      this.field_46473 = var5[0] * var1;
      this.field_46466 = var5[1] * var1;
      this.field_46474 = var5[2] * var1;
      this.field_46458 = var5[3] * var1;
      this.field_46467 = var5[4] * var1;
      this.field_46464 = var5[5] * var1;
      this.field_46470 = var5[6] * var1;
      this.field_46469 = var5[7] * var1;
      this.field_46468 = var5[8] * var1;
   }

   public final void method_41736(int var1, double var2, double var4, double var6, double var8) {
      switch (var1) {
         case 0:
            this.field_46473 = var2;
            this.field_46466 = var4;
            this.field_46474 = var6;
            this.field_46460 = var8;
            break;
         case 1:
            this.field_46458 = var2;
            this.field_46467 = var4;
            this.field_46464 = var6;
            this.field_46461 = var8;
            break;
         case 2:
            this.field_46470 = var2;
            this.field_46469 = var4;
            this.field_46468 = var6;
            this.field_46475 = var8;
            break;
         case 3:
            this.field_46472 = var2;
            this.field_46471 = var4;
            this.field_46463 = var6;
            this.field_46457 = var8;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d4"));
      }
   }

   public final void method_41737(int var1, class_1784 var2) {
      switch (var1) {
         case 0:
            this.field_46473 = var2.field_26829;
            this.field_46466 = var2.field_26830;
            this.field_46474 = var2.field_26828;
            this.field_46460 = var2.field_26827;
            break;
         case 1:
            this.field_46458 = var2.field_26829;
            this.field_46467 = var2.field_26830;
            this.field_46464 = var2.field_26828;
            this.field_46461 = var2.field_26827;
            break;
         case 2:
            this.field_46470 = var2.field_26829;
            this.field_46469 = var2.field_26830;
            this.field_46468 = var2.field_26828;
            this.field_46475 = var2.field_26827;
            break;
         case 3:
            this.field_46472 = var2.field_26829;
            this.field_46471 = var2.field_26830;
            this.field_46463 = var2.field_26828;
            this.field_46457 = var2.field_26827;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d4"));
      }
   }

   public final void method_41738(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field_46473 = var2[0];
            this.field_46466 = var2[1];
            this.field_46474 = var2[2];
            this.field_46460 = var2[3];
            break;
         case 1:
            this.field_46458 = var2[0];
            this.field_46467 = var2[1];
            this.field_46464 = var2[2];
            this.field_46461 = var2[3];
            break;
         case 2:
            this.field_46470 = var2[0];
            this.field_46469 = var2[1];
            this.field_46468 = var2[2];
            this.field_46475 = var2[3];
            break;
         case 3:
            this.field_46472 = var2[0];
            this.field_46471 = var2[1];
            this.field_46463 = var2[2];
            this.field_46457 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d4"));
      }
   }

   public final void method_41704(int var1, double var2, double var4, double var6, double var8) {
      switch (var1) {
         case 0:
            this.field_46473 = var2;
            this.field_46458 = var4;
            this.field_46470 = var6;
            this.field_46472 = var8;
            break;
         case 1:
            this.field_46466 = var2;
            this.field_46467 = var4;
            this.field_46469 = var6;
            this.field_46471 = var8;
            break;
         case 2:
            this.field_46474 = var2;
            this.field_46464 = var4;
            this.field_46468 = var6;
            this.field_46463 = var8;
            break;
         case 3:
            this.field_46460 = var2;
            this.field_46461 = var4;
            this.field_46475 = var6;
            this.field_46457 = var8;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d7"));
      }
   }

   public final void method_41705(int var1, class_1784 var2) {
      switch (var1) {
         case 0:
            this.field_46473 = var2.field_26829;
            this.field_46458 = var2.field_26830;
            this.field_46470 = var2.field_26828;
            this.field_46472 = var2.field_26827;
            break;
         case 1:
            this.field_46466 = var2.field_26829;
            this.field_46467 = var2.field_26830;
            this.field_46469 = var2.field_26828;
            this.field_46471 = var2.field_26827;
            break;
         case 2:
            this.field_46474 = var2.field_26829;
            this.field_46464 = var2.field_26830;
            this.field_46468 = var2.field_26828;
            this.field_46463 = var2.field_26827;
            break;
         case 3:
            this.field_46460 = var2.field_26829;
            this.field_46461 = var2.field_26830;
            this.field_46475 = var2.field_26828;
            this.field_46457 = var2.field_26827;
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d7"));
      }
   }

   public final void method_41706(int var1, double[] var2) {
      switch (var1) {
         case 0:
            this.field_46473 = var2[0];
            this.field_46458 = var2[1];
            this.field_46470 = var2[2];
            this.field_46472 = var2[3];
            break;
         case 1:
            this.field_46466 = var2[0];
            this.field_46467 = var2[1];
            this.field_46469 = var2[2];
            this.field_46471 = var2[3];
            break;
         case 2:
            this.field_46474 = var2[0];
            this.field_46464 = var2[1];
            this.field_46468 = var2[2];
            this.field_46463 = var2[3];
            break;
         case 3:
            this.field_46460 = var2[0];
            this.field_46461 = var2[1];
            this.field_46475 = var2[2];
            this.field_46457 = var2[3];
            break;
         default:
            throw new ArrayIndexOutOfBoundsException(class_3730.method_17283("Matrix4d7"));
      }
   }

   public final void method_41757(double var1) {
      this.field_46473 += var1;
      this.field_46466 += var1;
      this.field_46474 += var1;
      this.field_46460 += var1;
      this.field_46458 += var1;
      this.field_46467 += var1;
      this.field_46464 += var1;
      this.field_46461 += var1;
      this.field_46470 += var1;
      this.field_46469 += var1;
      this.field_46468 += var1;
      this.field_46475 += var1;
      this.field_46472 += var1;
      this.field_46471 += var1;
      this.field_46463 += var1;
      this.field_46457 += var1;
   }

   public final void method_41758(double var1, class_9076 var3) {
      this.field_46473 = var3.field_46473 + var1;
      this.field_46466 = var3.field_46466 + var1;
      this.field_46474 = var3.field_46474 + var1;
      this.field_46460 = var3.field_46460 + var1;
      this.field_46458 = var3.field_46458 + var1;
      this.field_46467 = var3.field_46467 + var1;
      this.field_46464 = var3.field_46464 + var1;
      this.field_46461 = var3.field_46461 + var1;
      this.field_46470 = var3.field_46470 + var1;
      this.field_46469 = var3.field_46469 + var1;
      this.field_46468 = var3.field_46468 + var1;
      this.field_46475 = var3.field_46475 + var1;
      this.field_46472 = var3.field_46472 + var1;
      this.field_46471 = var3.field_46471 + var1;
      this.field_46463 = var3.field_46463 + var1;
      this.field_46457 = var3.field_46457 + var1;
   }

   public final void method_41760(class_9076 var1, class_9076 var2) {
      this.field_46473 = var1.field_46473 + var2.field_46473;
      this.field_46466 = var1.field_46466 + var2.field_46466;
      this.field_46474 = var1.field_46474 + var2.field_46474;
      this.field_46460 = var1.field_46460 + var2.field_46460;
      this.field_46458 = var1.field_46458 + var2.field_46458;
      this.field_46467 = var1.field_46467 + var2.field_46467;
      this.field_46464 = var1.field_46464 + var2.field_46464;
      this.field_46461 = var1.field_46461 + var2.field_46461;
      this.field_46470 = var1.field_46470 + var2.field_46470;
      this.field_46469 = var1.field_46469 + var2.field_46469;
      this.field_46468 = var1.field_46468 + var2.field_46468;
      this.field_46475 = var1.field_46475 + var2.field_46475;
      this.field_46472 = var1.field_46472 + var2.field_46472;
      this.field_46471 = var1.field_46471 + var2.field_46471;
      this.field_46463 = var1.field_46463 + var2.field_46463;
      this.field_46457 = var1.field_46457 + var2.field_46457;
   }

   public final void method_41759(class_9076 var1) {
      this.field_46473 = this.field_46473 + var1.field_46473;
      this.field_46466 = this.field_46466 + var1.field_46466;
      this.field_46474 = this.field_46474 + var1.field_46474;
      this.field_46460 = this.field_46460 + var1.field_46460;
      this.field_46458 = this.field_46458 + var1.field_46458;
      this.field_46467 = this.field_46467 + var1.field_46467;
      this.field_46464 = this.field_46464 + var1.field_46464;
      this.field_46461 = this.field_46461 + var1.field_46461;
      this.field_46470 = this.field_46470 + var1.field_46470;
      this.field_46469 = this.field_46469 + var1.field_46469;
      this.field_46468 = this.field_46468 + var1.field_46468;
      this.field_46475 = this.field_46475 + var1.field_46475;
      this.field_46472 = this.field_46472 + var1.field_46472;
      this.field_46471 = this.field_46471 + var1.field_46471;
      this.field_46463 = this.field_46463 + var1.field_46463;
      this.field_46457 = this.field_46457 + var1.field_46457;
   }

   public final void method_41697(class_9076 var1, class_9076 var2) {
      this.field_46473 = var1.field_46473 - var2.field_46473;
      this.field_46466 = var1.field_46466 - var2.field_46466;
      this.field_46474 = var1.field_46474 - var2.field_46474;
      this.field_46460 = var1.field_46460 - var2.field_46460;
      this.field_46458 = var1.field_46458 - var2.field_46458;
      this.field_46467 = var1.field_46467 - var2.field_46467;
      this.field_46464 = var1.field_46464 - var2.field_46464;
      this.field_46461 = var1.field_46461 - var2.field_46461;
      this.field_46470 = var1.field_46470 - var2.field_46470;
      this.field_46469 = var1.field_46469 - var2.field_46469;
      this.field_46468 = var1.field_46468 - var2.field_46468;
      this.field_46475 = var1.field_46475 - var2.field_46475;
      this.field_46472 = var1.field_46472 - var2.field_46472;
      this.field_46471 = var1.field_46471 - var2.field_46471;
      this.field_46463 = var1.field_46463 - var2.field_46463;
      this.field_46457 = var1.field_46457 - var2.field_46457;
   }

   public final void method_41696(class_9076 var1) {
      this.field_46473 = this.field_46473 - var1.field_46473;
      this.field_46466 = this.field_46466 - var1.field_46466;
      this.field_46474 = this.field_46474 - var1.field_46474;
      this.field_46460 = this.field_46460 - var1.field_46460;
      this.field_46458 = this.field_46458 - var1.field_46458;
      this.field_46467 = this.field_46467 - var1.field_46467;
      this.field_46464 = this.field_46464 - var1.field_46464;
      this.field_46461 = this.field_46461 - var1.field_46461;
      this.field_46470 = this.field_46470 - var1.field_46470;
      this.field_46469 = this.field_46469 - var1.field_46469;
      this.field_46468 = this.field_46468 - var1.field_46468;
      this.field_46475 = this.field_46475 - var1.field_46475;
      this.field_46472 = this.field_46472 - var1.field_46472;
      this.field_46471 = this.field_46471 - var1.field_46471;
      this.field_46463 = this.field_46463 - var1.field_46463;
      this.field_46457 = this.field_46457 - var1.field_46457;
   }

   public final void method_41745() {
      double var3 = this.field_46458;
      this.field_46458 = this.field_46466;
      this.field_46466 = var3;
      var3 = this.field_46470;
      this.field_46470 = this.field_46474;
      this.field_46474 = var3;
      var3 = this.field_46472;
      this.field_46472 = this.field_46460;
      this.field_46460 = var3;
      var3 = this.field_46469;
      this.field_46469 = this.field_46464;
      this.field_46464 = var3;
      var3 = this.field_46471;
      this.field_46471 = this.field_46461;
      this.field_46461 = var3;
      var3 = this.field_46463;
      this.field_46463 = this.field_46475;
      this.field_46475 = var3;
   }

   public final void method_41746(class_9076 var1) {
      if (this == var1) {
         this.method_41745();
      } else {
         this.field_46473 = var1.field_46473;
         this.field_46466 = var1.field_46458;
         this.field_46474 = var1.field_46470;
         this.field_46460 = var1.field_46472;
         this.field_46458 = var1.field_46466;
         this.field_46467 = var1.field_46467;
         this.field_46464 = var1.field_46469;
         this.field_46461 = var1.field_46471;
         this.field_46470 = var1.field_46474;
         this.field_46469 = var1.field_46464;
         this.field_46468 = var1.field_46468;
         this.field_46475 = var1.field_46463;
         this.field_46472 = var1.field_46460;
         this.field_46471 = var1.field_46461;
         this.field_46463 = var1.field_46475;
         this.field_46457 = var1.field_46457;
      }
   }

   public final void method_41782(double[] var1) {
      this.field_46473 = var1[0];
      this.field_46466 = var1[1];
      this.field_46474 = var1[2];
      this.field_46460 = var1[3];
      this.field_46458 = var1[4];
      this.field_46467 = var1[5];
      this.field_46464 = var1[6];
      this.field_46461 = var1[7];
      this.field_46470 = var1[8];
      this.field_46469 = var1[9];
      this.field_46468 = var1[10];
      this.field_46475 = var1[11];
      this.field_46472 = var1[12];
      this.field_46471 = var1[13];
      this.field_46463 = var1[14];
      this.field_46457 = var1[15];
   }

   public final void method_41770(class_3367 var1) {
      this.field_46473 = (double)var1.field_16607;
      this.field_46466 = (double)var1.field_16596;
      this.field_46474 = (double)var1.field_16597;
      this.field_46460 = 0.0;
      this.field_46458 = (double)var1.field_16606;
      this.field_46467 = (double)var1.field_16602;
      this.field_46464 = (double)var1.field_16599;
      this.field_46461 = 0.0;
      this.field_46470 = (double)var1.field_16604;
      this.field_46469 = (double)var1.field_16605;
      this.field_46468 = (double)var1.field_16600;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41772(class_4173 var1) {
      this.field_46473 = var1.field_20304;
      this.field_46466 = var1.field_20313;
      this.field_46474 = var1.field_20311;
      this.field_46460 = 0.0;
      this.field_46458 = var1.field_20312;
      this.field_46467 = var1.field_20305;
      this.field_46464 = var1.field_20319;
      this.field_46461 = 0.0;
      this.field_46470 = var1.field_20314;
      this.field_46469 = var1.field_20322;
      this.field_46468 = var1.field_20307;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41780(class_9400 var1) {
      this.field_46473 = 1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828;
      this.field_46458 = 2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828);
      this.field_46470 = 2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830);
      this.field_46466 = 2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828);
      this.field_46467 = 1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828;
      this.field_46469 = 2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829);
      this.field_46474 = 2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830);
      this.field_46464 = 2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829);
      this.field_46468 = 1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830;
      this.field_46460 = 0.0;
      this.field_46461 = 0.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41779(class_9179 var1) {
      double var4 = Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965);
      if (!(var4 < 1.0E-10)) {
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
         this.field_46473 = var16 * var6 * var6 + var14;
         this.field_46466 = var16 * var20 - var12 * var10;
         this.field_46474 = var16 * var18 + var12 * var8;
         this.field_46458 = var16 * var20 + var12 * var10;
         this.field_46467 = var16 * var8 * var8 + var14;
         this.field_46464 = var16 * var22 - var12 * var6;
         this.field_46470 = var16 * var18 - var12 * var8;
         this.field_46469 = var16 * var22 + var12 * var6;
         this.field_46468 = var16 * var10 * var10 + var14;
      } else {
         this.field_46473 = 1.0;
         this.field_46466 = 0.0;
         this.field_46474 = 0.0;
         this.field_46458 = 0.0;
         this.field_46467 = 1.0;
         this.field_46464 = 0.0;
         this.field_46470 = 0.0;
         this.field_46469 = 0.0;
         this.field_46468 = 1.0;
      }

      this.field_46460 = 0.0;
      this.field_46461 = 0.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41775(class_8778 var1) {
      this.field_46473 = 1.0 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013;
      this.field_46458 = 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_46470 = 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_46466 = 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_46467 = 1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013;
      this.field_46469 = 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_46474 = 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_46464 = 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_46468 = 1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016;
      this.field_46460 = 0.0;
      this.field_46461 = 0.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41774(class_7441 var1) {
      double var4 = Math.sqrt((double)(var1.field_37928 * var1.field_37928 + var1.field_37931 * var1.field_37931 + var1.field_37927 * var1.field_37927));
      if (!(var4 < 1.0E-10)) {
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
         this.field_46473 = var16 * var6 * var6 + var14;
         this.field_46466 = var16 * var20 - var12 * var10;
         this.field_46474 = var16 * var18 + var12 * var8;
         this.field_46458 = var16 * var20 + var12 * var10;
         this.field_46467 = var16 * var8 * var8 + var14;
         this.field_46464 = var16 * var22 - var12 * var6;
         this.field_46470 = var16 * var18 - var12 * var8;
         this.field_46469 = var16 * var22 + var12 * var6;
         this.field_46468 = var16 * var10 * var10 + var14;
      } else {
         this.field_46473 = 1.0;
         this.field_46466 = 0.0;
         this.field_46474 = 0.0;
         this.field_46458 = 0.0;
         this.field_46467 = 1.0;
         this.field_46464 = 0.0;
         this.field_46470 = 0.0;
         this.field_46469 = 0.0;
         this.field_46468 = 1.0;
      }

      this.field_46460 = 0.0;
      this.field_46461 = 0.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41781(class_9400 var1, class_2627 var2, double var3) {
      this.field_46473 = var3 * (1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_46458 = var3 * 2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828);
      this.field_46470 = var3 * 2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830);
      this.field_46466 = var3 * 2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828);
      this.field_46467 = var3 * (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828);
      this.field_46469 = var3 * 2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829);
      this.field_46474 = var3 * 2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830);
      this.field_46464 = var3 * 2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829);
      this.field_46468 = var3 * (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830);
      this.field_46460 = var2.field_17244;
      this.field_46461 = var2.field_17242;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41776(class_8778 var1, class_2627 var2, double var3) {
      this.field_46473 = var3 * (1.0 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013);
      this.field_46458 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_46470 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_46466 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_46467 = var3 * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013);
      this.field_46469 = var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_46474 = var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_46464 = var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_46468 = var3 * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016);
      this.field_46460 = var2.field_17244;
      this.field_46461 = var2.field_17242;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41777(class_8778 var1, class_6181 var2, float var3) {
      this.field_46473 = (double)var3
         * (1.0 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013);
      this.field_46458 = (double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013);
      this.field_46470 = (double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016);
      this.field_46466 = (double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013);
      this.field_46467 = (double)var3
         * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9013 * (double)var1.field_9013);
      this.field_46469 = (double)var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014);
      this.field_46474 = (double)var3 * 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016);
      this.field_46464 = (double)var3 * 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014);
      this.field_46468 = (double)var3
         * (1.0 - 2.0 * (double)var1.field_9014 * (double)var1.field_9014 - 2.0 * (double)var1.field_9016 * (double)var1.field_9016);
      this.field_46460 = (double)var2.field_4390;
      this.field_46461 = (double)var2.field_4391;
      this.field_46475 = (double)var2.field_4393;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41769(class_2856 var1) {
      this.field_46473 = (double)var1.field_13977;
      this.field_46466 = (double)var1.field_13991;
      this.field_46474 = (double)var1.field_13976;
      this.field_46460 = (double)var1.field_13984;
      this.field_46458 = (double)var1.field_13993;
      this.field_46467 = (double)var1.field_13979;
      this.field_46464 = (double)var1.field_13989;
      this.field_46461 = (double)var1.field_13982;
      this.field_46470 = (double)var1.field_13983;
      this.field_46469 = (double)var1.field_13992;
      this.field_46468 = (double)var1.field_13978;
      this.field_46475 = (double)var1.field_13990;
      this.field_46472 = (double)var1.field_13975;
      this.field_46471 = (double)var1.field_13985;
      this.field_46463 = (double)var1.field_13986;
      this.field_46457 = (double)var1.field_13988;
   }

   public final void method_41778(class_9076 var1) {
      this.field_46473 = var1.field_46473;
      this.field_46466 = var1.field_46466;
      this.field_46474 = var1.field_46474;
      this.field_46460 = var1.field_46460;
      this.field_46458 = var1.field_46458;
      this.field_46467 = var1.field_46467;
      this.field_46464 = var1.field_46464;
      this.field_46461 = var1.field_46461;
      this.field_46470 = var1.field_46470;
      this.field_46469 = var1.field_46469;
      this.field_46468 = var1.field_46468;
      this.field_46475 = var1.field_46475;
      this.field_46472 = var1.field_46472;
      this.field_46471 = var1.field_46471;
      this.field_46463 = var1.field_46463;
      this.field_46457 = var1.field_46457;
   }

   public final void method_41677(class_9076 var1) {
      this.method_41700(var1);
   }

   public final void method_41676() {
      this.method_41700(this);
   }

   public final void method_41700(class_9076 var1) {
      double[] var4 = new double[16];
      int[] var5 = new int[4];
      double[] var6 = new double[]{
         var1.field_46473,
         var1.field_46466,
         var1.field_46474,
         var1.field_46460,
         var1.field_46458,
         var1.field_46467,
         var1.field_46464,
         var1.field_46461,
         var1.field_46470,
         var1.field_46469,
         var1.field_46468,
         var1.field_46475,
         var1.field_46472,
         var1.field_46471,
         var1.field_46463,
         var1.field_46457
      };
      if (!method_41742(var6, var5)) {
         throw new class_5059(class_3730.method_17283("Matrix4d10"));
      } else {
         for (int var7 = 0; var7 < 16; var7++) {
            var4[var7] = 0.0;
         }

         var4[0] = 1.0;
         var4[5] = 1.0;
         var4[10] = 1.0;
         var4[15] = 1.0;
         method_41666(var6, var5, var4);
         this.field_46473 = var4[0];
         this.field_46466 = var4[1];
         this.field_46474 = var4[2];
         this.field_46460 = var4[3];
         this.field_46458 = var4[4];
         this.field_46467 = var4[5];
         this.field_46464 = var4[6];
         this.field_46461 = var4[7];
         this.field_46470 = var4[8];
         this.field_46469 = var4[9];
         this.field_46468 = var4[10];
         this.field_46475 = var4[11];
         this.field_46472 = var4[12];
         this.field_46471 = var4[13];
         this.field_46463 = var4[14];
         this.field_46457 = var4[15];
      }
   }

   public static boolean method_41742(double[] var0, int[] var1) {
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
            throw new RuntimeException(class_3730.method_17283("Matrix4d11"));
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

   public static void method_41666(double[] var0, int[] var1, double[] var2) {
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

   public final double method_41671() {
      double var3 = this.field_46473
         * (
            this.field_46467 * this.field_46468 * this.field_46457
               + this.field_46464 * this.field_46475 * this.field_46471
               + this.field_46461 * this.field_46469 * this.field_46463
               - this.field_46461 * this.field_46468 * this.field_46471
               - this.field_46467 * this.field_46475 * this.field_46463
               - this.field_46464 * this.field_46469 * this.field_46457
         );
      var3 -= this.field_46466
         * (
            this.field_46458 * this.field_46468 * this.field_46457
               + this.field_46464 * this.field_46475 * this.field_46472
               + this.field_46461 * this.field_46470 * this.field_46463
               - this.field_46461 * this.field_46468 * this.field_46472
               - this.field_46458 * this.field_46475 * this.field_46463
               - this.field_46464 * this.field_46470 * this.field_46457
         );
      var3 += this.field_46474
         * (
            this.field_46458 * this.field_46469 * this.field_46457
               + this.field_46467 * this.field_46475 * this.field_46472
               + this.field_46461 * this.field_46470 * this.field_46471
               - this.field_46461 * this.field_46469 * this.field_46472
               - this.field_46458 * this.field_46475 * this.field_46471
               - this.field_46467 * this.field_46470 * this.field_46457
         );
      return var3
         - this.field_46460
            * (
               this.field_46458 * this.field_46469 * this.field_46463
                  + this.field_46467 * this.field_46468 * this.field_46472
                  + this.field_46464 * this.field_46470 * this.field_46471
                  - this.field_46464 * this.field_46469 * this.field_46472
                  - this.field_46458 * this.field_46468 * this.field_46471
                  - this.field_46467 * this.field_46470 * this.field_46463
            );
   }

   public final void method_41765(double var1) {
      this.field_46473 = var1;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = 0.0;
      this.field_46458 = 0.0;
      this.field_46467 = var1;
      this.field_46464 = 0.0;
      this.field_46461 = 0.0;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = var1;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41767(class_2627 var1) {
      this.field_46473 = 1.0;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = var1.field_17244;
      this.field_46458 = 0.0;
      this.field_46467 = 1.0;
      this.field_46464 = 0.0;
      this.field_46461 = var1.field_17242;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = 1.0;
      this.field_46475 = var1.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41766(double var1, class_2627 var3) {
      this.field_46473 = var1;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = var3.field_17244;
      this.field_46458 = 0.0;
      this.field_46467 = var1;
      this.field_46464 = 0.0;
      this.field_46461 = var3.field_17242;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = var1;
      this.field_46475 = var3.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41768(class_2627 var1, double var2) {
      this.field_46473 = var2;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = var2 * var1.field_17244;
      this.field_46458 = 0.0;
      this.field_46467 = var2;
      this.field_46464 = 0.0;
      this.field_46461 = var2 * var1.field_17242;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = var2;
      this.field_46475 = var2 * var1.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41771(class_3367 var1, class_6181 var2, float var3) {
      this.field_46473 = (double)(var1.field_16607 * var3);
      this.field_46466 = (double)(var1.field_16596 * var3);
      this.field_46474 = (double)(var1.field_16597 * var3);
      this.field_46460 = (double)var2.field_4390;
      this.field_46458 = (double)(var1.field_16606 * var3);
      this.field_46467 = (double)(var1.field_16602 * var3);
      this.field_46464 = (double)(var1.field_16599 * var3);
      this.field_46461 = (double)var2.field_4391;
      this.field_46470 = (double)(var1.field_16604 * var3);
      this.field_46469 = (double)(var1.field_16605 * var3);
      this.field_46468 = (double)(var1.field_16600 * var3);
      this.field_46475 = (double)var2.field_4393;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41773(class_4173 var1, class_2627 var2, double var3) {
      this.field_46473 = var1.field_20304 * var3;
      this.field_46466 = var1.field_20313 * var3;
      this.field_46474 = var1.field_20311 * var3;
      this.field_46460 = var2.field_17244;
      this.field_46458 = var1.field_20312 * var3;
      this.field_46467 = var1.field_20305 * var3;
      this.field_46464 = var1.field_20319 * var3;
      this.field_46461 = var2.field_17242;
      this.field_46470 = var1.field_20314 * var3;
      this.field_46469 = var1.field_20322 * var3;
      this.field_46468 = var1.field_20307 * var3;
      this.field_46475 = var2.field_17241;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41701(class_2627 var1) {
      this.field_46460 = var1.field_17244;
      this.field_46461 = var1.field_17242;
      this.field_46475 = var1.field_17241;
   }

   public final void method_41693(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field_46473 = 1.0;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = 0.0;
      this.field_46458 = 0.0;
      this.field_46467 = var7;
      this.field_46464 = -var5;
      this.field_46461 = 0.0;
      this.field_46470 = 0.0;
      this.field_46469 = var5;
      this.field_46468 = var7;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41678(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field_46473 = var7;
      this.field_46466 = 0.0;
      this.field_46474 = var5;
      this.field_46460 = 0.0;
      this.field_46458 = 0.0;
      this.field_46467 = 1.0;
      this.field_46464 = 0.0;
      this.field_46461 = 0.0;
      this.field_46470 = -var5;
      this.field_46469 = 0.0;
      this.field_46468 = var7;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41699(double var1) {
      double var5 = Math.sin(var1);
      double var7 = Math.cos(var1);
      this.field_46473 = var7;
      this.field_46466 = -var5;
      this.field_46474 = 0.0;
      this.field_46460 = 0.0;
      this.field_46458 = var5;
      this.field_46467 = var7;
      this.field_46464 = 0.0;
      this.field_46461 = 0.0;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = 1.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 1.0;
   }

   public final void method_41761(double var1) {
      this.field_46473 *= var1;
      this.field_46466 *= var1;
      this.field_46474 *= var1;
      this.field_46460 *= var1;
      this.field_46458 *= var1;
      this.field_46467 *= var1;
      this.field_46464 *= var1;
      this.field_46461 *= var1;
      this.field_46470 *= var1;
      this.field_46469 *= var1;
      this.field_46468 *= var1;
      this.field_46475 *= var1;
      this.field_46472 *= var1;
      this.field_46471 *= var1;
      this.field_46463 *= var1;
      this.field_46457 *= var1;
   }

   public final void method_41762(double var1, class_9076 var3) {
      this.field_46473 = var3.field_46473 * var1;
      this.field_46466 = var3.field_46466 * var1;
      this.field_46474 = var3.field_46474 * var1;
      this.field_46460 = var3.field_46460 * var1;
      this.field_46458 = var3.field_46458 * var1;
      this.field_46467 = var3.field_46467 * var1;
      this.field_46464 = var3.field_46464 * var1;
      this.field_46461 = var3.field_46461 * var1;
      this.field_46470 = var3.field_46470 * var1;
      this.field_46469 = var3.field_46469 * var1;
      this.field_46468 = var3.field_46468 * var1;
      this.field_46475 = var3.field_46475 * var1;
      this.field_46472 = var3.field_46472 * var1;
      this.field_46471 = var3.field_46471 * var1;
      this.field_46463 = var3.field_46463 * var1;
      this.field_46457 = var3.field_46457 * var1;
   }

   public final void method_41763(class_9076 var1) {
      double var4 = this.field_46473 * var1.field_46473
         + this.field_46466 * var1.field_46458
         + this.field_46474 * var1.field_46470
         + this.field_46460 * var1.field_46472;
      double var6 = this.field_46473 * var1.field_46466
         + this.field_46466 * var1.field_46467
         + this.field_46474 * var1.field_46469
         + this.field_46460 * var1.field_46471;
      double var8 = this.field_46473 * var1.field_46474
         + this.field_46466 * var1.field_46464
         + this.field_46474 * var1.field_46468
         + this.field_46460 * var1.field_46463;
      double var10 = this.field_46473 * var1.field_46460
         + this.field_46466 * var1.field_46461
         + this.field_46474 * var1.field_46475
         + this.field_46460 * var1.field_46457;
      double var12 = this.field_46458 * var1.field_46473
         + this.field_46467 * var1.field_46458
         + this.field_46464 * var1.field_46470
         + this.field_46461 * var1.field_46472;
      double var14 = this.field_46458 * var1.field_46466
         + this.field_46467 * var1.field_46467
         + this.field_46464 * var1.field_46469
         + this.field_46461 * var1.field_46471;
      double var16 = this.field_46458 * var1.field_46474
         + this.field_46467 * var1.field_46464
         + this.field_46464 * var1.field_46468
         + this.field_46461 * var1.field_46463;
      double var18 = this.field_46458 * var1.field_46460
         + this.field_46467 * var1.field_46461
         + this.field_46464 * var1.field_46475
         + this.field_46461 * var1.field_46457;
      double var20 = this.field_46470 * var1.field_46473
         + this.field_46469 * var1.field_46458
         + this.field_46468 * var1.field_46470
         + this.field_46475 * var1.field_46472;
      double var22 = this.field_46470 * var1.field_46466
         + this.field_46469 * var1.field_46467
         + this.field_46468 * var1.field_46469
         + this.field_46475 * var1.field_46471;
      double var24 = this.field_46470 * var1.field_46474
         + this.field_46469 * var1.field_46464
         + this.field_46468 * var1.field_46468
         + this.field_46475 * var1.field_46463;
      double var26 = this.field_46470 * var1.field_46460
         + this.field_46469 * var1.field_46461
         + this.field_46468 * var1.field_46475
         + this.field_46475 * var1.field_46457;
      double var28 = this.field_46472 * var1.field_46473
         + this.field_46471 * var1.field_46458
         + this.field_46463 * var1.field_46470
         + this.field_46457 * var1.field_46472;
      double var30 = this.field_46472 * var1.field_46466
         + this.field_46471 * var1.field_46467
         + this.field_46463 * var1.field_46469
         + this.field_46457 * var1.field_46471;
      double var32 = this.field_46472 * var1.field_46474
         + this.field_46471 * var1.field_46464
         + this.field_46463 * var1.field_46468
         + this.field_46457 * var1.field_46463;
      double var34 = this.field_46472 * var1.field_46460
         + this.field_46471 * var1.field_46461
         + this.field_46463 * var1.field_46475
         + this.field_46457 * var1.field_46457;
      this.field_46473 = var4;
      this.field_46466 = var6;
      this.field_46474 = var8;
      this.field_46460 = var10;
      this.field_46458 = var12;
      this.field_46467 = var14;
      this.field_46464 = var16;
      this.field_46461 = var18;
      this.field_46470 = var20;
      this.field_46469 = var22;
      this.field_46468 = var24;
      this.field_46475 = var26;
      this.field_46472 = var28;
      this.field_46471 = var30;
      this.field_46463 = var32;
      this.field_46457 = var34;
   }

   public final void method_41764(class_9076 var1, class_9076 var2) {
      if (this != var1 && this != var2) {
         this.field_46473 = var1.field_46473 * var2.field_46473
            + var1.field_46466 * var2.field_46458
            + var1.field_46474 * var2.field_46470
            + var1.field_46460 * var2.field_46472;
         this.field_46466 = var1.field_46473 * var2.field_46466
            + var1.field_46466 * var2.field_46467
            + var1.field_46474 * var2.field_46469
            + var1.field_46460 * var2.field_46471;
         this.field_46474 = var1.field_46473 * var2.field_46474
            + var1.field_46466 * var2.field_46464
            + var1.field_46474 * var2.field_46468
            + var1.field_46460 * var2.field_46463;
         this.field_46460 = var1.field_46473 * var2.field_46460
            + var1.field_46466 * var2.field_46461
            + var1.field_46474 * var2.field_46475
            + var1.field_46460 * var2.field_46457;
         this.field_46458 = var1.field_46458 * var2.field_46473
            + var1.field_46467 * var2.field_46458
            + var1.field_46464 * var2.field_46470
            + var1.field_46461 * var2.field_46472;
         this.field_46467 = var1.field_46458 * var2.field_46466
            + var1.field_46467 * var2.field_46467
            + var1.field_46464 * var2.field_46469
            + var1.field_46461 * var2.field_46471;
         this.field_46464 = var1.field_46458 * var2.field_46474
            + var1.field_46467 * var2.field_46464
            + var1.field_46464 * var2.field_46468
            + var1.field_46461 * var2.field_46463;
         this.field_46461 = var1.field_46458 * var2.field_46460
            + var1.field_46467 * var2.field_46461
            + var1.field_46464 * var2.field_46475
            + var1.field_46461 * var2.field_46457;
         this.field_46470 = var1.field_46470 * var2.field_46473
            + var1.field_46469 * var2.field_46458
            + var1.field_46468 * var2.field_46470
            + var1.field_46475 * var2.field_46472;
         this.field_46469 = var1.field_46470 * var2.field_46466
            + var1.field_46469 * var2.field_46467
            + var1.field_46468 * var2.field_46469
            + var1.field_46475 * var2.field_46471;
         this.field_46468 = var1.field_46470 * var2.field_46474
            + var1.field_46469 * var2.field_46464
            + var1.field_46468 * var2.field_46468
            + var1.field_46475 * var2.field_46463;
         this.field_46475 = var1.field_46470 * var2.field_46460
            + var1.field_46469 * var2.field_46461
            + var1.field_46468 * var2.field_46475
            + var1.field_46475 * var2.field_46457;
         this.field_46472 = var1.field_46472 * var2.field_46473
            + var1.field_46471 * var2.field_46458
            + var1.field_46463 * var2.field_46470
            + var1.field_46457 * var2.field_46472;
         this.field_46471 = var1.field_46472 * var2.field_46466
            + var1.field_46471 * var2.field_46467
            + var1.field_46463 * var2.field_46469
            + var1.field_46457 * var2.field_46471;
         this.field_46463 = var1.field_46472 * var2.field_46474
            + var1.field_46471 * var2.field_46464
            + var1.field_46463 * var2.field_46468
            + var1.field_46457 * var2.field_46463;
         this.field_46457 = var1.field_46472 * var2.field_46460
            + var1.field_46471 * var2.field_46461
            + var1.field_46463 * var2.field_46475
            + var1.field_46457 * var2.field_46457;
      } else {
         double var5 = var1.field_46473 * var2.field_46473
            + var1.field_46466 * var2.field_46458
            + var1.field_46474 * var2.field_46470
            + var1.field_46460 * var2.field_46472;
         double var7 = var1.field_46473 * var2.field_46466
            + var1.field_46466 * var2.field_46467
            + var1.field_46474 * var2.field_46469
            + var1.field_46460 * var2.field_46471;
         double var9 = var1.field_46473 * var2.field_46474
            + var1.field_46466 * var2.field_46464
            + var1.field_46474 * var2.field_46468
            + var1.field_46460 * var2.field_46463;
         double var11 = var1.field_46473 * var2.field_46460
            + var1.field_46466 * var2.field_46461
            + var1.field_46474 * var2.field_46475
            + var1.field_46460 * var2.field_46457;
         double var13 = var1.field_46458 * var2.field_46473
            + var1.field_46467 * var2.field_46458
            + var1.field_46464 * var2.field_46470
            + var1.field_46461 * var2.field_46472;
         double var15 = var1.field_46458 * var2.field_46466
            + var1.field_46467 * var2.field_46467
            + var1.field_46464 * var2.field_46469
            + var1.field_46461 * var2.field_46471;
         double var17 = var1.field_46458 * var2.field_46474
            + var1.field_46467 * var2.field_46464
            + var1.field_46464 * var2.field_46468
            + var1.field_46461 * var2.field_46463;
         double var19 = var1.field_46458 * var2.field_46460
            + var1.field_46467 * var2.field_46461
            + var1.field_46464 * var2.field_46475
            + var1.field_46461 * var2.field_46457;
         double var21 = var1.field_46470 * var2.field_46473
            + var1.field_46469 * var2.field_46458
            + var1.field_46468 * var2.field_46470
            + var1.field_46475 * var2.field_46472;
         double var23 = var1.field_46470 * var2.field_46466
            + var1.field_46469 * var2.field_46467
            + var1.field_46468 * var2.field_46469
            + var1.field_46475 * var2.field_46471;
         double var25 = var1.field_46470 * var2.field_46474
            + var1.field_46469 * var2.field_46464
            + var1.field_46468 * var2.field_46468
            + var1.field_46475 * var2.field_46463;
         double var27 = var1.field_46470 * var2.field_46460
            + var1.field_46469 * var2.field_46461
            + var1.field_46468 * var2.field_46475
            + var1.field_46475 * var2.field_46457;
         double var29 = var1.field_46472 * var2.field_46473
            + var1.field_46471 * var2.field_46458
            + var1.field_46463 * var2.field_46470
            + var1.field_46457 * var2.field_46472;
         double var31 = var1.field_46472 * var2.field_46466
            + var1.field_46471 * var2.field_46467
            + var1.field_46463 * var2.field_46469
            + var1.field_46457 * var2.field_46471;
         double var33 = var1.field_46472 * var2.field_46474
            + var1.field_46471 * var2.field_46464
            + var1.field_46463 * var2.field_46468
            + var1.field_46457 * var2.field_46463;
         double var35 = var1.field_46472 * var2.field_46460
            + var1.field_46471 * var2.field_46461
            + var1.field_46463 * var2.field_46475
            + var1.field_46457 * var2.field_46457;
         this.field_46473 = var5;
         this.field_46466 = var7;
         this.field_46474 = var9;
         this.field_46460 = var11;
         this.field_46458 = var13;
         this.field_46467 = var15;
         this.field_46464 = var17;
         this.field_46461 = var19;
         this.field_46470 = var21;
         this.field_46469 = var23;
         this.field_46468 = var25;
         this.field_46475 = var27;
         this.field_46472 = var29;
         this.field_46471 = var31;
         this.field_46463 = var33;
         this.field_46457 = var35;
      }
   }

   public final void method_41720(class_9076 var1, class_9076 var2) {
      if (this != var1 && this != var2) {
         this.field_46473 = var1.field_46473 * var2.field_46473
            + var1.field_46458 * var2.field_46466
            + var1.field_46470 * var2.field_46474
            + var1.field_46472 * var2.field_46460;
         this.field_46466 = var1.field_46473 * var2.field_46458
            + var1.field_46458 * var2.field_46467
            + var1.field_46470 * var2.field_46464
            + var1.field_46472 * var2.field_46461;
         this.field_46474 = var1.field_46473 * var2.field_46470
            + var1.field_46458 * var2.field_46469
            + var1.field_46470 * var2.field_46468
            + var1.field_46472 * var2.field_46475;
         this.field_46460 = var1.field_46473 * var2.field_46472
            + var1.field_46458 * var2.field_46471
            + var1.field_46470 * var2.field_46463
            + var1.field_46472 * var2.field_46457;
         this.field_46458 = var1.field_46466 * var2.field_46473
            + var1.field_46467 * var2.field_46466
            + var1.field_46469 * var2.field_46474
            + var1.field_46471 * var2.field_46460;
         this.field_46467 = var1.field_46466 * var2.field_46458
            + var1.field_46467 * var2.field_46467
            + var1.field_46469 * var2.field_46464
            + var1.field_46471 * var2.field_46461;
         this.field_46464 = var1.field_46466 * var2.field_46470
            + var1.field_46467 * var2.field_46469
            + var1.field_46469 * var2.field_46468
            + var1.field_46471 * var2.field_46475;
         this.field_46461 = var1.field_46466 * var2.field_46472
            + var1.field_46467 * var2.field_46471
            + var1.field_46469 * var2.field_46463
            + var1.field_46471 * var2.field_46457;
         this.field_46470 = var1.field_46474 * var2.field_46473
            + var1.field_46464 * var2.field_46466
            + var1.field_46468 * var2.field_46474
            + var1.field_46463 * var2.field_46460;
         this.field_46469 = var1.field_46474 * var2.field_46458
            + var1.field_46464 * var2.field_46467
            + var1.field_46468 * var2.field_46464
            + var1.field_46463 * var2.field_46461;
         this.field_46468 = var1.field_46474 * var2.field_46470
            + var1.field_46464 * var2.field_46469
            + var1.field_46468 * var2.field_46468
            + var1.field_46463 * var2.field_46475;
         this.field_46475 = var1.field_46474 * var2.field_46472
            + var1.field_46464 * var2.field_46471
            + var1.field_46468 * var2.field_46463
            + var1.field_46463 * var2.field_46457;
         this.field_46472 = var1.field_46460 * var2.field_46473
            + var1.field_46461 * var2.field_46466
            + var1.field_46475 * var2.field_46474
            + var1.field_46457 * var2.field_46460;
         this.field_46471 = var1.field_46460 * var2.field_46458
            + var1.field_46461 * var2.field_46467
            + var1.field_46475 * var2.field_46464
            + var1.field_46457 * var2.field_46461;
         this.field_46463 = var1.field_46460 * var2.field_46470
            + var1.field_46461 * var2.field_46469
            + var1.field_46475 * var2.field_46468
            + var1.field_46457 * var2.field_46475;
         this.field_46457 = var1.field_46460 * var2.field_46472
            + var1.field_46461 * var2.field_46471
            + var1.field_46475 * var2.field_46463
            + var1.field_46457 * var2.field_46457;
      } else {
         double var5 = var1.field_46473 * var2.field_46473
            + var1.field_46458 * var2.field_46466
            + var1.field_46470 * var2.field_46474
            + var1.field_46472 * var2.field_46460;
         double var7 = var1.field_46473 * var2.field_46458
            + var1.field_46458 * var2.field_46467
            + var1.field_46470 * var2.field_46464
            + var1.field_46472 * var2.field_46461;
         double var9 = var1.field_46473 * var2.field_46470
            + var1.field_46458 * var2.field_46469
            + var1.field_46470 * var2.field_46468
            + var1.field_46472 * var2.field_46475;
         double var11 = var1.field_46473 * var2.field_46472
            + var1.field_46458 * var2.field_46471
            + var1.field_46470 * var2.field_46463
            + var1.field_46472 * var2.field_46457;
         double var13 = var1.field_46466 * var2.field_46473
            + var1.field_46467 * var2.field_46466
            + var1.field_46469 * var2.field_46474
            + var1.field_46471 * var2.field_46460;
         double var15 = var1.field_46466 * var2.field_46458
            + var1.field_46467 * var2.field_46467
            + var1.field_46469 * var2.field_46464
            + var1.field_46471 * var2.field_46461;
         double var17 = var1.field_46466 * var2.field_46470
            + var1.field_46467 * var2.field_46469
            + var1.field_46469 * var2.field_46468
            + var1.field_46471 * var2.field_46475;
         double var19 = var1.field_46466 * var2.field_46472
            + var1.field_46467 * var2.field_46471
            + var1.field_46469 * var2.field_46463
            + var1.field_46471 * var2.field_46457;
         double var21 = var1.field_46474 * var2.field_46473
            + var1.field_46464 * var2.field_46466
            + var1.field_46468 * var2.field_46474
            + var1.field_46463 * var2.field_46460;
         double var23 = var1.field_46474 * var2.field_46458
            + var1.field_46464 * var2.field_46467
            + var1.field_46468 * var2.field_46464
            + var1.field_46463 * var2.field_46461;
         double var25 = var1.field_46474 * var2.field_46470
            + var1.field_46464 * var2.field_46469
            + var1.field_46468 * var2.field_46468
            + var1.field_46463 * var2.field_46475;
         double var27 = var1.field_46474 * var2.field_46472
            + var1.field_46464 * var2.field_46471
            + var1.field_46468 * var2.field_46463
            + var1.field_46463 * var2.field_46457;
         double var29 = var1.field_46460 * var2.field_46473
            + var1.field_46461 * var2.field_46466
            + var1.field_46475 * var2.field_46474
            + var1.field_46457 * var2.field_46460;
         double var31 = var1.field_46460 * var2.field_46458
            + var1.field_46461 * var2.field_46467
            + var1.field_46475 * var2.field_46464
            + var1.field_46457 * var2.field_46461;
         double var33 = var1.field_46460 * var2.field_46470
            + var1.field_46461 * var2.field_46469
            + var1.field_46475 * var2.field_46468
            + var1.field_46457 * var2.field_46475;
         double var35 = var1.field_46460 * var2.field_46472
            + var1.field_46461 * var2.field_46471
            + var1.field_46475 * var2.field_46463
            + var1.field_46457 * var2.field_46457;
         this.field_46473 = var5;
         this.field_46466 = var7;
         this.field_46474 = var9;
         this.field_46460 = var11;
         this.field_46458 = var13;
         this.field_46467 = var15;
         this.field_46464 = var17;
         this.field_46461 = var19;
         this.field_46470 = var21;
         this.field_46469 = var23;
         this.field_46468 = var25;
         this.field_46475 = var27;
         this.field_46472 = var29;
         this.field_46471 = var31;
         this.field_46463 = var33;
         this.field_46457 = var35;
      }
   }

   public final void method_41662(class_9076 var1, class_9076 var2) {
      if (this != var1 && this != var2) {
         this.field_46473 = var1.field_46473 * var2.field_46473
            + var1.field_46466 * var2.field_46466
            + var1.field_46474 * var2.field_46474
            + var1.field_46460 * var2.field_46460;
         this.field_46466 = var1.field_46473 * var2.field_46458
            + var1.field_46466 * var2.field_46467
            + var1.field_46474 * var2.field_46464
            + var1.field_46460 * var2.field_46461;
         this.field_46474 = var1.field_46473 * var2.field_46470
            + var1.field_46466 * var2.field_46469
            + var1.field_46474 * var2.field_46468
            + var1.field_46460 * var2.field_46475;
         this.field_46460 = var1.field_46473 * var2.field_46472
            + var1.field_46466 * var2.field_46471
            + var1.field_46474 * var2.field_46463
            + var1.field_46460 * var2.field_46457;
         this.field_46458 = var1.field_46458 * var2.field_46473
            + var1.field_46467 * var2.field_46466
            + var1.field_46464 * var2.field_46474
            + var1.field_46461 * var2.field_46460;
         this.field_46467 = var1.field_46458 * var2.field_46458
            + var1.field_46467 * var2.field_46467
            + var1.field_46464 * var2.field_46464
            + var1.field_46461 * var2.field_46461;
         this.field_46464 = var1.field_46458 * var2.field_46470
            + var1.field_46467 * var2.field_46469
            + var1.field_46464 * var2.field_46468
            + var1.field_46461 * var2.field_46475;
         this.field_46461 = var1.field_46458 * var2.field_46472
            + var1.field_46467 * var2.field_46471
            + var1.field_46464 * var2.field_46463
            + var1.field_46461 * var2.field_46457;
         this.field_46470 = var1.field_46470 * var2.field_46473
            + var1.field_46469 * var2.field_46466
            + var1.field_46468 * var2.field_46474
            + var1.field_46475 * var2.field_46460;
         this.field_46469 = var1.field_46470 * var2.field_46458
            + var1.field_46469 * var2.field_46467
            + var1.field_46468 * var2.field_46464
            + var1.field_46475 * var2.field_46461;
         this.field_46468 = var1.field_46470 * var2.field_46470
            + var1.field_46469 * var2.field_46469
            + var1.field_46468 * var2.field_46468
            + var1.field_46475 * var2.field_46475;
         this.field_46475 = var1.field_46470 * var2.field_46472
            + var1.field_46469 * var2.field_46471
            + var1.field_46468 * var2.field_46463
            + var1.field_46475 * var2.field_46457;
         this.field_46472 = var1.field_46472 * var2.field_46473
            + var1.field_46471 * var2.field_46466
            + var1.field_46463 * var2.field_46474
            + var1.field_46457 * var2.field_46460;
         this.field_46471 = var1.field_46472 * var2.field_46458
            + var1.field_46471 * var2.field_46467
            + var1.field_46463 * var2.field_46464
            + var1.field_46457 * var2.field_46461;
         this.field_46463 = var1.field_46472 * var2.field_46470
            + var1.field_46471 * var2.field_46469
            + var1.field_46463 * var2.field_46468
            + var1.field_46457 * var2.field_46475;
         this.field_46457 = var1.field_46472 * var2.field_46472
            + var1.field_46471 * var2.field_46471
            + var1.field_46463 * var2.field_46463
            + var1.field_46457 * var2.field_46457;
      } else {
         double var5 = var1.field_46473 * var2.field_46473
            + var1.field_46466 * var2.field_46466
            + var1.field_46474 * var2.field_46474
            + var1.field_46460 * var2.field_46460;
         double var7 = var1.field_46473 * var2.field_46458
            + var1.field_46466 * var2.field_46467
            + var1.field_46474 * var2.field_46464
            + var1.field_46460 * var2.field_46461;
         double var9 = var1.field_46473 * var2.field_46470
            + var1.field_46466 * var2.field_46469
            + var1.field_46474 * var2.field_46468
            + var1.field_46460 * var2.field_46475;
         double var11 = var1.field_46473 * var2.field_46472
            + var1.field_46466 * var2.field_46471
            + var1.field_46474 * var2.field_46463
            + var1.field_46460 * var2.field_46457;
         double var13 = var1.field_46458 * var2.field_46473
            + var1.field_46467 * var2.field_46466
            + var1.field_46464 * var2.field_46474
            + var1.field_46461 * var2.field_46460;
         double var15 = var1.field_46458 * var2.field_46458
            + var1.field_46467 * var2.field_46467
            + var1.field_46464 * var2.field_46464
            + var1.field_46461 * var2.field_46461;
         double var17 = var1.field_46458 * var2.field_46470
            + var1.field_46467 * var2.field_46469
            + var1.field_46464 * var2.field_46468
            + var1.field_46461 * var2.field_46475;
         double var19 = var1.field_46458 * var2.field_46472
            + var1.field_46467 * var2.field_46471
            + var1.field_46464 * var2.field_46463
            + var1.field_46461 * var2.field_46457;
         double var21 = var1.field_46470 * var2.field_46473
            + var1.field_46469 * var2.field_46466
            + var1.field_46468 * var2.field_46474
            + var1.field_46475 * var2.field_46460;
         double var23 = var1.field_46470 * var2.field_46458
            + var1.field_46469 * var2.field_46467
            + var1.field_46468 * var2.field_46464
            + var1.field_46475 * var2.field_46461;
         double var25 = var1.field_46470 * var2.field_46470
            + var1.field_46469 * var2.field_46469
            + var1.field_46468 * var2.field_46468
            + var1.field_46475 * var2.field_46475;
         double var27 = var1.field_46470 * var2.field_46472
            + var1.field_46469 * var2.field_46471
            + var1.field_46468 * var2.field_46463
            + var1.field_46475 * var2.field_46457;
         double var29 = var1.field_46472 * var2.field_46473
            + var1.field_46471 * var2.field_46466
            + var1.field_46463 * var2.field_46474
            + var1.field_46457 * var2.field_46460;
         double var31 = var1.field_46472 * var2.field_46458
            + var1.field_46471 * var2.field_46467
            + var1.field_46463 * var2.field_46464
            + var1.field_46457 * var2.field_46461;
         double var33 = var1.field_46472 * var2.field_46470
            + var1.field_46471 * var2.field_46469
            + var1.field_46463 * var2.field_46468
            + var1.field_46457 * var2.field_46475;
         double var35 = var1.field_46472 * var2.field_46472
            + var1.field_46471 * var2.field_46471
            + var1.field_46463 * var2.field_46463
            + var1.field_46457 * var2.field_46457;
         this.field_46473 = var5;
         this.field_46466 = var7;
         this.field_46474 = var9;
         this.field_46460 = var11;
         this.field_46458 = var13;
         this.field_46467 = var15;
         this.field_46464 = var17;
         this.field_46461 = var19;
         this.field_46470 = var21;
         this.field_46469 = var23;
         this.field_46468 = var25;
         this.field_46475 = var27;
         this.field_46472 = var29;
         this.field_46471 = var31;
         this.field_46463 = var33;
         this.field_46457 = var35;
      }
   }

   public final void method_41741(class_9076 var1, class_9076 var2) {
      if (this != var1 && this != var2) {
         this.field_46473 = var1.field_46473 * var2.field_46473
            + var1.field_46458 * var2.field_46458
            + var1.field_46470 * var2.field_46470
            + var1.field_46472 * var2.field_46472;
         this.field_46466 = var1.field_46473 * var2.field_46466
            + var1.field_46458 * var2.field_46467
            + var1.field_46470 * var2.field_46469
            + var1.field_46472 * var2.field_46471;
         this.field_46474 = var1.field_46473 * var2.field_46474
            + var1.field_46458 * var2.field_46464
            + var1.field_46470 * var2.field_46468
            + var1.field_46472 * var2.field_46463;
         this.field_46460 = var1.field_46473 * var2.field_46460
            + var1.field_46458 * var2.field_46461
            + var1.field_46470 * var2.field_46475
            + var1.field_46472 * var2.field_46457;
         this.field_46458 = var1.field_46466 * var2.field_46473
            + var1.field_46467 * var2.field_46458
            + var1.field_46469 * var2.field_46470
            + var1.field_46471 * var2.field_46472;
         this.field_46467 = var1.field_46466 * var2.field_46466
            + var1.field_46467 * var2.field_46467
            + var1.field_46469 * var2.field_46469
            + var1.field_46471 * var2.field_46471;
         this.field_46464 = var1.field_46466 * var2.field_46474
            + var1.field_46467 * var2.field_46464
            + var1.field_46469 * var2.field_46468
            + var1.field_46471 * var2.field_46463;
         this.field_46461 = var1.field_46466 * var2.field_46460
            + var1.field_46467 * var2.field_46461
            + var1.field_46469 * var2.field_46475
            + var1.field_46471 * var2.field_46457;
         this.field_46470 = var1.field_46474 * var2.field_46473
            + var1.field_46464 * var2.field_46458
            + var1.field_46468 * var2.field_46470
            + var1.field_46463 * var2.field_46472;
         this.field_46469 = var1.field_46474 * var2.field_46466
            + var1.field_46464 * var2.field_46467
            + var1.field_46468 * var2.field_46469
            + var1.field_46463 * var2.field_46471;
         this.field_46468 = var1.field_46474 * var2.field_46474
            + var1.field_46464 * var2.field_46464
            + var1.field_46468 * var2.field_46468
            + var1.field_46463 * var2.field_46463;
         this.field_46475 = var1.field_46474 * var2.field_46460
            + var1.field_46464 * var2.field_46461
            + var1.field_46468 * var2.field_46475
            + var1.field_46463 * var2.field_46457;
         this.field_46472 = var1.field_46460 * var2.field_46473
            + var1.field_46461 * var2.field_46458
            + var1.field_46475 * var2.field_46470
            + var1.field_46457 * var2.field_46472;
         this.field_46471 = var1.field_46460 * var2.field_46466
            + var1.field_46461 * var2.field_46467
            + var1.field_46475 * var2.field_46469
            + var1.field_46457 * var2.field_46471;
         this.field_46463 = var1.field_46460 * var2.field_46474
            + var1.field_46461 * var2.field_46464
            + var1.field_46475 * var2.field_46468
            + var1.field_46457 * var2.field_46463;
         this.field_46457 = var1.field_46460 * var2.field_46460
            + var1.field_46461 * var2.field_46461
            + var1.field_46475 * var2.field_46475
            + var1.field_46457 * var2.field_46457;
      } else {
         double var5 = var1.field_46473 * var2.field_46473
            + var1.field_46458 * var2.field_46458
            + var1.field_46470 * var2.field_46470
            + var1.field_46472 * var2.field_46472;
         double var7 = var1.field_46473 * var2.field_46466
            + var1.field_46458 * var2.field_46467
            + var1.field_46470 * var2.field_46469
            + var1.field_46472 * var2.field_46471;
         double var9 = var1.field_46473 * var2.field_46474
            + var1.field_46458 * var2.field_46464
            + var1.field_46470 * var2.field_46468
            + var1.field_46472 * var2.field_46463;
         double var11 = var1.field_46473 * var2.field_46460
            + var1.field_46458 * var2.field_46461
            + var1.field_46470 * var2.field_46475
            + var1.field_46472 * var2.field_46457;
         double var13 = var1.field_46466 * var2.field_46473
            + var1.field_46467 * var2.field_46458
            + var1.field_46469 * var2.field_46470
            + var1.field_46471 * var2.field_46472;
         double var15 = var1.field_46466 * var2.field_46466
            + var1.field_46467 * var2.field_46467
            + var1.field_46469 * var2.field_46469
            + var1.field_46471 * var2.field_46471;
         double var17 = var1.field_46466 * var2.field_46474
            + var1.field_46467 * var2.field_46464
            + var1.field_46469 * var2.field_46468
            + var1.field_46471 * var2.field_46463;
         double var19 = var1.field_46466 * var2.field_46460
            + var1.field_46467 * var2.field_46461
            + var1.field_46469 * var2.field_46475
            + var1.field_46471 * var2.field_46457;
         double var21 = var1.field_46474 * var2.field_46473
            + var1.field_46464 * var2.field_46458
            + var1.field_46468 * var2.field_46470
            + var1.field_46463 * var2.field_46472;
         double var23 = var1.field_46474 * var2.field_46466
            + var1.field_46464 * var2.field_46467
            + var1.field_46468 * var2.field_46469
            + var1.field_46463 * var2.field_46471;
         double var25 = var1.field_46474 * var2.field_46474
            + var1.field_46464 * var2.field_46464
            + var1.field_46468 * var2.field_46468
            + var1.field_46463 * var2.field_46463;
         double var27 = var1.field_46474 * var2.field_46460
            + var1.field_46464 * var2.field_46461
            + var1.field_46468 * var2.field_46475
            + var1.field_46463 * var2.field_46457;
         double var29 = var1.field_46460 * var2.field_46473
            + var1.field_46461 * var2.field_46458
            + var1.field_46475 * var2.field_46470
            + var1.field_46457 * var2.field_46472;
         double var31 = var1.field_46460 * var2.field_46466
            + var1.field_46461 * var2.field_46467
            + var1.field_46475 * var2.field_46469
            + var1.field_46457 * var2.field_46471;
         double var33 = var1.field_46460 * var2.field_46474
            + var1.field_46461 * var2.field_46464
            + var1.field_46475 * var2.field_46468
            + var1.field_46457 * var2.field_46463;
         double var35 = var1.field_46460 * var2.field_46460
            + var1.field_46461 * var2.field_46461
            + var1.field_46475 * var2.field_46475
            + var1.field_46457 * var2.field_46457;
         this.field_46473 = var5;
         this.field_46466 = var7;
         this.field_46474 = var9;
         this.field_46460 = var11;
         this.field_46458 = var13;
         this.field_46467 = var15;
         this.field_46464 = var17;
         this.field_46461 = var19;
         this.field_46470 = var21;
         this.field_46469 = var23;
         this.field_46468 = var25;
         this.field_46475 = var27;
         this.field_46472 = var29;
         this.field_46471 = var31;
         this.field_46463 = var33;
         this.field_46457 = var35;
      }
   }

   public boolean equals(class_9076 var1) {
      try {
         return this.field_46473 == var1.field_46473
            && this.field_46466 == var1.field_46466
            && this.field_46474 == var1.field_46474
            && this.field_46460 == var1.field_46460
            && this.field_46458 == var1.field_46458
            && this.field_46467 == var1.field_46467
            && this.field_46464 == var1.field_46464
            && this.field_46461 == var1.field_46461
            && this.field_46470 == var1.field_46470
            && this.field_46469 == var1.field_46469
            && this.field_46468 == var1.field_46468
            && this.field_46475 == var1.field_46475
            && this.field_46472 == var1.field_46472
            && this.field_46471 == var1.field_46471
            && this.field_46463 == var1.field_46463
            && this.field_46457 == var1.field_46457;
      } catch (NullPointerException var5) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         class_9076 var4 = (class_9076)var1;
         return this.field_46473 == var4.field_46473
            && this.field_46466 == var4.field_46466
            && this.field_46474 == var4.field_46474
            && this.field_46460 == var4.field_46460
            && this.field_46458 == var4.field_46458
            && this.field_46467 == var4.field_46467
            && this.field_46464 == var4.field_46464
            && this.field_46461 == var4.field_46461
            && this.field_46470 == var4.field_46470
            && this.field_46469 == var4.field_46469
            && this.field_46468 == var4.field_46468
            && this.field_46475 == var4.field_46475
            && this.field_46472 == var4.field_46472
            && this.field_46471 == var4.field_46471
            && this.field_46463 == var4.field_46463
            && this.field_46457 == var4.field_46457;
      } catch (ClassCastException var5) {
         return false;
      } catch (NullPointerException var6) {
         return false;
      }
   }

   /** @deprecated */
   public boolean method_41692(class_9076 var1, float var2) {
      return this.method_41691(var1, (double)var2);
   }

   public boolean method_41691(class_9076 var1, double var2) {
      double var6 = this.field_46473 - var1.field_46473;
      if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
         var6 = this.field_46466 - var1.field_46466;
         if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
            var6 = this.field_46474 - var1.field_46474;
            if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
               var6 = this.field_46460 - var1.field_46460;
               if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                  var6 = this.field_46458 - var1.field_46458;
                  if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                     var6 = this.field_46467 - var1.field_46467;
                     if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                        var6 = this.field_46464 - var1.field_46464;
                        if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                           var6 = this.field_46461 - var1.field_46461;
                           if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                              var6 = this.field_46470 - var1.field_46470;
                              if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                 var6 = this.field_46469 - var1.field_46469;
                                 if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                    var6 = this.field_46468 - var1.field_46468;
                                    if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                       var6 = this.field_46475 - var1.field_46475;
                                       if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                          var6 = this.field_46472 - var1.field_46472;
                                          if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                             var6 = this.field_46471 - var1.field_46471;
                                             if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                                var6 = this.field_46463 - var1.field_46463;
                                                if (!((!(var6 < 0.0) ? var6 : -var6) > var2)) {
                                                   var6 = this.field_46457 - var1.field_46457;
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
      var3 = 31L * var3 + class_9845.method_45350(this.field_46473);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46466);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46474);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46460);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46458);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46467);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46464);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46461);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46470);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46469);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46468);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46475);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46472);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46471);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46463);
      var3 = 31L * var3 + class_9845.method_45350(this.field_46457);
      return (int)(var3 ^ var3 >> 32);
   }

   public final void method_41728(class_5230 var1, class_5230 var2) {
      double var5 = this.field_46473 * var1.field_26829
         + this.field_46466 * var1.field_26830
         + this.field_46474 * var1.field_26828
         + this.field_46460 * var1.field_26827;
      double var7 = this.field_46458 * var1.field_26829
         + this.field_46467 * var1.field_26830
         + this.field_46464 * var1.field_26828
         + this.field_46461 * var1.field_26827;
      double var9 = this.field_46470 * var1.field_26829
         + this.field_46469 * var1.field_26830
         + this.field_46468 * var1.field_26828
         + this.field_46475 * var1.field_26827;
      var2.field_26827 = this.field_46472 * var1.field_26829
         + this.field_46471 * var1.field_26830
         + this.field_46463 * var1.field_26828
         + this.field_46457 * var1.field_26827;
      var2.field_26829 = var5;
      var2.field_26830 = var7;
      var2.field_26828 = var9;
   }

   public final void method_41727(class_5230 var1) {
      double var4 = this.field_46473 * var1.field_26829
         + this.field_46466 * var1.field_26830
         + this.field_46474 * var1.field_26828
         + this.field_46460 * var1.field_26827;
      double var6 = this.field_46458 * var1.field_26829
         + this.field_46467 * var1.field_26830
         + this.field_46464 * var1.field_26828
         + this.field_46461 * var1.field_26827;
      double var8 = this.field_46470 * var1.field_26829
         + this.field_46469 * var1.field_26830
         + this.field_46468 * var1.field_26828
         + this.field_46475 * var1.field_26827;
      var1.field_26827 = this.field_46472 * var1.field_26829
         + this.field_46471 * var1.field_26830
         + this.field_46463 * var1.field_26828
         + this.field_46457 * var1.field_26827;
      var1.field_26829 = var4;
      var1.field_26830 = var6;
      var1.field_26828 = var8;
   }

   public final void method_41724(class_1752 var1, class_1752 var2) {
      float var5 = (float)(
         this.field_46473 * (double)var1.field_9014
            + this.field_46466 * (double)var1.field_9016
            + this.field_46474 * (double)var1.field_9013
            + this.field_46460 * (double)var1.field_9012
      );
      float var6 = (float)(
         this.field_46458 * (double)var1.field_9014
            + this.field_46467 * (double)var1.field_9016
            + this.field_46464 * (double)var1.field_9013
            + this.field_46461 * (double)var1.field_9012
      );
      float var7 = (float)(
         this.field_46470 * (double)var1.field_9014
            + this.field_46469 * (double)var1.field_9016
            + this.field_46468 * (double)var1.field_9013
            + this.field_46475 * (double)var1.field_9012
      );
      var2.field_9012 = (float)(
         this.field_46472 * (double)var1.field_9014
            + this.field_46471 * (double)var1.field_9016
            + this.field_46463 * (double)var1.field_9013
            + this.field_46457 * (double)var1.field_9012
      );
      var2.field_9014 = var5;
      var2.field_9016 = var6;
      var2.field_9013 = var7;
   }

   public final void method_41723(class_1752 var1) {
      float var4 = (float)(
         this.field_46473 * (double)var1.field_9014
            + this.field_46466 * (double)var1.field_9016
            + this.field_46474 * (double)var1.field_9013
            + this.field_46460 * (double)var1.field_9012
      );
      float var5 = (float)(
         this.field_46458 * (double)var1.field_9014
            + this.field_46467 * (double)var1.field_9016
            + this.field_46464 * (double)var1.field_9013
            + this.field_46461 * (double)var1.field_9012
      );
      float var6 = (float)(
         this.field_46470 * (double)var1.field_9014
            + this.field_46469 * (double)var1.field_9016
            + this.field_46468 * (double)var1.field_9013
            + this.field_46475 * (double)var1.field_9012
      );
      var1.field_9012 = (float)(
         this.field_46472 * (double)var1.field_9014
            + this.field_46471 * (double)var1.field_9016
            + this.field_46463 * (double)var1.field_9013
            + this.field_46457 * (double)var1.field_9012
      );
      var1.field_9014 = var4;
      var1.field_9016 = var5;
      var1.field_9013 = var6;
   }

   public final void method_41722(class_529 var1, class_529 var2) {
      double var5 = this.field_46473 * var1.field_17244 + this.field_46466 * var1.field_17242 + this.field_46474 * var1.field_17241 + this.field_46460;
      double var7 = this.field_46458 * var1.field_17244 + this.field_46467 * var1.field_17242 + this.field_46464 * var1.field_17241 + this.field_46461;
      var2.field_17241 = this.field_46470 * var1.field_17244 + this.field_46469 * var1.field_17242 + this.field_46468 * var1.field_17241 + this.field_46475;
      var2.field_17244 = var5;
      var2.field_17242 = var7;
   }

   public final void method_41721(class_529 var1) {
      double var4 = this.field_46473 * var1.field_17244 + this.field_46466 * var1.field_17242 + this.field_46474 * var1.field_17241 + this.field_46460;
      double var6 = this.field_46458 * var1.field_17244 + this.field_46467 * var1.field_17242 + this.field_46464 * var1.field_17241 + this.field_46461;
      var1.field_17241 = this.field_46470 * var1.field_17244 + this.field_46469 * var1.field_17242 + this.field_46468 * var1.field_17241 + this.field_46475;
      var1.field_17244 = var4;
      var1.field_17242 = var6;
   }

   public final void method_41732(class_8079 var1, class_8079 var2) {
      float var5 = (float)(
         this.field_46473 * (double)var1.field_4390
            + this.field_46466 * (double)var1.field_4391
            + this.field_46474 * (double)var1.field_4393
            + this.field_46460
      );
      float var6 = (float)(
         this.field_46458 * (double)var1.field_4390
            + this.field_46467 * (double)var1.field_4391
            + this.field_46464 * (double)var1.field_4393
            + this.field_46461
      );
      var2.field_4393 = (float)(
         this.field_46470 * (double)var1.field_4390
            + this.field_46469 * (double)var1.field_4391
            + this.field_46468 * (double)var1.field_4393
            + this.field_46475
      );
      var2.field_4390 = var5;
      var2.field_4391 = var6;
   }

   public final void method_41731(class_8079 var1) {
      float var4 = (float)(
         this.field_46473 * (double)var1.field_4390
            + this.field_46466 * (double)var1.field_4391
            + this.field_46474 * (double)var1.field_4393
            + this.field_46460
      );
      float var5 = (float)(
         this.field_46458 * (double)var1.field_4390
            + this.field_46467 * (double)var1.field_4391
            + this.field_46464 * (double)var1.field_4393
            + this.field_46461
      );
      var1.field_4393 = (float)(
         this.field_46470 * (double)var1.field_4390
            + this.field_46469 * (double)var1.field_4391
            + this.field_46468 * (double)var1.field_4393
            + this.field_46475
      );
      var1.field_4390 = var4;
      var1.field_4391 = var5;
   }

   public final void method_41726(class_2627 var1, class_2627 var2) {
      double var5 = this.field_46473 * var1.field_17244 + this.field_46466 * var1.field_17242 + this.field_46474 * var1.field_17241;
      double var7 = this.field_46458 * var1.field_17244 + this.field_46467 * var1.field_17242 + this.field_46464 * var1.field_17241;
      var2.field_17241 = this.field_46470 * var1.field_17244 + this.field_46469 * var1.field_17242 + this.field_46468 * var1.field_17241;
      var2.field_17244 = var5;
      var2.field_17242 = var7;
   }

   public final void method_41725(class_2627 var1) {
      double var4 = this.field_46473 * var1.field_17244 + this.field_46466 * var1.field_17242 + this.field_46474 * var1.field_17241;
      double var6 = this.field_46458 * var1.field_17244 + this.field_46467 * var1.field_17242 + this.field_46464 * var1.field_17241;
      var1.field_17241 = this.field_46470 * var1.field_17244 + this.field_46469 * var1.field_17242 + this.field_46468 * var1.field_17241;
      var1.field_17244 = var4;
      var1.field_17242 = var6;
   }

   public final void method_41730(class_6181 var1, class_6181 var2) {
      float var5 = (float)(this.field_46473 * (double)var1.field_4390 + this.field_46466 * (double)var1.field_4391 + this.field_46474 * (double)var1.field_4393);
      float var6 = (float)(this.field_46458 * (double)var1.field_4390 + this.field_46467 * (double)var1.field_4391 + this.field_46464 * (double)var1.field_4393);
      var2.field_4393 = (float)(
         this.field_46470 * (double)var1.field_4390 + this.field_46469 * (double)var1.field_4391 + this.field_46468 * (double)var1.field_4393
      );
      var2.field_4390 = var5;
      var2.field_4391 = var6;
   }

   public final void method_41729(class_6181 var1) {
      float var4 = (float)(this.field_46473 * (double)var1.field_4390 + this.field_46466 * (double)var1.field_4391 + this.field_46474 * (double)var1.field_4393);
      float var5 = (float)(this.field_46458 * (double)var1.field_4390 + this.field_46467 * (double)var1.field_4391 + this.field_46464 * (double)var1.field_4393);
      var1.field_4393 = (float)(
         this.field_46470 * (double)var1.field_4390 + this.field_46469 * (double)var1.field_4391 + this.field_46468 * (double)var1.field_4393
      );
      var1.field_4390 = var4;
      var1.field_4391 = var5;
   }

   public final void method_41685(class_4173 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      this.field_46473 = var1.field_20304 * var5[0];
      this.field_46466 = var1.field_20313 * var5[1];
      this.field_46474 = var1.field_20311 * var5[2];
      this.field_46458 = var1.field_20312 * var5[0];
      this.field_46467 = var1.field_20305 * var5[1];
      this.field_46464 = var1.field_20319 * var5[2];
      this.field_46470 = var1.field_20314 * var5[0];
      this.field_46469 = var1.field_20322 * var5[1];
      this.field_46468 = var1.field_20307 * var5[2];
   }

   public final void method_41684(class_3367 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      this.field_46473 = (double)var1.field_16607 * var5[0];
      this.field_46466 = (double)var1.field_16596 * var5[1];
      this.field_46474 = (double)var1.field_16597 * var5[2];
      this.field_46458 = (double)var1.field_16606 * var5[0];
      this.field_46467 = (double)var1.field_16602 * var5[1];
      this.field_46464 = (double)var1.field_16599 * var5[2];
      this.field_46470 = (double)var1.field_16604 * var5[0];
      this.field_46469 = (double)var1.field_16605 * var5[1];
      this.field_46468 = (double)var1.field_16600 * var5[2];
   }

   public final void method_41686(class_8778 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      this.field_46473 = (1.0 - (double)(2.0F * var1.field_9016 * var1.field_9016) - (double)(2.0F * var1.field_9013 * var1.field_9013)) * var5[0];
      this.field_46458 = 2.0 * (double)(var1.field_9014 * var1.field_9016 + var1.field_9012 * var1.field_9013) * var5[0];
      this.field_46470 = 2.0 * (double)(var1.field_9014 * var1.field_9013 - var1.field_9012 * var1.field_9016) * var5[0];
      this.field_46466 = 2.0 * (double)(var1.field_9014 * var1.field_9016 - var1.field_9012 * var1.field_9013) * var5[1];
      this.field_46467 = (1.0 - (double)(2.0F * var1.field_9014 * var1.field_9014) - (double)(2.0F * var1.field_9013 * var1.field_9013)) * var5[1];
      this.field_46469 = 2.0 * (double)(var1.field_9016 * var1.field_9013 + var1.field_9012 * var1.field_9014) * var5[1];
      this.field_46474 = 2.0 * (double)(var1.field_9014 * var1.field_9013 + var1.field_9012 * var1.field_9016) * var5[2];
      this.field_46464 = 2.0 * (double)(var1.field_9016 * var1.field_9013 - var1.field_9012 * var1.field_9014) * var5[2];
      this.field_46468 = (1.0 - (double)(2.0F * var1.field_9014 * var1.field_9014) - (double)(2.0F * var1.field_9016 * var1.field_9016)) * var5[2];
   }

   public final void method_41688(class_9400 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      this.field_46473 = (1.0 - 2.0 * var1.field_26830 * var1.field_26830 - 2.0 * var1.field_26828 * var1.field_26828) * var5[0];
      this.field_46458 = 2.0 * (var1.field_26829 * var1.field_26830 + var1.field_26827 * var1.field_26828) * var5[0];
      this.field_46470 = 2.0 * (var1.field_26829 * var1.field_26828 - var1.field_26827 * var1.field_26830) * var5[0];
      this.field_46466 = 2.0 * (var1.field_26829 * var1.field_26830 - var1.field_26827 * var1.field_26828) * var5[1];
      this.field_46467 = (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26828 * var1.field_26828) * var5[1];
      this.field_46469 = 2.0 * (var1.field_26830 * var1.field_26828 + var1.field_26827 * var1.field_26829) * var5[1];
      this.field_46474 = 2.0 * (var1.field_26829 * var1.field_26828 + var1.field_26827 * var1.field_26830) * var5[2];
      this.field_46464 = 2.0 * (var1.field_26830 * var1.field_26828 - var1.field_26827 * var1.field_26829) * var5[2];
      this.field_46468 = (1.0 - 2.0 * var1.field_26829 * var1.field_26829 - 2.0 * var1.field_26830 * var1.field_26830) * var5[2];
   }

   public final void method_41687(class_9179 var1) {
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      this.method_41672(var5, var4);
      double var6 = 1.0 / Math.sqrt(var1.field_46964 * var1.field_46964 + var1.field_46963 * var1.field_46963 + var1.field_46965 * var1.field_46965);
      double var8 = var1.field_46964 * var6;
      double var10 = var1.field_46963 * var6;
      double var12 = var1.field_46965 * var6;
      double var14 = Math.sin(var1.field_46968);
      double var16 = Math.cos(var1.field_46968);
      double var18 = 1.0 - var16;
      double var20 = var1.field_46964 * var1.field_46965;
      double var22 = var1.field_46964 * var1.field_46963;
      double var24 = var1.field_46963 * var1.field_46965;
      this.field_46473 = (var18 * var8 * var8 + var16) * var5[0];
      this.field_46466 = (var18 * var22 - var14 * var12) * var5[1];
      this.field_46474 = (var18 * var20 + var14 * var10) * var5[2];
      this.field_46458 = (var18 * var22 + var14 * var12) * var5[0];
      this.field_46467 = (var18 * var10 * var10 + var16) * var5[1];
      this.field_46464 = (var18 * var24 - var14 * var8) * var5[2];
      this.field_46470 = (var18 * var20 - var14 * var10) * var5[0];
      this.field_46469 = (var18 * var24 + var14 * var8) * var5[1];
      this.field_46468 = (var18 * var12 * var12 + var16) * var5[2];
   }

   public final void method_41754() {
      this.field_46473 = 0.0;
      this.field_46466 = 0.0;
      this.field_46474 = 0.0;
      this.field_46460 = 0.0;
      this.field_46458 = 0.0;
      this.field_46467 = 0.0;
      this.field_46464 = 0.0;
      this.field_46461 = 0.0;
      this.field_46470 = 0.0;
      this.field_46469 = 0.0;
      this.field_46468 = 0.0;
      this.field_46475 = 0.0;
      this.field_46472 = 0.0;
      this.field_46471 = 0.0;
      this.field_46463 = 0.0;
      this.field_46457 = 0.0;
   }

   public final void method_41751() {
      this.field_46473 = -this.field_46473;
      this.field_46466 = -this.field_46466;
      this.field_46474 = -this.field_46474;
      this.field_46460 = -this.field_46460;
      this.field_46458 = -this.field_46458;
      this.field_46467 = -this.field_46467;
      this.field_46464 = -this.field_46464;
      this.field_46461 = -this.field_46461;
      this.field_46470 = -this.field_46470;
      this.field_46469 = -this.field_46469;
      this.field_46468 = -this.field_46468;
      this.field_46475 = -this.field_46475;
      this.field_46472 = -this.field_46472;
      this.field_46471 = -this.field_46471;
      this.field_46463 = -this.field_46463;
      this.field_46457 = -this.field_46457;
   }

   public final void method_41752(class_9076 var1) {
      this.field_46473 = -var1.field_46473;
      this.field_46466 = -var1.field_46466;
      this.field_46474 = -var1.field_46474;
      this.field_46460 = -var1.field_46460;
      this.field_46458 = -var1.field_46458;
      this.field_46467 = -var1.field_46467;
      this.field_46464 = -var1.field_46464;
      this.field_46461 = -var1.field_46461;
      this.field_46470 = -var1.field_46470;
      this.field_46469 = -var1.field_46469;
      this.field_46468 = -var1.field_46468;
      this.field_46475 = -var1.field_46475;
      this.field_46472 = -var1.field_46472;
      this.field_46471 = -var1.field_46471;
      this.field_46463 = -var1.field_46463;
      this.field_46457 = -var1.field_46457;
   }

   private final void method_41672(double[] var1, double[] var2) {
      double[] var5 = new double[]{
         this.field_46473,
         this.field_46466,
         this.field_46474,
         this.field_46458,
         this.field_46467,
         this.field_46464,
         this.field_46470,
         this.field_46469,
         this.field_46468
      };
      class_4173.method_19400(var5, var1, var2);
   }

   @Override
   public Object clone() {
      Object var3 = null;

      try {
         return (class_9076)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }
   }

   public final double method_41689() {
      return this.field_46473;
   }

   public final void method_41707(double var1) {
      this.field_46473 = var1;
   }

   public final double method_41665() {
      return this.field_46466;
   }

   public final void method_41673(double var1) {
      this.field_46466 = var1;
   }

   public final double method_41733() {
      return this.field_46474;
   }

   public final void method_41735(double var1) {
      this.field_46474 = var1;
   }

   public final double method_41670() {
      return this.field_46458;
   }

   public final void method_41750(double var1) {
      this.field_46458 = var1;
   }

   public final double method_41667() {
      return this.field_46467;
   }

   public final void method_41719(double var1) {
      this.field_46467 = var1;
   }

   public final double method_41710() {
      return this.field_46464;
   }

   public final void method_41663(double var1) {
      this.field_46464 = var1;
   }

   public final double method_41675() {
      return this.field_46470;
   }

   public final void method_41669(double var1) {
      this.field_46470 = var1;
   }

   public final double method_41659() {
      return this.field_46469;
   }

   public final void method_41756(double var1) {
      this.field_46469 = var1;
   }

   public final double method_41664() {
      return this.field_46468;
   }

   public final void method_41690(double var1) {
      this.field_46468 = var1;
   }

   public final double method_41679() {
      return this.field_46460;
   }

   public final void method_41681(double var1) {
      this.field_46460 = var1;
   }

   public final double method_41743() {
      return this.field_46461;
   }

   public final void method_41734(double var1) {
      this.field_46461 = var1;
   }

   public final double method_41718() {
      return this.field_46475;
   }

   public final void method_41680(double var1) {
      this.field_46475 = var1;
   }

   public final double method_41744() {
      return this.field_46472;
   }

   public final void method_41740(double var1) {
      this.field_46472 = var1;
   }

   public final double method_41698() {
      return this.field_46471;
   }

   public final void method_41702(double var1) {
      this.field_46471 = var1;
   }

   public final double method_41755() {
      return this.field_46463;
   }

   public final void method_41753(double var1) {
      this.field_46463 = var1;
   }

   public final double method_41783() {
      return this.field_46457;
   }

   public final void method_41703(double var1) {
      this.field_46457 = var1;
   }
}
