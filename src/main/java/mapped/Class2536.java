package mapped;

public class Class2536 implements Class2533 {
   private static final float field16748 = 1.0E-10F;
   private Class8671 field16749 = new Class8671(this);
   private Class8671 field16750 = new Class8671(this);
   private boolean field16751;

   @Override
   public void method10705(float var1, float var2) {
      Class8637 var5 = new Class8637(this, var1, var2);
      if (!this.field16749.method31208(var5)) {
         this.field16749.method31209(var5);
      }
   }

   public int method10717() {
      return this.field16749.method31211();
   }

   public float[] method10718(int var1) {
      return new float[]{Class8637.method31027(this.field16749.method31212(var1)), Class8637.method31028(this.field16749.method31212(var1))};
   }

   @Override
   public boolean method10707() {
      this.field16751 = true;
      return this.method10722(this.field16749, this.field16750);
   }

   @Override
   public int method10703() {
      if (this.field16751) {
         return this.field16750.method31211() / 3;
      } else {
         throw new RuntimeException("Call triangulate() before accessing triangles");
      }
   }

   @Override
   public float[] method10704(int var1, int var2) {
      if (this.field16751) {
         return this.field16750.method31212(var1 * 3 + var2).method31026();
      } else {
         throw new RuntimeException("Call triangulate() before accessing triangles");
      }
   }

   private float method10719(Class8671 var1) {
      int var4 = var1.method31211();
      float var5 = 0.0F;
      int var6 = var4 - 1;

      for (int var7 = 0; var7 < var4; var6 = var7++) {
         Class8637 var8 = var1.method31212(var6);
         Class8637 var9 = var1.method31212(var7);
         var5 += var8.method31024() * var9.method31025() - var9.method31024() * var8.method31025();
      }

      return var5 * 0.5F;
   }

   private boolean method10720(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
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

   private boolean method10721(Class8671 var1, int var2, int var3, int var4, int var5, int[] var6) {
      float var9 = var1.method31212(var6[var2]).method31024();
      float var10 = var1.method31212(var6[var2]).method31025();
      float var11 = var1.method31212(var6[var3]).method31024();
      float var12 = var1.method31212(var6[var3]).method31025();
      float var13 = var1.method31212(var6[var4]).method31024();
      float var14 = var1.method31212(var6[var4]).method31025();
      if (!(1.0E-10F > (var11 - var9) * (var14 - var10) - (var12 - var10) * (var13 - var9))) {
         for (int var15 = 0; var15 < var5; var15++) {
            if (var15 != var2 && var15 != var3 && var15 != var4) {
               float var16 = var1.method31212(var6[var15]).method31024();
               float var17 = var1.method31212(var6[var15]).method31025();
               if (this.method10720(var9, var10, var11, var12, var13, var14, var16, var17)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method10722(Class8671 var1, Class8671 var2) {
      var2.method31213();
      int var5 = var1.method31211();
      if (var5 < 3) {
         return false;
      } else {
         int[] var6 = new int[var5];
         if (!(0.0F < this.method10719(var1))) {
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

            if (this.method10721(var1, var11, var10, var12, var19, var6)) {
               int var13 = var6[var11];
               int var14 = var6[var10];
               int var15 = var6[var12];
               var2.method31209(var1.method31212(var13));
               var2.method31209(var1.method31212(var14));
               var2.method31209(var1.method31212(var15));
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
   public void method10706() {
   }
}
