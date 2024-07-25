package remapped;

public class class_2873 implements class_1810 {
   private static String[] field_14084;
   private class_1299 field_14077 = class_3980.method_18363();
   public static int field_14081 = 10000;
   private boolean field_14073;
   private float field_14076 = 1.0F;
   private float[] field_14082;
   private float[] field_14074;
   private int field_14080;
   private int field_14079;
   private class_5114 field_14075 = new class_5114();
   private boolean field_14083;
   private boolean field_14078 = false;

   public class_2873() {
      this.field_14082 = new float[field_14081 * 2];
      this.field_14074 = new float[field_14081 * 4];
   }

   @Override
   public void method_8040(boolean var1) {
      this.field_14078 = var1;
   }

   @Override
   public void method_8039() {
      if (this.field_14076 != 1.0F) {
         this.field_14080 = 0;
         this.field_14079 = 0;
         this.field_14077.method_5898();
         float[] var3 = this.field_14077.method_5903();
         this.method_8036(var3[0], var3[1], var3[2], var3[3]);
      } else {
         this.field_14075.method_8039();
      }
   }

   @Override
   public void method_8034() {
      if (this.field_14076 != 1.0F) {
         this.method_13197(this.field_14082, this.field_14080);
      } else {
         this.field_14075.method_8034();
      }
   }

   @Override
   public void method_8037(float var1, float var2) {
      if (this.field_14076 != 1.0F) {
         this.field_14082[this.field_14080 * 2] = var1;
         this.field_14082[this.field_14080 * 2 + 1] = var2;
         this.field_14080++;
         int var5 = this.field_14080 - 1;
         this.method_8036(this.field_14074[var5 * 4], this.field_14074[var5 * 4 + 1], this.field_14074[var5 * 4 + 2], this.field_14074[var5 * 4 + 3]);
      } else {
         this.field_14075.method_8037(var1, var2);
      }
   }

   @Override
   public void method_8041(float var1) {
      this.field_14076 = var1;
   }

   @Override
   public void method_8035(boolean var1) {
      this.field_14075.method_8035(var1);
      this.field_14073 = var1;
   }

   public void method_13197(float[] var1, int var2) {
      if (this.field_14073) {
         this.field_14077.method_5911(2881);
         this.method_13199(var1, var2, this.field_14076 + 1.0F);
      }

      this.field_14077.method_5938(2881);
      this.method_13199(var1, var2, this.field_14076);
      if (this.field_14073) {
         this.field_14077.method_5911(2881);
      }
   }

   public void method_13199(float[] var1, int var2, float var3) {
      float var6 = var3 / 2.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      this.field_14077.method_5934(7);

      for (int var11 = 0; var11 < var2 + 1; var11++) {
         int var12 = var11;
         int var13 = var11 + 1;
         int var14 = var11 - 1;
         if (var14 < 0) {
            var14 += var2;
         }

         if (var13 >= var2) {
            var13 -= var2;
         }

         if (var11 >= var2) {
            var12 = var11 - var2;
         }

         float var15 = var1[var12 * 2];
         float var16 = var1[var12 * 2 + 1];
         float var17 = var1[var13 * 2];
         float var18 = var1[var13 * 2 + 1];
         float var19 = var17 - var15;
         float var20 = var18 - var16;
         if (var19 != 0.0F || var20 != 0.0F) {
            float var21 = var19 * var19 + var20 * var20;
            float var22 = (float)Math.sqrt((double)var21);
            var19 *= var6;
            var20 *= var6;
            var19 /= var22;
            var20 /= var22;
            float var24 = -var19;
            if (var11 != 0) {
               this.method_13198(var14);
               this.field_14077.method_5913(var7, var8, 0.0F);
               this.field_14077.method_5913(var9, var10, 0.0F);
               this.method_13198(var12);
               this.field_14077.method_5913(var15 + var20, var16 + var24, 0.0F);
               this.field_14077.method_5913(var15 - var20, var16 - var24, 0.0F);
            }

            var7 = var17 - var20;
            var8 = var18 - var24;
            var9 = var17 + var20;
            var10 = var18 + var24;
            if (var11 < var2 - 1) {
               this.method_13198(var12);
               this.field_14077.method_5913(var15 + var20, var16 + var24, 0.0F);
               this.field_14077.method_5913(var15 - var20, var16 - var24, 0.0F);
               this.method_13198(var13);
               this.field_14077.method_5913(var17 - var20, var18 - var24, 0.0F);
               this.field_14077.method_5913(var17 + var20, var18 + var24, 0.0F);
            }
         }
      }

      this.field_14077.method_5940();
      float var25 = !(var6 <= 12.5F) ? 180.0F / (float)Math.ceil((double)var6 / 2.5) : 5.0F;
      if (this.field_14078) {
         float var26 = var1[2] - var1[0];
         float var28 = var1[3] - var1[1];
         float var30 = (float)Math.toDegrees(Math.atan2((double)var28, (double)var26)) + 90.0F;
         if (var26 != 0.0F || var28 != 0.0F) {
            this.field_14077.method_5934(6);
            this.method_13198(0);
            this.field_14077.method_5919(var1[0], var1[1]);

            for (int var32 = 0; (float)var32 < 180.0F + var25; var32 = (int)((float)var32 + var25)) {
               float var34 = (float)Math.toRadians((double)(var30 + (float)var32));
               this.field_14077
                  .method_5919(var1[0] + (float)(Math.cos((double)var34) * (double)var6), var1[1] + (float)(Math.sin((double)var34) * (double)var6));
            }

            this.field_14077.method_5940();
         }
      }

      if (this.field_14078) {
         float var27 = var1[var2 * 2 - 2] - var1[var2 * 2 - 4];
         float var29 = var1[var2 * 2 - 1] - var1[var2 * 2 - 3];
         float var31 = (float)Math.toDegrees(Math.atan2((double)var29, (double)var27)) - 90.0F;
         if (var27 != 0.0F || var29 != 0.0F) {
            this.field_14077.method_5934(6);
            this.method_13198(var2 - 1);
            this.field_14077.method_5919(var1[var2 * 2 - 2], var1[var2 * 2 - 1]);

            for (int var33 = 0; (float)var33 < 180.0F + var25; var33 = (int)((float)var33 + var25)) {
               float var35 = (float)Math.toRadians((double)(var31 + (float)var33));
               this.field_14077
                  .method_5919(
                     var1[var2 * 2 - 2] + (float)(Math.cos((double)var35) * (double)var6), var1[var2 * 2 - 1] + (float)(Math.sin((double)var35) * (double)var6)
                  );
            }

            this.field_14077.method_5940();
         }
      }
   }

   private void method_13198(int var1) {
      if (var1 < this.field_14079) {
         if (!this.field_14083) {
            this.field_14077
               .method_5906(this.field_14074[var1 * 4], this.field_14074[var1 * 4 + 1], this.field_14074[var1 * 4 + 2], this.field_14074[var1 * 4 + 3]);
         } else {
            this.field_14077
               .method_5906(
                  this.field_14074[var1 * 4] * 0.5F,
                  this.field_14074[var1 * 4 + 1] * 0.5F,
                  this.field_14074[var1 * 4 + 2] * 0.5F,
                  this.field_14074[var1 * 4 + 3] * 0.5F
               );
         }
      }
   }

   @Override
   public void method_8036(float var1, float var2, float var3, float var4) {
      if (this.field_14076 != 1.0F) {
         this.field_14074[this.field_14080 * 4] = var1;
         this.field_14074[this.field_14080 * 4 + 1] = var2;
         this.field_14074[this.field_14080 * 4 + 2] = var3;
         this.field_14074[this.field_14080 * 4 + 3] = var4;
         this.field_14079++;
      } else {
         this.field_14075.method_8036(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method_8038() {
      return this.field_14076 != 1.0F ? this.field_14075.method_8038() : this.field_14075.method_8038();
   }
}
