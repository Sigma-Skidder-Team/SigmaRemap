package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class9049 {
   private final int field41427;
   private final long field41428;
   private final Class7990 field41429;
   private final boolean field41430;

   public Class9049(long var1) {
      this.field41427 = (int)var1;
      this.field41428 = var1;
      this.field41430 = Class7796.method25901() || var1 > (long)Class2373.method9693();
      this.field41429 = new Class7990(var1);
   }

   public void method33646(double[] var1) {
      this.method33648(var1, 0);
   }

   public void method33647(Class2381 var1) {
      this.method33649(var1, 0L);
   }

   public void method33648(double[] var1, int var2) {
      if (this.field41427 != 1) {
         if (this.field41430) {
            this.method33649(new Class2381(var1), (long)var2);
         } else {
            this.field41429.method27172(var1, var2);
            double[] var5 = new double[this.field41427];
            System.arraycopy(var1, var2, var5, 0, this.field41427);
            int var6 = this.field41427 / 2;
            int var7 = Class7008.method21726();
            if (var7 > 1 && (long)var6 > Class7796.method25891()) {
               int var15 = 2;
               int var16 = var6 / var15;
               Future[] var17 = new Future[var15];

               for (int var18 = 0; var18 < var15; var18++) {
                  int var11 = 1 + var18 * var16;
                  int var12 = var18 == var15 - 1 ? var6 : var11 + var16;
                  var17[var18] = Class7008.method21729(new Class520(this, var11, var12, var1, var2, var5));
               }

               try {
                  Class7008.method21730(var17);
               } catch (InterruptedException var13) {
                  Logger.getLogger(Class9049.class.getName()).log(Level.SEVERE, null, var13);
               } catch (ExecutionException var14) {
                  Logger.getLogger(Class9049.class.getName()).log(Level.SEVERE, null, var14);
               }
            } else {
               for (int var10 = 1; var10 < var6; var10++) {
                  int var8 = 2 * var10;
                  int var9 = var8 + 1;
                  var1[var2 + var10] = var5[var8] - var5[var9];
                  var1[var2 + this.field41427 - var10] = var5[var8] + var5[var9];
               }
            }

            if (this.field41427 % 2 == 0) {
               var1[var2 + var6] = var5[1];
            } else {
               var1[var2 + var6] = var5[this.field41427 - 1] - var5[1];
               var1[var2 + var6 + 1] = var5[this.field41427 - 1] + var5[1];
            }
         }
      }
   }

   public void method33649(Class2381 var1, long var2) {
      if (this.field41428 != 1L) {
         if (!this.field41430) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method33648(var1.method9655(), (int)var2);
         } else {
            this.field41429.method27173(var1, var2);
            Class2381 var6 = new Class2381(this.field41428, false);
            Class8133.method28177(var1, var2, var6, 0L, this.field41428);
            long var7 = this.field41428 / 2L;
            int var9 = Class7008.method21726();
            if (var9 > 1 && var7 > Class7796.method25891()) {
               byte var22 = 2;
               long var23 = var7 / (long)var22;
               Future[] var12 = new Future[var22];

               for (int var13 = 0; var13 < var22; var13++) {
                  long var24 = 1L + (long)var13 * var23;
                  long var16 = var13 == var22 - 1 ? var7 : var24 + var23;
                  var12[var13] = Class7008.method21729(new Class1620(this, var24, var16, var1, var2, var6));
               }

               try {
                  Class7008.method21730(var12);
               } catch (InterruptedException var20) {
                  Logger.getLogger(Class9049.class.getName()).log(Level.SEVERE, null, var20);
               } catch (ExecutionException var21) {
                  Logger.getLogger(Class9049.class.getName()).log(Level.SEVERE, null, var21);
               }
            } else {
               for (long var14 = 1L; var14 < var7; var14++) {
                  long var10 = 2L * var14;
                  long var18 = var10 + 1L;
                  var1.method9687(var2 + var14, var6.method9653(var10) - var6.method9653(var18));
                  var1.method9687(var2 + this.field41428 - var14, var6.method9653(var10) + var6.method9653(var18));
               }
            }

            if (this.field41428 % 2L == 0L) {
               var1.method9687(var2 + var7, var6.method9653(1L));
            } else {
               var1.method9687(var2 + var7, var6.method9653(this.field41428 - 1L) - var6.method9653(1L));
               var1.method9687(var2 + var7 + 1L, var6.method9653(this.field41428 - 1L) + var6.method9653(1L));
            }
         }
      }
   }

   public void method33650(double[] var1, boolean var2) {
      this.method33652(var1, 0, var2);
   }

   public void method33651(Class2381 var1, boolean var2) {
      this.method33653(var1, 0L, var2);
   }

   public void method33652(double[] var1, int var2, boolean var3) {
      if (this.field41427 != 1) {
         if (!this.field41430) {
            this.method33648(var1, var2);
            if (var3) {
               Class7796.method26036(this.field41427, 1.0 / (double)this.field41427, var1, var2, false);
            }
         } else {
            this.method33653(new Class2381(var1), (long)var2, var3);
         }
      }
   }

   public void method33653(Class2381 var1, long var2, boolean var4) {
      if (this.field41427 != 1) {
         if (this.field41430) {
            this.method33649(var1, var2);
            if (var4) {
               Class7796.method26037((long)this.field41427, 1.0 / (double)this.field41427, var1, var2, false);
            }
         } else {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method33652(var1.method9655(), (int)var2, var4);
         }
      }
   }

   // $VF: synthetic method
   public static int method33654(Class9049 var0) {
      return var0.field41427;
   }

   // $VF: synthetic method
   public static long method33655(Class9049 var0) {
      return var0.field41428;
   }
}
