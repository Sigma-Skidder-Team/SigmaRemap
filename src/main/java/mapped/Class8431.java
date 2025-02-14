package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8431 {
   private int field36124;
   private long field36125;
   private int[] field36126;
   private Class2382 field36127;
   private float[] field36128;
   private Class2378 field36129;
   private int field36130;
   private long field36131;
   private int field36132;
   private long field36133;
   private boolean field36134 = false;
   private Class8630 field36135;
   private static final float field36136 = (float) Math.PI;
   private boolean field36137;

   public Class8431(long var1) {
      if (var1 < 1L) {
         throw new IllegalArgumentException("n must be greater than 0");
      } else {
         this.field36137 = Class7796.method25901() || var1 > (long)Class2373.method9693();
         this.field36124 = (int)var1;
         this.field36125 = var1;
         if (this.field36137) {
            if (!Class7796.method25908(var1)) {
               this.field36129 = this.method29636(var1);
               this.field36135 = new Class8630(2L * var1);
            } else {
               this.field36134 = true;
               this.field36127 = new Class2382(
                  (long)Class9044.method33599(
                     (double)(2L + (1L << (int)((long)(Class9044.method33564((double)(var1 / 2L) + 0.5) / Class9044.method33564(2.0)) / 2L)))
                  )
               );
               this.field36129 = new Class2378(this.field36125 * 5L / 4L);
               this.field36131 = this.field36127.method9649(0L);
               if (var1 > this.field36131 << 2) {
                  this.field36131 = this.field36125 >> 2;
                  Class7796.method25919(this.field36131, this.field36127, this.field36129);
               }

               this.field36133 = this.field36127.method9649(1L);
               if (var1 > this.field36133) {
                  this.field36133 = this.field36125;
                  Class7796.method25917(this.field36133, this.field36129, this.field36131, this.field36127);
               }
            }
         } else {
            if (var1 > 268435456L) {
               throw new IllegalArgumentException("n must be smaller or equal to 268435456 when useLargeArrays argument is set to false");
            }

            if (!Class7796.method25908(var1)) {
               this.field36128 = this.method29635(this.field36124);
               this.field36135 = new Class8630(2L * var1);
            } else {
               this.field36134 = true;
               this.field36126 = new int[(int)Class9044.method33599(
                  (double)(2 + (1 << (int)(Class9044.method33564((double)(var1 / 2L) + 0.5) / Class9044.method33564(2.0)) / 2))
               )];
               this.field36128 = new float[this.field36124 * 5 / 4];
               this.field36130 = this.field36126[0];
               if (var1 > (long)(this.field36130 << 2)) {
                  this.field36130 = this.field36124 >> 2;
                  Class7796.method25918(this.field36130, this.field36126, this.field36128);
               }

               this.field36132 = this.field36126[1];
               if (var1 > (long)this.field36132) {
                  this.field36132 = this.field36124;
                  Class7796.method25916(this.field36132, this.field36128, this.field36130, this.field36126);
               }
            }
         }
      }
   }

   public void method29627(float[] var1, boolean var2) {
      this.method29629(var1, 0, var2);
   }

   public void method29628(Class2378 var1, boolean var2) {
      this.method29630(var1, 0L, var2);
   }

   public void method29629(float[] var1, int var2, boolean var3) {
      if (this.field36124 != 1) {
         if (this.field36137) {
            this.method29630(new Class2378(var1), (long)var2, var3);
         } else if (this.field36134) {
            float var6 = var1[var2 + this.field36124 - 1];

            for (int var7 = this.field36124 - 2; var7 >= 2; var7 -= 2) {
               var1[var2 + var7 + 1] = var1[var2 + var7] - var1[var2 + var7 - 1];
               var1[var2 + var7] = var1[var2 + var7] + var1[var2 + var7 - 1];
            }

            var1[var2 + 1] = var1[var2] - var6;
            var1[var2] += var6;
            if (this.field36124 > 4) {
               method29639(this.field36124, var1, var2, this.field36132, this.field36128, this.field36130);
               Class7796.method25980(this.field36124, var1, var2, this.field36126, this.field36130, this.field36128);
            } else if (this.field36124 == 4) {
               Class7796.method25980(this.field36124, var1, var2, this.field36126, this.field36130, this.field36128);
            }

            Class7796.method26034(this.field36124, var1, var2, this.field36132, this.field36128, this.field36130);
            if (var3) {
               Class7796.method26038(this.field36124, (float)Class9044.method33546(2.0 / (double)this.field36124), var1, var2, false);
               var1[var2] /= (float)Class9044.method33546(2.0);
            }
         } else {
            int var16 = 2 * this.field36124;
            float[] var17 = new float[var16];
            System.arraycopy(var1, var2, var17, 0, this.field36124);
            int var8 = Class7008.method21726();

            for (int var9 = this.field36124; var9 < var16; var9++) {
               var17[var9] = var17[var16 - var9 - 1];
            }

            this.field36135.method30937(var17);
            if (var8 > 1 && (long)this.field36124 > Class7796.method25891()) {
               int var18 = 2;
               int var20 = this.field36124 / var18;
               Future[] var21 = new Future[var18];

               for (int var22 = 0; var22 < var18; var22++) {
                  int var12 = var22 * var20;
                  int var13 = var22 == var18 - 1 ? this.field36124 : var12 + var20;
                  var21[var22] = Class7008.method21729(new Class604(this, var12, var13, var2, var1, var17));
               }

               try {
                  Class7008.method21730(var21);
               } catch (InterruptedException var14) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var14);
               } catch (ExecutionException var15) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var15);
               }
            } else {
               for (int var19 = 0; var19 < this.field36124; var19++) {
                  int var10 = 2 * var19;
                  int var11 = var2 + var19;
                  var1[var11] = this.field36128[var10] * var17[var10] - this.field36128[var10 + 1] * var17[var10 + 1];
               }
            }

            if (var3) {
               Class7796.method26038(this.field36124, 1.0F / (float)Class9044.method33546((double)var16), var1, var2, false);
               var1[var2] /= (float)Class9044.method33546(2.0);
            }
         }
      }
   }

   public void method29630(Class2378 var1, long var2, boolean var4) {
      if (this.field36125 != 1L) {
         if (!this.field36137) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method29629(var1.method9655(), (int)var2, var4);
         } else if (this.field36134) {
            float var7 = var1.method9651(var2 + this.field36125 - 1L);

            for (long var8 = this.field36125 - 2L; var8 >= 2L; var8 -= 2L) {
               var1.method9685(var2 + var8 + 1L, var1.method9651(var2 + var8) - var1.method9651(var2 + var8 - 1L));
               var1.method9685(var2 + var8, var1.method9651(var2 + var8) + var1.method9651(var2 + var8 - 1L));
            }

            var1.method9685(var2 + 1L, var1.method9651(var2) - var7);
            var1.method9685(var2, var1.method9651(var2) + var7);
            if (this.field36125 > 4L) {
               method29640(this.field36125, var1, var2, this.field36133, this.field36129, this.field36131);
               Class7796.method25981(this.field36125, var1, var2, this.field36127, this.field36131, this.field36129);
            } else if (this.field36125 == 4L) {
               Class7796.method25981(this.field36125, var1, var2, this.field36127, this.field36131, this.field36129);
            }

            Class7796.method26035(this.field36125, var1, var2, this.field36133, this.field36129, this.field36131);
            if (var4) {
               Class7796.method26039(this.field36125, (float)Class9044.method33546(2.0 / (double)this.field36125), var1, var2, false);
               var1.method9685(var2, var1.method9651(var2) / (float)Class9044.method33546(2.0));
            }
         } else {
            long var10 = 2L * this.field36125;
            Class2378 var12 = new Class2378(var10);
            Class8133.method28175(var1, var2, var12, 0L, this.field36125);
            int var13 = Class7008.method21726();

            for (long var14 = this.field36125; var14 < var10; var14++) {
               var12.method9685(var14, var12.method9651(var10 - var14 - 1L));
            }

            this.field36135.method30938(var12);
            if (var13 > 1 && this.field36125 > Class7796.method25891()) {
               int var26 = 2;
               long var28 = this.field36125 / (long)var26;
               Future[] var16 = new Future[var26];

               for (int var17 = 0; var17 < var26; var17++) {
                  long var29 = (long)var17 * var28;
                  long var20 = var17 == var26 - 1 ? this.field36125 : var29 + var28;
                  var16[var17] = Class7008.method21729(new Class1607(this, var29, var20, var2, var1, var12));
               }

               try {
                  Class7008.method21730(var16);
               } catch (InterruptedException var24) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var24);
               } catch (ExecutionException var25) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var25);
               }
            } else {
               for (long var27 = 0L; var27 < this.field36125; var27++) {
                  long var22 = 2L * var27;
                  long var18 = var2 + var27;
                  var1.method9685(
                     var18, this.field36129.method9651(var22) * var12.method9651(var22) - this.field36129.method9651(var22 + 1L) * var12.method9651(var22 + 1L)
                  );
               }
            }

            if (var4) {
               Class7796.method26039(this.field36125, 1.0F / (float)Class9044.method33546((double)var10), var1, var2, false);
               var1.method9685(var2, var1.method9651(var2) / (float)Class9044.method33546(2.0));
            }
         }
      }
   }

   public void method29631(float[] var1, boolean var2) {
      this.method29633(var1, 0, var2);
   }

   public void method29632(Class2378 var1, boolean var2) {
      this.method29634(var1, 0L, var2);
   }

   public void method29633(float[] var1, int var2, boolean var3) {
      if (this.field36124 != 1) {
         if (this.field36137) {
            this.method29634(new Class2378(var1), (long)var2, var3);
         } else if (this.field36134) {
            if (var3) {
               Class7796.method26038(this.field36124, (float)Class9044.method33546(2.0 / (double)this.field36124), var1, var2, false);
               var1[var2] /= (float)Class9044.method33546(2.0);
            }

            Class7796.method26034(this.field36124, var1, var2, this.field36132, this.field36128, this.field36130);
            if (this.field36124 > 4) {
               Class7796.method25978(this.field36124, var1, var2, this.field36126, this.field36130, this.field36128);
               method29637(this.field36124, var1, var2, this.field36132, this.field36128, this.field36130);
            } else if (this.field36124 == 4) {
               Class7796.method25978(this.field36124, var1, var2, this.field36126, this.field36130, this.field36128);
            }

            float var6 = var1[var2] - var1[var2 + 1];
            var1[var2] += var1[var2 + 1];

            for (int var7 = 2; var7 < this.field36124; var7 += 2) {
               var1[var2 + var7 - 1] = var1[var2 + var7] - var1[var2 + var7 + 1];
               var1[var2 + var7] = var1[var2 + var7] + var1[var2 + var7 + 1];
            }

            var1[var2 + this.field36124 - 1] = var6;
         } else {
            int var16 = 2 * this.field36124;
            if (var3) {
               Class7796.method26038(this.field36124, (float)Class9044.method33546((double)var16), var1, var2, false);
               var1[var2] *= (float)Class9044.method33546(2.0);
            }

            float[] var17 = new float[var16];
            int var8 = Class7008.method21726();
            if (var8 > 1 && (long)this.field36124 > Class7796.method25891()) {
               int var18 = 2;
               int var19 = this.field36124 / var18;
               Future[] var20 = new Future[var18];

               for (int var21 = 0; var21 < var18; var21++) {
                  int var12 = var21 * var19;
                  int var13 = var21 == var18 - 1 ? this.field36124 : var12 + var19;
                  var20[var21] = Class7008.method21729(new Class1624(this, var12, var13, var1, var2, var17));
               }

               try {
                  Class7008.method21730(var20);
               } catch (InterruptedException var14) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var14);
               } catch (ExecutionException var15) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var15);
               }
            } else {
               for (int var9 = 0; var9 < this.field36124; var9++) {
                  int var10 = 2 * var9;
                  float var11 = var1[var2 + var9];
                  var17[var10] = this.field36128[var10] * var11;
                  var17[var10 + 1] = -this.field36128[var10 + 1] * var11;
               }
            }

            this.field36135.method30945(var17, true);
            System.arraycopy(var17, 0, var1, var2, this.field36124);
         }
      }
   }

   public void method29634(Class2378 var1, long var2, boolean var4) {
      if (this.field36125 != 1L) {
         if (!this.field36137) {
            if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method29633(var1.method9655(), (int)var2, var4);
         } else if (this.field36134) {
            if (var4) {
               Class7796.method26039(this.field36125, (float)Class9044.method33546(2.0 / (double)this.field36125), var1, var2, false);
               var1.method9685(var2, var1.method9651(var2) / (float)Class9044.method33546(2.0));
            }

            Class7796.method26035(this.field36125, var1, var2, this.field36133, this.field36129, this.field36131);
            if (this.field36125 > 4L) {
               Class7796.method25979(this.field36125, var1, var2, this.field36127, this.field36131, this.field36129);
               method29638(this.field36125, var1, var2, this.field36133, this.field36129, this.field36131);
            } else if (this.field36125 == 4L) {
               Class7796.method25979(this.field36125, var1, var2, this.field36127, this.field36131, this.field36129);
            }

            float var7 = var1.method9651(var2) - var1.method9651(var2 + 1L);
            var1.method9685(var2, var1.method9651(var2) + var1.method9651(var2 + 1L));

            for (long var8 = 2L; var8 < this.field36125; var8 += 2L) {
               var1.method9685(var2 + var8 - 1L, var1.method9651(var2 + var8) - var1.method9651(var2 + var8 + 1L));
               var1.method9685(var2 + var8, var1.method9651(var2 + var8) + var1.method9651(var2 + var8 + 1L));
            }

            var1.method9685(var2 + this.field36125 - 1L, var7);
         } else {
            long var10 = 2L * this.field36125;
            if (var4) {
               Class7796.method26039(this.field36125, (float)Class9044.method33546((double)var10), var1, var2, false);
               var1.method9685(var2, var1.method9651(var2) * (float)Class9044.method33546(2.0));
            }

            Class2378 var12 = new Class2378(var10);
            int var13 = Class7008.method21726();
            if (var13 > 1 && this.field36125 > Class7796.method25891()) {
               int var27 = 2;
               long var28 = this.field36125 / (long)var27;
               Future[] var16 = new Future[var27];

               for (int var17 = 0; var17 < var27; var17++) {
                  long var18 = (long)var17 * var28;
                  long var20 = var17 == var27 - 1 ? this.field36125 : var18 + var28;
                  var16[var17] = Class7008.method21729(new Class645(this, var18, var20, var1, var2, var12));
               }

               try {
                  Class7008.method21730(var16);
               } catch (InterruptedException var25) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var25);
               } catch (ExecutionException var26) {
                  Logger.getLogger(Class8431.class.getName()).log(Level.SEVERE, null, var26);
               }
            } else {
               for (long var14 = 0L; var14 < this.field36125; var14++) {
                  long var22 = 2L * var14;
                  float var24 = var1.method9651(var2 + var14);
                  var12.method9685(var22, this.field36129.method9651(var22) * var24);
                  var12.method9685(var22 + 1L, -this.field36129.method9651(var22 + 1L) * var24);
               }
            }

            this.field36135.method30946(var12, true);
            Class8133.method28175(var12, 0L, var1, var2, this.field36125);
         }
      }
   }

   private float[] method29635(int var1) {
      int var4 = 2 * var1;
      float var5 = (float) Math.PI / (float)var4;
      float[] var6 = new float[var4];
      var6[0] = 1.0F;

      for (int var7 = 1; var7 < var1; var7++) {
         int var8 = 2 * var7;
         float var9 = var5 * (float)var7;
         var6[var8] = (float)Class9044.method33578((double)var9);
         var6[var8 + 1] = -((float)Class9044.method33577((double)var9));
      }

      return var6;
   }

   private Class2378 method29636(long var1) {
      long var5 = 2L * var1;
      float var7 = (float) Math.PI / (float)var5;
      Class2378 var8 = new Class2378(var5);
      var8.method9685(0L, 1.0F);

      for (long var9 = 1L; var9 < var1; var9++) {
         long var11 = 2L * var9;
         float var13 = var7 * (float)var9;
         var8.method9685(var11, (float)Class9044.method33578((double)var13));
         var8.method9685(var11 + 1L, -((float)Class9044.method33577((double)var13)));
      }

      return var8;
   }

   private static void method29637(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         float var13 = 0.5F - var4[var5 + var3 - var10];
         float var14 = var4[var5 + var10];
         int var15 = var2 + var11;
         int var16 = var2 + var12;
         float var17 = var1[var15] - var1[var16];
         float var18 = var1[var15 + 1] + var1[var16 + 1];
         float var19 = var13 * var17 - var14 * var18;
         float var20 = var13 * var18 + var14 * var17;
         var1[var15] -= var19;
         var1[var15 + 1] = var1[var15 + 1] - var20;
         var1[var16] += var19;
         var1[var16 + 1] = var1[var16 + 1] - var20;
      }
   }

   private static void method29638(long var0, Class2378 var2, long var3, long var5, Class2378 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         float var22 = 0.5F - var7.method9651(var8 + var5 - var16);
         float var23 = var7.method9651(var8 + var16);
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var2.method9651(var24) - var2.method9651(var26);
         float var29 = var2.method9651(var24 + 1L) + var2.method9651(var26 + 1L);
         float var30 = var22 * var28 - var23 * var29;
         float var31 = var22 * var29 + var23 * var28;
         var2.method9685(var24, var2.method9651(var24) - var30);
         var2.method9685(var24 + 1L, var2.method9651(var24 + 1L) - var31);
         var2.method9685(var26, var2.method9651(var26) + var30);
         var2.method9685(var26 + 1L, var2.method9651(var26 + 1L) - var31);
      }
   }

   private static void method29639(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         float var13 = 0.5F - var4[var5 + var3 - var10];
         float var14 = var4[var5 + var10];
         int var15 = var2 + var11;
         int var16 = var2 + var12;
         float var17 = var1[var15] - var1[var16];
         float var18 = var1[var15 + 1] + var1[var16 + 1];
         float var19 = var13 * var17 + var14 * var18;
         float var20 = var13 * var18 - var14 * var17;
         var1[var15] -= var19;
         var1[var15 + 1] = var1[var15 + 1] - var20;
         var1[var16] += var19;
         var1[var16 + 1] = var1[var16 + 1] - var20;
      }
   }

   private static void method29640(long var0, Class2378 var2, long var3, long var5, Class2378 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         float var22 = 0.5F - var7.method9651(var8 + var5 - var16);
         float var23 = var7.method9651(var8 + var16);
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var2.method9651(var24) - var2.method9651(var26);
         float var29 = var2.method9651(var24 + 1L) + var2.method9651(var26 + 1L);
         float var30 = var22 * var28 + var23 * var29;
         float var31 = var22 * var29 - var23 * var28;
         var2.method9685(var24, var2.method9651(var24) - var30);
         var2.method9685(var24 + 1L, var2.method9651(var24 + 1L) - var31);
         var2.method9685(var26, var2.method9651(var26) + var30);
         var2.method9685(var26 + 1L, var2.method9651(var26 + 1L) - var31);
      }
   }

   // $VF: synthetic method
   public static float[] method29641(Class8431 var0) {
      return var0.field36128;
   }

   // $VF: synthetic method
   public static Class2378 method29642(Class8431 var0) {
      return var0.field36129;
   }
}
