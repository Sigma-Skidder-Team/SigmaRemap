package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_3101 {
   private int field_15426;
   private long field_15421;
   private int field_15428;
   private long field_15423;
   private int field_15422;
   private long field_15430;
   private int field_15419;
   private long field_15434;
   private int field_15420;
   private long field_15429;
   private class_4133 field_15432;
   private class_4133 field_15431;
   private class_4133 field_15425;
   private boolean field_15433 = false;
   private boolean field_15424 = false;

   public class_3101(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field_15426 = (int)var1;
         this.field_15428 = (int)var3;
         this.field_15422 = (int)var5;
         this.field_15421 = var1;
         this.field_15423 = var3;
         this.field_15430 = var5;
         this.field_15419 = (int)(var3 * var5);
         this.field_15420 = (int)var5;
         this.field_15434 = var3 * var5;
         this.field_15429 = var5;
         if (var1 * var3 * var5 >= class_2751.method_12537()) {
            this.field_15424 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3) && class_2751.method_12439(var5)) {
            this.field_15433 = true;
         }

         class_2751.method_12507(var1 * var3 * var5 > (long)class_7975.method_36102());
         this.field_15432 = new class_4133(var1);
         if (var1 != var3) {
            this.field_15431 = new class_4133(var3);
         } else {
            this.field_15431 = this.field_15432;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field_15425 = new class_4133(var5);
            } else {
               this.field_15425 = this.field_15431;
            }
         } else {
            this.field_15425 = this.field_15432;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method_14189(float[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_15433) {
         if (var5 > 1 && this.field_15424) {
            this.method_14209(-1, var1, var2);
            this.method_14218(-1, var1, var2);
         } else {
            this.method_14206(-1, var1, var2);
            this.method_14215(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_15424 && this.field_15426 >= var5 && this.field_15428 >= var5 && this.field_15422 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field_15426 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field_15426 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_241(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field_15426 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_8165(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field_15428 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field_15428 : var33 + var23;
            var20[var29] = class_1266.method_5694(new class_7132(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field_15426; var6++) {
            int var7 = var6 * this.field_15419;

            for (int var8 = 0; var8 < this.field_15428; var8++) {
               this.field_15425.method_19196(var1, var7 + var8 * this.field_15420, var2);
            }
         }

         float[] var18 = new float[this.field_15428];

         for (int var21 = 0; var21 < this.field_15426; var21++) {
            int var25 = var21 * this.field_15419;

            for (int var9 = 0; var9 < this.field_15422; var9++) {
               for (int var10 = 0; var10 < this.field_15428; var10++) {
                  int var11 = var25 + var10 * this.field_15420 + var9;
                  var18[var10] = var1[var11];
               }

               this.field_15431.method_19197(var18, var2);

               for (int var34 = 0; var34 < this.field_15428; var34++) {
                  int var40 = var25 + var34 * this.field_15420 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field_15426];

         for (int var22 = 0; var22 < this.field_15428; var22++) {
            int var26 = var22 * this.field_15420;

            for (int var30 = 0; var30 < this.field_15422; var30++) {
               for (int var35 = 0; var35 < this.field_15426; var35++) {
                  int var41 = var35 * this.field_15419 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field_15432.method_19197(var18, var2);

               for (int var36 = 0; var36 < this.field_15426; var36++) {
                  int var42 = var36 * this.field_15419 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method_14188(class_4330 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_15433) {
         if (var5 > 1 && this.field_15424) {
            this.method_14208(-1, var1, var2);
            this.method_14217(-1, var1, var2);
         } else {
            this.method_14205(-1, var1, var2);
            this.method_14214(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_15424 && this.field_15421 >= (long)var5 && this.field_15423 >= (long)var5 && this.field_15430 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field_15421 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field_15421 : var39 + var35;
            var33[var9] = class_1266.method_5694(new class_6029(this, var39, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field_15421 : var40 + var35;
            var33[var37] = class_1266.method_5694(new class_6591(this, var40, var42, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field_15423 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field_15423 : var41 + var35;
            var33[var38] = class_1266.method_5694(new class_4375(this, var41, var43, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field_15421; var14++) {
            long var16 = var14 * this.field_15434;

            for (long var10 = 0L; var10 < this.field_15423; var10++) {
               this.field_15425.method_19194(var1, var16 + var10 * this.field_15429, var2);
            }
         }

         class_4330 var6 = new class_4330(this.field_15423, false);

         for (long var7 = 0L; var7 < this.field_15421; var7++) {
            long var18 = var7 * this.field_15434;

            for (long var20 = 0L; var20 < this.field_15430; var20++) {
               for (long var22 = 0L; var22 < this.field_15423; var22++) {
                  long var24 = var18 + var22 * this.field_15429 + var20;
                  var6.method_36123(var22, var1.method_36133(var24));
               }

               this.field_15431.method_19195(var6, var2);

               for (long var46 = 0L; var46 < this.field_15423; var46++) {
                  long var49 = var18 + var46 * this.field_15429 + var20;
                  var1.method_36123(var49, var6.method_36133(var46));
               }
            }
         }

         var6 = new class_4330(this.field_15421, false);

         for (long var34 = 0L; var34 < this.field_15423; var34++) {
            long var44 = var34 * this.field_15429;

            for (long var45 = 0L; var45 < this.field_15430; var45++) {
               for (long var47 = 0L; var47 < this.field_15421; var47++) {
                  long var50 = var47 * this.field_15434 + var44 + var45;
                  var6.method_36123(var47, var1.method_36133(var50));
               }

               this.field_15432.method_19195(var6, var2);

               for (long var48 = 0L; var48 < this.field_15421; var48++) {
                  long var51 = var48 * this.field_15434 + var44 + var45;
                  var1.method_36123(var51, var6.method_36133(var48));
               }
            }
         }
      }
   }

   public void method_14190(float[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_15433) {
         if (var5 > 1 && this.field_15424) {
            this.method_14210(-1, var1, var2);
            this.method_14219(-1, var1, var2);
         } else {
            this.method_14207(-1, var1, var2);
            this.method_14216(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_15424 && this.field_15426 >= var5 && this.field_15428 >= var5 && this.field_15422 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field_15426 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field_15426 : var31 + var22;
            var19[var25] = class_1266.method_5694(new class_3856(this, var31, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field_15426 : var32 + var22;
            var19[var26] = class_1266.method_5694(new class_6610(this, var32, var34, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field_15428 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field_15428 : var33 + var22;
            var19[var27] = class_1266.method_5694(new class_9764(this, var33, var35, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field_15426; var6++) {
            for (int var7 = 0; var7 < this.field_15428; var7++) {
               this.field_15425.method_19197(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field_15428];

         for (int var20 = 0; var20 < this.field_15426; var20++) {
            for (int var8 = 0; var8 < this.field_15422; var8++) {
               for (int var9 = 0; var9 < this.field_15428; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field_15431.method_19197(var17, var2);

               for (int var28 = 0; var28 < this.field_15428; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field_15426];

         for (int var21 = 0; var21 < this.field_15428; var21++) {
            for (int var24 = 0; var24 < this.field_15422; var24++) {
               for (int var29 = 0; var29 < this.field_15426; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field_15432.method_19197(var17, var2);

               for (int var30 = 0; var30 < this.field_15426; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   public void method_14202(float[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_15433) {
         if (var5 > 1 && this.field_15424) {
            this.method_14209(1, var1, var2);
            this.method_14218(1, var1, var2);
         } else {
            this.method_14206(1, var1, var2);
            this.method_14215(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_15424 && this.field_15426 >= var5 && this.field_15428 >= var5 && this.field_15422 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field_15426 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field_15426 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_9503(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field_15426 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_9204(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field_15428 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field_15428 : var33 + var23;
            var20[var29] = class_1266.method_5694(new class_951(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field_15426; var6++) {
            int var7 = var6 * this.field_15419;

            for (int var8 = 0; var8 < this.field_15428; var8++) {
               this.field_15425.method_19203(var1, var7 + var8 * this.field_15420, var2);
            }
         }

         float[] var18 = new float[this.field_15428];

         for (int var21 = 0; var21 < this.field_15426; var21++) {
            int var25 = var21 * this.field_15419;

            for (int var9 = 0; var9 < this.field_15422; var9++) {
               for (int var10 = 0; var10 < this.field_15428; var10++) {
                  int var11 = var25 + var10 * this.field_15420 + var9;
                  var18[var10] = var1[var11];
               }

               this.field_15431.method_19204(var18, var2);

               for (int var34 = 0; var34 < this.field_15428; var34++) {
                  int var40 = var25 + var34 * this.field_15420 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field_15426];

         for (int var22 = 0; var22 < this.field_15428; var22++) {
            int var26 = var22 * this.field_15420;

            for (int var30 = 0; var30 < this.field_15422; var30++) {
               for (int var35 = 0; var35 < this.field_15426; var35++) {
                  int var41 = var35 * this.field_15419 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field_15432.method_19204(var18, var2);

               for (int var36 = 0; var36 < this.field_15426; var36++) {
                  int var42 = var36 * this.field_15419 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method_14201(class_4330 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_15433) {
         if (var5 > 1 && this.field_15424) {
            this.method_14208(1, var1, var2);
            this.method_14217(1, var1, var2);
         } else {
            this.method_14205(1, var1, var2);
            this.method_14214(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_15424 && this.field_15421 >= (long)var5 && this.field_15423 >= (long)var5 && this.field_15430 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field_15421 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field_15421 : var39 + var35;
            var33[var9] = class_1266.method_5694(new class_1732(this, var39, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field_15421 : var40 + var35;
            var33[var37] = class_1266.method_5694(new class_1743(this, var40, var42, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field_15423 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field_15423 : var41 + var35;
            var33[var38] = class_1266.method_5694(new class_7915(this, var41, var43, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field_15421; var14++) {
            long var16 = var14 * (long)this.field_15419;

            for (long var10 = 0L; var10 < this.field_15423; var10++) {
               this.field_15425.method_19201(var1, var16 + var10 * (long)this.field_15420, var2);
            }
         }

         class_4330 var6 = new class_4330(this.field_15423, false);

         for (long var7 = 0L; var7 < this.field_15421; var7++) {
            long var18 = var7 * (long)this.field_15419;

            for (long var20 = 0L; var20 < this.field_15430; var20++) {
               for (long var22 = 0L; var22 < this.field_15423; var22++) {
                  long var24 = var18 + var22 * (long)this.field_15420 + var20;
                  var6.method_36123(var22, var1.method_36133(var24));
               }

               this.field_15431.method_19202(var6, var2);

               for (long var46 = 0L; var46 < this.field_15423; var46++) {
                  long var49 = var18 + var46 * (long)this.field_15420 + var20;
                  var1.method_36123(var49, var6.method_36133(var46));
               }
            }
         }

         var6 = new class_4330(this.field_15421, false);

         for (long var34 = 0L; var34 < this.field_15423; var34++) {
            long var44 = var34 * (long)this.field_15420;

            for (long var45 = 0L; var45 < this.field_15430; var45++) {
               for (long var47 = 0L; var47 < this.field_15421; var47++) {
                  long var50 = var47 * (long)this.field_15419 + var44 + var45;
                  var6.method_36123(var47, var1.method_36133(var50));
               }

               this.field_15432.method_19202(var6, var2);

               for (long var48 = 0L; var48 < this.field_15421; var48++) {
                  long var51 = var48 * (long)this.field_15419 + var44 + var45;
                  var1.method_36123(var51, var6.method_36133(var48));
               }
            }
         }
      }
   }

   public void method_14203(float[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_15433) {
         if (var5 > 1 && this.field_15424) {
            this.method_14210(1, var1, var2);
            this.method_14219(1, var1, var2);
         } else {
            this.method_14207(1, var1, var2);
            this.method_14216(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_15424 && this.field_15426 >= var5 && this.field_15428 >= var5 && this.field_15422 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field_15426 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field_15426 : var31 + var22;
            var19[var25] = class_1266.method_5694(new class_8007(this, var31, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field_15426 : var32 + var22;
            var19[var26] = class_1266.method_5694(new class_7313(this, var32, var34, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field_15428 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field_15428 : var33 + var22;
            var19[var27] = class_1266.method_5694(new class_9816(this, var33, var35, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field_15426; var6++) {
            for (int var7 = 0; var7 < this.field_15428; var7++) {
               this.field_15425.method_19204(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field_15428];

         for (int var20 = 0; var20 < this.field_15426; var20++) {
            for (int var8 = 0; var8 < this.field_15422; var8++) {
               for (int var9 = 0; var9 < this.field_15428; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field_15431.method_19204(var17, var2);

               for (int var28 = 0; var28 < this.field_15428; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field_15426];

         for (int var21 = 0; var21 < this.field_15428; var21++) {
            for (int var24 = 0; var24 < this.field_15422; var24++) {
               for (int var29 = 0; var29 < this.field_15426; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field_15432.method_19204(var17, var2);

               for (int var30 = 0; var30 < this.field_15426; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   private void method_14206(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field_15428;
      if (this.field_15422 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_15426; var8++) {
            int var9 = var8 * this.field_15419;

            for (int var10 = 0; var10 < this.field_15428; var10++) {
               this.field_15425.method_19203(var2, var9 + var10 * this.field_15420, var3);
            }

            if (this.field_15422 <= 2) {
               if (this.field_15422 == 2) {
                  for (int var17 = 0; var17 < this.field_15428; var17++) {
                     int var27 = var9 + var17 * this.field_15420;
                     var7[var17] = var2[var27];
                     var7[this.field_15428 + var17] = var2[var27 + 1];
                  }

                  this.field_15431.method_19203(var7, 0, var3);
                  this.field_15431.method_19203(var7, this.field_15428, var3);

                  for (int var18 = 0; var18 < this.field_15428; var18++) {
                     int var28 = var9 + var18 * this.field_15420;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field_15428 + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < this.field_15422; var16 += 4) {
                  for (int var11 = 0; var11 < this.field_15428; var11++) {
                     int var12 = var9 + var11 * this.field_15420 + var16;
                     int var13 = this.field_15428 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field_15428] = var2[var12 + 2];
                     var7[var13 + 2 * this.field_15428] = var2[var12 + 3];
                  }

                  this.field_15431.method_19203(var7, 0, var3);
                  this.field_15431.method_19203(var7, this.field_15428, var3);
                  this.field_15431.method_19203(var7, 2 * this.field_15428, var3);
                  this.field_15431.method_19203(var7, 3 * this.field_15428, var3);

                  for (int var23 = 0; var23 < this.field_15428; var23++) {
                     int var26 = var9 + var23 * this.field_15420 + var16;
                     int var33 = this.field_15428 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field_15428];
                     var2[var26 + 3] = var7[var33 + 2 * this.field_15428];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_15426; var14++) {
            int var15 = var14 * this.field_15419;

            for (int var19 = 0; var19 < this.field_15428; var19++) {
               this.field_15425.method_19196(var2, var15 + var19 * this.field_15420, var3);
            }

            if (this.field_15422 <= 2) {
               if (this.field_15422 == 2) {
                  for (int var21 = 0; var21 < this.field_15428; var21++) {
                     int var31 = var15 + var21 * this.field_15420;
                     var7[var21] = var2[var31];
                     var7[this.field_15428 + var21] = var2[var31 + 1];
                  }

                  this.field_15431.method_19196(var7, 0, var3);
                  this.field_15431.method_19196(var7, this.field_15428, var3);

                  for (int var22 = 0; var22 < this.field_15428; var22++) {
                     int var32 = var15 + var22 * this.field_15420;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field_15428 + var22];
                  }
               }
            } else {
               for (byte var20 = 0; var20 < this.field_15422; var20 += 4) {
                  for (int var24 = 0; var24 < this.field_15428; var24++) {
                     int var29 = var15 + var24 * this.field_15420 + var20;
                     int var34 = this.field_15428 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field_15428] = var2[var29 + 2];
                     var7[var34 + 2 * this.field_15428] = var2[var29 + 3];
                  }

                  this.field_15431.method_19196(var7, 0, var3);
                  this.field_15431.method_19196(var7, this.field_15428, var3);
                  this.field_15431.method_19196(var7, 2 * this.field_15428, var3);
                  this.field_15431.method_19196(var7, 3 * this.field_15428, var3);

                  for (int var25 = 0; var25 < this.field_15428; var25++) {
                     int var30 = var15 + var25 * this.field_15420 + var20;
                     int var35 = this.field_15428 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_15428];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_15428];
                  }
               }
            }
         }
      }
   }

   private void method_14205(int var1, class_4330 var2, boolean var3) {
      long var6 = 4L * this.field_15423;
      if (this.field_15430 == 2L) {
         var6 >>= 1;
      }

      class_4330 var8 = new class_4330(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field_15421; var9++) {
            long var11 = var9 * this.field_15434;

            for (long var13 = 0L; var13 < this.field_15423; var13++) {
               this.field_15425.method_19201(var2, var11 + var13 * this.field_15429, var3);
            }

            if (this.field_15430 <= 2L) {
               if (this.field_15430 == 2L) {
                  for (long var24 = 0L; var24 < this.field_15423; var24++) {
                     long var34 = var11 + var24 * this.field_15429;
                     var8.method_36123(var24, var2.method_36133(var34));
                     var8.method_36123(this.field_15423 + var24, var2.method_36133(var34 + 1L));
                  }

                  this.field_15431.method_19201(var8, 0L, var3);
                  this.field_15431.method_19201(var8, this.field_15423, var3);

                  for (long var25 = 0L; var25 < this.field_15423; var25++) {
                     long var35 = var11 + var25 * this.field_15429;
                     var2.method_36123(var35, var8.method_36133(var25));
                     var2.method_36123(var35 + 1L, var8.method_36133(this.field_15423 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field_15430; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field_15423; var15++) {
                     long var17 = var11 + var15 * this.field_15429 + var23;
                     long var19 = this.field_15423 + var15;
                     var8.method_36123(var15, var2.method_36133(var17));
                     var8.method_36123(var19, var2.method_36133(var17 + 1L));
                     var8.method_36123(var19 + this.field_15423, var2.method_36133(var17 + 2L));
                     var8.method_36123(var19 + 2L * this.field_15423, var2.method_36133(var17 + 3L));
                  }

                  this.field_15431.method_19201(var8, 0L, var3);
                  this.field_15431.method_19201(var8, this.field_15423, var3);
                  this.field_15431.method_19201(var8, 2L * this.field_15423, var3);
                  this.field_15431.method_19201(var8, 3L * this.field_15423, var3);

                  for (long var30 = 0L; var30 < this.field_15423; var30++) {
                     long var33 = var11 + var30 * this.field_15429 + var23;
                     long var40 = this.field_15423 + var30;
                     var2.method_36123(var33, var8.method_36133(var30));
                     var2.method_36123(var33 + 1L, var8.method_36133(var40));
                     var2.method_36123(var33 + 2L, var8.method_36133(var40 + this.field_15423));
                     var2.method_36123(var33 + 3L, var8.method_36133(var40 + 2L * this.field_15423));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field_15421; var21++) {
            long var22 = var21 * this.field_15434;

            for (long var26 = 0L; var26 < this.field_15423; var26++) {
               this.field_15425.method_19194(var2, var22 + var26 * (long)this.field_15420, var3);
            }

            if (this.field_15430 <= 2L) {
               if (this.field_15430 == 2L) {
                  for (long var28 = 0L; var28 < this.field_15423; var28++) {
                     long var38 = var22 + var28 * this.field_15429;
                     var8.method_36123(var28, var2.method_36133(var38));
                     var8.method_36123(this.field_15423 + var28, var2.method_36133(var38 + 1L));
                  }

                  this.field_15431.method_19194(var8, 0L, var3);
                  this.field_15431.method_19194(var8, this.field_15423, var3);

                  for (long var29 = 0L; var29 < this.field_15423; var29++) {
                     long var39 = var22 + var29 * this.field_15429;
                     var2.method_36123(var39, var8.method_36133(var29));
                     var2.method_36123(var39 + 1L, var8.method_36133(this.field_15423 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field_15430; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field_15423; var31++) {
                     long var36 = var22 + var31 * this.field_15429 + var27;
                     long var41 = this.field_15423 + var31;
                     var8.method_36123(var31, var2.method_36133(var36));
                     var8.method_36123(var41, var2.method_36133(var36 + 1L));
                     var8.method_36123(var41 + this.field_15423, var2.method_36133(var36 + 2L));
                     var8.method_36123(var41 + 2L * this.field_15423, var2.method_36133(var36 + 3L));
                  }

                  this.field_15431.method_19194(var8, 0L, var3);
                  this.field_15431.method_19194(var8, this.field_15423, var3);
                  this.field_15431.method_19194(var8, 2L * this.field_15423, var3);
                  this.field_15431.method_19194(var8, 3L * this.field_15423, var3);

                  for (long var32 = 0L; var32 < this.field_15423; var32++) {
                     long var37 = var22 + var32 * this.field_15429 + var27;
                     long var42 = this.field_15423 + var32;
                     var2.method_36123(var37, var8.method_36133(var32));
                     var2.method_36123(var37 + 1L, var8.method_36133(var42));
                     var2.method_36123(var37 + 2L, var8.method_36133(var42 + this.field_15423));
                     var2.method_36123(var37 + 3L, var8.method_36133(var42 + 2L * this.field_15423));
                  }
               }
            }
         }
      }
   }

   private void method_14207(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field_15428;
      if (this.field_15422 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_15426; var8++) {
            for (int var9 = 0; var9 < this.field_15428; var9++) {
               this.field_15425.method_19204(var2[var8][var9], var3);
            }

            if (this.field_15422 <= 2) {
               if (this.field_15422 == 2) {
                  for (int var14 = 0; var14 < this.field_15428; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field_15428 + var14] = var2[var8][var14][1];
                  }

                  this.field_15431.method_19203(var7, 0, var3);
                  this.field_15431.method_19203(var7, this.field_15428, var3);

                  for (int var15 = 0; var15 < this.field_15428; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field_15428 + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < this.field_15422; var13 += 4) {
                  for (int var10 = 0; var10 < this.field_15428; var10++) {
                     int var11 = this.field_15428 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field_15428] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field_15428] = var2[var8][var10][var13 + 3];
                  }

                  this.field_15431.method_19203(var7, 0, var3);
                  this.field_15431.method_19203(var7, this.field_15428, var3);
                  this.field_15431.method_19203(var7, 2 * this.field_15428, var3);
                  this.field_15431.method_19203(var7, 3 * this.field_15428, var3);

                  for (int var20 = 0; var20 < this.field_15428; var20++) {
                     int var23 = this.field_15428 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field_15428];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field_15428];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field_15426; var12++) {
            for (int var16 = 0; var16 < this.field_15428; var16++) {
               this.field_15425.method_19197(var2[var12][var16], var3);
            }

            if (this.field_15422 <= 2) {
               if (this.field_15422 == 2) {
                  for (int var18 = 0; var18 < this.field_15428; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field_15428 + var18] = var2[var12][var18][1];
                  }

                  this.field_15431.method_19196(var7, 0, var3);
                  this.field_15431.method_19196(var7, this.field_15428, var3);

                  for (int var19 = 0; var19 < this.field_15428; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field_15428 + var19];
                  }
               }
            } else {
               for (byte var17 = 0; var17 < this.field_15422; var17 += 4) {
                  for (int var21 = 0; var21 < this.field_15428; var21++) {
                     int var24 = this.field_15428 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field_15428] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field_15428] = var2[var12][var21][var17 + 3];
                  }

                  this.field_15431.method_19196(var7, 0, var3);
                  this.field_15431.method_19196(var7, this.field_15428, var3);
                  this.field_15431.method_19196(var7, 2 * this.field_15428, var3);
                  this.field_15431.method_19196(var7, 3 * this.field_15428, var3);

                  for (int var22 = 0; var22 < this.field_15428; var22++) {
                     int var25 = this.field_15428 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field_15428];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field_15428];
                  }
               }
            }
         }
      }
   }

   private void method_14215(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field_15426;
      if (this.field_15422 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field_15422 <= 2) {
            if (this.field_15422 == 2) {
               for (int var8 = 0; var8 < this.field_15428; var8++) {
                  int var9 = var8 * this.field_15420;

                  for (int var10 = 0; var10 < this.field_15426; var10++) {
                     int var12 = var10 * this.field_15419 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field_15426 + var10] = var2[var12 + 1];
                  }

                  this.field_15432.method_19203(var7, 0, var3);
                  this.field_15432.method_19203(var7, this.field_15426, var3);

                  for (int var20 = 0; var20 < this.field_15426; var20++) {
                     int var28 = var20 * this.field_15419 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field_15426 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field_15428; var14++) {
               int var17 = var14 * this.field_15420;

               for (byte var21 = 0; var21 < this.field_15422; var21 += 4) {
                  for (int var11 = 0; var11 < this.field_15426; var11++) {
                     int var29 = var11 * this.field_15419 + var17 + var21;
                     int var13 = this.field_15426 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field_15426] = var2[var29 + 2];
                     var7[var13 + 2 * this.field_15426] = var2[var29 + 3];
                  }

                  this.field_15432.method_19203(var7, 0, var3);
                  this.field_15432.method_19203(var7, this.field_15426, var3);
                  this.field_15432.method_19203(var7, 2 * this.field_15426, var3);
                  this.field_15432.method_19203(var7, 3 * this.field_15426, var3);

                  for (int var25 = 0; var25 < this.field_15426; var25++) {
                     int var30 = var25 * this.field_15419 + var17 + var21;
                     int var35 = this.field_15426 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_15426];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_15426];
                  }
               }
            }
         }
      } else if (this.field_15422 <= 2) {
         if (this.field_15422 == 2) {
            for (int var15 = 0; var15 < this.field_15428; var15++) {
               int var18 = var15 * this.field_15420;

               for (int var22 = 0; var22 < this.field_15426; var22++) {
                  int var31 = var22 * this.field_15419 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field_15426 + var22] = var2[var31 + 1];
               }

               this.field_15432.method_19196(var7, 0, var3);
               this.field_15432.method_19196(var7, this.field_15426, var3);

               for (int var23 = 0; var23 < this.field_15426; var23++) {
                  int var32 = var23 * this.field_15419 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field_15426 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field_15428; var16++) {
            int var19 = var16 * this.field_15420;

            for (byte var24 = 0; var24 < this.field_15422; var24 += 4) {
               for (int var26 = 0; var26 < this.field_15426; var26++) {
                  int var33 = var26 * this.field_15419 + var19 + var24;
                  int var36 = this.field_15426 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field_15426] = var2[var33 + 2];
                  var7[var36 + 2 * this.field_15426] = var2[var33 + 3];
               }

               this.field_15432.method_19196(var7, 0, var3);
               this.field_15432.method_19196(var7, this.field_15426, var3);
               this.field_15432.method_19196(var7, 2 * this.field_15426, var3);
               this.field_15432.method_19196(var7, 3 * this.field_15426, var3);

               for (int var27 = 0; var27 < this.field_15426; var27++) {
                  int var34 = var27 * this.field_15419 + var19 + var24;
                  int var37 = this.field_15426 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field_15426];
                  var2[var34 + 3] = var7[var37 + 2 * this.field_15426];
               }
            }
         }
      }
   }

   private void method_14214(int var1, class_4330 var2, boolean var3) {
      long var6 = 4L * this.field_15421;
      if (this.field_15430 == 2L) {
         var6 >>= 1;
      }

      class_4330 var8 = new class_4330(var6);
      if (var1 != -1) {
         if (this.field_15430 <= 2L) {
            if (this.field_15430 == 2L) {
               for (long var9 = 0L; var9 < this.field_15423; var9++) {
                  long var11 = var9 * this.field_15429;

                  for (long var13 = 0L; var13 < this.field_15421; var13++) {
                     long var17 = var13 * this.field_15434 + var11;
                     var8.method_36123(var13, var2.method_36133(var17));
                     var8.method_36123(this.field_15421 + var13, var2.method_36133(var17 + 1L));
                  }

                  this.field_15432.method_19201(var8, 0L, var3);
                  this.field_15432.method_19201(var8, this.field_15421, var3);

                  for (long var27 = 0L; var27 < this.field_15421; var27++) {
                     long var35 = var27 * this.field_15434 + var11;
                     var2.method_36123(var35, var8.method_36133(var27));
                     var2.method_36123(var35 + 1L, var8.method_36133(this.field_15421 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field_15423; var21++) {
               long var24 = var21 * this.field_15429;

               for (long var28 = 0L; var28 < this.field_15430; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field_15421; var15++) {
                     long var36 = var15 * this.field_15434 + var24 + var28;
                     long var19 = this.field_15421 + var15;
                     var8.method_36123(var15, var2.method_36133(var36));
                     var8.method_36123(var19, var2.method_36133(var36 + 1L));
                     var8.method_36123(var19 + this.field_15421, var2.method_36133(var36 + 2L));
                     var8.method_36123(var19 + 2L * this.field_15421, var2.method_36133(var36 + 3L));
                  }

                  this.field_15432.method_19201(var8, 0L, var3);
                  this.field_15432.method_19201(var8, this.field_15421, var3);
                  this.field_15432.method_19201(var8, 2L * this.field_15421, var3);
                  this.field_15432.method_19201(var8, 3L * this.field_15421, var3);

                  for (long var32 = 0L; var32 < this.field_15421; var32++) {
                     long var37 = var32 * this.field_15434 + var24 + var28;
                     long var42 = this.field_15421 + var32;
                     var2.method_36123(var37, var8.method_36133(var32));
                     var2.method_36123(var37 + 1L, var8.method_36133(var42));
                     var2.method_36123(var37 + 2L, var8.method_36133(var42 + this.field_15421));
                     var2.method_36123(var37 + 3L, var8.method_36133(var42 + 2L * this.field_15421));
                  }
               }
            }
         }
      } else if (this.field_15430 <= 2L) {
         if (this.field_15430 == 2L) {
            for (long var22 = 0L; var22 < this.field_15423; var22++) {
               long var25 = var22 * this.field_15429;

               for (long var29 = 0L; var29 < this.field_15421; var29++) {
                  long var38 = var29 * this.field_15434 + var25;
                  var8.method_36123(var29, var2.method_36133(var38));
                  var8.method_36123(this.field_15421 + var29, var2.method_36133(var38 + 1L));
               }

               this.field_15432.method_19194(var8, 0L, var3);
               this.field_15432.method_19194(var8, this.field_15421, var3);

               for (long var30 = 0L; var30 < this.field_15421; var30++) {
                  long var39 = var30 * this.field_15434 + var25;
                  var2.method_36123(var39, var8.method_36133(var30));
                  var2.method_36123(var39 + 1L, var8.method_36133(this.field_15421 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field_15423; var23++) {
            long var26 = var23 * this.field_15429;

            for (long var31 = 0L; var31 < this.field_15430; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field_15421; var33++) {
                  long var40 = var33 * this.field_15434 + var26 + var31;
                  long var43 = this.field_15421 + var33;
                  var8.method_36123(var33, var2.method_36133(var40));
                  var8.method_36123(var43, var2.method_36133(var40 + 1L));
                  var8.method_36123(var43 + this.field_15421, var2.method_36133(var40 + 2L));
                  var8.method_36123(var43 + 2L * this.field_15421, var2.method_36133(var40 + 3L));
               }

               this.field_15432.method_19194(var8, 0L, var3);
               this.field_15432.method_19194(var8, this.field_15421, var3);
               this.field_15432.method_19194(var8, 2L * this.field_15421, var3);
               this.field_15432.method_19194(var8, 3L * this.field_15421, var3);

               for (long var34 = 0L; var34 < this.field_15421; var34++) {
                  long var41 = var34 * this.field_15434 + var26 + var31;
                  long var44 = this.field_15421 + var34;
                  var2.method_36123(var41, var8.method_36133(var34));
                  var2.method_36123(var41 + 1L, var8.method_36133(var44));
                  var2.method_36123(var41 + 2L, var8.method_36133(var44 + this.field_15421));
                  var2.method_36123(var41 + 3L, var8.method_36133(var44 + 2L * this.field_15421));
               }
            }
         }
      }
   }

   private void method_14216(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field_15426;
      if (this.field_15422 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field_15422 <= 2) {
            if (this.field_15422 == 2) {
               for (int var8 = 0; var8 < this.field_15428; var8++) {
                  for (int var9 = 0; var9 < this.field_15426; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field_15426 + var9] = var2[var9][var8][1];
                  }

                  this.field_15432.method_19203(var7, 0, var3);
                  this.field_15432.method_19203(var7, this.field_15426, var3);

                  for (int var15 = 0; var15 < this.field_15426; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field_15426 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field_15428; var12++) {
               for (byte var16 = 0; var16 < this.field_15422; var16 += 4) {
                  for (int var10 = 0; var10 < this.field_15426; var10++) {
                     int var11 = this.field_15426 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field_15426] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field_15426] = var2[var10][var12][var16 + 3];
                  }

                  this.field_15432.method_19203(var7, 0, var3);
                  this.field_15432.method_19203(var7, this.field_15426, var3);
                  this.field_15432.method_19203(var7, 2 * this.field_15426, var3);
                  this.field_15432.method_19203(var7, 3 * this.field_15426, var3);

                  for (int var20 = 0; var20 < this.field_15426; var20++) {
                     int var23 = this.field_15426 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field_15426];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field_15426];
                  }
               }
            }
         }
      } else if (this.field_15422 <= 2) {
         if (this.field_15422 == 2) {
            for (int var13 = 0; var13 < this.field_15428; var13++) {
               for (int var17 = 0; var17 < this.field_15426; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field_15426 + var17] = var2[var17][var13][1];
               }

               this.field_15432.method_19196(var7, 0, var3);
               this.field_15432.method_19196(var7, this.field_15426, var3);

               for (int var18 = 0; var18 < this.field_15426; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field_15426 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_15428; var14++) {
            for (byte var19 = 0; var19 < this.field_15422; var19 += 4) {
               for (int var21 = 0; var21 < this.field_15426; var21++) {
                  int var24 = this.field_15426 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field_15426] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field_15426] = var2[var21][var14][var19 + 3];
               }

               this.field_15432.method_19196(var7, 0, var3);
               this.field_15432.method_19196(var7, this.field_15426, var3);
               this.field_15432.method_19196(var7, 2 * this.field_15426, var3);
               this.field_15432.method_19196(var7, 3 * this.field_15426, var3);

               for (int var22 = 0; var22 < this.field_15426; var22++) {
                  int var25 = this.field_15426 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field_15426];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field_15426];
               }
            }
         }
      }
   }

   private void method_14209(int var1, float[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_15426 ? this.field_15426 : class_1266.method_5693();
      int var7 = 4 * this.field_15428;
      if (this.field_15422 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_456(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_14208(int var1, class_4330 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_15421 ? this.field_15421 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_15423;
      if (this.field_15430 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_2395(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_14210(int var1, float[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_15426 ? this.field_15426 : class_1266.method_5693();
      int var7 = 4 * this.field_15428;
      if (this.field_15422 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_9482(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_14218(int var1, float[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_15428 ? this.field_15428 : class_1266.method_5693();
      int var7 = 4 * this.field_15426;
      if (this.field_15422 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_3671(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_14217(int var1, class_4330 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_15423 ? this.field_15423 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_15421;
      if (this.field_15430 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_8397(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_14219(int var1, float[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_15428 ? this.field_15428 : class_1266.method_5693();
      int var7 = 4 * this.field_15426;
      if (this.field_15422 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_8090(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_3101.class.getName()).log(Level.SEVERE, null, var13);
      }
   }
}
