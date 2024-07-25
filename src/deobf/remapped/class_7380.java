package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_7380 {
   private int field_37703;
   private int field_37701;
   private long field_37707;
   private long field_37708;
   private class_6816 field_37700;
   private class_6816 field_37702;
   private boolean field_37705 = false;
   private boolean field_37706 = false;

   public class_7380(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field_37703 = (int)var1;
         this.field_37701 = (int)var3;
         this.field_37707 = var1;
         this.field_37708 = var3;
         if (var1 * var3 >= class_2751.method_12428()) {
            this.field_37706 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3)) {
            this.field_37705 = true;
         }

         class_2751.method_12507(var1 * var3 > (long)class_7975.method_36102());
         this.field_37702 = new class_6816(var1);
         if (var1 != var3) {
            this.field_37700 = new class_6816(var3);
         } else {
            this.field_37700 = this.field_37702;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method_33602(double[] var1) {
      int var4 = class_1266.method_5693();
      if (this.field_37705) {
         if (var4 > 1 && this.field_37706) {
            this.method_33606(-1, var1, true);
            this.method_33619(-1, var1, true);
         } else {
            this.method_33610(-1, var1, true);

            for (int var5 = 0; var5 < this.field_37703; var5++) {
               this.field_37700.method_31276(var1, var5 * this.field_37701);
            }
         }

         this.method_33623(var1);
      } else {
         if (var4 > 1 && this.field_37706 && this.field_37703 >= var4 && this.field_37701 >= var4) {
            Future[] var16 = new Future[var4];
            int var17 = this.field_37703 / var4;

            for (int var20 = 0; var20 < var4; var20++) {
               int var8 = var20 * var17;
               int var9 = var20 == var4 - 1 ? this.field_37703 : var8 + var17;
               var16[var20] = class_1266.method_5694(new class_8158(this, var8, var9, var1));
            }

            try {
               class_1266.method_5696(var16);
            } catch (InterruptedException var12) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var13);
            }

            var17 = this.field_37701 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var22 = var21 * var17;
               int var23 = var21 == var4 - 1 ? this.field_37701 : var22 + var17;
               var16[var21] = class_1266.method_5694(new class_1540(this, var22, var23, var1));
            }

            try {
               class_1266.method_5696(var16);
            } catch (InterruptedException var10) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var14 = 0; var14 < this.field_37703; var14++) {
               this.field_37700.method_31276(var1, var14 * this.field_37701);
            }

            double[] var15 = new double[this.field_37703];

            for (int var6 = 0; var6 < this.field_37701; var6++) {
               for (int var7 = 0; var7 < this.field_37703; var7++) {
                  var15[var7] = var1[var7 * this.field_37701 + var6];
               }

               this.field_37702.method_31275(var15);

               for (int var19 = 0; var19 < this.field_37703; var19++) {
                  var1[var19 * this.field_37701 + var6] = var15[var19];
               }
            }
         }

         this.method_33623(var1);
      }
   }

   public void method_33601(class_1702 var1) {
      int var4 = class_1266.method_5693();
      if (this.field_37705) {
         if (var4 > 1 && this.field_37706) {
            this.method_33605(-1, var1, true);
            this.method_33618(-1, var1, true);
         } else {
            this.method_33609(-1, var1, true);

            for (long var5 = 0L; var5 < this.field_37707; var5++) {
               this.field_37700.method_31274(var1, var5 * this.field_37708);
            }
         }

         this.method_33622(var1);
      } else {
         if (var4 > 1 && this.field_37706 && this.field_37707 >= (long)var4 && this.field_37708 >= (long)var4) {
            Future[] var22 = new Future[var4];
            long var23 = this.field_37707 / (long)var4;

            for (int var10 = 0; var10 < var4; var10++) {
               long var11 = (long)var10 * var23;
               long var13 = var10 == var4 - 1 ? this.field_37707 : var11 + var23;
               var22[var10] = class_1266.method_5694(new class_4421(this, var11, var13, var1));
            }

            try {
               class_1266.method_5696(var22);
            } catch (InterruptedException var19) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var19);
            } catch (ExecutionException var20) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var20);
            }

            var23 = this.field_37708 / (long)var4;

            for (int var25 = 0; var25 < var4; var25++) {
               long var26 = (long)var25 * var23;
               long var27 = var25 == var4 - 1 ? this.field_37708 : var26 + var23;
               var22[var25] = class_1266.method_5694(new class_567(this, var26, var27, var1));
            }

            try {
               class_1266.method_5696(var22);
            } catch (InterruptedException var17) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var17);
            } catch (ExecutionException var18) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var18);
            }
         } else {
            for (long var21 = 0L; var21 < this.field_37707; var21++) {
               this.field_37700.method_31274(var1, var21 * this.field_37708);
            }

            class_1702 var7 = new class_1702(this.field_37707, false);

            for (long var8 = 0L; var8 < this.field_37708; var8++) {
               for (long var15 = 0L; var15 < this.field_37707; var15++) {
                  var7.method_36114(var15, var1.method_36107(var15 * this.field_37708 + var8));
               }

               this.field_37702.method_31273(var7);

               for (long var28 = 0L; var28 < this.field_37707; var28++) {
                  var1.method_36114(var28 * this.field_37708 + var8, var7.method_36107(var28));
               }
            }
         }

         this.method_33622(var1);
      }
   }

   public void method_33603(double[][] var1) {
      int var4 = class_1266.method_5693();
      if (this.field_37705) {
         if (var4 > 1 && this.field_37706) {
            this.method_33607(-1, var1, true);
            this.method_33620(-1, var1, true);
         } else {
            this.method_33611(-1, var1, true);

            for (int var5 = 0; var5 < this.field_37703; var5++) {
               this.field_37700.method_31275(var1[var5]);
            }
         }

         this.method_33624(var1);
      } else {
         if (var4 > 1 && this.field_37706 && this.field_37703 >= var4 && this.field_37701 >= var4) {
            Future[] var16 = new Future[var4];
            int var17 = this.field_37703 / var4;

            for (int var20 = 0; var20 < var4; var20++) {
               int var8 = var20 * var17;
               int var9 = var20 == var4 - 1 ? this.field_37703 : var8 + var17;
               var16[var20] = class_1266.method_5694(new class_9288(this, var8, var9, var1));
            }

            try {
               class_1266.method_5696(var16);
            } catch (InterruptedException var12) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var13);
            }

            var17 = this.field_37701 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var22 = var21 * var17;
               int var23 = var21 == var4 - 1 ? this.field_37701 : var22 + var17;
               var16[var21] = class_1266.method_5694(new class_7828(this, var22, var23, var1));
            }

            try {
               class_1266.method_5696(var16);
            } catch (InterruptedException var10) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var14 = 0; var14 < this.field_37703; var14++) {
               this.field_37700.method_31275(var1[var14]);
            }

            double[] var15 = new double[this.field_37703];

            for (int var6 = 0; var6 < this.field_37701; var6++) {
               for (int var7 = 0; var7 < this.field_37703; var7++) {
                  var15[var7] = var1[var7][var6];
               }

               this.field_37702.method_31275(var15);

               for (int var19 = 0; var19 < this.field_37703; var19++) {
                  var1[var19][var6] = var15[var19];
               }
            }
         }

         this.method_33624(var1);
      }
   }

   public void method_33614(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_37705) {
         if (var5 > 1 && this.field_37706) {
            this.method_33606(1, var1, var2);
            this.method_33619(1, var1, var2);
         } else {
            this.method_33610(1, var1, var2);

            for (int var6 = 0; var6 < this.field_37703; var6++) {
               this.field_37700.method_31282(var1, var6 * this.field_37701, var2);
            }
         }

         this.method_33623(var1);
      } else {
         if (var5 > 1 && this.field_37706 && this.field_37703 >= var5 && this.field_37701 >= var5) {
            Future[] var17 = new Future[var5];
            int var18 = this.field_37703 / var5;

            for (int var21 = 0; var21 < var5; var21++) {
               int var9 = var21 * var18;
               int var10 = var21 == var5 - 1 ? this.field_37703 : var9 + var18;
               var17[var21] = class_1266.method_5694(new class_2123(this, var9, var10, var1, var2));
            }

            try {
               class_1266.method_5696(var17);
            } catch (InterruptedException var13) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var14);
            }

            var18 = this.field_37701 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var23 = var22 * var18;
               int var24 = var22 == var5 - 1 ? this.field_37701 : var23 + var18;
               var17[var22] = class_1266.method_5694(new class_8826(this, var23, var24, var1, var2));
            }

            try {
               class_1266.method_5696(var17);
            } catch (InterruptedException var11) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var15 = 0; var15 < this.field_37703; var15++) {
               this.field_37700.method_31282(var1, var15 * this.field_37701, var2);
            }

            double[] var16 = new double[this.field_37703];

            for (int var7 = 0; var7 < this.field_37701; var7++) {
               for (int var8 = 0; var8 < this.field_37703; var8++) {
                  var16[var8] = var1[var8 * this.field_37701 + var7];
               }

               this.field_37702.method_31283(var16, var2);

               for (int var20 = 0; var20 < this.field_37703; var20++) {
                  var1[var20 * this.field_37701 + var7] = var16[var20];
               }
            }
         }

         this.method_33623(var1);
      }
   }

   public void method_33613(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_37705) {
         if (var5 > 1 && this.field_37706) {
            this.method_33605(1, var1, var2);
            this.method_33618(1, var1, var2);
         } else {
            this.method_33609(1, var1, var2);

            for (long var6 = 0L; var6 < this.field_37707; var6++) {
               this.field_37700.method_31280(var1, var6 * this.field_37708, var2);
            }
         }

         this.method_33622(var1);
      } else {
         if (var5 > 1 && this.field_37706 && this.field_37707 >= (long)var5 && this.field_37708 >= (long)var5) {
            Future[] var23 = new Future[var5];
            long var24 = this.field_37707 / (long)var5;

            for (int var11 = 0; var11 < var5; var11++) {
               long var12 = (long)var11 * var24;
               long var14 = var11 == var5 - 1 ? this.field_37707 : var12 + var24;
               var23[var11] = class_1266.method_5694(new class_5852(this, var12, var14, var1, var2));
            }

            try {
               class_1266.method_5696(var23);
            } catch (InterruptedException var20) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var20);
            } catch (ExecutionException var21) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var21);
            }

            var24 = this.field_37708 / (long)var5;

            for (int var26 = 0; var26 < var5; var26++) {
               long var27 = (long)var26 * var24;
               long var28 = var26 == var5 - 1 ? this.field_37708 : var27 + var24;
               var23[var26] = class_1266.method_5694(new class_4775(this, var27, var28, var1, var2));
            }

            try {
               class_1266.method_5696(var23);
            } catch (InterruptedException var18) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var18);
            } catch (ExecutionException var19) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var19);
            }
         } else {
            for (long var22 = 0L; var22 < this.field_37707; var22++) {
               this.field_37700.method_31280(var1, var22 * this.field_37708, var2);
            }

            class_1702 var8 = new class_1702(this.field_37707, false);

            for (long var9 = 0L; var9 < this.field_37708; var9++) {
               for (long var16 = 0L; var16 < this.field_37707; var16++) {
                  var8.method_36114(var16, var1.method_36107(var16 * this.field_37708 + var9));
               }

               this.field_37702.method_31281(var8, var2);

               for (long var29 = 0L; var29 < this.field_37707; var29++) {
                  var1.method_36114(var29 * this.field_37708 + var9, var8.method_36107(var29));
               }
            }
         }

         this.method_33622(var1);
      }
   }

   public void method_33615(double[][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_37705) {
         if (var5 > 1 && this.field_37706) {
            this.method_33607(1, var1, var2);
            this.method_33620(1, var1, var2);
         } else {
            this.method_33611(1, var1, var2);

            for (int var6 = 0; var6 < this.field_37703; var6++) {
               this.field_37700.method_31283(var1[var6], var2);
            }
         }

         this.method_33624(var1);
      } else {
         if (var5 > 1 && this.field_37706 && this.field_37703 >= var5 && this.field_37701 >= var5) {
            Future[] var17 = new Future[var5];
            int var18 = this.field_37703 / var5;

            for (int var21 = 0; var21 < var5; var21++) {
               int var9 = var21 * var18;
               int var10 = var21 == var5 - 1 ? this.field_37703 : var9 + var18;
               var17[var21] = class_1266.method_5694(new class_2675(this, var9, var10, var1, var2));
            }

            try {
               class_1266.method_5696(var17);
            } catch (InterruptedException var13) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var14);
            }

            var18 = this.field_37701 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var23 = var22 * var18;
               int var24 = var22 == var5 - 1 ? this.field_37701 : var23 + var18;
               var17[var22] = class_1266.method_5694(new class_7740(this, var23, var24, var1, var2));
            }

            try {
               class_1266.method_5696(var17);
            } catch (InterruptedException var11) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var15 = 0; var15 < this.field_37703; var15++) {
               this.field_37700.method_31283(var1[var15], var2);
            }

            double[] var16 = new double[this.field_37703];

            for (int var7 = 0; var7 < this.field_37701; var7++) {
               for (int var8 = 0; var8 < this.field_37703; var8++) {
                  var16[var8] = var1[var8][var7];
               }

               this.field_37702.method_31283(var16, var2);

               for (int var20 = 0; var20 < this.field_37703; var20++) {
                  var1[var20][var7] = var16[var20];
               }
            }
         }

         this.method_33624(var1);
      }
   }

   private void method_33606(int var1, double[] var2, boolean var3) {
      int var6 = class_6806.method_31195(this.field_37701, class_1266.method_5693());
      int var7 = 4 * this.field_37703;
      if (this.field_37701 == 2) {
         var7 >>= 1;
      } else if (this.field_37701 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = class_1266.method_5694(new class_9804(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_33605(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)class_6806.method_31196(this.field_37708, (long)class_1266.method_5693());
      long var7 = 4L * this.field_37707;
      if (this.field_37708 == 2L) {
         var7 >>= 1;
      } else if (this.field_37708 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      int var11 = var6;
      Future[] var12 = new Future[var6];

      for (int var13 = 0; var13 < var11; var13++) {
         long var14 = (long)var13;
         var12[var13] = class_1266.method_5694(new class_6355(this, var9, var1, var14, var11, var2, var3));
      }

      try {
         class_1266.method_5696(var12);
      } catch (InterruptedException var16) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method_33607(int var1, double[][] var2, boolean var3) {
      int var6 = class_6806.method_31195(this.field_37701, class_1266.method_5693());
      int var7 = 4 * this.field_37703;
      if (this.field_37701 == 2) {
         var7 >>= 1;
      } else if (this.field_37701 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = class_1266.method_5694(new class_1096(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_33619(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_37703 ? this.field_37703 : class_1266.method_5693();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_2343(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_33618(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_37707 ? this.field_37707 : (long)class_1266.method_5693());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         long var9 = (long)var8;
         var7[var8] = class_1266.method_5694(new class_2477(this, var1, var9, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var11) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method_33620(int var1, double[][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_37703 ? this.field_37703 : class_1266.method_5693();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = class_1266.method_5694(new class_8189(this, var1, var8, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(class_7380.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method_33610(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_37703;
      if (this.field_37701 != 2) {
         if (this.field_37701 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field_37701 <= 2) {
         if (this.field_37701 == 2) {
            for (int var8 = 0; var8 < this.field_37703; var8++) {
               int var10 = var8 * this.field_37701;
               var7[var8] = var2[var10];
               var7[this.field_37703 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field_37702.method_31282(var7, 0, var3);
               this.field_37702.method_31282(var7, this.field_37703, var3);
            } else {
               this.field_37702.method_31276(var7, 0);
               this.field_37702.method_31276(var7, this.field_37703);
            }

            for (int var12 = 0; var12 < this.field_37703; var12++) {
               int var18 = var12 * this.field_37701;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field_37703 + var12];
            }
         }
      } else if (var1 != -1) {
         for (byte var13 = 0; var13 < this.field_37701; var13 += 4) {
            for (int var9 = 0; var9 < this.field_37703; var9++) {
               int var19 = var9 * this.field_37701 + var13;
               int var11 = this.field_37703 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field_37703] = var2[var19 + 2];
               var7[var11 + 2 * this.field_37703] = var2[var19 + 3];
            }

            this.field_37702.method_31282(var7, 0, var3);
            this.field_37702.method_31282(var7, this.field_37703, var3);
            this.field_37702.method_31282(var7, 2 * this.field_37703, var3);
            this.field_37702.method_31282(var7, 3 * this.field_37703, var3);

            for (int var15 = 0; var15 < this.field_37703; var15++) {
               int var20 = var15 * this.field_37701 + var13;
               int var23 = this.field_37703 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field_37703];
               var2[var20 + 3] = var7[var23 + 2 * this.field_37703];
            }
         }
      } else {
         for (byte var14 = 0; var14 < this.field_37701; var14 += 4) {
            for (int var16 = 0; var16 < this.field_37703; var16++) {
               int var21 = var16 * this.field_37701 + var14;
               int var24 = this.field_37703 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field_37703] = var2[var21 + 2];
               var7[var24 + 2 * this.field_37703] = var2[var21 + 3];
            }

            this.field_37702.method_31276(var7, 0);
            this.field_37702.method_31276(var7, this.field_37703);
            this.field_37702.method_31276(var7, 2 * this.field_37703);
            this.field_37702.method_31276(var7, 3 * this.field_37703);

            for (int var17 = 0; var17 < this.field_37703; var17++) {
               int var22 = var17 * this.field_37701 + var14;
               int var25 = this.field_37703 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field_37703];
               var2[var22 + 3] = var7[var25 + 2 * this.field_37703];
            }
         }
      }
   }

   private void method_33609(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_37707;
      if (this.field_37708 != 2L) {
         if (this.field_37708 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (this.field_37708 <= 2L) {
         if (this.field_37708 == 2L) {
            for (long var9 = 0L; var9 < this.field_37707; var9++) {
               long var13 = var9 * this.field_37708;
               var8.method_36114(var9, var2.method_36107(var13));
               var8.method_36114(this.field_37707 + var9, var2.method_36107(var13 + 1L));
            }

            if (var1 != -1) {
               this.field_37702.method_31280(var8, 0L, var3);
               this.field_37702.method_31280(var8, this.field_37707, var3);
            } else {
               this.field_37702.method_31274(var8, 0L);
               this.field_37702.method_31274(var8, this.field_37707);
            }

            for (long var17 = 0L; var17 < this.field_37707; var17++) {
               long var23 = var17 * this.field_37708;
               var2.method_36114(var23, var8.method_36107(var17));
               var2.method_36114(var23 + 1L, var8.method_36107(this.field_37707 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field_37708; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field_37707; var11++) {
               long var24 = var11 * this.field_37708 + var18;
               long var15 = this.field_37707 + var11;
               var8.method_36114(var11, var2.method_36107(var24));
               var8.method_36114(var15, var2.method_36107(var24 + 1L));
               var8.method_36114(var15 + this.field_37707, var2.method_36107(var24 + 2L));
               var8.method_36114(var15 + 2L * this.field_37707, var2.method_36107(var24 + 3L));
            }

            this.field_37702.method_31280(var8, 0L, var3);
            this.field_37702.method_31280(var8, this.field_37707, var3);
            this.field_37702.method_31280(var8, 2L * this.field_37707, var3);
            this.field_37702.method_31280(var8, 3L * this.field_37707, var3);

            for (long var20 = 0L; var20 < this.field_37707; var20++) {
               long var25 = var20 * this.field_37708 + var18;
               long var28 = this.field_37707 + var20;
               var2.method_36114(var25, var8.method_36107(var20));
               var2.method_36114(var25 + 1L, var8.method_36107(var28));
               var2.method_36114(var25 + 2L, var8.method_36107(var28 + this.field_37707));
               var2.method_36114(var25 + 3L, var8.method_36107(var28 + 2L * this.field_37707));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field_37708; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field_37707; var21++) {
               long var26 = var21 * this.field_37708 + var19;
               long var29 = this.field_37707 + var21;
               var8.method_36114(var21, var2.method_36107(var26));
               var8.method_36114(var29, var2.method_36107(var26 + 1L));
               var8.method_36114(var29 + this.field_37707, var2.method_36107(var26 + 2L));
               var8.method_36114(var29 + 2L * this.field_37707, var2.method_36107(var26 + 3L));
            }

            this.field_37702.method_31274(var8, 0L);
            this.field_37702.method_31274(var8, this.field_37707);
            this.field_37702.method_31274(var8, 2L * this.field_37707);
            this.field_37702.method_31274(var8, 3L * this.field_37707);

            for (long var22 = 0L; var22 < this.field_37707; var22++) {
               long var27 = var22 * this.field_37708 + var19;
               long var30 = this.field_37707 + var22;
               var2.method_36114(var27, var8.method_36107(var22));
               var2.method_36114(var27 + 1L, var8.method_36107(var30));
               var2.method_36114(var27 + 2L, var8.method_36107(var30 + this.field_37707));
               var2.method_36114(var27 + 3L, var8.method_36107(var30 + 2L * this.field_37707));
            }
         }
      }
   }

   private void method_33611(int var1, double[][] var2, boolean var3) {
      int var6 = 4 * this.field_37703;
      if (this.field_37701 != 2) {
         if (this.field_37701 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field_37701 <= 2) {
         if (this.field_37701 == 2) {
            for (int var8 = 0; var8 < this.field_37703; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field_37703 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field_37702.method_31282(var7, 0, var3);
               this.field_37702.method_31282(var7, this.field_37703, var3);
            } else {
               this.field_37702.method_31276(var7, 0);
               this.field_37702.method_31276(var7, this.field_37703);
            }

            for (int var11 = 0; var11 < this.field_37703; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field_37703 + var11];
            }
         }
      } else if (var1 != -1) {
         for (byte var12 = 0; var12 < this.field_37701; var12 += 4) {
            for (int var9 = 0; var9 < this.field_37703; var9++) {
               int var10 = this.field_37703 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field_37703] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field_37703] = var2[var9][var12 + 3];
            }

            this.field_37702.method_31282(var7, 0, var3);
            this.field_37702.method_31282(var7, this.field_37703, var3);
            this.field_37702.method_31282(var7, 2 * this.field_37703, var3);
            this.field_37702.method_31282(var7, 3 * this.field_37703, var3);

            for (int var14 = 0; var14 < this.field_37703; var14++) {
               int var17 = this.field_37703 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field_37703];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field_37703];
            }
         }
      } else {
         for (byte var13 = 0; var13 < this.field_37701; var13 += 4) {
            for (int var15 = 0; var15 < this.field_37703; var15++) {
               int var18 = this.field_37703 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field_37703] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field_37703] = var2[var15][var13 + 3];
            }

            this.field_37702.method_31276(var7, 0);
            this.field_37702.method_31276(var7, this.field_37703);
            this.field_37702.method_31276(var7, 2 * this.field_37703);
            this.field_37702.method_31276(var7, 3 * this.field_37703);

            for (int var16 = 0; var16 < this.field_37703; var16++) {
               int var19 = this.field_37703 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field_37703];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field_37703];
            }
         }
      }
   }

   private void method_33623(double[] var1) {
      for (int var4 = 0; var4 <= this.field_37703 / 2; var4++) {
         int var5 = (this.field_37703 - var4) % this.field_37703;
         int var6 = var4 * this.field_37701;
         int var7 = var5 * this.field_37701;

         for (int var8 = 0; var8 <= this.field_37701 / 2; var8++) {
            int var9 = (this.field_37701 - var8) % this.field_37701;
            double var10 = var1[var6 + var8];
            double var12 = var1[var7 + var8];
            double var14 = var1[var6 + var9];
            double var16 = var1[var7 + var9];
            double var18 = (var10 + var16 - (var12 + var14)) / 2.0;
            var1[var6 + var8] = var10 - var18;
            var1[var7 + var8] = var12 + var18;
            var1[var6 + var9] = var14 + var18;
            var1[var7 + var9] = var16 - var18;
         }
      }
   }

   private void method_33622(class_1702 var1) {
      for (long var4 = 0L; var4 <= this.field_37707 / 2L; var4++) {
         long var6 = (this.field_37707 - var4) % this.field_37707;
         long var8 = var4 * this.field_37708;
         long var10 = var6 * this.field_37708;

         for (long var12 = 0L; var12 <= this.field_37708 / 2L; var12++) {
            long var14 = (this.field_37708 - var12) % this.field_37708;
            double var16 = var1.method_36107(var8 + var12);
            double var18 = var1.method_36107(var10 + var12);
            double var20 = var1.method_36107(var8 + var14);
            double var22 = var1.method_36107(var10 + var14);
            double var24 = (var16 + var22 - (var18 + var20)) / 2.0;
            var1.method_36114(var8 + var12, var16 - var24);
            var1.method_36114(var10 + var12, var18 + var24);
            var1.method_36114(var8 + var14, var20 + var24);
            var1.method_36114(var10 + var14, var22 - var24);
         }
      }
   }

   private void method_33624(double[][] var1) {
      for (int var4 = 0; var4 <= this.field_37703 / 2; var4++) {
         int var5 = (this.field_37703 - var4) % this.field_37703;

         for (int var6 = 0; var6 <= this.field_37701 / 2; var6++) {
            int var7 = (this.field_37701 - var6) % this.field_37701;
            double var8 = var1[var4][var6];
            double var10 = var1[var5][var6];
            double var12 = var1[var4][var7];
            double var14 = var1[var5][var7];
            double var16 = (var8 + var14 - (var10 + var12)) / 2.0;
            var1[var4][var6] = var8 - var16;
            var1[var5][var6] = var10 + var16;
            var1[var4][var7] = var12 + var16;
            var1[var5][var7] = var14 - var16;
         }
      }
   }
}
