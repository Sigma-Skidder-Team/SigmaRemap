package remapped;

import org.newdawn.slick.geom.NeatTriangulator.InternalException;

public class class_7525 implements class_8554 {
   public static final float field_38428 = 1.0E-6F;
   private float[] field_38431;
   private float[] field_38430;
   private int field_38425;
   private class_8969[] field_38433;
   private int[] field_38426;
   private int field_38423;
   private class_8839[] field_38429;
   private int field_38424;
   private float field_38427 = 1.0E-6F;

   public class_7525() {
      this.field_38431 = new float[100];
      this.field_38430 = new float[100];
      this.field_38425 = 0;
      this.field_38433 = new class_8969[100];
      this.field_38423 = 0;
      this.field_38429 = new class_8839[100];
      this.field_38424 = 0;
   }

   public void method_34287() {
      this.field_38425 = 0;
      this.field_38423 = 0;
      this.field_38424 = 0;
   }

   private int method_34291(int var1, int var2) {
      int var5;
      int var6;
      if (var1 >= var2) {
         var5 = var2;
         var6 = var1;
      } else {
         var5 = var1;
         var6 = var2;
      }

      for (int var7 = 0; var7 < this.field_38423; var7++) {
         if (this.field_38433[var7].field_45944 == var5 && this.field_38433[var7].field_45943 == var6) {
            return var7;
         }
      }

      return -1;
   }

   private void method_34285(int var1, int var2, int var3) {
      int var6 = this.method_34291(var1, var2);
      class_8969 var7;
      int var8;
      int var9;
      if (var6 >= 0) {
         var7 = this.field_38433[var6];
         var8 = var7.field_45942;
         var9 = var7.field_45946;
      } else {
         if (this.field_38423 == this.field_38433.length) {
            class_8969[] var10 = new class_8969[this.field_38433.length * 2];
            System.arraycopy(this.field_38433, 0, var10, 0, this.field_38423);
            this.field_38433 = var10;
         }

         var8 = -1;
         var9 = -1;
         var6 = this.field_38423++;
         var7 = this.field_38433[var6] = new class_8969(this);
      }

      int var11;
      int var13;
      if (var1 >= var2) {
         var13 = var2;
         var11 = var1;
         var9 = var3;
      } else {
         var13 = var1;
         var11 = var2;
         var8 = var3;
      }

      var7.field_45944 = var13;
      var7.field_45943 = var11;
      var7.field_45942 = var8;
      var7.field_45946 = var9;
      var7.field_45945 = true;
   }

   private void method_34290(int var1, int var2) throws InternalException {
      int var5;
      if (0 <= (var5 = this.method_34291(var1, var2))) {
         this.field_38433[var5] = this.field_38433[--this.field_38423];
      } else {
         throw new class_5451(this, "Attempt to delete unknown edge");
      }
   }

   public void method_34281(int var1, int var2, boolean var3) throws InternalException {
      int var6;
      if (0 <= (var6 = this.method_34291(var1, var2))) {
         this.field_38433[var6].field_45945 = var3;
      } else {
         throw new class_5451(this, "Attempt to mark unknown edge");
      }
   }

   private class_8969 method_34284() {
      for (int var3 = 0; var3 < this.field_38423; var3++) {
         class_8969 var4 = this.field_38433[var3];
         if (var4.field_45945) {
            var4.field_45945 = false;
            if (var4.field_45942 >= 0 && var4.field_45946 >= 0) {
               return var4;
            }
         }
      }

      return null;
   }

   private static float method_34282(float var0, float var1, float var2, float var3, float var4, float var5) {
      float var8 = var4 - var2;
      float var9 = var5 - var3;
      float var10 = var0 - var4;
      float var11 = var1 - var5;
      float var12 = var8 * var11 - var9 * var10;
      if (!(var12 > 0.0F)) {
         return -1.0F;
      } else {
         if (var12 < 1.0E-6F) {
            var12 = 1.0E-6F;
         }

         float var13 = var8 * var8;
         float var14 = var9 * var9;
         float var15 = var10 * var10;
         float var16 = var11 * var11;
         float var17 = var2 - var0;
         float var18 = var3 - var1;
         float var19 = var17 * var17;
         float var20 = var18 * var18;
         return (var13 + var14) * (var15 + var16) * (var19 + var20) / (var12 * var12);
      }
   }

   private static boolean method_34289(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var10 = var4 - var2;
      float var11 = var5 - var3;
      float var12 = var0 - var4;
      float var13 = var1 - var5;
      float var14 = var2 - var0;
      float var15 = var3 - var1;
      float var16 = var6 - var0;
      float var17 = var7 - var1;
      float var18 = var6 - var2;
      float var19 = var7 - var3;
      float var20 = var6 - var4;
      float var21 = var7 - var5;
      float var22 = var10 * var19 - var11 * var18;
      float var23 = var14 * var17 - var15 * var16;
      float var24 = var12 * var21 - var13 * var20;
      return (double)var22 >= 0.0 && (double)var24 >= 0.0 && (double)var23 >= 0.0;
   }

   private boolean method_34292(int var1, int var2, int var3, int var4) {
      float var7 = this.field_38431[this.field_38426[var1]];
      float var8 = this.field_38430[this.field_38426[var1]];
      float var9 = this.field_38431[this.field_38426[var2]];
      float var10 = this.field_38430[this.field_38426[var2]];
      float var11 = this.field_38431[this.field_38426[var3]];
      float var12 = this.field_38430[this.field_38426[var3]];
      if (!(1.0E-6F > (var9 - var7) * (var12 - var8) - (var10 - var8) * (var11 - var7))) {
         for (int var13 = 0; var13 < var4; var13++) {
            if (var13 != var1 && var13 != var2 && var13 != var3) {
               float var14 = this.field_38431[this.field_38426[var13]];
               float var15 = this.field_38430[this.field_38426[var13]];
               if (method_34289(var7, var8, var9, var10, var11, var12, var14, var15)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private float method_34283() {
      float var3 = 0.0F;
      int var4 = this.field_38425 - 1;

      for (int var5 = 0; var5 < this.field_38425; var4 = var5++) {
         var3 += this.field_38431[var4] * this.field_38430[var5] - this.field_38430[var4] * this.field_38431[var5];
      }

      return var3 * 0.5F;
   }

   public void method_34293() throws InternalException {
      int var3 = this.field_38425;
      if (var3 >= 3) {
         this.field_38423 = 0;
         this.field_38424 = 0;
         this.field_38426 = new int[var3];
         if (!(0.0 < (double)this.method_34283())) {
            for (int var4 = 0; var4 < var3; var4++) {
               this.field_38426[var4] = this.field_38425 - 1 - var4;
            }
         } else {
            int var13 = 0;

            while (var13 < var3) {
               this.field_38426[var13] = var13++;
            }
         }

         int var14 = 2 * var3;
         int var5 = var3 - 1;

         while (var3 > 2) {
            if (0 >= var14--) {
               throw new class_5451(this, "Bad polygon");
            }

            int var6 = var5;
            if (var3 <= var5) {
               var6 = 0;
            }

            var5 = var6 + 1;
            if (var3 <= var5) {
               var5 = 0;
            }

            int var7 = var5 + 1;
            if (var3 <= var7) {
               var7 = 0;
            }

            if (this.method_34292(var6, var5, var7, var3)) {
               int var8 = this.field_38426[var6];
               int var9 = this.field_38426[var5];
               int var10 = this.field_38426[var7];
               if (this.field_38424 == this.field_38429.length) {
                  class_8839[] var11 = new class_8839[this.field_38429.length * 2];
                  System.arraycopy(this.field_38429, 0, var11, 0, this.field_38424);
                  this.field_38429 = var11;
               }

               this.field_38429[this.field_38424] = new class_8839(this, var8, var9, var10);
               this.method_34285(var8, var9, this.field_38424);
               this.method_34285(var9, var10, this.field_38424);
               this.method_34285(var10, var8, this.field_38424);
               this.field_38424++;
               int var15 = var5;

               for (int var12 = var5 + 1; var12 < var3; var12++) {
                  this.field_38426[var15] = this.field_38426[var12];
                  var15++;
               }

               var14 = 2 * --var3;
            }
         }

         this.field_38426 = null;
      }
   }

   private void method_34286() throws InternalException {
      class_8969 var3;
      while ((var3 = this.method_34284()) != null) {
         int var4 = var3.field_45944;
         int var5 = var3.field_45943;
         int var6 = var3.field_45942;
         int var7 = var3.field_45946;
         int var8 = -1;
         int var9 = -1;

         for (int var10 = 0; var10 < 3; var10++) {
            int var11 = this.field_38429[var6].field_45203[var10];
            if (var4 != var11 && var5 != var11) {
               var9 = var11;
               break;
            }
         }

         for (int var22 = 0; var22 < 3; var22++) {
            int var24 = this.field_38429[var7].field_45203[var22];
            if (var4 != var24 && var5 != var24) {
               var8 = var24;
               break;
            }
         }

         if (-1 != var8 && -1 != var9) {
            float var23 = this.field_38431[var4];
            float var25 = this.field_38430[var4];
            float var12 = this.field_38431[var8];
            float var13 = this.field_38430[var8];
            float var14 = this.field_38431[var5];
            float var15 = this.field_38430[var5];
            float var16 = this.field_38431[var9];
            float var17 = this.field_38430[var9];
            float var18 = method_34282(var23, var25, var12, var13, var14, var15);
            float var19 = method_34282(var23, var25, var14, var15, var16, var17);
            float var20 = method_34282(var12, var13, var14, var15, var16, var17);
            float var21 = method_34282(var12, var13, var16, var17, var23, var25);
            if (!(0.0F > var18) && !(0.0F > var19)) {
               if (!(0.0F <= var20) || !(0.0F <= var21)) {
                  continue;
               }

               if (var18 > var19) {
                  var18 = var19;
               }

               if (var20 > var21) {
                  var20 = var21;
               }

               if (var18 > var20) {
                  this.method_34290(var4, var5);
                  this.field_38429[var6].field_45203[0] = var8;
                  this.field_38429[var6].field_45203[1] = var5;
                  this.field_38429[var6].field_45203[2] = var9;
                  this.field_38429[var7].field_45203[0] = var8;
                  this.field_38429[var7].field_45203[1] = var9;
                  this.field_38429[var7].field_45203[2] = var4;
                  this.method_34285(var8, var5, var6);
                  this.method_34285(var5, var9, var6);
                  this.method_34285(var9, var8, var6);
                  this.method_34285(var9, var4, var7);
                  this.method_34285(var4, var8, var7);
                  this.method_34285(var8, var9, var7);
                  this.method_34281(var8, var9, false);
               }
               continue;
            }

            throw new class_5451(this, "original triangles backwards");
         }

         throw new class_5451(this, "can't find quad");
      }
   }

   @Override
   public boolean method_39352() {
      try {
         this.method_34293();
         return true;
      } catch (class_5451 var4) {
         this.field_38423 = 0;
         return false;
      }
   }

   @Override
   public void method_39348(float var1, float var2) {
      for (int var5 = 0; var5 < this.field_38425; var5++) {
         if (this.field_38431[var5] == var1 && this.field_38430[var5] == var2) {
            var2 += this.field_38427;
            this.field_38427 += 1.0E-6F;
         }
      }

      if (this.field_38425 == this.field_38431.length) {
         float[] var6 = new float[this.field_38425 * 2];
         System.arraycopy(this.field_38431, 0, var6, 0, this.field_38425);
         this.field_38431 = var6;
         var6 = new float[this.field_38425 * 2];
         System.arraycopy(this.field_38430, 0, var6, 0, this.field_38425);
         this.field_38430 = var6;
      }

      this.field_38431[this.field_38425] = var1;
      this.field_38430[this.field_38425] = var2;
      this.field_38425++;
   }

   @Override
   public int method_39349() {
      return this.field_38424;
   }

   @Override
   public float[] method_39351(int var1, int var2) {
      float var5 = this.field_38431[this.field_38429[var1].field_45203[var2]];
      float var6 = this.field_38430[this.field_38429[var1].field_45203[var2]];
      return new float[]{var5, var6};
   }

   @Override
   public void method_39350() {
   }
}
