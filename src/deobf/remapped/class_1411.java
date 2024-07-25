package remapped;

public class class_1411 implements class_8554 {
   private static final float field_7662 = 1.0E-10F;
   private class_5461 field_7665 = new class_5461(this);
   private class_5461 field_7661 = new class_5461(this);
   private boolean field_7664;

   @Override
   public void method_39348(float var1, float var2) {
      class_5324 var5 = new class_5324(this, var1, var2);
      if (!this.field_7665.method_24859(var5)) {
         this.field_7665.method_24858(var5);
      }
   }

   public int method_6500() {
      return this.field_7665.method_24854();
   }

   public float[] method_6504(int var1) {
      return new float[]{class_5324.method_24279(this.field_7665.method_24855(var1)), class_5324.method_24277(this.field_7665.method_24855(var1))};
   }

   @Override
   public boolean method_39352() {
      this.field_7664 = true;
      return this.method_6502(this.field_7665, this.field_7661);
   }

   @Override
   public int method_39349() {
      if (this.field_7664) {
         return this.field_7661.method_24854() / 3;
      } else {
         throw new RuntimeException("Call triangulate() before accessing triangles");
      }
   }

   @Override
   public float[] method_39351(int var1, int var2) {
      if (this.field_7664) {
         return this.field_7661.method_24855(var1 * 3 + var2).method_24276();
      } else {
         throw new RuntimeException("Call triangulate() before accessing triangles");
      }
   }

   private float method_6498(class_5461 var1) {
      int var4 = var1.method_24854();
      float var5 = 0.0F;
      int var6 = var4 - 1;

      for (int var7 = 0; var7 < var4; var6 = var7++) {
         class_5324 var8 = var1.method_24855(var6);
         class_5324 var9 = var1.method_24855(var7);
         var5 += var8.method_24280() * var9.method_24278() - var9.method_24280() * var8.method_24278();
      }

      return var5 * 0.5F;
   }

   private boolean method_6501(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var11 = var5 - var3;
      float var12 = var6 - var4;
      float var13 = var1 - var5;
      float var14 = var2 - var6;
      float var15 = var3 - var1;
      float var16 = var4 - var2;
      float var17 = var7 - var1;
      float var18 = var8 - var2;
      float var19 = var7 - var3;
      float var20 = var8 - var4;
      float var21 = var7 - var5;
      float var22 = var8 - var6;
      float var23 = var11 * var20 - var12 * var19;
      float var24 = var15 * var18 - var16 * var17;
      float var25 = var13 * var22 - var14 * var21;
      return var23 >= 0.0F && var25 >= 0.0F && var24 >= 0.0F;
   }

   private boolean method_6503(class_5461 var1, int var2, int var3, int var4, int var5, int[] var6) {
      float var9 = var1.method_24855(var6[var2]).method_24280();
      float var10 = var1.method_24855(var6[var2]).method_24278();
      float var11 = var1.method_24855(var6[var3]).method_24280();
      float var12 = var1.method_24855(var6[var3]).method_24278();
      float var13 = var1.method_24855(var6[var4]).method_24280();
      float var14 = var1.method_24855(var6[var4]).method_24278();
      if (!(1.0E-10F > (var11 - var9) * (var14 - var10) - (var12 - var10) * (var13 - var9))) {
         for (int var15 = 0; var15 < var5; var15++) {
            if (var15 != var2 && var15 != var3 && var15 != var4) {
               float var16 = var1.method_24855(var6[var15]).method_24280();
               float var17 = var1.method_24855(var6[var15]).method_24278();
               if (this.method_6501(var9, var10, var11, var12, var13, var14, var16, var17)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method_6502(class_5461 var1, class_5461 var2) {
      var2.method_24853();
      int var5 = var1.method_24854();
      if (var5 < 3) {
         return false;
      } else {
         int[] var6 = new int[var5];
         if (!(0.0F < this.method_6498(var1))) {
            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = var5 - 1 - var7;
            }
         } else {
            int var18 = 0;

            while (var18 < var5) {
               var6[var18] = var18++;
            }
         }

         int var19 = var5;
         int var8 = 2 * var5;
         int var9 = 0;
         int var10 = var5 - 1;

         while (var19 > 2) {
            if (0 >= var8--) {
               return false;
            }

            int var11 = var10;
            if (var19 <= var10) {
               var11 = 0;
            }

            var10 = var11 + 1;
            if (var19 <= var10) {
               var10 = 0;
            }

            int var12 = var10 + 1;
            if (var19 <= var12) {
               var12 = 0;
            }

            if (this.method_6503(var1, var11, var10, var12, var19, var6)) {
               int var13 = var6[var11];
               int var14 = var6[var10];
               int var15 = var6[var12];
               var2.method_24858(var1.method_24855(var13));
               var2.method_24858(var1.method_24855(var14));
               var2.method_24858(var1.method_24855(var15));
               var9++;
               int var16 = var10;

               for (int var17 = var10 + 1; var17 < var19; var17++) {
                  var6[var16] = var6[var17];
                  var16++;
               }

               var8 = 2 * --var19;
            }
         }

         return true;
      }
   }

   @Override
   public void method_39350() {
   }
}
