package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8174 {
   private final int field35164;
   private final long field35165;
   private final Class8630 field35166;
   private final boolean field35167;

   public Class8174(long var1) {
      this.field35164 = (int)var1;
      this.field35165 = var1;
      this.field35167 = Class7796.method25901() || var1 > (long)Class2373.method9693();
      this.field35166 = new Class8630(var1);
   }

   public void method28455(float[] var1) {
      this.method28457(var1, 0);
   }

   public void method28456(Class2378 var1) {
      this.method28458(var1, 0L);
   }

   public void method28457(float[] var1, int var2) {
      if (this.field35164 != 1) {
         if (this.field35167) {
            this.method28458(new Class2378(var1), (long)var2);
         } else {
            this.field35166.method30939(var1, var2);
            float[] var5 = new float[this.field35164];
            System.arraycopy(var1, var2, var5, 0, this.field35164);
            int var6 = this.field35164 / 2;
            int var7 = Class7008.method21726();
            if (var7 > 1 && (long)var6 > Class7796.method25891()) {
               byte var15 = 2;
               int var16 = var6 / var15;
               Future[] var17 = new Future[var15];

               for (int var18 = 0; var18 < var15; var18++) {
                  int var11 = 1 + var18 * var16;
                  int var12 = var18 == var15 - 1 ? var6 : var11 + var16;
                  var17[var18] = Class7008.method21729(new Class1515(this, var11, var12, var1, var2, var5));
               }

               try {
                  Class7008.method21730(var17);
               } catch (InterruptedException var13) {
                  Logger.getLogger(Class8174.class.getName()).log(Level.SEVERE, null, var13);
               } catch (ExecutionException var14) {
                  Logger.getLogger(Class8174.class.getName()).log(Level.SEVERE, null, var14);
               }
            } else {
               for (int var10 = 1; var10 < var6; var10++) {
                  int var8 = 2 * var10;
                  int var9 = var8 + 1;
                  var1[var2 + var10] = var5[var8] - var5[var9];
                  var1[var2 + this.field35164 - var10] = var5[var8] + var5[var9];
               }
            }

            if (this.field35164 % 2 == 0) {
               var1[var2 + var6] = var5[1];
            } else {
               var1[var2 + var6] = var5[this.field35164 - 1] - var5[1];
               var1[var2 + var6 + 1] = var5[this.field35164 - 1] + var5[1];
            }
         }
      }
   }

   public void method28458(Class2378 var1, long var2) {
      if (this.field35165 != 1L) {
         if (!this.field35167) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method28457(var1.method9655(), (int)var2);
         } else {
            this.field35166.method30940(var1, var2);
            Class2378 var6 = new Class2378(this.field35165, false);
            Class8133.method28175(var1, var2, var6, 0L, this.field35165);
            long var7 = this.field35165 / 2L;
            int var9 = Class7008.method21726();
            if (var9 > 1 && var7 > Class7796.method25891()) {
               byte var22 = 2;
               long var23 = var7 / (long)var22;
               Future[] var12 = new Future[var22];

               for (int var13 = 0; var13 < var22; var13++) {
                  long var24 = 1L + (long)var13 * var23;
                  long var16 = var13 == var22 - 1 ? var7 : var24 + var23;
                  var12[var13] = Class7008.method21729(new Class1524(this, var24, var16, var1, var2, var6));
               }

               try {
                  Class7008.method21730(var12);
               } catch (InterruptedException var20) {
                  Logger.getLogger(Class8174.class.getName()).log(Level.SEVERE, null, var20);
               } catch (ExecutionException var21) {
                  Logger.getLogger(Class8174.class.getName()).log(Level.SEVERE, null, var21);
               }
            } else {
               for (long var14 = 1L; var14 < var7; var14++) {
                  long var10 = 2L * var14;
                  long var18 = var10 + 1L;
                  var1.method9685(var2 + var14, var6.method9651(var10) - var6.method9651(var18));
                  var1.method9685(var2 + this.field35165 - var14, var6.method9651(var10) + var6.method9651(var18));
               }
            }

            if (this.field35165 % 2L == 0L) {
               var1.method9685(var2 + var7, var6.method9651(1L));
            } else {
               var1.method9685(var2 + var7, var6.method9651(this.field35165 - 1L) - var6.method9651(1L));
               var1.method9685(var2 + var7 + 1L, var6.method9651(this.field35165 - 1L) + var6.method9651(1L));
            }
         }
      }
   }

   public void method28459(float[] var1, boolean var2) {
      this.method28461(var1, 0, var2);
   }

   public void method28460(Class2378 var1, boolean var2) {
      this.method28462(var1, 0L, var2);
   }

   public void method28461(float[] var1, int var2, boolean var3) {
      if (this.field35164 != 1) {
         if (!this.field35167) {
            this.method28457(var1, var2);
            if (var3) {
               Class7796.method26038(this.field35164, 1.0F / (float)this.field35164, var1, var2, false);
            }
         } else {
            this.method28462(new Class2378(var1), (long)var2, var3);
         }
      }
   }

   public void method28462(Class2378 var1, long var2, boolean var4) {
      if (this.field35164 != 1) {
         if (this.field35167) {
            this.method28458(var1, var2);
            if (var4) {
               Class7796.method26039((long)this.field35164, 1.0F / (float)this.field35164, var1, var2, false);
            }
         } else {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method28461(var1.method9655(), (int)var2, var4);
         }
      }
   }

   // $VF: synthetic method
   public static int method28463(Class8174 var0) {
      return var0.field35164;
   }

   // $VF: synthetic method
   public static long method28464(Class8174 var0) {
      return var0.field35165;
   }
}
