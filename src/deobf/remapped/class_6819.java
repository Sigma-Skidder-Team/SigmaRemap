package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_6819 {
   private final int field_35163;
   private final long field_35166;
   private final class_9697 field_35164;
   private final boolean field_35167;

   public class_6819(long var1) {
      this.field_35163 = (int)var1;
      this.field_35166 = var1;
      this.field_35167 = class_2751.method_12427() || var1 > (long)class_7975.method_36102();
      this.field_35164 = new class_9697(var1);
   }

   public void method_31295(double[] var1, boolean var2) {
      this.method_31294(var1, 0, var2);
   }

   public void method_31293(class_1702 var1, boolean var2) {
      this.method_31292(var1, 0L, var2);
   }

   public void method_31294(double[] var1, int var2, boolean var3) {
      if (this.field_35163 != 1) {
         if (this.field_35167) {
            this.method_31292(new class_1702(var1), (long)var2, var3);
         } else {
            int var6 = this.field_35163 / 2;
            int var7 = 1 + var2;
            int var8 = var2 + this.field_35163;

            for (int var9 = var7; var9 < var8; var9 += 2) {
               var1[var9] = -var1[var9];
            }

            this.field_35164.method_44815(var1, var2, var3);
            int var19 = class_1266.method_5693();
            if (var19 > 1 && (long)var6 > class_2751.method_12448()) {
               byte var20 = 2;
               int var21 = var6 / var20;
               Future[] var22 = new Future[var20];

               for (int var23 = 0; var23 < var20; var23++) {
                  int var24 = var23 * var21;
                  int var14 = var23 == var20 - 1 ? var6 : var24 + var21;
                  var22[var23] = class_1266.method_5694(new class_7155(this, var2, var24, var14, var1));
               }

               try {
                  class_1266.method_5696(var22);
               } catch (InterruptedException var17) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var17);
               } catch (ExecutionException var18) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var18);
               }
            } else {
               int var10 = var2 + this.field_35163 - 1;

               for (int var13 = 0; var13 < var6; var13++) {
                  int var12 = var2 + var13;
                  double var15 = var1[var12];
                  int var11 = var10 - var13;
                  var1[var12] = var1[var11];
                  var1[var11] = var15;
               }
            }
         }
      }
   }

   public void method_31292(class_1702 var1, long var2, boolean var4) {
      if (this.field_35166 != 1L) {
         if (!this.field_35167) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_31294(var1.method_7641(), (int)var2, var4);
         } else {
            long var7 = this.field_35166 / 2L;
            long var9 = 1L + var2;
            long var11 = var2 + this.field_35166;

            for (long var13 = var9; var13 < var11; var13 += 2L) {
               var1.method_36114(var13, -var1.method_36107(var13));
            }

            this.field_35164.method_44813(var1, var2, var4);
            int var15 = class_1266.method_5693();
            if (var15 > 1 && var7 > class_2751.method_12448()) {
               byte var30 = 2;
               long var31 = var7 / (long)var30;
               Future[] var18 = new Future[var30];

               for (int var19 = 0; var19 < var30; var19++) {
                  long var32 = (long)var19 * var31;
                  long var33 = var19 == var30 - 1 ? var7 : var32 + var31;
                  var18[var19] = class_1266.method_5694(new class_9072(this, var2, var32, var33, var1));
               }

               try {
                  class_1266.method_5696(var18);
               } catch (InterruptedException var28) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var28);
               } catch (ExecutionException var29) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var29);
               }
            } else {
               long var16 = var2 + this.field_35166 - 1L;

               for (long var22 = 0L; var22 < var7; var22++) {
                  long var20 = var2 + var22;
                  double var24 = var1.method_36107(var20);
                  long var26 = var16 - var22;
                  var1.method_36114(var20, var1.method_36107(var26));
                  var1.method_36114(var26, var24);
               }
            }
         }
      }
   }

   public void method_31289(double[] var1, boolean var2) {
      this.method_31288(var1, 0, var2);
   }

   public void method_31287(class_1702 var1, boolean var2) {
      this.method_31286(var1, 0L, var2);
   }

   public void method_31288(double[] var1, int var2, boolean var3) {
      if (this.field_35163 != 1) {
         if (this.field_35167) {
            this.method_31286(new class_1702(var1), (long)var2, var3);
         } else {
            int var6 = this.field_35163 / 2;
            int var7 = class_1266.method_5693();
            if (var7 > 1 && (long)var6 > class_2751.method_12448()) {
               byte var17 = 2;
               int var18 = var6 / var17;
               Future[] var20 = new Future[var17];

               for (int var10 = 0; var10 < var17; var10++) {
                  int var11 = var10 * var18;
                  int var12 = var10 == var17 - 1 ? var6 : var11 + var18;
                  var20[var10] = class_1266.method_5694(new class_1146(this, var2, var11, var12, var1));
               }

               try {
                  class_1266.method_5696(var20);
               } catch (InterruptedException var15) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var15);
               } catch (ExecutionException var16) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var16);
               }
            } else {
               int var8 = var2 + this.field_35163 - 1;

               for (int var9 = 0; var9 < var6; var9++) {
                  double var13 = var1[var2 + var9];
                  var1[var2 + var9] = var1[var8 - var9];
                  var1[var8 - var9] = var13;
               }
            }

            this.field_35164.method_44820(var1, var2, var3);
            int var19 = 1 + var2;
            int var21 = var2 + this.field_35163;

            for (int var22 = var19; var22 < var21; var22 += 2) {
               var1[var22] = -var1[var22];
            }
         }
      }
   }

   public void method_31286(class_1702 var1, long var2, boolean var4) {
      if (this.field_35166 != 1L) {
         if (!this.field_35167) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_31288(var1.method_7641(), (int)var2, var4);
         } else {
            long var7 = this.field_35166 / 2L;
            int var9 = class_1266.method_5693();
            if (var9 > 1 && var7 > class_2751.method_12448()) {
               byte var24 = 2;
               long var25 = var7 / (long)var24;
               Future[] var12 = new Future[var24];

               for (int var13 = 0; var13 < var24; var13++) {
                  long var14 = (long)var13 * var25;
                  long var16 = var13 == var24 - 1 ? var7 : var14 + var25;
                  var12[var13] = class_1266.method_5694(new class_8569(this, var2, var14, var16, var1));
               }

               try {
                  class_1266.method_5696(var12);
               } catch (InterruptedException var22) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var22);
               } catch (ExecutionException var23) {
                  Logger.getLogger(class_6819.class.getName()).log(Level.SEVERE, null, var23);
               }
            } else {
               long var10 = var2 + this.field_35166 - 1L;

               for (long var18 = 0L; var18 < var7; var18++) {
                  double var20 = var1.method_36107(var2 + var18);
                  var1.method_36114(var2 + var18, var1.method_36107(var10 - var18));
                  var1.method_36114(var10 - var18, var20);
               }
            }

            this.field_35164.method_44818(var1, var2, var4);
            long var26 = 1L + var2;
            long var28 = var2 + this.field_35166;

            for (long var27 = var26; var27 < var28; var27 += 2L) {
               var1.method_36114(var27, -var1.method_36107(var27));
            }
         }
      }
   }
}
