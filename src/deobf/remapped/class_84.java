package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_84 {
   private int field_149;
   private long field_145;
   private int field_144;
   private long field_151;
   private int field_140;
   private long field_153;
   private int field_148;
   private long field_150;
   private int field_143;
   private long field_146;
   private class_6819 field_152;
   private class_6819 field_147;
   private class_6819 field_154;
   private boolean field_142 = false;
   private boolean field_155 = false;

   public class_84(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field_149 = (int)var1;
         this.field_144 = (int)var3;
         this.field_140 = (int)var5;
         this.field_145 = var1;
         this.field_151 = var3;
         this.field_153 = var5;
         this.field_148 = (int)(var3 * var5);
         this.field_143 = (int)var5;
         this.field_150 = var3 * var5;
         this.field_146 = var5;
         if (var1 * var3 * var5 >= class_2751.method_12537()) {
            this.field_155 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3) && class_2751.method_12439(var5)) {
            this.field_142 = true;
         }

         class_2751.method_12507(var1 * var3 * var5 > (long)class_7975.method_36102());
         this.field_152 = new class_6819(var1);
         if (var1 != var3) {
            this.field_147 = new class_6819(var3);
         } else {
            this.field_147 = this.field_152;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field_154 = new class_6819(var5);
            } else {
               this.field_154 = this.field_147;
            }
         } else {
            this.field_154 = this.field_152;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method_177(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_142) {
         if (var5 > 1 && this.field_155) {
            this.method_202(-1, var1, var2);
            this.method_192(-1, var1, var2);
         } else {
            this.method_195(-1, var1, var2);
            this.method_205(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_155 && this.field_149 >= var5 && this.field_144 >= var5 && this.field_140 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field_149 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field_149 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_8432(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field_149 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_4155(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field_144 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field_144 : var33 + var23;
            var20[var29] = class_1266.method_5694(new class_4769(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field_149; var6++) {
            int var7 = var6 * this.field_148;

            for (int var8 = 0; var8 < this.field_144; var8++) {
               this.field_154.method_31294(var1, var7 + var8 * this.field_143, var2);
            }
         }

         double[] var18 = new double[this.field_144];

         for (int var21 = 0; var21 < this.field_149; var21++) {
            int var25 = var21 * this.field_148;

            for (int var9 = 0; var9 < this.field_140; var9++) {
               for (int var10 = 0; var10 < this.field_144; var10++) {
                  int var11 = var25 + var10 * this.field_143 + var9;
                  var18[var10] = var1[var11];
               }

               this.field_147.method_31295(var18, var2);

               for (int var34 = 0; var34 < this.field_144; var34++) {
                  int var40 = var25 + var34 * this.field_143 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new double[this.field_149];

         for (int var22 = 0; var22 < this.field_144; var22++) {
            int var26 = var22 * this.field_143;

            for (int var30 = 0; var30 < this.field_140; var30++) {
               for (int var35 = 0; var35 < this.field_149; var35++) {
                  int var41 = var35 * this.field_148 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field_152.method_31295(var18, var2);

               for (int var36 = 0; var36 < this.field_149; var36++) {
                  int var42 = var36 * this.field_148 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method_176(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_142) {
         if (var5 > 1 && this.field_155) {
            this.method_201(-1, var1, var2);
            this.method_191(-1, var1, var2);
         } else {
            this.method_194(-1, var1, var2);
            this.method_204(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_155 && this.field_145 >= (long)var5 && this.field_151 >= (long)var5 && this.field_153 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field_145 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field_145 : var39 + var35;
            var33[var9] = class_1266.method_5694(new class_6241(this, var39, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field_145 : var40 + var35;
            var33[var37] = class_1266.method_5694(new class_995(this, var40, var42, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field_151 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field_151 : var41 + var35;
            var33[var38] = class_1266.method_5694(new class_4455(this, var41, var43, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field_145; var14++) {
            long var16 = var14 * this.field_150;

            for (long var10 = 0L; var10 < this.field_151; var10++) {
               this.field_154.method_31292(var1, var16 + var10 * this.field_146, var2);
            }
         }

         class_1702 var6 = new class_1702(this.field_151, false);

         for (long var7 = 0L; var7 < this.field_145; var7++) {
            long var18 = var7 * this.field_150;

            for (long var20 = 0L; var20 < this.field_153; var20++) {
               for (long var22 = 0L; var22 < this.field_151; var22++) {
                  long var24 = var18 + var22 * this.field_146 + var20;
                  var6.method_36114(var22, var1.method_36107(var24));
               }

               this.field_147.method_31293(var6, var2);

               for (long var46 = 0L; var46 < this.field_151; var46++) {
                  long var49 = var18 + var46 * this.field_146 + var20;
                  var1.method_36114(var49, var6.method_36107(var46));
               }
            }
         }

         var6 = new class_1702(this.field_145, false);

         for (long var34 = 0L; var34 < this.field_151; var34++) {
            long var44 = var34 * this.field_146;

            for (long var45 = 0L; var45 < this.field_153; var45++) {
               for (long var47 = 0L; var47 < this.field_145; var47++) {
                  long var50 = var47 * this.field_150 + var44 + var45;
                  var6.method_36114(var47, var1.method_36107(var50));
               }

               this.field_152.method_31293(var6, var2);

               for (long var48 = 0L; var48 < this.field_145; var48++) {
                  long var51 = var48 * this.field_150 + var44 + var45;
                  var1.method_36114(var51, var6.method_36107(var48));
               }
            }
         }
      }
   }

   public void method_178(double[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_142) {
         if (var5 > 1 && this.field_155) {
            this.method_203(-1, var1, var2);
            this.method_193(-1, var1, var2);
         } else {
            this.method_196(-1, var1, var2);
            this.method_206(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field_155 && this.field_149 >= var5 && this.field_144 >= var5 && this.field_140 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field_149 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field_149 : var31 + var22;
            var19[var25] = class_1266.method_5694(new class_2079(this, var31, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field_149 : var32 + var22;
            var19[var26] = class_1266.method_5694(new class_999(this, var32, var34, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field_144 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field_144 : var33 + var22;
            var19[var27] = class_1266.method_5694(new class_7999(this, var33, var35, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field_149; var6++) {
            for (int var7 = 0; var7 < this.field_144; var7++) {
               this.field_154.method_31295(var1[var6][var7], var2);
            }
         }

         double[] var17 = new double[this.field_144];

         for (int var20 = 0; var20 < this.field_149; var20++) {
            for (int var8 = 0; var8 < this.field_140; var8++) {
               for (int var9 = 0; var9 < this.field_144; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field_147.method_31295(var17, var2);

               for (int var28 = 0; var28 < this.field_144; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new double[this.field_149];

         for (int var21 = 0; var21 < this.field_144; var21++) {
            for (int var24 = 0; var24 < this.field_140; var24++) {
               for (int var29 = 0; var29 < this.field_149; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field_152.method_31295(var17, var2);

               for (int var30 = 0; var30 < this.field_149; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   public void method_185(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_142) {
         if (var5 > 1 && this.field_155) {
            this.method_202(1, var1, var2);
            this.method_192(1, var1, var2);
         } else {
            this.method_195(1, var1, var2);
            this.method_205(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_155 && this.field_149 >= var5 && this.field_144 >= var5 && this.field_140 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field_149 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field_149 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_7504(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field_149 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_5946(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field_144 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field_144 : var33 + var23;
            var20[var29] = class_1266.method_5694(new class_8078(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field_149; var6++) {
            int var7 = var6 * this.field_148;

            for (int var8 = 0; var8 < this.field_144; var8++) {
               this.field_154.method_31288(var1, var7 + var8 * this.field_143, var2);
            }
         }

         double[] var18 = new double[this.field_144];

         for (int var21 = 0; var21 < this.field_149; var21++) {
            int var25 = var21 * this.field_148;

            for (int var9 = 0; var9 < this.field_140; var9++) {
               for (int var10 = 0; var10 < this.field_144; var10++) {
                  int var11 = var25 + var10 * this.field_143 + var9;
                  var18[var10] = var1[var11];
               }

               this.field_147.method_31289(var18, var2);

               for (int var34 = 0; var34 < this.field_144; var34++) {
                  int var40 = var25 + var34 * this.field_143 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new double[this.field_149];

         for (int var22 = 0; var22 < this.field_144; var22++) {
            int var26 = var22 * this.field_143;

            for (int var30 = 0; var30 < this.field_140; var30++) {
               for (int var35 = 0; var35 < this.field_149; var35++) {
                  int var41 = var35 * this.field_148 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field_152.method_31289(var18, var2);

               for (int var36 = 0; var36 < this.field_149; var36++) {
                  int var42 = var36 * this.field_148 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method_184(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_142) {
         if (var5 > 1 && this.field_155) {
            this.method_201(1, var1, var2);
            this.method_191(1, var1, var2);
         } else {
            this.method_194(1, var1, var2);
            this.method_204(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_155 && this.field_145 >= (long)var5 && this.field_151 >= (long)var5 && this.field_153 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field_145 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field_145 : var39 + var35;
            var33[var9] = class_1266.method_5694(new class_2303(this, var39, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field_145 : var40 + var35;
            var33[var37] = class_1266.method_5694(new class_3637(this, var40, var42, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field_151 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field_151 : var41 + var35;
            var33[var38] = class_1266.method_5694(new class_8450(this, var41, var43, var1, var2));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field_145; var14++) {
            long var16 = var14 * (long)this.field_148;

            for (long var10 = 0L; var10 < this.field_151; var10++) {
               this.field_154.method_31286(var1, var16 + var10 * (long)this.field_143, var2);
            }
         }

         class_1702 var6 = new class_1702(this.field_151, false);

         for (long var7 = 0L; var7 < this.field_145; var7++) {
            long var18 = var7 * (long)this.field_148;

            for (long var20 = 0L; var20 < this.field_153; var20++) {
               for (long var22 = 0L; var22 < this.field_151; var22++) {
                  long var24 = var18 + var22 * (long)this.field_143 + var20;
                  var6.method_36114(var22, var1.method_36107(var24));
               }

               this.field_147.method_31287(var6, var2);

               for (long var46 = 0L; var46 < this.field_151; var46++) {
                  long var49 = var18 + var46 * (long)this.field_143 + var20;
                  var1.method_36114(var49, var6.method_36107(var46));
               }
            }
         }

         var6 = new class_1702(this.field_145, false);

         for (long var34 = 0L; var34 < this.field_151; var34++) {
            long var44 = var34 * (long)this.field_143;

            for (long var45 = 0L; var45 < this.field_153; var45++) {
               for (long var47 = 0L; var47 < this.field_145; var47++) {
                  long var50 = var47 * (long)this.field_148 + var44 + var45;
                  var6.method_36114(var47, var1.method_36107(var50));
               }

               this.field_152.method_31287(var6, var2);

               for (long var48 = 0L; var48 < this.field_145; var48++) {
                  long var51 = var48 * (long)this.field_148 + var44 + var45;
                  var1.method_36114(var51, var6.method_36107(var48));
               }
            }
         }
      }
   }

   public void method_186(double[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_142) {
         if (var5 > 1 && this.field_155) {
            this.method_203(1, var1, var2);
            this.method_193(1, var1, var2);
         } else {
            this.method_196(1, var1, var2);
            this.method_206(1, var1, var2);
         }
      } else if (var5 > 1 && this.field_155 && this.field_149 >= var5 && this.field_144 >= var5 && this.field_140 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field_149 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field_149 : var31 + var22;
            var19[var25] = class_1266.method_5694(new class_658(this, var31, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field_149 : var32 + var22;
            var19[var26] = class_1266.method_5694(new class_9750(this, var32, var34, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field_144 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field_144 : var33 + var22;
            var19[var27] = class_1266.method_5694(new class_8172(this, var33, var35, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field_149; var6++) {
            for (int var7 = 0; var7 < this.field_144; var7++) {
               this.field_154.method_31289(var1[var6][var7], var2);
            }
         }

         double[] var17 = new double[this.field_144];

         for (int var20 = 0; var20 < this.field_149; var20++) {
            for (int var8 = 0; var8 < this.field_140; var8++) {
               for (int var9 = 0; var9 < this.field_144; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field_147.method_31289(var17, var2);

               for (int var28 = 0; var28 < this.field_144; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new double[this.field_149];

         for (int var21 = 0; var21 < this.field_144; var21++) {
            for (int var24 = 0; var24 < this.field_140; var24++) {
               for (int var29 = 0; var29 < this.field_149; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field_152.method_31289(var17, var2);

               for (int var30 = 0; var30 < this.field_149; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   private void method_195(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_144;
      if (this.field_140 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_149; var8++) {
            int var9 = var8 * this.field_148;

            for (int var10 = 0; var10 < this.field_144; var10++) {
               this.field_154.method_31288(var2, var9 + var10 * this.field_143, var3);
            }

            if (this.field_140 <= 2) {
               if (this.field_140 == 2) {
                  for (int var17 = 0; var17 < this.field_144; var17++) {
                     int var27 = var9 + var17 * this.field_143;
                     var7[var17] = var2[var27];
                     var7[this.field_144 + var17] = var2[var27 + 1];
                  }

                  this.field_147.method_31288(var7, 0, var3);
                  this.field_147.method_31288(var7, this.field_144, var3);

                  for (int var18 = 0; var18 < this.field_144; var18++) {
                     int var28 = var9 + var18 * this.field_143;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field_144 + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < this.field_140; var16 += 4) {
                  for (int var11 = 0; var11 < this.field_144; var11++) {
                     int var12 = var9 + var11 * this.field_143 + var16;
                     int var13 = this.field_144 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field_144] = var2[var12 + 2];
                     var7[var13 + 2 * this.field_144] = var2[var12 + 3];
                  }

                  this.field_147.method_31288(var7, 0, var3);
                  this.field_147.method_31288(var7, this.field_144, var3);
                  this.field_147.method_31288(var7, 2 * this.field_144, var3);
                  this.field_147.method_31288(var7, 3 * this.field_144, var3);

                  for (int var23 = 0; var23 < this.field_144; var23++) {
                     int var26 = var9 + var23 * this.field_143 + var16;
                     int var33 = this.field_144 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field_144];
                     var2[var26 + 3] = var7[var33 + 2 * this.field_144];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_149; var14++) {
            int var15 = var14 * this.field_148;

            for (int var19 = 0; var19 < this.field_144; var19++) {
               this.field_154.method_31294(var2, var15 + var19 * this.field_143, var3);
            }

            if (this.field_140 <= 2) {
               if (this.field_140 == 2) {
                  for (int var21 = 0; var21 < this.field_144; var21++) {
                     int var31 = var15 + var21 * this.field_143;
                     var7[var21] = var2[var31];
                     var7[this.field_144 + var21] = var2[var31 + 1];
                  }

                  this.field_147.method_31294(var7, 0, var3);
                  this.field_147.method_31294(var7, this.field_144, var3);

                  for (int var22 = 0; var22 < this.field_144; var22++) {
                     int var32 = var15 + var22 * this.field_143;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field_144 + var22];
                  }
               }
            } else {
               for (byte var20 = 0; var20 < this.field_140; var20 += 4) {
                  for (int var24 = 0; var24 < this.field_144; var24++) {
                     int var29 = var15 + var24 * this.field_143 + var20;
                     int var34 = this.field_144 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field_144] = var2[var29 + 2];
                     var7[var34 + 2 * this.field_144] = var2[var29 + 3];
                  }

                  this.field_147.method_31294(var7, 0, var3);
                  this.field_147.method_31294(var7, this.field_144, var3);
                  this.field_147.method_31294(var7, 2 * this.field_144, var3);
                  this.field_147.method_31294(var7, 3 * this.field_144, var3);

                  for (int var25 = 0; var25 < this.field_144; var25++) {
                     int var30 = var15 + var25 * this.field_143 + var20;
                     int var35 = this.field_144 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_144];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_144];
                  }
               }
            }
         }
      }
   }

   private void method_194(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_151;
      if (this.field_153 == 2L) {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field_145; var9++) {
            long var11 = var9 * this.field_150;

            for (long var13 = 0L; var13 < this.field_151; var13++) {
               this.field_154.method_31286(var2, var11 + var13 * this.field_146, var3);
            }

            if (this.field_153 <= 2L) {
               if (this.field_153 == 2L) {
                  for (long var24 = 0L; var24 < this.field_151; var24++) {
                     long var34 = var11 + var24 * this.field_146;
                     var8.method_36114(var24, var2.method_36107(var34));
                     var8.method_36114(this.field_151 + var24, var2.method_36107(var34 + 1L));
                  }

                  this.field_147.method_31286(var8, 0L, var3);
                  this.field_147.method_31286(var8, this.field_151, var3);

                  for (long var25 = 0L; var25 < this.field_151; var25++) {
                     long var35 = var11 + var25 * this.field_146;
                     var2.method_36114(var35, var8.method_36107(var25));
                     var2.method_36114(var35 + 1L, var8.method_36107(this.field_151 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field_153; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field_151; var15++) {
                     long var17 = var11 + var15 * this.field_146 + var23;
                     long var19 = this.field_151 + var15;
                     var8.method_36114(var15, var2.method_36107(var17));
                     var8.method_36114(var19, var2.method_36107(var17 + 1L));
                     var8.method_36114(var19 + this.field_151, var2.method_36107(var17 + 2L));
                     var8.method_36114(var19 + 2L * this.field_151, var2.method_36107(var17 + 3L));
                  }

                  this.field_147.method_31286(var8, 0L, var3);
                  this.field_147.method_31286(var8, this.field_151, var3);
                  this.field_147.method_31286(var8, 2L * this.field_151, var3);
                  this.field_147.method_31286(var8, 3L * this.field_151, var3);

                  for (long var30 = 0L; var30 < this.field_151; var30++) {
                     long var33 = var11 + var30 * this.field_146 + var23;
                     long var40 = this.field_151 + var30;
                     var2.method_36114(var33, var8.method_36107(var30));
                     var2.method_36114(var33 + 1L, var8.method_36107(var40));
                     var2.method_36114(var33 + 2L, var8.method_36107(var40 + this.field_151));
                     var2.method_36114(var33 + 3L, var8.method_36107(var40 + 2L * this.field_151));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field_145; var21++) {
            long var22 = var21 * this.field_150;

            for (long var26 = 0L; var26 < this.field_151; var26++) {
               this.field_154.method_31292(var2, var22 + var26 * (long)this.field_143, var3);
            }

            if (this.field_153 <= 2L) {
               if (this.field_153 == 2L) {
                  for (long var28 = 0L; var28 < this.field_151; var28++) {
                     long var38 = var22 + var28 * this.field_146;
                     var8.method_36114(var28, var2.method_36107(var38));
                     var8.method_36114(this.field_151 + var28, var2.method_36107(var38 + 1L));
                  }

                  this.field_147.method_31292(var8, 0L, var3);
                  this.field_147.method_31292(var8, this.field_151, var3);

                  for (long var29 = 0L; var29 < this.field_151; var29++) {
                     long var39 = var22 + var29 * this.field_146;
                     var2.method_36114(var39, var8.method_36107(var29));
                     var2.method_36114(var39 + 1L, var8.method_36107(this.field_151 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field_153; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field_151; var31++) {
                     long var36 = var22 + var31 * this.field_146 + var27;
                     long var41 = this.field_151 + var31;
                     var8.method_36114(var31, var2.method_36107(var36));
                     var8.method_36114(var41, var2.method_36107(var36 + 1L));
                     var8.method_36114(var41 + this.field_151, var2.method_36107(var36 + 2L));
                     var8.method_36114(var41 + 2L * this.field_151, var2.method_36107(var36 + 3L));
                  }

                  this.field_147.method_31292(var8, 0L, var3);
                  this.field_147.method_31292(var8, this.field_151, var3);
                  this.field_147.method_31292(var8, 2L * this.field_151, var3);
                  this.field_147.method_31292(var8, 3L * this.field_151, var3);

                  for (long var32 = 0L; var32 < this.field_151; var32++) {
                     long var37 = var22 + var32 * this.field_146 + var27;
                     long var42 = this.field_151 + var32;
                     var2.method_36114(var37, var8.method_36107(var32));
                     var2.method_36114(var37 + 1L, var8.method_36107(var42));
                     var2.method_36114(var37 + 2L, var8.method_36107(var42 + this.field_151));
                     var2.method_36114(var37 + 3L, var8.method_36107(var42 + 2L * this.field_151));
                  }
               }
            }
         }
      }
   }

   private void method_196(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field_144;
      if (this.field_140 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_149; var8++) {
            for (int var9 = 0; var9 < this.field_144; var9++) {
               this.field_154.method_31289(var2[var8][var9], var3);
            }

            if (this.field_140 <= 2) {
               if (this.field_140 == 2) {
                  for (int var14 = 0; var14 < this.field_144; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field_144 + var14] = var2[var8][var14][1];
                  }

                  this.field_147.method_31288(var7, 0, var3);
                  this.field_147.method_31288(var7, this.field_144, var3);

                  for (int var15 = 0; var15 < this.field_144; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field_144 + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < this.field_140; var13 += 4) {
                  for (int var10 = 0; var10 < this.field_144; var10++) {
                     int var11 = this.field_144 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field_144] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field_144] = var2[var8][var10][var13 + 3];
                  }

                  this.field_147.method_31288(var7, 0, var3);
                  this.field_147.method_31288(var7, this.field_144, var3);
                  this.field_147.method_31288(var7, 2 * this.field_144, var3);
                  this.field_147.method_31288(var7, 3 * this.field_144, var3);

                  for (int var20 = 0; var20 < this.field_144; var20++) {
                     int var23 = this.field_144 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field_144];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field_144];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field_149; var12++) {
            for (int var16 = 0; var16 < this.field_144; var16++) {
               this.field_154.method_31295(var2[var12][var16], var3);
            }

            if (this.field_140 <= 2) {
               if (this.field_140 == 2) {
                  for (int var18 = 0; var18 < this.field_144; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field_144 + var18] = var2[var12][var18][1];
                  }

                  this.field_147.method_31294(var7, 0, var3);
                  this.field_147.method_31294(var7, this.field_144, var3);

                  for (int var19 = 0; var19 < this.field_144; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field_144 + var19];
                  }
               }
            } else {
               for (byte var17 = 0; var17 < this.field_140; var17 += 4) {
                  for (int var21 = 0; var21 < this.field_144; var21++) {
                     int var24 = this.field_144 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field_144] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field_144] = var2[var12][var21][var17 + 3];
                  }

                  this.field_147.method_31294(var7, 0, var3);
                  this.field_147.method_31294(var7, this.field_144, var3);
                  this.field_147.method_31294(var7, 2 * this.field_144, var3);
                  this.field_147.method_31294(var7, 3 * this.field_144, var3);

                  for (int var22 = 0; var22 < this.field_144; var22++) {
                     int var25 = this.field_144 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field_144];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field_144];
                  }
               }
            }
         }
      }
   }

   private void method_205(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_149;
      if (this.field_140 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field_140 <= 2) {
            if (this.field_140 == 2) {
               for (int var8 = 0; var8 < this.field_144; var8++) {
                  int var9 = var8 * this.field_143;

                  for (int var10 = 0; var10 < this.field_149; var10++) {
                     int var12 = var10 * this.field_148 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field_149 + var10] = var2[var12 + 1];
                  }

                  this.field_152.method_31288(var7, 0, var3);
                  this.field_152.method_31288(var7, this.field_149, var3);

                  for (int var20 = 0; var20 < this.field_149; var20++) {
                     int var28 = var20 * this.field_148 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field_149 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field_144; var14++) {
               int var17 = var14 * this.field_143;

               for (byte var21 = 0; var21 < this.field_140; var21 += 4) {
                  for (int var11 = 0; var11 < this.field_149; var11++) {
                     int var29 = var11 * this.field_148 + var17 + var21;
                     int var13 = this.field_149 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field_149] = var2[var29 + 2];
                     var7[var13 + 2 * this.field_149] = var2[var29 + 3];
                  }

                  this.field_152.method_31288(var7, 0, var3);
                  this.field_152.method_31288(var7, this.field_149, var3);
                  this.field_152.method_31288(var7, 2 * this.field_149, var3);
                  this.field_152.method_31288(var7, 3 * this.field_149, var3);

                  for (int var25 = 0; var25 < this.field_149; var25++) {
                     int var30 = var25 * this.field_148 + var17 + var21;
                     int var35 = this.field_149 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_149];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_149];
                  }
               }
            }
         }
      } else if (this.field_140 <= 2) {
         if (this.field_140 == 2) {
            for (int var15 = 0; var15 < this.field_144; var15++) {
               int var18 = var15 * this.field_143;

               for (int var22 = 0; var22 < this.field_149; var22++) {
                  int var31 = var22 * this.field_148 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field_149 + var22] = var2[var31 + 1];
               }

               this.field_152.method_31294(var7, 0, var3);
               this.field_152.method_31294(var7, this.field_149, var3);

               for (int var23 = 0; var23 < this.field_149; var23++) {
                  int var32 = var23 * this.field_148 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field_149 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field_144; var16++) {
            int var19 = var16 * this.field_143;

            for (byte var24 = 0; var24 < this.field_140; var24 += 4) {
               for (int var26 = 0; var26 < this.field_149; var26++) {
                  int var33 = var26 * this.field_148 + var19 + var24;
                  int var36 = this.field_149 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field_149] = var2[var33 + 2];
                  var7[var36 + 2 * this.field_149] = var2[var33 + 3];
               }

               this.field_152.method_31294(var7, 0, var3);
               this.field_152.method_31294(var7, this.field_149, var3);
               this.field_152.method_31294(var7, 2 * this.field_149, var3);
               this.field_152.method_31294(var7, 3 * this.field_149, var3);

               for (int var27 = 0; var27 < this.field_149; var27++) {
                  int var34 = var27 * this.field_148 + var19 + var24;
                  int var37 = this.field_149 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field_149];
                  var2[var34 + 3] = var7[var37 + 2 * this.field_149];
               }
            }
         }
      }
   }

   private void method_204(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_145;
      if (this.field_153 == 2L) {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (var1 != -1) {
         if (this.field_153 <= 2L) {
            if (this.field_153 == 2L) {
               for (long var9 = 0L; var9 < this.field_151; var9++) {
                  long var11 = var9 * this.field_146;

                  for (long var13 = 0L; var13 < this.field_145; var13++) {
                     long var17 = var13 * this.field_150 + var11;
                     var8.method_36114(var13, var2.method_36107(var17));
                     var8.method_36114(this.field_145 + var13, var2.method_36107(var17 + 1L));
                  }

                  this.field_152.method_31286(var8, 0L, var3);
                  this.field_152.method_31286(var8, this.field_145, var3);

                  for (long var27 = 0L; var27 < this.field_145; var27++) {
                     long var35 = var27 * this.field_150 + var11;
                     var2.method_36114(var35, var8.method_36107(var27));
                     var2.method_36114(var35 + 1L, var8.method_36107(this.field_145 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field_151; var21++) {
               long var24 = var21 * this.field_146;

               for (long var28 = 0L; var28 < this.field_153; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field_145; var15++) {
                     long var36 = var15 * this.field_150 + var24 + var28;
                     long var19 = this.field_145 + var15;
                     var8.method_36114(var15, var2.method_36107(var36));
                     var8.method_36114(var19, var2.method_36107(var36 + 1L));
                     var8.method_36114(var19 + this.field_145, var2.method_36107(var36 + 2L));
                     var8.method_36114(var19 + 2L * this.field_145, var2.method_36107(var36 + 3L));
                  }

                  this.field_152.method_31286(var8, 0L, var3);
                  this.field_152.method_31286(var8, this.field_145, var3);
                  this.field_152.method_31286(var8, 2L * this.field_145, var3);
                  this.field_152.method_31286(var8, 3L * this.field_145, var3);

                  for (long var32 = 0L; var32 < this.field_145; var32++) {
                     long var37 = var32 * this.field_150 + var24 + var28;
                     long var42 = this.field_145 + var32;
                     var2.method_36114(var37, var8.method_36107(var32));
                     var2.method_36114(var37 + 1L, var8.method_36107(var42));
                     var2.method_36114(var37 + 2L, var8.method_36107(var42 + this.field_145));
                     var2.method_36114(var37 + 3L, var8.method_36107(var42 + 2L * this.field_145));
                  }
               }
            }
         }
      } else if (this.field_153 <= 2L) {
         if (this.field_153 == 2L) {
            for (long var22 = 0L; var22 < this.field_151; var22++) {
               long var25 = var22 * this.field_146;

               for (long var29 = 0L; var29 < this.field_145; var29++) {
                  long var38 = var29 * this.field_150 + var25;
                  var8.method_36114(var29, var2.method_36107(var38));
                  var8.method_36114(this.field_145 + var29, var2.method_36107(var38 + 1L));
               }

               this.field_152.method_31292(var8, 0L, var3);
               this.field_152.method_31292(var8, this.field_145, var3);

               for (long var30 = 0L; var30 < this.field_145; var30++) {
                  long var39 = var30 * this.field_150 + var25;
                  var2.method_36114(var39, var8.method_36107(var30));
                  var2.method_36114(var39 + 1L, var8.method_36107(this.field_145 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field_151; var23++) {
            long var26 = var23 * this.field_146;

            for (long var31 = 0L; var31 < this.field_153; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field_145; var33++) {
                  long var40 = var33 * this.field_150 + var26 + var31;
                  long var43 = this.field_145 + var33;
                  var8.method_36114(var33, var2.method_36107(var40));
                  var8.method_36114(var43, var2.method_36107(var40 + 1L));
                  var8.method_36114(var43 + this.field_145, var2.method_36107(var40 + 2L));
                  var8.method_36114(var43 + 2L * this.field_145, var2.method_36107(var40 + 3L));
               }

               this.field_152.method_31292(var8, 0L, var3);
               this.field_152.method_31292(var8, this.field_145, var3);
               this.field_152.method_31292(var8, 2L * this.field_145, var3);
               this.field_152.method_31292(var8, 3L * this.field_145, var3);

               for (long var34 = 0L; var34 < this.field_145; var34++) {
                  long var41 = var34 * this.field_150 + var26 + var31;
                  long var44 = this.field_145 + var34;
                  var2.method_36114(var41, var8.method_36107(var34));
                  var2.method_36114(var41 + 1L, var8.method_36107(var44));
                  var2.method_36114(var41 + 2L, var8.method_36107(var44 + this.field_145));
                  var2.method_36114(var41 + 3L, var8.method_36107(var44 + 2L * this.field_145));
               }
            }
         }
      }
   }

   private void method_206(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field_149;
      if (this.field_140 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field_140 <= 2) {
            if (this.field_140 == 2) {
               for (int var8 = 0; var8 < this.field_144; var8++) {
                  for (int var9 = 0; var9 < this.field_149; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field_149 + var9] = var2[var9][var8][1];
                  }

                  this.field_152.method_31288(var7, 0, var3);
                  this.field_152.method_31288(var7, this.field_149, var3);

                  for (int var15 = 0; var15 < this.field_149; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field_149 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field_144; var12++) {
               for (byte var16 = 0; var16 < this.field_140; var16 += 4) {
                  for (int var10 = 0; var10 < this.field_149; var10++) {
                     int var11 = this.field_149 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field_149] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field_149] = var2[var10][var12][var16 + 3];
                  }

                  this.field_152.method_31288(var7, 0, var3);
                  this.field_152.method_31288(var7, this.field_149, var3);
                  this.field_152.method_31288(var7, 2 * this.field_149, var3);
                  this.field_152.method_31288(var7, 3 * this.field_149, var3);

                  for (int var20 = 0; var20 < this.field_149; var20++) {
                     int var23 = this.field_149 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field_149];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field_149];
                  }
               }
            }
         }
      } else if (this.field_140 <= 2) {
         if (this.field_140 == 2) {
            for (int var13 = 0; var13 < this.field_144; var13++) {
               for (int var17 = 0; var17 < this.field_149; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field_149 + var17] = var2[var17][var13][1];
               }

               this.field_152.method_31294(var7, 0, var3);
               this.field_152.method_31294(var7, this.field_149, var3);

               for (int var18 = 0; var18 < this.field_149; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field_149 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_144; var14++) {
            for (byte var19 = 0; var19 < this.field_140; var19 += 4) {
               for (int var21 = 0; var21 < this.field_149; var21++) {
                  int var24 = this.field_149 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field_149] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field_149] = var2[var21][var14][var19 + 3];
               }

               this.field_152.method_31294(var7, 0, var3);
               this.field_152.method_31294(var7, this.field_149, var3);
               this.field_152.method_31294(var7, 2 * this.field_149, var3);
               this.field_152.method_31294(var7, 3 * this.field_149, var3);

               for (int var22 = 0; var22 < this.field_149; var22++) {
                  int var25 = this.field_149 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field_149];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field_149];
               }
            }
         }
      }
   }

   private void method_202(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_149 ? this.field_149 : class_1266.method_5693();
      int var7 = 4 * this.field_144;
      if (this.field_140 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_565(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_201(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_145 ? this.field_145 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_151;
      if (this.field_153 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_3926(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_203(int var1, double[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_149 ? this.field_149 : class_1266.method_5693();
      int var7 = 4 * this.field_144;
      if (this.field_140 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_5450(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_192(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_144 ? this.field_144 : class_1266.method_5693();
      int var7 = 4 * this.field_149;
      if (this.field_140 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_4065(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_191(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_151 ? this.field_151 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_145;
      if (this.field_153 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_8210(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_193(int var1, double[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_144 ? this.field_144 : class_1266.method_5693();
      int var7 = 4 * this.field_149;
      if (this.field_140 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_6020(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_84.class.getName()).log(Level.SEVERE, null, var13);
      }
   }
}
