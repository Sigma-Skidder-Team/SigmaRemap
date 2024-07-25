package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_4133 {
   private final int field_20117;
   private final long field_20118;
   private final class_4560 field_20120;
   private final boolean field_20116;

   public class_4133(long var1) {
      this.field_20117 = (int)var1;
      this.field_20118 = var1;
      this.field_20116 = class_2751.method_12427() || var1 > (long)class_7975.method_36102();
      this.field_20120 = new class_4560(var1);
   }

   public void method_19197(float[] var1, boolean var2) {
      this.method_19196(var1, 0, var2);
   }

   public void method_19195(class_4330 var1, boolean var2) {
      this.method_19194(var1, 0L, var2);
   }

   public void method_19196(float[] var1, int var2, boolean var3) {
      if (this.field_20117 != 1) {
         if (this.field_20116) {
            this.method_19194(new class_4330(var1), (long)var2, var3);
         } else {
            int var6 = this.field_20117 / 2;
            int var7 = 1 + var2;
            int var8 = var2 + this.field_20117;

            for (int var9 = var7; var9 < var8; var9 += 2) {
               var1[var9] = -var1[var9];
            }

            this.field_20120.method_21139(var1, var2, var3);
            int var18 = class_1266.method_5693();
            if (var18 > 1 && (long)var6 > class_2751.method_12448()) {
               byte var19 = 2;
               int var20 = var6 / var19;
               Future[] var21 = new Future[var19];

               for (int var22 = 0; var22 < var19; var22++) {
                  int var23 = var22 * var20;
                  int var14 = var22 == var19 - 1 ? var6 : var23 + var20;
                  var21[var22] = class_1266.method_5694(new class_3473(this, var2, var23, var14, var1));
               }

               try {
                  class_1266.method_5696(var21);
               } catch (InterruptedException var16) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var16);
               } catch (ExecutionException var17) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var17);
               }
            } else {
               int var10 = var2 + this.field_20117 - 1;

               for (int var13 = 0; var13 < var6; var13++) {
                  int var12 = var2 + var13;
                  float var15 = var1[var12];
                  int var11 = var10 - var13;
                  var1[var12] = var1[var11];
                  var1[var11] = var15;
               }
            }
         }
      }
   }

   public void method_19194(class_4330 var1, long var2, boolean var4) {
      if (this.field_20118 != 1L) {
         if (!this.field_20116) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_19196(var1.method_20155(), (int)var2, var4);
         } else {
            long var7 = this.field_20118 / 2L;
            long var9 = 1L + var2;
            long var11 = var2 + this.field_20118;

            for (long var13 = var9; var13 < var11; var13 += 2L) {
               var1.method_36123(var13, -var1.method_36133(var13));
            }

            this.field_20120.method_21137(var1, var2, var4);
            int var15 = class_1266.method_5693();
            if (var15 > 1 && var7 > class_2751.method_12448()) {
               byte var29 = 2;
               long var30 = var7 / (long)var29;
               Future[] var18 = new Future[var29];

               for (int var19 = 0; var19 < var29; var19++) {
                  long var31 = (long)var19 * var30;
                  long var32 = var19 == var29 - 1 ? var7 : var31 + var30;
                  var18[var19] = class_1266.method_5694(new class_8287(this, var2, var31, var32, var1));
               }

               try {
                  class_1266.method_5696(var18);
               } catch (InterruptedException var27) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var27);
               } catch (ExecutionException var28) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var28);
               }
            } else {
               long var16 = var2 + this.field_20118 - 1L;

               for (long var22 = 0L; var22 < var7; var22++) {
                  long var20 = var2 + var22;
                  float var24 = var1.method_36133(var20);
                  long var25 = var16 - var22;
                  var1.method_36123(var20, var1.method_36133(var25));
                  var1.method_36123(var25, var24);
               }
            }
         }
      }
   }

   public void method_19204(float[] var1, boolean var2) {
      this.method_19203(var1, 0, var2);
   }

   public void method_19202(class_4330 var1, boolean var2) {
      this.method_19201(var1, 0L, var2);
   }

   public void method_19203(float[] var1, int var2, boolean var3) {
      if (this.field_20117 != 1) {
         if (this.field_20116) {
            this.method_19201(new class_4330(var1), (long)var2, var3);
         } else {
            int var6 = this.field_20117 / 2;
            int var7 = class_1266.method_5693();
            if (var7 > 1 && (long)var6 > class_2751.method_12448()) {
               byte var16 = 2;
               int var17 = var6 / var16;
               Future[] var19 = new Future[var16];

               for (int var10 = 0; var10 < var16; var10++) {
                  int var11 = var10 * var17;
                  int var12 = var10 == var16 - 1 ? var6 : var11 + var17;
                  var19[var10] = class_1266.method_5694(new class_1618(this, var2, var11, var12, var1));
               }

               try {
                  class_1266.method_5696(var19);
               } catch (InterruptedException var14) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var14);
               } catch (ExecutionException var15) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var15);
               }
            } else {
               int var8 = var2 + this.field_20117 - 1;

               for (int var9 = 0; var9 < var6; var9++) {
                  float var13 = var1[var2 + var9];
                  var1[var2 + var9] = var1[var8 - var9];
                  var1[var8 - var9] = var13;
               }
            }

            this.field_20120.method_21131(var1, var2, var3);
            int var18 = 1 + var2;
            int var20 = var2 + this.field_20117;

            for (int var21 = var18; var21 < var20; var21 += 2) {
               var1[var21] = -var1[var21];
            }
         }
      }
   }

   public void method_19201(class_4330 var1, long var2, boolean var4) {
      if (this.field_20118 != 1L) {
         if (!this.field_20116) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_19203(var1.method_20155(), (int)var2, var4);
         } else {
            long var7 = this.field_20118 / 2L;
            int var9 = class_1266.method_5693();
            if (var9 > 1 && var7 > class_2751.method_12448()) {
               byte var23 = 2;
               long var24 = var7 / (long)var23;
               Future[] var12 = new Future[var23];

               for (int var13 = 0; var13 < var23; var13++) {
                  long var14 = (long)var13 * var24;
                  long var16 = var13 == var23 - 1 ? var7 : var14 + var24;
                  var12[var13] = class_1266.method_5694(new class_6342(this, var2, var14, var16, var1));
               }

               try {
                  class_1266.method_5696(var12);
               } catch (InterruptedException var21) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var21);
               } catch (ExecutionException var22) {
                  Logger.getLogger(class_4133.class.getName()).log(Level.SEVERE, null, var22);
               }
            } else {
               long var10 = var2 + this.field_20118 - 1L;

               for (long var18 = 0L; var18 < var7; var18++) {
                  float var20 = var1.method_36133(var2 + var18);
                  var1.method_36123(var2 + var18, var1.method_36133(var10 - var18));
                  var1.method_36123(var10 - var18, var20);
               }
            }

            this.field_20120.method_21129(var1, var2, var4);
            long var25 = 1L + var2;
            long var27 = var2 + this.field_20118;

            for (long var26 = var25; var26 < var27; var26 += 2L) {
               var1.method_36123(var26, -var1.method_36133(var26));
            }
         }
      }
   }
}
