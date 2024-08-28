package mapped;

public class Class9540 {
   private static String[] field44420;
   private Class8601 field44421;
   private Class8601 field44422;
   private Class8601 field44423;
   private int[] field44424 = new int[0];
   private int[] field44425 = new int[0];
   private int[] field44426 = new int[0];

   public Class9540(Class8601 var1, Class8601 var2, Class8601 var3) {
      if (var2 != null || var3 != null) {
         if (var2 == null) {
            var2 = var1;
         }

         if (var3 == null) {
            var3 = var2;
         }
      }

      this.field44421 = var1;
      this.field44422 = var2;
      this.field44423 = var3;
   }

   public boolean method36917(Class1656 var1, float var2, Class1806 var3, boolean var4, float var5) {
      int var8 = var3.method7886() * var3.method7887();
      if (this.field44426.length != var8) {
         this.field44426 = new int[var8];
      }

      var3.method7915().get(this.field44426);
      boolean var9 = this.method36918(var1, var2, this.field44426, var4, var5);
      if (var9) {
         var3.method7915().put(this.field44426);
      }

      return var9;
   }

   public boolean method36918(Class1656 var1, float var2, int[] var3, boolean var4, float var5) {
      if (this.field44422 == null && this.field44423 == null) {
         return this.field44421.method30776(var1, var2, var3, var4);
      } else if (!Class8509.method30148(var1) && !Class8509.method30146(var1)) {
         float var8 = var1.method6792(var5);
         float var9 = var1.method6790(var5);
         float var10 = 1.0E-4F;
         boolean var11 = var8 > var10;
         boolean var12 = var9 > var10;
         if (!var11 && !var12) {
            return this.field44421.method30776(var1, var2, var3, var4);
         } else {
            if (var8 > 0.0F) {
               var9 /= var8;
            }

            float var13 = 1.0F - var8;
            float var14 = var8 - var9;
            if (this.field44424.length != var3.length) {
               this.field44424 = new int[var3.length];
               this.field44425 = new int[var3.length];
            }

            int var15 = 0;
            int[][] var16 = new int[][]{var3, this.field44424, this.field44425};
            float[] var17 = new float[3];
            if (var13 > var10 && this.field44421.method30776(var1, var2, var16[var15], var4)) {
               var17[var15] = var13;
               var15++;
            }

            if (var14 > var10 && this.field44422 != null && this.field44422.method30776(var1, var2, var16[var15], var4)) {
               var17[var15] = var14;
               var15++;
            }

            if (var9 > var10 && this.field44423 != null && this.field44423.method30776(var1, var2, var16[var15], var4)) {
               var17[var15] = var9;
               var15++;
            }

            if (var15 != 2) {
               return var15 != 3 ? true : this.method36920(var16[0], var17[0], var16[1], var17[1], var16[2], var17[2]);
            } else {
               return this.method36919(var16[0], var17[0], var16[1], var17[1]);
            }
         }
      } else {
         return this.field44421.method30776(var1, var2, var3, var4);
      }
   }

   private boolean method36919(int[] var1, float var2, int[] var3, float var4) {
      if (var3.length != var1.length) {
         return false;
      } else {
         for (int var7 = 0; var7 < var1.length; var7++) {
            int var8 = var1[var7];
            int var9 = var8 >> 16 & 0xFF;
            int var10 = var8 >> 8 & 0xFF;
            int var11 = var8 & 0xFF;
            int var12 = var3[var7];
            int var13 = var12 >> 16 & 0xFF;
            int var14 = var12 >> 8 & 0xFF;
            int var15 = var12 & 0xFF;
            int var16 = (int)((float)var9 * var2 + (float)var13 * var4);
            int var17 = (int)((float)var10 * var2 + (float)var14 * var4);
            int var18 = (int)((float)var11 * var2 + (float)var15 * var4);
            var1[var7] = 0xFF000000 | var16 << 16 | var17 << 8 | var18;
         }

         return true;
      }
   }

   private boolean method36920(int[] var1, float var2, int[] var3, float var4, int[] var5, float var6) {
      if (var3.length == var1.length && var5.length == var1.length) {
         for (int var9 = 0; var9 < var1.length; var9++) {
            int var10 = var1[var9];
            int var11 = var10 >> 16 & 0xFF;
            int var12 = var10 >> 8 & 0xFF;
            int var13 = var10 & 0xFF;
            int var14 = var3[var9];
            int var15 = var14 >> 16 & 0xFF;
            int var16 = var14 >> 8 & 0xFF;
            int var17 = var14 & 0xFF;
            int var18 = var5[var9];
            int var19 = var18 >> 16 & 0xFF;
            int var20 = var18 >> 8 & 0xFF;
            int var21 = var18 & 0xFF;
            int var22 = (int)((float)var11 * var2 + (float)var15 * var4 + (float)var19 * var6);
            int var23 = (int)((float)var12 * var2 + (float)var16 * var4 + (float)var20 * var6);
            int var24 = (int)((float)var13 * var2 + (float)var17 * var4 + (float)var21 * var6);
            var1[var9] = 0xFF000000 | var22 << 16 | var23 << 8 | var24;
         }

         return true;
      } else {
         return false;
      }
   }
}
