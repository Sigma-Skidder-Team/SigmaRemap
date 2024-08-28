package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class9788 {
   private int field45760;
   private long field45761;
   private int[] field45762;
   private Class2382 field45763;
   private double[] field45764;
   private Class2381 field45765;
   private int field45766;
   private long field45767;
   private int field45768;
   private long field45769;
   private boolean field45770 = false;
   private Class7990 field45771;
   private static final double field45772 = Math.PI;
   private boolean field45773;

   public Class9788(long var1) {
      if (var1 < 1L) {
         throw new IllegalArgumentException("n must be greater than 0");
      } else {
         this.field45773 = Class7796.method25901() || var1 > (long)Class2373.method9693();
         this.field45760 = (int)var1;
         this.field45761 = var1;
         if (this.field45773) {
            if (!Class7796.method25908(var1)) {
               this.field45765 = this.method38585(var1);
               this.field45771 = new Class7990(2L * var1);
            } else {
               this.field45770 = true;
               this.field45763 = new Class2382(
                  (long)Class9044.method33599(
                     (double)(2L + (1L << (int)((long)(Class9044.method33564((double)(var1 / 2L) + 0.5) / Class9044.method33564(2.0)) / 2L)))
                  )
               );
               this.field45765 = new Class2381(this.field45761 * 5L / 4L);
               this.field45767 = this.field45763.method9649(0L);
               if (var1 > this.field45767 << 2) {
                  this.field45767 = this.field45761 >> 2;
                  Class7796.method25913(this.field45767, this.field45763, this.field45765);
               }

               this.field45769 = this.field45763.method9649(1L);
               if (var1 > this.field45769) {
                  this.field45769 = this.field45761;
                  Class7796.method25915(this.field45769, this.field45765, this.field45767, this.field45763);
               }
            }
         } else {
            if (var1 > 268435456L) {
               throw new IllegalArgumentException("n must be smaller or equal to 268435456 when useLargeArrays argument is set to false");
            }

            if (!Class7796.method25908(var1)) {
               this.field45764 = this.method38584(this.field45760);
               this.field45771 = new Class7990(2L * var1);
            } else {
               this.field45770 = true;
               this.field45762 = new int[(int)Class9044.method33599(
                  (double)(2 + (1 << (int)(Class9044.method33564((double)(var1 / 2L) + 0.5) / Class9044.method33564(2.0)) / 2))
               )];
               this.field45764 = new double[this.field45760 * 5 / 4];
               this.field45766 = this.field45762[0];
               if (var1 > (long)(this.field45766 << 2)) {
                  this.field45766 = this.field45760 >> 2;
                  Class7796.method25912(this.field45766, this.field45762, this.field45764);
               }

               this.field45768 = this.field45762[1];
               if (var1 > (long)this.field45768) {
                  this.field45768 = this.field45760;
                  Class7796.method25914(this.field45768, this.field45764, this.field45766, this.field45762);
               }
            }
         }
      }
   }

   public void method38576(double[] var1, boolean var2) {
      this.method38578(var1, 0, var2);
   }

   public void method38577(Class2381 var1, boolean var2) {
      this.method38579(var1, 0L, var2);
   }

   public void method38578(double[] var1, int var2, boolean var3) {
      if (this.field45760 != 1) {
         if (this.field45773) {
            this.method38579(new Class2381(var1), (long)var2, var3);
         } else if (this.field45770) {
            double var6 = var1[var2 + this.field45760 - 1];

            for (int var8 = this.field45760 - 2; var8 >= 2; var8 -= 2) {
               var1[var2 + var8 + 1] = var1[var2 + var8] - var1[var2 + var8 - 1];
               var1[var2 + var8] = var1[var2 + var8] + var1[var2 + var8 - 1];
            }

            var1[var2 + 1] = var1[var2] - var6;
            var1[var2] += var6;
            if (this.field45760 > 4) {
               method38588(this.field45760, var1, var2, this.field45768, this.field45764, this.field45766);
               Class7796.method25922(this.field45760, var1, var2, this.field45762, this.field45766, this.field45764);
            } else if (this.field45760 == 4) {
               Class7796.method25922(this.field45760, var1, var2, this.field45762, this.field45766, this.field45764);
            }

            Class7796.method25976(this.field45760, var1, var2, this.field45768, this.field45764, this.field45766);
            if (var3) {
               Class7796.method26036(this.field45760, Class9044.method33546(2.0 / (double)this.field45760), var1, var2, false);
               var1[var2] /= Class9044.method33546(2.0);
            }
         } else {
            int var9 = 2 * this.field45760;
            double[] var10 = new double[var9];
            System.arraycopy(var1, var2, var10, 0, this.field45760);
            int var18 = Class7008.method21726();

            for (int var11 = this.field45760; var11 < var9; var11++) {
               var10[var11] = var10[var9 - var11 - 1];
            }

            this.field45771.method27170(var10);
            if (var18 > 1 && (long)this.field45760 > Class7796.method25891()) {
               byte var19 = 2;
               int var21 = this.field45760 / var19;
               Future[] var22 = new Future[var19];

               for (int var23 = 0; var23 < var19; var23++) {
                  int var14 = var23 * var21;
                  int var15 = var23 == var19 - 1 ? this.field45760 : var14 + var21;
                  var22[var23] = Class7008.method21729(new Class1641(this, var14, var15, var2, var1, var10));
               }

               try {
                  Class7008.method21730(var22);
               } catch (InterruptedException var16) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var16);
               } catch (ExecutionException var17) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var17);
               }
            } else {
               for (int var20 = 0; var20 < this.field45760; var20++) {
                  int var12 = 2 * var20;
                  int var13 = var2 + var20;
                  var1[var13] = this.field45764[var12] * var10[var12] - this.field45764[var12 + 1] * var10[var12 + 1];
               }
            }

            if (var3) {
               Class7796.method26036(this.field45760, 1.0 / Class9044.method33546((double)var9), var1, var2, false);
               var1[var2] /= Class9044.method33546(2.0);
            }
         }
      }
   }

   public void method38579(Class2381 var1, long var2, boolean var4) {
      if (this.field45761 != 1L) {
         if (!this.field45773) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method38578(var1.method9655(), (int)var2, var4);
         } else if (this.field45770) {
            double var7 = var1.method9653(var2 + this.field45761 - 1L);

            for (long var9 = this.field45761 - 2L; var9 >= 2L; var9 -= 2L) {
               var1.method9687(var2 + var9 + 1L, var1.method9653(var2 + var9) - var1.method9653(var2 + var9 - 1L));
               var1.method9687(var2 + var9, var1.method9653(var2 + var9) + var1.method9653(var2 + var9 - 1L));
            }

            var1.method9687(var2 + 1L, var1.method9653(var2) - var7);
            var1.method9687(var2, var1.method9653(var2) + var7);
            if (this.field45761 > 4L) {
               method38589(this.field45761, var1, var2, this.field45769, this.field45765, this.field45767);
               Class7796.method25923(this.field45761, var1, var2, this.field45763, this.field45767, this.field45765);
            } else if (this.field45761 == 4L) {
               Class7796.method25923(this.field45761, var1, var2, this.field45763, this.field45767, this.field45765);
            }

            Class7796.method25977(this.field45761, var1, var2, this.field45769, this.field45765, this.field45767);
            if (var4) {
               Class7796.method26037(this.field45761, Class9044.method33546(2.0 / (double)this.field45761), var1, var2, false);
               var1.method9687(var2, var1.method9653(var2) / Class9044.method33546(2.0));
            }
         } else {
            long var25 = 2L * this.field45761;
            Class2381 var11 = new Class2381(var25);
            Class8133.method28177(var1, var2, var11, 0L, this.field45761);
            int var12 = Class7008.method21726();

            for (long var13 = this.field45761; var13 < var25; var13++) {
               var11.method9687(var13, var11.method9653(var25 - var13 - 1L));
            }

            this.field45771.method27171(var11);
            if (var12 > 1 && this.field45761 > Class7796.method25891()) {
               byte var26 = 2;
               long var28 = this.field45761 / (long)var26;
               Future[] var15 = new Future[var26];

               for (int var16 = 0; var16 < var26; var16++) {
                  long var29 = (long)var16 * var28;
                  long var19 = var16 == var26 - 1 ? this.field45761 : var29 + var28;
                  var15[var16] = Class7008.method21729(new Class668(this, var29, var19, var2, var1, var11));
               }

               try {
                  Class7008.method21730(var15);
               } catch (InterruptedException var23) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var23);
               } catch (ExecutionException var24) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var24);
               }
            } else {
               for (long var27 = 0L; var27 < this.field45761; var27++) {
                  long var21 = 2L * var27;
                  long var17 = var2 + var27;
                  var1.method9687(
                     var17, this.field45765.method9653(var21) * var11.method9653(var21) - this.field45765.method9653(var21 + 1L) * var11.method9653(var21 + 1L)
                  );
               }
            }

            if (var4) {
               Class7796.method26037(this.field45761, 1.0 / Class9044.method33546((double)var25), var1, var2, false);
               var1.method9687(var2, var1.method9653(var2) / Class9044.method33546(2.0));
            }
         }
      }
   }

   public void method38580(double[] var1, boolean var2) {
      this.method38582(var1, 0, var2);
   }

   public void method38581(Class2381 var1, boolean var2) {
      this.method38583(var1, 0L, var2);
   }

   public void method38582(double[] var1, int var2, boolean var3) {
      if (this.field45760 != 1) {
         if (this.field45773) {
            this.method38583(new Class2381(var1), (long)var2, var3);
         } else if (this.field45770) {
            if (var3) {
               Class7796.method26036(this.field45760, Class9044.method33546(2.0 / (double)this.field45760), var1, var2, false);
               var1[var2] /= Class9044.method33546(2.0);
            }

            Class7796.method25976(this.field45760, var1, var2, this.field45768, this.field45764, this.field45766);
            if (this.field45760 > 4) {
               Class7796.method25920(this.field45760, var1, var2, this.field45762, this.field45766, this.field45764);
               method38586(this.field45760, var1, var2, this.field45768, this.field45764, this.field45766);
            } else if (this.field45760 == 4) {
               Class7796.method25920(this.field45760, var1, var2, this.field45762, this.field45766, this.field45764);
            }

            double var6 = var1[var2] - var1[var2 + 1];
            var1[var2] += var1[var2 + 1];

            for (int var8 = 2; var8 < this.field45760; var8 += 2) {
               var1[var2 + var8 - 1] = var1[var2 + var8] - var1[var2 + var8 + 1];
               var1[var2 + var8] = var1[var2 + var8] + var1[var2 + var8 + 1];
            }

            var1[var2 + this.field45760 - 1] = var6;
         } else {
            int var9 = 2 * this.field45760;
            if (var3) {
               Class7796.method26036(this.field45760, Class9044.method33546((double)var9), var1, var2, false);
               var1[var2] *= Class9044.method33546(2.0);
            }

            double[] var10 = new double[var9];
            int var20 = Class7008.method21726();
            if (var20 > 1 && (long)this.field45760 > Class7796.method25891()) {
               byte var21 = 2;
               int var22 = this.field45760 / var21;
               Future[] var23 = new Future[var21];

               for (int var13 = 0; var13 < var21; var13++) {
                  int var14 = var13 * var22;
                  int var15 = var13 == var21 - 1 ? this.field45760 : var14 + var22;
                  var23[var13] = Class7008.method21729(new Class1451(this, var14, var15, var1, var2, var10));
               }

               try {
                  Class7008.method21730(var23);
               } catch (InterruptedException var18) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var18);
               } catch (ExecutionException var19) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var19);
               }
            } else {
               for (int var11 = 0; var11 < this.field45760; var11++) {
                  int var12 = 2 * var11;
                  double var16 = var1[var2 + var11];
                  var10[var12] = this.field45764[var12] * var16;
                  var10[var12 + 1] = -this.field45764[var12 + 1] * var16;
               }
            }

            this.field45771.method27178(var10, true);
            System.arraycopy(var10, 0, var1, var2, this.field45760);
         }
      }
   }

   public void method38583(Class2381 var1, long var2, boolean var4) {
      if (this.field45761 != 1L) {
         if (!this.field45773) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method38582(var1.method9655(), (int)var2, var4);
         } else if (this.field45770) {
            if (var4) {
               Class7796.method26037(this.field45761, Class9044.method33546(2.0 / (double)this.field45761), var1, var2, false);
               var1.method9687(var2, var1.method9653(var2) / Class9044.method33546(2.0));
            }

            Class7796.method25977(this.field45761, var1, var2, this.field45769, this.field45765, this.field45767);
            if (this.field45761 > 4L) {
               Class7796.method25921(this.field45761, var1, var2, this.field45763, this.field45767, this.field45765);
               method38587(this.field45761, var1, var2, this.field45769, this.field45765, this.field45767);
            } else if (this.field45761 == 4L) {
               Class7796.method25921(this.field45761, var1, var2, this.field45763, this.field45767, this.field45765);
            }

            double var7 = var1.method9653(var2) - var1.method9653(var2 + 1L);
            var1.method9687(var2, var1.method9653(var2) + var1.method9653(var2 + 1L));

            for (long var9 = 2L; var9 < this.field45761; var9 += 2L) {
               var1.method9687(var2 + var9 - 1L, var1.method9653(var2 + var9) - var1.method9653(var2 + var9 + 1L));
               var1.method9687(var2 + var9, var1.method9653(var2 + var9) + var1.method9653(var2 + var9 + 1L));
            }

            var1.method9687(var2 + this.field45761 - 1L, var7);
         } else {
            long var25 = 2L * this.field45761;
            if (var4) {
               Class7796.method26037(this.field45761, Class9044.method33546((double)var25), var1, var2, false);
               var1.method9687(var2, var1.method9653(var2) * Class9044.method33546(2.0));
            }

            Class2381 var11 = new Class2381(var25);
            int var12 = Class7008.method21726();
            if (var12 > 1 && this.field45761 > Class7796.method25891()) {
               byte var26 = 2;
               long var27 = this.field45761 / (long)var26;
               Future[] var15 = new Future[var26];

               for (int var16 = 0; var16 < var26; var16++) {
                  long var28 = (long)var16 * var27;
                  long var19 = var16 == var26 - 1 ? this.field45761 : var28 + var27;
                  var15[var16] = Class7008.method21729(new Class1499(this, var28, var19, var1, var2, var11));
               }

               try {
                  Class7008.method21730(var15);
               } catch (InterruptedException var23) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var23);
               } catch (ExecutionException var24) {
                  Logger.getLogger(Class9788.class.getName()).log(Level.SEVERE, null, var24);
               }
            } else {
               for (long var13 = 0L; var13 < this.field45761; var13++) {
                  long var21 = 2L * var13;
                  double var17 = var1.method9653(var2 + var13);
                  var11.method9687(var21, this.field45765.method9653(var21) * var17);
                  var11.method9687(var21 + 1L, -this.field45765.method9653(var21 + 1L) * var17);
               }
            }

            this.field45771.method27179(var11, true);
            Class8133.method28177(var11, 0L, var1, var2, this.field45761);
         }
      }
   }

   private double[] method38584(int var1) {
      int var4 = 2 * var1;
      double var5 = Math.PI / (double)var4;
      double[] var7 = new double[var4];
      var7[0] = 1.0;

      for (int var8 = 1; var8 < var1; var8++) {
         int var9 = 2 * var8;
         double var10 = var5 * (double)var8;
         var7[var9] = Class9044.method33578(var10);
         var7[var9 + 1] = -Class9044.method33577(var10);
      }

      return var7;
   }

   private Class2381 method38585(long var1) {
      long var5 = 2L * var1;
      double var7 = Math.PI / (double)var5;
      Class2381 var9 = new Class2381(var5);
      var9.method9687(0L, 1.0);

      for (long var10 = 1L; var10 < var1; var10++) {
         long var12 = 2L * var10;
         double var14 = var7 * (double)var10;
         var9.method9687(var12, Class9044.method33578(var14));
         var9.method9687(var12 + 1L, -Class9044.method33577(var14));
      }

      return var9;
   }

   private static void method38586(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
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

   private static void method38587(long var0, Class2381 var2, long var3, long var5, Class2381 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         double var22 = 0.5 - var7.method9653(var8 + var5 - var16);
         double var24 = var7.method9653(var8 + var16);
         long var26 = var3 + var18;
         long var28 = var3 + var20;
         double var30 = var2.method9653(var26) - var2.method9653(var28);
         double var32 = var2.method9653(var26 + 1L) + var2.method9653(var28 + 1L);
         double var34 = var22 * var30 - var24 * var32;
         double var36 = var22 * var32 + var24 * var30;
         var2.method9687(var26, var2.method9653(var26) - var34);
         var2.method9687(var26 + 1L, var2.method9653(var26 + 1L) - var36);
         var2.method9687(var28, var2.method9653(var28) + var34);
         var2.method9687(var28 + 1L, var2.method9653(var28 + 1L) - var36);
      }
   }

   private static void method38588(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
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

   private static void method38589(long var0, Class2381 var2, long var3, long var5, Class2381 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         double var22 = 0.5 - var7.method9653(var8 + var5 - var16);
         double var24 = var7.method9653(var8 + var16);
         long var26 = var3 + var18;
         long var28 = var3 + var20;
         double var30 = var2.method9653(var26) - var2.method9653(var28);
         double var32 = var2.method9653(var26 + 1L) + var2.method9653(var28 + 1L);
         double var34 = var22 * var30 + var24 * var32;
         double var36 = var22 * var32 - var24 * var30;
         var2.method9687(var26, var2.method9653(var26) - var34);
         var2.method9687(var26 + 1L, var2.method9653(var26 + 1L) - var36);
         var2.method9687(var28, var2.method9653(var28) + var34);
         var2.method9687(var28 + 1L, var2.method9653(var28 + 1L) - var36);
      }
   }

   // $VF: synthetic method
   public static double[] method38590(Class9788 var0) {
      return var0.field45764;
   }

   // $VF: synthetic method
   public static Class2381 method38591(Class9788 var0) {
      return var0.field45765;
   }
}
