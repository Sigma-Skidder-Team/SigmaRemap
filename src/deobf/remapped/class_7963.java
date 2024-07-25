package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_7963 {
   private int field_40799;
   private int field_40802;
   private long field_40798;
   private long field_40800;
   private class_9697 field_40797;
   private class_9697 field_40803;
   private boolean field_40801 = false;
   private boolean field_40796 = false;

   public class_7963(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field_40799 = (int)var1;
         this.field_40802 = (int)var3;
         this.field_40798 = var1;
         this.field_40800 = var3;
         if (var1 * var3 >= class_2751.method_12428()) {
            this.field_40796 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3)) {
            this.field_40801 = true;
         }

         class_2751.method_12507(var1 * var3 > (long)class_7975.method_36102());
         this.field_40803 = new class_9697(var1);
         if (var1 != var3) {
            this.field_40797 = new class_9697(var3);
         } else {
            this.field_40797 = this.field_40803;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method_36027(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_40801) {
         if (var5 > 1 && this.field_40796) {
            this.method_36046(-1, var1, var2);
            this.method_36043(-1, var1, var2);
         } else {
            this.method_36033(-1, var1, var2);

            for (int var6 = 0; var6 < this.field_40799; var6++) {
               this.field_40797.method_44815(var1, var6 * this.field_40802, var2);
            }
         }
      } else if (var5 > 1 && this.field_40796 && this.field_40799 >= var5 && this.field_40802 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_40799 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_40799 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_194(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_40802 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_40802 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_755(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_40799; var15++) {
            this.field_40797.method_44815(var1, var15 * this.field_40802, var2);
         }

         double[] var16 = new double[this.field_40799];

         for (int var7 = 0; var7 < this.field_40802; var7++) {
            for (int var8 = 0; var8 < this.field_40799; var8++) {
               var16[var8] = var1[var8 * this.field_40802 + var7];
            }

            this.field_40803.method_44816(var16, var2);

            for (int var20 = 0; var20 < this.field_40799; var20++) {
               var1[var20 * this.field_40802 + var7] = var16[var20];
            }
         }
      }
   }

   public void method_36026(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_40801) {
         if (var5 > 1 && this.field_40796) {
            this.method_36045(-1, var1, var2);
            this.method_36042(-1, var1, var2);
         } else {
            this.method_36032(-1, var1, var2);

            for (long var6 = 0L; var6 < this.field_40798; var6++) {
               this.field_40797.method_44813(var1, var6 * this.field_40800, var2);
            }
         }
      } else if (var5 > 1 && this.field_40796 && this.field_40798 >= (long)var5 && this.field_40800 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field_40798 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field_40798 : var12 + var24;
            var23[var11] = class_1266.method_5694(new class_4659(this, var12, var14, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field_40800 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field_40800 : var27 + var24;
            var23[var26] = class_1266.method_5694(new class_9095(this, var27, var28, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field_40798; var22++) {
            this.field_40797.method_44813(var1, var22 * this.field_40800, var2);
         }

         class_1702 var8 = new class_1702(this.field_40798, false);

         for (long var9 = 0L; var9 < this.field_40800; var9++) {
            for (long var16 = 0L; var16 < this.field_40798; var16++) {
               var8.method_36114(var16, var1.method_36107(var16 * this.field_40800 + var9));
            }

            this.field_40803.method_44814(var8, var2);

            for (long var29 = 0L; var29 < this.field_40798; var29++) {
               var1.method_36114(var29 * this.field_40800 + var9, var8.method_36107(var29));
            }
         }
      }
   }

   public void method_36028(double[][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_40801) {
         if (var5 > 1 && this.field_40796) {
            this.method_36047(-1, var1, var2);
            this.method_36044(-1, var1, var2);
         } else {
            this.method_36034(-1, var1, var2);

            for (int var6 = 0; var6 < this.field_40799; var6++) {
               this.field_40797.method_44816(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field_40796 && this.field_40799 >= var5 && this.field_40802 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_40799 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_40799 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_4060(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_40802 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_40802 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_8619(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_40799; var15++) {
            this.field_40797.method_44816(var1[var15], var2);
         }

         double[] var16 = new double[this.field_40799];

         for (int var7 = 0; var7 < this.field_40802; var7++) {
            for (int var8 = 0; var8 < this.field_40799; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field_40803.method_44816(var16, var2);

            for (int var20 = 0; var20 < this.field_40799; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   public void method_36030(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_40801) {
         if (var5 > 1 && this.field_40796) {
            this.method_36046(1, var1, var2);
            this.method_36043(1, var1, var2);
         } else {
            this.method_36033(1, var1, var2);

            for (int var6 = 0; var6 < this.field_40799; var6++) {
               this.field_40797.method_44820(var1, var6 * this.field_40802, var2);
            }
         }
      } else if (var5 > 1 && this.field_40796 && this.field_40799 >= var5 && this.field_40802 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_40799 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_40799 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_7783(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_40802 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_40802 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_2211(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_40799; var15++) {
            this.field_40797.method_44820(var1, var15 * this.field_40802, var2);
         }

         double[] var16 = new double[this.field_40799];

         for (int var7 = 0; var7 < this.field_40802; var7++) {
            for (int var8 = 0; var8 < this.field_40799; var8++) {
               var16[var8] = var1[var8 * this.field_40802 + var7];
            }

            this.field_40803.method_44821(var16, var2);

            for (int var20 = 0; var20 < this.field_40799; var20++) {
               var1[var20 * this.field_40802 + var7] = var16[var20];
            }
         }
      }
   }

   public void method_36029(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_40801) {
         if (var5 > 1 && this.field_40796) {
            this.method_36045(1, var1, var2);
            this.method_36042(1, var1, var2);
         } else {
            this.method_36032(1, var1, var2);

            for (long var6 = 0L; var6 < this.field_40798; var6++) {
               this.field_40797.method_44818(var1, var6 * this.field_40800, var2);
            }
         }
      } else if (var5 > 1 && this.field_40796 && this.field_40798 >= (long)var5 && this.field_40800 >= (long)var5) {
         Future[] var23 = new Future[var5];
         long var24 = this.field_40798 / (long)var5;

         for (int var11 = 0; var11 < var5; var11++) {
            long var12 = (long)var11 * var24;
            long var14 = var11 == var5 - 1 ? this.field_40798 : var12 + var24;
            var23[var11] = class_1266.method_5694(new class_1417(this, var12, var14, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var20) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var21);
         }

         var24 = this.field_40800 / (long)var5;

         for (int var26 = 0; var26 < var5; var26++) {
            long var27 = (long)var26 * var24;
            long var28 = var26 == var5 - 1 ? this.field_40800 : var27 + var24;
            var23[var26] = class_1266.method_5694(new class_6914(this, var27, var28, var1, var2));
         }

         try {
            class_1266.method_5696(var23);
         } catch (InterruptedException var18) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var19);
         }
      } else {
         for (long var22 = 0L; var22 < this.field_40798; var22++) {
            this.field_40797.method_44818(var1, var22 * this.field_40800, var2);
         }

         class_1702 var8 = new class_1702(this.field_40798, false);

         for (long var9 = 0L; var9 < this.field_40800; var9++) {
            for (long var16 = 0L; var16 < this.field_40798; var16++) {
               var8.method_36114(var16, var1.method_36107(var16 * this.field_40800 + var9));
            }

            this.field_40803.method_44819(var8, var2);

            for (long var29 = 0L; var29 < this.field_40798; var29++) {
               var1.method_36114(var29 * this.field_40800 + var9, var8.method_36107(var29));
            }
         }
      }
   }

   public void method_36031(double[][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_40801) {
         if (var5 > 1 && this.field_40796) {
            this.method_36047(1, var1, var2);
            this.method_36044(1, var1, var2);
         } else {
            this.method_36034(1, var1, var2);

            for (int var6 = 0; var6 < this.field_40799; var6++) {
               this.field_40797.method_44821(var1[var6], var2);
            }
         }
      } else if (var5 > 1 && this.field_40796 && this.field_40799 >= var5 && this.field_40802 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field_40799 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var9 = var21 * var18;
            int var10 = var21 == var5 - 1 ? this.field_40799 : var9 + var18;
            var17[var21] = class_1266.method_5694(new class_8518(this, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field_40802 / var5;

         for (int var22 = 0; var22 < var5; var22++) {
            int var23 = var22 * var18;
            int var24 = var22 == var5 - 1 ? this.field_40802 : var23 + var18;
            var17[var22] = class_1266.method_5694(new class_8673(this, var23, var24, var1, var2));
         }

         try {
            class_1266.method_5696(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field_40799; var15++) {
            this.field_40797.method_44821(var1[var15], var2);
         }

         double[] var16 = new double[this.field_40799];

         for (int var7 = 0; var7 < this.field_40802; var7++) {
            for (int var8 = 0; var8 < this.field_40799; var8++) {
               var16[var8] = var1[var8][var7];
            }

            this.field_40803.method_44821(var16, var2);

            for (int var20 = 0; var20 < this.field_40799; var20++) {
               var1[var20][var7] = var16[var20];
            }
         }
      }
   }

   private void method_36046(int var1, double[] var2, boolean var3) {
      int var6 = class_6806.method_31195(this.field_40802, class_1266.method_5693());
      int var7 = 4 * this.field_40799;
      if (this.field_40802 == 2) {
         var7 >>= 1;
      } else if (this.field_40802 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var6; var11++) {
         var10[var11] = class_1266.method_5694(new class_4672(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_36045(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)class_6806.method_31196(this.field_40800, (long)class_1266.method_5693());
      long var7 = 4L * this.field_40798;
      if (this.field_40800 == 2L) {
         var7 >>= 1;
      } else if (this.field_40800 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      long var11 = (long)var6;
      Future[] var13 = new Future[var6];

      for (int var14 = 0; var14 < var6; var14++) {
         long var15 = (long)var14;
         var13[var14] = class_1266.method_5694(new class_6276(this, var9, var1, var15, var11, var2, var3));
      }

      try {
         class_1266.method_5696(var13);
      } catch (InterruptedException var17) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var17);
      } catch (ExecutionException var18) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var18);
      }
   }

   private void method_36047(int var1, double[][] var2, boolean var3) {
      int var6 = class_6806.method_31195(this.field_40802, class_1266.method_5693());
      int var7 = 4 * this.field_40799;
      if (this.field_40802 == 2) {
         var7 >>= 1;
      } else if (this.field_40802 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var6; var11++) {
         var10[var11] = class_1266.method_5694(new class_8842(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_36043(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_40799 ? this.field_40799 : class_1266.method_5693();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_3830(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_36042(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_40798 ? this.field_40798 : (long)class_1266.method_5693());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_2273(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_36044(int var1, double[][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_40799 ? this.field_40799 : class_1266.method_5693();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_6888(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_7963.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_36033(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_40799;
      if (this.field_40802 != 2) {
         if (this.field_40802 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field_40802 <= 2) {
         if (this.field_40802 == 2) {
            for (int var8 = 0; var8 < this.field_40799; var8++) {
               int var10 = var8 * this.field_40802;
               var7[var8] = var2[var10];
               var7[this.field_40799 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field_40803.method_44820(var7, 0, var3);
               this.field_40803.method_44820(var7, this.field_40799, var3);
            } else {
               this.field_40803.method_44815(var7, 0, var3);
               this.field_40803.method_44815(var7, this.field_40799, var3);
            }

            for (int var12 = 0; var12 < this.field_40799; var12++) {
               int var18 = var12 * this.field_40802;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field_40799 + var12];
            }
         }
      } else if (var1 != -1) {
         for (byte var13 = 0; var13 < this.field_40802; var13 += 4) {
            for (int var9 = 0; var9 < this.field_40799; var9++) {
               int var19 = var9 * this.field_40802 + var13;
               int var11 = this.field_40799 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field_40799] = var2[var19 + 2];
               var7[var11 + 2 * this.field_40799] = var2[var19 + 3];
            }

            this.field_40803.method_44820(var7, 0, var3);
            this.field_40803.method_44820(var7, this.field_40799, var3);
            this.field_40803.method_44820(var7, 2 * this.field_40799, var3);
            this.field_40803.method_44820(var7, 3 * this.field_40799, var3);

            for (int var15 = 0; var15 < this.field_40799; var15++) {
               int var20 = var15 * this.field_40802 + var13;
               int var23 = this.field_40799 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field_40799];
               var2[var20 + 3] = var7[var23 + 2 * this.field_40799];
            }
         }
      } else {
         for (byte var14 = 0; var14 < this.field_40802; var14 += 4) {
            for (int var16 = 0; var16 < this.field_40799; var16++) {
               int var21 = var16 * this.field_40802 + var14;
               int var24 = this.field_40799 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field_40799] = var2[var21 + 2];
               var7[var24 + 2 * this.field_40799] = var2[var21 + 3];
            }

            this.field_40803.method_44815(var7, 0, var3);
            this.field_40803.method_44815(var7, this.field_40799, var3);
            this.field_40803.method_44815(var7, 2 * this.field_40799, var3);
            this.field_40803.method_44815(var7, 3 * this.field_40799, var3);

            for (int var17 = 0; var17 < this.field_40799; var17++) {
               int var22 = var17 * this.field_40802 + var14;
               int var25 = this.field_40799 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field_40799];
               var2[var22 + 3] = var7[var25 + 2 * this.field_40799];
            }
         }
      }
   }

   private void method_36032(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_40798;
      if (this.field_40800 != 2L) {
         if (this.field_40800 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (this.field_40800 <= 2L) {
         if (this.field_40800 == 2L) {
            for (long var9 = 0L; var9 < this.field_40798; var9++) {
               long var13 = var9 * this.field_40800;
               var8.method_36114(var9, var2.method_36107(var13));
               var8.method_36114(this.field_40798 + var9, var2.method_36107(var13 + 1L));
            }

            if (var1 != -1) {
               this.field_40803.method_44818(var8, 0L, var3);
               this.field_40803.method_44818(var8, this.field_40798, var3);
            } else {
               this.field_40803.method_44813(var8, 0L, var3);
               this.field_40803.method_44813(var8, this.field_40798, var3);
            }

            for (long var17 = 0L; var17 < this.field_40798; var17++) {
               long var23 = var17 * this.field_40800;
               var2.method_36114(var23, var8.method_36107(var17));
               var2.method_36114(var23 + 1L, var8.method_36107(this.field_40798 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field_40800; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field_40798; var11++) {
               long var24 = var11 * this.field_40800 + var18;
               long var15 = this.field_40798 + var11;
               var8.method_36114(var11, var2.method_36107(var24));
               var8.method_36114(var15, var2.method_36107(var24 + 1L));
               var8.method_36114(var15 + this.field_40798, var2.method_36107(var24 + 2L));
               var8.method_36114(var15 + 2L * this.field_40798, var2.method_36107(var24 + 3L));
            }

            this.field_40803.method_44818(var8, 0L, var3);
            this.field_40803.method_44818(var8, this.field_40798, var3);
            this.field_40803.method_44818(var8, 2L * this.field_40798, var3);
            this.field_40803.method_44818(var8, 3L * this.field_40798, var3);

            for (long var20 = 0L; var20 < this.field_40798; var20++) {
               long var25 = var20 * this.field_40800 + var18;
               long var28 = this.field_40798 + var20;
               var2.method_36114(var25, var8.method_36107(var20));
               var2.method_36114(var25 + 1L, var8.method_36107(var28));
               var2.method_36114(var25 + 2L, var8.method_36107(var28 + this.field_40798));
               var2.method_36114(var25 + 3L, var8.method_36107(var28 + 2L * this.field_40798));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field_40800; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field_40798; var21++) {
               long var26 = var21 * this.field_40800 + var19;
               long var29 = this.field_40798 + var21;
               var8.method_36114(var21, var2.method_36107(var26));
               var8.method_36114(var29, var2.method_36107(var26 + 1L));
               var8.method_36114(var29 + this.field_40798, var2.method_36107(var26 + 2L));
               var8.method_36114(var29 + 2L * this.field_40798, var2.method_36107(var26 + 3L));
            }

            this.field_40803.method_44813(var8, 0L, var3);
            this.field_40803.method_44813(var8, this.field_40798, var3);
            this.field_40803.method_44813(var8, 2L * this.field_40798, var3);
            this.field_40803.method_44813(var8, 3L * this.field_40798, var3);

            for (long var22 = 0L; var22 < this.field_40798; var22++) {
               long var27 = var22 * this.field_40800 + var19;
               long var30 = this.field_40798 + var22;
               var2.method_36114(var27, var8.method_36107(var22));
               var2.method_36114(var27 + 1L, var8.method_36107(var30));
               var2.method_36114(var27 + 2L, var8.method_36107(var30 + this.field_40798));
               var2.method_36114(var27 + 3L, var8.method_36107(var30 + 2L * this.field_40798));
            }
         }
      }
   }

   private void method_36034(int var1, double[][] var2, boolean var3) {
      int var6 = 4 * this.field_40799;
      if (this.field_40802 != 2) {
         if (this.field_40802 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field_40802 <= 2) {
         if (this.field_40802 == 2) {
            for (int var8 = 0; var8 < this.field_40799; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field_40799 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field_40803.method_44820(var7, 0, var3);
               this.field_40803.method_44820(var7, this.field_40799, var3);
            } else {
               this.field_40803.method_44815(var7, 0, var3);
               this.field_40803.method_44815(var7, this.field_40799, var3);
            }

            for (int var11 = 0; var11 < this.field_40799; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field_40799 + var11];
            }
         }
      } else if (var1 != -1) {
         for (byte var12 = 0; var12 < this.field_40802; var12 += 4) {
            for (int var9 = 0; var9 < this.field_40799; var9++) {
               int var10 = this.field_40799 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field_40799] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field_40799] = var2[var9][var12 + 3];
            }

            this.field_40803.method_44820(var7, 0, var3);
            this.field_40803.method_44820(var7, this.field_40799, var3);
            this.field_40803.method_44820(var7, 2 * this.field_40799, var3);
            this.field_40803.method_44820(var7, 3 * this.field_40799, var3);

            for (int var14 = 0; var14 < this.field_40799; var14++) {
               int var17 = this.field_40799 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field_40799];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field_40799];
            }
         }
      } else {
         for (byte var13 = 0; var13 < this.field_40802; var13 += 4) {
            for (int var15 = 0; var15 < this.field_40799; var15++) {
               int var18 = this.field_40799 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field_40799] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field_40799] = var2[var15][var13 + 3];
            }

            this.field_40803.method_44815(var7, 0, var3);
            this.field_40803.method_44815(var7, this.field_40799, var3);
            this.field_40803.method_44815(var7, 2 * this.field_40799, var3);
            this.field_40803.method_44815(var7, 3 * this.field_40799, var3);

            for (int var16 = 0; var16 < this.field_40799; var16++) {
               int var19 = this.field_40799 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field_40799];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field_40799];
            }
         }
      }
   }
}
