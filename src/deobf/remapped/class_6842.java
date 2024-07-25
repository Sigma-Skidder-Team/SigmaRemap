package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_6842 {
   private int field_35279;
   private int field_35278;
   private long field_35275;
   private long field_35276;
   private class_6819 field_35281;
   private class_6819 field_35280;
   private boolean field_35274 = false;
   private boolean field_35277 = false;

   public class_6842(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field_35279 = (int)var1;
         this.field_35278 = (int)var3;
         this.field_35275 = var1;
         this.field_35276 = var3;
         if (var1 * var3 >= class_2751.method_12428()) {
            this.field_35277 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3)) {
            this.field_35274 = true;
         }

         class_2751.method_12507(var1 * var3 > (long)class_7975.method_36102());
         this.field_35280 = new class_6819(var1);
         if (var1 != var3) {
            this.field_35281 = new class_6819(var3);
         } else {
            this.field_35281 = this.field_35280;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method_31363(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_35274) {
         if (var5 > 1 && this.field_35277) {
            this.method_31371(-1, var1, var2);
            this.method_31360(-1, var1, var2);
         } else {
            this.method_31376(-1, var1, var2);

            for (int var6 = 0; var6 < this.field_35279; var6++) {
               this.field_35281.method_31294(var1, var6 * this.field_35278, var2);
            }
         }
      } else if (var5 > 1 && this.field_35277 && this.field_35279 >= var5 && this.field_35278 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_35279 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_35279 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_8588(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_35278 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_35278 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_6035(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_35279; var15++) {
            this.field_35281.method_31294(var1, var15 * this.field_35278, var2);
         }

         double[] var16 = new double[this.field_35279];

         for (int var7 = 0; var7 < this.field_35278; var7++) {
            for (int var8 = 0; var8 < this.field_35279; var8++) {
               var16[var8] = var1[var8 * this.field_35278 + var7];
            }

            this.field_35280.method_31295(var16, var2);

            for (int var20 = 0; var20 < this.field_35279; var20++) {
               var1[var20 * this.field_35278 + var7] = var16[var20];
            }
         }
      }
   }

   public void method_31362(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_35274) {
         if (var5 > 1 && this.field_35277) {
            this.method_31370(-1, var1, var2);
            this.method_31359(-1, var1, var2);
         } else {
            this.method_31375(-1, var1, var2);

            for (long var6 = 0L; var6 < this.field_35275; var6++) {
               this.field_35281.method_31292(var1, var6 * this.field_35276, var2);
            }
         }
      } else if (var5 > 1 && this.field_35277 && this.field_35275 >= (long)var5 && this.field_35276 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field_35275 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field_35275 : var12 + var24;
            var23[var11] = class_1266.method_5694(new class_709(this, var12, var14, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field_35276 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field_35276 : var27 + var24;
            var23[var26] = class_1266.method_5694(new class_2197(this, var27, var28, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field_35275; var22++) {
            this.field_35281.method_31292(var1, var22 * this.field_35276, var2);
         }

         class_1702 var8 = new class_1702(this.field_35275, false);

         for (long var9 = 0L; var9 < this.field_35276; var9++) {
            for (long var16 = 0L; var16 < this.field_35275; var16++) {
               var8.method_36114(var16, var1.method_36107(var16 * this.field_35276 + var9));
            }

            this.field_35280.method_31293(var8, var2);

            for (long var29 = 0L; var29 < this.field_35275; var29++) {
               var1.method_36114(var29 * this.field_35276 + var9, var8.method_36107(var29));
            }
         }
      }
   }

   public void method_31364(double[][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_35274) {
         if (var5 > 1 && this.field_35277) {
            this.method_31372(-1, var1, var2);
            this.method_31361(-1, var1, var2);
         } else {
            this.method_31377(-1, var1, var2);

            for (int var6 = 0; var6 < this.field_35279; var6++) {
               this.field_35281.method_31295(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field_35277 && this.field_35279 >= var5 && this.field_35278 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_35279 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_35279 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_4465(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_35278 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_35278 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_4130(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_35279; var15++) {
            this.field_35281.method_31295(var1[var15], var2);
         }

         double[] var16 = new double[this.field_35279];

         for (int var7 = 0; var7 < this.field_35278; var7++) {
            for (int var8 = 0; var8 < this.field_35279; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field_35280.method_31295(var16, var2);

            for (int var20 = 0; var20 < this.field_35279; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   public void method_31366(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_35274) {
         if (var5 > 1 && this.field_35277) {
            this.method_31371(1, var1, var2);
            this.method_31360(1, var1, var2);
         } else {
            this.method_31376(1, var1, var2);

            for (int var6 = 0; var6 < this.field_35279; var6++) {
               this.field_35281.method_31288(var1, var6 * this.field_35278, var2);
            }
         }
      } else if (var5 > 1 && this.field_35277 && this.field_35279 >= var5 && this.field_35278 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_35279 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_35279 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_6540(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_35278 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_35278 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_7629(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_35279; var15++) {
            this.field_35281.method_31288(var1, var15 * this.field_35278, var2);
         }

         double[] var16 = new double[this.field_35279];

         for (int var7 = 0; var7 < this.field_35278; var7++) {
            for (int var8 = 0; var8 < this.field_35279; var8++) {
               var16[var8] = var1[var8 * this.field_35278 + var7];
            }

            this.field_35280.method_31289(var16, var2);

            for (int var20 = 0; var20 < this.field_35279; var20++) {
               var1[var20 * this.field_35278 + var7] = var16[var20];
            }
         }
      }
   }

   public void method_31365(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_35274) {
         if (var5 > 1 && this.field_35277) {
            this.method_31370(1, var1, var2);
            this.method_31359(1, var1, var2);
         } else {
            this.method_31375(1, var1, var2);

            for (long var6 = 0L; var6 < this.field_35275; var6++) {
               this.field_35281.method_31286(var1, var6 * this.field_35276, var2);
            }
         }
      } else if (var5 > 1 && this.field_35277 && this.field_35275 >= (long)var5 && this.field_35276 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field_35275 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field_35275 : var12 + var24;
            var23[var11] = class_1266.method_5694(new class_751(this, var12, var14, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field_35276 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field_35276 : var27 + var24;
            var23[var26] = class_1266.method_5694(new class_5242(this, var27, var28, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field_35275; var22++) {
            this.field_35281.method_31286(var1, var22 * this.field_35276, var2);
         }

         class_1702 var8 = new class_1702(this.field_35275, false);

         for (long var9 = 0L; var9 < this.field_35276; var9++) {
            for (long var16 = 0L; var16 < this.field_35275; var16++) {
               var8.method_36114(var16, var1.method_36107(var16 * this.field_35276 + var9));
            }

            this.field_35280.method_31287(var8, var2);

            for (long var29 = 0L; var29 < this.field_35275; var29++) {
               var1.method_36114(var29 * this.field_35276 + var9, var8.method_36107(var29));
            }
         }
      }
   }

   public void method_31367(double[][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_35274) {
         if (var5 > 1 && this.field_35277) {
            this.method_31372(1, var1, var2);
            this.method_31361(1, var1, var2);
         } else {
            this.method_31377(1, var1, var2);

            for (int var6 = 0; var6 < this.field_35279; var6++) {
               this.field_35281.method_31289(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field_35277 && this.field_35279 >= var5 && this.field_35278 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_35279 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_35279 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_748(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_35278 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_35278 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_5164(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_35279; var15++) {
            this.field_35281.method_31289(var1[var15], var2);
         }

         double[] var16 = new double[this.field_35279];

         for (int var7 = 0; var7 < this.field_35278; var7++) {
            for (int var8 = 0; var8 < this.field_35279; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field_35280.method_31289(var16, var2);

            for (int var20 = 0; var20 < this.field_35279; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   private void method_31371(int var1, double[] var2, boolean var3) {
      int var6 = class_6806.method_31195(this.field_35278, class_1266.method_5693());
      int var7 = 4 * this.field_35279;
      if (this.field_35278 == 2) {
         var7 >>= 1;
      } else if (this.field_35278 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = class_1266.method_5694(new class_7242(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_31370(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)class_6806.method_31196(this.field_35276, (long)class_1266.method_5693());
      long var7 = 4L * this.field_35275;
      if (this.field_35276 == 2L) {
         var7 >>= 1;
      } else if (this.field_35276 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      int var11 = var6;
      Future[] var12 = new Future[var6];

      for (int var13 = 0; var13 < var11; var13++) {
         long var14 = (long)var13;
         var12[var13] = class_1266.method_5694(new class_3688(this, var9, var1, var14, var11, var2, var3));
      }

      try {
         class_1266.method_5696(var12);
      } catch (InterruptedException var16) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method_31372(int var1, double[][] var2, boolean var3) {
      int var6 = class_6806.method_31195(this.field_35278, class_1266.method_5693());
      int var7 = 4 * this.field_35279;
      if (this.field_35278 == 2) {
         var7 >>= 1;
      } else if (this.field_35278 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = class_1266.method_5694(new class_3935(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_31360(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_35279 ? this.field_35279 : class_1266.method_5693();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_5862(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_31359(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_35275 ? this.field_35275 : (long)class_1266.method_5693());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         long var9 = (long)var8;
         var7[var8] = class_1266.method_5694(new class_3583(this, var1, var9, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var11) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method_31361(int var1, double[][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_35279 ? this.field_35279 : class_1266.method_5693();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_6728(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_6842.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_31376(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_35279;
      if (this.field_35278 != 2) {
         if (this.field_35278 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field_35278 <= 2) {
         if (this.field_35278 == 2) {
            for (int var8 = 0; var8 < this.field_35279; var8++) {
               int var10 = var8 * this.field_35278;
               var7[var8] = var2[var10];
               var7[this.field_35279 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field_35280.method_31288(var7, 0, var3);
               this.field_35280.method_31288(var7, this.field_35279, var3);
            } else {
               this.field_35280.method_31294(var7, 0, var3);
               this.field_35280.method_31294(var7, this.field_35279, var3);
            }

            for (int var12 = 0; var12 < this.field_35279; var12++) {
               int var18 = var12 * this.field_35278;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field_35279 + var12];
            }
         }
      } else if (var1 != -1) {
         for (byte var13 = 0; var13 < this.field_35278; var13 += 4) {
            for (int var9 = 0; var9 < this.field_35279; var9++) {
               int var19 = var9 * this.field_35278 + var13;
               int var11 = this.field_35279 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field_35279] = var2[var19 + 2];
               var7[var11 + 2 * this.field_35279] = var2[var19 + 3];
            }

            this.field_35280.method_31288(var7, 0, var3);
            this.field_35280.method_31288(var7, this.field_35279, var3);
            this.field_35280.method_31288(var7, 2 * this.field_35279, var3);
            this.field_35280.method_31288(var7, 3 * this.field_35279, var3);

            for (int var15 = 0; var15 < this.field_35279; var15++) {
               int var20 = var15 * this.field_35278 + var13;
               int var23 = this.field_35279 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field_35279];
               var2[var20 + 3] = var7[var23 + 2 * this.field_35279];
            }
         }
      } else {
         for (byte var14 = 0; var14 < this.field_35278; var14 += 4) {
            for (int var16 = 0; var16 < this.field_35279; var16++) {
               int var21 = var16 * this.field_35278 + var14;
               int var24 = this.field_35279 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field_35279] = var2[var21 + 2];
               var7[var24 + 2 * this.field_35279] = var2[var21 + 3];
            }

            this.field_35280.method_31294(var7, 0, var3);
            this.field_35280.method_31294(var7, this.field_35279, var3);
            this.field_35280.method_31294(var7, 2 * this.field_35279, var3);
            this.field_35280.method_31294(var7, 3 * this.field_35279, var3);

            for (int var17 = 0; var17 < this.field_35279; var17++) {
               int var22 = var17 * this.field_35278 + var14;
               int var25 = this.field_35279 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field_35279];
               var2[var22 + 3] = var7[var25 + 2 * this.field_35279];
            }
         }
      }
   }

   private void method_31375(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_35275;
      if (this.field_35276 != 2L) {
         if (this.field_35276 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (this.field_35276 <= 2L) {
         if (this.field_35276 == 2L) {
            for (long var9 = 0L; var9 < this.field_35275; var9++) {
               long var13 = var9 * this.field_35276;
               var8.method_36114(var9, var2.method_36107(var13));
               var8.method_36114(this.field_35275 + var9, var2.method_36107(var13 + 1L));
            }

            if (var1 != -1) {
               this.field_35280.method_31286(var8, 0L, var3);
               this.field_35280.method_31286(var8, this.field_35275, var3);
            } else {
               this.field_35280.method_31292(var8, 0L, var3);
               this.field_35280.method_31292(var8, this.field_35275, var3);
            }

            for (long var17 = 0L; var17 < this.field_35275; var17++) {
               long var23 = var17 * this.field_35276;
               var2.method_36114(var23, var8.method_36107(var17));
               var2.method_36114(var23 + 1L, var8.method_36107(this.field_35275 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field_35276; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field_35275; var11++) {
               long var24 = var11 * this.field_35276 + var18;
               long var15 = this.field_35275 + var11;
               var8.method_36114(var11, var2.method_36107(var24));
               var8.method_36114(var15, var2.method_36107(var24 + 1L));
               var8.method_36114(var15 + this.field_35275, var2.method_36107(var24 + 2L));
               var8.method_36114(var15 + 2L * this.field_35275, var2.method_36107(var24 + 3L));
            }

            this.field_35280.method_31286(var8, 0L, var3);
            this.field_35280.method_31286(var8, this.field_35275, var3);
            this.field_35280.method_31286(var8, 2L * this.field_35275, var3);
            this.field_35280.method_31286(var8, 3L * this.field_35275, var3);

            for (long var20 = 0L; var20 < this.field_35275; var20++) {
               long var25 = var20 * this.field_35276 + var18;
               long var28 = this.field_35275 + var20;
               var2.method_36114(var25, var8.method_36107(var20));
               var2.method_36114(var25 + 1L, var8.method_36107(var28));
               var2.method_36114(var25 + 2L, var8.method_36107(var28 + this.field_35275));
               var2.method_36114(var25 + 3L, var8.method_36107(var28 + 2L * this.field_35275));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field_35276; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field_35275; var21++) {
               long var26 = var21 * this.field_35276 + var19;
               long var29 = this.field_35275 + var21;
               var8.method_36114(var21, var2.method_36107(var26));
               var8.method_36114(var29, var2.method_36107(var26 + 1L));
               var8.method_36114(var29 + this.field_35275, var2.method_36107(var26 + 2L));
               var8.method_36114(var29 + 2L * this.field_35275, var2.method_36107(var26 + 3L));
            }

            this.field_35280.method_31292(var8, 0L, var3);
            this.field_35280.method_31292(var8, this.field_35275, var3);
            this.field_35280.method_31292(var8, 2L * this.field_35275, var3);
            this.field_35280.method_31292(var8, 3L * this.field_35275, var3);

            for (long var22 = 0L; var22 < this.field_35275; var22++) {
               long var27 = var22 * this.field_35276 + var19;
               long var30 = this.field_35275 + var22;
               var2.method_36114(var27, var8.method_36107(var22));
               var2.method_36114(var27 + 1L, var8.method_36107(var30));
               var2.method_36114(var27 + 2L, var8.method_36107(var30 + this.field_35275));
               var2.method_36114(var27 + 3L, var8.method_36107(var30 + 2L * this.field_35275));
            }
         }
      }
   }

   private void method_31377(int var1, double[][] var2, boolean var3) {
      int var6 = 4 * this.field_35279;
      if (this.field_35278 != 2) {
         if (this.field_35278 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field_35278 <= 2) {
         if (this.field_35278 == 2) {
            for (int var8 = 0; var8 < this.field_35279; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field_35279 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field_35280.method_31288(var7, 0, var3);
               this.field_35280.method_31288(var7, this.field_35279, var3);
            } else {
               this.field_35280.method_31294(var7, 0, var3);
               this.field_35280.method_31294(var7, this.field_35279, var3);
            }

            for (int var11 = 0; var11 < this.field_35279; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field_35279 + var11];
            }
         }
      } else if (var1 != -1) {
         for (byte var12 = 0; var12 < this.field_35278; var12 += 4) {
            for (int var9 = 0; var9 < this.field_35279; var9++) {
               int var10 = this.field_35279 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field_35279] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field_35279] = var2[var9][var12 + 3];
            }

            this.field_35280.method_31288(var7, 0, var3);
            this.field_35280.method_31288(var7, this.field_35279, var3);
            this.field_35280.method_31288(var7, 2 * this.field_35279, var3);
            this.field_35280.method_31288(var7, 3 * this.field_35279, var3);

            for (int var14 = 0; var14 < this.field_35279; var14++) {
               int var17 = this.field_35279 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field_35279];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field_35279];
            }
         }
      } else {
         for (byte var13 = 0; var13 < this.field_35278; var13 += 4) {
            for (int var15 = 0; var15 < this.field_35279; var15++) {
               int var18 = this.field_35279 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field_35279] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field_35279] = var2[var15][var13 + 3];
            }

            this.field_35280.method_31294(var7, 0, var3);
            this.field_35280.method_31294(var7, this.field_35279, var3);
            this.field_35280.method_31294(var7, 2 * this.field_35279, var3);
            this.field_35280.method_31294(var7, 3 * this.field_35279, var3);

            for (int var16 = 0; var16 < this.field_35279; var16++) {
               int var19 = this.field_35279 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field_35279];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field_35279];
            }
         }
      }
   }
}
