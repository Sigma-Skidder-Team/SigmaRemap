package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class9050 {
   private final int field41431;
   private final long field41432;
   private final Class9788 field41433;
   private final boolean field41434;

   public Class9050(long var1) {
      this.field41431 = (int)var1;
      this.field41432 = var1;
      this.field41434 = Class7796.method25901() || var1 > (long)Class2373.method9693();
      this.field41433 = new Class9788(var1);
   }

   public void method33656(double[] var1, boolean var2) {
      this.method33658(var1, 0, var2);
   }

   public void method33657(Class2381 var1, boolean var2) {
      this.method33659(var1, 0L, var2);
   }

   public void method33658(double[] var1, int var2, boolean var3) {
      if (this.field41431 != 1) {
         if (this.field41434) {
            this.method33659(new Class2381(var1), (long)var2, var3);
         } else {
            int var6 = this.field41431 / 2;
            int var7 = 1 + var2;
            int var8 = var2 + this.field41431;

            for (int var9 = var7; var9 < var8; var9 += 2) {
               var1[var9] = -var1[var9];
            }

            this.field41433.method38578(var1, var2, var3);
            int var19 = Class7008.method21726();
            if (var19 > 1 && (long)var6 > Class7796.method25891()) {
               byte var20 = 2;
               int var21 = var6 / var20;
               Future[] var22 = new Future[var20];

               for (int var23 = 0; var23 < var20; var23++) {
                  int var24 = var23 * var21;
                  int var14 = var23 == var20 - 1 ? var6 : var24 + var21;
                  var22[var23] = Class7008.method21729(new Class1570(this, var2, var24, var14, var1));
               }

               try {
                  Class7008.method21730(var22);
               } catch (InterruptedException var17) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var17);
               } catch (ExecutionException var18) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var18);
               }
            } else {
               int var10 = var2 + this.field41431 - 1;

               for (int var13 = 0; var13 < var6; var13++) {
                  int var12 = var2 + var13;
                  double var15 = var1[var12];
                  int var11 = var10 - var13;
                  var1[var12] = var1[var11];
                  var1[var11] = var15;
               }
            }
         }
      }
   }

   public void method33659(Class2381 var1, long var2, boolean var4) {
      if (this.field41432 != 1L) {
         if (!this.field41434) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method33658(var1.method9655(), (int)var2, var4);
         } else {
            long var7 = this.field41432 / 2L;
            long var9 = 1L + var2;
            long var11 = var2 + this.field41432;

            for (long var13 = var9; var13 < var11; var13 += 2L) {
               var1.method9687(var13, -var1.method9653(var13));
            }

            this.field41433.method38579(var1, var2, var4);
            int var15 = Class7008.method21726();
            if (var15 > 1 && var7 > Class7796.method25891()) {
               byte var30 = 2;
               long var31 = var7 / (long)var30;
               Future[] var18 = new Future[var30];

               for (int var19 = 0; var19 < var30; var19++) {
                  long var32 = (long)var19 * var31;
                  long var33 = var19 == var30 - 1 ? var7 : var32 + var31;
                  var18[var19] = Class7008.method21729(new Class1351(this, var2, var32, var33, var1));
               }

               try {
                  Class7008.method21730(var18);
               } catch (InterruptedException var28) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var28);
               } catch (ExecutionException var29) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var29);
               }
            } else {
               long var16 = var2 + this.field41432 - 1L;

               for (long var22 = 0L; var22 < var7; var22++) {
                  long var20 = var2 + var22;
                  double var24 = var1.method9653(var20);
                  long var26 = var16 - var22;
                  var1.method9687(var20, var1.method9653(var26));
                  var1.method9687(var26, var24);
               }
            }
         }
      }
   }

   public void method33660(double[] var1, boolean var2) {
      this.method33662(var1, 0, var2);
   }

   public void method33661(Class2381 var1, boolean var2) {
      this.method33663(var1, 0L, var2);
   }

   public void method33662(double[] var1, int var2, boolean var3) {
      if (this.field41431 != 1) {
         if (this.field41434) {
            this.method33663(new Class2381(var1), (long)var2, var3);
         } else {
            int var6 = this.field41431 / 2;
            int var7 = Class7008.method21726();
            if (var7 > 1 && (long)var6 > Class7796.method25891()) {
               byte var17 = 2;
               int var18 = var6 / var17;
               Future[] var20 = new Future[var17];

               for (int var10 = 0; var10 < var17; var10++) {
                  int var11 = var10 * var18;
                  int var12 = var10 == var17 - 1 ? var6 : var11 + var18;
                  var20[var10] = Class7008.method21729(new Class1430(this, var2, var11, var12, var1));
               }

               try {
                  Class7008.method21730(var20);
               } catch (InterruptedException var15) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var15);
               } catch (ExecutionException var16) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var16);
               }
            } else {
               int var8 = var2 + this.field41431 - 1;

               for (int var9 = 0; var9 < var6; var9++) {
                  double var13 = var1[var2 + var9];
                  var1[var2 + var9] = var1[var8 - var9];
                  var1[var8 - var9] = var13;
               }
            }

            this.field41433.method38582(var1, var2, var3);
            int var19 = 1 + var2;
            int var21 = var2 + this.field41431;

            for (int var22 = var19; var22 < var21; var22 += 2) {
               var1[var22] = -var1[var22];
            }
         }
      }
   }

   public void method33663(Class2381 var1, long var2, boolean var4) {
      if (this.field41432 != 1L) {
         if (!this.field41434) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method33662(var1.method9655(), (int)var2, var4);
         } else {
            long var7 = this.field41432 / 2L;
            int var9 = Class7008.method21726();
            if (var9 > 1 && var7 > Class7796.method25891()) {
               byte var24 = 2;
               long var25 = var7 / (long)var24;
               Future[] var12 = new Future[var24];

               for (int var13 = 0; var13 < var24; var13++) {
                  long var14 = (long)var13 * var25;
                  long var16 = var13 == var24 - 1 ? var7 : var14 + var25;
                  var12[var13] = Class7008.method21729(new Class1403(this, var2, var14, var16, var1));
               }

               try {
                  Class7008.method21730(var12);
               } catch (InterruptedException var22) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var22);
               } catch (ExecutionException var23) {
                  Logger.getLogger(Class9050.class.getName()).log(Level.SEVERE, null, var23);
               }
            } else {
               long var10 = var2 + this.field41432 - 1L;

               for (long var18 = 0L; var18 < var7; var18++) {
                  double var20 = var1.method9653(var2 + var18);
                  var1.method9687(var2 + var18, var1.method9653(var10 - var18));
                  var1.method9687(var10 - var18, var20);
               }
            }

            this.field41433.method38583(var1, var2, var4);
            long var26 = 1L + var2;
            long var28 = var2 + this.field41432;

            for (long var27 = var26; var27 < var28; var27 += 2L) {
               var1.method9687(var27, -var1.method9653(var27));
            }
         }
      }
   }

   // $VF: synthetic method
   public static int method33664(Class9050 var0) {
      return var0.field41431;
   }

   // $VF: synthetic method
   public static long method33665(Class9050 var0) {
      return var0.field41432;
   }
}
