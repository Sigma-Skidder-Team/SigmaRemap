package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class7821 {
   private int field33555;
   private int field33556;
   private long field33557;
   private long field33558;
   private Class8174 field33559;
   private Class8174 field33560;
   private boolean field33561 = false;
   private boolean field33562 = false;

   public Class7821(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field33555 = (int)var1;
         this.field33556 = (int)var3;
         this.field33557 = var1;
         this.field33558 = var3;
         if (var1 * var3 >= Class7796.method25893()) {
            this.field33562 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3)) {
            this.field33561 = true;
         }

         Class7796.method25902(var1 * var3 > (long)Class2373.method9693());
         this.field33560 = new Class8174(var1);
         if (var1 != var3) {
            this.field33559 = new Class8174(var3);
         } else {
            this.field33559 = this.field33560;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method26131(float[] var1) {
      int var4 = Class7008.method21726();
      if (this.field33561) {
         if (var4 > 1 && this.field33562) {
            this.method26137(-1, var1, true);
            this.method26140(-1, var1, true);
         } else {
            this.method26143(-1, var1, true);

            for (int var5 = 0; var5 < this.field33555; var5++) {
               this.field33559.method28457(var1, var5 * this.field33556);
            }
         }

         this.method26146(var1);
      } else {
         if (var4 > 1 && this.field33562 && this.field33555 >= var4 && this.field33556 >= var4) {
            Future[] var16 = new Future[var4];
            int var17 = this.field33555 / var4;

            for (int var20 = 0; var20 < var4; var20++) {
               int var8 = var20 * var17;
               int var9 = var20 == var4 - 1 ? this.field33555 : var8 + var17;
               var16[var20] = Class7008.method21729(new Class674(this, var8, var9, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var13);
            }

            var17 = this.field33556 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var22 = var21 * var17;
               int var23 = var21 == var4 - 1 ? this.field33556 : var22 + var17;
               var16[var21] = Class7008.method21729(new Class667(this, var22, var23, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var10) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var14 = 0; var14 < this.field33555; var14++) {
               this.field33559.method28457(var1, var14 * this.field33556);
            }

            float[] var15 = new float[this.field33555];

            for (int var6 = 0; var6 < this.field33556; var6++) {
               for (int var7 = 0; var7 < this.field33555; var7++) {
                  var15[var7] = var1[var7 * this.field33556 + var6];
               }

               this.field33560.method28455(var15);

               for (int var19 = 0; var19 < this.field33555; var19++) {
                  var1[var19 * this.field33556 + var6] = var15[var19];
               }
            }
         }

         this.method26146(var1);
      }
   }

   public void method26132(Class2378 var1) {
      int var4 = Class7008.method21726();
      if (this.field33561) {
         if (var4 > 1 && this.field33562) {
            this.method26138(-1, var1, true);
            this.method26141(-1, var1, true);
         } else {
            this.method26144(-1, var1, true);

            for (long var5 = 0L; var5 < this.field33557; var5++) {
               this.field33559.method28458(var1, var5 * this.field33558);
            }
         }

         this.method26147(var1);
      } else {
         if (var4 > 1 && this.field33562 && this.field33557 >= (long)var4 && this.field33558 >= (long)var4) {
            Future[] var22 = new Future[var4];
            long var23 = this.field33557 / (long)var4;

            for (int var10 = 0; var10 < var4; var10++) {
               long var11 = (long)var10 * var23;
               long var13 = var10 == var4 - 1 ? this.field33557 : var11 + var23;
               var22[var10] = Class7008.method21729(new Class425(this, var11, var13, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var19) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var19);
            } catch (ExecutionException var20) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var20);
            }

            var23 = this.field33558 / (long)var4;

            for (int var25 = 0; var25 < var4; var25++) {
               long var26 = (long)var25 * var23;
               long var27 = var25 == var4 - 1 ? this.field33558 : var26 + var23;
               var22[var25] = Class7008.method21729(new Class1366(this, var26, var27, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var17) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var17);
            } catch (ExecutionException var18) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var18);
            }
         } else {
            for (long var21 = 0L; var21 < this.field33557; var21++) {
               this.field33559.method28458(var1, var21 * this.field33558);
            }

            Class2378 var7 = new Class2378(this.field33557, false);

            for (long var8 = 0L; var8 < this.field33558; var8++) {
               for (long var15 = 0L; var15 < this.field33557; var15++) {
                  var7.method9685(var15, var1.method9651(var15 * this.field33558 + var8));
               }

               this.field33560.method28456(var7);

               for (long var28 = 0L; var28 < this.field33557; var28++) {
                  var1.method9685(var28 * this.field33558 + var8, var7.method9651(var28));
               }
            }
         }

         this.method26147(var1);
      }
   }

   public void method26133(float[][] var1) {
      int var4 = Class7008.method21726();
      if (this.field33561) {
         if (var4 > 1 && this.field33562) {
            this.method26139(-1, var1, true);
            this.method26142(-1, var1, true);
         } else {
            this.method26145(-1, var1, true);

            for (int var5 = 0; var5 < this.field33555; var5++) {
               this.field33559.method28455(var1[var5]);
            }
         }

         this.method26148(var1);
      } else {
         if (var4 > 1 && this.field33562 && this.field33555 >= var4 && this.field33556 >= var4) {
            Future[] var16 = new Future[var4];
            int var17 = this.field33555 / var4;

            for (int var20 = 0; var20 < var4; var20++) {
               int var8 = var20 * var17;
               int var9 = var20 == var4 - 1 ? this.field33555 : var8 + var17;
               var16[var20] = Class7008.method21729(new Class739(this, var8, var9, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var13);
            }

            var17 = this.field33556 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var22 = var21 * var17;
               int var23 = var21 == var4 - 1 ? this.field33556 : var22 + var17;
               var16[var21] = Class7008.method21729(new Class530(this, var22, var23, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var10) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var14 = 0; var14 < this.field33555; var14++) {
               this.field33559.method28455(var1[var14]);
            }

            float[] var15 = new float[this.field33555];

            for (int var6 = 0; var6 < this.field33556; var6++) {
               for (int var7 = 0; var7 < this.field33555; var7++) {
                  var15[var7] = var1[var7][var6];
               }

               this.field33560.method28455(var15);

               for (int var19 = 0; var19 < this.field33555; var19++) {
                  var1[var19][var6] = var15[var19];
               }
            }
         }

         this.method26148(var1);
      }
   }

   public void method26134(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33561) {
         if (var5 > 1 && this.field33562) {
            this.method26137(1, var1, var2);
            this.method26140(1, var1, var2);
         } else {
            this.method26143(1, var1, var2);

            for (int var6 = 0; var6 < this.field33555; var6++) {
               this.field33559.method28461(var1, var6 * this.field33556, var2);
            }
         }

         this.method26146(var1);
      } else {
         if (var5 > 1 && this.field33562 && this.field33555 >= var5 && this.field33556 >= var5) {
            Future[] var17 = new Future[var5];
            int var18 = this.field33555 / var5;

            for (int var21 = 0; var21 < var5; var21++) {
               int var9 = var21 * var18;
               int var10 = var21 == var5 - 1 ? this.field33555 : var9 + var18;
               var17[var21] = Class7008.method21729(new Class745(this, var9, var10, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var14);
            }

            var18 = this.field33556 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var23 = var22 * var18;
               int var24 = var22 == var5 - 1 ? this.field33556 : var23 + var18;
               var17[var22] = Class7008.method21729(new Class641(this, var23, var24, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var11) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var15 = 0; var15 < this.field33555; var15++) {
               this.field33559.method28461(var1, var15 * this.field33556, var2);
            }

            float[] var16 = new float[this.field33555];

            for (int var7 = 0; var7 < this.field33556; var7++) {
               for (int var8 = 0; var8 < this.field33555; var8++) {
                  var16[var8] = var1[var8 * this.field33556 + var7];
               }

               this.field33560.method28459(var16, var2);

               for (int var20 = 0; var20 < this.field33555; var20++) {
                  var1[var20 * this.field33556 + var7] = var16[var20];
               }
            }
         }

         this.method26146(var1);
      }
   }

   public void method26135(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33561) {
         if (var5 > 1 && this.field33562) {
            this.method26138(1, var1, var2);
            this.method26141(1, var1, var2);
         } else {
            this.method26144(1, var1, var2);

            for (long var6 = 0L; var6 < this.field33557; var6++) {
               this.field33559.method28462(var1, var6 * this.field33558, var2);
            }
         }

         this.method26147(var1);
      } else {
         if (var5 > 1 && this.field33562 && this.field33557 >= (long)var5 && this.field33558 >= (long)var5) {
            Future[] var23 = new Future[var5];
            long var24 = this.field33557 / (long)var5;

            for (int var11 = 0; var11 < var5; var11++) {
               long var12 = (long)var11 * var24;
               long var14 = var11 == var5 - 1 ? this.field33557 : var12 + var24;
               var23[var11] = Class7008.method21729(new Class1368(this, var12, var14, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var20) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var20);
            } catch (ExecutionException var21) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var21);
            }

            var24 = this.field33558 / (long)var5;

            for (int var26 = 0; var26 < var5; var26++) {
               long var27 = (long)var26 * var24;
               long var28 = var26 == var5 - 1 ? this.field33558 : var27 + var24;
               var23[var26] = Class7008.method21729(new Class1494(this, var27, var28, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var18) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var18);
            } catch (ExecutionException var19) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var19);
            }
         } else {
            for (long var22 = 0L; var22 < this.field33557; var22++) {
               this.field33559.method28462(var1, var22 * this.field33558, var2);
            }

            Class2378 var8 = new Class2378(this.field33557, false);

            for (long var9 = 0L; var9 < this.field33558; var9++) {
               for (long var16 = 0L; var16 < this.field33557; var16++) {
                  var8.method9685(var16, var1.method9651(var16 * this.field33558 + var9));
               }

               this.field33560.method28460(var8, var2);

               for (long var29 = 0L; var29 < this.field33557; var29++) {
                  var1.method9685(var29 * this.field33558 + var9, var8.method9651(var29));
               }
            }
         }

         this.method26147(var1);
      }
   }

   public void method26136(float[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33561) {
         if (var5 > 1 && this.field33562) {
            this.method26139(1, var1, var2);
            this.method26142(1, var1, var2);
         } else {
            this.method26145(1, var1, var2);

            for (int var6 = 0; var6 < this.field33555; var6++) {
               this.field33559.method28459(var1[var6], var2);
            }
         }

         this.method26148(var1);
      } else {
         if (var5 > 1 && this.field33562 && this.field33555 >= var5 && this.field33556 >= var5) {
            Future[] var17 = new Future[var5];
            int var18 = this.field33555 / var5;

            for (int var21 = 0; var21 < var5; var21++) {
               int var9 = var21 * var18;
               int var10 = var21 == var5 - 1 ? this.field33555 : var9 + var18;
               var17[var21] = Class7008.method21729(new Class546(this, var9, var10, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var14);
            }

            var18 = this.field33556 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var23 = var22 * var18;
               int var24 = var22 == var5 - 1 ? this.field33556 : var23 + var18;
               var17[var22] = Class7008.method21729(new Class1545(this, var23, var24, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var11) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var15 = 0; var15 < this.field33555; var15++) {
               this.field33559.method28459(var1[var15], var2);
            }

            float[] var16 = new float[this.field33555];

            for (int var7 = 0; var7 < this.field33556; var7++) {
               for (int var8 = 0; var8 < this.field33555; var8++) {
                  var16[var8] = var1[var8][var7];
               }

               this.field33560.method28459(var16, var2);

               for (int var20 = 0; var20 < this.field33555; var20++) {
                  var1[var20][var7] = var16[var20];
               }
            }
         }

         this.method26148(var1);
      }
   }

   private void method26137(int var1, float[] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field33556, Class7008.method21726());
      int var7 = 4 * this.field33555;
      if (this.field33556 == 2) {
         var7 >>= 1;
      } else if (this.field33556 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Class7008.method21729(new Class1500(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method26138(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)Class9044.method33604(this.field33558, (long)Class7008.method21726());
      long var7 = 4L * this.field33557;
      if (this.field33558 == 2L) {
         var7 >>= 1;
      } else if (this.field33558 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      int var11 = var6;
      Future[] var12 = new Future[var6];

      for (int var13 = 0; var13 < var11; var13++) {
         long var14 = (long)var13;
         var12[var13] = Class7008.method21729(new Class1475(this, var9, var1, var14, var11, var2, var3));
      }

      try {
         Class7008.method21730(var12);
      } catch (InterruptedException var16) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method26139(int var1, float[][] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field33556, Class7008.method21726());
      int var7 = 4 * this.field33555;
      if (this.field33556 == 2) {
         var7 >>= 1;
      } else if (this.field33556 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Class7008.method21729(new Class1442(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method26140(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field33555 ? this.field33555 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class459(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method26141(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field33557 ? this.field33557 : (long)Class7008.method21726());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         long var9 = (long)var8;
         var7[var8] = Class7008.method21729(new Class1592(this, var1, var9, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method26142(int var1, float[][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field33555 ? this.field33555 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class1631(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class7821.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method26143(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field33555;
      if (this.field33556 != 2) {
         if (this.field33556 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (this.field33556 <= 2) {
         if (this.field33556 == 2) {
            for (int var8 = 0; var8 < this.field33555; var8++) {
               int var10 = var8 * this.field33556;
               var7[var8] = var2[var10];
               var7[this.field33555 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field33560.method28461(var7, 0, var3);
               this.field33560.method28461(var7, this.field33555, var3);
            } else {
               this.field33560.method28457(var7, 0);
               this.field33560.method28457(var7, this.field33555);
            }

            for (int var12 = 0; var12 < this.field33555; var12++) {
               int var18 = var12 * this.field33556;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field33555 + var12];
            }
         }
      } else if (var1 != -1) {
         for (int var13 = 0; var13 < this.field33556; var13 += 4) {
            for (int var9 = 0; var9 < this.field33555; var9++) {
               int var19 = var9 * this.field33556 + var13;
               int var11 = this.field33555 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field33555] = var2[var19 + 2];
               var7[var11 + 2 * this.field33555] = var2[var19 + 3];
            }

            this.field33560.method28461(var7, 0, var3);
            this.field33560.method28461(var7, this.field33555, var3);
            this.field33560.method28461(var7, 2 * this.field33555, var3);
            this.field33560.method28461(var7, 3 * this.field33555, var3);

            for (int var15 = 0; var15 < this.field33555; var15++) {
               int var20 = var15 * this.field33556 + var13;
               int var23 = this.field33555 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field33555];
               var2[var20 + 3] = var7[var23 + 2 * this.field33555];
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field33556; var14 += 4) {
            for (int var16 = 0; var16 < this.field33555; var16++) {
               int var21 = var16 * this.field33556 + var14;
               int var24 = this.field33555 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field33555] = var2[var21 + 2];
               var7[var24 + 2 * this.field33555] = var2[var21 + 3];
            }

            this.field33560.method28457(var7, 0);
            this.field33560.method28457(var7, this.field33555);
            this.field33560.method28457(var7, 2 * this.field33555);
            this.field33560.method28457(var7, 3 * this.field33555);

            for (int var17 = 0; var17 < this.field33555; var17++) {
               int var22 = var17 * this.field33556 + var14;
               int var25 = this.field33555 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field33555];
               var2[var22 + 3] = var7[var25 + 2 * this.field33555];
            }
         }
      }
   }

   private void method26144(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field33557;
      if (this.field33558 != 2L) {
         if (this.field33558 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (this.field33558 <= 2L) {
         if (this.field33558 == 2L) {
            for (long var9 = 0L; var9 < this.field33557; var9++) {
               long var13 = var9 * this.field33558;
               var8.method9685(var9, var2.method9651(var13));
               var8.method9685(this.field33557 + var9, var2.method9651(var13 + 1L));
            }

            if (var1 != -1) {
               this.field33560.method28462(var8, 0L, var3);
               this.field33560.method28462(var8, this.field33557, var3);
            } else {
               this.field33560.method28458(var8, 0L);
               this.field33560.method28458(var8, this.field33557);
            }

            for (long var17 = 0L; var17 < this.field33557; var17++) {
               long var23 = var17 * this.field33558;
               var2.method9685(var23, var8.method9651(var17));
               var2.method9685(var23 + 1L, var8.method9651(this.field33557 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field33558; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field33557; var11++) {
               long var24 = var11 * this.field33558 + var18;
               long var15 = this.field33557 + var11;
               var8.method9685(var11, var2.method9651(var24));
               var8.method9685(var15, var2.method9651(var24 + 1L));
               var8.method9685(var15 + this.field33557, var2.method9651(var24 + 2L));
               var8.method9685(var15 + 2L * this.field33557, var2.method9651(var24 + 3L));
            }

            this.field33560.method28462(var8, 0L, var3);
            this.field33560.method28462(var8, this.field33557, var3);
            this.field33560.method28462(var8, 2L * this.field33557, var3);
            this.field33560.method28462(var8, 3L * this.field33557, var3);

            for (long var20 = 0L; var20 < this.field33557; var20++) {
               long var25 = var20 * this.field33558 + var18;
               long var28 = this.field33557 + var20;
               var2.method9685(var25, var8.method9651(var20));
               var2.method9685(var25 + 1L, var8.method9651(var28));
               var2.method9685(var25 + 2L, var8.method9651(var28 + this.field33557));
               var2.method9685(var25 + 3L, var8.method9651(var28 + 2L * this.field33557));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field33558; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field33557; var21++) {
               long var26 = var21 * this.field33558 + var19;
               long var29 = this.field33557 + var21;
               var8.method9685(var21, var2.method9651(var26));
               var8.method9685(var29, var2.method9651(var26 + 1L));
               var8.method9685(var29 + this.field33557, var2.method9651(var26 + 2L));
               var8.method9685(var29 + 2L * this.field33557, var2.method9651(var26 + 3L));
            }

            this.field33560.method28458(var8, 0L);
            this.field33560.method28458(var8, this.field33557);
            this.field33560.method28458(var8, 2L * this.field33557);
            this.field33560.method28458(var8, 3L * this.field33557);

            for (long var22 = 0L; var22 < this.field33557; var22++) {
               long var27 = var22 * this.field33558 + var19;
               long var30 = this.field33557 + var22;
               var2.method9685(var27, var8.method9651(var22));
               var2.method9685(var27 + 1L, var8.method9651(var30));
               var2.method9685(var27 + 2L, var8.method9651(var30 + this.field33557));
               var2.method9685(var27 + 3L, var8.method9651(var30 + 2L * this.field33557));
            }
         }
      }
   }

   private void method26145(int var1, float[][] var2, boolean var3) {
      int var6 = 4 * this.field33555;
      if (this.field33556 != 2) {
         if (this.field33556 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (this.field33556 <= 2) {
         if (this.field33556 == 2) {
            for (int var8 = 0; var8 < this.field33555; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field33555 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field33560.method28461(var7, 0, var3);
               this.field33560.method28461(var7, this.field33555, var3);
            } else {
               this.field33560.method28457(var7, 0);
               this.field33560.method28457(var7, this.field33555);
            }

            for (int var11 = 0; var11 < this.field33555; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field33555 + var11];
            }
         }
      } else if (var1 != -1) {
         for (int var12 = 0; var12 < this.field33556; var12 += 4) {
            for (int var9 = 0; var9 < this.field33555; var9++) {
               int var10 = this.field33555 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field33555] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field33555] = var2[var9][var12 + 3];
            }

            this.field33560.method28461(var7, 0, var3);
            this.field33560.method28461(var7, this.field33555, var3);
            this.field33560.method28461(var7, 2 * this.field33555, var3);
            this.field33560.method28461(var7, 3 * this.field33555, var3);

            for (int var14 = 0; var14 < this.field33555; var14++) {
               int var17 = this.field33555 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field33555];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field33555];
            }
         }
      } else {
         for (int var13 = 0; var13 < this.field33556; var13 += 4) {
            for (int var15 = 0; var15 < this.field33555; var15++) {
               int var18 = this.field33555 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field33555] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field33555] = var2[var15][var13 + 3];
            }

            this.field33560.method28457(var7, 0);
            this.field33560.method28457(var7, this.field33555);
            this.field33560.method28457(var7, 2 * this.field33555);
            this.field33560.method28457(var7, 3 * this.field33555);

            for (int var16 = 0; var16 < this.field33555; var16++) {
               int var19 = this.field33555 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field33555];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field33555];
            }
         }
      }
   }

   private void method26146(float[] var1) {
      for (int var4 = 0; var4 <= this.field33555 / 2; var4++) {
         int var5 = (this.field33555 - var4) % this.field33555;
         int var6 = var4 * this.field33556;
         int var7 = var5 * this.field33556;

         for (int var8 = 0; var8 <= this.field33556 / 2; var8++) {
            int var9 = (this.field33556 - var8) % this.field33556;
            float var10 = var1[var6 + var8];
            float var11 = var1[var7 + var8];
            float var12 = var1[var6 + var9];
            float var13 = var1[var7 + var9];
            float var14 = (var10 + var13 - (var11 + var12)) / 2.0F;
            var1[var6 + var8] = var10 - var14;
            var1[var7 + var8] = var11 + var14;
            var1[var6 + var9] = var12 + var14;
            var1[var7 + var9] = var13 - var14;
         }
      }
   }

   private void method26147(Class2378 var1) {
      for (long var4 = 0L; var4 <= this.field33557 / 2L; var4++) {
         long var6 = (this.field33557 - var4) % this.field33557;
         long var8 = var4 * this.field33558;
         long var10 = var6 * this.field33558;

         for (long var12 = 0L; var12 <= this.field33558 / 2L; var12++) {
            long var14 = (this.field33558 - var12) % this.field33558;
            float var16 = var1.method9651(var8 + var12);
            float var17 = var1.method9651(var10 + var12);
            float var18 = var1.method9651(var8 + var14);
            float var19 = var1.method9651(var10 + var14);
            float var20 = (var16 + var19 - (var17 + var18)) / 2.0F;
            var1.method9685(var8 + var12, var16 - var20);
            var1.method9685(var10 + var12, var17 + var20);
            var1.method9685(var8 + var14, var18 + var20);
            var1.method9685(var10 + var14, var19 - var20);
         }
      }
   }

   private void method26148(float[][] var1) {
      for (int var4 = 0; var4 <= this.field33555 / 2; var4++) {
         int var5 = (this.field33555 - var4) % this.field33555;

         for (int var6 = 0; var6 <= this.field33556 / 2; var6++) {
            int var7 = (this.field33556 - var6) % this.field33556;
            float var8 = var1[var4][var6];
            float var9 = var1[var5][var6];
            float var10 = var1[var4][var7];
            float var11 = var1[var5][var7];
            float var12 = (var8 + var11 - (var9 + var10)) / 2.0F;
            var1[var4][var6] = var8 - var12;
            var1[var5][var6] = var9 + var12;
            var1[var4][var7] = var10 + var12;
            var1[var5][var7] = var11 - var12;
         }
      }
   }

   // $VF: synthetic method
   public static int method26149(Class7821 var0) {
      return var0.field33556;
   }

   // $VF: synthetic method
   public static Class8174 method26150(Class7821 var0) {
      return var0.field33559;
   }

   // $VF: synthetic method
   public static int method26151(Class7821 var0) {
      return var0.field33555;
   }

   // $VF: synthetic method
   public static Class8174 method26152(Class7821 var0) {
      return var0.field33560;
   }

   // $VF: synthetic method
   public static long method26153(Class7821 var0) {
      return var0.field33558;
   }

   // $VF: synthetic method
   public static long method26154(Class7821 var0) {
      return var0.field33557;
   }
}
