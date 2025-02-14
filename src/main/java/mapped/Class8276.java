package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8276 {
   private final int field35565;
   private final long field35566;
   private final Class8431 field35567;
   private final boolean field35568;

   public Class8276(long var1) {
      this.field35565 = (int)var1;
      this.field35566 = var1;
      this.field35568 = Class7796.method25901() || var1 > (long)Class2373.method9693();
      this.field35567 = new Class8431(var1);
   }

   public void method28924(float[] var1, boolean var2) {
      this.method28926(var1, 0, var2);
   }

   public void method28925(Class2378 var1, boolean var2) {
      this.method28927(var1, 0L, var2);
   }

   public void method28926(float[] var1, int var2, boolean var3) {
      if (this.field35565 != 1) {
         if (this.field35568) {
            this.method28927(new Class2378(var1), (long)var2, var3);
         } else {
            int var6 = this.field35565 / 2;
            int var7 = 1 + var2;
            int var8 = var2 + this.field35565;

            for (int var9 = var7; var9 < var8; var9 += 2) {
               var1[var9] = -var1[var9];
            }

            this.field35567.method29629(var1, var2, var3);
            int var18 = Class7008.method21726();
            if (var18 > 1 && (long)var6 > Class7796.method25891()) {
               byte var19 = 2;
               int var20 = var6 / var19;
               Future[] var21 = new Future[var19];

               for (int var22 = 0; var22 < var19; var22++) {
                  int var23 = var22 * var20;
                  int var14 = var22 == var19 - 1 ? var6 : var23 + var20;
                  var21[var22] = Class7008.method21729(new Class1538(this, var2, var23, var14, var1));
               }

               try {
                  Class7008.method21730(var21);
               } catch (InterruptedException var16) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var16);
               } catch (ExecutionException var17) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var17);
               }
            } else {
               int var10 = var2 + this.field35565 - 1;

               for (int var13 = 0; var13 < var6; var13++) {
                  int var12 = var2 + var13;
                  float var15 = var1[var12];
                  int var11 = var10 - var13;
                  var1[var12] = var1[var11];
                  var1[var11] = var15;
               }
            }
         }
      }
   }

   public void method28927(Class2378 var1, long var2, boolean var4) {
      if (this.field35566 != 1L) {
         if (!this.field35568) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method28926(var1.method9655(), (int)var2, var4);
         } else {
            long var7 = this.field35566 / 2L;
            long var9 = 1L + var2;
            long var11 = var2 + this.field35566;

            for (long var13 = var9; var13 < var11; var13 += 2L) {
               var1.method9685(var13, -var1.method9651(var13));
            }

            this.field35567.method29630(var1, var2, var4);
            int var15 = Class7008.method21726();
            if (var15 > 1 && var7 > Class7796.method25891()) {
               byte var29 = 2;
               long var30 = var7 / (long)var29;
               Future[] var18 = new Future[var29];

               for (int var19 = 0; var19 < var29; var19++) {
                  long var31 = (long)var19 * var30;
                  long var32 = var19 == var29 - 1 ? var7 : var31 + var30;
                  var18[var19] = Class7008.method21729(new Class391(this, var2, var31, var32, var1));
               }

               try {
                  Class7008.method21730(var18);
               } catch (InterruptedException var27) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var27);
               } catch (ExecutionException var28) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var28);
               }
            } else {
               long var16 = var2 + this.field35566 - 1L;

               for (long var22 = 0L; var22 < var7; var22++) {
                  long var20 = var2 + var22;
                  float var24 = var1.method9651(var20);
                  long var25 = var16 - var22;
                  var1.method9685(var20, var1.method9651(var25));
                  var1.method9685(var25, var24);
               }
            }
         }
      }
   }

   public void method28928(float[] var1, boolean var2) {
      this.method28930(var1, 0, var2);
   }

   public void method28929(Class2378 var1, boolean var2) {
      this.method28931(var1, 0L, var2);
   }

   public void method28930(float[] var1, int var2, boolean var3) {
      if (this.field35565 != 1) {
         if (this.field35568) {
            this.method28931(new Class2378(var1), (long)var2, var3);
         } else {
            int var6 = this.field35565 / 2;
            int var7 = Class7008.method21726();
            if (var7 > 1 && (long)var6 > Class7796.method25891()) {
               byte var16 = 2;
               int var17 = var6 / var16;
               Future[] var19 = new Future[var16];

               for (int var10 = 0; var10 < var16; var10++) {
                  int var11 = var10 * var17;
                  int var12 = var10 == var16 - 1 ? var6 : var11 + var17;
                  var19[var10] = Class7008.method21729(new Class584(this, var2, var11, var12, var1));
               }

               try {
                  Class7008.method21730(var19);
               } catch (InterruptedException var14) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var14);
               } catch (ExecutionException var15) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var15);
               }
            } else {
               int var8 = var2 + this.field35565 - 1;

               for (int var9 = 0; var9 < var6; var9++) {
                  float var13 = var1[var2 + var9];
                  var1[var2 + var9] = var1[var8 - var9];
                  var1[var8 - var9] = var13;
               }
            }

            this.field35567.method29633(var1, var2, var3);
            int var18 = 1 + var2;
            int var20 = var2 + this.field35565;

            for (int var21 = var18; var21 < var20; var21 += 2) {
               var1[var21] = -var1[var21];
            }
         }
      }
   }

   public void method28931(Class2378 var1, long var2, boolean var4) {
      if (this.field35566 != 1L) {
         if (!this.field35568) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method28930(var1.method9655(), (int)var2, var4);
         } else {
            long var7 = this.field35566 / 2L;
            int var9 = Class7008.method21726();
            if (var9 > 1 && var7 > Class7796.method25891()) {
               byte var23 = 2;
               long var24 = var7 / (long)var23;
               Future[] var12 = new Future[var23];

               for (int var13 = 0; var13 < var23; var13++) {
                  long var14 = (long)var13 * var24;
                  long var16 = var13 == var23 - 1 ? var7 : var14 + var24;
                  var12[var13] = Class7008.method21729(new Class1484(this, var2, var14, var16, var1));
               }

               try {
                  Class7008.method21730(var12);
               } catch (InterruptedException var21) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var21);
               } catch (ExecutionException var22) {
                  Logger.getLogger(Class8276.class.getName()).log(Level.SEVERE, null, var22);
               }
            } else {
               long var10 = var2 + this.field35566 - 1L;

               for (long var18 = 0L; var18 < var7; var18++) {
                  float var20 = var1.method9651(var2 + var18);
                  var1.method9685(var2 + var18, var1.method9651(var10 - var18));
                  var1.method9685(var10 - var18, var20);
               }
            }

            this.field35567.method29634(var1, var2, var4);
            long var25 = 1L + var2;
            long var27 = var2 + this.field35566;

            for (long var26 = var25; var26 < var27; var26 += 2L) {
               var1.method9685(var26, -var1.method9651(var26));
            }
         }
      }
   }

   // $VF: synthetic method
   public static int method28932(Class8276 var0) {
      return var0.field35565;
   }

   // $VF: synthetic method
   public static long method28933(Class8276 var0) {
      return var0.field35566;
   }
}
