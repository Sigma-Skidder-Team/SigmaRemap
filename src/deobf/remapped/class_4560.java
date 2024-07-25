package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_4560 {
   private int field_22209;
   private long field_22208;
   private int[] field_22215;
   private class_878 field_22218;
   private float[] field_22211;
   private class_4330 field_22217;
   private int field_22212;
   private long field_22210;
   private int field_22207;
   private long field_22220;
   private boolean field_22216 = false;
   private class_5298 field_22213;
   private static final float field_22221 = (float) Math.PI;
   private boolean field_22214;

   public class_4560(long var1) {
      if (var1 < 1L) {
         throw new IllegalArgumentException("n must be greater than 0");
      } else {
         this.field_22214 = class_2751.method_12427() || var1 > (long)class_7975.method_36102();
         this.field_22209 = (int)var1;
         this.field_22208 = var1;
         if (this.field_22214) {
            if (!class_2751.method_12439(var1)) {
               this.field_22217 = this.method_21134(var1);
               this.field_22213 = new class_5298(2L * var1);
            } else {
               this.field_22216 = true;
               this.field_22218 = new class_878(
                  (long)class_6806.method_31211(
                     (double)(2L + (1L << (int)((long)(class_6806.method_31231((double)(var1 / 2L) + 0.5) / class_6806.method_31231(2.0)) / 2L)))
                  )
               );
               this.field_22217 = new class_4330(this.field_22208 * 5L / 4L);
               this.field_22210 = this.field_22218.method_36076(0L);
               if (var1 > this.field_22210 << 2) {
                  this.field_22210 = this.field_22208 >> 2;
                  class_2751.method_12456(this.field_22210, this.field_22218, this.field_22217);
               }

               this.field_22220 = this.field_22218.method_36076(1L);
               if (var1 > this.field_22220) {
                  this.field_22220 = this.field_22208;
                  class_2751.method_12460(this.field_22220, this.field_22217, this.field_22210, this.field_22218);
               }
            }
         } else {
            if (var1 > 268435456L) {
               throw new IllegalArgumentException("n must be smaller or equal to 268435456 when useLargeArrays argument is set to false");
            }

            if (!class_2751.method_12439(var1)) {
               this.field_22211 = this.method_21133(this.field_22209);
               this.field_22213 = new class_5298(2L * var1);
            } else {
               this.field_22216 = true;
               this.field_22215 = new int[(int)class_6806.method_31211(
                  (double)(2 + (1 << (int)(class_6806.method_31231((double)(var1 / 2L) + 0.5) / class_6806.method_31231(2.0)) / 2))
               )];
               this.field_22211 = new float[this.field_22209 * 5 / 4];
               this.field_22212 = this.field_22215[0];
               if (var1 > (long)(this.field_22212 << 2)) {
                  this.field_22212 = this.field_22209 >> 2;
                  class_2751.method_12454(this.field_22212, this.field_22215, this.field_22211);
               }

               this.field_22207 = this.field_22215[1];
               if (var1 > (long)this.field_22207) {
                  this.field_22207 = this.field_22209;
                  class_2751.method_12458(this.field_22207, this.field_22211, this.field_22212, this.field_22215);
               }
            }
         }
      }
   }

   public void method_21140(float[] var1, boolean var2) {
      this.method_21139(var1, 0, var2);
   }

   public void method_21138(class_4330 var1, boolean var2) {
      this.method_21137(var1, 0L, var2);
   }

   public void method_21139(float[] var1, int var2, boolean var3) {
      if (this.field_22209 != 1) {
         if (this.field_22214) {
            this.method_21137(new class_4330(var1), (long)var2, var3);
         } else if (this.field_22216) {
            float var6 = var1[var2 + this.field_22209 - 1];

            for (int var7 = this.field_22209 - 2; var7 >= 2; var7 -= 2) {
               var1[var2 + var7 + 1] = var1[var2 + var7] - var1[var2 + var7 - 1];
               var1[var2 + var7] = var1[var2 + var7] + var1[var2 + var7 - 1];
            }

            var1[var2 + 1] = var1[var2] - var6;
            var1[var2] += var6;
            if (this.field_22209 > 4) {
               method_21135(this.field_22209, var1, var2, this.field_22207, this.field_22211, this.field_22212);
               class_2751.method_12513(this.field_22209, var1, var2, this.field_22215, this.field_22212, this.field_22211);
            } else if (this.field_22209 == 4) {
               class_2751.method_12513(this.field_22209, var1, var2, this.field_22215, this.field_22212, this.field_22211);
            }

            class_2751.method_12495(this.field_22209, var1, var2, this.field_22207, this.field_22211, this.field_22212);
            if (var3) {
               class_2751.method_12445(this.field_22209, (float)class_6806.method_31206(2.0 / (double)this.field_22209), var1, var2, false);
               var1[var2] /= (float)class_6806.method_31206(2.0);
            }
         } else {
            int var16 = 2 * this.field_22209;
            float[] var17 = new float[var16];
            System.arraycopy(var1, var2, var17, 0, this.field_22209);
            int var8 = class_1266.method_5693();

            for (int var9 = this.field_22209; var9 < var16; var9++) {
               var17[var9] = var17[var16 - var9 - 1];
            }

            this.field_22213.method_24204(var17);
            if (var8 > 1 && (long)this.field_22209 > class_2751.method_12448()) {
               byte var18 = 2;
               int var20 = this.field_22209 / var18;
               Future[] var21 = new Future[var18];

               for (int var22 = 0; var22 < var18; var22++) {
                  int var12 = var22 * var20;
                  int var13 = var22 == var18 - 1 ? this.field_22209 : var12 + var20;
                  var21[var22] = class_1266.method_5694(new class_3914(this, var12, var13, var2, var1, var17));
               }

               try {
                  class_1266.method_5696(var21);
               } catch (InterruptedException var14) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var14);
               } catch (ExecutionException var15) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var15);
               }
            } else {
               for (int var19 = 0; var19 < this.field_22209; var19++) {
                  int var10 = 2 * var19;
                  int var11 = var2 + var19;
                  var1[var11] = this.field_22211[var10] * var17[var10] - this.field_22211[var10 + 1] * var17[var10 + 1];
               }
            }

            if (var3) {
               class_2751.method_12445(this.field_22209, 1.0F / (float)class_6806.method_31206((double)var16), var1, var2, false);
               var1[var2] /= (float)class_6806.method_31206(2.0);
            }
         }
      }
   }

   public void method_21137(class_4330 var1, long var2, boolean var4) {
      if (this.field_22208 != 1L) {
         if (!this.field_22214) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_21139(var1.method_20155(), (int)var2, var4);
         } else if (this.field_22216) {
            float var7 = var1.method_36133(var2 + this.field_22208 - 1L);

            for (long var8 = this.field_22208 - 2L; var8 >= 2L; var8 -= 2L) {
               var1.method_36123(var2 + var8 + 1L, var1.method_36133(var2 + var8) - var1.method_36133(var2 + var8 - 1L));
               var1.method_36123(var2 + var8, var1.method_36133(var2 + var8) + var1.method_36133(var2 + var8 - 1L));
            }

            var1.method_36123(var2 + 1L, var1.method_36133(var2) - var7);
            var1.method_36123(var2, var1.method_36133(var2) + var7);
            if (this.field_22208 > 4L) {
               method_21136(this.field_22208, var1, var2, this.field_22220, this.field_22217, this.field_22210);
               class_2751.method_12515(this.field_22208, var1, var2, this.field_22218, this.field_22210, this.field_22217);
            } else if (this.field_22208 == 4L) {
               class_2751.method_12515(this.field_22208, var1, var2, this.field_22218, this.field_22210, this.field_22217);
            }

            class_2751.method_12497(this.field_22208, var1, var2, this.field_22220, this.field_22217, this.field_22210);
            if (var4) {
               class_2751.method_12447(this.field_22208, (float)class_6806.method_31206(2.0 / (double)this.field_22208), var1, var2, false);
               var1.method_36123(var2, var1.method_36133(var2) / (float)class_6806.method_31206(2.0));
            }
         } else {
            long var10 = 2L * this.field_22208;
            class_4330 var12 = new class_4330(var10);
            class_3685.method_17117(var1, var2, var12, 0L, this.field_22208);
            int var13 = class_1266.method_5693();

            for (long var14 = this.field_22208; var14 < var10; var14++) {
               var12.method_36123(var14, var12.method_36133(var10 - var14 - 1L));
            }

            this.field_22213.method_24202(var12);
            if (var13 > 1 && this.field_22208 > class_2751.method_12448()) {
               byte var26 = 2;
               long var28 = this.field_22208 / (long)var26;
               Future[] var16 = new Future[var26];

               for (int var17 = 0; var17 < var26; var17++) {
                  long var29 = (long)var17 * var28;
                  long var20 = var17 == var26 - 1 ? this.field_22208 : var29 + var28;
                  var16[var17] = class_1266.method_5694(new class_2276(this, var29, var20, var2, var1, var12));
               }

               try {
                  class_1266.method_5696(var16);
               } catch (InterruptedException var24) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var24);
               } catch (ExecutionException var25) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var25);
               }
            } else {
               for (long var27 = 0L; var27 < this.field_22208; var27++) {
                  long var22 = 2L * var27;
                  long var18 = var2 + var27;
                  var1.method_36123(
                     var18,
                     this.field_22217.method_36133(var22) * var12.method_36133(var22)
                        - this.field_22217.method_36133(var22 + 1L) * var12.method_36133(var22 + 1L)
                  );
               }
            }

            if (var4) {
               class_2751.method_12447(this.field_22208, 1.0F / (float)class_6806.method_31206((double)var10), var1, var2, false);
               var1.method_36123(var2, var1.method_36133(var2) / (float)class_6806.method_31206(2.0));
            }
         }
      }
   }

   public void method_21132(float[] var1, boolean var2) {
      this.method_21131(var1, 0, var2);
   }

   public void method_21130(class_4330 var1, boolean var2) {
      this.method_21129(var1, 0L, var2);
   }

   public void method_21131(float[] var1, int var2, boolean var3) {
      if (this.field_22209 != 1) {
         if (this.field_22214) {
            this.method_21129(new class_4330(var1), (long)var2, var3);
         } else if (this.field_22216) {
            if (var3) {
               class_2751.method_12445(this.field_22209, (float)class_6806.method_31206(2.0 / (double)this.field_22209), var1, var2, false);
               var1[var2] /= (float)class_6806.method_31206(2.0);
            }

            class_2751.method_12495(this.field_22209, var1, var2, this.field_22207, this.field_22211, this.field_22212);
            if (this.field_22209 > 4) {
               class_2751.method_12491(this.field_22209, var1, var2, this.field_22215, this.field_22212, this.field_22211);
               method_21142(this.field_22209, var1, var2, this.field_22207, this.field_22211, this.field_22212);
            } else if (this.field_22209 == 4) {
               class_2751.method_12491(this.field_22209, var1, var2, this.field_22215, this.field_22212, this.field_22211);
            }

            float var6 = var1[var2] - var1[var2 + 1];
            var1[var2] += var1[var2 + 1];

            for (byte var7 = 2; var7 < this.field_22209; var7 += 2) {
               var1[var2 + var7 - 1] = var1[var2 + var7] - var1[var2 + var7 + 1];
               var1[var2 + var7] = var1[var2 + var7] + var1[var2 + var7 + 1];
            }

            var1[var2 + this.field_22209 - 1] = var6;
         } else {
            int var16 = 2 * this.field_22209;
            if (var3) {
               class_2751.method_12445(this.field_22209, (float)class_6806.method_31206((double)var16), var1, var2, false);
               var1[var2] *= (float)class_6806.method_31206(2.0);
            }

            float[] var17 = new float[var16];
            int var8 = class_1266.method_5693();
            if (var8 > 1 && (long)this.field_22209 > class_2751.method_12448()) {
               byte var18 = 2;
               int var19 = this.field_22209 / var18;
               Future[] var20 = new Future[var18];

               for (int var21 = 0; var21 < var18; var21++) {
                  int var12 = var21 * var19;
                  int var13 = var21 == var18 - 1 ? this.field_22209 : var12 + var19;
                  var20[var21] = class_1266.method_5694(new class_6527(this, var12, var13, var1, var2, var17));
               }

               try {
                  class_1266.method_5696(var20);
               } catch (InterruptedException var14) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var14);
               } catch (ExecutionException var15) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var15);
               }
            } else {
               for (int var9 = 0; var9 < this.field_22209; var9++) {
                  int var10 = 2 * var9;
                  float var11 = var1[var2 + var9];
                  var17[var10] = this.field_22211[var10] * var11;
                  var17[var10 + 1] = -this.field_22211[var10 + 1] * var11;
               }
            }

            this.field_22213.method_24156(var17, true);
            System.arraycopy(var17, 0, var1, var2, this.field_22209);
         }
      }
   }

   public void method_21129(class_4330 var1, long var2, boolean var4) {
      if (this.field_22208 != 1L) {
         if (!this.field_22214) {
            if (var1.method_36106() || var1.method_36112() || var2 >= 2147483647L) {
               throw new IllegalArgumentException("The data array is too big.");
            }

            this.method_21131(var1.method_20155(), (int)var2, var4);
         } else if (this.field_22216) {
            if (var4) {
               class_2751.method_12447(this.field_22208, (float)class_6806.method_31206(2.0 / (double)this.field_22208), var1, var2, false);
               var1.method_36123(var2, var1.method_36133(var2) / (float)class_6806.method_31206(2.0));
            }

            class_2751.method_12497(this.field_22208, var1, var2, this.field_22220, this.field_22217, this.field_22210);
            if (this.field_22208 > 4L) {
               class_2751.method_12493(this.field_22208, var1, var2, this.field_22218, this.field_22210, this.field_22217);
               method_21143(this.field_22208, var1, var2, this.field_22220, this.field_22217, this.field_22210);
            } else if (this.field_22208 == 4L) {
               class_2751.method_12493(this.field_22208, var1, var2, this.field_22218, this.field_22210, this.field_22217);
            }

            float var7 = var1.method_36133(var2) - var1.method_36133(var2 + 1L);
            var1.method_36123(var2, var1.method_36133(var2) + var1.method_36133(var2 + 1L));

            for (long var8 = 2L; var8 < this.field_22208; var8 += 2L) {
               var1.method_36123(var2 + var8 - 1L, var1.method_36133(var2 + var8) - var1.method_36133(var2 + var8 + 1L));
               var1.method_36123(var2 + var8, var1.method_36133(var2 + var8) + var1.method_36133(var2 + var8 + 1L));
            }

            var1.method_36123(var2 + this.field_22208 - 1L, var7);
         } else {
            long var10 = 2L * this.field_22208;
            if (var4) {
               class_2751.method_12447(this.field_22208, (float)class_6806.method_31206((double)var10), var1, var2, false);
               var1.method_36123(var2, var1.method_36133(var2) * (float)class_6806.method_31206(2.0));
            }

            class_4330 var12 = new class_4330(var10);
            int var13 = class_1266.method_5693();
            if (var13 > 1 && this.field_22208 > class_2751.method_12448()) {
               byte var27 = 2;
               long var28 = this.field_22208 / (long)var27;
               Future[] var16 = new Future[var27];

               for (int var17 = 0; var17 < var27; var17++) {
                  long var18 = (long)var17 * var28;
                  long var20 = var17 == var27 - 1 ? this.field_22208 : var18 + var28;
                  var16[var17] = class_1266.method_5694(new class_2890(this, var18, var20, var1, var2, var12));
               }

               try {
                  class_1266.method_5696(var16);
               } catch (InterruptedException var25) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var25);
               } catch (ExecutionException var26) {
                  Logger.getLogger(class_4560.class.getName()).log(Level.SEVERE, null, var26);
               }
            } else {
               for (long var14 = 0L; var14 < this.field_22208; var14++) {
                  long var22 = 2L * var14;
                  float var24 = var1.method_36133(var2 + var14);
                  var12.method_36123(var22, this.field_22217.method_36133(var22) * var24);
                  var12.method_36123(var22 + 1L, -this.field_22217.method_36133(var22 + 1L) * var24);
               }
            }

            this.field_22213.method_24154(var12, true);
            class_3685.method_17117(var12, 0L, var1, var2, this.field_22208);
         }
      }
   }

   private float[] method_21133(int var1) {
      int var4 = 2 * var1;
      float var5 = (float) Math.PI / (float)var4;
      float[] var6 = new float[var4];
      var6[0] = 1.0F;

      for (int var7 = 1; var7 < var1; var7++) {
         int var8 = 2 * var7;
         float var9 = var5 * (float)var7;
         var6[var8] = (float)class_6806.method_31223((double)var9);
         var6[var8 + 1] = -((float)class_6806.method_31165((double)var9));
      }

      return var6;
   }

   private class_4330 method_21134(long var1) {
      long var5 = 2L * var1;
      float var7 = (float) Math.PI / (float)var5;
      class_4330 var8 = new class_4330(var5);
      var8.method_36123(0L, 1.0F);

      for (long var9 = 1L; var9 < var1; var9++) {
         long var11 = 2L * var9;
         float var13 = var7 * (float)var9;
         var8.method_36123(var11, (float)class_6806.method_31223((double)var13));
         var8.method_36123(var11 + 1L, -((float)class_6806.method_31165((double)var13)));
      }

      return var8;
   }

   private static void method_21142(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (byte var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         float var13 = 0.5F - var4[var5 + var3 - var10];
         float var14 = var4[var5 + var10];
         int var15 = var2 + var11;
         int var16 = var2 + var12;
         float var17 = var1[var15] - var1[var16];
         float var18 = var1[var15 + 1] + var1[var16 + 1];
         float var19 = var13 * var17 - var14 * var18;
         float var20 = var13 * var18 + var14 * var17;
         var1[var15] -= var19;
         var1[var15 + 1] = var1[var15 + 1] - var20;
         var1[var16] += var19;
         var1[var16 + 1] = var1[var16 + 1] - var20;
      }
   }

   private static void method_21143(long var0, class_4330 var2, long var3, long var5, class_4330 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         float var22 = 0.5F - var7.method_36133(var8 + var5 - var16);
         float var23 = var7.method_36133(var8 + var16);
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var2.method_36133(var24) - var2.method_36133(var26);
         float var29 = var2.method_36133(var24 + 1L) + var2.method_36133(var26 + 1L);
         float var30 = var22 * var28 - var23 * var29;
         float var31 = var22 * var29 + var23 * var28;
         var2.method_36123(var24, var2.method_36133(var24) - var30);
         var2.method_36123(var24 + 1L, var2.method_36133(var24 + 1L) - var31);
         var2.method_36123(var26, var2.method_36133(var26) + var30);
         var2.method_36123(var26 + 1L, var2.method_36133(var26 + 1L) - var31);
      }
   }

   private static void method_21135(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (byte var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         float var13 = 0.5F - var4[var5 + var3 - var10];
         float var14 = var4[var5 + var10];
         int var15 = var2 + var11;
         int var16 = var2 + var12;
         float var17 = var1[var15] - var1[var16];
         float var18 = var1[var15 + 1] + var1[var16 + 1];
         float var19 = var13 * var17 + var14 * var18;
         float var20 = var13 * var18 - var14 * var17;
         var1[var15] -= var19;
         var1[var15 + 1] = var1[var15 + 1] - var20;
         var1[var16] += var19;
         var1[var16 + 1] = var1[var16 + 1] - var20;
      }
   }

   private static void method_21136(long var0, class_4330 var2, long var3, long var5, class_4330 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         float var22 = 0.5F - var7.method_36133(var8 + var5 - var16);
         float var23 = var7.method_36133(var8 + var16);
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var2.method_36133(var24) - var2.method_36133(var26);
         float var29 = var2.method_36133(var24 + 1L) + var2.method_36133(var26 + 1L);
         float var30 = var22 * var28 + var23 * var29;
         float var31 = var22 * var29 - var23 * var28;
         var2.method_36123(var24, var2.method_36133(var24) - var30);
         var2.method_36123(var24 + 1L, var2.method_36133(var24 + 1L) - var31);
         var2.method_36123(var26, var2.method_36133(var26) + var30);
         var2.method_36123(var26 + 1L, var2.method_36133(var26 + 1L) - var31);
      }
   }
}
