package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Class7990 {
   private int field34321;
   private long field34322;
   private int field34323;
   private long field34324;
   private int[] field34325;
   private Class2382 field34326;
   private double[] field34327;
   private Class2381 field34328;
   private int field34329;
   private long field34330;
   private int field34331;
   private long field34332;
   private double[] field34333;
   private Class2381 field34334;
   private double[] field34335;
   private Class2381 field34336;
   private double[] field34337;
   private Class2381 field34338;
   private double[] field34339;
   private Class2381 field34340;
   private Class2167 field34341;
   private boolean field34342;
   private static final int[] field34343 = new int[]{4, 2, 3, 5};
   private static final double field34344 = Math.PI;
   private static final double field34345 = Math.PI * 2;

   public Class7990(long var1) {
      if (var1 < 1L) {
         throw new IllegalArgumentException("n must be greater than 0");
      } else {
         this.field34342 = Class7796.method25901() || 2L * var1 > (long)Class2373.method9693();
         this.field34321 = (int)var1;
         this.field34322 = var1;
         if (this.field34342) {
            if (Class7796.method25908(this.field34322)) {
               this.field34341 = Class2167.field14230;
               this.field34326 = new Class2382(
                  2L
                     + (long)Class9044.method33599(
                        (double)(2L + (1L << (int)((long)(Class9044.method33564((double)this.field34322 + 0.5) / Class9044.method33564(2.0)) / 2L)))
                     )
               );
               this.field34328 = new Class2381(this.field34322);
               long var5 = 2L * this.field34322;
               this.field34330 = var5 >> 2;
               Class7796.method25913(this.field34330, this.field34326, this.field34328);
               this.field34332 = this.field34322 >> 2;
               Class7796.method25915(this.field34332, this.field34328, this.field34330, this.field34326);
            } else if (Class7796.method25909(this.field34322, field34343) < 211L) {
               this.field34341 = Class2167.field14231;
               this.field34334 = new Class2381(4L * this.field34322 + 15L);
               this.field34336 = new Class2381(2L * this.field34322 + 15L);
               this.method27190();
               this.method27192();
            } else {
               this.field34341 = Class2167.field14232;
               this.field34324 = Class7796.method25904(this.field34322 * 2L - 1L);
               this.field34338 = new Class2381(2L * this.field34324);
               this.field34340 = new Class2381(2L * this.field34324);
               this.field34326 = new Class2382(
                  2L
                     + (long)Class9044.method33599(
                        (double)(2L + (1L << (int)((long)(Class9044.method33564((double)this.field34324 + 0.5) / Class9044.method33564(2.0)) / 2L)))
                     )
               );
               this.field34328 = new Class2381(this.field34324);
               long var8 = 2L * this.field34324;
               this.field34330 = var8 >> 2;
               Class7796.method25913(this.field34330, this.field34326, this.field34328);
               this.field34332 = this.field34324 >> 2;
               Class7796.method25915(this.field34332, this.field34328, this.field34330, this.field34326);
               this.method27194();
            }
         } else if (Class7796.method25908(var1)) {
            this.field34341 = Class2167.field14230;
            this.field34325 = new int[2
               + (int)Class9044.method33599((double)(2 + (1 << (int)(Class9044.method33564((double)var1 + 0.5) / Class9044.method33564(2.0)) / 2)))];
            this.field34327 = new double[this.field34321];
            int var7 = 2 * this.field34321;
            this.field34329 = var7 >> 2;
            Class7796.method25912(this.field34329, this.field34325, this.field34327);
            this.field34331 = this.field34321 >> 2;
            Class7796.method25914(this.field34331, this.field34327, this.field34329, this.field34325);
         } else if (Class7796.method25909(var1, field34343) < 211L) {
            this.field34341 = Class2167.field14231;
            this.field34333 = new double[4 * this.field34321 + 15];
            this.field34335 = new double[2 * this.field34321 + 15];
            this.method27189();
            this.method27191();
         } else {
            this.field34341 = Class2167.field14232;
            this.field34323 = Class7796.method25903(this.field34321 * 2 - 1);
            this.field34337 = new double[2 * this.field34323];
            this.field34339 = new double[2 * this.field34323];
            this.field34325 = new int[2
               + (int)Class9044.method33599((double)(2 + (1 << (int)(Class9044.method33564((double)this.field34323 + 0.5) / Class9044.method33564(2.0)) / 2)))];
            this.field34327 = new double[this.field34323];
            int var9 = 2 * this.field34323;
            this.field34329 = var9 >> 2;
            Class7796.method25912(this.field34329, this.field34325, this.field34327);
            this.field34331 = this.field34323 >> 2;
            Class7796.method25914(this.field34331, this.field34327, this.field34329, this.field34325);
            this.method27193();
         }
      }
   }

   public void method27162(double[] var1) {
      this.method27164(var1, 0);
   }

   public void method27163(Class2381 var1) {
      this.method27165(var1, 0L);
   }

   public void method27164(double[] var1, int var2) {
      if (this.field34342) {
         this.method27165(new Class2381(var1), (long)var2);
      } else {
         if (this.field34321 == 1) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               Class7796.method25922(2 * this.field34321, var1, var2, this.field34325, this.field34329, this.field34327);
               break;
            case 2:
               this.method27229(var1, var2, -1);
               break;
            case 3:
               this.method27195(var1, var2, -1);
         }
      }
   }

   public void method27165(Class2381 var1, long var2) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27164(var1.method9655(), (int)var2);
      } else {
         if (this.field34322 == 1L) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               Class7796.method25923(2L * this.field34322, var1, var2, this.field34326, this.field34330, this.field34328);
               break;
            case 2:
               this.method27230(var1, var2, -1);
               break;
            case 3:
               this.method27196(var1, var2, -1);
         }
      }
   }

   public void method27166(double[] var1, boolean var2) {
      this.method27168(var1, 0, var2);
   }

   public void method27167(Class2381 var1, boolean var2) {
      this.method27169(var1, 0L, var2);
   }

   public void method27168(double[] var1, int var2, boolean var3) {
      if (this.field34342) {
         this.method27169(new Class2381(var1), (long)var2, var3);
      } else {
         if (this.field34321 == 1) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               Class7796.method25920(2 * this.field34321, var1, var2, this.field34325, this.field34329, this.field34327);
               break;
            case 2:
               this.method27229(var1, var2, 1);
               break;
            case 3:
               this.method27195(var1, var2, 1);
         }

         if (var3) {
            Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, true);
         }
      }
   }

   public void method27169(Class2381 var1, long var2, boolean var4) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27168(var1.method9655(), (int)var2, var4);
      } else {
         if (this.field34322 == 1L) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               Class7796.method25921(2L * this.field34322, var1, var2, this.field34326, this.field34330, this.field34328);
               break;
            case 2:
               this.method27230(var1, var2, 1);
               break;
            case 3:
               this.method27196(var1, var2, 1);
         }

         if (var4) {
            Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, true);
         }
      }
   }

   public void method27170(double[] var1) {
      this.method27172(var1, 0);
   }

   public void method27171(Class2381 var1) {
      this.method27173(var1, 0L);
   }

   public void method27172(double[] var1, int var2) {
      if (this.field34342) {
         this.method27173(new Class2381(var1), (long)var2);
      } else {
         if (this.field34321 == 1) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               if (this.field34321 > 4) {
                  Class7796.method25920(this.field34321, var1, var2, this.field34325, this.field34329, this.field34327);
                  Class7796.method25972(this.field34321, var1, var2, this.field34331, this.field34327, this.field34329);
               } else if (this.field34321 == 4) {
                  Class7796.method25966(var1, var2);
               }

               double var5 = var1[var2] - var1[var2 + 1];
               var1[var2] += var1[var2 + 1];
               var1[var2 + 1] = var5;
               break;
            case 2:
               this.method27205(var1, var2);

               for (int var7 = this.field34321 - 1; var7 >= 2; var7--) {
                  int var8 = var2 + var7;
                  double var9 = var1[var8];
                  var1[var8] = var1[var8 - 1];
                  var1[var8 - 1] = var9;
               }
               break;
            case 3:
               this.method27199(var1, var2);
         }
      }
   }

   public void method27173(Class2381 var1, long var2) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27172(var1.method9655(), (int)var2);
      } else {
         if (this.field34322 == 1L) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               if (this.field34322 > 4L) {
                  Class7796.method25921(this.field34322, var1, var2, this.field34326, this.field34330, this.field34328);
                  Class7796.method25973(this.field34322, var1, var2, this.field34332, this.field34328, this.field34330);
               } else if (this.field34322 == 4L) {
                  Class7796.method25967(var1, var2);
               }

               double var6 = var1.method9653(var2) - var1.method9653(var2 + 1L);
               var1.method9687(var2, var1.method9653(var2) + var1.method9653(var2 + 1L));
               var1.method9687(var2 + 1L, var6);
               break;
            case 2:
               this.method27206(var1, var2);

               for (long var8 = this.field34322 - 1L; var8 >= 2L; var8--) {
                  long var10 = var2 + var8;
                  double var12 = var1.method9653(var10);
                  var1.method9687(var10, var1.method9653(var10 - 1L));
                  var1.method9687(var10 - 1L, var12);
               }
               break;
            case 3:
               this.method27200(var1, var2);
         }
      }
   }

   public void method27174(double[] var1) {
      this.method27176(var1, 0);
   }

   public void method27175(Class2381 var1) {
      this.method27177(var1, 0L);
   }

   public void method27176(double[] var1, int var2) {
      if (this.field34342) {
         this.method27177(new Class2381(var1), (long)var2);
      } else {
         int var5 = 2 * this.field34321;
         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               this.method27172(var1, var2);
               int var6 = Class7008.method21726();
               if (var6 > 1 && (long)(this.field34321 / 2) > Class7796.method25891()) {
                  Future[] var17 = new Future[var6];
                  int var20 = this.field34321 / 2 / var6;

                  for (int var23 = 0; var23 < var6; var23++) {
                     int var24 = var23 * var20;
                     int var11 = var23 == var6 - 1 ? this.field34321 / 2 : var24 + var20;
                     var17[var23] = Class7008.method21729(new Class487(this, var24, var11, var2, var5, var1));
                  }

                  try {
                     Class7008.method21730(var17);
                  } catch (InterruptedException var14) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var14);
                  } catch (ExecutionException var15) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var15);
                  }
               } else {
                  for (int var22 = 0; var22 < this.field34321 / 2; var22++) {
                     int var16 = 2 * var22;
                     int var19 = var2 + (var5 - var16) % var5;
                     var1[var19] = var1[var2 + var16];
                     var1[var19 + 1] = -var1[var2 + var16 + 1];
                  }
               }

               var1[var2 + this.field34321] = -var1[var2 + 1];
               var1[var2 + 1] = 0.0;
               break;
            case 2:
               this.method27205(var1, var2);
               int var7;
               if (this.field34321 % 2 == 0) {
                  var7 = this.field34321 / 2;
               } else {
                  var7 = (this.field34321 + 1) / 2;
               }

               for (int var8 = 1; var8 < var7; var8++) {
                  int var9 = var2 + var5 - 2 * var8;
                  int var10 = var2 + 2 * var8;
                  var1[var9 + 1] = -var1[var10];
                  var1[var9] = var1[var10 - 1];
               }

               for (int var18 = 1; var18 < this.field34321; var18++) {
                  int var21 = var2 + this.field34321 - var18;
                  double var12 = var1[var21 + 1];
                  var1[var21 + 1] = var1[var21];
                  var1[var21] = var12;
               }

               var1[var2 + 1] = 0.0;
               break;
            case 3:
               this.method27197(var1, var2, -1);
         }
      }
   }

   public void method27177(Class2381 var1, long var2) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27176(var1.method9655(), (int)var2);
      } else {
         long var6 = 2L * this.field34322;
         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               this.method27173(var1, var2);
               int var8 = Class7008.method21726();
               if (var8 > 1 && this.field34322 / 2L > Class7796.method25891()) {
                  Future[] var9 = new Future[var8];
                  long var10 = this.field34322 / 2L / (long)var8;

                  for (int var12 = 0; var12 < var8; var12++) {
                     long var25 = (long)var12 * var10;
                     long var27 = var12 == var8 - 1 ? this.field34322 / 2L : var25 + var10;
                     var9[var12] = Class7008.method21729(new Class1409(this, var25, var27, var2, var6, var1));
                  }

                  try {
                     Class7008.method21730(var9);
                  } catch (InterruptedException var21) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var21);
                  } catch (ExecutionException var22) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var22);
                  }
               } else {
                  for (long var24 = 0L; var24 < this.field34322 / 2L; var24++) {
                     long var28 = 2L * var24;
                     long var30 = var2 + (var6 - var28) % var6;
                     var1.method9687(var30, var1.method9653(var2 + var28));
                     var1.method9687(var30 + 1L, -var1.method9653(var2 + var28 + 1L));
                  }
               }

               var1.method9687(var2 + this.field34322, -var1.method9653(var2 + 1L));
               var1.method9687(var2 + 1L, 0.0);
               break;
            case 2:
               this.method27206(var1, var2);
               long var17;
               if (this.field34322 % 2L == 0L) {
                  var17 = this.field34322 / 2L;
               } else {
                  var17 = (this.field34322 + 1L) / 2L;
               }

               for (long var19 = 1L; var19 < var17; var19++) {
                  long var13 = var2 + var6 - 2L * var19;
                  long var15 = var2 + 2L * var19;
                  var1.method9687(var13 + 1L, -var1.method9653(var15));
                  var1.method9687(var13, var1.method9653(var15 - 1L));
               }

               for (long var29 = 1L; var29 < this.field34322; var29++) {
                  long var23 = var2 + this.field34322 - var29;
                  double var26 = var1.method9653(var23 + 1L);
                  var1.method9687(var23 + 1L, var1.method9653(var23));
                  var1.method9687(var23, var26);
               }

               var1.method9687(var2 + 1L, 0.0);
               break;
            case 3:
               this.method27198(var1, var2, -1L);
         }
      }
   }

   public void method27178(double[] var1, boolean var2) {
      this.method27180(var1, 0, var2);
   }

   public void method27179(Class2381 var1, boolean var2) {
      this.method27181(var1, 0L, var2);
   }

   public void method27180(double[] var1, int var2, boolean var3) {
      if (this.field34342) {
         this.method27181(new Class2381(var1), (long)var2, var3);
      } else {
         if (this.field34321 == 1) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               var1[var2 + 1] = 0.5 * (var1[var2] - var1[var2 + 1]);
               var1[var2] -= var1[var2 + 1];
               if (this.field34321 > 4) {
                  Class7796.method25972(this.field34321, var1, var2, this.field34331, this.field34327, this.field34329);
                  Class7796.method25922(this.field34321, var1, var2, this.field34325, this.field34329, this.field34327);
               } else if (this.field34321 == 4) {
                  Class7796.method25970(var1, var2);
               }

               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / ((double)this.field34321 / 2.0), var1, var2, false);
               }
               break;
            case 2:
               for (int var6 = 2; var6 < this.field34321; var6++) {
                  int var7 = var2 + var6;
                  double var8 = var1[var7 - 1];
                  var1[var7 - 1] = var1[var7];
                  var1[var7] = var8;
               }

               this.method27207(var1, var2);
               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, false);
               }
               break;
            case 3:
               this.method27201(var1, var2);
               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, false);
               }
         }
      }
   }

   public void method27181(Class2381 var1, long var2, boolean var4) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27180(var1.method9655(), (int)var2, var4);
      } else {
         if (this.field34322 == 1L) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               var1.method9687(var2 + 1L, 0.5 * (var1.method9653(var2) - var1.method9653(var2 + 1L)));
               var1.method9687(var2, var1.method9653(var2) - var1.method9653(var2 + 1L));
               if (this.field34322 > 4L) {
                  Class7796.method25973(this.field34322, var1, var2, this.field34332, this.field34328, this.field34330);
                  Class7796.method25923(this.field34322, var1, var2, this.field34326, this.field34330, this.field34328);
               } else if (this.field34322 == 4L) {
                  Class7796.method25971(var1, var2);
               }

               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / ((double)this.field34322 / 2.0), var1, var2, false);
               }
               break;
            case 2:
               for (long var7 = 2L; var7 < this.field34322; var7++) {
                  long var9 = var2 + var7;
                  double var11 = var1.method9653(var9 - 1L);
                  var1.method9687(var9 - 1L, var1.method9653(var9));
                  var1.method9687(var9, var11);
               }

               this.method27208(var1, var2);
               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, false);
               }
               break;
            case 3:
               this.method27202(var1, var2);
               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, false);
               }
         }
      }
   }

   public void method27182(double[] var1, boolean var2) {
      this.method27184(var1, 0, var2);
   }

   public void method27183(Class2381 var1, boolean var2) {
      this.method27185(var1, 0L, var2);
   }

   public void method27184(double[] var1, int var2, boolean var3) {
      if (this.field34342) {
         this.method27185(new Class2381(var1), (long)var2, var3);
      } else {
         int var6 = 2 * this.field34321;
         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               this.method27186(var1, var2, var3);
               int var7 = Class7008.method21726();
               if (var7 > 1 && (long)(this.field34321 / 2) > Class7796.method25891()) {
                  Future[] var18 = new Future[var7];
                  int var21 = this.field34321 / 2 / var7;

                  for (int var24 = 0; var24 < var7; var24++) {
                     int var25 = var24 * var21;
                     int var12 = var24 == var7 - 1 ? this.field34321 / 2 : var25 + var21;
                     var18[var24] = Class7008.method21729(new Class398(this, var25, var12, var2, var6, var1));
                  }

                  try {
                     Class7008.method21730(var18);
                  } catch (InterruptedException var15) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var15);
                  } catch (ExecutionException var16) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var16);
                  }
               } else {
                  for (int var23 = 0; var23 < this.field34321 / 2; var23++) {
                     int var17 = 2 * var23;
                     int var20 = var2 + (var6 - var17) % var6;
                     var1[var20] = var1[var2 + var17];
                     var1[var20 + 1] = -var1[var2 + var17 + 1];
                  }
               }

               var1[var2 + this.field34321] = -var1[var2 + 1];
               var1[var2 + 1] = 0.0;
               break;
            case 2:
               this.method27205(var1, var2);
               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, false);
               }

               int var8;
               if (this.field34321 % 2 == 0) {
                  var8 = this.field34321 / 2;
               } else {
                  var8 = (this.field34321 + 1) / 2;
               }

               for (int var9 = 1; var9 < var8; var9++) {
                  int var10 = var2 + 2 * var9;
                  int var11 = var2 + var6 - 2 * var9;
                  var1[var10] = -var1[var10];
                  var1[var11 + 1] = -var1[var10];
                  var1[var11] = var1[var10 - 1];
               }

               for (int var19 = 1; var19 < this.field34321; var19++) {
                  int var22 = var2 + this.field34321 - var19;
                  double var13 = var1[var22 + 1];
                  var1[var22 + 1] = var1[var22];
                  var1[var22] = var13;
               }

               var1[var2 + 1] = 0.0;
               break;
            case 3:
               this.method27197(var1, var2, 1);
               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, true);
               }
         }
      }
   }

   public void method27185(Class2381 var1, long var2, boolean var4) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27184(var1.method9655(), (int)var2, var4);
      } else {
         long var7 = 2L * this.field34322;
         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               this.method27187(var1, var2, var4);
               int var9 = Class7008.method21726();
               if (var9 > 1 && this.field34322 / 2L > Class7796.method25891()) {
                  Future[] var10 = new Future[var9];
                  long var11 = this.field34322 / 2L / (long)var9;

                  for (int var13 = 0; var13 < var9; var13++) {
                     long var26 = (long)var13 * var11;
                     long var28 = var13 == var9 - 1 ? this.field34322 / 2L : var26 + var11;
                     var10[var13] = Class7008.method21729(new Class685(this, var26, var28, var2, var7, var1));
                  }

                  try {
                     Class7008.method21730(var10);
                  } catch (InterruptedException var22) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var22);
                  } catch (ExecutionException var23) {
                     Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var23);
                  }
               } else {
                  for (long var25 = 0L; var25 < this.field34322 / 2L; var25++) {
                     long var29 = 2L * var25;
                     long var31 = var2 + (var7 - var29) % var7;
                     var1.method9687(var31, var1.method9653(var2 + var29));
                     var1.method9687(var31 + 1L, -var1.method9653(var2 + var29 + 1L));
                  }
               }

               var1.method9687(var2 + this.field34322, -var1.method9653(var2 + 1L));
               var1.method9687(var2 + 1L, 0.0);
               break;
            case 2:
               this.method27206(var1, var2);
               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, false);
               }

               long var18;
               if (this.field34322 % 2L == 0L) {
                  var18 = this.field34322 / 2L;
               } else {
                  var18 = (this.field34322 + 1L) / 2L;
               }

               for (long var20 = 1L; var20 < var18; var20++) {
                  long var14 = var2 + 2L * var20;
                  long var16 = var2 + var7 - 2L * var20;
                  var1.method9687(var14, -var1.method9653(var14));
                  var1.method9687(var16 + 1L, -var1.method9653(var14));
                  var1.method9687(var16, var1.method9653(var14 - 1L));
               }

               for (long var30 = 1L; var30 < this.field34322; var30++) {
                  long var24 = var2 + this.field34322 - var30;
                  double var27 = var1.method9653(var24 + 1L);
                  var1.method9687(var24 + 1L, var1.method9653(var24));
                  var1.method9687(var24, var27);
               }

               var1.method9687(var2 + 1L, 0.0);
               break;
            case 3:
               this.method27198(var1, var2, 1L);
               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, true);
               }
         }
      }
   }

   public void method27186(double[] var1, int var2, boolean var3) {
      if (this.field34342) {
         this.method27187(new Class2381(var1), (long)var2, var3);
      } else {
         if (this.field34321 == 1) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               if (this.field34321 > 4) {
                  Class7796.method25920(this.field34321, var1, var2, this.field34325, this.field34329, this.field34327);
                  Class7796.method25974(this.field34321, var1, var2, this.field34331, this.field34327, this.field34329);
               } else if (this.field34321 == 4) {
                  Class7796.method25922(this.field34321, var1, var2, this.field34325, this.field34329, this.field34327);
               }

               double var6 = var1[var2] - var1[var2 + 1];
               var1[var2] += var1[var2 + 1];
               var1[var2 + 1] = var6;
               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, false);
               }
               break;
            case 2:
               this.method27205(var1, var2);

               for (int var8 = this.field34321 - 1; var8 >= 2; var8--) {
                  int var9 = var2 + var8;
                  double var10 = var1[var9];
                  var1[var9] = var1[var9 - 1];
                  var1[var9 - 1] = var10;
               }

               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, false);
               }

               if (this.field34321 % 2 == 0) {
                  int var13 = this.field34321 / 2;

                  for (int var15 = 1; var15 < var13; var15++) {
                     int var12 = var2 + 2 * var15 + 1;
                     var1[var12] = -var1[var12];
                  }
               } else {
                  int var14 = (this.field34321 - 1) / 2;

                  for (int var16 = 0; var16 < var14; var16++) {
                     int var17 = var2 + 2 * var16 + 1;
                     var1[var17] = -var1[var17];
                  }
               }
               break;
            case 3:
               this.method27203(var1, var2);
               if (var3) {
                  Class7796.method26036(this.field34321, 1.0 / (double)this.field34321, var1, var2, false);
               }
         }
      }
   }

   public void method27187(Class2381 var1, long var2, boolean var4) {
      if (!this.field34342) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method27186(var1.method9655(), (int)var2, var4);
      } else {
         if (this.field34322 == 1L) {
            return;
         }

         switch (Class9249.field42554[this.field34341.ordinal()]) {
            case 1:
               if (this.field34322 > 4L) {
                  Class7796.method25921(this.field34322, var1, var2, this.field34326, this.field34330, this.field34328);
                  Class7796.method25975(this.field34322, var1, var2, this.field34332, this.field34328, this.field34330);
               } else if (this.field34322 == 4L) {
                  Class7796.method25923(this.field34322, var1, var2, this.field34326, this.field34330, this.field34328);
               }

               double var7 = var1.method9653(var2) - var1.method9653(var2 + 1L);
               var1.method9687(var2, var1.method9653(var2) + var1.method9653(var2 + 1L));
               var1.method9687(var2 + 1L, var7);
               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, false);
               }
               break;
            case 2:
               this.method27206(var1, var2);

               for (long var9 = this.field34322 - 1L; var9 >= 2L; var9--) {
                  long var11 = var2 + var9;
                  double var13 = var1.method9653(var11);
                  var1.method9687(var11, var1.method9653(var11 - 1L));
                  var1.method9687(var11 - 1L, var13);
               }

               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, false);
               }

               if (this.field34322 % 2L == 0L) {
                  long var15 = this.field34322 / 2L;

                  for (long var17 = 1L; var17 < var15; var17++) {
                     long var19 = var2 + 2L * var17 + 1L;
                     var1.method9687(var19, -var1.method9653(var19));
                  }
               } else {
                  long var16 = (this.field34322 - 1L) / 2L;

                  for (long var18 = 0L; var18 < var16; var18++) {
                     long var20 = var2 + 2L * var18 + 1L;
                     var1.method9687(var20, -var1.method9653(var20));
                  }
               }
               break;
            case 3:
               this.method27204(var1, var2);
               if (var4) {
                  Class7796.method26037(this.field34322, 1.0 / (double)this.field34322, var1, var2, false);
               }
         }
      }
   }

   public void method27188(int var1, int var2) {
      if (var1 != 1) {
         int var5 = 2 * var1;
         int var6 = 4 * var1;
         int var7 = 0;
         int var8 = var1;
         int var9 = 0;
         int var10 = 0;

         label84:
         while (true) {
            if (++var10 > 4) {
               var7 += 2;
            } else {
               var7 = field34343[var10 - 1];
            }

            int var11;
            do {
               var11 = var8 / var7;
               int var12 = var8 - var7 * var11;
               if (var12 != 0) {
                  continue label84;
               }

               var9++;
               this.field34333[var2 + var9 + 1 + var6] = (double)var7;
               var8 = var11;
               if (var7 == 2 && var9 != 1) {
                  for (int var13 = 2; var13 <= var9; var13++) {
                     int var14 = var9 - var13 + 2;
                     int var15 = var14 + var6;
                     this.field34333[var2 + var15 + 1] = this.field34333[var2 + var15];
                  }

                  this.field34333[var2 + 2 + var6] = 2.0;
               }
            } while (var11 != 1);

            this.field34333[var2 + var6] = (double)var1;
            this.field34333[var2 + 1 + var6] = (double)var9;
            double var16 = (Math.PI * 2) / (double)var1;
            byte var36 = 1;
            int var18 = 1;

            for (int var19 = 1; var19 <= var9; var19++) {
               int var20 = (int)this.field34333[var2 + var19 + 1 + var6];
               int var21 = 0;
               int var22 = var18 * var20;
               int var23 = var1 / var22;
               int var24 = var23 + var23 + 2;
               int var25 = var20 - 1;

               for (int var35 = 1; var35 <= var25; var35++) {
                  byte var26 = var36;
                  this.field34333[var2 + var36 - 1 + var5] = 1.0;
                  this.field34333[var2 + var36 + var5] = 0.0;
                  var21 += var18;
                  double var27 = 0.0;
                  double var29 = (double)var21 * var16;

                  for (int var31 = 4; var31 <= var24; var31 += 2) {
                     var36 += 2;
                     double var32 = ++var27 * var29;
                     int var37 = var36 + var5;
                     this.field34333[var2 + var37 - 1] = Class9044.method33578(var32);
                     this.field34333[var2 + var37] = Class9044.method33577(var32);
                  }

                  if (var20 > 5) {
                     int var38 = var26 + var5;
                     int var34 = var36 + var5;
                     this.field34333[var2 + var38 - 1] = this.field34333[var2 + var34 - 1];
                     this.field34333[var2 + var38] = this.field34333[var2 + var34];
                  }
               }

               var18 = var22;
            }

            return;
         }
      }
   }

   public final void method27189() {
      if (this.field34321 != 1) {
         int var3 = 2 * this.field34321;
         int var4 = 4 * this.field34321;
         int var5 = 0;
         int var6 = this.field34321;
         int var7 = 0;
         int var8 = 0;

         label84:
         while (true) {
            if (++var8 > 4) {
               var5 += 2;
            } else {
               var5 = field34343[var8 - 1];
            }

            int var9;
            do {
               var9 = var6 / var5;
               int var10 = var6 - var5 * var9;
               if (var10 != 0) {
                  continue label84;
               }

               var7++;
               this.field34333[var7 + 1 + var4] = (double)var5;
               var6 = var9;
               if (var5 == 2 && var7 != 1) {
                  for (int var11 = 2; var11 <= var7; var11++) {
                     int var12 = var7 - var11 + 2;
                     int var13 = var12 + var4;
                     this.field34333[var13 + 1] = this.field34333[var13];
                  }

                  this.field34333[2 + var4] = 2.0;
               }
            } while (var9 != 1);

            this.field34333[var4] = (double)this.field34321;
            this.field34333[1 + var4] = (double)var7;
            double var14 = (Math.PI * 2) / (double)this.field34321;
            byte var34 = 1;
            int var16 = 1;

            for (int var17 = 1; var17 <= var7; var17++) {
               int var18 = (int)this.field34333[var17 + 1 + var4];
               int var19 = 0;
               int var20 = var16 * var18;
               int var21 = this.field34321 / var20;
               int var22 = var21 + var21 + 2;
               int var23 = var18 - 1;

               for (int var33 = 1; var33 <= var23; var33++) {
                  byte var24 = var34;
                  this.field34333[var34 - 1 + var3] = 1.0;
                  this.field34333[var34 + var3] = 0.0;
                  var19 += var16;
                  double var25 = 0.0;
                  double var27 = (double)var19 * var14;

                  for (int var29 = 4; var29 <= var22; var29 += 2) {
                     var34 += 2;
                     double var30 = ++var25 * var27;
                     int var35 = var34 + var3;
                     this.field34333[var35 - 1] = Class9044.method33578(var30);
                     this.field34333[var35] = Class9044.method33577(var30);
                  }

                  if (var18 > 5) {
                     int var36 = var24 + var3;
                     int var32 = var34 + var3;
                     this.field34333[var36 - 1] = this.field34333[var32 - 1];
                     this.field34333[var36] = this.field34333[var32];
                  }
               }

               var16 = var20;
            }

            return;
         }
      }
   }

   public final void method27190() {
      if (this.field34322 != 1L) {
         long var3 = 2L * this.field34322;
         long var5 = 4L * this.field34322;
         long var7 = 0L;
         long var9 = this.field34322;
         long var11 = 0L;
         long var13 = 0L;

         label84:
         while (true) {
            if (++var13 > 4L) {
               var7 += 2L;
            } else {
               var7 = (long)field34343[(int)(var13 - 1L)];
            }

            long var15;
            do {
               var15 = var9 / var7;
               long var17 = var9 - var7 * var15;
               if (var17 != 0L) {
                  continue label84;
               }

               this.field34334.method9687(++var11 + 1L + var5, (double)var7);
               var9 = var15;
               if (var7 == 2L && var11 != 1L) {
                  for (long var19 = 2L; var19 <= var11; var19++) {
                     long var21 = var11 - var19 + 2L;
                     long var23 = var21 + var5;
                     this.field34334.method9687(var23 + 1L, this.field34334.method9653(var23));
                  }

                  this.field34334.method9687(2L + var5, 2.0);
               }
            } while (var15 != 1L);

            this.field34334.method9687(var5, (double)this.field34322);
            this.field34334.method9687(1L + var5, (double)var11);
            double var25 = (Math.PI * 2) / (double)this.field34322;
            long var56 = 1L;
            long var27 = 1L;

            for (long var29 = 1L; var29 <= var11; var29++) {
               long var31 = (long)this.field34334.method9653(var29 + 1L + var5);
               long var33 = 0L;
               long var35 = var27 * var31;
               long var37 = this.field34322 / var35;
               long var39 = var37 + var37 + 2L;
               long var41 = var31 - 1L;

               for (long var55 = 1L; var55 <= var41; var55++) {
                  long var43 = var56;
                  this.field34334.method9687(var56 - 1L + var3, 1.0);
                  this.field34334.method9687(var56 + var3, 0.0);
                  var33 += var27;
                  double var45 = 0.0;
                  double var47 = (double)var33 * var25;

                  for (long var49 = 4L; var49 <= var39; var49 += 2L) {
                     var56 += 2L;
                     double var51 = ++var45 * var47;
                     long var57 = var56 + var3;
                     this.field34334.method9687(var57 - 1L, Class9044.method33578(var51));
                     this.field34334.method9687(var57, Class9044.method33577(var51));
                  }

                  if (var31 > 5L) {
                     long var58 = var43 + var3;
                     long var53 = var56 + var3;
                     this.field34334.method9687(var58 - 1L, this.field34334.method9653(var53 - 1L));
                     this.field34334.method9687(var58, this.field34334.method9653(var53));
                  }
               }

               var27 = var35;
            }

            return;
         }
      }
   }

   public void method27191() {
      if (this.field34321 != 1) {
         int var3 = 2 * this.field34321;
         int var4 = 0;
         int var5 = this.field34321;
         int var6 = 0;
         int var7 = 0;

         label85:
         while (true) {
            if (++var7 > 4) {
               var4 += 2;
            } else {
               var4 = field34343[var7 - 1];
            }

            int var8;
            do {
               var8 = var5 / var4;
               int var9 = var5 - var4 * var8;
               if (var9 != 0) {
                  continue label85;
               }

               var6++;
               this.field34335[var6 + 1 + var3] = (double)var4;
               var5 = var8;
               if (var4 == 2 && var6 != 1) {
                  for (int var10 = 2; var10 <= var6; var10++) {
                     int var11 = var6 - var10 + 2;
                     int var12 = var11 + var3;
                     this.field34335[var12 + 1] = this.field34335[var12];
                  }

                  this.field34335[2 + var3] = 2.0;
               }
            } while (var8 != 1);

            this.field34335[var3] = (double)this.field34321;
            this.field34335[1 + var3] = (double)var6;
            double var13 = (Math.PI * 2) / (double)this.field34321;
            int var15 = 0;
            int var16 = var6 - 1;
            int var17 = 1;
            if (var16 == 0) {
               return;
            }

            for (int var18 = 1; var18 <= var16; var18++) {
               int var19 = (int)this.field34335[var18 + 1 + var3];
               int var20 = 0;
               int var21 = var17 * var19;
               int var22 = this.field34321 / var21;
               int var23 = var19 - 1;

               for (int var31 = 1; var31 <= var23; var31++) {
                  var20 += var17;
                  int var32 = var15;
                  double var24 = (double)var20 * var13;
                  double var26 = 0.0;

                  for (int var28 = 3; var28 <= var22; var28 += 2) {
                     var32 += 2;
                     double var29 = ++var26 * var24;
                     int var33 = var32 + this.field34321;
                     this.field34335[var33 - 2] = Class9044.method33578(var29);
                     this.field34335[var33 - 1] = Class9044.method33577(var29);
                  }

                  var15 += var22;
               }

               var17 = var21;
            }

            return;
         }
      }
   }

   public void method27192() {
      if (this.field34322 != 1L) {
         long var3 = 2L * this.field34322;
         long var5 = 0L;
         long var7 = this.field34322;
         long var9 = 0L;
         long var11 = 0L;

         label85:
         while (true) {
            if (++var11 > 4L) {
               var5 += 2L;
            } else {
               var5 = (long)field34343[(int)(var11 - 1L)];
            }

            long var13;
            do {
               var13 = var7 / var5;
               long var15 = var7 - var5 * var13;
               if (var15 != 0L) {
                  continue label85;
               }

               this.field34336.method9687(++var9 + 1L + var3, (double)var5);
               var7 = var13;
               if (var5 == 2L && var9 != 1L) {
                  for (long var17 = 2L; var17 <= var9; var17++) {
                     long var19 = var9 - var17 + 2L;
                     long var21 = var19 + var3;
                     this.field34336.method9687(var21 + 1L, this.field34336.method9653(var21));
                  }

                  this.field34336.method9687(2L + var3, 2.0);
               }
            } while (var13 != 1L);

            this.field34336.method9687(var3, (double)this.field34322);
            this.field34336.method9687(1L + var3, (double)var9);
            double var23 = (Math.PI * 2) / (double)this.field34322;
            long var25 = 0L;
            long var27 = var9 - 1L;
            long var29 = 1L;
            if (var27 == 0L) {
               return;
            }

            for (long var31 = 1L; var31 <= var27; var31++) {
               long var33 = (long)this.field34336.method9653(var31 + 1L + var3);
               long var35 = 0L;
               long var37 = var29 * var33;
               long var39 = this.field34322 / var37;
               long var41 = var33 - 1L;

               for (long var51 = 1L; var51 <= var41; var51++) {
                  var35 += var29;
                  long var52 = var25;
                  double var43 = (double)var35 * var23;
                  double var45 = 0.0;

                  for (long var47 = 3L; var47 <= var39; var47 += 2L) {
                     var52 += 2L;
                     double var49 = ++var45 * var43;
                     long var53 = var52 + this.field34322;
                     this.field34336.method9687(var53 - 2L, Class9044.method33578(var49));
                     this.field34336.method9687(var53 - 1L, Class9044.method33577(var49));
                  }

                  var25 += var39;
               }

               var29 = var37;
            }

            return;
         }
      }
   }

   private void method27193() {
      int var3 = 0;
      double var4 = Math.PI / (double)this.field34321;
      this.field34337[0] = 1.0;
      this.field34337[1] = 0.0;

      for (int var6 = 1; var6 < this.field34321; var6++) {
         var3 += 2 * var6 - 1;
         if (var3 >= 2 * this.field34321) {
            var3 -= 2 * this.field34321;
         }

         double var10 = var4 * (double)var3;
         this.field34337[2 * var6] = Class9044.method33578(var10);
         this.field34337[2 * var6 + 1] = Class9044.method33577(var10);
      }

      double var7 = 1.0 / (double)this.field34323;
      this.field34339[0] = this.field34337[0] * var7;
      this.field34339[1] = this.field34337[1] * var7;

      for (int var9 = 2; var9 < 2 * this.field34321; var9 += 2) {
         this.field34339[var9] = this.field34337[var9] * var7;
         this.field34339[var9 + 1] = this.field34337[var9 + 1] * var7;
         this.field34339[2 * this.field34323 - var9] = this.field34339[var9];
         this.field34339[2 * this.field34323 - var9 + 1] = this.field34339[var9 + 1];
      }

      Class7796.method25922(2 * this.field34323, this.field34339, 0, this.field34325, this.field34329, this.field34327);
   }

   private void method27194() {
      long var3 = 0L;
      double var5 = Math.PI / (double)this.field34322;
      this.field34338.method9687(0L, 1.0);
      this.field34338.method9687(1L, 0.0);

      for (int var7 = 1; (long)var7 < this.field34322; var7++) {
         var3 += (long)(2 * var7 - 1);
         if (var3 >= 2L * this.field34322) {
            var3 -= 2L * this.field34322;
         }

         double var11 = var5 * (double)var3;
         this.field34338.method9687((long)(2 * var7), Class9044.method33578(var11));
         this.field34338.method9687((long)(2 * var7 + 1), Class9044.method33577(var11));
      }

      double var8 = 1.0 / (double)this.field34324;
      this.field34340.method9687(0L, this.field34338.method9653(0L) * var8);
      this.field34340.method9687(1L, this.field34338.method9653(1L) * var8);

      for (int var10 = 2; (long)var10 < 2L * this.field34322; var10 += 2) {
         this.field34340.method9687((long)var10, this.field34338.method9653((long)var10) * var8);
         this.field34340.method9687((long)(var10 + 1), this.field34338.method9653((long)(var10 + 1)) * var8);
         this.field34340.method9687(2L * this.field34324 - (long)var10, this.field34340.method9653((long)var10));
         this.field34340.method9687(2L * this.field34324 - (long)var10 + 1L, this.field34340.method9653((long)(var10 + 1)));
      }

      Class7796.method25923(2L * this.field34324, this.field34340, 0L, this.field34326, this.field34330, this.field34328);
   }

   private void method27195(double[] var1, int var2, int var3) {
      double[] var6 = new double[2 * this.field34323];
      int var7 = Class7008.method21726();
      if (var7 > 1 && (long)this.field34321 >= Class7796.method25891()) {
         byte var27 = 2;
         if (var7 >= 4 && (long)this.field34321 >= Class7796.method25892()) {
            var27 = 4;
         }

         Future[] var33 = new Future[var27];
         int var39 = this.field34321 / var27;

         for (int var45 = 0; var45 < var27; var45++) {
            int var51 = var45 * var39;
            int var13 = var45 == var27 - 1 ? this.field34321 : var51 + var39;
            var33[var45] = Class7008.method21729(new Class626(this, var3, var51, var13, var2, var6, var1));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var21);
         }

         Class7796.method25922(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         var39 = this.field34323 / var27;

         for (int var46 = 0; var46 < var27; var46++) {
            int var52 = var46 * var39;
            int var54 = var46 == var27 - 1 ? this.field34323 : var52 + var39;
            var33[var46] = Class7008.method21729(new Class445(this, var3, var52, var54, var6));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var19);
         }

         Class7796.method25920(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         var39 = this.field34321 / var27;

         for (int var47 = 0; var47 < var27; var47++) {
            int var53 = var47 * var39;
            int var55 = var47 == var27 - 1 ? this.field34321 : var53 + var39;
            var33[var47] = Class7008.method21729(new Class566(this, var3, var53, var55, var2, var1, var6));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var17);
         }
      } else {
         if (var3 > 0) {
            for (int var22 = 0; var22 < this.field34321; var22++) {
               int var28 = 2 * var22;
               int var34 = var28 + 1;
               int var42 = var2 + var28;
               int var48 = var2 + var34;
               var6[var28] = var1[var42] * this.field34337[var28] - var1[var48] * this.field34337[var34];
               var6[var34] = var1[var42] * this.field34337[var34] + var1[var48] * this.field34337[var28];
            }
         } else {
            for (int var8 = 0; var8 < this.field34321; var8++) {
               int var9 = 2 * var8;
               int var10 = var9 + 1;
               int var11 = var2 + var9;
               int var12 = var2 + var10;
               var6[var9] = var1[var11] * this.field34337[var9] + var1[var12] * this.field34337[var10];
               var6[var10] = -var1[var11] * this.field34337[var10] + var1[var12] * this.field34337[var9];
            }
         }

         Class7796.method25922(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         if (var3 > 0) {
            for (int var24 = 0; var24 < this.field34323; var24++) {
               int var30 = 2 * var24;
               int var36 = var30 + 1;
               double var56 = -var6[var30] * this.field34339[var36] + var6[var36] * this.field34339[var30];
               var6[var30] = var6[var30] * this.field34339[var30] + var6[var36] * this.field34339[var36];
               var6[var36] = var56;
            }
         } else {
            for (int var23 = 0; var23 < this.field34323; var23++) {
               int var29 = 2 * var23;
               int var35 = var29 + 1;
               double var14 = var6[var29] * this.field34339[var35] + var6[var35] * this.field34339[var29];
               var6[var29] = var6[var29] * this.field34339[var29] - var6[var35] * this.field34339[var35];
               var6[var35] = var14;
            }
         }

         Class7796.method25920(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         if (var3 > 0) {
            for (int var25 = 0; var25 < this.field34321; var25++) {
               int var31 = 2 * var25;
               int var37 = var31 + 1;
               int var43 = var2 + var31;
               int var49 = var2 + var37;
               var1[var43] = this.field34337[var31] * var6[var31] - this.field34337[var37] * var6[var37];
               var1[var49] = this.field34337[var37] * var6[var31] + this.field34337[var31] * var6[var37];
            }
         } else {
            for (int var26 = 0; var26 < this.field34321; var26++) {
               int var32 = 2 * var26;
               int var38 = var32 + 1;
               int var44 = var2 + var32;
               int var50 = var2 + var38;
               var1[var44] = this.field34337[var32] * var6[var32] + this.field34337[var38] * var6[var38];
               var1[var50] = -this.field34337[var38] * var6[var32] + this.field34337[var32] * var6[var38];
            }
         }
      }
   }

   private void method27196(Class2381 var1, long var2, int var4) {
      Class2381 var7 = new Class2381(2L * this.field34324);
      int var8 = Class7008.method21726();
      if (var8 > 1 && this.field34322 > Class7796.method25891()) {
         byte var9 = 2;
         if (var8 >= 4 && this.field34322 > Class7796.method25892()) {
            var9 = 4;
         }

         Future[] var10 = new Future[var9];
         long var37 = this.field34322 / (long)var9;

         for (int var13 = 0; var13 < var9; var13++) {
            long var14 = (long)var13 * var37;
            long var16 = var13 == var9 - 1 ? this.field34322 : var14 + var37;
            var10[var13] = Class7008.method21729(new Class596(this, var4, var14, var16, var2, var7, var1));
         }

         try {
            Class7008.method21730(var10);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var31);
         }

         Class7796.method25923(2L * this.field34324, var7, 0L, this.field34326, this.field34330, this.field34328);
         var37 = this.field34324 / (long)var9;

         for (int var40 = 0; var40 < var9; var40++) {
            long var42 = (long)var40 * var37;
            long var44 = var40 == var9 - 1 ? this.field34324 : var42 + var37;
            var10[var40] = Class7008.method21729(new Class447(this, var4, var42, var44, var7));
         }

         try {
            Class7008.method21730(var10);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var29);
         }

         Class7796.method25921(2L * this.field34324, var7, 0L, this.field34326, this.field34330, this.field34328);
         var37 = this.field34322 / (long)var9;

         for (int var41 = 0; var41 < var9; var41++) {
            long var43 = (long)var41 * var37;
            long var45 = var41 == var9 - 1 ? this.field34322 : var43 + var37;
            var10[var41] = Class7008.method21729(new Class1510(this, var4, var43, var45, var2, var1, var7));
         }

         try {
            Class7008.method21730(var10);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         if (var4 > 0) {
            for (long var46 = 0L; var46 < this.field34322; var46++) {
               long var32 = 2L * var46;
               long var51 = var32 + 1L;
               long var56 = var2 + var32;
               long var61 = var2 + var51;
               var7.method9687(var32, var1.method9653(var56) * this.field34338.method9653(var32) - var1.method9653(var61) * this.field34338.method9653(var51));
               var7.method9687(var51, var1.method9653(var56) * this.field34338.method9653(var51) + var1.method9653(var61) * this.field34338.method9653(var32));
            }
         } else {
            for (long var18 = 0L; var18 < this.field34322; var18++) {
               long var11 = 2L * var18;
               long var20 = var11 + 1L;
               long var22 = var2 + var11;
               long var24 = var2 + var20;
               var7.method9687(var11, var1.method9653(var22) * this.field34338.method9653(var11) + var1.method9653(var24) * this.field34338.method9653(var20));
               var7.method9687(var20, -var1.method9653(var22) * this.field34338.method9653(var20) + var1.method9653(var24) * this.field34338.method9653(var11));
            }
         }

         Class7796.method25923(2L * this.field34324, var7, 0L, this.field34326, this.field34330, this.field34328);
         if (var4 > 0) {
            for (long var48 = 0L; var48 < this.field34324; var48++) {
               long var34 = 2L * var48;
               long var53 = var34 + 1L;
               double var58 = -var7.method9653(var34) * this.field34340.method9653(var53) + var7.method9653(var53) * this.field34340.method9653(var34);
               var7.method9687(var34, var7.method9653(var34) * this.field34340.method9653(var34) + var7.method9653(var53) * this.field34340.method9653(var53));
               var7.method9687(var53, var58);
            }
         } else {
            for (long var47 = 0L; var47 < this.field34324; var47++) {
               long var33 = 2L * var47;
               long var52 = var33 + 1L;
               double var57 = var7.method9653(var33) * this.field34340.method9653(var52) + var7.method9653(var52) * this.field34340.method9653(var33);
               var7.method9687(var33, var7.method9653(var33) * this.field34340.method9653(var33) - var7.method9653(var52) * this.field34340.method9653(var52));
               var7.method9687(var52, var57);
            }
         }

         Class7796.method25921(2L * this.field34324, var7, 0L, this.field34326, this.field34330, this.field34328);
         if (var4 > 0) {
            for (long var49 = 0L; var49 < this.field34322; var49++) {
               long var35 = 2L * var49;
               long var54 = var35 + 1L;
               long var59 = var2 + var35;
               long var62 = var2 + var54;
               var1.method9687(var59, this.field34338.method9653(var35) * var7.method9653(var35) - this.field34338.method9653(var54) * var7.method9653(var54));
               var1.method9687(var62, this.field34338.method9653(var54) * var7.method9653(var35) + this.field34338.method9653(var35) * var7.method9653(var54));
            }
         } else {
            for (long var50 = 0L; var50 < this.field34322; var50++) {
               long var36 = 2L * var50;
               long var55 = var36 + 1L;
               long var60 = var2 + var36;
               long var63 = var2 + var55;
               var1.method9687(var60, this.field34338.method9653(var36) * var7.method9653(var36) + this.field34338.method9653(var55) * var7.method9653(var55));
               var1.method9687(var63, -this.field34338.method9653(var55) * var7.method9653(var36) + this.field34338.method9653(var36) * var7.method9653(var55));
            }
         }
      }
   }

   private void method27197(double[] var1, int var2, int var3) {
      double[] var6 = new double[2 * this.field34323];
      int var7 = Class7008.method21726();
      if (var7 > 1 && (long)this.field34321 >= Class7796.method25891()) {
         byte var27 = 2;
         if (var7 >= 4 && (long)this.field34321 >= Class7796.method25892()) {
            var27 = 4;
         }

         Future[] var33 = new Future[var27];
         int var39 = this.field34321 / var27;

         for (int var43 = 0; var43 < var27; var43++) {
            int var12 = var43 * var39;
            int var13 = var43 == var27 - 1 ? this.field34321 : var12 + var39;
            var33[var43] = Class7008.method21729(new Class1416(this, var3, var12, var13, var2, var6, var1));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var21);
         }

         Class7796.method25922(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         var39 = this.field34323 / var27;

         for (int var44 = 0; var44 < var27; var44++) {
            int var46 = var44 * var39;
            int var48 = var44 == var27 - 1 ? this.field34323 : var46 + var39;
            var33[var44] = Class7008.method21729(new Class1543(this, var3, var46, var48, var6));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var19);
         }

         Class7796.method25920(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         var39 = this.field34321 / var27;

         for (int var45 = 0; var45 < var27; var45++) {
            int var47 = var45 * var39;
            int var49 = var45 == var27 - 1 ? this.field34321 : var47 + var39;
            var33[var45] = Class7008.method21729(new Class1362(this, var3, var47, var49, var1, var2, var6));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var17);
         }
      } else {
         if (var3 > 0) {
            for (int var22 = 0; var22 < this.field34321; var22++) {
               int var28 = 2 * var22;
               int var34 = var28 + 1;
               int var42 = var2 + var22;
               var6[var28] = var1[var42] * this.field34337[var28];
               var6[var34] = var1[var42] * this.field34337[var34];
            }
         } else {
            for (int var8 = 0; var8 < this.field34321; var8++) {
               int var9 = 2 * var8;
               int var10 = var9 + 1;
               int var11 = var2 + var8;
               var6[var9] = var1[var11] * this.field34337[var9];
               var6[var10] = -var1[var11] * this.field34337[var10];
            }
         }

         Class7796.method25922(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         if (var3 > 0) {
            for (int var24 = 0; var24 < this.field34323; var24++) {
               int var30 = 2 * var24;
               int var36 = var30 + 1;
               double var50 = -var6[var30] * this.field34339[var36] + var6[var36] * this.field34339[var30];
               var6[var30] = var6[var30] * this.field34339[var30] + var6[var36] * this.field34339[var36];
               var6[var36] = var50;
            }
         } else {
            for (int var23 = 0; var23 < this.field34323; var23++) {
               int var29 = 2 * var23;
               int var35 = var29 + 1;
               double var14 = var6[var29] * this.field34339[var35] + var6[var35] * this.field34339[var29];
               var6[var29] = var6[var29] * this.field34339[var29] - var6[var35] * this.field34339[var35];
               var6[var35] = var14;
            }
         }

         Class7796.method25920(2 * this.field34323, var6, 0, this.field34325, this.field34329, this.field34327);
         if (var3 > 0) {
            for (int var25 = 0; var25 < this.field34321; var25++) {
               int var31 = 2 * var25;
               int var37 = var31 + 1;
               var1[var2 + var31] = this.field34337[var31] * var6[var31] - this.field34337[var37] * var6[var37];
               var1[var2 + var37] = this.field34337[var37] * var6[var31] + this.field34337[var31] * var6[var37];
            }
         } else {
            for (int var26 = 0; var26 < this.field34321; var26++) {
               int var32 = 2 * var26;
               int var38 = var32 + 1;
               var1[var2 + var32] = this.field34337[var32] * var6[var32] + this.field34337[var38] * var6[var38];
               var1[var2 + var38] = -this.field34337[var38] * var6[var32] + this.field34337[var32] * var6[var38];
            }
         }
      }
   }

   private void method27198(Class2381 var1, long var2, long var4) {
      Class2381 var8 = new Class2381(2L * this.field34324);
      int var9 = Class7008.method21726();
      if (var9 > 1 && this.field34322 > Class7796.method25891()) {
         byte var10 = 2;
         if (var9 >= 4 && this.field34322 > Class7796.method25892()) {
            var10 = 4;
         }

         Future[] var11 = new Future[var10];
         long var36 = this.field34322 / (long)var10;

         for (int var14 = 0; var14 < var10; var14++) {
            long var15 = (long)var14 * var36;
            long var17 = var14 == var10 - 1 ? this.field34322 : var15 + var36;
            var11[var14] = Class7008.method21729(new Class760(this, var4, var15, var17, var2, var8, var1));
         }

         try {
            Class7008.method21730(var11);
         } catch (InterruptedException var29) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var29);
         } catch (ExecutionException var30) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var30);
         }

         Class7796.method25923(2L * this.field34324, var8, 0L, this.field34326, this.field34330, this.field34328);
         var36 = this.field34324 / (long)var10;

         for (int var39 = 0; var39 < var10; var39++) {
            long var41 = (long)var39 * var36;
            long var43 = var39 == var10 - 1 ? this.field34324 : var41 + var36;
            var11[var39] = Class7008.method21729(new Class450(this, var4, var41, var43, var8));
         }

         try {
            Class7008.method21730(var11);
         } catch (InterruptedException var27) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var27);
         } catch (ExecutionException var28) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var28);
         }

         Class7796.method25921(2L * this.field34324, var8, 0L, this.field34326, this.field34330, this.field34328);
         var36 = this.field34322 / (long)var10;

         for (int var40 = 0; var40 < var10; var40++) {
            long var42 = (long)var40 * var36;
            long var44 = var40 == var10 - 1 ? this.field34322 : var42 + var36;
            var11[var40] = Class7008.method21729(new Class1518(this, var4, var42, var44, var1, var2, var8));
         }

         try {
            Class7008.method21730(var11);
         } catch (InterruptedException var25) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var26);
         }
      } else {
         if (var4 > 0L) {
            for (long var45 = 0L; var45 < this.field34322; var45++) {
               long var31 = 2L * var45;
               long var50 = var31 + 1L;
               long var55 = var2 + var45;
               var8.method9687(var31, var1.method9653(var55) * this.field34338.method9653(var31));
               var8.method9687(var50, var1.method9653(var55) * this.field34338.method9653(var50));
            }
         } else {
            for (long var19 = 0L; var19 < this.field34322; var19++) {
               long var12 = 2L * var19;
               long var21 = var12 + 1L;
               long var23 = var2 + var19;
               var8.method9687(var12, var1.method9653(var23) * this.field34338.method9653(var12));
               var8.method9687(var21, -var1.method9653(var23) * this.field34338.method9653(var21));
            }
         }

         Class7796.method25923(2L * this.field34324, var8, 0L, this.field34326, this.field34330, this.field34328);
         if (var4 > 0L) {
            for (long var47 = 0L; var47 < this.field34324; var47++) {
               long var33 = 2L * var47;
               long var52 = var33 + 1L;
               double var57 = -var8.method9653(var33) * this.field34340.method9653(var52) + var8.method9653(var52) * this.field34340.method9653(var33);
               var8.method9687(var33, var8.method9653(var33) * this.field34340.method9653(var33) + var8.method9653(var52) * this.field34340.method9653(var52));
               var8.method9687(var52, var57);
            }
         } else {
            for (long var46 = 0L; var46 < this.field34324; var46++) {
               long var32 = 2L * var46;
               long var51 = var32 + 1L;
               double var56 = var8.method9653(var32) * this.field34340.method9653(var51) + var8.method9653(var51) * this.field34340.method9653(var32);
               var8.method9687(var32, var8.method9653(var32) * this.field34340.method9653(var32) - var8.method9653(var51) * this.field34340.method9653(var51));
               var8.method9687(var51, var56);
            }
         }

         Class7796.method25921(2L * this.field34324, var8, 0L, this.field34326, this.field34330, this.field34328);
         if (var4 > 0L) {
            for (long var48 = 0L; var48 < this.field34322; var48++) {
               long var34 = 2L * var48;
               long var53 = var34 + 1L;
               var1.method9687(
                  var2 + var34, this.field34338.method9653(var34) * var8.method9653(var34) - this.field34338.method9653(var53) * var8.method9653(var53)
               );
               var1.method9687(
                  var2 + var53, this.field34338.method9653(var53) * var8.method9653(var34) + this.field34338.method9653(var34) * var8.method9653(var53)
               );
            }
         } else {
            for (long var49 = 0L; var49 < this.field34322; var49++) {
               long var35 = 2L * var49;
               long var54 = var35 + 1L;
               var1.method9687(
                  var2 + var35, this.field34338.method9653(var35) * var8.method9653(var35) + this.field34338.method9653(var54) * var8.method9653(var54)
               );
               var1.method9687(
                  var2 + var54, -this.field34338.method9653(var54) * var8.method9653(var35) + this.field34338.method9653(var35) * var8.method9653(var54)
               );
            }
         }
      }
   }

   private void method27199(double[] var1, int var2) {
      double[] var5 = new double[2 * this.field34323];
      int var6 = Class7008.method21726();
      if (var6 > 1 && (long)this.field34321 >= Class7796.method25891()) {
         byte var20 = 2;
         if (var6 >= 4 && (long)this.field34321 >= Class7796.method25892()) {
            var20 = 4;
         }

         Future[] var24 = new Future[var20];
         int var28 = this.field34321 / var20;

         for (int var32 = 0; var32 < var20; var32++) {
            int var11 = var32 * var28;
            int var12 = var32 == var20 - 1 ? this.field34321 : var11 + var28;
            var24[var32] = Class7008.method21729(new Class414(this, var11, var12, var2, var5, var1));
         }

         try {
            Class7008.method21730(var24);
         } catch (InterruptedException var17) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var18);
         }

         Class7796.method25922(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);
         var28 = this.field34323 / var20;

         for (int var33 = 0; var33 < var20; var33++) {
            int var34 = var33 * var28;
            int var35 = var33 == var20 - 1 ? this.field34323 : var34 + var28;
            var24[var33] = Class7008.method21729(new Class519(this, var34, var35, var5));
         }

         try {
            Class7008.method21730(var24);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var16);
         }
      } else {
         for (int var7 = 0; var7 < this.field34321; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = var2 + var7;
            var5[var8] = var1[var10] * this.field34337[var8];
            var5[var9] = -var1[var10] * this.field34337[var9];
         }

         Class7796.method25922(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);

         for (int var19 = 0; var19 < this.field34323; var19++) {
            int var23 = 2 * var19;
            int var27 = var23 + 1;
            double var13 = var5[var23] * this.field34339[var27] + var5[var27] * this.field34339[var23];
            var5[var23] = var5[var23] * this.field34339[var23] - var5[var27] * this.field34339[var27];
            var5[var27] = var13;
         }
      }

      Class7796.method25920(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);
      if (this.field34321 % 2 == 0) {
         var1[var2] = this.field34337[0] * var5[0] + this.field34337[1] * var5[1];
         var1[var2 + 1] = this.field34337[this.field34321] * var5[this.field34321] + this.field34337[this.field34321 + 1] * var5[this.field34321 + 1];

         for (int var21 = 1; var21 < this.field34321 / 2; var21++) {
            int var25 = 2 * var21;
            int var30 = var25 + 1;
            var1[var2 + var25] = this.field34337[var25] * var5[var25] + this.field34337[var30] * var5[var30];
            var1[var2 + var30] = -this.field34337[var30] * var5[var25] + this.field34337[var25] * var5[var30];
         }
      } else {
         var1[var2] = this.field34337[0] * var5[0] + this.field34337[1] * var5[1];
         var1[var2 + 1] = -this.field34337[this.field34321] * var5[this.field34321 - 1] + this.field34337[this.field34321 - 1] * var5[this.field34321];

         for (int var22 = 1; var22 < (this.field34321 - 1) / 2; var22++) {
            int var26 = 2 * var22;
            int var31 = var26 + 1;
            var1[var2 + var26] = this.field34337[var26] * var5[var26] + this.field34337[var31] * var5[var31];
            var1[var2 + var31] = -this.field34337[var31] * var5[var26] + this.field34337[var26] * var5[var31];
         }

         var1[var2 + this.field34321 - 1] = this.field34337[this.field34321 - 1] * var5[this.field34321 - 1]
            + this.field34337[this.field34321] * var5[this.field34321];
      }
   }

   private void method27200(Class2381 var1, long var2) {
      Class2381 var6 = new Class2381(2L * this.field34324);
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field34322 > Class7796.method25891()) {
         byte var8 = 2;
         if (var7 >= 4 && this.field34322 > Class7796.method25892()) {
            var8 = 4;
         }

         Future[] var9 = new Future[var8];
         long var28 = this.field34322 / (long)var8;

         for (int var12 = 0; var12 < var8; var12++) {
            long var13 = (long)var12 * var28;
            long var15 = var12 == var8 - 1 ? this.field34322 : var13 + var28;
            var9[var12] = Class7008.method21729(new Class612(this, var13, var15, var2, var6, var1));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var25) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var26);
         }

         Class7796.method25923(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);
         var28 = this.field34324 / (long)var8;

         for (int var32 = 0; var32 < var8; var32++) {
            long var33 = (long)var32 * var28;
            long var34 = var32 == var8 - 1 ? this.field34324 : var33 + var28;
            var9[var32] = Class7008.method21729(new Class533(this, var33, var34, var6));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var23) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var24);
         }
      } else {
         for (long var17 = 0L; var17 < this.field34322; var17++) {
            long var10 = 2L * var17;
            long var19 = var10 + 1L;
            long var21 = var2 + var17;
            var6.method9687(var10, var1.method9653(var21) * this.field34338.method9653(var10));
            var6.method9687(var19, -var1.method9653(var21) * this.field34338.method9653(var19));
         }

         Class7796.method25923(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);

         for (long var35 = 0L; var35 < this.field34324; var35++) {
            long var27 = 2L * var35;
            long var38 = var27 + 1L;
            double var41 = var6.method9653(var27) * this.field34340.method9653(var38) + var6.method9653(var38) * this.field34340.method9653(var27);
            var6.method9687(var27, var6.method9653(var27) * this.field34340.method9653(var27) - var6.method9653(var38) * this.field34340.method9653(var38));
            var6.method9687(var38, var41);
         }
      }

      Class7796.method25921(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);
      if (this.field34322 % 2L == 0L) {
         var1.method9687(var2, this.field34338.method9653(0L) * var6.method9653(0L) + this.field34338.method9653(1L) * var6.method9653(1L));
         var1.method9687(
            var2 + 1L,
            this.field34338.method9653(this.field34322) * var6.method9653(this.field34322)
               + this.field34338.method9653(this.field34322 + 1L) * var6.method9653(this.field34322 + 1L)
         );

         for (long var36 = 1L; var36 < this.field34322 / 2L; var36++) {
            long var30 = 2L * var36;
            long var39 = var30 + 1L;
            var1.method9687(
               var2 + var30, this.field34338.method9653(var30) * var6.method9653(var30) + this.field34338.method9653(var39) * var6.method9653(var39)
            );
            var1.method9687(
               var2 + var39, -this.field34338.method9653(var39) * var6.method9653(var30) + this.field34338.method9653(var30) * var6.method9653(var39)
            );
         }
      } else {
         var1.method9687(var2, this.field34338.method9653(0L) * var6.method9653(0L) + this.field34338.method9653(1L) * var6.method9653(1L));
         var1.method9687(
            var2 + 1L,
            -this.field34338.method9653(this.field34322) * var6.method9653(this.field34322 - 1L)
               + this.field34338.method9653(this.field34322 - 1L) * var6.method9653(this.field34322)
         );

         for (long var37 = 1L; var37 < (this.field34322 - 1L) / 2L; var37++) {
            long var31 = 2L * var37;
            long var40 = var31 + 1L;
            var1.method9687(
               var2 + var31, this.field34338.method9653(var31) * var6.method9653(var31) + this.field34338.method9653(var40) * var6.method9653(var40)
            );
            var1.method9687(
               var2 + var40, -this.field34338.method9653(var40) * var6.method9653(var31) + this.field34338.method9653(var31) * var6.method9653(var40)
            );
         }

         var1.method9687(
            var2 + this.field34322 - 1L,
            this.field34338.method9653(this.field34322 - 1L) * var6.method9653(this.field34322 - 1L)
               + this.field34338.method9653(this.field34322) * var6.method9653(this.field34322)
         );
      }
   }

   private void method27201(double[] var1, int var2) {
      double[] var5 = new double[2 * this.field34323];
      if (this.field34321 % 2 == 0) {
         var5[0] = var1[var2] * this.field34337[0];
         var5[1] = var1[var2] * this.field34337[1];

         for (int var6 = 1; var6 < this.field34321 / 2; var6++) {
            int var7 = 2 * var6;
            int var8 = var7 + 1;
            int var9 = var2 + var7;
            int var10 = var2 + var8;
            var5[var7] = var1[var9] * this.field34337[var7] - var1[var10] * this.field34337[var8];
            var5[var8] = var1[var9] * this.field34337[var8] + var1[var10] * this.field34337[var7];
         }

         var5[this.field34321] = var1[var2 + 1] * this.field34337[this.field34321];
         var5[this.field34321 + 1] = var1[var2 + 1] * this.field34337[this.field34321 + 1];

         for (int var19 = this.field34321 / 2 + 1; var19 < this.field34321; var19++) {
            int var23 = 2 * var19;
            int var29 = var23 + 1;
            int var35 = var2 + 2 * this.field34321 - var23;
            int var42 = var35 + 1;
            var5[var23] = var1[var35] * this.field34337[var23] + var1[var42] * this.field34337[var29];
            var5[var29] = var1[var35] * this.field34337[var29] - var1[var42] * this.field34337[var23];
         }
      } else {
         var5[0] = var1[var2] * this.field34337[0];
         var5[1] = var1[var2] * this.field34337[1];

         for (int var20 = 1; var20 < (this.field34321 - 1) / 2; var20++) {
            int var24 = 2 * var20;
            int var30 = var24 + 1;
            int var36 = var2 + var24;
            int var43 = var2 + var30;
            var5[var24] = var1[var36] * this.field34337[var24] - var1[var43] * this.field34337[var30];
            var5[var30] = var1[var36] * this.field34337[var30] + var1[var43] * this.field34337[var24];
         }

         var5[this.field34321 - 1] = var1[var2 + this.field34321 - 1] * this.field34337[this.field34321 - 1]
            - var1[var2 + 1] * this.field34337[this.field34321];
         var5[this.field34321] = var1[var2 + this.field34321 - 1] * this.field34337[this.field34321] + var1[var2 + 1] * this.field34337[this.field34321 - 1];
         var5[this.field34321 + 1] = var1[var2 + this.field34321 - 1] * this.field34337[this.field34321 + 1]
            + var1[var2 + 1] * this.field34337[this.field34321 + 2];
         var5[this.field34321 + 2] = var1[var2 + this.field34321 - 1] * this.field34337[this.field34321 + 2]
            - var1[var2 + 1] * this.field34337[this.field34321 + 1];

         for (int var21 = (this.field34321 - 1) / 2 + 2; var21 < this.field34321; var21++) {
            int var25 = 2 * var21;
            int var31 = var25 + 1;
            int var37 = var2 + 2 * this.field34321 - var25;
            int var44 = var37 + 1;
            var5[var25] = var1[var37] * this.field34337[var25] + var1[var44] * this.field34337[var31];
            var5[var31] = var1[var37] * this.field34337[var31] - var1[var44] * this.field34337[var25];
         }
      }

      Class7796.method25922(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);
      int var22 = Class7008.method21726();
      if (var22 > 1 && (long)this.field34321 >= Class7796.method25891()) {
         byte var28 = 2;
         if (var22 >= 4 && (long)this.field34321 >= Class7796.method25892()) {
            var28 = 4;
         }

         Future[] var34 = new Future[var28];
         int var40 = this.field34323 / var28;

         for (int var45 = 0; var45 < var28; var45++) {
            int var11 = var45 * var40;
            int var12 = var45 == var28 - 1 ? this.field34323 : var11 + var40;
            var34[var45] = Class7008.method21729(new Class702(this, var11, var12, var5));
         }

         try {
            Class7008.method21730(var34);
         } catch (InterruptedException var17) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var18);
         }

         Class7796.method25920(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);
         var40 = this.field34321 / var28;

         for (int var46 = 0; var46 < var28; var46++) {
            int var47 = var46 * var40;
            int var48 = var46 == var28 - 1 ? this.field34321 : var47 + var40;
            var34[var46] = Class7008.method21729(new Class733(this, var47, var48, var1, var2, var5));
         }

         try {
            Class7008.method21730(var34);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var16);
         }
      } else {
         for (int var26 = 0; var26 < this.field34323; var26++) {
            int var32 = 2 * var26;
            int var38 = var32 + 1;
            double var13 = -var5[var32] * this.field34339[var38] + var5[var38] * this.field34339[var32];
            var5[var32] = var5[var32] * this.field34339[var32] + var5[var38] * this.field34339[var38];
            var5[var38] = var13;
         }

         Class7796.method25920(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);

         for (int var27 = 0; var27 < this.field34321; var27++) {
            int var33 = 2 * var27;
            int var39 = var33 + 1;
            var1[var2 + var27] = this.field34337[var33] * var5[var33] - this.field34337[var39] * var5[var39];
         }
      }
   }

   private void method27202(Class2381 var1, long var2) {
      Class2381 var6 = new Class2381(2L * this.field34324);
      if (this.field34322 % 2L == 0L) {
         var6.method9687(0L, var1.method9653(var2) * this.field34338.method9653(0L));
         var6.method9687(1L, var1.method9653(var2) * this.field34338.method9653(1L));

         for (long var7 = 1L; var7 < this.field34322 / 2L; var7++) {
            long var9 = 2L * var7;
            long var11 = var9 + 1L;
            long var13 = var2 + var9;
            long var15 = var2 + var11;
            var6.method9687(var9, var1.method9653(var13) * this.field34338.method9653(var9) - var1.method9653(var15) * this.field34338.method9653(var11));
            var6.method9687(var11, var1.method9653(var13) * this.field34338.method9653(var11) + var1.method9653(var15) * this.field34338.method9653(var9));
         }

         var6.method9687(this.field34322, var1.method9653(var2 + 1L) * this.field34338.method9653(this.field34322));
         var6.method9687(this.field34322 + 1L, var1.method9653(var2 + 1L) * this.field34338.method9653(this.field34322 + 1L));

         for (long var33 = this.field34322 / 2L + 1L; var33 < this.field34322; var33++) {
            long var36 = 2L * var33;
            long var39 = var36 + 1L;
            long var42 = var2 + 2L * this.field34322 - var36;
            long var47 = var42 + 1L;
            var6.method9687(var36, var1.method9653(var42) * this.field34338.method9653(var36) + var1.method9653(var47) * this.field34338.method9653(var39));
            var6.method9687(var39, var1.method9653(var42) * this.field34338.method9653(var39) - var1.method9653(var47) * this.field34338.method9653(var36));
         }
      } else {
         var6.method9687(0L, var1.method9653(var2) * this.field34338.method9653(0L));
         var6.method9687(1L, var1.method9653(var2) * this.field34338.method9653(1L));

         for (long var34 = 1L; var34 < (this.field34322 - 1L) / 2L; var34++) {
            long var37 = 2L * var34;
            long var40 = var37 + 1L;
            long var43 = var2 + var37;
            long var48 = var2 + var40;
            var6.method9687(var37, var1.method9653(var43) * this.field34338.method9653(var37) - var1.method9653(var48) * this.field34338.method9653(var40));
            var6.method9687(var40, var1.method9653(var43) * this.field34338.method9653(var40) + var1.method9653(var48) * this.field34338.method9653(var37));
         }

         var6.method9687(
            this.field34322 - 1L,
            var1.method9653(var2 + this.field34322 - 1L) * this.field34338.method9653(this.field34322 - 1L)
               - var1.method9653(var2 + 1L) * this.field34338.method9653(this.field34322)
         );
         var6.method9687(
            this.field34322,
            var1.method9653(var2 + this.field34322 - 1L) * this.field34338.method9653(this.field34322)
               + var1.method9653(var2 + 1L) * this.field34338.method9653(this.field34322 - 1L)
         );
         var6.method9687(
            this.field34322 + 1L,
            var1.method9653(var2 + this.field34322 - 1L) * this.field34338.method9653(this.field34322 + 1L)
               + var1.method9653(var2 + 1L) * this.field34338.method9653(this.field34322 + 2L)
         );
         var6.method9687(
            this.field34322 + 2L,
            var1.method9653(var2 + this.field34322 - 1L) * this.field34338.method9653(this.field34322 + 2L)
               - var1.method9653(var2 + 1L) * this.field34338.method9653(this.field34322 + 1L)
         );

         for (long var35 = (this.field34322 - 1L) / 2L + 2L; var35 < this.field34322; var35++) {
            long var38 = 2L * var35;
            long var41 = var38 + 1L;
            long var44 = var2 + 2L * this.field34322 - var38;
            long var49 = var44 + 1L;
            var6.method9687(var38, var1.method9653(var44) * this.field34338.method9653(var38) + var1.method9653(var49) * this.field34338.method9653(var41));
            var6.method9687(var41, var1.method9653(var44) * this.field34338.method9653(var41) - var1.method9653(var49) * this.field34338.method9653(var38));
         }
      }

      Class7796.method25923(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);
      int var17 = Class7008.method21726();
      if (var17 > 1 && this.field34322 > Class7796.method25891()) {
         byte var18 = 2;
         if (var17 >= 4 && this.field34322 > Class7796.method25892()) {
            var18 = 4;
         }

         Future[] var19 = new Future[var18];
         long var53 = this.field34324 / (long)var18;

         for (int var22 = 0; var22 < var18; var22++) {
            long var45 = (long)var22 * var53;
            long var50 = var22 == var18 - 1 ? this.field34324 : var45 + var53;
            var19[var22] = Class7008.method21729(new Class1398(this, var45, var50, var6));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var31) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var31);
         } catch (ExecutionException var32) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var32);
         }

         Class7796.method25921(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);
         var53 = this.field34322 / (long)var18;

         for (int var55 = 0; var55 < var18; var55++) {
            long var46 = (long)var55 * var53;
            long var51 = var55 == var18 - 1 ? this.field34322 : var46 + var53;
            var19[var55] = Class7008.method21729(new Class703(this, var46, var51, var1, var2, var6));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var29) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var29);
         } catch (ExecutionException var30) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var30);
         }
      } else {
         for (long var23 = 0L; var23 < this.field34324; var23++) {
            long var20 = 2L * var23;
            long var25 = var20 + 1L;
            double var27 = -var6.method9653(var20) * this.field34340.method9653(var25) + var6.method9653(var25) * this.field34340.method9653(var20);
            var6.method9687(var20, var6.method9653(var20) * this.field34340.method9653(var20) + var6.method9653(var25) * this.field34340.method9653(var25));
            var6.method9687(var25, var27);
         }

         Class7796.method25921(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);

         for (long var56 = 0L; var56 < this.field34322; var56++) {
            long var52 = 2L * var56;
            long var57 = var52 + 1L;
            var1.method9687(
               var2 + var56, this.field34338.method9653(var52) * var6.method9653(var52) - this.field34338.method9653(var57) * var6.method9653(var57)
            );
         }
      }
   }

   private void method27203(double[] var1, int var2) {
      double[] var5 = new double[2 * this.field34323];
      int var6 = Class7008.method21726();
      if (var6 > 1 && (long)this.field34321 >= Class7796.method25891()) {
         byte var20 = 2;
         if (var6 >= 4 && (long)this.field34321 >= Class7796.method25892()) {
            var20 = 4;
         }

         Future[] var24 = new Future[var20];
         int var28 = this.field34321 / var20;

         for (int var32 = 0; var32 < var20; var32++) {
            int var11 = var32 * var28;
            int var12 = var32 == var20 - 1 ? this.field34321 : var11 + var28;
            var24[var32] = Class7008.method21729(new Class426(this, var11, var12, var2, var5, var1));
         }

         try {
            Class7008.method21730(var24);
         } catch (InterruptedException var17) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var18);
         }

         Class7796.method25922(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);
         var28 = this.field34323 / var20;

         for (int var33 = 0; var33 < var20; var33++) {
            int var34 = var33 * var28;
            int var35 = var33 == var20 - 1 ? this.field34323 : var34 + var28;
            var24[var33] = Class7008.method21729(new Class1633(this, var34, var35, var5));
         }

         try {
            Class7008.method21730(var24);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var16);
         }
      } else {
         for (int var7 = 0; var7 < this.field34321; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = var2 + var7;
            var5[var8] = var1[var10] * this.field34337[var8];
            var5[var9] = var1[var10] * this.field34337[var9];
         }

         Class7796.method25922(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);

         for (int var19 = 0; var19 < this.field34323; var19++) {
            int var23 = 2 * var19;
            int var27 = var23 + 1;
            double var13 = -var5[var23] * this.field34339[var27] + var5[var27] * this.field34339[var23];
            var5[var23] = var5[var23] * this.field34339[var23] + var5[var27] * this.field34339[var27];
            var5[var27] = var13;
         }
      }

      Class7796.method25920(2 * this.field34323, var5, 0, this.field34325, this.field34329, this.field34327);
      if (this.field34321 % 2 == 0) {
         var1[var2] = this.field34337[0] * var5[0] - this.field34337[1] * var5[1];
         var1[var2 + 1] = this.field34337[this.field34321] * var5[this.field34321] - this.field34337[this.field34321 + 1] * var5[this.field34321 + 1];

         for (int var21 = 1; var21 < this.field34321 / 2; var21++) {
            int var25 = 2 * var21;
            int var30 = var25 + 1;
            var1[var2 + var25] = this.field34337[var25] * var5[var25] - this.field34337[var30] * var5[var30];
            var1[var2 + var30] = this.field34337[var30] * var5[var25] + this.field34337[var25] * var5[var30];
         }
      } else {
         var1[var2] = this.field34337[0] * var5[0] - this.field34337[1] * var5[1];
         var1[var2 + 1] = this.field34337[this.field34321] * var5[this.field34321 - 1] + this.field34337[this.field34321 - 1] * var5[this.field34321];

         for (int var22 = 1; var22 < (this.field34321 - 1) / 2; var22++) {
            int var26 = 2 * var22;
            int var31 = var26 + 1;
            var1[var2 + var26] = this.field34337[var26] * var5[var26] - this.field34337[var31] * var5[var31];
            var1[var2 + var31] = this.field34337[var31] * var5[var26] + this.field34337[var26] * var5[var31];
         }

         var1[var2 + this.field34321 - 1] = this.field34337[this.field34321 - 1] * var5[this.field34321 - 1]
            - this.field34337[this.field34321] * var5[this.field34321];
      }
   }

   private void method27204(Class2381 var1, long var2) {
      Class2381 var6 = new Class2381(2L * this.field34324);
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field34322 > Class7796.method25891()) {
         byte var8 = 2;
         if (var7 >= 4 && this.field34322 > Class7796.method25892()) {
            var8 = 4;
         }

         Future[] var9 = new Future[var8];
         long var28 = this.field34322 / (long)var8;

         for (int var12 = 0; var12 < var8; var12++) {
            long var13 = (long)var12 * var28;
            long var15 = var12 == var8 - 1 ? this.field34322 : var13 + var28;
            var9[var12] = Class7008.method21729(new Class472(this, var13, var15, var2, var6, var1));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var25) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var26);
         }

         Class7796.method25923(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);
         var28 = this.field34324 / (long)var8;

         for (int var32 = 0; var32 < var8; var32++) {
            long var33 = (long)var32 * var28;
            long var34 = var32 == var8 - 1 ? this.field34324 : var33 + var28;
            var9[var32] = Class7008.method21729(new Class328(this, var33, var34, var6));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var23) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(Class7990.class.getName()).log(Level.SEVERE, null, var24);
         }
      } else {
         for (long var17 = 0L; var17 < this.field34322; var17++) {
            long var10 = 2L * var17;
            long var19 = var10 + 1L;
            long var21 = var2 + var17;
            var6.method9687(var10, var1.method9653(var21) * this.field34338.method9653(var10));
            var6.method9687(var19, var1.method9653(var21) * this.field34338.method9653(var19));
         }

         Class7796.method25923(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);

         for (long var35 = 0L; var35 < this.field34324; var35++) {
            long var27 = 2L * var35;
            long var38 = var27 + 1L;
            double var41 = -var6.method9653(var27) * this.field34340.method9653(var38) + var6.method9653(var38) * this.field34340.method9653(var27);
            var6.method9687(var27, var6.method9653(var27) * this.field34340.method9653(var27) + var6.method9653(var38) * this.field34340.method9653(var38));
            var6.method9687(var38, var41);
         }
      }

      Class7796.method25921(2L * this.field34324, var6, 0L, this.field34326, this.field34330, this.field34328);
      if (this.field34322 % 2L == 0L) {
         var1.method9687(var2, this.field34338.method9653(0L) * var6.method9653(0L) - this.field34338.method9653(1L) * var6.method9653(1L));
         var1.method9687(
            var2 + 1L,
            this.field34338.method9653(this.field34322) * var6.method9653(this.field34322)
               - this.field34338.method9653(this.field34322 + 1L) * var6.method9653(this.field34322 + 1L)
         );

         for (long var36 = 1L; var36 < this.field34322 / 2L; var36++) {
            long var30 = 2L * var36;
            long var39 = var30 + 1L;
            var1.method9687(
               var2 + var30, this.field34338.method9653(var30) * var6.method9653(var30) - this.field34338.method9653(var39) * var6.method9653(var39)
            );
            var1.method9687(
               var2 + var39, this.field34338.method9653(var39) * var6.method9653(var30) + this.field34338.method9653(var30) * var6.method9653(var39)
            );
         }
      } else {
         var1.method9687(var2, this.field34338.method9653(0L) * var6.method9653(0L) - this.field34338.method9653(1L) * var6.method9653(1L));
         var1.method9687(
            var2 + 1L,
            this.field34338.method9653(this.field34322) * var6.method9653(this.field34322 - 1L)
               + this.field34338.method9653(this.field34322 - 1L) * var6.method9653(this.field34322)
         );

         for (long var37 = 1L; var37 < (this.field34322 - 1L) / 2L; var37++) {
            long var31 = 2L * var37;
            long var40 = var31 + 1L;
            var1.method9687(
               var2 + var31, this.field34338.method9653(var31) * var6.method9653(var31) - this.field34338.method9653(var40) * var6.method9653(var40)
            );
            var1.method9687(
               var2 + var40, this.field34338.method9653(var40) * var6.method9653(var31) + this.field34338.method9653(var31) * var6.method9653(var40)
            );
         }

         var1.method9687(
            var2 + this.field34322 - 1L,
            this.field34338.method9653(this.field34322 - 1L) * var6.method9653(this.field34322 - 1L)
               - this.field34338.method9653(this.field34322) * var6.method9653(this.field34322)
         );
      }
   }

   public void method27205(double[] var1, int var2) {
      if (this.field34321 != 1) {
         double[] var5 = new double[this.field34321];
         int var6 = 2 * this.field34321;
         int var7 = (int)this.field34335[1 + var6];
         int var8 = 1;
         int var9 = this.field34321;
         int var10 = var6 - 1;

         for (int var11 = 1; var11 <= var7; var11++) {
            int var12 = var7 - var11;
            int var13 = (int)this.field34335[var12 + 2 + var6];
            int var14 = var9 / var13;
            int var15 = this.field34321 / var9;
            int var16 = var15 * var14;
            var10 -= (var13 - 1) * var15;
            var8 = 1 - var8;
            switch (var13) {
               case 2:
                  if (var8 == 0) {
                     this.method27209(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method27209(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               case 3:
                  if (var8 == 0) {
                     this.method27213(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method27213(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               case 4:
                  if (var8 == 0) {
                     this.method27217(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method27217(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               case 5:
                  if (var8 == 0) {
                     this.method27221(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method27221(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               default:
                  if (var15 == 1) {
                     var8 = 1 - var8;
                  }

                  if (var8 == 0) {
                     this.method27225(var15, var13, var14, var16, var1, var2, var5, 0, var10);
                     var8 = 1;
                  } else {
                     this.method27225(var15, var13, var14, var16, var5, 0, var1, var2, var10);
                     var8 = 0;
                  }
            }

            var9 = var14;
         }

         if (var8 != 1) {
            System.arraycopy(var5, 0, var1, var2, this.field34321);
         }
      }
   }

   public void method27206(Class2381 var1, long var2) {
      if (this.field34322 != 1L) {
         Class2381 var6 = new Class2381(this.field34322);
         long var7 = 2L * this.field34322;
         long var9 = (long)this.field34336.method9653(1L + var7);
         long var11 = 1L;
         long var13 = this.field34322;
         long var15 = var7 - 1L;

         for (long var17 = 1L; var17 <= var9; var17++) {
            long var19 = var9 - var17;
            int var21 = (int)this.field34336.method9653(var19 + 2L + var7);
            long var22 = var13 / (long)var21;
            long var24 = this.field34322 / var13;
            long var26 = var24 * var22;
            var15 -= (long)(var21 - 1) * var24;
            var11 = 1L - var11;
            switch (var21) {
               case 2:
                  if (var11 == 0L) {
                     this.method27210(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27210(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               case 3:
                  if (var11 == 0L) {
                     this.method27214(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27214(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               case 4:
                  if (var11 == 0L) {
                     this.method27218(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27218(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               case 5:
                  if (var11 == 0L) {
                     this.method27222(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27222(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               default:
                  if (var24 == 1L) {
                     var11 = 1L - var11;
                  }

                  if (var11 == 0L) {
                     this.method27226(var24, (long)var21, var22, var26, var1, var2, var6, 0L, var15);
                     var11 = 1L;
                  } else {
                     this.method27226(var24, (long)var21, var22, var26, var6, 0L, var1, var2, var15);
                     var11 = 0L;
                  }
            }

            var13 = var22;
         }

         if (var11 != 1L) {
            Class8133.method28177(var6, 0L, var1, var2, this.field34322);
         }
      }
   }

   public void method27207(double[] var1, int var2) {
      if (this.field34321 != 1) {
         double[] var5 = new double[this.field34321];
         int var6 = 2 * this.field34321;
         int var7 = (int)this.field34335[1 + var6];
         int var8 = 0;
         int var9 = 1;
         int var10 = this.field34321;

         for (int var11 = 1; var11 <= var7; var11++) {
            int var12 = (int)this.field34335[var11 + 1 + var6];
            int var13 = var12 * var9;
            int var14 = this.field34321 / var13;
            int var15 = var14 * var9;
            switch (var12) {
               case 2:
                  if (var8 == 0) {
                     this.method27211(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method27211(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               case 3:
                  if (var8 == 0) {
                     this.method27215(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method27215(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               case 4:
                  if (var8 == 0) {
                     this.method27219(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method27219(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               case 5:
                  if (var8 == 0) {
                     this.method27223(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method27223(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               default:
                  if (var8 == 0) {
                     this.method27227(var14, var12, var9, var15, var1, var2, var5, 0, var10);
                  } else {
                     this.method27227(var14, var12, var9, var15, var5, 0, var1, var2, var10);
                  }

                  if (var14 == 1) {
                     var8 = 1 - var8;
                  }
            }

            var9 = var13;
            var10 += (var12 - 1) * var14;
         }

         if (var8 != 0) {
            System.arraycopy(var5, 0, var1, var2, this.field34321);
         }
      }
   }

   public void method27208(Class2381 var1, long var2) {
      if (this.field34322 != 1L) {
         Class2381 var6 = new Class2381(this.field34322);
         long var7 = 2L * this.field34322;
         long var9 = (long)this.field34336.method9653(1L + var7);
         long var11 = 0L;
         long var13 = 1L;
         long var15 = this.field34322;

         for (long var17 = 1L; var17 <= var9; var17++) {
            int var19 = (int)this.field34336.method9653(var17 + 1L + var7);
            long var20 = (long)var19 * var13;
            long var22 = this.field34322 / var20;
            long var24 = var22 * var13;
            switch (var19) {
               case 2:
                  if (var11 == 0L) {
                     this.method27212(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27212(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               case 3:
                  if (var11 == 0L) {
                     this.method27216(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27216(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               case 4:
                  if (var11 == 0L) {
                     this.method27220(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27220(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               case 5:
                  if (var11 == 0L) {
                     this.method27224(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27224(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               default:
                  if (var11 == 0L) {
                     this.method27228(var22, (long)var19, var13, var24, var1, var2, var6, 0L, var15);
                  } else {
                     this.method27228(var22, (long)var19, var13, var24, var6, 0L, var1, var2, var15);
                  }

                  if (var22 == 1L) {
                     var11 = 1L - var11;
                  }
            }

            var13 = var20;
            var15 += (long)(var19 - 1) * var22;
         }

         if (var11 != 0L) {
            Class8133.method28177(var6, 0L, var1, var2, this.field34322);
         }
      }
   }

   public void method27209(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      int var10 = var7;
      int var11 = var2 * var1;
      int var12 = 2 * var1;

      for (int var13 = 0; var13 < var2; var13++) {
         int var15 = var6 + var13 * var12;
         int var16 = var15 + var12 - 1;
         int var17 = var4 + var13 * var1;
         int var18 = var17 + var11;
         double var19 = var3[var17];
         double var21 = var3[var18];
         var5[var15] = var19 + var21;
         var5[var16] = var19 - var21;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var45 = 0; var45 < var2; var45++) {
               var12 = var45 * var1;
               int var14 = 2 * var12;
               int var23 = var14 + var1;
               int var24 = var12 + var11;

               for (int var25 = 2; var25 < var1; var25 += 2) {
                  int var26 = var1 - var25;
                  int var48 = var25 - 1 + var10;
                  int var50 = var6 + var25 + var14;
                  int var52 = var6 + var26 + var23;
                  int var53 = var4 + var25 + var12;
                  int var27 = var4 + var25 + var24;
                  double var28 = var3[var53 - 1];
                  double var30 = var3[var53];
                  double var32 = var3[var27 - 1];
                  double var34 = var3[var27];
                  double var36 = this.field34335[var48 - 1];
                  double var38 = this.field34335[var48];
                  double var40 = var36 * var32 + var38 * var34;
                  double var42 = var36 * var34 - var38 * var32;
                  var5[var50] = var30 + var42;
                  var5[var50 - 1] = var28 + var40;
                  var5[var52] = var42 - var30;
                  var5[var52 - 1] = var28 - var40;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         int var47 = 2 * var12;

         for (int var46 = 0; var46 < var2; var46++) {
            var12 = var46 * var1;
            int var49 = var6 + var47 + var1;
            int var51 = var4 + var1 - 1 + var12;
            var5[var49] = -var3[var51 + var11];
            var5[var49 - 1] = var3[var51];
         }
      }
   }

   public void method27210(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      long var15 = var11;
      long var17 = var3 * var1;
      long var19 = 2L * var1;

      for (long var21 = 0L; var21 < var3; var21++) {
         long var25 = var9 + var21 * var19;
         long var27 = var25 + var19 - 1L;
         long var29 = var6 + var21 * var1;
         long var31 = var29 + var17;
         double var33 = var5.method9653(var29);
         double var35 = var5.method9653(var31);
         var8.method9687(var25, var33 + var35);
         var8.method9687(var27, var33 - var35);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var60 = 0L; var60 < var3; var60++) {
               var19 = var60 * var1;
               long var23 = 2L * var19;
               long var37 = var23 + var1;
               long var39 = var19 + var17;

               for (long var41 = 2L; var41 < var1; var41 += 2L) {
                  long var43 = var1 - var41;
                  long var63 = var41 - 1L + var15;
                  long var65 = var9 + var41 + var23;
                  long var67 = var9 + var43 + var37;
                  long var68 = var6 + var41 + var19;
                  long var69 = var6 + var41 + var39;
                  double var70 = var5.method9653(var68 - 1L);
                  double var45 = var5.method9653(var68);
                  double var47 = var5.method9653(var69 - 1L);
                  double var49 = var5.method9653(var69);
                  double var51 = this.field34336.method9653(var63 - 1L);
                  double var53 = this.field34336.method9653(var63);
                  double var55 = var51 * var47 + var53 * var49;
                  double var57 = var51 * var49 - var53 * var47;
                  var8.method9687(var65, var45 + var57);
                  var8.method9687(var65 - 1L, var70 + var55);
                  var8.method9687(var67, var57 - var45);
                  var8.method9687(var67 - 1L, var70 - var55);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         long var62 = 2L * var19;

         for (long var61 = 0L; var61 < var3; var61++) {
            var19 = var61 * var1;
            long var64 = var9 + var62 + var1;
            long var66 = var6 + var1 - 1L + var19;
            var8.method9687(var64, -var5.method9653(var66 + var17));
            var8.method9687(var64 - 1L, var5.method9653(var66));
         }
      }
   }

   public void method27211(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      int var10 = var7;
      int var11 = var2 * var1;

      for (int var12 = 0; var12 < var2; var12++) {
         int var13 = var12 * var1;
         int var14 = 2 * var13;
         int var15 = var14 + var1;
         int var16 = var6 + var13;
         int var17 = var4 + var14;
         int var18 = var4 + var1 - 1 + var15;
         double var19 = var3[var17];
         double var21 = var3[var18];
         var5[var16] = var19 + var21;
         var5[var16 + var11] = var19 - var21;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var47 = 0; var47 < var2; var47++) {
               int var49 = var47 * var1;
               int var51 = 2 * var49;
               int var53 = var51 + var1;
               int var55 = var49 + var11;

               for (int var23 = 2; var23 < var1; var23 += 2) {
                  int var24 = var1 - var23;
                  int var57 = var23 - 1 + var10;
                  int var58 = var6 + var23;
                  int var25 = var4 + var23;
                  int var26 = var4 + var24;
                  double var27 = this.field34335[var57 - 1];
                  double var29 = this.field34335[var57];
                  int var31 = var25 + var51;
                  int var32 = var26 + var53;
                  int var33 = var58 + var49;
                  int var34 = var58 + var55;
                  double var35 = var3[var31 - 1] - var3[var32 - 1];
                  double var37 = var3[var31] + var3[var32];
                  double var39 = var3[var31];
                  double var41 = var3[var31 - 1];
                  double var43 = var3[var32];
                  double var45 = var3[var32 - 1];
                  var5[var33 - 1] = var41 + var45;
                  var5[var33] = var39 - var43;
                  var5[var34 - 1] = var27 * var35 - var29 * var37;
                  var5[var34] = var27 * var37 + var29 * var35;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         for (int var48 = 0; var48 < var2; var48++) {
            int var50 = var48 * var1;
            int var52 = 2 * var50;
            int var54 = var6 + var1 - 1 + var50;
            int var56 = var4 + var52 + var1;
            var5[var54] = 2.0 * var3[var56 - 1];
            var5[var54 + var11] = -2.0 * var3[var56];
         }
      }
   }

   public void method27212(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      long var15 = var11;
      long var17 = var3 * var1;

      for (long var19 = 0L; var19 < var3; var19++) {
         long var21 = var19 * var1;
         long var23 = 2L * var21;
         long var25 = var23 + var1;
         long var27 = var9 + var21;
         long var29 = var6 + var23;
         long var31 = var6 + var1 - 1L + var25;
         double var33 = var5.method9653(var29);
         double var35 = var5.method9653(var31);
         var8.method9687(var27, var33 + var35);
         var8.method9687(var27 + var17, var33 - var35);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var65 = 0L; var65 < var3; var65++) {
               long var67 = var65 * var1;
               long var69 = 2L * var67;
               long var71 = var69 + var1;
               long var73 = var67 + var17;

               for (long var37 = 2L; var37 < var1; var37 += 2L) {
                  long var39 = var1 - var37;
                  long var75 = var37 - 1L + var15;
                  long var76 = var9 + var37;
                  long var77 = var6 + var37;
                  long var78 = var6 + var39;
                  double var41 = this.field34336.method9653(var75 - 1L);
                  double var43 = this.field34336.method9653(var75);
                  long var45 = var77 + var69;
                  long var47 = var78 + var71;
                  long var49 = var76 + var67;
                  long var51 = var76 + var73;
                  double var53 = var5.method9653(var45 - 1L) - var5.method9653(var47 - 1L);
                  double var55 = var5.method9653(var45) + var5.method9653(var47);
                  double var57 = var5.method9653(var45);
                  double var59 = var5.method9653(var45 - 1L);
                  double var61 = var5.method9653(var47);
                  double var63 = var5.method9653(var47 - 1L);
                  var8.method9687(var49 - 1L, var59 + var63);
                  var8.method9687(var49, var57 - var61);
                  var8.method9687(var51 - 1L, var41 * var53 - var43 * var55);
                  var8.method9687(var51, var41 * var55 + var43 * var53);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         for (long var66 = 0L; var66 < var3; var66++) {
            long var68 = var66 * var1;
            long var70 = 2L * var68;
            long var72 = var9 + var1 - 1L + var68;
            long var74 = var6 + var70 + var1;
            var8.method9687(var72, 2.0 * var5.method9653(var74 - 1L));
            var8.method9687(var72 + var17, -2.0 * var5.method9653(var74));
         }
      }
   }

   public void method27213(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      double var10 = -0.5;
      double var12 = 0.8660254037844387;
      int var14 = var7;
      int var15 = var7 + var1;
      int var16 = var2 * var1;

      for (int var17 = 0; var17 < var2; var17++) {
         int var18 = var17 * var1;
         int var19 = 2 * var16;
         int var20 = (3 * var17 + 1) * var1;
         int var21 = var4 + var18;
         int var22 = var21 + var16;
         int var23 = var21 + var19;
         double var24 = var3[var21];
         double var26 = var3[var22];
         double var28 = var3[var23];
         double var30 = var26 + var28;
         var5[var6 + 3 * var18] = var24 + var30;
         var5[var6 + var20 + var1] = 0.8660254037844387 * (var28 - var26);
         var5[var6 + var1 - 1 + var20] = var24 + -0.5 * var30;
      }

      if (var1 != 1) {
         for (int var83 = 0; var83 < var2; var83++) {
            int var84 = var83 * var1;
            int var85 = 3 * var84;
            int var86 = var84 + var16;
            int var87 = var86 + var16;
            int var88 = var85 + var1;
            int var89 = var88 + var1;

            for (int var32 = 2; var32 < var1; var32 += 2) {
               int var33 = var1 - var32;
               int var34 = var32 - 1 + var14;
               int var35 = var32 - 1 + var15;
               double var36 = this.field34335[var34 - 1];
               double var38 = this.field34335[var34];
               double var40 = this.field34335[var35 - 1];
               double var42 = this.field34335[var35];
               int var44 = var4 + var32;
               int var45 = var6 + var32;
               int var46 = var6 + var33;
               int var47 = var44 + var84;
               int var48 = var44 + var86;
               int var49 = var44 + var87;
               double var50 = var3[var47 - 1];
               double var52 = var3[var47];
               double var54 = var3[var48 - 1];
               double var56 = var3[var48];
               double var58 = var3[var49 - 1];
               double var60 = var3[var49];
               double var62 = var36 * var54 + var38 * var56;
               double var64 = var36 * var56 - var38 * var54;
               double var66 = var40 * var58 + var42 * var60;
               double var68 = var40 * var60 - var42 * var58;
               double var90 = var62 + var66;
               double var70 = var64 + var68;
               double var72 = var50 + -0.5 * var90;
               double var74 = var52 + -0.5 * var70;
               double var76 = 0.8660254037844387 * (var64 - var68);
               double var78 = 0.8660254037844387 * (var66 - var62);
               int var80 = var45 + var85;
               int var81 = var46 + var88;
               int var82 = var45 + var89;
               var5[var80 - 1] = var50 + var90;
               var5[var80] = var52 + var70;
               var5[var81 - 1] = var72 - var76;
               var5[var81] = var78 - var74;
               var5[var82 - 1] = var72 + var76;
               var5[var82] = var74 + var78;
            }
         }
      }
   }

   public void method27214(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      double var15 = -0.5;
      double var17 = 0.8660254037844387;
      long var19 = var11;
      long var21 = var11 + var1;
      long var23 = var3 * var1;

      for (long var25 = 0L; var25 < var3; var25++) {
         long var27 = var25 * var1;
         long var29 = 2L * var23;
         long var31 = (3L * var25 + 1L) * var1;
         long var33 = var6 + var27;
         long var35 = var33 + var23;
         long var37 = var33 + var29;
         double var39 = var5.method9653(var33);
         double var41 = var5.method9653(var35);
         double var43 = var5.method9653(var37);
         double var45 = var41 + var43;
         var8.method9687(var9 + 3L * var27, var39 + var45);
         var8.method9687(var9 + var31 + var1, 0.8660254037844387 * (var43 - var41));
         var8.method9687(var9 + var1 - 1L + var31, var39 + -0.5 * var45);
      }

      if (var1 != 1L) {
         for (long var105 = 0L; var105 < var3; var105++) {
            long var106 = var105 * var1;
            long var107 = 3L * var106;
            long var108 = var106 + var23;
            long var109 = var108 + var23;
            long var110 = var107 + var1;
            long var111 = var110 + var1;

            for (long var47 = 2L; var47 < var1; var47 += 2L) {
               long var49 = var1 - var47;
               long var112 = var47 - 1L + var19;
               long var113 = var47 - 1L + var21;
               double var51 = this.field34336.method9653(var112 - 1L);
               double var53 = this.field34336.method9653(var112);
               double var55 = this.field34336.method9653(var113 - 1L);
               double var57 = this.field34336.method9653(var113);
               long var114 = var6 + var47;
               long var59 = var9 + var47;
               long var61 = var9 + var49;
               long var63 = var114 + var106;
               long var65 = var114 + var108;
               long var67 = var114 + var109;
               double var69 = var5.method9653(var63 - 1L);
               double var71 = var5.method9653(var63);
               double var73 = var5.method9653(var65 - 1L);
               double var75 = var5.method9653(var65);
               double var77 = var5.method9653(var67 - 1L);
               double var79 = var5.method9653(var67);
               double var81 = var51 * var73 + var53 * var75;
               double var83 = var51 * var75 - var53 * var73;
               double var85 = var55 * var77 + var57 * var79;
               double var87 = var55 * var79 - var57 * var77;
               double var115 = var81 + var85;
               double var89 = var83 + var87;
               double var91 = var69 + -0.5 * var115;
               double var93 = var71 + -0.5 * var89;
               double var95 = 0.8660254037844387 * (var83 - var87);
               double var97 = 0.8660254037844387 * (var85 - var81);
               long var99 = var59 + var107;
               long var101 = var61 + var110;
               long var103 = var59 + var111;
               var8.method9687(var99 - 1L, var69 + var115);
               var8.method9687(var99, var71 + var89);
               var8.method9687(var101 - 1L, var91 - var95);
               var8.method9687(var101, var97 - var93);
               var8.method9687(var103 - 1L, var91 + var95);
               var8.method9687(var103, var93 + var97);
            }
         }
      }
   }

   public void method27215(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      double var10 = -0.5;
      double var12 = 0.8660254037844387;
      int var14 = var7;
      int var15 = var7 + var1;

      for (int var16 = 0; var16 < var2; var16++) {
         int var17 = var16 * var1;
         int var18 = var4 + 3 * var17;
         int var19 = var18 + 2 * var1;
         double var20 = var3[var18];
         double var22 = 2.0 * var3[var19 - 1];
         double var24 = var20 + -0.5 * var22;
         double var26 = 1.7320508075688774 * var3[var19];
         var5[var6 + var17] = var20 + var22;
         var5[var6 + (var16 + var2) * var1] = var24 - var26;
         var5[var6 + (var16 + 2 * var2) * var1] = var24 + var26;
      }

      if (var1 != 1) {
         int var79 = var2 * var1;

         for (int var80 = 0; var80 < var2; var80++) {
            int var81 = var80 * var1;
            int var82 = 3 * var81;
            int var28 = var82 + var1;
            int var29 = var28 + var1;
            int var30 = var81 + var79;
            int var31 = var30 + var79;

            for (int var32 = 2; var32 < var1; var32 += 2) {
               int var33 = var1 - var32;
               int var34 = var4 + var32;
               int var35 = var4 + var33;
               int var36 = var6 + var32;
               int var37 = var34 + var82;
               int var38 = var34 + var29;
               int var39 = var35 + var28;
               double var40 = var3[var37 - 1];
               double var42 = var3[var37];
               double var44 = var3[var38 - 1];
               double var46 = var3[var38];
               double var48 = var3[var39 - 1];
               double var50 = var3[var39];
               double var83 = var44 + var48;
               double var84 = var40 + -0.5 * var83;
               double var52 = var46 - var50;
               double var54 = var42 + -0.5 * var52;
               double var56 = 0.8660254037844387 * (var44 - var48);
               double var85 = 0.8660254037844387 * (var46 + var50);
               double var58 = var84 - var85;
               double var60 = var84 + var85;
               double var62 = var54 + var56;
               double var64 = var54 - var56;
               int var66 = var32 - 1 + var14;
               int var67 = var32 - 1 + var15;
               double var68 = this.field34335[var66 - 1];
               double var70 = this.field34335[var66];
               double var72 = this.field34335[var67 - 1];
               double var74 = this.field34335[var67];
               int var76 = var36 + var81;
               int var77 = var36 + var30;
               int var78 = var36 + var31;
               var5[var76 - 1] = var40 + var83;
               var5[var76] = var42 + var52;
               var5[var77 - 1] = var68 * var58 - var70 * var62;
               var5[var77] = var68 * var62 + var70 * var58;
               var5[var78 - 1] = var72 * var60 - var74 * var64;
               var5[var78] = var72 * var64 + var74 * var60;
            }
         }
      }
   }

   public void method27216(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      double var15 = -0.5;
      double var17 = 0.8660254037844387;
      long var19 = var11;
      long var21 = var11 + var1;

      for (long var23 = 0L; var23 < var3; var23++) {
         long var25 = var23 * var1;
         long var27 = var6 + 3L * var25;
         long var29 = var27 + 2L * var1;
         double var31 = var5.method9653(var27);
         double var33 = 2.0 * var5.method9653(var29 - 1L);
         double var35 = var31 + -0.5 * var33;
         double var37 = 1.7320508075688774 * var5.method9653(var29);
         var8.method9687(var9 + var25, var31 + var33);
         var8.method9687(var9 + (var23 + var3) * var1, var35 - var37);
         var8.method9687(var9 + (var23 + 2L * var3) * var1, var35 + var37);
      }

      if (var1 != 1L) {
         long var105 = var3 * var1;

         for (long var106 = 0L; var106 < var3; var106++) {
            long var107 = var106 * var1;
            long var108 = 3L * var107;
            long var109 = var108 + var1;
            long var39 = var109 + var1;
            long var41 = var107 + var105;
            long var43 = var41 + var105;

            for (long var45 = 2L; var45 < var1; var45 += 2L) {
               long var47 = var1 - var45;
               long var49 = var6 + var45;
               long var51 = var6 + var47;
               long var53 = var9 + var45;
               long var55 = var49 + var108;
               long var57 = var49 + var39;
               long var59 = var51 + var109;
               double var61 = var5.method9653(var55 - 1L);
               double var63 = var5.method9653(var55);
               double var65 = var5.method9653(var57 - 1L);
               double var67 = var5.method9653(var57);
               double var69 = var5.method9653(var59 - 1L);
               double var71 = var5.method9653(var59);
               double var110 = var65 + var69;
               double var111 = var61 + -0.5 * var110;
               double var73 = var67 - var71;
               double var75 = var63 + -0.5 * var73;
               double var77 = 0.8660254037844387 * (var65 - var69);
               double var112 = 0.8660254037844387 * (var67 + var71);
               double var79 = var111 - var112;
               double var81 = var111 + var112;
               double var83 = var75 + var77;
               double var85 = var75 - var77;
               long var87 = var45 - 1L + var19;
               long var89 = var45 - 1L + var21;
               double var91 = this.field34336.method9653(var87 - 1L);
               double var93 = this.field34336.method9653(var87);
               double var95 = this.field34336.method9653(var89 - 1L);
               double var97 = this.field34336.method9653(var89);
               long var99 = var53 + var107;
               long var101 = var53 + var41;
               long var103 = var53 + var43;
               var8.method9687(var99 - 1L, var61 + var110);
               var8.method9687(var99, var63 + var73);
               var8.method9687(var101 - 1L, var91 * var79 - var93 * var83);
               var8.method9687(var101, var91 * var83 + var93 * var79);
               var8.method9687(var103 - 1L, var95 * var81 - var97 * var85);
               var8.method9687(var103, var95 * var85 + var97 * var81);
            }
         }
      }
   }

   public void method27217(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      double var10 = 0.7071067811865476;
      int var12 = var7;
      int var13 = var7 + var1;
      int var14 = var13 + var1;
      int var15 = var2 * var1;

      for (int var16 = 0; var16 < var2; var16++) {
         int var17 = var16 * var1;
         int var18 = 4 * var17;
         int var19 = var17 + var15;
         int var20 = var19 + var15;
         int var21 = var20 + var15;
         int var22 = var18 + var1;
         double var23 = var3[var4 + var17];
         double var25 = var3[var4 + var19];
         double var27 = var3[var4 + var20];
         double var29 = var3[var4 + var21];
         double var31 = var25 + var29;
         double var33 = var23 + var27;
         int var35 = var6 + var18;
         int var36 = var6 + var22 + var1;
         var5[var35] = var31 + var33;
         var5[var36 - 1 + var1 + var1] = var33 - var31;
         var5[var36 - 1] = var23 - var27;
         var5[var36] = var29 - var25;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var109 = 0; var109 < var2; var109++) {
               int var111 = var109 * var1;
               int var113 = var111 + var15;
               int var115 = var113 + var15;
               int var117 = var115 + var15;
               int var119 = 4 * var111;
               int var121 = var119 + var1;
               int var37 = var121 + var1;
               int var38 = var37 + var1;

               for (int var39 = 2; var39 < var1; var39 += 2) {
                  int var40 = var1 - var39;
                  int var41 = var39 - 1 + var12;
                  int var42 = var39 - 1 + var13;
                  int var43 = var39 - 1 + var14;
                  double var44 = this.field34335[var41 - 1];
                  double var46 = this.field34335[var41];
                  double var48 = this.field34335[var42 - 1];
                  double var50 = this.field34335[var42];
                  double var52 = this.field34335[var43 - 1];
                  double var54 = this.field34335[var43];
                  int var56 = var4 + var39;
                  int var57 = var6 + var39;
                  int var58 = var6 + var40;
                  int var128 = var56 + var111;
                  int var129 = var56 + var113;
                  int var59 = var56 + var115;
                  int var60 = var56 + var117;
                  double var61 = var3[var128 - 1];
                  double var63 = var3[var128];
                  double var65 = var3[var129 - 1];
                  double var67 = var3[var129];
                  double var69 = var3[var59 - 1];
                  double var71 = var3[var59];
                  double var73 = var3[var60 - 1];
                  double var75 = var3[var60];
                  double var77 = var44 * var65 + var46 * var67;
                  double var79 = var44 * var67 - var46 * var65;
                  double var81 = var48 * var69 + var50 * var71;
                  double var83 = var48 * var71 - var50 * var69;
                  double var85 = var52 * var73 + var54 * var75;
                  double var87 = var52 * var75 - var54 * var73;
                  double var125 = var77 + var85;
                  double var89 = var85 - var77;
                  double var91 = var79 + var87;
                  double var93 = var79 - var87;
                  double var95 = var63 + var83;
                  double var97 = var63 - var83;
                  double var127 = var61 + var81;
                  double var99 = var61 - var81;
                  int var101 = var57 + var119;
                  int var102 = var58 + var121;
                  int var103 = var57 + var37;
                  int var104 = var58 + var38;
                  var5[var101 - 1] = var125 + var127;
                  var5[var104 - 1] = var127 - var125;
                  var5[var101] = var91 + var95;
                  var5[var104] = var91 - var95;
                  var5[var103 - 1] = var93 + var99;
                  var5[var102 - 1] = var99 - var93;
                  var5[var103] = var89 + var97;
                  var5[var102] = var89 - var97;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         for (int var110 = 0; var110 < var2; var110++) {
            int var112 = var110 * var1;
            int var114 = 4 * var112;
            int var116 = var112 + var15;
            int var118 = var116 + var15;
            int var120 = var118 + var15;
            int var122 = var114 + var1;
            int var130 = var122 + var1;
            int var131 = var130 + var1;
            int var132 = var4 + var1;
            int var133 = var6 + var1;
            double var123 = var3[var132 - 1 + var112];
            double var124 = var3[var132 - 1 + var116];
            double var105 = var3[var132 - 1 + var118];
            double var107 = var3[var132 - 1 + var120];
            double var134 = -0.7071067811865476 * (var124 + var107);
            double var126 = 0.7071067811865476 * (var124 - var107);
            var5[var133 - 1 + var114] = var126 + var123;
            var5[var133 - 1 + var130] = var123 - var126;
            var5[var6 + var122] = var134 - var105;
            var5[var6 + var131] = var134 + var105;
         }
      }
   }

   public void method27218(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      double var15 = 0.7071067811865476;
      long var17 = var11;
      long var19 = var11 + var1;
      long var21 = var19 + var1;
      long var23 = var3 * var1;

      for (long var25 = 0L; var25 < var3; var25++) {
         long var27 = var25 * var1;
         long var29 = 4L * var27;
         long var31 = var27 + var23;
         long var33 = var31 + var23;
         long var35 = var33 + var23;
         long var37 = var29 + var1;
         double var39 = var5.method9653(var6 + var27);
         double var41 = var5.method9653(var6 + var31);
         double var43 = var5.method9653(var6 + var33);
         double var45 = var5.method9653(var6 + var35);
         double var47 = var41 + var45;
         double var49 = var39 + var43;
         long var51 = var9 + var29;
         long var53 = var9 + var37 + var1;
         var8.method9687(var51, var47 + var49);
         var8.method9687(var53 - 1L + var1 + var1, var49 - var47);
         var8.method9687(var53 - 1L, var39 - var43);
         var8.method9687(var53, var45 - var41);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var131 = 0L; var131 < var3; var131++) {
               long var133 = var131 * var1;
               long var135 = var133 + var23;
               long var137 = var135 + var23;
               long var139 = var137 + var23;
               long var141 = 4L * var133;
               long var143 = var141 + var1;
               long var145 = var143 + var1;
               long var147 = var145 + var1;

               for (long var55 = 2L; var55 < var1; var55 += 2L) {
                  long var57 = var1 - var55;
                  long var149 = var55 - 1L + var17;
                  long var151 = var55 - 1L + var19;
                  long var156 = var55 - 1L + var21;
                  double var59 = this.field34336.method9653(var149 - 1L);
                  double var61 = this.field34336.method9653(var149);
                  double var63 = this.field34336.method9653(var151 - 1L);
                  double var65 = this.field34336.method9653(var151);
                  double var67 = this.field34336.method9653(var156 - 1L);
                  double var69 = this.field34336.method9653(var156);
                  long var158 = var6 + var55;
                  long var71 = var9 + var55;
                  long var73 = var9 + var57;
                  long var75 = var158 + var133;
                  long var77 = var158 + var135;
                  long var79 = var158 + var137;
                  long var81 = var158 + var139;
                  double var83 = var5.method9653(var75 - 1L);
                  double var85 = var5.method9653(var75);
                  double var87 = var5.method9653(var77 - 1L);
                  double var89 = var5.method9653(var77);
                  double var91 = var5.method9653(var79 - 1L);
                  double var93 = var5.method9653(var79);
                  double var95 = var5.method9653(var81 - 1L);
                  double var97 = var5.method9653(var81);
                  double var99 = var59 * var87 + var61 * var89;
                  double var101 = var59 * var89 - var61 * var87;
                  double var103 = var63 * var91 + var65 * var93;
                  double var105 = var63 * var93 - var65 * var91;
                  double var107 = var67 * var95 + var69 * var97;
                  double var109 = var67 * var97 - var69 * var95;
                  double var153 = var99 + var107;
                  double var111 = var107 - var99;
                  double var113 = var101 + var109;
                  double var115 = var101 - var109;
                  double var117 = var85 + var105;
                  double var119 = var85 - var105;
                  double var155 = var83 + var103;
                  double var121 = var83 - var103;
                  long var123 = var71 + var141;
                  long var125 = var73 + var143;
                  long var127 = var71 + var145;
                  long var129 = var73 + var147;
                  var8.method9687(var123 - 1L, var153 + var155);
                  var8.method9687(var129 - 1L, var155 - var153);
                  var8.method9687(var123, var113 + var117);
                  var8.method9687(var129, var113 - var117);
                  var8.method9687(var127 - 1L, var115 + var121);
                  var8.method9687(var125 - 1L, var121 - var115);
                  var8.method9687(var127, var111 + var119);
                  var8.method9687(var125, var111 - var119);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         for (long var132 = 0L; var132 < var3; var132++) {
            long var134 = var132 * var1;
            long var136 = 4L * var134;
            long var138 = var134 + var23;
            long var140 = var138 + var23;
            long var142 = var140 + var23;
            long var144 = var136 + var1;
            long var146 = var144 + var1;
            long var148 = var146 + var1;
            long var150 = var6 + var1;
            long var152 = var9 + var1;
            double var157 = var5.method9653(var150 - 1L + var134);
            double var159 = var5.method9653(var150 - 1L + var138);
            double var160 = var5.method9653(var150 - 1L + var140);
            double var161 = var5.method9653(var150 - 1L + var142);
            double var162 = -0.7071067811865476 * (var159 + var161);
            double var154 = 0.7071067811865476 * (var159 - var161);
            var8.method9687(var152 - 1L + var136, var154 + var157);
            var8.method9687(var152 - 1L + var146, var157 - var154);
            var8.method9687(var9 + var144, var162 - var160);
            var8.method9687(var9 + var148, var162 + var160);
         }
      }
   }

   public void method27219(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      double var10 = 1.4142135623730951;
      int var12 = var7;
      int var13 = var7 + var1;
      int var14 = var13 + var1;
      int var15 = var2 * var1;

      for (int var16 = 0; var16 < var2; var16++) {
         int var17 = var16 * var1;
         int var18 = 4 * var17;
         int var19 = var17 + var15;
         int var20 = var19 + var15;
         int var21 = var20 + var15;
         int var22 = var18 + var1;
         int var23 = var22 + var1;
         int var24 = var23 + var1;
         double var25 = var3[var4 + var18];
         double var27 = var3[var4 + var23];
         double var29 = var3[var4 + var1 - 1 + var24];
         double var31 = var3[var4 + var1 - 1 + var22];
         double var33 = var25 - var29;
         double var35 = var25 + var29;
         double var37 = var31 + var31;
         double var39 = var27 + var27;
         var5[var6 + var17] = var35 + var37;
         var5[var6 + var19] = var33 - var39;
         var5[var6 + var20] = var35 - var37;
         var5[var6 + var21] = var33 + var39;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var107 = 0; var107 < var2; var107++) {
               int var109 = var107 * var1;
               int var111 = var109 + var15;
               int var113 = var111 + var15;
               int var115 = var113 + var15;
               int var117 = 4 * var109;
               int var119 = var117 + var1;
               int var121 = var119 + var1;
               int var123 = var121 + var1;

               for (int var41 = 2; var41 < var1; var41 += 2) {
                  int var42 = var1 - var41;
                  int var43 = var41 - 1 + var12;
                  int var44 = var41 - 1 + var13;
                  int var45 = var41 - 1 + var14;
                  double var46 = this.field34335[var43 - 1];
                  double var48 = this.field34335[var43];
                  double var50 = this.field34335[var44 - 1];
                  double var52 = this.field34335[var44];
                  double var54 = this.field34335[var45 - 1];
                  double var56 = this.field34335[var45];
                  int var58 = var4 + var41;
                  int var59 = var4 + var42;
                  int var60 = var6 + var41;
                  int var61 = var58 + var117;
                  int var62 = var59 + var119;
                  int var63 = var58 + var121;
                  int var64 = var59 + var123;
                  double var65 = var3[var61 - 1];
                  double var67 = var3[var61];
                  double var69 = var3[var62 - 1];
                  double var71 = var3[var62];
                  double var73 = var3[var63 - 1];
                  double var75 = var3[var63];
                  double var77 = var3[var64 - 1];
                  double var79 = var3[var64];
                  double var81 = var67 + var79;
                  double var83 = var67 - var79;
                  double var85 = var75 - var71;
                  double var133 = var75 + var71;
                  double var128 = var65 - var77;
                  double var130 = var65 + var77;
                  double var87 = var73 - var69;
                  double var132 = var73 + var69;
                  double var89 = var130 - var132;
                  double var91 = var83 - var85;
                  double var93 = var128 - var133;
                  double var95 = var128 + var133;
                  double var97 = var81 + var87;
                  double var99 = var81 - var87;
                  int var101 = var60 + var109;
                  int var102 = var60 + var111;
                  int var103 = var60 + var113;
                  int var104 = var60 + var115;
                  var5[var101 - 1] = var130 + var132;
                  var5[var101] = var83 + var85;
                  var5[var102 - 1] = var46 * var93 - var48 * var97;
                  var5[var102] = var46 * var97 + var48 * var93;
                  var5[var103 - 1] = var50 * var89 - var52 * var91;
                  var5[var103] = var50 * var91 + var52 * var89;
                  var5[var104 - 1] = var54 * var95 - var56 * var99;
                  var5[var104] = var54 * var99 + var56 * var95;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         for (int var108 = 0; var108 < var2; var108++) {
            int var110 = var108 * var1;
            int var112 = 4 * var110;
            int var114 = var110 + var15;
            int var116 = var114 + var15;
            int var118 = var116 + var15;
            int var120 = var112 + var1;
            int var122 = var120 + var1;
            int var124 = var122 + var1;
            int var134 = var4 + var1;
            int var135 = var6 + var1;
            double var125 = var3[var134 - 1 + var112];
            double var126 = var3[var134 - 1 + var122];
            double var127 = var3[var4 + var120];
            double var105 = var3[var4 + var124];
            double var136 = var127 + var105;
            double var137 = var105 - var127;
            double var129 = var125 - var126;
            double var131 = var125 + var126;
            var5[var135 - 1 + var110] = var131 + var131;
            var5[var135 - 1 + var114] = 1.4142135623730951 * (var129 - var136);
            var5[var135 - 1 + var116] = var137 + var137;
            var5[var135 - 1 + var118] = -1.4142135623730951 * (var129 + var136);
         }
      }
   }

   public void method27220(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      double var15 = 1.4142135623730951;
      long var17 = var11;
      long var19 = var11 + var1;
      long var21 = var19 + var1;
      long var23 = var3 * var1;

      for (long var25 = 0L; var25 < var3; var25++) {
         long var27 = var25 * var1;
         long var29 = 4L * var27;
         long var31 = var27 + var23;
         long var33 = var31 + var23;
         long var35 = var33 + var23;
         long var37 = var29 + var1;
         long var39 = var37 + var1;
         long var41 = var39 + var1;
         double var43 = var5.method9653(var6 + var29);
         double var45 = var5.method9653(var6 + var39);
         double var47 = var5.method9653(var6 + var1 - 1L + var41);
         double var49 = var5.method9653(var6 + var1 - 1L + var37);
         double var51 = var43 - var47;
         double var53 = var43 + var47;
         double var55 = var49 + var49;
         double var57 = var45 + var45;
         var8.method9687(var9 + var27, var53 + var55);
         var8.method9687(var9 + var31, var51 - var57);
         var8.method9687(var9 + var33, var53 - var55);
         var8.method9687(var9 + var35, var51 + var57);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var131 = 0L; var131 < var3; var131++) {
               long var133 = var131 * var1;
               long var135 = var133 + var23;
               long var137 = var135 + var23;
               long var139 = var137 + var23;
               long var141 = 4L * var133;
               long var143 = var141 + var1;
               long var145 = var143 + var1;
               long var147 = var145 + var1;

               for (long var59 = 2L; var59 < var1; var59 += 2L) {
                  long var61 = var1 - var59;
                  long var149 = var59 - 1L + var17;
                  long var151 = var59 - 1L + var19;
                  long var153 = var59 - 1L + var21;
                  double var63 = this.field34336.method9653(var149 - 1L);
                  double var65 = this.field34336.method9653(var149);
                  double var67 = this.field34336.method9653(var151 - 1L);
                  double var69 = this.field34336.method9653(var151);
                  double var71 = this.field34336.method9653(var153 - 1L);
                  double var73 = this.field34336.method9653(var153);
                  long var155 = var6 + var59;
                  long var75 = var6 + var61;
                  long var77 = var9 + var59;
                  long var79 = var155 + var141;
                  long var81 = var75 + var143;
                  long var83 = var155 + var145;
                  long var85 = var75 + var147;
                  double var87 = var5.method9653(var79 - 1L);
                  double var89 = var5.method9653(var79);
                  double var91 = var5.method9653(var81 - 1L);
                  double var93 = var5.method9653(var81);
                  double var95 = var5.method9653(var83 - 1L);
                  double var97 = var5.method9653(var83);
                  double var99 = var5.method9653(var85 - 1L);
                  double var101 = var5.method9653(var85);
                  double var103 = var89 + var101;
                  double var105 = var89 - var101;
                  double var107 = var97 - var93;
                  double var162 = var97 + var93;
                  double var157 = var87 - var99;
                  double var159 = var87 + var99;
                  double var109 = var95 - var91;
                  double var161 = var95 + var91;
                  double var111 = var159 - var161;
                  double var113 = var105 - var107;
                  double var115 = var157 - var162;
                  double var117 = var157 + var162;
                  double var119 = var103 + var109;
                  double var121 = var103 - var109;
                  long var123 = var77 + var133;
                  long var125 = var77 + var135;
                  long var127 = var77 + var137;
                  long var129 = var77 + var139;
                  var8.method9687(var123 - 1L, var159 + var161);
                  var8.method9687(var123, var105 + var107);
                  var8.method9687(var125 - 1L, var63 * var115 - var65 * var119);
                  var8.method9687(var125, var63 * var119 + var65 * var115);
                  var8.method9687(var127 - 1L, var67 * var111 - var69 * var113);
                  var8.method9687(var127, var67 * var113 + var69 * var111);
                  var8.method9687(var129 - 1L, var71 * var117 - var73 * var121);
                  var8.method9687(var129, var71 * var121 + var73 * var117);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         for (long var132 = 0L; var132 < var3; var132++) {
            long var134 = var132 * var1;
            long var136 = 4L * var134;
            long var138 = var134 + var23;
            long var140 = var138 + var23;
            long var142 = var140 + var23;
            long var144 = var136 + var1;
            long var146 = var144 + var1;
            long var148 = var146 + var1;
            long var150 = var6 + var1;
            long var152 = var9 + var1;
            double var154 = var5.method9653(var150 - 1L + var136);
            double var156 = var5.method9653(var150 - 1L + var146);
            double var163 = var5.method9653(var6 + var144);
            double var164 = var5.method9653(var6 + var148);
            double var165 = var163 + var164;
            double var166 = var164 - var163;
            double var158 = var154 - var156;
            double var160 = var154 + var156;
            var8.method9687(var152 - 1L + var134, var160 + var160);
            var8.method9687(var152 - 1L + var138, 1.4142135623730951 * (var158 - var165));
            var8.method9687(var152 - 1L + var140, var166 + var166);
            var8.method9687(var152 - 1L + var142, -1.4142135623730951 * (var158 + var165));
         }
      }
   }

   public void method27221(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      double var10 = 0.30901699437494745;
      double var12 = 0.9510565162951535;
      double var14 = -0.8090169943749473;
      double var16 = 0.5877852522924732;
      int var18 = var7;
      int var19 = var7 + var1;
      int var20 = var19 + var1;
      int var21 = var20 + var1;
      int var22 = var2 * var1;

      for (int var23 = 0; var23 < var2; var23++) {
         int var24 = var23 * var1;
         int var25 = 5 * var24;
         int var26 = var25 + var1;
         int var27 = var26 + var1;
         int var28 = var27 + var1;
         int var29 = var28 + var1;
         int var30 = var24 + var22;
         int var31 = var30 + var22;
         int var32 = var31 + var22;
         int var33 = var32 + var22;
         int var34 = var6 + var1 - 1;
         double var35 = var3[var4 + var24];
         double var37 = var3[var4 + var30];
         double var39 = var3[var4 + var31];
         double var41 = var3[var4 + var32];
         double var43 = var3[var4 + var33];
         double var45 = var43 + var37;
         double var47 = var43 - var37;
         double var49 = var41 + var39;
         double var51 = var41 - var39;
         var5[var6 + var25] = var35 + var45 + var49;
         var5[var34 + var26] = var35 + 0.30901699437494745 * var45 + -0.8090169943749473 * var49;
         var5[var6 + var27] = 0.9510565162951535 * var47 + 0.5877852522924732 * var51;
         var5[var34 + var28] = var35 + -0.8090169943749473 * var45 + 0.30901699437494745 * var49;
         var5[var6 + var29] = 0.5877852522924732 * var47 - 0.9510565162951535 * var51;
      }

      if (var1 != 1) {
         for (int var147 = 0; var147 < var2; var147++) {
            int var148 = var147 * var1;
            int var149 = 5 * var148;
            int var150 = var149 + var1;
            int var151 = var150 + var1;
            int var152 = var151 + var1;
            int var153 = var152 + var1;
            int var154 = var148 + var22;
            int var155 = var154 + var22;
            int var156 = var155 + var22;
            int var157 = var156 + var22;

            for (int var53 = 2; var53 < var1; var53 += 2) {
               int var158 = var53 - 1 + var18;
               int var54 = var53 - 1 + var19;
               int var55 = var53 - 1 + var20;
               int var56 = var53 - 1 + var21;
               double var57 = this.field34335[var158 - 1];
               double var59 = this.field34335[var158];
               double var61 = this.field34335[var54 - 1];
               double var63 = this.field34335[var54];
               double var65 = this.field34335[var55 - 1];
               double var67 = this.field34335[var55];
               double var69 = this.field34335[var56 - 1];
               double var71 = this.field34335[var56];
               int var73 = var1 - var53;
               int var74 = var4 + var53;
               int var75 = var6 + var53;
               int var76 = var6 + var73;
               int var77 = var74 + var148;
               int var78 = var74 + var154;
               int var79 = var74 + var155;
               int var80 = var74 + var156;
               int var81 = var74 + var157;
               double var82 = var3[var77 - 1];
               double var84 = var3[var77];
               double var86 = var3[var78 - 1];
               double var88 = var3[var78];
               double var90 = var3[var79 - 1];
               double var92 = var3[var79];
               double var94 = var3[var80 - 1];
               double var96 = var3[var80];
               double var98 = var3[var81 - 1];
               double var100 = var3[var81];
               double var102 = var57 * var86 + var59 * var88;
               double var104 = var57 * var88 - var59 * var86;
               double var106 = var61 * var90 + var63 * var92;
               double var108 = var61 * var92 - var63 * var90;
               double var110 = var65 * var94 + var67 * var96;
               double var112 = var65 * var96 - var67 * var94;
               double var114 = var69 * var98 + var71 * var100;
               double var116 = var69 * var100 - var71 * var98;
               double var159 = var102 + var114;
               double var160 = var114 - var102;
               double var118 = var104 - var116;
               double var120 = var104 + var116;
               double var161 = var106 + var110;
               double var162 = var110 - var106;
               double var122 = var108 - var112;
               double var124 = var108 + var112;
               double var126 = var82 + 0.30901699437494745 * var159 + -0.8090169943749473 * var161;
               double var128 = var84 + 0.30901699437494745 * var120 + -0.8090169943749473 * var124;
               double var130 = var82 + -0.8090169943749473 * var159 + 0.30901699437494745 * var161;
               double var132 = var84 + -0.8090169943749473 * var120 + 0.30901699437494745 * var124;
               double var134 = 0.9510565162951535 * var118 + 0.5877852522924732 * var122;
               double var136 = 0.9510565162951535 * var160 + 0.5877852522924732 * var162;
               double var138 = 0.5877852522924732 * var118 - 0.9510565162951535 * var122;
               double var140 = 0.5877852522924732 * var160 - 0.9510565162951535 * var162;
               int var142 = var75 + var149;
               int var143 = var76 + var150;
               int var144 = var75 + var151;
               int var145 = var76 + var152;
               int var146 = var75 + var153;
               var5[var142 - 1] = var82 + var159 + var161;
               var5[var142] = var84 + var120 + var124;
               var5[var144 - 1] = var126 + var134;
               var5[var143 - 1] = var126 - var134;
               var5[var144] = var128 + var136;
               var5[var143] = var136 - var128;
               var5[var146 - 1] = var130 + var138;
               var5[var145 - 1] = var130 - var138;
               var5[var146] = var132 + var140;
               var5[var145] = var140 - var132;
            }
         }
      }
   }

   public void method27222(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      double var15 = 0.30901699437494745;
      double var17 = 0.9510565162951535;
      double var19 = -0.8090169943749473;
      double var21 = 0.5877852522924732;
      long var23 = var11;
      long var25 = var11 + var1;
      long var27 = var25 + var1;
      long var29 = var27 + var1;
      long var31 = var3 * var1;

      for (long var33 = 0L; var33 < var3; var33++) {
         long var35 = var33 * var1;
         long var37 = 5L * var35;
         long var39 = var37 + var1;
         long var41 = var39 + var1;
         long var43 = var41 + var1;
         long var45 = var43 + var1;
         long var47 = var35 + var31;
         long var49 = var47 + var31;
         long var51 = var49 + var31;
         long var53 = var51 + var31;
         long var55 = var9 + var1 - 1L;
         double var57 = var5.method9653(var6 + var35);
         double var59 = var5.method9653(var6 + var47);
         double var61 = var5.method9653(var6 + var49);
         double var63 = var5.method9653(var6 + var51);
         double var65 = var5.method9653(var6 + var53);
         double var67 = var65 + var59;
         double var69 = var65 - var59;
         double var71 = var63 + var61;
         double var73 = var63 - var61;
         var8.method9687(var9 + var37, var57 + var67 + var71);
         var8.method9687(var55 + var39, var57 + 0.30901699437494745 * var67 + -0.8090169943749473 * var71);
         var8.method9687(var9 + var41, 0.9510565162951535 * var69 + 0.5877852522924732 * var73);
         var8.method9687(var55 + var43, var57 + -0.8090169943749473 * var67 + 0.30901699437494745 * var71);
         var8.method9687(var9 + var45, 0.5877852522924732 * var69 - 0.9510565162951535 * var73);
      }

      if (var1 != 1L) {
         for (long var177 = 0L; var177 < var3; var177++) {
            long var178 = var177 * var1;
            long var179 = 5L * var178;
            long var180 = var179 + var1;
            long var181 = var180 + var1;
            long var182 = var181 + var1;
            long var183 = var182 + var1;
            long var184 = var178 + var31;
            long var185 = var184 + var31;
            long var186 = var185 + var31;
            long var187 = var186 + var31;

            for (long var75 = 2L; var75 < var1; var75 += 2L) {
               long var188 = var75 - 1L + var23;
               long var189 = var75 - 1L + var25;
               long var190 = var75 - 1L + var27;
               long var191 = var75 - 1L + var29;
               double var77 = this.field34336.method9653(var188 - 1L);
               double var79 = this.field34336.method9653(var188);
               double var81 = this.field34336.method9653(var189 - 1L);
               double var83 = this.field34336.method9653(var189);
               double var85 = this.field34336.method9653(var190 - 1L);
               double var87 = this.field34336.method9653(var190);
               double var89 = this.field34336.method9653(var191 - 1L);
               double var91 = this.field34336.method9653(var191);
               long var93 = var1 - var75;
               long var192 = var6 + var75;
               long var193 = var9 + var75;
               long var95 = var9 + var93;
               long var97 = var192 + var178;
               long var99 = var192 + var184;
               long var101 = var192 + var185;
               long var103 = var192 + var186;
               long var105 = var192 + var187;
               double var107 = var5.method9653(var97 - 1L);
               double var109 = var5.method9653(var97);
               double var111 = var5.method9653(var99 - 1L);
               double var113 = var5.method9653(var99);
               double var115 = var5.method9653(var101 - 1L);
               double var117 = var5.method9653(var101);
               double var119 = var5.method9653(var103 - 1L);
               double var121 = var5.method9653(var103);
               double var123 = var5.method9653(var105 - 1L);
               double var125 = var5.method9653(var105);
               double var127 = var77 * var111 + var79 * var113;
               double var129 = var77 * var113 - var79 * var111;
               double var131 = var81 * var115 + var83 * var117;
               double var133 = var81 * var117 - var83 * var115;
               double var135 = var85 * var119 + var87 * var121;
               double var137 = var85 * var121 - var87 * var119;
               double var139 = var89 * var123 + var91 * var125;
               double var141 = var89 * var125 - var91 * var123;
               double var194 = var127 + var139;
               double var195 = var139 - var127;
               double var143 = var129 - var141;
               double var145 = var129 + var141;
               double var196 = var131 + var135;
               double var197 = var135 - var131;
               double var147 = var133 - var137;
               double var149 = var133 + var137;
               double var151 = var107 + 0.30901699437494745 * var194 + -0.8090169943749473 * var196;
               double var153 = var109 + 0.30901699437494745 * var145 + -0.8090169943749473 * var149;
               double var155 = var107 + -0.8090169943749473 * var194 + 0.30901699437494745 * var196;
               double var157 = var109 + -0.8090169943749473 * var145 + 0.30901699437494745 * var149;
               double var159 = 0.9510565162951535 * var143 + 0.5877852522924732 * var147;
               double var161 = 0.9510565162951535 * var195 + 0.5877852522924732 * var197;
               double var163 = 0.5877852522924732 * var143 - 0.9510565162951535 * var147;
               double var165 = 0.5877852522924732 * var195 - 0.9510565162951535 * var197;
               long var167 = var193 + var179;
               long var169 = var95 + var180;
               long var171 = var193 + var181;
               long var173 = var95 + var182;
               long var175 = var193 + var183;
               var8.method9687(var167 - 1L, var107 + var194 + var196);
               var8.method9687(var167, var109 + var145 + var149);
               var8.method9687(var171 - 1L, var151 + var159);
               var8.method9687(var169 - 1L, var151 - var159);
               var8.method9687(var171, var153 + var161);
               var8.method9687(var169, var161 - var153);
               var8.method9687(var175 - 1L, var155 + var163);
               var8.method9687(var173 - 1L, var155 - var163);
               var8.method9687(var175, var157 + var165);
               var8.method9687(var173, var165 - var157);
            }
         }
      }
   }

   public void method27223(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7) {
      double var10 = 0.30901699437494745;
      double var12 = 0.9510565162951535;
      double var14 = -0.8090169943749473;
      double var16 = 0.5877852522924732;
      int var18 = var7;
      int var19 = var7 + var1;
      int var20 = var19 + var1;
      int var21 = var20 + var1;
      int var22 = var2 * var1;

      for (int var23 = 0; var23 < var2; var23++) {
         int var24 = var23 * var1;
         int var25 = 5 * var24;
         int var26 = var25 + var1;
         int var27 = var26 + var1;
         int var28 = var27 + var1;
         int var29 = var28 + var1;
         int var30 = var24 + var22;
         int var31 = var30 + var22;
         int var32 = var31 + var22;
         int var33 = var32 + var22;
         int var34 = var4 + var1 - 1;
         double var35 = var3[var4 + var25];
         double var37 = 2.0 * var3[var4 + var27];
         double var39 = 2.0 * var3[var4 + var29];
         double var41 = 2.0 * var3[var34 + var26];
         double var43 = 2.0 * var3[var34 + var28];
         double var45 = var35 + 0.30901699437494745 * var41 + -0.8090169943749473 * var43;
         double var47 = var35 + -0.8090169943749473 * var41 + 0.30901699437494745 * var43;
         double var49 = 0.9510565162951535 * var37 + 0.5877852522924732 * var39;
         double var51 = 0.5877852522924732 * var37 - 0.9510565162951535 * var39;
         var5[var6 + var24] = var35 + var41 + var43;
         var5[var6 + var30] = var45 - var49;
         var5[var6 + var31] = var47 - var51;
         var5[var6 + var32] = var47 + var51;
         var5[var6 + var33] = var45 + var49;
      }

      if (var1 != 1) {
         for (int var139 = 0; var139 < var2; var139++) {
            int var140 = var139 * var1;
            int var141 = 5 * var140;
            int var142 = var141 + var1;
            int var143 = var142 + var1;
            int var144 = var143 + var1;
            int var145 = var144 + var1;
            int var146 = var140 + var22;
            int var147 = var146 + var22;
            int var148 = var147 + var22;
            int var149 = var148 + var22;

            for (int var53 = 2; var53 < var1; var53 += 2) {
               int var54 = var1 - var53;
               int var150 = var53 - 1 + var18;
               int var55 = var53 - 1 + var19;
               int var56 = var53 - 1 + var20;
               int var57 = var53 - 1 + var21;
               double var58 = this.field34335[var150 - 1];
               double var60 = this.field34335[var150];
               double var62 = this.field34335[var55 - 1];
               double var64 = this.field34335[var55];
               double var66 = this.field34335[var56 - 1];
               double var68 = this.field34335[var56];
               double var70 = this.field34335[var57 - 1];
               double var72 = this.field34335[var57];
               int var74 = var4 + var53;
               int var75 = var4 + var54;
               int var76 = var6 + var53;
               int var77 = var74 + var141;
               int var78 = var75 + var142;
               int var79 = var74 + var143;
               int var80 = var75 + var144;
               int var81 = var74 + var145;
               double var82 = var3[var77 - 1];
               double var84 = var3[var77];
               double var86 = var3[var78 - 1];
               double var88 = var3[var78];
               double var90 = var3[var79 - 1];
               double var92 = var3[var79];
               double var94 = var3[var80 - 1];
               double var96 = var3[var80];
               double var98 = var3[var81 - 1];
               double var100 = var3[var81];
               double var151 = var92 + var88;
               double var102 = var92 - var88;
               double var152 = var100 + var96;
               double var104 = var100 - var96;
               double var106 = var90 - var86;
               double var153 = var90 + var86;
               double var108 = var98 - var94;
               double var154 = var98 + var94;
               double var155 = var82 + 0.30901699437494745 * var153 + -0.8090169943749473 * var154;
               double var110 = var84 + 0.30901699437494745 * var102 + -0.8090169943749473 * var104;
               double var156 = var82 + -0.8090169943749473 * var153 + 0.30901699437494745 * var154;
               double var112 = var84 + -0.8090169943749473 * var102 + 0.30901699437494745 * var104;
               double var114 = 0.9510565162951535 * var106 + 0.5877852522924732 * var108;
               double var157 = 0.9510565162951535 * var151 + 0.5877852522924732 * var152;
               double var116 = 0.5877852522924732 * var106 - 0.9510565162951535 * var108;
               double var158 = 0.5877852522924732 * var151 - 0.9510565162951535 * var152;
               double var118 = var156 - var158;
               double var120 = var156 + var158;
               double var122 = var112 + var116;
               double var124 = var112 - var116;
               double var126 = var155 + var157;
               double var128 = var155 - var157;
               double var130 = var110 - var114;
               double var132 = var110 + var114;
               int var134 = var76 + var140;
               int var135 = var76 + var146;
               int var136 = var76 + var147;
               int var137 = var76 + var148;
               int var138 = var76 + var149;
               var5[var134 - 1] = var82 + var153 + var154;
               var5[var134] = var84 + var102 + var104;
               var5[var135 - 1] = var58 * var128 - var60 * var132;
               var5[var135] = var58 * var132 + var60 * var128;
               var5[var136 - 1] = var62 * var118 - var64 * var122;
               var5[var136] = var62 * var122 + var64 * var118;
               var5[var137 - 1] = var66 * var120 - var68 * var124;
               var5[var137] = var66 * var124 + var68 * var120;
               var5[var138 - 1] = var70 * var126 - var72 * var130;
               var5[var138] = var70 * var130 + var72 * var126;
            }
         }
      }
   }

   public void method27224(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11) {
      double var15 = 0.30901699437494745;
      double var17 = 0.9510565162951535;
      double var19 = -0.8090169943749473;
      double var21 = 0.5877852522924732;
      long var23 = var11;
      long var25 = var11 + var1;
      long var27 = var25 + var1;
      long var29 = var27 + var1;
      long var31 = var3 * var1;

      for (long var33 = 0L; var33 < var3; var33++) {
         long var35 = var33 * var1;
         long var37 = 5L * var35;
         long var39 = var37 + var1;
         long var41 = var39 + var1;
         long var43 = var41 + var1;
         long var45 = var43 + var1;
         long var47 = var35 + var31;
         long var49 = var47 + var31;
         long var51 = var49 + var31;
         long var53 = var51 + var31;
         long var55 = var6 + var1 - 1L;
         double var57 = var5.method9653(var6 + var37);
         double var59 = 2.0 * var5.method9653(var6 + var41);
         double var61 = 2.0 * var5.method9653(var6 + var45);
         double var63 = 2.0 * var5.method9653(var55 + var39);
         double var65 = 2.0 * var5.method9653(var55 + var43);
         double var67 = var57 + 0.30901699437494745 * var63 + -0.8090169943749473 * var65;
         double var69 = var57 + -0.8090169943749473 * var63 + 0.30901699437494745 * var65;
         double var71 = 0.9510565162951535 * var59 + 0.5877852522924732 * var61;
         double var73 = 0.5877852522924732 * var59 - 0.9510565162951535 * var61;
         var8.method9687(var9 + var35, var57 + var63 + var65);
         var8.method9687(var9 + var47, var67 - var71);
         var8.method9687(var9 + var49, var69 - var73);
         var8.method9687(var9 + var51, var69 + var73);
         var8.method9687(var9 + var53, var67 + var71);
      }

      if (var1 != 1L) {
         for (long var177 = 0L; var177 < var3; var177++) {
            long var178 = var177 * var1;
            long var179 = 5L * var178;
            long var180 = var179 + var1;
            long var181 = var180 + var1;
            long var182 = var181 + var1;
            long var183 = var182 + var1;
            long var184 = var178 + var31;
            long var185 = var184 + var31;
            long var186 = var185 + var31;
            long var187 = var186 + var31;

            for (long var75 = 2L; var75 < var1; var75 += 2L) {
               long var77 = var1 - var75;
               long var188 = var75 - 1L + var23;
               long var189 = var75 - 1L + var25;
               long var79 = var75 - 1L + var27;
               long var81 = var75 - 1L + var29;
               double var83 = this.field34336.method9653(var188 - 1L);
               double var85 = this.field34336.method9653(var188);
               double var87 = this.field34336.method9653(var189 - 1L);
               double var89 = this.field34336.method9653(var189);
               double var91 = this.field34336.method9653(var79 - 1L);
               double var93 = this.field34336.method9653(var79);
               double var95 = this.field34336.method9653(var81 - 1L);
               double var97 = this.field34336.method9653(var81);
               long var99 = var6 + var75;
               long var101 = var6 + var77;
               long var103 = var9 + var75;
               long var105 = var99 + var179;
               long var107 = var101 + var180;
               long var109 = var99 + var181;
               long var111 = var101 + var182;
               long var113 = var99 + var183;
               double var115 = var5.method9653(var105 - 1L);
               double var117 = var5.method9653(var105);
               double var119 = var5.method9653(var107 - 1L);
               double var121 = var5.method9653(var107);
               double var123 = var5.method9653(var109 - 1L);
               double var125 = var5.method9653(var109);
               double var127 = var5.method9653(var111 - 1L);
               double var129 = var5.method9653(var111);
               double var131 = var5.method9653(var113 - 1L);
               double var133 = var5.method9653(var113);
               double var190 = var125 + var121;
               double var135 = var125 - var121;
               double var191 = var133 + var129;
               double var137 = var133 - var129;
               double var139 = var123 - var119;
               double var192 = var123 + var119;
               double var141 = var131 - var127;
               double var193 = var131 + var127;
               double var194 = var115 + 0.30901699437494745 * var192 + -0.8090169943749473 * var193;
               double var143 = var117 + 0.30901699437494745 * var135 + -0.8090169943749473 * var137;
               double var195 = var115 + -0.8090169943749473 * var192 + 0.30901699437494745 * var193;
               double var145 = var117 + -0.8090169943749473 * var135 + 0.30901699437494745 * var137;
               double var147 = 0.9510565162951535 * var139 + 0.5877852522924732 * var141;
               double var196 = 0.9510565162951535 * var190 + 0.5877852522924732 * var191;
               double var149 = 0.5877852522924732 * var139 - 0.9510565162951535 * var141;
               double var197 = 0.5877852522924732 * var190 - 0.9510565162951535 * var191;
               double var151 = var195 - var197;
               double var153 = var195 + var197;
               double var155 = var145 + var149;
               double var157 = var145 - var149;
               double var159 = var194 + var196;
               double var161 = var194 - var196;
               double var163 = var143 - var147;
               double var165 = var143 + var147;
               long var167 = var103 + var178;
               long var169 = var103 + var184;
               long var171 = var103 + var185;
               long var173 = var103 + var186;
               long var175 = var103 + var187;
               var8.method9687(var167 - 1L, var115 + var192 + var193);
               var8.method9687(var167, var117 + var135 + var137);
               var8.method9687(var169 - 1L, var83 * var161 - var85 * var165);
               var8.method9687(var169, var83 * var165 + var85 * var161);
               var8.method9687(var171 - 1L, var87 * var151 - var89 * var155);
               var8.method9687(var171, var87 * var155 + var89 * var151);
               var8.method9687(var173 - 1L, var91 * var153 - var93 * var157);
               var8.method9687(var173, var91 * var157 + var93 * var153);
               var8.method9687(var175 - 1L, var95 * var159 - var97 * var163);
               var8.method9687(var175, var95 * var163 + var97 * var159);
            }
         }
      }
   }

   public void method27225(int var1, int var2, int var3, int var4, double[] var5, int var6, double[] var7, int var8, int var9) {
      int var12 = var9;
      double var13 = (Math.PI * 2) / (double)var2;
      double var15 = Class9044.method33578(var13);
      double var17 = Class9044.method33577(var13);
      int var19 = (var2 + 1) / 2;
      int var20 = (var1 - 1) / 2;
      if (var1 == 1) {
         System.arraycopy(var7, var8, var5, var6, var4);
      } else {
         for (int var21 = 0; var21 < var4; var21++) {
            var7[var8 + var21] = var5[var6 + var21];
         }

         for (int var82 = 1; var82 < var2; var82++) {
            int var23 = var82 * var3 * var1;

            for (int var24 = 0; var24 < var3; var24++) {
               int var25 = var24 * var1 + var23;
               var7[var8 + var25] = var5[var6 + var25];
            }
         }

         if (var20 > var3) {
            int var89 = -var1;

            for (int var84 = 1; var84 < var2; var84++) {
               var89 += var1;
               int var91 = var84 * var3 * var1;

               for (int var101 = 0; var101 < var3; var101++) {
                  int var124 = var89 - 1;
                  int var113 = var101 * var1 + var91;

                  for (int var125 = 2; var125 < var1; var125 += 2) {
                     var124 += 2;
                     int var135 = var124 + var12;
                     double var144 = this.field34335[var135 - 1];
                     double var145 = this.field34335[var135];
                     int var146 = var8 + var125 + var113;
                     int var155 = var6 + var125 + var113;
                     double var41 = var5[var155 - 1];
                     double var175 = var5[var155];
                     var7[var146 - 1] = var144 * var41 + var145 * var175;
                     var7[var146] = var144 * var175 - var145 * var41;
                  }
               }
            }
         } else {
            int var22 = -var1;

            for (int var83 = 1; var83 < var2; var83++) {
               var22 += var1;
               int var26 = var22 - 1;
               int var90 = var83 * var3 * var1;

               for (int var100 = 2; var100 < var1; var100 += 2) {
                  var26 += 2;
                  int var112 = var26 + var12;
                  int var27 = var6 + var100;
                  int var28 = var8 + var100;
                  double var29 = this.field34335[var112 - 1];
                  double var31 = this.field34335[var112];

                  for (int var33 = 0; var33 < var3; var33++) {
                     int var34 = var33 * var1 + var90;
                     int var35 = var28 + var34;
                     int var36 = var27 + var34;
                     double var37 = var5[var36 - 1];
                     double var39 = var5[var36];
                     var7[var35 - 1] = var29 * var37 + var31 * var39;
                     var7[var35] = var29 * var39 - var31 * var37;
                  }
               }
            }
         }

         if (var20 < var3) {
            for (int var85 = 1; var85 < var19; var85++) {
               int var43 = var2 - var85;
               int var92 = var85 * var3 * var1;
               int var102 = var43 * var3 * var1;

               for (int var114 = 2; var114 < var1; var114 += 2) {
                  int var126 = var6 + var114;
                  int var136 = var8 + var114;

                  for (int var147 = 0; var147 < var3; var147++) {
                     int var156 = var147 * var1 + var92;
                     int var163 = var147 * var1 + var102;
                     int var169 = var126 + var156;
                     int var44 = var126 + var163;
                     int var45 = var136 + var156;
                     int var46 = var136 + var163;
                     double var47 = var7[var45 - 1];
                     double var49 = var7[var45];
                     double var51 = var7[var46 - 1];
                     double var53 = var7[var46];
                     var5[var169 - 1] = var47 + var51;
                     var5[var169] = var49 + var53;
                     var5[var44 - 1] = var49 - var53;
                     var5[var44] = var51 - var47;
                  }
               }
            }
         } else {
            for (int var86 = 1; var86 < var19; var86++) {
               int var178 = var2 - var86;
               int var93 = var86 * var3 * var1;
               int var103 = var178 * var3 * var1;

               for (int var115 = 0; var115 < var3; var115++) {
                  int var127 = var115 * var1 + var93;
                  int var137 = var115 * var1 + var103;

                  for (int var148 = 2; var148 < var1; var148 += 2) {
                     int var157 = var6 + var148;
                     int var164 = var8 + var148;
                     int var170 = var157 + var127;
                     int var184 = var157 + var137;
                     int var188 = var164 + var127;
                     int var191 = var164 + var137;
                     double var194 = var7[var188 - 1];
                     double var195 = var7[var188];
                     double var196 = var7[var191 - 1];
                     double var199 = var7[var191];
                     var5[var170 - 1] = var194 + var196;
                     var5[var170] = var195 + var199;
                     var5[var184 - 1] = var195 - var199;
                     var5[var184] = var196 - var194;
                  }
               }
            }
         }
      }

      for (int var87 = 1; var87 < var19; var87++) {
         int var179 = var2 - var87;
         int var94 = var87 * var3 * var1;
         int var104 = var179 * var3 * var1;

         for (int var116 = 0; var116 < var3; var116++) {
            int var128 = var116 * var1 + var94;
            int var138 = var116 * var1 + var104;
            int var149 = var8 + var128;
            int var158 = var8 + var138;
            double var177 = var7[var149];
            double var176 = var7[var158];
            var5[var6 + var128] = var177 + var176;
            var5[var6 + var138] = var176 - var177;
         }
      }

      double var55 = 1.0;
      double var57 = 0.0;
      int var88 = (var2 - 1) * var4;

      for (int var95 = 1; var95 < var19; var95++) {
         int var59 = var2 - var95;
         double var60 = var15 * var55 - var17 * var57;
         var57 = var15 * var57 + var17 * var55;
         var55 = var60;
         int var105 = var95 * var4;
         int var117 = var59 * var4;

         for (int var129 = 0; var129 < var4; var129++) {
            int var139 = var8 + var129;
            int var150 = var6 + var129;
            var7[var139 + var105] = var5[var150] + var55 * var5[var150 + var4];
            var7[var139 + var117] = var57 * var5[var150 + var88];
         }

         double var62 = var55;
         double var64 = var57;
         double var66 = var55;
         double var68 = var57;

         for (int var130 = 2; var130 < var19; var130++) {
            int var180 = var2 - var130;
            double var70 = var62 * var66 - var64 * var68;
            var68 = var62 * var68 + var64 * var66;
            var66 = var70;
            int var140 = var130 * var4;
            int var151 = var180 * var4;

            for (int var159 = 0; var159 < var4; var159++) {
               int var165 = var8 + var159;
               int var171 = var6 + var159;
               var7[var165 + var105] = var7[var165 + var105] + var66 * var5[var171 + var140];
               var7[var165 + var117] = var7[var165 + var117] + var68 * var5[var171 + var151];
            }
         }
      }

      for (int var96 = 1; var96 < var19; var96++) {
         int var106 = var96 * var4;

         for (int var118 = 0; var118 < var4; var118++) {
            var7[var8 + var118] = var7[var8 + var118] + var5[var6 + var118 + var106];
         }
      }

      if (var1 < var3) {
         for (int var97 = 0; var97 < var1; var97++) {
            for (int var107 = 0; var107 < var3; var107++) {
               int var119 = var107 * var1;
               var5[var6 + var97 + var119 * var2] = var7[var8 + var97 + var119];
            }
         }
      } else {
         for (int var98 = 0; var98 < var3; var98++) {
            int var108 = var98 * var1;
            int var120 = var108 * var2;

            for (int var131 = 0; var131 < var1; var131++) {
               var5[var6 + var131 + var120] = var7[var8 + var131 + var108];
            }
         }
      }

      int var99 = var2 * var1;

      for (int var109 = 1; var109 < var19; var109++) {
         int var181 = var2 - var109;
         int var72 = 2 * var109;
         int var121 = var109 * var3 * var1;
         int var132 = var181 * var3 * var1;
         int var141 = var72 * var1;

         for (int var152 = 0; var152 < var3; var152++) {
            int var160 = var152 * var1;
            int var166 = var160 + var121;
            int var172 = var160 + var132;
            int var185 = var152 * var99;
            var5[var6 + var1 - 1 + var141 - var1 + var185] = var7[var8 + var166];
            var5[var6 + var141 + var185] = var7[var8 + var172];
         }
      }

      if (var1 != 1) {
         if (var20 < var3) {
            for (int var110 = 1; var110 < var19; var110++) {
               int var182 = var2 - var110;
               int var202 = 2 * var110;
               int var122 = var110 * var3 * var1;
               int var133 = var182 * var3 * var1;
               int var142 = var202 * var1;

               for (int var153 = 2; var153 < var1; var153 += 2) {
                  int var73 = var1 - var153;
                  int var161 = var6 + var153;
                  int var167 = var6 + var73;
                  int var173 = var8 + var153;

                  for (int var186 = 0; var186 < var3; var186++) {
                     int var189 = var186 * var99;
                     int var192 = var186 * var1;
                     int var74 = var161 + var142 + var189;
                     int var75 = var167 + var142 - var1 + var189;
                     int var76 = var173 + var192 + var122;
                     int var77 = var173 + var192 + var133;
                     double var197 = var7[var76 - 1];
                     double var200 = var7[var76];
                     double var78 = var7[var77 - 1];
                     double var80 = var7[var77];
                     var5[var74 - 1] = var197 + var78;
                     var5[var75 - 1] = var197 - var78;
                     var5[var74] = var200 + var80;
                     var5[var75] = var80 - var200;
                  }
               }
            }
         } else {
            for (int var111 = 1; var111 < var19; var111++) {
               int var183 = var2 - var111;
               int var203 = 2 * var111;
               int var123 = var111 * var3 * var1;
               int var134 = var183 * var3 * var1;
               int var143 = var203 * var1;

               for (int var154 = 0; var154 < var3; var154++) {
                  int var162 = var154 * var99;
                  int var168 = var154 * var1;

                  for (int var174 = 2; var174 < var1; var174 += 2) {
                     int var204 = var1 - var174;
                     int var187 = var6 + var174;
                     int var190 = var6 + var204;
                     int var193 = var8 + var174;
                     int var205 = var187 + var143 + var162;
                     int var206 = var190 + var143 - var1 + var162;
                     int var207 = var193 + var168 + var123;
                     int var208 = var193 + var168 + var134;
                     double var198 = var7[var207 - 1];
                     double var201 = var7[var207];
                     double var209 = var7[var208 - 1];
                     double var210 = var7[var208];
                     var5[var205 - 1] = var198 + var209;
                     var5[var206 - 1] = var198 - var209;
                     var5[var205] = var201 + var210;
                     var5[var206] = var210 - var201;
                  }
               }
            }
         }
      }
   }

   public void method27226(long var1, long var3, long var5, long var7, Class2381 var9, long var10, Class2381 var12, long var13, long var15) {
      long var19 = var15;
      double var21 = (Math.PI * 2) / (double)var3;
      double var23 = Class9044.method33578(var21);
      double var25 = Class9044.method33577(var21);
      long var27 = (var3 + 1L) / 2L;
      long var29 = (var1 - 1L) / 2L;
      if (var1 == 1L) {
         Class8133.method28177(var12, var13, var9, var10, var7);
      } else {
         for (long var31 = 0L; var31 < var7; var31++) {
            var12.method9687(var13 + var31, var9.method9653(var10 + var31));
         }

         for (long var105 = 1L; var105 < var3; var105++) {
            long var35 = var105 * var5 * var1;

            for (long var37 = 0L; var37 < var5; var37++) {
               long var39 = var37 * var1 + var35;
               var12.method9687(var13 + var39, var9.method9653(var10 + var39));
            }
         }

         if (var29 > var5) {
            long var112 = -var1;

            for (long var107 = 1L; var107 < var3; var107++) {
               var112 += var1;
               long var114 = var107 * var5 * var1;

               for (long var124 = 0L; var124 < var5; var124++) {
                  long var147 = var112 - 1L;
                  long var136 = var124 * var1 + var114;

                  for (long var148 = 2L; var148 < var1; var148 += 2L) {
                     var147 += 2L;
                     long var158 = var147 + var19;
                     double var167 = this.field34336.method9653(var158 - 1L);
                     double var168 = this.field34336.method9653(var158);
                     long var169 = var13 + var148 + var136;
                     long var178 = var10 + var148 + var136;
                     double var186 = var9.method9653(var178 - 1L);
                     double var194 = var9.method9653(var178);
                     var12.method9687(var169 - 1L, var167 * var186 + var168 * var194);
                     var12.method9687(var169, var167 * var194 - var168 * var186);
                  }
               }
            }
         } else {
            long var33 = -var1;

            for (long var106 = 1L; var106 < var3; var106++) {
               var33 += var1;
               long var41 = var33 - 1L;
               long var113 = var106 * var5 * var1;

               for (long var123 = 2L; var123 < var1; var123 += 2L) {
                  var41 += 2L;
                  long var135 = var41 + var19;
                  long var43 = var10 + var123;
                  long var45 = var13 + var123;
                  double var47 = this.field34336.method9653(var135 - 1L);
                  double var49 = this.field34336.method9653(var135);

                  for (long var51 = 0L; var51 < var5; var51++) {
                     long var53 = var51 * var1 + var113;
                     long var55 = var45 + var53;
                     long var57 = var43 + var53;
                     double var59 = var9.method9653(var57 - 1L);
                     double var61 = var9.method9653(var57);
                     var12.method9687(var55 - 1L, var47 * var59 + var49 * var61);
                     var12.method9687(var55, var47 * var61 - var49 * var59);
                  }
               }
            }
         }

         if (var29 < var5) {
            for (long var108 = 1L; var108 < var27; var108++) {
               long var63 = var3 - var108;
               long var115 = var108 * var5 * var1;
               long var125 = var63 * var5 * var1;

               for (long var137 = 2L; var137 < var1; var137 += 2L) {
                  long var149 = var10 + var137;
                  long var159 = var13 + var137;

                  for (long var170 = 0L; var170 < var5; var170++) {
                     long var179 = var170 * var1 + var115;
                     long var187 = var170 * var1 + var125;
                     long var195 = var149 + var179;
                     long var202 = var149 + var187;
                     long var207 = var159 + var179;
                     long var65 = var159 + var187;
                     double var67 = var12.method9653(var207 - 1L);
                     double var69 = var12.method9653(var207);
                     double var71 = var12.method9653(var65 - 1L);
                     double var73 = var12.method9653(var65);
                     var9.method9687(var195 - 1L, var67 + var71);
                     var9.method9687(var195, var69 + var73);
                     var9.method9687(var202 - 1L, var69 - var73);
                     var9.method9687(var202, var71 - var67);
                  }
               }
            }
         } else {
            for (long var109 = 1L; var109 < var27; var109++) {
               long var211 = var3 - var109;
               long var116 = var109 * var5 * var1;
               long var126 = var211 * var5 * var1;

               for (long var138 = 0L; var138 < var5; var138++) {
                  long var150 = var138 * var1 + var116;
                  long var160 = var138 * var1 + var126;

                  for (long var171 = 2L; var171 < var1; var171 += 2L) {
                     long var180 = var10 + var171;
                     long var188 = var13 + var171;
                     long var196 = var180 + var150;
                     long var203 = var180 + var160;
                     long var208 = var188 + var150;
                     long var217 = var188 + var160;
                     double var220 = var12.method9653(var208 - 1L);
                     double var223 = var12.method9653(var208);
                     double var226 = var12.method9653(var217 - 1L);
                     double var229 = var12.method9653(var217);
                     var9.method9687(var196 - 1L, var220 + var226);
                     var9.method9687(var196, var223 + var229);
                     var9.method9687(var203 - 1L, var223 - var229);
                     var9.method9687(var203, var226 - var220);
                  }
               }
            }
         }
      }

      for (long var110 = 1L; var110 < var27; var110++) {
         long var212 = var3 - var110;
         long var117 = var110 * var5 * var1;
         long var127 = var212 * var5 * var1;

         for (long var139 = 0L; var139 < var5; var139++) {
            long var151 = var139 * var1 + var117;
            long var161 = var139 * var1 + var127;
            long var172 = var13 + var151;
            long var181 = var13 + var161;
            double var189 = var12.method9653(var172);
            double var197 = var12.method9653(var181);
            var9.method9687(var10 + var151, var189 + var197);
            var9.method9687(var10 + var161, var197 - var189);
         }
      }

      double var75 = 1.0;
      double var77 = 0.0;
      long var111 = (var3 - 1L) * var7;

      for (long var118 = 1L; var118 < var27; var118++) {
         long var79 = var3 - var118;
         double var81 = var23 * var75 - var25 * var77;
         var77 = var23 * var77 + var25 * var75;
         var75 = var81;
         long var128 = var118 * var7;
         long var140 = var79 * var7;

         for (long var152 = 0L; var152 < var7; var152++) {
            long var162 = var13 + var152;
            long var173 = var10 + var152;
            var12.method9687(var162 + var128, var9.method9653(var173) + var75 * var9.method9653(var173 + var7));
            var12.method9687(var162 + var140, var77 * var9.method9653(var173 + var111));
         }

         double var83 = var75;
         double var85 = var77;
         double var87 = var75;
         double var89 = var77;

         for (long var153 = 2L; var153 < var27; var153++) {
            long var213 = var3 - var153;
            double var91 = var83 * var87 - var85 * var89;
            var89 = var83 * var89 + var85 * var87;
            var87 = var91;
            long var163 = var153 * var7;
            long var174 = var213 * var7;

            for (long var182 = 0L; var182 < var7; var182++) {
               long var190 = var13 + var182;
               long var198 = var10 + var182;
               var12.method9687(var190 + var128, var12.method9653(var190 + var128) + var87 * var9.method9653(var198 + var163));
               var12.method9687(var190 + var140, var12.method9653(var190 + var140) + var89 * var9.method9653(var198 + var174));
            }
         }
      }

      for (long var119 = 1L; var119 < var27; var119++) {
         long var129 = var119 * var7;

         for (long var141 = 0L; var141 < var7; var141++) {
            var12.method9687(var13 + var141, var12.method9653(var13 + var141) + var9.method9653(var10 + var141 + var129));
         }
      }

      if (var1 < var5) {
         for (long var120 = 0L; var120 < var1; var120++) {
            for (long var130 = 0L; var130 < var5; var130++) {
               long var142 = var130 * var1;
               var9.method9687(var10 + var120 + var142 * var3, var12.method9653(var13 + var120 + var142));
            }
         }
      } else {
         for (long var121 = 0L; var121 < var5; var121++) {
            long var131 = var121 * var1;
            long var143 = var131 * var3;

            for (long var154 = 0L; var154 < var1; var154++) {
               var9.method9687(var10 + var154 + var143, var12.method9653(var13 + var154 + var131));
            }
         }
      }

      long var122 = var3 * var1;

      for (long var132 = 1L; var132 < var27; var132++) {
         long var214 = var3 - var132;
         long var93 = 2L * var132;
         long var144 = var132 * var5 * var1;
         long var155 = var214 * var5 * var1;
         long var164 = var93 * var1;

         for (long var175 = 0L; var175 < var5; var175++) {
            long var183 = var175 * var1;
            long var191 = var183 + var144;
            long var199 = var183 + var155;
            long var204 = var175 * var122;
            var9.method9687(var10 + var1 - 1L + var164 - var1 + var204, var12.method9653(var13 + var191));
            var9.method9687(var10 + var164 + var204, var12.method9653(var13 + var199));
         }
      }

      if (var1 != 1L) {
         if (var29 < var5) {
            for (long var133 = 1L; var133 < var27; var133++) {
               long var215 = var3 - var133;
               long var232 = 2L * var133;
               long var145 = var133 * var5 * var1;
               long var156 = var215 * var5 * var1;
               long var165 = var232 * var1;

               for (long var176 = 2L; var176 < var1; var176 += 2L) {
                  long var95 = var1 - var176;
                  long var184 = var10 + var176;
                  long var192 = var10 + var95;
                  long var200 = var13 + var176;

                  for (long var205 = 0L; var205 < var5; var205++) {
                     long var209 = var205 * var122;
                     long var218 = var205 * var1;
                     long var221 = var184 + var165 + var209;
                     long var224 = var192 + var165 - var1 + var209;
                     long var227 = var200 + var218 + var145;
                     long var230 = var200 + var218 + var156;
                     double var97 = var12.method9653(var227 - 1L);
                     double var99 = var12.method9653(var227);
                     double var101 = var12.method9653(var230 - 1L);
                     double var103 = var12.method9653(var230);
                     var9.method9687(var221 - 1L, var97 + var101);
                     var9.method9687(var224 - 1L, var97 - var101);
                     var9.method9687(var221, var99 + var103);
                     var9.method9687(var224, var103 - var99);
                  }
               }
            }
         } else {
            for (long var134 = 1L; var134 < var27; var134++) {
               long var216 = var3 - var134;
               long var233 = 2L * var134;
               long var146 = var134 * var5 * var1;
               long var157 = var216 * var5 * var1;
               long var166 = var233 * var1;

               for (long var177 = 0L; var177 < var5; var177++) {
                  long var185 = var177 * var122;
                  long var193 = var177 * var1;

                  for (long var201 = 2L; var201 < var1; var201 += 2L) {
                     long var234 = var1 - var201;
                     long var206 = var10 + var201;
                     long var210 = var10 + var234;
                     long var219 = var13 + var201;
                     long var222 = var206 + var166 + var185;
                     long var225 = var210 + var166 - var1 + var185;
                     long var228 = var219 + var193 + var146;
                     long var231 = var219 + var193 + var157;
                     double var235 = var12.method9653(var228 - 1L);
                     double var236 = var12.method9653(var228);
                     double var237 = var12.method9653(var231 - 1L);
                     double var238 = var12.method9653(var231);
                     var9.method9687(var222 - 1L, var235 + var237);
                     var9.method9687(var225 - 1L, var235 - var237);
                     var9.method9687(var222, var236 + var238);
                     var9.method9687(var225, var238 - var236);
                  }
               }
            }
         }
      }
   }

   public void method27227(int var1, int var2, int var3, int var4, double[] var5, int var6, double[] var7, int var8, int var9) {
      int var12 = var9;
      double var13 = (Math.PI * 2) / (double)var2;
      double var15 = Class9044.method33578(var13);
      double var17 = Class9044.method33577(var13);
      int var19 = (var1 - 1) / 2;
      int var20 = (var2 + 1) / 2;
      int var21 = var2 * var1;
      if (var1 < var3) {
         for (int var22 = 0; var22 < var1; var22++) {
            int var23 = var8 + var22;
            int var24 = var6 + var22;

            for (int var25 = 0; var25 < var3; var25++) {
               var7[var23 + var25 * var1] = var5[var24 + var25 * var21];
            }
         }
      } else {
         for (int var85 = 0; var85 < var3; var85++) {
            int var87 = var85 * var1;
            int var92 = var85 * var21;

            for (int var104 = 0; var104 < var1; var104++) {
               var7[var8 + var104 + var87] = var5[var6 + var104 + var92];
            }
         }
      }

      int var86 = var6 + var1 - 1;

      for (int var88 = 1; var88 < var20; var88++) {
         int var30 = var2 - var88;
         int var31 = 2 * var88;
         int var93 = var88 * var3 * var1;
         int var105 = var30 * var3 * var1;
         int var32 = var31 * var1;

         for (int var33 = 0; var33 < var3; var33++) {
            int var34 = var33 * var1;
            int var35 = var34 * var2;
            int var36 = var86 + var32 + var35 - var1;
            int var37 = var6 + var32 + var35;
            double var38 = var5[var36];
            double var40 = var5[var37];
            var7[var8 + var34 + var93] = var38 + var38;
            var7[var8 + var34 + var105] = var40 + var40;
         }
      }

      if (var1 != 1) {
         if (var19 < var3) {
            for (int var89 = 1; var89 < var20; var89++) {
               int var116 = var2 - var89;
               int var94 = var89 * var3 * var1;
               int var106 = var116 * var3 * var1;
               int var122 = 2 * var89 * var1;

               for (int var132 = 2; var132 < var1; var132 += 2) {
                  int var42 = var1 - var132;
                  int var143 = var8 + var132;
                  int var152 = var6 + var42;
                  int var161 = var6 + var132;

                  for (int var169 = 0; var169 < var3; var169++) {
                     int var43 = var169 * var1 + var94;
                     int var44 = var169 * var1 + var106;
                     int var45 = var169 * var2 * var1 + var122;
                     int var46 = var143 + var43;
                     int var47 = var143 + var44;
                     int var48 = var161 + var45;
                     int var49 = var152 + var45 - var1;
                     double var50 = var5[var48 - 1];
                     double var52 = var5[var48];
                     double var54 = var5[var49 - 1];
                     double var56 = var5[var49];
                     var7[var46 - 1] = var50 + var54;
                     var7[var47 - 1] = var50 - var54;
                     var7[var46] = var52 - var56;
                     var7[var47] = var52 + var56;
                  }
               }
            }
         } else {
            for (int var90 = 1; var90 < var20; var90++) {
               int var117 = var2 - var90;
               int var95 = var90 * var3 * var1;
               int var107 = var117 * var3 * var1;
               int var123 = 2 * var90 * var1;

               for (int var133 = 0; var133 < var3; var133++) {
                  int var144 = var133 * var1 + var95;
                  int var153 = var133 * var1 + var107;
                  int var162 = var133 * var2 * var1 + var123;

                  for (int var170 = 2; var170 < var1; var170 += 2) {
                     int var181 = var1 - var170;
                     int var182 = var8 + var170;
                     int var188 = var6 + var181;
                     int var193 = var6 + var170;
                     int var196 = var182 + var144;
                     int var199 = var182 + var153;
                     int var200 = var193 + var162;
                     int var201 = var188 + var162 - var1;
                     double var202 = var5[var200 - 1];
                     double var203 = var5[var200];
                     double var204 = var5[var201 - 1];
                     double var205 = var5[var201];
                     var7[var196 - 1] = var202 + var204;
                     var7[var199 - 1] = var202 - var204;
                     var7[var196] = var203 - var205;
                     var7[var199] = var203 + var205;
                  }
               }
            }
         }
      }

      double var26 = 1.0;
      double var28 = 0.0;
      int var91 = (var2 - 1) * var4;

      for (int var96 = 1; var96 < var20; var96++) {
         int var58 = var2 - var96;
         double var59 = var15 * var26 - var17 * var28;
         var28 = var15 * var28 + var17 * var26;
         var26 = var59;
         int var108 = var96 * var4;
         int var124 = var58 * var4;

         for (int var134 = 0; var134 < var4; var134++) {
            int var145 = var6 + var134;
            int var154 = var8 + var134;
            var5[var145 + var108] = var7[var154] + var26 * var7[var154 + var4];
            var5[var145 + var124] = var28 * var7[var154 + var91];
         }

         double var61 = var26;
         double var63 = var28;
         double var65 = var26;
         double var67 = var28;

         for (int var135 = 2; var135 < var20; var135++) {
            int var118 = var2 - var135;
            double var69 = var61 * var65 - var63 * var67;
            var67 = var61 * var67 + var63 * var65;
            var65 = var69;
            int var146 = var135 * var4;
            int var155 = var118 * var4;

            for (int var163 = 0; var163 < var4; var163++) {
               int var171 = var6 + var163;
               int var183 = var8 + var163;
               var5[var171 + var108] = var5[var171 + var108] + var65 * var7[var183 + var146];
               var5[var171 + var124] = var5[var171 + var124] + var67 * var7[var183 + var155];
            }
         }
      }

      for (int var97 = 1; var97 < var20; var97++) {
         int var109 = var97 * var4;

         for (int var125 = 0; var125 < var4; var125++) {
            int var136 = var8 + var125;
            var7[var136] += var7[var136 + var109];
         }
      }

      for (int var98 = 1; var98 < var20; var98++) {
         int var119 = var2 - var98;
         int var110 = var98 * var3 * var1;
         int var126 = var119 * var3 * var1;

         for (int var137 = 0; var137 < var3; var137++) {
            int var147 = var137 * var1;
            int var156 = var8 + var147;
            int var164 = var6 + var147 + var110;
            int var172 = var6 + var147 + var126;
            double var177 = var5[var164];
            double var178 = var5[var172];
            var7[var156 + var110] = var177 - var178;
            var7[var156 + var126] = var177 + var178;
         }
      }

      if (var1 != 1) {
         if (var19 < var3) {
            for (int var99 = 1; var99 < var20; var99++) {
               int var120 = var2 - var99;
               int var111 = var99 * var3 * var1;
               int var127 = var120 * var3 * var1;

               for (int var138 = 2; var138 < var1; var138 += 2) {
                  int var148 = var8 + var138;
                  int var157 = var6 + var138;

                  for (int var165 = 0; var165 < var3; var165++) {
                     int var173 = var165 * var1;
                     int var184 = var148 + var173 + var111;
                     int var189 = var148 + var173 + var127;
                     int var194 = var157 + var173 + var111;
                     int var197 = var157 + var173 + var127;
                     double var71 = var5[var194 - 1];
                     double var73 = var5[var194];
                     double var75 = var5[var197 - 1];
                     double var77 = var5[var197];
                     var7[var184 - 1] = var71 - var77;
                     var7[var189 - 1] = var71 + var77;
                     var7[var184] = var73 + var75;
                     var7[var189] = var73 - var75;
                  }
               }
            }
         } else {
            for (int var100 = 1; var100 < var20; var100++) {
               int var121 = var2 - var100;
               int var112 = var100 * var3 * var1;
               int var128 = var121 * var3 * var1;

               for (int var139 = 0; var139 < var3; var139++) {
                  int var149 = var139 * var1;

                  for (int var158 = 2; var158 < var1; var158 += 2) {
                     int var166 = var8 + var158;
                     int var174 = var6 + var158;
                     int var185 = var166 + var149 + var112;
                     int var190 = var166 + var149 + var128;
                     int var195 = var174 + var149 + var112;
                     int var198 = var174 + var149 + var128;
                     double var206 = var5[var195 - 1];
                     double var209 = var5[var195];
                     double var210 = var5[var198 - 1];
                     double var211 = var5[var198];
                     var7[var185 - 1] = var206 - var211;
                     var7[var190 - 1] = var206 + var211;
                     var7[var185] = var209 + var210;
                     var7[var190] = var209 - var210;
                  }
               }
            }
         }

         System.arraycopy(var7, var8, var5, var6, var4);

         for (int var101 = 1; var101 < var2; var101++) {
            int var113 = var101 * var3 * var1;

            for (int var129 = 0; var129 < var3; var129++) {
               int var140 = var129 * var1 + var113;
               var5[var6 + var140] = var7[var8 + var140];
            }
         }

         if (var19 > var3) {
            int var79 = -var1;

            for (int var102 = 1; var102 < var2; var102++) {
               var79 += var1;
               int var114 = var102 * var3 * var1;

               for (int var130 = 0; var130 < var3; var130++) {
                  int var80 = var79 - 1;
                  int var141 = var130 * var1 + var114;

                  for (int var150 = 2; var150 < var1; var150 += 2) {
                     var80 += 2;
                     int var159 = var80 + var12;
                     double var81 = this.field34335[var159 - 1];
                     double var83 = this.field34335[var159];
                     int var167 = var6 + var150;
                     int var175 = var8 + var150;
                     int var186 = var167 + var141;
                     int var191 = var175 + var141;
                     double var179 = var7[var191 - 1];
                     double var207 = var7[var191];
                     var5[var186 - 1] = var81 * var179 - var83 * var207;
                     var5[var186] = var81 * var207 + var83 * var179;
                  }
               }
            }
         } else {
            int var212 = -var1;

            for (int var103 = 1; var103 < var2; var103++) {
               var212 += var1;
               int var213 = var212 - 1;
               int var115 = var103 * var3 * var1;

               for (int var131 = 2; var131 < var1; var131 += 2) {
                  var213 += 2;
                  int var142 = var213 + var12;
                  double var214 = this.field34335[var142 - 1];
                  double var215 = this.field34335[var142];
                  int var151 = var6 + var131;
                  int var160 = var8 + var131;

                  for (int var168 = 0; var168 < var3; var168++) {
                     int var176 = var168 * var1 + var115;
                     int var187 = var151 + var176;
                     int var192 = var160 + var176;
                     double var180 = var7[var192 - 1];
                     double var208 = var7[var192];
                     var5[var187 - 1] = var214 * var180 - var215 * var208;
                     var5[var187] = var214 * var208 + var215 * var180;
                  }
               }
            }
         }
      }
   }

   public void method27228(long var1, long var3, long var5, long var7, Class2381 var9, long var10, Class2381 var12, long var13, long var15) {
      long var19 = var15;
      double var21 = (Math.PI * 2) / (double)var3;
      double var23 = Class9044.method33578(var21);
      double var25 = Class9044.method33577(var21);
      long var27 = (var1 - 1L) / 2L;
      long var29 = (var3 + 1L) / 2L;
      long var31 = var3 * var1;
      if (var1 < var5) {
         for (long var33 = 0L; var33 < var1; var33++) {
            long var35 = var13 + var33;
            long var37 = var10 + var33;

            for (long var39 = 0L; var39 < var5; var39++) {
               var12.method9687(var35 + var39 * var1, var9.method9653(var37 + var39 * var31));
            }
         }
      } else {
         for (long var107 = 0L; var107 < var5; var107++) {
            long var109 = var107 * var1;
            long var114 = var107 * var31;

            for (long var126 = 0L; var126 < var1; var126++) {
               var12.method9687(var13 + var126 + var109, var9.method9653(var10 + var126 + var114));
            }
         }
      }

      long var108 = var10 + var1 - 1L;

      for (long var110 = 1L; var110 < var29; var110++) {
         long var45 = var3 - var110;
         long var47 = 2L * var110;
         long var115 = var110 * var5 * var1;
         long var127 = var45 * var5 * var1;
         long var49 = var47 * var1;

         for (long var51 = 0L; var51 < var5; var51++) {
            long var53 = var51 * var1;
            long var55 = var53 * var3;
            long var57 = var108 + var49 + var55 - var1;
            long var59 = var10 + var49 + var55;
            double var61 = var9.method9653(var57);
            double var63 = var9.method9653(var59);
            var12.method9687(var13 + var53 + var115, var61 + var61);
            var12.method9687(var13 + var53 + var127, var63 + var63);
         }
      }

      if (var1 != 1L) {
         if (var27 < var5) {
            for (long var111 = 1L; var111 < var29; var111++) {
               long var138 = var3 - var111;
               long var116 = var111 * var5 * var1;
               long var128 = var138 * var5 * var1;
               long var144 = 2L * var111 * var1;

               for (long var154 = 2L; var154 < var1; var154 += 2L) {
                  long var65 = var1 - var154;
                  long var165 = var13 + var154;
                  long var174 = var10 + var65;
                  long var183 = var10 + var154;

                  for (long var191 = 0L; var191 < var5; var191++) {
                     long var199 = var191 * var1 + var116;
                     long var207 = var191 * var1 + var128;
                     long var67 = var191 * var3 * var1 + var144;
                     long var69 = var165 + var199;
                     long var71 = var165 + var207;
                     long var73 = var183 + var67;
                     long var75 = var174 + var67 - var1;
                     double var77 = var9.method9653(var73 - 1L);
                     double var79 = var9.method9653(var73);
                     double var81 = var9.method9653(var75 - 1L);
                     double var83 = var9.method9653(var75);
                     var12.method9687(var69 - 1L, var77 + var81);
                     var12.method9687(var71 - 1L, var77 - var81);
                     var12.method9687(var69, var79 - var83);
                     var12.method9687(var71, var79 + var83);
                  }
               }
            }
         } else {
            for (long var112 = 1L; var112 < var29; var112++) {
               long var139 = var3 - var112;
               long var117 = var112 * var5 * var1;
               long var129 = var139 * var5 * var1;
               long var145 = 2L * var112 * var1;

               for (long var155 = 0L; var155 < var5; var155++) {
                  long var166 = var155 * var1 + var117;
                  long var175 = var155 * var1 + var129;
                  long var184 = var155 * var3 * var1 + var145;

                  for (long var192 = 2L; var192 < var1; var192 += 2L) {
                     long var214 = var1 - var192;
                     long var200 = var13 + var192;
                     long var208 = var10 + var214;
                     long var215 = var10 + var192;
                     long var220 = var200 + var166;
                     long var225 = var200 + var175;
                     long var228 = var215 + var184;
                     long var231 = var208 + var184 - var1;
                     double var234 = var9.method9653(var228 - 1L);
                     double var237 = var9.method9653(var228);
                     double var238 = var9.method9653(var231 - 1L);
                     double var239 = var9.method9653(var231);
                     var12.method9687(var220 - 1L, var234 + var238);
                     var12.method9687(var225 - 1L, var234 - var238);
                     var12.method9687(var220, var237 - var239);
                     var12.method9687(var225, var237 + var239);
                  }
               }
            }
         }
      }

      double var41 = 1.0;
      double var43 = 0.0;
      long var113 = (var3 - 1L) * var7;

      for (long var118 = 1L; var118 < var29; var118++) {
         long var85 = var3 - var118;
         double var87 = var23 * var41 - var25 * var43;
         var43 = var23 * var43 + var25 * var41;
         var41 = var87;
         long var130 = var118 * var7;
         long var146 = var85 * var7;

         for (long var156 = 0L; var156 < var7; var156++) {
            long var167 = var10 + var156;
            long var176 = var13 + var156;
            var9.method9687(var167 + var130, var12.method9653(var176) + var41 * var12.method9653(var176 + var7));
            var9.method9687(var167 + var146, var43 * var12.method9653(var176 + var113));
         }

         double var89 = var41;
         double var91 = var43;
         double var93 = var41;
         double var95 = var43;

         for (long var157 = 2L; var157 < var29; var157++) {
            long var140 = var3 - var157;
            double var97 = var89 * var93 - var91 * var95;
            var95 = var89 * var95 + var91 * var93;
            var93 = var97;
            long var168 = var157 * var7;
            long var177 = var140 * var7;

            for (long var185 = 0L; var185 < var7; var185++) {
               long var193 = var10 + var185;
               long var201 = var13 + var185;
               var9.method9687(var193 + var130, var9.method9653(var193 + var130) + var93 * var12.method9653(var201 + var168));
               var9.method9687(var193 + var146, var9.method9653(var193 + var146) + var95 * var12.method9653(var201 + var177));
            }
         }
      }

      for (long var119 = 1L; var119 < var29; var119++) {
         long var131 = var119 * var7;

         for (long var147 = 0L; var147 < var7; var147++) {
            long var158 = var13 + var147;
            var12.method9687(var158, var12.method9653(var158) + var12.method9653(var158 + var131));
         }
      }

      for (long var120 = 1L; var120 < var29; var120++) {
         long var141 = var3 - var120;
         long var132 = var120 * var5 * var1;
         long var148 = var141 * var5 * var1;

         for (long var159 = 0L; var159 < var5; var159++) {
            long var169 = var159 * var1;
            long var178 = var13 + var169;
            long var186 = var10 + var169 + var132;
            long var194 = var10 + var169 + var148;
            double var202 = var9.method9653(var186);
            double var209 = var9.method9653(var194);
            var12.method9687(var178 + var132, var202 - var209);
            var12.method9687(var178 + var148, var202 + var209);
         }
      }

      if (var1 != 1L) {
         if (var27 < var5) {
            for (long var121 = 1L; var121 < var29; var121++) {
               long var142 = var3 - var121;
               long var133 = var121 * var5 * var1;
               long var149 = var142 * var5 * var1;

               for (long var160 = 2L; var160 < var1; var160 += 2L) {
                  long var170 = var13 + var160;
                  long var179 = var10 + var160;

                  for (long var187 = 0L; var187 < var5; var187++) {
                     long var195 = var187 * var1;
                     long var203 = var170 + var195 + var133;
                     long var210 = var170 + var195 + var149;
                     long var216 = var179 + var195 + var133;
                     long var221 = var179 + var195 + var149;
                     double var226 = var9.method9653(var216 - 1L);
                     double var229 = var9.method9653(var216);
                     double var232 = var9.method9653(var221 - 1L);
                     double var235 = var9.method9653(var221);
                     var12.method9687(var203 - 1L, var226 - var235);
                     var12.method9687(var210 - 1L, var226 + var235);
                     var12.method9687(var203, var229 + var232);
                     var12.method9687(var210, var229 - var232);
                  }
               }
            }
         } else {
            for (long var122 = 1L; var122 < var29; var122++) {
               long var143 = var3 - var122;
               long var134 = var122 * var5 * var1;
               long var150 = var143 * var5 * var1;

               for (long var161 = 0L; var161 < var5; var161++) {
                  long var171 = var161 * var1;

                  for (long var180 = 2L; var180 < var1; var180 += 2L) {
                     long var188 = var13 + var180;
                     long var196 = var10 + var180;
                     long var204 = var188 + var171 + var134;
                     long var211 = var188 + var171 + var150;
                     long var217 = var196 + var171 + var134;
                     long var222 = var196 + var171 + var150;
                     double var227 = var9.method9653(var217 - 1L);
                     double var230 = var9.method9653(var217);
                     double var233 = var9.method9653(var222 - 1L);
                     double var236 = var9.method9653(var222);
                     var12.method9687(var204 - 1L, var227 - var236);
                     var12.method9687(var211 - 1L, var227 + var236);
                     var12.method9687(var204, var230 + var233);
                     var12.method9687(var211, var230 - var233);
                  }
               }
            }
         }

         Class8133.method28177(var12, var13, var9, var10, var7);

         for (long var123 = 1L; var123 < var3; var123++) {
            long var135 = var123 * var5 * var1;

            for (long var151 = 0L; var151 < var5; var151++) {
               long var162 = var151 * var1 + var135;
               var9.method9687(var10 + var162, var12.method9653(var13 + var162));
            }
         }

         if (var27 > var5) {
            long var99 = -var1;

            for (long var124 = 1L; var124 < var3; var124++) {
               var99 += var1;
               long var136 = var124 * var5 * var1;

               for (long var152 = 0L; var152 < var5; var152++) {
                  long var101 = var99 - 1L;
                  long var163 = var152 * var1 + var136;

                  for (long var172 = 2L; var172 < var1; var172 += 2L) {
                     var101 += 2L;
                     long var181 = var101 + var19;
                     double var103 = this.field34336.method9653(var181 - 1L);
                     double var105 = this.field34336.method9653(var181);
                     long var189 = var10 + var172;
                     long var197 = var13 + var172;
                     long var205 = var189 + var163;
                     long var212 = var197 + var163;
                     double var218 = var12.method9653(var212 - 1L);
                     double var223 = var12.method9653(var212);
                     var9.method9687(var205 - 1L, var103 * var218 - var105 * var223);
                     var9.method9687(var205, var103 * var223 + var105 * var218);
                  }
               }
            }
         } else {
            long var240 = -var1;

            for (long var125 = 1L; var125 < var3; var125++) {
               var240 += var1;
               long var241 = var240 - 1L;
               long var137 = var125 * var5 * var1;

               for (long var153 = 2L; var153 < var1; var153 += 2L) {
                  var241 += 2L;
                  long var164 = var241 + var19;
                  double var242 = this.field34336.method9653(var164 - 1L);
                  double var243 = this.field34336.method9653(var164);
                  long var173 = var10 + var153;
                  long var182 = var13 + var153;

                  for (long var190 = 0L; var190 < var5; var190++) {
                     long var198 = var190 * var1 + var137;
                     long var206 = var173 + var198;
                     long var213 = var182 + var198;
                     double var219 = var12.method9653(var213 - 1L);
                     double var224 = var12.method9653(var213);
                     var9.method9687(var206 - 1L, var242 * var219 - var243 * var224);
                     var9.method9687(var206, var242 * var224 + var243 * var219);
                  }
               }
            }
         }
      }
   }

   public void method27229(double[] var1, int var2, int var3) {
      int[] var6 = new int[1];
      int var7 = 2 * this.field34321;
      double[] var8 = new double[var7];
      int var10 = 4 * this.field34321;
      var6[0] = 0;
      int var11 = (int)this.field34333[1 + var10];
      int var12 = 0;
      int var13 = 1;
      int var14 = var7;

      for (int var15 = 2; var15 <= var11 + 1; var15++) {
         int var16 = (int)this.field34333[var15 + var10];
         int var17 = var16 * var13;
         int var18 = this.field34321 / var17;
         int var19 = var18 + var18;
         int var20 = var19 * var13;
         switch (var16) {
            case 2:
               if (var12 == 0) {
                  this.method27231(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method27231(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            case 3:
               if (var12 == 0) {
                  this.method27233(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method27233(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            case 4:
               if (var12 == 0) {
                  this.method27235(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method27235(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            case 5:
               if (var12 == 0) {
                  this.method27237(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method27237(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            default:
               if (var12 == 0) {
                  this.method27239(var6, var19, var16, var13, var20, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method27239(var6, var19, var16, var13, var20, var8, 0, var1, var2, var14, var3);
               }

               if (var6[0] != 0) {
                  var12 = 1 - var12;
               }
         }

         var13 = var17;
         var14 += (var16 - 1) * var19;
      }

      if (var12 != 0) {
         System.arraycopy(var8, 0, var1, var2, var7);
      }
   }

   public void method27230(Class2381 var1, long var2, int var4) {
      int[] var7 = new int[1];
      long var8 = 2L * this.field34322;
      Class2381 var10 = new Class2381(var8);
      long var13 = 4L * this.field34322;
      var7[0] = 0;
      long var15 = (long)this.field34334.method9653(1L + var13);
      long var17 = 0L;
      long var19 = 1L;
      long var21 = var8;

      for (long var23 = 2L; var23 <= var15 + 1L; var23++) {
         int var25 = (int)this.field34334.method9653(var23 + var13);
         long var26 = (long)var25 * var19;
         long var28 = this.field34322 / var26;
         long var30 = var28 + var28;
         long var32 = var30 * var19;
         switch (var25) {
            case 2:
               if (var17 == 0L) {
                  this.method27232(var30, var19, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method27232(var30, var19, var10, 0L, var1, var2, var21, (long)var4);
               }

               var17 = 1L - var17;
               break;
            case 3:
               if (var17 == 0L) {
                  this.method27234(var30, var19, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method27234(var30, var19, var10, 0L, var1, var2, var21, (long)var4);
               }

               var17 = 1L - var17;
               break;
            case 4:
               if (var17 == 0L) {
                  this.method27236(var30, var19, var1, var2, var10, 0L, var21, var4);
               } else {
                  this.method27236(var30, var19, var10, 0L, var1, var2, var21, var4);
               }

               var17 = 1L - var17;
               break;
            case 5:
               if (var17 == 0L) {
                  this.method27238(var30, var19, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method27238(var30, var19, var10, 0L, var1, var2, var21, (long)var4);
               }

               var17 = 1L - var17;
               break;
            default:
               if (var17 == 0L) {
                  this.method27240(var7, var30, (long)var25, var19, var32, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method27240(var7, var30, (long)var25, var19, var32, var10, 0L, var1, var2, var21, (long)var4);
               }

               if (var7[0] != 0) {
                  var17 = 1L - var17;
               }
         }

         var19 = var26;
         var21 += (long)(var25 - 1) * var30;
      }

      if (var17 != 0L) {
         Class8133.method28177(var10, 0L, var1, var2, var8);
      }
   }

   public void method27231(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7, int var8) {
      int var11 = var7;
      int var12 = var1 * var2;
      if (var1 > 2) {
         for (int var13 = 0; var13 < var2; var13++) {
            for (int var14 = 0; var14 < var1 - 1; var14 += 2) {
               int var15 = var13 * var1;
               int var16 = var4 + var14 + 2 * var15;
               int var27 = var16 + var1;
               double var28 = var3[var16];
               double var30 = var3[var16 + 1];
               double var32 = var3[var27];
               double var34 = var3[var27 + 1];
               int var26 = var14 + var11;
               double var36 = this.field34333[var26];
               double var38 = (double)var8 * this.field34333[var26 + 1];
               double var40 = var28 - var32;
               double var42 = var30 - var34;
               int var44 = var6 + var14 + var15;
               int var45 = var44 + var12;
               var5[var44] = var28 + var32;
               var5[var44 + 1] = var30 + var34;
               var5[var45] = var36 * var40 - var38 * var42;
               var5[var45 + 1] = var36 * var42 + var38 * var40;
            }
         }
      } else {
         for (int var46 = 0; var46 < var2; var46++) {
            int var47 = var46 * var1;
            int var48 = var4 + 2 * var47;
            int var49 = var48 + var1;
            double var17 = var3[var48];
            double var19 = var3[var48 + 1];
            double var21 = var3[var49];
            double var23 = var3[var49 + 1];
            int var25 = var6 + var47;
            int var50 = var25 + var12;
            var5[var25] = var17 + var21;
            var5[var25 + 1] = var19 + var23;
            var5[var50] = var17 - var21;
            var5[var50 + 1] = var19 - var23;
         }
      }
   }

   public void method27232(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11, long var13) {
      long var17 = var11;
      long var19 = var1 * var3;
      if (var1 > 2L) {
         for (long var21 = 0L; var21 < var3; var21++) {
            for (long var23 = 0L; var23 < var1 - 1L; var23 += 2L) {
               long var25 = var21 * var1;
               long var27 = var6 + var23 + 2L * var25;
               long var29 = var27 + var1;
               double var31 = var5.method9653(var27);
               double var33 = var5.method9653(var27 + 1L);
               double var35 = var5.method9653(var29);
               double var37 = var5.method9653(var29 + 1L);
               long var39 = var23 + var17;
               double var41 = this.field34334.method9653(var39);
               double var43 = (double)var13 * this.field34334.method9653(var39 + 1L);
               double var45 = var31 - var35;
               double var47 = var33 - var37;
               long var49 = var9 + var23 + var25;
               long var51 = var49 + var19;
               var8.method9687(var49, var31 + var35);
               var8.method9687(var49 + 1L, var33 + var37);
               var8.method9687(var51, var41 * var45 - var43 * var47);
               var8.method9687(var51 + 1L, var41 * var47 + var43 * var45);
            }
         }
      } else {
         for (long var53 = 0L; var53 < var3; var53++) {
            long var54 = var53 * var1;
            long var55 = var6 + 2L * var54;
            long var56 = var55 + var1;
            double var57 = var5.method9653(var55);
            double var58 = var5.method9653(var55 + 1L);
            double var59 = var5.method9653(var56);
            double var60 = var5.method9653(var56 + 1L);
            long var61 = var9 + var54;
            long var62 = var61 + var19;
            var8.method9687(var61, var57 + var59);
            var8.method9687(var61 + 1L, var58 + var60);
            var8.method9687(var62, var57 - var59);
            var8.method9687(var62 + 1L, var58 - var60);
         }
      }
   }

   public void method27233(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7, int var8) {
      double var11 = -0.5;
      double var13 = 0.8660254037844387;
      int var15 = var7;
      int var16 = var7 + var1;
      int var17 = var2 * var1;
      if (var1 != 2) {
         for (int var18 = 1; var18 <= var2; var18++) {
            int var19 = var4 + (3 * var18 - 2) * var1;
            int var20 = var6 + (var18 - 1) * var1;

            for (int var21 = 0; var21 < var1 - 1; var21 += 2) {
               int var49 = var21 + var19;
               int var50 = var49 + var1;
               int var51 = var49 - var1;
               double var52 = var3[var49];
               double var54 = var3[var49 + 1];
               double var56 = var3[var50];
               double var58 = var3[var50 + 1];
               double var60 = var3[var51];
               double var62 = var3[var51 + 1];
               double var34 = var52 + var56;
               double var36 = var60 + -0.5 * var34;
               double var38 = var54 + var58;
               double var40 = var62 + -0.5 * var38;
               double var42 = (double)var8 * 0.8660254037844387 * (var52 - var56);
               double var44 = (double)var8 * 0.8660254037844387 * (var54 - var58);
               double var64 = var36 - var44;
               double var66 = var36 + var44;
               double var68 = var40 + var42;
               double var70 = var40 - var42;
               int var72 = var21 + var15;
               int var73 = var21 + var16;
               double var74 = this.field34333[var72];
               double var76 = (double)var8 * this.field34333[var72 + 1];
               double var78 = this.field34333[var73];
               double var80 = (double)var8 * this.field34333[var73 + 1];
               int var82 = var21 + var20;
               int var83 = var82 + var17;
               int var84 = var83 + var17;
               var5[var82] = var60 + var34;
               var5[var82 + 1] = var62 + var38;
               var5[var83] = var74 * var64 - var76 * var68;
               var5[var83 + 1] = var74 * var68 + var76 * var64;
               var5[var84] = var78 * var66 - var80 * var70;
               var5[var84 + 1] = var78 * var70 + var80 * var66;
            }
         }
      } else {
         for (int var85 = 1; var85 <= var2; var85++) {
            int var86 = var4 + (3 * var85 - 2) * var1;
            int var87 = var86 + var1;
            int var88 = var86 - var1;
            double var22 = var3[var86];
            double var24 = var3[var86 + 1];
            double var26 = var3[var87];
            double var28 = var3[var87 + 1];
            double var30 = var3[var88];
            double var32 = var3[var88 + 1];
            double var89 = var22 + var26;
            double var90 = var30 + -0.5 * var89;
            double var91 = var24 + var28;
            double var92 = var32 + -0.5 * var91;
            double var93 = (double)var8 * 0.8660254037844387 * (var22 - var26);
            double var94 = (double)var8 * 0.8660254037844387 * (var24 - var28);
            int var46 = var6 + (var85 - 1) * var1;
            int var47 = var46 + var17;
            int var48 = var47 + var17;
            var5[var46] = var3[var88] + var89;
            var5[var46 + 1] = var32 + var91;
            var5[var47] = var90 - var94;
            var5[var47 + 1] = var92 + var93;
            var5[var48] = var90 + var94;
            var5[var48 + 1] = var92 - var93;
         }
      }
   }

   public void method27234(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11, long var13) {
      double var17 = -0.5;
      double var19 = 0.8660254037844387;
      long var21 = var11;
      long var23 = var11 + var1;
      long var25 = var3 * var1;
      if (var1 != 2L) {
         for (long var27 = 1L; var27 <= var3; var27++) {
            long var29 = var6 + (3L * var27 - 2L) * var1;
            long var31 = var9 + (var27 - 1L) * var1;

            for (long var33 = 0L; var33 < var1 - 1L; var33 += 2L) {
               long var35 = var33 + var29;
               long var37 = var35 + var1;
               long var39 = var35 - var1;
               double var41 = var5.method9653(var35);
               double var43 = var5.method9653(var35 + 1L);
               double var45 = var5.method9653(var37);
               double var59 = var5.method9653(var37 + 1L);
               double var61 = var5.method9653(var39);
               double var63 = var5.method9653(var39 + 1L);
               double var47 = var41 + var45;
               double var49 = var61 + -0.5 * var47;
               double var51 = var43 + var59;
               double var53 = var63 + -0.5 * var51;
               double var55 = (double)var13 * 0.8660254037844387 * (var41 - var45);
               double var57 = (double)var13 * 0.8660254037844387 * (var43 - var59);
               double var65 = var49 - var57;
               double var67 = var49 + var57;
               double var69 = var53 + var55;
               double var71 = var53 - var55;
               long var73 = var33 + var21;
               long var75 = var33 + var23;
               double var77 = this.field34334.method9653(var73);
               double var79 = (double)var13 * this.field34334.method9653(var73 + 1L);
               double var81 = this.field34334.method9653(var75);
               double var83 = (double)var13 * this.field34334.method9653(var75 + 1L);
               long var85 = var33 + var31;
               long var87 = var85 + var25;
               long var89 = var87 + var25;
               var8.method9687(var85, var61 + var47);
               var8.method9687(var85 + 1L, var63 + var51);
               var8.method9687(var87, var77 * var65 - var79 * var69);
               var8.method9687(var87 + 1L, var77 * var69 + var79 * var65);
               var8.method9687(var89, var81 * var67 - var83 * var71);
               var8.method9687(var89 + 1L, var81 * var71 + var83 * var67);
            }
         }
      } else {
         for (long var91 = 1L; var91 <= var3; var91++) {
            long var92 = var6 + (3L * var91 - 2L) * var1;
            long var93 = var92 + var1;
            long var94 = var92 - var1;
            double var95 = var5.method9653(var92);
            double var96 = var5.method9653(var92 + 1L);
            double var97 = var5.method9653(var93);
            double var98 = var5.method9653(var93 + 1L);
            double var99 = var5.method9653(var94);
            double var100 = var5.method9653(var94 + 1L);
            double var101 = var95 + var97;
            double var102 = var99 + -0.5 * var101;
            double var103 = var96 + var98;
            double var104 = var100 + -0.5 * var103;
            double var105 = (double)var13 * 0.8660254037844387 * (var95 - var97);
            double var106 = (double)var13 * 0.8660254037844387 * (var96 - var98);
            long var107 = var9 + (var91 - 1L) * var1;
            long var108 = var107 + var25;
            long var109 = var108 + var25;
            var8.method9687(var107, var5.method9653(var94) + var101);
            var8.method9687(var107 + 1L, var100 + var103);
            var8.method9687(var108, var102 - var106);
            var8.method9687(var108 + 1L, var104 + var105);
            var8.method9687(var109, var102 + var106);
            var8.method9687(var109 + 1L, var104 - var105);
         }
      }
   }

   public void method27235(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7, int var8) {
      int var11 = var7;
      int var12 = var7 + var1;
      int var13 = var12 + var1;
      int var14 = var2 * var1;
      if (var1 != 2) {
         for (int var15 = 0; var15 < var2; var15++) {
            int var16 = var15 * var1;
            int var17 = var4 + 1 + 4 * var16;

            for (int var18 = 0; var18 < var1 - 1; var18 += 2) {
               int var19 = var18 + var17;
               int var20 = var19 + var1;
               int var57 = var20 + var1;
               int var58 = var57 + var1;
               double var23 = var3[var19 - 1];
               double var25 = var3[var19];
               double var27 = var3[var20 - 1];
               double var29 = var3[var20];
               double var31 = var3[var57 - 1];
               double var33 = var3[var57];
               double var35 = var3[var58 - 1];
               double var59 = var3[var58];
               double var37 = var25 - var33;
               double var39 = var25 + var33;
               double var43 = var29 + var59;
               double var41 = var59 - var29;
               double var45 = var23 - var31;
               double var47 = var23 + var31;
               double var49 = var27 - var35;
               double var51 = var27 + var35;
               double var61 = var47 - var51;
               double var63 = var39 - var43;
               double var65 = var45 + (double)var8 * var41;
               double var67 = var45 - (double)var8 * var41;
               double var69 = var37 + (double)var8 * var49;
               double var71 = var37 - (double)var8 * var49;
               int var55 = var18 + var11;
               int var56 = var18 + var12;
               int var73 = var18 + var13;
               double var74 = this.field34333[var55];
               double var76 = (double)var8 * this.field34333[var55 + 1];
               double var78 = this.field34333[var56];
               double var80 = (double)var8 * this.field34333[var56 + 1];
               double var82 = this.field34333[var73];
               double var84 = (double)var8 * this.field34333[var73 + 1];
               int var86 = var6 + var18 + var16;
               int var87 = var86 + var14;
               int var88 = var87 + var14;
               int var89 = var88 + var14;
               var5[var86] = var47 + var51;
               var5[var86 + 1] = var39 + var43;
               var5[var87] = var74 * var65 - var76 * var69;
               var5[var87 + 1] = var74 * var69 + var76 * var65;
               var5[var88] = var78 * var61 - var80 * var63;
               var5[var88 + 1] = var78 * var63 + var80 * var61;
               var5[var89] = var82 * var67 - var84 * var71;
               var5[var89 + 1] = var82 * var71 + var84 * var67;
            }
         }
      } else {
         for (int var90 = 0; var90 < var2; var90++) {
            int var91 = var90 * var1;
            int var92 = var4 + 4 * var91 + 1;
            int var93 = var92 + var1;
            int var94 = var93 + var1;
            int var95 = var94 + var1;
            double var21 = var3[var92 - 1];
            double var96 = var3[var92];
            double var97 = var3[var93 - 1];
            double var98 = var3[var93];
            double var99 = var3[var94 - 1];
            double var100 = var3[var94];
            double var101 = var3[var95 - 1];
            double var102 = var3[var95];
            double var103 = var96 - var100;
            double var104 = var96 + var100;
            double var105 = var102 - var98;
            double var106 = var98 + var102;
            double var107 = var21 - var99;
            double var108 = var21 + var99;
            double var109 = var97 - var101;
            double var110 = var97 + var101;
            int var53 = var6 + var91;
            int var54 = var53 + var14;
            int var111 = var54 + var14;
            int var112 = var111 + var14;
            var5[var53] = var108 + var110;
            var5[var53 + 1] = var104 + var106;
            var5[var54] = var107 + (double)var8 * var105;
            var5[var54 + 1] = var103 + (double)var8 * var109;
            var5[var111] = var108 - var110;
            var5[var111 + 1] = var104 - var106;
            var5[var112] = var107 - (double)var8 * var105;
            var5[var112 + 1] = var103 - (double)var8 * var109;
         }
      }
   }

   public void method27236(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11, int var13) {
      long var16 = var11;
      long var18 = var11 + var1;
      long var20 = var18 + var1;
      long var22 = var3 * var1;
      if (var1 != 2L) {
         for (long var24 = 0L; var24 < var3; var24++) {
            long var26 = var24 * var1;
            long var28 = var6 + 1L + 4L * var26;

            for (long var30 = 0L; var30 < var1 - 1L; var30 += 2L) {
               long var32 = var30 + var28;
               long var34 = var32 + var1;
               long var36 = var34 + var1;
               long var38 = var36 + var1;
               double var40 = var5.method9653(var32 - 1L);
               double var42 = var5.method9653(var32);
               double var44 = var5.method9653(var34 - 1L);
               double var46 = var5.method9653(var34);
               double var48 = var5.method9653(var36 - 1L);
               double var50 = var5.method9653(var36);
               double var68 = var5.method9653(var38 - 1L);
               double var70 = var5.method9653(var38);
               double var52 = var42 - var50;
               double var54 = var42 + var50;
               double var58 = var46 + var70;
               double var56 = var70 - var46;
               double var60 = var40 - var48;
               double var62 = var40 + var48;
               double var64 = var44 - var68;
               double var66 = var44 + var68;
               double var76 = var62 - var66;
               double var78 = var54 - var58;
               double var80 = var60 + (double)var13 * var56;
               double var82 = var60 - (double)var13 * var56;
               double var84 = var52 + (double)var13 * var64;
               double var86 = var52 - (double)var13 * var64;
               long var72 = var30 + var16;
               long var74 = var30 + var18;
               long var88 = var30 + var20;
               double var90 = this.field34334.method9653(var72);
               double var92 = (double)var13 * this.field34334.method9653(var72 + 1L);
               double var94 = this.field34334.method9653(var74);
               double var96 = (double)var13 * this.field34334.method9653(var74 + 1L);
               double var98 = this.field34334.method9653(var88);
               double var100 = (double)var13 * this.field34334.method9653(var88 + 1L);
               long var102 = var9 + var30 + var26;
               long var104 = var102 + var22;
               long var106 = var104 + var22;
               long var108 = var106 + var22;
               var8.method9687(var102, var62 + var66);
               var8.method9687(var102 + 1L, var54 + var58);
               var8.method9687(var104, var90 * var80 - var92 * var84);
               var8.method9687(var104 + 1L, var90 * var84 + var92 * var80);
               var8.method9687(var106, var94 * var76 - var96 * var78);
               var8.method9687(var106 + 1L, var94 * var78 + var96 * var76);
               var8.method9687(var108, var98 * var82 - var100 * var86);
               var8.method9687(var108 + 1L, var98 * var86 + var100 * var82);
            }
         }
      } else {
         for (long var110 = 0L; var110 < var3; var110++) {
            long var111 = var110 * var1;
            long var112 = var6 + 4L * var111 + 1L;
            long var113 = var112 + var1;
            long var114 = var113 + var1;
            long var115 = var114 + var1;
            double var116 = var5.method9653(var112 - 1L);
            double var117 = var5.method9653(var112);
            double var118 = var5.method9653(var113 - 1L);
            double var119 = var5.method9653(var113);
            double var120 = var5.method9653(var114 - 1L);
            double var121 = var5.method9653(var114);
            double var122 = var5.method9653(var115 - 1L);
            double var123 = var5.method9653(var115);
            double var124 = var117 - var121;
            double var125 = var117 + var121;
            double var126 = var123 - var119;
            double var127 = var119 + var123;
            double var128 = var116 - var120;
            double var129 = var116 + var120;
            double var130 = var118 - var122;
            double var131 = var118 + var122;
            long var132 = var9 + var111;
            long var133 = var132 + var22;
            long var134 = var133 + var22;
            long var135 = var134 + var22;
            var8.method9687(var132, var129 + var131);
            var8.method9687(var132 + 1L, var125 + var127);
            var8.method9687(var133, var128 + (double)var13 * var126);
            var8.method9687(var133 + 1L, var124 + (double)var13 * var130);
            var8.method9687(var134, var129 - var131);
            var8.method9687(var134 + 1L, var125 - var127);
            var8.method9687(var135, var128 - (double)var13 * var126);
            var8.method9687(var135 + 1L, var124 - (double)var13 * var130);
         }
      }
   }

   public void method27237(int var1, int var2, double[] var3, int var4, double[] var5, int var6, int var7, int var8) {
      double var11 = 0.30901699437494745;
      double var13 = 0.9510565162951535;
      double var15 = -0.8090169943749473;
      double var17 = 0.5877852522924732;
      int var19 = var7;
      int var20 = var7 + var1;
      int var21 = var20 + var1;
      int var22 = var21 + var1;
      int var23 = var2 * var1;
      if (var1 != 2) {
         for (int var24 = 1; var24 <= var2; var24++) {
            int var25 = var4 + 1 + (var24 * 5 - 4) * var1;
            int var26 = var6 + (var24 - 1) * var1;

            for (int var27 = 0; var27 < var1 - 1; var27 += 2) {
               int var28 = var27 + var25;
               int var29 = var28 + var1;
               int var87 = var28 - var1;
               int var88 = var29 + var1;
               int var89 = var88 + var1;
               double var90 = var3[var28 - 1];
               double var92 = var3[var28];
               double var94 = var3[var29 - 1];
               double var96 = var3[var29];
               double var98 = var3[var87 - 1];
               double var100 = var3[var87];
               double var102 = var3[var88 - 1];
               double var104 = var3[var88];
               double var106 = var3[var89 - 1];
               double var108 = var3[var89];
               double var50 = var92 - var108;
               double var52 = var92 + var108;
               double var54 = var96 - var104;
               double var56 = var96 + var104;
               double var58 = var90 - var106;
               double var60 = var90 + var106;
               double var62 = var94 - var102;
               double var64 = var94 + var102;
               double var66 = var98 + 0.30901699437494745 * var60 + -0.8090169943749473 * var64;
               double var68 = var100 + 0.30901699437494745 * var52 + -0.8090169943749473 * var56;
               double var70 = var98 + -0.8090169943749473 * var60 + 0.30901699437494745 * var64;
               double var72 = var100 + -0.8090169943749473 * var52 + 0.30901699437494745 * var56;
               double var74 = (double)var8 * (0.9510565162951535 * var58 + 0.5877852522924732 * var62);
               double var76 = (double)var8 * (0.9510565162951535 * var50 + 0.5877852522924732 * var54);
               double var78 = (double)var8 * (0.5877852522924732 * var58 - 0.9510565162951535 * var62);
               double var80 = (double)var8 * (0.5877852522924732 * var50 - 0.9510565162951535 * var54);
               double var110 = var70 - var80;
               double var112 = var70 + var80;
               double var114 = var72 + var78;
               double var116 = var72 - var78;
               double var118 = var66 + var76;
               double var120 = var66 - var76;
               double var122 = var68 - var74;
               double var124 = var68 + var74;
               int var85 = var27 + var19;
               int var86 = var27 + var20;
               int var126 = var27 + var21;
               int var127 = var27 + var22;
               double var128 = this.field34333[var85];
               double var130 = (double)var8 * this.field34333[var85 + 1];
               double var132 = this.field34333[var86];
               double var134 = (double)var8 * this.field34333[var86 + 1];
               double var136 = this.field34333[var126];
               double var138 = (double)var8 * this.field34333[var126 + 1];
               double var140 = this.field34333[var127];
               double var142 = (double)var8 * this.field34333[var127 + 1];
               int var144 = var27 + var26;
               int var145 = var144 + var23;
               int var146 = var145 + var23;
               int var147 = var146 + var23;
               int var148 = var147 + var23;
               var5[var144] = var98 + var60 + var64;
               var5[var144 + 1] = var100 + var52 + var56;
               var5[var145] = var128 * var120 - var130 * var124;
               var5[var145 + 1] = var128 * var124 + var130 * var120;
               var5[var146] = var132 * var110 - var134 * var114;
               var5[var146 + 1] = var132 * var114 + var134 * var110;
               var5[var147] = var136 * var112 - var138 * var116;
               var5[var147 + 1] = var136 * var116 + var138 * var112;
               var5[var148] = var140 * var118 - var142 * var122;
               var5[var148 + 1] = var140 * var122 + var142 * var118;
            }
         }
      } else {
         for (int var149 = 1; var149 <= var2; var149++) {
            int var150 = var4 + (5 * var149 - 4) * var1 + 1;
            int var151 = var150 + var1;
            int var152 = var150 - var1;
            int var153 = var151 + var1;
            int var154 = var153 + var1;
            double var30 = var3[var150 - 1];
            double var32 = var3[var150];
            double var34 = var3[var151 - 1];
            double var36 = var3[var151];
            double var38 = var3[var152 - 1];
            double var40 = var3[var152];
            double var42 = var3[var153 - 1];
            double var44 = var3[var153];
            double var46 = var3[var154 - 1];
            double var48 = var3[var154];
            double var155 = var32 - var48;
            double var156 = var32 + var48;
            double var157 = var36 - var44;
            double var158 = var36 + var44;
            double var159 = var30 - var46;
            double var160 = var30 + var46;
            double var161 = var34 - var42;
            double var162 = var34 + var42;
            double var163 = var38 + 0.30901699437494745 * var160 + -0.8090169943749473 * var162;
            double var164 = var40 + 0.30901699437494745 * var156 + -0.8090169943749473 * var158;
            double var165 = var38 + -0.8090169943749473 * var160 + 0.30901699437494745 * var162;
            double var166 = var40 + -0.8090169943749473 * var156 + 0.30901699437494745 * var158;
            double var167 = (double)var8 * (0.9510565162951535 * var159 + 0.5877852522924732 * var161);
            double var168 = (double)var8 * (0.9510565162951535 * var155 + 0.5877852522924732 * var157);
            double var169 = (double)var8 * (0.5877852522924732 * var159 - 0.9510565162951535 * var161);
            double var170 = (double)var8 * (0.5877852522924732 * var155 - 0.9510565162951535 * var157);
            int var82 = var6 + (var149 - 1) * var1;
            int var83 = var82 + var23;
            int var84 = var83 + var23;
            int var171 = var84 + var23;
            int var172 = var171 + var23;
            var5[var82] = var38 + var160 + var162;
            var5[var82 + 1] = var40 + var156 + var158;
            var5[var83] = var163 - var168;
            var5[var83 + 1] = var164 + var167;
            var5[var84] = var165 - var170;
            var5[var84 + 1] = var166 + var169;
            var5[var171] = var165 + var170;
            var5[var171 + 1] = var166 - var169;
            var5[var172] = var163 + var168;
            var5[var172 + 1] = var164 - var167;
         }
      }
   }

   public void method27238(long var1, long var3, Class2381 var5, long var6, Class2381 var8, long var9, long var11, long var13) {
      double var17 = 0.30901699437494745;
      double var19 = 0.9510565162951535;
      double var21 = -0.8090169943749473;
      double var23 = 0.5877852522924732;
      long var25 = var11;
      long var27 = var11 + var1;
      long var29 = var27 + var1;
      long var31 = var29 + var1;
      long var33 = var3 * var1;
      if (var1 != 2L) {
         for (long var35 = 1L; var35 <= var3; var35++) {
            long var37 = var6 + 1L + (var35 * 5L - 4L) * var1;
            long var39 = var9 + (var35 - 1L) * var1;

            for (long var41 = 0L; var41 < var1 - 1L; var41 += 2L) {
               long var43 = var41 + var37;
               long var45 = var43 + var1;
               long var47 = var43 - var1;
               long var49 = var45 + var1;
               long var51 = var49 + var1;
               double var53 = var5.method9653(var43 - 1L);
               double var55 = var5.method9653(var43);
               double var57 = var5.method9653(var45 - 1L);
               double var59 = var5.method9653(var45);
               double var61 = var5.method9653(var47 - 1L);
               double var63 = var5.method9653(var47);
               double var65 = var5.method9653(var49 - 1L);
               double var99 = var5.method9653(var49);
               double var101 = var5.method9653(var51 - 1L);
               double var103 = var5.method9653(var51);
               double var67 = var55 - var103;
               double var69 = var55 + var103;
               double var71 = var59 - var99;
               double var73 = var59 + var99;
               double var75 = var53 - var101;
               double var77 = var53 + var101;
               double var79 = var57 - var65;
               double var81 = var57 + var65;
               double var83 = var61 + 0.30901699437494745 * var77 + -0.8090169943749473 * var81;
               double var85 = var63 + 0.30901699437494745 * var69 + -0.8090169943749473 * var73;
               double var87 = var61 + -0.8090169943749473 * var77 + 0.30901699437494745 * var81;
               double var89 = var63 + -0.8090169943749473 * var69 + 0.30901699437494745 * var73;
               double var91 = (double)var13 * (0.9510565162951535 * var75 + 0.5877852522924732 * var79);
               double var93 = (double)var13 * (0.9510565162951535 * var67 + 0.5877852522924732 * var71);
               double var95 = (double)var13 * (0.5877852522924732 * var75 - 0.9510565162951535 * var79);
               double var97 = (double)var13 * (0.5877852522924732 * var67 - 0.9510565162951535 * var71);
               double var109 = var87 - var97;
               double var111 = var87 + var97;
               double var113 = var89 + var95;
               double var115 = var89 - var95;
               double var117 = var83 + var93;
               double var119 = var83 - var93;
               double var121 = var85 - var91;
               double var123 = var85 + var91;
               long var105 = var41 + var25;
               long var107 = var41 + var27;
               long var125 = var41 + var29;
               long var127 = var41 + var31;
               double var129 = this.field34334.method9653(var105);
               double var131 = (double)var13 * this.field34334.method9653(var105 + 1L);
               double var133 = this.field34334.method9653(var107);
               double var135 = (double)var13 * this.field34334.method9653(var107 + 1L);
               double var137 = this.field34334.method9653(var125);
               double var139 = (double)var13 * this.field34334.method9653(var125 + 1L);
               double var141 = this.field34334.method9653(var127);
               double var143 = (double)var13 * this.field34334.method9653(var127 + 1L);
               long var145 = var41 + var39;
               long var147 = var145 + var33;
               long var149 = var147 + var33;
               long var151 = var149 + var33;
               long var153 = var151 + var33;
               var8.method9687(var145, var61 + var77 + var81);
               var8.method9687(var145 + 1L, var63 + var69 + var73);
               var8.method9687(var147, var129 * var119 - var131 * var123);
               var8.method9687(var147 + 1L, var129 * var123 + var131 * var119);
               var8.method9687(var149, var133 * var109 - var135 * var113);
               var8.method9687(var149 + 1L, var133 * var113 + var135 * var109);
               var8.method9687(var151, var137 * var111 - var139 * var115);
               var8.method9687(var151 + 1L, var137 * var115 + var139 * var111);
               var8.method9687(var153, var141 * var117 - var143 * var121);
               var8.method9687(var153 + 1L, var141 * var121 + var143 * var117);
            }
         }
      } else {
         for (long var155 = 1L; var155 <= var3; var155++) {
            long var156 = var6 + (5L * var155 - 4L) * var1 + 1L;
            long var157 = var156 + var1;
            long var158 = var156 - var1;
            long var159 = var157 + var1;
            long var160 = var159 + var1;
            double var161 = var5.method9653(var156 - 1L);
            double var162 = var5.method9653(var156);
            double var163 = var5.method9653(var157 - 1L);
            double var164 = var5.method9653(var157);
            double var165 = var5.method9653(var158 - 1L);
            double var166 = var5.method9653(var158);
            double var167 = var5.method9653(var159 - 1L);
            double var168 = var5.method9653(var159);
            double var169 = var5.method9653(var160 - 1L);
            double var170 = var5.method9653(var160);
            double var171 = var162 - var170;
            double var172 = var162 + var170;
            double var173 = var164 - var168;
            double var174 = var164 + var168;
            double var175 = var161 - var169;
            double var176 = var161 + var169;
            double var177 = var163 - var167;
            double var178 = var163 + var167;
            double var179 = var165 + 0.30901699437494745 * var176 + -0.8090169943749473 * var178;
            double var180 = var166 + 0.30901699437494745 * var172 + -0.8090169943749473 * var174;
            double var181 = var165 + -0.8090169943749473 * var176 + 0.30901699437494745 * var178;
            double var182 = var166 + -0.8090169943749473 * var172 + 0.30901699437494745 * var174;
            double var183 = (double)var13 * (0.9510565162951535 * var175 + 0.5877852522924732 * var177);
            double var184 = (double)var13 * (0.9510565162951535 * var171 + 0.5877852522924732 * var173);
            double var185 = (double)var13 * (0.5877852522924732 * var175 - 0.9510565162951535 * var177);
            double var186 = (double)var13 * (0.5877852522924732 * var171 - 0.9510565162951535 * var173);
            long var187 = var9 + (var155 - 1L) * var1;
            long var188 = var187 + var33;
            long var189 = var188 + var33;
            long var190 = var189 + var33;
            long var191 = var190 + var33;
            var8.method9687(var187, var165 + var176 + var178);
            var8.method9687(var187 + 1L, var166 + var172 + var174);
            var8.method9687(var188, var179 - var184);
            var8.method9687(var188 + 1L, var180 + var183);
            var8.method9687(var189, var181 - var186);
            var8.method9687(var189 + 1L, var182 + var185);
            var8.method9687(var190, var181 + var186);
            var8.method9687(var190 + 1L, var182 - var185);
            var8.method9687(var191, var179 + var184);
            var8.method9687(var191 + 1L, var180 - var183);
         }
      }
   }

   public void method27239(int[] var1, int var2, int var3, int var4, int var5, double[] var6, int var7, double[] var8, int var9, int var10, int var11) {
      int var14 = var10;
      int var15 = var2 / 2;
      int var16 = (var3 + 1) / 2;
      int var17 = var3 * var2;
      if (var2 < var4) {
         for (int var18 = 1; var18 < var16; var18++) {
            int var19 = var3 - var18;
            int var20 = var18 * var4 * var2;
            int var21 = var19 * var4 * var2;
            int var22 = var18 * var2;
            int var23 = var19 * var2;

            for (int var24 = 0; var24 < var2; var24++) {
               for (int var25 = 0; var25 < var4; var25++) {
                  int var26 = var25 * var2;
                  int var27 = var26 * var3;
                  int var28 = var9 + var24;
                  int var33 = var7 + var24;
                  double var34 = var6[var33 + var22 + var27];
                  double var36 = var6[var33 + var23 + var27];
                  var8[var28 + var26 + var20] = var34 + var36;
                  var8[var28 + var26 + var21] = var34 - var36;
               }
            }
         }

         for (int var62 = 0; var62 < var2; var62++) {
            for (int var69 = 0; var69 < var4; var69++) {
               int var76 = var69 * var2;
               var8[var9 + var62 + var76] = var6[var7 + var62 + var76 * var3];
            }
         }
      } else {
         for (int var63 = 1; var63 < var16; var63++) {
            int var66 = var3 - var63;
            int var70 = var63 * var2;
            int var77 = var66 * var2;

            for (int var85 = 0; var85 < var4; var85++) {
               int var93 = var85 * var2;
               int var101 = var93 + var70 * var4;
               int var108 = var93 + var77 * var4;
               int var115 = var93 * var3;

               for (int var121 = 0; var121 < var2; var121++) {
                  int var126 = var9 + var121;
                  double var29 = var6[var7 + var121 + var70 + var115];
                  double var31 = var6[var7 + var121 + var77 + var115];
                  var8[var126 + var101] = var29 + var31;
                  var8[var126 + var108] = var29 - var31;
               }
            }
         }

         for (int var64 = 0; var64 < var4; var64++) {
            int var71 = var64 * var2;
            int var78 = var71 * var3;

            for (int var86 = 0; var86 < var2; var86++) {
               var8[var9 + var86 + var71] = var6[var7 + var86 + var78];
            }
         }
      }

      int var38 = 2 - var2;
      int var39 = 0;
      int var65 = (var3 - 1) * var5;

      for (int var40 = 1; var40 < var16; var40++) {
         int var41 = var3 - var40;
         var38 += var2;
         int var72 = var40 * var5;
         int var79 = var41 * var5;
         int var87 = var38 + var14;
         double var42 = this.field34333[var87 - 2];
         double var44 = (double)var11 * this.field34333[var87 - 1];

         for (int var94 = 0; var94 < var5; var94++) {
            int var102 = var7 + var94;
            int var109 = var9 + var94;
            var6[var102 + var72] = var8[var109] + var42 * var8[var109 + var5];
            var6[var102 + var79] = var44 * var8[var109 + var65];
         }

         int var46 = var38;
         var39 += var2;

         for (int var95 = 2; var95 < var16; var95++) {
            int var67 = var3 - var95;
            var46 += var39;
            if (var46 > var17) {
               var46 -= var17;
            }

            int var103 = var46 + var14;
            double var47 = this.field34333[var103 - 2];
            double var49 = (double)var11 * this.field34333[var103 - 1];
            int var110 = var95 * var5;
            int var116 = var67 * var5;

            for (int var122 = 0; var122 < var5; var122++) {
               int var127 = var7 + var122;
               int var133 = var9 + var122;
               var6[var127 + var72] = var6[var127 + var72] + var47 * var8[var133 + var110];
               var6[var127 + var79] = var6[var127 + var79] + var49 * var8[var133 + var116];
            }
         }
      }

      for (int var73 = 1; var73 < var16; var73++) {
         int var80 = var73 * var5;

         for (int var88 = 0; var88 < var5; var88++) {
            int var96 = var9 + var88;
            var8[var96] += var8[var96 + var80];
         }
      }

      for (int var74 = 1; var74 < var16; var74++) {
         int var68 = var3 - var74;
         int var81 = var74 * var5;
         int var89 = var68 * var5;

         for (int var97 = 1; var97 < var5; var97 += 2) {
            int var104 = var9 + var97;
            int var111 = var7 + var97;
            int var117 = var111 + var81;
            int var123 = var111 + var89;
            double var51 = var6[var117 - 1];
            double var135 = var6[var117];
            double var136 = var6[var123 - 1];
            double var53 = var6[var123];
            int var55 = var104 + var81;
            int var56 = var104 + var89;
            var8[var55 - 1] = var51 - var53;
            var8[var56 - 1] = var51 + var53;
            var8[var55] = var135 + var136;
            var8[var56] = var135 - var136;
         }
      }

      var1[0] = 1;
      if (var2 != 2) {
         var1[0] = 0;
         System.arraycopy(var8, var9, var6, var7, var5);
         int var75 = var4 * var2;

         for (int var82 = 1; var82 < var3; var82++) {
            int var90 = var82 * var75;

            for (int var98 = 0; var98 < var4; var98++) {
               int var105 = var98 * var2;
               int var112 = var9 + var105 + var90;
               int var118 = var7 + var105 + var90;
               var6[var118] = var8[var112];
               var6[var118 + 1] = var8[var112 + 1];
            }
         }

         if (var15 > var4) {
            int var57 = 2 - var2;

            for (int var83 = 1; var83 < var3; var83++) {
               var57 += var2;
               int var91 = var83 * var4 * var2;

               for (int var99 = 0; var99 < var4; var99++) {
                  int var58 = var57;
                  int var106 = var99 * var2 + var91;

                  for (int var113 = 3; var113 < var2; var113 += 2) {
                     var58 += 2;
                     int var119 = var58 - 1 + var14;
                     double var137 = this.field34333[var119 - 1];
                     double var139 = (double)var11 * this.field34333[var119];
                     int var124 = var7 + var113 + var106;
                     int var128 = var9 + var113 + var106;
                     double var130 = var8[var128 - 1];
                     double var131 = var8[var128];
                     var6[var124 - 1] = var137 * var130 - var139 * var131;
                     var6[var124] = var137 * var131 + var139 * var130;
                  }
               }
            }
         } else {
            byte var141 = 0;

            for (int var84 = 1; var84 < var3; var84++) {
               var141 += 2;
               int var92 = var84 * var4 * var2;

               for (int var100 = 3; var100 < var2; var100 += 2) {
                  var141 += 2;
                  int var107 = var141 + var14 - 1;
                  double var138 = this.field34333[var107 - 1];
                  double var140 = (double)var11 * this.field34333[var107];
                  int var114 = var7 + var100;
                  int var120 = var9 + var100;

                  for (int var125 = 0; var125 < var4; var125++) {
                     int var129 = var125 * var2 + var92;
                     int var134 = var114 + var129;
                     int var59 = var120 + var129;
                     double var132 = var8[var59 - 1];
                     double var60 = var8[var59];
                     var6[var134 - 1] = var138 * var132 - var140 * var60;
                     var6[var134] = var138 * var60 + var140 * var132;
                  }
               }
            }
         }
      }
   }

   public void method27240(
      int[] var1, long var2, long var4, long var6, long var8, Class2381 var10, long var11, Class2381 var13, long var14, long var16, long var18
   ) {
      long var22 = var16;
      long var24 = var2 / 2L;
      long var26 = (var4 + 1L) / 2L;
      long var28 = var4 * var2;
      if (var2 < var6) {
         for (long var30 = 1L; var30 < var26; var30++) {
            long var32 = var4 - var30;
            long var34 = var30 * var6 * var2;
            long var36 = var32 * var6 * var2;
            long var38 = var30 * var2;
            long var40 = var32 * var2;

            for (long var42 = 0L; var42 < var2; var42++) {
               for (long var44 = 0L; var44 < var6; var44++) {
                  long var46 = var44 * var2;
                  long var48 = var46 * var4;
                  long var50 = var14 + var42;
                  long var52 = var11 + var42;
                  double var54 = var10.method9653(var52 + var38 + var48);
                  double var56 = var10.method9653(var52 + var40 + var48);
                  var13.method9687(var50 + var46 + var34, var54 + var56);
                  var13.method9687(var50 + var46 + var36, var54 - var56);
               }
            }
         }

         for (long var84 = 0L; var84 < var2; var84++) {
            for (long var91 = 0L; var91 < var6; var91++) {
               long var98 = var91 * var2;
               var13.method9687(var14 + var84 + var98, var10.method9653(var11 + var84 + var98 * var4));
            }
         }
      } else {
         for (long var85 = 1L; var85 < var26; var85++) {
            long var88 = var4 - var85;
            long var92 = var85 * var2;
            long var99 = var88 * var2;

            for (long var107 = 0L; var107 < var6; var107++) {
               long var115 = var107 * var2;
               long var123 = var115 + var92 * var6;
               long var130 = var115 + var99 * var6;
               long var137 = var115 * var4;

               for (long var143 = 0L; var143 < var2; var143++) {
                  long var148 = var14 + var143;
                  double var153 = var10.method9653(var11 + var143 + var92 + var137);
                  double var158 = var10.method9653(var11 + var143 + var99 + var137);
                  var13.method9687(var148 + var123, var153 + var158);
                  var13.method9687(var148 + var130, var153 - var158);
               }
            }
         }

         for (long var86 = 0L; var86 < var6; var86++) {
            long var93 = var86 * var2;
            long var100 = var93 * var4;

            for (long var108 = 0L; var108 < var2; var108++) {
               var13.method9687(var14 + var108 + var93, var10.method9653(var11 + var108 + var100));
            }
         }
      }

      long var58 = 2L - var2;
      long var60 = 0L;
      long var87 = (var4 - 1L) * var8;

      for (long var62 = 1L; var62 < var26; var62++) {
         long var64 = var4 - var62;
         var58 += var2;
         long var94 = var62 * var8;
         long var101 = var64 * var8;
         long var109 = var58 + var22;
         double var66 = this.field34334.method9653(var109 - 2L);
         double var68 = (double)var18 * this.field34334.method9653(var109 - 1L);

         for (long var116 = 0L; var116 < var8; var116++) {
            long var124 = var11 + var116;
            long var131 = var14 + var116;
            var10.method9687(var124 + var94, var13.method9653(var131) + var66 * var13.method9653(var131 + var8));
            var10.method9687(var124 + var101, var68 * var13.method9653(var131 + var87));
         }

         long var70 = var58;
         var60 += var2;

         for (long var117 = 2L; var117 < var26; var117++) {
            long var89 = var4 - var117;
            var70 += var60;
            if (var70 > var28) {
               var70 -= var28;
            }

            long var125 = var70 + var22;
            double var72 = this.field34334.method9653(var125 - 2L);
            double var74 = (double)var18 * this.field34334.method9653(var125 - 1L);
            long var132 = var117 * var8;
            long var138 = var89 * var8;

            for (long var144 = 0L; var144 < var8; var144++) {
               long var149 = var11 + var144;
               long var154 = var14 + var144;
               var10.method9687(var149 + var94, var10.method9653(var149 + var94) + var72 * var13.method9653(var154 + var132));
               var10.method9687(var149 + var101, var10.method9653(var149 + var101) + var74 * var13.method9653(var154 + var138));
            }
         }
      }

      for (long var95 = 1L; var95 < var26; var95++) {
         long var102 = var95 * var8;

         for (long var110 = 0L; var110 < var8; var110++) {
            long var118 = var14 + var110;
            var13.method9687(var118, var13.method9653(var118) + var13.method9653(var118 + var102));
         }
      }

      for (long var96 = 1L; var96 < var26; var96++) {
         long var90 = var4 - var96;
         long var103 = var96 * var8;
         long var111 = var90 * var8;

         for (long var119 = 1L; var119 < var8; var119 += 2L) {
            long var126 = var14 + var119;
            long var133 = var11 + var119;
            long var139 = var133 + var103;
            long var145 = var133 + var111;
            double var150 = var10.method9653(var139 - 1L);
            double var155 = var10.method9653(var139);
            double var159 = var10.method9653(var145 - 1L);
            double var162 = var10.method9653(var145);
            long var76 = var126 + var103;
            long var78 = var126 + var111;
            var13.method9687(var76 - 1L, var150 - var162);
            var13.method9687(var78 - 1L, var150 + var162);
            var13.method9687(var76, var155 + var159);
            var13.method9687(var78, var155 - var159);
         }
      }

      var1[0] = 1;
      if (var2 != 2L) {
         var1[0] = 0;
         Class8133.method28177(var13, var14, var10, var11, var8);
         long var97 = var6 * var2;

         for (long var104 = 1L; var104 < var4; var104++) {
            long var112 = var104 * var97;

            for (long var120 = 0L; var120 < var6; var120++) {
               long var127 = var120 * var2;
               long var134 = var14 + var127 + var112;
               long var140 = var11 + var127 + var112;
               var10.method9687(var140, var13.method9653(var134));
               var10.method9687(var140 + 1L, var13.method9653(var134 + 1L));
            }
         }

         if (var24 > var6) {
            long var80 = 2L - var2;

            for (long var105 = 1L; var105 < var4; var105++) {
               var80 += var2;
               long var113 = var105 * var6 * var2;

               for (long var121 = 0L; var121 < var6; var121++) {
                  long var82 = var80;
                  long var128 = var121 * var2 + var113;

                  for (long var135 = 3L; var135 < var2; var135 += 2L) {
                     var82 += 2L;
                     long var141 = var82 - 1L + var22;
                     double var164 = this.field34334.method9653(var141 - 1L);
                     double var166 = (double)var18 * this.field34334.method9653(var141);
                     long var146 = var11 + var135 + var128;
                     long var151 = var14 + var135 + var128;
                     double var156 = var13.method9653(var151 - 1L);
                     double var160 = var13.method9653(var151);
                     var10.method9687(var146 - 1L, var164 * var156 - var166 * var160);
                     var10.method9687(var146, var164 * var160 + var166 * var156);
                  }
               }
            }
         } else {
            long var169 = 0L;

            for (long var106 = 1L; var106 < var4; var106++) {
               var169 += 2L;
               long var114 = var106 * var6 * var2;

               for (long var122 = 3L; var122 < var2; var122 += 2L) {
                  var169 += 2L;
                  long var129 = var169 + var22 - 1L;
                  double var165 = this.field34334.method9653(var129 - 1L);
                  double var167 = (double)var18 * this.field34334.method9653(var129);
                  long var136 = var11 + var122;
                  long var142 = var14 + var122;

                  for (long var147 = 0L; var147 < var6; var147++) {
                     long var152 = var147 * var2 + var114;
                     long var157 = var136 + var152;
                     long var161 = var142 + var152;
                     double var163 = var13.method9653(var161 - 1L);
                     double var168 = var13.method9653(var161);
                     var10.method9687(var157 - 1L, var165 * var163 - var167 * var168);
                     var10.method9687(var157, var165 * var168 + var167 * var163);
                  }
               }
            }
         }
      }
   }

   // $VF: synthetic method
   public static double[] method27241(Class7990 var0) {
      return var0.field34337;
   }

   // $VF: synthetic method
   public static double[] method27242(Class7990 var0) {
      return var0.field34339;
   }

   // $VF: synthetic method
   public static Class2381 method27243(Class7990 var0) {
      return var0.field34338;
   }

   // $VF: synthetic method
   public static Class2381 method27244(Class7990 var0) {
      return var0.field34340;
   }
}
