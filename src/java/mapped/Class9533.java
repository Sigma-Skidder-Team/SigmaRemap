package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class9533 {
   private int field44356;
   private int field44357;
   private long field44358;
   private long field44359;
   private Class8431 field44360;
   private Class8431 field44361;
   private boolean field44362 = false;
   private boolean field44363 = false;

   public Class9533(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field44356 = (int)var1;
         this.field44357 = (int)var3;
         this.field44358 = var1;
         this.field44359 = var3;
         if (var1 * var3 >= Class7796.method25893()) {
            this.field44363 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3)) {
            this.field44362 = true;
         }

         Class7796.method25902(var1 * var3 > (long)Class2373.method9693());
         this.field44361 = new Class8431(var1);
         if (var1 != var3) {
            this.field44360 = new Class8431(var3);
         } else {
            this.field44360 = this.field44361;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method36841(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field44362) {
         if (var5 > 1 && this.field44363) {
            this.method36847(-1, var1, var2);
            this.method36850(-1, var1, var2);
         } else {
            this.method36853(-1, var1, var2);

            for (int var6 = 0; var6 < this.field44356; var6++) {
               this.field44360.method29629(var1, var6 * this.field44357, var2);
            }
         }
      } else if (var5 > 1 && this.field44363 && this.field44356 >= var5 && this.field44357 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field44356 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field44356 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class744(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field44357 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field44357 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class1596(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field44356; var15++) {
            this.field44360.method29629(var1, var15 * this.field44357, var2);
         }

         float[] var16 = new float[this.field44356];

         for (int var7 = 0; var7 < this.field44357; var7++) {
            for (int var8 = 0; var8 < this.field44356; var8++) {
               var16[var8] = var1[var8 * this.field44357 + var7];
            }

            this.field44361.method29627(var16, var2);

            for (int var20 = 0; var20 < this.field44356; var20++) {
               var1[var20 * this.field44357 + var7] = var16[var20];
            }
         }
      }
   }

   public void method36842(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field44362) {
         if (var5 > 1 && this.field44363) {
            this.method36848(-1, var1, var2);
            this.method36851(-1, var1, var2);
         } else {
            this.method36854(-1, var1, var2);

            for (long var6 = 0L; var6 < this.field44358; var6++) {
               this.field44360.method29630(var1, var6 * this.field44359, var2);
            }
         }
      } else if (var5 > 1 && this.field44363 && this.field44358 >= (long)var5 && this.field44359 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field44358 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field44358 : var12 + var24;
            var23[var11] = Class7008.method21729(new Class435(this, var12, var14, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field44359 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field44359 : var27 + var24;
            var23[var26] = Class7008.method21729(new Class1438(this, var27, var28, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field44358; var22++) {
            this.field44360.method29630(var1, var22 * this.field44359, var2);
         }

         Class2378 var8 = new Class2378(this.field44358, false);

         for (long var9 = 0L; var9 < this.field44359; var9++) {
            for (long var16 = 0L; var16 < this.field44358; var16++) {
               var8.method9685(var16, var1.method9651(var16 * this.field44359 + var9));
            }

            this.field44361.method29628(var8, var2);

            for (long var29 = 0L; var29 < this.field44358; var29++) {
               var1.method9685(var29 * this.field44359 + var9, var8.method9651(var29));
            }
         }
      }
   }

   public void method36843(float[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field44362) {
         if (var5 > 1 && this.field44363) {
            this.method36849(-1, var1, var2);
            this.method36852(-1, var1, var2);
         } else {
            this.method36855(-1, var1, var2);

            for (int var6 = 0; var6 < this.field44356; var6++) {
               this.field44360.method29627(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field44363 && this.field44356 >= var5 && this.field44357 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field44356 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field44356 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class706(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field44357 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field44357 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class1454(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field44356; var15++) {
            this.field44360.method29627(var1[var15], var2);
         }

         float[] var16 = new float[this.field44356];

         for (int var7 = 0; var7 < this.field44357; var7++) {
            for (int var8 = 0; var8 < this.field44356; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field44361.method29627(var16, var2);

            for (int var20 = 0; var20 < this.field44356; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   public void method36844(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field44362) {
         if (var5 > 1 && this.field44363) {
            this.method36847(1, var1, var2);
            this.method36850(1, var1, var2);
         } else {
            this.method36853(1, var1, var2);

            for (int var6 = 0; var6 < this.field44356; var6++) {
               this.field44360.method29633(var1, var6 * this.field44357, var2);
            }
         }
      } else if (var5 > 1 && this.field44363 && this.field44356 >= var5 && this.field44357 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field44356 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field44356 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class484(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field44357 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field44357 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class1554(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field44356; var15++) {
            this.field44360.method29633(var1, var15 * this.field44357, var2);
         }

         float[] var16 = new float[this.field44356];

         for (int var7 = 0; var7 < this.field44357; var7++) {
            for (int var8 = 0; var8 < this.field44356; var8++) {
               var16[var8] = var1[var8 * this.field44357 + var7];
            }

            this.field44361.method29631(var16, var2);

            for (int var20 = 0; var20 < this.field44356; var20++) {
               var1[var20 * this.field44357 + var7] = var16[var20];
            }
         }
      }
   }

   public void method36845(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field44362) {
         if (var5 > 1 && this.field44363) {
            this.method36848(1, var1, var2);
            this.method36851(1, var1, var2);
         } else {
            this.method36854(1, var1, var2);

            for (long var6 = 0L; var6 < this.field44358; var6++) {
               this.field44360.method29634(var1, var6 * this.field44359, var2);
            }
         }
      } else if (var5 > 1 && this.field44363 && this.field44358 >= (long)var5 && this.field44359 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field44358 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field44358 : var12 + var24;
            var23[var11] = Class7008.method21729(new Class783(this, var12, var14, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field44359 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field44359 : var27 + var24;
            var23[var26] = Class7008.method21729(new Class611(this, var27, var28, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field44358; var22++) {
            this.field44360.method29634(var1, var22 * this.field44359, var2);
         }

         Class2378 var8 = new Class2378(this.field44358, false);

         for (long var9 = 0L; var9 < this.field44359; var9++) {
            for (long var16 = 0L; var16 < this.field44358; var16++) {
               var8.method9685(var16, var1.method9651(var16 * this.field44359 + var9));
            }

            this.field44361.method29632(var8, var2);

            for (long var29 = 0L; var29 < this.field44358; var29++) {
               var1.method9685(var29 * this.field44359 + var9, var8.method9651(var29));
            }
         }
      }
   }

   public void method36846(float[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field44362) {
         if (var5 > 1 && this.field44363) {
            this.method36849(1, var1, var2);
            this.method36852(1, var1, var2);
         } else {
            this.method36855(1, var1, var2);

            for (int var6 = 0; var6 < this.field44356; var6++) {
               this.field44360.method29631(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field44363 && this.field44356 >= var5 && this.field44357 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field44356 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field44356 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class688(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field44357 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field44357 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class1450(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field44356; var15++) {
            this.field44360.method29631(var1[var15], var2);
         }

         float[] var16 = new float[this.field44356];

         for (int var7 = 0; var7 < this.field44357; var7++) {
            for (int var8 = 0; var8 < this.field44356; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field44361.method29631(var16, var2);

            for (int var20 = 0; var20 < this.field44356; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   private void method36847(int var1, float[] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field44357, Class7008.method21726());
      int var7 = 4 * this.field44356;
      if (this.field44357 == 2) {
         var7 >>= 1;
      } else if (this.field44357 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var6; var11++) {
         var10[var11] = Class7008.method21729(new Class622(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method36848(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)Class9044.method33604(this.field44359, (long)Class7008.method21726());
      long var7 = 4L * this.field44358;
      if (this.field44359 == 2L) {
         var7 >>= 1;
      } else if (this.field44359 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      long var11 = (long)var6;
      Future[] var13 = new Future[var6];

      for (int var14 = 0; var14 < var6; var14++) {
         long var15 = (long)var14;
         var13[var14] = Class7008.method21729(new Class480(this, var9, var1, var15, var11, var2, var3));
      }

      try {
         Class7008.method21730(var13);
      } catch (InterruptedException var17) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var17);
      } catch (ExecutionException var18) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var18);
      }
   }

   private void method36849(int var1, float[][] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field44357, Class7008.method21726());
      int var7 = 4 * this.field44356;
      if (this.field44357 == 2) {
         var7 >>= 1;
      } else if (this.field44357 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var6; var11++) {
         var10[var11] = Class7008.method21729(new Class1637(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method36850(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field44356 ? this.field44356 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class1408(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method36851(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field44358 ? this.field44358 : (long)Class7008.method21726());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class1512(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method36852(int var1, float[][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field44356 ? this.field44356 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class1461(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class9533.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method36853(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field44356;
      if (this.field44357 != 2) {
         if (this.field44357 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (this.field44357 <= 2) {
         if (this.field44357 == 2) {
            for (int var8 = 0; var8 < this.field44356; var8++) {
               int var10 = var8 * this.field44357;
               var7[var8] = var2[var10];
               var7[this.field44356 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field44361.method29633(var7, 0, var3);
               this.field44361.method29633(var7, this.field44356, var3);
            } else {
               this.field44361.method29629(var7, 0, var3);
               this.field44361.method29629(var7, this.field44356, var3);
            }

            for (int var12 = 0; var12 < this.field44356; var12++) {
               int var18 = var12 * this.field44357;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field44356 + var12];
            }
         }
      } else if (var1 != -1) {
         for (int var13 = 0; var13 < this.field44357; var13 += 4) {
            for (int var9 = 0; var9 < this.field44356; var9++) {
               int var19 = var9 * this.field44357 + var13;
               int var11 = this.field44356 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field44356] = var2[var19 + 2];
               var7[var11 + 2 * this.field44356] = var2[var19 + 3];
            }

            this.field44361.method29633(var7, 0, var3);
            this.field44361.method29633(var7, this.field44356, var3);
            this.field44361.method29633(var7, 2 * this.field44356, var3);
            this.field44361.method29633(var7, 3 * this.field44356, var3);

            for (int var15 = 0; var15 < this.field44356; var15++) {
               int var20 = var15 * this.field44357 + var13;
               int var23 = this.field44356 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field44356];
               var2[var20 + 3] = var7[var23 + 2 * this.field44356];
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field44357; var14 += 4) {
            for (int var16 = 0; var16 < this.field44356; var16++) {
               int var21 = var16 * this.field44357 + var14;
               int var24 = this.field44356 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field44356] = var2[var21 + 2];
               var7[var24 + 2 * this.field44356] = var2[var21 + 3];
            }

            this.field44361.method29629(var7, 0, var3);
            this.field44361.method29629(var7, this.field44356, var3);
            this.field44361.method29629(var7, 2 * this.field44356, var3);
            this.field44361.method29629(var7, 3 * this.field44356, var3);

            for (int var17 = 0; var17 < this.field44356; var17++) {
               int var22 = var17 * this.field44357 + var14;
               int var25 = this.field44356 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field44356];
               var2[var22 + 3] = var7[var25 + 2 * this.field44356];
            }
         }
      }
   }

   private void method36854(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field44358;
      if (this.field44359 != 2L) {
         if (this.field44359 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (this.field44359 <= 2L) {
         if (this.field44359 == 2L) {
            for (long var9 = 0L; var9 < this.field44358; var9++) {
               long var13 = var9 * this.field44359;
               var8.method9685(var9, var2.method9651(var13));
               var8.method9685(this.field44358 + var9, var2.method9651(var13 + 1L));
            }

            if (var1 != -1) {
               this.field44361.method29634(var8, 0L, var3);
               this.field44361.method29634(var8, this.field44358, var3);
            } else {
               this.field44361.method29630(var8, 0L, var3);
               this.field44361.method29630(var8, this.field44358, var3);
            }

            for (long var17 = 0L; var17 < this.field44358; var17++) {
               long var23 = var17 * this.field44359;
               var2.method9685(var23, var8.method9651(var17));
               var2.method9685(var23 + 1L, var8.method9651(this.field44358 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field44359; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field44358; var11++) {
               long var24 = var11 * this.field44359 + var18;
               long var15 = this.field44358 + var11;
               var8.method9685(var11, var2.method9651(var24));
               var8.method9685(var15, var2.method9651(var24 + 1L));
               var8.method9685(var15 + this.field44358, var2.method9651(var24 + 2L));
               var8.method9685(var15 + 2L * this.field44358, var2.method9651(var24 + 3L));
            }

            this.field44361.method29634(var8, 0L, var3);
            this.field44361.method29634(var8, this.field44358, var3);
            this.field44361.method29634(var8, 2L * this.field44358, var3);
            this.field44361.method29634(var8, 3L * this.field44358, var3);

            for (long var20 = 0L; var20 < this.field44358; var20++) {
               long var25 = var20 * this.field44359 + var18;
               long var28 = this.field44358 + var20;
               var2.method9685(var25, var8.method9651(var20));
               var2.method9685(var25 + 1L, var8.method9651(var28));
               var2.method9685(var25 + 2L, var8.method9651(var28 + this.field44358));
               var2.method9685(var25 + 3L, var8.method9651(var28 + 2L * this.field44358));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field44359; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field44358; var21++) {
               long var26 = var21 * this.field44359 + var19;
               long var29 = this.field44358 + var21;
               var8.method9685(var21, var2.method9651(var26));
               var8.method9685(var29, var2.method9651(var26 + 1L));
               var8.method9685(var29 + this.field44358, var2.method9651(var26 + 2L));
               var8.method9685(var29 + 2L * this.field44358, var2.method9651(var26 + 3L));
            }

            this.field44361.method29630(var8, 0L, var3);
            this.field44361.method29630(var8, this.field44358, var3);
            this.field44361.method29630(var8, 2L * this.field44358, var3);
            this.field44361.method29630(var8, 3L * this.field44358, var3);

            for (long var22 = 0L; var22 < this.field44358; var22++) {
               long var27 = var22 * this.field44359 + var19;
               long var30 = this.field44358 + var22;
               var2.method9685(var27, var8.method9651(var22));
               var2.method9685(var27 + 1L, var8.method9651(var30));
               var2.method9685(var27 + 2L, var8.method9651(var30 + this.field44358));
               var2.method9685(var27 + 3L, var8.method9651(var30 + 2L * this.field44358));
            }
         }
      }
   }

   private void method36855(int var1, float[][] var2, boolean var3) {
      int var6 = 4 * this.field44356;
      if (this.field44357 != 2) {
         if (this.field44357 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (this.field44357 <= 2) {
         if (this.field44357 == 2) {
            for (int var8 = 0; var8 < this.field44356; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field44356 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field44361.method29633(var7, 0, var3);
               this.field44361.method29633(var7, this.field44356, var3);
            } else {
               this.field44361.method29629(var7, 0, var3);
               this.field44361.method29629(var7, this.field44356, var3);
            }

            for (int var11 = 0; var11 < this.field44356; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field44356 + var11];
            }
         }
      } else if (var1 != -1) {
         for (int var12 = 0; var12 < this.field44357; var12 += 4) {
            for (int var9 = 0; var9 < this.field44356; var9++) {
               int var10 = this.field44356 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field44356] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field44356] = var2[var9][var12 + 3];
            }

            this.field44361.method29633(var7, 0, var3);
            this.field44361.method29633(var7, this.field44356, var3);
            this.field44361.method29633(var7, 2 * this.field44356, var3);
            this.field44361.method29633(var7, 3 * this.field44356, var3);

            for (int var14 = 0; var14 < this.field44356; var14++) {
               int var17 = this.field44356 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field44356];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field44356];
            }
         }
      } else {
         for (int var13 = 0; var13 < this.field44357; var13 += 4) {
            for (int var15 = 0; var15 < this.field44356; var15++) {
               int var18 = this.field44356 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field44356] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field44356] = var2[var15][var13 + 3];
            }

            this.field44361.method29629(var7, 0, var3);
            this.field44361.method29629(var7, this.field44356, var3);
            this.field44361.method29629(var7, 2 * this.field44356, var3);
            this.field44361.method29629(var7, 3 * this.field44356, var3);

            for (int var16 = 0; var16 < this.field44356; var16++) {
               int var19 = this.field44356 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field44356];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field44356];
            }
         }
      }
   }

   // $VF: synthetic method
   public static int method36856(Class9533 var0) {
      return var0.field44357;
   }

   // $VF: synthetic method
   public static Class8431 method36857(Class9533 var0) {
      return var0.field44360;
   }

   // $VF: synthetic method
   public static int method36858(Class9533 var0) {
      return var0.field44356;
   }

   // $VF: synthetic method
   public static Class8431 method36859(Class9533 var0) {
      return var0.field44361;
   }

   // $VF: synthetic method
   public static long method36860(Class9533 var0) {
      return var0.field44359;
   }

   // $VF: synthetic method
   public static long method36861(Class9533 var0) {
      return var0.field44358;
   }
}
