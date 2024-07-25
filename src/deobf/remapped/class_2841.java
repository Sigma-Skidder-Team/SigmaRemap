package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_2841 {
   private int field_13912;
   private long field_13908;
   private int field_13914;
   private long field_13909;
   private int field_13910;
   private long field_13916;
   private int field_13913;
   private long field_13906;
   private int field_13911;
   private long field_13901;
   private class_4560 field_13915;
   private class_4560 field_13907;
   private class_4560 field_13902;
   private boolean field_13905 = false;
   private boolean field_13903 = false;

   public class_2841(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field_13912 = (int)var1;
         this.field_13914 = (int)var3;
         this.field_13910 = (int)var5;
         this.field_13908 = var1;
         this.field_13909 = var3;
         this.field_13916 = var5;
         this.field_13913 = (int)(var3 * var5);
         this.field_13911 = (int)var5;
         this.field_13906 = var3 * var5;
         this.field_13901 = var5;
         if (var1 * var3 * var5 >= class_2751.method_12537()) {
            this.field_13903 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3) && class_2751.method_12439(var5)) {
            this.field_13905 = true;
         }

         class_2751.method_12507(var1 * var3 * var5 > (long)class_7975.method_36102());
         this.field_13915 = new class_4560(var1);
         if (var1 != var3) {
            this.field_13907 = new class_4560(var3);
         } else {
            this.field_13907 = this.field_13915;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field_13902 = new class_4560(var5);
            } else {
               this.field_13902 = this.field_13907;
            }
         } else {
            this.field_13902 = this.field_13915;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method_12916(float[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_13905) {
         if (var5 > 1 && this.field_13903) {
            this.method_12925(-1, var1, var2);
            this.method_12930(-1, var1, var2);
         } else {
            this.method_12919(-1, var1, var2);
            this.method_12910(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_13903 && this.field_13912 >= var5 && this.field_13914 >= var5 && this.field_13910 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field_13912 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field_13912 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_5951(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field_13912 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_6252(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field_13914 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field_13914 : var33 + var23;
            var20[var29] = class_1266.method_5694(new class_9073(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field_13912; var6++) {
            int var7 = var6 * this.field_13913;

            for (int var8 = 0; var8 < this.field_13914; var8++) {
               this.field_13902.method_21139(var1, var7 + var8 * this.field_13911, var2);
            }
         }

         float[] var18 = new float[this.field_13914];

         for (int var21 = 0; var21 < this.field_13912; var21++) {
            int var25 = var21 * this.field_13913;

            for (int var9 = 0; var9 < this.field_13910; var9++) {
               for (int var10 = 0; var10 < this.field_13914; var10++) {
                  int var11 = var25 + var10 * this.field_13911 + var9;
                  var18[var10] = var1[var11];
               }

               this.field_13907.method_21140(var18, var2);

               for (int var34 = 0; var34 < this.field_13914; var34++) {
                  int var40 = var25 + var34 * this.field_13911 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field_13912];

         for (int var22 = 0; var22 < this.field_13914; var22++) {
            int var26 = var22 * this.field_13911;

            for (int var30 = 0; var30 < this.field_13910; var30++) {
               for (int var35 = 0; var35 < this.field_13912; var35++) {
                  int var41 = var35 * this.field_13913 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field_13915.method_21140(var18, var2);

               for (int var36 = 0; var36 < this.field_13912; var36++) {
                  int var42 = var36 * this.field_13913 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method_12915(class_4330 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_13905) {
         if (var5 > 1 && this.field_13903) {
            this.method_12924(-1, var1, var2);
            this.method_12929(-1, var1, var2);
         } else {
            this.method_12918(-1, var1, var2);
            this.method_12909(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_13903 && this.field_13908 >= (long)var5 && this.field_13909 >= (long)var5 && this.field_13916 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field_13908 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field_13908 : var39 + var35;
            var33[var9] = class_1266.method_5694(new class_6326(this, var39, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field_13908 : var40 + var35;
            var33[var37] = class_1266.method_5694(new class_671(this, var40, var42, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field_13909 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field_13909 : var41 + var35;
            var33[var38] = class_1266.method_5694(new class_2802(this, var41, var43, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field_13908; var14++) {
            long var16 = var14 * this.field_13906;

            for (long var10 = 0L; var10 < this.field_13909; var10++) {
               this.field_13902.method_21137(var1, var16 + var10 * this.field_13901, var2);
            }
         }

         class_4330 var6 = new class_4330(this.field_13909, false);

         for (long var7 = 0L; var7 < this.field_13908; var7++) {
            long var18 = var7 * this.field_13906;

            for (long var20 = 0L; var20 < this.field_13916; var20++) {
               for (long var22 = 0L; var22 < this.field_13909; var22++) {
                  long var24 = var18 + var22 * this.field_13901 + var20;
                  var6.method_36123(var22, var1.method_36133(var24));
               }

               this.field_13907.method_21138(var6, var2);

               for (long var46 = 0L; var46 < this.field_13909; var46++) {
                  long var49 = var18 + var46 * this.field_13901 + var20;
                  var1.method_36123(var49, var6.method_36133(var46));
               }
            }
         }

         var6 = new class_4330(this.field_13908, false);

         for (long var34 = 0L; var34 < this.field_13909; var34++) {
            long var44 = var34 * this.field_13901;

            for (long var45 = 0L; var45 < this.field_13916; var45++) {
               for (long var47 = 0L; var47 < this.field_13908; var47++) {
                  long var50 = var47 * this.field_13906 + var44 + var45;
                  var6.method_36123(var47, var1.method_36133(var50));
               }

               this.field_13915.method_21138(var6, var2);

               for (long var48 = 0L; var48 < this.field_13908; var48++) {
                  long var51 = var48 * this.field_13906 + var44 + var45;
                  var1.method_36123(var51, var6.method_36133(var48));
               }
            }
         }
      }
   }

   public void method_12917(float[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_13905) {
         if (var5 > 1 && this.field_13903) {
            this.method_12926(-1, var1, var2);
            this.method_12931(-1, var1, var2);
         } else {
            this.method_12920(-1, var1, var2);
            this.method_12911(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_13903 && this.field_13912 >= var5 && this.field_13914 >= var5 && this.field_13910 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field_13912 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field_13912 : var31 + var22;
            var19[var25] = class_1266.method_5694(new class_576(this, var31, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field_13912 : var32 + var22;
            var19[var26] = class_1266.method_5694(new class_152(this, var32, var34, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field_13914 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field_13914 : var33 + var22;
            var19[var27] = class_1266.method_5694(new class_8893(this, var33, var35, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field_13912; var6++) {
            for (int var7 = 0; var7 < this.field_13914; var7++) {
               this.field_13902.method_21140(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field_13914];

         for (int var20 = 0; var20 < this.field_13912; var20++) {
            for (int var8 = 0; var8 < this.field_13910; var8++) {
               for (int var9 = 0; var9 < this.field_13914; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field_13907.method_21140(var17, var2);

               for (int var28 = 0; var28 < this.field_13914; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field_13912];

         for (int var21 = 0; var21 < this.field_13914; var21++) {
            for (int var24 = 0; var24 < this.field_13910; var24++) {
               for (int var29 = 0; var29 < this.field_13912; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field_13915.method_21140(var17, var2);

               for (int var30 = 0; var30 < this.field_13912; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   public void method_12935(float[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_13905) {
         if (var5 > 1 && this.field_13903) {
            this.method_12925(1, var1, var2);
            this.method_12930(1, var1, var2);
         } else {
            this.method_12919(1, var1, var2);
            this.method_12910(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_13903 && this.field_13912 >= var5 && this.field_13914 >= var5 && this.field_13910 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field_13912 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field_13912 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_4840(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field_13912 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_3576(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field_13914 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field_13914 : var33 + var23;
            var20[var29] = class_1266.method_5694(new class_1265(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field_13912; var6++) {
            int var7 = var6 * this.field_13913;

            for (int var8 = 0; var8 < this.field_13914; var8++) {
               this.field_13902.method_21131(var1, var7 + var8 * this.field_13911, var2);
            }
         }

         float[] var18 = new float[this.field_13914];

         for (int var21 = 0; var21 < this.field_13912; var21++) {
            int var25 = var21 * this.field_13913;

            for (int var9 = 0; var9 < this.field_13910; var9++) {
               for (int var10 = 0; var10 < this.field_13914; var10++) {
                  int var11 = var25 + var10 * this.field_13911 + var9;
                  var18[var10] = var1[var11];
               }

               this.field_13907.method_21132(var18, var2);

               for (int var34 = 0; var34 < this.field_13914; var34++) {
                  int var40 = var25 + var34 * this.field_13911 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field_13912];

         for (int var22 = 0; var22 < this.field_13914; var22++) {
            int var26 = var22 * this.field_13911;

            for (int var30 = 0; var30 < this.field_13910; var30++) {
               for (int var35 = 0; var35 < this.field_13912; var35++) {
                  int var41 = var35 * this.field_13913 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field_13915.method_21132(var18, var2);

               for (int var36 = 0; var36 < this.field_13912; var36++) {
                  int var42 = var36 * this.field_13913 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method_12934(class_4330 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_13905) {
         if (var5 > 1 && this.field_13903) {
            this.method_12924(1, var1, var2);
            this.method_12929(1, var1, var2);
         } else {
            this.method_12918(1, var1, var2);
            this.method_12909(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_13903 && this.field_13908 >= (long)var5 && this.field_13909 >= (long)var5 && this.field_13916 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field_13908 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field_13908 : var39 + var35;
            var33[var9] = class_1266.method_5694(new class_2495(this, var39, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field_13908 : var40 + var35;
            var33[var37] = class_1266.method_5694(new class_5330(this, var40, var42, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field_13909 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field_13909 : var41 + var35;
            var33[var38] = class_1266.method_5694(new class_7234(this, var41, var43, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field_13908; var14++) {
            long var16 = var14 * this.field_13906;

            for (long var10 = 0L; var10 < this.field_13909; var10++) {
               this.field_13902.method_21129(var1, var16 + var10 * this.field_13901, var2);
            }
         }

         class_4330 var6 = new class_4330(this.field_13909, false);

         for (long var7 = 0L; var7 < this.field_13908; var7++) {
            long var18 = var7 * this.field_13906;

            for (long var20 = 0L; var20 < this.field_13916; var20++) {
               for (long var22 = 0L; var22 < this.field_13909; var22++) {
                  long var24 = var18 + var22 * this.field_13901 + var20;
                  var6.method_36123(var22, var1.method_36133(var24));
               }

               this.field_13907.method_21130(var6, var2);

               for (long var46 = 0L; var46 < this.field_13909; var46++) {
                  long var49 = var18 + var46 * this.field_13901 + var20;
                  var1.method_36123(var49, var6.method_36133(var46));
               }
            }
         }

         var6 = new class_4330(this.field_13908, false);

         for (long var34 = 0L; var34 < this.field_13909; var34++) {
            long var44 = var34 * this.field_13901;

            for (long var45 = 0L; var45 < this.field_13916; var45++) {
               for (long var47 = 0L; var47 < this.field_13908; var47++) {
                  long var50 = var47 * this.field_13906 + var44 + var45;
                  var6.method_36123(var47, var1.method_36133(var50));
               }

               this.field_13915.method_21130(var6, var2);

               for (long var48 = 0L; var48 < this.field_13908; var48++) {
                  long var51 = var48 * this.field_13906 + var44 + var45;
                  var1.method_36123(var51, var6.method_36133(var48));
               }
            }
         }
      }
   }

   public void method_12936(float[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_13905) {
         if (var5 > 1 && this.field_13903) {
            this.method_12926(1, var1, var2);
            this.method_12931(1, var1, var2);
         } else {
            this.method_12920(1, var1, var2);
            this.method_12911(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_13903 && this.field_13912 >= var5 && this.field_13914 >= var5 && this.field_13910 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field_13912 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field_13912 : var31 + var22;
            var19[var25] = class_1266.method_5694(new class_1660(this, var31, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field_13912 : var32 + var22;
            var19[var26] = class_1266.method_5694(new class_1246(this, var32, var34, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field_13914 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field_13914 : var33 + var22;
            var19[var27] = class_1266.method_5694(new class_3703(this, var33, var35, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field_13912; var6++) {
            for (int var7 = 0; var7 < this.field_13914; var7++) {
               this.field_13902.method_21132(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field_13914];

         for (int var20 = 0; var20 < this.field_13912; var20++) {
            for (int var8 = 0; var8 < this.field_13910; var8++) {
               for (int var9 = 0; var9 < this.field_13914; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field_13907.method_21132(var17, var2);

               for (int var28 = 0; var28 < this.field_13914; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field_13912];

         for (int var21 = 0; var21 < this.field_13914; var21++) {
            for (int var24 = 0; var24 < this.field_13910; var24++) {
               for (int var29 = 0; var29 < this.field_13912; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field_13915.method_21132(var17, var2);

               for (int var30 = 0; var30 < this.field_13912; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   private void method_12919(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field_13914;
      if (this.field_13910 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_13912; var8++) {
            int var9 = var8 * this.field_13913;

            for (int var10 = 0; var10 < this.field_13914; var10++) {
               this.field_13902.method_21131(var2, var9 + var10 * this.field_13911, var3);
            }

            if (this.field_13910 <= 2) {
               if (this.field_13910 == 2) {
                  for (int var17 = 0; var17 < this.field_13914; var17++) {
                     int var27 = var9 + var17 * this.field_13911;
                     var7[var17] = var2[var27];
                     var7[this.field_13914 + var17] = var2[var27 + 1];
                  }

                  this.field_13907.method_21131(var7, 0, var3);
                  this.field_13907.method_21131(var7, this.field_13914, var3);

                  for (int var18 = 0; var18 < this.field_13914; var18++) {
                     int var28 = var9 + var18 * this.field_13911;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field_13914 + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < this.field_13910; var16 += 4) {
                  for (int var11 = 0; var11 < this.field_13914; var11++) {
                     int var12 = var9 + var11 * this.field_13911 + var16;
                     int var13 = this.field_13914 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field_13914] = var2[var12 + 2];
                     var7[var13 + 2 * this.field_13914] = var2[var12 + 3];
                  }

                  this.field_13907.method_21131(var7, 0, var3);
                  this.field_13907.method_21131(var7, this.field_13914, var3);
                  this.field_13907.method_21131(var7, 2 * this.field_13914, var3);
                  this.field_13907.method_21131(var7, 3 * this.field_13914, var3);

                  for (int var23 = 0; var23 < this.field_13914; var23++) {
                     int var26 = var9 + var23 * this.field_13911 + var16;
                     int var33 = this.field_13914 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field_13914];
                     var2[var26 + 3] = var7[var33 + 2 * this.field_13914];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_13912; var14++) {
            int var15 = var14 * this.field_13913;

            for (int var19 = 0; var19 < this.field_13914; var19++) {
               this.field_13902.method_21139(var2, var15 + var19 * this.field_13911, var3);
            }

            if (this.field_13910 <= 2) {
               if (this.field_13910 == 2) {
                  for (int var21 = 0; var21 < this.field_13914; var21++) {
                     int var31 = var15 + var21 * this.field_13911;
                     var7[var21] = var2[var31];
                     var7[this.field_13914 + var21] = var2[var31 + 1];
                  }

                  this.field_13907.method_21139(var7, 0, var3);
                  this.field_13907.method_21139(var7, this.field_13914, var3);

                  for (int var22 = 0; var22 < this.field_13914; var22++) {
                     int var32 = var15 + var22 * this.field_13911;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field_13914 + var22];
                  }
               }
            } else {
               for (byte var20 = 0; var20 < this.field_13910; var20 += 4) {
                  for (int var24 = 0; var24 < this.field_13914; var24++) {
                     int var29 = var15 + var24 * this.field_13911 + var20;
                     int var34 = this.field_13914 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field_13914] = var2[var29 + 2];
                     var7[var34 + 2 * this.field_13914] = var2[var29 + 3];
                  }

                  this.field_13907.method_21139(var7, 0, var3);
                  this.field_13907.method_21139(var7, this.field_13914, var3);
                  this.field_13907.method_21139(var7, 2 * this.field_13914, var3);
                  this.field_13907.method_21139(var7, 3 * this.field_13914, var3);

                  for (int var25 = 0; var25 < this.field_13914; var25++) {
                     int var30 = var15 + var25 * this.field_13911 + var20;
                     int var35 = this.field_13914 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_13914];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_13914];
                  }
               }
            }
         }
      }
   }

   private void method_12918(int var1, class_4330 var2, boolean var3) {
      long var6 = 4L * this.field_13909;
      if (this.field_13916 == 2L) {
         var6 >>= 1;
      }

      class_4330 var8 = new class_4330(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field_13908; var9++) {
            long var11 = var9 * this.field_13906;

            for (long var13 = 0L; var13 < this.field_13909; var13++) {
               this.field_13902.method_21129(var2, var11 + var13 * this.field_13901, var3);
            }

            if (this.field_13916 <= 2L) {
               if (this.field_13916 == 2L) {
                  for (long var24 = 0L; var24 < this.field_13909; var24++) {
                     long var34 = var11 + var24 * this.field_13901;
                     var8.method_36123(var24, var2.method_36133(var34));
                     var8.method_36123(this.field_13909 + var24, var2.method_36133(var34 + 1L));
                  }

                  this.field_13907.method_21129(var8, 0L, var3);
                  this.field_13907.method_21129(var8, this.field_13909, var3);

                  for (long var25 = 0L; var25 < this.field_13909; var25++) {
                     long var35 = var11 + var25 * this.field_13901;
                     var2.method_36123(var35, var8.method_36133(var25));
                     var2.method_36123(var35 + 1L, var8.method_36133(this.field_13909 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field_13916; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field_13909; var15++) {
                     long var17 = var11 + var15 * this.field_13901 + var23;
                     long var19 = this.field_13909 + var15;
                     var8.method_36123(var15, var2.method_36133(var17));
                     var8.method_36123(var19, var2.method_36133(var17 + 1L));
                     var8.method_36123(var19 + this.field_13909, var2.method_36133(var17 + 2L));
                     var8.method_36123(var19 + 2L * this.field_13909, var2.method_36133(var17 + 3L));
                  }

                  this.field_13907.method_21129(var8, 0L, var3);
                  this.field_13907.method_21129(var8, this.field_13909, var3);
                  this.field_13907.method_21129(var8, 2L * this.field_13909, var3);
                  this.field_13907.method_21129(var8, 3L * this.field_13909, var3);

                  for (long var30 = 0L; var30 < this.field_13909; var30++) {
                     long var33 = var11 + var30 * this.field_13901 + var23;
                     long var40 = this.field_13909 + var30;
                     var2.method_36123(var33, var8.method_36133(var30));
                     var2.method_36123(var33 + 1L, var8.method_36133(var40));
                     var2.method_36123(var33 + 2L, var8.method_36133(var40 + this.field_13909));
                     var2.method_36123(var33 + 3L, var8.method_36133(var40 + 2L * this.field_13909));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field_13908; var21++) {
            long var22 = var21 * this.field_13906;

            for (long var26 = 0L; var26 < this.field_13909; var26++) {
               this.field_13902.method_21137(var2, var22 + var26 * this.field_13901, var3);
            }

            if (this.field_13916 <= 2L) {
               if (this.field_13916 == 2L) {
                  for (long var28 = 0L; var28 < this.field_13909; var28++) {
                     long var38 = var22 + var28 * this.field_13901;
                     var8.method_36123(var28, var2.method_36133(var38));
                     var8.method_36123(this.field_13909 + var28, var2.method_36133(var38 + 1L));
                  }

                  this.field_13907.method_21137(var8, 0L, var3);
                  this.field_13907.method_21137(var8, this.field_13909, var3);

                  for (long var29 = 0L; var29 < this.field_13909; var29++) {
                     long var39 = var22 + var29 * this.field_13901;
                     var2.method_36123(var39, var8.method_36133(var29));
                     var2.method_36123(var39 + 1L, var8.method_36133(this.field_13909 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field_13916; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field_13909; var31++) {
                     long var36 = var22 + var31 * this.field_13901 + var27;
                     long var41 = this.field_13909 + var31;
                     var8.method_36123(var31, var2.method_36133(var36));
                     var8.method_36123(var41, var2.method_36133(var36 + 1L));
                     var8.method_36123(var41 + this.field_13909, var2.method_36133(var36 + 2L));
                     var8.method_36123(var41 + 2L * this.field_13909, var2.method_36133(var36 + 3L));
                  }

                  this.field_13907.method_21137(var8, 0L, var3);
                  this.field_13907.method_21137(var8, this.field_13909, var3);
                  this.field_13907.method_21137(var8, 2L * this.field_13909, var3);
                  this.field_13907.method_21137(var8, 3L * this.field_13909, var3);

                  for (long var32 = 0L; var32 < this.field_13909; var32++) {
                     long var37 = var22 + var32 * this.field_13901 + var27;
                     long var42 = this.field_13909 + var32;
                     var2.method_36123(var37, var8.method_36133(var32));
                     var2.method_36123(var37 + 1L, var8.method_36133(var42));
                     var2.method_36123(var37 + 2L, var8.method_36133(var42 + this.field_13909));
                     var2.method_36123(var37 + 3L, var8.method_36133(var42 + 2L * this.field_13909));
                  }
               }
            }
         }
      }
   }

   private void method_12920(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field_13914;
      if (this.field_13910 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_13912; var8++) {
            for (int var9 = 0; var9 < this.field_13914; var9++) {
               this.field_13902.method_21132(var2[var8][var9], var3);
            }

            if (this.field_13910 <= 2) {
               if (this.field_13910 == 2) {
                  for (int var14 = 0; var14 < this.field_13914; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field_13914 + var14] = var2[var8][var14][1];
                  }

                  this.field_13907.method_21131(var7, 0, var3);
                  this.field_13907.method_21131(var7, this.field_13914, var3);

                  for (int var15 = 0; var15 < this.field_13914; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field_13914 + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < this.field_13910; var13 += 4) {
                  for (int var10 = 0; var10 < this.field_13914; var10++) {
                     int var11 = this.field_13914 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field_13914] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field_13914] = var2[var8][var10][var13 + 3];
                  }

                  this.field_13907.method_21131(var7, 0, var3);
                  this.field_13907.method_21131(var7, this.field_13914, var3);
                  this.field_13907.method_21131(var7, 2 * this.field_13914, var3);
                  this.field_13907.method_21131(var7, 3 * this.field_13914, var3);

                  for (int var20 = 0; var20 < this.field_13914; var20++) {
                     int var23 = this.field_13914 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field_13914];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field_13914];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field_13912; var12++) {
            for (int var16 = 0; var16 < this.field_13914; var16++) {
               this.field_13902.method_21140(var2[var12][var16], var3);
            }

            if (this.field_13910 <= 2) {
               if (this.field_13910 == 2) {
                  for (int var18 = 0; var18 < this.field_13914; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field_13914 + var18] = var2[var12][var18][1];
                  }

                  this.field_13907.method_21139(var7, 0, var3);
                  this.field_13907.method_21139(var7, this.field_13914, var3);

                  for (int var19 = 0; var19 < this.field_13914; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field_13914 + var19];
                  }
               }
            } else {
               for (byte var17 = 0; var17 < this.field_13910; var17 += 4) {
                  for (int var21 = 0; var21 < this.field_13914; var21++) {
                     int var24 = this.field_13914 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field_13914] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field_13914] = var2[var12][var21][var17 + 3];
                  }

                  this.field_13907.method_21139(var7, 0, var3);
                  this.field_13907.method_21139(var7, this.field_13914, var3);
                  this.field_13907.method_21139(var7, 2 * this.field_13914, var3);
                  this.field_13907.method_21139(var7, 3 * this.field_13914, var3);

                  for (int var22 = 0; var22 < this.field_13914; var22++) {
                     int var25 = this.field_13914 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field_13914];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field_13914];
                  }
               }
            }
         }
      }
   }

   private void method_12910(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field_13912;
      if (this.field_13910 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field_13910 <= 2) {
            if (this.field_13910 == 2) {
               for (int var8 = 0; var8 < this.field_13914; var8++) {
                  int var9 = var8 * this.field_13911;

                  for (int var10 = 0; var10 < this.field_13912; var10++) {
                     int var12 = var10 * this.field_13913 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field_13912 + var10] = var2[var12 + 1];
                  }

                  this.field_13915.method_21131(var7, 0, var3);
                  this.field_13915.method_21131(var7, this.field_13912, var3);

                  for (int var20 = 0; var20 < this.field_13912; var20++) {
                     int var28 = var20 * this.field_13913 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field_13912 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field_13914; var14++) {
               int var17 = var14 * this.field_13911;

               for (byte var21 = 0; var21 < this.field_13910; var21 += 4) {
                  for (int var11 = 0; var11 < this.field_13912; var11++) {
                     int var29 = var11 * this.field_13913 + var17 + var21;
                     int var13 = this.field_13912 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field_13912] = var2[var29 + 2];
                     var7[var13 + 2 * this.field_13912] = var2[var29 + 3];
                  }

                  this.field_13915.method_21131(var7, 0, var3);
                  this.field_13915.method_21131(var7, this.field_13912, var3);
                  this.field_13915.method_21131(var7, 2 * this.field_13912, var3);
                  this.field_13915.method_21131(var7, 3 * this.field_13912, var3);

                  for (int var25 = 0; var25 < this.field_13912; var25++) {
                     int var30 = var25 * this.field_13913 + var17 + var21;
                     int var35 = this.field_13912 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_13912];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_13912];
                  }
               }
            }
         }
      } else if (this.field_13910 <= 2) {
         if (this.field_13910 == 2) {
            for (int var15 = 0; var15 < this.field_13914; var15++) {
               int var18 = var15 * this.field_13911;

               for (int var22 = 0; var22 < this.field_13912; var22++) {
                  int var31 = var22 * this.field_13913 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field_13912 + var22] = var2[var31 + 1];
               }

               this.field_13915.method_21139(var7, 0, var3);
               this.field_13915.method_21139(var7, this.field_13912, var3);

               for (int var23 = 0; var23 < this.field_13912; var23++) {
                  int var32 = var23 * this.field_13913 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field_13912 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field_13914; var16++) {
            int var19 = var16 * this.field_13911;

            for (byte var24 = 0; var24 < this.field_13910; var24 += 4) {
               for (int var26 = 0; var26 < this.field_13912; var26++) {
                  int var33 = var26 * this.field_13913 + var19 + var24;
                  int var36 = this.field_13912 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field_13912] = var2[var33 + 2];
                  var7[var36 + 2 * this.field_13912] = var2[var33 + 3];
               }

               this.field_13915.method_21139(var7, 0, var3);
               this.field_13915.method_21139(var7, this.field_13912, var3);
               this.field_13915.method_21139(var7, 2 * this.field_13912, var3);
               this.field_13915.method_21139(var7, 3 * this.field_13912, var3);

               for (int var27 = 0; var27 < this.field_13912; var27++) {
                  int var34 = var27 * this.field_13913 + var19 + var24;
                  int var37 = this.field_13912 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field_13912];
                  var2[var34 + 3] = var7[var37 + 2 * this.field_13912];
               }
            }
         }
      }
   }

   private void method_12909(int var1, class_4330 var2, boolean var3) {
      long var6 = 4L * this.field_13908;
      if (this.field_13916 == 2L) {
         var6 >>= 1;
      }

      class_4330 var8 = new class_4330(var6);
      if (var1 != -1) {
         if (this.field_13916 <= 2L) {
            if (this.field_13916 == 2L) {
               for (long var9 = 0L; var9 < this.field_13909; var9++) {
                  long var11 = var9 * this.field_13901;

                  for (long var13 = 0L; var13 < this.field_13908; var13++) {
                     long var17 = var13 * this.field_13906 + var11;
                     var8.method_36123(var13, var2.method_36133(var17));
                     var8.method_36123(this.field_13908 + var13, var2.method_36133(var17 + 1L));
                  }

                  this.field_13915.method_21129(var8, 0L, var3);
                  this.field_13915.method_21129(var8, this.field_13908, var3);

                  for (long var27 = 0L; var27 < this.field_13908; var27++) {
                     long var35 = var27 * this.field_13906 + var11;
                     var2.method_36123(var35, var8.method_36133(var27));
                     var2.method_36123(var35 + 1L, var8.method_36133(this.field_13908 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field_13909; var21++) {
               long var24 = var21 * this.field_13901;

               for (long var28 = 0L; var28 < this.field_13916; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field_13908; var15++) {
                     long var36 = var15 * this.field_13906 + var24 + var28;
                     long var19 = this.field_13908 + var15;
                     var8.method_36123(var15, var2.method_36133(var36));
                     var8.method_36123(var19, var2.method_36133(var36 + 1L));
                     var8.method_36123(var19 + this.field_13908, var2.method_36133(var36 + 2L));
                     var8.method_36123(var19 + 2L * this.field_13908, var2.method_36133(var36 + 3L));
                  }

                  this.field_13915.method_21129(var8, 0L, var3);
                  this.field_13915.method_21129(var8, this.field_13908, var3);
                  this.field_13915.method_21129(var8, 2L * this.field_13908, var3);
                  this.field_13915.method_21129(var8, 3L * this.field_13908, var3);

                  for (long var32 = 0L; var32 < this.field_13908; var32++) {
                     long var37 = var32 * this.field_13906 + var24 + var28;
                     long var42 = this.field_13908 + var32;
                     var2.method_36123(var37, var8.method_36133(var32));
                     var2.method_36123(var37 + 1L, var8.method_36133(var42));
                     var2.method_36123(var37 + 2L, var8.method_36133(var42 + this.field_13908));
                     var2.method_36123(var37 + 3L, var8.method_36133(var42 + 2L * this.field_13908));
                  }
               }
            }
         }
      } else if (this.field_13916 <= 2L) {
         if (this.field_13916 == 2L) {
            for (long var22 = 0L; var22 < this.field_13909; var22++) {
               long var25 = var22 * this.field_13901;

               for (long var29 = 0L; var29 < this.field_13908; var29++) {
                  long var38 = var29 * this.field_13906 + var25;
                  var8.method_36123(var29, var2.method_36133(var38));
                  var8.method_36123(this.field_13908 + var29, var2.method_36133(var38 + 1L));
               }

               this.field_13915.method_21137(var8, 0L, var3);
               this.field_13915.method_21137(var8, this.field_13908, var3);

               for (long var30 = 0L; var30 < this.field_13908; var30++) {
                  long var39 = var30 * this.field_13906 + var25;
                  var2.method_36123(var39, var8.method_36133(var30));
                  var2.method_36123(var39 + 1L, var8.method_36133(this.field_13908 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field_13909; var23++) {
            long var26 = var23 * this.field_13901;

            for (long var31 = 0L; var31 < this.field_13916; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field_13908; var33++) {
                  long var40 = var33 * this.field_13906 + var26 + var31;
                  long var43 = this.field_13908 + var33;
                  var8.method_36123(var33, var2.method_36133(var40));
                  var8.method_36123(var43, var2.method_36133(var40 + 1L));
                  var8.method_36123(var43 + this.field_13908, var2.method_36133(var40 + 2L));
                  var8.method_36123(var43 + 2L * this.field_13908, var2.method_36133(var40 + 3L));
               }

               this.field_13915.method_21137(var8, 0L, var3);
               this.field_13915.method_21137(var8, this.field_13908, var3);
               this.field_13915.method_21137(var8, 2L * this.field_13908, var3);
               this.field_13915.method_21137(var8, 3L * this.field_13908, var3);

               for (long var34 = 0L; var34 < this.field_13908; var34++) {
                  long var41 = var34 * this.field_13906 + var26 + var31;
                  long var44 = this.field_13908 + var34;
                  var2.method_36123(var41, var8.method_36133(var34));
                  var2.method_36123(var41 + 1L, var8.method_36133(var44));
                  var2.method_36123(var41 + 2L, var8.method_36133(var44 + this.field_13908));
                  var2.method_36123(var41 + 3L, var8.method_36133(var44 + 2L * this.field_13908));
               }
            }
         }
      }
   }

   private void method_12911(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field_13912;
      if (this.field_13910 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field_13910 <= 2) {
            if (this.field_13910 == 2) {
               for (int var8 = 0; var8 < this.field_13914; var8++) {
                  for (int var9 = 0; var9 < this.field_13912; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field_13912 + var9] = var2[var9][var8][1];
                  }

                  this.field_13915.method_21131(var7, 0, var3);
                  this.field_13915.method_21131(var7, this.field_13912, var3);

                  for (int var15 = 0; var15 < this.field_13912; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field_13912 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field_13914; var12++) {
               for (byte var16 = 0; var16 < this.field_13910; var16 += 4) {
                  for (int var10 = 0; var10 < this.field_13912; var10++) {
                     int var11 = this.field_13912 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field_13912] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field_13912] = var2[var10][var12][var16 + 3];
                  }

                  this.field_13915.method_21131(var7, 0, var3);
                  this.field_13915.method_21131(var7, this.field_13912, var3);
                  this.field_13915.method_21131(var7, 2 * this.field_13912, var3);
                  this.field_13915.method_21131(var7, 3 * this.field_13912, var3);

                  for (int var20 = 0; var20 < this.field_13912; var20++) {
                     int var23 = this.field_13912 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field_13912];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field_13912];
                  }
               }
            }
         }
      } else if (this.field_13910 <= 2) {
         if (this.field_13910 == 2) {
            for (int var13 = 0; var13 < this.field_13914; var13++) {
               for (int var17 = 0; var17 < this.field_13912; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field_13912 + var17] = var2[var17][var13][1];
               }

               this.field_13915.method_21139(var7, 0, var3);
               this.field_13915.method_21139(var7, this.field_13912, var3);

               for (int var18 = 0; var18 < this.field_13912; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field_13912 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_13914; var14++) {
            for (byte var19 = 0; var19 < this.field_13910; var19 += 4) {
               for (int var21 = 0; var21 < this.field_13912; var21++) {
                  int var24 = this.field_13912 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field_13912] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field_13912] = var2[var21][var14][var19 + 3];
               }

               this.field_13915.method_21139(var7, 0, var3);
               this.field_13915.method_21139(var7, this.field_13912, var3);
               this.field_13915.method_21139(var7, 2 * this.field_13912, var3);
               this.field_13915.method_21139(var7, 3 * this.field_13912, var3);

               for (int var22 = 0; var22 < this.field_13912; var22++) {
                  int var25 = this.field_13912 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field_13912];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field_13912];
               }
            }
         }
      }
   }

   private void method_12925(int var1, float[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_13912 ? this.field_13912 : class_1266.method_5693();
      int var7 = 4 * this.field_13914;
      if (this.field_13910 == 2) {
         var7 >>= 1;
      }

      Future[] var8 = new Future[var6];
      int var9 = var7;

      for (int var10 = 0; var10 < var6; var10++) {
         var8[var10] = class_1266.method_5694(new class_4369(this, var9, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var8);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_12924(int var1, class_4330 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_13908 ? this.field_13908 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_13909;
      if (this.field_13916 == 2L) {
         var7 >>= 1;
      }

      Future[] var9 = new Future[var6];
      long var10 = var7;

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var9[var12] = class_1266.method_5694(new class_1610(this, var10, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_12926(int var1, float[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_13912 ? this.field_13912 : class_1266.method_5693();
      int var7 = 4 * this.field_13914;
      if (this.field_13910 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_406(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_12930(int var1, float[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_13914 ? this.field_13914 : class_1266.method_5693();
      int var7 = 4 * this.field_13912;
      if (this.field_13910 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_1530(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_12929(int var1, class_4330 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_13909 ? this.field_13909 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_13908;
      if (this.field_13916 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_3509(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_12931(int var1, float[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_13914 ? this.field_13914 : class_1266.method_5693();
      int var7 = 4 * this.field_13912;
      if (this.field_13910 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_5786(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_2841.class.getName()).log(Level.SEVERE, null, var13);
      }
   }
}
