package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_9697 {
   private int field_49328;
   private long field_49334;
   private int[] field_49336;
   private class_878 field_49324;
   private double[] field_49332;
   private class_1702 field_49337;
   private int field_49325;
   private long field_49330;
   private int field_49326;
   private long field_49333;
   private boolean field_49329 = false;
   private class_3281 field_49327;
   private static final double field_49331 = Math.PI;
   private boolean field_49335;

   public class_9697(long var1) {
      if (var1 < 1L) {
         throw new IllegalArgumentException("n must be greater than 0");
      } else {
         this.field_49335 = class_2751.method_12427() || var1 > (long)class_7975.method_36102();
         this.field_49328 = (int)var1;
         this.field_49334 = var1;
         if (this.field_49335) {
            if (!class_2751.method_12439(var1)) {
               this.field_49337 = this.method_44808(var1);
               this.field_49327 = new class_3281(2L * var1);
            } else {
               this.field_49329 = true;
               this.field_49324 = new class_878(
                  (long)class_6806.method_31211(
                     (double)(2L + (1L << (int)((long)(class_6806.method_31231((double)(var1 / 2L) + 0.5) / class_6806.method_31231(2.0)) / 2L)))
                  )
               );
               this.field_49337 = new class_1702(this.field_49334 * 5L / 4L);
               this.field_49330 = this.field_49324.method_36076(0L);
               if (var1 > this.field_49330 << 2) {
                  this.field_49330 = this.field_49334 >> 2;
                  class_2751.method_12455(this.field_49330, this.field_49324, this.field_49337);
               }

               this.field_49333 = this.field_49324.method_36076(1L);
               if (var1 > this.field_49333) {
                  this.field_49333 = this.field_49334;
                  class_2751.method_12459(this.field_49333, this.field_49337, this.field_49330, this.field_49324);
               }
            }
         } else {
            if (var1 > 268435456L) {
               throw new IllegalArgumentException("n must be smaller or equal to 268435456 when useLargeArrays argument is set to false");
            }

            if (!class_2751.method_12439(var1)) {
               this.field_49332 = this.method_44807(this.field_49328);
               this.field_49327 = new class_3281(2L * var1);
            } else {
               this.field_49329 = true;
               this.field_49336 = new int[(int)class_6806.method_31211(
                  (double)(2 + (1 << (int)(class_6806.method_31231((double)(var1 / 2L) + 0.5) / class_6806.method_31231(2.0)) / 2))
               )];
               this.field_49332 = new double[this.field_49328 * 5 / 4];
               this.field_49325 = this.field_49336[0];
               if (var1 > (long)(this.field_49325 << 2)) {
                  this.field_49325 = this.field_49328 >> 2;
                  class_2751.method_12453(this.field_49325, this.field_49336, this.field_49332);
               }

               this.field_49326 = this.field_49336[1];
               if (var1 > (long)this.field_49326) {
                  this.field_49326 = this.field_49328;
                  class_2751.method_12457(this.field_49326, this.field_49332, this.field_49325, this.field_49336);
               }
            }
         }
      }
   }

   public void method_44816(double[] var1, boolean var2) {
      this.method_44815(var1, 0, var2);
   }

   public void method_44814(class_1702 var1, boolean var2) {
      this.method_44813(var1, 0L, var2);
   }

   public void method_44815(double[] var1, int var2, boolean var3) {
      if (this.field_49328 != 1) {
         if (this.field_49335) {
            this.method_44813(new class_1702(var1), (long)var2, var3);
         } else if (this.field_49329) {
            double var6 = var1[var2 + this.field_49328 - 1];

            for (int var8 = this.field_49328 - 2; var8 >= 2; var8 -= 2) {
               var1[var2 + var8 + 1] = var1[var2 + var8] - var1[var2 + var8 - 1];
               var1[var2 + var8] = var1[var2 + var8] + var1[var2 + var8 - 1];
            }

            var1[var2 + 1] = var1[var2] - var6;
            var1[var2] += var6;
            if (this.field_49328 > 4) {
               method_44805(this.field_49328, var1, var2, this.field_49326, this.field_49332, this.field_49325);
               class_2751.method_12512(this.field_49328, var1, var2, this.field_49336, this.field_49325, this.field_49332);
            } else if (this.field_49328 == 4) {
               class_2751.method_12512(this.field_49328, var1, var2, this.field_49336, this.field_49325, this.field_49332);
            }

            class_2751.method_12494(this.field_49328, var1, var2, this.field_49326, this.field_49332, this.field_49325);
            if (var3) {
               class_2751.method_12444(this.field_49328, class_6806.method_31206(2.0 / (double)this.field_49328), var1, var2, false);
               var1[var2] /= class_6806.method_31206(2.0);
            }
         } else {
            int var9 = 2 * this.field_49328;
            double[] var10 = new double[var9];
            System.arraycopy(var1, var2, var10, 0, this.field_49328);
            int var18 = class_1266.method_5693();

            for (int var11 = this.field_49328; var11 < var9; var11++) {
               var10[var11] = var10[var9 - var11 - 1];
            }

            this.field_49327.method_15044(var10);
            if (var18 > 1 && (long)this.field_49328 > class_2751.method_12448()) {
               byte var19 = 2;
               int var21 = this.field_49328 / var19;
               Future[] var22 = new Future[var19];

               for (int var23 = 0; var23 < var19; var23++) {
                  int var14 = var23 * var21;
                  int var15 = var23 == var19 - 1 ? this.field_49328 : var14 + var21;
                  var22[var23] = class_1266.method_5694(new class_9277(this, var14, var15, var2, var1, var10));
               }

               try {
                  class_1266.method_5696(var22);
               } catch (InterruptedException var16) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var16);
               } catch (ExecutionException var17) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var17);
               }
            } else {
               for (int var20 = 0; var20 < this.field_49328; var20++) {
                  int var12 = 2 * var20;
                  int var13 = var2 + var20;
                  var1[var13] = this.field_49332[var12] * var10[var12] - this.field_49332[var12 + 1] * var10[var12 + 1];
               }
            }

            if (var3) {
               class_2751.method_12444(this.field_49328, 1.0 / class_6806.method_31206((double)var9), var1, var2, false);
               var1[var2] /= class_6806.method_31206(2.0);
            }
         }
      }
   }

   public void method_44813(class_1702 var1, long var2, boolean var4) {
      if (this.field_49334 != 1L) {
         if (!this.field_49335) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_44815(var1.method_7641(), (int)var2, var4);
         } else if (this.field_49329) {
            double var7 = var1.method_36107(var2 + this.field_49334 - 1L);

            for (long var9 = this.field_49334 - 2L; var9 >= 2L; var9 -= 2L) {
               var1.method_36114(var2 + var9 + 1L, var1.method_36107(var2 + var9) - var1.method_36107(var2 + var9 - 1L));
               var1.method_36114(var2 + var9, var1.method_36107(var2 + var9) + var1.method_36107(var2 + var9 - 1L));
            }

            var1.method_36114(var2 + 1L, var1.method_36107(var2) - var7);
            var1.method_36114(var2, var1.method_36107(var2) + var7);
            if (this.field_49334 > 4L) {
               method_44806(this.field_49334, var1, var2, this.field_49333, this.field_49337, this.field_49330);
               class_2751.method_12514(this.field_49334, var1, var2, this.field_49324, this.field_49330, this.field_49337);
            } else if (this.field_49334 == 4L) {
               class_2751.method_12514(this.field_49334, var1, var2, this.field_49324, this.field_49330, this.field_49337);
            }

            class_2751.method_12496(this.field_49334, var1, var2, this.field_49333, this.field_49337, this.field_49330);
            if (var4) {
               class_2751.method_12446(this.field_49334, class_6806.method_31206(2.0 / (double)this.field_49334), var1, var2, false);
               var1.method_36114(var2, var1.method_36107(var2) / class_6806.method_31206(2.0));
            }
         } else {
            long var25 = 2L * this.field_49334;
            class_1702 var11 = new class_1702(var25);
            class_3685.method_17115(var1, var2, var11, 0L, this.field_49334);
            int var12 = class_1266.method_5693();

            for (long var13 = this.field_49334; var13 < var25; var13++) {
               var11.method_36114(var13, var11.method_36107(var25 - var13 - 1L));
            }

            this.field_49327.method_15042(var11);
            if (var12 > 1 && this.field_49334 > class_2751.method_12448()) {
               byte var26 = 2;
               long var28 = this.field_49334 / (long)var26;
               Future[] var15 = new Future[var26];

               for (int var16 = 0; var16 < var26; var16++) {
                  long var29 = (long)var16 * var28;
                  long var19 = var16 == var26 - 1 ? this.field_49334 : var29 + var28;
                  var15[var16] = class_1266.method_5694(new class_5108(this, var29, var19, var2, var1, var11));
               }

               try {
                  class_1266.method_5696(var15);
               } catch (InterruptedException var23) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var23);
               } catch (ExecutionException var24) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var24);
               }
            } else {
               for (long var27 = 0L; var27 < this.field_49334; var27++) {
                  long var21 = 2L * var27;
                  long var17 = var2 + var27;
                  var1.method_36114(
                     var17,
                     this.field_49337.method_36107(var21) * var11.method_36107(var21)
                        - this.field_49337.method_36107(var21 + 1L) * var11.method_36107(var21 + 1L)
                  );
               }
            }

            if (var4) {
               class_2751.method_12446(this.field_49334, 1.0 / class_6806.method_31206((double)var25), var1, var2, false);
               var1.method_36114(var2, var1.method_36107(var2) / class_6806.method_31206(2.0));
            }
         }
      }
   }

   public void method_44821(double[] var1, boolean var2) {
      this.method_44820(var1, 0, var2);
   }

   public void method_44819(class_1702 var1, boolean var2) {
      this.method_44818(var1, 0L, var2);
   }

   public void method_44820(double[] var1, int var2, boolean var3) {
      if (this.field_49328 != 1) {
         if (this.field_49335) {
            this.method_44818(new class_1702(var1), (long)var2, var3);
         } else if (this.field_49329) {
            if (var3) {
               class_2751.method_12444(this.field_49328, class_6806.method_31206(2.0 / (double)this.field_49328), var1, var2, false);
               var1[var2] /= class_6806.method_31206(2.0);
            }

            class_2751.method_12494(this.field_49328, var1, var2, this.field_49326, this.field_49332, this.field_49325);
            if (this.field_49328 > 4) {
               class_2751.method_12490(this.field_49328, var1, var2, this.field_49336, this.field_49325, this.field_49332);
               method_44809(this.field_49328, var1, var2, this.field_49326, this.field_49332, this.field_49325);
            } else if (this.field_49328 == 4) {
               class_2751.method_12490(this.field_49328, var1, var2, this.field_49336, this.field_49325, this.field_49332);
            }

            double var6 = var1[var2] - var1[var2 + 1];
            var1[var2] += var1[var2 + 1];

            for (byte var8 = 2; var8 < this.field_49328; var8 += 2) {
               var1[var2 + var8 - 1] = var1[var2 + var8] - var1[var2 + var8 + 1];
               var1[var2 + var8] = var1[var2 + var8] + var1[var2 + var8 + 1];
            }

            var1[var2 + this.field_49328 - 1] = var6;
         } else {
            int var9 = 2 * this.field_49328;
            if (var3) {
               class_2751.method_12444(this.field_49328, class_6806.method_31206((double)var9), var1, var2, false);
               var1[var2] *= class_6806.method_31206(2.0);
            }

            double[] var10 = new double[var9];
            int var20 = class_1266.method_5693();
            if (var20 > 1 && (long)this.field_49328 > class_2751.method_12448()) {
               byte var21 = 2;
               int var22 = this.field_49328 / var21;
               Future[] var23 = new Future[var21];

               for (int var13 = 0; var13 < var21; var13++) {
                  int var14 = var13 * var22;
                  int var15 = var13 == var21 - 1 ? this.field_49328 : var14 + var22;
                  var23[var13] = class_1266.method_5694(new class_2465(this, var14, var15, var1, var2, var10));
               }

               try {
                  class_1266.method_5696(var23);
               } catch (InterruptedException var18) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var18);
               } catch (ExecutionException var19) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var19);
               }
            } else {
               for (int var11 = 0; var11 < this.field_49328; var11++) {
                  int var12 = 2 * var11;
                  double var16 = var1[var2 + var11];
                  var10[var12] = this.field_49332[var12] * var16;
                  var10[var12 + 1] = -this.field_49332[var12 + 1] * var16;
               }
            }

            this.field_49327.method_15023(var10, true);
            System.arraycopy(var10, 0, var1, var2, this.field_49328);
         }
      }
   }

   public void method_44818(class_1702 var1, long var2, boolean var4) {
      if (this.field_49334 != 1L) {
         if (!this.field_49335) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_44820(var1.method_7641(), (int)var2, var4);
         } else if (this.field_49329) {
            if (var4) {
               class_2751.method_12446(this.field_49334, class_6806.method_31206(2.0 / (double)this.field_49334), var1, var2, false);
               var1.method_36114(var2, var1.method_36107(var2) / class_6806.method_31206(2.0));
            }

            class_2751.method_12496(this.field_49334, var1, var2, this.field_49333, this.field_49337, this.field_49330);
            if (this.field_49334 > 4L) {
               class_2751.method_12492(this.field_49334, var1, var2, this.field_49324, this.field_49330, this.field_49337);
               method_44810(this.field_49334, var1, var2, this.field_49333, this.field_49337, this.field_49330);
            } else if (this.field_49334 == 4L) {
               class_2751.method_12492(this.field_49334, var1, var2, this.field_49324, this.field_49330, this.field_49337);
            }

            double var7 = var1.method_36107(var2) - var1.method_36107(var2 + 1L);
            var1.method_36114(var2, var1.method_36107(var2) + var1.method_36107(var2 + 1L));

            for (long var9 = 2L; var9 < this.field_49334; var9 += 2L) {
               var1.method_36114(var2 + var9 - 1L, var1.method_36107(var2 + var9) - var1.method_36107(var2 + var9 + 1L));
               var1.method_36114(var2 + var9, var1.method_36107(var2 + var9) + var1.method_36107(var2 + var9 + 1L));
            }

            var1.method_36114(var2 + this.field_49334 - 1L, var7);
         } else {
            long var25 = 2L * this.field_49334;
            if (var4) {
               class_2751.method_12446(this.field_49334, class_6806.method_31206((double)var25), var1, var2, false);
               var1.method_36114(var2, var1.method_36107(var2) * class_6806.method_31206(2.0));
            }

            class_1702 var11 = new class_1702(var25);
            int var12 = class_1266.method_5693();
            if (var12 > 1 && this.field_49334 > class_2751.method_12448()) {
               byte var26 = 2;
               long var27 = this.field_49334 / (long)var26;
               Future[] var15 = new Future[var26];

               for (int var16 = 0; var16 < var26; var16++) {
                  long var28 = (long)var16 * var27;
                  long var19 = var16 == var26 - 1 ? this.field_49334 : var28 + var27;
                  var15[var16] = class_1266.method_5694(new class_4830(this, var28, var19, var1, var2, var11));
               }

               try {
                  class_1266.method_5696(var15);
               } catch (InterruptedException var23) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var23);
               } catch (ExecutionException var24) {
                  Logger.getLogger(class_9697.class.getName()).log(Level.SEVERE, null, var24);
               }
            } else {
               for (long var13 = 0L; var13 < this.field_49334; var13++) {
                  long var21 = 2L * var13;
                  double var17 = var1.method_36107(var2 + var13);
                  var11.method_36114(var21, this.field_49337.method_36107(var21) * var17);
                  var11.method_36114(var21 + 1L, -this.field_49337.method_36107(var21 + 1L) * var17);
               }
            }

            this.field_49327.method_15021(var11, true);
            class_3685.method_17115(var11, 0L, var1, var2, this.field_49334);
         }
      }
   }

   private double[] method_44807(int var1) {
      int var4 = 2 * var1;
      double var5 = Math.PI / (double)var4;
      double[] var7 = new double[var4];
      var7[0] = 1.0;

      for (int var8 = 1; var8 < var1; var8++) {
         int var9 = 2 * var8;
         double var10 = var5 * (double)var8;
         var7[var9] = class_6806.method_31223(var10);
         var7[var9 + 1] = -class_6806.method_31165(var10);
      }

      return var7;
   }

   private class_1702 method_44808(long var1) {
      long var5 = 2L * var1;
      double var7 = Math.PI / (double)var5;
      class_1702 var9 = new class_1702(var5);
      var9.method_36114(0L, 1.0);

      for (long var10 = 1L; var10 < var1; var10++) {
         long var12 = 2L * var10;
         double var14 = var7 * (double)var10;
         var9.method_36114(var12, class_6806.method_31223(var14));
         var9.method_36114(var12 + 1L, -class_6806.method_31165(var14));
      }

      return var9;
   }

   private static void method_44809(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (byte var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         double var13 = 0.5 - var4[var5 + var3 - var10];
         double var15 = var4[var5 + var10];
         int var17 = var2 + var11;
         int var18 = var2 + var12;
         double var19 = var1[var17] - var1[var18];
         double var21 = var1[var17 + 1] + var1[var18 + 1];
         double var23 = var13 * var19 - var15 * var21;
         double var25 = var13 * var21 + var15 * var19;
         var1[var17] -= var23;
         var1[var17 + 1] = var1[var17 + 1] - var25;
         var1[var18] += var23;
         var1[var18 + 1] = var1[var18 + 1] - var25;
      }
   }

   private static void method_44810(long var0, class_1702 var2, long var3, long var5, class_1702 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         double var22 = 0.5 - var7.method_36107(var8 + var5 - var16);
         double var24 = var7.method_36107(var8 + var16);
         long var26 = var3 + var18;
         long var28 = var3 + var20;
         double var30 = var2.method_36107(var26) - var2.method_36107(var28);
         double var32 = var2.method_36107(var26 + 1L) + var2.method_36107(var28 + 1L);
         double var34 = var22 * var30 - var24 * var32;
         double var36 = var22 * var32 + var24 * var30;
         var2.method_36114(var26, var2.method_36107(var26) - var34);
         var2.method_36114(var26 + 1L, var2.method_36107(var26 + 1L) - var36);
         var2.method_36114(var28, var2.method_36107(var28) + var34);
         var2.method_36114(var28 + 1L, var2.method_36107(var28 + 1L) - var36);
      }
   }

   private static void method_44805(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (byte var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         double var13 = 0.5 - var4[var5 + var3 - var10];
         double var15 = var4[var5 + var10];
         int var17 = var2 + var11;
         int var18 = var2 + var12;
         double var19 = var1[var17] - var1[var18];
         double var21 = var1[var17 + 1] + var1[var18 + 1];
         double var23 = var13 * var19 + var15 * var21;
         double var25 = var13 * var21 - var15 * var19;
         var1[var17] -= var23;
         var1[var17 + 1] = var1[var17 + 1] - var25;
         var1[var18] += var23;
         var1[var18 + 1] = var1[var18 + 1] - var25;
      }
   }

   private static void method_44806(long var0, class_1702 var2, long var3, long var5, class_1702 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         double var22 = 0.5 - var7.method_36107(var8 + var5 - var16);
         double var24 = var7.method_36107(var8 + var16);
         long var26 = var3 + var18;
         long var28 = var3 + var20;
         double var30 = var2.method_36107(var26) - var2.method_36107(var28);
         double var32 = var2.method_36107(var26 + 1L) + var2.method_36107(var28 + 1L);
         double var34 = var22 * var30 + var24 * var32;
         double var36 = var22 * var32 - var24 * var30;
         var2.method_36114(var26, var2.method_36107(var26) - var34);
         var2.method_36114(var26 + 1L, var2.method_36107(var26 + 1L) - var36);
         var2.method_36114(var28, var2.method_36107(var28) + var34);
         var2.method_36114(var28 + 1L, var2.method_36107(var28 + 1L) - var36);
      }
   }
}
