package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Class8630 {
   private int field38811;
   private long field38812;
   private int field38813;
   private long field38814;
   private int[] field38815;
   private Class2382 field38816;
   private float[] field38817;
   private Class2378 field38818;
   private int field38819;
   private long field38820;
   private int field38821;
   private long field38822;
   private float[] field38823;
   private Class2378 field38824;
   private float[] field38825;
   private Class2378 field38826;
   private float[] field38827;
   private Class2378 field38828;
   private float[] field38829;
   private Class2378 field38830;
   private Class2196 field38831;
   private boolean field38832;
   private static final int[] field38833 = new int[]{4, 2, 3, 5};
   private static final float field38834 = (float) Math.PI;
   private static final float field38835 = (float) (Math.PI * 2);

   public Class8630(long var1) {
      if (var1 < 1L) {
         throw new IllegalArgumentException("n must be greater than 0");
      } else {
         this.field38832 = Class7796.method25901() || 2L * var1 > (long)Class2373.method9693();
         this.field38811 = (int)var1;
         this.field38812 = var1;
         if (this.field38832) {
            if (Class7796.method25908(this.field38812)) {
               this.field38831 = Class2196.field14347;
               this.field38816 = new Class2382(
                  2L
                     + (long)Class9044.method33599(
                        (double)(2L + (1L << (int)((long)(Class9044.method33564((double)((float)this.field38812 + 0.5F)) / Class9044.method33564(2.0)) / 2L)))
                     )
               );
               this.field38818 = new Class2378(this.field38812);
               long var5 = 2L * this.field38812;
               this.field38820 = var5 >> 2;
               Class7796.method25919(this.field38820, this.field38816, this.field38818);
               this.field38822 = this.field38812 >> 2;
               Class7796.method25917(this.field38822, this.field38818, this.field38820, this.field38816);
            } else if (Class7796.method25909(this.field38812, field38833) < 211L) {
               this.field38831 = Class2196.field14348;
               this.field38824 = new Class2378(4L * this.field38812 + 15L);
               this.field38826 = new Class2378(2L * this.field38812 + 15L);
               this.method30957();
               this.method30959();
            } else {
               this.field38831 = Class2196.field14349;
               this.field38814 = Class7796.method25904(this.field38812 * 2L - 1L);
               this.field38828 = new Class2378(2L * this.field38814);
               this.field38830 = new Class2378(2L * this.field38814);
               this.field38816 = new Class2382(
                  2L
                     + (long)Class9044.method33599(
                        (double)(2L + (1L << (int)((long)(Class9044.method33564((double)((float)this.field38814 + 0.5F)) / Class9044.method33564(2.0)) / 2L)))
                     )
               );
               this.field38818 = new Class2378(this.field38814);
               long var8 = 2L * this.field38814;
               this.field38820 = var8 >> 2;
               Class7796.method25919(this.field38820, this.field38816, this.field38818);
               this.field38822 = this.field38814 >> 2;
               Class7796.method25917(this.field38822, this.field38818, this.field38820, this.field38816);
               this.method30961();
            }
         } else if (Class7796.method25908(var1)) {
            this.field38831 = Class2196.field14347;
            this.field38815 = new int[2
               + (int)Class9044.method33599((double)(2 + (1 << (int)(Class9044.method33564((double)((float)var1 + 0.5F)) / Class9044.method33564(2.0)) / 2)))];
            this.field38817 = new float[this.field38811];
            int var7 = 2 * this.field38811;
            this.field38819 = var7 >> 2;
            Class7796.method25918(this.field38819, this.field38815, this.field38817);
            this.field38821 = this.field38811 >> 2;
            Class7796.method25916(this.field38821, this.field38817, this.field38819, this.field38815);
         } else if (Class7796.method25909(var1, field38833) < 211L) {
            this.field38831 = Class2196.field14348;
            this.field38823 = new float[4 * this.field38811 + 15];
            this.field38825 = new float[2 * this.field38811 + 15];
            this.method30956();
            this.method30958();
         } else {
            this.field38831 = Class2196.field14349;
            this.field38813 = Class7796.method25903(this.field38811 * 2 - 1);
            this.field38827 = new float[2 * this.field38813];
            this.field38829 = new float[2 * this.field38813];
            this.field38815 = new int[2
               + (int)Class9044.method33599(
                  (double)(2 + (1 << (int)(Class9044.method33564((double)((float)this.field38813 + 0.5F)) / Class9044.method33564(2.0)) / 2))
               )];
            this.field38817 = new float[this.field38813];
            int var9 = 2 * this.field38813;
            this.field38819 = var9 >> 2;
            Class7796.method25918(this.field38819, this.field38815, this.field38817);
            this.field38821 = this.field38813 >> 2;
            Class7796.method25916(this.field38821, this.field38817, this.field38819, this.field38815);
            this.method30960();
         }
      }
   }

   public void method30929(float[] var1) {
      this.method30931(var1, 0);
   }

   public void method30930(Class2378 var1) {
      this.method30932(var1, 0L);
   }

   public void method30931(float[] var1, int var2) {
      if (this.field38832) {
         this.method30932(new Class2378(var1), (long)var2);
      } else {
         if (this.field38811 == 1) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               Class7796.method25980(2 * this.field38811, var1, var2, this.field38815, this.field38819, this.field38817);
               break;
            case 2:
               this.method30996(var1, var2, -1);
               break;
            case 3:
               this.method30962(var1, var2, -1);
         }
      }
   }

   public void method30932(Class2378 var1, long var2) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30931(var1.method9655(), (int)var2);
      } else {
         if (this.field38812 == 1L) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               Class7796.method25981(2L * this.field38812, var1, var2, this.field38816, this.field38820, this.field38818);
               break;
            case 2:
               this.method30997(var1, var2, -1);
               break;
            case 3:
               this.method30963(var1, var2, -1);
         }
      }
   }

   public void method30933(float[] var1, boolean var2) {
      this.method30935(var1, 0, var2);
   }

   public void method30934(Class2378 var1, boolean var2) {
      this.method30936(var1, 0L, var2);
   }

   public void method30935(float[] var1, int var2, boolean var3) {
      if (this.field38832) {
         this.method30936(new Class2378(var1), (long)var2, var3);
      } else {
         if (this.field38811 == 1) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               Class7796.method25978(2 * this.field38811, var1, var2, this.field38815, this.field38819, this.field38817);
               break;
            case 2:
               this.method30996(var1, var2, 1);
               break;
            case 3:
               this.method30962(var1, var2, 1);
         }

         if (var3) {
            Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, true);
         }
      }
   }

   public void method30936(Class2378 var1, long var2, boolean var4) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30935(var1.method9655(), (int)var2, var4);
      } else {
         if (this.field38812 == 1L) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               Class7796.method25979(2L * this.field38812, var1, var2, this.field38816, this.field38820, this.field38818);
               break;
            case 2:
               this.method30997(var1, var2, 1);
               break;
            case 3:
               this.method30963(var1, var2, 1);
         }

         if (var4) {
            Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, true);
         }
      }
   }

   public void method30937(float[] var1) {
      this.method30939(var1, 0);
   }

   public void method30938(Class2378 var1) {
      this.method30940(var1, 0L);
   }

   public void method30939(float[] var1, int var2) {
      if (this.field38832) {
         this.method30940(new Class2378(var1), (long)var2);
      } else {
         if (this.field38811 == 1) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               if (this.field38811 > 4) {
                  Class7796.method25978(this.field38811, var1, var2, this.field38815, this.field38819, this.field38817);
                  Class7796.method26030(this.field38811, var1, var2, this.field38821, this.field38817, this.field38819);
               } else if (this.field38811 == 4) {
                  Class7796.method26024(var1, var2);
               }

               float var5 = var1[var2] - var1[var2 + 1];
               var1[var2] += var1[var2 + 1];
               var1[var2 + 1] = var5;
               break;
            case 2:
               this.method30972(var1, var2);

               for (int var6 = this.field38811 - 1; var6 >= 2; var6--) {
                  int var7 = var2 + var6;
                  float var8 = var1[var7];
                  var1[var7] = var1[var7 - 1];
                  var1[var7 - 1] = var8;
               }
               break;
            case 3:
               this.method30966(var1, var2);
         }
      }
   }

   public void method30940(Class2378 var1, long var2) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30939(var1.method9655(), (int)var2);
      } else {
         if (this.field38812 == 1L) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               if (this.field38812 > 4L) {
                  Class7796.method25979(this.field38812, var1, var2, this.field38816, this.field38820, this.field38818);
                  Class7796.method26031(this.field38812, var1, var2, this.field38822, this.field38818, this.field38820);
               } else if (this.field38812 == 4L) {
                  Class7796.method26025(var1, var2);
               }

               float var6 = var1.method9651(var2) - var1.method9651(var2 + 1L);
               var1.method9685(var2, var1.method9651(var2) + var1.method9651(var2 + 1L));
               var1.method9685(var2 + 1L, var6);
               break;
            case 2:
               this.method30973(var1, var2);

               for (long var7 = this.field38812 - 1L; var7 >= 2L; var7--) {
                  long var9 = var2 + var7;
                  float var11 = var1.method9651(var9);
                  var1.method9685(var9, var1.method9651(var9 - 1L));
                  var1.method9685(var9 - 1L, var11);
               }
               break;
            case 3:
               this.method30967(var1, var2);
         }
      }
   }

   public void method30941(float[] var1) {
      this.method30943(var1, 0);
   }

   public void method30942(Class2378 var1) {
      this.method30944(var1, 0L);
   }

   public void method30943(float[] var1, int var2) {
      if (this.field38832) {
         this.method30944(new Class2378(var1), (long)var2);
      } else {
         int var5 = 2 * this.field38811;
         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               this.method30939(var1, var2);
               int var6 = Class7008.method21726();
               if (var6 > 1 && (long)(this.field38811 / 2) > Class7796.method25891()) {
                  Future[] var15 = new Future[var6];
                  int var18 = this.field38811 / 2 / var6;

                  for (int var21 = 0; var21 < var6; var21++) {
                     int var23 = var21 * var18;
                     int var11 = var21 == var6 - 1 ? this.field38811 / 2 : var23 + var18;
                     var15[var21] = Class7008.method21729(new Class1468(this, var23, var11, var2, var5, var1));
                  }

                  try {
                     Class7008.method21730(var15);
                  } catch (InterruptedException var12) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var12);
                  } catch (ExecutionException var13) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var13);
                  }
               } else {
                  for (int var20 = 0; var20 < this.field38811 / 2; var20++) {
                     int var14 = 2 * var20;
                     int var17 = var2 + (var5 - var14) % var5;
                     var1[var17] = var1[var2 + var14];
                     var1[var17 + 1] = -var1[var2 + var14 + 1];
                  }
               }

               var1[var2 + this.field38811] = -var1[var2 + 1];
               var1[var2 + 1] = 0.0F;
               break;
            case 2:
               this.method30972(var1, var2);
               int var7;
               if (this.field38811 % 2 == 0) {
                  var7 = this.field38811 / 2;
               } else {
                  var7 = (this.field38811 + 1) / 2;
               }

               for (int var8 = 1; var8 < var7; var8++) {
                  int var9 = var2 + var5 - 2 * var8;
                  int var10 = var2 + 2 * var8;
                  var1[var9 + 1] = -var1[var10];
                  var1[var9] = var1[var10 - 1];
               }

               for (int var16 = 1; var16 < this.field38811; var16++) {
                  int var19 = var2 + this.field38811 - var16;
                  float var22 = var1[var19 + 1];
                  var1[var19 + 1] = var1[var19];
                  var1[var19] = var22;
               }

               var1[var2 + 1] = 0.0F;
               break;
            case 3:
               this.method30964(var1, var2, -1);
         }
      }
   }

   public void method30944(Class2378 var1, long var2) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30943(var1.method9655(), (int)var2);
      } else {
         long var6 = 2L * this.field38812;
         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               this.method30940(var1, var2);
               int var8 = Class7008.method21726();
               if (var8 > 1 && this.field38812 / 2L > Class7796.method25891()) {
                  Future[] var9 = new Future[var8];
                  long var10 = this.field38812 / 2L / (long)var8;

                  for (int var12 = 0; var12 < var8; var12++) {
                     long var26 = (long)var12 * var10;
                     long var27 = var12 == var8 - 1 ? this.field38812 / 2L : var26 + var10;
                     var9[var12] = Class7008.method21729(new Class489(this, var26, var27, var2, var6, var1));
                  }

                  try {
                     Class7008.method21730(var9);
                  } catch (InterruptedException var22) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var22);
                  } catch (ExecutionException var23) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var23);
                  }
               } else {
                  for (long var25 = 0L; var25 < this.field38812 / 2L; var25++) {
                     long var28 = 2L * var25;
                     long var30 = var2 + (var6 - var28) % var6;
                     var1.method9685(var30, var1.method9651(var2 + var28));
                     var1.method9685(var30 + 1L, -var1.method9651(var2 + var28 + 1L));
                  }
               }

               var1.method9685(var2 + this.field38812, -var1.method9651(var2 + 1L));
               var1.method9685(var2 + 1L, 0.0F);
               break;
            case 2:
               this.method30973(var1, var2);
               long var17;
               if (this.field38812 % 2L == 0L) {
                  var17 = this.field38812 / 2L;
               } else {
                  var17 = (this.field38812 + 1L) / 2L;
               }

               for (long var19 = 1L; var19 < var17; var19++) {
                  long var13 = var2 + var6 - 2L * var19;
                  long var15 = var2 + 2L * var19;
                  var1.method9685(var13 + 1L, -var1.method9651(var15));
                  var1.method9685(var13, var1.method9651(var15 - 1L));
               }

               for (long var29 = 1L; var29 < this.field38812; var29++) {
                  long var24 = var2 + this.field38812 - var29;
                  float var21 = var1.method9651(var24 + 1L);
                  var1.method9685(var24 + 1L, var1.method9651(var24));
                  var1.method9685(var24, var21);
               }

               var1.method9685(var2 + 1L, 0.0F);
               break;
            case 3:
               this.method30965(var1, var2, -1L);
         }
      }
   }

   public void method30945(float[] var1, boolean var2) {
      this.method30947(var1, 0, var2);
   }

   public void method30946(Class2378 var1, boolean var2) {
      this.method30948(var1, 0L, var2);
   }

   public void method30947(float[] var1, int var2, boolean var3) {
      if (this.field38832) {
         this.method30948(new Class2378(var1), (long)var2, var3);
      } else {
         if (this.field38811 == 1) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               var1[var2 + 1] = 0.5F * (var1[var2] - var1[var2 + 1]);
               var1[var2] -= var1[var2 + 1];
               if (this.field38811 > 4) {
                  Class7796.method26030(this.field38811, var1, var2, this.field38821, this.field38817, this.field38819);
                  Class7796.method25980(this.field38811, var1, var2, this.field38815, this.field38819, this.field38817);
               } else if (this.field38811 == 4) {
                  Class7796.method26028(var1, var2);
               }

               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / ((float)this.field38811 / 2.0F), var1, var2, false);
               }
               break;
            case 2:
               for (int var6 = 2; var6 < this.field38811; var6++) {
                  int var7 = var2 + var6;
                  float var8 = var1[var7 - 1];
                  var1[var7 - 1] = var1[var7];
                  var1[var7] = var8;
               }

               this.method30974(var1, var2);
               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, false);
               }
               break;
            case 3:
               this.method30968(var1, var2);
               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, false);
               }
         }
      }
   }

   public void method30948(Class2378 var1, long var2, boolean var4) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30947(var1.method9655(), (int)var2, var4);
      } else {
         if (this.field38812 == 1L) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               var1.method9685(var2 + 1L, 0.5F * (var1.method9651(var2) - var1.method9651(var2 + 1L)));
               var1.method9685(var2, var1.method9651(var2) - var1.method9651(var2 + 1L));
               if (this.field38812 > 4L) {
                  Class7796.method26031(this.field38812, var1, var2, this.field38822, this.field38818, this.field38820);
                  Class7796.method25981(this.field38812, var1, var2, this.field38816, this.field38820, this.field38818);
               } else if (this.field38812 == 4L) {
                  Class7796.method26029(var1, var2);
               }

               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / ((float)this.field38812 / 2.0F), var1, var2, false);
               }
               break;
            case 2:
               for (long var7 = 2L; var7 < this.field38812; var7++) {
                  long var9 = var2 + var7;
                  float var11 = var1.method9651(var9 - 1L);
                  var1.method9685(var9 - 1L, var1.method9651(var9));
                  var1.method9685(var9, var11);
               }

               this.method30975(var1, var2);
               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, false);
               }
               break;
            case 3:
               this.method30969(var1, var2);
               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, false);
               }
         }
      }
   }

   public void method30949(float[] var1, boolean var2) {
      this.method30951(var1, 0, var2);
   }

   public void method30950(Class2378 var1, boolean var2) {
      this.method30952(var1, 0L, var2);
   }

   public void method30951(float[] var1, int var2, boolean var3) {
      if (this.field38832) {
         this.method30952(new Class2378(var1), (long)var2, var3);
      } else {
         int var6 = 2 * this.field38811;
         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               this.method30953(var1, var2, var3);
               int var7 = Class7008.method21726();
               if (var7 > 1 && (long)(this.field38811 / 2) > Class7796.method25891()) {
                  Future[] var16 = new Future[var7];
                  int var19 = this.field38811 / 2 / var7;

                  for (int var22 = 0; var22 < var7; var22++) {
                     int var24 = var22 * var19;
                     int var12 = var22 == var7 - 1 ? this.field38811 / 2 : var24 + var19;
                     var16[var22] = Class7008.method21729(new Class1472(this, var24, var12, var2, var6, var1));
                  }

                  try {
                     Class7008.method21730(var16);
                  } catch (InterruptedException var13) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var13);
                  } catch (ExecutionException var14) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var14);
                  }
               } else {
                  for (int var21 = 0; var21 < this.field38811 / 2; var21++) {
                     int var15 = 2 * var21;
                     int var18 = var2 + (var6 - var15) % var6;
                     var1[var18] = var1[var2 + var15];
                     var1[var18 + 1] = -var1[var2 + var15 + 1];
                  }
               }

               var1[var2 + this.field38811] = -var1[var2 + 1];
               var1[var2 + 1] = 0.0F;
               break;
            case 2:
               this.method30972(var1, var2);
               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, false);
               }

               int var8;
               if (this.field38811 % 2 == 0) {
                  var8 = this.field38811 / 2;
               } else {
                  var8 = (this.field38811 + 1) / 2;
               }

               for (int var9 = 1; var9 < var8; var9++) {
                  int var10 = var2 + 2 * var9;
                  int var11 = var2 + var6 - 2 * var9;
                  var1[var10] = -var1[var10];
                  var1[var11 + 1] = -var1[var10];
                  var1[var11] = var1[var10 - 1];
               }

               for (int var17 = 1; var17 < this.field38811; var17++) {
                  int var20 = var2 + this.field38811 - var17;
                  float var23 = var1[var20 + 1];
                  var1[var20 + 1] = var1[var20];
                  var1[var20] = var23;
               }

               var1[var2 + 1] = 0.0F;
               break;
            case 3:
               this.method30964(var1, var2, 1);
               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, true);
               }
         }
      }
   }

   public void method30952(Class2378 var1, long var2, boolean var4) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30951(var1.method9655(), (int)var2, var4);
      } else {
         long var7 = 2L * this.field38812;
         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               this.method30954(var1, var2, var4);
               int var9 = Class7008.method21726();
               if (var9 > 1 && this.field38812 / 2L > Class7796.method25891()) {
                  Future[] var10 = new Future[var9];
                  long var11 = this.field38812 / 2L / (long)var9;

                  for (int var13 = 0; var13 < var9; var13++) {
                     long var27 = (long)var13 * var11;
                     long var28 = var13 == var9 - 1 ? this.field38812 / 2L : var27 + var11;
                     var10[var13] = Class7008.method21729(new Class1606(this, var27, var28, var2, var7, var1));
                  }

                  try {
                     Class7008.method21730(var10);
                  } catch (InterruptedException var23) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var23);
                  } catch (ExecutionException var24) {
                     Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var24);
                  }
               } else {
                  for (long var26 = 0L; var26 < this.field38812 / 2L; var26++) {
                     long var29 = 2L * var26;
                     long var31 = var2 + (var7 - var29) % var7;
                     var1.method9685(var31, var1.method9651(var2 + var29));
                     var1.method9685(var31 + 1L, -var1.method9651(var2 + var29 + 1L));
                  }
               }

               var1.method9685(var2 + this.field38812, -var1.method9651(var2 + 1L));
               var1.method9685(var2 + 1L, 0.0F);
               break;
            case 2:
               this.method30973(var1, var2);
               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, false);
               }

               long var18;
               if (this.field38812 % 2L == 0L) {
                  var18 = this.field38812 / 2L;
               } else {
                  var18 = (this.field38812 + 1L) / 2L;
               }

               for (long var20 = 1L; var20 < var18; var20++) {
                  long var14 = var2 + 2L * var20;
                  long var16 = var2 + var7 - 2L * var20;
                  var1.method9685(var14, -var1.method9651(var14));
                  var1.method9685(var16 + 1L, -var1.method9651(var14));
                  var1.method9685(var16, var1.method9651(var14 - 1L));
               }

               for (long var30 = 1L; var30 < this.field38812; var30++) {
                  long var25 = var2 + this.field38812 - var30;
                  float var22 = var1.method9651(var25 + 1L);
                  var1.method9685(var25 + 1L, var1.method9651(var25));
                  var1.method9685(var25, var22);
               }

               var1.method9685(var2 + 1L, 0.0F);
               break;
            case 3:
               this.method30965(var1, var2, 1L);
               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, true);
               }
         }
      }
   }

   public void method30953(float[] var1, int var2, boolean var3) {
      if (this.field38832) {
         this.method30954(new Class2378(var1), (long)var2, var3);
      } else {
         if (this.field38811 == 1) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               if (this.field38811 > 4) {
                  Class7796.method25978(this.field38811, var1, var2, this.field38815, this.field38819, this.field38817);
                  Class7796.method26032(this.field38811, var1, var2, this.field38821, this.field38817, this.field38819);
               } else if (this.field38811 == 4) {
                  Class7796.method25980(this.field38811, var1, var2, this.field38815, this.field38819, this.field38817);
               }

               float var6 = var1[var2] - var1[var2 + 1];
               var1[var2] += var1[var2 + 1];
               var1[var2 + 1] = var6;
               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, false);
               }
               break;
            case 2:
               this.method30972(var1, var2);

               for (int var7 = this.field38811 - 1; var7 >= 2; var7--) {
                  int var8 = var2 + var7;
                  float var9 = var1[var8];
                  var1[var8] = var1[var8 - 1];
                  var1[var8 - 1] = var9;
               }

               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, false);
               }

               if (this.field38811 % 2 == 0) {
                  int var10 = this.field38811 / 2;

                  for (int var12 = 1; var12 < var10; var12++) {
                     int var14 = var2 + 2 * var12 + 1;
                     var1[var14] = -var1[var14];
                  }
               } else {
                  int var11 = (this.field38811 - 1) / 2;

                  for (int var13 = 0; var13 < var11; var13++) {
                     int var15 = var2 + 2 * var13 + 1;
                     var1[var15] = -var1[var15];
                  }
               }
               break;
            case 3:
               this.method30970(var1, var2);
               if (var3) {
                  Class7796.method26038(this.field38811, 1.0F / (float)this.field38811, var1, var2, false);
               }
         }
      }
   }

   public void method30954(Class2378 var1, long var2, boolean var4) {
      if (!this.field38832) {
         if (var1.method9689() || var1.method9691() || var2 >= 2147483647L) {
            throw new IllegalArgumentException("The data array is too big.");
         }

         this.method30953(var1.method9655(), (int)var2, var4);
      } else {
         if (this.field38812 == 1L) {
            return;
         }

         switch (Class8111.field34866[this.field38831.ordinal()]) {
            case 1:
               if (this.field38812 > 4L) {
                  Class7796.method25979(this.field38812, var1, var2, this.field38816, this.field38820, this.field38818);
                  Class7796.method26033(this.field38812, var1, var2, this.field38822, this.field38818, this.field38820);
               } else if (this.field38812 == 4L) {
                  Class7796.method25981(this.field38812, var1, var2, this.field38816, this.field38820, this.field38818);
               }

               float var7 = var1.method9651(var2) - var1.method9651(var2 + 1L);
               var1.method9685(var2, var1.method9651(var2) + var1.method9651(var2 + 1L));
               var1.method9685(var2 + 1L, var7);
               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, false);
               }
               break;
            case 2:
               this.method30973(var1, var2);

               for (long var8 = this.field38812 - 1L; var8 >= 2L; var8--) {
                  long var10 = var2 + var8;
                  float var12 = var1.method9651(var10);
                  var1.method9685(var10, var1.method9651(var10 - 1L));
                  var1.method9685(var10 - 1L, var12);
               }

               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, false);
               }

               if (this.field38812 % 2L == 0L) {
                  long var15 = this.field38812 / 2L;

                  for (long var17 = 1L; var17 < var15; var17++) {
                     long var13 = var2 + 2L * var17 + 1L;
                     var1.method9685(var13, -var1.method9651(var13));
                  }
               } else {
                  long var16 = (this.field38812 - 1L) / 2L;

                  for (long var18 = 0L; var18 < var16; var18++) {
                     long var19 = var2 + 2L * var18 + 1L;
                     var1.method9685(var19, -var1.method9651(var19));
                  }
               }
               break;
            case 3:
               this.method30971(var1, var2);
               if (var4) {
                  Class7796.method26039(this.field38812, 1.0F / (float)this.field38812, var1, var2, false);
               }
         }
      }
   }

   public void method30955(int var1, int var2) {
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
               var7 = field38833[var10 - 1];
            }

            int var11;
            do {
               var11 = var8 / var7;
               int var12 = var8 - var7 * var11;
               if (var12 != 0) {
                  continue label84;
               }

               var9++;
               this.field38823[var2 + var9 + 1 + var6] = (float)var7;
               var8 = var11;
               if (var7 == 2 && var9 != 1) {
                  for (int var13 = 2; var13 <= var9; var13++) {
                     int var14 = var9 - var13 + 2;
                     int var15 = var14 + var6;
                     this.field38823[var2 + var15 + 1] = this.field38823[var2 + var15];
                  }

                  this.field38823[var2 + 2 + var6] = 2.0F;
               }
            } while (var11 != 1);

            this.field38823[var2 + var6] = (float)var1;
            this.field38823[var2 + 1 + var6] = (float)var9;
            float var16 = (float) (Math.PI * 2) / (float)var1;
            byte var32 = 1;
            int var17 = 1;

            for (int var18 = 1; var18 <= var9; var18++) {
               int var19 = (int)this.field38823[var2 + var18 + 1 + var6];
               int var20 = 0;
               int var21 = var17 * var19;
               int var22 = var1 / var21;
               int var23 = var22 + var22 + 2;
               int var24 = var19 - 1;

               for (int var31 = 1; var31 <= var24; var31++) {
                  byte var25 = var32;
                  this.field38823[var2 + var32 - 1 + var5] = 1.0F;
                  this.field38823[var2 + var32 + var5] = 0.0F;
                  var20 += var17;
                  float var26 = 0.0F;
                  float var27 = (float)var20 * var16;

                  for (int var28 = 4; var28 <= var23; var28 += 2) {
                     var32 += 2;
                     float var29 = ++var26 * var27;
                     int var33 = var32 + var5;
                     this.field38823[var2 + var33 - 1] = (float)Class9044.method33578((double)var29);
                     this.field38823[var2 + var33] = (float)Class9044.method33577((double)var29);
                  }

                  if (var19 > 5) {
                     int var34 = var25 + var5;
                     int var30 = var32 + var5;
                     this.field38823[var2 + var34 - 1] = this.field38823[var2 + var30 - 1];
                     this.field38823[var2 + var34] = this.field38823[var2 + var30];
                  }
               }

               var17 = var21;
            }

            return;
         }
      }
   }

   public final void method30956() {
      if (this.field38811 != 1) {
         int var3 = 2 * this.field38811;
         int var4 = 4 * this.field38811;
         int var5 = 0;
         int var6 = this.field38811;
         int var7 = 0;
         int var8 = 0;

         label84:
         while (true) {
            if (++var8 > 4) {
               var5 += 2;
            } else {
               var5 = field38833[var8 - 1];
            }

            int var9;
            do {
               var9 = var6 / var5;
               int var10 = var6 - var5 * var9;
               if (var10 != 0) {
                  continue label84;
               }

               var7++;
               this.field38823[var7 + 1 + var4] = (float)var5;
               var6 = var9;
               if (var5 == 2 && var7 != 1) {
                  for (int var11 = 2; var11 <= var7; var11++) {
                     int var12 = var7 - var11 + 2;
                     int var13 = var12 + var4;
                     this.field38823[var13 + 1] = this.field38823[var13];
                  }

                  this.field38823[2 + var4] = 2.0F;
               }
            } while (var9 != 1);

            this.field38823[var4] = (float)this.field38811;
            this.field38823[1 + var4] = (float)var7;
            float var14 = (float) (Math.PI * 2) / (float)this.field38811;
            byte var30 = 1;
            int var15 = 1;

            for (int var16 = 1; var16 <= var7; var16++) {
               int var17 = (int)this.field38823[var16 + 1 + var4];
               int var18 = 0;
               int var19 = var15 * var17;
               int var20 = this.field38811 / var19;
               int var21 = var20 + var20 + 2;
               int var22 = var17 - 1;

               for (int var29 = 1; var29 <= var22; var29++) {
                  byte var23 = var30;
                  this.field38823[var30 - 1 + var3] = 1.0F;
                  this.field38823[var30 + var3] = 0.0F;
                  var18 += var15;
                  float var24 = 0.0F;
                  float var25 = (float)var18 * var14;

                  for (int var26 = 4; var26 <= var21; var26 += 2) {
                     var30 += 2;
                     float var27 = ++var24 * var25;
                     int var31 = var30 + var3;
                     this.field38823[var31 - 1] = (float)Class9044.method33578((double)var27);
                     this.field38823[var31] = (float)Class9044.method33577((double)var27);
                  }

                  if (var17 > 5) {
                     int var32 = var23 + var3;
                     int var28 = var30 + var3;
                     this.field38823[var32 - 1] = this.field38823[var28 - 1];
                     this.field38823[var32] = this.field38823[var28];
                  }
               }

               var15 = var19;
            }

            return;
         }
      }
   }

   public final void method30957() {
      if (this.field38812 != 1L) {
         long var3 = 2L * this.field38812;
         long var5 = 4L * this.field38812;
         long var7 = 0L;
         long var9 = this.field38812;
         long var11 = 0L;
         long var13 = 0L;

         label84:
         while (true) {
            if (++var13 > 4L) {
               var7 += 2L;
            } else {
               var7 = (long)field38833[(int)(var13 - 1L)];
            }

            long var15;
            do {
               var15 = var9 / var7;
               long var17 = var9 - var7 * var15;
               if (var17 != 0L) {
                  continue label84;
               }

               this.field38824.method9685(++var11 + 1L + var5, (float)var7);
               var9 = var15;
               if (var7 == 2L && var11 != 1L) {
                  for (long var19 = 2L; var19 <= var11; var19++) {
                     long var21 = var11 - var19 + 2L;
                     long var23 = var21 + var5;
                     this.field38824.method9685(var23 + 1L, this.field38824.method9651(var23));
                  }

                  this.field38824.method9685(2L + var5, 2.0F);
               }
            } while (var15 != 1L);

            this.field38824.method9685(var5, (float)this.field38812);
            this.field38824.method9685(1L + var5, (float)var11);
            float var25 = (float) (Math.PI * 2) / (float)this.field38812;
            long var52 = 1L;
            long var26 = 1L;

            for (long var28 = 1L; var28 <= var11; var28++) {
               long var30 = (long)this.field38824.method9651(var28 + 1L + var5);
               long var32 = 0L;
               long var34 = var26 * var30;
               long var36 = this.field38812 / var34;
               long var38 = var36 + var36 + 2L;
               long var40 = var30 - 1L;

               for (long var51 = 1L; var51 <= var40; var51++) {
                  long var42 = var52;
                  this.field38824.method9685(var52 - 1L + var3, 1.0F);
                  this.field38824.method9685(var52 + var3, 0.0F);
                  var32 += var26;
                  float var44 = 0.0F;
                  float var45 = (float)var32 * var25;

                  for (long var46 = 4L; var46 <= var38; var46 += 2L) {
                     var52 += 2L;
                     float var48 = ++var44 * var45;
                     long var53 = var52 + var3;
                     this.field38824.method9685(var53 - 1L, (float)Class9044.method33578((double)var48));
                     this.field38824.method9685(var53, (float)Class9044.method33577((double)var48));
                  }

                  if (var30 > 5L) {
                     long var54 = var42 + var3;
                     long var49 = var52 + var3;
                     this.field38824.method9685(var54 - 1L, this.field38824.method9651(var49 - 1L));
                     this.field38824.method9685(var54, this.field38824.method9651(var49));
                  }
               }

               var26 = var34;
            }

            return;
         }
      }
   }

   public void method30958() {
      if (this.field38811 != 1) {
         int var3 = 2 * this.field38811;
         int var4 = 0;
         int var5 = this.field38811;
         int var6 = 0;
         int var7 = 0;

         label85:
         while (true) {
            if (++var7 > 4) {
               var4 += 2;
            } else {
               var4 = field38833[var7 - 1];
            }

            int var8;
            do {
               var8 = var5 / var4;
               int var9 = var5 - var4 * var8;
               if (var9 != 0) {
                  continue label85;
               }

               var6++;
               this.field38825[var6 + 1 + var3] = (float)var4;
               var5 = var8;
               if (var4 == 2 && var6 != 1) {
                  for (int var10 = 2; var10 <= var6; var10++) {
                     int var11 = var6 - var10 + 2;
                     int var12 = var11 + var3;
                     this.field38825[var12 + 1] = this.field38825[var12];
                  }

                  this.field38825[2 + var3] = 2.0F;
               }
            } while (var8 != 1);

            this.field38825[var3] = (float)this.field38811;
            this.field38825[1 + var3] = (float)var6;
            float var13 = (float) (Math.PI * 2) / (float)this.field38811;
            int var14 = 0;
            int var15 = var6 - 1;
            int var16 = 1;
            if (var15 == 0) {
               return;
            }

            for (int var17 = 1; var17 <= var15; var17++) {
               int var18 = (int)this.field38825[var17 + 1 + var3];
               int var19 = 0;
               int var20 = var16 * var18;
               int var21 = this.field38811 / var20;
               int var22 = var18 - 1;

               for (int var27 = 1; var27 <= var22; var27++) {
                  var19 += var16;
                  int var28 = var14;
                  float var23 = (float)var19 * var13;
                  float var24 = 0.0F;

                  for (int var25 = 3; var25 <= var21; var25 += 2) {
                     var28 += 2;
                     float var26 = ++var24 * var23;
                     int var29 = var28 + this.field38811;
                     this.field38825[var29 - 2] = (float)Class9044.method33578((double)var26);
                     this.field38825[var29 - 1] = (float)Class9044.method33577((double)var26);
                  }

                  var14 += var21;
               }

               var16 = var20;
            }

            return;
         }
      }
   }

   public void method30959() {
      if (this.field38812 != 1L) {
         long var3 = 2L * this.field38812;
         long var5 = 0L;
         long var7 = this.field38812;
         long var9 = 0L;
         long var11 = 0L;

         label85:
         while (true) {
            if (++var11 > 4L) {
               var5 += 2L;
            } else {
               var5 = (long)field38833[(int)(var11 - 1L)];
            }

            long var13;
            do {
               var13 = var7 / var5;
               long var15 = var7 - var5 * var13;
               if (var15 != 0L) {
                  continue label85;
               }

               this.field38826.method9685(++var9 + 1L + var3, (float)var5);
               var7 = var13;
               if (var5 == 2L && var9 != 1L) {
                  for (long var17 = 2L; var17 <= var9; var17++) {
                     long var19 = var9 - var17 + 2L;
                     long var21 = var19 + var3;
                     this.field38826.method9685(var21 + 1L, this.field38826.method9651(var21));
                  }

                  this.field38826.method9685(2L + var3, 2.0F);
               }
            } while (var13 != 1L);

            this.field38826.method9685(var3, (float)this.field38812);
            this.field38826.method9685(1L + var3, (float)var9);
            float var23 = (float) (Math.PI * 2) / (float)this.field38812;
            long var24 = 0L;
            long var26 = var9 - 1L;
            long var28 = 1L;
            if (var26 == 0L) {
               return;
            }

            for (long var30 = 1L; var30 <= var26; var30++) {
               long var32 = (long)this.field38826.method9651(var30 + 1L + var3);
               long var34 = 0L;
               long var36 = var28 * var32;
               long var38 = this.field38812 / var36;
               long var40 = var32 - 1L;

               for (long var47 = 1L; var47 <= var40; var47++) {
                  var34 += var28;
                  long var48 = var24;
                  float var42 = (float)var34 * var23;
                  float var43 = 0.0F;

                  for (long var44 = 3L; var44 <= var38; var44 += 2L) {
                     var48 += 2L;
                     float var46 = ++var43 * var42;
                     long var49 = var48 + this.field38812;
                     this.field38826.method9685(var49 - 2L, (float)Class9044.method33578((double)var46));
                     this.field38826.method9685(var49 - 1L, (float)Class9044.method33577((double)var46));
                  }

                  var24 += var38;
               }

               var28 = var36;
            }

            return;
         }
      }
   }

   private void method30960() {
      int var3 = 0;
      float var4 = (float) Math.PI / (float)this.field38811;
      this.field38827[0] = 1.0F;
      this.field38827[1] = 0.0F;

      for (int var5 = 1; var5 < this.field38811; var5++) {
         var3 += 2 * var5 - 1;
         if (var3 >= 2 * this.field38811) {
            var3 -= 2 * this.field38811;
         }

         float var7 = var4 * (float)var3;
         this.field38827[2 * var5] = (float)Class9044.method33578((double)var7);
         this.field38827[2 * var5 + 1] = (float)Class9044.method33577((double)var7);
      }

      float var8 = 1.0F / (float)this.field38813;
      this.field38829[0] = this.field38827[0] * var8;
      this.field38829[1] = this.field38827[1] * var8;

      for (int var6 = 2; var6 < 2 * this.field38811; var6 += 2) {
         this.field38829[var6] = this.field38827[var6] * var8;
         this.field38829[var6 + 1] = this.field38827[var6 + 1] * var8;
         this.field38829[2 * this.field38813 - var6] = this.field38829[var6];
         this.field38829[2 * this.field38813 - var6 + 1] = this.field38829[var6 + 1];
      }

      Class7796.method25980(2 * this.field38813, this.field38829, 0, this.field38815, this.field38819, this.field38817);
   }

   private void method30961() {
      long var3 = 0L;
      float var5 = (float) Math.PI / (float)this.field38812;
      this.field38828.method9685(0L, 1.0F);
      this.field38828.method9685(1L, 0.0F);

      for (int var6 = 1; (long)var6 < this.field38812; var6++) {
         var3 += (long)(2 * var6 - 1);
         if (var3 >= 2L * this.field38812) {
            var3 -= 2L * this.field38812;
         }

         float var8 = var5 * (float)var3;
         this.field38828.method9685((long)(2 * var6), (float)Class9044.method33578((double)var8));
         this.field38828.method9685((long)(2 * var6 + 1), (float)Class9044.method33577((double)var8));
      }

      float var9 = 1.0F / (float)this.field38814;
      this.field38830.method9685(0L, this.field38828.method9651(0L) * var9);
      this.field38830.method9685(1L, this.field38828.method9651(1L) * var9);

      for (int var7 = 2; (long)var7 < 2L * this.field38812; var7 += 2) {
         this.field38830.method9685((long)var7, this.field38828.method9651((long)var7) * var9);
         this.field38830.method9685((long)(var7 + 1), this.field38828.method9651((long)(var7 + 1)) * var9);
         this.field38830.method9685(2L * this.field38814 - (long)var7, this.field38830.method9651((long)var7));
         this.field38830.method9685(2L * this.field38814 - (long)var7 + 1L, this.field38830.method9651((long)(var7 + 1)));
      }

      Class7796.method25981(2L * this.field38814, this.field38830, 0L, this.field38816, this.field38820, this.field38818);
   }

   private void method30962(float[] var1, int var2, int var3) {
      float[] var6 = new float[2 * this.field38813];
      int var7 = Class7008.method21726();
      if (var7 > 1 && (long)this.field38811 >= Class7796.method25891()) {
         byte var25 = 2;
         if (var7 >= 4 && (long)this.field38811 >= Class7796.method25892()) {
            var25 = 4;
         }

         Future[] var31 = new Future[var25];
         int var37 = this.field38811 / var25;

         for (int var45 = 0; var45 < var25; var45++) {
            int var51 = var45 * var37;
            int var13 = var45 == var25 - 1 ? this.field38811 : var51 + var37;
            var31[var45] = Class7008.method21729(new Class429(this, var3, var51, var13, var2, var6, var1));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var19);
         }

         Class7796.method25980(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         var37 = this.field38813 / var25;

         for (int var46 = 0; var46 < var25; var46++) {
            int var52 = var46 * var37;
            int var54 = var46 == var25 - 1 ? this.field38813 : var52 + var37;
            var31[var46] = Class7008.method21729(new Class403(this, var3, var52, var54, var6));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var17);
         }

         Class7796.method25978(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         var37 = this.field38811 / var25;

         for (int var47 = 0; var47 < var25; var47++) {
            int var53 = var47 * var37;
            int var55 = var47 == var25 - 1 ? this.field38811 : var53 + var37;
            var31[var47] = Class7008.method21729(new Class1585(this, var3, var53, var55, var2, var1, var6));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var15);
         }
      } else {
         if (var3 > 0) {
            for (int var20 = 0; var20 < this.field38811; var20++) {
               int var26 = 2 * var20;
               int var32 = var26 + 1;
               int var40 = var2 + var26;
               int var48 = var2 + var32;
               var6[var26] = var1[var40] * this.field38827[var26] - var1[var48] * this.field38827[var32];
               var6[var32] = var1[var40] * this.field38827[var32] + var1[var48] * this.field38827[var26];
            }
         } else {
            for (int var8 = 0; var8 < this.field38811; var8++) {
               int var9 = 2 * var8;
               int var10 = var9 + 1;
               int var11 = var2 + var9;
               int var12 = var2 + var10;
               var6[var9] = var1[var11] * this.field38827[var9] + var1[var12] * this.field38827[var10];
               var6[var10] = -var1[var11] * this.field38827[var10] + var1[var12] * this.field38827[var9];
            }
         }

         Class7796.method25980(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         if (var3 > 0) {
            for (int var22 = 0; var22 < this.field38813; var22++) {
               int var28 = 2 * var22;
               int var34 = var28 + 1;
               float var42 = -var6[var28] * this.field38829[var34] + var6[var34] * this.field38829[var28];
               var6[var28] = var6[var28] * this.field38829[var28] + var6[var34] * this.field38829[var34];
               var6[var34] = var42;
            }
         } else {
            for (int var21 = 0; var21 < this.field38813; var21++) {
               int var27 = 2 * var21;
               int var33 = var27 + 1;
               float var41 = var6[var27] * this.field38829[var33] + var6[var33] * this.field38829[var27];
               var6[var27] = var6[var27] * this.field38829[var27] - var6[var33] * this.field38829[var33];
               var6[var33] = var41;
            }
         }

         Class7796.method25978(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         if (var3 > 0) {
            for (int var23 = 0; var23 < this.field38811; var23++) {
               int var29 = 2 * var23;
               int var35 = var29 + 1;
               int var43 = var2 + var29;
               int var49 = var2 + var35;
               var1[var43] = this.field38827[var29] * var6[var29] - this.field38827[var35] * var6[var35];
               var1[var49] = this.field38827[var35] * var6[var29] + this.field38827[var29] * var6[var35];
            }
         } else {
            for (int var24 = 0; var24 < this.field38811; var24++) {
               int var30 = 2 * var24;
               int var36 = var30 + 1;
               int var44 = var2 + var30;
               int var50 = var2 + var36;
               var1[var44] = this.field38827[var30] * var6[var30] + this.field38827[var36] * var6[var36];
               var1[var50] = -this.field38827[var36] * var6[var30] + this.field38827[var30] * var6[var36];
            }
         }
      }
   }

   private void method30963(Class2378 var1, long var2, int var4) {
      Class2378 var7 = new Class2378(2L * this.field38814);
      int var8 = Class7008.method21726();
      if (var8 > 1 && this.field38812 > Class7796.method25891()) {
         byte var9 = 2;
         if (var8 >= 4 && this.field38812 > Class7796.method25892()) {
            var9 = 4;
         }

         Future[] var10 = new Future[var9];
         long var38 = this.field38812 / (long)var9;

         for (int var13 = 0; var13 < var9; var13++) {
            long var14 = (long)var13 * var38;
            long var16 = var13 == var9 - 1 ? this.field38812 : var14 + var38;
            var10[var13] = Class7008.method21729(new Class1552(this, var4, var14, var16, var2, var7, var1));
         }

         try {
            Class7008.method21730(var10);
         } catch (InterruptedException var31) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var31);
         } catch (ExecutionException var32) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var32);
         }

         Class7796.method25981(2L * this.field38814, var7, 0L, this.field38816, this.field38820, this.field38818);
         var38 = this.field38814 / (long)var9;

         for (int var41 = 0; var41 < var9; var41++) {
            long var43 = (long)var41 * var38;
            long var45 = var41 == var9 - 1 ? this.field38814 : var43 + var38;
            var10[var41] = Class7008.method21729(new Class1371(this, var4, var43, var45, var7));
         }

         try {
            Class7008.method21730(var10);
         } catch (InterruptedException var29) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var29);
         } catch (ExecutionException var30) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var30);
         }

         Class7796.method25979(2L * this.field38814, var7, 0L, this.field38816, this.field38820, this.field38818);
         var38 = this.field38812 / (long)var9;

         for (int var42 = 0; var42 < var9; var42++) {
            long var44 = (long)var42 * var38;
            long var46 = var42 == var9 - 1 ? this.field38812 : var44 + var38;
            var10[var42] = Class7008.method21729(new Class1501(this, var4, var44, var46, var2, var1, var7));
         }

         try {
            Class7008.method21730(var10);
         } catch (InterruptedException var27) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var27);
         } catch (ExecutionException var28) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var28);
         }
      } else {
         if (var4 > 0) {
            for (long var47 = 0L; var47 < this.field38812; var47++) {
               long var33 = 2L * var47;
               long var52 = var33 + 1L;
               long var57 = var2 + var33;
               long var60 = var2 + var52;
               var7.method9685(var33, var1.method9651(var57) * this.field38828.method9651(var33) - var1.method9651(var60) * this.field38828.method9651(var52));
               var7.method9685(var52, var1.method9651(var57) * this.field38828.method9651(var52) + var1.method9651(var60) * this.field38828.method9651(var33));
            }
         } else {
            for (long var18 = 0L; var18 < this.field38812; var18++) {
               long var11 = 2L * var18;
               long var20 = var11 + 1L;
               long var22 = var2 + var11;
               long var24 = var2 + var20;
               var7.method9685(var11, var1.method9651(var22) * this.field38828.method9651(var11) + var1.method9651(var24) * this.field38828.method9651(var20));
               var7.method9685(var20, -var1.method9651(var22) * this.field38828.method9651(var20) + var1.method9651(var24) * this.field38828.method9651(var11));
            }
         }

         Class7796.method25981(2L * this.field38814, var7, 0L, this.field38816, this.field38820, this.field38818);
         if (var4 > 0) {
            for (long var49 = 0L; var49 < this.field38814; var49++) {
               long var35 = 2L * var49;
               long var54 = var35 + 1L;
               float var63 = -var7.method9651(var35) * this.field38830.method9651(var54) + var7.method9651(var54) * this.field38830.method9651(var35);
               var7.method9685(var35, var7.method9651(var35) * this.field38830.method9651(var35) + var7.method9651(var54) * this.field38830.method9651(var54));
               var7.method9685(var54, var63);
            }
         } else {
            for (long var48 = 0L; var48 < this.field38814; var48++) {
               long var34 = 2L * var48;
               long var53 = var34 + 1L;
               float var26 = var7.method9651(var34) * this.field38830.method9651(var53) + var7.method9651(var53) * this.field38830.method9651(var34);
               var7.method9685(var34, var7.method9651(var34) * this.field38830.method9651(var34) - var7.method9651(var53) * this.field38830.method9651(var53));
               var7.method9685(var53, var26);
            }
         }

         Class7796.method25979(2L * this.field38814, var7, 0L, this.field38816, this.field38820, this.field38818);
         if (var4 > 0) {
            for (long var50 = 0L; var50 < this.field38812; var50++) {
               long var36 = 2L * var50;
               long var55 = var36 + 1L;
               long var58 = var2 + var36;
               long var61 = var2 + var55;
               var1.method9685(var58, this.field38828.method9651(var36) * var7.method9651(var36) - this.field38828.method9651(var55) * var7.method9651(var55));
               var1.method9685(var61, this.field38828.method9651(var55) * var7.method9651(var36) + this.field38828.method9651(var36) * var7.method9651(var55));
            }
         } else {
            for (long var51 = 0L; var51 < this.field38812; var51++) {
               long var37 = 2L * var51;
               long var56 = var37 + 1L;
               long var59 = var2 + var37;
               long var62 = var2 + var56;
               var1.method9685(var59, this.field38828.method9651(var37) * var7.method9651(var37) + this.field38828.method9651(var56) * var7.method9651(var56));
               var1.method9685(var62, -this.field38828.method9651(var56) * var7.method9651(var37) + this.field38828.method9651(var37) * var7.method9651(var56));
            }
         }
      }
   }

   private void method30964(float[] var1, int var2, int var3) {
      float[] var6 = new float[2 * this.field38813];
      int var7 = Class7008.method21726();
      if (var7 > 1 && (long)this.field38811 >= Class7796.method25891()) {
         byte var25 = 2;
         if (var7 >= 4 && (long)this.field38811 >= Class7796.method25892()) {
            var25 = 4;
         }

         Future[] var31 = new Future[var25];
         int var37 = this.field38811 / var25;

         for (int var43 = 0; var43 < var25; var43++) {
            int var12 = var43 * var37;
            int var13 = var43 == var25 - 1 ? this.field38811 : var12 + var37;
            var31[var43] = Class7008.method21729(new Class1402(this, var3, var12, var13, var2, var6, var1));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var19);
         }

         Class7796.method25980(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         var37 = this.field38813 / var25;

         for (int var44 = 0; var44 < var25; var44++) {
            int var46 = var44 * var37;
            int var48 = var44 == var25 - 1 ? this.field38813 : var46 + var37;
            var31[var44] = Class7008.method21729(new Class761(this, var3, var46, var48, var6));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var17);
         }

         Class7796.method25978(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         var37 = this.field38811 / var25;

         for (int var45 = 0; var45 < var25; var45++) {
            int var47 = var45 * var37;
            int var49 = var45 == var25 - 1 ? this.field38811 : var47 + var37;
            var31[var45] = Class7008.method21729(new Class485(this, var3, var47, var49, var1, var2, var6));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var15);
         }
      } else {
         if (var3 > 0) {
            for (int var20 = 0; var20 < this.field38811; var20++) {
               int var26 = 2 * var20;
               int var32 = var26 + 1;
               int var40 = var2 + var20;
               var6[var26] = var1[var40] * this.field38827[var26];
               var6[var32] = var1[var40] * this.field38827[var32];
            }
         } else {
            for (int var8 = 0; var8 < this.field38811; var8++) {
               int var9 = 2 * var8;
               int var10 = var9 + 1;
               int var11 = var2 + var8;
               var6[var9] = var1[var11] * this.field38827[var9];
               var6[var10] = -var1[var11] * this.field38827[var10];
            }
         }

         Class7796.method25980(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         if (var3 > 0) {
            for (int var22 = 0; var22 < this.field38813; var22++) {
               int var28 = 2 * var22;
               int var34 = var28 + 1;
               float var42 = -var6[var28] * this.field38829[var34] + var6[var34] * this.field38829[var28];
               var6[var28] = var6[var28] * this.field38829[var28] + var6[var34] * this.field38829[var34];
               var6[var34] = var42;
            }
         } else {
            for (int var21 = 0; var21 < this.field38813; var21++) {
               int var27 = 2 * var21;
               int var33 = var27 + 1;
               float var41 = var6[var27] * this.field38829[var33] + var6[var33] * this.field38829[var27];
               var6[var27] = var6[var27] * this.field38829[var27] - var6[var33] * this.field38829[var33];
               var6[var33] = var41;
            }
         }

         Class7796.method25978(2 * this.field38813, var6, 0, this.field38815, this.field38819, this.field38817);
         if (var3 > 0) {
            for (int var23 = 0; var23 < this.field38811; var23++) {
               int var29 = 2 * var23;
               int var35 = var29 + 1;
               var1[var2 + var29] = this.field38827[var29] * var6[var29] - this.field38827[var35] * var6[var35];
               var1[var2 + var35] = this.field38827[var35] * var6[var29] + this.field38827[var29] * var6[var35];
            }
         } else {
            for (int var24 = 0; var24 < this.field38811; var24++) {
               int var30 = 2 * var24;
               int var36 = var30 + 1;
               var1[var2 + var30] = this.field38827[var30] * var6[var30] + this.field38827[var36] * var6[var36];
               var1[var2 + var36] = -this.field38827[var36] * var6[var30] + this.field38827[var30] * var6[var36];
            }
         }
      }
   }

   private void method30965(Class2378 var1, long var2, long var4) {
      Class2378 var8 = new Class2378(2L * this.field38814);
      int var9 = Class7008.method21726();
      if (var9 > 1 && this.field38812 > Class7796.method25891()) {
         byte var10 = 2;
         if (var9 >= 4 && this.field38812 > Class7796.method25892()) {
            var10 = 4;
         }

         Future[] var11 = new Future[var10];
         long var37 = this.field38812 / (long)var10;

         for (int var14 = 0; var14 < var10; var14++) {
            long var15 = (long)var14 * var37;
            long var17 = var14 == var10 - 1 ? this.field38812 : var15 + var37;
            var11[var14] = Class7008.method21729(new Class436(this, var4, var15, var17, var2, var8, var1));
         }

         try {
            Class7008.method21730(var11);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var31);
         }

         Class7796.method25981(2L * this.field38814, var8, 0L, this.field38816, this.field38820, this.field38818);
         var37 = this.field38814 / (long)var10;

         for (int var40 = 0; var40 < var10; var40++) {
            long var42 = (long)var40 * var37;
            long var44 = var40 == var10 - 1 ? this.field38814 : var42 + var37;
            var11[var40] = Class7008.method21729(new Class630(this, var4, var42, var44, var8));
         }

         try {
            Class7008.method21730(var11);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var29);
         }

         Class7796.method25979(2L * this.field38814, var8, 0L, this.field38816, this.field38820, this.field38818);
         var37 = this.field38812 / (long)var10;

         for (int var41 = 0; var41 < var10; var41++) {
            long var43 = (long)var41 * var37;
            long var45 = var41 == var10 - 1 ? this.field38812 : var43 + var37;
            var11[var41] = Class7008.method21729(new Class408(this, var4, var43, var45, var1, var2, var8));
         }

         try {
            Class7008.method21730(var11);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         if (var4 > 0L) {
            for (long var46 = 0L; var46 < this.field38812; var46++) {
               long var32 = 2L * var46;
               long var51 = var32 + 1L;
               long var56 = var2 + var46;
               var8.method9685(var32, var1.method9651(var56) * this.field38828.method9651(var32));
               var8.method9685(var51, var1.method9651(var56) * this.field38828.method9651(var51));
            }
         } else {
            for (long var19 = 0L; var19 < this.field38812; var19++) {
               long var12 = 2L * var19;
               long var21 = var12 + 1L;
               long var23 = var2 + var19;
               var8.method9685(var12, var1.method9651(var23) * this.field38828.method9651(var12));
               var8.method9685(var21, -var1.method9651(var23) * this.field38828.method9651(var21));
            }
         }

         Class7796.method25981(2L * this.field38814, var8, 0L, this.field38816, this.field38820, this.field38818);
         if (var4 > 0L) {
            for (long var48 = 0L; var48 < this.field38814; var48++) {
               long var34 = 2L * var48;
               long var53 = var34 + 1L;
               float var57 = -var8.method9651(var34) * this.field38830.method9651(var53) + var8.method9651(var53) * this.field38830.method9651(var34);
               var8.method9685(var34, var8.method9651(var34) * this.field38830.method9651(var34) + var8.method9651(var53) * this.field38830.method9651(var53));
               var8.method9685(var53, var57);
            }
         } else {
            for (long var47 = 0L; var47 < this.field38814; var47++) {
               long var33 = 2L * var47;
               long var52 = var33 + 1L;
               float var25 = var8.method9651(var33) * this.field38830.method9651(var52) + var8.method9651(var52) * this.field38830.method9651(var33);
               var8.method9685(var33, var8.method9651(var33) * this.field38830.method9651(var33) - var8.method9651(var52) * this.field38830.method9651(var52));
               var8.method9685(var52, var25);
            }
         }

         Class7796.method25979(2L * this.field38814, var8, 0L, this.field38816, this.field38820, this.field38818);
         if (var4 > 0L) {
            for (long var49 = 0L; var49 < this.field38812; var49++) {
               long var35 = 2L * var49;
               long var54 = var35 + 1L;
               var1.method9685(
                  var2 + var35, this.field38828.method9651(var35) * var8.method9651(var35) - this.field38828.method9651(var54) * var8.method9651(var54)
               );
               var1.method9685(
                  var2 + var54, this.field38828.method9651(var54) * var8.method9651(var35) + this.field38828.method9651(var35) * var8.method9651(var54)
               );
            }
         } else {
            for (long var50 = 0L; var50 < this.field38812; var50++) {
               long var36 = 2L * var50;
               long var55 = var36 + 1L;
               var1.method9685(
                  var2 + var36, this.field38828.method9651(var36) * var8.method9651(var36) + this.field38828.method9651(var55) * var8.method9651(var55)
               );
               var1.method9685(
                  var2 + var55, -this.field38828.method9651(var55) * var8.method9651(var36) + this.field38828.method9651(var36) * var8.method9651(var55)
               );
            }
         }
      }
   }

   private void method30966(float[] var1, int var2) {
      float[] var5 = new float[2 * this.field38813];
      int var6 = Class7008.method21726();
      if (var6 > 1 && (long)this.field38811 >= Class7796.method25891()) {
         byte var18 = 2;
         if (var6 >= 4 && (long)this.field38811 >= Class7796.method25892()) {
            var18 = 4;
         }

         Future[] var22 = new Future[var18];
         int var26 = this.field38811 / var18;

         for (int var31 = 0; var31 < var18; var31++) {
            int var11 = var31 * var26;
            int var12 = var31 == var18 - 1 ? this.field38811 : var11 + var26;
            var22[var31] = Class7008.method21729(new Class437(this, var11, var12, var2, var5, var1));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var16);
         }

         Class7796.method25980(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);
         var26 = this.field38813 / var18;

         for (int var32 = 0; var32 < var18; var32++) {
            int var33 = var32 * var26;
            int var34 = var32 == var18 - 1 ? this.field38813 : var33 + var26;
            var22[var32] = Class7008.method21729(new Class771(this, var33, var34, var5));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var14);
         }
      } else {
         for (int var7 = 0; var7 < this.field38811; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = var2 + var7;
            var5[var8] = var1[var10] * this.field38827[var8];
            var5[var9] = -var1[var10] * this.field38827[var9];
         }

         Class7796.method25980(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);

         for (int var17 = 0; var17 < this.field38813; var17++) {
            int var21 = 2 * var17;
            int var25 = var21 + 1;
            float var30 = var5[var21] * this.field38829[var25] + var5[var25] * this.field38829[var21];
            var5[var21] = var5[var21] * this.field38829[var21] - var5[var25] * this.field38829[var25];
            var5[var25] = var30;
         }
      }

      Class7796.method25978(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);
      if (this.field38811 % 2 == 0) {
         var1[var2] = this.field38827[0] * var5[0] + this.field38827[1] * var5[1];
         var1[var2 + 1] = this.field38827[this.field38811] * var5[this.field38811] + this.field38827[this.field38811 + 1] * var5[this.field38811 + 1];

         for (int var19 = 1; var19 < this.field38811 / 2; var19++) {
            int var23 = 2 * var19;
            int var28 = var23 + 1;
            var1[var2 + var23] = this.field38827[var23] * var5[var23] + this.field38827[var28] * var5[var28];
            var1[var2 + var28] = -this.field38827[var28] * var5[var23] + this.field38827[var23] * var5[var28];
         }
      } else {
         var1[var2] = this.field38827[0] * var5[0] + this.field38827[1] * var5[1];
         var1[var2 + 1] = -this.field38827[this.field38811] * var5[this.field38811 - 1] + this.field38827[this.field38811 - 1] * var5[this.field38811];

         for (int var20 = 1; var20 < (this.field38811 - 1) / 2; var20++) {
            int var24 = 2 * var20;
            int var29 = var24 + 1;
            var1[var2 + var24] = this.field38827[var24] * var5[var24] + this.field38827[var29] * var5[var29];
            var1[var2 + var29] = -this.field38827[var29] * var5[var24] + this.field38827[var24] * var5[var29];
         }

         var1[var2 + this.field38811 - 1] = this.field38827[this.field38811 - 1] * var5[this.field38811 - 1]
            + this.field38827[this.field38811] * var5[this.field38811];
      }
   }

   private void method30967(Class2378 var1, long var2) {
      Class2378 var6 = new Class2378(2L * this.field38814);
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field38812 > Class7796.method25891()) {
         byte var8 = 2;
         if (var7 >= 4 && this.field38812 > Class7796.method25892()) {
            var8 = 4;
         }

         Future[] var9 = new Future[var8];
         long var29 = this.field38812 / (long)var8;

         for (int var12 = 0; var12 < var8; var12++) {
            long var13 = (long)var12 * var29;
            long var15 = var12 == var8 - 1 ? this.field38812 : var13 + var29;
            var9[var12] = Class7008.method21729(new Class652(this, var13, var15, var2, var6, var1));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var27);
         }

         Class7796.method25981(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);
         var29 = this.field38814 / (long)var8;

         for (int var33 = 0; var33 < var8; var33++) {
            long var34 = (long)var33 * var29;
            long var35 = var33 == var8 - 1 ? this.field38814 : var34 + var29;
            var9[var33] = Class7008.method21729(new Class424(this, var34, var35, var6));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var24) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var24);
         } catch (ExecutionException var25) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var25);
         }
      } else {
         for (long var17 = 0L; var17 < this.field38812; var17++) {
            long var10 = 2L * var17;
            long var19 = var10 + 1L;
            long var21 = var2 + var17;
            var6.method9685(var10, var1.method9651(var21) * this.field38828.method9651(var10));
            var6.method9685(var19, -var1.method9651(var21) * this.field38828.method9651(var19));
         }

         Class7796.method25981(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);

         for (long var36 = 0L; var36 < this.field38814; var36++) {
            long var28 = 2L * var36;
            long var39 = var28 + 1L;
            float var23 = var6.method9651(var28) * this.field38830.method9651(var39) + var6.method9651(var39) * this.field38830.method9651(var28);
            var6.method9685(var28, var6.method9651(var28) * this.field38830.method9651(var28) - var6.method9651(var39) * this.field38830.method9651(var39));
            var6.method9685(var39, var23);
         }
      }

      Class7796.method25979(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);
      if (this.field38812 % 2L == 0L) {
         var1.method9685(var2, this.field38828.method9651(0L) * var6.method9651(0L) + this.field38828.method9651(1L) * var6.method9651(1L));
         var1.method9685(
            var2 + 1L,
            this.field38828.method9651(this.field38812) * var6.method9651(this.field38812)
               + this.field38828.method9651(this.field38812 + 1L) * var6.method9651(this.field38812 + 1L)
         );

         for (long var37 = 1L; var37 < this.field38812 / 2L; var37++) {
            long var31 = 2L * var37;
            long var40 = var31 + 1L;
            var1.method9685(
               var2 + var31, this.field38828.method9651(var31) * var6.method9651(var31) + this.field38828.method9651(var40) * var6.method9651(var40)
            );
            var1.method9685(
               var2 + var40, -this.field38828.method9651(var40) * var6.method9651(var31) + this.field38828.method9651(var31) * var6.method9651(var40)
            );
         }
      } else {
         var1.method9685(var2, this.field38828.method9651(0L) * var6.method9651(0L) + this.field38828.method9651(1L) * var6.method9651(1L));
         var1.method9685(
            var2 + 1L,
            -this.field38828.method9651(this.field38812) * var6.method9651(this.field38812 - 1L)
               + this.field38828.method9651(this.field38812 - 1L) * var6.method9651(this.field38812)
         );

         for (long var38 = 1L; var38 < (this.field38812 - 1L) / 2L; var38++) {
            long var32 = 2L * var38;
            long var41 = var32 + 1L;
            var1.method9685(
               var2 + var32, this.field38828.method9651(var32) * var6.method9651(var32) + this.field38828.method9651(var41) * var6.method9651(var41)
            );
            var1.method9685(
               var2 + var41, -this.field38828.method9651(var41) * var6.method9651(var32) + this.field38828.method9651(var32) * var6.method9651(var41)
            );
         }

         var1.method9685(
            var2 + this.field38812 - 1L,
            this.field38828.method9651(this.field38812 - 1L) * var6.method9651(this.field38812 - 1L)
               + this.field38828.method9651(this.field38812) * var6.method9651(this.field38812)
         );
      }
   }

   private void method30968(float[] var1, int var2) {
      float[] var5 = new float[2 * this.field38813];
      if (this.field38811 % 2 == 0) {
         var5[0] = var1[var2] * this.field38827[0];
         var5[1] = var1[var2] * this.field38827[1];

         for (int var6 = 1; var6 < this.field38811 / 2; var6++) {
            int var7 = 2 * var6;
            int var8 = var7 + 1;
            int var9 = var2 + var7;
            int var10 = var2 + var8;
            var5[var7] = var1[var9] * this.field38827[var7] - var1[var10] * this.field38827[var8];
            var5[var8] = var1[var9] * this.field38827[var8] + var1[var10] * this.field38827[var7];
         }

         var5[this.field38811] = var1[var2 + 1] * this.field38827[this.field38811];
         var5[this.field38811 + 1] = var1[var2 + 1] * this.field38827[this.field38811 + 1];

         for (int var17 = this.field38811 / 2 + 1; var17 < this.field38811; var17++) {
            int var21 = 2 * var17;
            int var27 = var21 + 1;
            int var33 = var2 + 2 * this.field38811 - var21;
            int var40 = var33 + 1;
            var5[var21] = var1[var33] * this.field38827[var21] + var1[var40] * this.field38827[var27];
            var5[var27] = var1[var33] * this.field38827[var27] - var1[var40] * this.field38827[var21];
         }
      } else {
         var5[0] = var1[var2] * this.field38827[0];
         var5[1] = var1[var2] * this.field38827[1];

         for (int var18 = 1; var18 < (this.field38811 - 1) / 2; var18++) {
            int var22 = 2 * var18;
            int var28 = var22 + 1;
            int var34 = var2 + var22;
            int var41 = var2 + var28;
            var5[var22] = var1[var34] * this.field38827[var22] - var1[var41] * this.field38827[var28];
            var5[var28] = var1[var34] * this.field38827[var28] + var1[var41] * this.field38827[var22];
         }

         var5[this.field38811 - 1] = var1[var2 + this.field38811 - 1] * this.field38827[this.field38811 - 1]
            - var1[var2 + 1] * this.field38827[this.field38811];
         var5[this.field38811] = var1[var2 + this.field38811 - 1] * this.field38827[this.field38811] + var1[var2 + 1] * this.field38827[this.field38811 - 1];
         var5[this.field38811 + 1] = var1[var2 + this.field38811 - 1] * this.field38827[this.field38811 + 1]
            + var1[var2 + 1] * this.field38827[this.field38811 + 2];
         var5[this.field38811 + 2] = var1[var2 + this.field38811 - 1] * this.field38827[this.field38811 + 2]
            - var1[var2 + 1] * this.field38827[this.field38811 + 1];

         for (int var19 = (this.field38811 - 1) / 2 + 2; var19 < this.field38811; var19++) {
            int var23 = 2 * var19;
            int var29 = var23 + 1;
            int var35 = var2 + 2 * this.field38811 - var23;
            int var42 = var35 + 1;
            var5[var23] = var1[var35] * this.field38827[var23] + var1[var42] * this.field38827[var29];
            var5[var29] = var1[var35] * this.field38827[var29] - var1[var42] * this.field38827[var23];
         }
      }

      Class7796.method25980(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);
      int var20 = Class7008.method21726();
      if (var20 > 1 && (long)this.field38811 >= Class7796.method25891()) {
         byte var26 = 2;
         if (var20 >= 4 && (long)this.field38811 >= Class7796.method25892()) {
            var26 = 4;
         }

         Future[] var32 = new Future[var26];
         int var38 = this.field38813 / var26;

         for (int var44 = 0; var44 < var26; var44++) {
            int var11 = var44 * var38;
            int var12 = var44 == var26 - 1 ? this.field38813 : var11 + var38;
            var32[var44] = Class7008.method21729(new Class554(this, var11, var12, var5));
         }

         try {
            Class7008.method21730(var32);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var16);
         }

         Class7796.method25978(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);
         var38 = this.field38811 / var26;

         for (int var45 = 0; var45 < var26; var45++) {
            int var46 = var45 * var38;
            int var47 = var45 == var26 - 1 ? this.field38811 : var46 + var38;
            var32[var45] = Class7008.method21729(new Class1355(this, var46, var47, var1, var2, var5));
         }

         try {
            Class7008.method21730(var32);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var14);
         }
      } else {
         for (int var24 = 0; var24 < this.field38813; var24++) {
            int var30 = 2 * var24;
            int var36 = var30 + 1;
            float var43 = -var5[var30] * this.field38829[var36] + var5[var36] * this.field38829[var30];
            var5[var30] = var5[var30] * this.field38829[var30] + var5[var36] * this.field38829[var36];
            var5[var36] = var43;
         }

         Class7796.method25978(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);

         for (int var25 = 0; var25 < this.field38811; var25++) {
            int var31 = 2 * var25;
            int var37 = var31 + 1;
            var1[var2 + var25] = this.field38827[var31] * var5[var31] - this.field38827[var37] * var5[var37];
         }
      }
   }

   private void method30969(Class2378 var1, long var2) {
      Class2378 var6 = new Class2378(2L * this.field38814);
      if (this.field38812 % 2L == 0L) {
         var6.method9685(0L, var1.method9651(var2) * this.field38828.method9651(0L));
         var6.method9685(1L, var1.method9651(var2) * this.field38828.method9651(1L));

         for (long var7 = 1L; var7 < this.field38812 / 2L; var7++) {
            long var9 = 2L * var7;
            long var11 = var9 + 1L;
            long var13 = var2 + var9;
            long var15 = var2 + var11;
            var6.method9685(var9, var1.method9651(var13) * this.field38828.method9651(var9) - var1.method9651(var15) * this.field38828.method9651(var11));
            var6.method9685(var11, var1.method9651(var13) * this.field38828.method9651(var11) + var1.method9651(var15) * this.field38828.method9651(var9));
         }

         var6.method9685(this.field38812, var1.method9651(var2 + 1L) * this.field38828.method9651(this.field38812));
         var6.method9685(this.field38812 + 1L, var1.method9651(var2 + 1L) * this.field38828.method9651(this.field38812 + 1L));

         for (long var32 = this.field38812 / 2L + 1L; var32 < this.field38812; var32++) {
            long var35 = 2L * var32;
            long var38 = var35 + 1L;
            long var41 = var2 + 2L * this.field38812 - var35;
            long var46 = var41 + 1L;
            var6.method9685(var35, var1.method9651(var41) * this.field38828.method9651(var35) + var1.method9651(var46) * this.field38828.method9651(var38));
            var6.method9685(var38, var1.method9651(var41) * this.field38828.method9651(var38) - var1.method9651(var46) * this.field38828.method9651(var35));
         }
      } else {
         var6.method9685(0L, var1.method9651(var2) * this.field38828.method9651(0L));
         var6.method9685(1L, var1.method9651(var2) * this.field38828.method9651(1L));

         for (long var33 = 1L; var33 < (this.field38812 - 1L) / 2L; var33++) {
            long var36 = 2L * var33;
            long var39 = var36 + 1L;
            long var42 = var2 + var36;
            long var47 = var2 + var39;
            var6.method9685(var36, var1.method9651(var42) * this.field38828.method9651(var36) - var1.method9651(var47) * this.field38828.method9651(var39));
            var6.method9685(var39, var1.method9651(var42) * this.field38828.method9651(var39) + var1.method9651(var47) * this.field38828.method9651(var36));
         }

         var6.method9685(
            this.field38812 - 1L,
            var1.method9651(var2 + this.field38812 - 1L) * this.field38828.method9651(this.field38812 - 1L)
               - var1.method9651(var2 + 1L) * this.field38828.method9651(this.field38812)
         );
         var6.method9685(
            this.field38812,
            var1.method9651(var2 + this.field38812 - 1L) * this.field38828.method9651(this.field38812)
               + var1.method9651(var2 + 1L) * this.field38828.method9651(this.field38812 - 1L)
         );
         var6.method9685(
            this.field38812 + 1L,
            var1.method9651(var2 + this.field38812 - 1L) * this.field38828.method9651(this.field38812 + 1L)
               + var1.method9651(var2 + 1L) * this.field38828.method9651(this.field38812 + 2L)
         );
         var6.method9685(
            this.field38812 + 2L,
            var1.method9651(var2 + this.field38812 - 1L) * this.field38828.method9651(this.field38812 + 2L)
               - var1.method9651(var2 + 1L) * this.field38828.method9651(this.field38812 + 1L)
         );

         for (long var34 = (this.field38812 - 1L) / 2L + 2L; var34 < this.field38812; var34++) {
            long var37 = 2L * var34;
            long var40 = var37 + 1L;
            long var43 = var2 + 2L * this.field38812 - var37;
            long var48 = var43 + 1L;
            var6.method9685(var37, var1.method9651(var43) * this.field38828.method9651(var37) + var1.method9651(var48) * this.field38828.method9651(var40));
            var6.method9685(var40, var1.method9651(var43) * this.field38828.method9651(var40) - var1.method9651(var48) * this.field38828.method9651(var37));
         }
      }

      Class7796.method25981(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);
      int var17 = Class7008.method21726();
      if (var17 > 1 && this.field38812 > Class7796.method25891()) {
         byte var18 = 2;
         if (var17 >= 4 && this.field38812 > Class7796.method25892()) {
            var18 = 4;
         }

         Future[] var19 = new Future[var18];
         long var52 = this.field38814 / (long)var18;

         for (int var22 = 0; var22 < var18; var22++) {
            long var44 = (long)var22 * var52;
            long var49 = var22 == var18 - 1 ? this.field38814 : var44 + var52;
            var19[var22] = Class7008.method21729(new Class1374(this, var44, var49, var6));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var31);
         }

         Class7796.method25979(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);
         var52 = this.field38812 / (long)var18;

         for (int var54 = 0; var54 < var18; var54++) {
            long var45 = (long)var54 * var52;
            long var50 = var54 == var18 - 1 ? this.field38812 : var45 + var52;
            var19[var54] = Class7008.method21729(new Class1547(this, var45, var50, var1, var2, var6));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var29);
         }
      } else {
         for (long var23 = 0L; var23 < this.field38814; var23++) {
            long var20 = 2L * var23;
            long var25 = var20 + 1L;
            float var27 = -var6.method9651(var20) * this.field38830.method9651(var25) + var6.method9651(var25) * this.field38830.method9651(var20);
            var6.method9685(var20, var6.method9651(var20) * this.field38830.method9651(var20) + var6.method9651(var25) * this.field38830.method9651(var25));
            var6.method9685(var25, var27);
         }

         Class7796.method25979(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);

         for (long var55 = 0L; var55 < this.field38812; var55++) {
            long var51 = 2L * var55;
            long var56 = var51 + 1L;
            var1.method9685(
               var2 + var55, this.field38828.method9651(var51) * var6.method9651(var51) - this.field38828.method9651(var56) * var6.method9651(var56)
            );
         }
      }
   }

   private void method30970(float[] var1, int var2) {
      float[] var5 = new float[2 * this.field38813];
      int var6 = Class7008.method21726();
      if (var6 > 1 && (long)this.field38811 >= Class7796.method25891()) {
         byte var18 = 2;
         if (var6 >= 4 && (long)this.field38811 >= Class7796.method25892()) {
            var18 = 4;
         }

         Future[] var22 = new Future[var18];
         int var26 = this.field38811 / var18;

         for (int var31 = 0; var31 < var18; var31++) {
            int var11 = var31 * var26;
            int var12 = var31 == var18 - 1 ? this.field38811 : var11 + var26;
            var22[var31] = Class7008.method21729(new Class782(this, var11, var12, var2, var5, var1));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var16);
         }

         Class7796.method25980(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);
         var26 = this.field38813 / var18;

         for (int var32 = 0; var32 < var18; var32++) {
            int var33 = var32 * var26;
            int var34 = var32 == var18 - 1 ? this.field38813 : var33 + var26;
            var22[var32] = Class7008.method21729(new Class1481(this, var33, var34, var5));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var14);
         }
      } else {
         for (int var7 = 0; var7 < this.field38811; var7++) {
            int var8 = 2 * var7;
            int var9 = var8 + 1;
            int var10 = var2 + var7;
            var5[var8] = var1[var10] * this.field38827[var8];
            var5[var9] = var1[var10] * this.field38827[var9];
         }

         Class7796.method25980(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);

         for (int var17 = 0; var17 < this.field38813; var17++) {
            int var21 = 2 * var17;
            int var25 = var21 + 1;
            float var30 = -var5[var21] * this.field38829[var25] + var5[var25] * this.field38829[var21];
            var5[var21] = var5[var21] * this.field38829[var21] + var5[var25] * this.field38829[var25];
            var5[var25] = var30;
         }
      }

      Class7796.method25978(2 * this.field38813, var5, 0, this.field38815, this.field38819, this.field38817);
      if (this.field38811 % 2 == 0) {
         var1[var2] = this.field38827[0] * var5[0] - this.field38827[1] * var5[1];
         var1[var2 + 1] = this.field38827[this.field38811] * var5[this.field38811] - this.field38827[this.field38811 + 1] * var5[this.field38811 + 1];

         for (int var19 = 1; var19 < this.field38811 / 2; var19++) {
            int var23 = 2 * var19;
            int var28 = var23 + 1;
            var1[var2 + var23] = this.field38827[var23] * var5[var23] - this.field38827[var28] * var5[var28];
            var1[var2 + var28] = this.field38827[var28] * var5[var23] + this.field38827[var23] * var5[var28];
         }
      } else {
         var1[var2] = this.field38827[0] * var5[0] - this.field38827[1] * var5[1];
         var1[var2 + 1] = this.field38827[this.field38811] * var5[this.field38811 - 1] + this.field38827[this.field38811 - 1] * var5[this.field38811];

         for (int var20 = 1; var20 < (this.field38811 - 1) / 2; var20++) {
            int var24 = 2 * var20;
            int var29 = var24 + 1;
            var1[var2 + var24] = this.field38827[var24] * var5[var24] - this.field38827[var29] * var5[var29];
            var1[var2 + var29] = this.field38827[var29] * var5[var24] + this.field38827[var24] * var5[var29];
         }

         var1[var2 + this.field38811 - 1] = this.field38827[this.field38811 - 1] * var5[this.field38811 - 1]
            - this.field38827[this.field38811] * var5[this.field38811];
      }
   }

   private void method30971(Class2378 var1, long var2) {
      Class2378 var6 = new Class2378(2L * this.field38814);
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field38812 > Class7796.method25891()) {
         byte var8 = 2;
         if (var7 >= 4 && this.field38812 > Class7796.method25892()) {
            var8 = 4;
         }

         Future[] var9 = new Future[var8];
         long var29 = this.field38812 / (long)var8;

         for (int var12 = 0; var12 < var8; var12++) {
            long var13 = (long)var12 * var29;
            long var15 = var12 == var8 - 1 ? this.field38812 : var13 + var29;
            var9[var12] = Class7008.method21729(new Class1392(this, var13, var15, var2, var6, var1));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var27);
         }

         Class7796.method25981(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);
         var29 = this.field38814 / (long)var8;

         for (int var33 = 0; var33 < var8; var33++) {
            long var34 = (long)var33 * var29;
            long var35 = var33 == var8 - 1 ? this.field38814 : var34 + var29;
            var9[var33] = Class7008.method21729(new Class417(this, var34, var35, var6));
         }

         try {
            Class7008.method21730(var9);
         } catch (InterruptedException var24) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var24);
         } catch (ExecutionException var25) {
            Logger.getLogger(Class8630.class.getName()).log(Level.SEVERE, null, var25);
         }
      } else {
         for (long var17 = 0L; var17 < this.field38812; var17++) {
            long var10 = 2L * var17;
            long var19 = var10 + 1L;
            long var21 = var2 + var17;
            var6.method9685(var10, var1.method9651(var21) * this.field38828.method9651(var10));
            var6.method9685(var19, var1.method9651(var21) * this.field38828.method9651(var19));
         }

         Class7796.method25981(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);

         for (long var36 = 0L; var36 < this.field38814; var36++) {
            long var28 = 2L * var36;
            long var39 = var28 + 1L;
            float var23 = -var6.method9651(var28) * this.field38830.method9651(var39) + var6.method9651(var39) * this.field38830.method9651(var28);
            var6.method9685(var28, var6.method9651(var28) * this.field38830.method9651(var28) + var6.method9651(var39) * this.field38830.method9651(var39));
            var6.method9685(var39, var23);
         }
      }

      Class7796.method25979(2L * this.field38814, var6, 0L, this.field38816, this.field38820, this.field38818);
      if (this.field38812 % 2L == 0L) {
         var1.method9685(var2, this.field38828.method9651(0L) * var6.method9651(0L) - this.field38828.method9651(1L) * var6.method9651(1L));
         var1.method9685(
            var2 + 1L,
            this.field38828.method9651(this.field38812) * var6.method9651(this.field38812)
               - this.field38828.method9651(this.field38812 + 1L) * var6.method9651(this.field38812 + 1L)
         );

         for (long var37 = 1L; var37 < this.field38812 / 2L; var37++) {
            long var31 = 2L * var37;
            long var40 = var31 + 1L;
            var1.method9685(
               var2 + var31, this.field38828.method9651(var31) * var6.method9651(var31) - this.field38828.method9651(var40) * var6.method9651(var40)
            );
            var1.method9685(
               var2 + var40, this.field38828.method9651(var40) * var6.method9651(var31) + this.field38828.method9651(var31) * var6.method9651(var40)
            );
         }
      } else {
         var1.method9685(var2, this.field38828.method9651(0L) * var6.method9651(0L) - this.field38828.method9651(1L) * var6.method9651(1L));
         var1.method9685(
            var2 + 1L,
            this.field38828.method9651(this.field38812) * var6.method9651(this.field38812 - 1L)
               + this.field38828.method9651(this.field38812 - 1L) * var6.method9651(this.field38812)
         );

         for (long var38 = 1L; var38 < (this.field38812 - 1L) / 2L; var38++) {
            long var32 = 2L * var38;
            long var41 = var32 + 1L;
            var1.method9685(
               var2 + var32, this.field38828.method9651(var32) * var6.method9651(var32) - this.field38828.method9651(var41) * var6.method9651(var41)
            );
            var1.method9685(
               var2 + var41, this.field38828.method9651(var41) * var6.method9651(var32) + this.field38828.method9651(var32) * var6.method9651(var41)
            );
         }

         var1.method9685(
            var2 + this.field38812 - 1L,
            this.field38828.method9651(this.field38812 - 1L) * var6.method9651(this.field38812 - 1L)
               - this.field38828.method9651(this.field38812) * var6.method9651(this.field38812)
         );
      }
   }

   public void method30972(float[] var1, int var2) {
      if (this.field38811 != 1) {
         float[] var5 = new float[this.field38811];
         int var6 = 2 * this.field38811;
         int var7 = (int)this.field38825[1 + var6];
         int var8 = 1;
         int var9 = this.field38811;
         int var10 = var6 - 1;

         for (int var11 = 1; var11 <= var7; var11++) {
            int var12 = var7 - var11;
            int var13 = (int)this.field38825[var12 + 2 + var6];
            int var14 = var9 / var13;
            int var15 = this.field38811 / var9;
            int var16 = var15 * var14;
            var10 -= (var13 - 1) * var15;
            var8 = 1 - var8;
            switch (var13) {
               case 2:
                  if (var8 == 0) {
                     this.method30976(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method30976(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               case 3:
                  if (var8 == 0) {
                     this.method30980(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method30980(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               case 4:
                  if (var8 == 0) {
                     this.method30984(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method30984(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               case 5:
                  if (var8 == 0) {
                     this.method30988(var15, var14, var1, var2, var5, 0, var10);
                  } else {
                     this.method30988(var15, var14, var5, 0, var1, var2, var10);
                  }
                  break;
               default:
                  if (var15 == 1) {
                     var8 = 1 - var8;
                  }

                  if (var8 == 0) {
                     this.method30992(var15, var13, var14, var16, var1, var2, var5, 0, var10);
                     var8 = 1;
                  } else {
                     this.method30992(var15, var13, var14, var16, var5, 0, var1, var2, var10);
                     var8 = 0;
                  }
            }

            var9 = var14;
         }

         if (var8 != 1) {
            System.arraycopy(var5, 0, var1, var2, this.field38811);
         }
      }
   }

   public void method30973(Class2378 var1, long var2) {
      if (this.field38812 != 1L) {
         Class2378 var6 = new Class2378(this.field38812);
         long var7 = 2L * this.field38812;
         long var9 = (long)this.field38826.method9651(1L + var7);
         long var11 = 1L;
         long var13 = this.field38812;
         long var15 = var7 - 1L;

         for (long var17 = 1L; var17 <= var9; var17++) {
            long var19 = var9 - var17;
            int var21 = (int)this.field38826.method9651(var19 + 2L + var7);
            long var22 = var13 / (long)var21;
            long var24 = this.field38812 / var13;
            long var26 = var24 * var22;
            var15 -= (long)(var21 - 1) * var24;
            var11 = 1L - var11;
            switch (var21) {
               case 2:
                  if (var11 == 0L) {
                     this.method30977(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30977(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               case 3:
                  if (var11 == 0L) {
                     this.method30981(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30981(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               case 4:
                  if (var11 == 0L) {
                     this.method30985(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30985(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               case 5:
                  if (var11 == 0L) {
                     this.method30989(var24, var22, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30989(var24, var22, var6, 0L, var1, var2, var15);
                  }
                  break;
               default:
                  if (var24 == 1L) {
                     var11 = 1L - var11;
                  }

                  if (var11 == 0L) {
                     this.method30993(var24, (long)var21, var22, var26, var1, var2, var6, 0L, var15);
                     var11 = 1L;
                  } else {
                     this.method30993(var24, (long)var21, var22, var26, var6, 0L, var1, var2, var15);
                     var11 = 0L;
                  }
            }

            var13 = var22;
         }

         if (var11 != 1L) {
            Class8133.method28175(var6, 0L, var1, var2, this.field38812);
         }
      }
   }

   public void method30974(float[] var1, int var2) {
      if (this.field38811 != 1) {
         float[] var5 = new float[this.field38811];
         int var6 = 2 * this.field38811;
         int var7 = (int)this.field38825[1 + var6];
         int var8 = 0;
         int var9 = 1;
         int var10 = this.field38811;

         for (int var11 = 1; var11 <= var7; var11++) {
            int var12 = (int)this.field38825[var11 + 1 + var6];
            int var13 = var12 * var9;
            int var14 = this.field38811 / var13;
            int var15 = var14 * var9;
            switch (var12) {
               case 2:
                  if (var8 == 0) {
                     this.method30978(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method30978(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               case 3:
                  if (var8 == 0) {
                     this.method30982(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method30982(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               case 4:
                  if (var8 == 0) {
                     this.method30986(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method30986(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               case 5:
                  if (var8 == 0) {
                     this.method30990(var14, var9, var1, var2, var5, 0, var10);
                  } else {
                     this.method30990(var14, var9, var5, 0, var1, var2, var10);
                  }

                  var8 = 1 - var8;
                  break;
               default:
                  if (var8 == 0) {
                     this.method30994(var14, var12, var9, var15, var1, var2, var5, 0, var10);
                  } else {
                     this.method30994(var14, var12, var9, var15, var5, 0, var1, var2, var10);
                  }

                  if (var14 == 1) {
                     var8 = 1 - var8;
                  }
            }

            var9 = var13;
            var10 += (var12 - 1) * var14;
         }

         if (var8 != 0) {
            System.arraycopy(var5, 0, var1, var2, this.field38811);
         }
      }
   }

   public void method30975(Class2378 var1, long var2) {
      if (this.field38812 != 1L) {
         Class2378 var6 = new Class2378(this.field38812);
         long var7 = 2L * this.field38812;
         long var9 = (long)this.field38826.method9651(1L + var7);
         long var11 = 0L;
         long var13 = 1L;
         long var15 = this.field38812;

         for (long var17 = 1L; var17 <= var9; var17++) {
            int var19 = (int)this.field38826.method9651(var17 + 1L + var7);
            long var20 = (long)var19 * var13;
            long var22 = this.field38812 / var20;
            long var24 = var22 * var13;
            switch (var19) {
               case 2:
                  if (var11 == 0L) {
                     this.method30979(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30979(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               case 3:
                  if (var11 == 0L) {
                     this.method30983(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30983(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               case 4:
                  if (var11 == 0L) {
                     this.method30987(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30987(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               case 5:
                  if (var11 == 0L) {
                     this.method30991(var22, var13, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30991(var22, var13, var6, 0L, var1, var2, var15);
                  }

                  var11 = 1L - var11;
                  break;
               default:
                  if (var11 == 0L) {
                     this.method30995(var22, (long)var19, var13, var24, var1, var2, var6, 0L, var15);
                  } else {
                     this.method30995(var22, (long)var19, var13, var24, var6, 0L, var1, var2, var15);
                  }

                  if (var22 == 1L) {
                     var11 = 1L - var11;
                  }
            }

            var13 = var20;
            var15 += (long)(var19 - 1) * var22;
         }

         if (var11 != 0L) {
            Class8133.method28175(var6, 0L, var1, var2, this.field38812);
         }
      }
   }

   public void method30976(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      int var10 = var7;
      int var11 = var2 * var1;
      int var12 = 2 * var1;

      for (int var13 = 0; var13 < var2; var13++) {
         int var15 = var6 + var13 * var12;
         int var16 = var15 + var12 - 1;
         int var17 = var4 + var13 * var1;
         int var18 = var17 + var11;
         float var19 = var3[var17];
         float var20 = var3[var18];
         var5[var15] = var19 + var20;
         var5[var16] = var19 - var20;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var33 = 0; var33 < var2; var33++) {
               var12 = var33 * var1;
               int var14 = 2 * var12;
               int var21 = var14 + var1;
               int var22 = var12 + var11;

               for (int var23 = 2; var23 < var1; var23 += 2) {
                  int var24 = var1 - var23;
                  int var36 = var23 - 1 + var10;
                  int var38 = var6 + var23 + var14;
                  int var40 = var6 + var24 + var21;
                  int var41 = var4 + var23 + var12;
                  int var42 = var4 + var23 + var22;
                  float var43 = var3[var41 - 1];
                  float var25 = var3[var41];
                  float var26 = var3[var42 - 1];
                  float var27 = var3[var42];
                  float var28 = this.field38825[var36 - 1];
                  float var29 = this.field38825[var36];
                  float var30 = var28 * var26 + var29 * var27;
                  float var31 = var28 * var27 - var29 * var26;
                  var5[var38] = var25 + var31;
                  var5[var38 - 1] = var43 + var30;
                  var5[var40] = var31 - var25;
                  var5[var40 - 1] = var43 - var30;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         int var35 = 2 * var12;

         for (int var34 = 0; var34 < var2; var34++) {
            var12 = var34 * var1;
            int var37 = var6 + var35 + var1;
            int var39 = var4 + var1 - 1 + var12;
            var5[var37] = -var3[var39 + var11];
            var5[var37 - 1] = var3[var39];
         }
      }
   }

   public void method30977(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      long var15 = var11;
      long var17 = var3 * var1;
      long var19 = 2L * var1;

      for (long var21 = 0L; var21 < var3; var21++) {
         long var25 = var9 + var21 * var19;
         long var27 = var25 + var19 - 1L;
         long var29 = var6 + var21 * var1;
         long var31 = var29 + var17;
         float var33 = var5.method9651(var29);
         float var34 = var5.method9651(var31);
         var8.method9685(var25, var33 + var34);
         var8.method9685(var27, var33 - var34);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var54 = 0L; var54 < var3; var54++) {
               var19 = var54 * var1;
               long var23 = 2L * var19;
               long var35 = var23 + var1;
               long var37 = var19 + var17;

               for (long var39 = 2L; var39 < var1; var39 += 2L) {
                  long var41 = var1 - var39;
                  long var57 = var39 - 1L + var15;
                  long var59 = var9 + var39 + var23;
                  long var61 = var9 + var41 + var35;
                  long var62 = var6 + var39 + var19;
                  long var43 = var6 + var39 + var37;
                  float var45 = var5.method9651(var62 - 1L);
                  float var46 = var5.method9651(var62);
                  float var47 = var5.method9651(var43 - 1L);
                  float var48 = var5.method9651(var43);
                  float var49 = this.field38826.method9651(var57 - 1L);
                  float var50 = this.field38826.method9651(var57);
                  float var51 = var49 * var47 + var50 * var48;
                  float var52 = var49 * var48 - var50 * var47;
                  var8.method9685(var59, var46 + var52);
                  var8.method9685(var59 - 1L, var45 + var51);
                  var8.method9685(var61, var52 - var46);
                  var8.method9685(var61 - 1L, var45 - var51);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         long var56 = 2L * var19;

         for (long var55 = 0L; var55 < var3; var55++) {
            var19 = var55 * var1;
            long var58 = var9 + var56 + var1;
            long var60 = var6 + var1 - 1L + var19;
            var8.method9685(var58, -var5.method9651(var60 + var17));
            var8.method9685(var58 - 1L, var5.method9651(var60));
         }
      }
   }

   public void method30978(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      int var10 = var7;
      int var11 = var2 * var1;

      for (int var12 = 0; var12 < var2; var12++) {
         int var13 = var12 * var1;
         int var14 = 2 * var13;
         int var15 = var14 + var1;
         int var16 = var6 + var13;
         int var17 = var4 + var14;
         int var18 = var4 + var1 - 1 + var15;
         float var19 = var3[var17];
         float var20 = var3[var18];
         var5[var16] = var19 + var20;
         var5[var16 + var11] = var19 - var20;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var35 = 0; var35 < var2; var35++) {
               int var37 = var35 * var1;
               int var39 = 2 * var37;
               int var41 = var39 + var1;
               int var43 = var37 + var11;

               for (int var21 = 2; var21 < var1; var21 += 2) {
                  int var22 = var1 - var21;
                  int var45 = var21 - 1 + var10;
                  int var46 = var6 + var21;
                  int var47 = var4 + var21;
                  int var48 = var4 + var22;
                  float var23 = this.field38825[var45 - 1];
                  float var24 = this.field38825[var45];
                  int var25 = var47 + var39;
                  int var26 = var48 + var41;
                  int var27 = var46 + var37;
                  int var28 = var46 + var43;
                  float var29 = var3[var25 - 1] - var3[var26 - 1];
                  float var30 = var3[var25] + var3[var26];
                  float var31 = var3[var25];
                  float var32 = var3[var25 - 1];
                  float var33 = var3[var26];
                  float var34 = var3[var26 - 1];
                  var5[var27 - 1] = var32 + var34;
                  var5[var27] = var31 - var33;
                  var5[var28 - 1] = var23 * var29 - var24 * var30;
                  var5[var28] = var23 * var30 + var24 * var29;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         for (int var36 = 0; var36 < var2; var36++) {
            int var38 = var36 * var1;
            int var40 = 2 * var38;
            int var42 = var6 + var1 - 1 + var38;
            int var44 = var4 + var40 + var1;
            var5[var42] = 2.0F * var3[var44 - 1];
            var5[var42 + var11] = -2.0F * var3[var44];
         }
      }
   }

   public void method30979(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      long var15 = var11;
      long var17 = var3 * var1;

      for (long var19 = 0L; var19 < var3; var19++) {
         long var21 = var19 * var1;
         long var23 = 2L * var21;
         long var25 = var23 + var1;
         long var27 = var9 + var21;
         long var29 = var6 + var23;
         long var31 = var6 + var1 - 1L + var25;
         float var33 = var5.method9651(var29);
         float var34 = var5.method9651(var31);
         var8.method9685(var27, var33 + var34);
         var8.method9685(var27 + var17, var33 - var34);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var59 = 0L; var59 < var3; var59++) {
               long var61 = var59 * var1;
               long var63 = 2L * var61;
               long var65 = var63 + var1;
               long var67 = var61 + var17;

               for (long var35 = 2L; var35 < var1; var35 += 2L) {
                  long var37 = var1 - var35;
                  long var69 = var35 - 1L + var15;
                  long var70 = var9 + var35;
                  long var39 = var6 + var35;
                  long var41 = var6 + var37;
                  float var43 = this.field38826.method9651(var69 - 1L);
                  float var44 = this.field38826.method9651(var69);
                  long var45 = var39 + var63;
                  long var47 = var41 + var65;
                  long var49 = var70 + var61;
                  long var51 = var70 + var67;
                  float var53 = var5.method9651(var45 - 1L) - var5.method9651(var47 - 1L);
                  float var54 = var5.method9651(var45) + var5.method9651(var47);
                  float var55 = var5.method9651(var45);
                  float var56 = var5.method9651(var45 - 1L);
                  float var57 = var5.method9651(var47);
                  float var58 = var5.method9651(var47 - 1L);
                  var8.method9685(var49 - 1L, var56 + var58);
                  var8.method9685(var49, var55 - var57);
                  var8.method9685(var51 - 1L, var43 * var53 - var44 * var54);
                  var8.method9685(var51, var43 * var54 + var44 * var53);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         for (long var60 = 0L; var60 < var3; var60++) {
            long var62 = var60 * var1;
            long var64 = 2L * var62;
            long var66 = var9 + var1 - 1L + var62;
            long var68 = var6 + var64 + var1;
            var8.method9685(var66, 2.0F * var5.method9651(var68 - 1L));
            var8.method9685(var66 + var17, -2.0F * var5.method9651(var68));
         }
      }
   }

   public void method30980(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      float var10 = -0.5F;
      float var11 = 0.8660254F;
      int var12 = var7;
      int var13 = var7 + var1;
      int var14 = var2 * var1;

      for (int var15 = 0; var15 < var2; var15++) {
         int var16 = var15 * var1;
         int var17 = 2 * var14;
         int var18 = (3 * var15 + 1) * var1;
         int var19 = var4 + var16;
         int var20 = var19 + var14;
         int var21 = var19 + var17;
         float var22 = var3[var19];
         float var23 = var3[var20];
         float var24 = var3[var21];
         float var25 = var23 + var24;
         var5[var6 + 3 * var16] = var22 + var25;
         var5[var6 + var18 + var1] = 0.8660254F * (var24 - var23);
         var5[var6 + var1 - 1 + var18] = var22 + -0.5F * var25;
      }

      if (var1 != 1) {
         for (int var55 = 0; var55 < var2; var55++) {
            int var56 = var55 * var1;
            int var57 = 3 * var56;
            int var58 = var56 + var14;
            int var59 = var58 + var14;
            int var60 = var57 + var1;
            int var61 = var60 + var1;

            for (int var26 = 2; var26 < var1; var26 += 2) {
               int var27 = var1 - var26;
               int var62 = var26 - 1 + var12;
               int var63 = var26 - 1 + var13;
               float var28 = this.field38825[var62 - 1];
               float var29 = this.field38825[var62];
               float var30 = this.field38825[var63 - 1];
               float var31 = this.field38825[var63];
               int var64 = var4 + var26;
               int var32 = var6 + var26;
               int var33 = var6 + var27;
               int var34 = var64 + var56;
               int var35 = var64 + var58;
               int var36 = var64 + var59;
               float var37 = var3[var34 - 1];
               float var38 = var3[var34];
               float var39 = var3[var35 - 1];
               float var40 = var3[var35];
               float var41 = var3[var36 - 1];
               float var42 = var3[var36];
               float var43 = var28 * var39 + var29 * var40;
               float var44 = var28 * var40 - var29 * var39;
               float var45 = var30 * var41 + var31 * var42;
               float var46 = var30 * var42 - var31 * var41;
               float var65 = var43 + var45;
               float var47 = var44 + var46;
               float var48 = var37 + -0.5F * var65;
               float var49 = var38 + -0.5F * var47;
               float var50 = 0.8660254F * (var44 - var46);
               float var51 = 0.8660254F * (var45 - var43);
               int var52 = var32 + var57;
               int var53 = var33 + var60;
               int var54 = var32 + var61;
               var5[var52 - 1] = var37 + var65;
               var5[var52] = var38 + var47;
               var5[var53 - 1] = var48 - var50;
               var5[var53] = var51 - var49;
               var5[var54 - 1] = var48 + var50;
               var5[var54] = var49 + var51;
            }
         }
      }
   }

   public void method30981(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      float var15 = -0.5F;
      float var16 = 0.8660254F;
      long var17 = var11;
      long var19 = var11 + var1;
      long var21 = var3 * var1;

      for (long var23 = 0L; var23 < var3; var23++) {
         long var25 = var23 * var1;
         long var27 = 2L * var21;
         long var29 = (3L * var23 + 1L) * var1;
         long var31 = var6 + var25;
         long var33 = var31 + var21;
         long var35 = var31 + var27;
         float var37 = var5.method9651(var31);
         float var38 = var5.method9651(var33);
         float var39 = var5.method9651(var35);
         float var40 = var38 + var39;
         var8.method9685(var9 + 3L * var25, var37 + var40);
         var8.method9685(var9 + var29 + var1, 0.8660254F * (var39 - var38));
         var8.method9685(var9 + var1 - 1L + var29, var37 + -0.5F * var40);
      }

      if (var1 != 1L) {
         for (long var86 = 0L; var86 < var3; var86++) {
            long var87 = var86 * var1;
            long var88 = 3L * var87;
            long var89 = var87 + var21;
            long var90 = var89 + var21;
            long var91 = var88 + var1;
            long var92 = var91 + var1;

            for (long var41 = 2L; var41 < var1; var41 += 2L) {
               long var43 = var1 - var41;
               long var45 = var41 - 1L + var17;
               long var47 = var41 - 1L + var19;
               float var49 = this.field38826.method9651(var45 - 1L);
               float var50 = this.field38826.method9651(var45);
               float var51 = this.field38826.method9651(var47 - 1L);
               float var52 = this.field38826.method9651(var47);
               long var53 = var6 + var41;
               long var55 = var9 + var41;
               long var57 = var9 + var43;
               long var59 = var53 + var87;
               long var61 = var53 + var89;
               long var63 = var53 + var90;
               float var65 = var5.method9651(var59 - 1L);
               float var66 = var5.method9651(var59);
               float var67 = var5.method9651(var61 - 1L);
               float var68 = var5.method9651(var61);
               float var69 = var5.method9651(var63 - 1L);
               float var70 = var5.method9651(var63);
               float var71 = var49 * var67 + var50 * var68;
               float var72 = var49 * var68 - var50 * var67;
               float var73 = var51 * var69 + var52 * var70;
               float var74 = var51 * var70 - var52 * var69;
               float var93 = var71 + var73;
               float var75 = var72 + var74;
               float var76 = var65 + -0.5F * var93;
               float var77 = var66 + -0.5F * var75;
               float var78 = 0.8660254F * (var72 - var74);
               float var79 = 0.8660254F * (var73 - var71);
               long var80 = var55 + var88;
               long var82 = var57 + var91;
               long var84 = var55 + var92;
               var8.method9685(var80 - 1L, var65 + var93);
               var8.method9685(var80, var66 + var75);
               var8.method9685(var82 - 1L, var76 - var78);
               var8.method9685(var82, var79 - var77);
               var8.method9685(var84 - 1L, var76 + var78);
               var8.method9685(var84, var77 + var79);
            }
         }
      }
   }

   public void method30982(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      float var10 = -0.5F;
      float var11 = 0.8660254F;
      int var12 = var7;
      int var13 = var7 + var1;

      for (int var14 = 0; var14 < var2; var14++) {
         int var15 = var14 * var1;
         int var16 = var4 + 3 * var15;
         int var17 = var16 + 2 * var1;
         float var18 = var3[var16];
         float var19 = 2.0F * var3[var17 - 1];
         float var20 = var18 + -0.5F * var19;
         float var21 = 1.7320508F * var3[var17];
         var5[var6 + var15] = var18 + var19;
         var5[var6 + (var14 + var2) * var1] = var20 - var21;
         var5[var6 + (var14 + 2 * var2) * var1] = var20 + var21;
      }

      if (var1 != 1) {
         int var55 = var2 * var1;

         for (int var56 = 0; var56 < var2; var56++) {
            int var57 = var56 * var1;
            int var58 = 3 * var57;
            int var59 = var58 + var1;
            int var22 = var59 + var1;
            int var23 = var57 + var55;
            int var24 = var23 + var55;

            for (int var25 = 2; var25 < var1; var25 += 2) {
               int var26 = var1 - var25;
               int var27 = var4 + var25;
               int var28 = var4 + var26;
               int var29 = var6 + var25;
               int var30 = var27 + var58;
               int var31 = var27 + var22;
               int var32 = var28 + var59;
               float var33 = var3[var30 - 1];
               float var34 = var3[var30];
               float var35 = var3[var31 - 1];
               float var36 = var3[var31];
               float var37 = var3[var32 - 1];
               float var38 = var3[var32];
               float var60 = var35 + var37;
               float var61 = var33 + -0.5F * var60;
               float var39 = var36 - var38;
               float var40 = var34 + -0.5F * var39;
               float var41 = 0.8660254F * (var35 - var37);
               float var62 = 0.8660254F * (var36 + var38);
               float var42 = var61 - var62;
               float var43 = var61 + var62;
               float var44 = var40 + var41;
               float var45 = var40 - var41;
               int var46 = var25 - 1 + var12;
               int var47 = var25 - 1 + var13;
               float var48 = this.field38825[var46 - 1];
               float var49 = this.field38825[var46];
               float var50 = this.field38825[var47 - 1];
               float var51 = this.field38825[var47];
               int var52 = var29 + var57;
               int var53 = var29 + var23;
               int var54 = var29 + var24;
               var5[var52 - 1] = var33 + var60;
               var5[var52] = var34 + var39;
               var5[var53 - 1] = var48 * var42 - var49 * var44;
               var5[var53] = var48 * var44 + var49 * var42;
               var5[var54 - 1] = var50 * var43 - var51 * var45;
               var5[var54] = var50 * var45 + var51 * var43;
            }
         }
      }
   }

   public void method30983(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      float var15 = -0.5F;
      float var16 = 0.8660254F;
      long var17 = var11;
      long var19 = var11 + var1;

      for (long var21 = 0L; var21 < var3; var21++) {
         long var23 = var21 * var1;
         long var25 = var6 + 3L * var23;
         long var27 = var25 + 2L * var1;
         float var29 = var5.method9651(var25);
         float var30 = 2.0F * var5.method9651(var27 - 1L);
         float var31 = var29 + -0.5F * var30;
         float var32 = 1.7320508F * var5.method9651(var27);
         var8.method9685(var9 + var23, var29 + var30);
         var8.method9685(var9 + (var21 + var3) * var1, var31 - var32);
         var8.method9685(var9 + (var21 + 2L * var3) * var1, var31 + var32);
      }

      if (var1 != 1L) {
         long var84 = var3 * var1;

         for (long var85 = 0L; var85 < var3; var85++) {
            long var86 = var85 * var1;
            long var87 = 3L * var86;
            long var33 = var87 + var1;
            long var35 = var33 + var1;
            long var37 = var86 + var84;
            long var39 = var37 + var84;

            for (long var41 = 2L; var41 < var1; var41 += 2L) {
               long var43 = var1 - var41;
               long var45 = var6 + var41;
               long var47 = var6 + var43;
               long var49 = var9 + var41;
               long var51 = var45 + var87;
               long var53 = var45 + var35;
               long var55 = var47 + var33;
               float var57 = var5.method9651(var51 - 1L);
               float var58 = var5.method9651(var51);
               float var59 = var5.method9651(var53 - 1L);
               float var60 = var5.method9651(var53);
               float var61 = var5.method9651(var55 - 1L);
               float var62 = var5.method9651(var55);
               float var88 = var59 + var61;
               float var89 = var57 + -0.5F * var88;
               float var63 = var60 - var62;
               float var64 = var58 + -0.5F * var63;
               float var65 = 0.8660254F * (var59 - var61);
               float var90 = 0.8660254F * (var60 + var62);
               float var66 = var89 - var90;
               float var67 = var89 + var90;
               float var68 = var64 + var65;
               float var69 = var64 - var65;
               long var70 = var41 - 1L + var17;
               long var72 = var41 - 1L + var19;
               float var74 = this.field38826.method9651(var70 - 1L);
               float var75 = this.field38826.method9651(var70);
               float var76 = this.field38826.method9651(var72 - 1L);
               float var77 = this.field38826.method9651(var72);
               long var78 = var49 + var86;
               long var80 = var49 + var37;
               long var82 = var49 + var39;
               var8.method9685(var78 - 1L, var57 + var88);
               var8.method9685(var78, var58 + var63);
               var8.method9685(var80 - 1L, var74 * var66 - var75 * var68);
               var8.method9685(var80, var74 * var68 + var75 * var66);
               var8.method9685(var82 - 1L, var76 * var67 - var77 * var69);
               var8.method9685(var82, var76 * var69 + var77 * var67);
            }
         }
      }
   }

   public void method30984(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      float var10 = 0.70710677F;
      int var11 = var7;
      int var12 = var7 + var1;
      int var13 = var12 + var1;
      int var14 = var2 * var1;

      for (int var15 = 0; var15 < var2; var15++) {
         int var16 = var15 * var1;
         int var17 = 4 * var16;
         int var18 = var16 + var14;
         int var19 = var18 + var14;
         int var20 = var19 + var14;
         int var21 = var17 + var1;
         float var22 = var3[var4 + var16];
         float var23 = var3[var4 + var18];
         float var24 = var3[var4 + var19];
         float var25 = var3[var4 + var20];
         float var26 = var23 + var25;
         float var27 = var22 + var24;
         int var28 = var6 + var17;
         int var29 = var6 + var21 + var1;
         var5[var28] = var26 + var27;
         var5[var29 - 1 + var1 + var1] = var27 - var26;
         var5[var29 - 1] = var22 - var24;
         var5[var29] = var25 - var23;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var68 = 0; var68 < var2; var68++) {
               int var70 = var68 * var1;
               int var72 = var70 + var14;
               int var74 = var72 + var14;
               int var76 = var74 + var14;
               int var78 = 4 * var70;
               int var80 = var78 + var1;
               int var82 = var80 + var1;
               int var84 = var82 + var1;

               for (int var30 = 2; var30 < var1; var30 += 2) {
                  int var31 = var1 - var30;
                  int var86 = var30 - 1 + var11;
                  int var88 = var30 - 1 + var12;
                  int var93 = var30 - 1 + var13;
                  float var32 = this.field38825[var86 - 1];
                  float var33 = this.field38825[var86];
                  float var34 = this.field38825[var88 - 1];
                  float var35 = this.field38825[var88];
                  float var36 = this.field38825[var93 - 1];
                  float var37 = this.field38825[var93];
                  int var95 = var4 + var30;
                  int var38 = var6 + var30;
                  int var39 = var6 + var31;
                  int var40 = var95 + var70;
                  int var41 = var95 + var72;
                  int var42 = var95 + var74;
                  int var43 = var95 + var76;
                  float var44 = var3[var40 - 1];
                  float var45 = var3[var40];
                  float var46 = var3[var41 - 1];
                  float var47 = var3[var41];
                  float var48 = var3[var42 - 1];
                  float var49 = var3[var42];
                  float var50 = var3[var43 - 1];
                  float var51 = var3[var43];
                  float var52 = var32 * var46 + var33 * var47;
                  float var53 = var32 * var47 - var33 * var46;
                  float var54 = var34 * var48 + var35 * var49;
                  float var55 = var34 * var49 - var35 * var48;
                  float var56 = var36 * var50 + var37 * var51;
                  float var57 = var36 * var51 - var37 * var50;
                  float var90 = var52 + var56;
                  float var58 = var56 - var52;
                  float var59 = var53 + var57;
                  float var60 = var53 - var57;
                  float var61 = var45 + var55;
                  float var62 = var45 - var55;
                  float var92 = var44 + var54;
                  float var63 = var44 - var54;
                  int var64 = var38 + var78;
                  int var65 = var39 + var80;
                  int var66 = var38 + var82;
                  int var67 = var39 + var84;
                  var5[var64 - 1] = var90 + var92;
                  var5[var67 - 1] = var92 - var90;
                  var5[var64] = var59 + var61;
                  var5[var67] = var59 - var61;
                  var5[var66 - 1] = var60 + var63;
                  var5[var65 - 1] = var63 - var60;
                  var5[var66] = var58 + var62;
                  var5[var65] = var58 - var62;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         for (int var69 = 0; var69 < var2; var69++) {
            int var71 = var69 * var1;
            int var73 = 4 * var71;
            int var75 = var71 + var14;
            int var77 = var75 + var14;
            int var79 = var77 + var14;
            int var81 = var73 + var1;
            int var83 = var81 + var1;
            int var85 = var83 + var1;
            int var87 = var4 + var1;
            int var89 = var6 + var1;
            float var94 = var3[var87 - 1 + var71];
            float var96 = var3[var87 - 1 + var75];
            float var97 = var3[var87 - 1 + var77];
            float var98 = var3[var87 - 1 + var79];
            float var99 = -0.70710677F * (var96 + var98);
            float var91 = 0.70710677F * (var96 - var98);
            var5[var89 - 1 + var73] = var91 + var94;
            var5[var89 - 1 + var83] = var94 - var91;
            var5[var6 + var81] = var99 - var97;
            var5[var6 + var85] = var99 + var97;
         }
      }
   }

   public void method30985(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      float var15 = 0.70710677F;
      long var16 = var11;
      long var18 = var11 + var1;
      long var20 = var18 + var1;
      long var22 = var3 * var1;

      for (long var24 = 0L; var24 < var3; var24++) {
         long var26 = var24 * var1;
         long var28 = 4L * var26;
         long var30 = var26 + var22;
         long var32 = var30 + var22;
         long var34 = var32 + var22;
         long var36 = var28 + var1;
         float var38 = var5.method9651(var6 + var26);
         float var39 = var5.method9651(var6 + var30);
         float var40 = var5.method9651(var6 + var32);
         float var41 = var5.method9651(var6 + var34);
         float var42 = var39 + var41;
         float var43 = var38 + var40;
         long var44 = var9 + var28;
         long var46 = var9 + var36 + var1;
         var8.method9685(var44, var42 + var43);
         var8.method9685(var46 - 1L + var1 + var1, var43 - var42);
         var8.method9685(var46 - 1L, var38 - var40);
         var8.method9685(var46, var41 - var39);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var110 = 0L; var110 < var3; var110++) {
               long var112 = var110 * var1;
               long var114 = var112 + var22;
               long var116 = var114 + var22;
               long var118 = var116 + var22;
               long var120 = 4L * var112;
               long var122 = var120 + var1;
               long var48 = var122 + var1;
               long var50 = var48 + var1;

               for (long var52 = 2L; var52 < var1; var52 += 2L) {
                  long var54 = var1 - var52;
                  long var127 = var52 - 1L + var16;
                  long var129 = var52 - 1L + var18;
                  long var56 = var52 - 1L + var20;
                  float var58 = this.field38826.method9651(var127 - 1L);
                  float var59 = this.field38826.method9651(var127);
                  float var60 = this.field38826.method9651(var129 - 1L);
                  float var61 = this.field38826.method9651(var129);
                  float var62 = this.field38826.method9651(var56 - 1L);
                  float var63 = this.field38826.method9651(var56);
                  long var64 = var6 + var52;
                  long var66 = var9 + var52;
                  long var68 = var9 + var54;
                  long var70 = var64 + var112;
                  long var72 = var64 + var114;
                  long var74 = var64 + var116;
                  long var76 = var64 + var118;
                  float var78 = var5.method9651(var70 - 1L);
                  float var79 = var5.method9651(var70);
                  float var80 = var5.method9651(var72 - 1L);
                  float var81 = var5.method9651(var72);
                  float var82 = var5.method9651(var74 - 1L);
                  float var83 = var5.method9651(var74);
                  float var84 = var5.method9651(var76 - 1L);
                  float var85 = var5.method9651(var76);
                  float var86 = var58 * var80 + var59 * var81;
                  float var87 = var58 * var81 - var59 * var80;
                  float var88 = var60 * var82 + var61 * var83;
                  float var89 = var60 * var83 - var61 * var82;
                  float var90 = var62 * var84 + var63 * var85;
                  float var91 = var62 * var85 - var63 * var84;
                  float var124 = var86 + var90;
                  float var92 = var90 - var86;
                  float var93 = var87 + var91;
                  float var94 = var87 - var91;
                  float var95 = var79 + var89;
                  float var96 = var79 - var89;
                  float var126 = var78 + var88;
                  float var97 = var78 - var88;
                  long var98 = var66 + var120;
                  long var100 = var68 + var122;
                  long var102 = var66 + var48;
                  long var104 = var68 + var50;
                  var8.method9685(var98 - 1L, var124 + var126);
                  var8.method9685(var104 - 1L, var126 - var124);
                  var8.method9685(var98, var93 + var95);
                  var8.method9685(var104, var93 - var95);
                  var8.method9685(var102 - 1L, var94 + var97);
                  var8.method9685(var100 - 1L, var97 - var94);
                  var8.method9685(var102, var92 + var96);
                  var8.method9685(var100, var92 - var96);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         for (long var111 = 0L; var111 < var3; var111++) {
            long var113 = var111 * var1;
            long var115 = 4L * var113;
            long var117 = var113 + var22;
            long var119 = var117 + var22;
            long var121 = var119 + var22;
            long var123 = var115 + var1;
            long var131 = var123 + var1;
            long var132 = var131 + var1;
            long var128 = var6 + var1;
            long var130 = var9 + var1;
            float var106 = var5.method9651(var128 - 1L + var113);
            float var107 = var5.method9651(var128 - 1L + var117);
            float var108 = var5.method9651(var128 - 1L + var119);
            float var109 = var5.method9651(var128 - 1L + var121);
            float var133 = -0.70710677F * (var107 + var109);
            float var125 = 0.70710677F * (var107 - var109);
            var8.method9685(var130 - 1L + var115, var125 + var106);
            var8.method9685(var130 - 1L + var131, var106 - var125);
            var8.method9685(var9 + var123, var133 - var108);
            var8.method9685(var9 + var132, var133 + var108);
         }
      }
   }

   public void method30986(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      float var10 = 1.4142135F;
      int var11 = var7;
      int var12 = var7 + var1;
      int var13 = var12 + var1;
      int var14 = var2 * var1;

      for (int var15 = 0; var15 < var2; var15++) {
         int var16 = var15 * var1;
         int var17 = 4 * var16;
         int var18 = var16 + var14;
         int var19 = var18 + var14;
         int var20 = var19 + var14;
         int var21 = var17 + var1;
         int var22 = var21 + var1;
         int var23 = var22 + var1;
         float var24 = var3[var4 + var17];
         float var25 = var3[var4 + var22];
         float var26 = var3[var4 + var1 - 1 + var23];
         float var27 = var3[var4 + var1 - 1 + var21];
         float var28 = var24 - var26;
         float var29 = var24 + var26;
         float var30 = var27 + var27;
         float var31 = var25 + var25;
         var5[var6 + var16] = var29 + var30;
         var5[var6 + var18] = var28 - var31;
         var5[var6 + var19] = var29 - var30;
         var5[var6 + var20] = var28 + var31;
      }

      if (var1 >= 2) {
         if (var1 != 2) {
            for (int var68 = 0; var68 < var2; var68++) {
               int var70 = var68 * var1;
               int var72 = var70 + var14;
               int var74 = var72 + var14;
               int var76 = var74 + var14;
               int var78 = 4 * var70;
               int var80 = var78 + var1;
               int var82 = var80 + var1;
               int var84 = var82 + var1;

               for (int var32 = 2; var32 < var1; var32 += 2) {
                  int var33 = var1 - var32;
                  int var86 = var32 - 1 + var11;
                  int var88 = var32 - 1 + var12;
                  int var90 = var32 - 1 + var13;
                  float var34 = this.field38825[var86 - 1];
                  float var35 = this.field38825[var86];
                  float var36 = this.field38825[var88 - 1];
                  float var37 = this.field38825[var88];
                  float var38 = this.field38825[var90 - 1];
                  float var39 = this.field38825[var90];
                  int var92 = var4 + var32;
                  int var40 = var4 + var33;
                  int var41 = var6 + var32;
                  int var42 = var92 + var78;
                  int var43 = var40 + var80;
                  int var44 = var92 + var82;
                  int var45 = var40 + var84;
                  float var46 = var3[var42 - 1];
                  float var47 = var3[var42];
                  float var48 = var3[var43 - 1];
                  float var49 = var3[var43];
                  float var50 = var3[var44 - 1];
                  float var51 = var3[var44];
                  float var52 = var3[var45 - 1];
                  float var53 = var3[var45];
                  float var54 = var47 + var53;
                  float var55 = var47 - var53;
                  float var56 = var51 - var49;
                  float var99 = var51 + var49;
                  float var94 = var46 - var52;
                  float var96 = var46 + var52;
                  float var57 = var50 - var48;
                  float var98 = var50 + var48;
                  float var58 = var96 - var98;
                  float var59 = var55 - var56;
                  float var60 = var94 - var99;
                  float var61 = var94 + var99;
                  float var62 = var54 + var57;
                  float var63 = var54 - var57;
                  int var64 = var41 + var70;
                  int var65 = var41 + var72;
                  int var66 = var41 + var74;
                  int var67 = var41 + var76;
                  var5[var64 - 1] = var96 + var98;
                  var5[var64] = var55 + var56;
                  var5[var65 - 1] = var34 * var60 - var35 * var62;
                  var5[var65] = var34 * var62 + var35 * var60;
                  var5[var66 - 1] = var36 * var58 - var37 * var59;
                  var5[var66] = var36 * var59 + var37 * var58;
                  var5[var67 - 1] = var38 * var61 - var39 * var63;
                  var5[var67] = var38 * var63 + var39 * var61;
               }
            }

            if (var1 % 2 == 1) {
               return;
            }
         }

         for (int var69 = 0; var69 < var2; var69++) {
            int var71 = var69 * var1;
            int var73 = 4 * var71;
            int var75 = var71 + var14;
            int var77 = var75 + var14;
            int var79 = var77 + var14;
            int var81 = var73 + var1;
            int var83 = var81 + var1;
            int var85 = var83 + var1;
            int var87 = var4 + var1;
            int var89 = var6 + var1;
            float var91 = var3[var87 - 1 + var73];
            float var93 = var3[var87 - 1 + var83];
            float var100 = var3[var4 + var81];
            float var101 = var3[var4 + var85];
            float var102 = var100 + var101;
            float var103 = var101 - var100;
            float var95 = var91 - var93;
            float var97 = var91 + var93;
            var5[var89 - 1 + var71] = var97 + var97;
            var5[var89 - 1 + var75] = 1.4142135F * (var95 - var102);
            var5[var89 - 1 + var77] = var103 + var103;
            var5[var89 - 1 + var79] = -1.4142135F * (var95 + var102);
         }
      }
   }

   public void method30987(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      float var15 = 1.4142135F;
      long var16 = var11;
      long var18 = var11 + var1;
      long var20 = var18 + var1;
      long var22 = var3 * var1;

      for (long var24 = 0L; var24 < var3; var24++) {
         long var26 = var24 * var1;
         long var28 = 4L * var26;
         long var30 = var26 + var22;
         long var32 = var30 + var22;
         long var34 = var32 + var22;
         long var36 = var28 + var1;
         long var38 = var36 + var1;
         long var40 = var38 + var1;
         float var42 = var5.method9651(var6 + var28);
         float var43 = var5.method9651(var6 + var38);
         float var44 = var5.method9651(var6 + var1 - 1L + var40);
         float var45 = var5.method9651(var6 + var1 - 1L + var36);
         float var46 = var42 - var44;
         float var47 = var42 + var44;
         float var48 = var45 + var45;
         float var49 = var43 + var43;
         var8.method9685(var9 + var26, var47 + var48);
         var8.method9685(var9 + var30, var46 - var49);
         var8.method9685(var9 + var32, var47 - var48);
         var8.method9685(var9 + var34, var46 + var49);
      }

      if (var1 >= 2L) {
         if (var1 != 2L) {
            for (long var110 = 0L; var110 < var3; var110++) {
               long var112 = var110 * var1;
               long var114 = var112 + var22;
               long var116 = var114 + var22;
               long var118 = var116 + var22;
               long var120 = 4L * var112;
               long var122 = var120 + var1;
               long var124 = var122 + var1;
               long var126 = var124 + var1;

               for (long var50 = 2L; var50 < var1; var50 += 2L) {
                  long var52 = var1 - var50;
                  long var54 = var50 - 1L + var16;
                  long var56 = var50 - 1L + var18;
                  long var58 = var50 - 1L + var20;
                  float var60 = this.field38826.method9651(var54 - 1L);
                  float var61 = this.field38826.method9651(var54);
                  float var62 = this.field38826.method9651(var56 - 1L);
                  float var63 = this.field38826.method9651(var56);
                  float var64 = this.field38826.method9651(var58 - 1L);
                  float var65 = this.field38826.method9651(var58);
                  long var66 = var6 + var50;
                  long var68 = var6 + var52;
                  long var70 = var9 + var50;
                  long var72 = var66 + var120;
                  long var74 = var68 + var122;
                  long var76 = var66 + var124;
                  long var78 = var68 + var126;
                  float var80 = var5.method9651(var72 - 1L);
                  float var81 = var5.method9651(var72);
                  float var82 = var5.method9651(var74 - 1L);
                  float var83 = var5.method9651(var74);
                  float var84 = var5.method9651(var76 - 1L);
                  float var85 = var5.method9651(var76);
                  float var86 = var5.method9651(var78 - 1L);
                  float var87 = var5.method9651(var78);
                  float var88 = var81 + var87;
                  float var89 = var81 - var87;
                  float var90 = var85 - var83;
                  float var133 = var85 + var83;
                  float var128 = var80 - var86;
                  float var130 = var80 + var86;
                  float var91 = var84 - var82;
                  float var132 = var84 + var82;
                  float var92 = var130 - var132;
                  float var93 = var89 - var90;
                  float var94 = var128 - var133;
                  float var95 = var128 + var133;
                  float var96 = var88 + var91;
                  float var97 = var88 - var91;
                  long var98 = var70 + var112;
                  long var100 = var70 + var114;
                  long var102 = var70 + var116;
                  long var104 = var70 + var118;
                  var8.method9685(var98 - 1L, var130 + var132);
                  var8.method9685(var98, var89 + var90);
                  var8.method9685(var100 - 1L, var60 * var94 - var61 * var96);
                  var8.method9685(var100, var60 * var96 + var61 * var94);
                  var8.method9685(var102 - 1L, var62 * var92 - var63 * var93);
                  var8.method9685(var102, var62 * var93 + var63 * var92);
                  var8.method9685(var104 - 1L, var64 * var95 - var65 * var97);
                  var8.method9685(var104, var64 * var97 + var65 * var95);
               }
            }

            if (var1 % 2L == 1L) {
               return;
            }
         }

         for (long var111 = 0L; var111 < var3; var111++) {
            long var113 = var111 * var1;
            long var115 = 4L * var113;
            long var117 = var113 + var22;
            long var119 = var117 + var22;
            long var121 = var119 + var22;
            long var123 = var115 + var1;
            long var125 = var123 + var1;
            long var127 = var125 + var1;
            long var134 = var6 + var1;
            long var135 = var9 + var1;
            float var106 = var5.method9651(var134 - 1L + var115);
            float var107 = var5.method9651(var134 - 1L + var125);
            float var108 = var5.method9651(var6 + var123);
            float var109 = var5.method9651(var6 + var127);
            float var136 = var108 + var109;
            float var137 = var109 - var108;
            float var129 = var106 - var107;
            float var131 = var106 + var107;
            var8.method9685(var135 - 1L + var113, var131 + var131);
            var8.method9685(var135 - 1L + var117, 1.4142135F * (var129 - var136));
            var8.method9685(var135 - 1L + var119, var137 + var137);
            var8.method9685(var135 - 1L + var121, -1.4142135F * (var129 + var136));
         }
      }
   }

   public void method30988(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      float var10 = 0.309017F;
      float var11 = 0.95105654F;
      float var12 = -0.809017F;
      float var13 = 0.58778524F;
      int var14 = var7;
      int var15 = var7 + var1;
      int var16 = var15 + var1;
      int var17 = var16 + var1;
      int var18 = var2 * var1;

      for (int var19 = 0; var19 < var2; var19++) {
         int var20 = var19 * var1;
         int var21 = 5 * var20;
         int var22 = var21 + var1;
         int var23 = var22 + var1;
         int var24 = var23 + var1;
         int var25 = var24 + var1;
         int var26 = var20 + var18;
         int var27 = var26 + var18;
         int var28 = var27 + var18;
         int var29 = var28 + var18;
         int var30 = var6 + var1 - 1;
         float var31 = var3[var4 + var20];
         float var32 = var3[var4 + var26];
         float var33 = var3[var4 + var27];
         float var34 = var3[var4 + var28];
         float var35 = var3[var4 + var29];
         float var36 = var35 + var32;
         float var37 = var35 - var32;
         float var38 = var34 + var33;
         float var39 = var34 - var33;
         var5[var6 + var21] = var31 + var36 + var38;
         var5[var30 + var22] = var31 + 0.309017F * var36 + -0.809017F * var38;
         var5[var6 + var23] = 0.95105654F * var37 + 0.58778524F * var39;
         var5[var30 + var24] = var31 + -0.809017F * var36 + 0.309017F * var38;
         var5[var6 + var25] = 0.58778524F * var37 - 0.95105654F * var39;
      }

      if (var1 != 1) {
         for (int var91 = 0; var91 < var2; var91++) {
            int var92 = var91 * var1;
            int var93 = 5 * var92;
            int var94 = var93 + var1;
            int var95 = var94 + var1;
            int var96 = var95 + var1;
            int var97 = var96 + var1;
            int var98 = var92 + var18;
            int var99 = var98 + var18;
            int var100 = var99 + var18;
            int var101 = var100 + var18;

            for (int var40 = 2; var40 < var1; var40 += 2) {
               int var102 = var40 - 1 + var14;
               int var103 = var40 - 1 + var15;
               int var104 = var40 - 1 + var16;
               int var105 = var40 - 1 + var17;
               float var41 = this.field38825[var102 - 1];
               float var42 = this.field38825[var102];
               float var43 = this.field38825[var103 - 1];
               float var44 = this.field38825[var103];
               float var45 = this.field38825[var104 - 1];
               float var46 = this.field38825[var104];
               float var47 = this.field38825[var105 - 1];
               float var48 = this.field38825[var105];
               int var49 = var1 - var40;
               int var106 = var4 + var40;
               int var107 = var6 + var40;
               int var50 = var6 + var49;
               int var51 = var106 + var92;
               int var52 = var106 + var98;
               int var53 = var106 + var99;
               int var54 = var106 + var100;
               int var55 = var106 + var101;
               float var56 = var3[var51 - 1];
               float var57 = var3[var51];
               float var58 = var3[var52 - 1];
               float var59 = var3[var52];
               float var60 = var3[var53 - 1];
               float var61 = var3[var53];
               float var62 = var3[var54 - 1];
               float var63 = var3[var54];
               float var64 = var3[var55 - 1];
               float var65 = var3[var55];
               float var66 = var41 * var58 + var42 * var59;
               float var67 = var41 * var59 - var42 * var58;
               float var68 = var43 * var60 + var44 * var61;
               float var69 = var43 * var61 - var44 * var60;
               float var70 = var45 * var62 + var46 * var63;
               float var71 = var45 * var63 - var46 * var62;
               float var72 = var47 * var64 + var48 * var65;
               float var73 = var47 * var65 - var48 * var64;
               float var108 = var66 + var72;
               float var109 = var72 - var66;
               float var74 = var67 - var73;
               float var75 = var67 + var73;
               float var110 = var68 + var70;
               float var111 = var70 - var68;
               float var76 = var69 - var71;
               float var77 = var69 + var71;
               float var78 = var56 + 0.309017F * var108 + -0.809017F * var110;
               float var79 = var57 + 0.309017F * var75 + -0.809017F * var77;
               float var80 = var56 + -0.809017F * var108 + 0.309017F * var110;
               float var81 = var57 + -0.809017F * var75 + 0.309017F * var77;
               float var82 = 0.95105654F * var74 + 0.58778524F * var76;
               float var83 = 0.95105654F * var109 + 0.58778524F * var111;
               float var84 = 0.58778524F * var74 - 0.95105654F * var76;
               float var85 = 0.58778524F * var109 - 0.95105654F * var111;
               int var86 = var107 + var93;
               int var87 = var50 + var94;
               int var88 = var107 + var95;
               int var89 = var50 + var96;
               int var90 = var107 + var97;
               var5[var86 - 1] = var56 + var108 + var110;
               var5[var86] = var57 + var75 + var77;
               var5[var88 - 1] = var78 + var82;
               var5[var87 - 1] = var78 - var82;
               var5[var88] = var79 + var83;
               var5[var87] = var83 - var79;
               var5[var90 - 1] = var80 + var84;
               var5[var89 - 1] = var80 - var84;
               var5[var90] = var81 + var85;
               var5[var89] = var85 - var81;
            }
         }
      }
   }

   public void method30989(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      float var15 = 0.309017F;
      float var16 = 0.95105654F;
      float var17 = -0.809017F;
      float var18 = 0.58778524F;
      long var19 = var11;
      long var21 = var11 + var1;
      long var23 = var21 + var1;
      long var25 = var23 + var1;
      long var27 = var3 * var1;

      for (long var29 = 0L; var29 < var3; var29++) {
         long var31 = var29 * var1;
         long var33 = 5L * var31;
         long var35 = var33 + var1;
         long var37 = var35 + var1;
         long var39 = var37 + var1;
         long var41 = var39 + var1;
         long var43 = var31 + var27;
         long var45 = var43 + var27;
         long var47 = var45 + var27;
         long var49 = var47 + var27;
         long var51 = var9 + var1 - 1L;
         float var53 = var5.method9651(var6 + var31);
         float var54 = var5.method9651(var6 + var43);
         float var55 = var5.method9651(var6 + var45);
         float var56 = var5.method9651(var6 + var47);
         float var57 = var5.method9651(var6 + var49);
         float var58 = var57 + var54;
         float var59 = var57 - var54;
         float var60 = var56 + var55;
         float var61 = var56 - var55;
         var8.method9685(var9 + var33, var53 + var58 + var60);
         var8.method9685(var51 + var35, var53 + 0.309017F * var58 + -0.809017F * var60);
         var8.method9685(var9 + var37, 0.95105654F * var59 + 0.58778524F * var61);
         var8.method9685(var51 + var39, var53 + -0.809017F * var58 + 0.309017F * var60);
         var8.method9685(var9 + var41, 0.58778524F * var59 - 0.95105654F * var61);
      }

      if (var1 != 1L) {
         for (long var136 = 0L; var136 < var3; var136++) {
            long var137 = var136 * var1;
            long var138 = 5L * var137;
            long var139 = var138 + var1;
            long var140 = var139 + var1;
            long var141 = var140 + var1;
            long var142 = var141 + var1;
            long var143 = var137 + var27;
            long var144 = var143 + var27;
            long var145 = var144 + var27;
            long var146 = var145 + var27;

            for (long var62 = 2L; var62 < var1; var62 += 2L) {
               long var147 = var62 - 1L + var19;
               long var64 = var62 - 1L + var21;
               long var66 = var62 - 1L + var23;
               long var68 = var62 - 1L + var25;
               float var70 = this.field38826.method9651(var147 - 1L);
               float var71 = this.field38826.method9651(var147);
               float var72 = this.field38826.method9651(var64 - 1L);
               float var73 = this.field38826.method9651(var64);
               float var74 = this.field38826.method9651(var66 - 1L);
               float var75 = this.field38826.method9651(var66);
               float var76 = this.field38826.method9651(var68 - 1L);
               float var77 = this.field38826.method9651(var68);
               long var78 = var1 - var62;
               long var80 = var6 + var62;
               long var82 = var9 + var62;
               long var84 = var9 + var78;
               long var86 = var80 + var137;
               long var88 = var80 + var143;
               long var90 = var80 + var144;
               long var92 = var80 + var145;
               long var94 = var80 + var146;
               float var96 = var5.method9651(var86 - 1L);
               float var97 = var5.method9651(var86);
               float var98 = var5.method9651(var88 - 1L);
               float var99 = var5.method9651(var88);
               float var100 = var5.method9651(var90 - 1L);
               float var101 = var5.method9651(var90);
               float var102 = var5.method9651(var92 - 1L);
               float var103 = var5.method9651(var92);
               float var104 = var5.method9651(var94 - 1L);
               float var105 = var5.method9651(var94);
               float var106 = var70 * var98 + var71 * var99;
               float var107 = var70 * var99 - var71 * var98;
               float var108 = var72 * var100 + var73 * var101;
               float var109 = var72 * var101 - var73 * var100;
               float var110 = var74 * var102 + var75 * var103;
               float var111 = var74 * var103 - var75 * var102;
               float var112 = var76 * var104 + var77 * var105;
               float var113 = var76 * var105 - var77 * var104;
               float var148 = var106 + var112;
               float var149 = var112 - var106;
               float var114 = var107 - var113;
               float var115 = var107 + var113;
               float var150 = var108 + var110;
               float var151 = var110 - var108;
               float var116 = var109 - var111;
               float var117 = var109 + var111;
               float var118 = var96 + 0.309017F * var148 + -0.809017F * var150;
               float var119 = var97 + 0.309017F * var115 + -0.809017F * var117;
               float var120 = var96 + -0.809017F * var148 + 0.309017F * var150;
               float var121 = var97 + -0.809017F * var115 + 0.309017F * var117;
               float var122 = 0.95105654F * var114 + 0.58778524F * var116;
               float var123 = 0.95105654F * var149 + 0.58778524F * var151;
               float var124 = 0.58778524F * var114 - 0.95105654F * var116;
               float var125 = 0.58778524F * var149 - 0.95105654F * var151;
               long var126 = var82 + var138;
               long var128 = var84 + var139;
               long var130 = var82 + var140;
               long var132 = var84 + var141;
               long var134 = var82 + var142;
               var8.method9685(var126 - 1L, var96 + var148 + var150);
               var8.method9685(var126, var97 + var115 + var117);
               var8.method9685(var130 - 1L, var118 + var122);
               var8.method9685(var128 - 1L, var118 - var122);
               var8.method9685(var130, var119 + var123);
               var8.method9685(var128, var123 - var119);
               var8.method9685(var134 - 1L, var120 + var124);
               var8.method9685(var132 - 1L, var120 - var124);
               var8.method9685(var134, var121 + var125);
               var8.method9685(var132, var125 - var121);
            }
         }
      }
   }

   public void method30990(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      float var10 = 0.309017F;
      float var11 = 0.95105654F;
      float var12 = -0.809017F;
      float var13 = 0.58778524F;
      int var14 = var7;
      int var15 = var7 + var1;
      int var16 = var15 + var1;
      int var17 = var16 + var1;
      int var18 = var2 * var1;

      for (int var19 = 0; var19 < var2; var19++) {
         int var20 = var19 * var1;
         int var21 = 5 * var20;
         int var22 = var21 + var1;
         int var23 = var22 + var1;
         int var24 = var23 + var1;
         int var25 = var24 + var1;
         int var26 = var20 + var18;
         int var27 = var26 + var18;
         int var28 = var27 + var18;
         int var29 = var28 + var18;
         int var30 = var4 + var1 - 1;
         float var31 = var3[var4 + var21];
         float var32 = 2.0F * var3[var4 + var23];
         float var33 = 2.0F * var3[var4 + var25];
         float var34 = 2.0F * var3[var30 + var22];
         float var35 = 2.0F * var3[var30 + var24];
         float var36 = var31 + 0.309017F * var34 + -0.809017F * var35;
         float var37 = var31 + -0.809017F * var34 + 0.309017F * var35;
         float var38 = 0.95105654F * var32 + 0.58778524F * var33;
         float var39 = 0.58778524F * var32 - 0.95105654F * var33;
         var5[var6 + var20] = var31 + var34 + var35;
         var5[var6 + var26] = var36 - var38;
         var5[var6 + var27] = var37 - var39;
         var5[var6 + var28] = var37 + var39;
         var5[var6 + var29] = var36 + var38;
      }

      if (var1 != 1) {
         for (int var91 = 0; var91 < var2; var91++) {
            int var92 = var91 * var1;
            int var93 = 5 * var92;
            int var94 = var93 + var1;
            int var95 = var94 + var1;
            int var96 = var95 + var1;
            int var97 = var96 + var1;
            int var98 = var92 + var18;
            int var99 = var98 + var18;
            int var100 = var99 + var18;
            int var101 = var100 + var18;

            for (int var40 = 2; var40 < var1; var40 += 2) {
               int var41 = var1 - var40;
               int var102 = var40 - 1 + var14;
               int var103 = var40 - 1 + var15;
               int var42 = var40 - 1 + var16;
               int var43 = var40 - 1 + var17;
               float var44 = this.field38825[var102 - 1];
               float var45 = this.field38825[var102];
               float var46 = this.field38825[var103 - 1];
               float var47 = this.field38825[var103];
               float var48 = this.field38825[var42 - 1];
               float var49 = this.field38825[var42];
               float var50 = this.field38825[var43 - 1];
               float var51 = this.field38825[var43];
               int var52 = var4 + var40;
               int var53 = var4 + var41;
               int var54 = var6 + var40;
               int var55 = var52 + var93;
               int var56 = var53 + var94;
               int var57 = var52 + var95;
               int var58 = var53 + var96;
               int var59 = var52 + var97;
               float var60 = var3[var55 - 1];
               float var61 = var3[var55];
               float var62 = var3[var56 - 1];
               float var63 = var3[var56];
               float var64 = var3[var57 - 1];
               float var65 = var3[var57];
               float var66 = var3[var58 - 1];
               float var67 = var3[var58];
               float var68 = var3[var59 - 1];
               float var69 = var3[var59];
               float var104 = var65 + var63;
               float var70 = var65 - var63;
               float var105 = var69 + var67;
               float var71 = var69 - var67;
               float var72 = var64 - var62;
               float var106 = var64 + var62;
               float var73 = var68 - var66;
               float var107 = var68 + var66;
               float var108 = var60 + 0.309017F * var106 + -0.809017F * var107;
               float var74 = var61 + 0.309017F * var70 + -0.809017F * var71;
               float var109 = var60 + -0.809017F * var106 + 0.309017F * var107;
               float var75 = var61 + -0.809017F * var70 + 0.309017F * var71;
               float var76 = 0.95105654F * var72 + 0.58778524F * var73;
               float var110 = 0.95105654F * var104 + 0.58778524F * var105;
               float var77 = 0.58778524F * var72 - 0.95105654F * var73;
               float var111 = 0.58778524F * var104 - 0.95105654F * var105;
               float var78 = var109 - var111;
               float var79 = var109 + var111;
               float var80 = var75 + var77;
               float var81 = var75 - var77;
               float var82 = var108 + var110;
               float var83 = var108 - var110;
               float var84 = var74 - var76;
               float var85 = var74 + var76;
               int var86 = var54 + var92;
               int var87 = var54 + var98;
               int var88 = var54 + var99;
               int var89 = var54 + var100;
               int var90 = var54 + var101;
               var5[var86 - 1] = var60 + var106 + var107;
               var5[var86] = var61 + var70 + var71;
               var5[var87 - 1] = var44 * var83 - var45 * var85;
               var5[var87] = var44 * var85 + var45 * var83;
               var5[var88 - 1] = var46 * var78 - var47 * var80;
               var5[var88] = var46 * var80 + var47 * var78;
               var5[var89 - 1] = var48 * var79 - var49 * var81;
               var5[var89] = var48 * var81 + var49 * var79;
               var5[var90 - 1] = var50 * var82 - var51 * var84;
               var5[var90] = var50 * var84 + var51 * var82;
            }
         }
      }
   }

   public void method30991(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11) {
      float var15 = 0.309017F;
      float var16 = 0.95105654F;
      float var17 = -0.809017F;
      float var18 = 0.58778524F;
      long var19 = var11;
      long var21 = var11 + var1;
      long var23 = var21 + var1;
      long var25 = var23 + var1;
      long var27 = var3 * var1;

      for (long var29 = 0L; var29 < var3; var29++) {
         long var31 = var29 * var1;
         long var33 = 5L * var31;
         long var35 = var33 + var1;
         long var37 = var35 + var1;
         long var39 = var37 + var1;
         long var41 = var39 + var1;
         long var43 = var31 + var27;
         long var45 = var43 + var27;
         long var47 = var45 + var27;
         long var49 = var47 + var27;
         long var51 = var6 + var1 - 1L;
         float var53 = var5.method9651(var6 + var33);
         float var54 = 2.0F * var5.method9651(var6 + var37);
         float var55 = 2.0F * var5.method9651(var6 + var41);
         float var56 = 2.0F * var5.method9651(var51 + var35);
         float var57 = 2.0F * var5.method9651(var51 + var39);
         float var58 = var53 + 0.309017F * var56 + -0.809017F * var57;
         float var59 = var53 + -0.809017F * var56 + 0.309017F * var57;
         float var60 = 0.95105654F * var54 + 0.58778524F * var55;
         float var61 = 0.58778524F * var54 - 0.95105654F * var55;
         var8.method9685(var9 + var31, var53 + var56 + var57);
         var8.method9685(var9 + var43, var58 - var60);
         var8.method9685(var9 + var45, var59 - var61);
         var8.method9685(var9 + var47, var59 + var61);
         var8.method9685(var9 + var49, var58 + var60);
      }

      if (var1 != 1L) {
         for (long var132 = 0L; var132 < var3; var132++) {
            long var133 = var132 * var1;
            long var134 = 5L * var133;
            long var135 = var134 + var1;
            long var136 = var135 + var1;
            long var137 = var136 + var1;
            long var138 = var137 + var1;
            long var139 = var133 + var27;
            long var140 = var139 + var27;
            long var141 = var140 + var27;
            long var142 = var141 + var27;

            for (long var62 = 2L; var62 < var1; var62 += 2L) {
               long var64 = var1 - var62;
               long var143 = var62 - 1L + var19;
               long var66 = var62 - 1L + var21;
               long var68 = var62 - 1L + var23;
               long var70 = var62 - 1L + var25;
               float var72 = this.field38826.method9651(var143 - 1L);
               float var73 = this.field38826.method9651(var143);
               float var74 = this.field38826.method9651(var66 - 1L);
               float var75 = this.field38826.method9651(var66);
               float var76 = this.field38826.method9651(var68 - 1L);
               float var77 = this.field38826.method9651(var68);
               float var78 = this.field38826.method9651(var70 - 1L);
               float var79 = this.field38826.method9651(var70);
               long var80 = var6 + var62;
               long var82 = var6 + var64;
               long var84 = var9 + var62;
               long var86 = var80 + var134;
               long var88 = var82 + var135;
               long var90 = var80 + var136;
               long var92 = var82 + var137;
               long var94 = var80 + var138;
               float var96 = var5.method9651(var86 - 1L);
               float var97 = var5.method9651(var86);
               float var98 = var5.method9651(var88 - 1L);
               float var99 = var5.method9651(var88);
               float var100 = var5.method9651(var90 - 1L);
               float var101 = var5.method9651(var90);
               float var102 = var5.method9651(var92 - 1L);
               float var103 = var5.method9651(var92);
               float var104 = var5.method9651(var94 - 1L);
               float var105 = var5.method9651(var94);
               float var144 = var101 + var99;
               float var106 = var101 - var99;
               float var145 = var105 + var103;
               float var107 = var105 - var103;
               float var108 = var100 - var98;
               float var146 = var100 + var98;
               float var109 = var104 - var102;
               float var147 = var104 + var102;
               float var148 = var96 + 0.309017F * var146 + -0.809017F * var147;
               float var110 = var97 + 0.309017F * var106 + -0.809017F * var107;
               float var149 = var96 + -0.809017F * var146 + 0.309017F * var147;
               float var111 = var97 + -0.809017F * var106 + 0.309017F * var107;
               float var112 = 0.95105654F * var108 + 0.58778524F * var109;
               float var150 = 0.95105654F * var144 + 0.58778524F * var145;
               float var113 = 0.58778524F * var108 - 0.95105654F * var109;
               float var151 = 0.58778524F * var144 - 0.95105654F * var145;
               float var114 = var149 - var151;
               float var115 = var149 + var151;
               float var116 = var111 + var113;
               float var117 = var111 - var113;
               float var118 = var148 + var150;
               float var119 = var148 - var150;
               float var120 = var110 - var112;
               float var121 = var110 + var112;
               long var122 = var84 + var133;
               long var124 = var84 + var139;
               long var126 = var84 + var140;
               long var128 = var84 + var141;
               long var130 = var84 + var142;
               var8.method9685(var122 - 1L, var96 + var146 + var147);
               var8.method9685(var122, var97 + var106 + var107);
               var8.method9685(var124 - 1L, var72 * var119 - var73 * var121);
               var8.method9685(var124, var72 * var121 + var73 * var119);
               var8.method9685(var126 - 1L, var74 * var114 - var75 * var116);
               var8.method9685(var126, var74 * var116 + var75 * var114);
               var8.method9685(var128 - 1L, var76 * var115 - var77 * var117);
               var8.method9685(var128, var76 * var117 + var77 * var115);
               var8.method9685(var130 - 1L, var78 * var118 - var79 * var120);
               var8.method9685(var130, var78 * var120 + var79 * var118);
            }
         }
      }
   }

   public void method30992(int var1, int var2, int var3, int var4, float[] var5, int var6, float[] var7, int var8, int var9) {
      int var12 = var9;
      float var13 = (float) (Math.PI * 2) / (float)var2;
      float var14 = (float)Class9044.method33578((double)var13);
      float var15 = (float)Class9044.method33577((double)var13);
      int var16 = (var2 + 1) / 2;
      int var17 = (var1 - 1) / 2;
      if (var1 == 1) {
         System.arraycopy(var7, var8, var5, var6, var4);
      } else {
         for (int var18 = 0; var18 < var4; var18++) {
            var7[var8 + var18] = var5[var6 + var18];
         }

         for (int var55 = 1; var55 < var2; var55++) {
            int var20 = var55 * var3 * var1;

            for (int var21 = 0; var21 < var3; var21++) {
               int var22 = var21 * var1 + var20;
               var7[var8 + var22] = var5[var6 + var22];
            }
         }

         if (var17 > var3) {
            int var62 = -var1;

            for (int var57 = 1; var57 < var2; var57++) {
               var62 += var1;
               int var64 = var57 * var3 * var1;

               for (int var74 = 0; var74 < var3; var74++) {
                  int var97 = var62 - 1;
                  int var86 = var74 * var1 + var64;

                  for (int var98 = 2; var98 < var1; var98 += 2) {
                     var97 += 2;
                     int var108 = var97 + var12;
                     float var117 = this.field38825[var108 - 1];
                     float var118 = this.field38825[var108];
                     int var119 = var8 + var98 + var86;
                     int var128 = var6 + var98 + var86;
                     float var136 = var5[var128 - 1];
                     float var144 = var5[var128];
                     var7[var119 - 1] = var117 * var136 + var118 * var144;
                     var7[var119] = var117 * var144 - var118 * var136;
                  }
               }
            }
         } else {
            int var19 = -var1;

            for (int var56 = 1; var56 < var2; var56++) {
               var19 += var1;
               int var23 = var19 - 1;
               int var63 = var56 * var3 * var1;

               for (int var73 = 2; var73 < var1; var73 += 2) {
                  var23 += 2;
                  int var85 = var23 + var12;
                  int var24 = var6 + var73;
                  int var25 = var8 + var73;
                  float var26 = this.field38825[var85 - 1];
                  float var27 = this.field38825[var85];

                  for (int var28 = 0; var28 < var3; var28++) {
                     int var29 = var28 * var1 + var63;
                     int var30 = var25 + var29;
                     int var31 = var24 + var29;
                     float var32 = var5[var31 - 1];
                     float var33 = var5[var31];
                     var7[var30 - 1] = var26 * var32 + var27 * var33;
                     var7[var30] = var26 * var33 - var27 * var32;
                  }
               }
            }
         }

         if (var17 < var3) {
            for (int var58 = 1; var58 < var16; var58++) {
               int var34 = var2 - var58;
               int var65 = var58 * var3 * var1;
               int var75 = var34 * var3 * var1;

               for (int var87 = 2; var87 < var1; var87 += 2) {
                  int var99 = var6 + var87;
                  int var109 = var8 + var87;

                  for (int var120 = 0; var120 < var3; var120++) {
                     int var129 = var120 * var1 + var65;
                     int var137 = var120 * var1 + var75;
                     int var145 = var99 + var129;
                     int var152 = var99 + var137;
                     int var157 = var109 + var129;
                     int var35 = var109 + var137;
                     float var36 = var7[var157 - 1];
                     float var37 = var7[var157];
                     float var38 = var7[var35 - 1];
                     float var39 = var7[var35];
                     var5[var145 - 1] = var36 + var38;
                     var5[var145] = var37 + var39;
                     var5[var152 - 1] = var37 - var39;
                     var5[var152] = var38 - var36;
                  }
               }
            }
         } else {
            for (int var59 = 1; var59 < var16; var59++) {
               int var161 = var2 - var59;
               int var66 = var59 * var3 * var1;
               int var76 = var161 * var3 * var1;

               for (int var88 = 0; var88 < var3; var88++) {
                  int var100 = var88 * var1 + var66;
                  int var110 = var88 * var1 + var76;

                  for (int var121 = 2; var121 < var1; var121 += 2) {
                     int var130 = var6 + var121;
                     int var138 = var8 + var121;
                     int var146 = var130 + var100;
                     int var153 = var130 + var110;
                     int var158 = var138 + var100;
                     int var167 = var138 + var110;
                     float var170 = var7[var158 - 1];
                     float var173 = var7[var158];
                     float var176 = var7[var167 - 1];
                     float var179 = var7[var167];
                     var5[var146 - 1] = var170 + var176;
                     var5[var146] = var173 + var179;
                     var5[var153 - 1] = var173 - var179;
                     var5[var153] = var176 - var170;
                  }
               }
            }
         }
      }

      for (int var60 = 1; var60 < var16; var60++) {
         int var162 = var2 - var60;
         int var67 = var60 * var3 * var1;
         int var77 = var162 * var3 * var1;

         for (int var89 = 0; var89 < var3; var89++) {
            int var101 = var89 * var1 + var67;
            int var111 = var89 * var1 + var77;
            int var122 = var8 + var101;
            int var131 = var8 + var111;
            float var139 = var7[var122];
            float var147 = var7[var131];
            var5[var6 + var101] = var139 + var147;
            var5[var6 + var111] = var147 - var139;
         }
      }

      float var40 = 1.0F;
      float var41 = 0.0F;
      int var61 = (var2 - 1) * var4;

      for (int var68 = 1; var68 < var16; var68++) {
         int var42 = var2 - var68;
         float var43 = var14 * var40 - var15 * var41;
         var41 = var14 * var41 + var15 * var40;
         var40 = var43;
         int var78 = var68 * var4;
         int var90 = var42 * var4;

         for (int var102 = 0; var102 < var4; var102++) {
            int var112 = var8 + var102;
            int var123 = var6 + var102;
            var7[var112 + var78] = var5[var123] + var40 * var5[var123 + var4];
            var7[var112 + var90] = var41 * var5[var123 + var61];
         }

         float var44 = var40;
         float var45 = var41;
         float var46 = var40;
         float var47 = var41;

         for (int var103 = 2; var103 < var16; var103++) {
            int var163 = var2 - var103;
            float var48 = var44 * var46 - var45 * var47;
            var47 = var44 * var47 + var45 * var46;
            var46 = var48;
            int var113 = var103 * var4;
            int var124 = var163 * var4;

            for (int var132 = 0; var132 < var4; var132++) {
               int var140 = var8 + var132;
               int var148 = var6 + var132;
               var7[var140 + var78] = var7[var140 + var78] + var46 * var5[var148 + var113];
               var7[var140 + var90] = var7[var140 + var90] + var47 * var5[var148 + var124];
            }
         }
      }

      for (int var69 = 1; var69 < var16; var69++) {
         int var79 = var69 * var4;

         for (int var91 = 0; var91 < var4; var91++) {
            var7[var8 + var91] = var7[var8 + var91] + var5[var6 + var91 + var79];
         }
      }

      if (var1 < var3) {
         for (int var70 = 0; var70 < var1; var70++) {
            for (int var80 = 0; var80 < var3; var80++) {
               int var92 = var80 * var1;
               var5[var6 + var70 + var92 * var2] = var7[var8 + var70 + var92];
            }
         }
      } else {
         for (int var71 = 0; var71 < var3; var71++) {
            int var81 = var71 * var1;
            int var93 = var81 * var2;

            for (int var104 = 0; var104 < var1; var104++) {
               var5[var6 + var104 + var93] = var7[var8 + var104 + var81];
            }
         }
      }

      int var72 = var2 * var1;

      for (int var82 = 1; var82 < var16; var82++) {
         int var164 = var2 - var82;
         int var49 = 2 * var82;
         int var94 = var82 * var3 * var1;
         int var105 = var164 * var3 * var1;
         int var114 = var49 * var1;

         for (int var125 = 0; var125 < var3; var125++) {
            int var133 = var125 * var1;
            int var141 = var133 + var94;
            int var149 = var133 + var105;
            int var154 = var125 * var72;
            var5[var6 + var1 - 1 + var114 - var1 + var154] = var7[var8 + var141];
            var5[var6 + var114 + var154] = var7[var8 + var149];
         }
      }

      if (var1 != 1) {
         if (var17 < var3) {
            for (int var83 = 1; var83 < var16; var83++) {
               int var165 = var2 - var83;
               int var182 = 2 * var83;
               int var95 = var83 * var3 * var1;
               int var106 = var165 * var3 * var1;
               int var115 = var182 * var1;

               for (int var126 = 2; var126 < var1; var126 += 2) {
                  int var50 = var1 - var126;
                  int var134 = var6 + var126;
                  int var142 = var6 + var50;
                  int var150 = var8 + var126;

                  for (int var155 = 0; var155 < var3; var155++) {
                     int var159 = var155 * var72;
                     int var168 = var155 * var1;
                     int var171 = var134 + var115 + var159;
                     int var174 = var142 + var115 - var1 + var159;
                     int var177 = var150 + var168 + var95;
                     int var180 = var150 + var168 + var106;
                     float var51 = var7[var177 - 1];
                     float var52 = var7[var177];
                     float var53 = var7[var180 - 1];
                     float var54 = var7[var180];
                     var5[var171 - 1] = var51 + var53;
                     var5[var174 - 1] = var51 - var53;
                     var5[var171] = var52 + var54;
                     var5[var174] = var54 - var52;
                  }
               }
            }
         } else {
            for (int var84 = 1; var84 < var16; var84++) {
               int var166 = var2 - var84;
               int var183 = 2 * var84;
               int var96 = var84 * var3 * var1;
               int var107 = var166 * var3 * var1;
               int var116 = var183 * var1;

               for (int var127 = 0; var127 < var3; var127++) {
                  int var135 = var127 * var72;
                  int var143 = var127 * var1;

                  for (int var151 = 2; var151 < var1; var151 += 2) {
                     int var184 = var1 - var151;
                     int var156 = var6 + var151;
                     int var160 = var6 + var184;
                     int var169 = var8 + var151;
                     int var172 = var156 + var116 + var135;
                     int var175 = var160 + var116 - var1 + var135;
                     int var178 = var169 + var143 + var96;
                     int var181 = var169 + var143 + var107;
                     float var185 = var7[var178 - 1];
                     float var186 = var7[var178];
                     float var187 = var7[var181 - 1];
                     float var188 = var7[var181];
                     var5[var172 - 1] = var185 + var187;
                     var5[var175 - 1] = var185 - var187;
                     var5[var172] = var186 + var188;
                     var5[var175] = var188 - var186;
                  }
               }
            }
         }
      }
   }

   public void method30993(long var1, long var3, long var5, long var7, Class2378 var9, long var10, Class2378 var12, long var13, long var15) {
      long var19 = var15;
      float var21 = (float) (Math.PI * 2) / (float)var3;
      float var22 = (float)Class9044.method33578((double)var21);
      float var23 = (float)Class9044.method33577((double)var21);
      long var24 = (var3 + 1L) / 2L;
      long var26 = (var1 - 1L) / 2L;
      if (var1 == 1L) {
         Class8133.method28175(var12, var13, var9, var10, var7);
      } else {
         for (long var28 = 0L; var28 < var7; var28++) {
            var12.method9685(var13 + var28, var9.method9651(var10 + var28));
         }

         for (long var96 = 1L; var96 < var3; var96++) {
            long var32 = var96 * var5 * var1;

            for (long var34 = 0L; var34 < var5; var34++) {
               long var36 = var34 * var1 + var32;
               var12.method9685(var13 + var36, var9.method9651(var10 + var36));
            }
         }

         if (var26 > var5) {
            long var103 = -var1;

            for (long var98 = 1L; var98 < var3; var98++) {
               var103 += var1;
               long var105 = var98 * var5 * var1;

               for (long var115 = 0L; var115 < var5; var115++) {
                  long var138 = var103 - 1L;
                  long var127 = var115 * var1 + var105;

                  for (long var139 = 2L; var139 < var1; var139 += 2L) {
                     var138 += 2L;
                     long var149 = var138 + var19;
                     float var158 = this.field38826.method9651(var149 - 1L);
                     float var159 = this.field38826.method9651(var149);
                     long var160 = var13 + var139 + var127;
                     long var169 = var10 + var139 + var127;
                     float var56 = var9.method9651(var169 - 1L);
                     float var57 = var9.method9651(var169);
                     var12.method9685(var160 - 1L, var158 * var56 + var159 * var57);
                     var12.method9685(var160, var158 * var57 - var159 * var56);
                  }
               }
            }
         } else {
            long var30 = -var1;

            for (long var97 = 1L; var97 < var3; var97++) {
               var30 += var1;
               long var38 = var30 - 1L;
               long var104 = var97 * var5 * var1;

               for (long var114 = 2L; var114 < var1; var114 += 2L) {
                  var38 += 2L;
                  long var126 = var38 + var19;
                  long var40 = var10 + var114;
                  long var42 = var13 + var114;
                  float var44 = this.field38826.method9651(var126 - 1L);
                  float var45 = this.field38826.method9651(var126);

                  for (long var46 = 0L; var46 < var5; var46++) {
                     long var48 = var46 * var1 + var104;
                     long var50 = var42 + var48;
                     long var52 = var40 + var48;
                     float var54 = var9.method9651(var52 - 1L);
                     float var55 = var9.method9651(var52);
                     var12.method9685(var50 - 1L, var44 * var54 + var45 * var55);
                     var12.method9685(var50, var44 * var55 - var45 * var54);
                  }
               }
            }
         }

         if (var26 < var5) {
            for (long var99 = 1L; var99 < var24; var99++) {
               long var58 = var3 - var99;
               long var106 = var99 * var5 * var1;
               long var116 = var58 * var5 * var1;

               for (long var128 = 2L; var128 < var1; var128 += 2L) {
                  long var140 = var10 + var128;
                  long var150 = var13 + var128;

                  for (long var161 = 0L; var161 < var5; var161++) {
                     long var170 = var161 * var1 + var106;
                     long var177 = var161 * var1 + var116;
                     long var183 = var140 + var170;
                     long var60 = var140 + var177;
                     long var62 = var150 + var170;
                     long var64 = var150 + var177;
                     float var66 = var12.method9651(var62 - 1L);
                     float var67 = var12.method9651(var62);
                     float var68 = var12.method9651(var64 - 1L);
                     float var69 = var12.method9651(var64);
                     var9.method9685(var183 - 1L, var66 + var68);
                     var9.method9685(var183, var67 + var69);
                     var9.method9685(var60 - 1L, var67 - var69);
                     var9.method9685(var60, var68 - var66);
                  }
               }
            }
         } else {
            for (long var100 = 1L; var100 < var24; var100++) {
               long var191 = var3 - var100;
               long var107 = var100 * var5 * var1;
               long var117 = var191 * var5 * var1;

               for (long var129 = 0L; var129 < var5; var129++) {
                  long var141 = var129 * var1 + var107;
                  long var151 = var129 * var1 + var117;

                  for (long var162 = 2L; var162 < var1; var162 += 2L) {
                     long var171 = var10 + var162;
                     long var178 = var13 + var162;
                     long var184 = var171 + var141;
                     long var197 = var171 + var151;
                     long var201 = var178 + var141;
                     long var204 = var178 + var151;
                     float var207 = var12.method9651(var201 - 1L);
                     float var208 = var12.method9651(var201);
                     float var209 = var12.method9651(var204 - 1L);
                     float var210 = var12.method9651(var204);
                     var9.method9685(var184 - 1L, var207 + var209);
                     var9.method9685(var184, var208 + var210);
                     var9.method9685(var197 - 1L, var208 - var210);
                     var9.method9685(var197, var209 - var207);
                  }
               }
            }
         }
      }

      for (long var101 = 1L; var101 < var24; var101++) {
         long var192 = var3 - var101;
         long var108 = var101 * var5 * var1;
         long var118 = var192 * var5 * var1;

         for (long var130 = 0L; var130 < var5; var130++) {
            long var142 = var130 * var1 + var108;
            long var152 = var130 * var1 + var118;
            long var163 = var13 + var142;
            long var172 = var13 + var152;
            float var189 = var12.method9651(var163);
            float var190 = var12.method9651(var172);
            var9.method9685(var10 + var142, var189 + var190);
            var9.method9685(var10 + var152, var190 - var189);
         }
      }

      float var70 = 1.0F;
      float var71 = 0.0F;
      long var102 = (var3 - 1L) * var7;

      for (long var109 = 1L; var109 < var24; var109++) {
         long var72 = var3 - var109;
         float var74 = var22 * var70 - var23 * var71;
         var71 = var22 * var71 + var23 * var70;
         var70 = var74;
         long var119 = var109 * var7;
         long var131 = var72 * var7;

         for (long var143 = 0L; var143 < var7; var143++) {
            long var153 = var13 + var143;
            long var164 = var10 + var143;
            var12.method9685(var153 + var119, var9.method9651(var164) + var70 * var9.method9651(var164 + var7));
            var12.method9685(var153 + var131, var71 * var9.method9651(var164 + var102));
         }

         float var75 = var70;
         float var76 = var71;
         float var77 = var70;
         float var78 = var71;

         for (long var144 = 2L; var144 < var24; var144++) {
            long var193 = var3 - var144;
            float var79 = var75 * var77 - var76 * var78;
            var78 = var75 * var78 + var76 * var77;
            var77 = var79;
            long var154 = var144 * var7;
            long var165 = var193 * var7;

            for (long var173 = 0L; var173 < var7; var173++) {
               long var179 = var13 + var173;
               long var185 = var10 + var173;
               var12.method9685(var179 + var119, var12.method9651(var179 + var119) + var77 * var9.method9651(var185 + var154));
               var12.method9685(var179 + var131, var12.method9651(var179 + var131) + var78 * var9.method9651(var185 + var165));
            }
         }
      }

      for (long var110 = 1L; var110 < var24; var110++) {
         long var120 = var110 * var7;

         for (long var132 = 0L; var132 < var7; var132++) {
            var12.method9685(var13 + var132, var12.method9651(var13 + var132) + var9.method9651(var10 + var132 + var120));
         }
      }

      if (var1 < var5) {
         for (long var111 = 0L; var111 < var1; var111++) {
            for (long var121 = 0L; var121 < var5; var121++) {
               long var133 = var121 * var1;
               var9.method9685(var10 + var111 + var133 * var3, var12.method9651(var13 + var111 + var133));
            }
         }
      } else {
         for (long var112 = 0L; var112 < var5; var112++) {
            long var122 = var112 * var1;
            long var134 = var122 * var3;

            for (long var145 = 0L; var145 < var1; var145++) {
               var9.method9685(var10 + var145 + var134, var12.method9651(var13 + var145 + var122));
            }
         }
      }

      long var113 = var3 * var1;

      for (long var123 = 1L; var123 < var24; var123++) {
         long var194 = var3 - var123;
         long var80 = 2L * var123;
         long var135 = var123 * var5 * var1;
         long var146 = var194 * var5 * var1;
         long var155 = var80 * var1;

         for (long var166 = 0L; var166 < var5; var166++) {
            long var174 = var166 * var1;
            long var180 = var174 + var135;
            long var186 = var174 + var146;
            long var198 = var166 * var113;
            var9.method9685(var10 + var1 - 1L + var155 - var1 + var198, var12.method9651(var13 + var180));
            var9.method9685(var10 + var155 + var198, var12.method9651(var13 + var186));
         }
      }

      if (var1 != 1L) {
         if (var26 < var5) {
            for (long var124 = 1L; var124 < var24; var124++) {
               long var195 = var3 - var124;
               long var211 = 2L * var124;
               long var136 = var124 * var5 * var1;
               long var147 = var195 * var5 * var1;
               long var156 = var211 * var1;

               for (long var167 = 2L; var167 < var1; var167 += 2L) {
                  long var82 = var1 - var167;
                  long var175 = var10 + var167;
                  long var181 = var10 + var82;
                  long var187 = var13 + var167;

                  for (long var199 = 0L; var199 < var5; var199++) {
                     long var202 = var199 * var113;
                     long var205 = var199 * var1;
                     long var84 = var175 + var156 + var202;
                     long var86 = var181 + var156 - var1 + var202;
                     long var88 = var187 + var205 + var136;
                     long var90 = var187 + var205 + var147;
                     float var92 = var12.method9651(var88 - 1L);
                     float var93 = var12.method9651(var88);
                     float var94 = var12.method9651(var90 - 1L);
                     float var95 = var12.method9651(var90);
                     var9.method9685(var84 - 1L, var92 + var94);
                     var9.method9685(var86 - 1L, var92 - var94);
                     var9.method9685(var84, var93 + var95);
                     var9.method9685(var86, var95 - var93);
                  }
               }
            }
         } else {
            for (long var125 = 1L; var125 < var24; var125++) {
               long var196 = var3 - var125;
               long var212 = 2L * var125;
               long var137 = var125 * var5 * var1;
               long var148 = var196 * var5 * var1;
               long var157 = var212 * var1;

               for (long var168 = 0L; var168 < var5; var168++) {
                  long var176 = var168 * var113;
                  long var182 = var168 * var1;

                  for (long var188 = 2L; var188 < var1; var188 += 2L) {
                     long var213 = var1 - var188;
                     long var200 = var10 + var188;
                     long var203 = var10 + var213;
                     long var206 = var13 + var188;
                     long var214 = var200 + var157 + var176;
                     long var215 = var203 + var157 - var1 + var176;
                     long var216 = var206 + var182 + var137;
                     long var217 = var206 + var182 + var148;
                     float var218 = var12.method9651(var216 - 1L);
                     float var219 = var12.method9651(var216);
                     float var220 = var12.method9651(var217 - 1L);
                     float var221 = var12.method9651(var217);
                     var9.method9685(var214 - 1L, var218 + var220);
                     var9.method9685(var215 - 1L, var218 - var220);
                     var9.method9685(var214, var219 + var221);
                     var9.method9685(var215, var221 - var219);
                  }
               }
            }
         }
      }
   }

   public void method30994(int var1, int var2, int var3, int var4, float[] var5, int var6, float[] var7, int var8, int var9) {
      int var12 = var9;
      float var13 = (float) (Math.PI * 2) / (float)var2;
      float var14 = (float)Class9044.method33578((double)var13);
      float var15 = (float)Class9044.method33577((double)var13);
      int var16 = (var1 - 1) / 2;
      int var17 = (var2 + 1) / 2;
      int var18 = var2 * var1;
      if (var1 < var3) {
         for (int var19 = 0; var19 < var1; var19++) {
            int var20 = var8 + var19;
            int var21 = var6 + var19;

            for (int var22 = 0; var22 < var3; var22++) {
               var7[var20 + var22 * var1] = var5[var21 + var22 * var18];
            }
         }
      } else {
         for (int var56 = 0; var56 < var3; var56++) {
            int var58 = var56 * var1;
            int var63 = var56 * var18;

            for (int var75 = 0; var75 < var1; var75++) {
               var7[var8 + var75 + var58] = var5[var6 + var75 + var63];
            }
         }
      }

      int var57 = var6 + var1 - 1;

      for (int var59 = 1; var59 < var17; var59++) {
         int var25 = var2 - var59;
         int var26 = 2 * var59;
         int var64 = var59 * var3 * var1;
         int var76 = var25 * var3 * var1;
         int var27 = var26 * var1;

         for (int var28 = 0; var28 < var3; var28++) {
            int var29 = var28 * var1;
            int var30 = var29 * var2;
            int var31 = var57 + var27 + var30 - var1;
            int var32 = var6 + var27 + var30;
            float var33 = var5[var31];
            float var34 = var5[var32];
            var7[var8 + var29 + var64] = var33 + var33;
            var7[var8 + var29 + var76] = var34 + var34;
         }
      }

      if (var1 != 1) {
         if (var16 < var3) {
            for (int var60 = 1; var60 < var17; var60++) {
               int var87 = var2 - var60;
               int var65 = var60 * var3 * var1;
               int var77 = var87 * var3 * var1;
               int var93 = 2 * var60 * var1;

               for (int var103 = 2; var103 < var1; var103 += 2) {
                  int var35 = var1 - var103;
                  int var114 = var8 + var103;
                  int var123 = var6 + var35;
                  int var132 = var6 + var103;

                  for (int var140 = 0; var140 < var3; var140++) {
                     int var148 = var140 * var1 + var65;
                     int var156 = var140 * var1 + var77;
                     int var36 = var140 * var2 * var1 + var93;
                     int var37 = var114 + var148;
                     int var38 = var114 + var156;
                     int var39 = var132 + var36;
                     int var40 = var123 + var36 - var1;
                     float var41 = var5[var39 - 1];
                     float var42 = var5[var39];
                     float var43 = var5[var40 - 1];
                     float var44 = var5[var40];
                     var7[var37 - 1] = var41 + var43;
                     var7[var38 - 1] = var41 - var43;
                     var7[var37] = var42 - var44;
                     var7[var38] = var42 + var44;
                  }
               }
            }
         } else {
            for (int var61 = 1; var61 < var17; var61++) {
               int var88 = var2 - var61;
               int var66 = var61 * var3 * var1;
               int var78 = var88 * var3 * var1;
               int var94 = 2 * var61 * var1;

               for (int var104 = 0; var104 < var3; var104++) {
                  int var115 = var104 * var1 + var66;
                  int var124 = var104 * var1 + var78;
                  int var133 = var104 * var2 * var1 + var94;

                  for (int var141 = 2; var141 < var1; var141 += 2) {
                     int var163 = var1 - var141;
                     int var149 = var8 + var141;
                     int var157 = var6 + var163;
                     int var164 = var6 + var141;
                     int var169 = var149 + var115;
                     int var174 = var149 + var124;
                     int var177 = var164 + var133;
                     int var180 = var157 + var133 - var1;
                     float var183 = var5[var177 - 1];
                     float var186 = var5[var177];
                     float var187 = var5[var180 - 1];
                     float var188 = var5[var180];
                     var7[var169 - 1] = var183 + var187;
                     var7[var174 - 1] = var183 - var187;
                     var7[var169] = var186 - var188;
                     var7[var174] = var186 + var188;
                  }
               }
            }
         }
      }

      float var23 = 1.0F;
      float var24 = 0.0F;
      int var62 = (var2 - 1) * var4;

      for (int var67 = 1; var67 < var17; var67++) {
         int var45 = var2 - var67;
         float var46 = var14 * var23 - var15 * var24;
         var24 = var14 * var24 + var15 * var23;
         var23 = var46;
         int var79 = var67 * var4;
         int var95 = var45 * var4;

         for (int var105 = 0; var105 < var4; var105++) {
            int var116 = var6 + var105;
            int var125 = var8 + var105;
            var5[var116 + var79] = var7[var125] + var23 * var7[var125 + var4];
            var5[var116 + var95] = var24 * var7[var125 + var62];
         }

         float var47 = var23;
         float var48 = var24;
         float var49 = var23;
         float var50 = var24;

         for (int var106 = 2; var106 < var17; var106++) {
            int var89 = var2 - var106;
            float var51 = var47 * var49 - var48 * var50;
            var50 = var47 * var50 + var48 * var49;
            var49 = var51;
            int var117 = var106 * var4;
            int var126 = var89 * var4;

            for (int var134 = 0; var134 < var4; var134++) {
               int var142 = var6 + var134;
               int var150 = var8 + var134;
               var5[var142 + var79] = var5[var142 + var79] + var49 * var7[var150 + var117];
               var5[var142 + var95] = var5[var142 + var95] + var50 * var7[var150 + var126];
            }
         }
      }

      for (int var68 = 1; var68 < var17; var68++) {
         int var80 = var68 * var4;

         for (int var96 = 0; var96 < var4; var96++) {
            int var107 = var8 + var96;
            var7[var107] += var7[var107 + var80];
         }
      }

      for (int var69 = 1; var69 < var17; var69++) {
         int var90 = var2 - var69;
         int var81 = var69 * var3 * var1;
         int var97 = var90 * var3 * var1;

         for (int var108 = 0; var108 < var3; var108++) {
            int var118 = var108 * var1;
            int var127 = var8 + var118;
            int var135 = var6 + var118 + var81;
            int var143 = var6 + var118 + var97;
            float var151 = var5[var135];
            float var158 = var5[var143];
            var7[var127 + var81] = var151 - var158;
            var7[var127 + var97] = var151 + var158;
         }
      }

      if (var1 != 1) {
         if (var16 < var3) {
            for (int var70 = 1; var70 < var17; var70++) {
               int var91 = var2 - var70;
               int var82 = var70 * var3 * var1;
               int var98 = var91 * var3 * var1;

               for (int var109 = 2; var109 < var1; var109 += 2) {
                  int var119 = var8 + var109;
                  int var128 = var6 + var109;

                  for (int var136 = 0; var136 < var3; var136++) {
                     int var144 = var136 * var1;
                     int var152 = var119 + var144 + var82;
                     int var159 = var119 + var144 + var98;
                     int var165 = var128 + var144 + var82;
                     int var170 = var128 + var144 + var98;
                     float var175 = var5[var165 - 1];
                     float var178 = var5[var165];
                     float var181 = var5[var170 - 1];
                     float var184 = var5[var170];
                     var7[var152 - 1] = var175 - var184;
                     var7[var159 - 1] = var175 + var184;
                     var7[var152] = var178 + var181;
                     var7[var159] = var178 - var181;
                  }
               }
            }
         } else {
            for (int var71 = 1; var71 < var17; var71++) {
               int var92 = var2 - var71;
               int var83 = var71 * var3 * var1;
               int var99 = var92 * var3 * var1;

               for (int var110 = 0; var110 < var3; var110++) {
                  int var120 = var110 * var1;

                  for (int var129 = 2; var129 < var1; var129 += 2) {
                     int var137 = var8 + var129;
                     int var145 = var6 + var129;
                     int var153 = var137 + var120 + var83;
                     int var160 = var137 + var120 + var99;
                     int var166 = var145 + var120 + var83;
                     int var171 = var145 + var120 + var99;
                     float var176 = var5[var166 - 1];
                     float var179 = var5[var166];
                     float var182 = var5[var171 - 1];
                     float var185 = var5[var171];
                     var7[var153 - 1] = var176 - var185;
                     var7[var160 - 1] = var176 + var185;
                     var7[var153] = var179 + var182;
                     var7[var160] = var179 - var182;
                  }
               }
            }
         }

         System.arraycopy(var7, var8, var5, var6, var4);

         for (int var72 = 1; var72 < var2; var72++) {
            int var84 = var72 * var3 * var1;

            for (int var100 = 0; var100 < var3; var100++) {
               int var111 = var100 * var1 + var84;
               var5[var6 + var111] = var7[var8 + var111];
            }
         }

         if (var16 > var3) {
            int var52 = -var1;

            for (int var73 = 1; var73 < var2; var73++) {
               var52 += var1;
               int var85 = var73 * var3 * var1;

               for (int var101 = 0; var101 < var3; var101++) {
                  int var53 = var52 - 1;
                  int var112 = var101 * var1 + var85;

                  for (int var121 = 2; var121 < var1; var121 += 2) {
                     var53 += 2;
                     int var130 = var53 + var12;
                     float var54 = this.field38825[var130 - 1];
                     float var55 = this.field38825[var130];
                     int var138 = var6 + var121;
                     int var146 = var8 + var121;
                     int var154 = var138 + var112;
                     int var161 = var146 + var112;
                     float var167 = var7[var161 - 1];
                     float var172 = var7[var161];
                     var5[var154 - 1] = var54 * var167 - var55 * var172;
                     var5[var154] = var54 * var172 + var55 * var167;
                  }
               }
            }
         } else {
            int var189 = -var1;

            for (int var74 = 1; var74 < var2; var74++) {
               var189 += var1;
               int var190 = var189 - 1;
               int var86 = var74 * var3 * var1;

               for (int var102 = 2; var102 < var1; var102 += 2) {
                  var190 += 2;
                  int var113 = var190 + var12;
                  float var191 = this.field38825[var113 - 1];
                  float var192 = this.field38825[var113];
                  int var122 = var6 + var102;
                  int var131 = var8 + var102;

                  for (int var139 = 0; var139 < var3; var139++) {
                     int var147 = var139 * var1 + var86;
                     int var155 = var122 + var147;
                     int var162 = var131 + var147;
                     float var168 = var7[var162 - 1];
                     float var173 = var7[var162];
                     var5[var155 - 1] = var191 * var168 - var192 * var173;
                     var5[var155] = var191 * var173 + var192 * var168;
                  }
               }
            }
         }
      }
   }

   public void method30995(long var1, long var3, long var5, long var7, Class2378 var9, long var10, Class2378 var12, long var13, long var15) {
      long var19 = var15;
      float var21 = (float) (Math.PI * 2) / (float)var3;
      float var22 = (float)Class9044.method33578((double)var21);
      float var23 = (float)Class9044.method33577((double)var21);
      long var24 = (var1 - 1L) / 2L;
      long var26 = (var3 + 1L) / 2L;
      long var28 = var3 * var1;
      if (var1 < var5) {
         for (long var30 = 0L; var30 < var1; var30++) {
            long var32 = var13 + var30;
            long var34 = var10 + var30;

            for (long var36 = 0L; var36 < var5; var36++) {
               var12.method9685(var32 + var36 * var1, var9.method9651(var34 + var36 * var28));
            }
         }
      } else {
         for (long var98 = 0L; var98 < var5; var98++) {
            long var100 = var98 * var1;
            long var105 = var98 * var28;

            for (long var117 = 0L; var117 < var1; var117++) {
               var12.method9685(var13 + var117 + var100, var9.method9651(var10 + var117 + var105));
            }
         }
      }

      long var99 = var10 + var1 - 1L;

      for (long var101 = 1L; var101 < var26; var101++) {
         long var40 = var3 - var101;
         long var42 = 2L * var101;
         long var106 = var101 * var5 * var1;
         long var118 = var40 * var5 * var1;
         long var44 = var42 * var1;

         for (long var46 = 0L; var46 < var5; var46++) {
            long var48 = var46 * var1;
            long var50 = var48 * var3;
            long var52 = var99 + var44 + var50 - var1;
            long var54 = var10 + var44 + var50;
            float var56 = var9.method9651(var52);
            float var57 = var9.method9651(var54);
            var12.method9685(var13 + var48 + var106, var56 + var56);
            var12.method9685(var13 + var48 + var118, var57 + var57);
         }
      }

      if (var1 != 1L) {
         if (var24 < var5) {
            for (long var102 = 1L; var102 < var26; var102++) {
               long var129 = var3 - var102;
               long var107 = var102 * var5 * var1;
               long var119 = var129 * var5 * var1;
               long var135 = 2L * var102 * var1;

               for (long var145 = 2L; var145 < var1; var145 += 2L) {
                  long var58 = var1 - var145;
                  long var156 = var13 + var145;
                  long var165 = var10 + var58;
                  long var174 = var10 + var145;

                  for (long var182 = 0L; var182 < var5; var182++) {
                     long var60 = var182 * var1 + var107;
                     long var62 = var182 * var1 + var119;
                     long var64 = var182 * var3 * var1 + var135;
                     long var66 = var156 + var60;
                     long var68 = var156 + var62;
                     long var70 = var174 + var64;
                     long var72 = var165 + var64 - var1;
                     float var74 = var9.method9651(var70 - 1L);
                     float var75 = var9.method9651(var70);
                     float var76 = var9.method9651(var72 - 1L);
                     float var77 = var9.method9651(var72);
                     var12.method9685(var66 - 1L, var74 + var76);
                     var12.method9685(var68 - 1L, var74 - var76);
                     var12.method9685(var66, var75 - var77);
                     var12.method9685(var68, var75 + var77);
                  }
               }
            }
         } else {
            for (long var103 = 1L; var103 < var26; var103++) {
               long var130 = var3 - var103;
               long var108 = var103 * var5 * var1;
               long var120 = var130 * var5 * var1;
               long var136 = 2L * var103 * var1;

               for (long var146 = 0L; var146 < var5; var146++) {
                  long var157 = var146 * var1 + var108;
                  long var166 = var146 * var1 + var120;
                  long var175 = var146 * var3 * var1 + var136;

                  for (long var183 = 2L; var183 < var1; var183 += 2L) {
                     long var192 = var1 - var183;
                     long var193 = var13 + var183;
                     long var199 = var10 + var192;
                     long var204 = var10 + var183;
                     long var207 = var193 + var157;
                     long var210 = var193 + var166;
                     long var211 = var204 + var175;
                     long var212 = var199 + var175 - var1;
                     float var213 = var9.method9651(var211 - 1L);
                     float var214 = var9.method9651(var211);
                     float var215 = var9.method9651(var212 - 1L);
                     float var216 = var9.method9651(var212);
                     var12.method9685(var207 - 1L, var213 + var215);
                     var12.method9685(var210 - 1L, var213 - var215);
                     var12.method9685(var207, var214 - var216);
                     var12.method9685(var210, var214 + var216);
                  }
               }
            }
         }
      }

      float var38 = 1.0F;
      float var39 = 0.0F;
      long var104 = (var3 - 1L) * var7;

      for (long var109 = 1L; var109 < var26; var109++) {
         long var78 = var3 - var109;
         float var80 = var22 * var38 - var23 * var39;
         var39 = var22 * var39 + var23 * var38;
         var38 = var80;
         long var121 = var109 * var7;
         long var137 = var78 * var7;

         for (long var147 = 0L; var147 < var7; var147++) {
            long var158 = var10 + var147;
            long var167 = var13 + var147;
            var9.method9685(var158 + var121, var12.method9651(var167) + var38 * var12.method9651(var167 + var7));
            var9.method9685(var158 + var137, var39 * var12.method9651(var167 + var104));
         }

         float var81 = var38;
         float var82 = var39;
         float var83 = var38;
         float var84 = var39;

         for (long var148 = 2L; var148 < var26; var148++) {
            long var131 = var3 - var148;
            float var85 = var81 * var83 - var82 * var84;
            var84 = var81 * var84 + var82 * var83;
            var83 = var85;
            long var159 = var148 * var7;
            long var168 = var131 * var7;

            for (long var176 = 0L; var176 < var7; var176++) {
               long var184 = var10 + var176;
               long var194 = var13 + var176;
               var9.method9685(var184 + var121, var9.method9651(var184 + var121) + var83 * var12.method9651(var194 + var159));
               var9.method9685(var184 + var137, var9.method9651(var184 + var137) + var84 * var12.method9651(var194 + var168));
            }
         }
      }

      for (long var110 = 1L; var110 < var26; var110++) {
         long var122 = var110 * var7;

         for (long var138 = 0L; var138 < var7; var138++) {
            long var149 = var13 + var138;
            var12.method9685(var149, var12.method9651(var149) + var12.method9651(var149 + var122));
         }
      }

      for (long var111 = 1L; var111 < var26; var111++) {
         long var132 = var3 - var111;
         long var123 = var111 * var5 * var1;
         long var139 = var132 * var5 * var1;

         for (long var150 = 0L; var150 < var5; var150++) {
            long var160 = var150 * var1;
            long var169 = var13 + var160;
            long var177 = var10 + var160 + var123;
            long var185 = var10 + var160 + var139;
            float var190 = var9.method9651(var177);
            float var191 = var9.method9651(var185);
            var12.method9685(var169 + var123, var190 - var191);
            var12.method9685(var169 + var139, var190 + var191);
         }
      }

      if (var1 != 1L) {
         if (var24 < var5) {
            for (long var112 = 1L; var112 < var26; var112++) {
               long var133 = var3 - var112;
               long var124 = var112 * var5 * var1;
               long var140 = var133 * var5 * var1;

               for (long var151 = 2L; var151 < var1; var151 += 2L) {
                  long var161 = var13 + var151;
                  long var170 = var10 + var151;

                  for (long var178 = 0L; var178 < var5; var178++) {
                     long var186 = var178 * var1;
                     long var195 = var161 + var186 + var124;
                     long var200 = var161 + var186 + var140;
                     long var205 = var170 + var186 + var124;
                     long var208 = var170 + var186 + var140;
                     float var86 = var9.method9651(var205 - 1L);
                     float var87 = var9.method9651(var205);
                     float var88 = var9.method9651(var208 - 1L);
                     float var89 = var9.method9651(var208);
                     var12.method9685(var195 - 1L, var86 - var89);
                     var12.method9685(var200 - 1L, var86 + var89);
                     var12.method9685(var195, var87 + var88);
                     var12.method9685(var200, var87 - var88);
                  }
               }
            }
         } else {
            for (long var113 = 1L; var113 < var26; var113++) {
               long var134 = var3 - var113;
               long var125 = var113 * var5 * var1;
               long var141 = var134 * var5 * var1;

               for (long var152 = 0L; var152 < var5; var152++) {
                  long var162 = var152 * var1;

                  for (long var171 = 2L; var171 < var1; var171 += 2L) {
                     long var179 = var13 + var171;
                     long var187 = var10 + var171;
                     long var196 = var179 + var162 + var125;
                     long var201 = var179 + var162 + var141;
                     long var206 = var187 + var162 + var125;
                     long var209 = var187 + var162 + var141;
                     float var217 = var9.method9651(var206 - 1L);
                     float var218 = var9.method9651(var206);
                     float var219 = var9.method9651(var209 - 1L);
                     float var220 = var9.method9651(var209);
                     var12.method9685(var196 - 1L, var217 - var220);
                     var12.method9685(var201 - 1L, var217 + var220);
                     var12.method9685(var196, var218 + var219);
                     var12.method9685(var201, var218 - var219);
                  }
               }
            }
         }

         Class8133.method28175(var12, var13, var9, var10, var7);

         for (long var114 = 1L; var114 < var3; var114++) {
            long var126 = var114 * var5 * var1;

            for (long var142 = 0L; var142 < var5; var142++) {
               long var153 = var142 * var1 + var126;
               var9.method9685(var10 + var153, var12.method9651(var13 + var153));
            }
         }

         if (var24 > var5) {
            long var90 = -var1;

            for (long var115 = 1L; var115 < var3; var115++) {
               var90 += var1;
               long var127 = var115 * var5 * var1;

               for (long var143 = 0L; var143 < var5; var143++) {
                  long var92 = var90 - 1L;
                  long var154 = var143 * var1 + var127;

                  for (long var163 = 2L; var163 < var1; var163 += 2L) {
                     var92 += 2L;
                     long var172 = var92 + var19;
                     float var94 = this.field38826.method9651(var172 - 1L);
                     float var95 = this.field38826.method9651(var172);
                     long var180 = var10 + var163;
                     long var188 = var13 + var163;
                     long var197 = var180 + var154;
                     long var202 = var188 + var154;
                     float var96 = var12.method9651(var202 - 1L);
                     float var97 = var12.method9651(var202);
                     var9.method9685(var197 - 1L, var94 * var96 - var95 * var97);
                     var9.method9685(var197, var94 * var97 + var95 * var96);
                  }
               }
            }
         } else {
            long var221 = -var1;

            for (long var116 = 1L; var116 < var3; var116++) {
               var221 += var1;
               long var222 = var221 - 1L;
               long var128 = var116 * var5 * var1;

               for (long var144 = 2L; var144 < var1; var144 += 2L) {
                  var222 += 2L;
                  long var155 = var222 + var19;
                  float var223 = this.field38826.method9651(var155 - 1L);
                  float var224 = this.field38826.method9651(var155);
                  long var164 = var10 + var144;
                  long var173 = var13 + var144;

                  for (long var181 = 0L; var181 < var5; var181++) {
                     long var189 = var181 * var1 + var128;
                     long var198 = var164 + var189;
                     long var203 = var173 + var189;
                     float var225 = var12.method9651(var203 - 1L);
                     float var226 = var12.method9651(var203);
                     var9.method9685(var198 - 1L, var223 * var225 - var224 * var226);
                     var9.method9685(var198, var223 * var226 + var224 * var225);
                  }
               }
            }
         }
      }
   }

   public void method30996(float[] var1, int var2, int var3) {
      int[] var6 = new int[1];
      int var7 = 2 * this.field38811;
      float[] var8 = new float[var7];
      int var10 = 4 * this.field38811;
      var6[0] = 0;
      int var11 = (int)this.field38823[1 + var10];
      int var12 = 0;
      int var13 = 1;
      int var14 = var7;

      for (int var15 = 2; var15 <= var11 + 1; var15++) {
         int var16 = (int)this.field38823[var15 + var10];
         int var17 = var16 * var13;
         int var18 = this.field38811 / var17;
         int var19 = var18 + var18;
         int var20 = var19 * var13;
         switch (var16) {
            case 2:
               if (var12 == 0) {
                  this.method30998(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method30998(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            case 3:
               if (var12 == 0) {
                  this.method31000(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method31000(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            case 4:
               if (var12 == 0) {
                  this.method31002(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method31002(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            case 5:
               if (var12 == 0) {
                  this.method31004(var19, var13, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method31004(var19, var13, var8, 0, var1, var2, var14, var3);
               }

               var12 = 1 - var12;
               break;
            default:
               if (var12 == 0) {
                  this.method31006(var6, var19, var16, var13, var20, var1, var2, var8, 0, var14, var3);
               } else {
                  this.method31006(var6, var19, var16, var13, var20, var8, 0, var1, var2, var14, var3);
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

   public void method30997(Class2378 var1, long var2, int var4) {
      int[] var7 = new int[1];
      long var8 = 2L * this.field38812;
      Class2378 var10 = new Class2378(var8);
      long var13 = 4L * this.field38812;
      var7[0] = 0;
      long var15 = (long)this.field38824.method9651(1L + var13);
      long var17 = 0L;
      long var19 = 1L;
      long var21 = var8;

      for (long var23 = 2L; var23 <= var15 + 1L; var23++) {
         int var25 = (int)this.field38824.method9651(var23 + var13);
         long var26 = (long)var25 * var19;
         long var28 = this.field38812 / var26;
         long var30 = var28 + var28;
         long var32 = var30 * var19;
         switch (var25) {
            case 2:
               if (var17 == 0L) {
                  this.method30999(var30, var19, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method30999(var30, var19, var10, 0L, var1, var2, var21, (long)var4);
               }

               var17 = 1L - var17;
               break;
            case 3:
               if (var17 == 0L) {
                  this.method31001(var30, var19, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method31001(var30, var19, var10, 0L, var1, var2, var21, (long)var4);
               }

               var17 = 1L - var17;
               break;
            case 4:
               if (var17 == 0L) {
                  this.method31003(var30, var19, var1, var2, var10, 0L, var21, var4);
               } else {
                  this.method31003(var30, var19, var10, 0L, var1, var2, var21, var4);
               }

               var17 = 1L - var17;
               break;
            case 5:
               if (var17 == 0L) {
                  this.method31005(var30, var19, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method31005(var30, var19, var10, 0L, var1, var2, var21, (long)var4);
               }

               var17 = 1L - var17;
               break;
            default:
               if (var17 == 0L) {
                  this.method31007(var7, var30, (long)var25, var19, var32, var1, var2, var10, 0L, var21, (long)var4);
               } else {
                  this.method31007(var7, var30, (long)var25, var19, var32, var10, 0L, var1, var2, var21, (long)var4);
               }

               if (var7[0] != 0) {
                  var17 = 1L - var17;
               }
         }

         var19 = var26;
         var21 += (long)(var25 - 1) * var30;
      }

      if (var17 != 0L) {
         Class8133.method28175(var10, 0L, var1, var2, var8);
      }
   }

   public void method30998(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7, int var8) {
      int var11 = var7;
      int var12 = var1 * var2;
      if (var1 > 2) {
         for (int var13 = 0; var13 < var2; var13++) {
            for (int var14 = 0; var14 < var1 - 1; var14 += 2) {
               int var15 = var13 * var1;
               int var16 = var4 + var14 + 2 * var15;
               int var17 = var16 + var1;
               float var18 = var3[var16];
               float var19 = var3[var16 + 1];
               float var20 = var3[var17];
               float var21 = var3[var17 + 1];
               int var22 = var14 + var11;
               float var23 = this.field38823[var22];
               float var24 = (float)var8 * this.field38823[var22 + 1];
               float var25 = var18 - var20;
               float var26 = var19 - var21;
               int var27 = var6 + var14 + var15;
               int var28 = var27 + var12;
               var5[var27] = var18 + var20;
               var5[var27 + 1] = var19 + var21;
               var5[var28] = var23 * var25 - var24 * var26;
               var5[var28 + 1] = var23 * var26 + var24 * var25;
            }
         }
      } else {
         for (int var29 = 0; var29 < var2; var29++) {
            int var30 = var29 * var1;
            int var31 = var4 + 2 * var30;
            int var32 = var31 + var1;
            float var33 = var3[var31];
            float var34 = var3[var31 + 1];
            float var35 = var3[var32];
            float var36 = var3[var32 + 1];
            int var37 = var6 + var30;
            int var38 = var37 + var12;
            var5[var37] = var33 + var35;
            var5[var37 + 1] = var34 + var36;
            var5[var38] = var33 - var35;
            var5[var38 + 1] = var34 - var36;
         }
      }
   }

   public void method30999(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11, long var13) {
      long var17 = var11;
      long var19 = var1 * var3;
      if (var1 > 2L) {
         for (long var21 = 0L; var21 < var3; var21++) {
            for (long var23 = 0L; var23 < var1 - 1L; var23 += 2L) {
               long var25 = var21 * var1;
               long var27 = var6 + var23 + 2L * var25;
               long var37 = var27 + var1;
               float var31 = var5.method9651(var27);
               float var32 = var5.method9651(var27 + 1L);
               float var39 = var5.method9651(var37);
               float var40 = var5.method9651(var37 + 1L);
               long var35 = var23 + var17;
               float var41 = this.field38824.method9651(var35);
               float var42 = (float)var13 * this.field38824.method9651(var35 + 1L);
               float var43 = var31 - var39;
               float var44 = var32 - var40;
               long var45 = var9 + var23 + var25;
               long var47 = var45 + var19;
               var8.method9685(var45, var31 + var39);
               var8.method9685(var45 + 1L, var32 + var40);
               var8.method9685(var47, var41 * var43 - var42 * var44);
               var8.method9685(var47 + 1L, var41 * var44 + var42 * var43);
            }
         }
      } else {
         for (long var49 = 0L; var49 < var3; var49++) {
            long var50 = var49 * var1;
            long var51 = var6 + 2L * var50;
            long var52 = var51 + var1;
            float var29 = var5.method9651(var51);
            float var30 = var5.method9651(var51 + 1L);
            float var53 = var5.method9651(var52);
            float var54 = var5.method9651(var52 + 1L);
            long var33 = var9 + var50;
            long var55 = var33 + var19;
            var8.method9685(var33, var29 + var53);
            var8.method9685(var33 + 1L, var30 + var54);
            var8.method9685(var55, var29 - var53);
            var8.method9685(var55 + 1L, var30 - var54);
         }
      }
   }

   public void method31000(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7, int var8) {
      float var11 = -0.5F;
      float var12 = 0.8660254F;
      int var13 = var7;
      int var14 = var7 + var1;
      int var15 = var2 * var1;
      if (var1 != 2) {
         for (int var16 = 1; var16 <= var2; var16++) {
            int var17 = var4 + (3 * var16 - 2) * var1;
            int var18 = var6 + (var16 - 1) * var1;

            for (int var19 = 0; var19 < var1 - 1; var19 += 2) {
               int var20 = var19 + var17;
               int var21 = var20 + var1;
               int var22 = var20 - var1;
               float var23 = var3[var20];
               float var24 = var3[var20 + 1];
               float var25 = var3[var21];
               float var32 = var3[var21 + 1];
               float var33 = var3[var22];
               float var34 = var3[var22 + 1];
               float var26 = var23 + var25;
               float var27 = var33 + -0.5F * var26;
               float var28 = var24 + var32;
               float var29 = var34 + -0.5F * var28;
               float var30 = (float)var8 * 0.8660254F * (var23 - var25);
               float var31 = (float)var8 * 0.8660254F * (var24 - var32);
               float var35 = var27 - var31;
               float var36 = var27 + var31;
               float var37 = var29 + var30;
               float var38 = var29 - var30;
               int var39 = var19 + var13;
               int var40 = var19 + var14;
               float var41 = this.field38823[var39];
               float var42 = (float)var8 * this.field38823[var39 + 1];
               float var43 = this.field38823[var40];
               float var44 = (float)var8 * this.field38823[var40 + 1];
               int var45 = var19 + var18;
               int var46 = var45 + var15;
               int var47 = var46 + var15;
               var5[var45] = var33 + var26;
               var5[var45 + 1] = var34 + var28;
               var5[var46] = var41 * var35 - var42 * var37;
               var5[var46 + 1] = var41 * var37 + var42 * var35;
               var5[var47] = var43 * var36 - var44 * var38;
               var5[var47 + 1] = var43 * var38 + var44 * var36;
            }
         }
      } else {
         for (int var48 = 1; var48 <= var2; var48++) {
            int var49 = var4 + (3 * var48 - 2) * var1;
            int var50 = var49 + var1;
            int var51 = var49 - var1;
            float var52 = var3[var49];
            float var53 = var3[var49 + 1];
            float var54 = var3[var50];
            float var55 = var3[var50 + 1];
            float var56 = var3[var51];
            float var57 = var3[var51 + 1];
            float var58 = var52 + var54;
            float var59 = var56 + -0.5F * var58;
            float var60 = var53 + var55;
            float var61 = var57 + -0.5F * var60;
            float var62 = (float)var8 * 0.8660254F * (var52 - var54);
            float var63 = (float)var8 * 0.8660254F * (var53 - var55);
            int var64 = var6 + (var48 - 1) * var1;
            int var65 = var64 + var15;
            int var66 = var65 + var15;
            var5[var64] = var3[var51] + var58;
            var5[var64 + 1] = var57 + var60;
            var5[var65] = var59 - var63;
            var5[var65 + 1] = var61 + var62;
            var5[var66] = var59 + var63;
            var5[var66 + 1] = var61 - var62;
         }
      }
   }

   public void method31001(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11, long var13) {
      float var17 = -0.5F;
      float var18 = 0.8660254F;
      long var19 = var11;
      long var21 = var11 + var1;
      long var23 = var3 * var1;
      if (var1 != 2L) {
         for (long var25 = 1L; var25 <= var3; var25++) {
            long var27 = var6 + (3L * var25 - 2L) * var1;
            long var29 = var9 + (var25 - 1L) * var1;

            for (long var31 = 0L; var31 < var1 - 1L; var31 += 2L) {
               long var51 = var31 + var27;
               long var53 = var51 + var1;
               long var55 = var51 - var1;
               float var57 = var5.method9651(var51);
               float var58 = var5.method9651(var51 + 1L);
               float var59 = var5.method9651(var53);
               float var60 = var5.method9651(var53 + 1L);
               float var61 = var5.method9651(var55);
               float var62 = var5.method9651(var55 + 1L);
               float var39 = var57 + var59;
               float var40 = var61 + -0.5F * var39;
               float var41 = var58 + var60;
               float var42 = var62 + -0.5F * var41;
               float var43 = (float)var13 * 0.8660254F * (var57 - var59);
               float var44 = (float)var13 * 0.8660254F * (var58 - var60);
               float var63 = var40 - var44;
               float var64 = var40 + var44;
               float var65 = var42 + var43;
               float var66 = var42 - var43;
               long var67 = var31 + var19;
               long var69 = var31 + var21;
               float var71 = this.field38824.method9651(var67);
               float var72 = (float)var13 * this.field38824.method9651(var67 + 1L);
               float var73 = this.field38824.method9651(var69);
               float var74 = (float)var13 * this.field38824.method9651(var69 + 1L);
               long var75 = var31 + var29;
               long var77 = var75 + var23;
               long var79 = var77 + var23;
               var8.method9685(var75, var61 + var39);
               var8.method9685(var75 + 1L, var62 + var41);
               var8.method9685(var77, var71 * var63 - var72 * var65);
               var8.method9685(var77 + 1L, var71 * var65 + var72 * var63);
               var8.method9685(var79, var73 * var64 - var74 * var66);
               var8.method9685(var79 + 1L, var73 * var66 + var74 * var64);
            }
         }
      } else {
         for (long var81 = 1L; var81 <= var3; var81++) {
            long var82 = var6 + (3L * var81 - 2L) * var1;
            long var83 = var82 + var1;
            long var84 = var82 - var1;
            float var33 = var5.method9651(var82);
            float var34 = var5.method9651(var82 + 1L);
            float var35 = var5.method9651(var83);
            float var36 = var5.method9651(var83 + 1L);
            float var37 = var5.method9651(var84);
            float var38 = var5.method9651(var84 + 1L);
            float var85 = var33 + var35;
            float var86 = var37 + -0.5F * var85;
            float var87 = var34 + var36;
            float var88 = var38 + -0.5F * var87;
            float var89 = (float)var13 * 0.8660254F * (var33 - var35);
            float var90 = (float)var13 * 0.8660254F * (var34 - var36);
            long var45 = var9 + (var81 - 1L) * var1;
            long var47 = var45 + var23;
            long var49 = var47 + var23;
            var8.method9685(var45, var5.method9651(var84) + var85);
            var8.method9685(var45 + 1L, var38 + var87);
            var8.method9685(var47, var86 - var90);
            var8.method9685(var47 + 1L, var88 + var89);
            var8.method9685(var49, var86 + var90);
            var8.method9685(var49 + 1L, var88 - var89);
         }
      }
   }

   public void method31002(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7, int var8) {
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
               int var21 = var20 + var1;
               int var22 = var21 + var1;
               float var23 = var3[var19 - 1];
               float var24 = var3[var19];
               float var25 = var3[var20 - 1];
               float var26 = var3[var20];
               float var27 = var3[var21 - 1];
               float var28 = var3[var21];
               float var37 = var3[var22 - 1];
               float var38 = var3[var22];
               float var29 = var24 - var28;
               float var30 = var24 + var28;
               float var32 = var26 + var38;
               float var31 = var38 - var26;
               float var33 = var23 - var27;
               float var34 = var23 + var27;
               float var35 = var25 - var37;
               float var36 = var25 + var37;
               float var41 = var34 - var36;
               float var42 = var30 - var32;
               float var43 = var33 + (float)var8 * var31;
               float var44 = var33 - (float)var8 * var31;
               float var45 = var29 + (float)var8 * var35;
               float var46 = var29 - (float)var8 * var35;
               int var39 = var18 + var11;
               int var40 = var18 + var12;
               int var47 = var18 + var13;
               float var48 = this.field38823[var39];
               float var49 = (float)var8 * this.field38823[var39 + 1];
               float var50 = this.field38823[var40];
               float var51 = (float)var8 * this.field38823[var40 + 1];
               float var52 = this.field38823[var47];
               float var53 = (float)var8 * this.field38823[var47 + 1];
               int var54 = var6 + var18 + var16;
               int var55 = var54 + var14;
               int var56 = var55 + var14;
               int var57 = var56 + var14;
               var5[var54] = var34 + var36;
               var5[var54 + 1] = var30 + var32;
               var5[var55] = var48 * var43 - var49 * var45;
               var5[var55 + 1] = var48 * var45 + var49 * var43;
               var5[var56] = var50 * var41 - var51 * var42;
               var5[var56 + 1] = var50 * var42 + var51 * var41;
               var5[var57] = var52 * var44 - var53 * var46;
               var5[var57 + 1] = var52 * var46 + var53 * var44;
            }
         }
      } else {
         for (int var58 = 0; var58 < var2; var58++) {
            int var59 = var58 * var1;
            int var60 = var4 + 4 * var59 + 1;
            int var61 = var60 + var1;
            int var62 = var61 + var1;
            int var63 = var62 + var1;
            float var64 = var3[var60 - 1];
            float var65 = var3[var60];
            float var66 = var3[var61 - 1];
            float var67 = var3[var61];
            float var68 = var3[var62 - 1];
            float var69 = var3[var62];
            float var70 = var3[var63 - 1];
            float var71 = var3[var63];
            float var72 = var65 - var69;
            float var73 = var65 + var69;
            float var74 = var71 - var67;
            float var75 = var67 + var71;
            float var76 = var64 - var68;
            float var77 = var64 + var68;
            float var78 = var66 - var70;
            float var79 = var66 + var70;
            int var80 = var6 + var59;
            int var81 = var80 + var14;
            int var82 = var81 + var14;
            int var83 = var82 + var14;
            var5[var80] = var77 + var79;
            var5[var80 + 1] = var73 + var75;
            var5[var81] = var76 + (float)var8 * var74;
            var5[var81 + 1] = var72 + (float)var8 * var78;
            var5[var82] = var77 - var79;
            var5[var82 + 1] = var73 - var75;
            var5[var83] = var76 - (float)var8 * var74;
            var5[var83 + 1] = var72 - (float)var8 * var78;
         }
      }
   }

   public void method31003(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11, int var13) {
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
               long var60 = var34 + var1;
               long var62 = var60 + var1;
               float var40 = var5.method9651(var32 - 1L);
               float var41 = var5.method9651(var32);
               float var42 = var5.method9651(var34 - 1L);
               float var43 = var5.method9651(var34);
               float var64 = var5.method9651(var60 - 1L);
               float var65 = var5.method9651(var60);
               float var66 = var5.method9651(var62 - 1L);
               float var67 = var5.method9651(var62);
               float var44 = var41 - var65;
               float var45 = var41 + var65;
               float var47 = var43 + var67;
               float var46 = var67 - var43;
               float var48 = var40 - var64;
               float var49 = var40 + var64;
               float var50 = var42 - var66;
               float var51 = var42 + var66;
               float var68 = var49 - var51;
               float var69 = var45 - var47;
               float var70 = var48 + (float)var13 * var46;
               float var71 = var48 - (float)var13 * var46;
               float var72 = var44 + (float)var13 * var50;
               float var73 = var44 - (float)var13 * var50;
               long var56 = var30 + var16;
               long var58 = var30 + var18;
               long var74 = var30 + var20;
               float var76 = this.field38824.method9651(var56);
               float var77 = (float)var13 * this.field38824.method9651(var56 + 1L);
               float var78 = this.field38824.method9651(var58);
               float var79 = (float)var13 * this.field38824.method9651(var58 + 1L);
               float var80 = this.field38824.method9651(var74);
               float var81 = (float)var13 * this.field38824.method9651(var74 + 1L);
               long var82 = var9 + var30 + var26;
               long var84 = var82 + var22;
               long var86 = var84 + var22;
               long var88 = var86 + var22;
               var8.method9685(var82, var49 + var51);
               var8.method9685(var82 + 1L, var45 + var47);
               var8.method9685(var84, var76 * var70 - var77 * var72);
               var8.method9685(var84 + 1L, var76 * var72 + var77 * var70);
               var8.method9685(var86, var78 * var68 - var79 * var69);
               var8.method9685(var86 + 1L, var78 * var69 + var79 * var68);
               var8.method9685(var88, var80 * var71 - var81 * var73);
               var8.method9685(var88 + 1L, var80 * var73 + var81 * var71);
            }
         }
      } else {
         for (long var90 = 0L; var90 < var3; var90++) {
            long var91 = var90 * var1;
            long var92 = var6 + 4L * var91 + 1L;
            long var93 = var92 + var1;
            long var94 = var93 + var1;
            long var95 = var94 + var1;
            float var36 = var5.method9651(var92 - 1L);
            float var37 = var5.method9651(var92);
            float var38 = var5.method9651(var93 - 1L);
            float var39 = var5.method9651(var93);
            float var96 = var5.method9651(var94 - 1L);
            float var97 = var5.method9651(var94);
            float var98 = var5.method9651(var95 - 1L);
            float var99 = var5.method9651(var95);
            float var100 = var37 - var97;
            float var101 = var37 + var97;
            float var102 = var99 - var39;
            float var103 = var39 + var99;
            float var104 = var36 - var96;
            float var105 = var36 + var96;
            float var106 = var38 - var98;
            float var107 = var38 + var98;
            long var52 = var9 + var91;
            long var54 = var52 + var22;
            long var108 = var54 + var22;
            long var109 = var108 + var22;
            var8.method9685(var52, var105 + var107);
            var8.method9685(var52 + 1L, var101 + var103);
            var8.method9685(var54, var104 + (float)var13 * var102);
            var8.method9685(var54 + 1L, var100 + (float)var13 * var106);
            var8.method9685(var108, var105 - var107);
            var8.method9685(var108 + 1L, var101 - var103);
            var8.method9685(var109, var104 - (float)var13 * var102);
            var8.method9685(var109 + 1L, var100 - (float)var13 * var106);
         }
      }
   }

   public void method31004(int var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7, int var8) {
      float var11 = 0.309017F;
      float var12 = 0.95105654F;
      float var13 = -0.809017F;
      float var14 = 0.58778524F;
      int var15 = var7;
      int var16 = var7 + var1;
      int var17 = var16 + var1;
      int var18 = var17 + var1;
      int var19 = var2 * var1;
      if (var1 != 2) {
         for (int var20 = 1; var20 <= var2; var20++) {
            int var21 = var4 + 1 + (var20 * 5 - 4) * var1;
            int var22 = var6 + (var20 - 1) * var1;

            for (int var23 = 0; var23 < var1 - 1; var23 += 2) {
               int var24 = var23 + var21;
               int var25 = var24 + var1;
               int var26 = var24 - var1;
               int var27 = var25 + var1;
               int var28 = var27 + var1;
               float var29 = var3[var24 - 1];
               float var30 = var3[var24];
               float var31 = var3[var25 - 1];
               float var32 = var3[var25];
               float var33 = var3[var26 - 1];
               float var34 = var3[var26];
               float var35 = var3[var27 - 1];
               float var52 = var3[var27];
               float var53 = var3[var28 - 1];
               float var54 = var3[var28];
               float var36 = var30 - var54;
               float var37 = var30 + var54;
               float var38 = var32 - var52;
               float var39 = var32 + var52;
               float var40 = var29 - var53;
               float var41 = var29 + var53;
               float var42 = var31 - var35;
               float var43 = var31 + var35;
               float var44 = var33 + 0.309017F * var41 + -0.809017F * var43;
               float var45 = var34 + 0.309017F * var37 + -0.809017F * var39;
               float var46 = var33 + -0.809017F * var41 + 0.309017F * var43;
               float var47 = var34 + -0.809017F * var37 + 0.309017F * var39;
               float var48 = (float)var8 * (0.95105654F * var40 + 0.58778524F * var42);
               float var49 = (float)var8 * (0.95105654F * var36 + 0.58778524F * var38);
               float var50 = (float)var8 * (0.58778524F * var40 - 0.95105654F * var42);
               float var51 = (float)var8 * (0.58778524F * var36 - 0.95105654F * var38);
               float var57 = var46 - var51;
               float var58 = var46 + var51;
               float var59 = var47 + var50;
               float var60 = var47 - var50;
               float var61 = var44 + var49;
               float var62 = var44 - var49;
               float var63 = var45 - var48;
               float var64 = var45 + var48;
               int var55 = var23 + var15;
               int var56 = var23 + var16;
               int var65 = var23 + var17;
               int var66 = var23 + var18;
               float var67 = this.field38823[var55];
               float var68 = (float)var8 * this.field38823[var55 + 1];
               float var69 = this.field38823[var56];
               float var70 = (float)var8 * this.field38823[var56 + 1];
               float var71 = this.field38823[var65];
               float var72 = (float)var8 * this.field38823[var65 + 1];
               float var73 = this.field38823[var66];
               float var74 = (float)var8 * this.field38823[var66 + 1];
               int var75 = var23 + var22;
               int var76 = var75 + var19;
               int var77 = var76 + var19;
               int var78 = var77 + var19;
               int var79 = var78 + var19;
               var5[var75] = var33 + var41 + var43;
               var5[var75 + 1] = var34 + var37 + var39;
               var5[var76] = var67 * var62 - var68 * var64;
               var5[var76 + 1] = var67 * var64 + var68 * var62;
               var5[var77] = var69 * var57 - var70 * var59;
               var5[var77 + 1] = var69 * var59 + var70 * var57;
               var5[var78] = var71 * var58 - var72 * var60;
               var5[var78 + 1] = var71 * var60 + var72 * var58;
               var5[var79] = var73 * var61 - var74 * var63;
               var5[var79 + 1] = var73 * var63 + var74 * var61;
            }
         }
      } else {
         for (int var80 = 1; var80 <= var2; var80++) {
            int var81 = var4 + (5 * var80 - 4) * var1 + 1;
            int var82 = var81 + var1;
            int var83 = var81 - var1;
            int var84 = var82 + var1;
            int var85 = var84 + var1;
            float var86 = var3[var81 - 1];
            float var87 = var3[var81];
            float var88 = var3[var82 - 1];
            float var89 = var3[var82];
            float var90 = var3[var83 - 1];
            float var91 = var3[var83];
            float var92 = var3[var84 - 1];
            float var93 = var3[var84];
            float var94 = var3[var85 - 1];
            float var95 = var3[var85];
            float var96 = var87 - var95;
            float var97 = var87 + var95;
            float var98 = var89 - var93;
            float var99 = var89 + var93;
            float var100 = var86 - var94;
            float var101 = var86 + var94;
            float var102 = var88 - var92;
            float var103 = var88 + var92;
            float var104 = var90 + 0.309017F * var101 + -0.809017F * var103;
            float var105 = var91 + 0.309017F * var97 + -0.809017F * var99;
            float var106 = var90 + -0.809017F * var101 + 0.309017F * var103;
            float var107 = var91 + -0.809017F * var97 + 0.309017F * var99;
            float var108 = (float)var8 * (0.95105654F * var100 + 0.58778524F * var102);
            float var109 = (float)var8 * (0.95105654F * var96 + 0.58778524F * var98);
            float var110 = (float)var8 * (0.58778524F * var100 - 0.95105654F * var102);
            float var111 = (float)var8 * (0.58778524F * var96 - 0.95105654F * var98);
            int var112 = var6 + (var80 - 1) * var1;
            int var113 = var112 + var19;
            int var114 = var113 + var19;
            int var115 = var114 + var19;
            int var116 = var115 + var19;
            var5[var112] = var90 + var101 + var103;
            var5[var112 + 1] = var91 + var97 + var99;
            var5[var113] = var104 - var109;
            var5[var113 + 1] = var105 + var108;
            var5[var114] = var106 - var111;
            var5[var114 + 1] = var107 + var110;
            var5[var115] = var106 + var111;
            var5[var115 + 1] = var107 - var110;
            var5[var116] = var104 + var109;
            var5[var116 + 1] = var105 - var108;
         }
      }
   }

   public void method31005(long var1, long var3, Class2378 var5, long var6, Class2378 var8, long var9, long var11, long var13) {
      float var17 = 0.309017F;
      float var18 = 0.95105654F;
      float var19 = -0.809017F;
      float var20 = 0.58778524F;
      long var21 = var11;
      long var23 = var11 + var1;
      long var25 = var23 + var1;
      long var27 = var25 + var1;
      long var29 = var3 * var1;
      if (var1 != 2L) {
         for (long var31 = 1L; var31 <= var3; var31++) {
            long var33 = var6 + 1L + (var31 * 5L - 4L) * var1;
            long var35 = var9 + (var31 - 1L) * var1;

            for (long var37 = 0L; var37 < var1 - 1L; var37 += 2L) {
               long var39 = var37 + var33;
               long var41 = var39 + var1;
               long var79 = var39 - var1;
               long var81 = var41 + var1;
               long var83 = var81 + var1;
               float var49 = var5.method9651(var39 - 1L);
               float var50 = var5.method9651(var39);
               float var51 = var5.method9651(var41 - 1L);
               float var52 = var5.method9651(var41);
               float var85 = var5.method9651(var79 - 1L);
               float var86 = var5.method9651(var79);
               float var87 = var5.method9651(var81 - 1L);
               float var88 = var5.method9651(var81);
               float var89 = var5.method9651(var83 - 1L);
               float var90 = var5.method9651(var83);
               float var53 = var50 - var90;
               float var54 = var50 + var90;
               float var55 = var52 - var88;
               float var56 = var52 + var88;
               float var57 = var49 - var89;
               float var58 = var49 + var89;
               float var59 = var51 - var87;
               float var60 = var51 + var87;
               float var61 = var85 + 0.309017F * var58 + -0.809017F * var60;
               float var62 = var86 + 0.309017F * var54 + -0.809017F * var56;
               float var63 = var85 + -0.809017F * var58 + 0.309017F * var60;
               float var64 = var86 + -0.809017F * var54 + 0.309017F * var56;
               float var65 = (float)var13 * (0.95105654F * var57 + 0.58778524F * var59);
               float var66 = (float)var13 * (0.95105654F * var53 + 0.58778524F * var55);
               float var67 = (float)var13 * (0.58778524F * var57 - 0.95105654F * var59);
               float var68 = (float)var13 * (0.58778524F * var53 - 0.95105654F * var55);
               float var91 = var63 - var68;
               float var92 = var63 + var68;
               float var93 = var64 + var67;
               float var94 = var64 - var67;
               float var95 = var61 + var66;
               float var96 = var61 - var66;
               float var97 = var62 - var65;
               float var98 = var62 + var65;
               long var75 = var37 + var21;
               long var77 = var37 + var23;
               long var99 = var37 + var25;
               long var101 = var37 + var27;
               float var103 = this.field38824.method9651(var75);
               float var104 = (float)var13 * this.field38824.method9651(var75 + 1L);
               float var105 = this.field38824.method9651(var77);
               float var106 = (float)var13 * this.field38824.method9651(var77 + 1L);
               float var107 = this.field38824.method9651(var99);
               float var108 = (float)var13 * this.field38824.method9651(var99 + 1L);
               float var109 = this.field38824.method9651(var101);
               float var110 = (float)var13 * this.field38824.method9651(var101 + 1L);
               long var111 = var37 + var35;
               long var113 = var111 + var29;
               long var115 = var113 + var29;
               long var117 = var115 + var29;
               long var119 = var117 + var29;
               var8.method9685(var111, var85 + var58 + var60);
               var8.method9685(var111 + 1L, var86 + var54 + var56);
               var8.method9685(var113, var103 * var96 - var104 * var98);
               var8.method9685(var113 + 1L, var103 * var98 + var104 * var96);
               var8.method9685(var115, var105 * var91 - var106 * var93);
               var8.method9685(var115 + 1L, var105 * var93 + var106 * var91);
               var8.method9685(var117, var107 * var92 - var108 * var94);
               var8.method9685(var117 + 1L, var107 * var94 + var108 * var92);
               var8.method9685(var119, var109 * var95 - var110 * var97);
               var8.method9685(var119 + 1L, var109 * var97 + var110 * var95);
            }
         }
      } else {
         for (long var121 = 1L; var121 <= var3; var121++) {
            long var122 = var6 + (5L * var121 - 4L) * var1 + 1L;
            long var123 = var122 + var1;
            long var124 = var122 - var1;
            long var125 = var123 + var1;
            long var126 = var125 + var1;
            float var43 = var5.method9651(var122 - 1L);
            float var44 = var5.method9651(var122);
            float var45 = var5.method9651(var123 - 1L);
            float var46 = var5.method9651(var123);
            float var47 = var5.method9651(var124 - 1L);
            float var48 = var5.method9651(var124);
            float var127 = var5.method9651(var125 - 1L);
            float var128 = var5.method9651(var125);
            float var129 = var5.method9651(var126 - 1L);
            float var130 = var5.method9651(var126);
            float var131 = var44 - var130;
            float var132 = var44 + var130;
            float var133 = var46 - var128;
            float var134 = var46 + var128;
            float var135 = var43 - var129;
            float var136 = var43 + var129;
            float var137 = var45 - var127;
            float var138 = var45 + var127;
            float var139 = var47 + 0.309017F * var136 + -0.809017F * var138;
            float var140 = var48 + 0.309017F * var132 + -0.809017F * var134;
            float var141 = var47 + -0.809017F * var136 + 0.309017F * var138;
            float var142 = var48 + -0.809017F * var132 + 0.309017F * var134;
            float var143 = (float)var13 * (0.95105654F * var135 + 0.58778524F * var137);
            float var144 = (float)var13 * (0.95105654F * var131 + 0.58778524F * var133);
            float var145 = (float)var13 * (0.58778524F * var135 - 0.95105654F * var137);
            float var146 = (float)var13 * (0.58778524F * var131 - 0.95105654F * var133);
            long var69 = var9 + (var121 - 1L) * var1;
            long var71 = var69 + var29;
            long var73 = var71 + var29;
            long var147 = var73 + var29;
            long var148 = var147 + var29;
            var8.method9685(var69, var47 + var136 + var138);
            var8.method9685(var69 + 1L, var48 + var132 + var134);
            var8.method9685(var71, var139 - var144);
            var8.method9685(var71 + 1L, var140 + var143);
            var8.method9685(var73, var141 - var146);
            var8.method9685(var73 + 1L, var142 + var145);
            var8.method9685(var147, var141 + var146);
            var8.method9685(var147 + 1L, var142 - var145);
            var8.method9685(var148, var139 + var144);
            var8.method9685(var148 + 1L, var140 - var143);
         }
      }
   }

   public void method31006(int[] var1, int var2, int var3, int var4, int var5, float[] var6, int var7, float[] var8, int var9, int var10, int var11) {
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
                  int var29 = var7 + var24;
                  float var30 = var6[var29 + var22 + var27];
                  float var31 = var6[var29 + var23 + var27];
                  var8[var28 + var26 + var20] = var30 + var31;
                  var8[var28 + var26 + var21] = var30 - var31;
               }
            }
         }

         for (int var45 = 0; var45 < var2; var45++) {
            for (int var52 = 0; var52 < var4; var52++) {
               int var59 = var52 * var2;
               var8[var9 + var45 + var59] = var6[var7 + var45 + var59 * var3];
            }
         }
      } else {
         for (int var46 = 1; var46 < var16; var46++) {
            int var49 = var3 - var46;
            int var53 = var46 * var2;
            int var60 = var49 * var2;

            for (int var68 = 0; var68 < var4; var68++) {
               int var76 = var68 * var2;
               int var84 = var76 + var53 * var4;
               int var91 = var76 + var60 * var4;
               int var98 = var76 * var3;

               for (int var104 = 0; var104 < var2; var104++) {
                  int var109 = var9 + var104;
                  float var114 = var6[var7 + var104 + var53 + var98];
                  float var119 = var6[var7 + var104 + var60 + var98];
                  var8[var109 + var84] = var114 + var119;
                  var8[var109 + var91] = var114 - var119;
               }
            }
         }

         for (int var47 = 0; var47 < var4; var47++) {
            int var54 = var47 * var2;
            int var61 = var54 * var3;

            for (int var69 = 0; var69 < var2; var69++) {
               var8[var9 + var69 + var54] = var6[var7 + var69 + var61];
            }
         }
      }

      int var32 = 2 - var2;
      int var33 = 0;
      int var48 = (var3 - 1) * var5;

      for (int var34 = 1; var34 < var16; var34++) {
         int var35 = var3 - var34;
         var32 += var2;
         int var55 = var34 * var5;
         int var62 = var35 * var5;
         int var70 = var32 + var14;
         float var36 = this.field38823[var70 - 2];
         float var37 = (float)var11 * this.field38823[var70 - 1];

         for (int var77 = 0; var77 < var5; var77++) {
            int var85 = var7 + var77;
            int var92 = var9 + var77;
            var6[var85 + var55] = var8[var92] + var36 * var8[var92 + var5];
            var6[var85 + var62] = var37 * var8[var92 + var48];
         }

         int var38 = var32;
         var33 += var2;

         for (int var78 = 2; var78 < var16; var78++) {
            int var50 = var3 - var78;
            var38 += var33;
            if (var38 > var17) {
               var38 -= var17;
            }

            int var86 = var38 + var14;
            float var39 = this.field38823[var86 - 2];
            float var40 = (float)var11 * this.field38823[var86 - 1];
            int var93 = var78 * var5;
            int var99 = var50 * var5;

            for (int var105 = 0; var105 < var5; var105++) {
               int var110 = var7 + var105;
               int var115 = var9 + var105;
               var6[var110 + var55] = var6[var110 + var55] + var39 * var8[var115 + var93];
               var6[var110 + var62] = var6[var110 + var62] + var40 * var8[var115 + var99];
            }
         }
      }

      for (int var56 = 1; var56 < var16; var56++) {
         int var63 = var56 * var5;

         for (int var71 = 0; var71 < var5; var71++) {
            int var79 = var9 + var71;
            var8[var79] += var8[var79 + var63];
         }
      }

      for (int var57 = 1; var57 < var16; var57++) {
         int var51 = var3 - var57;
         int var64 = var57 * var5;
         int var72 = var51 * var5;

         for (int var80 = 1; var80 < var5; var80 += 2) {
            int var87 = var9 + var80;
            int var94 = var7 + var80;
            int var100 = var94 + var64;
            int var106 = var94 + var72;
            float var111 = var6[var100 - 1];
            float var116 = var6[var100];
            float var120 = var6[var106 - 1];
            float var123 = var6[var106];
            int var41 = var87 + var64;
            int var42 = var87 + var72;
            var8[var41 - 1] = var111 - var123;
            var8[var42 - 1] = var111 + var123;
            var8[var41] = var116 + var120;
            var8[var42] = var116 - var120;
         }
      }

      var1[0] = 1;
      if (var2 != 2) {
         var1[0] = 0;
         System.arraycopy(var8, var9, var6, var7, var5);
         int var58 = var4 * var2;

         for (int var65 = 1; var65 < var3; var65++) {
            int var73 = var65 * var58;

            for (int var81 = 0; var81 < var4; var81++) {
               int var88 = var81 * var2;
               int var95 = var9 + var88 + var73;
               int var101 = var7 + var88 + var73;
               var6[var101] = var8[var95];
               var6[var101 + 1] = var8[var95 + 1];
            }
         }

         if (var15 > var4) {
            int var43 = 2 - var2;

            for (int var66 = 1; var66 < var3; var66++) {
               var43 += var2;
               int var74 = var66 * var4 * var2;

               for (int var82 = 0; var82 < var4; var82++) {
                  int var44 = var43;
                  int var89 = var82 * var2 + var74;

                  for (int var96 = 3; var96 < var2; var96 += 2) {
                     var44 += 2;
                     int var102 = var44 - 1 + var14;
                     float var125 = this.field38823[var102 - 1];
                     float var127 = (float)var11 * this.field38823[var102];
                     int var107 = var7 + var96 + var89;
                     int var112 = var9 + var96 + var89;
                     float var117 = var8[var112 - 1];
                     float var121 = var8[var112];
                     var6[var107 - 1] = var125 * var117 - var127 * var121;
                     var6[var107] = var125 * var121 + var127 * var117;
                  }
               }
            }
         } else {
            byte var130 = 0;

            for (int var67 = 1; var67 < var3; var67++) {
               var130 += 2;
               int var75 = var67 * var4 * var2;

               for (int var83 = 3; var83 < var2; var83 += 2) {
                  var130 += 2;
                  int var90 = var130 + var14 - 1;
                  float var126 = this.field38823[var90 - 1];
                  float var128 = (float)var11 * this.field38823[var90];
                  int var97 = var7 + var83;
                  int var103 = var9 + var83;

                  for (int var108 = 0; var108 < var4; var108++) {
                     int var113 = var108 * var2 + var75;
                     int var118 = var97 + var113;
                     int var122 = var103 + var113;
                     float var124 = var8[var122 - 1];
                     float var129 = var8[var122];
                     var6[var118 - 1] = var126 * var124 - var128 * var129;
                     var6[var118] = var126 * var129 + var128 * var124;
                  }
               }
            }
         }
      }
   }

   public void method31007(
      int[] var1, long var2, long var4, long var6, long var8, Class2378 var10, long var11, Class2378 var13, long var14, long var16, long var18
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
                  long var54 = var11 + var42;
                  float var56 = var10.method9651(var54 + var38 + var48);
                  float var57 = var10.method9651(var54 + var40 + var48);
                  var13.method9685(var50 + var46 + var34, var56 + var57);
                  var13.method9685(var50 + var46 + var36, var56 - var57);
               }
            }
         }

         for (long var84 = 0L; var84 < var2; var84++) {
            for (long var91 = 0L; var91 < var6; var91++) {
               long var98 = var91 * var2;
               var13.method9685(var14 + var84 + var98, var10.method9651(var11 + var84 + var98 * var4));
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
                  float var52 = var10.method9651(var11 + var143 + var92 + var137);
                  float var53 = var10.method9651(var11 + var143 + var99 + var137);
                  var13.method9685(var148 + var123, var52 + var53);
                  var13.method9685(var148 + var130, var52 - var53);
               }
            }
         }

         for (long var86 = 0L; var86 < var6; var86++) {
            long var93 = var86 * var2;
            long var100 = var93 * var4;

            for (long var108 = 0L; var108 < var2; var108++) {
               var13.method9685(var14 + var108 + var93, var10.method9651(var11 + var108 + var100));
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
         float var66 = this.field38824.method9651(var109 - 2L);
         float var67 = (float)var18 * this.field38824.method9651(var109 - 1L);

         for (long var116 = 0L; var116 < var8; var116++) {
            long var124 = var11 + var116;
            long var131 = var14 + var116;
            var10.method9685(var124 + var94, var13.method9651(var131) + var66 * var13.method9651(var131 + var8));
            var10.method9685(var124 + var101, var67 * var13.method9651(var131 + var87));
         }

         long var68 = var58;
         var60 += var2;

         for (long var117 = 2L; var117 < var26; var117++) {
            long var89 = var4 - var117;
            var68 += var60;
            if (var68 > var28) {
               var68 -= var28;
            }

            long var125 = var68 + var22;
            float var70 = this.field38824.method9651(var125 - 2L);
            float var71 = (float)var18 * this.field38824.method9651(var125 - 1L);
            long var132 = var117 * var8;
            long var138 = var89 * var8;

            for (long var144 = 0L; var144 < var8; var144++) {
               long var149 = var11 + var144;
               long var156 = var14 + var144;
               var10.method9685(var149 + var94, var10.method9651(var149 + var94) + var70 * var13.method9651(var156 + var132));
               var10.method9685(var149 + var101, var10.method9651(var149 + var101) + var71 * var13.method9651(var156 + var138));
            }
         }
      }

      for (long var95 = 1L; var95 < var26; var95++) {
         long var102 = var95 * var8;

         for (long var110 = 0L; var110 < var8; var110++) {
            long var118 = var14 + var110;
            var13.method9685(var118, var13.method9651(var118) + var13.method9651(var118 + var102));
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
            float var72 = var10.method9651(var139 - 1L);
            float var73 = var10.method9651(var139);
            float var152 = var10.method9651(var145 - 1L);
            float var154 = var10.method9651(var145);
            long var74 = var126 + var103;
            long var76 = var126 + var111;
            var13.method9685(var74 - 1L, var72 - var154);
            var13.method9685(var76 - 1L, var72 + var154);
            var13.method9685(var74, var73 + var152);
            var13.method9685(var76, var73 - var152);
         }
      }

      var1[0] = 1;
      if (var2 != 2L) {
         var1[0] = 0;
         Class8133.method28175(var13, var14, var10, var11, var8);
         long var97 = var6 * var2;

         for (long var104 = 1L; var104 < var4; var104++) {
            long var112 = var104 * var97;

            for (long var120 = 0L; var120 < var6; var120++) {
               long var127 = var120 * var2;
               long var134 = var14 + var127 + var112;
               long var140 = var11 + var127 + var112;
               var10.method9685(var140, var13.method9651(var134));
               var10.method9685(var140 + 1L, var13.method9651(var134 + 1L));
            }
         }

         if (var24 > var6) {
            long var78 = 2L - var2;

            for (long var105 = 1L; var105 < var4; var105++) {
               var78 += var2;
               long var113 = var105 * var6 * var2;

               for (long var121 = 0L; var121 < var6; var121++) {
                  long var80 = var78;
                  long var128 = var121 * var2 + var113;

                  for (long var135 = 3L; var135 < var2; var135 += 2L) {
                     var80 += 2L;
                     long var141 = var80 - 1L + var22;
                     float var158 = this.field38824.method9651(var141 - 1L);
                     float var160 = (float)var18 * this.field38824.method9651(var141);
                     long var146 = var11 + var135 + var128;
                     long var150 = var14 + var135 + var128;
                     float var153 = var13.method9651(var150 - 1L);
                     float var155 = var13.method9651(var150);
                     var10.method9685(var146 - 1L, var158 * var153 - var160 * var155);
                     var10.method9685(var146, var158 * var155 + var160 * var153);
                  }
               }
            }
         } else {
            long var163 = 0L;

            for (long var106 = 1L; var106 < var4; var106++) {
               var163 += 2L;
               long var114 = var106 * var6 * var2;

               for (long var122 = 3L; var122 < var2; var122 += 2L) {
                  var163 += 2L;
                  long var129 = var163 + var22 - 1L;
                  float var159 = this.field38824.method9651(var129 - 1L);
                  float var161 = (float)var18 * this.field38824.method9651(var129);
                  long var136 = var11 + var122;
                  long var142 = var14 + var122;

                  for (long var147 = 0L; var147 < var6; var147++) {
                     long var151 = var147 * var2 + var114;
                     long var157 = var136 + var151;
                     long var162 = var142 + var151;
                     float var82 = var13.method9651(var162 - 1L);
                     float var83 = var13.method9651(var162);
                     var10.method9685(var157 - 1L, var159 * var82 - var161 * var83);
                     var10.method9685(var157, var159 * var83 + var161 * var82);
                  }
               }
            }
         }
      }
   }

   // $VF: synthetic method
   public static float[] method31008(Class8630 var0) {
      return var0.field38827;
   }

   // $VF: synthetic method
   public static float[] method31009(Class8630 var0) {
      return var0.field38829;
   }

   // $VF: synthetic method
   public static Class2378 method31010(Class8630 var0) {
      return var0.field38828;
   }

   // $VF: synthetic method
   public static Class2378 method31011(Class8630 var0) {
      return var0.field38830;
   }
}
