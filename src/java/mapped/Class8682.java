package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8682 {
   private int field39153;
   private int field39154;
   private long field39155;
   private long field39156;
   private Class8276 field39157;
   private Class8276 field39158;
   private boolean field39159 = false;
   private boolean field39160 = false;

   public Class8682(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field39153 = (int)var1;
         this.field39154 = (int)var3;
         this.field39155 = var1;
         this.field39156 = var3;
         if (var1 * var3 >= Class7796.method25893()) {
            this.field39160 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3)) {
            this.field39159 = true;
         }

         Class7796.method25902(var1 * var3 > (long)Class2373.method9693());
         this.field39158 = new Class8276(var1);
         if (var1 != var3) {
            this.field39157 = new Class8276(var3);
         } else {
            this.field39157 = this.field39158;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method31230(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39159) {
         if (var5 > 1 && this.field39160) {
            this.method31236(-1, var1, var2);
            this.method31239(-1, var1, var2);
         } else {
            this.method31242(-1, var1, var2);

            for (int var6 = 0; var6 < this.field39153; var6++) {
               this.field39157.method28926(var1, var6 * this.field39154, var2);
            }
         }
      } else if (var5 > 1 && this.field39160 && this.field39153 >= var5 && this.field39154 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field39153 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field39153 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class787(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field39154 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field39154 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class401(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field39153; var15++) {
            this.field39157.method28926(var1, var15 * this.field39154, var2);
         }

         float[] var16 = new float[this.field39153];

         for (int var7 = 0; var7 < this.field39154; var7++) {
            for (int var8 = 0; var8 < this.field39153; var8++) {
               var16[var8] = var1[var8 * this.field39154 + var7];
            }

            this.field39158.method28924(var16, var2);

            for (int var20 = 0; var20 < this.field39153; var20++) {
               var1[var20 * this.field39154 + var7] = var16[var20];
            }
         }
      }
   }

   public void method31231(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39159) {
         if (var5 > 1 && this.field39160) {
            this.method31237(-1, var1, var2);
            this.method31240(-1, var1, var2);
         } else {
            this.method31243(-1, var1, var2);

            for (long var6 = 0L; var6 < this.field39155; var6++) {
               this.field39157.method28927(var1, var6 * this.field39156, var2);
            }
         }
      } else if (var5 > 1 && this.field39160 && this.field39155 >= (long)var5 && this.field39156 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field39155 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field39155 : var12 + var24;
            var23[var11] = Class7008.method21729(new Class547(this, var12, var14, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field39156 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field39156 : var27 + var24;
            var23[var26] = Class7008.method21729(new Class394(this, var27, var28, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field39155; var22++) {
            this.field39157.method28927(var1, var22 * this.field39156, var2);
         }

         Class2378 var8 = new Class2378(this.field39155, false);

         for (long var9 = 0L; var9 < this.field39156; var9++) {
            for (long var16 = 0L; var16 < this.field39155; var16++) {
               var8.method9685(var16, var1.method9651(var16 * this.field39156 + var9));
            }

            this.field39158.method28925(var8, var2);

            for (long var29 = 0L; var29 < this.field39155; var29++) {
               var1.method9685(var29 * this.field39156 + var9, var8.method9651(var29));
            }
         }
      }
   }

   public void method31232(float[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39159) {
         if (var5 > 1 && this.field39160) {
            this.method31238(-1, var1, var2);
            this.method31241(-1, var1, var2);
         } else {
            this.method31244(-1, var1, var2);

            for (int var6 = 0; var6 < this.field39153; var6++) {
               this.field39157.method28924(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field39160 && this.field39153 >= var5 && this.field39154 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field39153 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field39153 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class573(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field39154 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field39154 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class616(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field39153; var15++) {
            this.field39157.method28924(var1[var15], var2);
         }

         float[] var16 = new float[this.field39153];

         for (int var7 = 0; var7 < this.field39154; var7++) {
            for (int var8 = 0; var8 < this.field39153; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field39158.method28924(var16, var2);

            for (int var20 = 0; var20 < this.field39153; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   public void method31233(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39159) {
         if (var5 > 1 && this.field39160) {
            this.method31236(1, var1, var2);
            this.method31239(1, var1, var2);
         } else {
            this.method31242(1, var1, var2);

            for (int var6 = 0; var6 < this.field39153; var6++) {
               this.field39157.method28930(var1, var6 * this.field39154, var2);
            }
         }
      } else if (var5 > 1 && this.field39160 && this.field39153 >= var5 && this.field39154 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field39153 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field39153 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class655(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field39154 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field39154 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class559(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field39153; var15++) {
            this.field39157.method28930(var1, var15 * this.field39154, var2);
         }

         float[] var16 = new float[this.field39153];

         for (int var7 = 0; var7 < this.field39154; var7++) {
            for (int var8 = 0; var8 < this.field39153; var8++) {
               var16[var8] = var1[var8 * this.field39154 + var7];
            }

            this.field39158.method28928(var16, var2);

            for (int var20 = 0; var20 < this.field39153; var20++) {
               var1[var20 * this.field39154 + var7] = var16[var20];
            }
         }
      }
   }

   public void method31234(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39159) {
         if (var5 > 1 && this.field39160) {
            this.method31237(1, var1, var2);
            this.method31240(1, var1, var2);
         } else {
            this.method31243(1, var1, var2);

            for (long var6 = 0L; var6 < this.field39155; var6++) {
               this.field39157.method28931(var1, var6 * this.field39156, var2);
            }
         }
      } else if (var5 > 1 && this.field39160 && this.field39155 >= (long)var5 && this.field39156 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field39155 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field39155 : var12 + var24;
            var23[var11] = Class7008.method21729(new Class619(this, var12, var14, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field39156 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field39156 : var27 + var24;
            var23[var26] = Class7008.method21729(new Class1572(this, var27, var28, var1, var2));
         }

         try {
            Class7008.method21730(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field39155; var22++) {
            this.field39157.method28931(var1, var22 * this.field39156, var2);
         }

         Class2378 var8 = new Class2378(this.field39155, false);

         for (long var9 = 0L; var9 < this.field39156; var9++) {
            for (long var16 = 0L; var16 < this.field39155; var16++) {
               var8.method9685(var16, var1.method9651(var16 * this.field39156 + var9));
            }

            this.field39158.method28929(var8, var2);

            for (long var29 = 0L; var29 < this.field39155; var29++) {
               var1.method9685(var29 * this.field39156 + var9, var8.method9651(var29));
            }
         }
      }
   }

   public void method31235(float[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39159) {
         if (var5 > 1 && this.field39160) {
            this.method31238(1, var1, var2);
            this.method31241(1, var1, var2);
         } else {
            this.method31244(1, var1, var2);

            for (int var6 = 0; var6 < this.field39153; var6++) {
               this.field39157.method28928(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field39160 && this.field39153 >= var5 && this.field39154 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field39153 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field39153 : var9 + var18;
            var17[var21] = Class7008.method21729(new Class482(this, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field39154 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field39154 : var23 + var18;
            var17[var22] = Class7008.method21729(new Class1608(this, var23, var24, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field39153; var15++) {
            this.field39157.method28928(var1[var15], var2);
         }

         float[] var16 = new float[this.field39153];

         for (int var7 = 0; var7 < this.field39154; var7++) {
            for (int var8 = 0; var8 < this.field39153; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field39158.method28928(var16, var2);

            for (int var20 = 0; var20 < this.field39153; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   private void method31236(int var1, float[] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field39154, Class7008.method21726());
      int var7 = 4 * this.field39153;
      if (this.field39154 == 2) {
         var7 >>= 1;
      } else if (this.field39154 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Class7008.method21729(new Class718(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method31237(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)Class9044.method33604(this.field39156, (long)Class7008.method21726());
      long var7 = 4L * this.field39155;
      if (this.field39156 == 2L) {
         var7 >>= 1;
      } else if (this.field39156 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      int var11 = var6;
      Future[] var12 = new Future[var6];

      for (int var13 = 0; var13 < var11; var13++) {
         long var14 = (long)var13;
         var12[var13] = Class7008.method21729(new Class1612(this, var9, var1, var14, var11, var2, var3));
      }

      try {
         Class7008.method21730(var12);
      } catch (InterruptedException var16) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method31238(int var1, float[][] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field39154, Class7008.method21726());
      int var7 = 4 * this.field39153;
      if (this.field39154 == 2) {
         var7 >>= 1;
      } else if (this.field39154 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Class7008.method21729(new Class1507(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method31239(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field39153 ? this.field39153 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class1437(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method31240(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field39155 ? this.field39155 : (long)Class7008.method21726());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         long var9 = (long)var8;
         var7[var8] = Class7008.method21729(new Class631(this, var1, var9, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method31241(int var1, float[][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field39153 ? this.field39153 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class397(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class8682.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method31242(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field39153;
      if (this.field39154 != 2) {
         if (this.field39154 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (this.field39154 <= 2) {
         if (this.field39154 == 2) {
            for (int var8 = 0; var8 < this.field39153; var8++) {
               int var10 = var8 * this.field39154;
               var7[var8] = var2[var10];
               var7[this.field39153 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field39158.method28930(var7, 0, var3);
               this.field39158.method28930(var7, this.field39153, var3);
            } else {
               this.field39158.method28926(var7, 0, var3);
               this.field39158.method28926(var7, this.field39153, var3);
            }

            for (int var12 = 0; var12 < this.field39153; var12++) {
               int var18 = var12 * this.field39154;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field39153 + var12];
            }
         }
      } else if (var1 != -1) {
         for (int var13 = 0; var13 < this.field39154; var13 += 4) {
            for (int var9 = 0; var9 < this.field39153; var9++) {
               int var19 = var9 * this.field39154 + var13;
               int var11 = this.field39153 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field39153] = var2[var19 + 2];
               var7[var11 + 2 * this.field39153] = var2[var19 + 3];
            }

            this.field39158.method28930(var7, 0, var3);
            this.field39158.method28930(var7, this.field39153, var3);
            this.field39158.method28930(var7, 2 * this.field39153, var3);
            this.field39158.method28930(var7, 3 * this.field39153, var3);

            for (int var15 = 0; var15 < this.field39153; var15++) {
               int var20 = var15 * this.field39154 + var13;
               int var23 = this.field39153 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field39153];
               var2[var20 + 3] = var7[var23 + 2 * this.field39153];
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field39154; var14 += 4) {
            for (int var16 = 0; var16 < this.field39153; var16++) {
               int var21 = var16 * this.field39154 + var14;
               int var24 = this.field39153 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field39153] = var2[var21 + 2];
               var7[var24 + 2 * this.field39153] = var2[var21 + 3];
            }

            this.field39158.method28926(var7, 0, var3);
            this.field39158.method28926(var7, this.field39153, var3);
            this.field39158.method28926(var7, 2 * this.field39153, var3);
            this.field39158.method28926(var7, 3 * this.field39153, var3);

            for (int var17 = 0; var17 < this.field39153; var17++) {
               int var22 = var17 * this.field39154 + var14;
               int var25 = this.field39153 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field39153];
               var2[var22 + 3] = var7[var25 + 2 * this.field39153];
            }
         }
      }
   }

   private void method31243(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field39155;
      if (this.field39156 != 2L) {
         if (this.field39156 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (this.field39156 <= 2L) {
         if (this.field39156 == 2L) {
            for (long var9 = 0L; var9 < this.field39155; var9++) {
               long var13 = var9 * this.field39156;
               var8.method9685(var9, var2.method9651(var13));
               var8.method9685(this.field39155 + var9, var2.method9651(var13 + 1L));
            }

            if (var1 != -1) {
               this.field39158.method28931(var8, 0L, var3);
               this.field39158.method28931(var8, this.field39155, var3);
            } else {
               this.field39158.method28927(var8, 0L, var3);
               this.field39158.method28927(var8, this.field39155, var3);
            }

            for (long var17 = 0L; var17 < this.field39155; var17++) {
               long var23 = var17 * this.field39156;
               var2.method9685(var23, var8.method9651(var17));
               var2.method9685(var23 + 1L, var8.method9651(this.field39155 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field39156; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field39155; var11++) {
               long var24 = var11 * this.field39156 + var18;
               long var15 = this.field39155 + var11;
               var8.method9685(var11, var2.method9651(var24));
               var8.method9685(var15, var2.method9651(var24 + 1L));
               var8.method9685(var15 + this.field39155, var2.method9651(var24 + 2L));
               var8.method9685(var15 + 2L * this.field39155, var2.method9651(var24 + 3L));
            }

            this.field39158.method28931(var8, 0L, var3);
            this.field39158.method28931(var8, this.field39155, var3);
            this.field39158.method28931(var8, 2L * this.field39155, var3);
            this.field39158.method28931(var8, 3L * this.field39155, var3);

            for (long var20 = 0L; var20 < this.field39155; var20++) {
               long var25 = var20 * this.field39156 + var18;
               long var28 = this.field39155 + var20;
               var2.method9685(var25, var8.method9651(var20));
               var2.method9685(var25 + 1L, var8.method9651(var28));
               var2.method9685(var25 + 2L, var8.method9651(var28 + this.field39155));
               var2.method9685(var25 + 3L, var8.method9651(var28 + 2L * this.field39155));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field39156; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field39155; var21++) {
               long var26 = var21 * this.field39156 + var19;
               long var29 = this.field39155 + var21;
               var8.method9685(var21, var2.method9651(var26));
               var8.method9685(var29, var2.method9651(var26 + 1L));
               var8.method9685(var29 + this.field39155, var2.method9651(var26 + 2L));
               var8.method9685(var29 + 2L * this.field39155, var2.method9651(var26 + 3L));
            }

            this.field39158.method28927(var8, 0L, var3);
            this.field39158.method28927(var8, this.field39155, var3);
            this.field39158.method28927(var8, 2L * this.field39155, var3);
            this.field39158.method28927(var8, 3L * this.field39155, var3);

            for (long var22 = 0L; var22 < this.field39155; var22++) {
               long var27 = var22 * this.field39156 + var19;
               long var30 = this.field39155 + var22;
               var2.method9685(var27, var8.method9651(var22));
               var2.method9685(var27 + 1L, var8.method9651(var30));
               var2.method9685(var27 + 2L, var8.method9651(var30 + this.field39155));
               var2.method9685(var27 + 3L, var8.method9651(var30 + 2L * this.field39155));
            }
         }
      }
   }

   private void method31244(int var1, float[][] var2, boolean var3) {
      int var6 = 4 * this.field39153;
      if (this.field39154 != 2) {
         if (this.field39154 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (this.field39154 <= 2) {
         if (this.field39154 == 2) {
            for (int var8 = 0; var8 < this.field39153; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field39153 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field39158.method28930(var7, 0, var3);
               this.field39158.method28930(var7, this.field39153, var3);
            } else {
               this.field39158.method28926(var7, 0, var3);
               this.field39158.method28926(var7, this.field39153, var3);
            }

            for (int var11 = 0; var11 < this.field39153; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field39153 + var11];
            }
         }
      } else if (var1 != -1) {
         for (int var12 = 0; var12 < this.field39154; var12 += 4) {
            for (int var9 = 0; var9 < this.field39153; var9++) {
               int var10 = this.field39153 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field39153] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field39153] = var2[var9][var12 + 3];
            }

            this.field39158.method28930(var7, 0, var3);
            this.field39158.method28930(var7, this.field39153, var3);
            this.field39158.method28930(var7, 2 * this.field39153, var3);
            this.field39158.method28930(var7, 3 * this.field39153, var3);

            for (int var14 = 0; var14 < this.field39153; var14++) {
               int var17 = this.field39153 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field39153];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field39153];
            }
         }
      } else {
         for (int var13 = 0; var13 < this.field39154; var13 += 4) {
            for (int var15 = 0; var15 < this.field39153; var15++) {
               int var18 = this.field39153 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field39153] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field39153] = var2[var15][var13 + 3];
            }

            this.field39158.method28926(var7, 0, var3);
            this.field39158.method28926(var7, this.field39153, var3);
            this.field39158.method28926(var7, 2 * this.field39153, var3);
            this.field39158.method28926(var7, 3 * this.field39153, var3);

            for (int var16 = 0; var16 < this.field39153; var16++) {
               int var19 = this.field39153 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field39153];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field39153];
            }
         }
      }
   }

   // $VF: synthetic method
   public static int method31245(Class8682 var0) {
      return var0.field39154;
   }

   // $VF: synthetic method
   public static Class8276 method31246(Class8682 var0) {
      return var0.field39157;
   }

   // $VF: synthetic method
   public static int method31247(Class8682 var0) {
      return var0.field39153;
   }

   // $VF: synthetic method
   public static Class8276 method31248(Class8682 var0) {
      return var0.field39158;
   }

   // $VF: synthetic method
   public static long method31249(Class8682 var0) {
      return var0.field39156;
   }

   // $VF: synthetic method
   public static long method31250(Class8682 var0) {
      return var0.field39155;
   }
}
